(ns portkey.aws.cloudfront.-2016-11-25 (:require [portkey.aws]))

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

(clojure.core/declare ser-logging-config)

(clojure.core/declare ser-streaming-distribution-config-with-tags)

(clojure.core/declare ser-custom-error-response-list)

(clojure.core/declare ser-certificate-source)

(clojure.core/declare ser-location-list)

(clojure.core/declare ser-restrictions)

(clojure.core/declare serstring)

(clojure.core/declare ser-lambda-function-association)

(clojure.core/declare ser-forwarded-values)

(clojure.core/declare ser-invalidation-batch)

(clojure.core/declare ser-query-string-cache-keys-list)

(clojure.core/declare ser-item-selection)

(clojure.core/declare ser-lambda-function-associations)

(clojure.core/declare ser-viewer-protocol-policy)

(clojure.core/declare ser-custom-error-response)

(clojure.core/declare serlong)

(clojure.core/declare ser-origin-list)

(clojure.core/declare ser-cached-methods)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-tags)

(clojure.core/declare ser-cache-behaviors)

(clojure.core/declare ser-cache-behavior)

(clojure.core/declare ser-origin)

(clojure.core/declare ser-custom-error-responses)

(clojure.core/declare ser-origin-ssl-protocols)

(clojure.core/declare ser-aliases)

(clojure.core/declare ser-event-type)

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

(clojure.core/declare ser-origin-protocol-policy)

(clojure.core/declare ser-path-list)

(clojure.core/declare ser-geo-restriction-type)

(clojure.core/declare ser-paths)

(clojure.core/declare serinteger)

(clojure.core/declare ser-cache-behavior-list)

(clojure.core/declare ser-origin-custom-header)

(clojure.core/declare ser-streaming-distribution-config)

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

(clojure.core/defn- ser-logging-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serboolean (:enabled input)) #:http.request.field{:name "Enabled", :shape "boolean"}) (clojure.core/into (serboolean (:include-cookies input)) #:http.request.field{:name "IncludeCookies", :shape "boolean"}) (clojure.core/into (serstring (:bucket input)) #:http.request.field{:name "Bucket", :shape "string"}) (clojure.core/into (serstring (:prefix input)) #:http.request.field{:name "Prefix", :shape "string"})], :shape "LoggingConfig", :type "structure"}))

