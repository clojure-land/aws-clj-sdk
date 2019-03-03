(ns portkey.aws.mediastore (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "mediastore", :region "ap-northeast-1"},
    :ssl-common-name "mediastore.ap-northeast-1.amazonaws.com",
    :endpoint "https://mediastore.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "mediastore", :region "eu-west-1"},
    :ssl-common-name "mediastore.eu-west-1.amazonaws.com",
    :endpoint "https://mediastore.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "mediastore", :region "ap-southeast-2"},
    :ssl-common-name "mediastore.ap-southeast-2.amazonaws.com",
    :endpoint "https://mediastore.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "mediastore", :region "ap-northeast-2"},
    :ssl-common-name "mediastore.ap-northeast-2.amazonaws.com",
    :endpoint "https://mediastore.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "mediastore", :region "eu-central-1"},
    :ssl-common-name "mediastore.eu-central-1.amazonaws.com",
    :endpoint "https://mediastore.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "mediastore", :region "us-west-2"},
    :ssl-common-name "mediastore.us-west-2.amazonaws.com",
    :endpoint "https://mediastore.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "mediastore", :region "us-east-1"},
    :ssl-common-name "mediastore.us-east-1.amazonaws.com",
    :endpoint "https://mediastore.us-east-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-header)

(clojure.core/declare ser-cors-policy)

(clojure.core/declare ser-pagination-token)

(clojure.core/declare ser-origin)

(clojure.core/declare ser-allowed-methods)

(clojure.core/declare ser-expose-headers)

(clojure.core/declare ser-container-list-limit)

(clojure.core/declare ser-container-policy)

(clojure.core/declare ser-method-name)

(clojure.core/declare ser-cors-rule)

(clojure.core/declare ser-allowed-headers)

(clojure.core/declare ser-allowed-origins)

(clojure.core/declare ser-container-name)

(clojure.core/declare ser-max-age-seconds)

(clojure.core/defn- ser-header [input] #:http.request.field{:value input, :shape "Header"})

(clojure.core/defn- ser-cors-policy [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-cors-rule coll) #:http.request.field{:shape "CorsRule"}))) input), :shape "CorsPolicy", :type "list", :max 100, :min 1})

(clojure.core/defn- ser-pagination-token [input] #:http.request.field{:value input, :shape "PaginationToken"})

(clojure.core/defn- ser-origin [input] #:http.request.field{:value input, :shape "Origin"})

(clojure.core/defn- ser-allowed-methods [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-method-name coll) #:http.request.field{:shape "MethodName"}))) input), :shape "AllowedMethods", :type "list"})

(clojure.core/defn- ser-expose-headers [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-header coll) #:http.request.field{:shape "Header"}))) input), :shape "ExposeHeaders", :type "list", :max 100, :min 0})

(clojure.core/defn- ser-container-list-limit [input] #:http.request.field{:value input, :shape "ContainerListLimit"})

(clojure.core/defn- ser-container-policy [input] #:http.request.field{:value input, :shape "ContainerPolicy"})

(clojure.core/defn- ser-method-name [input] #:http.request.field{:value (clojure.core/get {"PUT" "PUT", :put "PUT", "GET" "GET", :get "GET", "DELETE" "DELETE", :delete "DELETE", "HEAD" "HEAD", :head "HEAD"} input), :shape "MethodName"})

(clojure.core/defn- ser-cors-rule [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "CorsRule", :type "structure"} (clojure.core/contains? input :allowed-origins) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-allowed-origins (input :allowed-origins)) #:http.request.field{:name "AllowedOrigins", :shape "AllowedOrigins"})) (clojure.core/contains? input :allowed-methods) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-allowed-methods (input :allowed-methods)) #:http.request.field{:name "AllowedMethods", :shape "AllowedMethods"})) (clojure.core/contains? input :allowed-headers) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-allowed-headers (input :allowed-headers)) #:http.request.field{:name "AllowedHeaders", :shape "AllowedHeaders"})) (clojure.core/contains? input :max-age-seconds) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-age-seconds (input :max-age-seconds)) #:http.request.field{:name "MaxAgeSeconds", :shape "MaxAgeSeconds"})) (clojure.core/contains? input :expose-headers) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-expose-headers (input :expose-headers)) #:http.request.field{:name "ExposeHeaders", :shape "ExposeHeaders"}))))

(clojure.core/defn- ser-allowed-headers [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-header coll) #:http.request.field{:shape "Header"}))) input), :shape "AllowedHeaders", :type "list", :max 100, :min 0})

(clojure.core/defn- ser-allowed-origins [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-origin coll) #:http.request.field{:shape "Origin"}))) input), :shape "AllowedOrigins", :type "list"})

(clojure.core/defn- ser-container-name [input] #:http.request.field{:value input, :shape "ContainerName"})

(clojure.core/defn- ser-max-age-seconds [input] #:http.request.field{:value input, :shape "MaxAgeSeconds"})

(clojure.core/defn- req-create-container-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-container-name (input :container-name)) #:http.request.field{:name "ContainerName", :shape "ContainerName"})]}))

(clojure.core/defn- req-put-cors-policy-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-container-name (input :container-name)) #:http.request.field{:name "ContainerName", :shape "ContainerName"}) (clojure.core/into (ser-cors-policy (input :cors-policy)) #:http.request.field{:name "CorsPolicy", :shape "CorsPolicy"})]}))

(clojure.core/defn- req-delete-cors-policy-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-container-name (input :container-name)) #:http.request.field{:name "ContainerName", :shape "ContainerName"})]}))

(clojure.core/defn- req-list-containers-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-container-list-limit (input :max-results)) #:http.request.field{:name "MaxResults", :shape "ContainerListLimit"}))))

(clojure.core/defn- req-get-cors-policy-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-container-name (input :container-name)) #:http.request.field{:name "ContainerName", :shape "ContainerName"})]}))

(clojure.core/defn- req-delete-container-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-container-name (input :container-name)) #:http.request.field{:name "ContainerName", :shape "ContainerName"})]}))

(clojure.core/defn- req-put-container-policy-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-container-name (input :container-name)) #:http.request.field{:name "ContainerName", :shape "ContainerName"}) (clojure.core/into (ser-container-policy (input :policy)) #:http.request.field{:name "Policy", :shape "ContainerPolicy"})]}))

(clojure.core/defn- req-describe-container-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :container-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-container-name (input :container-name)) #:http.request.field{:name "ContainerName", :shape "ContainerName"}))))

(clojure.core/defn- req-delete-container-policy-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-container-name (input :container-name)) #:http.request.field{:name "ContainerName", :shape "ContainerName"})]}))

(clojure.core/defn- req-get-container-policy-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-container-name (input :container-name)) #:http.request.field{:name "ContainerName", :shape "ContainerName"})]}))

(clojure.core/declare deser-header)

(clojure.core/declare deser-cors-policy)

(clojure.core/declare deser-pagination-token)

(clojure.core/declare deser-origin)

(clojure.core/declare deser-error-message)

(clojure.core/declare deser-allowed-methods)

(clojure.core/declare deser-expose-headers)

(clojure.core/declare deser-container)

(clojure.core/declare deser-container-list)

(clojure.core/declare deser-container-policy)

(clojure.core/declare deser-endpoint)

(clojure.core/declare deser-container-arn)

(clojure.core/declare deser-method-name)

(clojure.core/declare deser-cors-rule)

(clojure.core/declare deser-allowed-headers)

(clojure.core/declare deser-allowed-origins)

(clojure.core/declare deser-container-name)

(clojure.core/declare deser-max-age-seconds)

(clojure.core/declare deser-container-status)

(clojure.core/declare deser-time-stamp)

(clojure.core/defn- deser-header [input] input)

(clojure.core/defn- deser-cors-policy [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-cors-rule coll))) input))

(clojure.core/defn- deser-pagination-token [input] input)

(clojure.core/defn- deser-origin [input] input)

(clojure.core/defn- deser-error-message [input] input)

(clojure.core/defn- deser-allowed-methods [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-method-name coll))) input))

(clojure.core/defn- deser-expose-headers [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-header coll))) input))

(clojure.core/defn- deser-container [input] (clojure.core/cond-> {} (clojure.core/contains? input "Endpoint") (clojure.core/assoc :endpoint (deser-endpoint (input "Endpoint"))) (clojure.core/contains? input "CreationTime") (clojure.core/assoc :creation-time (deser-time-stamp (input "CreationTime"))) (clojure.core/contains? input "ARN") (clojure.core/assoc :arn (deser-container-arn (input "ARN"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-container-name (input "Name"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-container-status (input "Status")))))

(clojure.core/defn- deser-container-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-container coll))) input))

(clojure.core/defn- deser-container-policy [input] input)

(clojure.core/defn- deser-endpoint [input] input)

(clojure.core/defn- deser-container-arn [input] input)

(clojure.core/defn- deser-method-name [input] (clojure.core/get {"PUT" :put, "GET" :get, "DELETE" :delete, "HEAD" :head} input))

(clojure.core/defn- deser-cors-rule [input] (clojure.core/cond-> {} (clojure.core/contains? input "AllowedOrigins") (clojure.core/assoc :allowed-origins (deser-allowed-origins (input "AllowedOrigins"))) (clojure.core/contains? input "AllowedMethods") (clojure.core/assoc :allowed-methods (deser-allowed-methods (input "AllowedMethods"))) (clojure.core/contains? input "AllowedHeaders") (clojure.core/assoc :allowed-headers (deser-allowed-headers (input "AllowedHeaders"))) (clojure.core/contains? input "MaxAgeSeconds") (clojure.core/assoc :max-age-seconds (deser-max-age-seconds (input "MaxAgeSeconds"))) (clojure.core/contains? input "ExposeHeaders") (clojure.core/assoc :expose-headers (deser-expose-headers (input "ExposeHeaders")))))

(clojure.core/defn- deser-allowed-headers [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-header coll))) input))

