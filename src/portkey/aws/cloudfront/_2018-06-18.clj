(ns portkey.aws.cloudfront.-2018-06-18 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "cloudfront", :region "us-east-1"},
    :ssl-common-name "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "cloudfront", :region "us-east-1"},
    :ssl-common-name "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "cloudfront", :region "us-east-1"},
    :ssl-common-name "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "cloudfront", :region "us-east-1"},
    :ssl-common-name "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "cloudfront", :region "us-east-1"},
    :ssl-common-name "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "cloudfront", :region "us-east-1"},
    :ssl-common-name "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "cloudfront", :region "us-east-1"},
    :ssl-common-name "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "cloudfront", :region "us-east-1"},
    :ssl-common-name "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "cloudfront", :region "us-east-1"},
    :ssl-common-name "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "cloudfront", :region "us-east-1"},
    :ssl-common-name "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "cloudfront", :region "us-east-1"},
    :ssl-common-name "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "cloudfront", :region "us-east-1"},
    :ssl-common-name "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "cloudfront", :region "us-east-1"},
    :ssl-common-name "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "cloudfront", :region "us-east-1"},
    :ssl-common-name "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "cloudfront", :region "us-east-1"},
    :ssl-common-name "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com",
    :signature-version :v4},
   "aws-global"
   {:credential-scope {:service "cloudfront", :region "us-east-1"},
    :ssl-common-name "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-tag-keys)

(clojure.core/declare serboolean)

(clojure.core/declare ser-cookie-names)

(clojure.core/declare ser-content-type-profile)

(clojure.core/declare ser-logging-config)

(clojure.core/declare ser-streaming-distribution-config-with-tags)

(clojure.core/declare ser-custom-error-response-list)

(clojure.core/declare ser-certificate-source)

(clojure.core/declare ser-location-list)

(clojure.core/declare ser-field-patterns)

(clojure.core/declare ser-restrictions)

(clojure.core/declare ser-field-level-encryption-profile-config)

(clojure.core/declare serstring)

(clojure.core/declare ser-field-level-encryption-config)

(clojure.core/declare ser-query-arg-profile)

(clojure.core/declare ser-lambda-function-association)

(clojure.core/declare ser-forwarded-values)

(clojure.core/declare ser-invalidation-batch)

(clojure.core/declare ser-query-string-cache-keys-list)

(clojure.core/declare ser-public-key-config)

(clojure.core/declare ser-item-selection)

(clojure.core/declare ser-encryption-entity-list)

(clojure.core/declare ser-lambda-function-associations)

(clojure.core/declare ser-encryption-entities)

(clojure.core/declare ser-viewer-protocol-policy)

(clojure.core/declare ser-content-type-profile-list)

(clojure.core/declare ser-custom-error-response)

(clojure.core/declare serlong)

(clojure.core/declare ser-origin-list)

(clojure.core/declare ser-content-type-profile-config)

(clojure.core/declare ser-cached-methods)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-tags)

(clojure.core/declare ser-query-arg-profile-list)

(clojure.core/declare ser-cache-behaviors)

(clojure.core/declare ser-cache-behavior)

(clojure.core/declare ser-origin)

(clojure.core/declare ser-format)

(clojure.core/declare ser-custom-error-responses)

(clojure.core/declare ser-origin-ssl-protocols)

(clojure.core/declare ser-aliases)

(clojure.core/declare ser-event-type)

(clojure.core/declare ser-content-type-profiles)

(clojure.core/declare ser-encryption-entity)

(clojure.core/declare ser-lambda-function-arn)

(clojure.core/declare ser-allowed-methods)

(clojure.core/declare ser-price-class)

(clojure.core/declare ser-custom-origin-config)

(clojure.core/declare ser-s-3-origin)

(clojure.core/declare ser-cookie-name-list)

(clojure.core/declare ser-tag-list)

(clojure.core/declare ser-query-string-cache-keys)

(clojure.core/declare ser-distribution-config)

(clojure.core/declare ser-tag-key-list)

(clojure.core/declare ser-ssl-protocols-list)

(clojure.core/declare ser-aws-account-number-list)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-method)

(clojure.core/declare ser-alias-list)

(clojure.core/declare ser-origin-custom-headers-list)

(clojure.core/declare ser-query-arg-profile-config)

(clojure.core/declare ser-origin-protocol-policy)

(clojure.core/declare ser-query-arg-profiles)

(clojure.core/declare ser-path-list)

(clojure.core/declare ser-geo-restriction-type)

(clojure.core/declare ser-paths)

(clojure.core/declare serinteger)

(clojure.core/declare ser-cache-behavior-list)

(clojure.core/declare ser-origin-custom-header)

(clojure.core/declare ser-streaming-distribution-config)

(clojure.core/declare ser-field-pattern-list)

(clojure.core/declare ser-s-3-origin-config)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-streaming-logging-config)

(clojure.core/declare ser-ssl-protocol)

(clojure.core/declare ser-lambda-function-association-list)

(clojure.core/declare ser-headers)

(clojure.core/declare ser-minimum-protocol-version)

(clojure.core/declare ser-origins)

(clojure.core/declare ser-distribution-config-with-tags)

(clojure.core/declare ser-header-list)

(clojure.core/declare ser-resource-arn)

(clojure.core/declare ser-ssl-support-method)

(clojure.core/declare ser-http-version)

(clojure.core/declare ser-cookie-preference)

(clojure.core/declare ser-custom-headers)

(clojure.core/declare ser-methods-list)

(clojure.core/declare ser-default-cache-behavior)

(clojure.core/declare ser-trusted-signers)

(clojure.core/declare ser-viewer-certificate)

(clojure.core/declare ser-cloud-front-origin-access-identity-config)

(clojure.core/declare ser-geo-restriction)

