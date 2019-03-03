(ns portkey.aws.ecr (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "ecr", :region "ap-northeast-1"},
    :ssl-common-name "ecr.ap-northeast-1.amazonaws.com",
    :endpoint "https://ecr.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "ecr", :region "eu-west-1"},
    :ssl-common-name "ecr.eu-west-1.amazonaws.com",
    :endpoint "https://ecr.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "ecr", :region "us-east-2"},
    :ssl-common-name "ecr.us-east-2.amazonaws.com",
    :endpoint "https://ecr.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "ecr", :region "ap-southeast-2"},
    :ssl-common-name "ecr.ap-southeast-2.amazonaws.com",
    :endpoint "https://ecr.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "ecr", :region "cn-north-1"},
    :ssl-common-name "ecr.cn-north-1.amazonaws.com.cn",
    :endpoint "https://ecr.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "ecr", :region "sa-east-1"},
    :ssl-common-name "ecr.sa-east-1.amazonaws.com",
    :endpoint "https://ecr.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "ecr", :region "ap-southeast-1"},
    :ssl-common-name "ecr.ap-southeast-1.amazonaws.com",
    :endpoint "https://ecr.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "cn-northwest-1"
   {:credential-scope {:service "ecr", :region "cn-northwest-1"},
    :ssl-common-name "ecr.cn-northwest-1.amazonaws.com.cn",
    :endpoint "https://ecr.cn-northwest-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "ecr", :region "ap-northeast-2"},
    :ssl-common-name "ecr.ap-northeast-2.amazonaws.com",
    :endpoint "https://ecr.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "ecr", :region "eu-west-3"},
    :ssl-common-name "ecr.eu-west-3.amazonaws.com",
    :endpoint "https://ecr.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "ecr", :region "ca-central-1"},
    :ssl-common-name "ecr.ca-central-1.amazonaws.com",
    :endpoint "https://ecr.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "ecr", :region "eu-central-1"},
    :ssl-common-name "ecr.eu-central-1.amazonaws.com",
    :endpoint "https://ecr.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "ecr", :region "eu-west-2"},
    :ssl-common-name "ecr.eu-west-2.amazonaws.com",
    :endpoint "https://ecr.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "ecr", :region "us-gov-west-1"},
    :ssl-common-name "ecr.us-gov-west-1.amazonaws.com",
    :endpoint "https://ecr.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "ecr", :region "us-west-2"},
    :ssl-common-name "ecr.us-west-2.amazonaws.com",
    :endpoint "https://ecr.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "ecr", :region "us-east-1"},
    :ssl-common-name "ecr.us-east-1.amazonaws.com",
    :endpoint "https://ecr.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "ecr", :region "us-west-1"},
    :ssl-common-name "ecr.us-west-1.amazonaws.com",
    :endpoint "https://ecr.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "ecr", :region "ap-south-1"},
    :ssl-common-name "ecr.ap-south-1.amazonaws.com",
    :endpoint "https://ecr.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-media-type-list)

(clojure.core/declare ser-describe-images-filter)

(clojure.core/declare ser-media-type)

(clojure.core/declare ser-image-digest)

(clojure.core/declare ser-layer-part-blob)

(clojure.core/declare ser-repository-name)

(clojure.core/declare ser-batched-operation-layer-digest)

(clojure.core/declare ser-tag-status)

(clojure.core/declare ser-repository-policy-text)

(clojure.core/declare ser-lifecycle-policy-preview-filter)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-batched-operation-layer-digest-list)

(clojure.core/declare ser-part-size)

(clojure.core/declare ser-force-flag)

(clojure.core/declare ser-image-tag)

(clojure.core/declare ser-image-identifier)

(clojure.core/declare ser-get-authorization-token-registry-id-list)

(clojure.core/declare ser-layer-digest-list)

(clojure.core/declare ser-registry-id)

(clojure.core/declare ser-layer-digest)

(clojure.core/declare ser-upload-id)

(clojure.core/declare ser-image-manifest)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-list-images-filter)

(clojure.core/declare ser-image-identifier-list)

(clojure.core/declare ser-lifecycle-policy-text)

(clojure.core/declare ser-repository-name-list)

(clojure.core/defn- ser-media-type-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-media-type coll) #:http.request.field{:shape "MediaType"}))) input), :shape "MediaTypeList", :type "list", :max 100, :min 1})

(clojure.core/defn- ser-describe-images-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DescribeImagesFilter", :type "structure"} (clojure.core/contains? input :tag-status) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-status (input :tag-status)) #:http.request.field{:name "tagStatus", :shape "TagStatus"}))))

(clojure.core/defn- ser-media-type [input] #:http.request.field{:value input, :shape "MediaType"})

(clojure.core/defn- ser-image-digest [input] #:http.request.field{:value input, :shape "ImageDigest"})

(clojure.core/defn- ser-layer-part-blob [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "LayerPartBlob"})

(clojure.core/defn- ser-repository-name [input] #:http.request.field{:value input, :shape "RepositoryName"})

(clojure.core/defn- ser-batched-operation-layer-digest [input] #:http.request.field{:value input, :shape "BatchedOperationLayerDigest"})

(clojure.core/defn- ser-tag-status [input] #:http.request.field{:value (clojure.core/get {"TAGGED" "TAGGED", :tagged "TAGGED", "UNTAGGED" "UNTAGGED", :untagged "UNTAGGED"} input), :shape "TagStatus"})

(clojure.core/defn- ser-repository-policy-text [input] #:http.request.field{:value input, :shape "RepositoryPolicyText"})

(clojure.core/defn- ser-lifecycle-policy-preview-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "LifecyclePolicyPreviewFilter", :type "structure"} (clojure.core/contains? input :tag-status) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-status (input :tag-status)) #:http.request.field{:name "tagStatus", :shape "TagStatus"}))))

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-batched-operation-layer-digest-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-batched-operation-layer-digest coll) #:http.request.field{:shape "BatchedOperationLayerDigest"}))) input), :shape "BatchedOperationLayerDigestList", :type "list", :max 100, :min 1})

(clojure.core/defn- ser-part-size [input] #:http.request.field{:value input, :shape "PartSize"})

(clojure.core/defn- ser-force-flag [input] #:http.request.field{:value input, :shape "ForceFlag"})

(clojure.core/defn- ser-image-tag [input] #:http.request.field{:value input, :shape "ImageTag"})

(clojure.core/defn- ser-image-identifier [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ImageIdentifier", :type "structure"} (clojure.core/contains? input :image-digest) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-image-digest (input :image-digest)) #:http.request.field{:name "imageDigest", :shape "ImageDigest"})) (clojure.core/contains? input :image-tag) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-image-tag (input :image-tag)) #:http.request.field{:name "imageTag", :shape "ImageTag"}))))

(clojure.core/defn- ser-get-authorization-token-registry-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-registry-id coll) #:http.request.field{:shape "RegistryId"}))) input), :shape "GetAuthorizationTokenRegistryIdList", :type "list", :max 10, :min 1})

(clojure.core/defn- ser-layer-digest-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-layer-digest coll) #:http.request.field{:shape "LayerDigest"}))) input), :shape "LayerDigestList", :type "list", :max 100, :min 1})

(clojure.core/defn- ser-registry-id [input] #:http.request.field{:value input, :shape "RegistryId"})

(clojure.core/defn- ser-layer-digest [input] #:http.request.field{:value input, :shape "LayerDigest"})

(clojure.core/defn- ser-upload-id [input] #:http.request.field{:value input, :shape "UploadId"})

(clojure.core/defn- ser-image-manifest [input] #:http.request.field{:value input, :shape "ImageManifest"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-list-images-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ListImagesFilter", :type "structure"} (clojure.core/contains? input :tag-status) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-status (input :tag-status)) #:http.request.field{:name "tagStatus", :shape "TagStatus"}))))

(clojure.core/defn- ser-image-identifier-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-image-identifier coll) #:http.request.field{:shape "ImageIdentifier"}))) input), :shape "ImageIdentifierList", :type "list", :max 100, :min 1})

(clojure.core/defn- ser-lifecycle-policy-text [input] #:http.request.field{:value input, :shape "LifecyclePolicyText"})

(clojure.core/defn- ser-repository-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-repository-name coll) #:http.request.field{:shape "RepositoryName"}))) input), :shape "RepositoryNameList", :type "list", :max 100, :min 1})

(clojure.core/defn- req-get-authorization-token-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :registry-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-get-authorization-token-registry-id-list (input :registry-ids)) #:http.request.field{:name "registryIds", :shape "GetAuthorizationTokenRegistryIdList"}))))

(clojure.core/defn- req-put-image-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-image-manifest (input :image-manifest)) #:http.request.field{:name "imageManifest", :shape "ImageManifest"})]} (clojure.core/contains? input :registry-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-id (input :registry-id)) #:http.request.field{:name "registryId", :shape "RegistryId"})) (clojure.core/contains? input :image-tag) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-image-tag (input :image-tag)) #:http.request.field{:name "imageTag", :shape "ImageTag"}))))

(clojure.core/defn- req-get-download-url-for-layer-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-layer-digest (input :layer-digest)) #:http.request.field{:name "layerDigest", :shape "LayerDigest"})]} (clojure.core/contains? input :registry-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-id (input :registry-id)) #:http.request.field{:name "registryId", :shape "RegistryId"}))))

(clojure.core/defn- req-complete-layer-upload-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-upload-id (input :upload-id)) #:http.request.field{:name "uploadId", :shape "UploadId"}) (clojure.core/into (ser-layer-digest-list (input :layer-digests)) #:http.request.field{:name "layerDigests", :shape "LayerDigestList"})]} (clojure.core/contains? input :registry-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-id (input :registry-id)) #:http.request.field{:name "registryId", :shape "RegistryId"}))))

(clojure.core/defn- req-batch-check-layer-availability-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-batched-operation-layer-digest-list (input :layer-digests)) #:http.request.field{:name "layerDigests", :shape "BatchedOperationLayerDigestList"})]} (clojure.core/contains? input :registry-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-id (input :registry-id)) #:http.request.field{:name "registryId", :shape "RegistryId"}))))

(clojure.core/defn- req-list-images-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"})]} (clojure.core/contains? input :registry-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-id (input :registry-id)) #:http.request.field{:name "registryId", :shape "RegistryId"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults"})) (clojure.core/contains? input :filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-images-filter (input :filter)) #:http.request.field{:name "filter", :shape "ListImagesFilter"}))))

(clojure.core/defn- req-get-lifecycle-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"})]} (clojure.core/contains? input :registry-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-id (input :registry-id)) #:http.request.field{:name "registryId", :shape "RegistryId"}))))

(clojure.core/defn- req-delete-lifecycle-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"})]} (clojure.core/contains? input :registry-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-id (input :registry-id)) #:http.request.field{:name "registryId", :shape "RegistryId"}))))

(clojure.core/defn- req-upload-layer-part-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-upload-id (input :upload-id)) #:http.request.field{:name "uploadId", :shape "UploadId"}) (clojure.core/into (ser-part-size (input :part-first-byte)) #:http.request.field{:name "partFirstByte", :shape "PartSize"}) (clojure.core/into (ser-part-size (input :part-last-byte)) #:http.request.field{:name "partLastByte", :shape "PartSize"}) (clojure.core/into (ser-layer-part-blob (input :layer-part-blob)) #:http.request.field{:name "layerPartBlob", :shape "LayerPartBlob"})]} (clojure.core/contains? input :registry-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-id (input :registry-id)) #:http.request.field{:name "registryId", :shape "RegistryId"}))))

(clojure.core/defn- req-get-lifecycle-policy-preview-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"})]} (clojure.core/contains? input :registry-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-id (input :registry-id)) #:http.request.field{:name "registryId", :shape "RegistryId"})) (clojure.core/contains? input :image-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-image-identifier-list (input :image-ids)) #:http.request.field{:name "imageIds", :shape "ImageIdentifierList"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults"})) (clojure.core/contains? input :filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lifecycle-policy-preview-filter (input :filter)) #:http.request.field{:name "filter", :shape "LifecyclePolicyPreviewFilter"}))))

(clojure.core/defn- req-describe-repositories-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :registry-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-id (input :registry-id)) #:http.request.field{:name "registryId", :shape "RegistryId"})) (clojure.core/contains? input :repository-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-repository-name-list (input :repository-names)) #:http.request.field{:name "repositoryNames", :shape "RepositoryNameList"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-put-lifecycle-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-lifecycle-policy-text (input :lifecycle-policy-text)) #:http.request.field{:name "lifecyclePolicyText", :shape "LifecyclePolicyText"})]} (clojure.core/contains? input :registry-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-id (input :registry-id)) #:http.request.field{:name "registryId", :shape "RegistryId"}))))

(clojure.core/defn- req-batch-delete-image-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-image-identifier-list (input :image-ids)) #:http.request.field{:name "imageIds", :shape "ImageIdentifierList"})]} (clojure.core/contains? input :registry-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-id (input :registry-id)) #:http.request.field{:name "registryId", :shape "RegistryId"}))))

(clojure.core/defn- req-start-lifecycle-policy-preview-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"})]} (clojure.core/contains? input :registry-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-id (input :registry-id)) #:http.request.field{:name "registryId", :shape "RegistryId"})) (clojure.core/contains? input :lifecycle-policy-text) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lifecycle-policy-text (input :lifecycle-policy-text)) #:http.request.field{:name "lifecyclePolicyText", :shape "LifecyclePolicyText"}))))

(clojure.core/defn- req-describe-images-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"})]} (clojure.core/contains? input :registry-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-id (input :registry-id)) #:http.request.field{:name "registryId", :shape "RegistryId"})) (clojure.core/contains? input :image-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-image-identifier-list (input :image-ids)) #:http.request.field{:name "imageIds", :shape "ImageIdentifierList"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults"})) (clojure.core/contains? input :filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-describe-images-filter (input :filter)) #:http.request.field{:name "filter", :shape "DescribeImagesFilter"}))))

(clojure.core/defn- req-batch-get-image-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-image-identifier-list (input :image-ids)) #:http.request.field{:name "imageIds", :shape "ImageIdentifierList"})]} (clojure.core/contains? input :registry-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-id (input :registry-id)) #:http.request.field{:name "registryId", :shape "RegistryId"})) (clojure.core/contains? input :accepted-media-types) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-media-type-list (input :accepted-media-types)) #:http.request.field{:name "acceptedMediaTypes", :shape "MediaTypeList"}))))

(clojure.core/defn- req-get-repository-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"})]} (clojure.core/contains? input :registry-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-id (input :registry-id)) #:http.request.field{:name "registryId", :shape "RegistryId"}))))

(clojure.core/defn- req-delete-repository-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"})]} (clojure.core/contains? input :registry-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-id (input :registry-id)) #:http.request.field{:name "registryId", :shape "RegistryId"}))))

(clojure.core/defn- req-create-repository-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"})]}))

(clojure.core/defn- req-initiate-layer-upload-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"})]} (clojure.core/contains? input :registry-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-id (input :registry-id)) #:http.request.field{:name "registryId", :shape "RegistryId"}))))

(clojure.core/defn- req-set-repository-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-repository-policy-text (input :policy-text)) #:http.request.field{:name "policyText", :shape "RepositoryPolicyText"})]} (clojure.core/contains? input :registry-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-id (input :registry-id)) #:http.request.field{:name "registryId", :shape "RegistryId"})) (clojure.core/contains? input :force) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-force-flag (input :force)) #:http.request.field{:name "force", :shape "ForceFlag"}))))

(clojure.core/defn- req-delete-repository-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"})]} (clojure.core/contains? input :registry-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-id (input :registry-id)) #:http.request.field{:name "registryId", :shape "RegistryId"})) (clojure.core/contains? input :force) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-force-flag (input :force)) #:http.request.field{:name "force", :shape "ForceFlag"}))))

(clojure.core/declare deser-image-failure-list)

(clojure.core/declare deser-proxy-endpoint)

(clojure.core/declare deser-lifecycle-policy-preview-status)

(clojure.core/declare deser-image-count)

(clojure.core/declare deser-repository-list)

(clojure.core/declare deser-media-type)

(clojure.core/declare deser-image-digest)

(clojure.core/declare deser-layer-failure-reason)

(clojure.core/declare deser-lifecycle-policy-rule-action)

(clojure.core/declare deser-repository-name)

(clojure.core/declare deser-evaluation-timestamp)

(clojure.core/declare deser-image-tag-list)

(clojure.core/declare deser-image-action-type)

(clojure.core/declare deser-batched-operation-layer-digest)

(clojure.core/declare deser-lifecycle-policy-rule-priority)

(clojure.core/declare deser-repository)

(clojure.core/declare deser-layer-failure)

(clojure.core/declare deser-repository-policy-text)

(clojure.core/declare deser-authorization-data-list)

(clojure.core/declare deser-base-64)

(clojure.core/declare deser-next-token)

(clojure.core/declare deser-layer-availability)

(clojure.core/declare deser-image-list)

(clojure.core/declare deser-lifecycle-policy-preview-result-list)

(clojure.core/declare deser-part-size)

(clojure.core/declare deser-image-tag)

(clojure.core/declare deser-layer)

(clojure.core/declare deser-layer-size-in-bytes)

(clojure.core/declare deser-image-identifier)

(clojure.core/declare deser-image-size-in-bytes)

(clojure.core/declare deser-url)

(clojure.core/declare deser-layer-failure-code)

(clojure.core/declare deser-creation-timestamp)

(clojure.core/declare deser-exception-message)

(clojure.core/declare deser-lifecycle-policy-preview-summary)

(clojure.core/declare deser-expiration-timestamp)

(clojure.core/declare deser-layer-list)

(clojure.core/declare deser-image-failure-reason)

(clojure.core/declare deser-image-detail)

(clojure.core/declare deser-registry-id)

(clojure.core/declare deser-image-failure)

(clojure.core/declare deser-arn)

(clojure.core/declare deser-layer-digest)

(clojure.core/declare deser-upload-id)

(clojure.core/declare deser-authorization-data)

(clojure.core/declare deser-image-manifest)

(clojure.core/declare deser-lifecycle-policy-preview-result)

(clojure.core/declare deser-image-detail-list)

(clojure.core/declare deser-layer-failure-list)

(clojure.core/declare deser-image-failure-code)

(clojure.core/declare deser-image)

(clojure.core/declare deser-image-identifier-list)

(clojure.core/declare deser-lifecycle-policy-text)

(clojure.core/declare deser-push-timestamp)

(clojure.core/defn- deser-image-failure-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-image-failure coll))) input))

(clojure.core/defn- deser-proxy-endpoint [input] input)

(clojure.core/defn- deser-lifecycle-policy-preview-status [input] (clojure.core/get {"IN_PROGRESS" :in-progress, "COMPLETE" :complete, "EXPIRED" :expired, "FAILED" :failed} input))

(clojure.core/defn- deser-image-count [input] input)

(clojure.core/defn- deser-repository-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-repository coll))) input))

(clojure.core/defn- deser-media-type [input] input)

(clojure.core/defn- deser-image-digest [input] input)

(clojure.core/defn- deser-layer-failure-reason [input] input)

(clojure.core/defn- deser-lifecycle-policy-rule-action [input] (clojure.core/cond-> {} (clojure.core/contains? input "type") (clojure.core/assoc :type (deser-image-action-type (input "type")))))

(clojure.core/defn- deser-repository-name [input] input)

(clojure.core/defn- deser-evaluation-timestamp [input] input)

(clojure.core/defn- deser-image-tag-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-image-tag coll))) input))

(clojure.core/defn- deser-image-action-type [input] (clojure.core/get {"EXPIRE" :expire} input))

(clojure.core/defn- deser-batched-operation-layer-digest [input] input)

(clojure.core/defn- deser-lifecycle-policy-rule-priority [input] input)

(clojure.core/defn- deser-repository [input] (clojure.core/cond-> {} (clojure.core/contains? input "repositoryArn") (clojure.core/assoc :repository-arn (deser-arn (input "repositoryArn"))) (clojure.core/contains? input "registryId") (clojure.core/assoc :registry-id (deser-registry-id (input "registryId"))) (clojure.core/contains? input "repositoryName") (clojure.core/assoc :repository-name (deser-repository-name (input "repositoryName"))) (clojure.core/contains? input "repositoryUri") (clojure.core/assoc :repository-uri (deser-url (input "repositoryUri"))) (clojure.core/contains? input "createdAt") (clojure.core/assoc :created-at (deser-creation-timestamp (input "createdAt")))))

(clojure.core/defn- deser-layer-failure [input] (clojure.core/cond-> {} (clojure.core/contains? input "layerDigest") (clojure.core/assoc :layer-digest (deser-batched-operation-layer-digest (input "layerDigest"))) (clojure.core/contains? input "failureCode") (clojure.core/assoc :failure-code (deser-layer-failure-code (input "failureCode"))) (clojure.core/contains? input "failureReason") (clojure.core/assoc :failure-reason (deser-layer-failure-reason (input "failureReason")))))

(clojure.core/defn- deser-repository-policy-text [input] input)

(clojure.core/defn- deser-authorization-data-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-authorization-data coll))) input))

(clojure.core/defn- deser-base-64 [input] input)

(clojure.core/defn- deser-next-token [input] input)

(clojure.core/defn- deser-layer-availability [input] (clojure.core/get {"AVAILABLE" :available, "UNAVAILABLE" :unavailable} input))

(clojure.core/defn- deser-image-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-image coll))) input))

