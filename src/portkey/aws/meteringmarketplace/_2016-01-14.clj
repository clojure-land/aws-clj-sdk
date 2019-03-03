(ns portkey.aws.meteringmarketplace.-2016-01-14 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "aws-marketplace", :region "ap-northeast-1"},
    :ssl-common-name
    "metering.marketplace.ap-northeast-1.amazonaws.com",
    :endpoint
    "https://metering.marketplace.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope
    {:service "aws-marketplace", :region "eu-west-1"},
    :ssl-common-name "metering.marketplace.eu-west-1.amazonaws.com",
    :endpoint "https://metering.marketplace.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope
    {:service "aws-marketplace", :region "us-east-2"},
    :ssl-common-name "metering.marketplace.us-east-2.amazonaws.com",
    :endpoint "https://metering.marketplace.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "aws-marketplace", :region "ap-southeast-2"},
    :ssl-common-name
    "metering.marketplace.ap-southeast-2.amazonaws.com",
    :endpoint
    "https://metering.marketplace.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope
    {:service "aws-marketplace", :region "sa-east-1"},
    :ssl-common-name "metering.marketplace.sa-east-1.amazonaws.com",
    :endpoint "https://metering.marketplace.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "aws-marketplace", :region "ap-southeast-1"},
    :ssl-common-name
    "metering.marketplace.ap-southeast-1.amazonaws.com",
    :endpoint
    "https://metering.marketplace.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "aws-marketplace", :region "ap-northeast-2"},
    :ssl-common-name
    "metering.marketplace.ap-northeast-2.amazonaws.com",
    :endpoint
    "https://metering.marketplace.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope
    {:service "aws-marketplace", :region "eu-west-3"},
    :ssl-common-name "metering.marketplace.eu-west-3.amazonaws.com",
    :endpoint "https://metering.marketplace.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope
    {:service "aws-marketplace", :region "ca-central-1"},
    :ssl-common-name "metering.marketplace.ca-central-1.amazonaws.com",
    :endpoint
    "https://metering.marketplace.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope
    {:service "aws-marketplace", :region "eu-central-1"},
    :ssl-common-name "metering.marketplace.eu-central-1.amazonaws.com",
    :endpoint
    "https://metering.marketplace.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope
    {:service "aws-marketplace", :region "eu-west-2"},
    :ssl-common-name "metering.marketplace.eu-west-2.amazonaws.com",
    :endpoint "https://metering.marketplace.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope
    {:service "aws-marketplace", :region "us-gov-west-1"},
    :ssl-common-name
    "metering.marketplace.us-gov-west-1.amazonaws.com",
    :endpoint
    "https://metering.marketplace.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope
    {:service "aws-marketplace", :region "us-west-2"},
    :ssl-common-name "metering.marketplace.us-west-2.amazonaws.com",
    :endpoint "https://metering.marketplace.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope
    {:service "aws-marketplace", :region "us-east-1"},
    :ssl-common-name "metering.marketplace.us-east-1.amazonaws.com",
    :endpoint "https://metering.marketplace.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope
    {:service "aws-marketplace", :region "us-west-1"},
    :ssl-common-name "metering.marketplace.us-west-1.amazonaws.com",
    :endpoint "https://metering.marketplace.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope
    {:service "aws-marketplace", :region "ap-south-1"},
    :ssl-common-name "metering.marketplace.ap-south-1.amazonaws.com",
    :endpoint "https://metering.marketplace.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-usage-record-list)

(clojure.core/declare ser-non-empty-string)

(clojure.core/declare ser-usage-record)

(clojure.core/declare ser-usage-dimension)

(clojure.core/declare ser-customer-identifier)

(clojure.core/declare ser-usage-quantity)

(clojure.core/declare ser-timestamp)

(clojure.core/declare ser-product-code)

(clojure.core/declare ser-boolean)

(clojure.core/defn- ser-usage-record-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-usage-record coll) #:http.request.field{:shape "UsageRecord"}))) input), :shape "UsageRecordList", :type "list", :max 25, :min 0})