(clojure.core/defn- ser-tag-keys [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TagKeys", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-key-list (input :items)) #:http.request.field{:name "Items", :shape "TagKeyList"}))))

(clojure.core/defn- serboolean [input] #:http.request.field{:value input, :shape "boolean"})

(clojure.core/defn- ser-cookie-names [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "CookieNames", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cookie-name-list (input :items)) #:http.request.field{:name "Items", :shape "CookieNameList"}))))

(clojure.core/defn- ser-content-type-profile [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-format (:format input)) #:http.request.field{:name "Format", :shape "Format"}) (clojure.core/into (serstring (:content-type input)) #:http.request.field{:name "ContentType", :shape "string"})], :shape "ContentTypeProfile", :type "structure"} (clojure.core/contains? input :profile-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :profile-id)) #:http.request.field{:name "ProfileId", :shape "string"}))))

(clojure.core/defn- ser-logging-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serboolean (:enabled input)) #:http.request.field{:name "Enabled", :shape "boolean"}) (clojure.core/into (serboolean (:include-cookies input)) #:http.request.field{:name "IncludeCookies", :shape "boolean"}) (clojure.core/into (serstring (:bucket input)) #:http.request.field{:name "Bucket", :shape "string"}) (clojure.core/into (serstring (:prefix input)) #:http.request.field{:name "Prefix", :shape "string"})], :shape "LoggingConfig", :type "structure"}))

(clojure.core/defn- ser-streaming-distribution-config-with-tags [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-streaming-distribution-config (:streaming-distribution-config input)) #:http.request.field{:name "StreamingDistributionConfig", :shape "StreamingDistributionConfig"}) (clojure.core/into (ser-tags (:tags input)) #:http.request.field{:name "Tags", :shape "Tags"})], :shape "StreamingDistributionConfigWithTags", :type "structure"}))

(clojure.core/defn- ser-custom-error-response-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-custom-error-response coll) #:http.request.field{:shape "CustomErrorResponse", :location-name "CustomErrorResponse"}))) input), :shape "CustomErrorResponseList", :type "list"})

(clojure.core/defn- ser-certificate-source [input] #:http.request.field{:value (clojure.core/get {"cloudfront" "cloudfront", :cloudfront "cloudfront", "iam" "iam", :iam "iam", "acm" "acm", :acm "acm"} input), :shape "CertificateSource"})

(clojure.core/defn- ser-location-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serstring coll) #:http.request.field{:shape "string", :location-name "Location"}))) input), :shape "LocationList", :type "list"})

(clojure.core/defn- ser-field-patterns [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "FieldPatterns", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-field-pattern-list (input :items)) #:http.request.field{:name "Items", :shape "FieldPatternList"}))))

(clojure.core/defn- ser-restrictions [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-geo-restriction (:geo-restriction input)) #:http.request.field{:name "GeoRestriction", :shape "GeoRestriction"})], :shape "Restrictions", :type "structure"}))

(clojure.core/defn- ser-field-level-encryption-profile-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:name input)) #:http.request.field{:name "Name", :shape "string"}) (clojure.core/into (serstring (:caller-reference input)) #:http.request.field{:name "CallerReference", :shape "string"}) (clojure.core/into (ser-encryption-entities (:encryption-entities input)) #:http.request.field{:name "EncryptionEntities", :shape "EncryptionEntities"})], :shape "FieldLevelEncryptionProfileConfig", :type "structure"} (clojure.core/contains? input :comment) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :comment)) #:http.request.field{:name "Comment", :shape "string"}))))

(clojure.core/defn- serstring [input] #:http.request.field{:value input, :shape "string"})

(clojure.core/defn- ser-field-level-encryption-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:caller-reference input)) #:http.request.field{:name "CallerReference", :shape "string"})], :shape "FieldLevelEncryptionConfig", :type "structure"} (clojure.core/contains? input :comment) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :comment)) #:http.request.field{:name "Comment", :shape "string"})) (clojure.core/contains? input :query-arg-profile-config) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-query-arg-profile-config (input :query-arg-profile-config)) #:http.request.field{:name "QueryArgProfileConfig", :shape "QueryArgProfileConfig"})) (clojure.core/contains? input :content-type-profile-config) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-type-profile-config (input :content-type-profile-config)) #:http.request.field{:name "ContentTypeProfileConfig", :shape "ContentTypeProfileConfig"}))))

(clojure.core/defn- ser-query-arg-profile [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:query-arg input)) #:http.request.field{:name "QueryArg", :shape "string"}) (clojure.core/into (serstring (:profile-id input)) #:http.request.field{:name "ProfileId", :shape "string"})], :shape "QueryArgProfile", :type "structure"}))

(clojure.core/defn- ser-lambda-function-association [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-lambda-function-arn (:lambda-function-arn input)) #:http.request.field{:name "LambdaFunctionARN", :shape "LambdaFunctionARN"}) (clojure.core/into (ser-event-type (:event-type input)) #:http.request.field{:name "EventType", :shape "EventType"})], :shape "LambdaFunctionAssociation", :type "structure"} (clojure.core/contains? input :include-body) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean (input :include-body)) #:http.request.field{:name "IncludeBody", :shape "boolean"}))))

(clojure.core/defn- ser-forwarded-values [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serboolean (:query-string input)) #:http.request.field{:name "QueryString", :shape "boolean"}) (clojure.core/into (ser-cookie-preference (:cookies input)) #:http.request.field{:name "Cookies", :shape "CookiePreference"})], :shape "ForwardedValues", :type "structure"} (clojure.core/contains? input :headers) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-headers (input :headers)) #:http.request.field{:name "Headers", :shape "Headers"})) (clojure.core/contains? input :query-string-cache-keys) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-query-string-cache-keys (input :query-string-cache-keys)) #:http.request.field{:name "QueryStringCacheKeys", :shape "QueryStringCacheKeys"}))))

(clojure.core/defn- ser-invalidation-batch [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-paths (:paths input)) #:http.request.field{:name "Paths", :shape "Paths"}) (clojure.core/into (serstring (:caller-reference input)) #:http.request.field{:name "CallerReference", :shape "string"})], :shape "InvalidationBatch", :type "structure"}))

(clojure.core/defn- ser-query-string-cache-keys-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serstring coll) #:http.request.field{:shape "string", :location-name "Name"}))) input), :shape "QueryStringCacheKeysList", :type "list"})

(clojure.core/defn- ser-public-key-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:caller-reference input)) #:http.request.field{:name "CallerReference", :shape "string"}) (clojure.core/into (serstring (:name input)) #:http.request.field{:name "Name", :shape "string"}) (clojure.core/into (serstring (:encoded-key input)) #:http.request.field{:name "EncodedKey", :shape "string"})], :shape "PublicKeyConfig", :type "structure"} (clojure.core/contains? input :comment) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :comment)) #:http.request.field{:name "Comment", :shape "string"}))))

(clojure.core/defn- ser-item-selection [input] #:http.request.field{:value (clojure.core/get {"none" "none", :none "none", "whitelist" "whitelist", :whitelist "whitelist", "all" "all", :all "all"} input), :shape "ItemSelection"})

(clojure.core/defn- ser-encryption-entity-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-encryption-entity coll) #:http.request.field{:shape "EncryptionEntity", :location-name "EncryptionEntity"}))) input), :shape "EncryptionEntityList", :type "list"})

(clojure.core/defn- ser-lambda-function-associations [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "LambdaFunctionAssociations", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lambda-function-association-list (input :items)) #:http.request.field{:name "Items", :shape "LambdaFunctionAssociationList"}))))

(clojure.core/defn- ser-encryption-entities [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "EncryptionEntities", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-encryption-entity-list (input :items)) #:http.request.field{:name "Items", :shape "EncryptionEntityList"}))))

(clojure.core/defn- ser-viewer-protocol-policy [input] #:http.request.field{:value (clojure.core/get {"allow-all" "allow-all", :allowall "allow-all", "https-only" "https-only", :httpsonly "https-only", "redirect-to-https" "redirect-to-https", :redirecttohttps "redirect-to-https"} input), :shape "ViewerProtocolPolicy"})

(clojure.core/defn- ser-content-type-profile-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-content-type-profile coll) #:http.request.field{:shape "ContentTypeProfile", :location-name "ContentTypeProfile"}))) input), :shape "ContentTypeProfileList", :type "list"})

(clojure.core/defn- ser-custom-error-response [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:error-code input)) #:http.request.field{:name "ErrorCode", :shape "integer"})], :shape "CustomErrorResponse", :type "structure"} (clojure.core/contains? input :response-page-path) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :response-page-path)) #:http.request.field{:name "ResponsePagePath", :shape "string"})) (clojure.core/contains? input :response-code) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :response-code)) #:http.request.field{:name "ResponseCode", :shape "string"})) (clojure.core/contains? input :error-caching-min-ttl) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serlong (input :error-caching-min-ttl)) #:http.request.field{:name "ErrorCachingMinTTL", :shape "long"}))))

(clojure.core/defn- serlong [input] #:http.request.field{:value input, :shape "long"})

(clojure.core/defn- ser-origin-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-origin coll) #:http.request.field{:shape "Origin", :location-name "Origin"}))) input), :shape "OriginList", :type "list", :min 1})

(clojure.core/defn- ser-content-type-profile-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serboolean (:forward-when-content-type-is-unknown input)) #:http.request.field{:name "ForwardWhenContentTypeIsUnknown", :shape "boolean"})], :shape "ContentTypeProfileConfig", :type "structure"} (clojure.core/contains? input :content-type-profiles) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-type-profiles (input :content-type-profiles)) #:http.request.field{:name "ContentTypeProfiles", :shape "ContentTypeProfiles"}))))

(clojure.core/defn- ser-cached-methods [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"}) (clojure.core/into (ser-methods-list (:items input)) #:http.request.field{:name "Items", :shape "MethodsList"})], :shape "CachedMethods", :type "structure"}))

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-tags [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Tags", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :items)) #:http.request.field{:name "Items", :shape "TagList"}))))

(clojure.core/defn- ser-query-arg-profile-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-query-arg-profile coll) #:http.request.field{:shape "QueryArgProfile", :location-name "QueryArgProfile"}))) input), :shape "QueryArgProfileList", :type "list"})

(clojure.core/defn- ser-cache-behaviors [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "CacheBehaviors", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cache-behavior-list (input :items)) #:http.request.field{:name "Items", :shape "CacheBehaviorList"}))))

(clojure.core/defn- ser-cache-behavior [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:path-pattern input)) #:http.request.field{:name "PathPattern", :shape "string"}) (clojure.core/into (serstring (:target-origin-id input)) #:http.request.field{:name "TargetOriginId", :shape "string"}) (clojure.core/into (ser-forwarded-values (:forwarded-values input)) #:http.request.field{:name "ForwardedValues", :shape "ForwardedValues"}) (clojure.core/into (ser-trusted-signers (:trusted-signers input)) #:http.request.field{:name "TrustedSigners", :shape "TrustedSigners"}) (clojure.core/into (ser-viewer-protocol-policy (:viewer-protocol-policy input)) #:http.request.field{:name "ViewerProtocolPolicy", :shape "ViewerProtocolPolicy"}) (clojure.core/into (serlong (:min-ttl input)) #:http.request.field{:name "MinTTL", :shape "long"})], :shape "CacheBehavior", :type "structure"} (clojure.core/contains? input :smooth-streaming) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean (input :smooth-streaming)) #:http.request.field{:name "SmoothStreaming", :shape "boolean"})) (clojure.core/contains? input :field-level-encryption-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :field-level-encryption-id)) #:http.request.field{:name "FieldLevelEncryptionId", :shape "string"})) (clojure.core/contains? input :compress) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean (input :compress)) #:http.request.field{:name "Compress", :shape "boolean"})) (clojure.core/contains? input :lambda-function-associations) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lambda-function-associations (input :lambda-function-associations)) #:http.request.field{:name "LambdaFunctionAssociations", :shape "LambdaFunctionAssociations"})) (clojure.core/contains? input :max-ttl) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serlong (input :max-ttl)) #:http.request.field{:name "MaxTTL", :shape "long"})) (clojure.core/contains? input :allowed-methods) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-allowed-methods (input :allowed-methods)) #:http.request.field{:name "AllowedMethods", :shape "AllowedMethods"})) (clojure.core/contains? input :default-ttl) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serlong (input :default-ttl)) #:http.request.field{:name "DefaultTTL", :shape "long"}))))

(clojure.core/defn- ser-origin [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:id input)) #:http.request.field{:name "Id", :shape "string"}) (clojure.core/into (serstring (:domain-name input)) #:http.request.field{:name "DomainName", :shape "string"})], :shape "Origin", :type "structure"} (clojure.core/contains? input :origin-path) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :origin-path)) #:http.request.field{:name "OriginPath", :shape "string"})) (clojure.core/contains? input :custom-headers) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-custom-headers (input :custom-headers)) #:http.request.field{:name "CustomHeaders", :shape "CustomHeaders"})) (clojure.core/contains? input :s-3-origin-config) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-origin-config (input :s-3-origin-config)) #:http.request.field{:name "S3OriginConfig", :shape "S3OriginConfig"})) (clojure.core/contains? input :custom-origin-config) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-custom-origin-config (input :custom-origin-config)) #:http.request.field{:name "CustomOriginConfig", :shape "CustomOriginConfig"}))))

(clojure.core/defn- ser-format [input] #:http.request.field{:value (clojure.core/get {"URLEncoded" "URLEncoded", :url-encoded "URLEncoded"} input), :shape "Format"})

(clojure.core/defn- ser-custom-error-responses [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "CustomErrorResponses", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-custom-error-response-list (input :items)) #:http.request.field{:name "Items", :shape "CustomErrorResponseList"}))))

(clojure.core/defn- ser-origin-ssl-protocols [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"}) (clojure.core/into (ser-ssl-protocols-list (:items input)) #:http.request.field{:name "Items", :shape "SslProtocolsList"})], :shape "OriginSslProtocols", :type "structure"}))

(clojure.core/defn- ser-aliases [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "Aliases", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-alias-list (input :items)) #:http.request.field{:name "Items", :shape "AliasList"}))))

(clojure.core/defn- ser-event-type [input] #:http.request.field{:value (clojure.core/get {"viewer-request" "viewer-request", :viewerrequest "viewer-request", "viewer-response" "viewer-response", :viewerresponse "viewer-response", "origin-request" "origin-request", :originrequest "origin-request", "origin-response" "origin-response", :originresponse "origin-response"} input), :shape "EventType"})

(clojure.core/defn- ser-content-type-profiles [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "ContentTypeProfiles", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-type-profile-list (input :items)) #:http.request.field{:name "Items", :shape "ContentTypeProfileList"}))))

(clojure.core/defn- ser-encryption-entity [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:public-key-id input)) #:http.request.field{:name "PublicKeyId", :shape "string"}) (clojure.core/into (serstring (:provider-id input)) #:http.request.field{:name "ProviderId", :shape "string"}) (clojure.core/into (ser-field-patterns (:field-patterns input)) #:http.request.field{:name "FieldPatterns", :shape "FieldPatterns"})], :shape "EncryptionEntity", :type "structure"}))

(clojure.core/defn- ser-lambda-function-arn [input] #:http.request.field{:value input, :shape "LambdaFunctionARN"})

(clojure.core/defn- ser-allowed-methods [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"}) (clojure.core/into (ser-methods-list (:items input)) #:http.request.field{:name "Items", :shape "MethodsList"})], :shape "AllowedMethods", :type "structure"} (clojure.core/contains? input :cached-methods) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cached-methods (input :cached-methods)) #:http.request.field{:name "CachedMethods", :shape "CachedMethods"}))))

(clojure.core/defn- ser-price-class [input] #:http.request.field{:value (clojure.core/get {"PriceClass_100" "PriceClass_100", :price-class-100 "PriceClass_100", "PriceClass_200" "PriceClass_200", :price-class-200 "PriceClass_200", "PriceClass_All" "PriceClass_All", :price-class-all "PriceClass_All"} input), :shape "PriceClass"})

(clojure.core/defn- ser-custom-origin-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:http-port input)) #:http.request.field{:name "HTTPPort", :shape "integer"}) (clojure.core/into (serinteger (:https-port input)) #:http.request.field{:name "HTTPSPort", :shape "integer"}) (clojure.core/into (ser-origin-protocol-policy (:origin-protocol-policy input)) #:http.request.field{:name "OriginProtocolPolicy", :shape "OriginProtocolPolicy"})], :shape "CustomOriginConfig", :type "structure"} (clojure.core/contains? input :origin-ssl-protocols) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-origin-ssl-protocols (input :origin-ssl-protocols)) #:http.request.field{:name "OriginSslProtocols", :shape "OriginSslProtocols"})) (clojure.core/contains? input :origin-read-timeout) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serinteger (input :origin-read-timeout)) #:http.request.field{:name "OriginReadTimeout", :shape "integer"})) (clojure.core/contains? input :origin-keepalive-timeout) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serinteger (input :origin-keepalive-timeout)) #:http.request.field{:name "OriginKeepaliveTimeout", :shape "integer"}))))

(clojure.core/defn- ser-s-3-origin [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:domain-name input)) #:http.request.field{:name "DomainName", :shape "string"}) (clojure.core/into (serstring (:origin-access-identity input)) #:http.request.field{:name "OriginAccessIdentity", :shape "string"})], :shape "S3Origin", :type "structure"}))

(clojure.core/defn- ser-cookie-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serstring coll) #:http.request.field{:shape "string", :location-name "Name"}))) input), :shape "CookieNameList", :type "list"})

(clojure.core/defn- ser-tag-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag", :location-name "Tag"}))) input), :shape "TagList", :type "list"})

(clojure.core/defn- ser-query-string-cache-keys [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "QueryStringCacheKeys", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-query-string-cache-keys-list (input :items)) #:http.request.field{:name "Items", :shape "QueryStringCacheKeysList"}))))

(clojure.core/defn- ser-distribution-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:caller-reference input)) #:http.request.field{:name "CallerReference", :shape "string"}) (clojure.core/into (ser-origins (:origins input)) #:http.request.field{:name "Origins", :shape "Origins"}) (clojure.core/into (ser-default-cache-behavior (:default-cache-behavior input)) #:http.request.field{:name "DefaultCacheBehavior", :shape "DefaultCacheBehavior"}) (clojure.core/into (serstring (:comment input)) #:http.request.field{:name "Comment", :shape "string"}) (clojure.core/into (serboolean (:enabled input)) #:http.request.field{:name "Enabled", :shape "boolean"})], :shape "DistributionConfig", :type "structure"} (clojure.core/contains? input :default-root-object) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :default-root-object)) #:http.request.field{:name "DefaultRootObject", :shape "string"})) (clojure.core/contains? input :is-ipv-6-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean (input :is-ipv-6-enabled)) #:http.request.field{:name "IsIPV6Enabled", :shape "boolean"})) (clojure.core/contains? input :restrictions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-restrictions (input :restrictions)) #:http.request.field{:name "Restrictions", :shape "Restrictions"})) (clojure.core/contains? input :web-acl-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :web-acl-id)) #:http.request.field{:name "WebACLId", :shape "string"})) (clojure.core/contains? input :logging) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-logging-config (input :logging)) #:http.request.field{:name "Logging", :shape "LoggingConfig"})) (clojure.core/contains? input :cache-behaviors) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cache-behaviors (input :cache-behaviors)) #:http.request.field{:name "CacheBehaviors", :shape "CacheBehaviors"})) (clojure.core/contains? input :custom-error-responses) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-custom-error-responses (input :custom-error-responses)) #:http.request.field{:name "CustomErrorResponses", :shape "CustomErrorResponses"})) (clojure.core/contains? input :aliases) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aliases (input :aliases)) #:http.request.field{:name "Aliases", :shape "Aliases"})) (clojure.core/contains? input :price-class) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-price-class (input :price-class)) #:http.request.field{:name "PriceClass", :shape "PriceClass"})) (clojure.core/contains? input :http-version) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-http-version (input :http-version)) #:http.request.field{:name "HttpVersion", :shape "HttpVersion"})) (clojure.core/contains? input :viewer-certificate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-viewer-certificate (input :viewer-certificate)) #:http.request.field{:name "ViewerCertificate", :shape "ViewerCertificate"}))))

(clojure.core/defn- ser-tag-key-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-key coll) #:http.request.field{:shape "TagKey", :location-name "Key"}))) input), :shape "TagKeyList", :type "list"})

(clojure.core/defn- ser-ssl-protocols-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-ssl-protocol coll) #:http.request.field{:shape "SslProtocol", :location-name "SslProtocol"}))) input), :shape "SslProtocolsList", :type "list"})

(clojure.core/defn- ser-aws-account-number-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serstring coll) #:http.request.field{:shape "string", :location-name "AwsAccountNumber"}))) input), :shape "AwsAccountNumberList", :type "list"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-method [input] #:http.request.field{:value (clojure.core/get {"DELETE" "DELETE", :get "GET", "OPTIONS" "OPTIONS", :patch "PATCH", "PATCH" "PATCH", :delete "DELETE", :head "HEAD", "HEAD" "HEAD", "POST" "POST", :post "POST", :options "OPTIONS", :put "PUT", "GET" "GET", "PUT" "PUT"} input), :shape "Method"})

(clojure.core/defn- ser-alias-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serstring coll) #:http.request.field{:shape "string", :location-name "CNAME"}))) input), :shape "AliasList", :type "list"})

(clojure.core/defn- ser-origin-custom-headers-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-origin-custom-header coll) #:http.request.field{:shape "OriginCustomHeader", :location-name "OriginCustomHeader"}))) input), :shape "OriginCustomHeadersList", :type "list"})

(clojure.core/defn- ser-query-arg-profile-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serboolean (:forward-when-query-arg-profile-is-unknown input)) #:http.request.field{:name "ForwardWhenQueryArgProfileIsUnknown", :shape "boolean"})], :shape "QueryArgProfileConfig", :type "structure"} (clojure.core/contains? input :query-arg-profiles) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-query-arg-profiles (input :query-arg-profiles)) #:http.request.field{:name "QueryArgProfiles", :shape "QueryArgProfiles"}))))

(clojure.core/defn- ser-origin-protocol-policy [input] #:http.request.field{:value (clojure.core/get {"http-only" "http-only", :httponly "http-only", "match-viewer" "match-viewer", :matchviewer "match-viewer", "https-only" "https-only", :httpsonly "https-only"} input), :shape "OriginProtocolPolicy"})

(clojure.core/defn- ser-query-arg-profiles [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "QueryArgProfiles", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-query-arg-profile-list (input :items)) #:http.request.field{:name "Items", :shape "QueryArgProfileList"}))))

(clojure.core/defn- ser-path-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serstring coll) #:http.request.field{:shape "string", :location-name "Path"}))) input), :shape "PathList", :type "list"})

(clojure.core/defn- ser-geo-restriction-type [input] #:http.request.field{:value (clojure.core/get {"blacklist" "blacklist", :blacklist "blacklist", "whitelist" "whitelist", :whitelist "whitelist", "none" "none", :none "none"} input), :shape "GeoRestrictionType"})

(clojure.core/defn- ser-paths [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "Paths", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-path-list (input :items)) #:http.request.field{:name "Items", :shape "PathList"}))))

(clojure.core/defn- serinteger [input] #:http.request.field{:value input, :shape "integer"})

(clojure.core/defn- ser-cache-behavior-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-cache-behavior coll) #:http.request.field{:shape "CacheBehavior", :location-name "CacheBehavior"}))) input), :shape "CacheBehaviorList", :type "list"})

(clojure.core/defn- ser-origin-custom-header [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:header-name input)) #:http.request.field{:name "HeaderName", :shape "string"}) (clojure.core/into (serstring (:header-value input)) #:http.request.field{:name "HeaderValue", :shape "string"})], :shape "OriginCustomHeader", :type "structure"}))

(clojure.core/defn- ser-streaming-distribution-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:caller-reference input)) #:http.request.field{:name "CallerReference", :shape "string"}) (clojure.core/into (ser-s-3-origin (:s-3-origin input)) #:http.request.field{:name "S3Origin", :shape "S3Origin"}) (clojure.core/into (serstring (:comment input)) #:http.request.field{:name "Comment", :shape "string"}) (clojure.core/into (ser-trusted-signers (:trusted-signers input)) #:http.request.field{:name "TrustedSigners", :shape "TrustedSigners"}) (clojure.core/into (serboolean (:enabled input)) #:http.request.field{:name "Enabled", :shape "boolean"})], :shape "StreamingDistributionConfig", :type "structure"} (clojure.core/contains? input :aliases) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aliases (input :aliases)) #:http.request.field{:name "Aliases", :shape "Aliases"})) (clojure.core/contains? input :logging) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-streaming-logging-config (input :logging)) #:http.request.field{:name "Logging", :shape "StreamingLoggingConfig"})) (clojure.core/contains? input :price-class) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-price-class (input :price-class)) #:http.request.field{:name "PriceClass", :shape "PriceClass"}))))

(clojure.core/defn- ser-field-pattern-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serstring coll) #:http.request.field{:shape "string", :location-name "FieldPattern"}))) input), :shape "FieldPatternList", :type "list"})

(clojure.core/defn- ser-s-3-origin-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:origin-access-identity input)) #:http.request.field{:name "OriginAccessIdentity", :shape "string"})], :shape "S3OriginConfig", :type "structure"}))

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-tag-key (:key input)) #:http.request.field{:name "Key", :shape "TagKey"})], :shape "Tag", :type "structure"} (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-value (input :value)) #:http.request.field{:name "Value", :shape "TagValue"}))))

(clojure.core/defn- ser-streaming-logging-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serboolean (:enabled input)) #:http.request.field{:name "Enabled", :shape "boolean"}) (clojure.core/into (serstring (:bucket input)) #:http.request.field{:name "Bucket", :shape "string"}) (clojure.core/into (serstring (:prefix input)) #:http.request.field{:name "Prefix", :shape "string"})], :shape "StreamingLoggingConfig", :type "structure"}))

(clojure.core/defn- ser-ssl-protocol [input] #:http.request.field{:value (clojure.core/get {"SSLv3" "SSLv3", :ss-lv-3 "SSLv3", "TLSv1" "TLSv1", :tl-sv-1 "TLSv1", "TLSv1.1" "TLSv1.1", :tl-sv-11 "TLSv1.1", "TLSv1.2" "TLSv1.2", :tl-sv-12 "TLSv1.2"} input), :shape "SslProtocol"})

(clojure.core/defn- ser-lambda-function-association-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-lambda-function-association coll) #:http.request.field{:shape "LambdaFunctionAssociation", :location-name "LambdaFunctionAssociation"}))) input), :shape "LambdaFunctionAssociationList", :type "list"})

(clojure.core/defn- ser-headers [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "Headers", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-header-list (input :items)) #:http.request.field{:name "Items", :shape "HeaderList"}))))

(clojure.core/defn- ser-minimum-protocol-version [input] #:http.request.field{:value (clojure.core/get {"TLSv1" "TLSv1", :tl-sv-1 "TLSv1", "TLSv1_2016" "TLSv1_2016", :tl-sv-12-2018 "TLSv1.2_2018", :ss-lv-3 "SSLv3", "TLSv1.2_2018" "TLSv1.2_2018", "SSLv3" "SSLv3", :tl-sv-11-2016 "TLSv1.1_2016", :tl-sv-1-2016 "TLSv1_2016", "TLSv1.1_2016" "TLSv1.1_2016"} input), :shape "MinimumProtocolVersion"})

(clojure.core/defn- ser-origins [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "Origins", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-origin-list (input :items)) #:http.request.field{:name "Items", :shape "OriginList"}))))

(clojure.core/defn- ser-distribution-config-with-tags [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-distribution-config (:distribution-config input)) #:http.request.field{:name "DistributionConfig", :shape "DistributionConfig"}) (clojure.core/into (ser-tags (:tags input)) #:http.request.field{:name "Tags", :shape "Tags"})], :shape "DistributionConfigWithTags", :type "structure"}))

(clojure.core/defn- ser-header-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serstring coll) #:http.request.field{:shape "string", :location-name "Name"}))) input), :shape "HeaderList", :type "list"})

(clojure.core/defn- ser-resource-arn [input] #:http.request.field{:value input, :shape "ResourceARN"})

(clojure.core/defn- ser-ssl-support-method [input] #:http.request.field{:value (clojure.core/get {"sni-only" "sni-only", :snionly "sni-only", "vip" "vip", :vip "vip"} input), :shape "SSLSupportMethod"})

(clojure.core/defn- ser-http-version [input] #:http.request.field{:value (clojure.core/get {"http1.1" "http1.1", :http-11 "http1.1", "http2" "http2", :http-2 "http2"} input), :shape "HttpVersion"})

(clojure.core/defn- ser-cookie-preference [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-item-selection (:forward input)) #:http.request.field{:name "Forward", :shape "ItemSelection"})], :shape "CookiePreference", :type "structure"} (clojure.core/contains? input :whitelisted-names) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cookie-names (input :whitelisted-names)) #:http.request.field{:name "WhitelistedNames", :shape "CookieNames"}))))

(clojure.core/defn- ser-custom-headers [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "CustomHeaders", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-origin-custom-headers-list (input :items)) #:http.request.field{:name "Items", :shape "OriginCustomHeadersList"}))))

(clojure.core/defn- ser-methods-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-method coll) #:http.request.field{:shape "Method", :location-name "Method"}))) input), :shape "MethodsList", :type "list"})

(clojure.core/defn- ser-default-cache-behavior [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:target-origin-id input)) #:http.request.field{:name "TargetOriginId", :shape "string"}) (clojure.core/into (ser-forwarded-values (:forwarded-values input)) #:http.request.field{:name "ForwardedValues", :shape "ForwardedValues"}) (clojure.core/into (ser-trusted-signers (:trusted-signers input)) #:http.request.field{:name "TrustedSigners", :shape "TrustedSigners"}) (clojure.core/into (ser-viewer-protocol-policy (:viewer-protocol-policy input)) #:http.request.field{:name "ViewerProtocolPolicy", :shape "ViewerProtocolPolicy"}) (clojure.core/into (serlong (:min-ttl input)) #:http.request.field{:name "MinTTL", :shape "long"})], :shape "DefaultCacheBehavior", :type "structure"} (clojure.core/contains? input :smooth-streaming) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean (input :smooth-streaming)) #:http.request.field{:name "SmoothStreaming", :shape "boolean"})) (clojure.core/contains? input :field-level-encryption-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :field-level-encryption-id)) #:http.request.field{:name "FieldLevelEncryptionId", :shape "string"})) (clojure.core/contains? input :compress) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean (input :compress)) #:http.request.field{:name "Compress", :shape "boolean"})) (clojure.core/contains? input :lambda-function-associations) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lambda-function-associations (input :lambda-function-associations)) #:http.request.field{:name "LambdaFunctionAssociations", :shape "LambdaFunctionAssociations"})) (clojure.core/contains? input :max-ttl) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serlong (input :max-ttl)) #:http.request.field{:name "MaxTTL", :shape "long"})) (clojure.core/contains? input :allowed-methods) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-allowed-methods (input :allowed-methods)) #:http.request.field{:name "AllowedMethods", :shape "AllowedMethods"})) (clojure.core/contains? input :default-ttl) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serlong (input :default-ttl)) #:http.request.field{:name "DefaultTTL", :shape "long"}))))

(clojure.core/defn- ser-trusted-signers [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serboolean (:enabled input)) #:http.request.field{:name "Enabled", :shape "boolean"}) (clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "TrustedSigners", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aws-account-number-list (input :items)) #:http.request.field{:name "Items", :shape "AwsAccountNumberList"}))))

(clojure.core/defn- ser-viewer-certificate [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ViewerCertificate", :type "structure"} (clojure.core/contains? input :cloud-front-default-certificate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean (input :cloud-front-default-certificate)) #:http.request.field{:name "CloudFrontDefaultCertificate", :shape "boolean"})) (clojure.core/contains? input :iam-certificate-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :iam-certificate-id)) #:http.request.field{:name "IAMCertificateId", :shape "string"})) (clojure.core/contains? input :acm-certificate-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :acm-certificate-arn)) #:http.request.field{:name "ACMCertificateArn", :shape "string"})) (clojure.core/contains? input :ssl-support-method) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ssl-support-method (input :ssl-support-method)) #:http.request.field{:name "SSLSupportMethod", :shape "SSLSupportMethod"})) (clojure.core/contains? input :minimum-protocol-version) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-minimum-protocol-version (input :minimum-protocol-version)) #:http.request.field{:name "MinimumProtocolVersion", :shape "MinimumProtocolVersion"})) (clojure.core/contains? input :certificate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :certificate)) #:http.request.field{:name "Certificate", :shape "string", :deprecated true})) (clojure.core/contains? input :certificate-source) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-certificate-source (input :certificate-source)) #:http.request.field{:name "CertificateSource", :shape "CertificateSource", :deprecated true}))))

(clojure.core/defn- ser-cloud-front-origin-access-identity-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:caller-reference input)) #:http.request.field{:name "CallerReference", :shape "string"}) (clojure.core/into (serstring (:comment input)) #:http.request.field{:name "Comment", :shape "string"})], :shape "CloudFrontOriginAccessIdentityConfig", :type "structure"}))

(clojure.core/defn- ser-geo-restriction [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-geo-restriction-type (:restriction-type input)) #:http.request.field{:name "RestrictionType", :shape "GeoRestrictionType"}) (clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "GeoRestriction", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-location-list (input :items)) #:http.request.field{:name "Items", :shape "LocationList"}))))

(clojure.core/defn- req-list-distributions-by-web-acl-id-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :web-acl-id)) #:http.request.field{:name "WebACLId", :shape "string", :location "uri", :location-name "WebACLId"})]} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "Marker", :shape "string", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :max-items)) #:http.request.field{:name "MaxItems", :shape "string", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-create-field-level-encryption-profile-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-field-level-encryption-profile-config (input :field-level-encryption-profile-config)) #:http.request.field{:name "FieldLevelEncryptionProfileConfig", :shape "FieldLevelEncryptionProfileConfig", :location-name "FieldLevelEncryptionProfileConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-06-18/"}})]}))

(clojure.core/defn- req-create-field-level-encryption-config-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-field-level-encryption-config (input :field-level-encryption-config)) #:http.request.field{:name "FieldLevelEncryptionConfig", :shape "FieldLevelEncryptionConfig", :location-name "FieldLevelEncryptionConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-06-18/"}})]}))

(clojure.core/defn- req-get-streaming-distribution-config-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-delete-streaming-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-get-cloud-front-origin-access-identity-config-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-delete-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-update-public-key-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-public-key-config (input :public-key-config)) #:http.request.field{:name "PublicKeyConfig", :shape "PublicKeyConfig", :location-name "PublicKeyConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-06-18/"}})], :uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-get-public-key-config-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-list-tags-for-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:querystring [(clojure.core/into (ser-resource-arn (input :resource)) #:http.request.field{:name "Resource", :shape "ResourceARN", :location "querystring", :location-name "Resource"})]}))

(clojure.core/defn- req-create-distribution-with-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-distribution-config-with-tags (input :distribution-config-with-tags)) #:http.request.field{:name "DistributionConfigWithTags", :shape "DistributionConfigWithTags", :location-name "DistributionConfigWithTags", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-06-18/"}})]}))

(clojure.core/defn- req-get-field-level-encryption-config-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-get-public-key-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-list-field-level-encryption-profiles-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "Marker", :shape "string", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :max-items)) #:http.request.field{:name "MaxItems", :shape "string", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-list-streaming-distributions-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "Marker", :shape "string", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :max-items)) #:http.request.field{:name "MaxItems", :shape "string", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-get-cloud-front-origin-access-identity-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-get-field-level-encryption-profile-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-get-streaming-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-list-distributions-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "Marker", :shape "string", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :max-items)) #:http.request.field{:name "MaxItems", :shape "string", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-update-cloud-front-origin-access-identity-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-cloud-front-origin-access-identity-config (input :cloud-front-origin-access-identity-config)) #:http.request.field{:name "CloudFrontOriginAccessIdentityConfig", :shape "CloudFrontOriginAccessIdentityConfig", :location-name "CloudFrontOriginAccessIdentityConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-06-18/"}})], :uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-create-invalidation-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :distribution-id)) #:http.request.field{:name "DistributionId", :shape "string", :location "uri", :location-name "DistributionId"})], :body [(clojure.core/into (ser-invalidation-batch (input :invalidation-batch)) #:http.request.field{:name "InvalidationBatch", :shape "InvalidationBatch", :location-name "InvalidationBatch", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-06-18/"}})]}))

(clojure.core/defn- req-get-field-level-encryption-profile-config-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-tag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:querystring [(clojure.core/into (ser-resource-arn (input :resource)) #:http.request.field{:name "Resource", :shape "ResourceARN", :location "querystring", :location-name "Resource"})], :body [(clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags", :location-name "Tags", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-06-18/"}})]}))

(clojure.core/defn- req-create-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-distribution-config (input :distribution-config)) #:http.request.field{:name "DistributionConfig", :shape "DistributionConfig", :location-name "DistributionConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-06-18/"}})]}))

(clojure.core/defn- req-create-streaming-distribution-with-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-streaming-distribution-config-with-tags (input :streaming-distribution-config-with-tags)) #:http.request.field{:name "StreamingDistributionConfigWithTags", :shape "StreamingDistributionConfigWithTags", :location-name "StreamingDistributionConfigWithTags", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-06-18/"}})]}))

(clojure.core/defn- req-list-field-level-encryption-configs-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "Marker", :shape "string", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :max-items)) #:http.request.field{:name "MaxItems", :shape "string", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-get-distribution-config-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-create-streaming-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-streaming-distribution-config (input :streaming-distribution-config)) #:http.request.field{:name "StreamingDistributionConfig", :shape "StreamingDistributionConfig", :location-name "StreamingDistributionConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-06-18/"}})]}))

(clojure.core/defn- req-update-field-level-encryption-config-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-field-level-encryption-config (input :field-level-encryption-config)) #:http.request.field{:name "FieldLevelEncryptionConfig", :shape "FieldLevelEncryptionConfig", :location-name "FieldLevelEncryptionConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-06-18/"}})], :uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-get-field-level-encryption-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-list-public-keys-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "Marker", :shape "string", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :max-items)) #:http.request.field{:name "MaxItems", :shape "string", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-create-cloud-front-origin-access-identity-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-cloud-front-origin-access-identity-config (input :cloud-front-origin-access-identity-config)) #:http.request.field{:name "CloudFrontOriginAccessIdentityConfig", :shape "CloudFrontOriginAccessIdentityConfig", :location-name "CloudFrontOriginAccessIdentityConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-06-18/"}})]}))

(clojure.core/defn- req-get-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-update-streaming-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-streaming-distribution-config (input :streaming-distribution-config)) #:http.request.field{:name "StreamingDistributionConfig", :shape "StreamingDistributionConfig", :location-name "StreamingDistributionConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-06-18/"}})], :uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-update-field-level-encryption-profile-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-field-level-encryption-profile-config (input :field-level-encryption-profile-config)) #:http.request.field{:name "FieldLevelEncryptionProfileConfig", :shape "FieldLevelEncryptionProfileConfig", :location-name "FieldLevelEncryptionProfileConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-06-18/"}})], :uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-delete-public-key-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-delete-cloud-front-origin-access-identity-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-get-invalidation-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :distribution-id)) #:http.request.field{:name "DistributionId", :shape "string", :location "uri", :location-name "DistributionId"}) (clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-delete-field-level-encryption-profile-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-list-invalidations-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :distribution-id)) #:http.request.field{:name "DistributionId", :shape "string", :location "uri", :location-name "DistributionId"})]} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "Marker", :shape "string", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :max-items)) #:http.request.field{:name "MaxItems", :shape "string", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-untag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:querystring [(clojure.core/into (ser-resource-arn (input :resource)) #:http.request.field{:name "Resource", :shape "ResourceARN", :location "querystring", :location-name "Resource"})], :body [(clojure.core/into (ser-tag-keys (input :tag-keys)) #:http.request.field{:name "TagKeys", :shape "TagKeys", :location-name "TagKeys", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-06-18/"}})]}))

(clojure.core/defn- req-delete-field-level-encryption-config-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-update-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-distribution-config (input :distribution-config)) #:http.request.field{:name "DistributionConfig", :shape "DistributionConfig", :location-name "DistributionConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-06-18/"}})], :uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-create-public-key-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-public-key-config (input :public-key-config)) #:http.request.field{:name "PublicKeyConfig", :shape "PublicKeyConfig", :location-name "PublicKeyConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-06-18/"}})]}))

(clojure.core/defn- req-list-cloud-front-origin-access-identities-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "Marker", :shape "string", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :max-items)) #:http.request.field{:name "MaxItems", :shape "string", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/declare deserboolean)

(clojure.core/declare deser-cookie-names)

(clojure.core/declare deser-content-type-profile)

(clojure.core/declare deser-logging-config)

(clojure.core/declare deser-invalidation-summary)

(clojure.core/declare deser-custom-error-response-list)

(clojure.core/declare deser-invalidation)

(clojure.core/declare deser-certificate-source)

(clojure.core/declare deser-location-list)

(clojure.core/declare deser-key-pair-id-list)

(clojure.core/declare deser-field-patterns)

(clojure.core/declare deser-restrictions)

(clojure.core/declare deser-field-level-encryption-profile-config)

(clojure.core/declare deserstring)

(clojure.core/declare deser-field-level-encryption-config)

(clojure.core/declare deser-field-level-encryption-profile)

(clojure.core/declare deser-distribution)

(clojure.core/declare deser-cloud-front-origin-access-identity-list)

(clojure.core/declare deser-query-arg-profile)

(clojure.core/declare deser-lambda-function-association)

(clojure.core/declare deser-forwarded-values)

(clojure.core/declare deser-invalidation-batch)

(clojure.core/declare deser-invalidation-summary-list)

(clojure.core/declare deser-query-string-cache-keys-list)

(clojure.core/declare deser-streaming-distribution-list)

(clojure.core/declare deser-public-key-config)

(clojure.core/declare deser-item-selection)

(clojure.core/declare deser-encryption-entity-list)

(clojure.core/declare deser-streaming-distribution)

(clojure.core/declare deser-lambda-function-associations)

(clojure.core/declare deser-encryption-entities)

(clojure.core/declare deser-viewer-protocol-policy)

(clojure.core/declare deser-field-level-encryption-profile-summary)

(clojure.core/declare deser-content-type-profile-list)

(clojure.core/declare deser-custom-error-response)

(clojure.core/declare deser-distribution-summary-list)

(clojure.core/declare deser-signer)

(clojure.core/declare deserlong)

(clojure.core/declare deser-origin-list)

(clojure.core/declare deser-field-level-encryption-profile-list)

(clojure.core/declare deser-content-type-profile-config)

(clojure.core/declare deser-cached-methods)

(clojure.core/declare deser-tag-key)

(clojure.core/declare deser-tags)

(clojure.core/declare deser-streaming-distribution-summary-list)

(clojure.core/declare deser-query-arg-profile-list)

(clojure.core/declare deser-cache-behaviors)

(clojure.core/declare deser-cache-behavior)

(clojure.core/declare deser-active-trusted-signers)

(clojure.core/declare deser-origin)

(clojure.core/declare desertimestamp)

(clojure.core/declare deser-format)

(clojure.core/declare deser-custom-error-responses)

(clojure.core/declare deser-invalidation-list)

(clojure.core/declare deser-origin-ssl-protocols)

(clojure.core/declare deser-aliases)

(clojure.core/declare deser-event-type)

(clojure.core/declare deser-content-type-profiles)

(clojure.core/declare deser-encryption-entity)

(clojure.core/declare deser-lambda-function-arn)

(clojure.core/declare deser-allowed-methods)

(clojure.core/declare deser-price-class)

(clojure.core/declare deser-custom-origin-config)

(clojure.core/declare deser-s-3-origin)

(clojure.core/declare deser-streaming-distribution-summary)

(clojure.core/declare deser-cloud-front-origin-access-identity)

(clojure.core/declare deser-cookie-name-list)

(clojure.core/declare deser-field-level-encryption)

(clojure.core/declare deser-tag-list)

(clojure.core/declare deser-query-string-cache-keys)

(clojure.core/declare deser-key-pair-ids)

(clojure.core/declare deser-distribution-config)

(clojure.core/declare deser-public-key-summary)

(clojure.core/declare deser-ssl-protocols-list)

(clojure.core/declare deser-aws-account-number-list)

(clojure.core/declare deser-tag-value)

(clojure.core/declare deser-method)

(clojure.core/declare deser-alias-list)

(clojure.core/declare deser-origin-custom-headers-list)

(clojure.core/declare deser-query-arg-profile-config)

(clojure.core/declare deser-origin-protocol-policy)

(clojure.core/declare deser-signer-list)

(clojure.core/declare deser-query-arg-profiles)

(clojure.core/declare deser-path-list)

(clojure.core/declare deser-geo-restriction-type)

(clojure.core/declare deser-paths)

(clojure.core/declare deser-field-level-encryption-summary-list)

(clojure.core/declare deserinteger)

(clojure.core/declare deser-cloud-front-origin-access-identity-summary)

(clojure.core/declare deser-cache-behavior-list)

(clojure.core/declare deser-origin-custom-header)

(clojure.core/declare deser-streaming-distribution-config)

(clojure.core/declare deser-public-key-summary-list)

(clojure.core/declare deser-field-pattern-list)

(clojure.core/declare deser-s-3-origin-config)

(clojure.core/declare deser-cloud-front-origin-access-identity-summary-list)

(clojure.core/declare deser-tag)

(clojure.core/declare deser-streaming-logging-config)

(clojure.core/declare deser-field-level-encryption-summary)

(clojure.core/declare deser-distribution-summary)

(clojure.core/declare deser-ssl-protocol)

(clojure.core/declare deser-lambda-function-association-list)

(clojure.core/declare deser-headers)

(clojure.core/declare deser-minimum-protocol-version)

(clojure.core/declare deser-origins)

(clojure.core/declare deser-header-list)

(clojure.core/declare deser-distribution-list)

(clojure.core/declare deser-ssl-support-method)

(clojure.core/declare deser-http-version)

(clojure.core/declare deser-cookie-preference)

(clojure.core/declare deser-custom-headers)

(clojure.core/declare deser-methods-list)

(clojure.core/declare deser-public-key-list)

(clojure.core/declare deser-default-cache-behavior)

(clojure.core/declare deser-trusted-signers)

(clojure.core/declare deser-field-level-encryption-list)

(clojure.core/declare deser-public-key)

(clojure.core/declare deser-field-level-encryption-profile-summary-list)

(clojure.core/declare deser-viewer-certificate)

(clojure.core/declare deser-cloud-front-origin-access-identity-config)

(clojure.core/declare deser-geo-restriction)

(clojure.core/defn- deserboolean [input] (clojure.core/when-let [boolstr__1008759__auto__ (clojure.core/first input)] (clojure.core/cond (clojure.core/= "true" boolstr__1008759__auto__) true (clojure.core/= "false" boolstr__1008759__auto__) false)))

(clojure.core/defn- deser-cookie-names [input] (clojure.core/let [letvar1167189 {"Quantity" (portkey.aws/getback-xml-elem-with-tag "Quantity" input), "Items" (portkey.aws/getback-xml-elem-with-tag "Items" input)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar1167189 ["Quantity" :content]))} (letvar1167189 "Items") (clojure.core/assoc :items (deser-cookie-name-list (clojure.core/get-in letvar1167189 ["Items" :content]))))))

(clojure.core/defn- deser-content-type-profile [input] (clojure.core/let [letvar1167273 {"Format" (portkey.aws/getback-xml-elem-with-tag "Format" input), "ProfileId" (portkey.aws/getback-xml-elem-with-tag "ProfileId" input), "ContentType" (portkey.aws/getback-xml-elem-with-tag "ContentType" input)}] (clojure.core/cond-> {:format (deser-format (clojure.core/get-in letvar1167273 ["Format" :content])), :content-type (deserstring (clojure.core/get-in letvar1167273 ["ContentType" :content]))} (letvar1167273 "ProfileId") (clojure.core/assoc :profile-id (deserstring (clojure.core/get-in letvar1167273 ["ProfileId" :content]))))))

(clojure.core/defn- deser-logging-config [input] (clojure.core/let [letvar1167357 {"Enabled" (portkey.aws/getback-xml-elem-with-tag "Enabled" input), "IncludeCookies" (portkey.aws/getback-xml-elem-with-tag "IncludeCookies" input), "Bucket" (portkey.aws/getback-xml-elem-with-tag "Bucket" input), "Prefix" (portkey.aws/getback-xml-elem-with-tag "Prefix" input)}] (clojure.core/cond-> {:enabled (deserboolean (clojure.core/get-in letvar1167357 ["Enabled" :content])), :include-cookies (deserboolean (clojure.core/get-in letvar1167357 ["IncludeCookies" :content])), :bucket (deserstring (clojure.core/get-in letvar1167357 ["Bucket" :content])), :prefix (deserstring (clojure.core/get-in letvar1167357 ["Prefix" :content]))})))

(clojure.core/defn- deser-invalidation-summary [input] (clojure.core/let [letvar1167441 {"Id" (portkey.aws/getback-xml-elem-with-tag "Id" input), "CreateTime" (portkey.aws/getback-xml-elem-with-tag "CreateTime" input), "Status" (portkey.aws/getback-xml-elem-with-tag "Status" input)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar1167441 ["Id" :content])), :create-time (desertimestamp (clojure.core/get-in letvar1167441 ["CreateTime" :content])), :status (deserstring (clojure.core/get-in letvar1167441 ["Status" :content]))})))

(clojure.core/defn- deser-custom-error-response-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-custom-error-response coll))) input))

(clojure.core/defn- deser-invalidation [input] (clojure.core/let [letvar1167542 {"Id" (portkey.aws/getback-xml-elem-with-tag "Id" input), "Status" (portkey.aws/getback-xml-elem-with-tag "Status" input), "CreateTime" (portkey.aws/getback-xml-elem-with-tag "CreateTime" input), "InvalidationBatch" (portkey.aws/getback-xml-elem-with-tag "InvalidationBatch" input)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar1167542 ["Id" :content])), :status (deserstring (clojure.core/get-in letvar1167542 ["Status" :content])), :create-time (desertimestamp (clojure.core/get-in letvar1167542 ["CreateTime" :content])), :invalidation-batch (deser-invalidation-batch (clojure.core/get-in letvar1167542 ["InvalidationBatch" :content]))})))

(clojure.core/defn- deser-certificate-source [input] (clojure.core/get {"cloudfront" :cloudfront, "iam" :iam, "acm" :acm} (clojure.core/first input)))

(clojure.core/defn- deser-location-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-key-pair-id-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-field-patterns [input] (clojure.core/let [letvar1167665 {"Quantity" (portkey.aws/getback-xml-elem-with-tag "Quantity" input), "Items" (portkey.aws/getback-xml-elem-with-tag "Items" input)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar1167665 ["Quantity" :content]))} (letvar1167665 "Items") (clojure.core/assoc :items (deser-field-pattern-list (clojure.core/get-in letvar1167665 ["Items" :content]))))))

(clojure.core/defn- deser-restrictions [input] (clojure.core/let [letvar1167749 {"GeoRestriction" (portkey.aws/getback-xml-elem-with-tag "GeoRestriction" input)}] (clojure.core/cond-> {:geo-restriction (deser-geo-restriction (clojure.core/get-in letvar1167749 ["GeoRestriction" :content]))})))

(clojure.core/defn- deser-field-level-encryption-profile-config [input] (clojure.core/let [letvar1167833 {"Name" (portkey.aws/getback-xml-elem-with-tag "Name" input), "CallerReference" (portkey.aws/getback-xml-elem-with-tag "CallerReference" input), "Comment" (portkey.aws/getback-xml-elem-with-tag "Comment" input), "EncryptionEntities" (portkey.aws/getback-xml-elem-with-tag "EncryptionEntities" input)}] (clojure.core/cond-> {:name (deserstring (clojure.core/get-in letvar1167833 ["Name" :content])), :caller-reference (deserstring (clojure.core/get-in letvar1167833 ["CallerReference" :content])), :encryption-entities (deser-encryption-entities (clojure.core/get-in letvar1167833 ["EncryptionEntities" :content]))} (letvar1167833 "Comment") (clojure.core/assoc :comment (deserstring (clojure.core/get-in letvar1167833 ["Comment" :content]))))))

(clojure.core/defn- deserstring [input] (clojure.core/first input))

(clojure.core/defn- deser-field-level-encryption-config [input] (clojure.core/let [letvar1167922 {"CallerReference" (portkey.aws/getback-xml-elem-with-tag "CallerReference" input), "Comment" (portkey.aws/getback-xml-elem-with-tag "Comment" input), "QueryArgProfileConfig" (portkey.aws/getback-xml-elem-with-tag "QueryArgProfileConfig" input), "ContentTypeProfileConfig" (portkey.aws/getback-xml-elem-with-tag "ContentTypeProfileConfig" input)}] (clojure.core/cond-> {:caller-reference (deserstring (clojure.core/get-in letvar1167922 ["CallerReference" :content]))} (letvar1167922 "Comment") (clojure.core/assoc :comment (deserstring (clojure.core/get-in letvar1167922 ["Comment" :content]))) (letvar1167922 "QueryArgProfileConfig") (clojure.core/assoc :query-arg-profile-config (deser-query-arg-profile-config (clojure.core/get-in letvar1167922 ["QueryArgProfileConfig" :content]))) (letvar1167922 "ContentTypeProfileConfig") (clojure.core/assoc :content-type-profile-config (deser-content-type-profile-config (clojure.core/get-in letvar1167922 ["ContentTypeProfileConfig" :content]))))))

(clojure.core/defn- deser-field-level-encryption-profile [input] (clojure.core/let [letvar1168006 {"Id" (portkey.aws/getback-xml-elem-with-tag "Id" input), "LastModifiedTime" (portkey.aws/getback-xml-elem-with-tag "LastModifiedTime" input), "FieldLevelEncryptionProfileConfig" (portkey.aws/getback-xml-elem-with-tag "FieldLevelEncryptionProfileConfig" input)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar1168006 ["Id" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar1168006 ["LastModifiedTime" :content])), :field-level-encryption-profile-config (deser-field-level-encryption-profile-config (clojure.core/get-in letvar1168006 ["FieldLevelEncryptionProfileConfig" :content]))})))

(clojure.core/defn- deser-distribution [input] (clojure.core/let [letvar1168090 {"Id" (portkey.aws/getback-xml-elem-with-tag "Id" input), "ARN" (portkey.aws/getback-xml-elem-with-tag "ARN" input), "Status" (portkey.aws/getback-xml-elem-with-tag "Status" input), "LastModifiedTime" (portkey.aws/getback-xml-elem-with-tag "LastModifiedTime" input), "InProgressInvalidationBatches" (portkey.aws/getback-xml-elem-with-tag "InProgressInvalidationBatches" input), "DomainName" (portkey.aws/getback-xml-elem-with-tag "DomainName" input), "ActiveTrustedSigners" (portkey.aws/getback-xml-elem-with-tag "ActiveTrustedSigners" input), "DistributionConfig" (portkey.aws/getback-xml-elem-with-tag "DistributionConfig" input)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar1168090 ["Id" :content])), :arn (deserstring (clojure.core/get-in letvar1168090 ["ARN" :content])), :status (deserstring (clojure.core/get-in letvar1168090 ["Status" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar1168090 ["LastModifiedTime" :content])), :in-progress-invalidation-batches (deserinteger (clojure.core/get-in letvar1168090 ["InProgressInvalidationBatches" :content])), :domain-name (deserstring (clojure.core/get-in letvar1168090 ["DomainName" :content])), :active-trusted-signers (deser-active-trusted-signers (clojure.core/get-in letvar1168090 ["ActiveTrustedSigners" :content])), :distribution-config (deser-distribution-config (clojure.core/get-in letvar1168090 ["DistributionConfig" :content]))})))

(clojure.core/defn- deser-cloud-front-origin-access-identity-list [input] (clojure.core/let [letvar1168174 {"Marker" (portkey.aws/getback-xml-elem-with-tag "Marker" input), "NextMarker" (portkey.aws/getback-xml-elem-with-tag "NextMarker" input), "MaxItems" (portkey.aws/getback-xml-elem-with-tag "MaxItems" input), "IsTruncated" (portkey.aws/getback-xml-elem-with-tag "IsTruncated" input), "Quantity" (portkey.aws/getback-xml-elem-with-tag "Quantity" input), "Items" (portkey.aws/getback-xml-elem-with-tag "Items" input)}] (clojure.core/cond-> {:marker (deserstring (clojure.core/get-in letvar1168174 ["Marker" :content])), :max-items (deserinteger (clojure.core/get-in letvar1168174 ["MaxItems" :content])), :is-truncated (deserboolean (clojure.core/get-in letvar1168174 ["IsTruncated" :content])), :quantity (deserinteger (clojure.core/get-in letvar1168174 ["Quantity" :content]))} (letvar1168174 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar1168174 ["NextMarker" :content]))) (letvar1168174 "Items") (clojure.core/assoc :items (deser-cloud-front-origin-access-identity-summary-list (clojure.core/get-in letvar1168174 ["Items" :content]))))))

(clojure.core/defn- deser-query-arg-profile [input] (clojure.core/let [letvar1168258 {"QueryArg" (portkey.aws/getback-xml-elem-with-tag "QueryArg" input), "ProfileId" (portkey.aws/getback-xml-elem-with-tag "ProfileId" input)}] (clojure.core/cond-> {:query-arg (deserstring (clojure.core/get-in letvar1168258 ["QueryArg" :content])), :profile-id (deserstring (clojure.core/get-in letvar1168258 ["ProfileId" :content]))})))

(clojure.core/defn- deser-lambda-function-association [input] (clojure.core/let [letvar1168342 {"LambdaFunctionARN" (portkey.aws/getback-xml-elem-with-tag "LambdaFunctionARN" input), "EventType" (portkey.aws/getback-xml-elem-with-tag "EventType" input), "IncludeBody" (portkey.aws/getback-xml-elem-with-tag "IncludeBody" input)}] (clojure.core/cond-> {:lambda-function-arn (deser-lambda-function-arn (clojure.core/get-in letvar1168342 ["LambdaFunctionARN" :content])), :event-type (deser-event-type (clojure.core/get-in letvar1168342 ["EventType" :content]))} (letvar1168342 "IncludeBody") (clojure.core/assoc :include-body (deserboolean (clojure.core/get-in letvar1168342 ["IncludeBody" :content]))))))

(clojure.core/defn- deser-forwarded-values [input] (clojure.core/let [letvar1168426 {"QueryString" (portkey.aws/getback-xml-elem-with-tag "QueryString" input), "Cookies" (portkey.aws/getback-xml-elem-with-tag "Cookies" input), "Headers" (portkey.aws/getback-xml-elem-with-tag "Headers" input), "QueryStringCacheKeys" (portkey.aws/getback-xml-elem-with-tag "QueryStringCacheKeys" input)}] (clojure.core/cond-> {:query-string (deserboolean (clojure.core/get-in letvar1168426 ["QueryString" :content])), :cookies (deser-cookie-preference (clojure.core/get-in letvar1168426 ["Cookies" :content]))} (letvar1168426 "Headers") (clojure.core/assoc :headers (deser-headers (clojure.core/get-in letvar1168426 ["Headers" :content]))) (letvar1168426 "QueryStringCacheKeys") (clojure.core/assoc :query-string-cache-keys (deser-query-string-cache-keys (clojure.core/get-in letvar1168426 ["QueryStringCacheKeys" :content]))))))

(clojure.core/defn- deser-invalidation-batch [input] (clojure.core/let [letvar1168510 {"Paths" (portkey.aws/getback-xml-elem-with-tag "Paths" input), "CallerReference" (portkey.aws/getback-xml-elem-with-tag "CallerReference" input)}] (clojure.core/cond-> {:paths (deser-paths (clojure.core/get-in letvar1168510 ["Paths" :content])), :caller-reference (deserstring (clojure.core/get-in letvar1168510 ["CallerReference" :content]))})))

(clojure.core/defn- deser-invalidation-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-invalidation-summary coll))) input))

(clojure.core/defn- deser-query-string-cache-keys-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-streaming-distribution-list [input] (clojure.core/let [letvar1168628 {"Marker" (portkey.aws/getback-xml-elem-with-tag "Marker" input), "NextMarker" (portkey.aws/getback-xml-elem-with-tag "NextMarker" input), "MaxItems" (portkey.aws/getback-xml-elem-with-tag "MaxItems" input), "IsTruncated" (portkey.aws/getback-xml-elem-with-tag "IsTruncated" input), "Quantity" (portkey.aws/getback-xml-elem-with-tag "Quantity" input), "Items" (portkey.aws/getback-xml-elem-with-tag "Items" input)}] (clojure.core/cond-> {:marker (deserstring (clojure.core/get-in letvar1168628 ["Marker" :content])), :max-items (deserinteger (clojure.core/get-in letvar1168628 ["MaxItems" :content])), :is-truncated (deserboolean (clojure.core/get-in letvar1168628 ["IsTruncated" :content])), :quantity (deserinteger (clojure.core/get-in letvar1168628 ["Quantity" :content]))} (letvar1168628 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar1168628 ["NextMarker" :content]))) (letvar1168628 "Items") (clojure.core/assoc :items (deser-streaming-distribution-summary-list (clojure.core/get-in letvar1168628 ["Items" :content]))))))

(clojure.core/defn- deser-public-key-config [input] (clojure.core/let [letvar1168712 {"CallerReference" (portkey.aws/getback-xml-elem-with-tag "CallerReference" input), "Name" (portkey.aws/getback-xml-elem-with-tag "Name" input), "EncodedKey" (portkey.aws/getback-xml-elem-with-tag "EncodedKey" input), "Comment" (portkey.aws/getback-xml-elem-with-tag "Comment" input)}] (clojure.core/cond-> {:caller-reference (deserstring (clojure.core/get-in letvar1168712 ["CallerReference" :content])), :name (deserstring (clojure.core/get-in letvar1168712 ["Name" :content])), :encoded-key (deserstring (clojure.core/get-in letvar1168712 ["EncodedKey" :content]))} (letvar1168712 "Comment") (clojure.core/assoc :comment (deserstring (clojure.core/get-in letvar1168712 ["Comment" :content]))))))

(clojure.core/defn- deser-item-selection [input] (clojure.core/get {"none" :none, "whitelist" :whitelist, "all" :all} (clojure.core/first input)))

(clojure.core/defn- deser-encryption-entity-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-encryption-entity coll))) input))

(clojure.core/defn- deser-streaming-distribution [input] (clojure.core/let [letvar1168818 {"Id" (portkey.aws/getback-xml-elem-with-tag "Id" input), "ARN" (portkey.aws/getback-xml-elem-with-tag "ARN" input), "Status" (portkey.aws/getback-xml-elem-with-tag "Status" input), "LastModifiedTime" (portkey.aws/getback-xml-elem-with-tag "LastModifiedTime" input), "DomainName" (portkey.aws/getback-xml-elem-with-tag "DomainName" input), "ActiveTrustedSigners" (portkey.aws/getback-xml-elem-with-tag "ActiveTrustedSigners" input), "StreamingDistributionConfig" (portkey.aws/getback-xml-elem-with-tag "StreamingDistributionConfig" input)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar1168818 ["Id" :content])), :arn (deserstring (clojure.core/get-in letvar1168818 ["ARN" :content])), :status (deserstring (clojure.core/get-in letvar1168818 ["Status" :content])), :domain-name (deserstring (clojure.core/get-in letvar1168818 ["DomainName" :content])), :active-trusted-signers (deser-active-trusted-signers (clojure.core/get-in letvar1168818 ["ActiveTrustedSigners" :content])), :streaming-distribution-config (deser-streaming-distribution-config (clojure.core/get-in letvar1168818 ["StreamingDistributionConfig" :content]))} (letvar1168818 "LastModifiedTime") (clojure.core/assoc :last-modified-time (desertimestamp (clojure.core/get-in letvar1168818 ["LastModifiedTime" :content]))))))

(clojure.core/defn- deser-lambda-function-associations [input] (clojure.core/let [letvar1168902 {"Quantity" (portkey.aws/getback-xml-elem-with-tag "Quantity" input), "Items" (portkey.aws/getback-xml-elem-with-tag "Items" input)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar1168902 ["Quantity" :content]))} (letvar1168902 "Items") (clojure.core/assoc :items (deser-lambda-function-association-list (clojure.core/get-in letvar1168902 ["Items" :content]))))))

(clojure.core/defn- deser-encryption-entities [input] (clojure.core/let [letvar1168986 {"Quantity" (portkey.aws/getback-xml-elem-with-tag "Quantity" input), "Items" (portkey.aws/getback-xml-elem-with-tag "Items" input)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar1168986 ["Quantity" :content]))} (letvar1168986 "Items") (clojure.core/assoc :items (deser-encryption-entity-list (clojure.core/get-in letvar1168986 ["Items" :content]))))))

(clojure.core/defn- deser-viewer-protocol-policy [input] (clojure.core/get {"allow-all" :allowall, "https-only" :httpsonly, "redirect-to-https" :redirecttohttps} (clojure.core/first input)))

(clojure.core/defn- deser-field-level-encryption-profile-summary [input] (clojure.core/let [letvar1169075 {"Id" (portkey.aws/getback-xml-elem-with-tag "Id" input), "LastModifiedTime" (portkey.aws/getback-xml-elem-with-tag "LastModifiedTime" input), "Name" (portkey.aws/getback-xml-elem-with-tag "Name" input), "EncryptionEntities" (portkey.aws/getback-xml-elem-with-tag "EncryptionEntities" input), "Comment" (portkey.aws/getback-xml-elem-with-tag "Comment" input)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar1169075 ["Id" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar1169075 ["LastModifiedTime" :content])), :name (deserstring (clojure.core/get-in letvar1169075 ["Name" :content])), :encryption-entities (deser-encryption-entities (clojure.core/get-in letvar1169075 ["EncryptionEntities" :content]))} (letvar1169075 "Comment") (clojure.core/assoc :comment (deserstring (clojure.core/get-in letvar1169075 ["Comment" :content]))))))

(clojure.core/defn- deser-content-type-profile-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-content-type-profile coll))) input))

(clojure.core/defn- deser-custom-error-response [input] (clojure.core/let [letvar1169176 {"ErrorCode" (portkey.aws/getback-xml-elem-with-tag "ErrorCode" input), "ResponsePagePath" (portkey.aws/getback-xml-elem-with-tag "ResponsePagePath" input), "ResponseCode" (portkey.aws/getback-xml-elem-with-tag "ResponseCode" input), "ErrorCachingMinTTL" (portkey.aws/getback-xml-elem-with-tag "ErrorCachingMinTTL" input)}] (clojure.core/cond-> {:error-code (deserinteger (clojure.core/get-in letvar1169176 ["ErrorCode" :content]))} (letvar1169176 "ResponsePagePath") (clojure.core/assoc :response-page-path (deserstring (clojure.core/get-in letvar1169176 ["ResponsePagePath" :content]))) (letvar1169176 "ResponseCode") (clojure.core/assoc :response-code (deserstring (clojure.core/get-in letvar1169176 ["ResponseCode" :content]))) (letvar1169176 "ErrorCachingMinTTL") (clojure.core/assoc :error-caching-min-ttl (deserlong (clojure.core/get-in letvar1169176 ["ErrorCachingMinTTL" :content]))))))

(clojure.core/defn- deser-distribution-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-distribution-summary coll))) input))

(clojure.core/defn- deser-signer [input] (clojure.core/let [letvar1169277 {"AwsAccountNumber" (portkey.aws/getback-xml-elem-with-tag "AwsAccountNumber" input), "KeyPairIds" (portkey.aws/getback-xml-elem-with-tag "KeyPairIds" input)}] (clojure.core/cond-> {} (letvar1169277 "AwsAccountNumber") (clojure.core/assoc :aws-account-number (deserstring (clojure.core/get-in letvar1169277 ["AwsAccountNumber" :content]))) (letvar1169277 "KeyPairIds") (clojure.core/assoc :key-pair-ids (deser-key-pair-ids (clojure.core/get-in letvar1169277 ["KeyPairIds" :content]))))))

(clojure.core/defn- deserlong [input] (java.lang.Long. (clojure.core/first input)))

(clojure.core/defn- deser-origin-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-origin coll))) input))