(clojure.core/defn- deser-lifecycle-policy-preview-result-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-lifecycle-policy-preview-result coll))) input))

(clojure.core/defn- deser-part-size [input] input)

(clojure.core/defn- deser-image-tag [input] input)

(clojure.core/defn- deser-layer [input] (clojure.core/cond-> {} (clojure.core/contains? input "layerDigest") (clojure.core/assoc :layer-digest (deser-layer-digest (input "layerDigest"))) (clojure.core/contains? input "layerAvailability") (clojure.core/assoc :layer-availability (deser-layer-availability (input "layerAvailability"))) (clojure.core/contains? input "layerSize") (clojure.core/assoc :layer-size (deser-layer-size-in-bytes (input "layerSize"))) (clojure.core/contains? input "mediaType") (clojure.core/assoc :media-type (deser-media-type (input "mediaType")))))

(clojure.core/defn- deser-layer-size-in-bytes [input] input)

(clojure.core/defn- deser-image-identifier [input] (clojure.core/cond-> {} (clojure.core/contains? input "imageDigest") (clojure.core/assoc :image-digest (deser-image-digest (input "imageDigest"))) (clojure.core/contains? input "imageTag") (clojure.core/assoc :image-tag (deser-image-tag (input "imageTag")))))

(clojure.core/defn- deser-image-size-in-bytes [input] input)

(clojure.core/defn- deser-url [input] input)

(clojure.core/defn- deser-layer-failure-code [input] (clojure.core/get {"InvalidLayerDigest" :invalid-layer-digest, "MissingLayerDigest" :missing-layer-digest} input))

(clojure.core/defn- deser-creation-timestamp [input] input)

(clojure.core/defn- deser-exception-message [input] input)

(clojure.core/defn- deser-lifecycle-policy-preview-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "expiringImageTotalCount") (clojure.core/assoc :expiring-image-total-count (deser-image-count (input "expiringImageTotalCount")))))

(clojure.core/defn- deser-expiration-timestamp [input] input)

(clojure.core/defn- deser-layer-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-layer coll))) input))

(clojure.core/defn- deser-image-failure-reason [input] input)

(clojure.core/defn- deser-image-detail [input] (clojure.core/cond-> {} (clojure.core/contains? input "registryId") (clojure.core/assoc :registry-id (deser-registry-id (input "registryId"))) (clojure.core/contains? input "repositoryName") (clojure.core/assoc :repository-name (deser-repository-name (input "repositoryName"))) (clojure.core/contains? input "imageDigest") (clojure.core/assoc :image-digest (deser-image-digest (input "imageDigest"))) (clojure.core/contains? input "imageTags") (clojure.core/assoc :image-tags (deser-image-tag-list (input "imageTags"))) (clojure.core/contains? input "imageSizeInBytes") (clojure.core/assoc :image-size-in-bytes (deser-image-size-in-bytes (input "imageSizeInBytes"))) (clojure.core/contains? input "imagePushedAt") (clojure.core/assoc :image-pushed-at (deser-push-timestamp (input "imagePushedAt")))))

(clojure.core/defn- deser-registry-id [input] input)

(clojure.core/defn- deser-image-failure [input] (clojure.core/cond-> {} (clojure.core/contains? input "imageId") (clojure.core/assoc :image-id (deser-image-identifier (input "imageId"))) (clojure.core/contains? input "failureCode") (clojure.core/assoc :failure-code (deser-image-failure-code (input "failureCode"))) (clojure.core/contains? input "failureReason") (clojure.core/assoc :failure-reason (deser-image-failure-reason (input "failureReason")))))

(clojure.core/defn- deser-arn [input] input)

(clojure.core/defn- deser-layer-digest [input] input)

(clojure.core/defn- deser-upload-id [input] input)

(clojure.core/defn- deser-authorization-data [input] (clojure.core/cond-> {} (clojure.core/contains? input "authorizationToken") (clojure.core/assoc :authorization-token (deser-base-64 (input "authorizationToken"))) (clojure.core/contains? input "expiresAt") (clojure.core/assoc :expires-at (deser-expiration-timestamp (input "expiresAt"))) (clojure.core/contains? input "proxyEndpoint") (clojure.core/assoc :proxy-endpoint (deser-proxy-endpoint (input "proxyEndpoint")))))

(clojure.core/defn- deser-image-manifest [input] input)