(clojure.core/defn- deser-allowed-origins [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-origin coll))) input))

(clojure.core/defn- deser-container-name [input] input)

(clojure.core/defn- deser-max-age-seconds [input] input)

(clojure.core/defn- deser-container-status [input] (clojure.core/get {"ACTIVE" :active, "CREATING" :creating, "DELETING" :deleting} input))

(clojure.core/defn- deser-time-stamp [input] input)

(clojure.core/defn- deser-list-containers-output [input] (clojure.core/cond-> {:containers (deser-container-list (input "Containers"))} (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-pagination-token (input "NextToken")))))

(clojure.core/defn- deser-delete-cors-policy-output [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-get-cors-policy-output [input] (clojure.core/cond-> {:cors-policy (deser-cors-policy (input "CorsPolicy"))}))

(clojure.core/defn- deser-container-not-found-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-error-message (input "Message")))))

(clojure.core/defn- deser-limit-exceeded-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-error-message (input "Message")))))

(clojure.core/defn- deser-get-container-policy-output [input] (clojure.core/cond-> {:policy (deser-container-policy (input "Policy"))}))

(clojure.core/defn- deser-container-in-use-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-error-message (input "Message")))))

(clojure.core/defn- deser-delete-container-policy-output [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-put-container-policy-output [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-create-container-output [input] (clojure.core/cond-> {:container (deser-container (input "Container"))}))

(clojure.core/defn- deser-put-cors-policy-output [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-policy-not-found-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-error-message (input "Message")))))