(clojure.core/defn- deser-field-level-encryption-profile-list [input] (clojure.core/let [letvar1169380 {"NextMarker" (portkey.aws/getback-xml-elem-with-tag "NextMarker" input), "MaxItems" (portkey.aws/getback-xml-elem-with-tag "MaxItems" input), "Quantity" (portkey.aws/getback-xml-elem-with-tag "Quantity" input), "Items" (portkey.aws/getback-xml-elem-with-tag "Items" input)}] (clojure.core/cond-> {:max-items (deserinteger (clojure.core/get-in letvar1169380 ["MaxItems" :content])), :quantity (deserinteger (clojure.core/get-in letvar1169380 ["Quantity" :content]))} (letvar1169380 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar1169380 ["NextMarker" :content]))) (letvar1169380 "Items") (clojure.core/assoc :items (deser-field-level-encryption-profile-summary-list (clojure.core/get-in letvar1169380 ["Items" :content]))))))

(clojure.core/defn- deser-content-type-profile-config [input] (clojure.core/let [letvar1169464 {"ForwardWhenContentTypeIsUnknown" (portkey.aws/getback-xml-elem-with-tag "ForwardWhenContentTypeIsUnknown" input), "ContentTypeProfiles" (portkey.aws/getback-xml-elem-with-tag "ContentTypeProfiles" input)}] (clojure.core/cond-> {:forward-when-content-type-is-unknown (deserboolean (clojure.core/get-in letvar1169464 ["ForwardWhenContentTypeIsUnknown" :content]))} (letvar1169464 "ContentTypeProfiles") (clojure.core/assoc :content-type-profiles (deser-content-type-profiles (clojure.core/get-in letvar1169464 ["ContentTypeProfiles" :content]))))))

(clojure.core/defn- deser-cached-methods [input] (clojure.core/let [letvar1169548 {"Quantity" (portkey.aws/getback-xml-elem-with-tag "Quantity" input), "Items" (portkey.aws/getback-xml-elem-with-tag "Items" input)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar1169548 ["Quantity" :content])), :items (deser-methods-list (clojure.core/get-in letvar1169548 ["Items" :content]))})))

(clojure.core/defn- deser-tag-key [input] (clojure.core/first input))

(clojure.core/defn- deser-tags [input] (clojure.core/let [letvar1169637 {"Items" (portkey.aws/getback-xml-elem-with-tag "Items" input)}] (clojure.core/cond-> {} (letvar1169637 "Items") (clojure.core/assoc :items (deser-tag-list (clojure.core/get-in letvar1169637 ["Items" :content]))))))

(clojure.core/defn- deser-streaming-distribution-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-streaming-distribution-summary coll))) input))

(clojure.core/defn- deser-query-arg-profile-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-query-arg-profile coll))) input))

(clojure.core/defn- deser-cache-behaviors [input] (clojure.core/let [letvar1169755 {"Quantity" (portkey.aws/getback-xml-elem-with-tag "Quantity" input), "Items" (portkey.aws/getback-xml-elem-with-tag "Items" input)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar1169755 ["Quantity" :content]))} (letvar1169755 "Items") (clojure.core/assoc :items (deser-cache-behavior-list (clojure.core/get-in letvar1169755 ["Items" :content]))))))

(clojure.core/defn- deser-cache-behavior [input] (clojure.core/let [letvar1169839 {"SmoothStreaming" (portkey.aws/getback-xml-elem-with-tag "SmoothStreaming" input), "FieldLevelEncryptionId" (portkey.aws/getback-xml-elem-with-tag "FieldLevelEncryptionId" input), "Compress" (portkey.aws/getback-xml-elem-with-tag "Compress" input), "ForwardedValues" (portkey.aws/getback-xml-elem-with-tag "ForwardedValues" input), "TargetOriginId" (portkey.aws/getback-xml-elem-with-tag "TargetOriginId" input), "LambdaFunctionAssociations" (portkey.aws/getback-xml-elem-with-tag "LambdaFunctionAssociations" input), "ViewerProtocolPolicy" (portkey.aws/getback-xml-elem-with-tag "ViewerProtocolPolicy" input), "MinTTL" (portkey.aws/getback-xml-elem-with-tag "MinTTL" input), "PathPattern" (portkey.aws/getback-xml-elem-with-tag "PathPattern" input), "MaxTTL" (portkey.aws/getback-xml-elem-with-tag "MaxTTL" input), "AllowedMethods" (portkey.aws/getback-xml-elem-with-tag "AllowedMethods" input), "DefaultTTL" (portkey.aws/getback-xml-elem-with-tag "DefaultTTL" input), "TrustedSigners" (portkey.aws/getback-xml-elem-with-tag "TrustedSigners" input)}] (clojure.core/cond-> {:path-pattern (deserstring (clojure.core/get-in letvar1169839 ["PathPattern" :content])), :target-origin-id (deserstring (clojure.core/get-in letvar1169839 ["TargetOriginId" :content])), :forwarded-values (deser-forwarded-values (clojure.core/get-in letvar1169839 ["ForwardedValues" :content])), :trusted-signers (deser-trusted-signers (clojure.core/get-in letvar1169839 ["TrustedSigners" :content])), :viewer-protocol-policy (deser-viewer-protocol-policy (clojure.core/get-in letvar1169839 ["ViewerProtocolPolicy" :content])), :min-ttl (deserlong (clojure.core/get-in letvar1169839 ["MinTTL" :content]))} (letvar1169839 "SmoothStreaming") (clojure.core/assoc :smooth-streaming (deserboolean (clojure.core/get-in letvar1169839 ["SmoothStreaming" :content]))) (letvar1169839 "FieldLevelEncryptionId") (clojure.core/assoc :field-level-encryption-id (deserstring (clojure.core/get-in letvar1169839 ["FieldLevelEncryptionId" :content]))) (letvar1169839 "Compress") (clojure.core/assoc :compress (deserboolean (clojure.core/get-in letvar1169839 ["Compress" :content]))) (letvar1169839 "LambdaFunctionAssociations") (clojure.core/assoc :lambda-function-associations (deser-lambda-function-associations (clojure.core/get-in letvar1169839 ["LambdaFunctionAssociations" :content]))) (letvar1169839 "MaxTTL") (clojure.core/assoc :max-ttl (deserlong (clojure.core/get-in letvar1169839 ["MaxTTL" :content]))) (letvar1169839 "AllowedMethods") (clojure.core/assoc :allowed-methods (deser-allowed-methods (clojure.core/get-in letvar1169839 ["AllowedMethods" :content]))) (letvar1169839 "DefaultTTL") (clojure.core/assoc :default-ttl (deserlong (clojure.core/get-in letvar1169839 ["DefaultTTL" :content]))))))

(clojure.core/defn- deser-active-trusted-signers [input] (clojure.core/let [letvar1169923 {"Enabled" (portkey.aws/getback-xml-elem-with-tag "Enabled" input), "Quantity" (portkey.aws/getback-xml-elem-with-tag "Quantity" input), "Items" (portkey.aws/getback-xml-elem-with-tag "Items" input)}] (clojure.core/cond-> {:enabled (deserboolean (clojure.core/get-in letvar1169923 ["Enabled" :content])), :quantity (deserinteger (clojure.core/get-in letvar1169923 ["Quantity" :content]))} (letvar1169923 "Items") (clojure.core/assoc :items (deser-signer-list (clojure.core/get-in letvar1169923 ["Items" :content]))))))

(clojure.core/defn- deser-origin [input] (clojure.core/let [letvar1170007 {"Id" (portkey.aws/getback-xml-elem-with-tag "Id" input), "DomainName" (portkey.aws/getback-xml-elem-with-tag "DomainName" input), "OriginPath" (portkey.aws/getback-xml-elem-with-tag "OriginPath" input), "CustomHeaders" (portkey.aws/getback-xml-elem-with-tag "CustomHeaders" input), "S3OriginConfig" (portkey.aws/getback-xml-elem-with-tag "S3OriginConfig" input), "CustomOriginConfig" (portkey.aws/getback-xml-elem-with-tag "CustomOriginConfig" input)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar1170007 ["Id" :content])), :domain-name (deserstring (clojure.core/get-in letvar1170007 ["DomainName" :content]))} (letvar1170007 "OriginPath") (clojure.core/assoc :origin-path (deserstring (clojure.core/get-in letvar1170007 ["OriginPath" :content]))) (letvar1170007 "CustomHeaders") (clojure.core/assoc :custom-headers (deser-custom-headers (clojure.core/get-in letvar1170007 ["CustomHeaders" :content]))) (letvar1170007 "S3OriginConfig") (clojure.core/assoc :s-3-origin-config (deser-s-3-origin-config (clojure.core/get-in letvar1170007 ["S3OriginConfig" :content]))) (letvar1170007 "CustomOriginConfig") (clojure.core/assoc :custom-origin-config (deser-custom-origin-config (clojure.core/get-in letvar1170007 ["CustomOriginConfig" :content]))))))

(clojure.core/defn- desertimestamp [input] (clojure.core/first input))

(clojure.core/defn- deser-format [input] (clojure.core/get {"URLEncoded" :url-encoded} (clojure.core/first input)))

(clojure.core/defn- deser-custom-error-responses [input] (clojure.core/let [letvar1170098 {"Quantity" (portkey.aws/getback-xml-elem-with-tag "Quantity" input), "Items" (portkey.aws/getback-xml-elem-with-tag "Items" input)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar1170098 ["Quantity" :content]))} (letvar1170098 "Items") (clojure.core/assoc :items (deser-custom-error-response-list (clojure.core/get-in letvar1170098 ["Items" :content]))))))

(clojure.core/defn- deser-invalidation-list [input] (clojure.core/let [letvar1170182 {"Marker" (portkey.aws/getback-xml-elem-with-tag "Marker" input), "NextMarker" (portkey.aws/getback-xml-elem-with-tag "NextMarker" input), "MaxItems" (portkey.aws/getback-xml-elem-with-tag "MaxItems" input), "IsTruncated" (portkey.aws/getback-xml-elem-with-tag "IsTruncated" input), "Quantity" (portkey.aws/getback-xml-elem-with-tag "Quantity" input), "Items" (portkey.aws/getback-xml-elem-with-tag "Items" input)}] (clojure.core/cond-> {:marker (deserstring (clojure.core/get-in letvar1170182 ["Marker" :content])), :max-items (deserinteger (clojure.core/get-in letvar1170182 ["MaxItems" :content])), :is-truncated (deserboolean (clojure.core/get-in letvar1170182 ["IsTruncated" :content])), :quantity (deserinteger (clojure.core/get-in letvar1170182 ["Quantity" :content]))} (letvar1170182 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar1170182 ["NextMarker" :content]))) (letvar1170182 "Items") (clojure.core/assoc :items (deser-invalidation-summary-list (clojure.core/get-in letvar1170182 ["Items" :content]))))))

(clojure.core/defn- deser-origin-ssl-protocols [input] (clojure.core/let [letvar1170266 {"Quantity" (portkey.aws/getback-xml-elem-with-tag "Quantity" input), "Items" (portkey.aws/getback-xml-elem-with-tag "Items" input)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar1170266 ["Quantity" :content])), :items (deser-ssl-protocols-list (clojure.core/get-in letvar1170266 ["Items" :content]))})))

(clojure.core/defn- deser-aliases [input] (clojure.core/let [letvar1170350 {"Quantity" (portkey.aws/getback-xml-elem-with-tag "Quantity" input), "Items" (portkey.aws/getback-xml-elem-with-tag "Items" input)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar1170350 ["Quantity" :content]))} (letvar1170350 "Items") (clojure.core/assoc :items (deser-alias-list (clojure.core/get-in letvar1170350 ["Items" :content]))))))

(clojure.core/defn- deser-event-type [input] (clojure.core/get {"viewer-request" :viewerrequest, "viewer-response" :viewerresponse, "origin-request" :originrequest, "origin-response" :originresponse} (clojure.core/first input)))

(clojure.core/defn- deser-content-type-profiles [input] (clojure.core/let [letvar1170439 {"Quantity" (portkey.aws/getback-xml-elem-with-tag "Quantity" input), "Items" (portkey.aws/getback-xml-elem-with-tag "Items" input)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar1170439 ["Quantity" :content]))} (letvar1170439 "Items") (clojure.core/assoc :items (deser-content-type-profile-list (clojure.core/get-in letvar1170439 ["Items" :content]))))))

(clojure.core/defn- deser-encryption-entity [input] (clojure.core/let [letvar1170523 {"PublicKeyId" (portkey.aws/getback-xml-elem-with-tag "PublicKeyId" input), "ProviderId" (portkey.aws/getback-xml-elem-with-tag "ProviderId" input), "FieldPatterns" (portkey.aws/getback-xml-elem-with-tag "FieldPatterns" input)}] (clojure.core/cond-> {:public-key-id (deserstring (clojure.core/get-in letvar1170523 ["PublicKeyId" :content])), :provider-id (deserstring (clojure.core/get-in letvar1170523 ["ProviderId" :content])), :field-patterns (deser-field-patterns (clojure.core/get-in letvar1170523 ["FieldPatterns" :content]))})))

(clojure.core/defn- deser-lambda-function-arn [input] (clojure.core/first input))

(clojure.core/defn- deser-allowed-methods [input] (clojure.core/let [letvar1170612 {"Quantity" (portkey.aws/getback-xml-elem-with-tag "Quantity" input), "Items" (portkey.aws/getback-xml-elem-with-tag "Items" input), "CachedMethods" (portkey.aws/getback-xml-elem-with-tag "CachedMethods" input)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar1170612 ["Quantity" :content])), :items (deser-methods-list (clojure.core/get-in letvar1170612 ["Items" :content]))} (letvar1170612 "CachedMethods") (clojure.core/assoc :cached-methods (deser-cached-methods (clojure.core/get-in letvar1170612 ["CachedMethods" :content]))))))

(clojure.core/defn- deser-price-class [input] (clojure.core/get {"PriceClass_100" :price-class-100, "PriceClass_200" :price-class-200, "PriceClass_All" :price-class-all} (clojure.core/first input)))

(clojure.core/defn- deser-custom-origin-config [input] (clojure.core/let [letvar1170701 {"HTTPPort" (portkey.aws/getback-xml-elem-with-tag "HTTPPort" input), "HTTPSPort" (portkey.aws/getback-xml-elem-with-tag "HTTPSPort" input), "OriginProtocolPolicy" (portkey.aws/getback-xml-elem-with-tag "OriginProtocolPolicy" input), "OriginSslProtocols" (portkey.aws/getback-xml-elem-with-tag "OriginSslProtocols" input), "OriginReadTimeout" (portkey.aws/getback-xml-elem-with-tag "OriginReadTimeout" input), "OriginKeepaliveTimeout" (portkey.aws/getback-xml-elem-with-tag "OriginKeepaliveTimeout" input)}] (clojure.core/cond-> {:http-port (deserinteger (clojure.core/get-in letvar1170701 ["HTTPPort" :content])), :https-port (deserinteger (clojure.core/get-in letvar1170701 ["HTTPSPort" :content])), :origin-protocol-policy (deser-origin-protocol-policy (clojure.core/get-in letvar1170701 ["OriginProtocolPolicy" :content]))} (letvar1170701 "OriginSslProtocols") (clojure.core/assoc :origin-ssl-protocols (deser-origin-ssl-protocols (clojure.core/get-in letvar1170701 ["OriginSslProtocols" :content]))) (letvar1170701 "OriginReadTimeout") (clojure.core/assoc :origin-read-timeout (deserinteger (clojure.core/get-in letvar1170701 ["OriginReadTimeout" :content]))) (letvar1170701 "OriginKeepaliveTimeout") (clojure.core/assoc :origin-keepalive-timeout (deserinteger (clojure.core/get-in letvar1170701 ["OriginKeepaliveTimeout" :content]))))))

(clojure.core/defn- deser-s-3-origin [input] (clojure.core/let [letvar1170785 {"DomainName" (portkey.aws/getback-xml-elem-with-tag "DomainName" input), "OriginAccessIdentity" (portkey.aws/getback-xml-elem-with-tag "OriginAccessIdentity" input)}] (clojure.core/cond-> {:domain-name (deserstring (clojure.core/get-in letvar1170785 ["DomainName" :content])), :origin-access-identity (deserstring (clojure.core/get-in letvar1170785 ["OriginAccessIdentity" :content]))})))

(clojure.core/defn- deser-streaming-distribution-summary [input] (clojure.core/let [letvar1170869 {"Comment" (portkey.aws/getback-xml-elem-with-tag "Comment" input), "ARN" (portkey.aws/getback-xml-elem-with-tag "ARN" input), "Enabled" (portkey.aws/getback-xml-elem-with-tag "Enabled" input), "Status" (portkey.aws/getback-xml-elem-with-tag "Status" input), "Aliases" (portkey.aws/getback-xml-elem-with-tag "Aliases" input), "PriceClass" (portkey.aws/getback-xml-elem-with-tag "PriceClass" input), "S3Origin" (portkey.aws/getback-xml-elem-with-tag "S3Origin" input), "LastModifiedTime" (portkey.aws/getback-xml-elem-with-tag "LastModifiedTime" input), "DomainName" (portkey.aws/getback-xml-elem-with-tag "DomainName" input), "Id" (portkey.aws/getback-xml-elem-with-tag "Id" input), "TrustedSigners" (portkey.aws/getback-xml-elem-with-tag "TrustedSigners" input)}] (clojure.core/cond-> {:domain-name (deserstring (clojure.core/get-in letvar1170869 ["DomainName" :content])), :status (deserstring (clojure.core/get-in letvar1170869 ["Status" :content])), :id (deserstring (clojure.core/get-in letvar1170869 ["Id" :content])), :comment (deserstring (clojure.core/get-in letvar1170869 ["Comment" :content])), :trusted-signers (deser-trusted-signers (clojure.core/get-in letvar1170869 ["TrustedSigners" :content])), :aliases (deser-aliases (clojure.core/get-in letvar1170869 ["Aliases" :content])), :s-3-origin (deser-s-3-origin (clojure.core/get-in letvar1170869 ["S3Origin" :content])), :enabled (deserboolean (clojure.core/get-in letvar1170869 ["Enabled" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar1170869 ["LastModifiedTime" :content])), :arn (deserstring (clojure.core/get-in letvar1170869 ["ARN" :content])), :price-class (deser-price-class (clojure.core/get-in letvar1170869 ["PriceClass" :content]))})))

(clojure.core/defn- deser-cloud-front-origin-access-identity [input] (clojure.core/let [letvar1170953 {"Id" (portkey.aws/getback-xml-elem-with-tag "Id" input), "S3CanonicalUserId" (portkey.aws/getback-xml-elem-with-tag "S3CanonicalUserId" input), "CloudFrontOriginAccessIdentityConfig" (portkey.aws/getback-xml-elem-with-tag "CloudFrontOriginAccessIdentityConfig" input)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar1170953 ["Id" :content])), :s-3-canonical-user-id (deserstring (clojure.core/get-in letvar1170953 ["S3CanonicalUserId" :content]))} (letvar1170953 "CloudFrontOriginAccessIdentityConfig") (clojure.core/assoc :cloud-front-origin-access-identity-config (deser-cloud-front-origin-access-identity-config (clojure.core/get-in letvar1170953 ["CloudFrontOriginAccessIdentityConfig" :content]))))))

(clojure.core/defn- deser-cookie-name-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-field-level-encryption [input] (clojure.core/let [letvar1171054 {"Id" (portkey.aws/getback-xml-elem-with-tag "Id" input), "LastModifiedTime" (portkey.aws/getback-xml-elem-with-tag "LastModifiedTime" input), "FieldLevelEncryptionConfig" (portkey.aws/getback-xml-elem-with-tag "FieldLevelEncryptionConfig" input)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar1171054 ["Id" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar1171054 ["LastModifiedTime" :content])), :field-level-encryption-config (deser-field-level-encryption-config (clojure.core/get-in letvar1171054 ["FieldLevelEncryptionConfig" :content]))})))

(clojure.core/defn- deser-tag-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-query-string-cache-keys [input] (clojure.core/let [letvar1171155 {"Quantity" (portkey.aws/getback-xml-elem-with-tag "Quantity" input), "Items" (portkey.aws/getback-xml-elem-with-tag "Items" input)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar1171155 ["Quantity" :content]))} (letvar1171155 "Items") (clojure.core/assoc :items (deser-query-string-cache-keys-list (clojure.core/get-in letvar1171155 ["Items" :content]))))))

(clojure.core/defn- deser-key-pair-ids [input] (clojure.core/let [letvar1171239 {"Quantity" (portkey.aws/getback-xml-elem-with-tag "Quantity" input), "Items" (portkey.aws/getback-xml-elem-with-tag "Items" input)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar1171239 ["Quantity" :content]))} (letvar1171239 "Items") (clojure.core/assoc :items (deser-key-pair-id-list (clojure.core/get-in letvar1171239 ["Items" :content]))))))

(clojure.core/defn- deser-distribution-config [input] (clojure.core/let [letvar1171323 {"DefaultRootObject" (portkey.aws/getback-xml-elem-with-tag "DefaultRootObject" input), "CallerReference" (portkey.aws/getback-xml-elem-with-tag "CallerReference" input), "IsIPV6Enabled" (portkey.aws/getback-xml-elem-with-tag "IsIPV6Enabled" input), "Restrictions" (portkey.aws/getback-xml-elem-with-tag "Restrictions" input), "Comment" (portkey.aws/getback-xml-elem-with-tag "Comment" input), "WebACLId" (portkey.aws/getback-xml-elem-with-tag "WebACLId" input), "Logging" (portkey.aws/getback-xml-elem-with-tag "Logging" input), "CacheBehaviors" (portkey.aws/getback-xml-elem-with-tag "CacheBehaviors" input), "CustomErrorResponses" (portkey.aws/getback-xml-elem-with-tag "CustomErrorResponses" input), "Enabled" (portkey.aws/getback-xml-elem-with-tag "Enabled" input), "Aliases" (portkey.aws/getback-xml-elem-with-tag "Aliases" input), "PriceClass" (portkey.aws/getback-xml-elem-with-tag "PriceClass" input), "Origins" (portkey.aws/getback-xml-elem-with-tag "Origins" input), "HttpVersion" (portkey.aws/getback-xml-elem-with-tag "HttpVersion" input), "DefaultCacheBehavior" (portkey.aws/getback-xml-elem-with-tag "DefaultCacheBehavior" input), "ViewerCertificate" (portkey.aws/getback-xml-elem-with-tag "ViewerCertificate" input)}] (clojure.core/cond-> {:caller-reference (deserstring (clojure.core/get-in letvar1171323 ["CallerReference" :content])), :origins (deser-origins (clojure.core/get-in letvar1171323 ["Origins" :content])), :default-cache-behavior (deser-default-cache-behavior (clojure.core/get-in letvar1171323 ["DefaultCacheBehavior" :content])), :comment (deserstring (clojure.core/get-in letvar1171323 ["Comment" :content])), :enabled (deserboolean (clojure.core/get-in letvar1171323 ["Enabled" :content]))} (letvar1171323 "DefaultRootObject") (clojure.core/assoc :default-root-object (deserstring (clojure.core/get-in letvar1171323 ["DefaultRootObject" :content]))) (letvar1171323 "IsIPV6Enabled") (clojure.core/assoc :is-ipv-6-enabled (deserboolean (clojure.core/get-in letvar1171323 ["IsIPV6Enabled" :content]))) (letvar1171323 "Restrictions") (clojure.core/assoc :restrictions (deser-restrictions (clojure.core/get-in letvar1171323 ["Restrictions" :content]))) (letvar1171323 "WebACLId") (clojure.core/assoc :web-acl-id (deserstring (clojure.core/get-in letvar1171323 ["WebACLId" :content]))) (letvar1171323 "Logging") (clojure.core/assoc :logging (deser-logging-config (clojure.core/get-in letvar1171323 ["Logging" :content]))) (letvar1171323 "CacheBehaviors") (clojure.core/assoc :cache-behaviors (deser-cache-behaviors (clojure.core/get-in letvar1171323 ["CacheBehaviors" :content]))) (letvar1171323 "CustomErrorResponses") (clojure.core/assoc :custom-error-responses (deser-custom-error-responses (clojure.core/get-in letvar1171323 ["CustomErrorResponses" :content]))) (letvar1171323 "Aliases") (clojure.core/assoc :aliases (deser-aliases (clojure.core/get-in letvar1171323 ["Aliases" :content]))) (letvar1171323 "PriceClass") (clojure.core/assoc :price-class (deser-price-class (clojure.core/get-in letvar1171323 ["PriceClass" :content]))) (letvar1171323 "HttpVersion") (clojure.core/assoc :http-version (deser-http-version (clojure.core/get-in letvar1171323 ["HttpVersion" :content]))) (letvar1171323 "ViewerCertificate") (clojure.core/assoc :viewer-certificate (deser-viewer-certificate (clojure.core/get-in letvar1171323 ["ViewerCertificate" :content]))))))

(clojure.core/defn- deser-public-key-summary [input] (clojure.core/let [letvar1171407 {"Id" (portkey.aws/getback-xml-elem-with-tag "Id" input), "Name" (portkey.aws/getback-xml-elem-with-tag "Name" input), "CreatedTime" (portkey.aws/getback-xml-elem-with-tag "CreatedTime" input), "EncodedKey" (portkey.aws/getback-xml-elem-with-tag "EncodedKey" input), "Comment" (portkey.aws/getback-xml-elem-with-tag "Comment" input)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar1171407 ["Id" :content])), :name (deserstring (clojure.core/get-in letvar1171407 ["Name" :content])), :created-time (desertimestamp (clojure.core/get-in letvar1171407 ["CreatedTime" :content])), :encoded-key (deserstring (clojure.core/get-in letvar1171407 ["EncodedKey" :content]))} (letvar1171407 "Comment") (clojure.core/assoc :comment (deserstring (clojure.core/get-in letvar1171407 ["Comment" :content]))))))