(clojure.core/defn- deser-lifecycle-policy-preview-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "imageTags") (clojure.core/assoc :image-tags (deser-image-tag-list (input "imageTags"))) (clojure.core/contains? input "imageDigest") (clojure.core/assoc :image-digest (deser-image-digest (input "imageDigest"))) (clojure.core/contains? input "imagePushedAt") (clojure.core/assoc :image-pushed-at (deser-push-timestamp (input "imagePushedAt"))) (clojure.core/contains? input "action") (clojure.core/assoc :action (deser-lifecycle-policy-rule-action (input "action"))) (clojure.core/contains? input "appliedRulePriority") (clojure.core/assoc :applied-rule-priority (deser-lifecycle-policy-rule-priority (input "appliedRulePriority")))))

(clojure.core/defn- deser-image-detail-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-image-detail coll))) input))

(clojure.core/defn- deser-layer-failure-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-layer-failure coll))) input))

(clojure.core/defn- deser-image-failure-code [input] (clojure.core/get {"InvalidImageDigest" :invalid-image-digest, "InvalidImageTag" :invalid-image-tag, "ImageTagDoesNotMatchDigest" :image-tag-does-not-match-digest, "ImageNotFound" :image-not-found, "MissingDigestAndTag" :missing-digest-and-tag} input))

(clojure.core/defn- deser-image [input] (clojure.core/cond-> {} (clojure.core/contains? input "registryId") (clojure.core/assoc :registry-id (deser-registry-id (input "registryId"))) (clojure.core/contains? input "repositoryName") (clojure.core/assoc :repository-name (deser-repository-name (input "repositoryName"))) (clojure.core/contains? input "imageId") (clojure.core/assoc :image-id (deser-image-identifier (input "imageId"))) (clojure.core/contains? input "imageManifest") (clojure.core/assoc :image-manifest (deser-image-manifest (input "imageManifest")))))

(clojure.core/defn- deser-image-identifier-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-image-identifier coll))) input))

(clojure.core/defn- deser-lifecycle-policy-text [input] input)

(clojure.core/defn- deser-push-timestamp [input] input)

(clojure.core/defn- deser-get-download-url-for-layer-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "downloadUrl") (clojure.core/assoc :download-url (deser-url (input "downloadUrl"))) (clojure.core/contains? input "layerDigest") (clojure.core/assoc :layer-digest (deser-layer-digest (input "layerDigest")))))

(clojure.core/defn- deser-repository-already-exists-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-exception-message (input "message")))))

(clojure.core/defn- deser-layer-already-exists-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-exception-message (input "message")))))

(clojure.core/defn- deser-set-repository-policy-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "registryId") (clojure.core/assoc :registry-id (deser-registry-id (input "registryId"))) (clojure.core/contains? input "repositoryName") (clojure.core/assoc :repository-name (deser-repository-name (input "repositoryName"))) (clojure.core/contains? input "policyText") (clojure.core/assoc :policy-text (deser-repository-policy-text (input "policyText")))))

(clojure.core/defn- deser-layer-inaccessible-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-exception-message (input "message")))))

(clojure.core/defn- deser-put-image-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "image") (clojure.core/assoc :image (deser-image (input "image")))))

(clojure.core/defn- deser-batch-get-image-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "images") (clojure.core/assoc :images (deser-image-list (input "images"))) (clojure.core/contains? input "failures") (clojure.core/assoc :failures (deser-image-failure-list (input "failures")))))

(clojure.core/defn- deser-list-images-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "imageIds") (clojure.core/assoc :image-ids (deser-image-identifier-list (input "imageIds"))) (clojure.core/contains? input "nextToken") (clojure.core/assoc :next-token (deser-next-token (input "nextToken")))))

(clojure.core/defn- deser-repository-policy-not-found-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-exception-message (input "message")))))

(clojure.core/defn- deser-lifecycle-policy-preview-in-progress-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-exception-message (input "message")))))

(clojure.core/defn- deser-delete-repository-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "repository") (clojure.core/assoc :repository (deser-repository (input "repository")))))

(clojure.core/defn- deser-delete-lifecycle-policy-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "registryId") (clojure.core/assoc :registry-id (deser-registry-id (input "registryId"))) (clojure.core/contains? input "repositoryName") (clojure.core/assoc :repository-name (deser-repository-name (input "repositoryName"))) (clojure.core/contains? input "lifecyclePolicyText") (clojure.core/assoc :lifecycle-policy-text (deser-lifecycle-policy-text (input "lifecyclePolicyText"))) (clojure.core/contains? input "lastEvaluatedAt") (clojure.core/assoc :last-evaluated-at (deser-evaluation-timestamp (input "lastEvaluatedAt")))))

(clojure.core/defn- deser-limit-exceeded-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-exception-message (input "message")))))

(clojure.core/defn- deser-create-repository-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "repository") (clojure.core/assoc :repository (deser-repository (input "repository")))))

(clojure.core/defn- deser-describe-images-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "imageDetails") (clojure.core/assoc :image-details (deser-image-detail-list (input "imageDetails"))) (clojure.core/contains? input "nextToken") (clojure.core/assoc :next-token (deser-next-token (input "nextToken")))))

(clojure.core/defn- deser-get-authorization-token-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "authorizationData") (clojure.core/assoc :authorization-data (deser-authorization-data-list (input "authorizationData")))))

(clojure.core/defn- deser-initiate-layer-upload-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "uploadId") (clojure.core/assoc :upload-id (deser-upload-id (input "uploadId"))) (clojure.core/contains? input "partSize") (clojure.core/assoc :part-size (deser-part-size (input "partSize")))))

(clojure.core/defn- deser-layers-not-found-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-exception-message (input "message")))))

(clojure.core/defn- deser-delete-repository-policy-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "registryId") (clojure.core/assoc :registry-id (deser-registry-id (input "registryId"))) (clojure.core/contains? input "repositoryName") (clojure.core/assoc :repository-name (deser-repository-name (input "repositoryName"))) (clojure.core/contains? input "policyText") (clojure.core/assoc :policy-text (deser-repository-policy-text (input "policyText")))))

(clojure.core/defn- deser-get-repository-policy-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "registryId") (clojure.core/assoc :registry-id (deser-registry-id (input "registryId"))) (clojure.core/contains? input "repositoryName") (clojure.core/assoc :repository-name (deser-repository-name (input "repositoryName"))) (clojure.core/contains? input "policyText") (clojure.core/assoc :policy-text (deser-repository-policy-text (input "policyText")))))

(clojure.core/defn- deser-put-lifecycle-policy-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "registryId") (clojure.core/assoc :registry-id (deser-registry-id (input "registryId"))) (clojure.core/contains? input "repositoryName") (clojure.core/assoc :repository-name (deser-repository-name (input "repositoryName"))) (clojure.core/contains? input "lifecyclePolicyText") (clojure.core/assoc :lifecycle-policy-text (deser-lifecycle-policy-text (input "lifecyclePolicyText")))))

(clojure.core/defn- deser-layer-part-too-small-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-exception-message (input "message")))))

(clojure.core/defn- deser-start-lifecycle-policy-preview-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "registryId") (clojure.core/assoc :registry-id (deser-registry-id (input "registryId"))) (clojure.core/contains? input "repositoryName") (clojure.core/assoc :repository-name (deser-repository-name (input "repositoryName"))) (clojure.core/contains? input "lifecyclePolicyText") (clojure.core/assoc :lifecycle-policy-text (deser-lifecycle-policy-text (input "lifecyclePolicyText"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-lifecycle-policy-preview-status (input "status")))))

(clojure.core/defn- deser-complete-layer-upload-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "registryId") (clojure.core/assoc :registry-id (deser-registry-id (input "registryId"))) (clojure.core/contains? input "repositoryName") (clojure.core/assoc :repository-name (deser-repository-name (input "repositoryName"))) (clojure.core/contains? input "uploadId") (clojure.core/assoc :upload-id (deser-upload-id (input "uploadId"))) (clojure.core/contains? input "layerDigest") (clojure.core/assoc :layer-digest (deser-layer-digest (input "layerDigest")))))

(clojure.core/defn- deser-invalid-layer-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-exception-message (input "message")))))

(clojure.core/defn- deser-repository-not-empty-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-exception-message (input "message")))))

(clojure.core/defn- deser-server-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-exception-message (input "message")))))

(clojure.core/defn- deser-batch-check-layer-availability-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "layers") (clojure.core/assoc :layers (deser-layer-list (input "layers"))) (clojure.core/contains? input "failures") (clojure.core/assoc :failures (deser-layer-failure-list (input "failures")))))

(clojure.core/defn- deser-get-lifecycle-policy-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "registryId") (clojure.core/assoc :registry-id (deser-registry-id (input "registryId"))) (clojure.core/contains? input "repositoryName") (clojure.core/assoc :repository-name (deser-repository-name (input "repositoryName"))) (clojure.core/contains? input "lifecyclePolicyText") (clojure.core/assoc :lifecycle-policy-text (deser-lifecycle-policy-text (input "lifecyclePolicyText"))) (clojure.core/contains? input "lastEvaluatedAt") (clojure.core/assoc :last-evaluated-at (deser-evaluation-timestamp (input "lastEvaluatedAt")))))

(clojure.core/defn- deser-invalid-layer-part-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "registryId") (clojure.core/assoc :registry-id (deser-registry-id (input "registryId"))) (clojure.core/contains? input "repositoryName") (clojure.core/assoc :repository-name (deser-repository-name (input "repositoryName"))) (clojure.core/contains? input "uploadId") (clojure.core/assoc :upload-id (deser-upload-id (input "uploadId"))) (clojure.core/contains? input "lastValidByteReceived") (clojure.core/assoc :last-valid-byte-received (deser-part-size (input "lastValidByteReceived"))) (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-exception-message (input "message")))))

(clojure.core/defn- deser-image-already-exists-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-exception-message (input "message")))))

(clojure.core/defn- deser-batch-delete-image-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "imageIds") (clojure.core/assoc :image-ids (deser-image-identifier-list (input "imageIds"))) (clojure.core/contains? input "failures") (clojure.core/assoc :failures (deser-image-failure-list (input "failures")))))

(clojure.core/defn- deser-describe-repositories-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "repositories") (clojure.core/assoc :repositories (deser-repository-list (input "repositories"))) (clojure.core/contains? input "nextToken") (clojure.core/assoc :next-token (deser-next-token (input "nextToken")))))

(clojure.core/defn- deser-repository-not-found-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-exception-message (input "message")))))

(clojure.core/defn- deser-upload-not-found-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-exception-message (input "message")))))

(clojure.core/defn- deser-get-lifecycle-policy-preview-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "registryId") (clojure.core/assoc :registry-id (deser-registry-id (input "registryId"))) (clojure.core/contains? input "repositoryName") (clojure.core/assoc :repository-name (deser-repository-name (input "repositoryName"))) (clojure.core/contains? input "lifecyclePolicyText") (clojure.core/assoc :lifecycle-policy-text (deser-lifecycle-policy-text (input "lifecyclePolicyText"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-lifecycle-policy-preview-status (input "status"))) (clojure.core/contains? input "nextToken") (clojure.core/assoc :next-token (deser-next-token (input "nextToken"))) (clojure.core/contains? input "previewResults") (clojure.core/assoc :preview-results (deser-lifecycle-policy-preview-result-list (input "previewResults"))) (clojure.core/contains? input "summary") (clojure.core/assoc :summary (deser-lifecycle-policy-preview-summary (input "summary")))))

(clojure.core/defn- deser-lifecycle-policy-preview-not-found-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-exception-message (input "message")))))

(clojure.core/defn- deser-image-not-found-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-exception-message (input "message")))))

(clojure.core/defn- deser-lifecycle-policy-not-found-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-exception-message (input "message")))))

(clojure.core/defn- deser-invalid-parameter-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-exception-message (input "message")))))

(clojure.core/defn- deser-upload-layer-part-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "registryId") (clojure.core/assoc :registry-id (deser-registry-id (input "registryId"))) (clojure.core/contains? input "repositoryName") (clojure.core/assoc :repository-name (deser-repository-name (input "repositoryName"))) (clojure.core/contains? input "uploadId") (clojure.core/assoc :upload-id (deser-upload-id (input "uploadId"))) (clojure.core/contains? input "lastByteReceived") (clojure.core/assoc :last-byte-received (deser-part-size (input "lastByteReceived")))))

(clojure.core/defn- deser-empty-upload-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-exception-message (input "message")))))

(clojure.spec.alpha/def :portkey.aws.ecr/image-failure-list (clojure.spec.alpha/coll-of :portkey.aws.ecr/image-failure))

(clojure.spec.alpha/def :portkey.aws.ecr/media-type-list (clojure.spec.alpha/coll-of :portkey.aws.ecr/media-type :min-count 1 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.ecr/proxy-endpoint (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ecr.get-download-url-for-layer-response/download-url (clojure.spec.alpha/and :portkey.aws.ecr/url))
(clojure.spec.alpha/def :portkey.aws.ecr.get-download-url-for-layer-response/layer-digest (clojure.spec.alpha/and :portkey.aws.ecr/layer-digest))
(clojure.spec.alpha/def :portkey.aws.ecr/get-download-url-for-layer-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.get-download-url-for-layer-response/download-url :portkey.aws.ecr.get-download-url-for-layer-response/layer-digest]))