(clojure.core/defn- deser-cors-policy-not-found-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-error-message (input "Message")))))

(clojure.core/defn- deser-internal-server-error [input] (clojure.core/cond-> {} (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-error-message (input "Message")))))

(clojure.core/defn- deser-delete-container-output [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-describe-container-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "Container") (clojure.core/assoc :container (deser-container (input "Container")))))

(clojure.spec.alpha/def :portkey.aws.mediastore.list-containers-output/containers (clojure.spec.alpha/and :portkey.aws.mediastore/container-list))
(clojure.spec.alpha/def :portkey.aws.mediastore.list-containers-output/next-token (clojure.spec.alpha/and :portkey.aws.mediastore/pagination-token))
(clojure.spec.alpha/def :portkey.aws.mediastore/list-containers-output (clojure.spec.alpha/keys :req-un [:portkey.aws.mediastore.list-containers-output/containers] :opt-un [:portkey.aws.mediastore.list-containers-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.mediastore/delete-cors-policy-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediastore/get-cors-policy-output (clojure.spec.alpha/keys :req-un [:portkey.aws.mediastore/cors-policy] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediastore.container-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.mediastore/error-message))
(clojure.spec.alpha/def :portkey.aws.mediastore/container-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediastore.container-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.mediastore/header (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 8192)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u00FF]+" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediastore/create-container-input (clojure.spec.alpha/keys :req-un [:portkey.aws.mediastore/container-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediastore/cors-policy (clojure.spec.alpha/coll-of :portkey.aws.mediastore/cors-rule :min-count 1 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.mediastore/pagination-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 255)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"[0-9A-Za-z=/+]+" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediastore.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.mediastore/error-message))
(clojure.spec.alpha/def :portkey.aws.mediastore/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediastore.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.mediastore/put-cors-policy-input (clojure.spec.alpha/keys :req-un [:portkey.aws.mediastore/container-name :portkey.aws.mediastore/cors-policy] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediastore/origin (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u00FF]+" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediastore/delete-cors-policy-input (clojure.spec.alpha/keys :req-un [:portkey.aws.mediastore/container-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediastore.list-containers-input/next-token (clojure.spec.alpha/and :portkey.aws.mediastore/pagination-token))
(clojure.spec.alpha/def :portkey.aws.mediastore.list-containers-input/max-results (clojure.spec.alpha/and :portkey.aws.mediastore/container-list-limit))
(clojure.spec.alpha/def :portkey.aws.mediastore/list-containers-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediastore.list-containers-input/next-token :portkey.aws.mediastore.list-containers-input/max-results]))

(clojure.spec.alpha/def :portkey.aws.mediastore/error-message (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 255)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"[ \w:\.\?-]+" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediastore.get-container-policy-output/policy (clojure.spec.alpha/and :portkey.aws.mediastore/container-policy))
(clojure.spec.alpha/def :portkey.aws.mediastore/get-container-policy-output (clojure.spec.alpha/keys :req-un [:portkey.aws.mediastore.get-container-policy-output/policy] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediastore/allowed-methods (clojure.spec.alpha/coll-of :portkey.aws.mediastore/method-name))

(clojure.spec.alpha/def :portkey.aws.mediastore.container-in-use-exception/message (clojure.spec.alpha/and :portkey.aws.mediastore/error-message))
(clojure.spec.alpha/def :portkey.aws.mediastore/container-in-use-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediastore.container-in-use-exception/message]))

(clojure.spec.alpha/def :portkey.aws.mediastore/get-cors-policy-input (clojure.spec.alpha/keys :req-un [:portkey.aws.mediastore/container-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediastore/delete-container-policy-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediastore/put-container-policy-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediastore/create-container-output (clojure.spec.alpha/keys :req-un [:portkey.aws.mediastore/container] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediastore/put-cors-policy-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediastore.policy-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.mediastore/error-message))
(clojure.spec.alpha/def :portkey.aws.mediastore/policy-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediastore.policy-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.mediastore/expose-headers (clojure.spec.alpha/coll-of :portkey.aws.mediastore/header :min-count 0 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.mediastore.container/creation-time (clojure.spec.alpha/and :portkey.aws.mediastore/time-stamp))
(clojure.spec.alpha/def :portkey.aws.mediastore.container/arn (clojure.spec.alpha/and :portkey.aws.mediastore/container-arn))
(clojure.spec.alpha/def :portkey.aws.mediastore.container/name (clojure.spec.alpha/and :portkey.aws.mediastore/container-name))
(clojure.spec.alpha/def :portkey.aws.mediastore.container/status (clojure.spec.alpha/and :portkey.aws.mediastore/container-status))
(clojure.spec.alpha/def :portkey.aws.mediastore/container (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediastore/endpoint :portkey.aws.mediastore.container/creation-time :portkey.aws.mediastore.container/arn :portkey.aws.mediastore.container/name :portkey.aws.mediastore.container/status]))

(clojure.spec.alpha/def :portkey.aws.mediastore/delete-container-input (clojure.spec.alpha/keys :req-un [:portkey.aws.mediastore/container-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediastore/container-list (clojure.spec.alpha/coll-of :portkey.aws.mediastore/container))

(clojure.spec.alpha/def :portkey.aws.mediastore/container-list-limit (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.mediastore/container-policy (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 8192)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u00FF]+" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediastore/endpoint (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.mediastore/container-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 1024)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"arn:aws:mediastore:[a-z]+-[a-z]+-\d:\d{12}:container/\w{1,255}" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediastore.put-container-policy-input/policy (clojure.spec.alpha/and :portkey.aws.mediastore/container-policy))
(clojure.spec.alpha/def :portkey.aws.mediastore/put-container-policy-input (clojure.spec.alpha/keys :req-un [:portkey.aws.mediastore/container-name :portkey.aws.mediastore.put-container-policy-input/policy] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediastore.cors-policy-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.mediastore/error-message))
(clojure.spec.alpha/def :portkey.aws.mediastore/cors-policy-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediastore.cors-policy-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.mediastore/method-name #{"DELETE" :get :delete :head "HEAD" :put "GET" "PUT"})

(clojure.spec.alpha/def :portkey.aws.mediastore.internal-server-error/message (clojure.spec.alpha/and :portkey.aws.mediastore/error-message))
(clojure.spec.alpha/def :portkey.aws.mediastore/internal-server-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediastore.internal-server-error/message]))

(clojure.spec.alpha/def :portkey.aws.mediastore/cors-rule (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediastore/allowed-origins :portkey.aws.mediastore/allowed-methods :portkey.aws.mediastore/allowed-headers :portkey.aws.mediastore/max-age-seconds :portkey.aws.mediastore/expose-headers]))

(clojure.spec.alpha/def :portkey.aws.mediastore/describe-container-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediastore/container-name]))

(clojure.spec.alpha/def :portkey.aws.mediastore/allowed-headers (clojure.spec.alpha/coll-of :portkey.aws.mediastore/header :min-count 0 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.mediastore/allowed-origins (clojure.spec.alpha/coll-of :portkey.aws.mediastore/origin))

(clojure.spec.alpha/def :portkey.aws.mediastore/container-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 255)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"\w+" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediastore/delete-container-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediastore/max-age-seconds (clojure.spec.alpha/int-in 0 2147483647))

(clojure.spec.alpha/def :portkey.aws.mediastore/container-status #{:creating :deleting :active "DELETING" "CREATING" "ACTIVE"})

(clojure.spec.alpha/def :portkey.aws.mediastore/describe-container-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediastore/container]))

(clojure.spec.alpha/def :portkey.aws.mediastore/time-stamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.mediastore/delete-container-policy-input (clojure.spec.alpha/keys :req-un [:portkey.aws.mediastore/container-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediastore/get-container-policy-input (clojure.spec.alpha/keys :req-un [:portkey.aws.mediastore/container-name] :opt-un []))

(clojure.core/defn delete-container-policy ([delete-container-policy-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-container-policy-input delete-container-policy-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.mediastore/endpoints, :http.request.configuration/target-prefix "MediaStore_20170901", :http.request.spec/output-spec :portkey.aws.mediastore/delete-container-policy-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-09-01", :http.request.configuration/service-id "MediaStore", :http.request.spec/input-spec :portkey.aws.mediastore/delete-container-policy-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteContainerPolicy", :http.request.configuration/output-deser-fn deser-delete-container-policy-output, :http.request.spec/error-spec {"ContainerInUseException" :portkey.aws.mediastore/container-in-use-exception, "ContainerNotFoundException" :portkey.aws.mediastore/container-not-found-exception, "PolicyNotFoundException" :portkey.aws.mediastore/policy-not-found-exception, "InternalServerError" :portkey.aws.mediastore/internal-server-error}})))))
(clojure.spec.alpha/fdef delete-container-policy :args (clojure.spec.alpha/tuple :portkey.aws.mediastore/delete-container-policy-input) :ret (clojure.spec.alpha/and :portkey.aws.mediastore/delete-container-policy-output))