(clojure.core/defn- ser-streaming-distribution-config-with-tags [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-streaming-distribution-config (:streaming-distribution-config input)) #:http.request.field{:name "StreamingDistributionConfig", :shape "StreamingDistributionConfig"}) (clojure.core/into (ser-tags (:tags input)) #:http.request.field{:name "Tags", :shape "Tags"})], :shape "StreamingDistributionConfigWithTags", :type "structure"}))

(clojure.core/defn- ser-custom-error-response-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-custom-error-response coll) #:http.request.field{:shape "CustomErrorResponse", :location-name "CustomErrorResponse"}))) input), :shape "CustomErrorResponseList", :type "list"})

(clojure.core/defn- ser-certificate-source [input] #:http.request.field{:value (clojure.core/get {"cloudfront" "cloudfront", :cloudfront "cloudfront", "iam" "iam", :iam "iam", "acm" "acm", :acm "acm"} input), :shape "CertificateSource"})

(clojure.core/defn- ser-location-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serstring coll) #:http.request.field{:shape "string", :location-name "Location"}))) input), :shape "LocationList", :type "list"})

(clojure.core/defn- ser-restrictions [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-geo-restriction (:geo-restriction input)) #:http.request.field{:name "GeoRestriction", :shape "GeoRestriction"})], :shape "Restrictions", :type "structure"}))

(clojure.core/defn- serstring [input] #:http.request.field{:value input, :shape "string"})

(clojure.core/defn- ser-lambda-function-association [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "LambdaFunctionAssociation", :type "structure"} (clojure.core/contains? input :lambda-function-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :lambda-function-arn)) #:http.request.field{:name "LambdaFunctionARN", :shape "string"})) (clojure.core/contains? input :event-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-event-type (input :event-type)) #:http.request.field{:name "EventType", :shape "EventType"}))))

(clojure.core/defn- ser-forwarded-values [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serboolean (:query-string input)) #:http.request.field{:name "QueryString", :shape "boolean"}) (clojure.core/into (ser-cookie-preference (:cookies input)) #:http.request.field{:name "Cookies", :shape "CookiePreference"})], :shape "ForwardedValues", :type "structure"} (clojure.core/contains? input :headers) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-headers (input :headers)) #:http.request.field{:name "Headers", :shape "Headers"})) (clojure.core/contains? input :query-string-cache-keys) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-query-string-cache-keys (input :query-string-cache-keys)) #:http.request.field{:name "QueryStringCacheKeys", :shape "QueryStringCacheKeys"}))))

(clojure.core/defn- ser-invalidation-batch [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-paths (:paths input)) #:http.request.field{:name "Paths", :shape "Paths"}) (clojure.core/into (serstring (:caller-reference input)) #:http.request.field{:name "CallerReference", :shape "string"})], :shape "InvalidationBatch", :type "structure"}))

(clojure.core/defn- ser-query-string-cache-keys-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serstring coll) #:http.request.field{:shape "string", :location-name "Name"}))) input), :shape "QueryStringCacheKeysList", :type "list"})

(clojure.core/defn- ser-item-selection [input] #:http.request.field{:value (clojure.core/get {"none" "none", :none "none", "whitelist" "whitelist", :whitelist "whitelist", "all" "all", :all "all"} input), :shape "ItemSelection"})

(clojure.core/defn- ser-lambda-function-associations [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "LambdaFunctionAssociations", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lambda-function-association-list (input :items)) #:http.request.field{:name "Items", :shape "LambdaFunctionAssociationList"}))))

(clojure.core/defn- ser-viewer-protocol-policy [input] #:http.request.field{:value (clojure.core/get {"allow-all" "allow-all", :allowall "allow-all", "https-only" "https-only", :httpsonly "https-only", "redirect-to-https" "redirect-to-https", :redirecttohttps "redirect-to-https"} input), :shape "ViewerProtocolPolicy"})

(clojure.core/defn- ser-custom-error-response [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:error-code input)) #:http.request.field{:name "ErrorCode", :shape "integer"})], :shape "CustomErrorResponse", :type "structure"} (clojure.core/contains? input :response-page-path) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :response-page-path)) #:http.request.field{:name "ResponsePagePath", :shape "string"})) (clojure.core/contains? input :response-code) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :response-code)) #:http.request.field{:name "ResponseCode", :shape "string"})) (clojure.core/contains? input :error-caching-min-ttl) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serlong (input :error-caching-min-ttl)) #:http.request.field{:name "ErrorCachingMinTTL", :shape "long"}))))

(clojure.core/defn- serlong [input] #:http.request.field{:value input, :shape "long"})

(clojure.core/defn- ser-origin-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-origin coll) #:http.request.field{:shape "Origin", :location-name "Origin"}))) input), :shape "OriginList", :type "list", :min 1})

(clojure.core/defn- ser-cached-methods [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"}) (clojure.core/into (ser-methods-list (:items input)) #:http.request.field{:name "Items", :shape "MethodsList"})], :shape "CachedMethods", :type "structure"}))

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-tags [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Tags", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :items)) #:http.request.field{:name "Items", :shape "TagList"}))))

(clojure.core/defn- ser-cache-behaviors [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "CacheBehaviors", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cache-behavior-list (input :items)) #:http.request.field{:name "Items", :shape "CacheBehaviorList"}))))

(clojure.core/defn- ser-cache-behavior [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:path-pattern input)) #:http.request.field{:name "PathPattern", :shape "string"}) (clojure.core/into (serstring (:target-origin-id input)) #:http.request.field{:name "TargetOriginId", :shape "string"}) (clojure.core/into (ser-forwarded-values (:forwarded-values input)) #:http.request.field{:name "ForwardedValues", :shape "ForwardedValues"}) (clojure.core/into (ser-trusted-signers (:trusted-signers input)) #:http.request.field{:name "TrustedSigners", :shape "TrustedSigners"}) (clojure.core/into (ser-viewer-protocol-policy (:viewer-protocol-policy input)) #:http.request.field{:name "ViewerProtocolPolicy", :shape "ViewerProtocolPolicy"}) (clojure.core/into (serlong (:min-ttl input)) #:http.request.field{:name "MinTTL", :shape "long"})], :shape "CacheBehavior", :type "structure"} (clojure.core/contains? input :smooth-streaming) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean (input :smooth-streaming)) #:http.request.field{:name "SmoothStreaming", :shape "boolean"})) (clojure.core/contains? input :compress) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean (input :compress)) #:http.request.field{:name "Compress", :shape "boolean"})) (clojure.core/contains? input :lambda-function-associations) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lambda-function-associations (input :lambda-function-associations)) #:http.request.field{:name "LambdaFunctionAssociations", :shape "LambdaFunctionAssociations"})) (clojure.core/contains? input :max-ttl) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serlong (input :max-ttl)) #:http.request.field{:name "MaxTTL", :shape "long"})) (clojure.core/contains? input :allowed-methods) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-allowed-methods (input :allowed-methods)) #:http.request.field{:name "AllowedMethods", :shape "AllowedMethods"})) (clojure.core/contains? input :default-ttl) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serlong (input :default-ttl)) #:http.request.field{:name "DefaultTTL", :shape "long"}))))

(clojure.core/defn- ser-origin [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:id input)) #:http.request.field{:name "Id", :shape "string"}) (clojure.core/into (serstring (:domain-name input)) #:http.request.field{:name "DomainName", :shape "string"})], :shape "Origin", :type "structure"} (clojure.core/contains? input :origin-path) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :origin-path)) #:http.request.field{:name "OriginPath", :shape "string"})) (clojure.core/contains? input :custom-headers) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-custom-headers (input :custom-headers)) #:http.request.field{:name "CustomHeaders", :shape "CustomHeaders"})) (clojure.core/contains? input :s-3-origin-config) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-origin-config (input :s-3-origin-config)) #:http.request.field{:name "S3OriginConfig", :shape "S3OriginConfig"})) (clojure.core/contains? input :custom-origin-config) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-custom-origin-config (input :custom-origin-config)) #:http.request.field{:name "CustomOriginConfig", :shape "CustomOriginConfig"}))))

(clojure.core/defn- ser-custom-error-responses [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "CustomErrorResponses", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-custom-error-response-list (input :items)) #:http.request.field{:name "Items", :shape "CustomErrorResponseList"}))))

(clojure.core/defn- ser-origin-ssl-protocols [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"}) (clojure.core/into (ser-ssl-protocols-list (:items input)) #:http.request.field{:name "Items", :shape "SslProtocolsList"})], :shape "OriginSslProtocols", :type "structure"}))

(clojure.core/defn- ser-aliases [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "Aliases", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-alias-list (input :items)) #:http.request.field{:name "Items", :shape "AliasList"}))))

(clojure.core/defn- ser-event-type [input] #:http.request.field{:value (clojure.core/get {"viewer-request" "viewer-request", :viewerrequest "viewer-request", "viewer-response" "viewer-response", :viewerresponse "viewer-response", "origin-request" "origin-request", :originrequest "origin-request", "origin-response" "origin-response", :originresponse "origin-response"} input), :shape "EventType"})

(clojure.core/defn- ser-allowed-methods [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"}) (clojure.core/into (ser-methods-list (:items input)) #:http.request.field{:name "Items", :shape "MethodsList"})], :shape "AllowedMethods", :type "structure"} (clojure.core/contains? input :cached-methods) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cached-methods (input :cached-methods)) #:http.request.field{:name "CachedMethods", :shape "CachedMethods"}))))

(clojure.core/defn- ser-price-class [input] #:http.request.field{:value (clojure.core/get {"PriceClass_100" "PriceClass_100", :price-class-100 "PriceClass_100", "PriceClass_200" "PriceClass_200", :price-class-200 "PriceClass_200", "PriceClass_All" "PriceClass_All", :price-class-all "PriceClass_All"} input), :shape "PriceClass"})

(clojure.core/defn- ser-custom-origin-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:http-port input)) #:http.request.field{:name "HTTPPort", :shape "integer"}) (clojure.core/into (serinteger (:https-port input)) #:http.request.field{:name "HTTPSPort", :shape "integer"}) (clojure.core/into (ser-origin-protocol-policy (:origin-protocol-policy input)) #:http.request.field{:name "OriginProtocolPolicy", :shape "OriginProtocolPolicy"})], :shape "CustomOriginConfig", :type "structure"} (clojure.core/contains? input :origin-ssl-protocols) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-origin-ssl-protocols (input :origin-ssl-protocols)) #:http.request.field{:name "OriginSslProtocols", :shape "OriginSslProtocols"}))))

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

(clojure.core/defn- ser-origin-protocol-policy [input] #:http.request.field{:value (clojure.core/get {"http-only" "http-only", :httponly "http-only", "match-viewer" "match-viewer", :matchviewer "match-viewer", "https-only" "https-only", :httpsonly "https-only"} input), :shape "OriginProtocolPolicy"})

(clojure.core/defn- ser-path-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serstring coll) #:http.request.field{:shape "string", :location-name "Path"}))) input), :shape "PathList", :type "list"})

(clojure.core/defn- ser-geo-restriction-type [input] #:http.request.field{:value (clojure.core/get {"blacklist" "blacklist", :blacklist "blacklist", "whitelist" "whitelist", :whitelist "whitelist", "none" "none", :none "none"} input), :shape "GeoRestrictionType"})

(clojure.core/defn- ser-paths [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "Paths", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-path-list (input :items)) #:http.request.field{:name "Items", :shape "PathList"}))))

(clojure.core/defn- serinteger [input] #:http.request.field{:value input, :shape "integer"})

(clojure.core/defn- ser-cache-behavior-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-cache-behavior coll) #:http.request.field{:shape "CacheBehavior", :location-name "CacheBehavior"}))) input), :shape "CacheBehaviorList", :type "list"})

(clojure.core/defn- ser-origin-custom-header [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:header-name input)) #:http.request.field{:name "HeaderName", :shape "string"}) (clojure.core/into (serstring (:header-value input)) #:http.request.field{:name "HeaderValue", :shape "string"})], :shape "OriginCustomHeader", :type "structure"}))

(clojure.core/defn- ser-streaming-distribution-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:caller-reference input)) #:http.request.field{:name "CallerReference", :shape "string"}) (clojure.core/into (ser-s-3-origin (:s-3-origin input)) #:http.request.field{:name "S3Origin", :shape "S3Origin"}) (clojure.core/into (serstring (:comment input)) #:http.request.field{:name "Comment", :shape "string"}) (clojure.core/into (ser-trusted-signers (:trusted-signers input)) #:http.request.field{:name "TrustedSigners", :shape "TrustedSigners"}) (clojure.core/into (serboolean (:enabled input)) #:http.request.field{:name "Enabled", :shape "boolean"})], :shape "StreamingDistributionConfig", :type "structure"} (clojure.core/contains? input :aliases) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aliases (input :aliases)) #:http.request.field{:name "Aliases", :shape "Aliases"})) (clojure.core/contains? input :logging) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-streaming-logging-config (input :logging)) #:http.request.field{:name "Logging", :shape "StreamingLoggingConfig"})) (clojure.core/contains? input :price-class) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-price-class (input :price-class)) #:http.request.field{:name "PriceClass", :shape "PriceClass"}))))

(clojure.core/defn- ser-s-3-origin-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:origin-access-identity input)) #:http.request.field{:name "OriginAccessIdentity", :shape "string"})], :shape "S3OriginConfig", :type "structure"}))

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-tag-key (:key input)) #:http.request.field{:name "Key", :shape "TagKey"})], :shape "Tag", :type "structure"} (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-value (input :value)) #:http.request.field{:name "Value", :shape "TagValue"}))))

(clojure.core/defn- ser-streaming-logging-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serboolean (:enabled input)) #:http.request.field{:name "Enabled", :shape "boolean"}) (clojure.core/into (serstring (:bucket input)) #:http.request.field{:name "Bucket", :shape "string"}) (clojure.core/into (serstring (:prefix input)) #:http.request.field{:name "Prefix", :shape "string"})], :shape "StreamingLoggingConfig", :type "structure"}))

(clojure.core/defn- ser-ssl-protocol [input] #:http.request.field{:value (clojure.core/get {"SSLv3" "SSLv3", :ss-lv-3 "SSLv3", "TLSv1" "TLSv1", :tl-sv-1 "TLSv1", "TLSv1.1" "TLSv1.1", :tl-sv-11 "TLSv1.1", "TLSv1.2" "TLSv1.2", :tl-sv-12 "TLSv1.2"} input), :shape "SslProtocol"})

(clojure.core/defn- ser-lambda-function-association-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-lambda-function-association coll) #:http.request.field{:shape "LambdaFunctionAssociation", :location-name "LambdaFunctionAssociation"}))) input), :shape "LambdaFunctionAssociationList", :type "list"})

(clojure.core/defn- ser-headers [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "Headers", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-header-list (input :items)) #:http.request.field{:name "Items", :shape "HeaderList"}))))

(clojure.core/defn- ser-minimum-protocol-version [input] #:http.request.field{:value (clojure.core/get {"SSLv3" "SSLv3", :ss-lv-3 "SSLv3", "TLSv1" "TLSv1", :tl-sv-1 "TLSv1"} input), :shape "MinimumProtocolVersion"})

(clojure.core/defn- ser-origins [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "Origins", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-origin-list (input :items)) #:http.request.field{:name "Items", :shape "OriginList"}))))

(clojure.core/defn- ser-distribution-config-with-tags [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-distribution-config (:distribution-config input)) #:http.request.field{:name "DistributionConfig", :shape "DistributionConfig"}) (clojure.core/into (ser-tags (:tags input)) #:http.request.field{:name "Tags", :shape "Tags"})], :shape "DistributionConfigWithTags", :type "structure"}))

(clojure.core/defn- ser-header-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serstring coll) #:http.request.field{:shape "string", :location-name "Name"}))) input), :shape "HeaderList", :type "list"})

(clojure.core/defn- ser-resource-arn [input] #:http.request.field{:value input, :shape "ResourceARN"})

(clojure.core/defn- ser-ssl-support-method [input] #:http.request.field{:value (clojure.core/get {"sni-only" "sni-only", :snionly "sni-only", "vip" "vip", :vip "vip"} input), :shape "SSLSupportMethod"})

(clojure.core/defn- ser-http-version [input] #:http.request.field{:value (clojure.core/get {"http1.1" "http1.1", :http-11 "http1.1", "http2" "http2", :http-2 "http2"} input), :shape "HttpVersion"})

(clojure.core/defn- ser-cookie-preference [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-item-selection (:forward input)) #:http.request.field{:name "Forward", :shape "ItemSelection"})], :shape "CookiePreference", :type "structure"} (clojure.core/contains? input :whitelisted-names) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cookie-names (input :whitelisted-names)) #:http.request.field{:name "WhitelistedNames", :shape "CookieNames"}))))

(clojure.core/defn- ser-custom-headers [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "CustomHeaders", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-origin-custom-headers-list (input :items)) #:http.request.field{:name "Items", :shape "OriginCustomHeadersList"}))))

(clojure.core/defn- ser-methods-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-method coll) #:http.request.field{:shape "Method", :location-name "Method"}))) input), :shape "MethodsList", :type "list"})

(clojure.core/defn- ser-default-cache-behavior [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:target-origin-id input)) #:http.request.field{:name "TargetOriginId", :shape "string"}) (clojure.core/into (ser-forwarded-values (:forwarded-values input)) #:http.request.field{:name "ForwardedValues", :shape "ForwardedValues"}) (clojure.core/into (ser-trusted-signers (:trusted-signers input)) #:http.request.field{:name "TrustedSigners", :shape "TrustedSigners"}) (clojure.core/into (ser-viewer-protocol-policy (:viewer-protocol-policy input)) #:http.request.field{:name "ViewerProtocolPolicy", :shape "ViewerProtocolPolicy"}) (clojure.core/into (serlong (:min-ttl input)) #:http.request.field{:name "MinTTL", :shape "long"})], :shape "DefaultCacheBehavior", :type "structure"} (clojure.core/contains? input :smooth-streaming) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean (input :smooth-streaming)) #:http.request.field{:name "SmoothStreaming", :shape "boolean"})) (clojure.core/contains? input :compress) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean (input :compress)) #:http.request.field{:name "Compress", :shape "boolean"})) (clojure.core/contains? input :lambda-function-associations) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lambda-function-associations (input :lambda-function-associations)) #:http.request.field{:name "LambdaFunctionAssociations", :shape "LambdaFunctionAssociations"})) (clojure.core/contains? input :max-ttl) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serlong (input :max-ttl)) #:http.request.field{:name "MaxTTL", :shape "long"})) (clojure.core/contains? input :allowed-methods) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-allowed-methods (input :allowed-methods)) #:http.request.field{:name "AllowedMethods", :shape "AllowedMethods"})) (clojure.core/contains? input :default-ttl) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serlong (input :default-ttl)) #:http.request.field{:name "DefaultTTL", :shape "long"}))))

(clojure.core/defn- ser-trusted-signers [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serboolean (:enabled input)) #:http.request.field{:name "Enabled", :shape "boolean"}) (clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "TrustedSigners", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aws-account-number-list (input :items)) #:http.request.field{:name "Items", :shape "AwsAccountNumberList"}))))

(clojure.core/defn- ser-viewer-certificate [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ViewerCertificate", :type "structure"} (clojure.core/contains? input :cloud-front-default-certificate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean (input :cloud-front-default-certificate)) #:http.request.field{:name "CloudFrontDefaultCertificate", :shape "boolean"})) (clojure.core/contains? input :iam-certificate-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :iam-certificate-id)) #:http.request.field{:name "IAMCertificateId", :shape "string"})) (clojure.core/contains? input :acm-certificate-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :acm-certificate-arn)) #:http.request.field{:name "ACMCertificateArn", :shape "string"})) (clojure.core/contains? input :ssl-support-method) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ssl-support-method (input :ssl-support-method)) #:http.request.field{:name "SSLSupportMethod", :shape "SSLSupportMethod"})) (clojure.core/contains? input :minimum-protocol-version) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-minimum-protocol-version (input :minimum-protocol-version)) #:http.request.field{:name "MinimumProtocolVersion", :shape "MinimumProtocolVersion"})) (clojure.core/contains? input :certificate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :certificate)) #:http.request.field{:name "Certificate", :shape "string", :deprecated true})) (clojure.core/contains? input :certificate-source) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-certificate-source (input :certificate-source)) #:http.request.field{:name "CertificateSource", :shape "CertificateSource", :deprecated true}))))

(clojure.core/defn- ser-cloud-front-origin-access-identity-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:caller-reference input)) #:http.request.field{:name "CallerReference", :shape "string"}) (clojure.core/into (serstring (:comment input)) #:http.request.field{:name "Comment", :shape "string"})], :shape "CloudFrontOriginAccessIdentityConfig", :type "structure"}))

(clojure.core/defn- ser-geo-restriction [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-geo-restriction-type (:restriction-type input)) #:http.request.field{:name "RestrictionType", :shape "GeoRestrictionType"}) (clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "GeoRestriction", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-location-list (input :items)) #:http.request.field{:name "Items", :shape "LocationList"}))))

(clojure.core/defn- req-list-distributions-by-web-acl-id-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :web-acl-id)) #:http.request.field{:name "WebACLId", :shape "string", :location "uri", :location-name "WebACLId"})]} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "Marker", :shape "string", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :max-items)) #:http.request.field{:name "MaxItems", :shape "string", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-get-streaming-distribution-config-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-delete-streaming-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-get-cloud-front-origin-access-identity-config-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-delete-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-list-tags-for-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:querystring [(clojure.core/into (ser-resource-arn (input :resource)) #:http.request.field{:name "Resource", :shape "ResourceARN", :location "querystring", :location-name "Resource"})]}))

(clojure.core/defn- req-create-distribution-with-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-distribution-config-with-tags (input :distribution-config-with-tags)) #:http.request.field{:name "DistributionConfigWithTags", :shape "DistributionConfigWithTags", :location-name "DistributionConfigWithTags", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-11-25/"}})]}))

(clojure.core/defn- req-list-streaming-distributions-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "Marker", :shape "string", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :max-items)) #:http.request.field{:name "MaxItems", :shape "string", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-get-cloud-front-origin-access-identity-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-get-streaming-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-list-distributions-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "Marker", :shape "string", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :max-items)) #:http.request.field{:name "MaxItems", :shape "string", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-update-cloud-front-origin-access-identity-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-cloud-front-origin-access-identity-config (input :cloud-front-origin-access-identity-config)) #:http.request.field{:name "CloudFrontOriginAccessIdentityConfig", :shape "CloudFrontOriginAccessIdentityConfig", :location-name "CloudFrontOriginAccessIdentityConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-11-25/"}})], :uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-create-invalidation-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :distribution-id)) #:http.request.field{:name "DistributionId", :shape "string", :location "uri", :location-name "DistributionId"})], :body [(clojure.core/into (ser-invalidation-batch (input :invalidation-batch)) #:http.request.field{:name "InvalidationBatch", :shape "InvalidationBatch", :location-name "InvalidationBatch", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-11-25/"}})]}))

(clojure.core/defn- req-tag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:querystring [(clojure.core/into (ser-resource-arn (input :resource)) #:http.request.field{:name "Resource", :shape "ResourceARN", :location "querystring", :location-name "Resource"})], :body [(clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags", :location-name "Tags", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-11-25/"}})]}))

(clojure.core/defn- req-create-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-distribution-config (input :distribution-config)) #:http.request.field{:name "DistributionConfig", :shape "DistributionConfig", :location-name "DistributionConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-11-25/"}})]}))

(clojure.core/defn- req-create-streaming-distribution-with-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-streaming-distribution-config-with-tags (input :streaming-distribution-config-with-tags)) #:http.request.field{:name "StreamingDistributionConfigWithTags", :shape "StreamingDistributionConfigWithTags", :location-name "StreamingDistributionConfigWithTags", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-11-25/"}})]}))

(clojure.core/defn- req-get-distribution-config-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-create-streaming-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-streaming-distribution-config (input :streaming-distribution-config)) #:http.request.field{:name "StreamingDistributionConfig", :shape "StreamingDistributionConfig", :location-name "StreamingDistributionConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-11-25/"}})]}))

(clojure.core/defn- req-create-cloud-front-origin-access-identity-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-cloud-front-origin-access-identity-config (input :cloud-front-origin-access-identity-config)) #:http.request.field{:name "CloudFrontOriginAccessIdentityConfig", :shape "CloudFrontOriginAccessIdentityConfig", :location-name "CloudFrontOriginAccessIdentityConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-11-25/"}})]}))

(clojure.core/defn- req-get-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-update-streaming-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-streaming-distribution-config (input :streaming-distribution-config)) #:http.request.field{:name "StreamingDistributionConfig", :shape "StreamingDistributionConfig", :location-name "StreamingDistributionConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-11-25/"}})], :uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-delete-cloud-front-origin-access-identity-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-get-invalidation-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :distribution-id)) #:http.request.field{:name "DistributionId", :shape "string", :location "uri", :location-name "DistributionId"}) (clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-list-invalidations-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :distribution-id)) #:http.request.field{:name "DistributionId", :shape "string", :location "uri", :location-name "DistributionId"})]} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "Marker", :shape "string", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :max-items)) #:http.request.field{:name "MaxItems", :shape "string", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-untag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:querystring [(clojure.core/into (ser-resource-arn (input :resource)) #:http.request.field{:name "Resource", :shape "ResourceARN", :location "querystring", :location-name "Resource"})], :body [(clojure.core/into (ser-tag-keys (input :tag-keys)) #:http.request.field{:name "TagKeys", :shape "TagKeys", :location-name "TagKeys", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-11-25/"}})]}))

(clojure.core/defn- req-update-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-distribution-config (input :distribution-config)) #:http.request.field{:name "DistributionConfig", :shape "DistributionConfig", :location-name "DistributionConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-11-25/"}})], :uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-list-cloud-front-origin-access-identities-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "Marker", :shape "string", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :max-items)) #:http.request.field{:name "MaxItems", :shape "string", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/declare deserboolean)

(clojure.core/declare deser-cookie-names)

(clojure.core/declare deser-logging-config)

(clojure.core/declare deser-invalidation-summary)

(clojure.core/declare deser-custom-error-response-list)

(clojure.core/declare deser-invalidation)

(clojure.core/declare deser-certificate-source)

(clojure.core/declare deser-location-list)

(clojure.core/declare deser-key-pair-id-list)

(clojure.core/declare deser-restrictions)

(clojure.core/declare deserstring)

(clojure.core/declare deser-distribution)

(clojure.core/declare deser-cloud-front-origin-access-identity-list)

(clojure.core/declare deser-lambda-function-association)

(clojure.core/declare deser-forwarded-values)

(clojure.core/declare deser-invalidation-batch)

(clojure.core/declare deser-invalidation-summary-list)

(clojure.core/declare deser-query-string-cache-keys-list)

(clojure.core/declare deser-streaming-distribution-list)

(clojure.core/declare deser-item-selection)

(clojure.core/declare deser-streaming-distribution)

(clojure.core/declare deser-lambda-function-associations)

(clojure.core/declare deser-viewer-protocol-policy)

(clojure.core/declare deser-custom-error-response)

(clojure.core/declare deser-distribution-summary-list)

(clojure.core/declare deser-signer)

(clojure.core/declare deserlong)

(clojure.core/declare deser-origin-list)

(clojure.core/declare deser-cached-methods)

(clojure.core/declare deser-tag-key)

(clojure.core/declare deser-tags)

(clojure.core/declare deser-streaming-distribution-summary-list)

(clojure.core/declare deser-cache-behaviors)

(clojure.core/declare deser-cache-behavior)

(clojure.core/declare deser-active-trusted-signers)

(clojure.core/declare deser-origin)

(clojure.core/declare desertimestamp)

(clojure.core/declare deser-custom-error-responses)

(clojure.core/declare deser-invalidation-list)

(clojure.core/declare deser-origin-ssl-protocols)

(clojure.core/declare deser-aliases)

(clojure.core/declare deser-event-type)

(clojure.core/declare deser-allowed-methods)

(clojure.core/declare deser-price-class)

(clojure.core/declare deser-custom-origin-config)

(clojure.core/declare deser-s-3-origin)

(clojure.core/declare deser-streaming-distribution-summary)

(clojure.core/declare deser-cloud-front-origin-access-identity)

(clojure.core/declare deser-cookie-name-list)

(clojure.core/declare deser-tag-list)

(clojure.core/declare deser-query-string-cache-keys)

(clojure.core/declare deser-key-pair-ids)

(clojure.core/declare deser-distribution-config)

(clojure.core/declare deser-ssl-protocols-list)

(clojure.core/declare deser-aws-account-number-list)

(clojure.core/declare deser-tag-value)

(clojure.core/declare deser-method)

(clojure.core/declare deser-alias-list)

(clojure.core/declare deser-origin-custom-headers-list)

(clojure.core/declare deser-origin-protocol-policy)

(clojure.core/declare deser-signer-list)

(clojure.core/declare deser-path-list)

(clojure.core/declare deser-geo-restriction-type)

(clojure.core/declare deser-paths)

(clojure.core/declare deserinteger)

(clojure.core/declare deser-cloud-front-origin-access-identity-summary)

(clojure.core/declare deser-cache-behavior-list)

(clojure.core/declare deser-origin-custom-header)

(clojure.core/declare deser-streaming-distribution-config)

(clojure.core/declare deser-s-3-origin-config)

(clojure.core/declare deser-cloud-front-origin-access-identity-summary-list)

(clojure.core/declare deser-tag)

(clojure.core/declare deser-streaming-logging-config)

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

(clojure.core/declare deser-default-cache-behavior)

(clojure.core/declare deser-trusted-signers)

(clojure.core/declare deser-viewer-certificate)

(clojure.core/declare deser-cloud-front-origin-access-identity-config)

(clojure.core/declare deser-geo-restriction)

(clojure.core/defn- deserboolean [input] (clojure.core/when-let [boolstr__1008759__auto__ (clojure.core/first input)] (clojure.core/cond (clojure.core/= "true" boolstr__1008759__auto__) true (clojure.core/= "false" boolstr__1008759__auto__) false)))

(clojure.core/defn- deser-cookie-names [input] (clojure.core/let [letvar1110984 {"Quantity" (portkey.aws/getback-xml-elem-with-tag "Quantity" input), "Items" (portkey.aws/getback-xml-elem-with-tag "Items" input)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar1110984 ["Quantity" :content]))} (letvar1110984 "Items") (clojure.core/assoc :items (deser-cookie-name-list (clojure.core/get-in letvar1110984 ["Items" :content]))))))

(clojure.core/defn- deser-logging-config [input] (clojure.core/let [letvar1111068 {"Enabled" (portkey.aws/getback-xml-elem-with-tag "Enabled" input), "IncludeCookies" (portkey.aws/getback-xml-elem-with-tag "IncludeCookies" input), "Bucket" (portkey.aws/getback-xml-elem-with-tag "Bucket" input), "Prefix" (portkey.aws/getback-xml-elem-with-tag "Prefix" input)}] (clojure.core/cond-> {:enabled (deserboolean (clojure.core/get-in letvar1111068 ["Enabled" :content])), :include-cookies (deserboolean (clojure.core/get-in letvar1111068 ["IncludeCookies" :content])), :bucket (deserstring (clojure.core/get-in letvar1111068 ["Bucket" :content])), :prefix (deserstring (clojure.core/get-in letvar1111068 ["Prefix" :content]))})))

(clojure.core/defn- deser-invalidation-summary [input] (clojure.core/let [letvar1111152 {"Id" (portkey.aws/getback-xml-elem-with-tag "Id" input), "CreateTime" (portkey.aws/getback-xml-elem-with-tag "CreateTime" input), "Status" (portkey.aws/getback-xml-elem-with-tag "Status" input)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar1111152 ["Id" :content])), :create-time (desertimestamp (clojure.core/get-in letvar1111152 ["CreateTime" :content])), :status (deserstring (clojure.core/get-in letvar1111152 ["Status" :content]))})))

(clojure.core/defn- deser-custom-error-response-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-custom-error-response coll))) input))

(clojure.core/defn- deser-invalidation [input] (clojure.core/let [letvar1111253 {"Id" (portkey.aws/getback-xml-elem-with-tag "Id" input), "Status" (portkey.aws/getback-xml-elem-with-tag "Status" input), "CreateTime" (portkey.aws/getback-xml-elem-with-tag "CreateTime" input), "InvalidationBatch" (portkey.aws/getback-xml-elem-with-tag "InvalidationBatch" input)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar1111253 ["Id" :content])), :status (deserstring (clojure.core/get-in letvar1111253 ["Status" :content])), :create-time (desertimestamp (clojure.core/get-in letvar1111253 ["CreateTime" :content])), :invalidation-batch (deser-invalidation-batch (clojure.core/get-in letvar1111253 ["InvalidationBatch" :content]))})))

(clojure.core/defn- deser-certificate-source [input] (clojure.core/get {"cloudfront" :cloudfront, "iam" :iam, "acm" :acm} (clojure.core/first input)))

(clojure.core/defn- deser-location-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-key-pair-id-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-restrictions [input] (clojure.core/let [letvar1111376 {"GeoRestriction" (portkey.aws/getback-xml-elem-with-tag "GeoRestriction" input)}] (clojure.core/cond-> {:geo-restriction (deser-geo-restriction (clojure.core/get-in letvar1111376 ["GeoRestriction" :content]))})))

(clojure.core/defn- deserstring [input] (clojure.core/first input))

(clojure.core/defn- deser-distribution [input] (clojure.core/let [letvar1111465 {"Id" (portkey.aws/getback-xml-elem-with-tag "Id" input), "ARN" (portkey.aws/getback-xml-elem-with-tag "ARN" input), "Status" (portkey.aws/getback-xml-elem-with-tag "Status" input), "LastModifiedTime" (portkey.aws/getback-xml-elem-with-tag "LastModifiedTime" input), "InProgressInvalidationBatches" (portkey.aws/getback-xml-elem-with-tag "InProgressInvalidationBatches" input), "DomainName" (portkey.aws/getback-xml-elem-with-tag "DomainName" input), "ActiveTrustedSigners" (portkey.aws/getback-xml-elem-with-tag "ActiveTrustedSigners" input), "DistributionConfig" (portkey.aws/getback-xml-elem-with-tag "DistributionConfig" input)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar1111465 ["Id" :content])), :arn (deserstring (clojure.core/get-in letvar1111465 ["ARN" :content])), :status (deserstring (clojure.core/get-in letvar1111465 ["Status" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar1111465 ["LastModifiedTime" :content])), :in-progress-invalidation-batches (deserinteger (clojure.core/get-in letvar1111465 ["InProgressInvalidationBatches" :content])), :domain-name (deserstring (clojure.core/get-in letvar1111465 ["DomainName" :content])), :active-trusted-signers (deser-active-trusted-signers (clojure.core/get-in letvar1111465 ["ActiveTrustedSigners" :content])), :distribution-config (deser-distribution-config (clojure.core/get-in letvar1111465 ["DistributionConfig" :content]))})))

(clojure.core/defn- deser-cloud-front-origin-access-identity-list [input] (clojure.core/let [letvar1111549 {"Marker" (portkey.aws/getback-xml-elem-with-tag "Marker" input), "NextMarker" (portkey.aws/getback-xml-elem-with-tag "NextMarker" input), "MaxItems" (portkey.aws/getback-xml-elem-with-tag "MaxItems" input), "IsTruncated" (portkey.aws/getback-xml-elem-with-tag "IsTruncated" input), "Quantity" (portkey.aws/getback-xml-elem-with-tag "Quantity" input), "Items" (portkey.aws/getback-xml-elem-with-tag "Items" input)}] (clojure.core/cond-> {:marker (deserstring (clojure.core/get-in letvar1111549 ["Marker" :content])), :max-items (deserinteger (clojure.core/get-in letvar1111549 ["MaxItems" :content])), :is-truncated (deserboolean (clojure.core/get-in letvar1111549 ["IsTruncated" :content])), :quantity (deserinteger (clojure.core/get-in letvar1111549 ["Quantity" :content]))} (letvar1111549 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar1111549 ["NextMarker" :content]))) (letvar1111549 "Items") (clojure.core/assoc :items (deser-cloud-front-origin-access-identity-summary-list (clojure.core/get-in letvar1111549 ["Items" :content]))))))

(clojure.core/defn- deser-lambda-function-association [input] (clojure.core/let [letvar1111633 {"LambdaFunctionARN" (portkey.aws/getback-xml-elem-with-tag "LambdaFunctionARN" input), "EventType" (portkey.aws/getback-xml-elem-with-tag "EventType" input)}] (clojure.core/cond-> {} (letvar1111633 "LambdaFunctionARN") (clojure.core/assoc :lambda-function-arn (deserstring (clojure.core/get-in letvar1111633 ["LambdaFunctionARN" :content]))) (letvar1111633 "EventType") (clojure.core/assoc :event-type (deser-event-type (clojure.core/get-in letvar1111633 ["EventType" :content]))))))

(clojure.core/defn- deser-forwarded-values [input] (clojure.core/let [letvar1111717 {"QueryString" (portkey.aws/getback-xml-elem-with-tag "QueryString" input), "Cookies" (portkey.aws/getback-xml-elem-with-tag "Cookies" input), "Headers" (portkey.aws/getback-xml-elem-with-tag "Headers" input), "QueryStringCacheKeys" (portkey.aws/getback-xml-elem-with-tag "QueryStringCacheKeys" input)}] (clojure.core/cond-> {:query-string (deserboolean (clojure.core/get-in letvar1111717 ["QueryString" :content])), :cookies (deser-cookie-preference (clojure.core/get-in letvar1111717 ["Cookies" :content]))} (letvar1111717 "Headers") (clojure.core/assoc :headers (deser-headers (clojure.core/get-in letvar1111717 ["Headers" :content]))) (letvar1111717 "QueryStringCacheKeys") (clojure.core/assoc :query-string-cache-keys (deser-query-string-cache-keys (clojure.core/get-in letvar1111717 ["QueryStringCacheKeys" :content]))))))

(clojure.core/defn- deser-invalidation-batch [input] (clojure.core/let [letvar1111801 {"Paths" (portkey.aws/getback-xml-elem-with-tag "Paths" input), "CallerReference" (portkey.aws/getback-xml-elem-with-tag "CallerReference" input)}] (clojure.core/cond-> {:paths (deser-paths (clojure.core/get-in letvar1111801 ["Paths" :content])), :caller-reference (deserstring (clojure.core/get-in letvar1111801 ["CallerReference" :content]))})))

(clojure.core/defn- deser-invalidation-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-invalidation-summary coll))) input))

(clojure.core/defn- deser-query-string-cache-keys-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-streaming-distribution-list [input] (clojure.core/let [letvar1111919 {"Marker" (portkey.aws/getback-xml-elem-with-tag "Marker" input), "NextMarker" (portkey.aws/getback-xml-elem-with-tag "NextMarker" input), "MaxItems" (portkey.aws/getback-xml-elem-with-tag "MaxItems" input), "IsTruncated" (portkey.aws/getback-xml-elem-with-tag "IsTruncated" input), "Quantity" (portkey.aws/getback-xml-elem-with-tag "Quantity" input), "Items" (portkey.aws/getback-xml-elem-with-tag "Items" input)}] (clojure.core/cond-> {:marker (deserstring (clojure.core/get-in letvar1111919 ["Marker" :content])), :max-items (deserinteger (clojure.core/get-in letvar1111919 ["MaxItems" :content])), :is-truncated (deserboolean (clojure.core/get-in letvar1111919 ["IsTruncated" :content])), :quantity (deserinteger (clojure.core/get-in letvar1111919 ["Quantity" :content]))} (letvar1111919 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar1111919 ["NextMarker" :content]))) (letvar1111919 "Items") (clojure.core/assoc :items (deser-streaming-distribution-summary-list (clojure.core/get-in letvar1111919 ["Items" :content]))))))

(clojure.core/defn- deser-item-selection [input] (clojure.core/get {"none" :none, "whitelist" :whitelist, "all" :all} (clojure.core/first input)))

(clojure.core/defn- deser-streaming-distribution [input] (clojure.core/let [letvar1112008 {"Id" (portkey.aws/getback-xml-elem-with-tag "Id" input), "ARN" (portkey.aws/getback-xml-elem-with-tag "ARN" input), "Status" (portkey.aws/getback-xml-elem-with-tag "Status" input), "LastModifiedTime" (portkey.aws/getback-xml-elem-with-tag "LastModifiedTime" input), "DomainName" (portkey.aws/getback-xml-elem-with-tag "DomainName" input), "ActiveTrustedSigners" (portkey.aws/getback-xml-elem-with-tag "ActiveTrustedSigners" input), "StreamingDistributionConfig" (portkey.aws/getback-xml-elem-with-tag "StreamingDistributionConfig" input)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar1112008 ["Id" :content])), :arn (deserstring (clojure.core/get-in letvar1112008 ["ARN" :content])), :status (deserstring (clojure.core/get-in letvar1112008 ["Status" :content])), :domain-name (deserstring (clojure.core/get-in letvar1112008 ["DomainName" :content])), :active-trusted-signers (deser-active-trusted-signers (clojure.core/get-in letvar1112008 ["ActiveTrustedSigners" :content])), :streaming-distribution-config (deser-streaming-distribution-config (clojure.core/get-in letvar1112008 ["StreamingDistributionConfig" :content]))} (letvar1112008 "LastModifiedTime") (clojure.core/assoc :last-modified-time (desertimestamp (clojure.core/get-in letvar1112008 ["LastModifiedTime" :content]))))))

(clojure.core/defn- deser-lambda-function-associations [input] (clojure.core/let [letvar1112092 {"Quantity" (portkey.aws/getback-xml-elem-with-tag "Quantity" input), "Items" (portkey.aws/getback-xml-elem-with-tag "Items" input)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar1112092 ["Quantity" :content]))} (letvar1112092 "Items") (clojure.core/assoc :items (deser-lambda-function-association-list (clojure.core/get-in letvar1112092 ["Items" :content]))))))

(clojure.core/defn- deser-viewer-protocol-policy [input] (clojure.core/get {"allow-all" :allowall, "https-only" :httpsonly, "redirect-to-https" :redirecttohttps} (clojure.core/first input)))

(clojure.core/defn- deser-custom-error-response [input] (clojure.core/let [letvar1112181 {"ErrorCode" (portkey.aws/getback-xml-elem-with-tag "ErrorCode" input), "ResponsePagePath" (portkey.aws/getback-xml-elem-with-tag "ResponsePagePath" input), "ResponseCode" (portkey.aws/getback-xml-elem-with-tag "ResponseCode" input), "ErrorCachingMinTTL" (portkey.aws/getback-xml-elem-with-tag "ErrorCachingMinTTL" input)}] (clojure.core/cond-> {:error-code (deserinteger (clojure.core/get-in letvar1112181 ["ErrorCode" :content]))} (letvar1112181 "ResponsePagePath") (clojure.core/assoc :response-page-path (deserstring (clojure.core/get-in letvar1112181 ["ResponsePagePath" :content]))) (letvar1112181 "ResponseCode") (clojure.core/assoc :response-code (deserstring (clojure.core/get-in letvar1112181 ["ResponseCode" :content]))) (letvar1112181 "ErrorCachingMinTTL") (clojure.core/assoc :error-caching-min-ttl (deserlong (clojure.core/get-in letvar1112181 ["ErrorCachingMinTTL" :content]))))))

(clojure.core/defn- deser-distribution-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-distribution-summary coll))) input))

(clojure.core/defn- deser-signer [input] (clojure.core/let [letvar1112282 {"AwsAccountNumber" (portkey.aws/getback-xml-elem-with-tag "AwsAccountNumber" input), "KeyPairIds" (portkey.aws/getback-xml-elem-with-tag "KeyPairIds" input)}] (clojure.core/cond-> {} (letvar1112282 "AwsAccountNumber") (clojure.core/assoc :aws-account-number (deserstring (clojure.core/get-in letvar1112282 ["AwsAccountNumber" :content]))) (letvar1112282 "KeyPairIds") (clojure.core/assoc :key-pair-ids (deser-key-pair-ids (clojure.core/get-in letvar1112282 ["KeyPairIds" :content]))))))

(clojure.core/defn- deserlong [input] (java.lang.Long. (clojure.core/first input)))

(clojure.core/defn- deser-origin-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-origin coll))) input))

(clojure.core/defn- deser-cached-methods [input] (clojure.core/let [letvar1112385 {"Quantity" (portkey.aws/getback-xml-elem-with-tag "Quantity" input), "Items" (portkey.aws/getback-xml-elem-with-tag "Items" input)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar1112385 ["Quantity" :content])), :items (deser-methods-list (clojure.core/get-in letvar1112385 ["Items" :content]))})))

(clojure.core/defn- deser-tag-key [input] (clojure.core/first input))

(clojure.core/defn- deser-tags [input] (clojure.core/let [letvar1112474 {"Items" (portkey.aws/getback-xml-elem-with-tag "Items" input)}] (clojure.core/cond-> {} (letvar1112474 "Items") (clojure.core/assoc :items (deser-tag-list (clojure.core/get-in letvar1112474 ["Items" :content]))))))

(clojure.core/defn- deser-streaming-distribution-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-streaming-distribution-summary coll))) input))