(clojure.spec.alpha/def :portkey.aws.ecr.get-authorization-token-request/registry-ids (clojure.spec.alpha/and :portkey.aws.ecr/get-authorization-token-registry-id-list))
(clojure.spec.alpha/def :portkey.aws.ecr/get-authorization-token-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.get-authorization-token-request/registry-ids]))

(clojure.spec.alpha/def :portkey.aws.ecr.repository-already-exists-exception/message (clojure.spec.alpha/and :portkey.aws.ecr/exception-message))
(clojure.spec.alpha/def :portkey.aws.ecr/repository-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.repository-already-exists-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ecr.describe-images-filter/tag-status (clojure.spec.alpha/and :portkey.aws.ecr/tag-status))
(clojure.spec.alpha/def :portkey.aws.ecr/describe-images-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.describe-images-filter/tag-status]))

(clojure.spec.alpha/def :portkey.aws.ecr.put-image-request/registry-id (clojure.spec.alpha/and :portkey.aws.ecr/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.put-image-request/repository-name (clojure.spec.alpha/and :portkey.aws.ecr/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.put-image-request/image-manifest (clojure.spec.alpha/and :portkey.aws.ecr/image-manifest))
(clojure.spec.alpha/def :portkey.aws.ecr.put-image-request/image-tag (clojure.spec.alpha/and :portkey.aws.ecr/image-tag))
(clojure.spec.alpha/def :portkey.aws.ecr/put-image-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecr.put-image-request/repository-name :portkey.aws.ecr.put-image-request/image-manifest] :opt-un [:portkey.aws.ecr.put-image-request/registry-id :portkey.aws.ecr.put-image-request/image-tag]))

(clojure.spec.alpha/def :portkey.aws.ecr.get-download-url-for-layer-request/registry-id (clojure.spec.alpha/and :portkey.aws.ecr/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.get-download-url-for-layer-request/repository-name (clojure.spec.alpha/and :portkey.aws.ecr/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.get-download-url-for-layer-request/layer-digest (clojure.spec.alpha/and :portkey.aws.ecr/layer-digest))
(clojure.spec.alpha/def :portkey.aws.ecr/get-download-url-for-layer-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecr.get-download-url-for-layer-request/repository-name :portkey.aws.ecr.get-download-url-for-layer-request/layer-digest] :opt-un [:portkey.aws.ecr.get-download-url-for-layer-request/registry-id]))

(clojure.spec.alpha/def :portkey.aws.ecr.layer-already-exists-exception/message (clojure.spec.alpha/and :portkey.aws.ecr/exception-message))
(clojure.spec.alpha/def :portkey.aws.ecr/layer-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.layer-already-exists-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ecr/lifecycle-policy-preview-status #{"IN_PROGRESS" :in-progress "EXPIRED" "COMPLETE" "FAILED" :expired :complete :failed})

(clojure.spec.alpha/def :portkey.aws.ecr/image-count (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.ecr/repository-list (clojure.spec.alpha/coll-of :portkey.aws.ecr/repository))

(clojure.spec.alpha/def :portkey.aws.ecr.set-repository-policy-response/registry-id (clojure.spec.alpha/and :portkey.aws.ecr/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.set-repository-policy-response/repository-name (clojure.spec.alpha/and :portkey.aws.ecr/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.set-repository-policy-response/policy-text (clojure.spec.alpha/and :portkey.aws.ecr/repository-policy-text))
(clojure.spec.alpha/def :portkey.aws.ecr/set-repository-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.set-repository-policy-response/registry-id :portkey.aws.ecr.set-repository-policy-response/repository-name :portkey.aws.ecr.set-repository-policy-response/policy-text]))

(clojure.spec.alpha/def :portkey.aws.ecr/media-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ecr/image-digest (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ecr/layer-failure-reason (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ecr.layer-inaccessible-exception/message (clojure.spec.alpha/and :portkey.aws.ecr/exception-message))
(clojure.spec.alpha/def :portkey.aws.ecr/layer-inaccessible-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.layer-inaccessible-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ecr.lifecycle-policy-rule-action/type (clojure.spec.alpha/and :portkey.aws.ecr/image-action-type))
(clojure.spec.alpha/def :portkey.aws.ecr/lifecycle-policy-rule-action (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.lifecycle-policy-rule-action/type]))

(clojure.spec.alpha/def :portkey.aws.ecr.put-image-response/image (clojure.spec.alpha/and :portkey.aws.ecr/image))
(clojure.spec.alpha/def :portkey.aws.ecr/put-image-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.put-image-response/image]))

(clojure.spec.alpha/def :portkey.aws.ecr/layer-part-blob clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.ecr/repository-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 2 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 256)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"(?:[a-z0-9]+(?:[._-][a-z0-9]+)*/)*[a-z0-9]+(?:[._-][a-z0-9]+)*" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.ecr.batch-get-image-response/images (clojure.spec.alpha/and :portkey.aws.ecr/image-list))
(clojure.spec.alpha/def :portkey.aws.ecr.batch-get-image-response/failures (clojure.spec.alpha/and :portkey.aws.ecr/image-failure-list))
(clojure.spec.alpha/def :portkey.aws.ecr/batch-get-image-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.batch-get-image-response/images :portkey.aws.ecr.batch-get-image-response/failures]))

(clojure.spec.alpha/def :portkey.aws.ecr.list-images-response/image-ids (clojure.spec.alpha/and :portkey.aws.ecr/image-identifier-list))
(clojure.spec.alpha/def :portkey.aws.ecr.list-images-response/next-token (clojure.spec.alpha/and :portkey.aws.ecr/next-token))
(clojure.spec.alpha/def :portkey.aws.ecr/list-images-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.list-images-response/image-ids :portkey.aws.ecr.list-images-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.ecr/evaluation-timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.ecr/image-tag-list (clojure.spec.alpha/coll-of :portkey.aws.ecr/image-tag))

(clojure.spec.alpha/def :portkey.aws.ecr/image-action-type #{"EXPIRE" :expire})

(clojure.spec.alpha/def :portkey.aws.ecr/batched-operation-layer-digest (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 0 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.ecr.repository-policy-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.ecr/exception-message))
(clojure.spec.alpha/def :portkey.aws.ecr/repository-policy-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.repository-policy-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ecr/tag-status #{:untagged "TAGGED" "UNTAGGED" :tagged})

(clojure.spec.alpha/def :portkey.aws.ecr.lifecycle-policy-preview-in-progress-exception/message (clojure.spec.alpha/and :portkey.aws.ecr/exception-message))
(clojure.spec.alpha/def :portkey.aws.ecr/lifecycle-policy-preview-in-progress-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.lifecycle-policy-preview-in-progress-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ecr/lifecycle-policy-rule-priority (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.ecr.repository/repository-arn (clojure.spec.alpha/and :portkey.aws.ecr/arn))
(clojure.spec.alpha/def :portkey.aws.ecr.repository/registry-id (clojure.spec.alpha/and :portkey.aws.ecr/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.repository/repository-name (clojure.spec.alpha/and :portkey.aws.ecr/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.repository/repository-uri (clojure.spec.alpha/and :portkey.aws.ecr/url))
(clojure.spec.alpha/def :portkey.aws.ecr.repository/created-at (clojure.spec.alpha/and :portkey.aws.ecr/creation-timestamp))
(clojure.spec.alpha/def :portkey.aws.ecr/repository (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.repository/repository-arn :portkey.aws.ecr.repository/registry-id :portkey.aws.ecr.repository/repository-name :portkey.aws.ecr.repository/repository-uri :portkey.aws.ecr.repository/created-at]))

(clojure.spec.alpha/def :portkey.aws.ecr.complete-layer-upload-request/registry-id (clojure.spec.alpha/and :portkey.aws.ecr/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.complete-layer-upload-request/repository-name (clojure.spec.alpha/and :portkey.aws.ecr/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.complete-layer-upload-request/upload-id (clojure.spec.alpha/and :portkey.aws.ecr/upload-id))
(clojure.spec.alpha/def :portkey.aws.ecr.complete-layer-upload-request/layer-digests (clojure.spec.alpha/and :portkey.aws.ecr/layer-digest-list))
(clojure.spec.alpha/def :portkey.aws.ecr/complete-layer-upload-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecr.complete-layer-upload-request/repository-name :portkey.aws.ecr.complete-layer-upload-request/upload-id :portkey.aws.ecr.complete-layer-upload-request/layer-digests] :opt-un [:portkey.aws.ecr.complete-layer-upload-request/registry-id]))

(clojure.spec.alpha/def :portkey.aws.ecr.batch-check-layer-availability-request/registry-id (clojure.spec.alpha/and :portkey.aws.ecr/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.batch-check-layer-availability-request/repository-name (clojure.spec.alpha/and :portkey.aws.ecr/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.batch-check-layer-availability-request/layer-digests (clojure.spec.alpha/and :portkey.aws.ecr/batched-operation-layer-digest-list))
(clojure.spec.alpha/def :portkey.aws.ecr/batch-check-layer-availability-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecr.batch-check-layer-availability-request/repository-name :portkey.aws.ecr.batch-check-layer-availability-request/layer-digests] :opt-un [:portkey.aws.ecr.batch-check-layer-availability-request/registry-id]))

(clojure.spec.alpha/def :portkey.aws.ecr.delete-repository-response/repository (clojure.spec.alpha/and :portkey.aws.ecr/repository))
(clojure.spec.alpha/def :portkey.aws.ecr/delete-repository-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.delete-repository-response/repository]))

(clojure.spec.alpha/def :portkey.aws.ecr.layer-failure/layer-digest (clojure.spec.alpha/and :portkey.aws.ecr/batched-operation-layer-digest))
(clojure.spec.alpha/def :portkey.aws.ecr.layer-failure/failure-code (clojure.spec.alpha/and :portkey.aws.ecr/layer-failure-code))
(clojure.spec.alpha/def :portkey.aws.ecr.layer-failure/failure-reason (clojure.spec.alpha/and :portkey.aws.ecr/layer-failure-reason))
(clojure.spec.alpha/def :portkey.aws.ecr/layer-failure (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.layer-failure/layer-digest :portkey.aws.ecr.layer-failure/failure-code :portkey.aws.ecr.layer-failure/failure-reason]))

(clojure.spec.alpha/def :portkey.aws.ecr.list-images-request/registry-id (clojure.spec.alpha/and :portkey.aws.ecr/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.list-images-request/repository-name (clojure.spec.alpha/and :portkey.aws.ecr/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.list-images-request/next-token (clojure.spec.alpha/and :portkey.aws.ecr/next-token))
(clojure.spec.alpha/def :portkey.aws.ecr.list-images-request/max-results (clojure.spec.alpha/and :portkey.aws.ecr/max-results))
(clojure.spec.alpha/def :portkey.aws.ecr.list-images-request/filter (clojure.spec.alpha/and :portkey.aws.ecr/list-images-filter))
(clojure.spec.alpha/def :portkey.aws.ecr/list-images-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecr.list-images-request/repository-name] :opt-un [:portkey.aws.ecr.list-images-request/registry-id :portkey.aws.ecr.list-images-request/next-token :portkey.aws.ecr.list-images-request/max-results :portkey.aws.ecr.list-images-request/filter]))

(clojure.spec.alpha/def :portkey.aws.ecr/repository-policy-text (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 0 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 10240))))

(clojure.spec.alpha/def :portkey.aws.ecr.delete-lifecycle-policy-response/registry-id (clojure.spec.alpha/and :portkey.aws.ecr/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.delete-lifecycle-policy-response/repository-name (clojure.spec.alpha/and :portkey.aws.ecr/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.delete-lifecycle-policy-response/lifecycle-policy-text (clojure.spec.alpha/and :portkey.aws.ecr/lifecycle-policy-text))
(clojure.spec.alpha/def :portkey.aws.ecr.delete-lifecycle-policy-response/last-evaluated-at (clojure.spec.alpha/and :portkey.aws.ecr/evaluation-timestamp))
(clojure.spec.alpha/def :portkey.aws.ecr/delete-lifecycle-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.delete-lifecycle-policy-response/registry-id :portkey.aws.ecr.delete-lifecycle-policy-response/repository-name :portkey.aws.ecr.delete-lifecycle-policy-response/lifecycle-policy-text :portkey.aws.ecr.delete-lifecycle-policy-response/last-evaluated-at]))

(clojure.spec.alpha/def :portkey.aws.ecr.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.ecr/exception-message))
(clojure.spec.alpha/def :portkey.aws.ecr/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ecr/authorization-data-list (clojure.spec.alpha/coll-of :portkey.aws.ecr/authorization-data))

(clojure.spec.alpha/def :portkey.aws.ecr/base-64 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"^\S+$" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.ecr.create-repository-response/repository (clojure.spec.alpha/and :portkey.aws.ecr/repository))
(clojure.spec.alpha/def :portkey.aws.ecr/create-repository-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.create-repository-response/repository]))