(clojure.core/defn- ser-non-empty-string [input] #:http.request.field{:value input, :shape "NonEmptyString"})

(clojure.core/defn- ser-usage-record [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-timestamp (:timestamp input)) #:http.request.field{:name "Timestamp", :shape "Timestamp"}) (clojure.core/into (ser-customer-identifier (:customer-identifier input)) #:http.request.field{:name "CustomerIdentifier", :shape "CustomerIdentifier"}) (clojure.core/into (ser-usage-dimension (:dimension input)) #:http.request.field{:name "Dimension", :shape "UsageDimension"}) (clojure.core/into (ser-usage-quantity (:quantity input)) #:http.request.field{:name "Quantity", :shape "UsageQuantity"})], :shape "UsageRecord", :type "structure"}))

(clojure.core/defn- ser-usage-dimension [input] #:http.request.field{:value input, :shape "UsageDimension"})

(clojure.core/defn- ser-customer-identifier [input] #:http.request.field{:value input, :shape "CustomerIdentifier"})

(clojure.core/defn- ser-usage-quantity [input] #:http.request.field{:value input, :shape "UsageQuantity"})

(clojure.core/defn- ser-timestamp [input] #:http.request.field{:value input, :shape "Timestamp"})

(clojure.core/defn- ser-product-code [input] #:http.request.field{:value input, :shape "ProductCode"})

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "Boolean"})

(clojure.core/defn- req-batch-meter-usage-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-usage-record-list (input :usage-records)) #:http.request.field{:name "UsageRecords", :shape "UsageRecordList"}) (clojure.core/into (ser-product-code (input :product-code)) #:http.request.field{:name "ProductCode", :shape "ProductCode"})]}))

(clojure.core/defn- req-meter-usage-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-product-code (input :product-code)) #:http.request.field{:name "ProductCode", :shape "ProductCode"}) (clojure.core/into (ser-timestamp (input :timestamp)) #:http.request.field{:name "Timestamp", :shape "Timestamp"}) (clojure.core/into (ser-usage-dimension (input :usage-dimension)) #:http.request.field{:name "UsageDimension", :shape "UsageDimension"}) (clojure.core/into (ser-usage-quantity (input :usage-quantity)) #:http.request.field{:name "UsageQuantity", :shape "UsageQuantity"}) (clojure.core/into (ser-boolean (input :dry-run)) #:http.request.field{:name "DryRun", :shape "Boolean"})]}))

(clojure.core/defn- req-resolve-customer-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-non-empty-string (input :registration-token)) #:http.request.field{:name "RegistrationToken", :shape "NonEmptyString"})]}))

(clojure.core/declare deser-usage-record-list)

(clojure.core/declare deser-usage-record)

(clojure.core/declare desererror-message)

(clojure.core/declare deser-usage-dimension)

(clojure.core/declare deser-customer-identifier)

(clojure.core/declare deser-usage-record-result-status)

(clojure.core/declare deser-usage-record-result)

(clojure.core/declare deser-usage-quantity)

(clojure.core/declare deser-usage-record-result-list)

(clojure.core/declare deser-string)

(clojure.core/declare deser-timestamp)

(clojure.core/declare deser-product-code)

(clojure.core/defn- deser-usage-record-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-usage-record coll))) input))

(clojure.core/defn- deser-usage-record [input] (clojure.core/cond-> {:timestamp (deser-timestamp (input "Timestamp")), :customer-identifier (deser-customer-identifier (input "CustomerIdentifier")), :dimension (deser-usage-dimension (input "Dimension")), :quantity (deser-usage-quantity (input "Quantity"))}))

(clojure.core/defn- desererror-message [input] input)

(clojure.core/defn- deser-usage-dimension [input] input)

(clojure.core/defn- deser-customer-identifier [input] input)

(clojure.core/defn- deser-usage-record-result-status [input] (clojure.core/get {"Success" :success, "CustomerNotSubscribed" :customer-not-subscribed, "DuplicateRecord" :duplicate-record} input))

(clojure.core/defn- deser-usage-record-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "UsageRecord") (clojure.core/assoc :usage-record (deser-usage-record (input "UsageRecord"))) (clojure.core/contains? input "MeteringRecordId") (clojure.core/assoc :metering-record-id (deser-string (input "MeteringRecordId"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-usage-record-result-status (input "Status")))))

(clojure.core/defn- deser-usage-quantity [input] input)

(clojure.core/defn- deser-usage-record-result-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-usage-record-result coll))) input))

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-timestamp [input] input)