(clojure.core/defn get-container-policy ([get-container-policy-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-container-policy-input get-container-policy-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.mediastore/endpoints, :http.request.configuration/target-prefix "MediaStore_20170901", :http.request.spec/output-spec :portkey.aws.mediastore/get-container-policy-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-09-01", :http.request.configuration/service-id "MediaStore", :http.request.spec/input-spec :portkey.aws.mediastore/get-container-policy-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetContainerPolicy", :http.request.configuration/output-deser-fn deser-get-container-policy-output, :http.request.spec/error-spec {"ContainerInUseException" :portkey.aws.mediastore/container-in-use-exception, "ContainerNotFoundException" :portkey.aws.mediastore/container-not-found-exception, "PolicyNotFoundException" :portkey.aws.mediastore/policy-not-found-exception, "InternalServerError" :portkey.aws.mediastore/internal-server-error}})))))
(clojure.spec.alpha/fdef get-container-policy :args (clojure.spec.alpha/tuple :portkey.aws.mediastore/get-container-policy-input) :ret (clojure.spec.alpha/and :portkey.aws.mediastore/get-container-policy-output))

(clojure.core/defn put-container-policy ([put-container-policy-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-put-container-policy-input put-container-policy-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.mediastore/endpoints, :http.request.configuration/target-prefix "MediaStore_20170901", :http.request.spec/output-spec :portkey.aws.mediastore/put-container-policy-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-09-01", :http.request.configuration/service-id "MediaStore", :http.request.spec/input-spec :portkey.aws.mediastore/put-container-policy-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutContainerPolicy", :http.request.configuration/output-deser-fn deser-put-container-policy-output, :http.request.spec/error-spec {"ContainerNotFoundException" :portkey.aws.mediastore/container-not-found-exception, "ContainerInUseException" :portkey.aws.mediastore/container-in-use-exception, "InternalServerError" :portkey.aws.mediastore/internal-server-error}})))))
(clojure.spec.alpha/fdef put-container-policy :args (clojure.spec.alpha/tuple :portkey.aws.mediastore/put-container-policy-input) :ret (clojure.spec.alpha/and :portkey.aws.mediastore/put-container-policy-output))

