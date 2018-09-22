(ns portkey.awsgen
  (:require [cheshire.core :as json]

            [clojure.java.io :as io]
            [clojure.spec.alpha :as spec]

            [net.cgrand.xforms :as x]

            [portkey.aws :as aws]))


;; ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓
;; ┃                 ___                      ___          _     _                ┃
;; ┃                / __|_ __  ___ __   ___  | _ \__ _ _ _| |_  / |               ┃
;; ┃                \__ \ '_ \/ -_) _| |___| |  _/ _` | '_|  _| | |               ┃
;; ┃                |___/ .__/\___\__|       |_| \__,_|_|  \__| |_|               ┃
;; ┃                    |_|                                                       ┃
;; ┃     There are two blocks of code related to spec, the first one is used      ┃
;; ┃      at compile time. It let us validate that we know all description        ┃
;; ┃                      format from aws api-2.json files.                       ┃
;; ┃     The second block of specs is used at runtime to validate user input.     ┃
;; ┃      We generate spec/def that will be part of the final lib.clj file.       ┃
;; ┃                                                                              ┃
;; ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛

;;;;;;;;;;;;;;;;;;
;; SPEC HELPERS ;;
;;;;;;;;;;;;;;;;;;


(defmacro ^:private strict-strs
  "Allows to specify a string-keyed map in a strict manner (any unknown key
   triggers a validation error).
   This brittle behavior is on purpose: strict-strs is meant to be used to
   validate the API json files and we want to know when something new appears
   in a json file."
  [& {:keys [req opt]}]
  `(spec/and
    (spec/every
     (spec/or 
      ~@(mapcat (fn [[field spec]]
                  [(keyword field)
                   `(spec/tuple #{~field} ~spec)]) (concat req opt)))
     :kind map?)
    (fn [m#]
      (every? #(contains? m# %) [~@(keys req)]))))


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; COMPILE TIME SHAPE SPECS ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;


(defmulti compile-time-shape-spec #(get % "type"))


(spec/def ::shape (spec/multi-spec compile-time-shape-spec #(assoc %1 "type" %2)))


(defmethod compile-time-shape-spec "string" [_]
  (strict-strs
   :req {"type" string?}
   :opt {"max"       int?
         "min"       int?
         "pattern"   string?
         "enum"      (spec/coll-of string?)
         "sensitive" boolean?}))


(defmethod compile-time-shape-spec "integer" [_]
  (strict-strs
   :req {"type" string?}
   :opt {"max"        int?
         "min"        int?
         "box"        boolean?
         "deprecated" boolean?}))


(defmethod compile-time-shape-spec "boolean" [_]
  (strict-strs :req {"type" string?}
               :opt {"box" boolean?}))


(defmethod compile-time-shape-spec "timestamp" [_]
  (strict-strs :req {"type" string?}
               :opt {"timestampFormat" #{"iso8601"}}))


(defmethod compile-time-shape-spec "blob" [_]
  (strict-strs
   :req {"type" string?}
   :opt {"streaming" boolean?
         "max"       int?
         "min"       int?
         "sensitive" boolean?}))


(defmethod compile-time-shape-spec "long" [_]
  (strict-strs
   :req {"type" string?}
   :opt {"min" #(or (pos-int? %) (zero? %))
         "max" int?}))


(defmethod compile-time-shape-spec "double" [_]
  (strict-strs :req {"type" string?}
               :opt {"min" number?
                     "max" number?
                     "box" boolean?}))


(defmethod compile-time-shape-spec "list" [_]
  (strict-strs
   :req {"type"   string?
         "member" (strict-strs :req {"shape" string?}
                               :opt {"locationName" string?})}
   :opt {"max"        int?
         "min"        int?
         "deprecated" boolean?
         "flattened"  boolean?
         "sensitive"  boolean?}))


(defmethod compile-time-shape-spec "map" [_]
  (strict-strs
   :req {"type"  string?
         "key"   (strict-strs :req {"shape" string?} :opt {"locationName" string?})
         "value" (strict-strs :req {"shape" string?} :opt {"locationName" string?})}
   :opt {"sensitive"    boolean?
         "max"          int?
         "min"          int?
         "flattened"    boolean?
         "locationName" string?}))


(defmethod compile-time-shape-spec "structure" [_]
  (strict-strs
   :req {"type"    string?
         "members" (spec/map-of string? 
                                (strict-strs
                                 :req {"shape" string?}
                                 :opt {"location"                         #{"uri" "querystring" "header" "headers" "statusCode"}
                                       "locationName"                     string?
                                       "queryName"                        string?
                                       "deprecated"                       boolean?
                                       "eventpayload"                     boolean? ;; @TODO : validate what it does - rest-xml protocol / S3
                                       "idempotencyToken"                 boolean?
                                       "xmlNamespace"
                                       (strict-strs :req {"uri" string?}) ; TODO validate
                                       "xmlAttribute"                     boolean?
                                       "box"                              boolean?
                                       "jsonValue"                        boolean?
                                       "jsonvalue"                        boolean?
                                       "streaming"                        boolean?
                                       "flattened"                        boolean?}))}
   :opt {"required"     (spec/coll-of string?)
         "error"        (strict-strs
                         :req {"httpStatusCode" int?}
                         :opt {"code" string? "senderFault" boolean?})
         "exception"    boolean?
         "fault"        boolean?
         "payload"      string?
         "event"        boolean? ;; @TODO: validate what it does ! WTF !!! rest-xml protocol / s3
         "eventstream"  boolean? ;; @TODO: validate what it does ! rest-xml protocol / s3
         "deprecated"   boolean?
         "locationName" string?
         "sensitive"    boolean?
         "wrapper"      boolean?
         "xmlOrder"     (spec/coll-of string?)
         "xmlNamespace"
         (strict-strs :req {"uri" string?} ; TODO validate
                      :opt {"prefix" string?})}))


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; SHAPE TYPE RUNTIME SPEC ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn runtime-spec-name
  "Returns name spec given it's ns and shape name"
  [ns name]
  (keyword ns (aws/dashed name)))


(defmulti ^:private runtime-shape-type-spec
  "Takes a shape and retuns a spec (as unevaluated code)."
  (fn [ns [name {:strs [type]}]] type))


(defmethod runtime-shape-type-spec :default [ns [name {:strs [type]} :as kv]]
  (throw (ex-info (str "runtime-shape-type-spec exception : unsupported type " type " for shape with name : " name) {:shape kv})))


(defmethod runtime-shape-type-spec "string" [ns [name {:strs [min max sensitive pattern enum]}]]
  (if enum
    `(spec/def ~(runtime-spec-name ns name) ~(into {} (mapcat (fn [s] [[s s] [(keyword (aws/dashed s)) s]])) enum))
    `(spec/def ~(runtime-spec-name ns name)
       (spec/and string?
                 ~@(when min [`(fn [s#] (<= ~min (count s#)))])
                 ~@(when max [`(fn [s#] (< (count s#) ~max))])
                 ~@(when pattern [`(fn [s#] (re-matches ~(re-pattern pattern) s#))])))))


(defmethod runtime-shape-type-spec "integer" [ns [name {:strs [min max]}]]
  (if (or min max)
    `(spec/def ~(runtime-spec-name ns name) (spec/int-in ~(or min 'Long/MIN_VALUE) ~(or max 'Long/MAX_VALUE)))
    `(spec/def ~(runtime-spec-name ns name) int?)))


(defmethod runtime-shape-type-spec "long" [ns [name _]]
  `(spec/def ~(runtime-spec-name ns name) int?))


(defmethod runtime-shape-type-spec "double" [ns [name _]]
  `(spec/def ~(runtime-spec-name ns name) double?))


(defmethod runtime-shape-type-spec "boolean" [ns [name _]]
  `(spec/def ~(runtime-spec-name ns name) boolean?))


;; @TODO : pattern matching
(defmethod runtime-shape-type-spec "timestamp" [ns [name _]]
  `(spec/def ~(runtime-spec-name ns name) inst?))


(defmethod runtime-shape-type-spec "structure" [ns [name {:strs [members required payload deprecated error exception]}]]
  (let [spec-names (into {} (for [[k {:strs [shape]}] members]
                              ;; when key name and shape name for
                              ;; some reasons are different, we need
                              ;; prerequisites
                              [k (keyword (if (not= shape k) (str ns "." (aws/dashed name)) ns) k)]))]
    `(do
       ;; we specialy create spec that reference the right spec when
       ;; key and shape name are different. Offcourse, prerequisites
       ;; are only necessary for compound types
       ~@(for [[k {:strs [shape] :as v}] members
               :when                     (not= shape k)]
           `(spec/def ~(keyword (str ns "." (aws/dashed name)) (aws/dashed k)) (spec/and ~(keyword ns (aws/dashed shape))))) ; spec/and is a hack to delay resolution
       (spec/def ~(runtime-spec-name ns name)
         (spec/keys :req-un ~(into [] (map spec-names) required)
                    :opt-un ~(into [] (comp (remove (set required)) (map spec-names)) (keys members)))))))


(defmethod runtime-shape-type-spec "list" [ns [name {{:strs [shape]} "member" :strs [min max]}]]
  `(spec/def ~(runtime-spec-name ns name)
     (spec/coll-of ~(keyword ns (aws/dashed shape)) ~@(when min `[:min-count ~min]) ~@(when max `[:max-count ~max]))))



;; ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓
;; ┃          ___           _____                  ___          _     ___         ┃
;; ┃         / __| ___ _ _ / / _ \___ __ _   ___  | _ \__ _ _ _| |_  |_  )        ┃
;; ┃         \__ \/ -_) '_/ /|   / -_) _` | |___| |  _/ _` | '_|  _|  / /         ┃
;; ┃         |___/\___|_|/_/ |_|_\___\__, |       |_| \__,_|_|  \__| /___|        ┃
;; ┃                                    |_|                                       ┃
;; ┃                                                                              ┃
;; ┃                                                                              ┃
;; ┃                                To be defined                                 ┃
;; ┃                                                                              ┃
;; ┃                                                                              ┃
;; ┃                                                                              ┃
;; ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛


;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; SERIALIZATION HELPERS ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn- shapes-seq
    "Takes a shape and returns a sequence of itself and all its nested shapes."
    [shape]
    (tree-seq #(and (map? %) (#{"structure" "list" "map"} (% "type")))
              #(case (% "type")
                 "structure" (vals (% "members"))
                 "list"      [(% "member")]
                 "map"       [(% "key") (% "value")]) shape))


  (defn- fixpoint [f init]
    (let [x (f init)]
      (if (= x init)
        init
        (recur f x))))


(defn- shapes-by-usage
  "Takes an api description and returns a map categoriizing shapes by their usage.
  This map has 4 keys: :inputs, :input-roots, :outputs
  and :output-roots, all mapping to collections of shapes.  Root
  shapes are shapes that appear as top-level paylods (including
  errors).  A shape may appear in several categories."
  [{:strs [shapes operations] :as api}]
  (let [shapes-refs        (into {}
                                 (x/by-key
                                  (comp (mapcat shapes-seq) (keep #(get % "shape")) (x/into #{})))
                                 shapes)
        reachable-shapes   (fixpoint (fn [reachable-shapes]
                                       (x/into {}
                                               (x/for [[shape reachables] %]
                                                 [shape (into reachables (mapcat shapes-refs) reachables)])
                                               reachable-shapes))
                                     shapes-refs)
        input-roots        (into #{} (keep #(get-in % ["input" "shape"]) (vals operations)))
        output-roots       (into #{} (for [{:strs [errors output]} (vals operations)
                                           {:strs [shape]}         (cons output errors)
                                           :when                   shape]
                                       shape))
        inputs             (into #{} (mapcat reachable-shapes) input-roots)
        outputs            (into #{} (mapcat reachable-shapes) output-roots)
        nested-shape-names (into #{} (vals shapes-refs))]
    ;; @NOTE (@dupuchba) : figure out what master @cgrand did with this culprit stuff 
                                        ; How likely it is that this assertion will break in the future?
                                        ; I (cgrand) believe this assertion was mostly useful before the req/deser/ser/resp unbundling
    (when-some [culprit (first (filter #(or (get % "location") (get % "payload")) (mapcat (comp shapes-seq shapes) nested-shape-names)))]
      (throw (ex-info "Attribute payload or location found on nested shape." {:culprit culprit :api api})))
    {:inputs       inputs
     :input-roots  input-roots
     :outputs      outputs
     :output-roots output-roots}))


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; IMPORTANT - UNCATEGORIZED FUNCTIONS ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;


(defn assert-shape-spec
  "Assert a shape. This function is here to fail when AWS introduce new
  element into it's description api-2.json that we don't know yet"
  [[name shape :as element]]
  (spec/check-asserts true)
  (spec/assert ::shape shape)
  element)


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; API DESCRIPTION VARS - DEV HELPER ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;


(defmacro def-api-2-json
  "Define a private variable reading the latest api-description file of a
  given protocol."
  [protocol]
  (let [entries               (into []
                                    (comp
                                     (x/for [^java.io.File f %
                                             :when (-> f .getName (.endsWith "api-2.json"))]
                                       [(-> f .getParentFile .getParentFile .getName)
                                        [(-> f .getParentFile .getName) (.getPath f)]])
                                     (x/by-key (x/into (sorted-map)))
                                     (x/sort))
                                    (file-seq (io/as-file "api-resources/aws-sdk-ruby/apis/")))
        api-2-description-def (for [[api versions] entries
                                    :let           [[latest file-path] (first (rseq versions))]
                                    :when          (= protocol (get-in (-> (slurp file-path) json/parse-string) ["metadata" "protocol"]))]
                                `(def ^:private ~(symbol (str protocol "-protocol-" api "-api-2-json"))
                                   (-> (slurp ~file-path) json/parse-string)))]
    (cons 'do api-2-description-def)))



(comment

  
  (use 'clojure.repl)
  
  
  (let [api rest-xml-protocol-route53-api-2-json]
    
    (for [[k gen] {"shapes"     (comp (partial runtime-shape-type-spec (name "monnamespece")) assert-shape-spec) ; eval to make specs available right away
                   "operations" (fn [& args])}
          desc    (api k)]
      (gen desc)))



  

  
  
    
  )




