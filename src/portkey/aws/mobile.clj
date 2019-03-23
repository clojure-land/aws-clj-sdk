(ns portkey.aws.mobile (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.core/declare ser-platform)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-bundle-id)

(clojure.core/declare ser-contents)

(clojure.core/declare ser-project-id)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-project-name)

(clojure.core/declare ser-project-region)

(clojure.core/declare ser-snapshot-id)

(clojure.core/declare ser-boolean)

(clojure.core/defn- ser-platform [input] #:http.request.field{:value (clojure.core/get {"JAVASCRIPT" "JAVASCRIPT", :javascript "JAVASCRIPT", :windows "WINDOWS", "OSX" "OSX", :osx "OSX", "WINDOWS" "WINDOWS", :swift "SWIFT", "LINUX" "LINUX", "OBJC" "OBJC", :android "ANDROID", :linux "LINUX", "ANDROID" "ANDROID", "SWIFT" "SWIFT", :objc "OBJC"} input), :shape "Platform"})

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-bundle-id [input] #:http.request.field{:value input, :shape "BundleId"})

(clojure.core/defn- ser-contents [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "Contents"})

(clojure.core/defn- ser-project-id [input] #:http.request.field{:value input, :shape "ProjectId"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-project-name [input] #:http.request.field{:value input, :shape "ProjectName"})

(clojure.core/defn- ser-project-region [input] #:http.request.field{:value input, :shape "ProjectRegion"})

(clojure.core/defn- ser-snapshot-id [input] #:http.request.field{:value input, :shape "SnapshotId"})

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "Boolean"})

(clojure.core/defn- req-list-projects-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"}))))

(clojure.core/defn- req-export-project-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-project-id (input :project-id)) #:http.request.field{:name "projectId", :shape "ProjectId", :location "uri", :location-name "projectId"})]}))

(clojure.core/defn- req-update-project-request [input] (clojure.core/cond-> #:http.request.configuration{:querystring [(clojure.core/into (ser-project-id (input :project-id)) #:http.request.field{:name "projectId", :shape "ProjectId", :location "querystring", :location-name "projectId"})]} (clojure.core/contains? input :contents) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-contents (input :contents)) #:http.request.field{:name "contents", :shape "Contents"}))))

(clojure.core/defn- req-export-bundle-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bundle-id (input :bundle-id)) #:http.request.field{:name "bundleId", :shape "BundleId", :location "uri", :location-name "bundleId"})]} (clojure.core/contains? input :project-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-id (input :project-id)) #:http.request.field{:name "projectId", :shape "ProjectId", :location "querystring", :location-name "projectId"})) (clojure.core/contains? input :platform) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-platform (input :platform)) #:http.request.field{:name "platform", :shape "Platform", :location "querystring", :location-name "platform"}))))

(clojure.core/defn- req-create-project-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-name (input :name)) #:http.request.field{:name "name", :shape "ProjectName", :location "querystring", :location-name "name"})) (clojure.core/contains? input :region) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-region (input :region)) #:http.request.field{:name "region", :shape "ProjectRegion", :location "querystring", :location-name "region"})) (clojure.core/contains? input :contents) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-contents (input :contents)) #:http.request.field{:name "contents", :shape "Contents"})) (clojure.core/contains? input :snapshot-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-snapshot-id (input :snapshot-id)) #:http.request.field{:name "snapshotId", :shape "SnapshotId", :location "querystring", :location-name "snapshotId"}))))

(clojure.core/defn- req-describe-project-request [input] (clojure.core/cond-> #:http.request.configuration{:querystring [(clojure.core/into (ser-project-id (input :project-id)) #:http.request.field{:name "projectId", :shape "ProjectId", :location "querystring", :location-name "projectId"})]} (clojure.core/contains? input :sync-from-resources) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :sync-from-resources)) #:http.request.field{:name "syncFromResources", :shape "Boolean", :location "querystring", :location-name "syncFromResources"}))))

(clojure.core/defn- req-list-bundles-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"}))))

(clojure.core/defn- req-describe-bundle-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bundle-id (input :bundle-id)) #:http.request.field{:name "bundleId", :shape "BundleId", :location "uri", :location-name "bundleId"})]}))

(clojure.core/defn- req-delete-project-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-project-id (input :project-id)) #:http.request.field{:name "projectId", :shape "ProjectId", :location "uri", :location-name "projectId"})]}))

(clojure.spec.alpha/def :portkey.aws.mobile.describe-project-result/details (clojure.spec.alpha/and :portkey.aws.mobile/project-details))
(clojure.spec.alpha/def :portkey.aws.mobile/describe-project-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mobile.describe-project-result/details]))

(clojure.spec.alpha/def :portkey.aws.mobile.list-projects-request/max-results (clojure.spec.alpha/and :portkey.aws.mobile/max-results))
(clojure.spec.alpha/def :portkey.aws.mobile.list-projects-request/next-token (clojure.spec.alpha/and :portkey.aws.mobile/next-token))
(clojure.spec.alpha/def :portkey.aws.mobile/list-projects-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mobile.list-projects-request/max-results :portkey.aws.mobile.list-projects-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.mobile.list-projects-result/projects (clojure.spec.alpha/and :portkey.aws.mobile/project-summaries))
(clojure.spec.alpha/def :portkey.aws.mobile.list-projects-result/next-token (clojure.spec.alpha/and :portkey.aws.mobile/next-token))
(clojure.spec.alpha/def :portkey.aws.mobile/list-projects-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mobile.list-projects-result/projects :portkey.aws.mobile.list-projects-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.mobile.update-project-result/details (clojure.spec.alpha/and :portkey.aws.mobile/project-details))
(clojure.spec.alpha/def :portkey.aws.mobile/update-project-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mobile.update-project-result/details]))

(clojure.spec.alpha/def :portkey.aws.mobile.unauthorized-exception/message (clojure.spec.alpha/and :portkey.aws.mobile/error-message))
(clojure.spec.alpha/def :portkey.aws.mobile/unauthorized-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mobile.unauthorized-exception/message]))

(clojure.spec.alpha/def :portkey.aws.mobile/platform #{"JAVASCRIPT" :javascript :windows "OSX" :osx "WINDOWS" :swift "LINUX" "OBJC" :android :linux "ANDROID" "SWIFT" :objc})

(clojure.spec.alpha/def :portkey.aws.mobile/bundle-version (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mobile.bad-request-exception/message (clojure.spec.alpha/and :portkey.aws.mobile/error-message))
(clojure.spec.alpha/def :portkey.aws.mobile/bad-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mobile.bad-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.mobile/download-url (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mobile/share-url (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mobile/project-state #{:syncing "NORMAL" :normal "SYNCING" :importing "IMPORTING"})

(clojure.spec.alpha/def :portkey.aws.mobile.export-bundle-result/download-url (clojure.spec.alpha/and :portkey.aws.mobile/download-url))
(clojure.spec.alpha/def :portkey.aws.mobile/export-bundle-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mobile.export-bundle-result/download-url]))

(clojure.spec.alpha/def :portkey.aws.mobile/feature (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mobile.export-project-request/project-id (clojure.spec.alpha/and :portkey.aws.mobile/project-id))
(clojure.spec.alpha/def :portkey.aws.mobile/export-project-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mobile.export-project-request/project-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mobile/bundle-list (clojure.spec.alpha/coll-of :portkey.aws.mobile/bundle-details))

(clojure.spec.alpha/def :portkey.aws.mobile.limit-exceeded-exception/retry-after-seconds (clojure.spec.alpha/and :portkey.aws.mobile/error-message))
(clojure.spec.alpha/def :portkey.aws.mobile.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.mobile/error-message))
(clojure.spec.alpha/def :portkey.aws.mobile/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mobile.limit-exceeded-exception/retry-after-seconds :portkey.aws.mobile.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.mobile.update-project-request/contents (clojure.spec.alpha/and :portkey.aws.mobile/contents))
(clojure.spec.alpha/def :portkey.aws.mobile.update-project-request/project-id (clojure.spec.alpha/and :portkey.aws.mobile/project-id))
(clojure.spec.alpha/def :portkey.aws.mobile/update-project-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mobile.update-project-request/project-id] :opt-un [:portkey.aws.mobile.update-project-request/contents]))

(clojure.spec.alpha/def :portkey.aws.mobile.service-unavailable-exception/retry-after-seconds (clojure.spec.alpha/and :portkey.aws.mobile/error-message))
(clojure.spec.alpha/def :portkey.aws.mobile.service-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.mobile/error-message))
(clojure.spec.alpha/def :portkey.aws.mobile/service-unavailable-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mobile.service-unavailable-exception/retry-after-seconds :portkey.aws.mobile.service-unavailable-exception/message]))