(clojure.core/defn- deser-ssl-protocols-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-ssl-protocol coll))) input))

(clojure.core/defn- deser-aws-account-number-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-tag-value [input] (clojure.core/first input))

(clojure.core/defn- deser-method [input] (clojure.core/get {"GET" :get, "HEAD" :head, "POST" :post, "PUT" :put, "PATCH" :patch, "OPTIONS" :options, "DELETE" :delete} (clojure.core/first input)))

(clojure.core/defn- deser-alias-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-origin-custom-headers-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-origin-custom-header coll))) input))

(clojure.core/defn- deser-query-arg-profile-config [input] (clojure.core/let [letvar1171569 {"ForwardWhenQueryArgProfileIsUnknown" (portkey.aws/getback-xml-elem-with-tag "ForwardWhenQueryArgProfileIsUnknown" input), "QueryArgProfiles" (portkey.aws/getback-xml-elem-with-tag "QueryArgProfiles" input)}] (clojure.core/cond-> {:forward-when-query-arg-profile-is-unknown (deserboolean (clojure.core/get-in letvar1171569 ["ForwardWhenQueryArgProfileIsUnknown" :content]))} (letvar1171569 "QueryArgProfiles") (clojure.core/assoc :query-arg-profiles (deser-query-arg-profiles (clojure.core/get-in letvar1171569 ["QueryArgProfiles" :content]))))))

(clojure.core/defn- deser-origin-protocol-policy [input] (clojure.core/get {"http-only" :httponly, "match-viewer" :matchviewer, "https-only" :httpsonly} (clojure.core/first input)))

(clojure.core/defn- deser-signer-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-signer coll))) input))

(clojure.core/defn- deser-query-arg-profiles [input] (clojure.core/let [letvar1171675 {"Quantity" (portkey.aws/getback-xml-elem-with-tag "Quantity" input), "Items" (portkey.aws/getback-xml-elem-with-tag "Items" input)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar1171675 ["Quantity" :content]))} (letvar1171675 "Items") (clojure.core/assoc :items (deser-query-arg-profile-list (clojure.core/get-in letvar1171675 ["Items" :content]))))))

(clojure.core/defn- deser-path-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-geo-restriction-type [input] (clojure.core/get {"blacklist" :blacklist, "whitelist" :whitelist, "none" :none} (clojure.core/first input)))

(clojure.core/defn- deser-paths [input] (clojure.core/let [letvar1171781 {"Quantity" (portkey.aws/getback-xml-elem-with-tag "Quantity" input), "Items" (portkey.aws/getback-xml-elem-with-tag "Items" input)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar1171781 ["Quantity" :content]))} (letvar1171781 "Items") (clojure.core/assoc :items (deser-path-list (clojure.core/get-in letvar1171781 ["Items" :content]))))))

(clojure.core/defn- deser-field-level-encryption-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-field-level-encryption-summary coll))) input))

(clojure.core/defn- deserinteger [input] (java.lang.Integer. (clojure.core/first input)))

(clojure.core/defn- deser-cloud-front-origin-access-identity-summary [input] (clojure.core/let [letvar1171884 {"Id" (portkey.aws/getback-xml-elem-with-tag "Id" input), "S3CanonicalUserId" (portkey.aws/getback-xml-elem-with-tag "S3CanonicalUserId" input), "Comment" (portkey.aws/getback-xml-elem-with-tag "Comment" input)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar1171884 ["Id" :content])), :s-3-canonical-user-id (deserstring (clojure.core/get-in letvar1171884 ["S3CanonicalUserId" :content])), :comment (deserstring (clojure.core/get-in letvar1171884 ["Comment" :content]))})))

(clojure.core/defn- deser-cache-behavior-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-cache-behavior coll))) input))

(clojure.core/defn- deser-origin-custom-header [input] (clojure.core/let [letvar1171985 {"HeaderName" (portkey.aws/getback-xml-elem-with-tag "HeaderName" input), "HeaderValue" (portkey.aws/getback-xml-elem-with-tag "HeaderValue" input)}] (clojure.core/cond-> {:header-name (deserstring (clojure.core/get-in letvar1171985 ["HeaderName" :content])), :header-value (deserstring (clojure.core/get-in letvar1171985 ["HeaderValue" :content]))})))

(clojure.core/defn- deser-streaming-distribution-config [input] (clojure.core/let [letvar1172069 {"CallerReference" (portkey.aws/getback-xml-elem-with-tag "CallerReference" input), "S3Origin" (portkey.aws/getback-xml-elem-with-tag "S3Origin" input), "Aliases" (portkey.aws/getback-xml-elem-with-tag "Aliases" input), "Comment" (portkey.aws/getback-xml-elem-with-tag "Comment" input), "Logging" (portkey.aws/getback-xml-elem-with-tag "Logging" input), "TrustedSigners" (portkey.aws/getback-xml-elem-with-tag "TrustedSigners" input), "PriceClass" (portkey.aws/getback-xml-elem-with-tag "PriceClass" input), "Enabled" (portkey.aws/getback-xml-elem-with-tag "Enabled" input)}] (clojure.core/cond-> {:caller-reference (deserstring (clojure.core/get-in letvar1172069 ["CallerReference" :content])), :s-3-origin (deser-s-3-origin (clojure.core/get-in letvar1172069 ["S3Origin" :content])), :comment (deserstring (clojure.core/get-in letvar1172069 ["Comment" :content])), :trusted-signers (deser-trusted-signers (clojure.core/get-in letvar1172069 ["TrustedSigners" :content])), :enabled (deserboolean (clojure.core/get-in letvar1172069 ["Enabled" :content]))} (letvar1172069 "Aliases") (clojure.core/assoc :aliases (deser-aliases (clojure.core/get-in letvar1172069 ["Aliases" :content]))) (letvar1172069 "Logging") (clojure.core/assoc :logging (deser-streaming-logging-config (clojure.core/get-in letvar1172069 ["Logging" :content]))) (letvar1172069 "PriceClass") (clojure.core/assoc :price-class (deser-price-class (clojure.core/get-in letvar1172069 ["PriceClass" :content]))))))

(clojure.core/defn- deser-public-key-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-public-key-summary coll))) input))

(clojure.core/defn- deser-field-pattern-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-s-3-origin-config [input] (clojure.core/let [letvar1172187 {"OriginAccessIdentity" (portkey.aws/getback-xml-elem-with-tag "OriginAccessIdentity" input)}] (clojure.core/cond-> {:origin-access-identity (deserstring (clojure.core/get-in letvar1172187 ["OriginAccessIdentity" :content]))})))

(clojure.core/defn- deser-cloud-front-origin-access-identity-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-cloud-front-origin-access-identity-summary coll))) input))

(clojure.core/defn- deser-tag [input] (clojure.core/let [letvar1172288 {"Key" (portkey.aws/getback-xml-elem-with-tag "Key" input), "Value" (portkey.aws/getback-xml-elem-with-tag "Value" input)}] (clojure.core/cond-> {:key (deser-tag-key (clojure.core/get-in letvar1172288 ["Key" :content]))} (letvar1172288 "Value") (clojure.core/assoc :value (deser-tag-value (clojure.core/get-in letvar1172288 ["Value" :content]))))))

(clojure.core/defn- deser-streaming-logging-config [input] (clojure.core/let [letvar1172372 {"Enabled" (portkey.aws/getback-xml-elem-with-tag "Enabled" input), "Bucket" (portkey.aws/getback-xml-elem-with-tag "Bucket" input), "Prefix" (portkey.aws/getback-xml-elem-with-tag "Prefix" input)}] (clojure.core/cond-> {:enabled (deserboolean (clojure.core/get-in letvar1172372 ["Enabled" :content])), :bucket (deserstring (clojure.core/get-in letvar1172372 ["Bucket" :content])), :prefix (deserstring (clojure.core/get-in letvar1172372 ["Prefix" :content]))})))

(clojure.core/defn- deser-field-level-encryption-summary [input] (clojure.core/let [letvar1172456 {"Id" (portkey.aws/getback-xml-elem-with-tag "Id" input), "LastModifiedTime" (portkey.aws/getback-xml-elem-with-tag "LastModifiedTime" input), "Comment" (portkey.aws/getback-xml-elem-with-tag "Comment" input), "QueryArgProfileConfig" (portkey.aws/getback-xml-elem-with-tag "QueryArgProfileConfig" input), "ContentTypeProfileConfig" (portkey.aws/getback-xml-elem-with-tag "ContentTypeProfileConfig" input)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar1172456 ["Id" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar1172456 ["LastModifiedTime" :content]))} (letvar1172456 "Comment") (clojure.core/assoc :comment (deserstring (clojure.core/get-in letvar1172456 ["Comment" :content]))) (letvar1172456 "QueryArgProfileConfig") (clojure.core/assoc :query-arg-profile-config (deser-query-arg-profile-config (clojure.core/get-in letvar1172456 ["QueryArgProfileConfig" :content]))) (letvar1172456 "ContentTypeProfileConfig") (clojure.core/assoc :content-type-profile-config (deser-content-type-profile-config (clojure.core/get-in letvar1172456 ["ContentTypeProfileConfig" :content]))))))

(clojure.core/defn- deser-distribution-summary [input] (clojure.core/let [letvar1172540 {"IsIPV6Enabled" (portkey.aws/getback-xml-elem-with-tag "IsIPV6Enabled" input), "Restrictions" (portkey.aws/getback-xml-elem-with-tag "Restrictions" input), "Comment" (portkey.aws/getback-xml-elem-with-tag "Comment" input), "WebACLId" (portkey.aws/getback-xml-elem-with-tag "WebACLId" input), "ARN" (portkey.aws/getback-xml-elem-with-tag "ARN" input), "CacheBehaviors" (portkey.aws/getback-xml-elem-with-tag "CacheBehaviors" input), "CustomErrorResponses" (portkey.aws/getback-xml-elem-with-tag "CustomErrorResponses" input), "Enabled" (portkey.aws/getback-xml-elem-with-tag "Enabled" input), "Status" (portkey.aws/getback-xml-elem-with-tag "Status" input), "Aliases" (portkey.aws/getback-xml-elem-with-tag "Aliases" input), "PriceClass" (portkey.aws/getback-xml-elem-with-tag "PriceClass" input), "LastModifiedTime" (portkey.aws/getback-xml-elem-with-tag "LastModifiedTime" input), "DomainName" (portkey.aws/getback-xml-elem-with-tag "DomainName" input), "Origins" (portkey.aws/getback-xml-elem-with-tag "Origins" input), "HttpVersion" (portkey.aws/getback-xml-elem-with-tag "HttpVersion" input), "Id" (portkey.aws/getback-xml-elem-with-tag "Id" input), "DefaultCacheBehavior" (portkey.aws/getback-xml-elem-with-tag "DefaultCacheBehavior" input), "ViewerCertificate" (portkey.aws/getback-xml-elem-with-tag "ViewerCertificate" input)}] (clojure.core/cond-> {:origins (deser-origins (clojure.core/get-in letvar1172540 ["Origins" :content])), :restrictions (deser-restrictions (clojure.core/get-in letvar1172540 ["Restrictions" :content])), :web-acl-id (deserstring (clojure.core/get-in letvar1172540 ["WebACLId" :content])), :is-ipv-6-enabled (deserboolean (clojure.core/get-in letvar1172540 ["IsIPV6Enabled" :content])), :cache-behaviors (deser-cache-behaviors (clojure.core/get-in letvar1172540 ["CacheBehaviors" :content])), :default-cache-behavior (deser-default-cache-behavior (clojure.core/get-in letvar1172540 ["DefaultCacheBehavior" :content])), :viewer-certificate (deser-viewer-certificate (clojure.core/get-in letvar1172540 ["ViewerCertificate" :content])), :http-version (deser-http-version (clojure.core/get-in letvar1172540 ["HttpVersion" :content])), :domain-name (deserstring (clojure.core/get-in letvar1172540 ["DomainName" :content])), :status (deserstring (clojure.core/get-in letvar1172540 ["Status" :content])), :id (deserstring (clojure.core/get-in letvar1172540 ["Id" :content])), :comment (deserstring (clojure.core/get-in letvar1172540 ["Comment" :content])), :aliases (deser-aliases (clojure.core/get-in letvar1172540 ["Aliases" :content])), :custom-error-responses (deser-custom-error-responses (clojure.core/get-in letvar1172540 ["CustomErrorResponses" :content])), :enabled (deserboolean (clojure.core/get-in letvar1172540 ["Enabled" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar1172540 ["LastModifiedTime" :content])), :arn (deserstring (clojure.core/get-in letvar1172540 ["ARN" :content])), :price-class (deser-price-class (clojure.core/get-in letvar1172540 ["PriceClass" :content]))})))

(clojure.core/defn- deser-ssl-protocol [input] (clojure.core/get {"SSLv3" :ss-lv-3, "TLSv1" :tl-sv-1, "TLSv1.1" :tl-sv-11, "TLSv1.2" :tl-sv-12} (clojure.core/first input)))

(clojure.core/defn- deser-lambda-function-association-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-lambda-function-association coll))) input))

(clojure.core/defn- deser-headers [input] (clojure.core/let [letvar1172646 {"Quantity" (portkey.aws/getback-xml-elem-with-tag "Quantity" input), "Items" (portkey.aws/getback-xml-elem-with-tag "Items" input)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar1172646 ["Quantity" :content]))} (letvar1172646 "Items") (clojure.core/assoc :items (deser-header-list (clojure.core/get-in letvar1172646 ["Items" :content]))))))

(clojure.core/defn- deser-minimum-protocol-version [input] (clojure.core/get {"SSLv3" :ss-lv-3, "TLSv1" :tl-sv-1, "TLSv1_2016" :tl-sv-1-2016, "TLSv1.1_2016" :tl-sv-11-2016, "TLSv1.2_2018" :tl-sv-12-2018} (clojure.core/first input)))

(clojure.core/defn- deser-origins [input] (clojure.core/let [letvar1172735 {"Quantity" (portkey.aws/getback-xml-elem-with-tag "Quantity" input), "Items" (portkey.aws/getback-xml-elem-with-tag "Items" input)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar1172735 ["Quantity" :content]))} (letvar1172735 "Items") (clojure.core/assoc :items (deser-origin-list (clojure.core/get-in letvar1172735 ["Items" :content]))))))

(clojure.core/defn- deser-header-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-distribution-list [input] (clojure.core/let [letvar1172836 {"Marker" (portkey.aws/getback-xml-elem-with-tag "Marker" input), "NextMarker" (portkey.aws/getback-xml-elem-with-tag "NextMarker" input), "MaxItems" (portkey.aws/getback-xml-elem-with-tag "MaxItems" input), "IsTruncated" (portkey.aws/getback-xml-elem-with-tag "IsTruncated" input), "Quantity" (portkey.aws/getback-xml-elem-with-tag "Quantity" input), "Items" (portkey.aws/getback-xml-elem-with-tag "Items" input)}] (clojure.core/cond-> {:marker (deserstring (clojure.core/get-in letvar1172836 ["Marker" :content])), :max-items (deserinteger (clojure.core/get-in letvar1172836 ["MaxItems" :content])), :is-truncated (deserboolean (clojure.core/get-in letvar1172836 ["IsTruncated" :content])), :quantity (deserinteger (clojure.core/get-in letvar1172836 ["Quantity" :content]))} (letvar1172836 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar1172836 ["NextMarker" :content]))) (letvar1172836 "Items") (clojure.core/assoc :items (deser-distribution-summary-list (clojure.core/get-in letvar1172836 ["Items" :content]))))))

(clojure.core/defn- deser-ssl-support-method [input] (clojure.core/get {"sni-only" :snionly, "vip" :vip} (clojure.core/first input)))

(clojure.core/defn- deser-http-version [input] (clojure.core/get {"http1.1" :http-11, "http2" :http-2} (clojure.core/first input)))

(clojure.core/defn- deser-cookie-preference [input] (clojure.core/let [letvar1172930 {"Forward" (portkey.aws/getback-xml-elem-with-tag "Forward" input), "WhitelistedNames" (portkey.aws/getback-xml-elem-with-tag "WhitelistedNames" input)}] (clojure.core/cond-> {:forward (deser-item-selection (clojure.core/get-in letvar1172930 ["Forward" :content]))} (letvar1172930 "WhitelistedNames") (clojure.core/assoc :whitelisted-names (deser-cookie-names (clojure.core/get-in letvar1172930 ["WhitelistedNames" :content]))))))

(clojure.core/defn- deser-custom-headers [input] (clojure.core/let [letvar1173014 {"Quantity" (portkey.aws/getback-xml-elem-with-tag "Quantity" input), "Items" (portkey.aws/getback-xml-elem-with-tag "Items" input)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar1173014 ["Quantity" :content]))} (letvar1173014 "Items") (clojure.core/assoc :items (deser-origin-custom-headers-list (clojure.core/get-in letvar1173014 ["Items" :content]))))))

(clojure.core/defn- deser-methods-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-method coll))) input))

(clojure.core/defn- deser-public-key-list [input] (clojure.core/let [letvar1173115 {"NextMarker" (portkey.aws/getback-xml-elem-with-tag "NextMarker" input), "MaxItems" (portkey.aws/getback-xml-elem-with-tag "MaxItems" input), "Quantity" (portkey.aws/getback-xml-elem-with-tag "Quantity" input), "Items" (portkey.aws/getback-xml-elem-with-tag "Items" input)}] (clojure.core/cond-> {:max-items (deserinteger (clojure.core/get-in letvar1173115 ["MaxItems" :content])), :quantity (deserinteger (clojure.core/get-in letvar1173115 ["Quantity" :content]))} (letvar1173115 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar1173115 ["NextMarker" :content]))) (letvar1173115 "Items") (clojure.core/assoc :items (deser-public-key-summary-list (clojure.core/get-in letvar1173115 ["Items" :content]))))))

(clojure.core/defn- deser-default-cache-behavior [input] (clojure.core/let [letvar1173199 {"SmoothStreaming" (portkey.aws/getback-xml-elem-with-tag "SmoothStreaming" input), "FieldLevelEncryptionId" (portkey.aws/getback-xml-elem-with-tag "FieldLevelEncryptionId" input), "Compress" (portkey.aws/getback-xml-elem-with-tag "Compress" input), "ForwardedValues" (portkey.aws/getback-xml-elem-with-tag "ForwardedValues" input), "TargetOriginId" (portkey.aws/getback-xml-elem-with-tag "TargetOriginId" input), "LambdaFunctionAssociations" (portkey.aws/getback-xml-elem-with-tag "LambdaFunctionAssociations" input), "ViewerProtocolPolicy" (portkey.aws/getback-xml-elem-with-tag "ViewerProtocolPolicy" input), "MinTTL" (portkey.aws/getback-xml-elem-with-tag "MinTTL" input), "MaxTTL" (portkey.aws/getback-xml-elem-with-tag "MaxTTL" input), "AllowedMethods" (portkey.aws/getback-xml-elem-with-tag "AllowedMethods" input), "DefaultTTL" (portkey.aws/getback-xml-elem-with-tag "DefaultTTL" input), "TrustedSigners" (portkey.aws/getback-xml-elem-with-tag "TrustedSigners" input)}] (clojure.core/cond-> {:target-origin-id (deserstring (clojure.core/get-in letvar1173199 ["TargetOriginId" :content])), :forwarded-values (deser-forwarded-values (clojure.core/get-in letvar1173199 ["ForwardedValues" :content])), :trusted-signers (deser-trusted-signers (clojure.core/get-in letvar1173199 ["TrustedSigners" :content])), :viewer-protocol-policy (deser-viewer-protocol-policy (clojure.core/get-in letvar1173199 ["ViewerProtocolPolicy" :content])), :min-ttl (deserlong (clojure.core/get-in letvar1173199 ["MinTTL" :content]))} (letvar1173199 "SmoothStreaming") (clojure.core/assoc :smooth-streaming (deserboolean (clojure.core/get-in letvar1173199 ["SmoothStreaming" :content]))) (letvar1173199 "FieldLevelEncryptionId") (clojure.core/assoc :field-level-encryption-id (deserstring (clojure.core/get-in letvar1173199 ["FieldLevelEncryptionId" :content]))) (letvar1173199 "Compress") (clojure.core/assoc :compress (deserboolean (clojure.core/get-in letvar1173199 ["Compress" :content]))) (letvar1173199 "LambdaFunctionAssociations") (clojure.core/assoc :lambda-function-associations (deser-lambda-function-associations (clojure.core/get-in letvar1173199 ["LambdaFunctionAssociations" :content]))) (letvar1173199 "MaxTTL") (clojure.core/assoc :max-ttl (deserlong (clojure.core/get-in letvar1173199 ["MaxTTL" :content]))) (letvar1173199 "AllowedMethods") (clojure.core/assoc :allowed-methods (deser-allowed-methods (clojure.core/get-in letvar1173199 ["AllowedMethods" :content]))) (letvar1173199 "DefaultTTL") (clojure.core/assoc :default-ttl (deserlong (clojure.core/get-in letvar1173199 ["DefaultTTL" :content]))))))

(clojure.core/defn- deser-trusted-signers [input] (clojure.core/let [letvar1173283 {"Enabled" (portkey.aws/getback-xml-elem-with-tag "Enabled" input), "Quantity" (portkey.aws/getback-xml-elem-with-tag "Quantity" input), "Items" (portkey.aws/getback-xml-elem-with-tag "Items" input)}] (clojure.core/cond-> {:enabled (deserboolean (clojure.core/get-in letvar1173283 ["Enabled" :content])), :quantity (deserinteger (clojure.core/get-in letvar1173283 ["Quantity" :content]))} (letvar1173283 "Items") (clojure.core/assoc :items (deser-aws-account-number-list (clojure.core/get-in letvar1173283 ["Items" :content]))))))

(clojure.core/defn- deser-field-level-encryption-list [input] (clojure.core/let [letvar1173367 {"NextMarker" (portkey.aws/getback-xml-elem-with-tag "NextMarker" input), "MaxItems" (portkey.aws/getback-xml-elem-with-tag "MaxItems" input), "Quantity" (portkey.aws/getback-xml-elem-with-tag "Quantity" input), "Items" (portkey.aws/getback-xml-elem-with-tag "Items" input)}] (clojure.core/cond-> {:max-items (deserinteger (clojure.core/get-in letvar1173367 ["MaxItems" :content])), :quantity (deserinteger (clojure.core/get-in letvar1173367 ["Quantity" :content]))} (letvar1173367 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar1173367 ["NextMarker" :content]))) (letvar1173367 "Items") (clojure.core/assoc :items (deser-field-level-encryption-summary-list (clojure.core/get-in letvar1173367 ["Items" :content]))))))

(clojure.core/defn- deser-public-key [input] (clojure.core/let [letvar1173451 {"Id" (portkey.aws/getback-xml-elem-with-tag "Id" input), "CreatedTime" (portkey.aws/getback-xml-elem-with-tag "CreatedTime" input), "PublicKeyConfig" (portkey.aws/getback-xml-elem-with-tag "PublicKeyConfig" input)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar1173451 ["Id" :content])), :created-time (desertimestamp (clojure.core/get-in letvar1173451 ["CreatedTime" :content])), :public-key-config (deser-public-key-config (clojure.core/get-in letvar1173451 ["PublicKeyConfig" :content]))})))

(clojure.core/defn- deser-field-level-encryption-profile-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-field-level-encryption-profile-summary coll))) input))

(clojure.core/defn- deser-viewer-certificate [input] (clojure.core/let [letvar1173552 {"CloudFrontDefaultCertificate" (portkey.aws/getback-xml-elem-with-tag "CloudFrontDefaultCertificate" input), "IAMCertificateId" (portkey.aws/getback-xml-elem-with-tag "IAMCertificateId" input), "ACMCertificateArn" (portkey.aws/getback-xml-elem-with-tag "ACMCertificateArn" input), "SSLSupportMethod" (portkey.aws/getback-xml-elem-with-tag "SSLSupportMethod" input), "MinimumProtocolVersion" (portkey.aws/getback-xml-elem-with-tag "MinimumProtocolVersion" input), "Certificate" (portkey.aws/getback-xml-elem-with-tag "Certificate" input), "CertificateSource" (portkey.aws/getback-xml-elem-with-tag "CertificateSource" input)}] (clojure.core/cond-> {} (letvar1173552 "CloudFrontDefaultCertificate") (clojure.core/assoc :cloud-front-default-certificate (deserboolean (clojure.core/get-in letvar1173552 ["CloudFrontDefaultCertificate" :content]))) (letvar1173552 "IAMCertificateId") (clojure.core/assoc :iam-certificate-id (deserstring (clojure.core/get-in letvar1173552 ["IAMCertificateId" :content]))) (letvar1173552 "ACMCertificateArn") (clojure.core/assoc :acm-certificate-arn (deserstring (clojure.core/get-in letvar1173552 ["ACMCertificateArn" :content]))) (letvar1173552 "SSLSupportMethod") (clojure.core/assoc :ssl-support-method (deser-ssl-support-method (clojure.core/get-in letvar1173552 ["SSLSupportMethod" :content]))) (letvar1173552 "MinimumProtocolVersion") (clojure.core/assoc :minimum-protocol-version (deser-minimum-protocol-version (clojure.core/get-in letvar1173552 ["MinimumProtocolVersion" :content]))) (letvar1173552 "Certificate") (clojure.core/assoc :certificate (deserstring (clojure.core/get-in letvar1173552 ["Certificate" :content]))) (letvar1173552 "CertificateSource") (clojure.core/assoc :certificate-source (deser-certificate-source (clojure.core/get-in letvar1173552 ["CertificateSource" :content]))))))

(clojure.core/defn- deser-cloud-front-origin-access-identity-config [input] (clojure.core/let [letvar1173636 {"CallerReference" (portkey.aws/getback-xml-elem-with-tag "CallerReference" input), "Comment" (portkey.aws/getback-xml-elem-with-tag "Comment" input)}] (clojure.core/cond-> {:caller-reference (deserstring (clojure.core/get-in letvar1173636 ["CallerReference" :content])), :comment (deserstring (clojure.core/get-in letvar1173636 ["Comment" :content]))})))

(clojure.core/defn- deser-geo-restriction [input] (clojure.core/let [letvar1173720 {"RestrictionType" (portkey.aws/getback-xml-elem-with-tag "RestrictionType" input), "Quantity" (portkey.aws/getback-xml-elem-with-tag "Quantity" input), "Items" (portkey.aws/getback-xml-elem-with-tag "Items" input)}] (clojure.core/cond-> {:restriction-type (deser-geo-restriction-type (clojure.core/get-in letvar1173720 ["RestrictionType" :content])), :quantity (deserinteger (clojure.core/get-in letvar1173720 ["Quantity" :content]))} (letvar1173720 "Items") (clojure.core/assoc :items (deser-location-list (clojure.core/get-in letvar1173720 ["Items" :content]))))))

(clojure.core/defn- deser-list-tags-for-resource-result [input] (clojure.core/let [letvar1173804 {"Tags" (portkey.aws/getback-xml-elem-with-tag "Tags" input)}] (clojure.core/cond-> {:tags (deser-tags (clojure.core/get-in letvar1173804 ["Tags" :content]))})))

(clojure.core/defn- deser-too-many-distributions-with-lambda-associations [input] (clojure.core/let [letvar1173888 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1173888 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1173888 ["Message" :content]))))))

(clojure.core/defn- deser-no-such-origin [input] (clojure.core/let [letvar1173972 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1173972 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1173972 ["Message" :content]))))))

(clojure.core/defn- deser-invalid-protocol-settings [input] (clojure.core/let [letvar1174056 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1174056 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1174056 ["Message" :content]))))))

(clojure.core/defn- deser-too-many-cookie-names-in-white-list [input] (clojure.core/let [letvar1174140 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1174140 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1174140 ["Message" :content]))))))

(clojure.core/defn- deser-too-many-cache-behaviors [input] (clojure.core/let [letvar1174224 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1174224 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1174224 ["Message" :content]))))))

(clojure.core/defn- deser-too-many-origin-custom-headers [input] (clojure.core/let [letvar1174308 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1174308 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1174308 ["Message" :content]))))))

(clojure.core/defn- deser-create-field-level-encryption-config-result [input] (clojure.core/let [letvar1174392 {"FieldLevelEncryption" (portkey.aws/getback-xml-elem-with-tag "FieldLevelEncryption" input), "Location" (portkey.aws/getback-xml-elem-with-tag "Location" input), "ETag" (portkey.aws/getback-xml-elem-with-tag "ETag" input)}] (clojure.core/cond-> {} (letvar1174392 "FieldLevelEncryption") (clojure.core/assoc :field-level-encryption (deser-field-level-encryption (clojure.core/get-in letvar1174392 ["FieldLevelEncryption" :content]))) (letvar1174392 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar1174392 ["Location" :content]))) (letvar1174392 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar1174392 ["ETag" :content]))))))

(clojure.core/defn- deser-too-many-streaming-distributions [input] (clojure.core/let [letvar1174476 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1174476 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1174476 ["Message" :content]))))))

(clojure.core/defn- deser-get-streaming-distribution-result [input] (clojure.core/let [letvar1174560 {"StreamingDistribution" (portkey.aws/getback-xml-elem-with-tag "StreamingDistribution" input), "ETag" (portkey.aws/getback-xml-elem-with-tag "ETag" input)}] (clojure.core/cond-> {} (letvar1174560 "StreamingDistribution") (clojure.core/assoc :streaming-distribution (deser-streaming-distribution (clojure.core/get-in letvar1174560 ["StreamingDistribution" :content]))) (letvar1174560 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar1174560 ["ETag" :content]))))))

(clojure.core/defn- deser-too-many-streaming-distribution-cnam-es [input] (clojure.core/let [letvar1174644 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1174644 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1174644 ["Message" :content]))))))

(clojure.core/defn- deser-field-level-encryption-profile-already-exists [input] (clojure.core/let [letvar1174728 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1174728 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1174728 ["Message" :content]))))))

(clojure.core/defn- deser-invalid-viewer-certificate [input] (clojure.core/let [letvar1174812 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1174812 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1174812 ["Message" :content]))))))

(clojure.core/defn- deser-get-public-key-config-result [input] (clojure.core/let [letvar1174896 {"PublicKeyConfig" (portkey.aws/getback-xml-elem-with-tag "PublicKeyConfig" input), "ETag" (portkey.aws/getback-xml-elem-with-tag "ETag" input)}] (clojure.core/cond-> {} (letvar1174896 "PublicKeyConfig") (clojure.core/assoc :public-key-config (deser-public-key-config (clojure.core/get-in letvar1174896 ["PublicKeyConfig" :content]))) (letvar1174896 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar1174896 ["ETag" :content]))))))

(clojure.core/defn- deser-invalid-argument [input] (clojure.core/let [letvar1174980 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1174980 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1174980 ["Message" :content]))))))

(clojure.core/defn- deser-no-such-public-key [input] (clojure.core/let [letvar1175064 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1175064 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1175064 ["Message" :content]))))))

(clojure.core/defn- deser-streaming-distribution-not-disabled [input] (clojure.core/let [letvar1175148 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1175148 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1175148 ["Message" :content]))))))

(clojure.core/defn- deser-illegal-field-level-encryption-config-association-with-cache-behavior [input] (clojure.core/let [letvar1175232 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1175232 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1175232 ["Message" :content]))))))

(clojure.core/defn- deser-too-many-certificates [input] (clojure.core/let [letvar1175316 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1175316 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1175316 ["Message" :content]))))))

(clojure.core/defn- deser-access-denied [input] (clojure.core/let [letvar1175400 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1175400 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1175400 ["Message" :content]))))))

(clojure.core/defn- deser-cloud-front-origin-access-identity-in-use [input] (clojure.core/let [letvar1175484 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1175484 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1175484 ["Message" :content]))))))

(clojure.core/defn- deser-cannot-change-immutable-public-key-fields [input] (clojure.core/let [letvar1175568 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1175568 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1175568 ["Message" :content]))))))

(clojure.core/defn- deser-field-level-encryption-profile-size-exceeded [input] (clojure.core/let [letvar1175652 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1175652 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1175652 ["Message" :content]))))))

(clojure.core/defn- deser-invalid-lambda-function-association [input] (clojure.core/let [letvar1175736 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1175736 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1175736 ["Message" :content]))))))

(clojure.core/defn- deser-create-field-level-encryption-profile-result [input] (clojure.core/let [letvar1175820 {"FieldLevelEncryptionProfile" (portkey.aws/getback-xml-elem-with-tag "FieldLevelEncryptionProfile" input), "Location" (portkey.aws/getback-xml-elem-with-tag "Location" input), "ETag" (portkey.aws/getback-xml-elem-with-tag "ETag" input)}] (clojure.core/cond-> {} (letvar1175820 "FieldLevelEncryptionProfile") (clojure.core/assoc :field-level-encryption-profile (deser-field-level-encryption-profile (clojure.core/get-in letvar1175820 ["FieldLevelEncryptionProfile" :content]))) (letvar1175820 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar1175820 ["Location" :content]))) (letvar1175820 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar1175820 ["ETag" :content]))))))

