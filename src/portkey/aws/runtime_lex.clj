(ns portkey.aws.runtime-lex (:require [portkey.aws]))

(def
 endpoints
 '{"eu-west-1"
   {:credential-scope {:service "lex", :region "eu-west-1"},
    :ssl-common-name "runtime.lex.eu-west-1.amazonaws.com",
    :endpoint "https://runtime.lex.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "lex", :region "us-west-2"},
    :ssl-common-name "runtime.lex.us-west-2.amazonaws.com",
    :endpoint "https://runtime.lex.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "lex", :region "us-east-1"},
    :ssl-common-name "runtime.lex.us-east-1.amazonaws.com",
    :endpoint "https://runtime.lex.us-east-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-string-map)

(clojure.core/declare ser-bot-alias)

(clojure.core/declare ser-user-id)

(clojure.core/declare ser-bot-name)

(clojure.core/declare ser-blob-stream)

(clojure.core/declare ser-string)

(clojure.core/declare ser-http-content-type)

(clojure.core/declare ser-text)

(clojure.core/declare ser-attributes-string)

(clojure.core/declare ser-accept)

(clojure.core/defn- ser-string-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-string k) #:http.request.field{:map-info "key", :shape "String"}) (clojure.core/into (ser-string v) #:http.request.field{:map-info "value", :shape "String"})])) input), :shape "StringMap", :type "map", :sensitive true})

(clojure.core/defn- ser-bot-alias [input] #:http.request.field{:value input, :shape "BotAlias"})

(clojure.core/defn- ser-user-id [input] #:http.request.field{:value input, :shape "UserId"})

(clojure.core/defn- ser-bot-name [input] #:http.request.field{:value input, :shape "BotName"})

(clojure.core/defn- ser-blob-stream [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "BlobStream"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-http-content-type [input] #:http.request.field{:value input, :shape "HttpContentType"})

(clojure.core/defn- ser-text [input] #:http.request.field{:value input, :shape "Text"})

(clojure.core/defn- ser-attributes-string [input] #:http.request.field{:value input, :shape "AttributesString"})

(clojure.core/defn- ser-accept [input] #:http.request.field{:value input, :shape "Accept"})

(clojure.core/defn- req-post-text-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bot-name (input :bot-name)) #:http.request.field{:name "botName", :shape "BotName", :location "uri", :location-name "botName"}) (clojure.core/into (ser-bot-alias (input :bot-alias)) #:http.request.field{:name "botAlias", :shape "BotAlias", :location "uri", :location-name "botAlias"}) (clojure.core/into (ser-user-id (input :user-id)) #:http.request.field{:name "userId", :shape "UserId", :location "uri", :location-name "userId"})], :body [(clojure.core/into (ser-text (input :input-text)) #:http.request.field{:name "inputText", :shape "Text"})]} (clojure.core/contains? input :session-attributes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-map (input :session-attributes)) #:http.request.field{:name "sessionAttributes", :shape "StringMap"})) (clojure.core/contains? input :request-attributes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-map (input :request-attributes)) #:http.request.field{:name "requestAttributes", :shape "StringMap"}))))

(clojure.core/defn- req-post-content-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bot-name (input :bot-name)) #:http.request.field{:name "botName", :shape "BotName", :location "uri", :location-name "botName"}) (clojure.core/into (ser-bot-alias (input :bot-alias)) #:http.request.field{:name "botAlias", :shape "BotAlias", :location "uri", :location-name "botAlias"}) (clojure.core/into (ser-user-id (input :user-id)) #:http.request.field{:name "userId", :shape "UserId", :location "uri", :location-name "userId"})], :header [(clojure.core/into (ser-http-content-type (input :content-type)) #:http.request.field{:name "contentType", :shape "HttpContentType", :location "header", :location-name "Content-Type"})], :body [(clojure.core/into (ser-blob-stream (input :input-stream)) #:http.request.field{:name "inputStream", :shape "BlobStream"})]} (clojure.core/contains? input :session-attributes) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attributes-string (input :session-attributes)) #:http.request.field{:name "sessionAttributes", :shape "AttributesString", :jsonvalue true, :location "header", :location-name "x-amz-lex-session-attributes"})) (clojure.core/contains? input :request-attributes) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attributes-string (input :request-attributes)) #:http.request.field{:name "requestAttributes", :shape "AttributesString", :jsonvalue true, :location "header", :location-name "x-amz-lex-request-attributes"})) (clojure.core/contains? input :accept) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept (input :accept)) #:http.request.field{:name "accept", :shape "Accept", :location "header", :location-name "Accept"}))))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.unsupported-media-type-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex/unsupported-media-type-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.runtime-lex.unsupported-media-type-exception/message]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex/string-with-length (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 80))))

(clojure.spec.alpha/def :portkey.aws.runtime-lex/string-map (clojure.spec.alpha/map-of :portkey.aws.runtime-lex/string :portkey.aws.runtime-lex/string))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.bad-request-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex/bad-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.runtime-lex.bad-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.button/text (clojure.spec.alpha/and :portkey.aws.runtime-lex/button-text-string-with-length))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.button/value (clojure.spec.alpha/and :portkey.aws.runtime-lex/button-value-string-with-length))
(clojure.spec.alpha/def :portkey.aws.runtime-lex/button (clojure.spec.alpha/keys :req-un [:portkey.aws.runtime-lex.button/text :portkey.aws.runtime-lex.button/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-text-request/bot-name (clojure.spec.alpha/and :portkey.aws.runtime-lex/bot-name))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-text-request/bot-alias (clojure.spec.alpha/and :portkey.aws.runtime-lex/bot-alias))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-text-request/user-id (clojure.spec.alpha/and :portkey.aws.runtime-lex/user-id))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-text-request/session-attributes (clojure.spec.alpha/and :portkey.aws.runtime-lex/string-map))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-text-request/request-attributes (clojure.spec.alpha/and :portkey.aws.runtime-lex/string-map))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-text-request/input-text (clojure.spec.alpha/and :portkey.aws.runtime-lex/text))
(clojure.spec.alpha/def :portkey.aws.runtime-lex/post-text-request (clojure.spec.alpha/keys :req-un [:portkey.aws.runtime-lex.post-text-request/bot-name :portkey.aws.runtime-lex.post-text-request/bot-alias :portkey.aws.runtime-lex.post-text-request/user-id :portkey.aws.runtime-lex.post-text-request/input-text] :opt-un [:portkey.aws.runtime-lex.post-text-request/session-attributes :portkey.aws.runtime-lex.post-text-request/request-attributes]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.generic-attachment/title (clojure.spec.alpha/and :portkey.aws.runtime-lex/string-with-length))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.generic-attachment/sub-title (clojure.spec.alpha/and :portkey.aws.runtime-lex/string-with-length))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.generic-attachment/attachment-link-url (clojure.spec.alpha/and :portkey.aws.runtime-lex/string-url-with-length))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.generic-attachment/image-url (clojure.spec.alpha/and :portkey.aws.runtime-lex/string-url-with-length))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.generic-attachment/buttons (clojure.spec.alpha/and :portkey.aws.runtime-lex/list-of-buttons))
(clojure.spec.alpha/def :portkey.aws.runtime-lex/generic-attachment (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.runtime-lex.generic-attachment/title :portkey.aws.runtime-lex.generic-attachment/sub-title :portkey.aws.runtime-lex.generic-attachment/attachment-link-url :portkey.aws.runtime-lex.generic-attachment/image-url :portkey.aws.runtime-lex.generic-attachment/buttons]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex/bot-alias (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.runtime-lex/user-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 2 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 100)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[0-9a-zA-Z._:-]+" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.runtime-lex/string-url-with-length (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.runtime-lex/intent-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.limit-exceeded-exception/retry-after-seconds (clojure.spec.alpha/and :portkey.aws.runtime-lex/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.runtime-lex.limit-exceeded-exception/retry-after-seconds :portkey.aws.runtime-lex.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-content-request/bot-name (clojure.spec.alpha/and :portkey.aws.runtime-lex/bot-name))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-content-request/bot-alias (clojure.spec.alpha/and :portkey.aws.runtime-lex/bot-alias))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-content-request/user-id (clojure.spec.alpha/and :portkey.aws.runtime-lex/user-id))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-content-request/session-attributes (clojure.spec.alpha/and :portkey.aws.runtime-lex/attributes-string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-content-request/request-attributes (clojure.spec.alpha/and :portkey.aws.runtime-lex/attributes-string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-content-request/content-type (clojure.spec.alpha/and :portkey.aws.runtime-lex/http-content-type))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-content-request/accept (clojure.spec.alpha/and :portkey.aws.runtime-lex/accept))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-content-request/input-stream (clojure.spec.alpha/and :portkey.aws.runtime-lex/blob-stream))
(clojure.spec.alpha/def :portkey.aws.runtime-lex/post-content-request (clojure.spec.alpha/keys :req-un [:portkey.aws.runtime-lex.post-content-request/bot-name :portkey.aws.runtime-lex.post-content-request/bot-alias :portkey.aws.runtime-lex.post-content-request/user-id :portkey.aws.runtime-lex.post-content-request/content-type :portkey.aws.runtime-lex.post-content-request/input-stream] :opt-un [:portkey.aws.runtime-lex.post-content-request/session-attributes :portkey.aws.runtime-lex.post-content-request/request-attributes :portkey.aws.runtime-lex.post-content-request/accept]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.response-card/version (clojure.spec.alpha/and :portkey.aws.runtime-lex/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.response-card/content-type (clojure.spec.alpha/and :portkey.aws.runtime-lex/content-type))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.response-card/generic-attachments (clojure.spec.alpha/and :portkey.aws.runtime-lex/generic-attachment-list))
(clojure.spec.alpha/def :portkey.aws.runtime-lex/response-card (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.runtime-lex.response-card/version :portkey.aws.runtime-lex.response-card/content-type :portkey.aws.runtime-lex.response-card/generic-attachments]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.loop-detected-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex/error-message))
(clojure.spec.alpha/def :portkey.aws.runtime-lex/loop-detected-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.runtime-lex.loop-detected-exception/message]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.runtime-lex/dialog-state #{"Fulfilled" "Failed" "ConfirmIntent" "ReadyForFulfillment" :elicit-slot :elicit-intent "ElicitSlot" "ElicitIntent" :fulfilled :confirm-intent :ready-for-fulfillment :failed})

(clojure.spec.alpha/def :portkey.aws.runtime-lex/content-type #{:applicationvndamazonawscardgeneric "application/vnd.amazonaws.card.generic"})

(clojure.spec.alpha/def :portkey.aws.runtime-lex.internal-failure-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex/internal-failure-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.runtime-lex.internal-failure-exception/message]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.conflict-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex/conflict-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.runtime-lex.conflict-exception/message]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.not-found-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex/not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.runtime-lex.not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex/bot-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.runtime-lex/blob-stream clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.runtime-lex/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.dependency-failed-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex/error-message))
(clojure.spec.alpha/def :portkey.aws.runtime-lex/dependency-failed-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.runtime-lex.dependency-failed-exception/message]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.request-timeout-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex/request-timeout-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.runtime-lex.request-timeout-exception/message]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex/button-text-string-with-length (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 15))))