(clojure.core/defn- deser-cache-behaviors [input] (clojure.core/let [letvar1112575 {"Quantity" (portkey.aws/getback-xml-elem-with-tag "Quantity" input), "Items" (portkey.aws/getback-xml-elem-with-tag "Items" input)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar1112575 ["Quantity" :content]))} (letvar1112575 "Items") (clojure.core/assoc :items (deser-cache-behavior-list (clojure.core/get-in letvar1112575 ["Items" :content]))))))

(clojure.core/defn- deser-cache-behavior [input] (clojure.core/let [letvar1112659 {"SmoothStreaming" (portkey.aws/getback-xml-elem-with-tag "SmoothStreaming" input), "Compress" (portkey.aws/getback-xml-elem-with-tag "Compress" input), "ForwardedValues" (portkey.aws/getback-xml-elem-with-tag "ForwardedValues" input), "TargetOriginId" (portkey.aws/getback-xml-elem-with-tag "TargetOriginId" input), "LambdaFunctionAssociations" (portkey.aws/getback-xml-elem-with-tag "LambdaFunctionAssociations" input), "ViewerProtocolPolicy" (portkey.aws/getback-xml-elem-with-tag "ViewerProtocolPolicy" input), "MinTTL" (portkey.aws/getback-xml-elem-with-tag "MinTTL" input), "PathPattern" (portkey.aws/getback-xml-elem-with-tag "PathPattern" input), "MaxTTL" (portkey.aws/getback-xml-elem-with-tag "MaxTTL" input), "AllowedMethods" (portkey.aws/getback-xml-elem-with-tag "AllowedMethods" input), "DefaultTTL" (portkey.aws/getback-xml-elem-with-tag "DefaultTTL" input), "TrustedSigners" (portkey.aws/getback-xml-elem-with-tag "TrustedSigners" input)}] (clojure.core/cond-> {:path-pattern (deserstring (clojure.core/get-in letvar1112659 ["PathPattern" :content])), :target-origin-id (deserstring (clojure.core/get-in letvar1112659 ["TargetOriginId" :content])), :forwarded-values (deser-forwarded-values (clojure.core/get-in letvar1112659 ["ForwardedValues" :content])), :trusted-signers (deser-trusted-signers (clojure.core/get-in letvar1112659 ["TrustedSigners" :content])), :viewer-protocol-policy (deser-viewer-protocol-policy (clojure.core/get-in letvar1112659 ["ViewerProtocolPolicy" :content])), :min-ttl (deserlong (clojure.core/get-in letvar1112659 ["MinTTL" :content]))} (letvar1112659 "SmoothStreaming") (clojure.core/assoc :smooth-streaming (deserboolean (clojure.core/get-in letvar1112659 ["SmoothStreaming" :content]))) (letvar1112659 "Compress") (clojure.core/assoc :compress (deserboolean (clojure.core/get-in letvar1112659 ["Compress" :content]))) (letvar1112659 "LambdaFunctionAssociations") (clojure.core/assoc :lambda-function-associations (deser-lambda-function-associations (clojure.core/get-in letvar1112659 ["LambdaFunctionAssociations" :content]))) (letvar1112659 "MaxTTL") (clojure.core/assoc :max-ttl (deserlong (clojure.core/get-in letvar1112659 ["MaxTTL" :content]))) (letvar1112659 "AllowedMethods") (clojure.core/assoc :allowed-methods (deser-allowed-methods (clojure.core/get-in letvar1112659 ["AllowedMethods" :content]))) (letvar1112659 "DefaultTTL") (clojure.core/assoc :default-ttl (deserlong (clojure.core/get-in letvar1112659 ["DefaultTTL" :content]))))))

(clojure.core/defn- deser-active-trusted-signers [input] (clojure.core/let [letvar1112743 {"Enabled" (portkey.aws/getback-xml-elem-with-tag "Enabled" input), "Quantity" (portkey.aws/getback-xml-elem-with-tag "Quantity" input), "Items" (portkey.aws/getback-xml-elem-with-tag "Items" input)}] (clojure.core/cond-> {:enabled (deserboolean (clojure.core/get-in letvar1112743 ["Enabled" :content])), :quantity (deserinteger (clojure.core/get-in letvar1112743 ["Quantity" :content]))} (letvar1112743 "Items") (clojure.core/assoc :items (deser-signer-list (clojure.core/get-in letvar1112743 ["Items" :content]))))))

(clojure.core/defn- deser-origin [input] (clojure.core/let [letvar1112827 {"Id" (portkey.aws/getback-xml-elem-with-tag "Id" input), "DomainName" (portkey.aws/getback-xml-elem-with-tag "DomainName" input), "OriginPath" (portkey.aws/getback-xml-elem-with-tag "OriginPath" input), "CustomHeaders" (portkey.aws/getback-xml-elem-with-tag "CustomHeaders" input), "S3OriginConfig" (portkey.aws/getback-xml-elem-with-tag "S3OriginConfig" input), "CustomOriginConfig" (portkey.aws/getback-xml-elem-with-tag "CustomOriginConfig" input)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar1112827 ["Id" :content])), :domain-name (deserstring (clojure.core/get-in letvar1112827 ["DomainName" :content]))} (letvar1112827 "OriginPath") (clojure.core/assoc :origin-path (deserstring (clojure.core/get-in letvar1112827 ["OriginPath" :content]))) (letvar1112827 "CustomHeaders") (clojure.core/assoc :custom-headers (deser-custom-headers (clojure.core/get-in letvar1112827 ["CustomHeaders" :content]))) (letvar1112827 "S3OriginConfig") (clojure.core/assoc :s-3-origin-config (deser-s-3-origin-config (clojure.core/get-in letvar1112827 ["S3OriginConfig" :content]))) (letvar1112827 "CustomOriginConfig") (clojure.core/assoc :custom-origin-config (deser-custom-origin-config (clojure.core/get-in letvar1112827 ["CustomOriginConfig" :content]))))))

(clojure.core/defn- desertimestamp [input] (clojure.core/first input))

(clojure.core/defn- deser-custom-error-responses [input] (clojure.core/let [letvar1112913 {"Quantity" (portkey.aws/getback-xml-elem-with-tag "Quantity" input), "Items" (portkey.aws/getback-xml-elem-with-tag "Items" input)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar1112913 ["Quantity" :content]))} (letvar1112913 "Items") (clojure.core/assoc :items (deser-custom-error-response-list (clojure.core/get-in letvar1112913 ["Items" :content]))))))

(clojure.core/defn- deser-invalidation-list [input] (clojure.core/let [letvar1112997 {"Marker" (portkey.aws/getback-xml-elem-with-tag "Marker" input), "NextMarker" (portkey.aws/getback-xml-elem-with-tag "NextMarker" input), "MaxItems" (portkey.aws/getback-xml-elem-with-tag "MaxItems" input), "IsTruncated" (portkey.aws/getback-xml-elem-with-tag "IsTruncated" input), "Quantity" (portkey.aws/getback-xml-elem-with-tag "Quantity" input), "Items" (portkey.aws/getback-xml-elem-with-tag "Items" input)}] (clojure.core/cond-> {:marker (deserstring (clojure.core/get-in letvar1112997 ["Marker" :content])), :max-items (deserinteger (clojure.core/get-in letvar1112997 ["MaxItems" :content])), :is-truncated (deserboolean (clojure.core/get-in letvar1112997 ["IsTruncated" :content])), :quantity (deserinteger (clojure.core/get-in letvar1112997 ["Quantity" :content]))} (letvar1112997 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar1112997 ["NextMarker" :content]))) (letvar1112997 "Items") (clojure.core/assoc :items (deser-invalidation-summary-list (clojure.core/get-in letvar1112997 ["Items" :content]))))))

(clojure.core/defn- deser-origin-ssl-protocols [input] (clojure.core/let [letvar1113081 {"Quantity" (portkey.aws/getback-xml-elem-with-tag "Quantity" input), "Items" (portkey.aws/getback-xml-elem-with-tag "Items" input)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar1113081 ["Quantity" :content])), :items (deser-ssl-protocols-list (clojure.core/get-in letvar1113081 ["Items" :content]))})))

(clojure.core/defn- deser-aliases [input] (clojure.core/let [letvar1113165 {"Quantity" (portkey.aws/getback-xml-elem-with-tag "Quantity" input), "Items" (portkey.aws/getback-xml-elem-with-tag "Items" input)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar1113165 ["Quantity" :content]))} (letvar1113165 "Items") (clojure.core/assoc :items (deser-alias-list (clojure.core/get-in letvar1113165 ["Items" :content]))))))

(clojure.core/defn- deser-event-type [input] (clojure.core/get {"viewer-request" :viewerrequest, "viewer-response" :viewerresponse, "origin-request" :originrequest, "origin-response" :originresponse} (clojure.core/first input)))

(clojure.core/defn- deser-allowed-methods [input] (clojure.core/let [letvar1113254 {"Quantity" (portkey.aws/getback-xml-elem-with-tag "Quantity" input), "Items" (portkey.aws/getback-xml-elem-with-tag "Items" input), "CachedMethods" (portkey.aws/getback-xml-elem-with-tag "CachedMethods" input)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar1113254 ["Quantity" :content])), :items (deser-methods-list (clojure.core/get-in letvar1113254 ["Items" :content]))} (letvar1113254 "CachedMethods") (clojure.core/assoc :cached-methods (deser-cached-methods (clojure.core/get-in letvar1113254 ["CachedMethods" :content]))))))

(clojure.core/defn- deser-price-class [input] (clojure.core/get {"PriceClass_100" :price-class-100, "PriceClass_200" :price-class-200, "PriceClass_All" :price-class-all} (clojure.core/first input)))

(clojure.core/defn- deser-custom-origin-config [input] (clojure.core/let [letvar1113343 {"HTTPPort" (portkey.aws/getback-xml-elem-with-tag "HTTPPort" input), "HTTPSPort" (portkey.aws/getback-xml-elem-with-tag "HTTPSPort" input), "OriginProtocolPolicy" (portkey.aws/getback-xml-elem-with-tag "OriginProtocolPolicy" input), "OriginSslProtocols" (portkey.aws/getback-xml-elem-with-tag "OriginSslProtocols" input)}] (clojure.core/cond-> {:http-port (deserinteger (clojure.core/get-in letvar1113343 ["HTTPPort" :content])), :https-port (deserinteger (clojure.core/get-in letvar1113343 ["HTTPSPort" :content])), :origin-protocol-policy (deser-origin-protocol-policy (clojure.core/get-in letvar1113343 ["OriginProtocolPolicy" :content]))} (letvar1113343 "OriginSslProtocols") (clojure.core/assoc :origin-ssl-protocols (deser-origin-ssl-protocols (clojure.core/get-in letvar1113343 ["OriginSslProtocols" :content]))))))

(clojure.core/defn- deser-s-3-origin [input] (clojure.core/let [letvar1113427 {"DomainName" (portkey.aws/getback-xml-elem-with-tag "DomainName" input), "OriginAccessIdentity" (portkey.aws/getback-xml-elem-with-tag "OriginAccessIdentity" input)}] (clojure.core/cond-> {:domain-name (deserstring (clojure.core/get-in letvar1113427 ["DomainName" :content])), :origin-access-identity (deserstring (clojure.core/get-in letvar1113427 ["OriginAccessIdentity" :content]))})))

(clojure.core/defn- deser-streaming-distribution-summary [input] (clojure.core/let [letvar1113511 {"Comment" (portkey.aws/getback-xml-elem-with-tag "Comment" input), "ARN" (portkey.aws/getback-xml-elem-with-tag "ARN" input), "Enabled" (portkey.aws/getback-xml-elem-with-tag "Enabled" input), "Status" (portkey.aws/getback-xml-elem-with-tag "Status" input), "Aliases" (portkey.aws/getback-xml-elem-with-tag "Aliases" input), "PriceClass" (portkey.aws/getback-xml-elem-with-tag "PriceClass" input), "S3Origin" (portkey.aws/getback-xml-elem-with-tag "S3Origin" input), "LastModifiedTime" (portkey.aws/getback-xml-elem-with-tag "LastModifiedTime" input), "DomainName" (portkey.aws/getback-xml-elem-with-tag "DomainName" input), "Id" (portkey.aws/getback-xml-elem-with-tag "Id" input), "TrustedSigners" (portkey.aws/getback-xml-elem-with-tag "TrustedSigners" input)}] (clojure.core/cond-> {:domain-name (deserstring (clojure.core/get-in letvar1113511 ["DomainName" :content])), :status (deserstring (clojure.core/get-in letvar1113511 ["Status" :content])), :id (deserstring (clojure.core/get-in letvar1113511 ["Id" :content])), :comment (deserstring (clojure.core/get-in letvar1113511 ["Comment" :content])), :trusted-signers (deser-trusted-signers (clojure.core/get-in letvar1113511 ["TrustedSigners" :content])), :aliases (deser-aliases (clojure.core/get-in letvar1113511 ["Aliases" :content])), :s-3-origin (deser-s-3-origin (clojure.core/get-in letvar1113511 ["S3Origin" :content])), :enabled (deserboolean (clojure.core/get-in letvar1113511 ["Enabled" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar1113511 ["LastModifiedTime" :content])), :arn (deserstring (clojure.core/get-in letvar1113511 ["ARN" :content])), :price-class (deser-price-class (clojure.core/get-in letvar1113511 ["PriceClass" :content]))})))

(clojure.core/defn- deser-cloud-front-origin-access-identity [input] (clojure.core/let [letvar1113595 {"Id" (portkey.aws/getback-xml-elem-with-tag "Id" input), "S3CanonicalUserId" (portkey.aws/getback-xml-elem-with-tag "S3CanonicalUserId" input), "CloudFrontOriginAccessIdentityConfig" (portkey.aws/getback-xml-elem-with-tag "CloudFrontOriginAccessIdentityConfig" input)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar1113595 ["Id" :content])), :s-3-canonical-user-id (deserstring (clojure.core/get-in letvar1113595 ["S3CanonicalUserId" :content]))} (letvar1113595 "CloudFrontOriginAccessIdentityConfig") (clojure.core/assoc :cloud-front-origin-access-identity-config (deser-cloud-front-origin-access-identity-config (clojure.core/get-in letvar1113595 ["CloudFrontOriginAccessIdentityConfig" :content]))))))

(clojure.core/defn- deser-cookie-name-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-tag-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-query-string-cache-keys [input] (clojure.core/let [letvar1113713 {"Quantity" (portkey.aws/getback-xml-elem-with-tag "Quantity" input), "Items" (portkey.aws/getback-xml-elem-with-tag "Items" input)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar1113713 ["Quantity" :content]))} (letvar1113713 "Items") (clojure.core/assoc :items (deser-query-string-cache-keys-list (clojure.core/get-in letvar1113713 ["Items" :content]))))))

(clojure.core/defn- deser-key-pair-ids [input] (clojure.core/let [letvar1113797 {"Quantity" (portkey.aws/getback-xml-elem-with-tag "Quantity" input), "Items" (portkey.aws/getback-xml-elem-with-tag "Items" input)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar1113797 ["Quantity" :content]))} (letvar1113797 "Items") (clojure.core/assoc :items (deser-key-pair-id-list (clojure.core/get-in letvar1113797 ["Items" :content]))))))

(clojure.core/defn- deser-distribution-config [input] (clojure.core/let [letvar1113881 {"DefaultRootObject" (portkey.aws/getback-xml-elem-with-tag "DefaultRootObject" input), "CallerReference" (portkey.aws/getback-xml-elem-with-tag "CallerReference" input), "IsIPV6Enabled" (portkey.aws/getback-xml-elem-with-tag "IsIPV6Enabled" input), "Restrictions" (portkey.aws/getback-xml-elem-with-tag "Restrictions" input), "Comment" (portkey.aws/getback-xml-elem-with-tag "Comment" input), "WebACLId" (portkey.aws/getback-xml-elem-with-tag "WebACLId" input), "Logging" (portkey.aws/getback-xml-elem-with-tag "Logging" input), "CacheBehaviors" (portkey.aws/getback-xml-elem-with-tag "CacheBehaviors" input), "CustomErrorResponses" (portkey.aws/getback-xml-elem-with-tag "CustomErrorResponses" input), "Enabled" (portkey.aws/getback-xml-elem-with-tag "Enabled" input), "Aliases" (portkey.aws/getback-xml-elem-with-tag "Aliases" input), "PriceClass" (portkey.aws/getback-xml-elem-with-tag "PriceClass" input), "Origins" (portkey.aws/getback-xml-elem-with-tag "Origins" input), "HttpVersion" (portkey.aws/getback-xml-elem-with-tag "HttpVersion" input), "DefaultCacheBehavior" (portkey.aws/getback-xml-elem-with-tag "DefaultCacheBehavior" input), "ViewerCertificate" (portkey.aws/getback-xml-elem-with-tag "ViewerCertificate" input)}] (clojure.core/cond-> {:caller-reference (deserstring (clojure.core/get-in letvar1113881 ["CallerReference" :content])), :origins (deser-origins (clojure.core/get-in letvar1113881 ["Origins" :content])), :default-cache-behavior (deser-default-cache-behavior (clojure.core/get-in letvar1113881 ["DefaultCacheBehavior" :content])), :comment (deserstring (clojure.core/get-in letvar1113881 ["Comment" :content])), :enabled (deserboolean (clojure.core/get-in letvar1113881 ["Enabled" :content]))} (letvar1113881 "DefaultRootObject") (clojure.core/assoc :default-root-object (deserstring (clojure.core/get-in letvar1113881 ["DefaultRootObject" :content]))) (letvar1113881 "IsIPV6Enabled") (clojure.core/assoc :is-ipv-6-enabled (deserboolean (clojure.core/get-in letvar1113881 ["IsIPV6Enabled" :content]))) (letvar1113881 "Restrictions") (clojure.core/assoc :restrictions (deser-restrictions (clojure.core/get-in letvar1113881 ["Restrictions" :content]))) (letvar1113881 "WebACLId") (clojure.core/assoc :web-acl-id (deserstring (clojure.core/get-in letvar1113881 ["WebACLId" :content]))) (letvar1113881 "Logging") (clojure.core/assoc :logging (deser-logging-config (clojure.core/get-in letvar1113881 ["Logging" :content]))) (letvar1113881 "CacheBehaviors") (clojure.core/assoc :cache-behaviors (deser-cache-behaviors (clojure.core/get-in letvar1113881 ["CacheBehaviors" :content]))) (letvar1113881 "CustomErrorResponses") (clojure.core/assoc :custom-error-responses (deser-custom-error-responses (clojure.core/get-in letvar1113881 ["CustomErrorResponses" :content]))) (letvar1113881 "Aliases") (clojure.core/assoc :aliases (deser-aliases (clojure.core/get-in letvar1113881 ["Aliases" :content]))) (letvar1113881 "PriceClass") (clojure.core/assoc :price-class (deser-price-class (clojure.core/get-in letvar1113881 ["PriceClass" :content]))) (letvar1113881 "HttpVersion") (clojure.core/assoc :http-version (deser-http-version (clojure.core/get-in letvar1113881 ["HttpVersion" :content]))) (letvar1113881 "ViewerCertificate") (clojure.core/assoc :viewer-certificate (deser-viewer-certificate (clojure.core/get-in letvar1113881 ["ViewerCertificate" :content]))))))

(clojure.core/defn- deser-ssl-protocols-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-ssl-protocol coll))) input))

(clojure.core/defn- deser-aws-account-number-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-tag-value [input] (clojure.core/first input))

(clojure.core/defn- deser-method [input] (clojure.core/get {"GET" :get, "HEAD" :head, "POST" :post, "PUT" :put, "PATCH" :patch, "OPTIONS" :options, "DELETE" :delete} (clojure.core/first input)))

(clojure.core/defn- deser-alias-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-origin-custom-headers-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-origin-custom-header coll))) input))

(clojure.core/defn- deser-origin-protocol-policy [input] (clojure.core/get {"http-only" :httponly, "match-viewer" :matchviewer, "https-only" :httpsonly} (clojure.core/first input)))

(clojure.core/defn- deser-signer-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-signer coll))) input))

(clojure.core/defn- deser-path-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-geo-restriction-type [input] (clojure.core/get {"blacklist" :blacklist, "whitelist" :whitelist, "none" :none} (clojure.core/first input)))

(clojure.core/defn- deser-paths [input] (clojure.core/let [letvar1114087 {"Quantity" (portkey.aws/getback-xml-elem-with-tag "Quantity" input), "Items" (portkey.aws/getback-xml-elem-with-tag "Items" input)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar1114087 ["Quantity" :content]))} (letvar1114087 "Items") (clojure.core/assoc :items (deser-path-list (clojure.core/get-in letvar1114087 ["Items" :content]))))))

(clojure.core/defn- deserinteger [input] (java.lang.Integer. (clojure.core/first input)))

(clojure.core/defn- deser-cloud-front-origin-access-identity-summary [input] (clojure.core/let [letvar1114173 {"Id" (portkey.aws/getback-xml-elem-with-tag "Id" input), "S3CanonicalUserId" (portkey.aws/getback-xml-elem-with-tag "S3CanonicalUserId" input), "Comment" (portkey.aws/getback-xml-elem-with-tag "Comment" input)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar1114173 ["Id" :content])), :s-3-canonical-user-id (deserstring (clojure.core/get-in letvar1114173 ["S3CanonicalUserId" :content])), :comment (deserstring (clojure.core/get-in letvar1114173 ["Comment" :content]))})))