(clojure.core/defn- deser-product-code [input] input)

(clojure.core/defn- deser-invalid-token-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (desererror-message (input "message")))))

(clojure.core/defn- deser-duplicate-request-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (desererror-message (input "message")))))

(clojure.core/defn- deser-invalid-product-code-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (desererror-message (input "message")))))

(clojure.core/defn- deser-internal-service-error-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (desererror-message (input "message")))))

(clojure.core/defn- deser-invalid-usage-dimension-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (desererror-message (input "message")))))

(clojure.core/defn- deser-invalid-customer-identifier-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (desererror-message (input "message")))))

(clojure.core/defn- deser-batch-meter-usage-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "Results") (clojure.core/assoc :results (deser-usage-record-result-list (input "Results"))) (clojure.core/contains? input "UnprocessedRecords") (clojure.core/assoc :unprocessed-records (deser-usage-record-list (input "UnprocessedRecords")))))

(clojure.core/defn- deser-resolve-customer-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "CustomerIdentifier") (clojure.core/assoc :customer-identifier (deser-customer-identifier (input "CustomerIdentifier"))) (clojure.core/contains? input "ProductCode") (clojure.core/assoc :product-code (deser-product-code (input "ProductCode")))))

(clojure.core/defn- deser-throttling-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (desererror-message (input "message")))))

(clojure.core/defn- deser-meter-usage-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "MeteringRecordId") (clojure.core/assoc :metering-record-id (deser-string (input "MeteringRecordId")))))

(clojure.core/defn- deser-expired-token-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (desererror-message (input "message")))))

(clojure.core/defn- deser-invalid-endpoint-region-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (desererror-message (input "message")))))