(clojure.spec.alpha/def :portkey.aws.runtime-lex/http-content-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.runtime-lex/button-value-string-with-length (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.not-acceptable-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex/not-acceptable-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.runtime-lex.not-acceptable-exception/message]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex/text (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.runtime-lex/attributes-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.bad-gateway-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex/error-message))
(clojure.spec.alpha/def :portkey.aws.runtime-lex/bad-gateway-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.runtime-lex.bad-gateway-exception/message]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-text-response/intent-name (clojure.spec.alpha/and :portkey.aws.runtime-lex/intent-name))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-text-response/slots (clojure.spec.alpha/and :portkey.aws.runtime-lex/string-map))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-text-response/session-attributes (clojure.spec.alpha/and :portkey.aws.runtime-lex/string-map))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-text-response/message (clojure.spec.alpha/and :portkey.aws.runtime-lex/text))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-text-response/message-format (clojure.spec.alpha/and :portkey.aws.runtime-lex/message-format-type))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-text-response/dialog-state (clojure.spec.alpha/and :portkey.aws.runtime-lex/dialog-state))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-text-response/slot-to-elicit (clojure.spec.alpha/and :portkey.aws.runtime-lex/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-text-response/response-card (clojure.spec.alpha/and :portkey.aws.runtime-lex/response-card))
(clojure.spec.alpha/def :portkey.aws.runtime-lex/post-text-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.runtime-lex.post-text-response/intent-name :portkey.aws.runtime-lex.post-text-response/slots :portkey.aws.runtime-lex.post-text-response/session-attributes :portkey.aws.runtime-lex.post-text-response/message :portkey.aws.runtime-lex.post-text-response/message-format :portkey.aws.runtime-lex.post-text-response/dialog-state :portkey.aws.runtime-lex.post-text-response/slot-to-elicit :portkey.aws.runtime-lex.post-text-response/response-card]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex/generic-attachment-list (clojure.spec.alpha/coll-of :portkey.aws.runtime-lex/generic-attachment :min-count 0 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.runtime-lex/accept (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.runtime-lex/list-of-buttons (clojure.spec.alpha/coll-of :portkey.aws.runtime-lex/button :min-count 0 :max-count 5))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-content-response/message (clojure.spec.alpha/and :portkey.aws.runtime-lex/text))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-content-response/slot-to-elicit (clojure.spec.alpha/and :portkey.aws.runtime-lex/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-content-response/slots (clojure.spec.alpha/and :portkey.aws.runtime-lex/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-content-response/audio-stream (clojure.spec.alpha/and :portkey.aws.runtime-lex/blob-stream))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-content-response/intent-name (clojure.spec.alpha/and :portkey.aws.runtime-lex/intent-name))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-content-response/message-format (clojure.spec.alpha/and :portkey.aws.runtime-lex/message-format-type))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-content-response/input-transcript (clojure.spec.alpha/and :portkey.aws.runtime-lex/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-content-response/content-type (clojure.spec.alpha/and :portkey.aws.runtime-lex/http-content-type))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-content-response/dialog-state (clojure.spec.alpha/and :portkey.aws.runtime-lex/dialog-state))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-content-response/session-attributes (clojure.spec.alpha/and :portkey.aws.runtime-lex/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex/post-content-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.runtime-lex.post-content-response/message :portkey.aws.runtime-lex.post-content-response/slot-to-elicit :portkey.aws.runtime-lex.post-content-response/slots :portkey.aws.runtime-lex.post-content-response/audio-stream :portkey.aws.runtime-lex.post-content-response/intent-name :portkey.aws.runtime-lex.post-content-response/message-format :portkey.aws.runtime-lex.post-content-response/input-transcript :portkey.aws.runtime-lex.post-content-response/content-type :portkey.aws.runtime-lex.post-content-response/dialog-state :portkey.aws.runtime-lex.post-content-response/session-attributes]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex/message-format-type #{:composite :custom-payload :ssml :plain-text "PlainText" "CustomPayload" "SSML" "Composite"})