(clojure.spec.alpha/def :portkey.aws.mobile/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mobile.export-bundle-request/bundle-id (clojure.spec.alpha/and :portkey.aws.mobile/bundle-id))
(clojure.spec.alpha/def :portkey.aws.mobile.export-bundle-request/project-id (clojure.spec.alpha/and :portkey.aws.mobile/project-id))
(clojure.spec.alpha/def :portkey.aws.mobile.export-bundle-request/platform (clojure.spec.alpha/and :portkey.aws.mobile/platform))
(clojure.spec.alpha/def :portkey.aws.mobile/export-bundle-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mobile.export-bundle-request/bundle-id] :opt-un [:portkey.aws.mobile.export-bundle-request/project-id :portkey.aws.mobile.export-bundle-request/platform]))

(clojure.spec.alpha/def :portkey.aws.mobile.create-project-request/name (clojure.spec.alpha/and :portkey.aws.mobile/project-name))
(clojure.spec.alpha/def :portkey.aws.mobile.create-project-request/region (clojure.spec.alpha/and :portkey.aws.mobile/project-region))
(clojure.spec.alpha/def :portkey.aws.mobile.create-project-request/contents (clojure.spec.alpha/and :portkey.aws.mobile/contents))
(clojure.spec.alpha/def :portkey.aws.mobile.create-project-request/snapshot-id (clojure.spec.alpha/and :portkey.aws.mobile/snapshot-id))
(clojure.spec.alpha/def :portkey.aws.mobile/create-project-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mobile.create-project-request/name :portkey.aws.mobile.create-project-request/region :portkey.aws.mobile.create-project-request/contents :portkey.aws.mobile.create-project-request/snapshot-id]))