(clojure.spec.alpha/def :portkey.aws.ecr.describe-images-response/image-details (clojure.spec.alpha/and :portkey.aws.ecr/image-detail-list))
(clojure.spec.alpha/def :portkey.aws.ecr.describe-images-response/next-token (clojure.spec.alpha/and :portkey.aws.ecr/next-token))
(clojure.spec.alpha/def :portkey.aws.ecr/describe-images-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.describe-images-response/image-details :portkey.aws.ecr.describe-images-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.ecr.get-lifecycle-policy-request/registry-id (clojure.spec.alpha/and :portkey.aws.ecr/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.get-lifecycle-policy-request/repository-name (clojure.spec.alpha/and :portkey.aws.ecr/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr/get-lifecycle-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecr.get-lifecycle-policy-request/repository-name] :opt-un [:portkey.aws.ecr.get-lifecycle-policy-request/registry-id]))

(clojure.spec.alpha/def :portkey.aws.ecr.get-authorization-token-response/authorization-data (clojure.spec.alpha/and :portkey.aws.ecr/authorization-data-list))
(clojure.spec.alpha/def :portkey.aws.ecr/get-authorization-token-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.get-authorization-token-response/authorization-data]))

(clojure.spec.alpha/def :portkey.aws.ecr.lifecycle-policy-preview-filter/tag-status (clojure.spec.alpha/and :portkey.aws.ecr/tag-status))
(clojure.spec.alpha/def :portkey.aws.ecr/lifecycle-policy-preview-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.lifecycle-policy-preview-filter/tag-status]))

(clojure.spec.alpha/def :portkey.aws.ecr.initiate-layer-upload-response/upload-id (clojure.spec.alpha/and :portkey.aws.ecr/upload-id))
(clojure.spec.alpha/def :portkey.aws.ecr.initiate-layer-upload-response/part-size (clojure.spec.alpha/and :portkey.aws.ecr/part-size))
(clojure.spec.alpha/def :portkey.aws.ecr/initiate-layer-upload-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.initiate-layer-upload-response/upload-id :portkey.aws.ecr.initiate-layer-upload-response/part-size]))

(clojure.spec.alpha/def :portkey.aws.ecr/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ecr/layer-availability #{:unavailable "AVAILABLE" "UNAVAILABLE" :available})

(clojure.spec.alpha/def :portkey.aws.ecr/image-list (clojure.spec.alpha/coll-of :portkey.aws.ecr/image))

(clojure.spec.alpha/def :portkey.aws.ecr.layers-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.ecr/exception-message))
(clojure.spec.alpha/def :portkey.aws.ecr/layers-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.layers-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ecr.delete-repository-policy-response/registry-id (clojure.spec.alpha/and :portkey.aws.ecr/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.delete-repository-policy-response/repository-name (clojure.spec.alpha/and :portkey.aws.ecr/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.delete-repository-policy-response/policy-text (clojure.spec.alpha/and :portkey.aws.ecr/repository-policy-text))
(clojure.spec.alpha/def :portkey.aws.ecr/delete-repository-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.delete-repository-policy-response/registry-id :portkey.aws.ecr.delete-repository-policy-response/repository-name :portkey.aws.ecr.delete-repository-policy-response/policy-text]))

(clojure.spec.alpha/def :portkey.aws.ecr/lifecycle-policy-preview-result-list (clojure.spec.alpha/coll-of :portkey.aws.ecr/lifecycle-policy-preview-result))

(clojure.spec.alpha/def :portkey.aws.ecr/batched-operation-layer-digest-list (clojure.spec.alpha/coll-of :portkey.aws.ecr/batched-operation-layer-digest :min-count 1 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.ecr/part-size clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.ecr/force-flag clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.ecr.get-repository-policy-response/registry-id (clojure.spec.alpha/and :portkey.aws.ecr/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.get-repository-policy-response/repository-name (clojure.spec.alpha/and :portkey.aws.ecr/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.get-repository-policy-response/policy-text (clojure.spec.alpha/and :portkey.aws.ecr/repository-policy-text))
(clojure.spec.alpha/def :portkey.aws.ecr/get-repository-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.get-repository-policy-response/registry-id :portkey.aws.ecr.get-repository-policy-response/repository-name :portkey.aws.ecr.get-repository-policy-response/policy-text]))

(clojure.spec.alpha/def :portkey.aws.ecr/image-tag (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ecr.layer/layer-digest (clojure.spec.alpha/and :portkey.aws.ecr/layer-digest))
(clojure.spec.alpha/def :portkey.aws.ecr.layer/layer-availability (clojure.spec.alpha/and :portkey.aws.ecr/layer-availability))
(clojure.spec.alpha/def :portkey.aws.ecr.layer/layer-size (clojure.spec.alpha/and :portkey.aws.ecr/layer-size-in-bytes))
(clojure.spec.alpha/def :portkey.aws.ecr.layer/media-type (clojure.spec.alpha/and :portkey.aws.ecr/media-type))
(clojure.spec.alpha/def :portkey.aws.ecr/layer (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.layer/layer-digest :portkey.aws.ecr.layer/layer-availability :portkey.aws.ecr.layer/layer-size :portkey.aws.ecr.layer/media-type]))

(clojure.spec.alpha/def :portkey.aws.ecr/layer-size-in-bytes clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.ecr.delete-lifecycle-policy-request/registry-id (clojure.spec.alpha/and :portkey.aws.ecr/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.delete-lifecycle-policy-request/repository-name (clojure.spec.alpha/and :portkey.aws.ecr/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr/delete-lifecycle-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecr.delete-lifecycle-policy-request/repository-name] :opt-un [:portkey.aws.ecr.delete-lifecycle-policy-request/registry-id]))

(clojure.spec.alpha/def :portkey.aws.ecr.upload-layer-part-request/registry-id (clojure.spec.alpha/and :portkey.aws.ecr/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.upload-layer-part-request/repository-name (clojure.spec.alpha/and :portkey.aws.ecr/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.upload-layer-part-request/upload-id (clojure.spec.alpha/and :portkey.aws.ecr/upload-id))
(clojure.spec.alpha/def :portkey.aws.ecr.upload-layer-part-request/part-first-byte (clojure.spec.alpha/and :portkey.aws.ecr/part-size))
(clojure.spec.alpha/def :portkey.aws.ecr.upload-layer-part-request/part-last-byte (clojure.spec.alpha/and :portkey.aws.ecr/part-size))
(clojure.spec.alpha/def :portkey.aws.ecr.upload-layer-part-request/layer-part-blob (clojure.spec.alpha/and :portkey.aws.ecr/layer-part-blob))
(clojure.spec.alpha/def :portkey.aws.ecr/upload-layer-part-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecr.upload-layer-part-request/repository-name :portkey.aws.ecr.upload-layer-part-request/upload-id :portkey.aws.ecr.upload-layer-part-request/part-first-byte :portkey.aws.ecr.upload-layer-part-request/part-last-byte :portkey.aws.ecr.upload-layer-part-request/layer-part-blob] :opt-un [:portkey.aws.ecr.upload-layer-part-request/registry-id]))

(clojure.spec.alpha/def :portkey.aws.ecr.put-lifecycle-policy-response/registry-id (clojure.spec.alpha/and :portkey.aws.ecr/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.put-lifecycle-policy-response/repository-name (clojure.spec.alpha/and :portkey.aws.ecr/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.put-lifecycle-policy-response/lifecycle-policy-text (clojure.spec.alpha/and :portkey.aws.ecr/lifecycle-policy-text))
(clojure.spec.alpha/def :portkey.aws.ecr/put-lifecycle-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.put-lifecycle-policy-response/registry-id :portkey.aws.ecr.put-lifecycle-policy-response/repository-name :portkey.aws.ecr.put-lifecycle-policy-response/lifecycle-policy-text]))

(clojure.spec.alpha/def :portkey.aws.ecr.image-identifier/image-digest (clojure.spec.alpha/and :portkey.aws.ecr/image-digest))
(clojure.spec.alpha/def :portkey.aws.ecr.image-identifier/image-tag (clojure.spec.alpha/and :portkey.aws.ecr/image-tag))
(clojure.spec.alpha/def :portkey.aws.ecr/image-identifier (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.image-identifier/image-digest :portkey.aws.ecr.image-identifier/image-tag]))