(clojure.core/defn post-content ([post-content-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-post-content-request post-content-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.runtime-lex/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.runtime-lex/post-content-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/bot/{botName}/alias/{botAlias}/user/{userId}/content", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lex Runtime Service", :http.request.spec/input-spec :portkey.aws.runtime-lex/post-content-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PostContent", :http.request.spec/error-spec {"UnsupportedMediaTypeException" :portkey.aws.runtime-lex/unsupported-media-type-exception, "BadRequestException" :portkey.aws.runtime-lex/bad-request-exception, "LimitExceededException" :portkey.aws.runtime-lex/limit-exceeded-exception, "LoopDetectedException" :portkey.aws.runtime-lex/loop-detected-exception, "InternalFailureException" :portkey.aws.runtime-lex/internal-failure-exception, "ConflictException" :portkey.aws.runtime-lex/conflict-exception, "NotFoundException" :portkey.aws.runtime-lex/not-found-exception, "DependencyFailedException" :portkey.aws.runtime-lex/dependency-failed-exception, "RequestTimeoutException" :portkey.aws.runtime-lex/request-timeout-exception, "NotAcceptableException" :portkey.aws.runtime-lex/not-acceptable-exception, "BadGatewayException" :portkey.aws.runtime-lex/bad-gateway-exception}})))))
(clojure.spec.alpha/fdef post-content :args (clojure.spec.alpha/tuple :portkey.aws.runtime-lex/post-content-request) :ret (clojure.spec.alpha/and :portkey.aws.runtime-lex/post-content-response))

(clojure.core/defn post-text ([post-text-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-post-text-request post-text-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.runtime-lex/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.runtime-lex/post-text-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/bot/{botName}/alias/{botAlias}/user/{userId}/text", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lex Runtime Service", :http.request.spec/input-spec :portkey.aws.runtime-lex/post-text-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PostText", :http.request.spec/error-spec {"NotFoundException" :portkey.aws.runtime-lex/not-found-exception, "BadRequestException" :portkey.aws.runtime-lex/bad-request-exception, "LimitExceededException" :portkey.aws.runtime-lex/limit-exceeded-exception, "InternalFailureException" :portkey.aws.runtime-lex/internal-failure-exception, "ConflictException" :portkey.aws.runtime-lex/conflict-exception, "DependencyFailedException" :portkey.aws.runtime-lex/dependency-failed-exception, "BadGatewayException" :portkey.aws.runtime-lex/bad-gateway-exception, "LoopDetectedException" :portkey.aws.runtime-lex/loop-detected-exception}})))))
(clojure.spec.alpha/fdef post-text :args (clojure.spec.alpha/tuple :portkey.aws.runtime-lex/post-text-request) :ret (clojure.spec.alpha/and :portkey.aws.runtime-lex/post-text-response))