(clojure.core/defn- deser-cache-behavior-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-cache-behavior coll))) input))

(clojure.core/defn- deser-origin-custom-header [input] (clojure.core/let [letvar1114274 {"HeaderName" (portkey.aws/getback-xml-elem-with-tag "HeaderName" input), "HeaderValue" (portkey.aws/getback-xml-elem-with-tag "HeaderValue" input)}] (clojure.core/cond-> {:header-name (deserstring (clojure.core/get-in letvar1114274 ["HeaderName" :content])), :header-value (deserstring (clojure.core/get-in letvar1114274 ["HeaderValue" :content]))})))

(clojure.core/defn- deser-streaming-distribution-config [input] (clojure.core/let [letvar1114358 {"CallerReference" (portkey.aws/getback-xml-elem-with-tag "CallerReference" input), "S3Origin" (portkey.aws/getback-xml-elem-with-tag "S3Origin" input), "Aliases" (portkey.aws/getback-xml-elem-with-tag "Aliases" input), "Comment" (portkey.aws/getback-xml-elem-with-tag "Comment" input), "Logging" (portkey.aws/getback-xml-elem-with-tag "Logging" input), "TrustedSigners" (portkey.aws/getback-xml-elem-with-tag "TrustedSigners" input), "PriceClass" (portkey.aws/getback-xml-elem-with-tag "PriceClass" input), "Enabled" (portkey.aws/getback-xml-elem-with-tag "Enabled" input)}] (clojure.core/cond-> {:caller-reference (deserstring (clojure.core/get-in letvar1114358 ["CallerReference" :content])), :s-3-origin (deser-s-3-origin (clojure.core/get-in letvar1114358 ["S3Origin" :content])), :comment (deserstring (clojure.core/get-in letvar1114358 ["Comment" :content])), :trusted-signers (deser-trusted-signers (clojure.core/get-in letvar1114358 ["TrustedSigners" :content])), :enabled (deserboolean (clojure.core/get-in letvar1114358 ["Enabled" :content]))} (letvar1114358 "Aliases") (clojure.core/assoc :aliases (deser-aliases (clojure.core/get-in letvar1114358 ["Aliases" :content]))) (letvar1114358 "Logging") (clojure.core/assoc :logging (deser-streaming-logging-config (clojure.core/get-in letvar1114358 ["Logging" :content]))) (letvar1114358 "PriceClass") (clojure.core/assoc :price-class (deser-price-class (clojure.core/get-in letvar1114358 ["PriceClass" :content]))))))

(clojure.core/defn- deser-s-3-origin-config [input] (clojure.core/let [letvar1114442 {"OriginAccessIdentity" (portkey.aws/getback-xml-elem-with-tag "OriginAccessIdentity" input)}] (clojure.core/cond-> {:origin-access-identity (deserstring (clojure.core/get-in letvar1114442 ["OriginAccessIdentity" :content]))})))

(clojure.core/defn- deser-cloud-front-origin-access-identity-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-cloud-front-origin-access-identity-summary coll))) input))

(clojure.core/defn- deser-tag [input] (clojure.core/let [letvar1114543 {"Key" (portkey.aws/getback-xml-elem-with-tag "Key" input), "Value" (portkey.aws/getback-xml-elem-with-tag "Value" input)}] (clojure.core/cond-> {:key (deser-tag-key (clojure.core/get-in letvar1114543 ["Key" :content]))} (letvar1114543 "Value") (clojure.core/assoc :value (deser-tag-value (clojure.core/get-in letvar1114543 ["Value" :content]))))))

(clojure.core/defn- deser-streaming-logging-config [input] (clojure.core/let [letvar1114627 {"Enabled" (portkey.aws/getback-xml-elem-with-tag "Enabled" input), "Bucket" (portkey.aws/getback-xml-elem-with-tag "Bucket" input), "Prefix" (portkey.aws/getback-xml-elem-with-tag "Prefix" input)}] (clojure.core/cond-> {:enabled (deserboolean (clojure.core/get-in letvar1114627 ["Enabled" :content])), :bucket (deserstring (clojure.core/get-in letvar1114627 ["Bucket" :content])), :prefix (deserstring (clojure.core/get-in letvar1114627 ["Prefix" :content]))})))

(clojure.core/defn- deser-distribution-summary [input] (clojure.core/let [letvar1114711 {"IsIPV6Enabled" (portkey.aws/getback-xml-elem-with-tag "IsIPV6Enabled" input), "Restrictions" (portkey.aws/getback-xml-elem-with-tag "Restrictions" input), "Comment" (portkey.aws/getback-xml-elem-with-tag "Comment" input), "WebACLId" (portkey.aws/getback-xml-elem-with-tag "WebACLId" input), "ARN" (portkey.aws/getback-xml-elem-with-tag "ARN" input), "CacheBehaviors" (portkey.aws/getback-xml-elem-with-tag "CacheBehaviors" input), "CustomErrorResponses" (portkey.aws/getback-xml-elem-with-tag "CustomErrorResponses" input), "Enabled" (portkey.aws/getback-xml-elem-with-tag "Enabled" input), "Status" (portkey.aws/getback-xml-elem-with-tag "Status" input), "Aliases" (portkey.aws/getback-xml-elem-with-tag "Aliases" input), "PriceClass" (portkey.aws/getback-xml-elem-with-tag "PriceClass" input), "LastModifiedTime" (portkey.aws/getback-xml-elem-with-tag "LastModifiedTime" input), "DomainName" (portkey.aws/getback-xml-elem-with-tag "DomainName" input), "Origins" (portkey.aws/getback-xml-elem-with-tag "Origins" input), "HttpVersion" (portkey.aws/getback-xml-elem-with-tag "HttpVersion" input), "Id" (portkey.aws/getback-xml-elem-with-tag "Id" input), "DefaultCacheBehavior" (portkey.aws/getback-xml-elem-with-tag "DefaultCacheBehavior" input), "ViewerCertificate" (portkey.aws/getback-xml-elem-with-tag "ViewerCertificate" input)}] (clojure.core/cond-> {:origins (deser-origins (clojure.core/get-in letvar1114711 ["Origins" :content])), :restrictions (deser-restrictions (clojure.core/get-in letvar1114711 ["Restrictions" :content])), :web-acl-id (deserstring (clojure.core/get-in letvar1114711 ["WebACLId" :content])), :is-ipv-6-enabled (deserboolean (clojure.core/get-in letvar1114711 ["IsIPV6Enabled" :content])), :cache-behaviors (deser-cache-behaviors (clojure.core/get-in letvar1114711 ["CacheBehaviors" :content])), :default-cache-behavior (deser-default-cache-behavior (clojure.core/get-in letvar1114711 ["DefaultCacheBehavior" :content])), :viewer-certificate (deser-viewer-certificate (clojure.core/get-in letvar1114711 ["ViewerCertificate" :content])), :http-version (deser-http-version (clojure.core/get-in letvar1114711 ["HttpVersion" :content])), :domain-name (deserstring (clojure.core/get-in letvar1114711 ["DomainName" :content])), :status (deserstring (clojure.core/get-in letvar1114711 ["Status" :content])), :id (deserstring (clojure.core/get-in letvar1114711 ["Id" :content])), :comment (deserstring (clojure.core/get-in letvar1114711 ["Comment" :content])), :aliases (deser-aliases (clojure.core/get-in letvar1114711 ["Aliases" :content])), :custom-error-responses (deser-custom-error-responses (clojure.core/get-in letvar1114711 ["CustomErrorResponses" :content])), :enabled (deserboolean (clojure.core/get-in letvar1114711 ["Enabled" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar1114711 ["LastModifiedTime" :content])), :arn (deserstring (clojure.core/get-in letvar1114711 ["ARN" :content])), :price-class (deser-price-class (clojure.core/get-in letvar1114711 ["PriceClass" :content]))})))

(clojure.core/defn- deser-ssl-protocol [input] (clojure.core/get {"SSLv3" :ss-lv-3, "TLSv1" :tl-sv-1, "TLSv1.1" :tl-sv-11, "TLSv1.2" :tl-sv-12} (clojure.core/first input)))

(clojure.core/defn- deser-lambda-function-association-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-lambda-function-association coll))) input))

(clojure.core/defn- deser-headers [input] (clojure.core/let [letvar1114817 {"Quantity" (portkey.aws/getback-xml-elem-with-tag "Quantity" input), "Items" (portkey.aws/getback-xml-elem-with-tag "Items" input)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar1114817 ["Quantity" :content]))} (letvar1114817 "Items") (clojure.core/assoc :items (deser-header-list (clojure.core/get-in letvar1114817 ["Items" :content]))))))

(clojure.core/defn- deser-minimum-protocol-version [input] (clojure.core/get {"SSLv3" :ss-lv-3, "TLSv1" :tl-sv-1} (clojure.core/first input)))

(clojure.core/defn- deser-origins [input] (clojure.core/let [letvar1114906 {"Quantity" (portkey.aws/getback-xml-elem-with-tag "Quantity" input), "Items" (portkey.aws/getback-xml-elem-with-tag "Items" input)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar1114906 ["Quantity" :content]))} (letvar1114906 "Items") (clojure.core/assoc :items (deser-origin-list (clojure.core/get-in letvar1114906 ["Items" :content]))))))

(clojure.core/defn- deser-header-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-distribution-list [input] (clojure.core/let [letvar1115007 {"Marker" (portkey.aws/getback-xml-elem-with-tag "Marker" input), "NextMarker" (portkey.aws/getback-xml-elem-with-tag "NextMarker" input), "MaxItems" (portkey.aws/getback-xml-elem-with-tag "MaxItems" input), "IsTruncated" (portkey.aws/getback-xml-elem-with-tag "IsTruncated" input), "Quantity" (portkey.aws/getback-xml-elem-with-tag "Quantity" input), "Items" (portkey.aws/getback-xml-elem-with-tag "Items" input)}] (clojure.core/cond-> {:marker (deserstring (clojure.core/get-in letvar1115007 ["Marker" :content])), :max-items (deserinteger (clojure.core/get-in letvar1115007 ["MaxItems" :content])), :is-truncated (deserboolean (clojure.core/get-in letvar1115007 ["IsTruncated" :content])), :quantity (deserinteger (clojure.core/get-in letvar1115007 ["Quantity" :content]))} (letvar1115007 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar1115007 ["NextMarker" :content]))) (letvar1115007 "Items") (clojure.core/assoc :items (deser-distribution-summary-list (clojure.core/get-in letvar1115007 ["Items" :content]))))))

(clojure.core/defn- deser-ssl-support-method [input] (clojure.core/get {"sni-only" :snionly, "vip" :vip} (clojure.core/first input)))

(clojure.core/defn- deser-http-version [input] (clojure.core/get {"http1.1" :http-11, "http2" :http-2} (clojure.core/first input)))

(clojure.core/defn- deser-cookie-preference [input] (clojure.core/let [letvar1115101 {"Forward" (portkey.aws/getback-xml-elem-with-tag "Forward" input), "WhitelistedNames" (portkey.aws/getback-xml-elem-with-tag "WhitelistedNames" input)}] (clojure.core/cond-> {:forward (deser-item-selection (clojure.core/get-in letvar1115101 ["Forward" :content]))} (letvar1115101 "WhitelistedNames") (clojure.core/assoc :whitelisted-names (deser-cookie-names (clojure.core/get-in letvar1115101 ["WhitelistedNames" :content]))))))

(clojure.core/defn- deser-custom-headers [input] (clojure.core/let [letvar1115185 {"Quantity" (portkey.aws/getback-xml-elem-with-tag "Quantity" input), "Items" (portkey.aws/getback-xml-elem-with-tag "Items" input)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar1115185 ["Quantity" :content]))} (letvar1115185 "Items") (clojure.core/assoc :items (deser-origin-custom-headers-list (clojure.core/get-in letvar1115185 ["Items" :content]))))))

(clojure.core/defn- deser-methods-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-method coll))) input))

(clojure.core/defn- deser-default-cache-behavior [input] (clojure.core/let [letvar1115286 {"SmoothStreaming" (portkey.aws/getback-xml-elem-with-tag "SmoothStreaming" input), "Compress" (portkey.aws/getback-xml-elem-with-tag "Compress" input), "ForwardedValues" (portkey.aws/getback-xml-elem-with-tag "ForwardedValues" input), "TargetOriginId" (portkey.aws/getback-xml-elem-with-tag "TargetOriginId" input), "LambdaFunctionAssociations" (portkey.aws/getback-xml-elem-with-tag "LambdaFunctionAssociations" input), "ViewerProtocolPolicy" (portkey.aws/getback-xml-elem-with-tag "ViewerProtocolPolicy" input), "MinTTL" (portkey.aws/getback-xml-elem-with-tag "MinTTL" input), "MaxTTL" (portkey.aws/getback-xml-elem-with-tag "MaxTTL" input), "AllowedMethods" (portkey.aws/getback-xml-elem-with-tag "AllowedMethods" input), "DefaultTTL" (portkey.aws/getback-xml-elem-with-tag "DefaultTTL" input), "TrustedSigners" (portkey.aws/getback-xml-elem-with-tag "TrustedSigners" input)}] (clojure.core/cond-> {:target-origin-id (deserstring (clojure.core/get-in letvar1115286 ["TargetOriginId" :content])), :forwarded-values (deser-forwarded-values (clojure.core/get-in letvar1115286 ["ForwardedValues" :content])), :trusted-signers (deser-trusted-signers (clojure.core/get-in letvar1115286 ["TrustedSigners" :content])), :viewer-protocol-policy (deser-viewer-protocol-policy (clojure.core/get-in letvar1115286 ["ViewerProtocolPolicy" :content])), :min-ttl (deserlong (clojure.core/get-in letvar1115286 ["MinTTL" :content]))} (letvar1115286 "SmoothStreaming") (clojure.core/assoc :smooth-streaming (deserboolean (clojure.core/get-in letvar1115286 ["SmoothStreaming" :content]))) (letvar1115286 "Compress") (clojure.core/assoc :compress (deserboolean (clojure.core/get-in letvar1115286 ["Compress" :content]))) (letvar1115286 "LambdaFunctionAssociations") (clojure.core/assoc :lambda-function-associations (deser-lambda-function-associations (clojure.core/get-in letvar1115286 ["LambdaFunctionAssociations" :content]))) (letvar1115286 "MaxTTL") (clojure.core/assoc :max-ttl (deserlong (clojure.core/get-in letvar1115286 ["MaxTTL" :content]))) (letvar1115286 "AllowedMethods") (clojure.core/assoc :allowed-methods (deser-allowed-methods (clojure.core/get-in letvar1115286 ["AllowedMethods" :content]))) (letvar1115286 "DefaultTTL") (clojure.core/assoc :default-ttl (deserlong (clojure.core/get-in letvar1115286 ["DefaultTTL" :content]))))))

(clojure.core/defn- deser-trusted-signers [input] (clojure.core/let [letvar1115370 {"Enabled" (portkey.aws/getback-xml-elem-with-tag "Enabled" input), "Quantity" (portkey.aws/getback-xml-elem-with-tag "Quantity" input), "Items" (portkey.aws/getback-xml-elem-with-tag "Items" input)}] (clojure.core/cond-> {:enabled (deserboolean (clojure.core/get-in letvar1115370 ["Enabled" :content])), :quantity (deserinteger (clojure.core/get-in letvar1115370 ["Quantity" :content]))} (letvar1115370 "Items") (clojure.core/assoc :items (deser-aws-account-number-list (clojure.core/get-in letvar1115370 ["Items" :content]))))))

(clojure.core/defn- deser-viewer-certificate [input] (clojure.core/let [letvar1115454 {"CloudFrontDefaultCertificate" (portkey.aws/getback-xml-elem-with-tag "CloudFrontDefaultCertificate" input), "IAMCertificateId" (portkey.aws/getback-xml-elem-with-tag "IAMCertificateId" input), "ACMCertificateArn" (portkey.aws/getback-xml-elem-with-tag "ACMCertificateArn" input), "SSLSupportMethod" (portkey.aws/getback-xml-elem-with-tag "SSLSupportMethod" input), "MinimumProtocolVersion" (portkey.aws/getback-xml-elem-with-tag "MinimumProtocolVersion" input), "Certificate" (portkey.aws/getback-xml-elem-with-tag "Certificate" input), "CertificateSource" (portkey.aws/getback-xml-elem-with-tag "CertificateSource" input)}] (clojure.core/cond-> {} (letvar1115454 "CloudFrontDefaultCertificate") (clojure.core/assoc :cloud-front-default-certificate (deserboolean (clojure.core/get-in letvar1115454 ["CloudFrontDefaultCertificate" :content]))) (letvar1115454 "IAMCertificateId") (clojure.core/assoc :iam-certificate-id (deserstring (clojure.core/get-in letvar1115454 ["IAMCertificateId" :content]))) (letvar1115454 "ACMCertificateArn") (clojure.core/assoc :acm-certificate-arn (deserstring (clojure.core/get-in letvar1115454 ["ACMCertificateArn" :content]))) (letvar1115454 "SSLSupportMethod") (clojure.core/assoc :ssl-support-method (deser-ssl-support-method (clojure.core/get-in letvar1115454 ["SSLSupportMethod" :content]))) (letvar1115454 "MinimumProtocolVersion") (clojure.core/assoc :minimum-protocol-version (deser-minimum-protocol-version (clojure.core/get-in letvar1115454 ["MinimumProtocolVersion" :content]))) (letvar1115454 "Certificate") (clojure.core/assoc :certificate (deserstring (clojure.core/get-in letvar1115454 ["Certificate" :content]))) (letvar1115454 "CertificateSource") (clojure.core/assoc :certificate-source (deser-certificate-source (clojure.core/get-in letvar1115454 ["CertificateSource" :content]))))))

(clojure.core/defn- deser-cloud-front-origin-access-identity-config [input] (clojure.core/let [letvar1115538 {"CallerReference" (portkey.aws/getback-xml-elem-with-tag "CallerReference" input), "Comment" (portkey.aws/getback-xml-elem-with-tag "Comment" input)}] (clojure.core/cond-> {:caller-reference (deserstring (clojure.core/get-in letvar1115538 ["CallerReference" :content])), :comment (deserstring (clojure.core/get-in letvar1115538 ["Comment" :content]))})))

(clojure.core/defn- deser-geo-restriction [input] (clojure.core/let [letvar1115622 {"RestrictionType" (portkey.aws/getback-xml-elem-with-tag "RestrictionType" input), "Quantity" (portkey.aws/getback-xml-elem-with-tag "Quantity" input), "Items" (portkey.aws/getback-xml-elem-with-tag "Items" input)}] (clojure.core/cond-> {:restriction-type (deser-geo-restriction-type (clojure.core/get-in letvar1115622 ["RestrictionType" :content])), :quantity (deserinteger (clojure.core/get-in letvar1115622 ["Quantity" :content]))} (letvar1115622 "Items") (clojure.core/assoc :items (deser-location-list (clojure.core/get-in letvar1115622 ["Items" :content]))))))

(clojure.core/defn- deser-list-tags-for-resource-result [input] (clojure.core/let [letvar1115706 {"Tags" (portkey.aws/getback-xml-elem-with-tag "Tags" input)}] (clojure.core/cond-> {:tags (deser-tags (clojure.core/get-in letvar1115706 ["Tags" :content]))})))

(clojure.core/defn- deser-too-many-distributions-with-lambda-associations [input] (clojure.core/let [letvar1115790 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1115790 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1115790 ["Message" :content]))))))

(clojure.core/defn- deser-no-such-origin [input] (clojure.core/let [letvar1115874 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1115874 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1115874 ["Message" :content]))))))

(clojure.core/defn- deser-invalid-protocol-settings [input] (clojure.core/let [letvar1115958 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1115958 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1115958 ["Message" :content]))))))

(clojure.core/defn- deser-too-many-cookie-names-in-white-list [input] (clojure.core/let [letvar1116042 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1116042 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1116042 ["Message" :content]))))))

(clojure.core/defn- deser-too-many-cache-behaviors [input] (clojure.core/let [letvar1116126 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1116126 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1116126 ["Message" :content]))))))

(clojure.core/defn- deser-too-many-origin-custom-headers [input] (clojure.core/let [letvar1116210 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1116210 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1116210 ["Message" :content]))))))

(clojure.core/defn- deser-too-many-streaming-distributions [input] (clojure.core/let [letvar1116294 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1116294 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1116294 ["Message" :content]))))))

(clojure.core/defn- deser-get-streaming-distribution-result [input] (clojure.core/let [letvar1116378 {"StreamingDistribution" (portkey.aws/getback-xml-elem-with-tag "StreamingDistribution" input), "ETag" (portkey.aws/getback-xml-elem-with-tag "ETag" input)}] (clojure.core/cond-> {} (letvar1116378 "StreamingDistribution") (clojure.core/assoc :streaming-distribution (deser-streaming-distribution (clojure.core/get-in letvar1116378 ["StreamingDistribution" :content]))) (letvar1116378 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar1116378 ["ETag" :content]))))))

(clojure.core/defn- deser-too-many-streaming-distribution-cnam-es [input] (clojure.core/let [letvar1116462 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1116462 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1116462 ["Message" :content]))))))

(clojure.core/defn- deser-invalid-viewer-certificate [input] (clojure.core/let [letvar1116546 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1116546 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1116546 ["Message" :content]))))))

(clojure.core/defn- deser-invalid-argument [input] (clojure.core/let [letvar1116630 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1116630 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1116630 ["Message" :content]))))))

(clojure.core/defn- deser-streaming-distribution-not-disabled [input] (clojure.core/let [letvar1116714 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1116714 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1116714 ["Message" :content]))))))

(clojure.core/defn- deser-too-many-certificates [input] (clojure.core/let [letvar1116798 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1116798 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1116798 ["Message" :content]))))))

(clojure.core/defn- deser-access-denied [input] (clojure.core/let [letvar1116882 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1116882 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1116882 ["Message" :content]))))))

(clojure.core/defn- deser-cloud-front-origin-access-identity-in-use [input] (clojure.core/let [letvar1116966 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1116966 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1116966 ["Message" :content]))))))

(clojure.core/defn- deser-invalid-lambda-function-association [input] (clojure.core/let [letvar1117050 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1117050 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1117050 ["Message" :content]))))))

(clojure.core/defn- deser-no-such-resource [input] (clojure.core/let [letvar1117134 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1117134 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1117134 ["Message" :content]))))))