(clojure.core/defn- deser-get-field-level-encryption-profile-result [input] (clojure.core/let [letvar1175904 {"FieldLevelEncryptionProfile" (portkey.aws/getback-xml-elem-with-tag "FieldLevelEncryptionProfile" input), "ETag" (portkey.aws/getback-xml-elem-with-tag "ETag" input)}] (clojure.core/cond-> {} (letvar1175904 "FieldLevelEncryptionProfile") (clojure.core/assoc :field-level-encryption-profile (deser-field-level-encryption-profile (clojure.core/get-in letvar1175904 ["FieldLevelEncryptionProfile" :content]))) (letvar1175904 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar1175904 ["ETag" :content]))))))

(clojure.core/defn- deser-no-such-resource [input] (clojure.core/let [letvar1175988 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1175988 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1175988 ["Message" :content]))))))

(clojure.core/defn- deser-update-cloud-front-origin-access-identity-result [input] (clojure.core/let [letvar1176072 {"CloudFrontOriginAccessIdentity" (portkey.aws/getback-xml-elem-with-tag "CloudFrontOriginAccessIdentity" input), "ETag" (portkey.aws/getback-xml-elem-with-tag "ETag" input)}] (clojure.core/cond-> {} (letvar1176072 "CloudFrontOriginAccessIdentity") (clojure.core/assoc :cloud-front-origin-access-identity (deser-cloud-front-origin-access-identity (clojure.core/get-in letvar1176072 ["CloudFrontOriginAccessIdentity" :content]))) (letvar1176072 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar1176072 ["ETag" :content]))))))

(clojure.core/defn- deser-invalid-error-code [input] (clojure.core/let [letvar1176156 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1176156 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1176156 ["Message" :content]))))))

(clojure.core/defn- deser-field-level-encryption-profile-in-use [input] (clojure.core/let [letvar1176240 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1176240 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1176240 ["Message" :content]))))))

(clojure.core/defn- deser-too-many-lambda-function-associations [input] (clojure.core/let [letvar1176324 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1176324 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1176324 ["Message" :content]))))))

(clojure.core/defn- deser-create-streaming-distribution-result [input] (clojure.core/let [letvar1176408 {"StreamingDistribution" (portkey.aws/getback-xml-elem-with-tag "StreamingDistribution" input), "Location" (portkey.aws/getback-xml-elem-with-tag "Location" input), "ETag" (portkey.aws/getback-xml-elem-with-tag "ETag" input)}] (clojure.core/cond-> {} (letvar1176408 "StreamingDistribution") (clojure.core/assoc :streaming-distribution (deser-streaming-distribution (clojure.core/get-in letvar1176408 ["StreamingDistribution" :content]))) (letvar1176408 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar1176408 ["Location" :content]))) (letvar1176408 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar1176408 ["ETag" :content]))))))

(clojure.core/defn- deser-too-many-field-level-encryption-profiles [input] (clojure.core/let [letvar1176492 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1176492 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1176492 ["Message" :content]))))))

(clojure.core/defn- deser-no-such-field-level-encryption-profile [input] (clojure.core/let [letvar1176576 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1176576 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1176576 ["Message" :content]))))))

(clojure.core/defn- deser-invalid-relative-path [input] (clojure.core/let [letvar1176660 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1176660 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1176660 ["Message" :content]))))))

(clojure.core/defn- deser-create-public-key-result [input] (clojure.core/let [letvar1176744 {"PublicKey" (portkey.aws/getback-xml-elem-with-tag "PublicKey" input), "Location" (portkey.aws/getback-xml-elem-with-tag "Location" input), "ETag" (portkey.aws/getback-xml-elem-with-tag "ETag" input)}] (clojure.core/cond-> {} (letvar1176744 "PublicKey") (clojure.core/assoc :public-key (deser-public-key (clojure.core/get-in letvar1176744 ["PublicKey" :content]))) (letvar1176744 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar1176744 ["Location" :content]))) (letvar1176744 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar1176744 ["ETag" :content]))))))

(clojure.core/defn- deser-invalid-location-code [input] (clojure.core/let [letvar1176828 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1176828 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1176828 ["Message" :content]))))))

(clojure.core/defn- deser-invalid-web-acl-id [input] (clojure.core/let [letvar1176912 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1176912 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1176912 ["Message" :content]))))))

(clojure.core/defn- deser-invalid-origin [input] (clojure.core/let [letvar1176996 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1176996 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1176996 ["Message" :content]))))))

(clojure.core/defn- deser-too-many-cloud-front-origin-access-identities [input] (clojure.core/let [letvar1177080 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1177080 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1177080 ["Message" :content]))))))

(clojure.core/defn- deser-field-level-encryption-config-already-exists [input] (clojure.core/let [letvar1177164 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1177164 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1177164 ["Message" :content]))))))

(clojure.core/defn- deser-no-such-field-level-encryption-config [input] (clojure.core/let [letvar1177248 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1177248 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1177248 ["Message" :content]))))))

(clojure.core/defn- deser-update-distribution-result [input] (clojure.core/let [letvar1177332 {"Distribution" (portkey.aws/getback-xml-elem-with-tag "Distribution" input), "ETag" (portkey.aws/getback-xml-elem-with-tag "ETag" input)}] (clojure.core/cond-> {} (letvar1177332 "Distribution") (clojure.core/assoc :distribution (deser-distribution (clojure.core/get-in letvar1177332 ["Distribution" :content]))) (letvar1177332 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar1177332 ["ETag" :content]))))))

(clojure.core/defn- deser-get-cloud-front-origin-access-identity-result [input] (clojure.core/let [letvar1177416 {"CloudFrontOriginAccessIdentity" (portkey.aws/getback-xml-elem-with-tag "CloudFrontOriginAccessIdentity" input), "ETag" (portkey.aws/getback-xml-elem-with-tag "ETag" input)}] (clojure.core/cond-> {} (letvar1177416 "CloudFrontOriginAccessIdentity") (clojure.core/assoc :cloud-front-origin-access-identity (deser-cloud-front-origin-access-identity (clojure.core/get-in letvar1177416 ["CloudFrontOriginAccessIdentity" :content]))) (letvar1177416 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar1177416 ["ETag" :content]))))))

(clojure.core/defn- deser-too-many-field-level-encryption-encryption-entities [input] (clojure.core/let [letvar1177500 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1177500 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1177500 ["Message" :content]))))))

(clojure.core/defn- deser-get-field-level-encryption-result [input] (clojure.core/let [letvar1177584 {"FieldLevelEncryption" (portkey.aws/getback-xml-elem-with-tag "FieldLevelEncryption" input), "ETag" (portkey.aws/getback-xml-elem-with-tag "ETag" input)}] (clojure.core/cond-> {} (letvar1177584 "FieldLevelEncryption") (clojure.core/assoc :field-level-encryption (deser-field-level-encryption (clojure.core/get-in letvar1177584 ["FieldLevelEncryption" :content]))) (letvar1177584 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar1177584 ["ETag" :content]))))))

(clojure.core/defn- deser-invalid-query-string-parameters [input] (clojure.core/let [letvar1177668 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1177668 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1177668 ["Message" :content]))))))

(clojure.core/defn- deser-public-key-already-exists [input] (clojure.core/let [letvar1177752 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1177752 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1177752 ["Message" :content]))))))

(clojure.core/defn- deser-too-many-origins [input] (clojure.core/let [letvar1177836 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1177836 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1177836 ["Message" :content]))))))

(clojure.core/defn- deser-invalid-ttl-order [input] (clojure.core/let [letvar1177920 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1177920 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1177920 ["Message" :content]))))))

(clojure.core/defn- deser-no-such-streaming-distribution [input] (clojure.core/let [letvar1178004 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1178004 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1178004 ["Message" :content]))))))

(clojure.core/defn- deser-create-cloud-front-origin-access-identity-result [input] (clojure.core/let [letvar1178088 {"CloudFrontOriginAccessIdentity" (portkey.aws/getback-xml-elem-with-tag "CloudFrontOriginAccessIdentity" input), "Location" (portkey.aws/getback-xml-elem-with-tag "Location" input), "ETag" (portkey.aws/getback-xml-elem-with-tag "ETag" input)}] (clojure.core/cond-> {} (letvar1178088 "CloudFrontOriginAccessIdentity") (clojure.core/assoc :cloud-front-origin-access-identity (deser-cloud-front-origin-access-identity (clojure.core/get-in letvar1178088 ["CloudFrontOriginAccessIdentity" :content]))) (letvar1178088 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar1178088 ["Location" :content]))) (letvar1178088 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar1178088 ["ETag" :content]))))))

(clojure.core/defn- deser-cname-already-exists [input] (clojure.core/let [letvar1178172 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1178172 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1178172 ["Message" :content]))))))

(clojure.core/defn- deser-invalid-default-root-object [input] (clojure.core/let [letvar1178256 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1178256 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1178256 ["Message" :content]))))))

(clojure.core/defn- deser-invalid-response-code [input] (clojure.core/let [letvar1178340 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1178340 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1178340 ["Message" :content]))))))

(clojure.core/defn- deser-no-such-invalidation [input] (clojure.core/let [letvar1178424 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1178424 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1178424 ["Message" :content]))))))

(clojure.core/defn- deser-too-many-invalidations-in-progress [input] (clojure.core/let [letvar1178508 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1178508 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1178508 ["Message" :content]))))))

(clojure.core/defn- deser-get-public-key-result [input] (clojure.core/let [letvar1178592 {"PublicKey" (portkey.aws/getback-xml-elem-with-tag "PublicKey" input), "ETag" (portkey.aws/getback-xml-elem-with-tag "ETag" input)}] (clojure.core/cond-> {} (letvar1178592 "PublicKey") (clojure.core/assoc :public-key (deser-public-key (clojure.core/get-in letvar1178592 ["PublicKey" :content]))) (letvar1178592 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar1178592 ["ETag" :content]))))))

(clojure.core/defn- deser-too-many-distributions-associated-to-field-level-encryption-config [input] (clojure.core/let [letvar1178676 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1178676 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1178676 ["Message" :content]))))))

(clojure.core/defn- deser-list-cloud-front-origin-access-identities-result [input] (clojure.core/let [letvar1178760 {"CloudFrontOriginAccessIdentityList" (portkey.aws/getback-xml-elem-with-tag "CloudFrontOriginAccessIdentityList" input)}] (clojure.core/cond-> {} (letvar1178760 "CloudFrontOriginAccessIdentityList") (clojure.core/assoc :cloud-front-origin-access-identity-list (deser-cloud-front-origin-access-identity-list (clojure.core/get-in letvar1178760 ["CloudFrontOriginAccessIdentityList" :content]))))))

(clojure.core/defn- deser-update-public-key-result [input] (clojure.core/let [letvar1178844 {"PublicKey" (portkey.aws/getback-xml-elem-with-tag "PublicKey" input), "ETag" (portkey.aws/getback-xml-elem-with-tag "ETag" input)}] (clojure.core/cond-> {} (letvar1178844 "PublicKey") (clojure.core/assoc :public-key (deser-public-key (clojure.core/get-in letvar1178844 ["PublicKey" :content]))) (letvar1178844 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar1178844 ["ETag" :content]))))))

(clojure.core/defn- deser-invalid-forward-cookies [input] (clojure.core/let [letvar1178928 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1178928 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1178928 ["Message" :content]))))))

(clojure.core/defn- deser-get-distribution-config-result [input] (clojure.core/let [letvar1179012 {"DistributionConfig" (portkey.aws/getback-xml-elem-with-tag "DistributionConfig" input), "ETag" (portkey.aws/getback-xml-elem-with-tag "ETag" input)}] (clojure.core/cond-> {} (letvar1179012 "DistributionConfig") (clojure.core/assoc :distribution-config (deser-distribution-config (clojure.core/get-in letvar1179012 ["DistributionConfig" :content]))) (letvar1179012 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar1179012 ["ETag" :content]))))))

(clojure.core/defn- deser-invalid-required-protocol [input] (clojure.core/let [letvar1179096 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1179096 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1179096 ["Message" :content]))))))

(clojure.core/defn- deser-update-field-level-encryption-config-result [input] (clojure.core/let [letvar1179180 {"FieldLevelEncryption" (portkey.aws/getback-xml-elem-with-tag "FieldLevelEncryption" input), "ETag" (portkey.aws/getback-xml-elem-with-tag "ETag" input)}] (clojure.core/cond-> {} (letvar1179180 "FieldLevelEncryption") (clojure.core/assoc :field-level-encryption (deser-field-level-encryption (clojure.core/get-in letvar1179180 ["FieldLevelEncryption" :content]))) (letvar1179180 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar1179180 ["ETag" :content]))))))

(clojure.core/defn- deser-get-distribution-result [input] (clojure.core/let [letvar1179264 {"Distribution" (portkey.aws/getback-xml-elem-with-tag "Distribution" input), "ETag" (portkey.aws/getback-xml-elem-with-tag "ETag" input)}] (clojure.core/cond-> {} (letvar1179264 "Distribution") (clojure.core/assoc :distribution (deser-distribution (clojure.core/get-in letvar1179264 ["Distribution" :content]))) (letvar1179264 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar1179264 ["ETag" :content]))))))

(clojure.core/defn- deser-update-field-level-encryption-profile-result [input] (clojure.core/let [letvar1179348 {"FieldLevelEncryptionProfile" (portkey.aws/getback-xml-elem-with-tag "FieldLevelEncryptionProfile" input), "ETag" (portkey.aws/getback-xml-elem-with-tag "ETag" input)}] (clojure.core/cond-> {} (letvar1179348 "FieldLevelEncryptionProfile") (clojure.core/assoc :field-level-encryption-profile (deser-field-level-encryption-profile (clojure.core/get-in letvar1179348 ["FieldLevelEncryptionProfile" :content]))) (letvar1179348 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar1179348 ["ETag" :content]))))))

(clojure.core/defn- deser-get-streaming-distribution-config-result [input] (clojure.core/let [letvar1179432 {"StreamingDistributionConfig" (portkey.aws/getback-xml-elem-with-tag "StreamingDistributionConfig" input), "ETag" (portkey.aws/getback-xml-elem-with-tag "ETag" input)}] (clojure.core/cond-> {} (letvar1179432 "StreamingDistributionConfig") (clojure.core/assoc :streaming-distribution-config (deser-streaming-distribution-config (clojure.core/get-in letvar1179432 ["StreamingDistributionConfig" :content]))) (letvar1179432 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar1179432 ["ETag" :content]))))))

(clojure.core/defn- deser-list-public-keys-result [input] (clojure.core/let [letvar1179516 {"PublicKeyList" (portkey.aws/getback-xml-elem-with-tag "PublicKeyList" input)}] (clojure.core/cond-> {} (letvar1179516 "PublicKeyList") (clojure.core/assoc :public-key-list (deser-public-key-list (clojure.core/get-in letvar1179516 ["PublicKeyList" :content]))))))

(clojure.core/defn- deser-invalid-headers-for-s-3-origin [input] (clojure.core/let [letvar1179600 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1179600 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1179600 ["Message" :content]))))))

(clojure.core/defn- deser-get-field-level-encryption-config-result [input] (clojure.core/let [letvar1179684 {"FieldLevelEncryptionConfig" (portkey.aws/getback-xml-elem-with-tag "FieldLevelEncryptionConfig" input), "ETag" (portkey.aws/getback-xml-elem-with-tag "ETag" input)}] (clojure.core/cond-> {} (letvar1179684 "FieldLevelEncryptionConfig") (clojure.core/assoc :field-level-encryption-config (deser-field-level-encryption-config (clojure.core/get-in letvar1179684 ["FieldLevelEncryptionConfig" :content]))) (letvar1179684 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar1179684 ["ETag" :content]))))))

(clojure.core/defn- deser-too-many-field-level-encryption-configs [input] (clojure.core/let [letvar1179768 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1179768 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1179768 ["Message" :content]))))))

(clojure.core/defn- deser-field-level-encryption-config-in-use [input] (clojure.core/let [letvar1179852 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1179852 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1179852 ["Message" :content]))))))

(clojure.core/defn- deser-too-many-distribution-cnam-es [input] (clojure.core/let [letvar1179936 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1179936 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1179936 ["Message" :content]))))))

(clojure.core/defn- deser-invalid-geo-restriction-parameter [input] (clojure.core/let [letvar1180020 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1180020 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1180020 ["Message" :content]))))))

(clojure.core/defn- deser-no-such-cloud-front-origin-access-identity [input] (clojure.core/let [letvar1180104 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1180104 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1180104 ["Message" :content]))))))

(clojure.core/defn- deser-list-invalidations-result [input] (clojure.core/let [letvar1180188 {"InvalidationList" (portkey.aws/getback-xml-elem-with-tag "InvalidationList" input)}] (clojure.core/cond-> {} (letvar1180188 "InvalidationList") (clojure.core/assoc :invalidation-list (deser-invalidation-list (clojure.core/get-in letvar1180188 ["InvalidationList" :content]))))))

(clojure.core/defn- deser-batch-too-large [input] (clojure.core/let [letvar1180272 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1180272 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1180272 ["Message" :content]))))))

(clojure.core/defn- deser-create-distribution-with-tags-result [input] (clojure.core/let [letvar1180356 {"Distribution" (portkey.aws/getback-xml-elem-with-tag "Distribution" input), "Location" (portkey.aws/getback-xml-elem-with-tag "Location" input), "ETag" (portkey.aws/getback-xml-elem-with-tag "ETag" input)}] (clojure.core/cond-> {} (letvar1180356 "Distribution") (clojure.core/assoc :distribution (deser-distribution (clojure.core/get-in letvar1180356 ["Distribution" :content]))) (letvar1180356 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar1180356 ["Location" :content]))) (letvar1180356 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar1180356 ["ETag" :content]))))))

(clojure.core/defn- deser-too-many-field-level-encryption-query-arg-profiles [input] (clojure.core/let [letvar1180440 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1180440 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1180440 ["Message" :content]))))))

(clojure.core/defn- deser-list-streaming-distributions-result [input] (clojure.core/let [letvar1180524 {"StreamingDistributionList" (portkey.aws/getback-xml-elem-with-tag "StreamingDistributionList" input)}] (clojure.core/cond-> {} (letvar1180524 "StreamingDistributionList") (clojure.core/assoc :streaming-distribution-list (deser-streaming-distribution-list (clojure.core/get-in letvar1180524 ["StreamingDistributionList" :content]))))))

(clojure.core/defn- deser-create-streaming-distribution-with-tags-result [input] (clojure.core/let [letvar1180608 {"StreamingDistribution" (portkey.aws/getback-xml-elem-with-tag "StreamingDistribution" input), "Location" (portkey.aws/getback-xml-elem-with-tag "Location" input), "ETag" (portkey.aws/getback-xml-elem-with-tag "ETag" input)}] (clojure.core/cond-> {} (letvar1180608 "StreamingDistribution") (clojure.core/assoc :streaming-distribution (deser-streaming-distribution (clojure.core/get-in letvar1180608 ["StreamingDistribution" :content]))) (letvar1180608 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar1180608 ["Location" :content]))) (letvar1180608 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar1180608 ["ETag" :content]))))))

(clojure.core/defn- deser-create-invalidation-result [input] (clojure.core/let [letvar1180692 {"Location" (portkey.aws/getback-xml-elem-with-tag "Location" input), "Invalidation" (portkey.aws/getback-xml-elem-with-tag "Invalidation" input)}] (clojure.core/cond-> {} (letvar1180692 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar1180692 ["Location" :content]))) (letvar1180692 "Invalidation") (clojure.core/assoc :invalidation (deser-invalidation (clojure.core/get-in letvar1180692 ["Invalidation" :content]))))))

(clojure.core/defn- deser-missing-body [input] (clojure.core/let [letvar1180776 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1180776 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1180776 ["Message" :content]))))))

(clojure.core/defn- deser-invalid-origin-read-timeout [input] (clojure.core/let [letvar1180860 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1180860 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1180860 ["Message" :content]))))))

(clojure.core/defn- deser-get-cloud-front-origin-access-identity-config-result [input] (clojure.core/let [letvar1180944 {"CloudFrontOriginAccessIdentityConfig" (portkey.aws/getback-xml-elem-with-tag "CloudFrontOriginAccessIdentityConfig" input), "ETag" (portkey.aws/getback-xml-elem-with-tag "ETag" input)}] (clojure.core/cond-> {} (letvar1180944 "CloudFrontOriginAccessIdentityConfig") (clojure.core/assoc :cloud-front-origin-access-identity-config (deser-cloud-front-origin-access-identity-config (clojure.core/get-in letvar1180944 ["CloudFrontOriginAccessIdentityConfig" :content]))) (letvar1180944 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar1180944 ["ETag" :content]))))))

(clojure.core/defn- deser-distribution-not-disabled [input] (clojure.core/let [letvar1181028 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1181028 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1181028 ["Message" :content]))))))

(clojure.core/defn- deser-cloud-front-origin-access-identity-already-exists [input] (clojure.core/let [letvar1181112 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1181112 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1181112 ["Message" :content]))))))

(clojure.core/defn- deser-precondition-failed [input] (clojure.core/let [letvar1181196 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1181196 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1181196 ["Message" :content]))))))

(clojure.core/defn- deser-distribution-already-exists [input] (clojure.core/let [letvar1181280 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1181280 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1181280 ["Message" :content]))))))

(clojure.core/defn- deser-invalid-origin-access-identity [input] (clojure.core/let [letvar1181364 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1181364 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1181364 ["Message" :content]))))))

(clojure.core/defn- deser-too-many-trusted-signers [input] (clojure.core/let [letvar1181448 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1181448 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1181448 ["Message" :content]))))))

(clojure.core/defn- deser-too-many-public-keys [input] (clojure.core/let [letvar1181532 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1181532 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1181532 ["Message" :content]))))))

(clojure.core/defn- deser-invalid-minimum-protocol-version [input] (clojure.core/let [letvar1181616 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1181616 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1181616 ["Message" :content]))))))

(clojure.core/defn- deser-streaming-distribution-already-exists [input] (clojure.core/let [letvar1181700 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1181700 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1181700 ["Message" :content]))))))

(clojure.core/defn- deser-public-key-in-use [input] (clojure.core/let [letvar1181784 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1181784 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1181784 ["Message" :content]))))))

(clojure.core/defn- deser-invalid-if-match-version [input] (clojure.core/let [letvar1181868 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1181868 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1181868 ["Message" :content]))))))

(clojure.core/defn- deser-list-field-level-encryption-profiles-result [input] (clojure.core/let [letvar1181952 {"FieldLevelEncryptionProfileList" (portkey.aws/getback-xml-elem-with-tag "FieldLevelEncryptionProfileList" input)}] (clojure.core/cond-> {} (letvar1181952 "FieldLevelEncryptionProfileList") (clojure.core/assoc :field-level-encryption-profile-list (deser-field-level-encryption-profile-list (clojure.core/get-in letvar1181952 ["FieldLevelEncryptionProfileList" :content]))))))

(clojure.core/defn- deser-create-distribution-result [input] (clojure.core/let [letvar1182036 {"Distribution" (portkey.aws/getback-xml-elem-with-tag "Distribution" input), "Location" (portkey.aws/getback-xml-elem-with-tag "Location" input), "ETag" (portkey.aws/getback-xml-elem-with-tag "ETag" input)}] (clojure.core/cond-> {} (letvar1182036 "Distribution") (clojure.core/assoc :distribution (deser-distribution (clojure.core/get-in letvar1182036 ["Distribution" :content]))) (letvar1182036 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar1182036 ["Location" :content]))) (letvar1182036 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar1182036 ["ETag" :content]))))))

(clojure.core/defn- deser-too-many-distributions [input] (clojure.core/let [letvar1182120 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1182120 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1182120 ["Message" :content]))))))

(clojure.core/defn- deser-list-field-level-encryption-configs-result [input] (clojure.core/let [letvar1182204 {"FieldLevelEncryptionList" (portkey.aws/getback-xml-elem-with-tag "FieldLevelEncryptionList" input)}] (clojure.core/cond-> {} (letvar1182204 "FieldLevelEncryptionList") (clojure.core/assoc :field-level-encryption-list (deser-field-level-encryption-list (clojure.core/get-in letvar1182204 ["FieldLevelEncryptionList" :content]))))))

(clojure.core/defn- deser-no-such-distribution [input] (clojure.core/let [letvar1182288 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1182288 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1182288 ["Message" :content]))))))

(clojure.core/defn- deser-query-arg-profile-empty [input] (clojure.core/let [letvar1182372 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1182372 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1182372 ["Message" :content]))))))

(clojure.core/defn- deser-update-streaming-distribution-result [input] (clojure.core/let [letvar1182456 {"StreamingDistribution" (portkey.aws/getback-xml-elem-with-tag "StreamingDistribution" input), "ETag" (portkey.aws/getback-xml-elem-with-tag "ETag" input)}] (clojure.core/cond-> {} (letvar1182456 "StreamingDistribution") (clojure.core/assoc :streaming-distribution (deser-streaming-distribution (clojure.core/get-in letvar1182456 ["StreamingDistribution" :content]))) (letvar1182456 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar1182456 ["ETag" :content]))))))

(clojure.core/defn- deser-illegal-update [input] (clojure.core/let [letvar1182540 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1182540 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1182540 ["Message" :content]))))))

(clojure.core/defn- deser-get-field-level-encryption-profile-config-result [input] (clojure.core/let [letvar1182624 {"FieldLevelEncryptionProfileConfig" (portkey.aws/getback-xml-elem-with-tag "FieldLevelEncryptionProfileConfig" input), "ETag" (portkey.aws/getback-xml-elem-with-tag "ETag" input)}] (clojure.core/cond-> {} (letvar1182624 "FieldLevelEncryptionProfileConfig") (clojure.core/assoc :field-level-encryption-profile-config (deser-field-level-encryption-profile-config (clojure.core/get-in letvar1182624 ["FieldLevelEncryptionProfileConfig" :content]))) (letvar1182624 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar1182624 ["ETag" :content]))))))

(clojure.core/defn- deser-too-many-field-level-encryption-content-type-profiles [input] (clojure.core/let [letvar1182708 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1182708 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1182708 ["Message" :content]))))))

(clojure.core/defn- deser-invalid-origin-keepalive-timeout [input] (clojure.core/let [letvar1182792 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1182792 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1182792 ["Message" :content]))))))

(clojure.core/defn- deser-inconsistent-quantities [input] (clojure.core/let [letvar1182876 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1182876 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1182876 ["Message" :content]))))))

(clojure.core/defn- deser-list-distributions-by-web-acl-id-result [input] (clojure.core/let [letvar1182960 {"DistributionList" (portkey.aws/getback-xml-elem-with-tag "DistributionList" input)}] (clojure.core/cond-> {} (letvar1182960 "DistributionList") (clojure.core/assoc :distribution-list (deser-distribution-list (clojure.core/get-in letvar1182960 ["DistributionList" :content]))))))

(clojure.core/defn- deser-too-many-query-string-parameters [input] (clojure.core/let [letvar1183044 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1183044 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1183044 ["Message" :content]))))))

(clojure.core/defn- deser-invalid-tagging [input] (clojure.core/let [letvar1183128 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1183128 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1183128 ["Message" :content]))))))

(clojure.core/defn- deser-list-distributions-result [input] (clojure.core/let [letvar1183212 {"DistributionList" (portkey.aws/getback-xml-elem-with-tag "DistributionList" input)}] (clojure.core/cond-> {} (letvar1183212 "DistributionList") (clojure.core/assoc :distribution-list (deser-distribution-list (clojure.core/get-in letvar1183212 ["DistributionList" :content]))))))

(clojure.core/defn- deser-trusted-signer-does-not-exist [input] (clojure.core/let [letvar1183296 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1183296 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1183296 ["Message" :content]))))))

(clojure.core/defn- deser-too-many-field-level-encryption-field-patterns [input] (clojure.core/let [letvar1183380 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1183380 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1183380 ["Message" :content]))))))

(clojure.core/defn- deser-get-invalidation-result [input] (clojure.core/let [letvar1183464 {"Invalidation" (portkey.aws/getback-xml-elem-with-tag "Invalidation" input)}] (clojure.core/cond-> {} (letvar1183464 "Invalidation") (clojure.core/assoc :invalidation (deser-invalidation (clojure.core/get-in letvar1183464 ["Invalidation" :content]))))))