(clojure.spec.alpha/def :portkey.aws.mobile/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mobile/project-summaries (clojure.spec.alpha/coll-of :portkey.aws.mobile/project-summary))

(clojure.spec.alpha/def :portkey.aws.mobile/date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.mobile.describe-bundle-result/details (clojure.spec.alpha/and :portkey.aws.mobile/bundle-details))
(clojure.spec.alpha/def :portkey.aws.mobile/describe-bundle-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mobile.describe-bundle-result/details]))

(clojure.spec.alpha/def :portkey.aws.mobile.too-many-requests-exception/retry-after-seconds (clojure.spec.alpha/and :portkey.aws.mobile/error-message))
(clojure.spec.alpha/def :portkey.aws.mobile.too-many-requests-exception/message (clojure.spec.alpha/and :portkey.aws.mobile/error-message))
(clojure.spec.alpha/def :portkey.aws.mobile/too-many-requests-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mobile.too-many-requests-exception/retry-after-seconds :portkey.aws.mobile.too-many-requests-exception/message]))

(clojure.spec.alpha/def :portkey.aws.mobile/attributes (clojure.spec.alpha/map-of :portkey.aws.mobile/attribute-key :portkey.aws.mobile/attribute-value))

(clojure.spec.alpha/def :portkey.aws.mobile/bundle-title (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mobile.internal-failure-exception/message (clojure.spec.alpha/and :portkey.aws.mobile/error-message))
(clojure.spec.alpha/def :portkey.aws.mobile/internal-failure-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mobile.internal-failure-exception/message]))

(clojure.spec.alpha/def :portkey.aws.mobile.describe-project-request/project-id (clojure.spec.alpha/and :portkey.aws.mobile/project-id))
(clojure.spec.alpha/def :portkey.aws.mobile.describe-project-request/sync-from-resources (clojure.spec.alpha/and :portkey.aws.mobile/boolean))
(clojure.spec.alpha/def :portkey.aws.mobile/describe-project-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mobile.describe-project-request/project-id] :opt-un [:portkey.aws.mobile.describe-project-request/sync-from-resources]))