(clojure.core/defn- deser-timestamp-out-of-bounds-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (desererror-message (input "message")))))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14.invalid-token-exception/message (clojure.spec.alpha/and :portkey.aws.meteringmarketplace.-2016-01-14/error-message))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/invalid-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.-2016-01-14.invalid-token-exception/message]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14.batch-meter-usage-request/usage-records (clojure.spec.alpha/and :portkey.aws.meteringmarketplace.-2016-01-14/usage-record-list))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/batch-meter-usage-request (clojure.spec.alpha/keys :req-un [:portkey.aws.meteringmarketplace.-2016-01-14.batch-meter-usage-request/usage-records :portkey.aws.meteringmarketplace.-2016-01-14/product-code] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14.duplicate-request-exception/message (clojure.spec.alpha/and :portkey.aws.meteringmarketplace.-2016-01-14/error-message))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/duplicate-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.-2016-01-14.duplicate-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/usage-record-list (clojure.spec.alpha/coll-of :portkey.aws.meteringmarketplace.-2016-01-14/usage-record :min-count 0 :max-count 25))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/non-empty-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"\S+" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14.usage-record/dimension (clojure.spec.alpha/and :portkey.aws.meteringmarketplace.-2016-01-14/usage-dimension))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14.usage-record/quantity (clojure.spec.alpha/and :portkey.aws.meteringmarketplace.-2016-01-14/usage-quantity))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/usage-record (clojure.spec.alpha/keys :req-un [:portkey.aws.meteringmarketplace.-2016-01-14/timestamp :portkey.aws.meteringmarketplace.-2016-01-14/customer-identifier :portkey.aws.meteringmarketplace.-2016-01-14.usage-record/dimension :portkey.aws.meteringmarketplace.-2016-01-14.usage-record/quantity] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14.invalid-product-code-exception/message (clojure.spec.alpha/and :portkey.aws.meteringmarketplace.-2016-01-14/error-message))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/invalid-product-code-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.-2016-01-14.invalid-product-code-exception/message]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/usage-dimension (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/customer-identifier (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/usage-record-result-status #{:duplicate-record "CustomerNotSubscribed" :customer-not-subscribed "Success" "DuplicateRecord" :success})

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14.internal-service-error-exception/message (clojure.spec.alpha/and :portkey.aws.meteringmarketplace.-2016-01-14/error-message))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/internal-service-error-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.-2016-01-14.internal-service-error-exception/message]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14.invalid-usage-dimension-exception/message (clojure.spec.alpha/and :portkey.aws.meteringmarketplace.-2016-01-14/error-message))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/invalid-usage-dimension-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.-2016-01-14.invalid-usage-dimension-exception/message]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14.usage-record-result/metering-record-id (clojure.spec.alpha/and :portkey.aws.meteringmarketplace.-2016-01-14/string))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14.usage-record-result/status (clojure.spec.alpha/and :portkey.aws.meteringmarketplace.-2016-01-14/usage-record-result-status))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/usage-record-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.-2016-01-14/usage-record :portkey.aws.meteringmarketplace.-2016-01-14.usage-record-result/metering-record-id :portkey.aws.meteringmarketplace.-2016-01-14.usage-record-result/status]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14.invalid-customer-identifier-exception/message (clojure.spec.alpha/and :portkey.aws.meteringmarketplace.-2016-01-14/error-message))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/invalid-customer-identifier-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.-2016-01-14.invalid-customer-identifier-exception/message]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/usage-quantity (clojure.spec.alpha/int-in 0 1000000))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/usage-record-result-list (clojure.spec.alpha/coll-of :portkey.aws.meteringmarketplace.-2016-01-14/usage-record-result))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14.batch-meter-usage-result/results (clojure.spec.alpha/and :portkey.aws.meteringmarketplace.-2016-01-14/usage-record-result-list))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14.batch-meter-usage-result/unprocessed-records (clojure.spec.alpha/and :portkey.aws.meteringmarketplace.-2016-01-14/usage-record-list))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/batch-meter-usage-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.-2016-01-14.batch-meter-usage-result/results :portkey.aws.meteringmarketplace.-2016-01-14.batch-meter-usage-result/unprocessed-records]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/resolve-customer-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.-2016-01-14/customer-identifier :portkey.aws.meteringmarketplace.-2016-01-14/product-code]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14.meter-usage-request/dry-run (clojure.spec.alpha/and :portkey.aws.meteringmarketplace.-2016-01-14/boolean))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/meter-usage-request (clojure.spec.alpha/keys :req-un [:portkey.aws.meteringmarketplace.-2016-01-14/product-code :portkey.aws.meteringmarketplace.-2016-01-14/timestamp :portkey.aws.meteringmarketplace.-2016-01-14/usage-dimension :portkey.aws.meteringmarketplace.-2016-01-14/usage-quantity :portkey.aws.meteringmarketplace.-2016-01-14.meter-usage-request/dry-run] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/product-code (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14.throttling-exception/message (clojure.spec.alpha/and :portkey.aws.meteringmarketplace.-2016-01-14/error-message))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/throttling-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.-2016-01-14.throttling-exception/message]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14.meter-usage-result/metering-record-id (clojure.spec.alpha/and :portkey.aws.meteringmarketplace.-2016-01-14/string))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/meter-usage-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.-2016-01-14.meter-usage-result/metering-record-id]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14.expired-token-exception/message (clojure.spec.alpha/and :portkey.aws.meteringmarketplace.-2016-01-14/error-message))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/expired-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.-2016-01-14.expired-token-exception/message]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14.resolve-customer-request/registration-token (clojure.spec.alpha/and :portkey.aws.meteringmarketplace.-2016-01-14/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/resolve-customer-request (clojure.spec.alpha/keys :req-un [:portkey.aws.meteringmarketplace.-2016-01-14.resolve-customer-request/registration-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14.invalid-endpoint-region-exception/message (clojure.spec.alpha/and :portkey.aws.meteringmarketplace.-2016-01-14/error-message))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/invalid-endpoint-region-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.-2016-01-14.invalid-endpoint-region-exception/message]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14.timestamp-out-of-bounds-exception/message (clojure.spec.alpha/and :portkey.aws.meteringmarketplace.-2016-01-14/error-message))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/timestamp-out-of-bounds-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.-2016-01-14.timestamp-out-of-bounds-exception/message]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/boolean clojure.core/boolean?)