(clojure.core/defn- deser-too-many-headers-in-forwarded-values [input] (clojure.core/let [letvar1183548 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1183548 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1183548 ["Message" :content]))))))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.tag-keys/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/tag-keys (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.tag-keys/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/list-tags-for-resource-result (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.list-distributions-by-web-acl-id-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.list-distributions-by-web-acl-id-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.list-distributions-by-web-acl-id-request/web-acl-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/list-distributions-by-web-acl-id-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.list-distributions-by-web-acl-id-request/web-acl-id] :opt-un [:portkey.aws.cloudfront.-2018-06-18.list-distributions-by-web-acl-id-request/marker :portkey.aws.cloudfront.-2018-06-18.list-distributions-by-web-acl-id-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.too-many-distributions-with-lambda-associations/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/too-many-distributions-with-lambda-associations (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.too-many-distributions-with-lambda-associations/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.no-such-origin/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/no-such-origin (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.no-such-origin/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cookie-names/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cookie-names/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/cookie-name-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/cookie-names (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.cookie-names/quantity] :opt-un [:portkey.aws.cloudfront.-2018-06-18.cookie-names/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.content-type-profile/profile-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.content-type-profile/content-type (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/content-type-profile (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18/format :portkey.aws.cloudfront.-2018-06-18.content-type-profile/content-type] :opt-un [:portkey.aws.cloudfront.-2018-06-18.content-type-profile/profile-id]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.logging-config/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.logging-config/include-cookies (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.logging-config/bucket (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.logging-config/prefix (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/logging-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.logging-config/enabled :portkey.aws.cloudfront.-2018-06-18.logging-config/include-cookies :portkey.aws.cloudfront.-2018-06-18.logging-config/bucket :portkey.aws.cloudfront.-2018-06-18.logging-config/prefix] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/streaming-distribution-config-with-tags (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18/streaming-distribution-config :portkey.aws.cloudfront.-2018-06-18/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalid-protocol-settings/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/invalid-protocol-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.invalid-protocol-settings/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.too-many-cookie-names-in-white-list/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/too-many-cookie-names-in-white-list (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.too-many-cookie-names-in-white-list/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalidation-summary/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalidation-summary/create-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalidation-summary/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/invalidation-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.invalidation-summary/id :portkey.aws.cloudfront.-2018-06-18.invalidation-summary/create-time :portkey.aws.cloudfront.-2018-06-18.invalidation-summary/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/create-field-level-encryption-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18/field-level-encryption-profile-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/create-field-level-encryption-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18/field-level-encryption-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.too-many-cache-behaviors/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/too-many-cache-behaviors (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.too-many-cache-behaviors/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.too-many-origin-custom-headers/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/too-many-origin-custom-headers (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.too-many-origin-custom-headers/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/custom-error-response-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-06-18/custom-error-response))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalidation/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalidation/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalidation/create-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/invalidation (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.invalidation/id :portkey.aws.cloudfront.-2018-06-18.invalidation/status :portkey.aws.cloudfront.-2018-06-18.invalidation/create-time :portkey.aws.cloudfront.-2018-06-18/invalidation-batch] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.create-field-level-encryption-config-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.create-field-level-encryption-config-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/create-field-level-encryption-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/field-level-encryption :portkey.aws.cloudfront.-2018-06-18.create-field-level-encryption-config-result/location :portkey.aws.cloudfront.-2018-06-18.create-field-level-encryption-config-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.too-many-streaming-distributions/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/too-many-streaming-distributions (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.too-many-streaming-distributions/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/certificate-source #{"cloudfront" "acm" :acm :cloudfront :iam "iam"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/location-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-06-18/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.get-streaming-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/get-streaming-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/streaming-distribution :portkey.aws.cloudfront.-2018-06-18.get-streaming-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/key-pair-id-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-06-18/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.too-many-streaming-distribution-cnam-es/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/too-many-streaming-distribution-cnam-es (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.too-many-streaming-distribution-cnam-es/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.field-patterns/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.field-patterns/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/field-pattern-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/field-patterns (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.field-patterns/quantity] :opt-un [:portkey.aws.cloudfront.-2018-06-18.field-patterns/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile-already-exists/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/field-level-encryption-profile-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/restrictions (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18/geo-restriction] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile-config/name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile-config/caller-reference (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile-config/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/field-level-encryption-profile-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile-config/name :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile-config/caller-reference :portkey.aws.cloudfront.-2018-06-18/encryption-entities] :opt-un [:portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile-config/comment]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalid-viewer-certificate/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/invalid-viewer-certificate (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.invalid-viewer-certificate/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.get-public-key-config-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/get-public-key-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/public-key-config :portkey.aws.cloudfront.-2018-06-18.get-public-key-config-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalid-argument/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/invalid-argument (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.invalid-argument/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.no-such-public-key/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/no-such-public-key (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.no-such-public-key/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-not-disabled/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/streaming-distribution-not-disabled (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.streaming-distribution-not-disabled/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.get-streaming-distribution-config-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/get-streaming-distribution-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.get-streaming-distribution-config-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.illegal-field-level-encryption-config-association-with-cache-behavior/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/illegal-field-level-encryption-config-association-with-cache-behavior (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.illegal-field-level-encryption-config-association-with-cache-behavior/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-config/caller-reference (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-config/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/field-level-encryption-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.field-level-encryption-config/caller-reference] :opt-un [:portkey.aws.cloudfront.-2018-06-18.field-level-encryption-config/comment :portkey.aws.cloudfront.-2018-06-18/query-arg-profile-config :portkey.aws.cloudfront.-2018-06-18/content-type-profile-config]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.delete-streaming-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.delete-streaming-distribution-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/delete-streaming-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.delete-streaming-distribution-request/id] :opt-un [:portkey.aws.cloudfront.-2018-06-18.delete-streaming-distribution-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.get-cloud-front-origin-access-identity-config-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/get-cloud-front-origin-access-identity-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.get-cloud-front-origin-access-identity-config-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/field-level-encryption-profile (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile/id :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile/last-modified-time :portkey.aws.cloudfront.-2018-06-18/field-level-encryption-profile-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.too-many-certificates/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/too-many-certificates (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.too-many-certificates/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.distribution/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.distribution/arn (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.distribution/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.distribution/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.distribution/in-progress-invalidation-batches (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.distribution/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/distribution (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.distribution/id :portkey.aws.cloudfront.-2018-06-18.distribution/arn :portkey.aws.cloudfront.-2018-06-18.distribution/status :portkey.aws.cloudfront.-2018-06-18.distribution/last-modified-time :portkey.aws.cloudfront.-2018-06-18.distribution/in-progress-invalidation-batches :portkey.aws.cloudfront.-2018-06-18.distribution/domain-name :portkey.aws.cloudfront.-2018-06-18/active-trusted-signers :portkey.aws.cloudfront.-2018-06-18/distribution-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cloud-front-origin-access-identity-list/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cloud-front-origin-access-identity-list/next-marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cloud-front-origin-access-identity-list/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cloud-front-origin-access-identity-list/is-truncated (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cloud-front-origin-access-identity-list/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cloud-front-origin-access-identity-list/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/cloud-front-origin-access-identity-summary-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/cloud-front-origin-access-identity-list (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.cloud-front-origin-access-identity-list/marker :portkey.aws.cloudfront.-2018-06-18.cloud-front-origin-access-identity-list/max-items :portkey.aws.cloudfront.-2018-06-18.cloud-front-origin-access-identity-list/is-truncated :portkey.aws.cloudfront.-2018-06-18.cloud-front-origin-access-identity-list/quantity] :opt-un [:portkey.aws.cloudfront.-2018-06-18.cloud-front-origin-access-identity-list/next-marker :portkey.aws.cloudfront.-2018-06-18.cloud-front-origin-access-identity-list/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.query-arg-profile/query-arg (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.query-arg-profile/profile-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/query-arg-profile (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.query-arg-profile/query-arg :portkey.aws.cloudfront.-2018-06-18.query-arg-profile/profile-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.lambda-function-association/include-body (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/lambda-function-association (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18/lambda-function-arn :portkey.aws.cloudfront.-2018-06-18/event-type] :opt-un [:portkey.aws.cloudfront.-2018-06-18.lambda-function-association/include-body]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.forwarded-values/query-string (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.forwarded-values/cookies (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/cookie-preference))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/forwarded-values (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.forwarded-values/query-string :portkey.aws.cloudfront.-2018-06-18.forwarded-values/cookies] :opt-un [:portkey.aws.cloudfront.-2018-06-18/headers :portkey.aws.cloudfront.-2018-06-18/query-string-cache-keys]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.access-denied/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/access-denied (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.access-denied/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalidation-batch/caller-reference (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/invalidation-batch (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18/paths :portkey.aws.cloudfront.-2018-06-18.invalidation-batch/caller-reference] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/invalidation-summary-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-06-18/invalidation-summary))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.delete-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.delete-distribution-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/delete-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.delete-distribution-request/id] :opt-un [:portkey.aws.cloudfront.-2018-06-18.delete-distribution-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.update-public-key-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.update-public-key-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/update-public-key-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18/public-key-config :portkey.aws.cloudfront.-2018-06-18.update-public-key-request/id] :opt-un [:portkey.aws.cloudfront.-2018-06-18.update-public-key-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.get-public-key-config-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/get-public-key-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.get-public-key-config-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/query-string-cache-keys-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-06-18/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-list/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-list/next-marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-list/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-list/is-truncated (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-list/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-list/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/streaming-distribution-summary-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/streaming-distribution-list (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.streaming-distribution-list/marker :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-list/max-items :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-list/is-truncated :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-list/quantity] :opt-un [:portkey.aws.cloudfront.-2018-06-18.streaming-distribution-list/next-marker :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-list/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.public-key-config/caller-reference (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.public-key-config/name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.public-key-config/encoded-key (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.public-key-config/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/public-key-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.public-key-config/caller-reference :portkey.aws.cloudfront.-2018-06-18.public-key-config/name :portkey.aws.cloudfront.-2018-06-18.public-key-config/encoded-key] :opt-un [:portkey.aws.cloudfront.-2018-06-18.public-key-config/comment]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/item-selection #{"none" "whitelist" :all "all" :whitelist :none})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/encryption-entity-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-06-18/encryption-entity))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.list-tags-for-resource-request/resource (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/resource-arn))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/list-tags-for-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.list-tags-for-resource-request/resource] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.streaming-distribution/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.streaming-distribution/arn (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.streaming-distribution/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.streaming-distribution/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.streaming-distribution/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/streaming-distribution (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.streaming-distribution/id :portkey.aws.cloudfront.-2018-06-18.streaming-distribution/arn :portkey.aws.cloudfront.-2018-06-18.streaming-distribution/status :portkey.aws.cloudfront.-2018-06-18.streaming-distribution/domain-name :portkey.aws.cloudfront.-2018-06-18/active-trusted-signers :portkey.aws.cloudfront.-2018-06-18/streaming-distribution-config] :opt-un [:portkey.aws.cloudfront.-2018-06-18.streaming-distribution/last-modified-time]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/create-distribution-with-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18/distribution-config-with-tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.lambda-function-associations/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.lambda-function-associations/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/lambda-function-association-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/lambda-function-associations (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.lambda-function-associations/quantity] :opt-un [:portkey.aws.cloudfront.-2018-06-18.lambda-function-associations/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.encryption-entities/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.encryption-entities/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/encryption-entity-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/encryption-entities (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.encryption-entities/quantity] :opt-un [:portkey.aws.cloudfront.-2018-06-18.encryption-entities/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cloud-front-origin-access-identity-in-use/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/cloud-front-origin-access-identity-in-use (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.cloud-front-origin-access-identity-in-use/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cannot-change-immutable-public-key-fields/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/cannot-change-immutable-public-key-fields (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.cannot-change-immutable-public-key-fields/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.get-field-level-encryption-config-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/get-field-level-encryption-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.get-field-level-encryption-config-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile-size-exceeded/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/field-level-encryption-profile-size-exceeded (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile-size-exceeded/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/viewer-protocol-policy #{"allow-all" :redirecttohttps :httpsonly "https-only" "redirect-to-https" :allowall})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalid-lambda-function-association/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/invalid-lambda-function-association (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.invalid-lambda-function-association/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile-summary/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile-summary/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile-summary/name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile-summary/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/field-level-encryption-profile-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile-summary/id :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile-summary/last-modified-time :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile-summary/name :portkey.aws.cloudfront.-2018-06-18/encryption-entities] :opt-un [:portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile-summary/comment]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/content-type-profile-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-06-18/content-type-profile))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.custom-error-response/error-code (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.custom-error-response/response-page-path (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.custom-error-response/response-code (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.custom-error-response/error-caching-min-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/custom-error-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.custom-error-response/error-code] :opt-un [:portkey.aws.cloudfront.-2018-06-18.custom-error-response/response-page-path :portkey.aws.cloudfront.-2018-06-18.custom-error-response/response-code :portkey.aws.cloudfront.-2018-06-18.custom-error-response/error-caching-min-ttl]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.create-field-level-encryption-profile-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.create-field-level-encryption-profile-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/create-field-level-encryption-profile-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/field-level-encryption-profile :portkey.aws.cloudfront.-2018-06-18.create-field-level-encryption-profile-result/location :portkey.aws.cloudfront.-2018-06-18.create-field-level-encryption-profile-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/distribution-summary-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-06-18/distribution-summary))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.signer/aws-account-number (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/signer (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.signer/aws-account-number :portkey.aws.cloudfront.-2018-06-18/key-pair-ids]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.get-field-level-encryption-profile-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/get-field-level-encryption-profile-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/field-level-encryption-profile :portkey.aws.cloudfront.-2018-06-18.get-field-level-encryption-profile-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.no-such-resource/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/no-such-resource (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.no-such-resource/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.get-public-key-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/get-public-key-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.get-public-key-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/origin-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-06-18/origin :min-count 1))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.update-cloud-front-origin-access-identity-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/update-cloud-front-origin-access-identity-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/cloud-front-origin-access-identity :portkey.aws.cloudfront.-2018-06-18.update-cloud-front-origin-access-identity-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile-list/next-marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile-list/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile-list/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile-list/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/field-level-encryption-profile-summary-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/field-level-encryption-profile-list (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile-list/max-items :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile-list/quantity] :opt-un [:portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile-list/next-marker :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile-list/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalid-error-code/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/invalid-error-code (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.invalid-error-code/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile-in-use/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/field-level-encryption-profile-in-use (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile-in-use/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.content-type-profile-config/forward-when-content-type-is-unknown (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/content-type-profile-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.content-type-profile-config/forward-when-content-type-is-unknown] :opt-un [:portkey.aws.cloudfront.-2018-06-18/content-type-profiles]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cached-methods/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cached-methods/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/methods-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/cached-methods (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.cached-methods/quantity :portkey.aws.cloudfront.-2018-06-18.cached-methods/items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1008244__auto__] (clojure.core/<= 1 (clojure.core/count s__1008244__auto__))) (clojure.core/fn [s__1008245__auto__] (clojure.core/< (clojure.core/count s__1008245__auto__) 128)) (clojure.core/fn [s__1008246__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__1008246__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.too-many-lambda-function-associations/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/too-many-lambda-function-associations (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.too-many-lambda-function-associations/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.create-streaming-distribution-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.create-streaming-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/create-streaming-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/streaming-distribution :portkey.aws.cloudfront.-2018-06-18.create-streaming-distribution-result/location :portkey.aws.cloudfront.-2018-06-18.create-streaming-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.list-field-level-encryption-profiles-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.list-field-level-encryption-profiles-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/list-field-level-encryption-profiles-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.list-field-level-encryption-profiles-request/marker :portkey.aws.cloudfront.-2018-06-18.list-field-level-encryption-profiles-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.too-many-field-level-encryption-profiles/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/too-many-field-level-encryption-profiles (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.too-many-field-level-encryption-profiles/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.tags/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/tag-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/tags (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.tags/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/streaming-distribution-summary-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-06-18/streaming-distribution-summary))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/query-arg-profile-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-06-18/query-arg-profile))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cache-behaviors/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cache-behaviors/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/cache-behavior-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/cache-behaviors (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.cache-behaviors/quantity] :opt-un [:portkey.aws.cloudfront.-2018-06-18.cache-behaviors/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cache-behavior/smooth-streaming (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cache-behavior/field-level-encryption-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cache-behavior/compress (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cache-behavior/target-origin-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cache-behavior/min-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cache-behavior/path-pattern (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cache-behavior/max-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cache-behavior/default-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/cache-behavior (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.cache-behavior/path-pattern :portkey.aws.cloudfront.-2018-06-18.cache-behavior/target-origin-id :portkey.aws.cloudfront.-2018-06-18/forwarded-values :portkey.aws.cloudfront.-2018-06-18/trusted-signers :portkey.aws.cloudfront.-2018-06-18/viewer-protocol-policy :portkey.aws.cloudfront.-2018-06-18.cache-behavior/min-ttl] :opt-un [:portkey.aws.cloudfront.-2018-06-18.cache-behavior/smooth-streaming :portkey.aws.cloudfront.-2018-06-18.cache-behavior/field-level-encryption-id :portkey.aws.cloudfront.-2018-06-18.cache-behavior/compress :portkey.aws.cloudfront.-2018-06-18/lambda-function-associations :portkey.aws.cloudfront.-2018-06-18.cache-behavior/max-ttl :portkey.aws.cloudfront.-2018-06-18/allowed-methods :portkey.aws.cloudfront.-2018-06-18.cache-behavior/default-ttl]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.no-such-field-level-encryption-profile/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/no-such-field-level-encryption-profile (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.no-such-field-level-encryption-profile/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.list-streaming-distributions-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.list-streaming-distributions-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/list-streaming-distributions-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.list-streaming-distributions-request/marker :portkey.aws.cloudfront.-2018-06-18.list-streaming-distributions-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.active-trusted-signers/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.active-trusted-signers/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.active-trusted-signers/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/signer-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/active-trusted-signers (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.active-trusted-signers/enabled :portkey.aws.cloudfront.-2018-06-18.active-trusted-signers/quantity] :opt-un [:portkey.aws.cloudfront.-2018-06-18.active-trusted-signers/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalid-relative-path/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/invalid-relative-path (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.invalid-relative-path/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.create-public-key-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.create-public-key-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/create-public-key-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/public-key :portkey.aws.cloudfront.-2018-06-18.create-public-key-result/location :portkey.aws.cloudfront.-2018-06-18.create-public-key-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.origin/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.origin/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.origin/origin-path (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/origin (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.origin/id :portkey.aws.cloudfront.-2018-06-18.origin/domain-name] :opt-un [:portkey.aws.cloudfront.-2018-06-18.origin/origin-path :portkey.aws.cloudfront.-2018-06-18/custom-headers :portkey.aws.cloudfront.-2018-06-18/s-3-origin-config :portkey.aws.cloudfront.-2018-06-18/custom-origin-config]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalid-location-code/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/invalid-location-code (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.invalid-location-code/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalid-web-acl-id/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/invalid-web-acl-id (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.invalid-web-acl-id/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalid-origin/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/invalid-origin (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.invalid-origin/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.too-many-cloud-front-origin-access-identities/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/too-many-cloud-front-origin-access-identities (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.too-many-cloud-front-origin-access-identities/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-config-already-exists/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/field-level-encryption-config-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.field-level-encryption-config-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/format #{"URLEncoded" :url-encoded})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.no-such-field-level-encryption-config/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/no-such-field-level-encryption-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.no-such-field-level-encryption-config/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.get-cloud-front-origin-access-identity-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/get-cloud-front-origin-access-identity-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.get-cloud-front-origin-access-identity-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.custom-error-responses/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.custom-error-responses/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/custom-error-response-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/custom-error-responses (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.custom-error-responses/quantity] :opt-un [:portkey.aws.cloudfront.-2018-06-18.custom-error-responses/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalidation-list/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalidation-list/next-marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalidation-list/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalidation-list/is-truncated (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalidation-list/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalidation-list/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/invalidation-summary-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/invalidation-list (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.invalidation-list/marker :portkey.aws.cloudfront.-2018-06-18.invalidation-list/max-items :portkey.aws.cloudfront.-2018-06-18.invalidation-list/is-truncated :portkey.aws.cloudfront.-2018-06-18.invalidation-list/quantity] :opt-un [:portkey.aws.cloudfront.-2018-06-18.invalidation-list/next-marker :portkey.aws.cloudfront.-2018-06-18.invalidation-list/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.origin-ssl-protocols/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.origin-ssl-protocols/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/ssl-protocols-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/origin-ssl-protocols (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.origin-ssl-protocols/quantity :portkey.aws.cloudfront.-2018-06-18.origin-ssl-protocols/items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.aliases/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.aliases/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/alias-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/aliases (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.aliases/quantity] :opt-un [:portkey.aws.cloudfront.-2018-06-18.aliases/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/event-type #{:viewerresponse :originresponse :viewerrequest "viewer-response" :originrequest "origin-response" "origin-request" "viewer-request"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.update-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/update-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/distribution :portkey.aws.cloudfront.-2018-06-18.update-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.content-type-profiles/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.content-type-profiles/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/content-type-profile-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/content-type-profiles (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.content-type-profiles/quantity] :opt-un [:portkey.aws.cloudfront.-2018-06-18.content-type-profiles/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.encryption-entity/public-key-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.encryption-entity/provider-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/encryption-entity (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.encryption-entity/public-key-id :portkey.aws.cloudfront.-2018-06-18.encryption-entity/provider-id :portkey.aws.cloudfront.-2018-06-18/field-patterns] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/lambda-function-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.get-cloud-front-origin-access-identity-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/get-cloud-front-origin-access-identity-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/cloud-front-origin-access-identity :portkey.aws.cloudfront.-2018-06-18.get-cloud-front-origin-access-identity-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.get-field-level-encryption-profile-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/get-field-level-encryption-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.get-field-level-encryption-profile-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.get-streaming-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/get-streaming-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.get-streaming-distribution-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.too-many-field-level-encryption-encryption-entities/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/too-many-field-level-encryption-encryption-entities (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.too-many-field-level-encryption-encryption-entities/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.allowed-methods/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.allowed-methods/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/methods-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/allowed-methods (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.allowed-methods/quantity :portkey.aws.cloudfront.-2018-06-18.allowed-methods/items] :opt-un [:portkey.aws.cloudfront.-2018-06-18/cached-methods]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.get-field-level-encryption-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/get-field-level-encryption-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/field-level-encryption :portkey.aws.cloudfront.-2018-06-18.get-field-level-encryption-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/price-class #{"PriceClass_200" :price-class-100 :price-class-200 "PriceClass_All" :price-class-all "PriceClass_100"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalid-query-string-parameters/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/invalid-query-string-parameters (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.invalid-query-string-parameters/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.custom-origin-config/http-port (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.custom-origin-config/https-port (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.custom-origin-config/origin-read-timeout (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.custom-origin-config/origin-keepalive-timeout (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/custom-origin-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.custom-origin-config/http-port :portkey.aws.cloudfront.-2018-06-18.custom-origin-config/https-port :portkey.aws.cloudfront.-2018-06-18/origin-protocol-policy] :opt-un [:portkey.aws.cloudfront.-2018-06-18/origin-ssl-protocols :portkey.aws.cloudfront.-2018-06-18.custom-origin-config/origin-read-timeout :portkey.aws.cloudfront.-2018-06-18.custom-origin-config/origin-keepalive-timeout]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.public-key-already-exists/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/public-key-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.public-key-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.too-many-origins/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/too-many-origins (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.too-many-origins/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalid-ttl-order/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/invalid-ttl-order (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.invalid-ttl-order/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.list-distributions-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.list-distributions-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/list-distributions-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.list-distributions-request/marker :portkey.aws.cloudfront.-2018-06-18.list-distributions-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.no-such-streaming-distribution/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/no-such-streaming-distribution (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.no-such-streaming-distribution/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.s-3-origin/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.s-3-origin/origin-access-identity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/s-3-origin (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.s-3-origin/domain-name :portkey.aws.cloudfront.-2018-06-18.s-3-origin/origin-access-identity] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.create-cloud-front-origin-access-identity-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.create-cloud-front-origin-access-identity-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/create-cloud-front-origin-access-identity-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/cloud-front-origin-access-identity :portkey.aws.cloudfront.-2018-06-18.create-cloud-front-origin-access-identity-result/location :portkey.aws.cloudfront.-2018-06-18.create-cloud-front-origin-access-identity-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cname-already-exists/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/cname-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.cname-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-summary/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-summary/arn (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-summary/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-summary/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-summary/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-summary/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-summary/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/streaming-distribution-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.streaming-distribution-summary/id :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-summary/arn :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-summary/status :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-summary/last-modified-time :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-summary/domain-name :portkey.aws.cloudfront.-2018-06-18/s-3-origin :portkey.aws.cloudfront.-2018-06-18/aliases :portkey.aws.cloudfront.-2018-06-18/trusted-signers :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-summary/comment :portkey.aws.cloudfront.-2018-06-18/price-class :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-summary/enabled] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalid-default-root-object/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/invalid-default-root-object (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.invalid-default-root-object/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cloud-front-origin-access-identity/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cloud-front-origin-access-identity/s-3-canonical-user-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/cloud-front-origin-access-identity (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.cloud-front-origin-access-identity/id :portkey.aws.cloudfront.-2018-06-18.cloud-front-origin-access-identity/s-3-canonical-user-id] :opt-un [:portkey.aws.cloudfront.-2018-06-18/cloud-front-origin-access-identity-config]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.update-cloud-front-origin-access-identity-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.update-cloud-front-origin-access-identity-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/update-cloud-front-origin-access-identity-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18/cloud-front-origin-access-identity-config :portkey.aws.cloudfront.-2018-06-18.update-cloud-front-origin-access-identity-request/id] :opt-un [:portkey.aws.cloudfront.-2018-06-18.update-cloud-front-origin-access-identity-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.create-invalidation-request/distribution-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/create-invalidation-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.create-invalidation-request/distribution-id :portkey.aws.cloudfront.-2018-06-18/invalidation-batch] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.get-field-level-encryption-profile-config-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/get-field-level-encryption-profile-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.get-field-level-encryption-profile-config-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.tag-resource-request/resource (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/resource-arn))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/tag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.tag-resource-request/resource :portkey.aws.cloudfront.-2018-06-18/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/create-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18/distribution-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/create-streaming-distribution-with-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18/streaming-distribution-config-with-tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalid-response-code/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/invalid-response-code (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.invalid-response-code/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.list-field-level-encryption-configs-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.list-field-level-encryption-configs-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/list-field-level-encryption-configs-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.list-field-level-encryption-configs-request/marker :portkey.aws.cloudfront.-2018-06-18.list-field-level-encryption-configs-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/cookie-name-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-06-18/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.field-level-encryption/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.field-level-encryption/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/field-level-encryption (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.field-level-encryption/id :portkey.aws.cloudfront.-2018-06-18.field-level-encryption/last-modified-time :portkey.aws.cloudfront.-2018-06-18/field-level-encryption-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/tag-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-06-18/tag))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.query-string-cache-keys/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.query-string-cache-keys/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/query-string-cache-keys-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/query-string-cache-keys (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.query-string-cache-keys/quantity] :opt-un [:portkey.aws.cloudfront.-2018-06-18.query-string-cache-keys/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.no-such-invalidation/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/no-such-invalidation (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.no-such-invalidation/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.get-distribution-config-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/get-distribution-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.get-distribution-config-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.key-pair-ids/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.key-pair-ids/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/key-pair-id-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/key-pair-ids (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.key-pair-ids/quantity] :opt-un [:portkey.aws.cloudfront.-2018-06-18.key-pair-ids/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.distribution-config/default-root-object (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.distribution-config/caller-reference (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.distribution-config/is-ipv-6-enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.distribution-config/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.distribution-config/web-acl-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.distribution-config/logging (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/logging-config))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.distribution-config/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/distribution-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.distribution-config/caller-reference :portkey.aws.cloudfront.-2018-06-18/origins :portkey.aws.cloudfront.-2018-06-18/default-cache-behavior :portkey.aws.cloudfront.-2018-06-18.distribution-config/comment :portkey.aws.cloudfront.-2018-06-18.distribution-config/enabled] :opt-un [:portkey.aws.cloudfront.-2018-06-18.distribution-config/default-root-object :portkey.aws.cloudfront.-2018-06-18.distribution-config/is-ipv-6-enabled :portkey.aws.cloudfront.-2018-06-18/restrictions :portkey.aws.cloudfront.-2018-06-18.distribution-config/web-acl-id :portkey.aws.cloudfront.-2018-06-18.distribution-config/logging :portkey.aws.cloudfront.-2018-06-18/cache-behaviors :portkey.aws.cloudfront.-2018-06-18/custom-error-responses :portkey.aws.cloudfront.-2018-06-18/aliases :portkey.aws.cloudfront.-2018-06-18/price-class :portkey.aws.cloudfront.-2018-06-18/http-version :portkey.aws.cloudfront.-2018-06-18/viewer-certificate]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-06-18/tag-key))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.too-many-invalidations-in-progress/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/too-many-invalidations-in-progress (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.too-many-invalidations-in-progress/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.get-public-key-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/get-public-key-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/public-key :portkey.aws.cloudfront.-2018-06-18.get-public-key-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/create-streaming-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18/streaming-distribution-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.too-many-distributions-associated-to-field-level-encryption-config/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/too-many-distributions-associated-to-field-level-encryption-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.too-many-distributions-associated-to-field-level-encryption-config/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/list-cloud-front-origin-access-identities-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/cloud-front-origin-access-identity-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.update-public-key-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/update-public-key-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/public-key :portkey.aws.cloudfront.-2018-06-18.update-public-key-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.update-field-level-encryption-config-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.update-field-level-encryption-config-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/update-field-level-encryption-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18/field-level-encryption-config :portkey.aws.cloudfront.-2018-06-18.update-field-level-encryption-config-request/id] :opt-un [:portkey.aws.cloudfront.-2018-06-18.update-field-level-encryption-config-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalid-forward-cookies/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/invalid-forward-cookies (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.invalid-forward-cookies/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.public-key-summary/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.public-key-summary/name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.public-key-summary/created-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.public-key-summary/encoded-key (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.public-key-summary/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/public-key-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.public-key-summary/id :portkey.aws.cloudfront.-2018-06-18.public-key-summary/name :portkey.aws.cloudfront.-2018-06-18.public-key-summary/created-time :portkey.aws.cloudfront.-2018-06-18.public-key-summary/encoded-key] :opt-un [:portkey.aws.cloudfront.-2018-06-18.public-key-summary/comment]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.get-field-level-encryption-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/get-field-level-encryption-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.get-field-level-encryption-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.get-distribution-config-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/get-distribution-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/distribution-config :portkey.aws.cloudfront.-2018-06-18.get-distribution-config-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalid-required-protocol/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/invalid-required-protocol (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.invalid-required-protocol/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.update-field-level-encryption-config-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/update-field-level-encryption-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/field-level-encryption :portkey.aws.cloudfront.-2018-06-18.update-field-level-encryption-config-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/ssl-protocols-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-06-18/ssl-protocol))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/aws-account-number-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-06-18/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.list-public-keys-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.list-public-keys-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/list-public-keys-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.list-public-keys-request/marker :portkey.aws.cloudfront.-2018-06-18.list-public-keys-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1008244__auto__] (clojure.core/<= 0 (clojure.core/count s__1008244__auto__))) (clojure.core/fn [s__1008245__auto__] (clojure.core/< (clojure.core/count s__1008245__auto__) 256)) (clojure.core/fn [s__1008246__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__1008246__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/method #{"DELETE" :get "OPTIONS" :patch "PATCH" :delete :head "HEAD" "POST" :post :options :put "GET" "PUT"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.get-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/get-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/distribution :portkey.aws.cloudfront.-2018-06-18.get-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.update-field-level-encryption-profile-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/update-field-level-encryption-profile-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/field-level-encryption-profile :portkey.aws.cloudfront.-2018-06-18.update-field-level-encryption-profile-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/alias-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-06-18/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.get-streaming-distribution-config-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/get-streaming-distribution-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/streaming-distribution-config :portkey.aws.cloudfront.-2018-06-18.get-streaming-distribution-config-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/origin-custom-headers-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-06-18/origin-custom-header))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/create-cloud-front-origin-access-identity-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18/cloud-front-origin-access-identity-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.get-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/get-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.get-distribution-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.query-arg-profile-config/forward-when-query-arg-profile-is-unknown (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/query-arg-profile-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.query-arg-profile-config/forward-when-query-arg-profile-is-unknown] :opt-un [:portkey.aws.cloudfront.-2018-06-18/query-arg-profiles]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/origin-protocol-policy #{"match-viewer" :matchviewer :httpsonly :httponly "https-only" "http-only"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/signer-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-06-18/signer))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/list-public-keys-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/public-key-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalid-headers-for-s-3-origin/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/invalid-headers-for-s-3-origin (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.invalid-headers-for-s-3-origin/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.get-field-level-encryption-config-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/get-field-level-encryption-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/field-level-encryption-config :portkey.aws.cloudfront.-2018-06-18.get-field-level-encryption-config-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.too-many-field-level-encryption-configs/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/too-many-field-level-encryption-configs (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.too-many-field-level-encryption-configs/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.query-arg-profiles/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.query-arg-profiles/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/query-arg-profile-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/query-arg-profiles (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.query-arg-profiles/quantity] :opt-un [:portkey.aws.cloudfront.-2018-06-18.query-arg-profiles/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/path-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-06-18/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-config-in-use/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/field-level-encryption-config-in-use (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.field-level-encryption-config-in-use/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.too-many-distribution-cnam-es/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/too-many-distribution-cnam-es (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.too-many-distribution-cnam-es/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/geo-restriction-type #{"none" "whitelist" "blacklist" :blacklist :whitelist :none})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalid-geo-restriction-parameter/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/invalid-geo-restriction-parameter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.invalid-geo-restriction-parameter/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.no-such-cloud-front-origin-access-identity/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/no-such-cloud-front-origin-access-identity (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.no-such-cloud-front-origin-access-identity/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/list-invalidations-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/invalidation-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.paths/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.paths/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/path-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/paths (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.paths/quantity] :opt-un [:portkey.aws.cloudfront.-2018-06-18.paths/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/field-level-encryption-summary-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-06-18/field-level-encryption-summary))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.batch-too-large/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/batch-too-large (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.batch-too-large/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.create-distribution-with-tags-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.create-distribution-with-tags-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/create-distribution-with-tags-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/distribution :portkey.aws.cloudfront.-2018-06-18.create-distribution-with-tags-result/location :portkey.aws.cloudfront.-2018-06-18.create-distribution-with-tags-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.too-many-field-level-encryption-query-arg-profiles/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/too-many-field-level-encryption-query-arg-profiles (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.too-many-field-level-encryption-query-arg-profiles/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.update-streaming-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.update-streaming-distribution-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/update-streaming-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18/streaming-distribution-config :portkey.aws.cloudfront.-2018-06-18.update-streaming-distribution-request/id] :opt-un [:portkey.aws.cloudfront.-2018-06-18.update-streaming-distribution-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/list-streaming-distributions-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/streaming-distribution-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.create-streaming-distribution-with-tags-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.create-streaming-distribution-with-tags-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/create-streaming-distribution-with-tags-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/streaming-distribution :portkey.aws.cloudfront.-2018-06-18.create-streaming-distribution-with-tags-result/location :portkey.aws.cloudfront.-2018-06-18.create-streaming-distribution-with-tags-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.create-invalidation-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/create-invalidation-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.create-invalidation-result/location :portkey.aws.cloudfront.-2018-06-18/invalidation]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.missing-body/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/missing-body (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.missing-body/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalid-origin-read-timeout/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/invalid-origin-read-timeout (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.invalid-origin-read-timeout/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cloud-front-origin-access-identity-summary/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cloud-front-origin-access-identity-summary/s-3-canonical-user-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cloud-front-origin-access-identity-summary/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/cloud-front-origin-access-identity-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.cloud-front-origin-access-identity-summary/id :portkey.aws.cloudfront.-2018-06-18.cloud-front-origin-access-identity-summary/s-3-canonical-user-id :portkey.aws.cloudfront.-2018-06-18.cloud-front-origin-access-identity-summary/comment] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.get-cloud-front-origin-access-identity-config-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/get-cloud-front-origin-access-identity-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/cloud-front-origin-access-identity-config :portkey.aws.cloudfront.-2018-06-18.get-cloud-front-origin-access-identity-config-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/cache-behavior-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-06-18/cache-behavior))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.origin-custom-header/header-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.origin-custom-header/header-value (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/origin-custom-header (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.origin-custom-header/header-name :portkey.aws.cloudfront.-2018-06-18.origin-custom-header/header-value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-config/caller-reference (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-config/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-config/logging (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/streaming-logging-config))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-config/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/streaming-distribution-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.streaming-distribution-config/caller-reference :portkey.aws.cloudfront.-2018-06-18/s-3-origin :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-config/comment :portkey.aws.cloudfront.-2018-06-18/trusted-signers :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-config/enabled] :opt-un [:portkey.aws.cloudfront.-2018-06-18/aliases :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-config/logging :portkey.aws.cloudfront.-2018-06-18/price-class]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.distribution-not-disabled/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/distribution-not-disabled (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.distribution-not-disabled/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/public-key-summary-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-06-18/public-key-summary))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cloud-front-origin-access-identity-already-exists/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/cloud-front-origin-access-identity-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.cloud-front-origin-access-identity-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/field-pattern-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-06-18/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.precondition-failed/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/precondition-failed (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.precondition-failed/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.s-3-origin-config/origin-access-identity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/s-3-origin-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.s-3-origin-config/origin-access-identity] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.distribution-already-exists/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/distribution-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.distribution-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/cloud-front-origin-access-identity-summary-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-06-18/cloud-front-origin-access-identity-summary))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalid-origin-access-identity/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/invalid-origin-access-identity (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.invalid-origin-access-identity/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.tag/key (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/tag-key))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.tag/value (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/tag-value))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.tag/key] :opt-un [:portkey.aws.cloudfront.-2018-06-18.tag/value]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.too-many-trusted-signers/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/too-many-trusted-signers (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.too-many-trusted-signers/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.streaming-logging-config/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.streaming-logging-config/bucket (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.streaming-logging-config/prefix (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/streaming-logging-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.streaming-logging-config/enabled :portkey.aws.cloudfront.-2018-06-18.streaming-logging-config/bucket :portkey.aws.cloudfront.-2018-06-18.streaming-logging-config/prefix] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.too-many-public-keys/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/too-many-public-keys (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.too-many-public-keys/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalid-minimum-protocol-version/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/invalid-minimum-protocol-version (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.invalid-minimum-protocol-version/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.update-field-level-encryption-profile-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.update-field-level-encryption-profile-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/update-field-level-encryption-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18/field-level-encryption-profile-config :portkey.aws.cloudfront.-2018-06-18.update-field-level-encryption-profile-request/id] :opt-un [:portkey.aws.cloudfront.-2018-06-18.update-field-level-encryption-profile-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-summary/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-summary/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-summary/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/field-level-encryption-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.field-level-encryption-summary/id :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-summary/last-modified-time] :opt-un [:portkey.aws.cloudfront.-2018-06-18.field-level-encryption-summary/comment :portkey.aws.cloudfront.-2018-06-18/query-arg-profile-config :portkey.aws.cloudfront.-2018-06-18/content-type-profile-config]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.distribution-summary/is-ipv-6-enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.distribution-summary/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.distribution-summary/web-acl-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.distribution-summary/arn (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.distribution-summary/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.distribution-summary/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.distribution-summary/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.distribution-summary/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.distribution-summary/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/distribution-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.distribution-summary/id :portkey.aws.cloudfront.-2018-06-18.distribution-summary/arn :portkey.aws.cloudfront.-2018-06-18.distribution-summary/status :portkey.aws.cloudfront.-2018-06-18.distribution-summary/last-modified-time :portkey.aws.cloudfront.-2018-06-18.distribution-summary/domain-name :portkey.aws.cloudfront.-2018-06-18/aliases :portkey.aws.cloudfront.-2018-06-18/origins :portkey.aws.cloudfront.-2018-06-18/default-cache-behavior :portkey.aws.cloudfront.-2018-06-18/cache-behaviors :portkey.aws.cloudfront.-2018-06-18/custom-error-responses :portkey.aws.cloudfront.-2018-06-18.distribution-summary/comment :portkey.aws.cloudfront.-2018-06-18/price-class :portkey.aws.cloudfront.-2018-06-18.distribution-summary/enabled :portkey.aws.cloudfront.-2018-06-18/viewer-certificate :portkey.aws.cloudfront.-2018-06-18/restrictions :portkey.aws.cloudfront.-2018-06-18.distribution-summary/web-acl-id :portkey.aws.cloudfront.-2018-06-18/http-version :portkey.aws.cloudfront.-2018-06-18.distribution-summary/is-ipv-6-enabled] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/ssl-protocol #{"TLSv1" :tl-sv-12 :tl-sv-1 "TLSv1.2" :ss-lv-3 "SSLv3" "TLSv1.1" :tl-sv-11})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-already-exists/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/streaming-distribution-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.streaming-distribution-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.public-key-in-use/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/public-key-in-use (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.public-key-in-use/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/lambda-function-association-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-06-18/lambda-function-association))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.headers/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.headers/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/header-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/headers (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.headers/quantity] :opt-un [:portkey.aws.cloudfront.-2018-06-18.headers/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/minimum-protocol-version #{"TLSv1" :tl-sv-1 "TLSv1_2016" :tl-sv-12-2018 :ss-lv-3 "TLSv1.2_2018" "SSLv3" :tl-sv-11-2016 :tl-sv-1-2016 "TLSv1.1_2016"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.origins/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.origins/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/origin-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/origins (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.origins/quantity] :opt-un [:portkey.aws.cloudfront.-2018-06-18.origins/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/distribution-config-with-tags (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18/distribution-config :portkey.aws.cloudfront.-2018-06-18/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/header-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-06-18/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalid-if-match-version/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/invalid-if-match-version (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.invalid-if-match-version/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/list-field-level-encryption-profiles-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/field-level-encryption-profile-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.delete-public-key-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.delete-public-key-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/delete-public-key-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.delete-public-key-request/id] :opt-un [:portkey.aws.cloudfront.-2018-06-18.delete-public-key-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.create-distribution-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.create-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/create-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/distribution :portkey.aws.cloudfront.-2018-06-18.create-distribution-result/location :portkey.aws.cloudfront.-2018-06-18.create-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.delete-cloud-front-origin-access-identity-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.delete-cloud-front-origin-access-identity-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/delete-cloud-front-origin-access-identity-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.delete-cloud-front-origin-access-identity-request/id] :opt-un [:portkey.aws.cloudfront.-2018-06-18.delete-cloud-front-origin-access-identity-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.too-many-distributions/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/too-many-distributions (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.too-many-distributions/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/list-field-level-encryption-configs-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/field-level-encryption-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.no-such-distribution/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/no-such-distribution (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.no-such-distribution/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.get-invalidation-request/distribution-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.get-invalidation-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/get-invalidation-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.get-invalidation-request/distribution-id :portkey.aws.cloudfront.-2018-06-18.get-invalidation-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.query-arg-profile-empty/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/query-arg-profile-empty (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.query-arg-profile-empty/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/resource-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1008246__auto__] (clojure.core/re-matches #"arn:aws:cloudfront::[0-9]+:.*" s__1008246__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.distribution-list/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.distribution-list/next-marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.distribution-list/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.distribution-list/is-truncated (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.distribution-list/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.distribution-list/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/distribution-summary-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/distribution-list (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.distribution-list/marker :portkey.aws.cloudfront.-2018-06-18.distribution-list/max-items :portkey.aws.cloudfront.-2018-06-18.distribution-list/is-truncated :portkey.aws.cloudfront.-2018-06-18.distribution-list/quantity] :opt-un [:portkey.aws.cloudfront.-2018-06-18.distribution-list/next-marker :portkey.aws.cloudfront.-2018-06-18.distribution-list/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.update-streaming-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/update-streaming-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/streaming-distribution :portkey.aws.cloudfront.-2018-06-18.update-streaming-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.illegal-update/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/illegal-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.illegal-update/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/ssl-support-method #{"sni-only" :snionly :vip "vip"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.get-field-level-encryption-profile-config-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/get-field-level-encryption-profile-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/field-level-encryption-profile-config :portkey.aws.cloudfront.-2018-06-18.get-field-level-encryption-profile-config-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/http-version #{:http-11 "http2" :http-2 "http1.1"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.too-many-field-level-encryption-content-type-profiles/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/too-many-field-level-encryption-content-type-profiles (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.too-many-field-level-encryption-content-type-profiles/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cookie-preference/forward (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/item-selection))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cookie-preference/whitelisted-names (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/cookie-names))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/cookie-preference (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.cookie-preference/forward] :opt-un [:portkey.aws.cloudfront.-2018-06-18.cookie-preference/whitelisted-names]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.custom-headers/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.custom-headers/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/origin-custom-headers-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/custom-headers (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.custom-headers/quantity] :opt-un [:portkey.aws.cloudfront.-2018-06-18.custom-headers/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalid-origin-keepalive-timeout/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/invalid-origin-keepalive-timeout (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.invalid-origin-keepalive-timeout/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.inconsistent-quantities/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/inconsistent-quantities (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.inconsistent-quantities/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.delete-field-level-encryption-profile-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.delete-field-level-encryption-profile-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/delete-field-level-encryption-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.delete-field-level-encryption-profile-request/id] :opt-un [:portkey.aws.cloudfront.-2018-06-18.delete-field-level-encryption-profile-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/list-distributions-by-web-acl-id-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/distribution-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.list-invalidations-request/distribution-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.list-invalidations-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.list-invalidations-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/list-invalidations-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.list-invalidations-request/distribution-id] :opt-un [:portkey.aws.cloudfront.-2018-06-18.list-invalidations-request/marker :portkey.aws.cloudfront.-2018-06-18.list-invalidations-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.too-many-query-string-parameters/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/too-many-query-string-parameters (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.too-many-query-string-parameters/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/methods-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-06-18/method))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.untag-resource-request/resource (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/resource-arn))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/untag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.untag-resource-request/resource :portkey.aws.cloudfront.-2018-06-18/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.public-key-list/next-marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.public-key-list/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.public-key-list/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.public-key-list/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/public-key-summary-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/public-key-list (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.public-key-list/max-items :portkey.aws.cloudfront.-2018-06-18.public-key-list/quantity] :opt-un [:portkey.aws.cloudfront.-2018-06-18.public-key-list/next-marker :portkey.aws.cloudfront.-2018-06-18.public-key-list/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalid-tagging/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/invalid-tagging (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.invalid-tagging/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.default-cache-behavior/smooth-streaming (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.default-cache-behavior/field-level-encryption-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.default-cache-behavior/compress (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.default-cache-behavior/target-origin-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.default-cache-behavior/min-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.default-cache-behavior/max-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.default-cache-behavior/default-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/default-cache-behavior (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.default-cache-behavior/target-origin-id :portkey.aws.cloudfront.-2018-06-18/forwarded-values :portkey.aws.cloudfront.-2018-06-18/trusted-signers :portkey.aws.cloudfront.-2018-06-18/viewer-protocol-policy :portkey.aws.cloudfront.-2018-06-18.default-cache-behavior/min-ttl] :opt-un [:portkey.aws.cloudfront.-2018-06-18.default-cache-behavior/smooth-streaming :portkey.aws.cloudfront.-2018-06-18.default-cache-behavior/field-level-encryption-id :portkey.aws.cloudfront.-2018-06-18.default-cache-behavior/compress :portkey.aws.cloudfront.-2018-06-18/lambda-function-associations :portkey.aws.cloudfront.-2018-06-18.default-cache-behavior/max-ttl :portkey.aws.cloudfront.-2018-06-18/allowed-methods :portkey.aws.cloudfront.-2018-06-18.default-cache-behavior/default-ttl]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.trusted-signers/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.trusted-signers/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.trusted-signers/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/aws-account-number-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/trusted-signers (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.trusted-signers/enabled :portkey.aws.cloudfront.-2018-06-18.trusted-signers/quantity] :opt-un [:portkey.aws.cloudfront.-2018-06-18.trusted-signers/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/list-distributions-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/distribution-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.delete-field-level-encryption-config-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.delete-field-level-encryption-config-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/delete-field-level-encryption-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.delete-field-level-encryption-config-request/id] :opt-un [:portkey.aws.cloudfront.-2018-06-18.delete-field-level-encryption-config-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.trusted-signer-does-not-exist/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/trusted-signer-does-not-exist (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.trusted-signer-does-not-exist/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.too-many-field-level-encryption-field-patterns/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/too-many-field-level-encryption-field-patterns (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.too-many-field-level-encryption-field-patterns/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-list/next-marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-list/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-list/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-list/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/field-level-encryption-summary-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/field-level-encryption-list (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.field-level-encryption-list/max-items :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-list/quantity] :opt-un [:portkey.aws.cloudfront.-2018-06-18.field-level-encryption-list/next-marker :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-list/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.public-key/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.public-key/created-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/public-key (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.public-key/id :portkey.aws.cloudfront.-2018-06-18.public-key/created-time :portkey.aws.cloudfront.-2018-06-18/public-key-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.update-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.update-distribution-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/update-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18/distribution-config :portkey.aws.cloudfront.-2018-06-18.update-distribution-request/id] :opt-un [:portkey.aws.cloudfront.-2018-06-18.update-distribution-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/field-level-encryption-profile-summary-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-06-18/field-level-encryption-profile-summary))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/get-invalidation-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/invalidation]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.too-many-headers-in-forwarded-values/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/too-many-headers-in-forwarded-values (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.too-many-headers-in-forwarded-values/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/create-public-key-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18/public-key-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.viewer-certificate/cloud-front-default-certificate (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.viewer-certificate/iam-certificate-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.viewer-certificate/acm-certificate-arn (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.viewer-certificate/certificate (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/viewer-certificate (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.viewer-certificate/cloud-front-default-certificate :portkey.aws.cloudfront.-2018-06-18.viewer-certificate/iam-certificate-id :portkey.aws.cloudfront.-2018-06-18.viewer-certificate/acm-certificate-arn :portkey.aws.cloudfront.-2018-06-18/ssl-support-method :portkey.aws.cloudfront.-2018-06-18/minimum-protocol-version :portkey.aws.cloudfront.-2018-06-18.viewer-certificate/certificate :portkey.aws.cloudfront.-2018-06-18/certificate-source]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.list-cloud-front-origin-access-identities-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.list-cloud-front-origin-access-identities-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/list-cloud-front-origin-access-identities-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.list-cloud-front-origin-access-identities-request/marker :portkey.aws.cloudfront.-2018-06-18.list-cloud-front-origin-access-identities-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cloud-front-origin-access-identity-config/caller-reference (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cloud-front-origin-access-identity-config/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/cloud-front-origin-access-identity-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.cloud-front-origin-access-identity-config/caller-reference :portkey.aws.cloudfront.-2018-06-18.cloud-front-origin-access-identity-config/comment] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.geo-restriction/restriction-type (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/geo-restriction-type))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.geo-restriction/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.geo-restriction/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/location-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/geo-restriction (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.geo-restriction/restriction-type :portkey.aws.cloudfront.-2018-06-18.geo-restriction/quantity] :opt-un [:portkey.aws.cloudfront.-2018-06-18.geo-restriction/items]))

(clojure.core/defn tag-resource-2018-06-18 ([tag-resource-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-tag-resource-request tag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/tagging?Operation=Tag", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/tag-resource-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 204, :http.request.configuration/action "TagResource2018_06_18", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1009047__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied, "InvalidArgument" :portkey.aws.cloudfront.-2018-06-18/invalid-argument, "InvalidTagging" :portkey.aws.cloudfront.-2018-06-18/invalid-tagging, "NoSuchResource" :portkey.aws.cloudfront.-2018-06-18/no-such-resource}})))))
(clojure.spec.alpha/fdef tag-resource-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/tag-resource-request) :ret clojure.core/true?)

(clojure.core/defn get-distribution-2018-06-18 ([get-distribution-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-get-distribution-request get-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/get-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/distribution/{Id}", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/get-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetDistribution2018_06_18", :http.request.configuration/output-deser-fn deser-get-distribution-result, :http.request.spec/error-spec {"NoSuchDistribution" :portkey.aws.cloudfront.-2018-06-18/no-such-distribution, "AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied}})))))
(clojure.spec.alpha/fdef get-distribution-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/get-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/get-distribution-result))

(clojure.core/defn get-public-key-2018-06-18 ([get-public-key-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-get-public-key-request get-public-key-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/get-public-key-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/public-key/{Id}", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/get-public-key-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetPublicKey2018_06_18", :http.request.configuration/output-deser-fn deser-get-public-key-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied, "NoSuchPublicKey" :portkey.aws.cloudfront.-2018-06-18/no-such-public-key}})))))
(clojure.spec.alpha/fdef get-public-key-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/get-public-key-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/get-public-key-result))

(clojure.core/defn create-streaming-distribution-with-tags-2018-06-18 ([create-streaming-distribution-with-tags-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-create-streaming-distribution-with-tags-request create-streaming-distribution-with-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/create-streaming-distribution-with-tags-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/streaming-distribution?WithTags", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/create-streaming-distribution-with-tags-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateStreamingDistributionWithTags2018_06_18", :http.request.configuration/output-deser-fn deser-create-streaming-distribution-with-tags-result, :http.request.spec/error-spec {"TooManyStreamingDistributions" :portkey.aws.cloudfront.-2018-06-18/too-many-streaming-distributions, "TooManyStreamingDistributionCNAMEs" :portkey.aws.cloudfront.-2018-06-18/too-many-streaming-distribution-cnam-es, "InvalidArgument" :portkey.aws.cloudfront.-2018-06-18/invalid-argument, "AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied, "InvalidOrigin" :portkey.aws.cloudfront.-2018-06-18/invalid-origin, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2018-06-18/cname-already-exists, "MissingBody" :portkey.aws.cloudfront.-2018-06-18/missing-body, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2018-06-18/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2018-06-18/too-many-trusted-signers, "StreamingDistributionAlreadyExists" :portkey.aws.cloudfront.-2018-06-18/streaming-distribution-already-exists, "InconsistentQuantities" :portkey.aws.cloudfront.-2018-06-18/inconsistent-quantities, "InvalidTagging" :portkey.aws.cloudfront.-2018-06-18/invalid-tagging, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2018-06-18/trusted-signer-does-not-exist}})))))
(clojure.spec.alpha/fdef create-streaming-distribution-with-tags-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/create-streaming-distribution-with-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/create-streaming-distribution-with-tags-result))

(clojure.core/defn update-distribution-2018-06-18 ([update-distribution-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-update-distribution-request update-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/update-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/distribution/{Id}/config", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/update-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateDistribution2018_06_18", :http.request.configuration/output-deser-fn deser-update-distribution-result, :http.request.spec/error-spec {"TooManyDistributionsWithLambdaAssociations" :portkey.aws.cloudfront.-2018-06-18/too-many-distributions-with-lambda-associations, "NoSuchOrigin" :portkey.aws.cloudfront.-2018-06-18/no-such-origin, "TooManyCookieNamesInWhiteList" :portkey.aws.cloudfront.-2018-06-18/too-many-cookie-names-in-white-list, "TooManyCacheBehaviors" :portkey.aws.cloudfront.-2018-06-18/too-many-cache-behaviors, "TooManyOriginCustomHeaders" :portkey.aws.cloudfront.-2018-06-18/too-many-origin-custom-headers, "InvalidViewerCertificate" :portkey.aws.cloudfront.-2018-06-18/invalid-viewer-certificate, "InvalidArgument" :portkey.aws.cloudfront.-2018-06-18/invalid-argument, "IllegalFieldLevelEncryptionConfigAssociationWithCacheBehavior" :portkey.aws.cloudfront.-2018-06-18/illegal-field-level-encryption-config-association-with-cache-behavior, "TooManyCertificates" :portkey.aws.cloudfront.-2018-06-18/too-many-certificates, "AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied, "InvalidLambdaFunctionAssociation" :portkey.aws.cloudfront.-2018-06-18/invalid-lambda-function-association, "InvalidErrorCode" :portkey.aws.cloudfront.-2018-06-18/invalid-error-code, "TooManyLambdaFunctionAssociations" :portkey.aws.cloudfront.-2018-06-18/too-many-lambda-function-associations, "InvalidRelativePath" :portkey.aws.cloudfront.-2018-06-18/invalid-relative-path, "InvalidLocationCode" :portkey.aws.cloudfront.-2018-06-18/invalid-location-code, "InvalidWebACLId" :portkey.aws.cloudfront.-2018-06-18/invalid-web-acl-id, "NoSuchFieldLevelEncryptionConfig" :portkey.aws.cloudfront.-2018-06-18/no-such-field-level-encryption-config, "InvalidQueryStringParameters" :portkey.aws.cloudfront.-2018-06-18/invalid-query-string-parameters, "TooManyOrigins" :portkey.aws.cloudfront.-2018-06-18/too-many-origins, "InvalidTTLOrder" :portkey.aws.cloudfront.-2018-06-18/invalid-ttl-order, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2018-06-18/cname-already-exists, "InvalidDefaultRootObject" :portkey.aws.cloudfront.-2018-06-18/invalid-default-root-object, "InvalidResponseCode" :portkey.aws.cloudfront.-2018-06-18/invalid-response-code, "TooManyDistributionsAssociatedToFieldLevelEncryptionConfig" :portkey.aws.cloudfront.-2018-06-18/too-many-distributions-associated-to-field-level-encryption-config, "InvalidForwardCookies" :portkey.aws.cloudfront.-2018-06-18/invalid-forward-cookies, "InvalidRequiredProtocol" :portkey.aws.cloudfront.-2018-06-18/invalid-required-protocol, "InvalidHeadersForS3Origin" :portkey.aws.cloudfront.-2018-06-18/invalid-headers-for-s-3-origin, "TooManyDistributionCNAMEs" :portkey.aws.cloudfront.-2018-06-18/too-many-distribution-cnam-es, "InvalidGeoRestrictionParameter" :portkey.aws.cloudfront.-2018-06-18/invalid-geo-restriction-parameter, "MissingBody" :portkey.aws.cloudfront.-2018-06-18/missing-body, "InvalidOriginReadTimeout" :portkey.aws.cloudfront.-2018-06-18/invalid-origin-read-timeout, "PreconditionFailed" :portkey.aws.cloudfront.-2018-06-18/precondition-failed, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2018-06-18/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2018-06-18/too-many-trusted-signers, "InvalidMinimumProtocolVersion" :portkey.aws.cloudfront.-2018-06-18/invalid-minimum-protocol-version, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2018-06-18/invalid-if-match-version, "NoSuchDistribution" :portkey.aws.cloudfront.-2018-06-18/no-such-distribution, "IllegalUpdate" :portkey.aws.cloudfront.-2018-06-18/illegal-update, "InvalidOriginKeepaliveTimeout" :portkey.aws.cloudfront.-2018-06-18/invalid-origin-keepalive-timeout, "InconsistentQuantities" :portkey.aws.cloudfront.-2018-06-18/inconsistent-quantities, "TooManyQueryStringParameters" :portkey.aws.cloudfront.-2018-06-18/too-many-query-string-parameters, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2018-06-18/trusted-signer-does-not-exist, "TooManyHeadersInForwardedValues" :portkey.aws.cloudfront.-2018-06-18/too-many-headers-in-forwarded-values}})))))
(clojure.spec.alpha/fdef update-distribution-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/update-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/update-distribution-result))

(clojure.core/defn update-field-level-encryption-profile-2018-06-18 ([update-field-level-encryption-profile-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-update-field-level-encryption-profile-request update-field-level-encryption-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/update-field-level-encryption-profile-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/field-level-encryption-profile/{Id}/config", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/update-field-level-encryption-profile-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateFieldLevelEncryptionProfile2018_06_18", :http.request.configuration/output-deser-fn deser-update-field-level-encryption-profile-result, :http.request.spec/error-spec {"FieldLevelEncryptionProfileAlreadyExists" :portkey.aws.cloudfront.-2018-06-18/field-level-encryption-profile-already-exists, "InvalidArgument" :portkey.aws.cloudfront.-2018-06-18/invalid-argument, "NoSuchPublicKey" :portkey.aws.cloudfront.-2018-06-18/no-such-public-key, "AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied, "FieldLevelEncryptionProfileSizeExceeded" :portkey.aws.cloudfront.-2018-06-18/field-level-encryption-profile-size-exceeded, "NoSuchFieldLevelEncryptionProfile" :portkey.aws.cloudfront.-2018-06-18/no-such-field-level-encryption-profile, "TooManyFieldLevelEncryptionEncryptionEntities" :portkey.aws.cloudfront.-2018-06-18/too-many-field-level-encryption-encryption-entities, "PreconditionFailed" :portkey.aws.cloudfront.-2018-06-18/precondition-failed, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2018-06-18/invalid-if-match-version, "IllegalUpdate" :portkey.aws.cloudfront.-2018-06-18/illegal-update, "InconsistentQuantities" :portkey.aws.cloudfront.-2018-06-18/inconsistent-quantities, "TooManyFieldLevelEncryptionFieldPatterns" :portkey.aws.cloudfront.-2018-06-18/too-many-field-level-encryption-field-patterns}})))))
(clojure.spec.alpha/fdef update-field-level-encryption-profile-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/update-field-level-encryption-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/update-field-level-encryption-profile-result))

(clojure.core/defn delete-streaming-distribution-2018-06-18 ([delete-streaming-distribution-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-delete-streaming-distribution-request delete-streaming-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/streaming-distribution/{Id}", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/delete-streaming-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/action "DeleteStreamingDistribution2018_06_18", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1009047__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied, "StreamingDistributionNotDisabled" :portkey.aws.cloudfront.-2018-06-18/streaming-distribution-not-disabled, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2018-06-18/invalid-if-match-version, "NoSuchStreamingDistribution" :portkey.aws.cloudfront.-2018-06-18/no-such-streaming-distribution, "PreconditionFailed" :portkey.aws.cloudfront.-2018-06-18/precondition-failed}})))))
(clojure.spec.alpha/fdef delete-streaming-distribution-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/delete-streaming-distribution-request) :ret clojure.core/true?)

(clojure.core/defn delete-cloud-front-origin-access-identity-2018-06-18 ([delete-cloud-front-origin-access-identity-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-delete-cloud-front-origin-access-identity-request delete-cloud-front-origin-access-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/origin-access-identity/cloudfront/{Id}", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/delete-cloud-front-origin-access-identity-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/action "DeleteCloudFrontOriginAccessIdentity2018_06_18", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1009047__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2018-06-18/invalid-if-match-version, "NoSuchCloudFrontOriginAccessIdentity" :portkey.aws.cloudfront.-2018-06-18/no-such-cloud-front-origin-access-identity, "PreconditionFailed" :portkey.aws.cloudfront.-2018-06-18/precondition-failed, "CloudFrontOriginAccessIdentityInUse" :portkey.aws.cloudfront.-2018-06-18/cloud-front-origin-access-identity-in-use}})))))
(clojure.spec.alpha/fdef delete-cloud-front-origin-access-identity-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/delete-cloud-front-origin-access-identity-request) :ret clojure.core/true?)

(clojure.core/defn create-distribution-with-tags-2018-06-18 ([create-distribution-with-tags-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-create-distribution-with-tags-request create-distribution-with-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/create-distribution-with-tags-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/distribution?WithTags", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/create-distribution-with-tags-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateDistributionWithTags2018_06_18", :http.request.configuration/output-deser-fn deser-create-distribution-with-tags-result, :http.request.spec/error-spec {"TooManyDistributionsWithLambdaAssociations" :portkey.aws.cloudfront.-2018-06-18/too-many-distributions-with-lambda-associations, "NoSuchOrigin" :portkey.aws.cloudfront.-2018-06-18/no-such-origin, "InvalidProtocolSettings" :portkey.aws.cloudfront.-2018-06-18/invalid-protocol-settings, "TooManyCookieNamesInWhiteList" :portkey.aws.cloudfront.-2018-06-18/too-many-cookie-names-in-white-list, "TooManyCacheBehaviors" :portkey.aws.cloudfront.-2018-06-18/too-many-cache-behaviors, "TooManyOriginCustomHeaders" :portkey.aws.cloudfront.-2018-06-18/too-many-origin-custom-headers, "InvalidViewerCertificate" :portkey.aws.cloudfront.-2018-06-18/invalid-viewer-certificate, "InvalidArgument" :portkey.aws.cloudfront.-2018-06-18/invalid-argument, "IllegalFieldLevelEncryptionConfigAssociationWithCacheBehavior" :portkey.aws.cloudfront.-2018-06-18/illegal-field-level-encryption-config-association-with-cache-behavior, "TooManyCertificates" :portkey.aws.cloudfront.-2018-06-18/too-many-certificates, "AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied, "InvalidLambdaFunctionAssociation" :portkey.aws.cloudfront.-2018-06-18/invalid-lambda-function-association, "InvalidErrorCode" :portkey.aws.cloudfront.-2018-06-18/invalid-error-code, "TooManyLambdaFunctionAssociations" :portkey.aws.cloudfront.-2018-06-18/too-many-lambda-function-associations, "InvalidRelativePath" :portkey.aws.cloudfront.-2018-06-18/invalid-relative-path, "InvalidLocationCode" :portkey.aws.cloudfront.-2018-06-18/invalid-location-code, "InvalidWebACLId" :portkey.aws.cloudfront.-2018-06-18/invalid-web-acl-id, "InvalidOrigin" :portkey.aws.cloudfront.-2018-06-18/invalid-origin, "NoSuchFieldLevelEncryptionConfig" :portkey.aws.cloudfront.-2018-06-18/no-such-field-level-encryption-config, "InvalidQueryStringParameters" :portkey.aws.cloudfront.-2018-06-18/invalid-query-string-parameters, "TooManyOrigins" :portkey.aws.cloudfront.-2018-06-18/too-many-origins, "InvalidTTLOrder" :portkey.aws.cloudfront.-2018-06-18/invalid-ttl-order, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2018-06-18/cname-already-exists, "InvalidDefaultRootObject" :portkey.aws.cloudfront.-2018-06-18/invalid-default-root-object, "InvalidResponseCode" :portkey.aws.cloudfront.-2018-06-18/invalid-response-code, "TooManyDistributionsAssociatedToFieldLevelEncryptionConfig" :portkey.aws.cloudfront.-2018-06-18/too-many-distributions-associated-to-field-level-encryption-config, "InvalidForwardCookies" :portkey.aws.cloudfront.-2018-06-18/invalid-forward-cookies, "InvalidRequiredProtocol" :portkey.aws.cloudfront.-2018-06-18/invalid-required-protocol, "InvalidHeadersForS3Origin" :portkey.aws.cloudfront.-2018-06-18/invalid-headers-for-s-3-origin, "TooManyDistributionCNAMEs" :portkey.aws.cloudfront.-2018-06-18/too-many-distribution-cnam-es, "InvalidGeoRestrictionParameter" :portkey.aws.cloudfront.-2018-06-18/invalid-geo-restriction-parameter, "MissingBody" :portkey.aws.cloudfront.-2018-06-18/missing-body, "InvalidOriginReadTimeout" :portkey.aws.cloudfront.-2018-06-18/invalid-origin-read-timeout, "DistributionAlreadyExists" :portkey.aws.cloudfront.-2018-06-18/distribution-already-exists, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2018-06-18/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2018-06-18/too-many-trusted-signers, "InvalidMinimumProtocolVersion" :portkey.aws.cloudfront.-2018-06-18/invalid-minimum-protocol-version, "TooManyDistributions" :portkey.aws.cloudfront.-2018-06-18/too-many-distributions, "InvalidOriginKeepaliveTimeout" :portkey.aws.cloudfront.-2018-06-18/invalid-origin-keepalive-timeout, "InconsistentQuantities" :portkey.aws.cloudfront.-2018-06-18/inconsistent-quantities, "TooManyQueryStringParameters" :portkey.aws.cloudfront.-2018-06-18/too-many-query-string-parameters, "InvalidTagging" :portkey.aws.cloudfront.-2018-06-18/invalid-tagging, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2018-06-18/trusted-signer-does-not-exist, "TooManyHeadersInForwardedValues" :portkey.aws.cloudfront.-2018-06-18/too-many-headers-in-forwarded-values}})))))
(clojure.spec.alpha/fdef create-distribution-with-tags-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/create-distribution-with-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/create-distribution-with-tags-result))

(clojure.core/defn delete-field-level-encryption-profile-2018-06-18 ([delete-field-level-encryption-profile-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-delete-field-level-encryption-profile-request delete-field-level-encryption-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/field-level-encryption-profile/{Id}", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/delete-field-level-encryption-profile-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/action "DeleteFieldLevelEncryptionProfile2018_06_18", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1009047__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2018-06-18/invalid-if-match-version, "NoSuchFieldLevelEncryptionProfile" :portkey.aws.cloudfront.-2018-06-18/no-such-field-level-encryption-profile, "PreconditionFailed" :portkey.aws.cloudfront.-2018-06-18/precondition-failed, "FieldLevelEncryptionProfileInUse" :portkey.aws.cloudfront.-2018-06-18/field-level-encryption-profile-in-use}})))))
(clojure.spec.alpha/fdef delete-field-level-encryption-profile-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/delete-field-level-encryption-profile-request) :ret clojure.core/true?)

(clojure.core/defn get-invalidation-2018-06-18 ([get-invalidation-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-get-invalidation-request get-invalidation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/get-invalidation-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/distribution/{DistributionId}/invalidation/{Id}", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/get-invalidation-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetInvalidation2018_06_18", :http.request.configuration/output-deser-fn deser-get-invalidation-result, :http.request.spec/error-spec {"NoSuchInvalidation" :portkey.aws.cloudfront.-2018-06-18/no-such-invalidation, "NoSuchDistribution" :portkey.aws.cloudfront.-2018-06-18/no-such-distribution, "AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied}})))))
(clojure.spec.alpha/fdef get-invalidation-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/get-invalidation-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/get-invalidation-result))

(clojure.core/defn list-field-level-encryption-profiles-2018-06-18 ([] (list-field-level-encryption-profiles-2018-06-18 {})) ([list-field-level-encryption-profiles-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-list-field-level-encryption-profiles-request list-field-level-encryption-profiles-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/list-field-level-encryption-profiles-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/field-level-encryption-profile", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/list-field-level-encryption-profiles-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListFieldLevelEncryptionProfiles2018_06_18", :http.request.configuration/output-deser-fn deser-list-field-level-encryption-profiles-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2018-06-18/invalid-argument}})))))
(clojure.spec.alpha/fdef list-field-level-encryption-profiles-2018-06-18 :args (clojure.spec.alpha/? :portkey.aws.cloudfront.-2018-06-18/list-field-level-encryption-profiles-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/list-field-level-encryption-profiles-result))

(clojure.core/defn create-field-level-encryption-profile-2018-06-18 ([create-field-level-encryption-profile-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-create-field-level-encryption-profile-request create-field-level-encryption-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/create-field-level-encryption-profile-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/field-level-encryption-profile", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/create-field-level-encryption-profile-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateFieldLevelEncryptionProfile2018_06_18", :http.request.configuration/output-deser-fn deser-create-field-level-encryption-profile-result, :http.request.spec/error-spec {"InconsistentQuantities" :portkey.aws.cloudfront.-2018-06-18/inconsistent-quantities, "InvalidArgument" :portkey.aws.cloudfront.-2018-06-18/invalid-argument, "NoSuchPublicKey" :portkey.aws.cloudfront.-2018-06-18/no-such-public-key, "FieldLevelEncryptionProfileAlreadyExists" :portkey.aws.cloudfront.-2018-06-18/field-level-encryption-profile-already-exists, "FieldLevelEncryptionProfileSizeExceeded" :portkey.aws.cloudfront.-2018-06-18/field-level-encryption-profile-size-exceeded, "TooManyFieldLevelEncryptionProfiles" :portkey.aws.cloudfront.-2018-06-18/too-many-field-level-encryption-profiles, "TooManyFieldLevelEncryptionEncryptionEntities" :portkey.aws.cloudfront.-2018-06-18/too-many-field-level-encryption-encryption-entities, "TooManyFieldLevelEncryptionFieldPatterns" :portkey.aws.cloudfront.-2018-06-18/too-many-field-level-encryption-field-patterns}})))))
(clojure.spec.alpha/fdef create-field-level-encryption-profile-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/create-field-level-encryption-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/create-field-level-encryption-profile-result))

(clojure.core/defn create-streaming-distribution-2018-06-18 ([create-streaming-distribution-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-create-streaming-distribution-request create-streaming-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/create-streaming-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/streaming-distribution", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/create-streaming-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateStreamingDistribution2018_06_18", :http.request.configuration/output-deser-fn deser-create-streaming-distribution-result, :http.request.spec/error-spec {"TooManyStreamingDistributions" :portkey.aws.cloudfront.-2018-06-18/too-many-streaming-distributions, "TooManyStreamingDistributionCNAMEs" :portkey.aws.cloudfront.-2018-06-18/too-many-streaming-distribution-cnam-es, "InvalidArgument" :portkey.aws.cloudfront.-2018-06-18/invalid-argument, "AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied, "InvalidOrigin" :portkey.aws.cloudfront.-2018-06-18/invalid-origin, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2018-06-18/cname-already-exists, "MissingBody" :portkey.aws.cloudfront.-2018-06-18/missing-body, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2018-06-18/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2018-06-18/too-many-trusted-signers, "StreamingDistributionAlreadyExists" :portkey.aws.cloudfront.-2018-06-18/streaming-distribution-already-exists, "InconsistentQuantities" :portkey.aws.cloudfront.-2018-06-18/inconsistent-quantities, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2018-06-18/trusted-signer-does-not-exist}})))))
(clojure.spec.alpha/fdef create-streaming-distribution-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/create-streaming-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/create-streaming-distribution-result))

(clojure.core/defn get-field-level-encryption-profile-2018-06-18 ([get-field-level-encryption-profile-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-get-field-level-encryption-profile-request get-field-level-encryption-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/get-field-level-encryption-profile-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/field-level-encryption-profile/{Id}", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/get-field-level-encryption-profile-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetFieldLevelEncryptionProfile2018_06_18", :http.request.configuration/output-deser-fn deser-get-field-level-encryption-profile-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied, "NoSuchFieldLevelEncryptionProfile" :portkey.aws.cloudfront.-2018-06-18/no-such-field-level-encryption-profile}})))))
(clojure.spec.alpha/fdef get-field-level-encryption-profile-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/get-field-level-encryption-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/get-field-level-encryption-profile-result))

(clojure.core/defn list-field-level-encryption-configs-2018-06-18 ([] (list-field-level-encryption-configs-2018-06-18 {})) ([list-field-level-encryption-configs-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-list-field-level-encryption-configs-request list-field-level-encryption-configs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/list-field-level-encryption-configs-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/field-level-encryption", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/list-field-level-encryption-configs-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListFieldLevelEncryptionConfigs2018_06_18", :http.request.configuration/output-deser-fn deser-list-field-level-encryption-configs-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2018-06-18/invalid-argument}})))))
(clojure.spec.alpha/fdef list-field-level-encryption-configs-2018-06-18 :args (clojure.spec.alpha/? :portkey.aws.cloudfront.-2018-06-18/list-field-level-encryption-configs-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/list-field-level-encryption-configs-result))

(clojure.core/defn list-tags-for-resource-2018-06-18 ([list-tags-for-resource-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-list-tags-for-resource-request list-tags-for-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/list-tags-for-resource-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/tagging", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/list-tags-for-resource-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTagsForResource2018_06_18", :http.request.configuration/output-deser-fn deser-list-tags-for-resource-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied, "InvalidArgument" :portkey.aws.cloudfront.-2018-06-18/invalid-argument, "InvalidTagging" :portkey.aws.cloudfront.-2018-06-18/invalid-tagging, "NoSuchResource" :portkey.aws.cloudfront.-2018-06-18/no-such-resource}})))))
(clojure.spec.alpha/fdef list-tags-for-resource-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/list-tags-for-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/list-tags-for-resource-result))

(clojure.core/defn get-streaming-distribution-2018-06-18 ([get-streaming-distribution-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-get-streaming-distribution-request get-streaming-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/get-streaming-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/streaming-distribution/{Id}", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/get-streaming-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetStreamingDistribution2018_06_18", :http.request.configuration/output-deser-fn deser-get-streaming-distribution-result, :http.request.spec/error-spec {"NoSuchStreamingDistribution" :portkey.aws.cloudfront.-2018-06-18/no-such-streaming-distribution, "AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied}})))))
(clojure.spec.alpha/fdef get-streaming-distribution-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/get-streaming-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/get-streaming-distribution-result))

(clojure.core/defn get-field-level-encryption-2018-06-18 ([get-field-level-encryption-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-get-field-level-encryption-request get-field-level-encryption-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/get-field-level-encryption-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/field-level-encryption/{Id}", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/get-field-level-encryption-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetFieldLevelEncryption2018_06_18", :http.request.configuration/output-deser-fn deser-get-field-level-encryption-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied, "NoSuchFieldLevelEncryptionConfig" :portkey.aws.cloudfront.-2018-06-18/no-such-field-level-encryption-config}})))))
(clojure.spec.alpha/fdef get-field-level-encryption-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/get-field-level-encryption-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/get-field-level-encryption-result))

(clojure.core/defn create-distribution-2018-06-18 ([create-distribution-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-create-distribution-request create-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/create-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/distribution", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/create-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateDistribution2018_06_18", :http.request.configuration/output-deser-fn deser-create-distribution-result, :http.request.spec/error-spec {"TooManyDistributionsWithLambdaAssociations" :portkey.aws.cloudfront.-2018-06-18/too-many-distributions-with-lambda-associations, "NoSuchOrigin" :portkey.aws.cloudfront.-2018-06-18/no-such-origin, "InvalidProtocolSettings" :portkey.aws.cloudfront.-2018-06-18/invalid-protocol-settings, "TooManyCookieNamesInWhiteList" :portkey.aws.cloudfront.-2018-06-18/too-many-cookie-names-in-white-list, "TooManyCacheBehaviors" :portkey.aws.cloudfront.-2018-06-18/too-many-cache-behaviors, "TooManyOriginCustomHeaders" :portkey.aws.cloudfront.-2018-06-18/too-many-origin-custom-headers, "InvalidViewerCertificate" :portkey.aws.cloudfront.-2018-06-18/invalid-viewer-certificate, "InvalidArgument" :portkey.aws.cloudfront.-2018-06-18/invalid-argument, "IllegalFieldLevelEncryptionConfigAssociationWithCacheBehavior" :portkey.aws.cloudfront.-2018-06-18/illegal-field-level-encryption-config-association-with-cache-behavior, "TooManyCertificates" :portkey.aws.cloudfront.-2018-06-18/too-many-certificates, "AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied, "InvalidLambdaFunctionAssociation" :portkey.aws.cloudfront.-2018-06-18/invalid-lambda-function-association, "InvalidErrorCode" :portkey.aws.cloudfront.-2018-06-18/invalid-error-code, "TooManyLambdaFunctionAssociations" :portkey.aws.cloudfront.-2018-06-18/too-many-lambda-function-associations, "InvalidRelativePath" :portkey.aws.cloudfront.-2018-06-18/invalid-relative-path, "InvalidLocationCode" :portkey.aws.cloudfront.-2018-06-18/invalid-location-code, "InvalidWebACLId" :portkey.aws.cloudfront.-2018-06-18/invalid-web-acl-id, "InvalidOrigin" :portkey.aws.cloudfront.-2018-06-18/invalid-origin, "NoSuchFieldLevelEncryptionConfig" :portkey.aws.cloudfront.-2018-06-18/no-such-field-level-encryption-config, "InvalidQueryStringParameters" :portkey.aws.cloudfront.-2018-06-18/invalid-query-string-parameters, "TooManyOrigins" :portkey.aws.cloudfront.-2018-06-18/too-many-origins, "InvalidTTLOrder" :portkey.aws.cloudfront.-2018-06-18/invalid-ttl-order, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2018-06-18/cname-already-exists, "InvalidDefaultRootObject" :portkey.aws.cloudfront.-2018-06-18/invalid-default-root-object, "InvalidResponseCode" :portkey.aws.cloudfront.-2018-06-18/invalid-response-code, "TooManyDistributionsAssociatedToFieldLevelEncryptionConfig" :portkey.aws.cloudfront.-2018-06-18/too-many-distributions-associated-to-field-level-encryption-config, "InvalidForwardCookies" :portkey.aws.cloudfront.-2018-06-18/invalid-forward-cookies, "InvalidRequiredProtocol" :portkey.aws.cloudfront.-2018-06-18/invalid-required-protocol, "InvalidHeadersForS3Origin" :portkey.aws.cloudfront.-2018-06-18/invalid-headers-for-s-3-origin, "TooManyDistributionCNAMEs" :portkey.aws.cloudfront.-2018-06-18/too-many-distribution-cnam-es, "InvalidGeoRestrictionParameter" :portkey.aws.cloudfront.-2018-06-18/invalid-geo-restriction-parameter, "MissingBody" :portkey.aws.cloudfront.-2018-06-18/missing-body, "InvalidOriginReadTimeout" :portkey.aws.cloudfront.-2018-06-18/invalid-origin-read-timeout, "DistributionAlreadyExists" :portkey.aws.cloudfront.-2018-06-18/distribution-already-exists, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2018-06-18/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2018-06-18/too-many-trusted-signers, "InvalidMinimumProtocolVersion" :portkey.aws.cloudfront.-2018-06-18/invalid-minimum-protocol-version, "TooManyDistributions" :portkey.aws.cloudfront.-2018-06-18/too-many-distributions, "InvalidOriginKeepaliveTimeout" :portkey.aws.cloudfront.-2018-06-18/invalid-origin-keepalive-timeout, "InconsistentQuantities" :portkey.aws.cloudfront.-2018-06-18/inconsistent-quantities, "TooManyQueryStringParameters" :portkey.aws.cloudfront.-2018-06-18/too-many-query-string-parameters, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2018-06-18/trusted-signer-does-not-exist, "TooManyHeadersInForwardedValues" :portkey.aws.cloudfront.-2018-06-18/too-many-headers-in-forwarded-values}})))))
(clojure.spec.alpha/fdef create-distribution-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/create-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/create-distribution-result))

(clojure.core/defn create-field-level-encryption-config-2018-06-18 ([create-field-level-encryption-config-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-create-field-level-encryption-config-request create-field-level-encryption-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/create-field-level-encryption-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/field-level-encryption", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/create-field-level-encryption-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateFieldLevelEncryptionConfig2018_06_18", :http.request.configuration/output-deser-fn deser-create-field-level-encryption-config-result, :http.request.spec/error-spec {"InconsistentQuantities" :portkey.aws.cloudfront.-2018-06-18/inconsistent-quantities, "InvalidArgument" :portkey.aws.cloudfront.-2018-06-18/invalid-argument, "NoSuchFieldLevelEncryptionProfile" :portkey.aws.cloudfront.-2018-06-18/no-such-field-level-encryption-profile, "FieldLevelEncryptionConfigAlreadyExists" :portkey.aws.cloudfront.-2018-06-18/field-level-encryption-config-already-exists, "TooManyFieldLevelEncryptionConfigs" :portkey.aws.cloudfront.-2018-06-18/too-many-field-level-encryption-configs, "TooManyFieldLevelEncryptionQueryArgProfiles" :portkey.aws.cloudfront.-2018-06-18/too-many-field-level-encryption-query-arg-profiles, "TooManyFieldLevelEncryptionContentTypeProfiles" :portkey.aws.cloudfront.-2018-06-18/too-many-field-level-encryption-content-type-profiles, "QueryArgProfileEmpty" :portkey.aws.cloudfront.-2018-06-18/query-arg-profile-empty}})))))
(clojure.spec.alpha/fdef create-field-level-encryption-config-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/create-field-level-encryption-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/create-field-level-encryption-config-result))

(clojure.core/defn get-streaming-distribution-config-2018-06-18 ([get-streaming-distribution-config-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-get-streaming-distribution-config-request get-streaming-distribution-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/get-streaming-distribution-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/streaming-distribution/{Id}/config", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/get-streaming-distribution-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetStreamingDistributionConfig2018_06_18", :http.request.configuration/output-deser-fn deser-get-streaming-distribution-config-result, :http.request.spec/error-spec {"NoSuchStreamingDistribution" :portkey.aws.cloudfront.-2018-06-18/no-such-streaming-distribution, "AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied}})))))
(clojure.spec.alpha/fdef get-streaming-distribution-config-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/get-streaming-distribution-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/get-streaming-distribution-config-result))

(clojure.core/defn update-field-level-encryption-config-2018-06-18 ([update-field-level-encryption-config-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-update-field-level-encryption-config-request update-field-level-encryption-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/update-field-level-encryption-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/field-level-encryption/{Id}/config", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/update-field-level-encryption-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateFieldLevelEncryptionConfig2018_06_18", :http.request.configuration/output-deser-fn deser-update-field-level-encryption-config-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2018-06-18/invalid-argument, "AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied, "NoSuchFieldLevelEncryptionProfile" :portkey.aws.cloudfront.-2018-06-18/no-such-field-level-encryption-profile, "NoSuchFieldLevelEncryptionConfig" :portkey.aws.cloudfront.-2018-06-18/no-such-field-level-encryption-config, "TooManyFieldLevelEncryptionQueryArgProfiles" :portkey.aws.cloudfront.-2018-06-18/too-many-field-level-encryption-query-arg-profiles, "PreconditionFailed" :portkey.aws.cloudfront.-2018-06-18/precondition-failed, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2018-06-18/invalid-if-match-version, "QueryArgProfileEmpty" :portkey.aws.cloudfront.-2018-06-18/query-arg-profile-empty, "IllegalUpdate" :portkey.aws.cloudfront.-2018-06-18/illegal-update, "TooManyFieldLevelEncryptionContentTypeProfiles" :portkey.aws.cloudfront.-2018-06-18/too-many-field-level-encryption-content-type-profiles, "InconsistentQuantities" :portkey.aws.cloudfront.-2018-06-18/inconsistent-quantities}})))))
(clojure.spec.alpha/fdef update-field-level-encryption-config-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/update-field-level-encryption-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/update-field-level-encryption-config-result))

(clojure.core/defn list-distributions-2018-06-18 ([] (list-distributions-2018-06-18 {})) ([list-distributions-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-list-distributions-request list-distributions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/list-distributions-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/distribution", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/list-distributions-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListDistributions2018_06_18", :http.request.configuration/output-deser-fn deser-list-distributions-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2018-06-18/invalid-argument}})))))
(clojure.spec.alpha/fdef list-distributions-2018-06-18 :args (clojure.spec.alpha/? :portkey.aws.cloudfront.-2018-06-18/list-distributions-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/list-distributions-result))

(clojure.core/defn list-public-keys-2018-06-18 ([] (list-public-keys-2018-06-18 {})) ([list-public-keys-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-list-public-keys-request list-public-keys-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/list-public-keys-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/public-key", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/list-public-keys-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListPublicKeys2018_06_18", :http.request.configuration/output-deser-fn deser-list-public-keys-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2018-06-18/invalid-argument}})))))
(clojure.spec.alpha/fdef list-public-keys-2018-06-18 :args (clojure.spec.alpha/? :portkey.aws.cloudfront.-2018-06-18/list-public-keys-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/list-public-keys-result))

(clojure.core/defn create-public-key-2018-06-18 ([create-public-key-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-create-public-key-request create-public-key-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/create-public-key-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/public-key", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/create-public-key-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreatePublicKey2018_06_18", :http.request.configuration/output-deser-fn deser-create-public-key-result, :http.request.spec/error-spec {"PublicKeyAlreadyExists" :portkey.aws.cloudfront.-2018-06-18/public-key-already-exists, "InvalidArgument" :portkey.aws.cloudfront.-2018-06-18/invalid-argument, "TooManyPublicKeys" :portkey.aws.cloudfront.-2018-06-18/too-many-public-keys}})))))
(clojure.spec.alpha/fdef create-public-key-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/create-public-key-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/create-public-key-result))

(clojure.core/defn get-field-level-encryption-profile-config-2018-06-18 ([get-field-level-encryption-profile-config-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-get-field-level-encryption-profile-config-request get-field-level-encryption-profile-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/get-field-level-encryption-profile-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/field-level-encryption-profile/{Id}/config", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/get-field-level-encryption-profile-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetFieldLevelEncryptionProfileConfig2018_06_18", :http.request.configuration/output-deser-fn deser-get-field-level-encryption-profile-config-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied, "NoSuchFieldLevelEncryptionProfile" :portkey.aws.cloudfront.-2018-06-18/no-such-field-level-encryption-profile}})))))
(clojure.spec.alpha/fdef get-field-level-encryption-profile-config-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/get-field-level-encryption-profile-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/get-field-level-encryption-profile-config-result))

