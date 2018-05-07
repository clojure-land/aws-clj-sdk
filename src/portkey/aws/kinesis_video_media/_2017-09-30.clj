(ns portkey.aws.kinesis-video-media.-2017-09-30 (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30/fragment-number-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30632__auto__] (clojure.core/<= 1 (clojure.core/count s__30632__auto__))) (clojure.core/fn [s__30633__auto__] (clojure.core/< (clojure.core/count s__30633__auto__) 128)) (clojure.core/fn [s__30634__auto__] (clojure.core/re-matches #"^[0-9]+$" s__30634__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30/stream-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30632__auto__] (clojure.core/<= 1 (clojure.core/count s__30632__auto__))) (clojure.core/fn [s__30633__auto__] (clojure.core/< (clojure.core/count s__30633__auto__) 256)) (clojure.core/fn [s__30634__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.-]+" s__30634__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30.get-media-input/streamarn (clojure.spec.alpha/and :portkey.aws.kinesis-video-media.-2017-09-30/resourcearn))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30/get-media-input (portkey.aws/json-keys :req-un [:portkey.aws.kinesis-video-media.-2017-09-30/StartSelector] :opt-un [:portkey.aws.kinesis-video-media.-2017-09-30/StreamName :portkey.aws.kinesis-video-media.-2017-09-30.get-media-input/StreamARN] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30.invalid-endpoint-exception/message (clojure.spec.alpha/and :portkey.aws.kinesis-video-media.-2017-09-30/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30/invalid-endpoint-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesis-video-media.-2017-09-30.invalid-endpoint-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30.not-authorized-exception/message (clojure.spec.alpha/and :portkey.aws.kinesis-video-media.-2017-09-30/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30/not-authorized-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesis-video-media.-2017-09-30.not-authorized-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30/payload (clojure.spec.alpha/and clojure.core/bytes? (clojure.spec.alpha/conformer portkey.aws/base64-encode portkey.aws/base64-decode)))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30/content-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30632__auto__] (clojure.core/<= 1 (clojure.core/count s__30632__auto__))) (clojure.core/fn [s__30633__auto__] (clojure.core/< (clojure.core/count s__30633__auto__) 128)) (clojure.core/fn [s__30634__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9_\.\-]+$" s__30634__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30.start-selector/after-fragment-number (clojure.spec.alpha/and :portkey.aws.kinesis-video-media.-2017-09-30/fragment-number-string))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30.start-selector/start-timestamp (clojure.spec.alpha/and :portkey.aws.kinesis-video-media.-2017-09-30/timestamp))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30/start-selector (portkey.aws/json-keys :req-un [:portkey.aws.kinesis-video-media.-2017-09-30/StartSelectorType] :opt-un [:portkey.aws.kinesis-video-media.-2017-09-30.start-selector/AfterFragmentNumber :portkey.aws.kinesis-video-media.-2017-09-30.start-selector/StartTimestamp :portkey.aws.kinesis-video-media.-2017-09-30/ContinuationToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.kinesis-video-media.-2017-09-30/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30/resource-not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesis-video-media.-2017-09-30.resource-not-found-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30/start-selector-type (clojure.spec.alpha/conformer (clojure.core/let [m__30630__auto__ {"EARLIEST" "EARLIEST", "NOW" "NOW", "FRAGMENT_NUMBER" "FRAGMENT_NUMBER", "PRODUCER_TIMESTAMP" "PRODUCER_TIMESTAMP", :now "NOW", :producer-timestamp "PRODUCER_TIMESTAMP", :fragment-number "FRAGMENT_NUMBER", :earliest "EARLIEST", :continuation-token "CONTINUATION_TOKEN", "SERVER_TIMESTAMP" "SERVER_TIMESTAMP", "CONTINUATION_TOKEN" "CONTINUATION_TOKEN", :server-timestamp "SERVER_TIMESTAMP"}] (clojure.core/fn [s__30631__auto__] (m__30630__auto__ s__30631__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30.client-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.kinesis-video-media.-2017-09-30/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30/client-limit-exceeded-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesis-video-media.-2017-09-30.client-limit-exceeded-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30/continuation-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30632__auto__] (clojure.core/<= 1 (clojure.core/count s__30632__auto__))) (clojure.core/fn [s__30633__auto__] (clojure.core/< (clojure.core/count s__30633__auto__) 128)) (clojure.core/fn [s__30634__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9_\.\-]+$" s__30634__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30.invalid-argument-exception/message (clojure.spec.alpha/and :portkey.aws.kinesis-video-media.-2017-09-30/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30/invalid-argument-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesis-video-media.-2017-09-30.invalid-argument-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30.connection-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.kinesis-video-media.-2017-09-30/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30/connection-limit-exceeded-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesis-video-media.-2017-09-30.connection-limit-exceeded-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30/resourcearn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30632__auto__] (clojure.core/<= 1 (clojure.core/count s__30632__auto__))) (clojure.core/fn [s__30633__auto__] (clojure.core/< (clojure.core/count s__30633__auto__) 1024)) (clojure.core/fn [s__30634__auto__] (clojure.core/re-matches #"arn:aws:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-Z0-9_.-]+/[0-9]+" s__30634__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30/get-media-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesis-video-media.-2017-09-30/ContentType :portkey.aws.kinesis-video-media.-2017-09-30/Payload] :locations {}))

(clojure.core/defn get-media ([get-media-input] (portkey.aws/-rest-json-call portkey.aws.kinesis-video-media.-2017-09-30/endpoints "POST" "/getMedia" get-media-input :portkey.aws.kinesis-video-media.-2017-09-30/get-media-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.kinesis-video-media.-2017-09-30/get-media-output {"ResourceNotFoundException" :portkey.aws.kinesis-video-media.-2017-09-30/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.kinesis-video-media.-2017-09-30/not-authorized-exception, "InvalidEndpointException" :portkey.aws.kinesis-video-media.-2017-09-30/invalid-endpoint-exception, "ClientLimitExceededException" :portkey.aws.kinesis-video-media.-2017-09-30/client-limit-exceeded-exception, "ConnectionLimitExceededException" :portkey.aws.kinesis-video-media.-2017-09-30/connection-limit-exceeded-exception, "InvalidArgumentException" :portkey.aws.kinesis-video-media.-2017-09-30/invalid-argument-exception})))
(clojure.spec.alpha/fdef get-media :args (clojure.spec.alpha/tuple :portkey.aws.kinesis-video-media.-2017-09-30/get-media-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesis-video-media.-2017-09-30/get-media-output))