(clojure.spec.alpha/def :portkey.aws.mobile.create-project-result/details (clojure.spec.alpha/and :portkey.aws.mobile/project-details))
(clojure.spec.alpha/def :portkey.aws.mobile/create-project-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mobile.create-project-result/details]))

(clojure.spec.alpha/def :portkey.aws.mobile/attribute-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mobile/resources (clojure.spec.alpha/coll-of :portkey.aws.mobile/resource))

(clojure.spec.alpha/def :portkey.aws.mobile/attribute-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mobile.not-found-exception/message (clojure.spec.alpha/and :portkey.aws.mobile/error-message))
(clojure.spec.alpha/def :portkey.aws.mobile/not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mobile.not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.mobile/resource-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mobile/bundle-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mobile/contents clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.mobile.delete-project-result/deleted-resources (clojure.spec.alpha/and :portkey.aws.mobile/resources))
(clojure.spec.alpha/def :portkey.aws.mobile.delete-project-result/orphaned-resources (clojure.spec.alpha/and :portkey.aws.mobile/resources))
(clojure.spec.alpha/def :portkey.aws.mobile/delete-project-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mobile.delete-project-result/deleted-resources :portkey.aws.mobile.delete-project-result/orphaned-resources]))

(clojure.spec.alpha/def :portkey.aws.mobile.export-project-result/download-url (clojure.spec.alpha/and :portkey.aws.mobile/download-url))
(clojure.spec.alpha/def :portkey.aws.mobile.export-project-result/share-url (clojure.spec.alpha/and :portkey.aws.mobile/share-url))
(clojure.spec.alpha/def :portkey.aws.mobile.export-project-result/snapshot-id (clojure.spec.alpha/and :portkey.aws.mobile/snapshot-id))
(clojure.spec.alpha/def :portkey.aws.mobile/export-project-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mobile.export-project-result/download-url :portkey.aws.mobile.export-project-result/share-url :portkey.aws.mobile.export-project-result/snapshot-id]))

(clojure.spec.alpha/def :portkey.aws.mobile.bundle-details/bundle-id (clojure.spec.alpha/and :portkey.aws.mobile/bundle-id))
(clojure.spec.alpha/def :portkey.aws.mobile.bundle-details/title (clojure.spec.alpha/and :portkey.aws.mobile/bundle-title))
(clojure.spec.alpha/def :portkey.aws.mobile.bundle-details/version (clojure.spec.alpha/and :portkey.aws.mobile/bundle-version))
(clojure.spec.alpha/def :portkey.aws.mobile.bundle-details/description (clojure.spec.alpha/and :portkey.aws.mobile/bundle-description))
(clojure.spec.alpha/def :portkey.aws.mobile.bundle-details/icon-url (clojure.spec.alpha/and :portkey.aws.mobile/icon-url))
(clojure.spec.alpha/def :portkey.aws.mobile.bundle-details/available-platforms (clojure.spec.alpha/and :portkey.aws.mobile/platforms))
(clojure.spec.alpha/def :portkey.aws.mobile/bundle-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mobile.bundle-details/bundle-id :portkey.aws.mobile.bundle-details/title :portkey.aws.mobile.bundle-details/version :portkey.aws.mobile.bundle-details/description :portkey.aws.mobile.bundle-details/icon-url :portkey.aws.mobile.bundle-details/available-platforms]))

(clojure.spec.alpha/def :portkey.aws.mobile/bundle-description (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mobile/resource-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mobile/console-url (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mobile/project-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mobile.list-bundles-request/max-results (clojure.spec.alpha/and :portkey.aws.mobile/max-results))
(clojure.spec.alpha/def :portkey.aws.mobile.list-bundles-request/next-token (clojure.spec.alpha/and :portkey.aws.mobile/next-token))
(clojure.spec.alpha/def :portkey.aws.mobile/list-bundles-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mobile.list-bundles-request/max-results :portkey.aws.mobile.list-bundles-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.mobile.project-summary/name (clojure.spec.alpha/and :portkey.aws.mobile/project-name))
(clojure.spec.alpha/def :portkey.aws.mobile.project-summary/project-id (clojure.spec.alpha/and :portkey.aws.mobile/project-id))
(clojure.spec.alpha/def :portkey.aws.mobile/project-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mobile.project-summary/name :portkey.aws.mobile.project-summary/project-id]))