(clojure.core/defn get-cloud-front-origin-access-identity-config-2018-06-18 ([get-cloud-front-origin-access-identity-config-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-get-cloud-front-origin-access-identity-config-request get-cloud-front-origin-access-identity-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/get-cloud-front-origin-access-identity-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/origin-access-identity/cloudfront/{Id}/config", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/get-cloud-front-origin-access-identity-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetCloudFrontOriginAccessIdentityConfig2018_06_18", :http.request.configuration/output-deser-fn deser-get-cloud-front-origin-access-identity-config-result, :http.request.spec/error-spec {"NoSuchCloudFrontOriginAccessIdentity" :portkey.aws.cloudfront.-2018-06-18/no-such-cloud-front-origin-access-identity, "AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied}})))))
(clojure.spec.alpha/fdef get-cloud-front-origin-access-identity-config-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/get-cloud-front-origin-access-identity-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/get-cloud-front-origin-access-identity-config-result))

(clojure.core/defn list-invalidations-2018-06-18 ([list-invalidations-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-list-invalidations-request list-invalidations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/list-invalidations-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/distribution/{DistributionId}/invalidation", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/list-invalidations-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListInvalidations2018_06_18", :http.request.configuration/output-deser-fn deser-list-invalidations-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2018-06-18/invalid-argument, "NoSuchDistribution" :portkey.aws.cloudfront.-2018-06-18/no-such-distribution, "AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied}})))))
(clojure.spec.alpha/fdef list-invalidations-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/list-invalidations-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/list-invalidations-result))

(clojure.core/defn delete-public-key-2018-06-18 ([delete-public-key-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-delete-public-key-request delete-public-key-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/public-key/{Id}", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/delete-public-key-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/action "DeletePublicKey2018_06_18", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1009047__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied, "PublicKeyInUse" :portkey.aws.cloudfront.-2018-06-18/public-key-in-use, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2018-06-18/invalid-if-match-version, "NoSuchPublicKey" :portkey.aws.cloudfront.-2018-06-18/no-such-public-key, "PreconditionFailed" :portkey.aws.cloudfront.-2018-06-18/precondition-failed}})))))
(clojure.spec.alpha/fdef delete-public-key-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/delete-public-key-request) :ret clojure.core/true?)

(clojure.core/defn untag-resource-2018-06-18 ([untag-resource-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-untag-resource-request untag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/tagging?Operation=Untag", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/untag-resource-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 204, :http.request.configuration/action "UntagResource2018_06_18", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1009047__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied, "InvalidArgument" :portkey.aws.cloudfront.-2018-06-18/invalid-argument, "InvalidTagging" :portkey.aws.cloudfront.-2018-06-18/invalid-tagging, "NoSuchResource" :portkey.aws.cloudfront.-2018-06-18/no-such-resource}})))))
(clojure.spec.alpha/fdef untag-resource-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/untag-resource-request) :ret clojure.core/true?)

(clojure.core/defn get-cloud-front-origin-access-identity-2018-06-18 ([get-cloud-front-origin-access-identity-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-get-cloud-front-origin-access-identity-request get-cloud-front-origin-access-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/get-cloud-front-origin-access-identity-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/origin-access-identity/cloudfront/{Id}", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/get-cloud-front-origin-access-identity-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetCloudFrontOriginAccessIdentity2018_06_18", :http.request.configuration/output-deser-fn deser-get-cloud-front-origin-access-identity-result, :http.request.spec/error-spec {"NoSuchCloudFrontOriginAccessIdentity" :portkey.aws.cloudfront.-2018-06-18/no-such-cloud-front-origin-access-identity, "AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied}})))))
(clojure.spec.alpha/fdef get-cloud-front-origin-access-identity-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/get-cloud-front-origin-access-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/get-cloud-front-origin-access-identity-result))

(clojure.core/defn update-cloud-front-origin-access-identity-2018-06-18 ([update-cloud-front-origin-access-identity-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-update-cloud-front-origin-access-identity-request update-cloud-front-origin-access-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/update-cloud-front-origin-access-identity-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/origin-access-identity/cloudfront/{Id}/config", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/update-cloud-front-origin-access-identity-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateCloudFrontOriginAccessIdentity2018_06_18", :http.request.configuration/output-deser-fn deser-update-cloud-front-origin-access-identity-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied, "IllegalUpdate" :portkey.aws.cloudfront.-2018-06-18/illegal-update, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2018-06-18/invalid-if-match-version, "MissingBody" :portkey.aws.cloudfront.-2018-06-18/missing-body, "NoSuchCloudFrontOriginAccessIdentity" :portkey.aws.cloudfront.-2018-06-18/no-such-cloud-front-origin-access-identity, "PreconditionFailed" :portkey.aws.cloudfront.-2018-06-18/precondition-failed, "InvalidArgument" :portkey.aws.cloudfront.-2018-06-18/invalid-argument, "InconsistentQuantities" :portkey.aws.cloudfront.-2018-06-18/inconsistent-quantities}})))))
(clojure.spec.alpha/fdef update-cloud-front-origin-access-identity-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/update-cloud-front-origin-access-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/update-cloud-front-origin-access-identity-result))

(clojure.core/defn update-streaming-distribution-2018-06-18 ([update-streaming-distribution-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-update-streaming-distribution-request update-streaming-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/update-streaming-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/streaming-distribution/{Id}/config", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/update-streaming-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateStreamingDistribution2018_06_18", :http.request.configuration/output-deser-fn deser-update-streaming-distribution-result, :http.request.spec/error-spec {"TooManyStreamingDistributionCNAMEs" :portkey.aws.cloudfront.-2018-06-18/too-many-streaming-distribution-cnam-es, "InvalidArgument" :portkey.aws.cloudfront.-2018-06-18/invalid-argument, "AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied, "NoSuchStreamingDistribution" :portkey.aws.cloudfront.-2018-06-18/no-such-streaming-distribution, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2018-06-18/cname-already-exists, "MissingBody" :portkey.aws.cloudfront.-2018-06-18/missing-body, "PreconditionFailed" :portkey.aws.cloudfront.-2018-06-18/precondition-failed, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2018-06-18/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2018-06-18/too-many-trusted-signers, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2018-06-18/invalid-if-match-version, "IllegalUpdate" :portkey.aws.cloudfront.-2018-06-18/illegal-update, "InconsistentQuantities" :portkey.aws.cloudfront.-2018-06-18/inconsistent-quantities, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2018-06-18/trusted-signer-does-not-exist}})))))
(clojure.spec.alpha/fdef update-streaming-distribution-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/update-streaming-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/update-streaming-distribution-result))

(clojure.core/defn get-distribution-config-2018-06-18 ([get-distribution-config-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-get-distribution-config-request get-distribution-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/get-distribution-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/distribution/{Id}/config", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/get-distribution-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetDistributionConfig2018_06_18", :http.request.configuration/output-deser-fn deser-get-distribution-config-result, :http.request.spec/error-spec {"NoSuchDistribution" :portkey.aws.cloudfront.-2018-06-18/no-such-distribution, "AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied}})))))
(clojure.spec.alpha/fdef get-distribution-config-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/get-distribution-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/get-distribution-config-result))

(clojure.core/defn get-public-key-config-2018-06-18 ([get-public-key-config-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-get-public-key-config-request get-public-key-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/get-public-key-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/public-key/{Id}/config", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/get-public-key-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetPublicKeyConfig2018_06_18", :http.request.configuration/output-deser-fn deser-get-public-key-config-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied, "NoSuchPublicKey" :portkey.aws.cloudfront.-2018-06-18/no-such-public-key}})))))
(clojure.spec.alpha/fdef get-public-key-config-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/get-public-key-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/get-public-key-config-result))

(clojure.core/defn list-cloud-front-origin-access-identities-2018-06-18 ([] (list-cloud-front-origin-access-identities-2018-06-18 {})) ([list-cloud-front-origin-access-identities-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-list-cloud-front-origin-access-identities-request list-cloud-front-origin-access-identities-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/list-cloud-front-origin-access-identities-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/origin-access-identity/cloudfront", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/list-cloud-front-origin-access-identities-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListCloudFrontOriginAccessIdentities2018_06_18", :http.request.configuration/output-deser-fn deser-list-cloud-front-origin-access-identities-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2018-06-18/invalid-argument}})))))
(clojure.spec.alpha/fdef list-cloud-front-origin-access-identities-2018-06-18 :args (clojure.spec.alpha/? :portkey.aws.cloudfront.-2018-06-18/list-cloud-front-origin-access-identities-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/list-cloud-front-origin-access-identities-result))

(clojure.core/defn list-streaming-distributions-2018-06-18 ([] (list-streaming-distributions-2018-06-18 {})) ([list-streaming-distributions-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-list-streaming-distributions-request list-streaming-distributions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/list-streaming-distributions-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/streaming-distribution", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/list-streaming-distributions-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListStreamingDistributions2018_06_18", :http.request.configuration/output-deser-fn deser-list-streaming-distributions-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2018-06-18/invalid-argument}})))))
(clojure.spec.alpha/fdef list-streaming-distributions-2018-06-18 :args (clojure.spec.alpha/? :portkey.aws.cloudfront.-2018-06-18/list-streaming-distributions-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/list-streaming-distributions-result))