(clojure.core/defn- deser-update-cloud-front-origin-access-identity-result [input] (clojure.core/let [letvar1117218 {"CloudFrontOriginAccessIdentity" (portkey.aws/getback-xml-elem-with-tag "CloudFrontOriginAccessIdentity" input), "ETag" (portkey.aws/getback-xml-elem-with-tag "ETag" input)}] (clojure.core/cond-> {} (letvar1117218 "CloudFrontOriginAccessIdentity") (clojure.core/assoc :cloud-front-origin-access-identity (deser-cloud-front-origin-access-identity (clojure.core/get-in letvar1117218 ["CloudFrontOriginAccessIdentity" :content]))) (letvar1117218 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar1117218 ["ETag" :content]))))))

(clojure.core/defn- deser-invalid-error-code [input] (clojure.core/let [letvar1117302 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1117302 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1117302 ["Message" :content]))))))

(clojure.core/defn- deser-too-many-lambda-function-associations [input] (clojure.core/let [letvar1117386 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1117386 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1117386 ["Message" :content]))))))

(clojure.core/defn- deser-create-streaming-distribution-result [input] (clojure.core/let [letvar1117470 {"StreamingDistribution" (portkey.aws/getback-xml-elem-with-tag "StreamingDistribution" input), "Location" (portkey.aws/getback-xml-elem-with-tag "Location" input), "ETag" (portkey.aws/getback-xml-elem-with-tag "ETag" input)}] (clojure.core/cond-> {} (letvar1117470 "StreamingDistribution") (clojure.core/assoc :streaming-distribution (deser-streaming-distribution (clojure.core/get-in letvar1117470 ["StreamingDistribution" :content]))) (letvar1117470 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar1117470 ["Location" :content]))) (letvar1117470 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar1117470 ["ETag" :content]))))))

(clojure.core/defn- deser-invalid-relative-path [input] (clojure.core/let [letvar1117554 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1117554 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1117554 ["Message" :content]))))))

(clojure.core/defn- deser-invalid-location-code [input] (clojure.core/let [letvar1117638 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1117638 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1117638 ["Message" :content]))))))

(clojure.core/defn- deser-invalid-web-acl-id [input] (clojure.core/let [letvar1117722 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1117722 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1117722 ["Message" :content]))))))

(clojure.core/defn- deser-invalid-origin [input] (clojure.core/let [letvar1117806 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1117806 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1117806 ["Message" :content]))))))

(clojure.core/defn- deser-too-many-cloud-front-origin-access-identities [input] (clojure.core/let [letvar1117890 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1117890 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1117890 ["Message" :content]))))))

(clojure.core/defn- deser-update-distribution-result [input] (clojure.core/let [letvar1117974 {"Distribution" (portkey.aws/getback-xml-elem-with-tag "Distribution" input), "ETag" (portkey.aws/getback-xml-elem-with-tag "ETag" input)}] (clojure.core/cond-> {} (letvar1117974 "Distribution") (clojure.core/assoc :distribution (deser-distribution (clojure.core/get-in letvar1117974 ["Distribution" :content]))) (letvar1117974 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar1117974 ["ETag" :content]))))))

(clojure.core/defn- deser-get-cloud-front-origin-access-identity-result [input] (clojure.core/let [letvar1118058 {"CloudFrontOriginAccessIdentity" (portkey.aws/getback-xml-elem-with-tag "CloudFrontOriginAccessIdentity" input), "ETag" (portkey.aws/getback-xml-elem-with-tag "ETag" input)}] (clojure.core/cond-> {} (letvar1118058 "CloudFrontOriginAccessIdentity") (clojure.core/assoc :cloud-front-origin-access-identity (deser-cloud-front-origin-access-identity (clojure.core/get-in letvar1118058 ["CloudFrontOriginAccessIdentity" :content]))) (letvar1118058 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar1118058 ["ETag" :content]))))))

(clojure.core/defn- deser-invalid-query-string-parameters [input] (clojure.core/let [letvar1118142 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1118142 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1118142 ["Message" :content]))))))

(clojure.core/defn- deser-too-many-origins [input] (clojure.core/let [letvar1118226 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1118226 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1118226 ["Message" :content]))))))

(clojure.core/defn- deser-invalid-ttl-order [input] (clojure.core/let [letvar1118310 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1118310 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1118310 ["Message" :content]))))))

(clojure.core/defn- deser-no-such-streaming-distribution [input] (clojure.core/let [letvar1118394 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1118394 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1118394 ["Message" :content]))))))

(clojure.core/defn- deser-create-cloud-front-origin-access-identity-result [input] (clojure.core/let [letvar1118478 {"CloudFrontOriginAccessIdentity" (portkey.aws/getback-xml-elem-with-tag "CloudFrontOriginAccessIdentity" input), "Location" (portkey.aws/getback-xml-elem-with-tag "Location" input), "ETag" (portkey.aws/getback-xml-elem-with-tag "ETag" input)}] (clojure.core/cond-> {} (letvar1118478 "CloudFrontOriginAccessIdentity") (clojure.core/assoc :cloud-front-origin-access-identity (deser-cloud-front-origin-access-identity (clojure.core/get-in letvar1118478 ["CloudFrontOriginAccessIdentity" :content]))) (letvar1118478 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar1118478 ["Location" :content]))) (letvar1118478 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar1118478 ["ETag" :content]))))))

(clojure.core/defn- deser-cname-already-exists [input] (clojure.core/let [letvar1118562 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1118562 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1118562 ["Message" :content]))))))

(clojure.core/defn- deser-invalid-default-root-object [input] (clojure.core/let [letvar1118646 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1118646 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1118646 ["Message" :content]))))))

(clojure.core/defn- deser-invalid-response-code [input] (clojure.core/let [letvar1118730 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1118730 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1118730 ["Message" :content]))))))

(clojure.core/defn- deser-no-such-invalidation [input] (clojure.core/let [letvar1118814 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1118814 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1118814 ["Message" :content]))))))

(clojure.core/defn- deser-too-many-invalidations-in-progress [input] (clojure.core/let [letvar1118898 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1118898 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1118898 ["Message" :content]))))))

(clojure.core/defn- deser-list-cloud-front-origin-access-identities-result [input] (clojure.core/let [letvar1118982 {"CloudFrontOriginAccessIdentityList" (portkey.aws/getback-xml-elem-with-tag "CloudFrontOriginAccessIdentityList" input)}] (clojure.core/cond-> {} (letvar1118982 "CloudFrontOriginAccessIdentityList") (clojure.core/assoc :cloud-front-origin-access-identity-list (deser-cloud-front-origin-access-identity-list (clojure.core/get-in letvar1118982 ["CloudFrontOriginAccessIdentityList" :content]))))))

(clojure.core/defn- deser-invalid-forward-cookies [input] (clojure.core/let [letvar1119066 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1119066 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1119066 ["Message" :content]))))))

(clojure.core/defn- deser-get-distribution-config-result [input] (clojure.core/let [letvar1119150 {"DistributionConfig" (portkey.aws/getback-xml-elem-with-tag "DistributionConfig" input), "ETag" (portkey.aws/getback-xml-elem-with-tag "ETag" input)}] (clojure.core/cond-> {} (letvar1119150 "DistributionConfig") (clojure.core/assoc :distribution-config (deser-distribution-config (clojure.core/get-in letvar1119150 ["DistributionConfig" :content]))) (letvar1119150 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar1119150 ["ETag" :content]))))))

(clojure.core/defn- deser-invalid-required-protocol [input] (clojure.core/let [letvar1119234 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1119234 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1119234 ["Message" :content]))))))

(clojure.core/defn- deser-get-distribution-result [input] (clojure.core/let [letvar1119318 {"Distribution" (portkey.aws/getback-xml-elem-with-tag "Distribution" input), "ETag" (portkey.aws/getback-xml-elem-with-tag "ETag" input)}] (clojure.core/cond-> {} (letvar1119318 "Distribution") (clojure.core/assoc :distribution (deser-distribution (clojure.core/get-in letvar1119318 ["Distribution" :content]))) (letvar1119318 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar1119318 ["ETag" :content]))))))

(clojure.core/defn- deser-get-streaming-distribution-config-result [input] (clojure.core/let [letvar1119402 {"StreamingDistributionConfig" (portkey.aws/getback-xml-elem-with-tag "StreamingDistributionConfig" input), "ETag" (portkey.aws/getback-xml-elem-with-tag "ETag" input)}] (clojure.core/cond-> {} (letvar1119402 "StreamingDistributionConfig") (clojure.core/assoc :streaming-distribution-config (deser-streaming-distribution-config (clojure.core/get-in letvar1119402 ["StreamingDistributionConfig" :content]))) (letvar1119402 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar1119402 ["ETag" :content]))))))

(clojure.core/defn- deser-invalid-headers-for-s-3-origin [input] (clojure.core/let [letvar1119486 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1119486 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1119486 ["Message" :content]))))))

(clojure.core/defn- deser-too-many-distribution-cnam-es [input] (clojure.core/let [letvar1119570 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1119570 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1119570 ["Message" :content]))))))

(clojure.core/defn- deser-invalid-geo-restriction-parameter [input] (clojure.core/let [letvar1119654 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1119654 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1119654 ["Message" :content]))))))

(clojure.core/defn- deser-no-such-cloud-front-origin-access-identity [input] (clojure.core/let [letvar1119738 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1119738 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1119738 ["Message" :content]))))))

(clojure.core/defn- deser-list-invalidations-result [input] (clojure.core/let [letvar1119822 {"InvalidationList" (portkey.aws/getback-xml-elem-with-tag "InvalidationList" input)}] (clojure.core/cond-> {} (letvar1119822 "InvalidationList") (clojure.core/assoc :invalidation-list (deser-invalidation-list (clojure.core/get-in letvar1119822 ["InvalidationList" :content]))))))

(clojure.core/defn- deser-batch-too-large [input] (clojure.core/let [letvar1119906 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1119906 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1119906 ["Message" :content]))))))

(clojure.core/defn- deser-create-distribution-with-tags-result [input] (clojure.core/let [letvar1119990 {"Distribution" (portkey.aws/getback-xml-elem-with-tag "Distribution" input), "Location" (portkey.aws/getback-xml-elem-with-tag "Location" input), "ETag" (portkey.aws/getback-xml-elem-with-tag "ETag" input)}] (clojure.core/cond-> {} (letvar1119990 "Distribution") (clojure.core/assoc :distribution (deser-distribution (clojure.core/get-in letvar1119990 ["Distribution" :content]))) (letvar1119990 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar1119990 ["Location" :content]))) (letvar1119990 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar1119990 ["ETag" :content]))))))

(clojure.core/defn- deser-list-streaming-distributions-result [input] (clojure.core/let [letvar1120074 {"StreamingDistributionList" (portkey.aws/getback-xml-elem-with-tag "StreamingDistributionList" input)}] (clojure.core/cond-> {} (letvar1120074 "StreamingDistributionList") (clojure.core/assoc :streaming-distribution-list (deser-streaming-distribution-list (clojure.core/get-in letvar1120074 ["StreamingDistributionList" :content]))))))

(clojure.core/defn- deser-create-streaming-distribution-with-tags-result [input] (clojure.core/let [letvar1120158 {"StreamingDistribution" (portkey.aws/getback-xml-elem-with-tag "StreamingDistribution" input), "Location" (portkey.aws/getback-xml-elem-with-tag "Location" input), "ETag" (portkey.aws/getback-xml-elem-with-tag "ETag" input)}] (clojure.core/cond-> {} (letvar1120158 "StreamingDistribution") (clojure.core/assoc :streaming-distribution (deser-streaming-distribution (clojure.core/get-in letvar1120158 ["StreamingDistribution" :content]))) (letvar1120158 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar1120158 ["Location" :content]))) (letvar1120158 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar1120158 ["ETag" :content]))))))

(clojure.core/defn- deser-create-invalidation-result [input] (clojure.core/let [letvar1120242 {"Location" (portkey.aws/getback-xml-elem-with-tag "Location" input), "Invalidation" (portkey.aws/getback-xml-elem-with-tag "Invalidation" input)}] (clojure.core/cond-> {} (letvar1120242 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar1120242 ["Location" :content]))) (letvar1120242 "Invalidation") (clojure.core/assoc :invalidation (deser-invalidation (clojure.core/get-in letvar1120242 ["Invalidation" :content]))))))

(clojure.core/defn- deser-missing-body [input] (clojure.core/let [letvar1120326 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1120326 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1120326 ["Message" :content]))))))

(clojure.core/defn- deser-get-cloud-front-origin-access-identity-config-result [input] (clojure.core/let [letvar1120410 {"CloudFrontOriginAccessIdentityConfig" (portkey.aws/getback-xml-elem-with-tag "CloudFrontOriginAccessIdentityConfig" input), "ETag" (portkey.aws/getback-xml-elem-with-tag "ETag" input)}] (clojure.core/cond-> {} (letvar1120410 "CloudFrontOriginAccessIdentityConfig") (clojure.core/assoc :cloud-front-origin-access-identity-config (deser-cloud-front-origin-access-identity-config (clojure.core/get-in letvar1120410 ["CloudFrontOriginAccessIdentityConfig" :content]))) (letvar1120410 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar1120410 ["ETag" :content]))))))

(clojure.core/defn- deser-distribution-not-disabled [input] (clojure.core/let [letvar1120494 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1120494 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1120494 ["Message" :content]))))))

(clojure.core/defn- deser-cloud-front-origin-access-identity-already-exists [input] (clojure.core/let [letvar1120578 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1120578 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1120578 ["Message" :content]))))))

(clojure.core/defn- deser-precondition-failed [input] (clojure.core/let [letvar1120662 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1120662 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1120662 ["Message" :content]))))))

(clojure.core/defn- deser-distribution-already-exists [input] (clojure.core/let [letvar1120746 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1120746 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1120746 ["Message" :content]))))))

(clojure.core/defn- deser-invalid-origin-access-identity [input] (clojure.core/let [letvar1120830 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1120830 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1120830 ["Message" :content]))))))

(clojure.core/defn- deser-too-many-trusted-signers [input] (clojure.core/let [letvar1120914 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1120914 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1120914 ["Message" :content]))))))

(clojure.core/defn- deser-invalid-minimum-protocol-version [input] (clojure.core/let [letvar1120998 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1120998 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1120998 ["Message" :content]))))))

(clojure.core/defn- deser-streaming-distribution-already-exists [input] (clojure.core/let [letvar1121082 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1121082 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1121082 ["Message" :content]))))))

(clojure.core/defn- deser-invalid-if-match-version [input] (clojure.core/let [letvar1121166 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1121166 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1121166 ["Message" :content]))))))

(clojure.core/defn- deser-create-distribution-result [input] (clojure.core/let [letvar1121250 {"Distribution" (portkey.aws/getback-xml-elem-with-tag "Distribution" input), "Location" (portkey.aws/getback-xml-elem-with-tag "Location" input), "ETag" (portkey.aws/getback-xml-elem-with-tag "ETag" input)}] (clojure.core/cond-> {} (letvar1121250 "Distribution") (clojure.core/assoc :distribution (deser-distribution (clojure.core/get-in letvar1121250 ["Distribution" :content]))) (letvar1121250 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar1121250 ["Location" :content]))) (letvar1121250 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar1121250 ["ETag" :content]))))))

(clojure.core/defn- deser-too-many-distributions [input] (clojure.core/let [letvar1121334 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1121334 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1121334 ["Message" :content]))))))

(clojure.core/defn- deser-no-such-distribution [input] (clojure.core/let [letvar1121418 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1121418 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1121418 ["Message" :content]))))))

(clojure.core/defn- deser-update-streaming-distribution-result [input] (clojure.core/let [letvar1121502 {"StreamingDistribution" (portkey.aws/getback-xml-elem-with-tag "StreamingDistribution" input), "ETag" (portkey.aws/getback-xml-elem-with-tag "ETag" input)}] (clojure.core/cond-> {} (letvar1121502 "StreamingDistribution") (clojure.core/assoc :streaming-distribution (deser-streaming-distribution (clojure.core/get-in letvar1121502 ["StreamingDistribution" :content]))) (letvar1121502 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar1121502 ["ETag" :content]))))))

(clojure.core/defn- deser-illegal-update [input] (clojure.core/let [letvar1121586 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1121586 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1121586 ["Message" :content]))))))

(clojure.core/defn- deser-inconsistent-quantities [input] (clojure.core/let [letvar1121670 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1121670 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1121670 ["Message" :content]))))))

(clojure.core/defn- deser-list-distributions-by-web-acl-id-result [input] (clojure.core/let [letvar1121754 {"DistributionList" (portkey.aws/getback-xml-elem-with-tag "DistributionList" input)}] (clojure.core/cond-> {} (letvar1121754 "DistributionList") (clojure.core/assoc :distribution-list (deser-distribution-list (clojure.core/get-in letvar1121754 ["DistributionList" :content]))))))

(clojure.core/defn- deser-too-many-query-string-parameters [input] (clojure.core/let [letvar1121838 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1121838 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1121838 ["Message" :content]))))))

(clojure.core/defn- deser-invalid-tagging [input] (clojure.core/let [letvar1121922 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1121922 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1121922 ["Message" :content]))))))

(clojure.core/defn- deser-list-distributions-result [input] (clojure.core/let [letvar1122006 {"DistributionList" (portkey.aws/getback-xml-elem-with-tag "DistributionList" input)}] (clojure.core/cond-> {} (letvar1122006 "DistributionList") (clojure.core/assoc :distribution-list (deser-distribution-list (clojure.core/get-in letvar1122006 ["DistributionList" :content]))))))

(clojure.core/defn- deser-trusted-signer-does-not-exist [input] (clojure.core/let [letvar1122090 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1122090 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1122090 ["Message" :content]))))))

(clojure.core/defn- deser-get-invalidation-result [input] (clojure.core/let [letvar1122174 {"Invalidation" (portkey.aws/getback-xml-elem-with-tag "Invalidation" input)}] (clojure.core/cond-> {} (letvar1122174 "Invalidation") (clojure.core/assoc :invalidation (deser-invalidation (clojure.core/get-in letvar1122174 ["Invalidation" :content]))))))