(clojure.core/defn batch-meter-usage ([batch-meter-usage-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-batch-meter-usage-request batch-meter-usage-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.meteringmarketplace.-2016-01-14/endpoints, :http.request.configuration/target-prefix "AWSMPMeteringService", :http.request.spec/output-spec :portkey.aws.meteringmarketplace.-2016-01-14/batch-meter-usage-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-01-14", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.meteringmarketplace.-2016-01-14/batch-meter-usage-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "BatchMeterUsage", :http.request.configuration/output-deser-fn deser-batch-meter-usage-result, :http.request.spec/error-spec {"InternalServiceErrorException" :portkey.aws.meteringmarketplace.-2016-01-14/internal-service-error-exception, "InvalidProductCodeException" :portkey.aws.meteringmarketplace.-2016-01-14/invalid-product-code-exception, "InvalidUsageDimensionException" :portkey.aws.meteringmarketplace.-2016-01-14/invalid-usage-dimension-exception, "InvalidCustomerIdentifierException" :portkey.aws.meteringmarketplace.-2016-01-14/invalid-customer-identifier-exception, "TimestampOutOfBoundsException" :portkey.aws.meteringmarketplace.-2016-01-14/timestamp-out-of-bounds-exception, "ThrottlingException" :portkey.aws.meteringmarketplace.-2016-01-14/throttling-exception}})))))
(clojure.spec.alpha/fdef batch-meter-usage :args (clojure.spec.alpha/tuple :portkey.aws.meteringmarketplace.-2016-01-14/batch-meter-usage-request) :ret (clojure.spec.alpha/and :portkey.aws.meteringmarketplace.-2016-01-14/batch-meter-usage-result))

(clojure.core/defn meter-usage ([meter-usage-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-meter-usage-request meter-usage-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.meteringmarketplace.-2016-01-14/endpoints, :http.request.configuration/target-prefix "AWSMPMeteringService", :http.request.spec/output-spec :portkey.aws.meteringmarketplace.-2016-01-14/meter-usage-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-01-14", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.meteringmarketplace.-2016-01-14/meter-usage-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "MeterUsage", :http.request.configuration/output-deser-fn deser-meter-usage-result, :http.request.spec/error-spec {"InternalServiceErrorException" :portkey.aws.meteringmarketplace.-2016-01-14/internal-service-error-exception, "InvalidProductCodeException" :portkey.aws.meteringmarketplace.-2016-01-14/invalid-product-code-exception, "InvalidUsageDimensionException" :portkey.aws.meteringmarketplace.-2016-01-14/invalid-usage-dimension-exception, "InvalidEndpointRegionException" :portkey.aws.meteringmarketplace.-2016-01-14/invalid-endpoint-region-exception, "TimestampOutOfBoundsException" :portkey.aws.meteringmarketplace.-2016-01-14/timestamp-out-of-bounds-exception, "DuplicateRequestException" :portkey.aws.meteringmarketplace.-2016-01-14/duplicate-request-exception, "ThrottlingException" :portkey.aws.meteringmarketplace.-2016-01-14/throttling-exception}})))))
(clojure.spec.alpha/fdef meter-usage :args (clojure.spec.alpha/tuple :portkey.aws.meteringmarketplace.-2016-01-14/meter-usage-request) :ret (clojure.spec.alpha/and :portkey.aws.meteringmarketplace.-2016-01-14/meter-usage-result))

(clojure.core/defn resolve-customer ([resolve-customer-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-resolve-customer-request resolve-customer-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.meteringmarketplace.-2016-01-14/endpoints, :http.request.configuration/target-prefix "AWSMPMeteringService", :http.request.spec/output-spec :portkey.aws.meteringmarketplace.-2016-01-14/resolve-customer-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-01-14", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.meteringmarketplace.-2016-01-14/resolve-customer-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ResolveCustomer", :http.request.configuration/output-deser-fn deser-resolve-customer-result, :http.request.spec/error-spec {"InvalidTokenException" :portkey.aws.meteringmarketplace.-2016-01-14/invalid-token-exception, "ExpiredTokenException" :portkey.aws.meteringmarketplace.-2016-01-14/expired-token-exception, "ThrottlingException" :portkey.aws.meteringmarketplace.-2016-01-14/throttling-exception, "InternalServiceErrorException" :portkey.aws.meteringmarketplace.-2016-01-14/internal-service-error-exception}})))))
(clojure.spec.alpha/fdef resolve-customer :args (clojure.spec.alpha/tuple :portkey.aws.meteringmarketplace.-2016-01-14/resolve-customer-request) :ret (clojure.spec.alpha/and :portkey.aws.meteringmarketplace.-2016-01-14/resolve-customer-result))