(clojure.core/defn update-public-key-2018-06-18 ([update-public-key-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-update-public-key-request update-public-key-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/update-public-key-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/public-key/{Id}/config", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/update-public-key-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdatePublicKey2018_06_18", :http.request.configuration/output-deser-fn deser-update-public-key-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied, "CannotChangeImmutablePublicKeyFields" :portkey.aws.cloudfront.-2018-06-18/cannot-change-immutable-public-key-fields, "InvalidArgument" :portkey.aws.cloudfront.-2018-06-18/invalid-argument, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2018-06-18/invalid-if-match-version, "IllegalUpdate" :portkey.aws.cloudfront.-2018-06-18/illegal-update, "NoSuchPublicKey" :portkey.aws.cloudfront.-2018-06-18/no-such-public-key, "PreconditionFailed" :portkey.aws.cloudfront.-2018-06-18/precondition-failed}})))))
(clojure.spec.alpha/fdef update-public-key-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/update-public-key-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/update-public-key-result))

(clojure.core/defn get-field-level-encryption-config-2018-06-18 ([get-field-level-encryption-config-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-get-field-level-encryption-config-request get-field-level-encryption-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/get-field-level-encryption-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/field-level-encryption/{Id}/config", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/get-field-level-encryption-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetFieldLevelEncryptionConfig2018_06_18", :http.request.configuration/output-deser-fn deser-get-field-level-encryption-config-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied, "NoSuchFieldLevelEncryptionConfig" :portkey.aws.cloudfront.-2018-06-18/no-such-field-level-encryption-config}})))))
(clojure.spec.alpha/fdef get-field-level-encryption-config-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/get-field-level-encryption-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/get-field-level-encryption-config-result))

(clojure.core/defn delete-distribution-2018-06-18 ([delete-distribution-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-delete-distribution-request delete-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/distribution/{Id}", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/delete-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/action "DeleteDistribution2018_06_18", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1009047__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied, "DistributionNotDisabled" :portkey.aws.cloudfront.-2018-06-18/distribution-not-disabled, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2018-06-18/invalid-if-match-version, "NoSuchDistribution" :portkey.aws.cloudfront.-2018-06-18/no-such-distribution, "PreconditionFailed" :portkey.aws.cloudfront.-2018-06-18/precondition-failed}})))))
(clojure.spec.alpha/fdef delete-distribution-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/delete-distribution-request) :ret clojure.core/true?)

(clojure.core/defn create-invalidation-2018-06-18 ([create-invalidation-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-create-invalidation-request create-invalidation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/create-invalidation-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/distribution/{DistributionId}/invalidation", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/create-invalidation-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateInvalidation2018_06_18", :http.request.configuration/output-deser-fn deser-create-invalidation-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied, "MissingBody" :portkey.aws.cloudfront.-2018-06-18/missing-body, "InvalidArgument" :portkey.aws.cloudfront.-2018-06-18/invalid-argument, "NoSuchDistribution" :portkey.aws.cloudfront.-2018-06-18/no-such-distribution, "BatchTooLarge" :portkey.aws.cloudfront.-2018-06-18/batch-too-large, "TooManyInvalidationsInProgress" :portkey.aws.cloudfront.-2018-06-18/too-many-invalidations-in-progress, "InconsistentQuantities" :portkey.aws.cloudfront.-2018-06-18/inconsistent-quantities}})))))
(clojure.spec.alpha/fdef create-invalidation-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/create-invalidation-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/create-invalidation-result))

(clojure.core/defn delete-field-level-encryption-config-2018-06-18 ([delete-field-level-encryption-config-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-delete-field-level-encryption-config-request delete-field-level-encryption-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/field-level-encryption/{Id}", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/delete-field-level-encryption-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/action "DeleteFieldLevelEncryptionConfig2018_06_18", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1009047__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2018-06-18/invalid-if-match-version, "NoSuchFieldLevelEncryptionConfig" :portkey.aws.cloudfront.-2018-06-18/no-such-field-level-encryption-config, "PreconditionFailed" :portkey.aws.cloudfront.-2018-06-18/precondition-failed, "FieldLevelEncryptionConfigInUse" :portkey.aws.cloudfront.-2018-06-18/field-level-encryption-config-in-use}})))))
(clojure.spec.alpha/fdef delete-field-level-encryption-config-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/delete-field-level-encryption-config-request) :ret clojure.core/true?)

(clojure.core/defn list-distributions-by-web-acl-id-2018-06-18 ([list-distributions-by-web-acl-id-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-list-distributions-by-web-acl-id-request list-distributions-by-web-acl-id-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/list-distributions-by-web-acl-id-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/distributionsByWebACLId/{WebACLId}", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/list-distributions-by-web-acl-id-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListDistributionsByWebACLId2018_06_18", :http.request.configuration/output-deser-fn deser-list-distributions-by-web-acl-id-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2018-06-18/invalid-argument, "InvalidWebACLId" :portkey.aws.cloudfront.-2018-06-18/invalid-web-acl-id}})))))
(clojure.spec.alpha/fdef list-distributions-by-web-acl-id-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/list-distributions-by-web-acl-id-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/list-distributions-by-web-acl-id-result))

(clojure.core/defn create-cloud-front-origin-access-identity-2018-06-18 ([create-cloud-front-origin-access-identity-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-create-cloud-front-origin-access-identity-request create-cloud-front-origin-access-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/create-cloud-front-origin-access-identity-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/origin-access-identity/cloudfront", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/create-cloud-front-origin-access-identity-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateCloudFrontOriginAccessIdentity2018_06_18", :http.request.configuration/output-deser-fn deser-create-cloud-front-origin-access-identity-result, :http.request.spec/error-spec {"CloudFrontOriginAccessIdentityAlreadyExists" :portkey.aws.cloudfront.-2018-06-18/cloud-front-origin-access-identity-already-exists, "MissingBody" :portkey.aws.cloudfront.-2018-06-18/missing-body, "TooManyCloudFrontOriginAccessIdentities" :portkey.aws.cloudfront.-2018-06-18/too-many-cloud-front-origin-access-identities, "InvalidArgument" :portkey.aws.cloudfront.-2018-06-18/invalid-argument, "InconsistentQuantities" :portkey.aws.cloudfront.-2018-06-18/inconsistent-quantities}})))))
(clojure.spec.alpha/fdef create-cloud-front-origin-access-identity-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/create-cloud-front-origin-access-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/create-cloud-front-origin-access-identity-result))