(clojure.core/defn describe-container ([] (describe-container {})) ([describe-container-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-container-input describe-container-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.mediastore/endpoints, :http.request.configuration/target-prefix "MediaStore_20170901", :http.request.spec/output-spec :portkey.aws.mediastore/describe-container-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-09-01", :http.request.configuration/service-id "MediaStore", :http.request.spec/input-spec :portkey.aws.mediastore/describe-container-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeContainer", :http.request.configuration/output-deser-fn deser-describe-container-output, :http.request.spec/error-spec {"ContainerNotFoundException" :portkey.aws.mediastore/container-not-found-exception, "InternalServerError" :portkey.aws.mediastore/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-container :args (clojure.spec.alpha/? :portkey.aws.mediastore/describe-container-input) :ret (clojure.spec.alpha/and :portkey.aws.mediastore/describe-container-output))

(clojure.core/defn delete-cors-policy ([delete-cors-policy-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-cors-policy-input delete-cors-policy-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.mediastore/endpoints, :http.request.configuration/target-prefix "MediaStore_20170901", :http.request.spec/output-spec :portkey.aws.mediastore/delete-cors-policy-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-09-01", :http.request.configuration/service-id "MediaStore", :http.request.spec/input-spec :portkey.aws.mediastore/delete-cors-policy-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteCorsPolicy", :http.request.configuration/output-deser-fn deser-delete-cors-policy-output, :http.request.spec/error-spec {"ContainerInUseException" :portkey.aws.mediastore/container-in-use-exception, "ContainerNotFoundException" :portkey.aws.mediastore/container-not-found-exception, "CorsPolicyNotFoundException" :portkey.aws.mediastore/cors-policy-not-found-exception, "InternalServerError" :portkey.aws.mediastore/internal-server-error}})))))
(clojure.spec.alpha/fdef delete-cors-policy :args (clojure.spec.alpha/tuple :portkey.aws.mediastore/delete-cors-policy-input) :ret (clojure.spec.alpha/and :portkey.aws.mediastore/delete-cors-policy-output))