(clojure.spec.alpha/def :portkey.aws.ecr/image-size-in-bytes clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.ecr/url (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ecr.get-lifecycle-policy-preview-request/registry-id (clojure.spec.alpha/and :portkey.aws.ecr/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.get-lifecycle-policy-preview-request/repository-name (clojure.spec.alpha/and :portkey.aws.ecr/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.get-lifecycle-policy-preview-request/image-ids (clojure.spec.alpha/and :portkey.aws.ecr/image-identifier-list))
(clojure.spec.alpha/def :portkey.aws.ecr.get-lifecycle-policy-preview-request/next-token (clojure.spec.alpha/and :portkey.aws.ecr/next-token))
(clojure.spec.alpha/def :portkey.aws.ecr.get-lifecycle-policy-preview-request/max-results (clojure.spec.alpha/and :portkey.aws.ecr/max-results))
(clojure.spec.alpha/def :portkey.aws.ecr.get-lifecycle-policy-preview-request/filter (clojure.spec.alpha/and :portkey.aws.ecr/lifecycle-policy-preview-filter))
(clojure.spec.alpha/def :portkey.aws.ecr/get-lifecycle-policy-preview-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecr.get-lifecycle-policy-preview-request/repository-name] :opt-un [:portkey.aws.ecr.get-lifecycle-policy-preview-request/registry-id :portkey.aws.ecr.get-lifecycle-policy-preview-request/image-ids :portkey.aws.ecr.get-lifecycle-policy-preview-request/next-token :portkey.aws.ecr.get-lifecycle-policy-preview-request/max-results :portkey.aws.ecr.get-lifecycle-policy-preview-request/filter]))

(clojure.spec.alpha/def :portkey.aws.ecr/layer-failure-code #{"MissingLayerDigest" "InvalidLayerDigest" :invalid-layer-digest :missing-layer-digest})

(clojure.spec.alpha/def :portkey.aws.ecr/creation-timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.ecr/exception-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ecr.describe-repositories-request/registry-id (clojure.spec.alpha/and :portkey.aws.ecr/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.describe-repositories-request/repository-names (clojure.spec.alpha/and :portkey.aws.ecr/repository-name-list))
(clojure.spec.alpha/def :portkey.aws.ecr.describe-repositories-request/next-token (clojure.spec.alpha/and :portkey.aws.ecr/next-token))
(clojure.spec.alpha/def :portkey.aws.ecr.describe-repositories-request/max-results (clojure.spec.alpha/and :portkey.aws.ecr/max-results))
(clojure.spec.alpha/def :portkey.aws.ecr/describe-repositories-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.describe-repositories-request/registry-id :portkey.aws.ecr.describe-repositories-request/repository-names :portkey.aws.ecr.describe-repositories-request/next-token :portkey.aws.ecr.describe-repositories-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.ecr.layer-part-too-small-exception/message (clojure.spec.alpha/and :portkey.aws.ecr/exception-message))
(clojure.spec.alpha/def :portkey.aws.ecr/layer-part-too-small-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.layer-part-too-small-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ecr.put-lifecycle-policy-request/registry-id (clojure.spec.alpha/and :portkey.aws.ecr/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.put-lifecycle-policy-request/repository-name (clojure.spec.alpha/and :portkey.aws.ecr/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.put-lifecycle-policy-request/lifecycle-policy-text (clojure.spec.alpha/and :portkey.aws.ecr/lifecycle-policy-text))
(clojure.spec.alpha/def :portkey.aws.ecr/put-lifecycle-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecr.put-lifecycle-policy-request/repository-name :portkey.aws.ecr.put-lifecycle-policy-request/lifecycle-policy-text] :opt-un [:portkey.aws.ecr.put-lifecycle-policy-request/registry-id]))

(clojure.spec.alpha/def :portkey.aws.ecr.start-lifecycle-policy-preview-response/registry-id (clojure.spec.alpha/and :portkey.aws.ecr/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.start-lifecycle-policy-preview-response/repository-name (clojure.spec.alpha/and :portkey.aws.ecr/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.start-lifecycle-policy-preview-response/lifecycle-policy-text (clojure.spec.alpha/and :portkey.aws.ecr/lifecycle-policy-text))
(clojure.spec.alpha/def :portkey.aws.ecr.start-lifecycle-policy-preview-response/status (clojure.spec.alpha/and :portkey.aws.ecr/lifecycle-policy-preview-status))
(clojure.spec.alpha/def :portkey.aws.ecr/start-lifecycle-policy-preview-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.start-lifecycle-policy-preview-response/registry-id :portkey.aws.ecr.start-lifecycle-policy-preview-response/repository-name :portkey.aws.ecr.start-lifecycle-policy-preview-response/lifecycle-policy-text :portkey.aws.ecr.start-lifecycle-policy-preview-response/status]))

(clojure.spec.alpha/def :portkey.aws.ecr.lifecycle-policy-preview-summary/expiring-image-total-count (clojure.spec.alpha/and :portkey.aws.ecr/image-count))
(clojure.spec.alpha/def :portkey.aws.ecr/lifecycle-policy-preview-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.lifecycle-policy-preview-summary/expiring-image-total-count]))

(clojure.spec.alpha/def :portkey.aws.ecr.complete-layer-upload-response/registry-id (clojure.spec.alpha/and :portkey.aws.ecr/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.complete-layer-upload-response/repository-name (clojure.spec.alpha/and :portkey.aws.ecr/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.complete-layer-upload-response/upload-id (clojure.spec.alpha/and :portkey.aws.ecr/upload-id))
(clojure.spec.alpha/def :portkey.aws.ecr.complete-layer-upload-response/layer-digest (clojure.spec.alpha/and :portkey.aws.ecr/layer-digest))
(clojure.spec.alpha/def :portkey.aws.ecr/complete-layer-upload-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.complete-layer-upload-response/registry-id :portkey.aws.ecr.complete-layer-upload-response/repository-name :portkey.aws.ecr.complete-layer-upload-response/upload-id :portkey.aws.ecr.complete-layer-upload-response/layer-digest]))

(clojure.spec.alpha/def :portkey.aws.ecr.batch-delete-image-request/registry-id (clojure.spec.alpha/and :portkey.aws.ecr/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.batch-delete-image-request/repository-name (clojure.spec.alpha/and :portkey.aws.ecr/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.batch-delete-image-request/image-ids (clojure.spec.alpha/and :portkey.aws.ecr/image-identifier-list))
(clojure.spec.alpha/def :portkey.aws.ecr/batch-delete-image-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecr.batch-delete-image-request/repository-name :portkey.aws.ecr.batch-delete-image-request/image-ids] :opt-un [:portkey.aws.ecr.batch-delete-image-request/registry-id]))

(clojure.spec.alpha/def :portkey.aws.ecr/expiration-timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.ecr.invalid-layer-exception/message (clojure.spec.alpha/and :portkey.aws.ecr/exception-message))
(clojure.spec.alpha/def :portkey.aws.ecr/invalid-layer-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.invalid-layer-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ecr.start-lifecycle-policy-preview-request/registry-id (clojure.spec.alpha/and :portkey.aws.ecr/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.start-lifecycle-policy-preview-request/repository-name (clojure.spec.alpha/and :portkey.aws.ecr/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.start-lifecycle-policy-preview-request/lifecycle-policy-text (clojure.spec.alpha/and :portkey.aws.ecr/lifecycle-policy-text))
(clojure.spec.alpha/def :portkey.aws.ecr/start-lifecycle-policy-preview-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecr.start-lifecycle-policy-preview-request/repository-name] :opt-un [:portkey.aws.ecr.start-lifecycle-policy-preview-request/registry-id :portkey.aws.ecr.start-lifecycle-policy-preview-request/lifecycle-policy-text]))

(clojure.spec.alpha/def :portkey.aws.ecr.describe-images-request/registry-id (clojure.spec.alpha/and :portkey.aws.ecr/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.describe-images-request/repository-name (clojure.spec.alpha/and :portkey.aws.ecr/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.describe-images-request/image-ids (clojure.spec.alpha/and :portkey.aws.ecr/image-identifier-list))
(clojure.spec.alpha/def :portkey.aws.ecr.describe-images-request/next-token (clojure.spec.alpha/and :portkey.aws.ecr/next-token))
(clojure.spec.alpha/def :portkey.aws.ecr.describe-images-request/max-results (clojure.spec.alpha/and :portkey.aws.ecr/max-results))
(clojure.spec.alpha/def :portkey.aws.ecr.describe-images-request/filter (clojure.spec.alpha/and :portkey.aws.ecr/describe-images-filter))
(clojure.spec.alpha/def :portkey.aws.ecr/describe-images-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecr.describe-images-request/repository-name] :opt-un [:portkey.aws.ecr.describe-images-request/registry-id :portkey.aws.ecr.describe-images-request/image-ids :portkey.aws.ecr.describe-images-request/next-token :portkey.aws.ecr.describe-images-request/max-results :portkey.aws.ecr.describe-images-request/filter]))

(clojure.spec.alpha/def :portkey.aws.ecr/layer-list (clojure.spec.alpha/coll-of :portkey.aws.ecr/layer))

(clojure.spec.alpha/def :portkey.aws.ecr.repository-not-empty-exception/message (clojure.spec.alpha/and :portkey.aws.ecr/exception-message))
(clojure.spec.alpha/def :portkey.aws.ecr/repository-not-empty-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.repository-not-empty-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ecr.batch-get-image-request/registry-id (clojure.spec.alpha/and :portkey.aws.ecr/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.batch-get-image-request/repository-name (clojure.spec.alpha/and :portkey.aws.ecr/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.batch-get-image-request/image-ids (clojure.spec.alpha/and :portkey.aws.ecr/image-identifier-list))
(clojure.spec.alpha/def :portkey.aws.ecr.batch-get-image-request/accepted-media-types (clojure.spec.alpha/and :portkey.aws.ecr/media-type-list))
(clojure.spec.alpha/def :portkey.aws.ecr/batch-get-image-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecr.batch-get-image-request/repository-name :portkey.aws.ecr.batch-get-image-request/image-ids] :opt-un [:portkey.aws.ecr.batch-get-image-request/registry-id :portkey.aws.ecr.batch-get-image-request/accepted-media-types]))

(clojure.spec.alpha/def :portkey.aws.ecr/image-failure-reason (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ecr.server-exception/message (clojure.spec.alpha/and :portkey.aws.ecr/exception-message))
(clojure.spec.alpha/def :portkey.aws.ecr/server-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.server-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ecr/get-authorization-token-registry-id-list (clojure.spec.alpha/coll-of :portkey.aws.ecr/registry-id :min-count 1 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.ecr.batch-check-layer-availability-response/layers (clojure.spec.alpha/and :portkey.aws.ecr/layer-list))
(clojure.spec.alpha/def :portkey.aws.ecr.batch-check-layer-availability-response/failures (clojure.spec.alpha/and :portkey.aws.ecr/layer-failure-list))
(clojure.spec.alpha/def :portkey.aws.ecr/batch-check-layer-availability-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.batch-check-layer-availability-response/layers :portkey.aws.ecr.batch-check-layer-availability-response/failures]))

(clojure.spec.alpha/def :portkey.aws.ecr.image-detail/registry-id (clojure.spec.alpha/and :portkey.aws.ecr/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.image-detail/repository-name (clojure.spec.alpha/and :portkey.aws.ecr/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.image-detail/image-digest (clojure.spec.alpha/and :portkey.aws.ecr/image-digest))
(clojure.spec.alpha/def :portkey.aws.ecr.image-detail/image-tags (clojure.spec.alpha/and :portkey.aws.ecr/image-tag-list))
(clojure.spec.alpha/def :portkey.aws.ecr.image-detail/image-size-in-bytes (clojure.spec.alpha/and :portkey.aws.ecr/image-size-in-bytes))
(clojure.spec.alpha/def :portkey.aws.ecr.image-detail/image-pushed-at (clojure.spec.alpha/and :portkey.aws.ecr/push-timestamp))
(clojure.spec.alpha/def :portkey.aws.ecr/image-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.image-detail/registry-id :portkey.aws.ecr.image-detail/repository-name :portkey.aws.ecr.image-detail/image-digest :portkey.aws.ecr.image-detail/image-tags :portkey.aws.ecr.image-detail/image-size-in-bytes :portkey.aws.ecr.image-detail/image-pushed-at]))

(clojure.spec.alpha/def :portkey.aws.ecr.get-repository-policy-request/registry-id (clojure.spec.alpha/and :portkey.aws.ecr/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.get-repository-policy-request/repository-name (clojure.spec.alpha/and :portkey.aws.ecr/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr/get-repository-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecr.get-repository-policy-request/repository-name] :opt-un [:portkey.aws.ecr.get-repository-policy-request/registry-id]))

(clojure.spec.alpha/def :portkey.aws.ecr/layer-digest-list (clojure.spec.alpha/coll-of :portkey.aws.ecr/layer-digest :min-count 1 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.ecr.get-lifecycle-policy-response/registry-id (clojure.spec.alpha/and :portkey.aws.ecr/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.get-lifecycle-policy-response/repository-name (clojure.spec.alpha/and :portkey.aws.ecr/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.get-lifecycle-policy-response/lifecycle-policy-text (clojure.spec.alpha/and :portkey.aws.ecr/lifecycle-policy-text))
(clojure.spec.alpha/def :portkey.aws.ecr.get-lifecycle-policy-response/last-evaluated-at (clojure.spec.alpha/and :portkey.aws.ecr/evaluation-timestamp))
(clojure.spec.alpha/def :portkey.aws.ecr/get-lifecycle-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.get-lifecycle-policy-response/registry-id :portkey.aws.ecr.get-lifecycle-policy-response/repository-name :portkey.aws.ecr.get-lifecycle-policy-response/lifecycle-policy-text :portkey.aws.ecr.get-lifecycle-policy-response/last-evaluated-at]))

(clojure.spec.alpha/def :portkey.aws.ecr/registry-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"[0-9]{12}" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.ecr.image-failure/image-id (clojure.spec.alpha/and :portkey.aws.ecr/image-identifier))
(clojure.spec.alpha/def :portkey.aws.ecr.image-failure/failure-code (clojure.spec.alpha/and :portkey.aws.ecr/image-failure-code))
(clojure.spec.alpha/def :portkey.aws.ecr.image-failure/failure-reason (clojure.spec.alpha/and :portkey.aws.ecr/image-failure-reason))
(clojure.spec.alpha/def :portkey.aws.ecr/image-failure (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.image-failure/image-id :portkey.aws.ecr.image-failure/failure-code :portkey.aws.ecr.image-failure/failure-reason]))

(clojure.spec.alpha/def :portkey.aws.ecr/arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ecr.invalid-layer-part-exception/registry-id (clojure.spec.alpha/and :portkey.aws.ecr/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.invalid-layer-part-exception/repository-name (clojure.spec.alpha/and :portkey.aws.ecr/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.invalid-layer-part-exception/upload-id (clojure.spec.alpha/and :portkey.aws.ecr/upload-id))
(clojure.spec.alpha/def :portkey.aws.ecr.invalid-layer-part-exception/last-valid-byte-received (clojure.spec.alpha/and :portkey.aws.ecr/part-size))
(clojure.spec.alpha/def :portkey.aws.ecr.invalid-layer-part-exception/message (clojure.spec.alpha/and :portkey.aws.ecr/exception-message))
(clojure.spec.alpha/def :portkey.aws.ecr/invalid-layer-part-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.invalid-layer-part-exception/registry-id :portkey.aws.ecr.invalid-layer-part-exception/repository-name :portkey.aws.ecr.invalid-layer-part-exception/upload-id :portkey.aws.ecr.invalid-layer-part-exception/last-valid-byte-received :portkey.aws.ecr.invalid-layer-part-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ecr.delete-repository-policy-request/registry-id (clojure.spec.alpha/and :portkey.aws.ecr/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.delete-repository-policy-request/repository-name (clojure.spec.alpha/and :portkey.aws.ecr/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr/delete-repository-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecr.delete-repository-policy-request/repository-name] :opt-un [:portkey.aws.ecr.delete-repository-policy-request/registry-id]))

(clojure.spec.alpha/def :portkey.aws.ecr/layer-digest (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"[a-zA-Z0-9-_+.]+:[a-fA-F0-9]+" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.ecr.create-repository-request/repository-name (clojure.spec.alpha/and :portkey.aws.ecr/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr/create-repository-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecr.create-repository-request/repository-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ecr.image-already-exists-exception/message (clojure.spec.alpha/and :portkey.aws.ecr/exception-message))
(clojure.spec.alpha/def :portkey.aws.ecr/image-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.image-already-exists-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ecr.batch-delete-image-response/image-ids (clojure.spec.alpha/and :portkey.aws.ecr/image-identifier-list))
(clojure.spec.alpha/def :portkey.aws.ecr.batch-delete-image-response/failures (clojure.spec.alpha/and :portkey.aws.ecr/image-failure-list))
(clojure.spec.alpha/def :portkey.aws.ecr/batch-delete-image-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.batch-delete-image-response/image-ids :portkey.aws.ecr.batch-delete-image-response/failures]))

(clojure.spec.alpha/def :portkey.aws.ecr.describe-repositories-response/repositories (clojure.spec.alpha/and :portkey.aws.ecr/repository-list))
(clojure.spec.alpha/def :portkey.aws.ecr.describe-repositories-response/next-token (clojure.spec.alpha/and :portkey.aws.ecr/next-token))
(clojure.spec.alpha/def :portkey.aws.ecr/describe-repositories-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.describe-repositories-response/repositories :portkey.aws.ecr.describe-repositories-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.ecr/upload-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.ecr.repository-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.ecr/exception-message))
(clojure.spec.alpha/def :portkey.aws.ecr/repository-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.repository-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ecr.authorization-data/authorization-token (clojure.spec.alpha/and :portkey.aws.ecr/base-64))
(clojure.spec.alpha/def :portkey.aws.ecr.authorization-data/expires-at (clojure.spec.alpha/and :portkey.aws.ecr/expiration-timestamp))
(clojure.spec.alpha/def :portkey.aws.ecr.authorization-data/proxy-endpoint (clojure.spec.alpha/and :portkey.aws.ecr/proxy-endpoint))
(clojure.spec.alpha/def :portkey.aws.ecr/authorization-data (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.authorization-data/authorization-token :portkey.aws.ecr.authorization-data/expires-at :portkey.aws.ecr.authorization-data/proxy-endpoint]))

(clojure.spec.alpha/def :portkey.aws.ecr.upload-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.ecr/exception-message))
(clojure.spec.alpha/def :portkey.aws.ecr/upload-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.upload-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ecr/image-manifest (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ecr.lifecycle-policy-preview-result/image-tags (clojure.spec.alpha/and :portkey.aws.ecr/image-tag-list))
(clojure.spec.alpha/def :portkey.aws.ecr.lifecycle-policy-preview-result/image-digest (clojure.spec.alpha/and :portkey.aws.ecr/image-digest))
(clojure.spec.alpha/def :portkey.aws.ecr.lifecycle-policy-preview-result/image-pushed-at (clojure.spec.alpha/and :portkey.aws.ecr/push-timestamp))
(clojure.spec.alpha/def :portkey.aws.ecr.lifecycle-policy-preview-result/action (clojure.spec.alpha/and :portkey.aws.ecr/lifecycle-policy-rule-action))
(clojure.spec.alpha/def :portkey.aws.ecr.lifecycle-policy-preview-result/applied-rule-priority (clojure.spec.alpha/and :portkey.aws.ecr/lifecycle-policy-rule-priority))
(clojure.spec.alpha/def :portkey.aws.ecr/lifecycle-policy-preview-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.lifecycle-policy-preview-result/image-tags :portkey.aws.ecr.lifecycle-policy-preview-result/image-digest :portkey.aws.ecr.lifecycle-policy-preview-result/image-pushed-at :portkey.aws.ecr.lifecycle-policy-preview-result/action :portkey.aws.ecr.lifecycle-policy-preview-result/applied-rule-priority]))

