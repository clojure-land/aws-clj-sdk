(ns portkey.aws.cloudsearchdomain.-2013-01-01 (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.core/declare ser-sort)

(clojure.core/declare ser-expr)

(clojure.core/declare ser-partial)

(clojure.core/declare ser-suggester)

(clojure.core/declare ser-start)

(clojure.core/declare ser-suggestions-size)

(clojure.core/declare ser-query-parser)

(clojure.core/declare ser-highlight)

(clojure.core/declare ser-query-options)

(clojure.core/declare ser-query)

(clojure.core/declare ser-content-type)

(clojure.core/declare ser-filter-query)

(clojure.core/declare ser-facet)

(clojure.core/declare ser-size)

(clojure.core/declare ser-stat)

(clojure.core/declare ser-cursor)

(clojure.core/declare ser-blob)

(clojure.core/declare ser-return)

(clojure.core/defn- ser-sort [input] #:http.request.field{:value input, :shape "Sort"})

(clojure.core/defn- ser-expr [input] #:http.request.field{:value input, :shape "Expr"})

(clojure.core/defn- ser-partial [input] #:http.request.field{:value input, :shape "Partial"})

(clojure.core/defn- ser-suggester [input] #:http.request.field{:value input, :shape "Suggester"})

(clojure.core/defn- ser-start [input] #:http.request.field{:value input, :shape "Start"})

(clojure.core/defn- ser-suggestions-size [input] #:http.request.field{:value input, :shape "SuggestionsSize"})

(clojure.core/defn- ser-query-parser [input] #:http.request.field{:value (clojure.core/get {"simple" "simple", :simple "simple", "structured" "structured", :structured "structured", "lucene" "lucene", :lucene "lucene", "dismax" "dismax", :dismax "dismax"} input), :shape "QueryParser"})

(clojure.core/defn- ser-highlight [input] #:http.request.field{:value input, :shape "Highlight"})

(clojure.core/defn- ser-query-options [input] #:http.request.field{:value input, :shape "QueryOptions"})

(clojure.core/defn- ser-query [input] #:http.request.field{:value input, :shape "Query"})

(clojure.core/defn- ser-content-type [input] #:http.request.field{:value (clojure.core/get {"application/json" "application/json", :applicationjson "application/json", "application/xml" "application/xml", :applicationxml "application/xml"} input), :shape "ContentType"})

(clojure.core/defn- ser-filter-query [input] #:http.request.field{:value input, :shape "FilterQuery"})

(clojure.core/defn- ser-facet [input] #:http.request.field{:value input, :shape "Facet"})

(clojure.core/defn- ser-size [input] #:http.request.field{:value input, :shape "Size"})

(clojure.core/defn- ser-stat [input] #:http.request.field{:value input, :shape "Stat"})

(clojure.core/defn- ser-cursor [input] #:http.request.field{:value input, :shape "Cursor"})

(clojure.core/defn- ser-blob [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "Blob"})

(clojure.core/defn- ser-return [input] #:http.request.field{:value input, :shape "Return"})

(clojure.core/defn- req-search-request [input] (clojure.core/cond-> #:http.request.configuration{:querystring [(clojure.core/into (ser-query (input :query)) #:http.request.field{:name "query", :shape "Query", :location "querystring", :location-name "q"})]} (clojure.core/contains? input :partial) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-partial (input :partial)) #:http.request.field{:name "partial", :shape "Partial", :location "querystring", :location-name "partial"})) (clojure.core/contains? input :expr) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-expr (input :expr)) #:http.request.field{:name "expr", :shape "Expr", :location "querystring", :location-name "expr"})) (clojure.core/contains? input :query-parser) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-query-parser (input :query-parser)) #:http.request.field{:name "queryParser", :shape "QueryParser", :location "querystring", :location-name "q.parser"})) (clojure.core/contains? input :filter-query) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-query (input :filter-query)) #:http.request.field{:name "filterQuery", :shape "FilterQuery", :location "querystring", :location-name "fq"})) (clojure.core/contains? input :return) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-return (input :return)) #:http.request.field{:name "return", :shape "Return", :location "querystring", :location-name "return"})) (clojure.core/contains? input :sort) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort (input :sort)) #:http.request.field{:name "sort", :shape "Sort", :location "querystring", :location-name "sort"})) (clojure.core/contains? input :start) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-start (input :start)) #:http.request.field{:name "start", :shape "Start", :location "querystring", :location-name "start"})) (clojure.core/contains? input :cursor) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cursor (input :cursor)) #:http.request.field{:name "cursor", :shape "Cursor", :location "querystring", :location-name "cursor"})) (clojure.core/contains? input :facet) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-facet (input :facet)) #:http.request.field{:name "facet", :shape "Facet", :location "querystring", :location-name "facet"})) (clojure.core/contains? input :size) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-size (input :size)) #:http.request.field{:name "size", :shape "Size", :location "querystring", :location-name "size"})) (clojure.core/contains? input :highlight) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-highlight (input :highlight)) #:http.request.field{:name "highlight", :shape "Highlight", :location "querystring", :location-name "highlight"})) (clojure.core/contains? input :query-options) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-query-options (input :query-options)) #:http.request.field{:name "queryOptions", :shape "QueryOptions", :location "querystring", :location-name "q.options"})) (clojure.core/contains? input :stats) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stat (input :stats)) #:http.request.field{:name "stats", :shape "Stat", :location "querystring", :location-name "stats"}))))

(clojure.core/defn- req-upload-documents-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-blob (input :documents)) #:http.request.field{:name "documents", :shape "Blob"})], :header [(clojure.core/into (ser-content-type (input :content-type)) #:http.request.field{:name "contentType", :shape "ContentType", :location "header", :location-name "Content-Type"})]}))

(clojure.core/defn- req-suggest-request [input] (clojure.core/cond-> #:http.request.configuration{:querystring [(clojure.core/into (ser-query (input :query)) #:http.request.field{:name "query", :shape "Query", :location "querystring", :location-name "q"}) (clojure.core/into (ser-suggester (input :suggester)) #:http.request.field{:name "suggester", :shape "Suggester", :location "querystring", :location-name "suggester"})]} (clojure.core/contains? input :size) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-suggestions-size (input :size)) #:http.request.field{:name "size", :shape "SuggestionsSize", :location "querystring", :location-name "size"}))))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.bucket/value (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.bucket/count (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/bucket (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.bucket/value :portkey.aws.cloudsearchdomain.-2013-01-01.bucket/count]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/sort (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/expr (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/deletes clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/partial clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/suggester (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/bucket-list (clojure.spec.alpha/coll-of :portkey.aws.cloudsearchdomain.-2013-01-01/bucket))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/fields (clojure.spec.alpha/map-of :portkey.aws.cloudsearchdomain.-2013-01-01/string :portkey.aws.cloudsearchdomain.-2013-01-01/field-value))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/start clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/suggestions-size clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/query-parser #{:dismax :lucene "structured" :simple "lucene" "dismax" :structured "simple"})

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.document-service-exception/status (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.document-service-exception/message (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/document-service-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.document-service-exception/status :portkey.aws.cloudsearchdomain.-2013-01-01.document-service-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/highlight (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/adds clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/hit-list (clojure.spec.alpha/coll-of :portkey.aws.cloudsearchdomain.-2013-01-01/hit))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/query-options (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/query (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/content-type #{"application/json" :applicationjson :applicationxml "application/xml"})

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/exprs (clojure.spec.alpha/map-of :portkey.aws.cloudsearchdomain.-2013-01-01/string :portkey.aws.cloudsearchdomain.-2013-01-01/string))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.suggest-response/status (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/suggest-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.suggest-response/suggest (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/suggest-model))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/suggest-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.suggest-response/status :portkey.aws.cloudsearchdomain.-2013-01-01.suggest-response/suggest]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/filter-query (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.hits/found (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.hits/start (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.hits/cursor (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.hits/hit (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/hit-list))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/hits (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.hits/found :portkey.aws.cloudsearchdomain.-2013-01-01.hits/start :portkey.aws.cloudsearchdomain.-2013-01-01.hits/cursor :portkey.aws.cloudsearchdomain.-2013-01-01.hits/hit]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/facet (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/size clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.search-status/timems (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.search-status/rid (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/search-status (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.search-status/timems :portkey.aws.cloudsearchdomain.-2013-01-01.search-status/rid]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/min (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/max (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/count (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/missing (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/sum (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/double))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/sum-of-squares (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/double))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/mean (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/stddev (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/double))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/field-stats (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/min :portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/max :portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/count :portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/missing :portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/sum :portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/sum-of-squares :portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/mean :portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/stddev]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/stat (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.search-exception/message (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/search-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.search-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/suggestions (clojure.spec.alpha/coll-of :portkey.aws.cloudsearchdomain.-2013-01-01/suggestion-match))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/partial (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/partial))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/expr (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/expr))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/query-parser (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/query-parser))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/filter-query (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/filter-query))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/return (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/return))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/query (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/query))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/sort (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/sort))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/start (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/start))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/cursor (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/cursor))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/facet (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/facet))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/size (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/size))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/highlight (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/highlight))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/query-options (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/query-options))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/stats (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/stat))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/search-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearchdomain.-2013-01-01.search-request/query] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.search-request/partial :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/expr :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/query-parser :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/filter-query :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/return :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/sort :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/start :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/cursor :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/facet :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/size :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/highlight :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/query-options :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/stats]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/stats (clojure.spec.alpha/map-of :portkey.aws.cloudsearchdomain.-2013-01-01/string :portkey.aws.cloudsearchdomain.-2013-01-01/field-stats))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.upload-documents-request/documents (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/blob))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.upload-documents-request/content-type (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/content-type))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/upload-documents-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearchdomain.-2013-01-01.upload-documents-request/documents :portkey.aws.cloudsearchdomain.-2013-01-01.upload-documents-request/content-type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.hit/id (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.hit/fields (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/fields))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.hit/exprs (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/exprs))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.hit/highlights (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/highlights))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/hit (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.hit/id :portkey.aws.cloudsearchdomain.-2013-01-01.hit/fields :portkey.aws.cloudsearchdomain.-2013-01-01.hit/exprs :portkey.aws.cloudsearchdomain.-2013-01-01.hit/highlights]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/cursor (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.upload-documents-response/status (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.upload-documents-response/adds (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/adds))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.upload-documents-response/deletes (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/deletes))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.upload-documents-response/warnings (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/document-service-warnings))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/upload-documents-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.upload-documents-response/status :portkey.aws.cloudsearchdomain.-2013-01-01.upload-documents-response/adds :portkey.aws.cloudsearchdomain.-2013-01-01.upload-documents-response/deletes :portkey.aws.cloudsearchdomain.-2013-01-01.upload-documents-response/warnings]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.bucket-info/buckets (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/bucket-list))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/bucket-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.bucket-info/buckets]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.suggestion-match/suggestion (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.suggestion-match/score (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.suggestion-match/id (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/suggestion-match (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.suggestion-match/suggestion :portkey.aws.cloudsearchdomain.-2013-01-01.suggestion-match/score :portkey.aws.cloudsearchdomain.-2013-01-01.suggestion-match/id]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/document-service-warnings (clojure.spec.alpha/coll-of :portkey.aws.cloudsearchdomain.-2013-01-01/document-service-warning))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.document-service-warning/message (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/document-service-warning (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.document-service-warning/message]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/blob clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/field-value (clojure.spec.alpha/coll-of :portkey.aws.cloudsearchdomain.-2013-01-01/string))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.suggest-model/query (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.suggest-model/found (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.suggest-model/suggestions (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/suggestions))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/suggest-model (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.suggest-model/query :portkey.aws.cloudsearchdomain.-2013-01-01.suggest-model/found :portkey.aws.cloudsearchdomain.-2013-01-01.suggest-model/suggestions]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.suggest-status/timems (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.suggest-status/rid (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/suggest-status (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.suggest-status/timems :portkey.aws.cloudsearchdomain.-2013-01-01.suggest-status/rid]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/return (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/highlights (clojure.spec.alpha/map-of :portkey.aws.cloudsearchdomain.-2013-01-01/string :portkey.aws.cloudsearchdomain.-2013-01-01/string))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.suggest-request/query (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/query))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.suggest-request/suggester (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/suggester))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.suggest-request/size (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/suggestions-size))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/suggest-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearchdomain.-2013-01-01.suggest-request/query :portkey.aws.cloudsearchdomain.-2013-01-01.suggest-request/suggester] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.suggest-request/size]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.search-response/status (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/search-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.search-response/hits (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/hits))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.search-response/facets (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/facets))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.search-response/stats (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/stats))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/search-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.search-response/status :portkey.aws.cloudsearchdomain.-2013-01-01.search-response/hits :portkey.aws.cloudsearchdomain.-2013-01-01.search-response/facets :portkey.aws.cloudsearchdomain.-2013-01-01.search-response/stats]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/facets (clojure.spec.alpha/map-of :portkey.aws.cloudsearchdomain.-2013-01-01/string :portkey.aws.cloudsearchdomain.-2013-01-01/bucket-info))

(clojure.core/defn search ([search-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-search-request search-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudsearchdomain.-2013-01-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudsearchdomain.-2013-01-01/search-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2013-01-01/search?format=sdk&pretty=true", :http.request.configuration/version "2013-01-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudsearchdomain.-2013-01-01/search-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "Search", :http.request.spec/error-spec {"SearchException" :portkey.aws.cloudsearchdomain.-2013-01-01/search-exception}})))))
(clojure.spec.alpha/fdef search :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearchdomain.-2013-01-01/search-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/search-response))

(clojure.core/defn suggest ([suggest-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-suggest-request suggest-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudsearchdomain.-2013-01-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudsearchdomain.-2013-01-01/suggest-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2013-01-01/suggest?format=sdk&pretty=true", :http.request.configuration/version "2013-01-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudsearchdomain.-2013-01-01/suggest-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "Suggest", :http.request.spec/error-spec {"SearchException" :portkey.aws.cloudsearchdomain.-2013-01-01/search-exception}})))))
(clojure.spec.alpha/fdef suggest :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearchdomain.-2013-01-01/suggest-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/suggest-response))

(clojure.core/defn upload-documents ([upload-documents-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-upload-documents-request upload-documents-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudsearchdomain.-2013-01-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudsearchdomain.-2013-01-01/upload-documents-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2013-01-01/documents/batch?format=sdk", :http.request.configuration/version "2013-01-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudsearchdomain.-2013-01-01/upload-documents-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UploadDocuments", :http.request.spec/error-spec {"DocumentServiceException" :portkey.aws.cloudsearchdomain.-2013-01-01/document-service-exception}})))))
(clojure.spec.alpha/fdef upload-documents :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearchdomain.-2013-01-01/upload-documents-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/upload-documents-response))