(clojure.core/defn- deser-too-many-headers-in-forwarded-values [input] (clojure.core/let [letvar1122258 {"Message" (portkey.aws/getback-xml-elem-with-tag "Message" input)}] (clojure.core/cond-> {} (letvar1122258 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1122258 ["Message" :content]))))))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.tag-keys/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/tag-keys (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.tag-keys/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/list-tags-for-resource-result (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.list-distributions-by-web-acl-id-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.list-distributions-by-web-acl-id-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.list-distributions-by-web-acl-id-request/web-acl-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/list-distributions-by-web-acl-id-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.list-distributions-by-web-acl-id-request/web-acl-id] :opt-un [:portkey.aws.cloudfront.-2016-11-25.list-distributions-by-web-acl-id-request/marker :portkey.aws.cloudfront.-2016-11-25.list-distributions-by-web-acl-id-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.too-many-distributions-with-lambda-associations/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/too-many-distributions-with-lambda-associations (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.too-many-distributions-with-lambda-associations/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.no-such-origin/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/no-such-origin (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.no-such-origin/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.cookie-names/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.cookie-names/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/cookie-name-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/cookie-names (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.cookie-names/quantity] :opt-un [:portkey.aws.cloudfront.-2016-11-25.cookie-names/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.logging-config/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.logging-config/include-cookies (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.logging-config/bucket (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.logging-config/prefix (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/logging-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.logging-config/enabled :portkey.aws.cloudfront.-2016-11-25.logging-config/include-cookies :portkey.aws.cloudfront.-2016-11-25.logging-config/bucket :portkey.aws.cloudfront.-2016-11-25.logging-config/prefix] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/streaming-distribution-config-with-tags (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25/streaming-distribution-config :portkey.aws.cloudfront.-2016-11-25/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalid-protocol-settings/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/invalid-protocol-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.invalid-protocol-settings/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.too-many-cookie-names-in-white-list/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/too-many-cookie-names-in-white-list (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.too-many-cookie-names-in-white-list/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalidation-summary/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalidation-summary/create-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalidation-summary/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/invalidation-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.invalidation-summary/id :portkey.aws.cloudfront.-2016-11-25.invalidation-summary/create-time :portkey.aws.cloudfront.-2016-11-25.invalidation-summary/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.too-many-cache-behaviors/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/too-many-cache-behaviors (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.too-many-cache-behaviors/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.too-many-origin-custom-headers/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/too-many-origin-custom-headers (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.too-many-origin-custom-headers/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/custom-error-response-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-11-25/custom-error-response))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalidation/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalidation/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalidation/create-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/invalidation (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.invalidation/id :portkey.aws.cloudfront.-2016-11-25.invalidation/status :portkey.aws.cloudfront.-2016-11-25.invalidation/create-time :portkey.aws.cloudfront.-2016-11-25/invalidation-batch] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.too-many-streaming-distributions/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/too-many-streaming-distributions (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.too-many-streaming-distributions/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/certificate-source #{"cloudfront" "acm" :acm :cloudfront :iam "iam"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/location-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-11-25/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.get-streaming-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/get-streaming-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25/streaming-distribution :portkey.aws.cloudfront.-2016-11-25.get-streaming-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/key-pair-id-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-11-25/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.too-many-streaming-distribution-cnam-es/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/too-many-streaming-distribution-cnam-es (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.too-many-streaming-distribution-cnam-es/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/restrictions (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25/geo-restriction] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalid-viewer-certificate/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/invalid-viewer-certificate (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.invalid-viewer-certificate/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalid-argument/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/invalid-argument (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.invalid-argument/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-not-disabled/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/streaming-distribution-not-disabled (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.streaming-distribution-not-disabled/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.get-streaming-distribution-config-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/get-streaming-distribution-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.get-streaming-distribution-config-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.delete-streaming-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.delete-streaming-distribution-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/delete-streaming-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.delete-streaming-distribution-request/id] :opt-un [:portkey.aws.cloudfront.-2016-11-25.delete-streaming-distribution-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.get-cloud-front-origin-access-identity-config-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/get-cloud-front-origin-access-identity-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.get-cloud-front-origin-access-identity-config-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.too-many-certificates/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/too-many-certificates (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.too-many-certificates/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.distribution/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.distribution/arn (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.distribution/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.distribution/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.distribution/in-progress-invalidation-batches (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.distribution/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/distribution (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.distribution/id :portkey.aws.cloudfront.-2016-11-25.distribution/arn :portkey.aws.cloudfront.-2016-11-25.distribution/status :portkey.aws.cloudfront.-2016-11-25.distribution/last-modified-time :portkey.aws.cloudfront.-2016-11-25.distribution/in-progress-invalidation-batches :portkey.aws.cloudfront.-2016-11-25.distribution/domain-name :portkey.aws.cloudfront.-2016-11-25/active-trusted-signers :portkey.aws.cloudfront.-2016-11-25/distribution-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.cloud-front-origin-access-identity-list/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.cloud-front-origin-access-identity-list/next-marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.cloud-front-origin-access-identity-list/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.cloud-front-origin-access-identity-list/is-truncated (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.cloud-front-origin-access-identity-list/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.cloud-front-origin-access-identity-list/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/cloud-front-origin-access-identity-summary-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/cloud-front-origin-access-identity-list (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.cloud-front-origin-access-identity-list/marker :portkey.aws.cloudfront.-2016-11-25.cloud-front-origin-access-identity-list/max-items :portkey.aws.cloudfront.-2016-11-25.cloud-front-origin-access-identity-list/is-truncated :portkey.aws.cloudfront.-2016-11-25.cloud-front-origin-access-identity-list/quantity] :opt-un [:portkey.aws.cloudfront.-2016-11-25.cloud-front-origin-access-identity-list/next-marker :portkey.aws.cloudfront.-2016-11-25.cloud-front-origin-access-identity-list/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.lambda-function-association/lambda-function-arn (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/lambda-function-association (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.lambda-function-association/lambda-function-arn :portkey.aws.cloudfront.-2016-11-25/event-type]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.forwarded-values/query-string (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.forwarded-values/cookies (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/cookie-preference))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/forwarded-values (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.forwarded-values/query-string :portkey.aws.cloudfront.-2016-11-25.forwarded-values/cookies] :opt-un [:portkey.aws.cloudfront.-2016-11-25/headers :portkey.aws.cloudfront.-2016-11-25/query-string-cache-keys]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.access-denied/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/access-denied (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.access-denied/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalidation-batch/caller-reference (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/invalidation-batch (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25/paths :portkey.aws.cloudfront.-2016-11-25.invalidation-batch/caller-reference] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/invalidation-summary-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-11-25/invalidation-summary))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.delete-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.delete-distribution-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/delete-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.delete-distribution-request/id] :opt-un [:portkey.aws.cloudfront.-2016-11-25.delete-distribution-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/query-string-cache-keys-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-11-25/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-list/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-list/next-marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-list/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-list/is-truncated (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-list/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-list/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/streaming-distribution-summary-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/streaming-distribution-list (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.streaming-distribution-list/marker :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-list/max-items :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-list/is-truncated :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-list/quantity] :opt-un [:portkey.aws.cloudfront.-2016-11-25.streaming-distribution-list/next-marker :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-list/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/item-selection #{"none" "whitelist" :all "all" :whitelist :none})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.list-tags-for-resource-request/resource (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/resource-arn))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/list-tags-for-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.list-tags-for-resource-request/resource] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.streaming-distribution/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.streaming-distribution/arn (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.streaming-distribution/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.streaming-distribution/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.streaming-distribution/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/streaming-distribution (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.streaming-distribution/id :portkey.aws.cloudfront.-2016-11-25.streaming-distribution/arn :portkey.aws.cloudfront.-2016-11-25.streaming-distribution/status :portkey.aws.cloudfront.-2016-11-25.streaming-distribution/domain-name :portkey.aws.cloudfront.-2016-11-25/active-trusted-signers :portkey.aws.cloudfront.-2016-11-25/streaming-distribution-config] :opt-un [:portkey.aws.cloudfront.-2016-11-25.streaming-distribution/last-modified-time]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/create-distribution-with-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25/distribution-config-with-tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.lambda-function-associations/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.lambda-function-associations/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/lambda-function-association-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/lambda-function-associations (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.lambda-function-associations/quantity] :opt-un [:portkey.aws.cloudfront.-2016-11-25.lambda-function-associations/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.cloud-front-origin-access-identity-in-use/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/cloud-front-origin-access-identity-in-use (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.cloud-front-origin-access-identity-in-use/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/viewer-protocol-policy #{"allow-all" :redirecttohttps :httpsonly "https-only" "redirect-to-https" :allowall})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalid-lambda-function-association/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/invalid-lambda-function-association (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.invalid-lambda-function-association/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.custom-error-response/error-code (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.custom-error-response/response-page-path (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.custom-error-response/response-code (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.custom-error-response/error-caching-min-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/custom-error-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.custom-error-response/error-code] :opt-un [:portkey.aws.cloudfront.-2016-11-25.custom-error-response/response-page-path :portkey.aws.cloudfront.-2016-11-25.custom-error-response/response-code :portkey.aws.cloudfront.-2016-11-25.custom-error-response/error-caching-min-ttl]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/distribution-summary-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-11-25/distribution-summary))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.signer/aws-account-number (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/signer (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.signer/aws-account-number :portkey.aws.cloudfront.-2016-11-25/key-pair-ids]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.no-such-resource/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/no-such-resource (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.no-such-resource/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/origin-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-11-25/origin :min-count 1))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.update-cloud-front-origin-access-identity-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/update-cloud-front-origin-access-identity-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25/cloud-front-origin-access-identity :portkey.aws.cloudfront.-2016-11-25.update-cloud-front-origin-access-identity-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalid-error-code/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/invalid-error-code (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.invalid-error-code/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.cached-methods/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.cached-methods/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/methods-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/cached-methods (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.cached-methods/quantity :portkey.aws.cloudfront.-2016-11-25.cached-methods/items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1008244__auto__] (clojure.core/<= 1 (clojure.core/count s__1008244__auto__))) (clojure.core/fn [s__1008245__auto__] (clojure.core/< (clojure.core/count s__1008245__auto__) 128)) (clojure.core/fn [s__1008246__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__1008246__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.too-many-lambda-function-associations/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/too-many-lambda-function-associations (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.too-many-lambda-function-associations/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.create-streaming-distribution-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.create-streaming-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/create-streaming-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25/streaming-distribution :portkey.aws.cloudfront.-2016-11-25.create-streaming-distribution-result/location :portkey.aws.cloudfront.-2016-11-25.create-streaming-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.tags/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/tag-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/tags (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.tags/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/streaming-distribution-summary-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-11-25/streaming-distribution-summary))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.cache-behaviors/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.cache-behaviors/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/cache-behavior-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/cache-behaviors (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.cache-behaviors/quantity] :opt-un [:portkey.aws.cloudfront.-2016-11-25.cache-behaviors/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.cache-behavior/smooth-streaming (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.cache-behavior/compress (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.cache-behavior/target-origin-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.cache-behavior/min-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.cache-behavior/path-pattern (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.cache-behavior/max-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.cache-behavior/default-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/cache-behavior (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.cache-behavior/path-pattern :portkey.aws.cloudfront.-2016-11-25.cache-behavior/target-origin-id :portkey.aws.cloudfront.-2016-11-25/forwarded-values :portkey.aws.cloudfront.-2016-11-25/trusted-signers :portkey.aws.cloudfront.-2016-11-25/viewer-protocol-policy :portkey.aws.cloudfront.-2016-11-25.cache-behavior/min-ttl] :opt-un [:portkey.aws.cloudfront.-2016-11-25.cache-behavior/smooth-streaming :portkey.aws.cloudfront.-2016-11-25.cache-behavior/compress :portkey.aws.cloudfront.-2016-11-25/lambda-function-associations :portkey.aws.cloudfront.-2016-11-25.cache-behavior/max-ttl :portkey.aws.cloudfront.-2016-11-25/allowed-methods :portkey.aws.cloudfront.-2016-11-25.cache-behavior/default-ttl]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.list-streaming-distributions-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.list-streaming-distributions-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/list-streaming-distributions-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.list-streaming-distributions-request/marker :portkey.aws.cloudfront.-2016-11-25.list-streaming-distributions-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.active-trusted-signers/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.active-trusted-signers/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.active-trusted-signers/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/signer-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/active-trusted-signers (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.active-trusted-signers/enabled :portkey.aws.cloudfront.-2016-11-25.active-trusted-signers/quantity] :opt-un [:portkey.aws.cloudfront.-2016-11-25.active-trusted-signers/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalid-relative-path/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/invalid-relative-path (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.invalid-relative-path/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.origin/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.origin/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.origin/origin-path (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/origin (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.origin/id :portkey.aws.cloudfront.-2016-11-25.origin/domain-name] :opt-un [:portkey.aws.cloudfront.-2016-11-25.origin/origin-path :portkey.aws.cloudfront.-2016-11-25/custom-headers :portkey.aws.cloudfront.-2016-11-25/s-3-origin-config :portkey.aws.cloudfront.-2016-11-25/custom-origin-config]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalid-location-code/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/invalid-location-code (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.invalid-location-code/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalid-web-acl-id/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/invalid-web-acl-id (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.invalid-web-acl-id/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalid-origin/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/invalid-origin (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.invalid-origin/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.too-many-cloud-front-origin-access-identities/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/too-many-cloud-front-origin-access-identities (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.too-many-cloud-front-origin-access-identities/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.get-cloud-front-origin-access-identity-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/get-cloud-front-origin-access-identity-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.get-cloud-front-origin-access-identity-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.custom-error-responses/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.custom-error-responses/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/custom-error-response-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/custom-error-responses (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.custom-error-responses/quantity] :opt-un [:portkey.aws.cloudfront.-2016-11-25.custom-error-responses/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalidation-list/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalidation-list/next-marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalidation-list/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalidation-list/is-truncated (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalidation-list/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalidation-list/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/invalidation-summary-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/invalidation-list (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.invalidation-list/marker :portkey.aws.cloudfront.-2016-11-25.invalidation-list/max-items :portkey.aws.cloudfront.-2016-11-25.invalidation-list/is-truncated :portkey.aws.cloudfront.-2016-11-25.invalidation-list/quantity] :opt-un [:portkey.aws.cloudfront.-2016-11-25.invalidation-list/next-marker :portkey.aws.cloudfront.-2016-11-25.invalidation-list/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.origin-ssl-protocols/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.origin-ssl-protocols/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/ssl-protocols-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/origin-ssl-protocols (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.origin-ssl-protocols/quantity :portkey.aws.cloudfront.-2016-11-25.origin-ssl-protocols/items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.aliases/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.aliases/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/alias-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/aliases (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.aliases/quantity] :opt-un [:portkey.aws.cloudfront.-2016-11-25.aliases/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/event-type #{:viewerresponse :originresponse :viewerrequest "viewer-response" :originrequest "origin-response" "origin-request" "viewer-request"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.update-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/update-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25/distribution :portkey.aws.cloudfront.-2016-11-25.update-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.get-cloud-front-origin-access-identity-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/get-cloud-front-origin-access-identity-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25/cloud-front-origin-access-identity :portkey.aws.cloudfront.-2016-11-25.get-cloud-front-origin-access-identity-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.get-streaming-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/get-streaming-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.get-streaming-distribution-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.allowed-methods/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.allowed-methods/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/methods-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/allowed-methods (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.allowed-methods/quantity :portkey.aws.cloudfront.-2016-11-25.allowed-methods/items] :opt-un [:portkey.aws.cloudfront.-2016-11-25/cached-methods]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/price-class #{"PriceClass_200" :price-class-100 :price-class-200 "PriceClass_All" :price-class-all "PriceClass_100"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalid-query-string-parameters/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/invalid-query-string-parameters (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.invalid-query-string-parameters/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.custom-origin-config/http-port (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.custom-origin-config/https-port (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/custom-origin-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.custom-origin-config/http-port :portkey.aws.cloudfront.-2016-11-25.custom-origin-config/https-port :portkey.aws.cloudfront.-2016-11-25/origin-protocol-policy] :opt-un [:portkey.aws.cloudfront.-2016-11-25/origin-ssl-protocols]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.too-many-origins/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/too-many-origins (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.too-many-origins/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalid-ttl-order/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/invalid-ttl-order (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.invalid-ttl-order/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.list-distributions-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.list-distributions-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/list-distributions-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.list-distributions-request/marker :portkey.aws.cloudfront.-2016-11-25.list-distributions-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.no-such-streaming-distribution/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/no-such-streaming-distribution (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.no-such-streaming-distribution/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.s-3-origin/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.s-3-origin/origin-access-identity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/s-3-origin (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.s-3-origin/domain-name :portkey.aws.cloudfront.-2016-11-25.s-3-origin/origin-access-identity] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.create-cloud-front-origin-access-identity-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.create-cloud-front-origin-access-identity-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/create-cloud-front-origin-access-identity-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25/cloud-front-origin-access-identity :portkey.aws.cloudfront.-2016-11-25.create-cloud-front-origin-access-identity-result/location :portkey.aws.cloudfront.-2016-11-25.create-cloud-front-origin-access-identity-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.cname-already-exists/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/cname-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.cname-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-summary/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-summary/arn (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-summary/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-summary/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-summary/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-summary/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-summary/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/streaming-distribution-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.streaming-distribution-summary/id :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-summary/arn :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-summary/status :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-summary/last-modified-time :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-summary/domain-name :portkey.aws.cloudfront.-2016-11-25/s-3-origin :portkey.aws.cloudfront.-2016-11-25/aliases :portkey.aws.cloudfront.-2016-11-25/trusted-signers :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-summary/comment :portkey.aws.cloudfront.-2016-11-25/price-class :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-summary/enabled] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalid-default-root-object/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/invalid-default-root-object (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.invalid-default-root-object/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.cloud-front-origin-access-identity/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.cloud-front-origin-access-identity/s-3-canonical-user-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/cloud-front-origin-access-identity (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.cloud-front-origin-access-identity/id :portkey.aws.cloudfront.-2016-11-25.cloud-front-origin-access-identity/s-3-canonical-user-id] :opt-un [:portkey.aws.cloudfront.-2016-11-25/cloud-front-origin-access-identity-config]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.update-cloud-front-origin-access-identity-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.update-cloud-front-origin-access-identity-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/update-cloud-front-origin-access-identity-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25/cloud-front-origin-access-identity-config :portkey.aws.cloudfront.-2016-11-25.update-cloud-front-origin-access-identity-request/id] :opt-un [:portkey.aws.cloudfront.-2016-11-25.update-cloud-front-origin-access-identity-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.create-invalidation-request/distribution-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/create-invalidation-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.create-invalidation-request/distribution-id :portkey.aws.cloudfront.-2016-11-25/invalidation-batch] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.tag-resource-request/resource (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/resource-arn))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/tag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.tag-resource-request/resource :portkey.aws.cloudfront.-2016-11-25/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/create-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25/distribution-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/create-streaming-distribution-with-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25/streaming-distribution-config-with-tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalid-response-code/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/invalid-response-code (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.invalid-response-code/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/cookie-name-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-11-25/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/tag-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-11-25/tag))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.query-string-cache-keys/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.query-string-cache-keys/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/query-string-cache-keys-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/query-string-cache-keys (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.query-string-cache-keys/quantity] :opt-un [:portkey.aws.cloudfront.-2016-11-25.query-string-cache-keys/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.no-such-invalidation/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/no-such-invalidation (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.no-such-invalidation/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.get-distribution-config-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/get-distribution-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.get-distribution-config-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.key-pair-ids/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.key-pair-ids/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/key-pair-id-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/key-pair-ids (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.key-pair-ids/quantity] :opt-un [:portkey.aws.cloudfront.-2016-11-25.key-pair-ids/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.distribution-config/default-root-object (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.distribution-config/caller-reference (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.distribution-config/is-ipv-6-enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.distribution-config/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.distribution-config/web-acl-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.distribution-config/logging (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/logging-config))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.distribution-config/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/distribution-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.distribution-config/caller-reference :portkey.aws.cloudfront.-2016-11-25/origins :portkey.aws.cloudfront.-2016-11-25/default-cache-behavior :portkey.aws.cloudfront.-2016-11-25.distribution-config/comment :portkey.aws.cloudfront.-2016-11-25.distribution-config/enabled] :opt-un [:portkey.aws.cloudfront.-2016-11-25.distribution-config/default-root-object :portkey.aws.cloudfront.-2016-11-25.distribution-config/is-ipv-6-enabled :portkey.aws.cloudfront.-2016-11-25/restrictions :portkey.aws.cloudfront.-2016-11-25.distribution-config/web-acl-id :portkey.aws.cloudfront.-2016-11-25.distribution-config/logging :portkey.aws.cloudfront.-2016-11-25/cache-behaviors :portkey.aws.cloudfront.-2016-11-25/custom-error-responses :portkey.aws.cloudfront.-2016-11-25/aliases :portkey.aws.cloudfront.-2016-11-25/price-class :portkey.aws.cloudfront.-2016-11-25/http-version :portkey.aws.cloudfront.-2016-11-25/viewer-certificate]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-11-25/tag-key))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.too-many-invalidations-in-progress/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/too-many-invalidations-in-progress (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.too-many-invalidations-in-progress/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/create-streaming-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25/streaming-distribution-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/list-cloud-front-origin-access-identities-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25/cloud-front-origin-access-identity-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalid-forward-cookies/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/invalid-forward-cookies (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.invalid-forward-cookies/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.get-distribution-config-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/get-distribution-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25/distribution-config :portkey.aws.cloudfront.-2016-11-25.get-distribution-config-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalid-required-protocol/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/invalid-required-protocol (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.invalid-required-protocol/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/ssl-protocols-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-11-25/ssl-protocol))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/aws-account-number-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-11-25/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1008244__auto__] (clojure.core/<= 0 (clojure.core/count s__1008244__auto__))) (clojure.core/fn [s__1008245__auto__] (clojure.core/< (clojure.core/count s__1008245__auto__) 256)) (clojure.core/fn [s__1008246__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__1008246__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/method #{"DELETE" :get "OPTIONS" :patch "PATCH" :delete :head "HEAD" "POST" :post :options :put "GET" "PUT"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.get-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/get-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25/distribution :portkey.aws.cloudfront.-2016-11-25.get-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/alias-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-11-25/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.get-streaming-distribution-config-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/get-streaming-distribution-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25/streaming-distribution-config :portkey.aws.cloudfront.-2016-11-25.get-streaming-distribution-config-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/origin-custom-headers-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-11-25/origin-custom-header))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/create-cloud-front-origin-access-identity-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25/cloud-front-origin-access-identity-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.get-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/get-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.get-distribution-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/origin-protocol-policy #{"match-viewer" :matchviewer :httpsonly :httponly "https-only" "http-only"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/signer-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-11-25/signer))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalid-headers-for-s-3-origin/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/invalid-headers-for-s-3-origin (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.invalid-headers-for-s-3-origin/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/path-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-11-25/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.too-many-distribution-cnam-es/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/too-many-distribution-cnam-es (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.too-many-distribution-cnam-es/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/geo-restriction-type #{"none" "whitelist" "blacklist" :blacklist :whitelist :none})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalid-geo-restriction-parameter/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/invalid-geo-restriction-parameter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.invalid-geo-restriction-parameter/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.no-such-cloud-front-origin-access-identity/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/no-such-cloud-front-origin-access-identity (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.no-such-cloud-front-origin-access-identity/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/list-invalidations-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25/invalidation-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.paths/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.paths/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/path-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/paths (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.paths/quantity] :opt-un [:portkey.aws.cloudfront.-2016-11-25.paths/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.batch-too-large/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/batch-too-large (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.batch-too-large/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.create-distribution-with-tags-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.create-distribution-with-tags-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/create-distribution-with-tags-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25/distribution :portkey.aws.cloudfront.-2016-11-25.create-distribution-with-tags-result/location :portkey.aws.cloudfront.-2016-11-25.create-distribution-with-tags-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.update-streaming-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.update-streaming-distribution-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/update-streaming-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25/streaming-distribution-config :portkey.aws.cloudfront.-2016-11-25.update-streaming-distribution-request/id] :opt-un [:portkey.aws.cloudfront.-2016-11-25.update-streaming-distribution-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/list-streaming-distributions-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25/streaming-distribution-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.create-streaming-distribution-with-tags-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.create-streaming-distribution-with-tags-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/create-streaming-distribution-with-tags-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25/streaming-distribution :portkey.aws.cloudfront.-2016-11-25.create-streaming-distribution-with-tags-result/location :portkey.aws.cloudfront.-2016-11-25.create-streaming-distribution-with-tags-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.create-invalidation-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/create-invalidation-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.create-invalidation-result/location :portkey.aws.cloudfront.-2016-11-25/invalidation]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.missing-body/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/missing-body (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.missing-body/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.cloud-front-origin-access-identity-summary/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.cloud-front-origin-access-identity-summary/s-3-canonical-user-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.cloud-front-origin-access-identity-summary/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/cloud-front-origin-access-identity-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.cloud-front-origin-access-identity-summary/id :portkey.aws.cloudfront.-2016-11-25.cloud-front-origin-access-identity-summary/s-3-canonical-user-id :portkey.aws.cloudfront.-2016-11-25.cloud-front-origin-access-identity-summary/comment] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.get-cloud-front-origin-access-identity-config-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/get-cloud-front-origin-access-identity-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25/cloud-front-origin-access-identity-config :portkey.aws.cloudfront.-2016-11-25.get-cloud-front-origin-access-identity-config-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/cache-behavior-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-11-25/cache-behavior))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.origin-custom-header/header-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.origin-custom-header/header-value (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/origin-custom-header (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.origin-custom-header/header-name :portkey.aws.cloudfront.-2016-11-25.origin-custom-header/header-value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-config/caller-reference (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-config/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-config/logging (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/streaming-logging-config))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-config/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/streaming-distribution-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.streaming-distribution-config/caller-reference :portkey.aws.cloudfront.-2016-11-25/s-3-origin :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-config/comment :portkey.aws.cloudfront.-2016-11-25/trusted-signers :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-config/enabled] :opt-un [:portkey.aws.cloudfront.-2016-11-25/aliases :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-config/logging :portkey.aws.cloudfront.-2016-11-25/price-class]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.distribution-not-disabled/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/distribution-not-disabled (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.distribution-not-disabled/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.cloud-front-origin-access-identity-already-exists/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/cloud-front-origin-access-identity-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.cloud-front-origin-access-identity-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.precondition-failed/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/precondition-failed (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.precondition-failed/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.s-3-origin-config/origin-access-identity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/s-3-origin-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.s-3-origin-config/origin-access-identity] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.distribution-already-exists/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/distribution-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.distribution-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/cloud-front-origin-access-identity-summary-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-11-25/cloud-front-origin-access-identity-summary))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalid-origin-access-identity/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/invalid-origin-access-identity (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.invalid-origin-access-identity/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.tag/key (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/tag-key))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.tag/value (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/tag-value))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.tag/key] :opt-un [:portkey.aws.cloudfront.-2016-11-25.tag/value]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.too-many-trusted-signers/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/too-many-trusted-signers (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.too-many-trusted-signers/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.streaming-logging-config/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.streaming-logging-config/bucket (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.streaming-logging-config/prefix (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/streaming-logging-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.streaming-logging-config/enabled :portkey.aws.cloudfront.-2016-11-25.streaming-logging-config/bucket :portkey.aws.cloudfront.-2016-11-25.streaming-logging-config/prefix] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalid-minimum-protocol-version/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/invalid-minimum-protocol-version (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.invalid-minimum-protocol-version/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.distribution-summary/is-ipv-6-enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.distribution-summary/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.distribution-summary/web-acl-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.distribution-summary/arn (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.distribution-summary/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.distribution-summary/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.distribution-summary/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.distribution-summary/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.distribution-summary/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/distribution-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.distribution-summary/id :portkey.aws.cloudfront.-2016-11-25.distribution-summary/arn :portkey.aws.cloudfront.-2016-11-25.distribution-summary/status :portkey.aws.cloudfront.-2016-11-25.distribution-summary/last-modified-time :portkey.aws.cloudfront.-2016-11-25.distribution-summary/domain-name :portkey.aws.cloudfront.-2016-11-25/aliases :portkey.aws.cloudfront.-2016-11-25/origins :portkey.aws.cloudfront.-2016-11-25/default-cache-behavior :portkey.aws.cloudfront.-2016-11-25/cache-behaviors :portkey.aws.cloudfront.-2016-11-25/custom-error-responses :portkey.aws.cloudfront.-2016-11-25.distribution-summary/comment :portkey.aws.cloudfront.-2016-11-25/price-class :portkey.aws.cloudfront.-2016-11-25.distribution-summary/enabled :portkey.aws.cloudfront.-2016-11-25/viewer-certificate :portkey.aws.cloudfront.-2016-11-25/restrictions :portkey.aws.cloudfront.-2016-11-25.distribution-summary/web-acl-id :portkey.aws.cloudfront.-2016-11-25/http-version :portkey.aws.cloudfront.-2016-11-25.distribution-summary/is-ipv-6-enabled] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/ssl-protocol #{"TLSv1" :tl-sv-12 :tl-sv-1 "TLSv1.2" :ss-lv-3 "SSLv3" "TLSv1.1" :tl-sv-11})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-already-exists/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/streaming-distribution-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.streaming-distribution-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/lambda-function-association-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-11-25/lambda-function-association))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.headers/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.headers/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/header-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/headers (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.headers/quantity] :opt-un [:portkey.aws.cloudfront.-2016-11-25.headers/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/minimum-protocol-version #{"TLSv1" :tl-sv-1 :ss-lv-3 "SSLv3"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.origins/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.origins/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/origin-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/origins (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.origins/quantity] :opt-un [:portkey.aws.cloudfront.-2016-11-25.origins/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/distribution-config-with-tags (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25/distribution-config :portkey.aws.cloudfront.-2016-11-25/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/header-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-11-25/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalid-if-match-version/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/invalid-if-match-version (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.invalid-if-match-version/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.create-distribution-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.create-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/create-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25/distribution :portkey.aws.cloudfront.-2016-11-25.create-distribution-result/location :portkey.aws.cloudfront.-2016-11-25.create-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.delete-cloud-front-origin-access-identity-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.delete-cloud-front-origin-access-identity-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/delete-cloud-front-origin-access-identity-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.delete-cloud-front-origin-access-identity-request/id] :opt-un [:portkey.aws.cloudfront.-2016-11-25.delete-cloud-front-origin-access-identity-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.too-many-distributions/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/too-many-distributions (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.too-many-distributions/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.no-such-distribution/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/no-such-distribution (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.no-such-distribution/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.get-invalidation-request/distribution-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.get-invalidation-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/get-invalidation-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.get-invalidation-request/distribution-id :portkey.aws.cloudfront.-2016-11-25.get-invalidation-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/resource-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1008246__auto__] (clojure.core/re-matches #"arn:aws:cloudfront::[0-9]+:.*" s__1008246__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.distribution-list/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.distribution-list/next-marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.distribution-list/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.distribution-list/is-truncated (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.distribution-list/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.distribution-list/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/distribution-summary-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/distribution-list (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.distribution-list/marker :portkey.aws.cloudfront.-2016-11-25.distribution-list/max-items :portkey.aws.cloudfront.-2016-11-25.distribution-list/is-truncated :portkey.aws.cloudfront.-2016-11-25.distribution-list/quantity] :opt-un [:portkey.aws.cloudfront.-2016-11-25.distribution-list/next-marker :portkey.aws.cloudfront.-2016-11-25.distribution-list/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.update-streaming-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/update-streaming-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25/streaming-distribution :portkey.aws.cloudfront.-2016-11-25.update-streaming-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.illegal-update/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/illegal-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.illegal-update/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/ssl-support-method #{"sni-only" :snionly :vip "vip"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/http-version #{:http-11 "http2" :http-2 "http1.1"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.cookie-preference/forward (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/item-selection))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.cookie-preference/whitelisted-names (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/cookie-names))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/cookie-preference (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.cookie-preference/forward] :opt-un [:portkey.aws.cloudfront.-2016-11-25.cookie-preference/whitelisted-names]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.custom-headers/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.custom-headers/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/origin-custom-headers-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/custom-headers (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.custom-headers/quantity] :opt-un [:portkey.aws.cloudfront.-2016-11-25.custom-headers/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.inconsistent-quantities/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/inconsistent-quantities (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.inconsistent-quantities/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/list-distributions-by-web-acl-id-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25/distribution-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.list-invalidations-request/distribution-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.list-invalidations-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.list-invalidations-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/list-invalidations-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.list-invalidations-request/distribution-id] :opt-un [:portkey.aws.cloudfront.-2016-11-25.list-invalidations-request/marker :portkey.aws.cloudfront.-2016-11-25.list-invalidations-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.too-many-query-string-parameters/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/too-many-query-string-parameters (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.too-many-query-string-parameters/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/methods-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-11-25/method))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.untag-resource-request/resource (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/resource-arn))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/untag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.untag-resource-request/resource :portkey.aws.cloudfront.-2016-11-25/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalid-tagging/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/invalid-tagging (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.invalid-tagging/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.default-cache-behavior/smooth-streaming (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.default-cache-behavior/compress (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.default-cache-behavior/target-origin-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.default-cache-behavior/min-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.default-cache-behavior/max-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.default-cache-behavior/default-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/default-cache-behavior (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.default-cache-behavior/target-origin-id :portkey.aws.cloudfront.-2016-11-25/forwarded-values :portkey.aws.cloudfront.-2016-11-25/trusted-signers :portkey.aws.cloudfront.-2016-11-25/viewer-protocol-policy :portkey.aws.cloudfront.-2016-11-25.default-cache-behavior/min-ttl] :opt-un [:portkey.aws.cloudfront.-2016-11-25.default-cache-behavior/smooth-streaming :portkey.aws.cloudfront.-2016-11-25.default-cache-behavior/compress :portkey.aws.cloudfront.-2016-11-25/lambda-function-associations :portkey.aws.cloudfront.-2016-11-25.default-cache-behavior/max-ttl :portkey.aws.cloudfront.-2016-11-25/allowed-methods :portkey.aws.cloudfront.-2016-11-25.default-cache-behavior/default-ttl]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.trusted-signers/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.trusted-signers/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.trusted-signers/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/aws-account-number-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/trusted-signers (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.trusted-signers/enabled :portkey.aws.cloudfront.-2016-11-25.trusted-signers/quantity] :opt-un [:portkey.aws.cloudfront.-2016-11-25.trusted-signers/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/list-distributions-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25/distribution-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.trusted-signer-does-not-exist/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/trusted-signer-does-not-exist (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.trusted-signer-does-not-exist/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.update-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.update-distribution-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/update-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25/distribution-config :portkey.aws.cloudfront.-2016-11-25.update-distribution-request/id] :opt-un [:portkey.aws.cloudfront.-2016-11-25.update-distribution-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/get-invalidation-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25/invalidation]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.too-many-headers-in-forwarded-values/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/too-many-headers-in-forwarded-values (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.too-many-headers-in-forwarded-values/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.viewer-certificate/cloud-front-default-certificate (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.viewer-certificate/iam-certificate-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.viewer-certificate/acm-certificate-arn (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.viewer-certificate/certificate (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/viewer-certificate (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.viewer-certificate/cloud-front-default-certificate :portkey.aws.cloudfront.-2016-11-25.viewer-certificate/iam-certificate-id :portkey.aws.cloudfront.-2016-11-25.viewer-certificate/acm-certificate-arn :portkey.aws.cloudfront.-2016-11-25/ssl-support-method :portkey.aws.cloudfront.-2016-11-25/minimum-protocol-version :portkey.aws.cloudfront.-2016-11-25.viewer-certificate/certificate :portkey.aws.cloudfront.-2016-11-25/certificate-source]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.list-cloud-front-origin-access-identities-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.list-cloud-front-origin-access-identities-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/list-cloud-front-origin-access-identities-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.list-cloud-front-origin-access-identities-request/marker :portkey.aws.cloudfront.-2016-11-25.list-cloud-front-origin-access-identities-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.cloud-front-origin-access-identity-config/caller-reference (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.cloud-front-origin-access-identity-config/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/cloud-front-origin-access-identity-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.cloud-front-origin-access-identity-config/caller-reference :portkey.aws.cloudfront.-2016-11-25.cloud-front-origin-access-identity-config/comment] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.geo-restriction/restriction-type (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/geo-restriction-type))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.geo-restriction/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.geo-restriction/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/location-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/geo-restriction (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.geo-restriction/restriction-type :portkey.aws.cloudfront.-2016-11-25.geo-restriction/quantity] :opt-un [:portkey.aws.cloudfront.-2016-11-25.geo-restriction/items]))

(clojure.core/defn tag-resource-2016-11-25 ([tag-resource-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-tag-resource-request tag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-11-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-11-25/tagging?Operation=Tag", :http.request.configuration/version "2016-11-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-11-25/tag-resource-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 204, :http.request.configuration/action "TagResource2016_11_25", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1009047__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-11-25/access-denied, "InvalidArgument" :portkey.aws.cloudfront.-2016-11-25/invalid-argument, "InvalidTagging" :portkey.aws.cloudfront.-2016-11-25/invalid-tagging, "NoSuchResource" :portkey.aws.cloudfront.-2016-11-25/no-such-resource}})))))
(clojure.spec.alpha/fdef tag-resource-2016-11-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-11-25/tag-resource-request) :ret clojure.core/true?)

(clojure.core/defn get-distribution-2016-11-25 ([get-distribution-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-get-distribution-request get-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-11-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-11-25/get-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-11-25/distribution/{Id}", :http.request.configuration/version "2016-11-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-11-25/get-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetDistribution2016_11_25", :http.request.configuration/output-deser-fn deser-get-distribution-result, :http.request.spec/error-spec {"NoSuchDistribution" :portkey.aws.cloudfront.-2016-11-25/no-such-distribution, "AccessDenied" :portkey.aws.cloudfront.-2016-11-25/access-denied}})))))
(clojure.spec.alpha/fdef get-distribution-2016-11-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-11-25/get-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/get-distribution-result))

(clojure.core/defn create-streaming-distribution-with-tags-2016-11-25 ([create-streaming-distribution-with-tags-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-create-streaming-distribution-with-tags-request create-streaming-distribution-with-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-11-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-11-25/create-streaming-distribution-with-tags-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-11-25/streaming-distribution?WithTags", :http.request.configuration/version "2016-11-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-11-25/create-streaming-distribution-with-tags-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateStreamingDistributionWithTags2016_11_25", :http.request.configuration/output-deser-fn deser-create-streaming-distribution-with-tags-result, :http.request.spec/error-spec {"TooManyStreamingDistributions" :portkey.aws.cloudfront.-2016-11-25/too-many-streaming-distributions, "TooManyStreamingDistributionCNAMEs" :portkey.aws.cloudfront.-2016-11-25/too-many-streaming-distribution-cnam-es, "InvalidArgument" :portkey.aws.cloudfront.-2016-11-25/invalid-argument, "AccessDenied" :portkey.aws.cloudfront.-2016-11-25/access-denied, "InvalidOrigin" :portkey.aws.cloudfront.-2016-11-25/invalid-origin, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2016-11-25/cname-already-exists, "MissingBody" :portkey.aws.cloudfront.-2016-11-25/missing-body, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2016-11-25/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2016-11-25/too-many-trusted-signers, "StreamingDistributionAlreadyExists" :portkey.aws.cloudfront.-2016-11-25/streaming-distribution-already-exists, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-11-25/inconsistent-quantities, "InvalidTagging" :portkey.aws.cloudfront.-2016-11-25/invalid-tagging, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2016-11-25/trusted-signer-does-not-exist}})))))
(clojure.spec.alpha/fdef create-streaming-distribution-with-tags-2016-11-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-11-25/create-streaming-distribution-with-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/create-streaming-distribution-with-tags-result))

(clojure.core/defn update-distribution-2016-11-25 ([update-distribution-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-update-distribution-request update-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-11-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-11-25/update-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-11-25/distribution/{Id}/config", :http.request.configuration/version "2016-11-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-11-25/update-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateDistribution2016_11_25", :http.request.configuration/output-deser-fn deser-update-distribution-result, :http.request.spec/error-spec {"TooManyDistributionsWithLambdaAssociations" :portkey.aws.cloudfront.-2016-11-25/too-many-distributions-with-lambda-associations, "NoSuchOrigin" :portkey.aws.cloudfront.-2016-11-25/no-such-origin, "TooManyCookieNamesInWhiteList" :portkey.aws.cloudfront.-2016-11-25/too-many-cookie-names-in-white-list, "TooManyCacheBehaviors" :portkey.aws.cloudfront.-2016-11-25/too-many-cache-behaviors, "TooManyOriginCustomHeaders" :portkey.aws.cloudfront.-2016-11-25/too-many-origin-custom-headers, "InvalidViewerCertificate" :portkey.aws.cloudfront.-2016-11-25/invalid-viewer-certificate, "InvalidArgument" :portkey.aws.cloudfront.-2016-11-25/invalid-argument, "TooManyCertificates" :portkey.aws.cloudfront.-2016-11-25/too-many-certificates, "AccessDenied" :portkey.aws.cloudfront.-2016-11-25/access-denied, "InvalidLambdaFunctionAssociation" :portkey.aws.cloudfront.-2016-11-25/invalid-lambda-function-association, "InvalidErrorCode" :portkey.aws.cloudfront.-2016-11-25/invalid-error-code, "TooManyLambdaFunctionAssociations" :portkey.aws.cloudfront.-2016-11-25/too-many-lambda-function-associations, "InvalidRelativePath" :portkey.aws.cloudfront.-2016-11-25/invalid-relative-path, "InvalidLocationCode" :portkey.aws.cloudfront.-2016-11-25/invalid-location-code, "InvalidWebACLId" :portkey.aws.cloudfront.-2016-11-25/invalid-web-acl-id, "InvalidQueryStringParameters" :portkey.aws.cloudfront.-2016-11-25/invalid-query-string-parameters, "TooManyOrigins" :portkey.aws.cloudfront.-2016-11-25/too-many-origins, "InvalidTTLOrder" :portkey.aws.cloudfront.-2016-11-25/invalid-ttl-order, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2016-11-25/cname-already-exists, "InvalidDefaultRootObject" :portkey.aws.cloudfront.-2016-11-25/invalid-default-root-object, "InvalidResponseCode" :portkey.aws.cloudfront.-2016-11-25/invalid-response-code, "InvalidForwardCookies" :portkey.aws.cloudfront.-2016-11-25/invalid-forward-cookies, "InvalidRequiredProtocol" :portkey.aws.cloudfront.-2016-11-25/invalid-required-protocol, "InvalidHeadersForS3Origin" :portkey.aws.cloudfront.-2016-11-25/invalid-headers-for-s-3-origin, "TooManyDistributionCNAMEs" :portkey.aws.cloudfront.-2016-11-25/too-many-distribution-cnam-es, "InvalidGeoRestrictionParameter" :portkey.aws.cloudfront.-2016-11-25/invalid-geo-restriction-parameter, "MissingBody" :portkey.aws.cloudfront.-2016-11-25/missing-body, "PreconditionFailed" :portkey.aws.cloudfront.-2016-11-25/precondition-failed, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2016-11-25/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2016-11-25/too-many-trusted-signers, "InvalidMinimumProtocolVersion" :portkey.aws.cloudfront.-2016-11-25/invalid-minimum-protocol-version, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2016-11-25/invalid-if-match-version, "NoSuchDistribution" :portkey.aws.cloudfront.-2016-11-25/no-such-distribution, "IllegalUpdate" :portkey.aws.cloudfront.-2016-11-25/illegal-update, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-11-25/inconsistent-quantities, "TooManyQueryStringParameters" :portkey.aws.cloudfront.-2016-11-25/too-many-query-string-parameters, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2016-11-25/trusted-signer-does-not-exist, "TooManyHeadersInForwardedValues" :portkey.aws.cloudfront.-2016-11-25/too-many-headers-in-forwarded-values}})))))
(clojure.spec.alpha/fdef update-distribution-2016-11-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-11-25/update-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/update-distribution-result))

(clojure.core/defn delete-streaming-distribution-2016-11-25 ([delete-streaming-distribution-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-delete-streaming-distribution-request delete-streaming-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-11-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-11-25/streaming-distribution/{Id}", :http.request.configuration/version "2016-11-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-11-25/delete-streaming-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/action "DeleteStreamingDistribution2016_11_25", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1009047__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-11-25/access-denied, "StreamingDistributionNotDisabled" :portkey.aws.cloudfront.-2016-11-25/streaming-distribution-not-disabled, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2016-11-25/invalid-if-match-version, "NoSuchStreamingDistribution" :portkey.aws.cloudfront.-2016-11-25/no-such-streaming-distribution, "PreconditionFailed" :portkey.aws.cloudfront.-2016-11-25/precondition-failed}})))))
(clojure.spec.alpha/fdef delete-streaming-distribution-2016-11-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-11-25/delete-streaming-distribution-request) :ret clojure.core/true?)

(clojure.core/defn delete-cloud-front-origin-access-identity-2016-11-25 ([delete-cloud-front-origin-access-identity-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-delete-cloud-front-origin-access-identity-request delete-cloud-front-origin-access-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-11-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-11-25/origin-access-identity/cloudfront/{Id}", :http.request.configuration/version "2016-11-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-11-25/delete-cloud-front-origin-access-identity-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/action "DeleteCloudFrontOriginAccessIdentity2016_11_25", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1009047__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-11-25/access-denied, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2016-11-25/invalid-if-match-version, "NoSuchCloudFrontOriginAccessIdentity" :portkey.aws.cloudfront.-2016-11-25/no-such-cloud-front-origin-access-identity, "PreconditionFailed" :portkey.aws.cloudfront.-2016-11-25/precondition-failed, "CloudFrontOriginAccessIdentityInUse" :portkey.aws.cloudfront.-2016-11-25/cloud-front-origin-access-identity-in-use}})))))
(clojure.spec.alpha/fdef delete-cloud-front-origin-access-identity-2016-11-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-11-25/delete-cloud-front-origin-access-identity-request) :ret clojure.core/true?)

(clojure.core/defn create-distribution-with-tags-2016-11-25 ([create-distribution-with-tags-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-create-distribution-with-tags-request create-distribution-with-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-11-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-11-25/create-distribution-with-tags-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-11-25/distribution?WithTags", :http.request.configuration/version "2016-11-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-11-25/create-distribution-with-tags-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateDistributionWithTags2016_11_25", :http.request.configuration/output-deser-fn deser-create-distribution-with-tags-result, :http.request.spec/error-spec {"TooManyDistributionsWithLambdaAssociations" :portkey.aws.cloudfront.-2016-11-25/too-many-distributions-with-lambda-associations, "NoSuchOrigin" :portkey.aws.cloudfront.-2016-11-25/no-such-origin, "InvalidProtocolSettings" :portkey.aws.cloudfront.-2016-11-25/invalid-protocol-settings, "TooManyCookieNamesInWhiteList" :portkey.aws.cloudfront.-2016-11-25/too-many-cookie-names-in-white-list, "TooManyCacheBehaviors" :portkey.aws.cloudfront.-2016-11-25/too-many-cache-behaviors, "TooManyOriginCustomHeaders" :portkey.aws.cloudfront.-2016-11-25/too-many-origin-custom-headers, "InvalidViewerCertificate" :portkey.aws.cloudfront.-2016-11-25/invalid-viewer-certificate, "InvalidArgument" :portkey.aws.cloudfront.-2016-11-25/invalid-argument, "TooManyCertificates" :portkey.aws.cloudfront.-2016-11-25/too-many-certificates, "AccessDenied" :portkey.aws.cloudfront.-2016-11-25/access-denied, "InvalidLambdaFunctionAssociation" :portkey.aws.cloudfront.-2016-11-25/invalid-lambda-function-association, "InvalidErrorCode" :portkey.aws.cloudfront.-2016-11-25/invalid-error-code, "TooManyLambdaFunctionAssociations" :portkey.aws.cloudfront.-2016-11-25/too-many-lambda-function-associations, "InvalidRelativePath" :portkey.aws.cloudfront.-2016-11-25/invalid-relative-path, "InvalidLocationCode" :portkey.aws.cloudfront.-2016-11-25/invalid-location-code, "InvalidWebACLId" :portkey.aws.cloudfront.-2016-11-25/invalid-web-acl-id, "InvalidOrigin" :portkey.aws.cloudfront.-2016-11-25/invalid-origin, "InvalidQueryStringParameters" :portkey.aws.cloudfront.-2016-11-25/invalid-query-string-parameters, "TooManyOrigins" :portkey.aws.cloudfront.-2016-11-25/too-many-origins, "InvalidTTLOrder" :portkey.aws.cloudfront.-2016-11-25/invalid-ttl-order, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2016-11-25/cname-already-exists, "InvalidDefaultRootObject" :portkey.aws.cloudfront.-2016-11-25/invalid-default-root-object, "InvalidResponseCode" :portkey.aws.cloudfront.-2016-11-25/invalid-response-code, "InvalidForwardCookies" :portkey.aws.cloudfront.-2016-11-25/invalid-forward-cookies, "InvalidRequiredProtocol" :portkey.aws.cloudfront.-2016-11-25/invalid-required-protocol, "InvalidHeadersForS3Origin" :portkey.aws.cloudfront.-2016-11-25/invalid-headers-for-s-3-origin, "TooManyDistributionCNAMEs" :portkey.aws.cloudfront.-2016-11-25/too-many-distribution-cnam-es, "InvalidGeoRestrictionParameter" :portkey.aws.cloudfront.-2016-11-25/invalid-geo-restriction-parameter, "MissingBody" :portkey.aws.cloudfront.-2016-11-25/missing-body, "DistributionAlreadyExists" :portkey.aws.cloudfront.-2016-11-25/distribution-already-exists, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2016-11-25/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2016-11-25/too-many-trusted-signers, "InvalidMinimumProtocolVersion" :portkey.aws.cloudfront.-2016-11-25/invalid-minimum-protocol-version, "TooManyDistributions" :portkey.aws.cloudfront.-2016-11-25/too-many-distributions, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-11-25/inconsistent-quantities, "TooManyQueryStringParameters" :portkey.aws.cloudfront.-2016-11-25/too-many-query-string-parameters, "InvalidTagging" :portkey.aws.cloudfront.-2016-11-25/invalid-tagging, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2016-11-25/trusted-signer-does-not-exist, "TooManyHeadersInForwardedValues" :portkey.aws.cloudfront.-2016-11-25/too-many-headers-in-forwarded-values}})))))
(clojure.spec.alpha/fdef create-distribution-with-tags-2016-11-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-11-25/create-distribution-with-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/create-distribution-with-tags-result))

(clojure.core/defn get-invalidation-2016-11-25 ([get-invalidation-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-get-invalidation-request get-invalidation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-11-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-11-25/get-invalidation-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-11-25/distribution/{DistributionId}/invalidation/{Id}", :http.request.configuration/version "2016-11-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-11-25/get-invalidation-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetInvalidation2016_11_25", :http.request.configuration/output-deser-fn deser-get-invalidation-result, :http.request.spec/error-spec {"NoSuchInvalidation" :portkey.aws.cloudfront.-2016-11-25/no-such-invalidation, "NoSuchDistribution" :portkey.aws.cloudfront.-2016-11-25/no-such-distribution, "AccessDenied" :portkey.aws.cloudfront.-2016-11-25/access-denied}})))))
(clojure.spec.alpha/fdef get-invalidation-2016-11-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-11-25/get-invalidation-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/get-invalidation-result))

(clojure.core/defn create-streaming-distribution-2016-11-25 ([create-streaming-distribution-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-create-streaming-distribution-request create-streaming-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-11-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-11-25/create-streaming-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-11-25/streaming-distribution", :http.request.configuration/version "2016-11-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-11-25/create-streaming-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateStreamingDistribution2016_11_25", :http.request.configuration/output-deser-fn deser-create-streaming-distribution-result, :http.request.spec/error-spec {"TooManyStreamingDistributions" :portkey.aws.cloudfront.-2016-11-25/too-many-streaming-distributions, "TooManyStreamingDistributionCNAMEs" :portkey.aws.cloudfront.-2016-11-25/too-many-streaming-distribution-cnam-es, "InvalidArgument" :portkey.aws.cloudfront.-2016-11-25/invalid-argument, "AccessDenied" :portkey.aws.cloudfront.-2016-11-25/access-denied, "InvalidOrigin" :portkey.aws.cloudfront.-2016-11-25/invalid-origin, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2016-11-25/cname-already-exists, "MissingBody" :portkey.aws.cloudfront.-2016-11-25/missing-body, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2016-11-25/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2016-11-25/too-many-trusted-signers, "StreamingDistributionAlreadyExists" :portkey.aws.cloudfront.-2016-11-25/streaming-distribution-already-exists, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-11-25/inconsistent-quantities, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2016-11-25/trusted-signer-does-not-exist}})))))
(clojure.spec.alpha/fdef create-streaming-distribution-2016-11-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-11-25/create-streaming-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/create-streaming-distribution-result))

(clojure.core/defn list-tags-for-resource-2016-11-25 ([list-tags-for-resource-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-list-tags-for-resource-request list-tags-for-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-11-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-11-25/list-tags-for-resource-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-11-25/tagging", :http.request.configuration/version "2016-11-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-11-25/list-tags-for-resource-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTagsForResource2016_11_25", :http.request.configuration/output-deser-fn deser-list-tags-for-resource-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-11-25/access-denied, "InvalidArgument" :portkey.aws.cloudfront.-2016-11-25/invalid-argument, "InvalidTagging" :portkey.aws.cloudfront.-2016-11-25/invalid-tagging, "NoSuchResource" :portkey.aws.cloudfront.-2016-11-25/no-such-resource}})))))
(clojure.spec.alpha/fdef list-tags-for-resource-2016-11-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-11-25/list-tags-for-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/list-tags-for-resource-result))

(clojure.core/defn get-streaming-distribution-2016-11-25 ([get-streaming-distribution-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-get-streaming-distribution-request get-streaming-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-11-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-11-25/get-streaming-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-11-25/streaming-distribution/{Id}", :http.request.configuration/version "2016-11-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-11-25/get-streaming-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetStreamingDistribution2016_11_25", :http.request.configuration/output-deser-fn deser-get-streaming-distribution-result, :http.request.spec/error-spec {"NoSuchStreamingDistribution" :portkey.aws.cloudfront.-2016-11-25/no-such-streaming-distribution, "AccessDenied" :portkey.aws.cloudfront.-2016-11-25/access-denied}})))))
(clojure.spec.alpha/fdef get-streaming-distribution-2016-11-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-11-25/get-streaming-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/get-streaming-distribution-result))

(clojure.core/defn create-distribution-2016-11-25 ([create-distribution-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-create-distribution-request create-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-11-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-11-25/create-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-11-25/distribution", :http.request.configuration/version "2016-11-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-11-25/create-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateDistribution2016_11_25", :http.request.configuration/output-deser-fn deser-create-distribution-result, :http.request.spec/error-spec {"TooManyDistributionsWithLambdaAssociations" :portkey.aws.cloudfront.-2016-11-25/too-many-distributions-with-lambda-associations, "NoSuchOrigin" :portkey.aws.cloudfront.-2016-11-25/no-such-origin, "InvalidProtocolSettings" :portkey.aws.cloudfront.-2016-11-25/invalid-protocol-settings, "TooManyCookieNamesInWhiteList" :portkey.aws.cloudfront.-2016-11-25/too-many-cookie-names-in-white-list, "TooManyCacheBehaviors" :portkey.aws.cloudfront.-2016-11-25/too-many-cache-behaviors, "TooManyOriginCustomHeaders" :portkey.aws.cloudfront.-2016-11-25/too-many-origin-custom-headers, "InvalidViewerCertificate" :portkey.aws.cloudfront.-2016-11-25/invalid-viewer-certificate, "InvalidArgument" :portkey.aws.cloudfront.-2016-11-25/invalid-argument, "TooManyCertificates" :portkey.aws.cloudfront.-2016-11-25/too-many-certificates, "AccessDenied" :portkey.aws.cloudfront.-2016-11-25/access-denied, "InvalidLambdaFunctionAssociation" :portkey.aws.cloudfront.-2016-11-25/invalid-lambda-function-association, "InvalidErrorCode" :portkey.aws.cloudfront.-2016-11-25/invalid-error-code, "TooManyLambdaFunctionAssociations" :portkey.aws.cloudfront.-2016-11-25/too-many-lambda-function-associations, "InvalidRelativePath" :portkey.aws.cloudfront.-2016-11-25/invalid-relative-path, "InvalidLocationCode" :portkey.aws.cloudfront.-2016-11-25/invalid-location-code, "InvalidWebACLId" :portkey.aws.cloudfront.-2016-11-25/invalid-web-acl-id, "InvalidOrigin" :portkey.aws.cloudfront.-2016-11-25/invalid-origin, "InvalidQueryStringParameters" :portkey.aws.cloudfront.-2016-11-25/invalid-query-string-parameters, "TooManyOrigins" :portkey.aws.cloudfront.-2016-11-25/too-many-origins, "InvalidTTLOrder" :portkey.aws.cloudfront.-2016-11-25/invalid-ttl-order, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2016-11-25/cname-already-exists, "InvalidDefaultRootObject" :portkey.aws.cloudfront.-2016-11-25/invalid-default-root-object, "InvalidResponseCode" :portkey.aws.cloudfront.-2016-11-25/invalid-response-code, "InvalidForwardCookies" :portkey.aws.cloudfront.-2016-11-25/invalid-forward-cookies, "InvalidRequiredProtocol" :portkey.aws.cloudfront.-2016-11-25/invalid-required-protocol, "InvalidHeadersForS3Origin" :portkey.aws.cloudfront.-2016-11-25/invalid-headers-for-s-3-origin, "TooManyDistributionCNAMEs" :portkey.aws.cloudfront.-2016-11-25/too-many-distribution-cnam-es, "InvalidGeoRestrictionParameter" :portkey.aws.cloudfront.-2016-11-25/invalid-geo-restriction-parameter, "MissingBody" :portkey.aws.cloudfront.-2016-11-25/missing-body, "DistributionAlreadyExists" :portkey.aws.cloudfront.-2016-11-25/distribution-already-exists, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2016-11-25/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2016-11-25/too-many-trusted-signers, "InvalidMinimumProtocolVersion" :portkey.aws.cloudfront.-2016-11-25/invalid-minimum-protocol-version, "TooManyDistributions" :portkey.aws.cloudfront.-2016-11-25/too-many-distributions, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-11-25/inconsistent-quantities, "TooManyQueryStringParameters" :portkey.aws.cloudfront.-2016-11-25/too-many-query-string-parameters, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2016-11-25/trusted-signer-does-not-exist, "TooManyHeadersInForwardedValues" :portkey.aws.cloudfront.-2016-11-25/too-many-headers-in-forwarded-values}})))))
(clojure.spec.alpha/fdef create-distribution-2016-11-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-11-25/create-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/create-distribution-result))

(clojure.core/defn get-streaming-distribution-config-2016-11-25 ([get-streaming-distribution-config-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-get-streaming-distribution-config-request get-streaming-distribution-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-11-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-11-25/get-streaming-distribution-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-11-25/streaming-distribution/{Id}/config", :http.request.configuration/version "2016-11-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-11-25/get-streaming-distribution-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetStreamingDistributionConfig2016_11_25", :http.request.configuration/output-deser-fn deser-get-streaming-distribution-config-result, :http.request.spec/error-spec {"NoSuchStreamingDistribution" :portkey.aws.cloudfront.-2016-11-25/no-such-streaming-distribution, "AccessDenied" :portkey.aws.cloudfront.-2016-11-25/access-denied}})))))
(clojure.spec.alpha/fdef get-streaming-distribution-config-2016-11-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-11-25/get-streaming-distribution-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/get-streaming-distribution-config-result))

(clojure.core/defn list-distributions-2016-11-25 ([] (list-distributions-2016-11-25 {})) ([list-distributions-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-list-distributions-request list-distributions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-11-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-11-25/list-distributions-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-11-25/distribution", :http.request.configuration/version "2016-11-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-11-25/list-distributions-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListDistributions2016_11_25", :http.request.configuration/output-deser-fn deser-list-distributions-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2016-11-25/invalid-argument}})))))
(clojure.spec.alpha/fdef list-distributions-2016-11-25 :args (clojure.spec.alpha/? :portkey.aws.cloudfront.-2016-11-25/list-distributions-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/list-distributions-result))

(clojure.core/defn get-cloud-front-origin-access-identity-config-2016-11-25 ([get-cloud-front-origin-access-identity-config-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-get-cloud-front-origin-access-identity-config-request get-cloud-front-origin-access-identity-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-11-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-11-25/get-cloud-front-origin-access-identity-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-11-25/origin-access-identity/cloudfront/{Id}/config", :http.request.configuration/version "2016-11-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-11-25/get-cloud-front-origin-access-identity-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetCloudFrontOriginAccessIdentityConfig2016_11_25", :http.request.configuration/output-deser-fn deser-get-cloud-front-origin-access-identity-config-result, :http.request.spec/error-spec {"NoSuchCloudFrontOriginAccessIdentity" :portkey.aws.cloudfront.-2016-11-25/no-such-cloud-front-origin-access-identity, "AccessDenied" :portkey.aws.cloudfront.-2016-11-25/access-denied}})))))
(clojure.spec.alpha/fdef get-cloud-front-origin-access-identity-config-2016-11-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-11-25/get-cloud-front-origin-access-identity-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/get-cloud-front-origin-access-identity-config-result))

(clojure.core/defn list-invalidations-2016-11-25 ([list-invalidations-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-list-invalidations-request list-invalidations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-11-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-11-25/list-invalidations-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-11-25/distribution/{DistributionId}/invalidation", :http.request.configuration/version "2016-11-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-11-25/list-invalidations-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListInvalidations2016_11_25", :http.request.configuration/output-deser-fn deser-list-invalidations-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2016-11-25/invalid-argument, "NoSuchDistribution" :portkey.aws.cloudfront.-2016-11-25/no-such-distribution, "AccessDenied" :portkey.aws.cloudfront.-2016-11-25/access-denied}})))))
(clojure.spec.alpha/fdef list-invalidations-2016-11-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-11-25/list-invalidations-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/list-invalidations-result))

(clojure.core/defn untag-resource-2016-11-25 ([untag-resource-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-untag-resource-request untag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-11-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-11-25/tagging?Operation=Untag", :http.request.configuration/version "2016-11-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-11-25/untag-resource-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 204, :http.request.configuration/action "UntagResource2016_11_25", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1009047__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-11-25/access-denied, "InvalidArgument" :portkey.aws.cloudfront.-2016-11-25/invalid-argument, "InvalidTagging" :portkey.aws.cloudfront.-2016-11-25/invalid-tagging, "NoSuchResource" :portkey.aws.cloudfront.-2016-11-25/no-such-resource}})))))
(clojure.spec.alpha/fdef untag-resource-2016-11-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-11-25/untag-resource-request) :ret clojure.core/true?)

(clojure.core/defn get-cloud-front-origin-access-identity-2016-11-25 ([get-cloud-front-origin-access-identity-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-get-cloud-front-origin-access-identity-request get-cloud-front-origin-access-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-11-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-11-25/get-cloud-front-origin-access-identity-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-11-25/origin-access-identity/cloudfront/{Id}", :http.request.configuration/version "2016-11-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-11-25/get-cloud-front-origin-access-identity-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetCloudFrontOriginAccessIdentity2016_11_25", :http.request.configuration/output-deser-fn deser-get-cloud-front-origin-access-identity-result, :http.request.spec/error-spec {"NoSuchCloudFrontOriginAccessIdentity" :portkey.aws.cloudfront.-2016-11-25/no-such-cloud-front-origin-access-identity, "AccessDenied" :portkey.aws.cloudfront.-2016-11-25/access-denied}})))))
(clojure.spec.alpha/fdef get-cloud-front-origin-access-identity-2016-11-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-11-25/get-cloud-front-origin-access-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/get-cloud-front-origin-access-identity-result))

(clojure.core/defn update-cloud-front-origin-access-identity-2016-11-25 ([update-cloud-front-origin-access-identity-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-update-cloud-front-origin-access-identity-request update-cloud-front-origin-access-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-11-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-11-25/update-cloud-front-origin-access-identity-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-11-25/origin-access-identity/cloudfront/{Id}/config", :http.request.configuration/version "2016-11-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-11-25/update-cloud-front-origin-access-identity-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateCloudFrontOriginAccessIdentity2016_11_25", :http.request.configuration/output-deser-fn deser-update-cloud-front-origin-access-identity-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-11-25/access-denied, "IllegalUpdate" :portkey.aws.cloudfront.-2016-11-25/illegal-update, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2016-11-25/invalid-if-match-version, "MissingBody" :portkey.aws.cloudfront.-2016-11-25/missing-body, "NoSuchCloudFrontOriginAccessIdentity" :portkey.aws.cloudfront.-2016-11-25/no-such-cloud-front-origin-access-identity, "PreconditionFailed" :portkey.aws.cloudfront.-2016-11-25/precondition-failed, "InvalidArgument" :portkey.aws.cloudfront.-2016-11-25/invalid-argument, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-11-25/inconsistent-quantities}})))))
(clojure.spec.alpha/fdef update-cloud-front-origin-access-identity-2016-11-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-11-25/update-cloud-front-origin-access-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/update-cloud-front-origin-access-identity-result))

(clojure.core/defn update-streaming-distribution-2016-11-25 ([update-streaming-distribution-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-update-streaming-distribution-request update-streaming-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-11-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-11-25/update-streaming-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-11-25/streaming-distribution/{Id}/config", :http.request.configuration/version "2016-11-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-11-25/update-streaming-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateStreamingDistribution2016_11_25", :http.request.configuration/output-deser-fn deser-update-streaming-distribution-result, :http.request.spec/error-spec {"TooManyStreamingDistributionCNAMEs" :portkey.aws.cloudfront.-2016-11-25/too-many-streaming-distribution-cnam-es, "InvalidArgument" :portkey.aws.cloudfront.-2016-11-25/invalid-argument, "AccessDenied" :portkey.aws.cloudfront.-2016-11-25/access-denied, "NoSuchStreamingDistribution" :portkey.aws.cloudfront.-2016-11-25/no-such-streaming-distribution, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2016-11-25/cname-already-exists, "MissingBody" :portkey.aws.cloudfront.-2016-11-25/missing-body, "PreconditionFailed" :portkey.aws.cloudfront.-2016-11-25/precondition-failed, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2016-11-25/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2016-11-25/too-many-trusted-signers, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2016-11-25/invalid-if-match-version, "IllegalUpdate" :portkey.aws.cloudfront.-2016-11-25/illegal-update, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-11-25/inconsistent-quantities, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2016-11-25/trusted-signer-does-not-exist}})))))
(clojure.spec.alpha/fdef update-streaming-distribution-2016-11-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-11-25/update-streaming-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/update-streaming-distribution-result))

(clojure.core/defn get-distribution-config-2016-11-25 ([get-distribution-config-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-get-distribution-config-request get-distribution-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-11-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-11-25/get-distribution-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-11-25/distribution/{Id}/config", :http.request.configuration/version "2016-11-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-11-25/get-distribution-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetDistributionConfig2016_11_25", :http.request.configuration/output-deser-fn deser-get-distribution-config-result, :http.request.spec/error-spec {"NoSuchDistribution" :portkey.aws.cloudfront.-2016-11-25/no-such-distribution, "AccessDenied" :portkey.aws.cloudfront.-2016-11-25/access-denied}})))))
(clojure.spec.alpha/fdef get-distribution-config-2016-11-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-11-25/get-distribution-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/get-distribution-config-result))

(clojure.core/defn list-cloud-front-origin-access-identities-2016-11-25 ([] (list-cloud-front-origin-access-identities-2016-11-25 {})) ([list-cloud-front-origin-access-identities-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-list-cloud-front-origin-access-identities-request list-cloud-front-origin-access-identities-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-11-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-11-25/list-cloud-front-origin-access-identities-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-11-25/origin-access-identity/cloudfront", :http.request.configuration/version "2016-11-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-11-25/list-cloud-front-origin-access-identities-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListCloudFrontOriginAccessIdentities2016_11_25", :http.request.configuration/output-deser-fn deser-list-cloud-front-origin-access-identities-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2016-11-25/invalid-argument}})))))
(clojure.spec.alpha/fdef list-cloud-front-origin-access-identities-2016-11-25 :args (clojure.spec.alpha/? :portkey.aws.cloudfront.-2016-11-25/list-cloud-front-origin-access-identities-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/list-cloud-front-origin-access-identities-result))

(clojure.core/defn list-streaming-distributions-2016-11-25 ([] (list-streaming-distributions-2016-11-25 {})) ([list-streaming-distributions-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-list-streaming-distributions-request list-streaming-distributions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-11-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-11-25/list-streaming-distributions-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-11-25/streaming-distribution", :http.request.configuration/version "2016-11-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-11-25/list-streaming-distributions-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListStreamingDistributions2016_11_25", :http.request.configuration/output-deser-fn deser-list-streaming-distributions-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2016-11-25/invalid-argument}})))))
(clojure.spec.alpha/fdef list-streaming-distributions-2016-11-25 :args (clojure.spec.alpha/? :portkey.aws.cloudfront.-2016-11-25/list-streaming-distributions-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/list-streaming-distributions-result))

(clojure.core/defn delete-distribution-2016-11-25 ([delete-distribution-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-delete-distribution-request delete-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-11-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-11-25/distribution/{Id}", :http.request.configuration/version "2016-11-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-11-25/delete-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/action "DeleteDistribution2016_11_25", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1009047__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-11-25/access-denied, "DistributionNotDisabled" :portkey.aws.cloudfront.-2016-11-25/distribution-not-disabled, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2016-11-25/invalid-if-match-version, "NoSuchDistribution" :portkey.aws.cloudfront.-2016-11-25/no-such-distribution, "PreconditionFailed" :portkey.aws.cloudfront.-2016-11-25/precondition-failed}})))))
(clojure.spec.alpha/fdef delete-distribution-2016-11-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-11-25/delete-distribution-request) :ret clojure.core/true?)

(clojure.core/defn create-invalidation-2016-11-25 ([create-invalidation-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-create-invalidation-request create-invalidation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-11-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-11-25/create-invalidation-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-11-25/distribution/{DistributionId}/invalidation", :http.request.configuration/version "2016-11-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-11-25/create-invalidation-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateInvalidation2016_11_25", :http.request.configuration/output-deser-fn deser-create-invalidation-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-11-25/access-denied, "MissingBody" :portkey.aws.cloudfront.-2016-11-25/missing-body, "InvalidArgument" :portkey.aws.cloudfront.-2016-11-25/invalid-argument, "NoSuchDistribution" :portkey.aws.cloudfront.-2016-11-25/no-such-distribution, "BatchTooLarge" :portkey.aws.cloudfront.-2016-11-25/batch-too-large, "TooManyInvalidationsInProgress" :portkey.aws.cloudfront.-2016-11-25/too-many-invalidations-in-progress, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-11-25/inconsistent-quantities}})))))
(clojure.spec.alpha/fdef create-invalidation-2016-11-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-11-25/create-invalidation-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/create-invalidation-result))

(clojure.core/defn list-distributions-by-web-acl-id-2016-11-25 ([list-distributions-by-web-acl-id-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-list-distributions-by-web-acl-id-request list-distributions-by-web-acl-id-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-11-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-11-25/list-distributions-by-web-acl-id-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-11-25/distributionsByWebACLId/{WebACLId}", :http.request.configuration/version "2016-11-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-11-25/list-distributions-by-web-acl-id-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListDistributionsByWebACLId2016_11_25", :http.request.configuration/output-deser-fn deser-list-distributions-by-web-acl-id-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2016-11-25/invalid-argument, "InvalidWebACLId" :portkey.aws.cloudfront.-2016-11-25/invalid-web-acl-id}})))))
(clojure.spec.alpha/fdef list-distributions-by-web-acl-id-2016-11-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-11-25/list-distributions-by-web-acl-id-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/list-distributions-by-web-acl-id-result))

(clojure.core/defn create-cloud-front-origin-access-identity-2016-11-25 ([create-cloud-front-origin-access-identity-requestinput] (clojure.core/let [request-function-result__1009048__auto__ (req-create-cloud-front-origin-access-identity-request create-cloud-front-origin-access-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1009048__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-11-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-11-25/create-cloud-front-origin-access-identity-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-11-25/origin-access-identity/cloudfront", :http.request.configuration/version "2016-11-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-11-25/create-cloud-front-origin-access-identity-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateCloudFrontOriginAccessIdentity2016_11_25", :http.request.configuration/output-deser-fn deser-create-cloud-front-origin-access-identity-result, :http.request.spec/error-spec {"CloudFrontOriginAccessIdentityAlreadyExists" :portkey.aws.cloudfront.-2016-11-25/cloud-front-origin-access-identity-already-exists, "MissingBody" :portkey.aws.cloudfront.-2016-11-25/missing-body, "TooManyCloudFrontOriginAccessIdentities" :portkey.aws.cloudfront.-2016-11-25/too-many-cloud-front-origin-access-identities, "InvalidArgument" :portkey.aws.cloudfront.-2016-11-25/invalid-argument, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-11-25/inconsistent-quantities}})))))
(clojure.spec.alpha/fdef create-cloud-front-origin-access-identity-2016-11-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-11-25/create-cloud-front-origin-access-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/create-cloud-front-origin-access-identity-result))