(clojure.spec.alpha/def :portkey.aws.ecr.get-lifecycle-policy-preview-response/registry-id (clojure.spec.alpha/and :portkey.aws.ecr/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.get-lifecycle-policy-preview-response/repository-name (clojure.spec.alpha/and :portkey.aws.ecr/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.get-lifecycle-policy-preview-response/lifecycle-policy-text (clojure.spec.alpha/and :portkey.aws.ecr/lifecycle-policy-text))
(clojure.spec.alpha/def :portkey.aws.ecr.get-lifecycle-policy-preview-response/status (clojure.spec.alpha/and :portkey.aws.ecr/lifecycle-policy-preview-status))
(clojure.spec.alpha/def :portkey.aws.ecr.get-lifecycle-policy-preview-response/next-token (clojure.spec.alpha/and :portkey.aws.ecr/next-token))
(clojure.spec.alpha/def :portkey.aws.ecr.get-lifecycle-policy-preview-response/preview-results (clojure.spec.alpha/and :portkey.aws.ecr/lifecycle-policy-preview-result-list))
(clojure.spec.alpha/def :portkey.aws.ecr.get-lifecycle-policy-preview-response/summary (clojure.spec.alpha/and :portkey.aws.ecr/lifecycle-policy-preview-summary))
(clojure.spec.alpha/def :portkey.aws.ecr/get-lifecycle-policy-preview-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.get-lifecycle-policy-preview-response/registry-id :portkey.aws.ecr.get-lifecycle-policy-preview-response/repository-name :portkey.aws.ecr.get-lifecycle-policy-preview-response/lifecycle-policy-text :portkey.aws.ecr.get-lifecycle-policy-preview-response/status :portkey.aws.ecr.get-lifecycle-policy-preview-response/next-token :portkey.aws.ecr.get-lifecycle-policy-preview-response/preview-results :portkey.aws.ecr.get-lifecycle-policy-preview-response/summary]))

(clojure.spec.alpha/def :portkey.aws.ecr/max-results (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.ecr.initiate-layer-upload-request/registry-id (clojure.spec.alpha/and :portkey.aws.ecr/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.initiate-layer-upload-request/repository-name (clojure.spec.alpha/and :portkey.aws.ecr/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr/initiate-layer-upload-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecr.initiate-layer-upload-request/repository-name] :opt-un [:portkey.aws.ecr.initiate-layer-upload-request/registry-id]))

(clojure.spec.alpha/def :portkey.aws.ecr.list-images-filter/tag-status (clojure.spec.alpha/and :portkey.aws.ecr/tag-status))
(clojure.spec.alpha/def :portkey.aws.ecr/list-images-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.list-images-filter/tag-status]))

(clojure.spec.alpha/def :portkey.aws.ecr/image-detail-list (clojure.spec.alpha/coll-of :portkey.aws.ecr/image-detail))

(clojure.spec.alpha/def :portkey.aws.ecr/layer-failure-list (clojure.spec.alpha/coll-of :portkey.aws.ecr/layer-failure))

(clojure.spec.alpha/def :portkey.aws.ecr.set-repository-policy-request/registry-id (clojure.spec.alpha/and :portkey.aws.ecr/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.set-repository-policy-request/repository-name (clojure.spec.alpha/and :portkey.aws.ecr/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.set-repository-policy-request/policy-text (clojure.spec.alpha/and :portkey.aws.ecr/repository-policy-text))
(clojure.spec.alpha/def :portkey.aws.ecr.set-repository-policy-request/force (clojure.spec.alpha/and :portkey.aws.ecr/force-flag))
(clojure.spec.alpha/def :portkey.aws.ecr/set-repository-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecr.set-repository-policy-request/repository-name :portkey.aws.ecr.set-repository-policy-request/policy-text] :opt-un [:portkey.aws.ecr.set-repository-policy-request/registry-id :portkey.aws.ecr.set-repository-policy-request/force]))

(clojure.spec.alpha/def :portkey.aws.ecr.lifecycle-policy-preview-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.ecr/exception-message))
(clojure.spec.alpha/def :portkey.aws.ecr/lifecycle-policy-preview-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.lifecycle-policy-preview-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ecr/image-failure-code #{"ImageNotFound" "InvalidImageDigest" :invalid-image-digest :image-not-found "InvalidImageTag" "ImageTagDoesNotMatchDigest" "MissingDigestAndTag" :image-tag-does-not-match-digest :invalid-image-tag :missing-digest-and-tag})

(clojure.spec.alpha/def :portkey.aws.ecr.delete-repository-request/registry-id (clojure.spec.alpha/and :portkey.aws.ecr/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.delete-repository-request/repository-name (clojure.spec.alpha/and :portkey.aws.ecr/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.delete-repository-request/force (clojure.spec.alpha/and :portkey.aws.ecr/force-flag))
(clojure.spec.alpha/def :portkey.aws.ecr/delete-repository-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecr.delete-repository-request/repository-name] :opt-un [:portkey.aws.ecr.delete-repository-request/registry-id :portkey.aws.ecr.delete-repository-request/force]))

(clojure.spec.alpha/def :portkey.aws.ecr.image/registry-id (clojure.spec.alpha/and :portkey.aws.ecr/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.image/repository-name (clojure.spec.alpha/and :portkey.aws.ecr/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.image/image-id (clojure.spec.alpha/and :portkey.aws.ecr/image-identifier))
(clojure.spec.alpha/def :portkey.aws.ecr.image/image-manifest (clojure.spec.alpha/and :portkey.aws.ecr/image-manifest))
(clojure.spec.alpha/def :portkey.aws.ecr/image (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.image/registry-id :portkey.aws.ecr.image/repository-name :portkey.aws.ecr.image/image-id :portkey.aws.ecr.image/image-manifest]))

(clojure.spec.alpha/def :portkey.aws.ecr/image-identifier-list (clojure.spec.alpha/coll-of :portkey.aws.ecr/image-identifier :min-count 1 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.ecr.image-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.ecr/exception-message))
(clojure.spec.alpha/def :portkey.aws.ecr/image-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.image-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ecr.lifecycle-policy-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.ecr/exception-message))
(clojure.spec.alpha/def :portkey.aws.ecr/lifecycle-policy-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.lifecycle-policy-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ecr/lifecycle-policy-text (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 100 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 10240))))

(clojure.spec.alpha/def :portkey.aws.ecr.invalid-parameter-exception/message (clojure.spec.alpha/and :portkey.aws.ecr/exception-message))
(clojure.spec.alpha/def :portkey.aws.ecr/invalid-parameter-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.invalid-parameter-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ecr.upload-layer-part-response/registry-id (clojure.spec.alpha/and :portkey.aws.ecr/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.upload-layer-part-response/repository-name (clojure.spec.alpha/and :portkey.aws.ecr/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.upload-layer-part-response/upload-id (clojure.spec.alpha/and :portkey.aws.ecr/upload-id))
(clojure.spec.alpha/def :portkey.aws.ecr.upload-layer-part-response/last-byte-received (clojure.spec.alpha/and :portkey.aws.ecr/part-size))
(clojure.spec.alpha/def :portkey.aws.ecr/upload-layer-part-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.upload-layer-part-response/registry-id :portkey.aws.ecr.upload-layer-part-response/repository-name :portkey.aws.ecr.upload-layer-part-response/upload-id :portkey.aws.ecr.upload-layer-part-response/last-byte-received]))

(clojure.spec.alpha/def :portkey.aws.ecr/push-timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.ecr.empty-upload-exception/message (clojure.spec.alpha/and :portkey.aws.ecr/exception-message))
(clojure.spec.alpha/def :portkey.aws.ecr/empty-upload-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.empty-upload-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ecr/repository-name-list (clojure.spec.alpha/coll-of :portkey.aws.ecr/repository-name :min-count 1 :max-count 100))