(clojure.spec.alpha/def :portkey.aws.mobile.describe-bundle-request/bundle-id (clojure.spec.alpha/and :portkey.aws.mobile/bundle-id))
(clojure.spec.alpha/def :portkey.aws.mobile/describe-bundle-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mobile.describe-bundle-request/bundle-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mobile.account-action-required-exception/message (clojure.spec.alpha/and :portkey.aws.mobile/error-message))
(clojure.spec.alpha/def :portkey.aws.mobile/account-action-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mobile.account-action-required-exception/message]))

(clojure.spec.alpha/def :portkey.aws.mobile/resource-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mobile/max-results clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.mobile.resource/type (clojure.spec.alpha/and :portkey.aws.mobile/resource-type))
(clojure.spec.alpha/def :portkey.aws.mobile.resource/name (clojure.spec.alpha/and :portkey.aws.mobile/resource-name))
(clojure.spec.alpha/def :portkey.aws.mobile.resource/arn (clojure.spec.alpha/and :portkey.aws.mobile/resource-arn))
(clojure.spec.alpha/def :portkey.aws.mobile.resource/feature (clojure.spec.alpha/and :portkey.aws.mobile/feature))
(clojure.spec.alpha/def :portkey.aws.mobile.resource/attributes (clojure.spec.alpha/and :portkey.aws.mobile/attributes))
(clojure.spec.alpha/def :portkey.aws.mobile/resource (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mobile.resource/type :portkey.aws.mobile.resource/name :portkey.aws.mobile.resource/arn :portkey.aws.mobile.resource/feature :portkey.aws.mobile.resource/attributes]))

(clojure.spec.alpha/def :portkey.aws.mobile/icon-url (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mobile/project-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mobile.list-bundles-result/bundle-list (clojure.spec.alpha/and :portkey.aws.mobile/bundle-list))
(clojure.spec.alpha/def :portkey.aws.mobile.list-bundles-result/next-token (clojure.spec.alpha/and :portkey.aws.mobile/next-token))
(clojure.spec.alpha/def :portkey.aws.mobile/list-bundles-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mobile.list-bundles-result/bundle-list :portkey.aws.mobile.list-bundles-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.mobile.delete-project-request/project-id (clojure.spec.alpha/and :portkey.aws.mobile/project-id))
(clojure.spec.alpha/def :portkey.aws.mobile/delete-project-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mobile.delete-project-request/project-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mobile/project-region (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mobile.project-details/name (clojure.spec.alpha/and :portkey.aws.mobile/project-name))
(clojure.spec.alpha/def :portkey.aws.mobile.project-details/project-id (clojure.spec.alpha/and :portkey.aws.mobile/project-id))
(clojure.spec.alpha/def :portkey.aws.mobile.project-details/region (clojure.spec.alpha/and :portkey.aws.mobile/project-region))
(clojure.spec.alpha/def :portkey.aws.mobile.project-details/state (clojure.spec.alpha/and :portkey.aws.mobile/project-state))
(clojure.spec.alpha/def :portkey.aws.mobile.project-details/created-date (clojure.spec.alpha/and :portkey.aws.mobile/date))
(clojure.spec.alpha/def :portkey.aws.mobile.project-details/last-updated-date (clojure.spec.alpha/and :portkey.aws.mobile/date))
(clojure.spec.alpha/def :portkey.aws.mobile.project-details/console-url (clojure.spec.alpha/and :portkey.aws.mobile/console-url))
(clojure.spec.alpha/def :portkey.aws.mobile.project-details/resources (clojure.spec.alpha/and :portkey.aws.mobile/resources))
(clojure.spec.alpha/def :portkey.aws.mobile/project-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mobile.project-details/name :portkey.aws.mobile.project-details/project-id :portkey.aws.mobile.project-details/region :portkey.aws.mobile.project-details/state :portkey.aws.mobile.project-details/created-date :portkey.aws.mobile.project-details/last-updated-date :portkey.aws.mobile.project-details/console-url :portkey.aws.mobile.project-details/resources]))

