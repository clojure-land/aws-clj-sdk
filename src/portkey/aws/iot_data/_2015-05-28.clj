(ns portkey.aws.iot-data.-2015-05-28 (:require [portkey.aws]))

(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28.method-not-allowed-exception/message (clojure.spec.alpha/and :portkey.aws.iot-data.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28/method-not-allowed-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.iot-data.-2015-05-28.method-not-allowed-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28.unauthorized-exception/message (clojure.spec.alpha/and :portkey.aws.iot-data.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28/unauthorized-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.iot-data.-2015-05-28.unauthorized-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28.invalid-request-exception/message (clojure.spec.alpha/and :portkey.aws.iot-data.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28/invalid-request-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.iot-data.-2015-05-28.invalid-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28.get-thing-shadow-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot-data.-2015-05-28/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28/get-thing-shadow-request (portkey.awsgen/json-keys :req-un [:portkey.aws.iot-data.-2015-05-28.get-thing-shadow-request/thingName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28/json-document (clojure.spec.alpha/and clojure.core/bytes? (clojure.spec.alpha/conformer portkey.awsgen/base64-encode portkey.awsgen/base64-decode)))

(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28.delete-thing-shadow-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot-data.-2015-05-28/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28/delete-thing-shadow-request (portkey.awsgen/json-keys :req-un [:portkey.aws.iot-data.-2015-05-28.delete-thing-shadow-request/thingName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28.get-thing-shadow-response/payload (clojure.spec.alpha/and :portkey.aws.iot-data.-2015-05-28/json-document))
(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28/get-thing-shadow-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.iot-data.-2015-05-28.get-thing-shadow-response/payload]))

(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28.service-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.iot-data.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28/service-unavailable-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.iot-data.-2015-05-28.service-unavailable-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28/payload (clojure.spec.alpha/and clojure.core/bytes? (clojure.spec.alpha/conformer portkey.awsgen/base64-encode portkey.awsgen/base64-decode)))

(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28/topic (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28.request-entity-too-large-exception/message (clojure.spec.alpha/and :portkey.aws.iot-data.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28/request-entity-too-large-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.iot-data.-2015-05-28.request-entity-too-large-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28.internal-failure-exception/message (clojure.spec.alpha/and :portkey.aws.iot-data.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28/internal-failure-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.iot-data.-2015-05-28.internal-failure-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.iot-data.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28/resource-not-found-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.iot-data.-2015-05-28.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28.conflict-exception/message (clojure.spec.alpha/and :portkey.aws.iot-data.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28/conflict-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.iot-data.-2015-05-28.conflict-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28/qos (clojure.spec.alpha/and clojure.core/int? (fn* [p1__36568__36569__auto__] (clojure.core/<= 0 p1__36568__36569__auto__)) (fn* [p1__36570__36571__auto__] (clojure.core/<= p1__36570__36571__auto__ 1))))

(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28/thing-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36527__auto__] (clojure.core/<= 1 (clojure.core/count s__36527__auto__))) (clojure.core/fn [s__36528__auto__] (clojure.core/< (clojure.core/count s__36528__auto__) 128)) (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_-]+" s__36529__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28.publish-request/topic (clojure.spec.alpha/and :portkey.aws.iot-data.-2015-05-28/topic))
(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28.publish-request/qos (clojure.spec.alpha/and :portkey.aws.iot-data.-2015-05-28/qos))
(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28.publish-request/payload (clojure.spec.alpha/and :portkey.aws.iot-data.-2015-05-28/payload))
(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28/publish-request (portkey.awsgen/json-keys :req-un [:portkey.aws.iot-data.-2015-05-28.publish-request/topic] :opt-un [:portkey.aws.iot-data.-2015-05-28.publish-request/qos :portkey.aws.iot-data.-2015-05-28.publish-request/payload]))

(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28.throttling-exception/message (clojure.spec.alpha/and :portkey.aws.iot-data.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28/throttling-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.iot-data.-2015-05-28.throttling-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28.update-thing-shadow-response/payload (clojure.spec.alpha/and :portkey.aws.iot-data.-2015-05-28/json-document))
(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28/update-thing-shadow-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.iot-data.-2015-05-28.update-thing-shadow-response/payload]))

(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28.unsupported-document-encoding-exception/message (clojure.spec.alpha/and :portkey.aws.iot-data.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28/unsupported-document-encoding-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.iot-data.-2015-05-28.unsupported-document-encoding-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28.delete-thing-shadow-response/payload (clojure.spec.alpha/and :portkey.aws.iot-data.-2015-05-28/json-document))
(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28/delete-thing-shadow-response (portkey.awsgen/json-keys :req-un [:portkey.aws.iot-data.-2015-05-28.delete-thing-shadow-response/payload] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28.update-thing-shadow-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot-data.-2015-05-28/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28.update-thing-shadow-request/payload (clojure.spec.alpha/and :portkey.aws.iot-data.-2015-05-28/json-document))
(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28/update-thing-shadow-request (portkey.awsgen/json-keys :req-un [:portkey.aws.iot-data.-2015-05-28.update-thing-shadow-request/thingName :portkey.aws.iot-data.-2015-05-28.update-thing-shadow-request/payload] :opt-un []))

(clojure.core/defn delete-thing-shadow ([input__36693__auto__] (delete-thing-shadow input__36693__auto__ portkey.aws/*http-client*)) ([input38171 http-client__36694__auto__] (clojure.core/let [req__36695__auto__ (clojure.core/-> {:method "DELETE", :headers {"content-type" "application/json"}, :url "https://lambda.eu-central-1.amazonaws.com/things/{thingName}/shadow", :body (clojure.spec.alpha/unform :portkey.aws.iot-data.-2015-05-28/DeleteThingShadowRequest input38171)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {"thingName" "thingName"}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__36692__36696__auto__] (clojure.core/some-> p1__36692__36696__auto__ cheshire.core/generate-string))))] (http-client__36694__auto__ {:method "DELETE", :headers {"content-type" "application/json"}, :url "https://lambda.eu-central-1.amazonaws.com/things/{thingName}/shadow", :body body__36697__auto__} (clojure.core/fn [response38170] (clojure.core/let [errors__36698__auto__ {"ResourceNotFoundException" :portkey.aws.iot-data.-2015-05-28/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot-data.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot-data.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot-data.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot-data.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot-data.-2015-05-28/internal-failure-exception, "MethodNotAllowedException" :portkey.aws.iot-data.-2015-05-28/method-not-allowed-exception, "UnsupportedDocumentEncodingException" :portkey.aws.iot-data.-2015-05-28/unsupported-document-encoding-exception}] (if (clojure.core/= nil (:status response38170)) (clojure.spec.alpha/unform :portkey.aws.iot-data.-2015-05-28/delete-thing-shadow-response (:body response38170)) (clojure.core/if-some [[type__36699__auto__ spec__36700__auto__] (clojure.core/find errors__36698__auto__ (clojure.core/get-in response38170 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__36701__auto__ (clojure.spec.alpha/unform spec__36700__auto__ (cheshire.core/parse-string (:body response38170)))] (throw (clojure.core/ex-info (clojure.core/str type__36699__auto__ ": " (:message m__36701__auto__)) m__36701__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response38170}))))))))))

(clojure.core/defn get-thing-shadow ([input__36693__auto__] (get-thing-shadow input__36693__auto__ portkey.aws/*http-client*)) ([input38173 http-client__36694__auto__] (clojure.core/let [req__36695__auto__ (clojure.core/-> {:method "GET", :headers {"content-type" "application/json"}, :url "https://lambda.eu-central-1.amazonaws.com/things/{thingName}/shadow", :body (clojure.spec.alpha/unform :portkey.aws.iot-data.-2015-05-28/GetThingShadowRequest input38173)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {"thingName" "thingName"}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__36692__36696__auto__] (clojure.core/some-> p1__36692__36696__auto__ cheshire.core/generate-string))))] (http-client__36694__auto__ {:method "GET", :headers {"content-type" "application/json"}, :url "https://lambda.eu-central-1.amazonaws.com/things/{thingName}/shadow", :body body__36697__auto__} (clojure.core/fn [response38172] (clojure.core/let [errors__36698__auto__ {"InvalidRequestException" :portkey.aws.iot-data.-2015-05-28/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot-data.-2015-05-28/resource-not-found-exception, "ThrottlingException" :portkey.aws.iot-data.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot-data.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot-data.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot-data.-2015-05-28/internal-failure-exception, "MethodNotAllowedException" :portkey.aws.iot-data.-2015-05-28/method-not-allowed-exception, "UnsupportedDocumentEncodingException" :portkey.aws.iot-data.-2015-05-28/unsupported-document-encoding-exception}] (if (clojure.core/= nil (:status response38172)) (clojure.spec.alpha/unform :portkey.aws.iot-data.-2015-05-28/get-thing-shadow-response (:body response38172)) (clojure.core/if-some [[type__36699__auto__ spec__36700__auto__] (clojure.core/find errors__36698__auto__ (clojure.core/get-in response38172 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__36701__auto__ (clojure.spec.alpha/unform spec__36700__auto__ (cheshire.core/parse-string (:body response38172)))] (throw (clojure.core/ex-info (clojure.core/str type__36699__auto__ ": " (:message m__36701__auto__)) m__36701__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response38172}))))))))))

(clojure.core/defn publish ([input__36693__auto__] (publish input__36693__auto__ portkey.aws/*http-client*)) ([input38175 http-client__36694__auto__] (clojure.core/let [req__36695__auto__ (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url "https://lambda.eu-central-1.amazonaws.com/topics/{topic}", :body (clojure.spec.alpha/unform :portkey.aws.iot-data.-2015-05-28/PublishRequest input38175)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {"topic" "topic"}) (portkey.awsgen/params-to-querystring {"qos" "qos"}) (portkey.awsgen/params-to-payload "payload") (clojure.core/update :body (fn* [p1__36692__36696__auto__] (clojure.core/some-> p1__36692__36696__auto__ cheshire.core/generate-string))))] (http-client__36694__auto__ {:method "POST", :headers {"content-type" "application/json"}, :url "https://lambda.eu-central-1.amazonaws.com/topics/{topic}", :body body__36697__auto__} (clojure.core/fn [response38174] (clojure.core/let [errors__36698__auto__ {"InternalFailureException" :portkey.aws.iot-data.-2015-05-28/internal-failure-exception, "InvalidRequestException" :portkey.aws.iot-data.-2015-05-28/invalid-request-exception, "UnauthorizedException" :portkey.aws.iot-data.-2015-05-28/unauthorized-exception, "MethodNotAllowedException" :portkey.aws.iot-data.-2015-05-28/method-not-allowed-exception}] (if (clojure.core/= nil (:status response38174)) true (clojure.core/if-some [[type__36699__auto__ spec__36700__auto__] (clojure.core/find errors__36698__auto__ (clojure.core/get-in response38174 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__36701__auto__ (clojure.spec.alpha/unform spec__36700__auto__ (cheshire.core/parse-string (:body response38174)))] (throw (clojure.core/ex-info (clojure.core/str type__36699__auto__ ": " (:message m__36701__auto__)) m__36701__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response38174}))))))))))

(clojure.core/defn update-thing-shadow ([input__36693__auto__] (update-thing-shadow input__36693__auto__ portkey.aws/*http-client*)) ([input38177 http-client__36694__auto__] (clojure.core/let [req__36695__auto__ (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url "https://lambda.eu-central-1.amazonaws.com/things/{thingName}/shadow", :body (clojure.spec.alpha/unform :portkey.aws.iot-data.-2015-05-28/UpdateThingShadowRequest input38177)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {"thingName" "thingName"}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload "payload") (clojure.core/update :body (fn* [p1__36692__36696__auto__] (clojure.core/some-> p1__36692__36696__auto__ cheshire.core/generate-string))))] (http-client__36694__auto__ {:method "POST", :headers {"content-type" "application/json"}, :url "https://lambda.eu-central-1.amazonaws.com/things/{thingName}/shadow", :body body__36697__auto__} (clojure.core/fn [response38176] (clojure.core/let [errors__36698__auto__ {"MethodNotAllowedException" :portkey.aws.iot-data.-2015-05-28/method-not-allowed-exception, "UnauthorizedException" :portkey.aws.iot-data.-2015-05-28/unauthorized-exception, "InvalidRequestException" :portkey.aws.iot-data.-2015-05-28/invalid-request-exception, "ServiceUnavailableException" :portkey.aws.iot-data.-2015-05-28/service-unavailable-exception, "RequestEntityTooLargeException" :portkey.aws.iot-data.-2015-05-28/request-entity-too-large-exception, "InternalFailureException" :portkey.aws.iot-data.-2015-05-28/internal-failure-exception, "ConflictException" :portkey.aws.iot-data.-2015-05-28/conflict-exception, "ThrottlingException" :portkey.aws.iot-data.-2015-05-28/throttling-exception, "UnsupportedDocumentEncodingException" :portkey.aws.iot-data.-2015-05-28/unsupported-document-encoding-exception}] (if (clojure.core/= nil (:status response38176)) (clojure.spec.alpha/unform :portkey.aws.iot-data.-2015-05-28/update-thing-shadow-response (:body response38176)) (clojure.core/if-some [[type__36699__auto__ spec__36700__auto__] (clojure.core/find errors__36698__auto__ (clojure.core/get-in response38176 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__36701__auto__ (clojure.spec.alpha/unform spec__36700__auto__ (cheshire.core/parse-string (:body response38176)))] (throw (clojure.core/ex-info (clojure.core/str type__36699__auto__ ": " (:message m__36701__auto__)) m__36701__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response38176}))))))))))