(clojure.core/defn create-container ([create-container-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-container-input create-container-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.mediastore/endpoints, :http.request.configuration/target-prefix "MediaStore_20170901", :http.request.spec/output-spec :portkey.aws.mediastore/create-container-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-09-01", :http.request.configuration/service-id "MediaStore", :http.request.spec/input-spec :portkey.aws.mediastore/create-container-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateContainer", :http.request.configuration/output-deser-fn deser-create-container-output, :http.request.spec/error-spec {"ContainerInUseException" :portkey.aws.mediastore/container-in-use-exception, "LimitExceededException" :portkey.aws.mediastore/limit-exceeded-exception, "InternalServerError" :portkey.aws.mediastore/internal-server-error}})))))
(clojure.spec.alpha/fdef create-container :args (clojure.spec.alpha/tuple :portkey.aws.mediastore/create-container-input) :ret (clojure.spec.alpha/and :portkey.aws.mediastore/create-container-output))

(clojure.core/defn get-cors-policy ([get-cors-policy-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-cors-policy-input get-cors-policy-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.mediastore/endpoints, :http.request.configuration/target-prefix "MediaStore_20170901", :http.request.spec/output-spec :portkey.aws.mediastore/get-cors-policy-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-09-01", :http.request.configuration/service-id "MediaStore", :http.request.spec/input-spec :portkey.aws.mediastore/get-cors-policy-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetCorsPolicy", :http.request.configuration/output-deser-fn deser-get-cors-policy-output, :http.request.spec/error-spec {"ContainerInUseException" :portkey.aws.mediastore/container-in-use-exception, "ContainerNotFoundException" :portkey.aws.mediastore/container-not-found-exception, "CorsPolicyNotFoundException" :portkey.aws.mediastore/cors-policy-not-found-exception, "InternalServerError" :portkey.aws.mediastore/internal-server-error}})))))
(clojure.spec.alpha/fdef get-cors-policy :args (clojure.spec.alpha/tuple :portkey.aws.mediastore/get-cors-policy-input) :ret (clojure.spec.alpha/and :portkey.aws.mediastore/get-cors-policy-output))