(clojure.core/defn complete-layer-upload ([complete-layer-upload-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-complete-layer-upload-request complete-layer-upload-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.ecr/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr/complete-layer-upload-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.ecr/complete-layer-upload-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CompleteLayerUpload", :http.request.configuration/output-deser-fn deser-complete-layer-upload-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr/server-exception, "InvalidParameterException" :portkey.aws.ecr/invalid-parameter-exception, "RepositoryNotFoundException" :portkey.aws.ecr/repository-not-found-exception, "UploadNotFoundException" :portkey.aws.ecr/upload-not-found-exception, "InvalidLayerException" :portkey.aws.ecr/invalid-layer-exception, "LayerPartTooSmallException" :portkey.aws.ecr/layer-part-too-small-exception, "LayerAlreadyExistsException" :portkey.aws.ecr/layer-already-exists-exception, "EmptyUploadException" :portkey.aws.ecr/empty-upload-exception}})))))
(clojure.spec.alpha/fdef complete-layer-upload :args (clojure.spec.alpha/tuple :portkey.aws.ecr/complete-layer-upload-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr/complete-layer-upload-response))

(clojure.core/defn set-repository-policy ([set-repository-policy-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-set-repository-policy-request set-repository-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.ecr/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr/set-repository-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.ecr/set-repository-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SetRepositoryPolicy", :http.request.configuration/output-deser-fn deser-set-repository-policy-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr/server-exception, "InvalidParameterException" :portkey.aws.ecr/invalid-parameter-exception, "RepositoryNotFoundException" :portkey.aws.ecr/repository-not-found-exception}})))))
(clojure.spec.alpha/fdef set-repository-policy :args (clojure.spec.alpha/tuple :portkey.aws.ecr/set-repository-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr/set-repository-policy-response))

(clojure.core/defn put-image ([put-image-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-put-image-request put-image-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.ecr/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr/put-image-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.ecr/put-image-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutImage", :http.request.configuration/output-deser-fn deser-put-image-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr/server-exception, "InvalidParameterException" :portkey.aws.ecr/invalid-parameter-exception, "RepositoryNotFoundException" :portkey.aws.ecr/repository-not-found-exception, "ImageAlreadyExistsException" :portkey.aws.ecr/image-already-exists-exception, "LayersNotFoundException" :portkey.aws.ecr/layers-not-found-exception, "LimitExceededException" :portkey.aws.ecr/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef put-image :args (clojure.spec.alpha/tuple :portkey.aws.ecr/put-image-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr/put-image-response))

(clojure.core/defn describe-images ([describe-images-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-images-request describe-images-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.ecr/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr/describe-images-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.ecr/describe-images-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeImages", :http.request.configuration/output-deser-fn deser-describe-images-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr/server-exception, "InvalidParameterException" :portkey.aws.ecr/invalid-parameter-exception, "RepositoryNotFoundException" :portkey.aws.ecr/repository-not-found-exception, "ImageNotFoundException" :portkey.aws.ecr/image-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-images :args (clojure.spec.alpha/tuple :portkey.aws.ecr/describe-images-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr/describe-images-response))

(clojure.core/defn start-lifecycle-policy-preview ([start-lifecycle-policy-preview-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-start-lifecycle-policy-preview-request start-lifecycle-policy-preview-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.ecr/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr/start-lifecycle-policy-preview-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.ecr/start-lifecycle-policy-preview-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartLifecyclePolicyPreview", :http.request.configuration/output-deser-fn deser-start-lifecycle-policy-preview-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr/server-exception, "InvalidParameterException" :portkey.aws.ecr/invalid-parameter-exception, "RepositoryNotFoundException" :portkey.aws.ecr/repository-not-found-exception, "LifecyclePolicyNotFoundException" :portkey.aws.ecr/lifecycle-policy-not-found-exception, "LifecyclePolicyPreviewInProgressException" :portkey.aws.ecr/lifecycle-policy-preview-in-progress-exception}})))))
(clojure.spec.alpha/fdef start-lifecycle-policy-preview :args (clojure.spec.alpha/tuple :portkey.aws.ecr/start-lifecycle-policy-preview-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr/start-lifecycle-policy-preview-response))

(clojure.core/defn delete-lifecycle-policy ([delete-lifecycle-policy-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-lifecycle-policy-request delete-lifecycle-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.ecr/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr/delete-lifecycle-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.ecr/delete-lifecycle-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteLifecyclePolicy", :http.request.configuration/output-deser-fn deser-delete-lifecycle-policy-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr/server-exception, "InvalidParameterException" :portkey.aws.ecr/invalid-parameter-exception, "RepositoryNotFoundException" :portkey.aws.ecr/repository-not-found-exception, "LifecyclePolicyNotFoundException" :portkey.aws.ecr/lifecycle-policy-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-lifecycle-policy :args (clojure.spec.alpha/tuple :portkey.aws.ecr/delete-lifecycle-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr/delete-lifecycle-policy-response))

(clojure.core/defn describe-repositories ([] (describe-repositories {})) ([describe-repositories-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-repositories-request describe-repositories-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.ecr/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr/describe-repositories-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.ecr/describe-repositories-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeRepositories", :http.request.configuration/output-deser-fn deser-describe-repositories-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr/server-exception, "InvalidParameterException" :portkey.aws.ecr/invalid-parameter-exception, "RepositoryNotFoundException" :portkey.aws.ecr/repository-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-repositories :args (clojure.spec.alpha/? :portkey.aws.ecr/describe-repositories-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr/describe-repositories-response))

(clojure.core/defn batch-check-layer-availability ([batch-check-layer-availability-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-batch-check-layer-availability-request batch-check-layer-availability-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.ecr/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr/batch-check-layer-availability-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.ecr/batch-check-layer-availability-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "BatchCheckLayerAvailability", :http.request.configuration/output-deser-fn deser-batch-check-layer-availability-response, :http.request.spec/error-spec {"RepositoryNotFoundException" :portkey.aws.ecr/repository-not-found-exception, "InvalidParameterException" :portkey.aws.ecr/invalid-parameter-exception, "ServerException" :portkey.aws.ecr/server-exception}})))))
(clojure.spec.alpha/fdef batch-check-layer-availability :args (clojure.spec.alpha/tuple :portkey.aws.ecr/batch-check-layer-availability-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr/batch-check-layer-availability-response))

(clojure.core/defn put-lifecycle-policy ([put-lifecycle-policy-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-put-lifecycle-policy-request put-lifecycle-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.ecr/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr/put-lifecycle-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.ecr/put-lifecycle-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutLifecyclePolicy", :http.request.configuration/output-deser-fn deser-put-lifecycle-policy-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr/server-exception, "InvalidParameterException" :portkey.aws.ecr/invalid-parameter-exception, "RepositoryNotFoundException" :portkey.aws.ecr/repository-not-found-exception}})))))
(clojure.spec.alpha/fdef put-lifecycle-policy :args (clojure.spec.alpha/tuple :portkey.aws.ecr/put-lifecycle-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr/put-lifecycle-policy-response))

(clojure.core/defn batch-get-image ([batch-get-image-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-batch-get-image-request batch-get-image-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.ecr/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr/batch-get-image-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.ecr/batch-get-image-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "BatchGetImage", :http.request.configuration/output-deser-fn deser-batch-get-image-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr/server-exception, "InvalidParameterException" :portkey.aws.ecr/invalid-parameter-exception, "RepositoryNotFoundException" :portkey.aws.ecr/repository-not-found-exception}})))))
(clojure.spec.alpha/fdef batch-get-image :args (clojure.spec.alpha/tuple :portkey.aws.ecr/batch-get-image-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr/batch-get-image-response))

(clojure.core/defn get-lifecycle-policy ([get-lifecycle-policy-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-lifecycle-policy-request get-lifecycle-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.ecr/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr/get-lifecycle-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.ecr/get-lifecycle-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetLifecyclePolicy", :http.request.configuration/output-deser-fn deser-get-lifecycle-policy-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr/server-exception, "InvalidParameterException" :portkey.aws.ecr/invalid-parameter-exception, "RepositoryNotFoundException" :portkey.aws.ecr/repository-not-found-exception, "LifecyclePolicyNotFoundException" :portkey.aws.ecr/lifecycle-policy-not-found-exception}})))))
(clojure.spec.alpha/fdef get-lifecycle-policy :args (clojure.spec.alpha/tuple :portkey.aws.ecr/get-lifecycle-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr/get-lifecycle-policy-response))

(clojure.core/defn get-authorization-token ([] (get-authorization-token {})) ([get-authorization-token-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-authorization-token-request get-authorization-token-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.ecr/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr/get-authorization-token-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.ecr/get-authorization-token-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetAuthorizationToken", :http.request.configuration/output-deser-fn deser-get-authorization-token-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr/server-exception, "InvalidParameterException" :portkey.aws.ecr/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef get-authorization-token :args (clojure.spec.alpha/? :portkey.aws.ecr/get-authorization-token-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr/get-authorization-token-response))

(clojure.core/defn delete-repository ([delete-repository-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-repository-request delete-repository-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.ecr/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr/delete-repository-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.ecr/delete-repository-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteRepository", :http.request.configuration/output-deser-fn deser-delete-repository-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr/server-exception, "InvalidParameterException" :portkey.aws.ecr/invalid-parameter-exception, "RepositoryNotFoundException" :portkey.aws.ecr/repository-not-found-exception, "RepositoryNotEmptyException" :portkey.aws.ecr/repository-not-empty-exception}})))))
(clojure.spec.alpha/fdef delete-repository :args (clojure.spec.alpha/tuple :portkey.aws.ecr/delete-repository-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr/delete-repository-response))

(clojure.core/defn get-lifecycle-policy-preview ([get-lifecycle-policy-preview-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-lifecycle-policy-preview-request get-lifecycle-policy-preview-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.ecr/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr/get-lifecycle-policy-preview-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.ecr/get-lifecycle-policy-preview-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetLifecyclePolicyPreview", :http.request.configuration/output-deser-fn deser-get-lifecycle-policy-preview-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr/server-exception, "InvalidParameterException" :portkey.aws.ecr/invalid-parameter-exception, "RepositoryNotFoundException" :portkey.aws.ecr/repository-not-found-exception, "LifecyclePolicyPreviewNotFoundException" :portkey.aws.ecr/lifecycle-policy-preview-not-found-exception}})))))
(clojure.spec.alpha/fdef get-lifecycle-policy-preview :args (clojure.spec.alpha/tuple :portkey.aws.ecr/get-lifecycle-policy-preview-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr/get-lifecycle-policy-preview-response))

(clojure.core/defn get-download-url-for-layer ([get-download-url-for-layer-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-download-url-for-layer-request get-download-url-for-layer-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.ecr/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr/get-download-url-for-layer-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.ecr/get-download-url-for-layer-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetDownloadUrlForLayer", :http.request.configuration/output-deser-fn deser-get-download-url-for-layer-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr/server-exception, "InvalidParameterException" :portkey.aws.ecr/invalid-parameter-exception, "LayersNotFoundException" :portkey.aws.ecr/layers-not-found-exception, "LayerInaccessibleException" :portkey.aws.ecr/layer-inaccessible-exception, "RepositoryNotFoundException" :portkey.aws.ecr/repository-not-found-exception}})))))
(clojure.spec.alpha/fdef get-download-url-for-layer :args (clojure.spec.alpha/tuple :portkey.aws.ecr/get-download-url-for-layer-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr/get-download-url-for-layer-response))

(clojure.core/defn list-images ([list-images-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-images-request list-images-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.ecr/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr/list-images-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.ecr/list-images-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListImages", :http.request.configuration/output-deser-fn deser-list-images-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr/server-exception, "InvalidParameterException" :portkey.aws.ecr/invalid-parameter-exception, "RepositoryNotFoundException" :portkey.aws.ecr/repository-not-found-exception}})))))
(clojure.spec.alpha/fdef list-images :args (clojure.spec.alpha/tuple :portkey.aws.ecr/list-images-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr/list-images-response))

(clojure.core/defn upload-layer-part ([upload-layer-part-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-upload-layer-part-request upload-layer-part-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.ecr/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr/upload-layer-part-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.ecr/upload-layer-part-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UploadLayerPart", :http.request.configuration/output-deser-fn deser-upload-layer-part-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr/server-exception, "InvalidParameterException" :portkey.aws.ecr/invalid-parameter-exception, "InvalidLayerPartException" :portkey.aws.ecr/invalid-layer-part-exception, "RepositoryNotFoundException" :portkey.aws.ecr/repository-not-found-exception, "UploadNotFoundException" :portkey.aws.ecr/upload-not-found-exception, "LimitExceededException" :portkey.aws.ecr/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef upload-layer-part :args (clojure.spec.alpha/tuple :portkey.aws.ecr/upload-layer-part-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr/upload-layer-part-response))

(clojure.core/defn initiate-layer-upload ([initiate-layer-upload-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-initiate-layer-upload-request initiate-layer-upload-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.ecr/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr/initiate-layer-upload-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.ecr/initiate-layer-upload-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "InitiateLayerUpload", :http.request.configuration/output-deser-fn deser-initiate-layer-upload-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr/server-exception, "InvalidParameterException" :portkey.aws.ecr/invalid-parameter-exception, "RepositoryNotFoundException" :portkey.aws.ecr/repository-not-found-exception}})))))
(clojure.spec.alpha/fdef initiate-layer-upload :args (clojure.spec.alpha/tuple :portkey.aws.ecr/initiate-layer-upload-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr/initiate-layer-upload-response))

(clojure.core/defn get-repository-policy ([get-repository-policy-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-repository-policy-request get-repository-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.ecr/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr/get-repository-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.ecr/get-repository-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetRepositoryPolicy", :http.request.configuration/output-deser-fn deser-get-repository-policy-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr/server-exception, "InvalidParameterException" :portkey.aws.ecr/invalid-parameter-exception, "RepositoryNotFoundException" :portkey.aws.ecr/repository-not-found-exception, "RepositoryPolicyNotFoundException" :portkey.aws.ecr/repository-policy-not-found-exception}})))))
(clojure.spec.alpha/fdef get-repository-policy :args (clojure.spec.alpha/tuple :portkey.aws.ecr/get-repository-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr/get-repository-policy-response))

(clojure.core/defn delete-repository-policy ([delete-repository-policy-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-repository-policy-request delete-repository-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.ecr/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr/delete-repository-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.ecr/delete-repository-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteRepositoryPolicy", :http.request.configuration/output-deser-fn deser-delete-repository-policy-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr/server-exception, "InvalidParameterException" :portkey.aws.ecr/invalid-parameter-exception, "RepositoryNotFoundException" :portkey.aws.ecr/repository-not-found-exception, "RepositoryPolicyNotFoundException" :portkey.aws.ecr/repository-policy-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-repository-policy :args (clojure.spec.alpha/tuple :portkey.aws.ecr/delete-repository-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr/delete-repository-policy-response))

(clojure.core/defn batch-delete-image ([batch-delete-image-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-batch-delete-image-request batch-delete-image-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.ecr/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr/batch-delete-image-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.ecr/batch-delete-image-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "BatchDeleteImage", :http.request.configuration/output-deser-fn deser-batch-delete-image-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr/server-exception, "InvalidParameterException" :portkey.aws.ecr/invalid-parameter-exception, "RepositoryNotFoundException" :portkey.aws.ecr/repository-not-found-exception}})))))
(clojure.spec.alpha/fdef batch-delete-image :args (clojure.spec.alpha/tuple :portkey.aws.ecr/batch-delete-image-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr/batch-delete-image-response))

(clojure.core/defn create-repository ([create-repository-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-repository-request create-repository-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.ecr/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr/create-repository-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.ecr/create-repository-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateRepository", :http.request.configuration/output-deser-fn deser-create-repository-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr/server-exception, "InvalidParameterException" :portkey.aws.ecr/invalid-parameter-exception, "RepositoryAlreadyExistsException" :portkey.aws.ecr/repository-already-exists-exception, "LimitExceededException" :portkey.aws.ecr/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-repository :args (clojure.spec.alpha/tuple :portkey.aws.ecr/create-repository-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr/create-repository-response))