(clojure.spec.alpha/def :portkey.aws.mobile/snapshot-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mobile/platforms (clojure.spec.alpha/coll-of :portkey.aws.mobile/platform))

(clojure.spec.alpha/def :portkey.aws.mobile/boolean clojure.core/boolean?)

(clojure.core/defn describe-bundle ([describe-bundle-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-bundle-request describe-bundle-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.mobile/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mobile/describe-bundle-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/bundles/{bundleId}", :http.request.configuration/version "2017-07-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.mobile/describe-bundle-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeBundle", :http.request.spec/error-spec {"InternalFailureException" :portkey.aws.mobile/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.mobile/service-unavailable-exception, "UnauthorizedException" :portkey.aws.mobile/unauthorized-exception, "TooManyRequestsException" :portkey.aws.mobile/too-many-requests-exception, "BadRequestException" :portkey.aws.mobile/bad-request-exception, "NotFoundException" :portkey.aws.mobile/not-found-exception}})))))
(clojure.spec.alpha/fdef describe-bundle :args (clojure.spec.alpha/tuple :portkey.aws.mobile/describe-bundle-request) :ret (clojure.spec.alpha/and :portkey.aws.mobile/describe-bundle-result))

(clojure.core/defn describe-project ([describe-project-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-project-request describe-project-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.mobile/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mobile/describe-project-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/project", :http.request.configuration/version "2017-07-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.mobile/describe-project-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeProject", :http.request.spec/error-spec {"InternalFailureException" :portkey.aws.mobile/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.mobile/service-unavailable-exception, "UnauthorizedException" :portkey.aws.mobile/unauthorized-exception, "TooManyRequestsException" :portkey.aws.mobile/too-many-requests-exception, "BadRequestException" :portkey.aws.mobile/bad-request-exception, "NotFoundException" :portkey.aws.mobile/not-found-exception}})))))
(clojure.spec.alpha/fdef describe-project :args (clojure.spec.alpha/tuple :portkey.aws.mobile/describe-project-request) :ret (clojure.spec.alpha/and :portkey.aws.mobile/describe-project-result))

(clojure.core/defn list-projects ([] (list-projects {})) ([list-projects-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-projects-request list-projects-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.mobile/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mobile/list-projects-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/projects", :http.request.configuration/version "2017-07-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.mobile/list-projects-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListProjects", :http.request.spec/error-spec {"InternalFailureException" :portkey.aws.mobile/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.mobile/service-unavailable-exception, "UnauthorizedException" :portkey.aws.mobile/unauthorized-exception, "TooManyRequestsException" :portkey.aws.mobile/too-many-requests-exception, "BadRequestException" :portkey.aws.mobile/bad-request-exception}})))))
(clojure.spec.alpha/fdef list-projects :args (clojure.spec.alpha/? :portkey.aws.mobile/list-projects-request) :ret (clojure.spec.alpha/and :portkey.aws.mobile/list-projects-result))

(clojure.core/defn update-project ([update-project-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-project-request update-project-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.mobile/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mobile/update-project-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/update", :http.request.configuration/version "2017-07-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.mobile/update-project-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateProject", :http.request.spec/error-spec {"InternalFailureException" :portkey.aws.mobile/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.mobile/service-unavailable-exception, "UnauthorizedException" :portkey.aws.mobile/unauthorized-exception, "TooManyRequestsException" :portkey.aws.mobile/too-many-requests-exception, "BadRequestException" :portkey.aws.mobile/bad-request-exception, "NotFoundException" :portkey.aws.mobile/not-found-exception, "AccountActionRequiredException" :portkey.aws.mobile/account-action-required-exception, "LimitExceededException" :portkey.aws.mobile/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef update-project :args (clojure.spec.alpha/tuple :portkey.aws.mobile/update-project-request) :ret (clojure.spec.alpha/and :portkey.aws.mobile/update-project-result))

(clojure.core/defn export-bundle ([export-bundle-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-export-bundle-request export-bundle-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.mobile/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mobile/export-bundle-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/bundles/{bundleId}", :http.request.configuration/version "2017-07-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.mobile/export-bundle-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ExportBundle", :http.request.spec/error-spec {"InternalFailureException" :portkey.aws.mobile/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.mobile/service-unavailable-exception, "UnauthorizedException" :portkey.aws.mobile/unauthorized-exception, "TooManyRequestsException" :portkey.aws.mobile/too-many-requests-exception, "BadRequestException" :portkey.aws.mobile/bad-request-exception, "NotFoundException" :portkey.aws.mobile/not-found-exception}})))))
(clojure.spec.alpha/fdef export-bundle :args (clojure.spec.alpha/tuple :portkey.aws.mobile/export-bundle-request) :ret (clojure.spec.alpha/and :portkey.aws.mobile/export-bundle-result))

(clojure.core/defn delete-project ([delete-project-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-project-request delete-project-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.mobile/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mobile/delete-project-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/projects/{projectId}", :http.request.configuration/version "2017-07-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.mobile/delete-project-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteProject", :http.request.spec/error-spec {"InternalFailureException" :portkey.aws.mobile/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.mobile/service-unavailable-exception, "UnauthorizedException" :portkey.aws.mobile/unauthorized-exception, "TooManyRequestsException" :portkey.aws.mobile/too-many-requests-exception, "NotFoundException" :portkey.aws.mobile/not-found-exception}})))))
(clojure.spec.alpha/fdef delete-project :args (clojure.spec.alpha/tuple :portkey.aws.mobile/delete-project-request) :ret (clojure.spec.alpha/and :portkey.aws.mobile/delete-project-result))

(clojure.core/defn list-bundles ([] (list-bundles {})) ([list-bundles-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-bundles-request list-bundles-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.mobile/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mobile/list-bundles-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/bundles", :http.request.configuration/version "2017-07-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.mobile/list-bundles-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListBundles", :http.request.spec/error-spec {"InternalFailureException" :portkey.aws.mobile/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.mobile/service-unavailable-exception, "UnauthorizedException" :portkey.aws.mobile/unauthorized-exception, "TooManyRequestsException" :portkey.aws.mobile/too-many-requests-exception, "BadRequestException" :portkey.aws.mobile/bad-request-exception}})))))
(clojure.spec.alpha/fdef list-bundles :args (clojure.spec.alpha/? :portkey.aws.mobile/list-bundles-request) :ret (clojure.spec.alpha/and :portkey.aws.mobile/list-bundles-result))

(clojure.core/defn export-project ([export-project-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-export-project-request export-project-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.mobile/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mobile/export-project-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/exports/{projectId}", :http.request.configuration/version "2017-07-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.mobile/export-project-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ExportProject", :http.request.spec/error-spec {"InternalFailureException" :portkey.aws.mobile/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.mobile/service-unavailable-exception, "UnauthorizedException" :portkey.aws.mobile/unauthorized-exception, "TooManyRequestsException" :portkey.aws.mobile/too-many-requests-exception, "BadRequestException" :portkey.aws.mobile/bad-request-exception, "NotFoundException" :portkey.aws.mobile/not-found-exception}})))))
(clojure.spec.alpha/fdef export-project :args (clojure.spec.alpha/tuple :portkey.aws.mobile/export-project-request) :ret (clojure.spec.alpha/and :portkey.aws.mobile/export-project-result))

(clojure.core/defn create-project ([] (create-project {})) ([create-project-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-project-request create-project-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.mobile/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mobile/create-project-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/projects", :http.request.configuration/version "2017-07-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.mobile/create-project-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateProject", :http.request.spec/error-spec {"InternalFailureException" :portkey.aws.mobile/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.mobile/service-unavailable-exception, "UnauthorizedException" :portkey.aws.mobile/unauthorized-exception, "TooManyRequestsException" :portkey.aws.mobile/too-many-requests-exception, "BadRequestException" :portkey.aws.mobile/bad-request-exception, "NotFoundException" :portkey.aws.mobile/not-found-exception, "LimitExceededException" :portkey.aws.mobile/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-project :args (clojure.spec.alpha/? :portkey.aws.mobile/create-project-request) :ret (clojure.spec.alpha/and :portkey.aws.mobile/create-project-result))