(clojure.core/defn delete-container ([delete-container-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-container-input delete-container-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.mediastore/endpoints, :http.request.configuration/target-prefix "MediaStore_20170901", :http.request.spec/output-spec :portkey.aws.mediastore/delete-container-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-09-01", :http.request.configuration/service-id "MediaStore", :http.request.spec/input-spec :portkey.aws.mediastore/delete-container-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteContainer", :http.request.configuration/output-deser-fn deser-delete-container-output, :http.request.spec/error-spec {"ContainerInUseException" :portkey.aws.mediastore/container-in-use-exception, "ContainerNotFoundException" :portkey.aws.mediastore/container-not-found-exception, "InternalServerError" :portkey.aws.mediastore/internal-server-error}})))))
(clojure.spec.alpha/fdef delete-container :args (clojure.spec.alpha/tuple :portkey.aws.mediastore/delete-container-input) :ret (clojure.spec.alpha/and :portkey.aws.mediastore/delete-container-output))

(clojure.core/defn list-containers ([] (list-containers {})) ([list-containers-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-containers-input list-containers-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.mediastore/endpoints, :http.request.configuration/target-prefix "MediaStore_20170901", :http.request.spec/output-spec :portkey.aws.mediastore/list-containers-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-09-01", :http.request.configuration/service-id "MediaStore", :http.request.spec/input-spec :portkey.aws.mediastore/list-containers-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListContainers", :http.request.configuration/output-deser-fn deser-list-containers-output, :http.request.spec/error-spec {"InternalServerError" :portkey.aws.mediastore/internal-server-error}})))))
(clojure.spec.alpha/fdef list-containers :args (clojure.spec.alpha/? :portkey.aws.mediastore/list-containers-input) :ret (clojure.spec.alpha/and :portkey.aws.mediastore/list-containers-output))

(clojure.core/defn put-cors-policy ([put-cors-policy-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-put-cors-policy-input put-cors-policy-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.mediastore/endpoints, :http.request.configuration/target-prefix "MediaStore_20170901", :http.request.spec/output-spec :portkey.aws.mediastore/put-cors-policy-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-09-01", :http.request.configuration/service-id "MediaStore", :http.request.spec/input-spec :portkey.aws.mediastore/put-cors-policy-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutCorsPolicy", :http.request.configuration/output-deser-fn deser-put-cors-policy-output, :http.request.spec/error-spec {"ContainerNotFoundException" :portkey.aws.mediastore/container-not-found-exception, "ContainerInUseException" :portkey.aws.mediastore/container-in-use-exception, "InternalServerError" :portkey.aws.mediastore/internal-server-error}})))))
(clojure.spec.alpha/fdef put-cors-policy :args (clojure.spec.alpha/tuple :portkey.aws.mediastore/put-cors-policy-input) :ret (clojure.spec.alpha/and :portkey.aws.mediastore/put-cors-policy-output))
