(ns portkey.aws.sagemaker.-2017-07-24 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "api.sagemaker", :region "ap-northeast-1"},
    :ssl-common-name "api.sagemaker.ap-northeast-1.amazonaws.com",
    :endpoint "https://api.sagemaker.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "api.sagemaker", :region "eu-west-1"},
    :ssl-common-name "api.sagemaker.eu-west-1.amazonaws.com",
    :endpoint "https://api.sagemaker.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "api.sagemaker", :region "us-east-2"},
    :ssl-common-name "api.sagemaker.us-east-2.amazonaws.com",
    :endpoint "https://api.sagemaker.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "api.sagemaker", :region "ap-southeast-2"},
    :ssl-common-name "api.sagemaker.ap-southeast-2.amazonaws.com",
    :endpoint "https://api.sagemaker.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "api.sagemaker", :region "ap-northeast-2"},
    :ssl-common-name "api.sagemaker.ap-northeast-2.amazonaws.com",
    :endpoint "https://api.sagemaker.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope
    {:service "api.sagemaker", :region "eu-central-1"},
    :ssl-common-name "api.sagemaker.eu-central-1.amazonaws.com",
    :endpoint "https://api.sagemaker.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "api.sagemaker", :region "us-west-2"},
    :ssl-common-name "api.sagemaker.us-west-2.amazonaws.com",
    :endpoint "https://api.sagemaker.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "api.sagemaker", :region "us-east-1"},
    :ssl-common-name "api.sagemaker.us-east-1.amazonaws.com",
    :endpoint "https://api.sagemaker.us-east-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-resource-config)

(clojure.core/declare ser-input-data-config)

(clojure.core/declare ser-task-count)

(clojure.core/declare ser-compression-type)

(clojure.core/declare ser-output-data-config)

(clojure.core/declare ser-metric-regex)

(clojure.core/declare ser-model-name)

(clojure.core/declare ser-name-contains)

(clojure.core/declare ser-endpoint-status)

(clojure.core/declare ser-hyper-parameter-tuning-job-status)

(clojure.core/declare ser-variant-name)

(clojure.core/declare ser-sort-by)

(clojure.core/declare ser-endpoint-config-name-contains)

(clojure.core/declare ser-max-payload-in-mb)

(clojure.core/declare ser-max-number-of-training-jobs)

(clojure.core/declare ser-parameter-key)

(clojure.core/declare ser-transform-resources)

(clojure.core/declare ser-volume-size-in-gb)

(clojure.core/declare ser-security-group-ids)

(clojure.core/declare ser-hyper-parameters)

(clojure.core/declare ser-hyper-parameter-tuning-job-strategy-type)

(clojure.core/declare ser-continuous-parameter-ranges)

(clojure.core/declare ser-subnets)

(clojure.core/declare ser-transform-instance-count)

(clojure.core/declare ser-transform-data-source)

(clojure.core/declare ser-resource-limits)

(clojure.core/declare ser-training-instance-count)

(clojure.core/declare ser-subnet-id)

(clojure.core/declare ser-s-3-data-type)

(clojure.core/declare ser-s-3-data-distribution)

(clojure.core/declare ser-model-name-contains)

(clojure.core/declare ser-notebook-instance-lifecycle-config-sort-order)

(clojure.core/declare ser-transform-s-3-data-source)

(clojure.core/declare ser-max-concurrent-transforms)

(clojure.core/declare ser-container-hostname)

(clojure.core/declare ser-order-key)

(clojure.core/declare ser-model-sort-key)

(clojure.core/declare ser-instance-type)

(clojure.core/declare ser-hyper-parameter-tuning-job-sort-by-options)

(clojure.core/declare ser-role-arn)

(clojure.core/declare ser-training-input-mode)

(clojure.core/declare ser-transform-input)

(clojure.core/declare ser-s-3-uri)

(clojure.core/declare ser-endpoint-config-sort-key)

(clojure.core/declare ser-notebook-instance-lifecycle-config-sort-key)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-production-variant-instance-type)

(clojure.core/declare ser-sort-order)

(clojure.core/declare ser-pagination-token)

(clojure.core/declare ser-parameter-values)

(clojure.core/declare ser-production-variant-list)

(clojure.core/declare ser-environment-map)

(clojure.core/declare ser-max-parallel-training-jobs)

(clojure.core/declare ser-notebook-instance-lifecycle-config-name)

(clojure.core/declare ser-session-expiration-duration-in-seconds)

(clojure.core/declare ser-vpc-security-group-ids)

(clojure.core/declare ser-notebook-instance-status)

(clojure.core/declare ser-notebook-instance-sort-order)

(clojure.core/declare ser-notebook-instance-lifecycle-config-name-contains)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-endpoint-name)

(clojure.core/declare ser-endpoint-sort-key)

(clojure.core/declare ser-list-tags-max-results)

(clojure.core/declare ser-hyper-parameter-tuning-job-config)

(clojure.core/declare ser-content-type)

(clojure.core/declare ser-transform-environment-value)

(clojure.core/declare ser-direct-internet-access)

(clojure.core/declare ser-transform-environment-map)

(clojure.core/declare ser-s-3-data-source)

(clojure.core/declare ser-stopping-condition)

(clojure.core/declare ser-tag-list)

(clojure.core/declare ser-tag-key-list)

(clojure.core/declare ser-environment-value)

(clojure.core/declare ser-categorical-parameter-range)

(clojure.core/declare ser-hyper-parameter-tuning-job-objective-type)

(clojure.core/declare ser-max-runtime-in-seconds)

(clojure.core/declare ser-transform-environment-key)

(clojure.core/declare ser-metric-definition-list)

(clojure.core/declare ser-notebook-instance-sort-key)

(clojure.core/declare ser-channel-name)

(clojure.core/declare ser-categorical-parameter-ranges)

(clojure.core/declare ser-notebook-instance-lifecycle-config-list)

(clojure.core/declare ser-hyper-parameter-algorithm-specification)

(clojure.core/declare ser-url)

(clojure.core/declare ser-notebook-instance-lifecycle-config-content)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-container-definition)

(clojure.core/declare ser-parameter-ranges)

(clojure.core/declare ser-production-variant)

(clojure.core/declare ser-security-group-id)

(clojure.core/declare ser-notebook-instance-lifecycle-hook)

(clojure.core/declare ser-transform-job-name)

(clojure.core/declare ser-kms-key-id)

(clojure.core/declare ser-batch-strategy)

(clojure.core/declare ser-environment-key)

(clojure.core/declare ser-data-source)

(clojure.core/declare ser-assembly-type)

(clojure.core/declare ser-variant-weight)

(clojure.core/declare ser-split-type)

(clojure.core/declare ser-training-job-sort-by-options)

(clojure.core/declare ser-creation-time)

(clojure.core/declare ser-metric-definition)

(clojure.core/declare ser-vpc-config)

(clojure.core/declare ser-hyper-parameter-tuning-job-name)

(clojure.core/declare ser-training-job-name)

(clojure.core/declare ser-transform-job-status)

(clojure.core/declare ser-transform-output)

(clojure.core/declare ser-desired-weight-and-capacity-list)

(clojure.core/declare ser-endpoint-name-contains)

(clojure.core/declare ser-hyper-parameter-training-job-definition)

(clojure.core/declare ser-timestamp)

(clojure.core/declare ser-resource-arn)

(clojure.core/declare ser-desired-weight-and-capacity)

(clojure.core/declare ser-record-wrapper)

(clojure.core/declare ser-channel)

(clojure.core/declare ser-hyper-parameter-tuning-job-objective)

(clojure.core/declare ser-disassociate-notebook-instance-lifecycle-config)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-metric-name)

(clojure.core/declare ser-integer-parameter-ranges)

(clojure.core/declare ser-training-instance-type)

(clojure.core/declare ser-integer-parameter-range)

(clojure.core/declare ser-algorithm-image)

(clojure.core/declare ser-last-modified-time)

(clojure.core/declare ser-image)

(clojure.core/declare ser-accept)

(clojure.core/declare ser-training-job-status)

(clojure.core/declare ser-continuous-parameter-range)

(clojure.core/declare ser-algorithm-specification)

(clojure.core/declare ser-notebook-instance-name-contains)

(clojure.core/declare ser-notebook-instance-name)

(clojure.core/declare ser-transform-instance-type)

(clojure.core/declare ser-endpoint-config-name)

(clojure.core/declare ser-parameter-value)

(clojure.core/defn- ser-resource-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-training-instance-type (:instance-type input)) #:http.request.field{:name "InstanceType", :shape "TrainingInstanceType"}) (clojure.core/into (ser-training-instance-count (:instance-count input)) #:http.request.field{:name "InstanceCount", :shape "TrainingInstanceCount"}) (clojure.core/into (ser-volume-size-in-gb (:volume-size-in-gb input)) #:http.request.field{:name "VolumeSizeInGB", :shape "VolumeSizeInGB"})], :shape "ResourceConfig", :type "structure"} (clojure.core/contains? input :volume-kms-key-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kms-key-id (input :volume-kms-key-id)) #:http.request.field{:name "VolumeKmsKeyId", :shape "KmsKeyId"}))))

(clojure.core/defn- ser-input-data-config [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-channel coll) #:http.request.field{:shape "Channel"}))) input), :shape "InputDataConfig", :type "list", :max 8, :min 1})

(clojure.core/defn- ser-task-count [input] #:http.request.field{:value input, :shape "TaskCount"})

(clojure.core/defn- ser-compression-type [input] #:http.request.field{:value (clojure.core/get {"None" "None", :none "None", "Gzip" "Gzip", :gzip "Gzip"} input), :shape "CompressionType"})

(clojure.core/defn- ser-output-data-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-s-3-uri (:s-3-output-path input)) #:http.request.field{:name "S3OutputPath", :shape "S3Uri"})], :shape "OutputDataConfig", :type "structure"} (clojure.core/contains? input :kms-key-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kms-key-id (input :kms-key-id)) #:http.request.field{:name "KmsKeyId", :shape "KmsKeyId"}))))

(clojure.core/defn- ser-metric-regex [input] #:http.request.field{:value input, :shape "MetricRegex"})

(clojure.core/defn- ser-model-name [input] #:http.request.field{:value input, :shape "ModelName"})

(clojure.core/defn- ser-name-contains [input] #:http.request.field{:value input, :shape "NameContains"})

(clojure.core/defn- ser-endpoint-status [input] #:http.request.field{:value (clojure.core/get {"Failed" "Failed", "Creating" "Creating", "SystemUpdating" "SystemUpdating", :system-updating "SystemUpdating", :creating "Creating", "InService" "InService", "RollingBack" "RollingBack", :deleting "Deleting", "OutOfService" "OutOfService", :out-of-service "OutOfService", "Deleting" "Deleting", :in-service "InService", :rolling-back "RollingBack", :updating "Updating", "Updating" "Updating", :failed "Failed"} input), :shape "EndpointStatus"})

(clojure.core/defn- ser-hyper-parameter-tuning-job-status [input] #:http.request.field{:value (clojure.core/get {"Failed" "Failed", :in-progress "InProgress", :completed "Completed", :stopping "Stopping", :stopped "Stopped", "InProgress" "InProgress", "Stopping" "Stopping", "Stopped" "Stopped", "Completed" "Completed", :failed "Failed"} input), :shape "HyperParameterTuningJobStatus"})

(clojure.core/defn- ser-variant-name [input] #:http.request.field{:value input, :shape "VariantName"})

(clojure.core/defn- ser-sort-by [input] #:http.request.field{:value (clojure.core/get {"Name" "Name", :name "Name", "CreationTime" "CreationTime", :creation-time "CreationTime", "Status" "Status", :status "Status"} input), :shape "SortBy"})

(clojure.core/defn- ser-endpoint-config-name-contains [input] #:http.request.field{:value input, :shape "EndpointConfigNameContains"})

(clojure.core/defn- ser-max-payload-in-mb [input] #:http.request.field{:value input, :shape "MaxPayloadInMB"})

(clojure.core/defn- ser-max-number-of-training-jobs [input] #:http.request.field{:value input, :shape "MaxNumberOfTrainingJobs"})

(clojure.core/defn- ser-parameter-key [input] #:http.request.field{:value input, :shape "ParameterKey"})

(clojure.core/defn- ser-transform-resources [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-transform-instance-type (:instance-type input)) #:http.request.field{:name "InstanceType", :shape "TransformInstanceType"}) (clojure.core/into (ser-transform-instance-count (:instance-count input)) #:http.request.field{:name "InstanceCount", :shape "TransformInstanceCount"})], :shape "TransformResources", :type "structure"} (clojure.core/contains? input :volume-kms-key-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kms-key-id (input :volume-kms-key-id)) #:http.request.field{:name "VolumeKmsKeyId", :shape "KmsKeyId"}))))

(clojure.core/defn- ser-volume-size-in-gb [input] #:http.request.field{:value input, :shape "VolumeSizeInGB"})

(clojure.core/defn- ser-security-group-ids [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-security-group-id coll) #:http.request.field{:shape "SecurityGroupId"}))) input), :shape "SecurityGroupIds", :type "list", :max 5})

(clojure.core/defn- ser-hyper-parameters [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-parameter-key k) #:http.request.field{:map-info "key", :shape "ParameterKey"}) (clojure.core/into (ser-parameter-value v) #:http.request.field{:map-info "value", :shape "ParameterValue"})])) input), :shape "HyperParameters", :type "map", :max 100, :min 0})

(clojure.core/defn- ser-hyper-parameter-tuning-job-strategy-type [input] #:http.request.field{:value (clojure.core/get {"Bayesian" "Bayesian", :bayesian "Bayesian"} input), :shape "HyperParameterTuningJobStrategyType"})

(clojure.core/defn- ser-continuous-parameter-ranges [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-continuous-parameter-range coll) #:http.request.field{:shape "ContinuousParameterRange"}))) input), :shape "ContinuousParameterRanges", :type "list", :max 20, :min 0})

(clojure.core/defn- ser-subnets [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-subnet-id coll) #:http.request.field{:shape "SubnetId"}))) input), :shape "Subnets", :type "list", :max 16, :min 1})

(clojure.core/defn- ser-transform-instance-count [input] #:http.request.field{:value input, :shape "TransformInstanceCount"})

(clojure.core/defn- ser-transform-data-source [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-transform-s-3-data-source (:s-3-data-source input)) #:http.request.field{:name "S3DataSource", :shape "TransformS3DataSource"})], :shape "TransformDataSource", :type "structure"}))

(clojure.core/defn- ser-resource-limits [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-max-number-of-training-jobs (:max-number-of-training-jobs input)) #:http.request.field{:name "MaxNumberOfTrainingJobs", :shape "MaxNumberOfTrainingJobs"}) (clojure.core/into (ser-max-parallel-training-jobs (:max-parallel-training-jobs input)) #:http.request.field{:name "MaxParallelTrainingJobs", :shape "MaxParallelTrainingJobs"})], :shape "ResourceLimits", :type "structure"}))

(clojure.core/defn- ser-training-instance-count [input] #:http.request.field{:value input, :shape "TrainingInstanceCount"})

(clojure.core/defn- ser-subnet-id [input] #:http.request.field{:value input, :shape "SubnetId"})

(clojure.core/defn- ser-s-3-data-type [input] #:http.request.field{:value (clojure.core/get {"ManifestFile" "ManifestFile", :manifest-file "ManifestFile", "S3Prefix" "S3Prefix", :s-3-prefix "S3Prefix"} input), :shape "S3DataType"})

(clojure.core/defn- ser-s-3-data-distribution [input] #:http.request.field{:value (clojure.core/get {"FullyReplicated" "FullyReplicated", :fully-replicated "FullyReplicated", "ShardedByS3Key" "ShardedByS3Key", :sharded-by-s-3-key "ShardedByS3Key"} input), :shape "S3DataDistribution"})

(clojure.core/defn- ser-model-name-contains [input] #:http.request.field{:value input, :shape "ModelNameContains"})

(clojure.core/defn- ser-notebook-instance-lifecycle-config-sort-order [input] #:http.request.field{:value (clojure.core/get {"Ascending" "Ascending", :ascending "Ascending", "Descending" "Descending", :descending "Descending"} input), :shape "NotebookInstanceLifecycleConfigSortOrder"})

(clojure.core/defn- ser-transform-s-3-data-source [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-s-3-data-type (:s-3-data-type input)) #:http.request.field{:name "S3DataType", :shape "S3DataType"}) (clojure.core/into (ser-s-3-uri (:s-3-uri input)) #:http.request.field{:name "S3Uri", :shape "S3Uri"})], :shape "TransformS3DataSource", :type "structure"}))

(clojure.core/defn- ser-max-concurrent-transforms [input] #:http.request.field{:value input, :shape "MaxConcurrentTransforms"})

(clojure.core/defn- ser-container-hostname [input] #:http.request.field{:value input, :shape "ContainerHostname"})

(clojure.core/defn- ser-order-key [input] #:http.request.field{:value (clojure.core/get {"Ascending" "Ascending", :ascending "Ascending", "Descending" "Descending", :descending "Descending"} input), :shape "OrderKey"})

(clojure.core/defn- ser-model-sort-key [input] #:http.request.field{:value (clojure.core/get {"Name" "Name", :name "Name", "CreationTime" "CreationTime", :creation-time "CreationTime"} input), :shape "ModelSortKey"})

(clojure.core/defn- ser-instance-type [input] #:http.request.field{:value (clojure.core/get {"ml.t2.large" "ml.t2.large", :mlm-42xlarge "ml.m4.2xlarge", :mlp-32xlarge "ml.p3.2xlarge", :mlp-316xlarge "ml.p3.16xlarge", "ml.m4.2xlarge" "ml.m4.2xlarge", "ml.p2.16xlarge" "ml.p2.16xlarge", :mlt-2medium "ml.t2.medium", :mlt-2large "ml.t2.large", "ml.t2.2xlarge" "ml.t2.2xlarge", :mlm-410xlarge "ml.m4.10xlarge", "ml.m4.4xlarge" "ml.m4.4xlarge", "ml.m4.xlarge" "ml.m4.xlarge", "ml.m4.16xlarge" "ml.m4.16xlarge", :mlp-38xlarge "ml.p3.8xlarge", :mlt-2xlarge "ml.t2.xlarge", :mlm-416xlarge "ml.m4.16xlarge", "ml.p2.8xlarge" "ml.p2.8xlarge", :mlm-44xlarge "ml.m4.4xlarge", "ml.t2.xlarge" "ml.t2.xlarge", :mlt-22xlarge "ml.t2.2xlarge", "ml.p3.16xlarge" "ml.p3.16xlarge", "ml.p3.2xlarge" "ml.p3.2xlarge", :mlp-216xlarge "ml.p2.16xlarge", :mlp-2xlarge "ml.p2.xlarge", "ml.p3.8xlarge" "ml.p3.8xlarge", :mlp-28xlarge "ml.p2.8xlarge", :mlm-4xlarge "ml.m4.xlarge", "ml.p2.xlarge" "ml.p2.xlarge", "ml.m4.10xlarge" "ml.m4.10xlarge", "ml.t2.medium" "ml.t2.medium"} input), :shape "InstanceType"})

(clojure.core/defn- ser-hyper-parameter-tuning-job-sort-by-options [input] #:http.request.field{:value (clojure.core/get {"Name" "Name", :name "Name", "Status" "Status", :status "Status", "CreationTime" "CreationTime", :creation-time "CreationTime"} input), :shape "HyperParameterTuningJobSortByOptions"})

(clojure.core/defn- ser-role-arn [input] #:http.request.field{:value input, :shape "RoleArn"})

(clojure.core/defn- ser-training-input-mode [input] #:http.request.field{:value (clojure.core/get {"Pipe" "Pipe", :pipe "Pipe", "File" "File", :file "File"} input), :shape "TrainingInputMode"})

(clojure.core/defn- ser-transform-input [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-transform-data-source (:data-source input)) #:http.request.field{:name "DataSource", :shape "TransformDataSource"})], :shape "TransformInput", :type "structure"} (clojure.core/contains? input :content-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-type (input :content-type)) #:http.request.field{:name "ContentType", :shape "ContentType"})) (clojure.core/contains? input :compression-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-compression-type (input :compression-type)) #:http.request.field{:name "CompressionType", :shape "CompressionType"})) (clojure.core/contains? input :split-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-split-type (input :split-type)) #:http.request.field{:name "SplitType", :shape "SplitType"}))))

(clojure.core/defn- ser-s-3-uri [input] #:http.request.field{:value input, :shape "S3Uri"})

(clojure.core/defn- ser-endpoint-config-sort-key [input] #:http.request.field{:value (clojure.core/get {"Name" "Name", :name "Name", "CreationTime" "CreationTime", :creation-time "CreationTime"} input), :shape "EndpointConfigSortKey"})

(clojure.core/defn- ser-notebook-instance-lifecycle-config-sort-key [input] #:http.request.field{:value (clojure.core/get {"Name" "Name", :name "Name", "CreationTime" "CreationTime", :creation-time "CreationTime", "LastModifiedTime" "LastModifiedTime", :last-modified-time "LastModifiedTime"} input), :shape "NotebookInstanceLifecycleConfigSortKey"})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-production-variant-instance-type [input] #:http.request.field{:value (clojure.core/get {:mlm-5large "ml.m5.large", "ml.t2.large" "ml.t2.large", :mlm-42xlarge "ml.m4.2xlarge", :mlp-32xlarge "ml.p3.2xlarge", :mlp-316xlarge "ml.p3.16xlarge", "ml.c4.large" "ml.c4.large", "ml.m5.xlarge" "ml.m5.xlarge", "ml.c5.xlarge" "ml.c5.xlarge", "ml.m4.2xlarge" "ml.m4.2xlarge", "ml.c5.9xlarge" "ml.c5.9xlarge", :mlm-54xlarge "ml.m5.4xlarge", "ml.p2.16xlarge" "ml.p2.16xlarge", :mlt-2medium "ml.t2.medium", :mlt-2large "ml.t2.large", :mlm-52xlarge "ml.m5.2xlarge", "ml.m5.large" "ml.m5.large", :mlc-54xlarge "ml.c5.4xlarge", "ml.m5.12xlarge" "ml.m5.12xlarge", "ml.c5.2xlarge" "ml.c5.2xlarge", :mlc-52xlarge "ml.c5.2xlarge", "ml.c4.2xlarge" "ml.c4.2xlarge", "ml.t2.2xlarge" "ml.t2.2xlarge", "ml.c5.large" "ml.c5.large", "ml.c4.4xlarge" "ml.c4.4xlarge", :mlm-410xlarge "ml.m4.10xlarge", :mlm-512xlarge "ml.m5.12xlarge", "ml.m4.4xlarge" "ml.m4.4xlarge", "ml.m5.4xlarge" "ml.m5.4xlarge", "ml.m4.xlarge" "ml.m4.xlarge", "ml.m4.16xlarge" "ml.m4.16xlarge", :mlp-38xlarge "ml.p3.8xlarge", :mlc-4large "ml.c4.large", :mlt-2xlarge "ml.t2.xlarge", :mlm-416xlarge "ml.m4.16xlarge", "ml.p2.8xlarge" "ml.p2.8xlarge", :mlm-44xlarge "ml.m4.4xlarge", :mlc-48xlarge "ml.c4.8xlarge", "ml.t2.xlarge" "ml.t2.xlarge", :mlt-22xlarge "ml.t2.2xlarge", "ml.p3.16xlarge" "ml.p3.16xlarge", :mlc-59xlarge "ml.c5.9xlarge", :mlc-4xlarge "ml.c4.xlarge", "ml.c4.8xlarge" "ml.c4.8xlarge", "ml.c5.18xlarge" "ml.c5.18xlarge", :mlc-42xlarge "ml.c4.2xlarge", :mlc-44xlarge "ml.c4.4xlarge", "ml.m5.2xlarge" "ml.m5.2xlarge", :mlc-518xlarge "ml.c5.18xlarge", "ml.c4.xlarge" "ml.c4.xlarge", "ml.m5.24xlarge" "ml.m5.24xlarge", "ml.p3.2xlarge" "ml.p3.2xlarge", :mlp-216xlarge "ml.p2.16xlarge", :mlm-524xlarge "ml.m5.24xlarge", :mlp-2xlarge "ml.p2.xlarge", :mlc-5large "ml.c5.large", "ml.p3.8xlarge" "ml.p3.8xlarge", :mlp-28xlarge "ml.p2.8xlarge", :mlm-5xlarge "ml.m5.xlarge", :mlm-4xlarge "ml.m4.xlarge", "ml.p2.xlarge" "ml.p2.xlarge", "ml.m4.10xlarge" "ml.m4.10xlarge", :mlc-5xlarge "ml.c5.xlarge", "ml.t2.medium" "ml.t2.medium", "ml.c5.4xlarge" "ml.c5.4xlarge"} input), :shape "ProductionVariantInstanceType"})

(clojure.core/defn- ser-sort-order [input] #:http.request.field{:value (clojure.core/get {"Ascending" "Ascending", :ascending "Ascending", "Descending" "Descending", :descending "Descending"} input), :shape "SortOrder"})

(clojure.core/defn- ser-pagination-token [input] #:http.request.field{:value input, :shape "PaginationToken"})

(clojure.core/defn- ser-parameter-values [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-parameter-value coll) #:http.request.field{:shape "ParameterValue"}))) input), :shape "ParameterValues", :type "list", :max 20, :min 1})

(clojure.core/defn- ser-production-variant-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-production-variant coll) #:http.request.field{:shape "ProductionVariant"}))) input), :shape "ProductionVariantList", :type "list", :min 1})

(clojure.core/defn- ser-environment-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-environment-key k) #:http.request.field{:map-info "key", :shape "EnvironmentKey"}) (clojure.core/into (ser-environment-value v) #:http.request.field{:map-info "value", :shape "EnvironmentValue"})])) input), :shape "EnvironmentMap", :type "map", :max 16})

(clojure.core/defn- ser-max-parallel-training-jobs [input] #:http.request.field{:value input, :shape "MaxParallelTrainingJobs"})

(clojure.core/defn- ser-notebook-instance-lifecycle-config-name [input] #:http.request.field{:value input, :shape "NotebookInstanceLifecycleConfigName"})

(clojure.core/defn- ser-session-expiration-duration-in-seconds [input] #:http.request.field{:value input, :shape "SessionExpirationDurationInSeconds"})

(clojure.core/defn- ser-vpc-security-group-ids [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-security-group-id coll) #:http.request.field{:shape "SecurityGroupId"}))) input), :shape "VpcSecurityGroupIds", :type "list", :max 5, :min 1})

(clojure.core/defn- ser-notebook-instance-status [input] #:http.request.field{:value (clojure.core/get {"Failed" "Failed", :pending "Pending", "InService" "InService", :deleting "Deleting", :stopping "Stopping", :stopped "Stopped", "Deleting" "Deleting", :in-service "InService", "Stopping" "Stopping", :updating "Updating", "Stopped" "Stopped", "Pending" "Pending", "Updating" "Updating", :failed "Failed"} input), :shape "NotebookInstanceStatus"})

(clojure.core/defn- ser-notebook-instance-sort-order [input] #:http.request.field{:value (clojure.core/get {"Ascending" "Ascending", :ascending "Ascending", "Descending" "Descending", :descending "Descending"} input), :shape "NotebookInstanceSortOrder"})

(clojure.core/defn- ser-notebook-instance-lifecycle-config-name-contains [input] #:http.request.field{:value input, :shape "NotebookInstanceLifecycleConfigNameContains"})

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-endpoint-name [input] #:http.request.field{:value input, :shape "EndpointName"})

(clojure.core/defn- ser-endpoint-sort-key [input] #:http.request.field{:value (clojure.core/get {"Name" "Name", :name "Name", "CreationTime" "CreationTime", :creation-time "CreationTime", "Status" "Status", :status "Status"} input), :shape "EndpointSortKey"})

(clojure.core/defn- ser-list-tags-max-results [input] #:http.request.field{:value input, :shape "ListTagsMaxResults"})

(clojure.core/defn- ser-hyper-parameter-tuning-job-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-hyper-parameter-tuning-job-strategy-type (:strategy input)) #:http.request.field{:name "Strategy", :shape "HyperParameterTuningJobStrategyType"}) (clojure.core/into (ser-hyper-parameter-tuning-job-objective (:hyper-parameter-tuning-job-objective input)) #:http.request.field{:name "HyperParameterTuningJobObjective", :shape "HyperParameterTuningJobObjective"}) (clojure.core/into (ser-resource-limits (:resource-limits input)) #:http.request.field{:name "ResourceLimits", :shape "ResourceLimits"}) (clojure.core/into (ser-parameter-ranges (:parameter-ranges input)) #:http.request.field{:name "ParameterRanges", :shape "ParameterRanges"})], :shape "HyperParameterTuningJobConfig", :type "structure"}))

(clojure.core/defn- ser-content-type [input] #:http.request.field{:value input, :shape "ContentType"})

(clojure.core/defn- ser-transform-environment-value [input] #:http.request.field{:value input, :shape "TransformEnvironmentValue"})

(clojure.core/defn- ser-direct-internet-access [input] #:http.request.field{:value (clojure.core/get {"Enabled" "Enabled", :enabled "Enabled", "Disabled" "Disabled", :disabled "Disabled"} input), :shape "DirectInternetAccess"})

(clojure.core/defn- ser-transform-environment-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-transform-environment-key k) #:http.request.field{:map-info "key", :shape "TransformEnvironmentKey"}) (clojure.core/into (ser-transform-environment-value v) #:http.request.field{:map-info "value", :shape "TransformEnvironmentValue"})])) input), :shape "TransformEnvironmentMap", :type "map", :max 16})

(clojure.core/defn- ser-s-3-data-source [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-s-3-data-type (:s-3-data-type input)) #:http.request.field{:name "S3DataType", :shape "S3DataType"}) (clojure.core/into (ser-s-3-uri (:s-3-uri input)) #:http.request.field{:name "S3Uri", :shape "S3Uri"})], :shape "S3DataSource", :type "structure"} (clojure.core/contains? input :s-3-data-distribution-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-data-distribution (input :s-3-data-distribution-type)) #:http.request.field{:name "S3DataDistributionType", :shape "S3DataDistribution"}))))

(clojure.core/defn- ser-stopping-condition [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "StoppingCondition", :type "structure"} (clojure.core/contains? input :max-runtime-in-seconds) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-runtime-in-seconds (input :max-runtime-in-seconds)) #:http.request.field{:name "MaxRuntimeInSeconds", :shape "MaxRuntimeInSeconds"}))))

(clojure.core/defn- ser-tag-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "TagList", :type "list", :max 50, :min 0})

(clojure.core/defn- ser-tag-key-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-key coll) #:http.request.field{:shape "TagKey"}))) input), :shape "TagKeyList", :type "list", :max 50, :min 1})

(clojure.core/defn- ser-environment-value [input] #:http.request.field{:value input, :shape "EnvironmentValue"})

(clojure.core/defn- ser-categorical-parameter-range [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-parameter-key (:name input)) #:http.request.field{:name "Name", :shape "ParameterKey"}) (clojure.core/into (ser-parameter-values (:values input)) #:http.request.field{:name "Values", :shape "ParameterValues"})], :shape "CategoricalParameterRange", :type "structure"}))

(clojure.core/defn- ser-hyper-parameter-tuning-job-objective-type [input] #:http.request.field{:value (clojure.core/get {"Maximize" "Maximize", :maximize "Maximize", "Minimize" "Minimize", :minimize "Minimize"} input), :shape "HyperParameterTuningJobObjectiveType"})

(clojure.core/defn- ser-max-runtime-in-seconds [input] #:http.request.field{:value input, :shape "MaxRuntimeInSeconds"})

(clojure.core/defn- ser-transform-environment-key [input] #:http.request.field{:value input, :shape "TransformEnvironmentKey"})

(clojure.core/defn- ser-metric-definition-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-metric-definition coll) #:http.request.field{:shape "MetricDefinition"}))) input), :shape "MetricDefinitionList", :type "list", :max 20, :min 0})

(clojure.core/defn- ser-notebook-instance-sort-key [input] #:http.request.field{:value (clojure.core/get {"Name" "Name", :name "Name", "CreationTime" "CreationTime", :creation-time "CreationTime", "Status" "Status", :status "Status"} input), :shape "NotebookInstanceSortKey"})

(clojure.core/defn- ser-channel-name [input] #:http.request.field{:value input, :shape "ChannelName"})

(clojure.core/defn- ser-categorical-parameter-ranges [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-categorical-parameter-range coll) #:http.request.field{:shape "CategoricalParameterRange"}))) input), :shape "CategoricalParameterRanges", :type "list", :max 20, :min 0})

(clojure.core/defn- ser-notebook-instance-lifecycle-config-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-notebook-instance-lifecycle-hook coll) #:http.request.field{:shape "NotebookInstanceLifecycleHook"}))) input), :shape "NotebookInstanceLifecycleConfigList", :type "list", :max 1})

(clojure.core/defn- ser-hyper-parameter-algorithm-specification [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-algorithm-image (:training-image input)) #:http.request.field{:name "TrainingImage", :shape "AlgorithmImage"}) (clojure.core/into (ser-training-input-mode (:training-input-mode input)) #:http.request.field{:name "TrainingInputMode", :shape "TrainingInputMode"})], :shape "HyperParameterAlgorithmSpecification", :type "structure"} (clojure.core/contains? input :metric-definitions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metric-definition-list (input :metric-definitions)) #:http.request.field{:name "MetricDefinitions", :shape "MetricDefinitionList"}))))

(clojure.core/defn- ser-url [input] #:http.request.field{:value input, :shape "Url"})

(clojure.core/defn- ser-notebook-instance-lifecycle-config-content [input] #:http.request.field{:value input, :shape "NotebookInstanceLifecycleConfigContent"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-container-definition [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-image (:image input)) #:http.request.field{:name "Image", :shape "Image"})], :shape "ContainerDefinition", :type "structure"} (clojure.core/contains? input :container-hostname) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-container-hostname (input :container-hostname)) #:http.request.field{:name "ContainerHostname", :shape "ContainerHostname"})) (clojure.core/contains? input :model-data-url) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-url (input :model-data-url)) #:http.request.field{:name "ModelDataUrl", :shape "Url"})) (clojure.core/contains? input :environment) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-map (input :environment)) #:http.request.field{:name "Environment", :shape "EnvironmentMap"}))))

(clojure.core/defn- ser-parameter-ranges [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ParameterRanges", :type "structure"} (clojure.core/contains? input :integer-parameter-ranges) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-parameter-ranges (input :integer-parameter-ranges)) #:http.request.field{:name "IntegerParameterRanges", :shape "IntegerParameterRanges"})) (clojure.core/contains? input :continuous-parameter-ranges) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-continuous-parameter-ranges (input :continuous-parameter-ranges)) #:http.request.field{:name "ContinuousParameterRanges", :shape "ContinuousParameterRanges"})) (clojure.core/contains? input :categorical-parameter-ranges) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-categorical-parameter-ranges (input :categorical-parameter-ranges)) #:http.request.field{:name "CategoricalParameterRanges", :shape "CategoricalParameterRanges"}))))

(clojure.core/defn- ser-production-variant [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-variant-name (:variant-name input)) #:http.request.field{:name "VariantName", :shape "VariantName"}) (clojure.core/into (ser-model-name (:model-name input)) #:http.request.field{:name "ModelName", :shape "ModelName"}) (clojure.core/into (ser-task-count (:initial-instance-count input)) #:http.request.field{:name "InitialInstanceCount", :shape "TaskCount"}) (clojure.core/into (ser-production-variant-instance-type (:instance-type input)) #:http.request.field{:name "InstanceType", :shape "ProductionVariantInstanceType"})], :shape "ProductionVariant", :type "structure"} (clojure.core/contains? input :initial-variant-weight) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-variant-weight (input :initial-variant-weight)) #:http.request.field{:name "InitialVariantWeight", :shape "VariantWeight"}))))

(clojure.core/defn- ser-security-group-id [input] #:http.request.field{:value input, :shape "SecurityGroupId"})

(clojure.core/defn- ser-notebook-instance-lifecycle-hook [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "NotebookInstanceLifecycleHook", :type "structure"} (clojure.core/contains? input :content) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notebook-instance-lifecycle-config-content (input :content)) #:http.request.field{:name "Content", :shape "NotebookInstanceLifecycleConfigContent"}))))

(clojure.core/defn- ser-transform-job-name [input] #:http.request.field{:value input, :shape "TransformJobName"})

(clojure.core/defn- ser-kms-key-id [input] #:http.request.field{:value input, :shape "KmsKeyId"})

(clojure.core/defn- ser-batch-strategy [input] #:http.request.field{:value (clojure.core/get {"MultiRecord" "MultiRecord", :multi-record "MultiRecord", "SingleRecord" "SingleRecord", :single-record "SingleRecord"} input), :shape "BatchStrategy"})

(clojure.core/defn- ser-environment-key [input] #:http.request.field{:value input, :shape "EnvironmentKey"})

(clojure.core/defn- ser-data-source [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-s-3-data-source (:s-3-data-source input)) #:http.request.field{:name "S3DataSource", :shape "S3DataSource"})], :shape "DataSource", :type "structure"}))

(clojure.core/defn- ser-assembly-type [input] #:http.request.field{:value (clojure.core/get {"None" "None", :none "None", "Line" "Line", :line "Line"} input), :shape "AssemblyType"})

(clojure.core/defn- ser-variant-weight [input] #:http.request.field{:value input, :shape "VariantWeight"})

(clojure.core/defn- ser-split-type [input] #:http.request.field{:value (clojure.core/get {"None" "None", :none "None", "Line" "Line", :line "Line", "RecordIO" "RecordIO", :record-io "RecordIO"} input), :shape "SplitType"})

(clojure.core/defn- ser-training-job-sort-by-options [input] #:http.request.field{:value (clojure.core/get {"Name" "Name", :name "Name", "CreationTime" "CreationTime", :creation-time "CreationTime", "Status" "Status", :status "Status", "FinalObjectiveMetricValue" "FinalObjectiveMetricValue", :final-objective-metric-value "FinalObjectiveMetricValue"} input), :shape "TrainingJobSortByOptions"})

(clojure.core/defn- ser-creation-time [input] #:http.request.field{:value input, :shape "CreationTime"})

(clojure.core/defn- ser-metric-definition [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-metric-name (:name input)) #:http.request.field{:name "Name", :shape "MetricName"}) (clojure.core/into (ser-metric-regex (:regex input)) #:http.request.field{:name "Regex", :shape "MetricRegex"})], :shape "MetricDefinition", :type "structure"}))

(clojure.core/defn- ser-vpc-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-vpc-security-group-ids (:security-group-ids input)) #:http.request.field{:name "SecurityGroupIds", :shape "VpcSecurityGroupIds"}) (clojure.core/into (ser-subnets (:subnets input)) #:http.request.field{:name "Subnets", :shape "Subnets"})], :shape "VpcConfig", :type "structure"}))

(clojure.core/defn- ser-hyper-parameter-tuning-job-name [input] #:http.request.field{:value input, :shape "HyperParameterTuningJobName"})

(clojure.core/defn- ser-training-job-name [input] #:http.request.field{:value input, :shape "TrainingJobName"})

(clojure.core/defn- ser-transform-job-status [input] #:http.request.field{:value (clojure.core/get {"Failed" "Failed", :in-progress "InProgress", :completed "Completed", :stopping "Stopping", :stopped "Stopped", "InProgress" "InProgress", "Stopping" "Stopping", "Stopped" "Stopped", "Completed" "Completed", :failed "Failed"} input), :shape "TransformJobStatus"})

(clojure.core/defn- ser-transform-output [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-s-3-uri (:s-3-output-path input)) #:http.request.field{:name "S3OutputPath", :shape "S3Uri"})], :shape "TransformOutput", :type "structure"} (clojure.core/contains? input :accept) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept (input :accept)) #:http.request.field{:name "Accept", :shape "Accept"})) (clojure.core/contains? input :assemble-with) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-assembly-type (input :assemble-with)) #:http.request.field{:name "AssembleWith", :shape "AssemblyType"})) (clojure.core/contains? input :kms-key-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kms-key-id (input :kms-key-id)) #:http.request.field{:name "KmsKeyId", :shape "KmsKeyId"}))))

(clojure.core/defn- ser-desired-weight-and-capacity-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-desired-weight-and-capacity coll) #:http.request.field{:shape "DesiredWeightAndCapacity"}))) input), :shape "DesiredWeightAndCapacityList", :type "list", :min 1})

(clojure.core/defn- ser-endpoint-name-contains [input] #:http.request.field{:value input, :shape "EndpointNameContains"})

(clojure.core/defn- ser-hyper-parameter-training-job-definition [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-hyper-parameter-algorithm-specification (:algorithm-specification input)) #:http.request.field{:name "AlgorithmSpecification", :shape "HyperParameterAlgorithmSpecification"}) (clojure.core/into (ser-role-arn (:role-arn input)) #:http.request.field{:name "RoleArn", :shape "RoleArn"}) (clojure.core/into (ser-input-data-config (:input-data-config input)) #:http.request.field{:name "InputDataConfig", :shape "InputDataConfig"}) (clojure.core/into (ser-output-data-config (:output-data-config input)) #:http.request.field{:name "OutputDataConfig", :shape "OutputDataConfig"}) (clojure.core/into (ser-resource-config (:resource-config input)) #:http.request.field{:name "ResourceConfig", :shape "ResourceConfig"}) (clojure.core/into (ser-stopping-condition (:stopping-condition input)) #:http.request.field{:name "StoppingCondition", :shape "StoppingCondition"})], :shape "HyperParameterTrainingJobDefinition", :type "structure"} (clojure.core/contains? input :static-hyper-parameters) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hyper-parameters (input :static-hyper-parameters)) #:http.request.field{:name "StaticHyperParameters", :shape "HyperParameters"})) (clojure.core/contains? input :vpc-config) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-vpc-config (input :vpc-config)) #:http.request.field{:name "VpcConfig", :shape "VpcConfig"}))))

(clojure.core/defn- ser-timestamp [input] #:http.request.field{:value input, :shape "Timestamp"})

(clojure.core/defn- ser-resource-arn [input] #:http.request.field{:value input, :shape "ResourceArn"})

(clojure.core/defn- ser-desired-weight-and-capacity [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-variant-name (:variant-name input)) #:http.request.field{:name "VariantName", :shape "VariantName"})], :shape "DesiredWeightAndCapacity", :type "structure"} (clojure.core/contains? input :desired-weight) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-variant-weight (input :desired-weight)) #:http.request.field{:name "DesiredWeight", :shape "VariantWeight"})) (clojure.core/contains? input :desired-instance-count) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-task-count (input :desired-instance-count)) #:http.request.field{:name "DesiredInstanceCount", :shape "TaskCount"}))))

(clojure.core/defn- ser-record-wrapper [input] #:http.request.field{:value (clojure.core/get {"None" "None", :none "None", "RecordIO" "RecordIO", :record-io "RecordIO"} input), :shape "RecordWrapper"})

(clojure.core/defn- ser-channel [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-channel-name (:channel-name input)) #:http.request.field{:name "ChannelName", :shape "ChannelName"}) (clojure.core/into (ser-data-source (:data-source input)) #:http.request.field{:name "DataSource", :shape "DataSource"})], :shape "Channel", :type "structure"} (clojure.core/contains? input :content-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-type (input :content-type)) #:http.request.field{:name "ContentType", :shape "ContentType"})) (clojure.core/contains? input :compression-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-compression-type (input :compression-type)) #:http.request.field{:name "CompressionType", :shape "CompressionType"})) (clojure.core/contains? input :record-wrapper-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-record-wrapper (input :record-wrapper-type)) #:http.request.field{:name "RecordWrapperType", :shape "RecordWrapper"}))))

(clojure.core/defn- ser-hyper-parameter-tuning-job-objective [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-hyper-parameter-tuning-job-objective-type (:type input)) #:http.request.field{:name "Type", :shape "HyperParameterTuningJobObjectiveType"}) (clojure.core/into (ser-metric-name (:metric-name input)) #:http.request.field{:name "MetricName", :shape "MetricName"})], :shape "HyperParameterTuningJobObjective", :type "structure"}))

(clojure.core/defn- ser-disassociate-notebook-instance-lifecycle-config [input] #:http.request.field{:value input, :shape "DisassociateNotebookInstanceLifecycleConfig"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-tag-key (:key input)) #:http.request.field{:name "Key", :shape "TagKey"}) (clojure.core/into (ser-tag-value (:value input)) #:http.request.field{:name "Value", :shape "TagValue"})], :shape "Tag", :type "structure"}))

(clojure.core/defn- ser-metric-name [input] #:http.request.field{:value input, :shape "MetricName"})

(clojure.core/defn- ser-integer-parameter-ranges [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-integer-parameter-range coll) #:http.request.field{:shape "IntegerParameterRange"}))) input), :shape "IntegerParameterRanges", :type "list", :max 20, :min 0})

(clojure.core/defn- ser-training-instance-type [input] #:http.request.field{:value (clojure.core/get {:mlm-5large "ml.m5.large", :mlm-42xlarge "ml.m4.2xlarge", :mlp-32xlarge "ml.p3.2xlarge", :mlp-316xlarge "ml.p3.16xlarge", "ml.m5.xlarge" "ml.m5.xlarge", "ml.c5.xlarge" "ml.c5.xlarge", "ml.m4.2xlarge" "ml.m4.2xlarge", "ml.c5.9xlarge" "ml.c5.9xlarge", :mlm-54xlarge "ml.m5.4xlarge", "ml.p2.16xlarge" "ml.p2.16xlarge", :mlm-52xlarge "ml.m5.2xlarge", "ml.m5.large" "ml.m5.large", :mlc-54xlarge "ml.c5.4xlarge", "ml.m5.12xlarge" "ml.m5.12xlarge", "ml.c5.2xlarge" "ml.c5.2xlarge", :mlc-52xlarge "ml.c5.2xlarge", "ml.c4.2xlarge" "ml.c4.2xlarge", "ml.c4.4xlarge" "ml.c4.4xlarge", :mlm-410xlarge "ml.m4.10xlarge", :mlm-512xlarge "ml.m5.12xlarge", "ml.m4.4xlarge" "ml.m4.4xlarge", "ml.m5.4xlarge" "ml.m5.4xlarge", "ml.m4.xlarge" "ml.m4.xlarge", "ml.m4.16xlarge" "ml.m4.16xlarge", :mlp-38xlarge "ml.p3.8xlarge", :mlm-416xlarge "ml.m4.16xlarge", "ml.p2.8xlarge" "ml.p2.8xlarge", :mlm-44xlarge "ml.m4.4xlarge", :mlc-48xlarge "ml.c4.8xlarge", "ml.p3.16xlarge" "ml.p3.16xlarge", :mlc-59xlarge "ml.c5.9xlarge", :mlc-4xlarge "ml.c4.xlarge", "ml.c4.8xlarge" "ml.c4.8xlarge", "ml.c5.18xlarge" "ml.c5.18xlarge", :mlc-42xlarge "ml.c4.2xlarge", :mlc-44xlarge "ml.c4.4xlarge", "ml.m5.2xlarge" "ml.m5.2xlarge", :mlc-518xlarge "ml.c5.18xlarge", "ml.c4.xlarge" "ml.c4.xlarge", "ml.m5.24xlarge" "ml.m5.24xlarge", "ml.p3.2xlarge" "ml.p3.2xlarge", :mlp-216xlarge "ml.p2.16xlarge", :mlm-524xlarge "ml.m5.24xlarge", :mlp-2xlarge "ml.p2.xlarge", "ml.p3.8xlarge" "ml.p3.8xlarge", :mlp-28xlarge "ml.p2.8xlarge", :mlm-5xlarge "ml.m5.xlarge", :mlm-4xlarge "ml.m4.xlarge", "ml.p2.xlarge" "ml.p2.xlarge", "ml.m4.10xlarge" "ml.m4.10xlarge", :mlc-5xlarge "ml.c5.xlarge", "ml.c5.4xlarge" "ml.c5.4xlarge"} input), :shape "TrainingInstanceType"})

(clojure.core/defn- ser-integer-parameter-range [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-parameter-key (:name input)) #:http.request.field{:name "Name", :shape "ParameterKey"}) (clojure.core/into (ser-parameter-value (:min-value input)) #:http.request.field{:name "MinValue", :shape "ParameterValue"}) (clojure.core/into (ser-parameter-value (:max-value input)) #:http.request.field{:name "MaxValue", :shape "ParameterValue"})], :shape "IntegerParameterRange", :type "structure"}))

(clojure.core/defn- ser-algorithm-image [input] #:http.request.field{:value input, :shape "AlgorithmImage"})

(clojure.core/defn- ser-last-modified-time [input] #:http.request.field{:value input, :shape "LastModifiedTime"})

(clojure.core/defn- ser-image [input] #:http.request.field{:value input, :shape "Image"})

(clojure.core/defn- ser-accept [input] #:http.request.field{:value input, :shape "Accept"})

(clojure.core/defn- ser-training-job-status [input] #:http.request.field{:value (clojure.core/get {"Failed" "Failed", :in-progress "InProgress", :completed "Completed", :stopping "Stopping", :stopped "Stopped", "InProgress" "InProgress", "Stopping" "Stopping", "Stopped" "Stopped", "Completed" "Completed", :failed "Failed"} input), :shape "TrainingJobStatus"})

(clojure.core/defn- ser-continuous-parameter-range [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-parameter-key (:name input)) #:http.request.field{:name "Name", :shape "ParameterKey"}) (clojure.core/into (ser-parameter-value (:min-value input)) #:http.request.field{:name "MinValue", :shape "ParameterValue"}) (clojure.core/into (ser-parameter-value (:max-value input)) #:http.request.field{:name "MaxValue", :shape "ParameterValue"})], :shape "ContinuousParameterRange", :type "structure"}))

(clojure.core/defn- ser-algorithm-specification [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-algorithm-image (:training-image input)) #:http.request.field{:name "TrainingImage", :shape "AlgorithmImage"}) (clojure.core/into (ser-training-input-mode (:training-input-mode input)) #:http.request.field{:name "TrainingInputMode", :shape "TrainingInputMode"})], :shape "AlgorithmSpecification", :type "structure"}))

(clojure.core/defn- ser-notebook-instance-name-contains [input] #:http.request.field{:value input, :shape "NotebookInstanceNameContains"})

(clojure.core/defn- ser-notebook-instance-name [input] #:http.request.field{:value input, :shape "NotebookInstanceName"})

(clojure.core/defn- ser-transform-instance-type [input] #:http.request.field{:value (clojure.core/get {:mlm-5large "ml.m5.large", :mlm-42xlarge "ml.m4.2xlarge", :mlp-32xlarge "ml.p3.2xlarge", :mlp-316xlarge "ml.p3.16xlarge", "ml.m5.xlarge" "ml.m5.xlarge", "ml.c5.xlarge" "ml.c5.xlarge", "ml.m4.2xlarge" "ml.m4.2xlarge", "ml.c5.9xlarge" "ml.c5.9xlarge", :mlm-54xlarge "ml.m5.4xlarge", "ml.p2.16xlarge" "ml.p2.16xlarge", :mlm-52xlarge "ml.m5.2xlarge", "ml.m5.large" "ml.m5.large", :mlc-54xlarge "ml.c5.4xlarge", "ml.m5.12xlarge" "ml.m5.12xlarge", "ml.c5.2xlarge" "ml.c5.2xlarge", :mlc-52xlarge "ml.c5.2xlarge", "ml.c4.2xlarge" "ml.c4.2xlarge", "ml.c4.4xlarge" "ml.c4.4xlarge", :mlm-410xlarge "ml.m4.10xlarge", :mlm-512xlarge "ml.m5.12xlarge", "ml.m4.4xlarge" "ml.m4.4xlarge", "ml.m5.4xlarge" "ml.m5.4xlarge", "ml.m4.xlarge" "ml.m4.xlarge", "ml.m4.16xlarge" "ml.m4.16xlarge", :mlp-38xlarge "ml.p3.8xlarge", :mlm-416xlarge "ml.m4.16xlarge", "ml.p2.8xlarge" "ml.p2.8xlarge", :mlm-44xlarge "ml.m4.4xlarge", :mlc-48xlarge "ml.c4.8xlarge", "ml.p3.16xlarge" "ml.p3.16xlarge", :mlc-59xlarge "ml.c5.9xlarge", :mlc-4xlarge "ml.c4.xlarge", "ml.c4.8xlarge" "ml.c4.8xlarge", "ml.c5.18xlarge" "ml.c5.18xlarge", :mlc-42xlarge "ml.c4.2xlarge", :mlc-44xlarge "ml.c4.4xlarge", "ml.m5.2xlarge" "ml.m5.2xlarge", :mlc-518xlarge "ml.c5.18xlarge", "ml.c4.xlarge" "ml.c4.xlarge", "ml.m5.24xlarge" "ml.m5.24xlarge", "ml.p3.2xlarge" "ml.p3.2xlarge", :mlp-216xlarge "ml.p2.16xlarge", :mlm-524xlarge "ml.m5.24xlarge", :mlp-2xlarge "ml.p2.xlarge", "ml.p3.8xlarge" "ml.p3.8xlarge", :mlp-28xlarge "ml.p2.8xlarge", :mlm-5xlarge "ml.m5.xlarge", :mlm-4xlarge "ml.m4.xlarge", "ml.p2.xlarge" "ml.p2.xlarge", "ml.m4.10xlarge" "ml.m4.10xlarge", :mlc-5xlarge "ml.c5.xlarge", "ml.c5.4xlarge" "ml.c5.4xlarge"} input), :shape "TransformInstanceType"})

(clojure.core/defn- ser-endpoint-config-name [input] #:http.request.field{:value input, :shape "EndpointConfigName"})

(clojure.core/defn- ser-parameter-value [input] #:http.request.field{:value input, :shape "ParameterValue"})

(clojure.core/defn- req-delete-endpoint-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-endpoint-name (input :endpoint-name)) #:http.request.field{:name "EndpointName", :shape "EndpointName"})]}))

(clojure.core/defn- req-describe-notebook-instance-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-notebook-instance-name (input :notebook-instance-name)) #:http.request.field{:name "NotebookInstanceName", :shape "NotebookInstanceName"})]}))

(clojure.core/defn- req-update-endpoint-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-endpoint-name (input :endpoint-name)) #:http.request.field{:name "EndpointName", :shape "EndpointName"}) (clojure.core/into (ser-endpoint-config-name (input :endpoint-config-name)) #:http.request.field{:name "EndpointConfigName", :shape "EndpointConfigName"})]}))

(clojure.core/defn- req-create-notebook-instance-lifecycle-config-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-notebook-instance-lifecycle-config-name (input :notebook-instance-lifecycle-config-name)) #:http.request.field{:name "NotebookInstanceLifecycleConfigName", :shape "NotebookInstanceLifecycleConfigName"})]} (clojure.core/contains? input :on-create) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notebook-instance-lifecycle-config-list (input :on-create)) #:http.request.field{:name "OnCreate", :shape "NotebookInstanceLifecycleConfigList"})) (clojure.core/contains? input :on-start) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notebook-instance-lifecycle-config-list (input :on-start)) #:http.request.field{:name "OnStart", :shape "NotebookInstanceLifecycleConfigList"}))))

(clojure.core/defn- req-list-notebook-instance-lifecycle-configs-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :creation-time-after) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-creation-time (input :creation-time-after)) #:http.request.field{:name "CreationTimeAfter", :shape "CreationTime"})) (clojure.core/contains? input :name-contains) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notebook-instance-lifecycle-config-name-contains (input :name-contains)) #:http.request.field{:name "NameContains", :shape "NotebookInstanceLifecycleConfigNameContains"})) (clojure.core/contains? input :sort-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notebook-instance-lifecycle-config-sort-key (input :sort-by)) #:http.request.field{:name "SortBy", :shape "NotebookInstanceLifecycleConfigSortKey"})) (clojure.core/contains? input :creation-time-before) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-creation-time (input :creation-time-before)) #:http.request.field{:name "CreationTimeBefore", :shape "CreationTime"})) (clojure.core/contains? input :sort-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notebook-instance-lifecycle-config-sort-order (input :sort-order)) #:http.request.field{:name "SortOrder", :shape "NotebookInstanceLifecycleConfigSortOrder"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :last-modified-time-after) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-last-modified-time (input :last-modified-time-after)) #:http.request.field{:name "LastModifiedTimeAfter", :shape "LastModifiedTime"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :last-modified-time-before) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-last-modified-time (input :last-modified-time-before)) #:http.request.field{:name "LastModifiedTimeBefore", :shape "LastModifiedTime"}))))

(clojure.core/defn- req-update-notebook-instance-lifecycle-config-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-notebook-instance-lifecycle-config-name (input :notebook-instance-lifecycle-config-name)) #:http.request.field{:name "NotebookInstanceLifecycleConfigName", :shape "NotebookInstanceLifecycleConfigName"})]} (clojure.core/contains? input :on-create) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notebook-instance-lifecycle-config-list (input :on-create)) #:http.request.field{:name "OnCreate", :shape "NotebookInstanceLifecycleConfigList"})) (clojure.core/contains? input :on-start) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notebook-instance-lifecycle-config-list (input :on-start)) #:http.request.field{:name "OnStart", :shape "NotebookInstanceLifecycleConfigList"}))))

(clojure.core/defn- req-stop-hyper-parameter-tuning-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-hyper-parameter-tuning-job-name (input :hyper-parameter-tuning-job-name)) #:http.request.field{:name "HyperParameterTuningJobName", :shape "HyperParameterTuningJobName"})]}))

(clojure.core/defn- req-create-endpoint-config-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-endpoint-config-name (input :endpoint-config-name)) #:http.request.field{:name "EndpointConfigName", :shape "EndpointConfigName"}) (clojure.core/into (ser-production-variant-list (input :production-variants)) #:http.request.field{:name "ProductionVariants", :shape "ProductionVariantList"})]} (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"})) (clojure.core/contains? input :kms-key-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kms-key-id (input :kms-key-id)) #:http.request.field{:name "KmsKeyId", :shape "KmsKeyId"}))))

(clojure.core/defn- req-list-endpoint-configs-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :sort-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-endpoint-config-sort-key (input :sort-by)) #:http.request.field{:name "SortBy", :shape "EndpointConfigSortKey"})) (clojure.core/contains? input :sort-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-order-key (input :sort-order)) #:http.request.field{:name "SortOrder", :shape "OrderKey"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :name-contains) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-endpoint-config-name-contains (input :name-contains)) #:http.request.field{:name "NameContains", :shape "EndpointConfigNameContains"})) (clojure.core/contains? input :creation-time-before) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :creation-time-before)) #:http.request.field{:name "CreationTimeBefore", :shape "Timestamp"})) (clojure.core/contains? input :creation-time-after) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :creation-time-after)) #:http.request.field{:name "CreationTimeAfter", :shape "Timestamp"}))))

(clojure.core/defn- req-list-hyper-parameter-tuning-jobs-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :creation-time-after) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :creation-time-after)) #:http.request.field{:name "CreationTimeAfter", :shape "Timestamp"})) (clojure.core/contains? input :name-contains) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name-contains (input :name-contains)) #:http.request.field{:name "NameContains", :shape "NameContains"})) (clojure.core/contains? input :sort-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hyper-parameter-tuning-job-sort-by-options (input :sort-by)) #:http.request.field{:name "SortBy", :shape "HyperParameterTuningJobSortByOptions"})) (clojure.core/contains? input :creation-time-before) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :creation-time-before)) #:http.request.field{:name "CreationTimeBefore", :shape "Timestamp"})) (clojure.core/contains? input :sort-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-order (input :sort-order)) #:http.request.field{:name "SortOrder", :shape "SortOrder"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :last-modified-time-after) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :last-modified-time-after)) #:http.request.field{:name "LastModifiedTimeAfter", :shape "Timestamp"})) (clojure.core/contains? input :status-equals) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hyper-parameter-tuning-job-status (input :status-equals)) #:http.request.field{:name "StatusEquals", :shape "HyperParameterTuningJobStatus"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :box true})) (clojure.core/contains? input :last-modified-time-before) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :last-modified-time-before)) #:http.request.field{:name "LastModifiedTimeBefore", :shape "Timestamp"}))))

(clojure.core/defn- req-list-models-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :sort-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-model-sort-key (input :sort-by)) #:http.request.field{:name "SortBy", :shape "ModelSortKey"})) (clojure.core/contains? input :sort-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-order-key (input :sort-order)) #:http.request.field{:name "SortOrder", :shape "OrderKey"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :name-contains) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-model-name-contains (input :name-contains)) #:http.request.field{:name "NameContains", :shape "ModelNameContains"})) (clojure.core/contains? input :creation-time-before) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :creation-time-before)) #:http.request.field{:name "CreationTimeBefore", :shape "Timestamp"})) (clojure.core/contains? input :creation-time-after) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :creation-time-after)) #:http.request.field{:name "CreationTimeAfter", :shape "Timestamp"}))))

(clojure.core/defn- req-update-endpoint-weights-and-capacities-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-endpoint-name (input :endpoint-name)) #:http.request.field{:name "EndpointName", :shape "EndpointName"}) (clojure.core/into (ser-desired-weight-and-capacity-list (input :desired-weights-and-capacities)) #:http.request.field{:name "DesiredWeightsAndCapacities", :shape "DesiredWeightAndCapacityList"})]}))

(clojure.core/defn- req-delete-model-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-model-name (input :model-name)) #:http.request.field{:name "ModelName", :shape "ModelName"})]}))

(clojure.core/defn- req-create-transform-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-transform-job-name (input :transform-job-name)) #:http.request.field{:name "TransformJobName", :shape "TransformJobName"}) (clojure.core/into (ser-model-name (input :model-name)) #:http.request.field{:name "ModelName", :shape "ModelName"}) (clojure.core/into (ser-transform-input (input :transform-input)) #:http.request.field{:name "TransformInput", :shape "TransformInput"}) (clojure.core/into (ser-transform-output (input :transform-output)) #:http.request.field{:name "TransformOutput", :shape "TransformOutput"}) (clojure.core/into (ser-transform-resources (input :transform-resources)) #:http.request.field{:name "TransformResources", :shape "TransformResources"})]} (clojure.core/contains? input :max-payload-in-mb) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-payload-in-mb (input :max-payload-in-mb)) #:http.request.field{:name "MaxPayloadInMB", :shape "MaxPayloadInMB"})) (clojure.core/contains? input :max-concurrent-transforms) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-concurrent-transforms (input :max-concurrent-transforms)) #:http.request.field{:name "MaxConcurrentTransforms", :shape "MaxConcurrentTransforms"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"})) (clojure.core/contains? input :batch-strategy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-batch-strategy (input :batch-strategy)) #:http.request.field{:name "BatchStrategy", :shape "BatchStrategy"})) (clojure.core/contains? input :environment) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-transform-environment-map (input :environment)) #:http.request.field{:name "Environment", :shape "TransformEnvironmentMap"}))))

(clojure.core/defn- req-create-endpoint-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-endpoint-name (input :endpoint-name)) #:http.request.field{:name "EndpointName", :shape "EndpointName"}) (clojure.core/into (ser-endpoint-config-name (input :endpoint-config-name)) #:http.request.field{:name "EndpointConfigName", :shape "EndpointConfigName"})]} (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"}))))

(clojure.core/defn- req-describe-hyper-parameter-tuning-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-hyper-parameter-tuning-job-name (input :hyper-parameter-tuning-job-name)) #:http.request.field{:name "HyperParameterTuningJobName", :shape "HyperParameterTuningJobName"})]}))

(clojure.core/defn- req-describe-endpoint-config-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-endpoint-config-name (input :endpoint-config-name)) #:http.request.field{:name "EndpointConfigName", :shape "EndpointConfigName"})]}))

(clojure.core/defn- req-stop-transform-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-transform-job-name (input :transform-job-name)) #:http.request.field{:name "TransformJobName", :shape "TransformJobName"})]}))

(clojure.core/defn- req-describe-transform-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-transform-job-name (input :transform-job-name)) #:http.request.field{:name "TransformJobName", :shape "TransformJobName"})]}))

(clojure.core/defn- req-create-model-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-model-name (input :model-name)) #:http.request.field{:name "ModelName", :shape "ModelName"}) (clojure.core/into (ser-container-definition (input :primary-container)) #:http.request.field{:name "PrimaryContainer", :shape "ContainerDefinition"}) (clojure.core/into (ser-role-arn (input :execution-role-arn)) #:http.request.field{:name "ExecutionRoleArn", :shape "RoleArn"})]} (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"})) (clojure.core/contains? input :vpc-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-vpc-config (input :vpc-config)) #:http.request.field{:name "VpcConfig", :shape "VpcConfig"}))))

(clojure.core/defn- req-create-notebook-instance-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-notebook-instance-name (input :notebook-instance-name)) #:http.request.field{:name "NotebookInstanceName", :shape "NotebookInstanceName"}) (clojure.core/into (ser-instance-type (input :instance-type)) #:http.request.field{:name "InstanceType", :shape "InstanceType"}) (clojure.core/into (ser-role-arn (input :role-arn)) #:http.request.field{:name "RoleArn", :shape "RoleArn"})]} (clojure.core/contains? input :security-group-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-security-group-ids (input :security-group-ids)) #:http.request.field{:name "SecurityGroupIds", :shape "SecurityGroupIds"})) (clojure.core/contains? input :subnet-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-subnet-id (input :subnet-id)) #:http.request.field{:name "SubnetId", :shape "SubnetId"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"})) (clojure.core/contains? input :direct-internet-access) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-direct-internet-access (input :direct-internet-access)) #:http.request.field{:name "DirectInternetAccess", :shape "DirectInternetAccess"})) (clojure.core/contains? input :kms-key-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kms-key-id (input :kms-key-id)) #:http.request.field{:name "KmsKeyId", :shape "KmsKeyId"})) (clojure.core/contains? input :lifecycle-config-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notebook-instance-lifecycle-config-name (input :lifecycle-config-name)) #:http.request.field{:name "LifecycleConfigName", :shape "NotebookInstanceLifecycleConfigName"}))))

(clojure.core/defn- req-delete-endpoint-config-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-endpoint-config-name (input :endpoint-config-name)) #:http.request.field{:name "EndpointConfigName", :shape "EndpointConfigName"})]}))

(clojure.core/defn- req-stop-notebook-instance-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-notebook-instance-name (input :notebook-instance-name)) #:http.request.field{:name "NotebookInstanceName", :shape "NotebookInstanceName"})]}))

(clojure.core/defn- req-start-notebook-instance-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-notebook-instance-name (input :notebook-instance-name)) #:http.request.field{:name "NotebookInstanceName", :shape "NotebookInstanceName"})]}))

(clojure.core/defn- req-delete-notebook-instance-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-notebook-instance-name (input :notebook-instance-name)) #:http.request.field{:name "NotebookInstanceName", :shape "NotebookInstanceName"})]}))

(clojure.core/defn- req-delete-tags-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-arn (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "ResourceArn"}) (clojure.core/into (ser-tag-key-list (input :tag-keys)) #:http.request.field{:name "TagKeys", :shape "TagKeyList"})]}))

(clojure.core/defn- req-update-notebook-instance-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-notebook-instance-name (input :notebook-instance-name)) #:http.request.field{:name "NotebookInstanceName", :shape "NotebookInstanceName"})]} (clojure.core/contains? input :instance-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instance-type (input :instance-type)) #:http.request.field{:name "InstanceType", :shape "InstanceType"})) (clojure.core/contains? input :role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role-arn (input :role-arn)) #:http.request.field{:name "RoleArn", :shape "RoleArn"})) (clojure.core/contains? input :lifecycle-config-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notebook-instance-lifecycle-config-name (input :lifecycle-config-name)) #:http.request.field{:name "LifecycleConfigName", :shape "NotebookInstanceLifecycleConfigName"})) (clojure.core/contains? input :disassociate-lifecycle-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-disassociate-notebook-instance-lifecycle-config (input :disassociate-lifecycle-config)) #:http.request.field{:name "DisassociateLifecycleConfig", :shape "DisassociateNotebookInstanceLifecycleConfig"}))))

(clojure.core/defn- req-add-tags-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-arn (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "ResourceArn"}) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"})]}))

(clojure.core/defn- req-list-endpoints-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :creation-time-after) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :creation-time-after)) #:http.request.field{:name "CreationTimeAfter", :shape "Timestamp"})) (clojure.core/contains? input :name-contains) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-endpoint-name-contains (input :name-contains)) #:http.request.field{:name "NameContains", :shape "EndpointNameContains"})) (clojure.core/contains? input :sort-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-endpoint-sort-key (input :sort-by)) #:http.request.field{:name "SortBy", :shape "EndpointSortKey"})) (clojure.core/contains? input :creation-time-before) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :creation-time-before)) #:http.request.field{:name "CreationTimeBefore", :shape "Timestamp"})) (clojure.core/contains? input :sort-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-order-key (input :sort-order)) #:http.request.field{:name "SortOrder", :shape "OrderKey"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"})) (clojure.core/contains? input :last-modified-time-after) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :last-modified-time-after)) #:http.request.field{:name "LastModifiedTimeAfter", :shape "Timestamp"})) (clojure.core/contains? input :status-equals) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-endpoint-status (input :status-equals)) #:http.request.field{:name "StatusEquals", :shape "EndpointStatus"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :last-modified-time-before) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :last-modified-time-before)) #:http.request.field{:name "LastModifiedTimeBefore", :shape "Timestamp"}))))

(clojure.core/defn- req-delete-notebook-instance-lifecycle-config-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-notebook-instance-lifecycle-config-name (input :notebook-instance-lifecycle-config-name)) #:http.request.field{:name "NotebookInstanceLifecycleConfigName", :shape "NotebookInstanceLifecycleConfigName"})]}))

(clojure.core/defn- req-list-training-jobs-for-hyper-parameter-tuning-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-hyper-parameter-tuning-job-name (input :hyper-parameter-tuning-job-name)) #:http.request.field{:name "HyperParameterTuningJobName", :shape "HyperParameterTuningJobName"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :status-equals) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-training-job-status (input :status-equals)) #:http.request.field{:name "StatusEquals", :shape "TrainingJobStatus"})) (clojure.core/contains? input :sort-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-training-job-sort-by-options (input :sort-by)) #:http.request.field{:name "SortBy", :shape "TrainingJobSortByOptions"})) (clojure.core/contains? input :sort-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-order (input :sort-order)) #:http.request.field{:name "SortOrder", :shape "SortOrder"}))))

(clojure.core/defn- req-describe-notebook-instance-lifecycle-config-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-notebook-instance-lifecycle-config-name (input :notebook-instance-lifecycle-config-name)) #:http.request.field{:name "NotebookInstanceLifecycleConfigName", :shape "NotebookInstanceLifecycleConfigName"})]}))

(clojure.core/defn- req-list-training-jobs-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :creation-time-after) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :creation-time-after)) #:http.request.field{:name "CreationTimeAfter", :shape "Timestamp"})) (clojure.core/contains? input :name-contains) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name-contains (input :name-contains)) #:http.request.field{:name "NameContains", :shape "NameContains"})) (clojure.core/contains? input :sort-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-by (input :sort-by)) #:http.request.field{:name "SortBy", :shape "SortBy"})) (clojure.core/contains? input :creation-time-before) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :creation-time-before)) #:http.request.field{:name "CreationTimeBefore", :shape "Timestamp"})) (clojure.core/contains? input :sort-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-order (input :sort-order)) #:http.request.field{:name "SortOrder", :shape "SortOrder"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :last-modified-time-after) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :last-modified-time-after)) #:http.request.field{:name "LastModifiedTimeAfter", :shape "Timestamp"})) (clojure.core/contains? input :status-equals) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-training-job-status (input :status-equals)) #:http.request.field{:name "StatusEquals", :shape "TrainingJobStatus"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :box true})) (clojure.core/contains? input :last-modified-time-before) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :last-modified-time-before)) #:http.request.field{:name "LastModifiedTimeBefore", :shape "Timestamp"}))))

(clojure.core/defn- req-stop-training-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-training-job-name (input :training-job-name)) #:http.request.field{:name "TrainingJobName", :shape "TrainingJobName"})]}))

(clojure.core/defn- req-create-hyper-parameter-tuning-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-hyper-parameter-tuning-job-name (input :hyper-parameter-tuning-job-name)) #:http.request.field{:name "HyperParameterTuningJobName", :shape "HyperParameterTuningJobName"}) (clojure.core/into (ser-hyper-parameter-tuning-job-config (input :hyper-parameter-tuning-job-config)) #:http.request.field{:name "HyperParameterTuningJobConfig", :shape "HyperParameterTuningJobConfig"}) (clojure.core/into (ser-hyper-parameter-training-job-definition (input :training-job-definition)) #:http.request.field{:name "TrainingJobDefinition", :shape "HyperParameterTrainingJobDefinition"})]} (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"}))))

(clojure.core/defn- req-create-training-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-training-job-name (input :training-job-name)) #:http.request.field{:name "TrainingJobName", :shape "TrainingJobName"}) (clojure.core/into (ser-algorithm-specification (input :algorithm-specification)) #:http.request.field{:name "AlgorithmSpecification", :shape "AlgorithmSpecification"}) (clojure.core/into (ser-role-arn (input :role-arn)) #:http.request.field{:name "RoleArn", :shape "RoleArn"}) (clojure.core/into (ser-input-data-config (input :input-data-config)) #:http.request.field{:name "InputDataConfig", :shape "InputDataConfig"}) (clojure.core/into (ser-output-data-config (input :output-data-config)) #:http.request.field{:name "OutputDataConfig", :shape "OutputDataConfig"}) (clojure.core/into (ser-resource-config (input :resource-config)) #:http.request.field{:name "ResourceConfig", :shape "ResourceConfig"}) (clojure.core/into (ser-stopping-condition (input :stopping-condition)) #:http.request.field{:name "StoppingCondition", :shape "StoppingCondition"})]} (clojure.core/contains? input :hyper-parameters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hyper-parameters (input :hyper-parameters)) #:http.request.field{:name "HyperParameters", :shape "HyperParameters"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"})) (clojure.core/contains? input :vpc-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-vpc-config (input :vpc-config)) #:http.request.field{:name "VpcConfig", :shape "VpcConfig"}))))

(clojure.core/defn- req-create-presigned-notebook-instance-url-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-notebook-instance-name (input :notebook-instance-name)) #:http.request.field{:name "NotebookInstanceName", :shape "NotebookInstanceName"})]} (clojure.core/contains? input :session-expiration-duration-in-seconds) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-session-expiration-duration-in-seconds (input :session-expiration-duration-in-seconds)) #:http.request.field{:name "SessionExpirationDurationInSeconds", :shape "SessionExpirationDurationInSeconds"}))))

(clojure.core/defn- req-list-transform-jobs-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :creation-time-after) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :creation-time-after)) #:http.request.field{:name "CreationTimeAfter", :shape "Timestamp"})) (clojure.core/contains? input :name-contains) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name-contains (input :name-contains)) #:http.request.field{:name "NameContains", :shape "NameContains"})) (clojure.core/contains? input :sort-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-by (input :sort-by)) #:http.request.field{:name "SortBy", :shape "SortBy"})) (clojure.core/contains? input :creation-time-before) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :creation-time-before)) #:http.request.field{:name "CreationTimeBefore", :shape "Timestamp"})) (clojure.core/contains? input :sort-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-order (input :sort-order)) #:http.request.field{:name "SortOrder", :shape "SortOrder"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :last-modified-time-after) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :last-modified-time-after)) #:http.request.field{:name "LastModifiedTimeAfter", :shape "Timestamp"})) (clojure.core/contains? input :status-equals) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-transform-job-status (input :status-equals)) #:http.request.field{:name "StatusEquals", :shape "TransformJobStatus"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :box true})) (clojure.core/contains? input :last-modified-time-before) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :last-modified-time-before)) #:http.request.field{:name "LastModifiedTimeBefore", :shape "Timestamp"}))))

(clojure.core/defn- req-describe-endpoint-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-endpoint-name (input :endpoint-name)) #:http.request.field{:name "EndpointName", :shape "EndpointName"})]}))

(clojure.core/defn- req-describe-model-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-model-name (input :model-name)) #:http.request.field{:name "ModelName", :shape "ModelName"})]}))

(clojure.core/defn- req-list-tags-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-arn (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "ResourceArn"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-tags-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "ListTagsMaxResults"}))))

(clojure.core/defn- req-list-notebook-instances-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :creation-time-after) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-creation-time (input :creation-time-after)) #:http.request.field{:name "CreationTimeAfter", :shape "CreationTime"})) (clojure.core/contains? input :name-contains) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notebook-instance-name-contains (input :name-contains)) #:http.request.field{:name "NameContains", :shape "NotebookInstanceNameContains"})) (clojure.core/contains? input :sort-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notebook-instance-sort-key (input :sort-by)) #:http.request.field{:name "SortBy", :shape "NotebookInstanceSortKey"})) (clojure.core/contains? input :creation-time-before) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-creation-time (input :creation-time-before)) #:http.request.field{:name "CreationTimeBefore", :shape "CreationTime"})) (clojure.core/contains? input :sort-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notebook-instance-sort-order (input :sort-order)) #:http.request.field{:name "SortOrder", :shape "NotebookInstanceSortOrder"})) (clojure.core/contains? input :notebook-instance-lifecycle-config-name-contains) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notebook-instance-lifecycle-config-name (input :notebook-instance-lifecycle-config-name-contains)) #:http.request.field{:name "NotebookInstanceLifecycleConfigNameContains", :shape "NotebookInstanceLifecycleConfigName"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :last-modified-time-after) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-last-modified-time (input :last-modified-time-after)) #:http.request.field{:name "LastModifiedTimeAfter", :shape "LastModifiedTime"})) (clojure.core/contains? input :status-equals) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notebook-instance-status (input :status-equals)) #:http.request.field{:name "StatusEquals", :shape "NotebookInstanceStatus"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :last-modified-time-before) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-last-modified-time (input :last-modified-time-before)) #:http.request.field{:name "LastModifiedTimeBefore", :shape "LastModifiedTime"}))))

(clojure.core/defn- req-describe-training-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-training-job-name (input :training-job-name)) #:http.request.field{:name "TrainingJobName", :shape "TrainingJobName"})]}))

(clojure.core/declare deser-resource-config)

(clojure.core/declare deser-input-data-config)

(clojure.core/declare deser-objective-status-counter)

(clojure.core/declare deser-task-count)

(clojure.core/declare deser-compression-type)

(clojure.core/declare deser-output-data-config)

(clojure.core/declare deser-metric-regex)

(clojure.core/declare deser-model-name)

(clojure.core/declare deser-endpoint-status)

(clojure.core/declare deser-hyper-parameter-tuning-job-status)

(clojure.core/declare deser-endpoint-config-summary-list)

(clojure.core/declare deser-variant-name)

(clojure.core/declare deser-endpoint-summary)

(clojure.core/declare deser-max-payload-in-mb)

(clojure.core/declare deser-max-number-of-training-jobs)

(clojure.core/declare deser-parameter-key)

(clojure.core/declare deser-transform-resources)

(clojure.core/declare deser-training-job-status-counter)

(clojure.core/declare deser-volume-size-in-gb)

(clojure.core/declare deser-security-group-ids)

(clojure.core/declare deser-hyper-parameters)

(clojure.core/declare deser-hyper-parameter-tuning-job-strategy-type)

(clojure.core/declare deser-continuous-parameter-ranges)

(clojure.core/declare deser-notebook-instance-arn)

(clojure.core/declare deser-hyper-parameter-training-job-summaries)

(clojure.core/declare deser-subnets)

(clojure.core/declare deser-transform-instance-count)

(clojure.core/declare deser-transform-data-source)

(clojure.core/declare deser-resource-limits)

(clojure.core/declare deser-training-instance-count)

(clojure.core/declare deser-subnet-id)

(clojure.core/declare deser-s-3-data-type)

(clojure.core/declare deser-s-3-data-distribution)

(clojure.core/declare deser-status-message)

(clojure.core/declare deser-transform-s-3-data-source)

(clojure.core/declare deser-max-concurrent-transforms)

(clojure.core/declare deser-container-hostname)

(clojure.core/declare deser-instance-type)

(clojure.core/declare deser-final-hyper-parameter-tuning-job-objective-metric)

(clojure.core/declare deser-role-arn)

(clojure.core/declare deser-training-input-mode)

(clojure.core/declare deser-transform-input)

(clojure.core/declare deser-s-3-uri)

(clojure.core/declare deser-tag-key)

(clojure.core/declare deser-transform-job-summary)

(clojure.core/declare deser-production-variant-instance-type)

(clojure.core/declare deser-pagination-token)

(clojure.core/declare deser-parameter-values)

(clojure.core/declare deser-production-variant-list)

(clojure.core/declare deser-network-interface-id)

(clojure.core/declare deser-environment-map)

(clojure.core/declare deser-max-parallel-training-jobs)

(clojure.core/declare deser-notebook-instance-lifecycle-config-name)

(clojure.core/declare deser-notebook-instance-url)

(clojure.core/declare deser-vpc-security-group-ids)

(clojure.core/declare deser-notebook-instance-status)

(clojure.core/declare deser-next-token)

(clojure.core/declare deser-objective-status)

(clojure.core/declare deser-training-job-arn)

(clojure.core/declare deser-endpoint-name)

(clojure.core/declare deser-hyper-parameter-tuning-job-config)

(clojure.core/declare deser-endpoint-config-arn)

(clojure.core/declare deser-content-type)

(clojure.core/declare deser-objective-status-counters)

(clojure.core/declare deser-hyper-parameter-tuning-job-summaries)

(clojure.core/declare deser-transform-environment-value)

(clojure.core/declare deser-direct-internet-access)

(clojure.core/declare deser-transform-environment-map)

(clojure.core/declare deser-s-3-data-source)

(clojure.core/declare deser-notebook-instance-lifecycle-config-arn)

(clojure.core/declare deser-stopping-condition)

(clojure.core/declare deser-transform-job-summaries)

(clojure.core/declare deser-tag-list)

(clojure.core/declare deser-secondary-status)

(clojure.core/declare deser-notebook-instance-lifecycle-config-summary)

(clojure.core/declare deser-environment-value)

(clojure.core/declare deser-categorical-parameter-range)

(clojure.core/declare deser-hyper-parameter-tuning-job-objective-type)

(clojure.core/declare deser-training-job-summary)

(clojure.core/declare deser-max-runtime-in-seconds)

(clojure.core/declare deser-transform-environment-key)

(clojure.core/declare deser-metric-definition-list)

(clojure.core/declare deser-channel-name)

(clojure.core/declare deser-categorical-parameter-ranges)

(clojure.core/declare deser-hyper-parameter-tuning-job-arn)

(clojure.core/declare deser-notebook-instance-lifecycle-config-list)

(clojure.core/declare deser-model-summary)

(clojure.core/declare deser-hyper-parameter-algorithm-specification)

(clojure.core/declare deser-url)

(clojure.core/declare deser-notebook-instance-lifecycle-config-content)

(clojure.core/declare deser-tag-value)

(clojure.core/declare deser-container-definition)

(clojure.core/declare deser-model-summary-list)

(clojure.core/declare deser-parameter-ranges)

(clojure.core/declare deser-production-variant)

(clojure.core/declare deser-security-group-id)

(clojure.core/declare deser-notebook-instance-lifecycle-hook)

(clojure.core/declare deser-failure-reason)

(clojure.core/declare deser-endpoint-config-summary)

(clojure.core/declare deser-transform-job-name)

(clojure.core/declare deser-transform-job-arn)

(clojure.core/declare deser-kms-key-id)

(clojure.core/declare deser-batch-strategy)

(clojure.core/declare deser-environment-key)

(clojure.core/declare deser-endpoint-summary-list)

(clojure.core/declare deser-data-source)

(clojure.core/declare deser-notebook-instance-summary-list)

(clojure.core/declare deser-training-job-status-counters)

(clojure.core/declare deser-assembly-type)

(clojure.core/declare deser-variant-weight)

(clojure.core/declare deser-split-type)

(clojure.core/declare deser-metric-value)

(clojure.core/declare deser-production-variant-summary-list)

(clojure.core/declare deser-production-variant-summary)

(clojure.core/declare deser-creation-time)

(clojure.core/declare deser-hyper-parameter-training-job-summary)

(clojure.core/declare deser-metric-definition)

(clojure.core/declare deser-vpc-config)

(clojure.core/declare deser-notebook-instance-summary)

(clojure.core/declare deser-hyper-parameter-tuning-job-name)

(clojure.core/declare deser-training-job-name)

(clojure.core/declare deser-transform-job-status)

(clojure.core/declare deser-transform-output)

(clojure.core/declare deser-notebook-instance-lifecycle-config-summary-list)

(clojure.core/declare deser-hyper-parameter-training-job-definition)

(clojure.core/declare deser-timestamp)

(clojure.core/declare deser-hyper-parameter-tuning-job-summary)

(clojure.core/declare deser-model-artifacts)

(clojure.core/declare deser-record-wrapper)

(clojure.core/declare deser-channel)

(clojure.core/declare deser-hyper-parameter-tuning-job-objective)

(clojure.core/declare deser-secondary-status-transition)

(clojure.core/declare deser-deployed-images)

(clojure.core/declare deser-tag)

(clojure.core/declare deser-metric-name)

(clojure.core/declare deser-integer-parameter-ranges)

(clojure.core/declare deser-training-instance-type)

(clojure.core/declare deser-integer-parameter-range)

(clojure.core/declare deser-algorithm-image)

(clojure.core/declare deser-last-modified-time)

(clojure.core/declare deser-image)

(clojure.core/declare deser-accept)

(clojure.core/declare deser-training-job-summaries)

(clojure.core/declare deser-training-job-status)

(clojure.core/declare deser-continuous-parameter-range)

(clojure.core/declare deser-algorithm-specification)

(clojure.core/declare deser-endpoint-arn)

(clojure.core/declare deser-notebook-instance-name)

(clojure.core/declare deser-secondary-status-transitions)

(clojure.core/declare deser-deployed-image)

(clojure.core/declare deser-transform-instance-type)

(clojure.core/declare deser-endpoint-config-name)

(clojure.core/declare deser-parameter-value)

(clojure.core/declare deser-model-arn)

(clojure.core/defn- deser-resource-config [input] (clojure.core/cond-> {:instance-type (deser-training-instance-type (input "InstanceType")), :instance-count (deser-training-instance-count (input "InstanceCount")), :volume-size-in-gb (deser-volume-size-in-gb (input "VolumeSizeInGB"))} (clojure.core/contains? input "VolumeKmsKeyId") (clojure.core/assoc :volume-kms-key-id (deser-kms-key-id (input "VolumeKmsKeyId")))))

(clojure.core/defn- deser-input-data-config [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-channel coll))) input))

(clojure.core/defn- deser-objective-status-counter [input] input)

(clojure.core/defn- deser-task-count [input] input)

(clojure.core/defn- deser-compression-type [input] (clojure.core/get {"None" :none, "Gzip" :gzip} input))

(clojure.core/defn- deser-output-data-config [input] (clojure.core/cond-> {:s-3-output-path (deser-s-3-uri (input "S3OutputPath"))} (clojure.core/contains? input "KmsKeyId") (clojure.core/assoc :kms-key-id (deser-kms-key-id (input "KmsKeyId")))))

(clojure.core/defn- deser-metric-regex [input] input)

(clojure.core/defn- deser-model-name [input] input)

(clojure.core/defn- deser-endpoint-status [input] (clojure.core/get {"OutOfService" :out-of-service, "Creating" :creating, "Updating" :updating, "SystemUpdating" :system-updating, "RollingBack" :rolling-back, "InService" :in-service, "Deleting" :deleting, "Failed" :failed} input))

(clojure.core/defn- deser-hyper-parameter-tuning-job-status [input] (clojure.core/get {"Completed" :completed, "InProgress" :in-progress, "Failed" :failed, "Stopped" :stopped, "Stopping" :stopping} input))

(clojure.core/defn- deser-endpoint-config-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-endpoint-config-summary coll))) input))

(clojure.core/defn- deser-variant-name [input] input)

(clojure.core/defn- deser-endpoint-summary [input] (clojure.core/cond-> {:endpoint-name (deser-endpoint-name (input "EndpointName")), :endpoint-arn (deser-endpoint-arn (input "EndpointArn")), :creation-time (deser-timestamp (input "CreationTime")), :last-modified-time (deser-timestamp (input "LastModifiedTime")), :endpoint-status (deser-endpoint-status (input "EndpointStatus"))}))

(clojure.core/defn- deser-max-payload-in-mb [input] input)

(clojure.core/defn- deser-max-number-of-training-jobs [input] input)

(clojure.core/defn- deser-parameter-key [input] input)

(clojure.core/defn- deser-transform-resources [input] (clojure.core/cond-> {:instance-type (deser-transform-instance-type (input "InstanceType")), :instance-count (deser-transform-instance-count (input "InstanceCount"))} (clojure.core/contains? input "VolumeKmsKeyId") (clojure.core/assoc :volume-kms-key-id (deser-kms-key-id (input "VolumeKmsKeyId")))))

(clojure.core/defn- deser-training-job-status-counter [input] input)

(clojure.core/defn- deser-volume-size-in-gb [input] input)

(clojure.core/defn- deser-security-group-ids [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-security-group-id coll))) input))

(clojure.core/defn- deser-hyper-parameters [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-parameter-key k) (deser-parameter-value v)])) input))

(clojure.core/defn- deser-hyper-parameter-tuning-job-strategy-type [input] (clojure.core/get {"Bayesian" :bayesian} input))

(clojure.core/defn- deser-continuous-parameter-ranges [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-continuous-parameter-range coll))) input))

(clojure.core/defn- deser-notebook-instance-arn [input] input)

(clojure.core/defn- deser-hyper-parameter-training-job-summaries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-hyper-parameter-training-job-summary coll))) input))

(clojure.core/defn- deser-subnets [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-subnet-id coll))) input))

(clojure.core/defn- deser-transform-instance-count [input] input)

(clojure.core/defn- deser-transform-data-source [input] (clojure.core/cond-> {:s-3-data-source (deser-transform-s-3-data-source (input "S3DataSource"))}))

(clojure.core/defn- deser-resource-limits [input] (clojure.core/cond-> {:max-number-of-training-jobs (deser-max-number-of-training-jobs (input "MaxNumberOfTrainingJobs")), :max-parallel-training-jobs (deser-max-parallel-training-jobs (input "MaxParallelTrainingJobs"))}))

(clojure.core/defn- deser-training-instance-count [input] input)

(clojure.core/defn- deser-subnet-id [input] input)

(clojure.core/defn- deser-s-3-data-type [input] (clojure.core/get {"ManifestFile" :manifest-file, "S3Prefix" :s-3-prefix} input))

(clojure.core/defn- deser-s-3-data-distribution [input] (clojure.core/get {"FullyReplicated" :fully-replicated, "ShardedByS3Key" :sharded-by-s-3-key} input))

(clojure.core/defn- deser-status-message [input] input)

(clojure.core/defn- deser-transform-s-3-data-source [input] (clojure.core/cond-> {:s-3-data-type (deser-s-3-data-type (input "S3DataType")), :s-3-uri (deser-s-3-uri (input "S3Uri"))}))

(clojure.core/defn- deser-max-concurrent-transforms [input] input)

(clojure.core/defn- deser-container-hostname [input] input)

(clojure.core/defn- deser-instance-type [input] (clojure.core/get {"ml.t2.large" :mlt-2large, "ml.m4.2xlarge" :mlm-42xlarge, "ml.p2.16xlarge" :mlp-216xlarge, "ml.t2.2xlarge" :mlt-22xlarge, "ml.m4.4xlarge" :mlm-44xlarge, "ml.m4.xlarge" :mlm-4xlarge, "ml.m4.16xlarge" :mlm-416xlarge, "ml.p2.8xlarge" :mlp-28xlarge, "ml.t2.xlarge" :mlt-2xlarge, "ml.p3.16xlarge" :mlp-316xlarge, "ml.p3.2xlarge" :mlp-32xlarge, "ml.p3.8xlarge" :mlp-38xlarge, "ml.p2.xlarge" :mlp-2xlarge, "ml.m4.10xlarge" :mlm-410xlarge, "ml.t2.medium" :mlt-2medium} input))

(clojure.core/defn- deser-final-hyper-parameter-tuning-job-objective-metric [input] (clojure.core/cond-> {:metric-name (deser-metric-name (input "MetricName")), :value (deser-metric-value (input "Value"))} (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-hyper-parameter-tuning-job-objective-type (input "Type")))))

(clojure.core/defn- deser-role-arn [input] input)

(clojure.core/defn- deser-training-input-mode [input] (clojure.core/get {"Pipe" :pipe, "File" :file} input))

(clojure.core/defn- deser-transform-input [input] (clojure.core/cond-> {:data-source (deser-transform-data-source (input "DataSource"))} (clojure.core/contains? input "ContentType") (clojure.core/assoc :content-type (deser-content-type (input "ContentType"))) (clojure.core/contains? input "CompressionType") (clojure.core/assoc :compression-type (deser-compression-type (input "CompressionType"))) (clojure.core/contains? input "SplitType") (clojure.core/assoc :split-type (deser-split-type (input "SplitType")))))

(clojure.core/defn- deser-s-3-uri [input] input)

(clojure.core/defn- deser-tag-key [input] input)

(clojure.core/defn- deser-transform-job-summary [input] (clojure.core/cond-> {:transform-job-name (deser-transform-job-name (input "TransformJobName")), :transform-job-arn (deser-transform-job-arn (input "TransformJobArn")), :creation-time (deser-timestamp (input "CreationTime")), :transform-job-status (deser-transform-job-status (input "TransformJobStatus"))} (clojure.core/contains? input "TransformEndTime") (clojure.core/assoc :transform-end-time (deser-timestamp (input "TransformEndTime"))) (clojure.core/contains? input "LastModifiedTime") (clojure.core/assoc :last-modified-time (deser-timestamp (input "LastModifiedTime"))) (clojure.core/contains? input "FailureReason") (clojure.core/assoc :failure-reason (deser-failure-reason (input "FailureReason")))))

(clojure.core/defn- deser-production-variant-instance-type [input] (clojure.core/get {"ml.t2.large" :mlt-2large, "ml.c4.large" :mlc-4large, "ml.m5.xlarge" :mlm-5xlarge, "ml.c5.xlarge" :mlc-5xlarge, "ml.m4.2xlarge" :mlm-42xlarge, "ml.c5.9xlarge" :mlc-59xlarge, "ml.p2.16xlarge" :mlp-216xlarge, "ml.m5.large" :mlm-5large, "ml.m5.12xlarge" :mlm-512xlarge, "ml.c5.2xlarge" :mlc-52xlarge, "ml.c4.2xlarge" :mlc-42xlarge, "ml.t2.2xlarge" :mlt-22xlarge, "ml.c5.large" :mlc-5large, "ml.c4.4xlarge" :mlc-44xlarge, "ml.m4.4xlarge" :mlm-44xlarge, "ml.m5.4xlarge" :mlm-54xlarge, "ml.m4.xlarge" :mlm-4xlarge, "ml.m4.16xlarge" :mlm-416xlarge, "ml.p2.8xlarge" :mlp-28xlarge, "ml.t2.xlarge" :mlt-2xlarge, "ml.p3.16xlarge" :mlp-316xlarge, "ml.c4.8xlarge" :mlc-48xlarge, "ml.c5.18xlarge" :mlc-518xlarge, "ml.m5.2xlarge" :mlm-52xlarge, "ml.c4.xlarge" :mlc-4xlarge, "ml.m5.24xlarge" :mlm-524xlarge, "ml.p3.2xlarge" :mlp-32xlarge, "ml.p3.8xlarge" :mlp-38xlarge, "ml.p2.xlarge" :mlp-2xlarge, "ml.m4.10xlarge" :mlm-410xlarge, "ml.t2.medium" :mlt-2medium, "ml.c5.4xlarge" :mlc-54xlarge} input))

(clojure.core/defn- deser-pagination-token [input] input)

(clojure.core/defn- deser-parameter-values [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-parameter-value coll))) input))

(clojure.core/defn- deser-production-variant-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-production-variant coll))) input))

(clojure.core/defn- deser-network-interface-id [input] input)

(clojure.core/defn- deser-environment-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-environment-key k) (deser-environment-value v)])) input))

(clojure.core/defn- deser-max-parallel-training-jobs [input] input)

(clojure.core/defn- deser-notebook-instance-lifecycle-config-name [input] input)

(clojure.core/defn- deser-notebook-instance-url [input] input)

(clojure.core/defn- deser-vpc-security-group-ids [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-security-group-id coll))) input))

(clojure.core/defn- deser-notebook-instance-status [input] (clojure.core/get {"Pending" :pending, "InService" :in-service, "Stopping" :stopping, "Stopped" :stopped, "Failed" :failed, "Deleting" :deleting, "Updating" :updating} input))

(clojure.core/defn- deser-next-token [input] input)

(clojure.core/defn- deser-objective-status [input] (clojure.core/get {"Succeeded" :succeeded, "Pending" :pending, "Failed" :failed} input))

(clojure.core/defn- deser-training-job-arn [input] input)

(clojure.core/defn- deser-endpoint-name [input] input)

(clojure.core/defn- deser-hyper-parameter-tuning-job-config [input] (clojure.core/cond-> {:strategy (deser-hyper-parameter-tuning-job-strategy-type (input "Strategy")), :hyper-parameter-tuning-job-objective (deser-hyper-parameter-tuning-job-objective (input "HyperParameterTuningJobObjective")), :resource-limits (deser-resource-limits (input "ResourceLimits")), :parameter-ranges (deser-parameter-ranges (input "ParameterRanges"))}))

(clojure.core/defn- deser-endpoint-config-arn [input] input)

(clojure.core/defn- deser-content-type [input] input)

(clojure.core/defn- deser-objective-status-counters [input] (clojure.core/cond-> {} (clojure.core/contains? input "Succeeded") (clojure.core/assoc :succeeded (deser-objective-status-counter (input "Succeeded"))) (clojure.core/contains? input "Pending") (clojure.core/assoc :pending (deser-objective-status-counter (input "Pending"))) (clojure.core/contains? input "Failed") (clojure.core/assoc :failed (deser-objective-status-counter (input "Failed")))))

(clojure.core/defn- deser-hyper-parameter-tuning-job-summaries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-hyper-parameter-tuning-job-summary coll))) input))

(clojure.core/defn- deser-transform-environment-value [input] input)

(clojure.core/defn- deser-direct-internet-access [input] (clojure.core/get {"Enabled" :enabled, "Disabled" :disabled} input))

(clojure.core/defn- deser-transform-environment-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-transform-environment-key k) (deser-transform-environment-value v)])) input))

(clojure.core/defn- deser-s-3-data-source [input] (clojure.core/cond-> {:s-3-data-type (deser-s-3-data-type (input "S3DataType")), :s-3-uri (deser-s-3-uri (input "S3Uri"))} (clojure.core/contains? input "S3DataDistributionType") (clojure.core/assoc :s-3-data-distribution-type (deser-s-3-data-distribution (input "S3DataDistributionType")))))

(clojure.core/defn- deser-notebook-instance-lifecycle-config-arn [input] input)

(clojure.core/defn- deser-stopping-condition [input] (clojure.core/cond-> {} (clojure.core/contains? input "MaxRuntimeInSeconds") (clojure.core/assoc :max-runtime-in-seconds (deser-max-runtime-in-seconds (input "MaxRuntimeInSeconds")))))

(clojure.core/defn- deser-transform-job-summaries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-transform-job-summary coll))) input))

(clojure.core/defn- deser-tag-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-secondary-status [input] (clojure.core/get {"Failed" :failed, "Downloading" :downloading, "LaunchingMLInstances" :launching-ml-instances, "DownloadingTrainingImage" :downloading-training-image, "PreparingTrainingStack" :preparing-training-stack, "MaxRuntimeExceeded" :max-runtime-exceeded, "Uploading" :uploading, "Stopping" :stopping, "Starting" :starting, "Stopped" :stopped, "Completed" :completed, "Training" :training} input))

(clojure.core/defn- deser-notebook-instance-lifecycle-config-summary [input] (clojure.core/cond-> {:notebook-instance-lifecycle-config-name (deser-notebook-instance-lifecycle-config-name (input "NotebookInstanceLifecycleConfigName")), :notebook-instance-lifecycle-config-arn (deser-notebook-instance-lifecycle-config-arn (input "NotebookInstanceLifecycleConfigArn"))} (clojure.core/contains? input "CreationTime") (clojure.core/assoc :creation-time (deser-creation-time (input "CreationTime"))) (clojure.core/contains? input "LastModifiedTime") (clojure.core/assoc :last-modified-time (deser-last-modified-time (input "LastModifiedTime")))))

(clojure.core/defn- deser-environment-value [input] input)

(clojure.core/defn- deser-categorical-parameter-range [input] (clojure.core/cond-> {:name (deser-parameter-key (input "Name")), :values (deser-parameter-values (input "Values"))}))

(clojure.core/defn- deser-hyper-parameter-tuning-job-objective-type [input] (clojure.core/get {"Maximize" :maximize, "Minimize" :minimize} input))

(clojure.core/defn- deser-training-job-summary [input] (clojure.core/cond-> {:training-job-name (deser-training-job-name (input "TrainingJobName")), :training-job-arn (deser-training-job-arn (input "TrainingJobArn")), :creation-time (deser-timestamp (input "CreationTime")), :training-job-status (deser-training-job-status (input "TrainingJobStatus"))} (clojure.core/contains? input "TrainingEndTime") (clojure.core/assoc :training-end-time (deser-timestamp (input "TrainingEndTime"))) (clojure.core/contains? input "LastModifiedTime") (clojure.core/assoc :last-modified-time (deser-timestamp (input "LastModifiedTime")))))

(clojure.core/defn- deser-max-runtime-in-seconds [input] input)

(clojure.core/defn- deser-transform-environment-key [input] input)

(clojure.core/defn- deser-metric-definition-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-metric-definition coll))) input))

(clojure.core/defn- deser-channel-name [input] input)

(clojure.core/defn- deser-categorical-parameter-ranges [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-categorical-parameter-range coll))) input))

(clojure.core/defn- deser-hyper-parameter-tuning-job-arn [input] input)

(clojure.core/defn- deser-notebook-instance-lifecycle-config-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-notebook-instance-lifecycle-hook coll))) input))

(clojure.core/defn- deser-model-summary [input] (clojure.core/cond-> {:model-name (deser-model-name (input "ModelName")), :model-arn (deser-model-arn (input "ModelArn")), :creation-time (deser-timestamp (input "CreationTime"))}))

(clojure.core/defn- deser-hyper-parameter-algorithm-specification [input] (clojure.core/cond-> {:training-image (deser-algorithm-image (input "TrainingImage")), :training-input-mode (deser-training-input-mode (input "TrainingInputMode"))} (clojure.core/contains? input "MetricDefinitions") (clojure.core/assoc :metric-definitions (deser-metric-definition-list (input "MetricDefinitions")))))

(clojure.core/defn- deser-url [input] input)

(clojure.core/defn- deser-notebook-instance-lifecycle-config-content [input] input)

(clojure.core/defn- deser-tag-value [input] input)

(clojure.core/defn- deser-container-definition [input] (clojure.core/cond-> {:image (deser-image (input "Image"))} (clojure.core/contains? input "ContainerHostname") (clojure.core/assoc :container-hostname (deser-container-hostname (input "ContainerHostname"))) (clojure.core/contains? input "ModelDataUrl") (clojure.core/assoc :model-data-url (deser-url (input "ModelDataUrl"))) (clojure.core/contains? input "Environment") (clojure.core/assoc :environment (deser-environment-map (input "Environment")))))

(clojure.core/defn- deser-model-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-model-summary coll))) input))

(clojure.core/defn- deser-parameter-ranges [input] (clojure.core/cond-> {} (clojure.core/contains? input "IntegerParameterRanges") (clojure.core/assoc :integer-parameter-ranges (deser-integer-parameter-ranges (input "IntegerParameterRanges"))) (clojure.core/contains? input "ContinuousParameterRanges") (clojure.core/assoc :continuous-parameter-ranges (deser-continuous-parameter-ranges (input "ContinuousParameterRanges"))) (clojure.core/contains? input "CategoricalParameterRanges") (clojure.core/assoc :categorical-parameter-ranges (deser-categorical-parameter-ranges (input "CategoricalParameterRanges")))))

(clojure.core/defn- deser-production-variant [input] (clojure.core/cond-> {:variant-name (deser-variant-name (input "VariantName")), :model-name (deser-model-name (input "ModelName")), :initial-instance-count (deser-task-count (input "InitialInstanceCount")), :instance-type (deser-production-variant-instance-type (input "InstanceType"))} (clojure.core/contains? input "InitialVariantWeight") (clojure.core/assoc :initial-variant-weight (deser-variant-weight (input "InitialVariantWeight")))))

(clojure.core/defn- deser-security-group-id [input] input)

(clojure.core/defn- deser-notebook-instance-lifecycle-hook [input] (clojure.core/cond-> {} (clojure.core/contains? input "Content") (clojure.core/assoc :content (deser-notebook-instance-lifecycle-config-content (input "Content")))))

(clojure.core/defn- deser-failure-reason [input] input)

(clojure.core/defn- deser-endpoint-config-summary [input] (clojure.core/cond-> {:endpoint-config-name (deser-endpoint-config-name (input "EndpointConfigName")), :endpoint-config-arn (deser-endpoint-config-arn (input "EndpointConfigArn")), :creation-time (deser-timestamp (input "CreationTime"))}))

(clojure.core/defn- deser-transform-job-name [input] input)

(clojure.core/defn- deser-transform-job-arn [input] input)

(clojure.core/defn- deser-kms-key-id [input] input)

(clojure.core/defn- deser-batch-strategy [input] (clojure.core/get {"MultiRecord" :multi-record, "SingleRecord" :single-record} input))

(clojure.core/defn- deser-environment-key [input] input)

(clojure.core/defn- deser-endpoint-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-endpoint-summary coll))) input))

(clojure.core/defn- deser-data-source [input] (clojure.core/cond-> {:s-3-data-source (deser-s-3-data-source (input "S3DataSource"))}))

(clojure.core/defn- deser-notebook-instance-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-notebook-instance-summary coll))) input))

(clojure.core/defn- deser-training-job-status-counters [input] (clojure.core/cond-> {} (clojure.core/contains? input "Completed") (clojure.core/assoc :completed (deser-training-job-status-counter (input "Completed"))) (clojure.core/contains? input "InProgress") (clojure.core/assoc :in-progress (deser-training-job-status-counter (input "InProgress"))) (clojure.core/contains? input "RetryableError") (clojure.core/assoc :retryable-error (deser-training-job-status-counter (input "RetryableError"))) (clojure.core/contains? input "NonRetryableError") (clojure.core/assoc :non-retryable-error (deser-training-job-status-counter (input "NonRetryableError"))) (clojure.core/contains? input "Stopped") (clojure.core/assoc :stopped (deser-training-job-status-counter (input "Stopped")))))

(clojure.core/defn- deser-assembly-type [input] (clojure.core/get {"None" :none, "Line" :line} input))

(clojure.core/defn- deser-variant-weight [input] input)

(clojure.core/defn- deser-split-type [input] (clojure.core/get {"None" :none, "Line" :line, "RecordIO" :record-io} input))

(clojure.core/defn- deser-metric-value [input] input)

(clojure.core/defn- deser-production-variant-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-production-variant-summary coll))) input))

(clojure.core/defn- deser-production-variant-summary [input] (clojure.core/cond-> {:variant-name (deser-variant-name (input "VariantName"))} (clojure.core/contains? input "DeployedImages") (clojure.core/assoc :deployed-images (deser-deployed-images (input "DeployedImages"))) (clojure.core/contains? input "CurrentWeight") (clojure.core/assoc :current-weight (deser-variant-weight (input "CurrentWeight"))) (clojure.core/contains? input "DesiredWeight") (clojure.core/assoc :desired-weight (deser-variant-weight (input "DesiredWeight"))) (clojure.core/contains? input "CurrentInstanceCount") (clojure.core/assoc :current-instance-count (deser-task-count (input "CurrentInstanceCount"))) (clojure.core/contains? input "DesiredInstanceCount") (clojure.core/assoc :desired-instance-count (deser-task-count (input "DesiredInstanceCount")))))

(clojure.core/defn- deser-creation-time [input] input)

(clojure.core/defn- deser-hyper-parameter-training-job-summary [input] (clojure.core/cond-> {:training-job-name (deser-training-job-name (input "TrainingJobName")), :training-job-arn (deser-training-job-arn (input "TrainingJobArn")), :creation-time (deser-timestamp (input "CreationTime")), :training-job-status (deser-training-job-status (input "TrainingJobStatus")), :tuned-hyper-parameters (deser-hyper-parameters (input "TunedHyperParameters"))} (clojure.core/contains? input "TrainingEndTime") (clojure.core/assoc :training-end-time (deser-timestamp (input "TrainingEndTime"))) (clojure.core/contains? input "FinalHyperParameterTuningJobObjectiveMetric") (clojure.core/assoc :final-hyper-parameter-tuning-job-objective-metric (deser-final-hyper-parameter-tuning-job-objective-metric (input "FinalHyperParameterTuningJobObjectiveMetric"))) (clojure.core/contains? input "ObjectiveStatus") (clojure.core/assoc :objective-status (deser-objective-status (input "ObjectiveStatus"))) (clojure.core/contains? input "FailureReason") (clojure.core/assoc :failure-reason (deser-failure-reason (input "FailureReason"))) (clojure.core/contains? input "TrainingStartTime") (clojure.core/assoc :training-start-time (deser-timestamp (input "TrainingStartTime")))))

(clojure.core/defn- deser-metric-definition [input] (clojure.core/cond-> {:name (deser-metric-name (input "Name")), :regex (deser-metric-regex (input "Regex"))}))

(clojure.core/defn- deser-vpc-config [input] (clojure.core/cond-> {:security-group-ids (deser-vpc-security-group-ids (input "SecurityGroupIds")), :subnets (deser-subnets (input "Subnets"))}))

(clojure.core/defn- deser-notebook-instance-summary [input] (clojure.core/cond-> {:notebook-instance-name (deser-notebook-instance-name (input "NotebookInstanceName")), :notebook-instance-arn (deser-notebook-instance-arn (input "NotebookInstanceArn"))} (clojure.core/contains? input "NotebookInstanceStatus") (clojure.core/assoc :notebook-instance-status (deser-notebook-instance-status (input "NotebookInstanceStatus"))) (clojure.core/contains? input "Url") (clojure.core/assoc :url (deser-notebook-instance-url (input "Url"))) (clojure.core/contains? input "InstanceType") (clojure.core/assoc :instance-type (deser-instance-type (input "InstanceType"))) (clojure.core/contains? input "CreationTime") (clojure.core/assoc :creation-time (deser-creation-time (input "CreationTime"))) (clojure.core/contains? input "LastModifiedTime") (clojure.core/assoc :last-modified-time (deser-last-modified-time (input "LastModifiedTime"))) (clojure.core/contains? input "NotebookInstanceLifecycleConfigName") (clojure.core/assoc :notebook-instance-lifecycle-config-name (deser-notebook-instance-lifecycle-config-name (input "NotebookInstanceLifecycleConfigName")))))

(clojure.core/defn- deser-hyper-parameter-tuning-job-name [input] input)

(clojure.core/defn- deser-training-job-name [input] input)

(clojure.core/defn- deser-transform-job-status [input] (clojure.core/get {"InProgress" :in-progress, "Completed" :completed, "Failed" :failed, "Stopping" :stopping, "Stopped" :stopped} input))

(clojure.core/defn- deser-transform-output [input] (clojure.core/cond-> {:s-3-output-path (deser-s-3-uri (input "S3OutputPath"))} (clojure.core/contains? input "Accept") (clojure.core/assoc :accept (deser-accept (input "Accept"))) (clojure.core/contains? input "AssembleWith") (clojure.core/assoc :assemble-with (deser-assembly-type (input "AssembleWith"))) (clojure.core/contains? input "KmsKeyId") (clojure.core/assoc :kms-key-id (deser-kms-key-id (input "KmsKeyId")))))

(clojure.core/defn- deser-notebook-instance-lifecycle-config-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-notebook-instance-lifecycle-config-summary coll))) input))

(clojure.core/defn- deser-hyper-parameter-training-job-definition [input] (clojure.core/cond-> {:algorithm-specification (deser-hyper-parameter-algorithm-specification (input "AlgorithmSpecification")), :role-arn (deser-role-arn (input "RoleArn")), :input-data-config (deser-input-data-config (input "InputDataConfig")), :output-data-config (deser-output-data-config (input "OutputDataConfig")), :resource-config (deser-resource-config (input "ResourceConfig")), :stopping-condition (deser-stopping-condition (input "StoppingCondition"))} (clojure.core/contains? input "StaticHyperParameters") (clojure.core/assoc :static-hyper-parameters (deser-hyper-parameters (input "StaticHyperParameters"))) (clojure.core/contains? input "VpcConfig") (clojure.core/assoc :vpc-config (deser-vpc-config (input "VpcConfig")))))

(clojure.core/defn- deser-timestamp [input] input)

(clojure.core/defn- deser-hyper-parameter-tuning-job-summary [input] (clojure.core/cond-> {:hyper-parameter-tuning-job-name (deser-hyper-parameter-tuning-job-name (input "HyperParameterTuningJobName")), :hyper-parameter-tuning-job-arn (deser-hyper-parameter-tuning-job-arn (input "HyperParameterTuningJobArn")), :hyper-parameter-tuning-job-status (deser-hyper-parameter-tuning-job-status (input "HyperParameterTuningJobStatus")), :strategy (deser-hyper-parameter-tuning-job-strategy-type (input "Strategy")), :creation-time (deser-timestamp (input "CreationTime")), :training-job-status-counters (deser-training-job-status-counters (input "TrainingJobStatusCounters")), :objective-status-counters (deser-objective-status-counters (input "ObjectiveStatusCounters"))} (clojure.core/contains? input "ResourceLimits") (clojure.core/assoc :resource-limits (deser-resource-limits (input "ResourceLimits"))) (clojure.core/contains? input "HyperParameterTuningEndTime") (clojure.core/assoc :hyper-parameter-tuning-end-time (deser-timestamp (input "HyperParameterTuningEndTime"))) (clojure.core/contains? input "LastModifiedTime") (clojure.core/assoc :last-modified-time (deser-timestamp (input "LastModifiedTime")))))

(clojure.core/defn- deser-model-artifacts [input] (clojure.core/cond-> {:s-3-model-artifacts (deser-s-3-uri (input "S3ModelArtifacts"))}))

(clojure.core/defn- deser-record-wrapper [input] (clojure.core/get {"None" :none, "RecordIO" :record-io} input))

(clojure.core/defn- deser-channel [input] (clojure.core/cond-> {:channel-name (deser-channel-name (input "ChannelName")), :data-source (deser-data-source (input "DataSource"))} (clojure.core/contains? input "ContentType") (clojure.core/assoc :content-type (deser-content-type (input "ContentType"))) (clojure.core/contains? input "CompressionType") (clojure.core/assoc :compression-type (deser-compression-type (input "CompressionType"))) (clojure.core/contains? input "RecordWrapperType") (clojure.core/assoc :record-wrapper-type (deser-record-wrapper (input "RecordWrapperType")))))

(clojure.core/defn- deser-hyper-parameter-tuning-job-objective [input] (clojure.core/cond-> {:type (deser-hyper-parameter-tuning-job-objective-type (input "Type")), :metric-name (deser-metric-name (input "MetricName"))}))

(clojure.core/defn- deser-secondary-status-transition [input] (clojure.core/cond-> {:status (deser-secondary-status (input "Status")), :start-time (deser-timestamp (input "StartTime"))} (clojure.core/contains? input "EndTime") (clojure.core/assoc :end-time (deser-timestamp (input "EndTime"))) (clojure.core/contains? input "StatusMessage") (clojure.core/assoc :status-message (deser-status-message (input "StatusMessage")))))

(clojure.core/defn- deser-deployed-images [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-deployed-image coll))) input))

(clojure.core/defn- deser-tag [input] (clojure.core/cond-> {:key (deser-tag-key (input "Key")), :value (deser-tag-value (input "Value"))}))

(clojure.core/defn- deser-metric-name [input] input)

(clojure.core/defn- deser-integer-parameter-ranges [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-integer-parameter-range coll))) input))

(clojure.core/defn- deser-training-instance-type [input] (clojure.core/get {"ml.m5.xlarge" :mlm-5xlarge, "ml.c5.xlarge" :mlc-5xlarge, "ml.m4.2xlarge" :mlm-42xlarge, "ml.c5.9xlarge" :mlc-59xlarge, "ml.p2.16xlarge" :mlp-216xlarge, "ml.m5.large" :mlm-5large, "ml.m5.12xlarge" :mlm-512xlarge, "ml.c5.2xlarge" :mlc-52xlarge, "ml.c4.2xlarge" :mlc-42xlarge, "ml.c4.4xlarge" :mlc-44xlarge, "ml.m4.4xlarge" :mlm-44xlarge, "ml.m5.4xlarge" :mlm-54xlarge, "ml.m4.xlarge" :mlm-4xlarge, "ml.m4.16xlarge" :mlm-416xlarge, "ml.p2.8xlarge" :mlp-28xlarge, "ml.p3.16xlarge" :mlp-316xlarge, "ml.c4.8xlarge" :mlc-48xlarge, "ml.c5.18xlarge" :mlc-518xlarge, "ml.m5.2xlarge" :mlm-52xlarge, "ml.c4.xlarge" :mlc-4xlarge, "ml.m5.24xlarge" :mlm-524xlarge, "ml.p3.2xlarge" :mlp-32xlarge, "ml.p3.8xlarge" :mlp-38xlarge, "ml.p2.xlarge" :mlp-2xlarge, "ml.m4.10xlarge" :mlm-410xlarge, "ml.c5.4xlarge" :mlc-54xlarge} input))

(clojure.core/defn- deser-integer-parameter-range [input] (clojure.core/cond-> {:name (deser-parameter-key (input "Name")), :min-value (deser-parameter-value (input "MinValue")), :max-value (deser-parameter-value (input "MaxValue"))}))

(clojure.core/defn- deser-algorithm-image [input] input)

(clojure.core/defn- deser-last-modified-time [input] input)

(clojure.core/defn- deser-image [input] input)

(clojure.core/defn- deser-accept [input] input)

(clojure.core/defn- deser-training-job-summaries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-training-job-summary coll))) input))

(clojure.core/defn- deser-training-job-status [input] (clojure.core/get {"InProgress" :in-progress, "Completed" :completed, "Failed" :failed, "Stopping" :stopping, "Stopped" :stopped} input))

(clojure.core/defn- deser-continuous-parameter-range [input] (clojure.core/cond-> {:name (deser-parameter-key (input "Name")), :min-value (deser-parameter-value (input "MinValue")), :max-value (deser-parameter-value (input "MaxValue"))}))

(clojure.core/defn- deser-algorithm-specification [input] (clojure.core/cond-> {:training-image (deser-algorithm-image (input "TrainingImage")), :training-input-mode (deser-training-input-mode (input "TrainingInputMode"))}))

(clojure.core/defn- deser-endpoint-arn [input] input)

(clojure.core/defn- deser-notebook-instance-name [input] input)

(clojure.core/defn- deser-secondary-status-transitions [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-secondary-status-transition coll))) input))

(clojure.core/defn- deser-deployed-image [input] (clojure.core/cond-> {} (clojure.core/contains? input "SpecifiedImage") (clojure.core/assoc :specified-image (deser-image (input "SpecifiedImage"))) (clojure.core/contains? input "ResolvedImage") (clojure.core/assoc :resolved-image (deser-image (input "ResolvedImage"))) (clojure.core/contains? input "ResolutionTime") (clojure.core/assoc :resolution-time (deser-timestamp (input "ResolutionTime")))))

(clojure.core/defn- deser-transform-instance-type [input] (clojure.core/get {"ml.m5.xlarge" :mlm-5xlarge, "ml.c5.xlarge" :mlc-5xlarge, "ml.m4.2xlarge" :mlm-42xlarge, "ml.c5.9xlarge" :mlc-59xlarge, "ml.p2.16xlarge" :mlp-216xlarge, "ml.m5.large" :mlm-5large, "ml.m5.12xlarge" :mlm-512xlarge, "ml.c5.2xlarge" :mlc-52xlarge, "ml.c4.2xlarge" :mlc-42xlarge, "ml.c4.4xlarge" :mlc-44xlarge, "ml.m4.4xlarge" :mlm-44xlarge, "ml.m5.4xlarge" :mlm-54xlarge, "ml.m4.xlarge" :mlm-4xlarge, "ml.m4.16xlarge" :mlm-416xlarge, "ml.p2.8xlarge" :mlp-28xlarge, "ml.p3.16xlarge" :mlp-316xlarge, "ml.c4.8xlarge" :mlc-48xlarge, "ml.c5.18xlarge" :mlc-518xlarge, "ml.m5.2xlarge" :mlm-52xlarge, "ml.c4.xlarge" :mlc-4xlarge, "ml.m5.24xlarge" :mlm-524xlarge, "ml.p3.2xlarge" :mlp-32xlarge, "ml.p3.8xlarge" :mlp-38xlarge, "ml.p2.xlarge" :mlp-2xlarge, "ml.m4.10xlarge" :mlm-410xlarge, "ml.c5.4xlarge" :mlc-54xlarge} input))

(clojure.core/defn- deser-endpoint-config-name [input] input)

(clojure.core/defn- deser-parameter-value [input] input)

(clojure.core/defn- deser-model-arn [input] input)

(clojure.core/defn- deser-list-endpoint-configs-output [input] (clojure.core/cond-> {:endpoint-configs (deser-endpoint-config-summary-list (input "EndpointConfigs"))} (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-pagination-token (input "NextToken")))))

(clojure.core/defn- deser-create-notebook-instance-lifecycle-config-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "NotebookInstanceLifecycleConfigArn") (clojure.core/assoc :notebook-instance-lifecycle-config-arn (deser-notebook-instance-lifecycle-config-arn (input "NotebookInstanceLifecycleConfigArn")))))

(clojure.core/defn- deser-list-transform-jobs-response [input] (clojure.core/cond-> {:transform-job-summaries (deser-transform-job-summaries (input "TransformJobSummaries"))} (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-next-token (input "NextToken")))))

(clojure.core/defn- deser-list-models-output [input] (clojure.core/cond-> {:models (deser-model-summary-list (input "Models"))} (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-pagination-token (input "NextToken")))))

(clojure.core/defn- deser-create-presigned-notebook-instance-url-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "AuthorizedUrl") (clojure.core/assoc :authorized-url (deser-notebook-instance-url (input "AuthorizedUrl")))))

(clojure.core/defn- deser-describe-hyper-parameter-tuning-job-response [input] (clojure.core/cond-> {:hyper-parameter-tuning-job-name (deser-hyper-parameter-tuning-job-name (input "HyperParameterTuningJobName")), :hyper-parameter-tuning-job-arn (deser-hyper-parameter-tuning-job-arn (input "HyperParameterTuningJobArn")), :hyper-parameter-tuning-job-config (deser-hyper-parameter-tuning-job-config (input "HyperParameterTuningJobConfig")), :training-job-definition (deser-hyper-parameter-training-job-definition (input "TrainingJobDefinition")), :hyper-parameter-tuning-job-status (deser-hyper-parameter-tuning-job-status (input "HyperParameterTuningJobStatus")), :creation-time (deser-timestamp (input "CreationTime")), :training-job-status-counters (deser-training-job-status-counters (input "TrainingJobStatusCounters")), :objective-status-counters (deser-objective-status-counters (input "ObjectiveStatusCounters"))} (clojure.core/contains? input "HyperParameterTuningEndTime") (clojure.core/assoc :hyper-parameter-tuning-end-time (deser-timestamp (input "HyperParameterTuningEndTime"))) (clojure.core/contains? input "BestTrainingJob") (clojure.core/assoc :best-training-job (deser-hyper-parameter-training-job-summary (input "BestTrainingJob"))) (clojure.core/contains? input "FailureReason") (clojure.core/assoc :failure-reason (deser-failure-reason (input "FailureReason"))) (clojure.core/contains? input "LastModifiedTime") (clojure.core/assoc :last-modified-time (deser-timestamp (input "LastModifiedTime")))))

(clojure.core/defn- deser-create-hyper-parameter-tuning-job-response [input] (clojure.core/cond-> {:hyper-parameter-tuning-job-arn (deser-hyper-parameter-tuning-job-arn (input "HyperParameterTuningJobArn"))}))

(clojure.core/defn- deser-describe-transform-job-response [input] (clojure.core/cond-> {:transform-job-name (deser-transform-job-name (input "TransformJobName")), :transform-job-arn (deser-transform-job-arn (input "TransformJobArn")), :transform-job-status (deser-transform-job-status (input "TransformJobStatus")), :model-name (deser-model-name (input "ModelName")), :transform-input (deser-transform-input (input "TransformInput")), :transform-resources (deser-transform-resources (input "TransformResources")), :creation-time (deser-timestamp (input "CreationTime"))} (clojure.core/contains? input "TransformEndTime") (clojure.core/assoc :transform-end-time (deser-timestamp (input "TransformEndTime"))) (clojure.core/contains? input "MaxPayloadInMB") (clojure.core/assoc :max-payload-in-mb (deser-max-payload-in-mb (input "MaxPayloadInMB"))) (clojure.core/contains? input "MaxConcurrentTransforms") (clojure.core/assoc :max-concurrent-transforms (deser-max-concurrent-transforms (input "MaxConcurrentTransforms"))) (clojure.core/contains? input "TransformStartTime") (clojure.core/assoc :transform-start-time (deser-timestamp (input "TransformStartTime"))) (clojure.core/contains? input "FailureReason") (clojure.core/assoc :failure-reason (deser-failure-reason (input "FailureReason"))) (clojure.core/contains? input "BatchStrategy") (clojure.core/assoc :batch-strategy (deser-batch-strategy (input "BatchStrategy"))) (clojure.core/contains? input "Environment") (clojure.core/assoc :environment (deser-transform-environment-map (input "Environment"))) (clojure.core/contains? input "TransformOutput") (clojure.core/assoc :transform-output (deser-transform-output (input "TransformOutput")))))

(clojure.core/defn- deser-delete-tags-output [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-describe-model-output [input] (clojure.core/cond-> {:model-name (deser-model-name (input "ModelName")), :primary-container (deser-container-definition (input "PrimaryContainer")), :execution-role-arn (deser-role-arn (input "ExecutionRoleArn")), :creation-time (deser-timestamp (input "CreationTime")), :model-arn (deser-model-arn (input "ModelArn"))} (clojure.core/contains? input "VpcConfig") (clojure.core/assoc :vpc-config (deser-vpc-config (input "VpcConfig")))))

(clojure.core/defn- deser-add-tags-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "Tags") (clojure.core/assoc :tags (deser-tag-list (input "Tags")))))

(clojure.core/defn- deser-create-model-output [input] (clojure.core/cond-> {:model-arn (deser-model-arn (input "ModelArn"))}))

(clojure.core/defn- deser-list-notebook-instances-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-next-token (input "NextToken"))) (clojure.core/contains? input "NotebookInstances") (clojure.core/assoc :notebook-instances (deser-notebook-instance-summary-list (input "NotebookInstances")))))

(clojure.core/defn- deser-describe-notebook-instance-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "NotebookInstanceArn") (clojure.core/assoc :notebook-instance-arn (deser-notebook-instance-arn (input "NotebookInstanceArn"))) (clojure.core/contains? input "SubnetId") (clojure.core/assoc :subnet-id (deser-subnet-id (input "SubnetId"))) (clojure.core/contains? input "SecurityGroups") (clojure.core/assoc :security-groups (deser-security-group-ids (input "SecurityGroups"))) (clojure.core/contains? input "InstanceType") (clojure.core/assoc :instance-type (deser-instance-type (input "InstanceType"))) (clojure.core/contains? input "RoleArn") (clojure.core/assoc :role-arn (deser-role-arn (input "RoleArn"))) (clojure.core/contains? input "NetworkInterfaceId") (clojure.core/assoc :network-interface-id (deser-network-interface-id (input "NetworkInterfaceId"))) (clojure.core/contains? input "NotebookInstanceLifecycleConfigName") (clojure.core/assoc :notebook-instance-lifecycle-config-name (deser-notebook-instance-lifecycle-config-name (input "NotebookInstanceLifecycleConfigName"))) (clojure.core/contains? input "NotebookInstanceStatus") (clojure.core/assoc :notebook-instance-status (deser-notebook-instance-status (input "NotebookInstanceStatus"))) (clojure.core/contains? input "DirectInternetAccess") (clojure.core/assoc :direct-internet-access (deser-direct-internet-access (input "DirectInternetAccess"))) (clojure.core/contains? input "Url") (clojure.core/assoc :url (deser-notebook-instance-url (input "Url"))) (clojure.core/contains? input "FailureReason") (clojure.core/assoc :failure-reason (deser-failure-reason (input "FailureReason"))) (clojure.core/contains? input "KmsKeyId") (clojure.core/assoc :kms-key-id (deser-kms-key-id (input "KmsKeyId"))) (clojure.core/contains? input "CreationTime") (clojure.core/assoc :creation-time (deser-creation-time (input "CreationTime"))) (clojure.core/contains? input "LastModifiedTime") (clojure.core/assoc :last-modified-time (deser-last-modified-time (input "LastModifiedTime"))) (clojure.core/contains? input "NotebookInstanceName") (clojure.core/assoc :notebook-instance-name (deser-notebook-instance-name (input "NotebookInstanceName")))))

(clojure.core/defn- deser-list-training-jobs-for-hyper-parameter-tuning-job-response [input] (clojure.core/cond-> {:training-job-summaries (deser-hyper-parameter-training-job-summaries (input "TrainingJobSummaries"))} (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-next-token (input "NextToken")))))

(clojure.core/defn- deser-list-training-jobs-response [input] (clojure.core/cond-> {:training-job-summaries (deser-training-job-summaries (input "TrainingJobSummaries"))} (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-next-token (input "NextToken")))))

(clojure.core/defn- deser-update-endpoint-weights-and-capacities-output [input] (clojure.core/cond-> {:endpoint-arn (deser-endpoint-arn (input "EndpointArn"))}))

(clojure.core/defn- deser-create-transform-job-response [input] (clojure.core/cond-> {:transform-job-arn (deser-transform-job-arn (input "TransformJobArn"))}))

(clojure.core/defn- deser-describe-endpoint-config-output [input] (clojure.core/cond-> {:endpoint-config-name (deser-endpoint-config-name (input "EndpointConfigName")), :endpoint-config-arn (deser-endpoint-config-arn (input "EndpointConfigArn")), :production-variants (deser-production-variant-list (input "ProductionVariants")), :creation-time (deser-timestamp (input "CreationTime"))} (clojure.core/contains? input "KmsKeyId") (clojure.core/assoc :kms-key-id (deser-kms-key-id (input "KmsKeyId")))))

(clojure.core/defn- deser-update-notebook-instance-lifecycle-config-output [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-describe-training-job-response [input] (clojure.core/cond-> {:stopping-condition (deser-stopping-condition (input "StoppingCondition")), :model-artifacts (deser-model-artifacts (input "ModelArtifacts")), :training-job-status (deser-training-job-status (input "TrainingJobStatus")), :resource-config (deser-resource-config (input "ResourceConfig")), :training-job-name (deser-training-job-name (input "TrainingJobName")), :secondary-status (deser-secondary-status (input "SecondaryStatus")), :training-job-arn (deser-training-job-arn (input "TrainingJobArn")), :algorithm-specification (deser-algorithm-specification (input "AlgorithmSpecification")), :creation-time (deser-timestamp (input "CreationTime")), :input-data-config (deser-input-data-config (input "InputDataConfig"))} (clojure.core/contains? input "TrainingEndTime") (clojure.core/assoc :training-end-time (deser-timestamp (input "TrainingEndTime"))) (clojure.core/contains? input "OutputDataConfig") (clojure.core/assoc :output-data-config (deser-output-data-config (input "OutputDataConfig"))) (clojure.core/contains? input "HyperParameters") (clojure.core/assoc :hyper-parameters (deser-hyper-parameters (input "HyperParameters"))) (clojure.core/contains? input "RoleArn") (clojure.core/assoc :role-arn (deser-role-arn (input "RoleArn"))) (clojure.core/contains? input "FailureReason") (clojure.core/assoc :failure-reason (deser-failure-reason (input "FailureReason"))) (clojure.core/contains? input "VpcConfig") (clojure.core/assoc :vpc-config (deser-vpc-config (input "VpcConfig"))) (clojure.core/contains? input "TuningJobArn") (clojure.core/assoc :tuning-job-arn (deser-hyper-parameter-tuning-job-arn (input "TuningJobArn"))) (clojure.core/contains? input "TrainingStartTime") (clojure.core/assoc :training-start-time (deser-timestamp (input "TrainingStartTime"))) (clojure.core/contains? input "LastModifiedTime") (clojure.core/assoc :last-modified-time (deser-timestamp (input "LastModifiedTime"))) (clojure.core/contains? input "SecondaryStatusTransitions") (clojure.core/assoc :secondary-status-transitions (deser-secondary-status-transitions (input "SecondaryStatusTransitions")))))

(clojure.core/defn- deser-update-notebook-instance-output [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-create-training-job-response [input] (clojure.core/cond-> {:training-job-arn (deser-training-job-arn (input "TrainingJobArn"))}))

(clojure.core/defn- deser-resource-limit-exceeded [input] (clojure.core/cond-> {} (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-failure-reason (input "Message")))))

(clojure.core/defn- deser-update-endpoint-output [input] (clojure.core/cond-> {:endpoint-arn (deser-endpoint-arn (input "EndpointArn"))}))

(clojure.core/defn- deser-create-endpoint-output [input] (clojure.core/cond-> {:endpoint-arn (deser-endpoint-arn (input "EndpointArn"))}))

(clojure.core/defn- deser-resource-not-found [input] (clojure.core/cond-> {} (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-failure-reason (input "Message")))))

(clojure.core/defn- deser-list-hyper-parameter-tuning-jobs-response [input] (clojure.core/cond-> {:hyper-parameter-tuning-job-summaries (deser-hyper-parameter-tuning-job-summaries (input "HyperParameterTuningJobSummaries"))} (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-next-token (input "NextToken")))))

(clojure.core/defn- deser-list-endpoints-output [input] (clojure.core/cond-> {:endpoints (deser-endpoint-summary-list (input "Endpoints"))} (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-pagination-token (input "NextToken")))))

(clojure.core/defn- deser-create-notebook-instance-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "NotebookInstanceArn") (clojure.core/assoc :notebook-instance-arn (deser-notebook-instance-arn (input "NotebookInstanceArn")))))

(clojure.core/defn- deser-list-tags-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "Tags") (clojure.core/assoc :tags (deser-tag-list (input "Tags"))) (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-next-token (input "NextToken")))))

(clojure.core/defn- deser-describe-endpoint-output [input] (clojure.core/cond-> {:endpoint-name (deser-endpoint-name (input "EndpointName")), :endpoint-arn (deser-endpoint-arn (input "EndpointArn")), :endpoint-config-name (deser-endpoint-config-name (input "EndpointConfigName")), :endpoint-status (deser-endpoint-status (input "EndpointStatus")), :creation-time (deser-timestamp (input "CreationTime")), :last-modified-time (deser-timestamp (input "LastModifiedTime"))} (clojure.core/contains? input "ProductionVariants") (clojure.core/assoc :production-variants (deser-production-variant-summary-list (input "ProductionVariants"))) (clojure.core/contains? input "FailureReason") (clojure.core/assoc :failure-reason (deser-failure-reason (input "FailureReason")))))

(clojure.core/defn- deser-resource-in-use [input] (clojure.core/cond-> {} (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-failure-reason (input "Message")))))

(clojure.core/defn- deser-describe-notebook-instance-lifecycle-config-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "NotebookInstanceLifecycleConfigArn") (clojure.core/assoc :notebook-instance-lifecycle-config-arn (deser-notebook-instance-lifecycle-config-arn (input "NotebookInstanceLifecycleConfigArn"))) (clojure.core/contains? input "NotebookInstanceLifecycleConfigName") (clojure.core/assoc :notebook-instance-lifecycle-config-name (deser-notebook-instance-lifecycle-config-name (input "NotebookInstanceLifecycleConfigName"))) (clojure.core/contains? input "OnCreate") (clojure.core/assoc :on-create (deser-notebook-instance-lifecycle-config-list (input "OnCreate"))) (clojure.core/contains? input "OnStart") (clojure.core/assoc :on-start (deser-notebook-instance-lifecycle-config-list (input "OnStart"))) (clojure.core/contains? input "LastModifiedTime") (clojure.core/assoc :last-modified-time (deser-last-modified-time (input "LastModifiedTime"))) (clojure.core/contains? input "CreationTime") (clojure.core/assoc :creation-time (deser-creation-time (input "CreationTime")))))

(clojure.core/defn- deser-create-endpoint-config-output [input] (clojure.core/cond-> {:endpoint-config-arn (deser-endpoint-config-arn (input "EndpointConfigArn"))}))

(clojure.core/defn- deser-list-notebook-instance-lifecycle-configs-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-next-token (input "NextToken"))) (clojure.core/contains? input "NotebookInstanceLifecycleConfigs") (clojure.core/assoc :notebook-instance-lifecycle-configs (deser-notebook-instance-lifecycle-config-summary-list (input "NotebookInstanceLifecycleConfigs")))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.resource-config/instance-type (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/training-instance-type))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.resource-config/instance-count (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/training-instance-count))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.resource-config/volume-kms-key-id (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/kms-key-id))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/resource-config (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24.resource-config/instance-type :portkey.aws.sagemaker.-2017-07-24.resource-config/instance-count :portkey.aws.sagemaker.-2017-07-24/volume-size-in-gb] :opt-un [:portkey.aws.sagemaker.-2017-07-24.resource-config/volume-kms-key-id]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/input-data-config (clojure.spec.alpha/coll-of :portkey.aws.sagemaker.-2017-07-24/channel :min-count 1 :max-count 8))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/delete-endpoint-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/endpoint-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/objective-status-counter (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/task-count (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/compression-type #{"None" :gzip :none "Gzip"})

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-endpoint-configs-output/endpoint-configs (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/endpoint-config-summary-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-endpoint-configs-output/next-token (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/pagination-token))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/list-endpoint-configs-output (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24.list-endpoint-configs-output/endpoint-configs] :opt-un [:portkey.aws.sagemaker.-2017-07-24.list-endpoint-configs-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.output-data-config/s-3-output-path (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/s-3-uri))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/output-data-config (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24.output-data-config/s-3-output-path] :opt-un [:portkey.aws.sagemaker.-2017-07-24/kms-key-id]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/describe-notebook-instance-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/notebook-instance-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/metric-regex (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 500))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/model-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 63)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9](-*[a-zA-Z0-9])*" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/name-contains (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 63)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"[a-zA-Z0-9\-]+" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/endpoint-status #{"Failed" "Creating" "SystemUpdating" :system-updating :creating "InService" "RollingBack" :deleting "OutOfService" :out-of-service "Deleting" :in-service :rolling-back :updating "Updating" :failed})

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/hyper-parameter-tuning-job-status #{"Failed" :in-progress :completed :stopping :stopped "InProgress" "Stopping" "Stopped" "Completed" :failed})

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/endpoint-config-summary-list (clojure.spec.alpha/coll-of :portkey.aws.sagemaker.-2017-07-24/endpoint-config-summary))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/update-endpoint-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/endpoint-name :portkey.aws.sagemaker.-2017-07-24/endpoint-config-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/create-notebook-instance-lifecycle-config-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.-2017-07-24/notebook-instance-lifecycle-config-arn]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/variant-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 63)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9](-*[a-zA-Z0-9])*" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.create-notebook-instance-lifecycle-config-input/on-create (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/notebook-instance-lifecycle-config-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.create-notebook-instance-lifecycle-config-input/on-start (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/notebook-instance-lifecycle-config-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/create-notebook-instance-lifecycle-config-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/notebook-instance-lifecycle-config-name] :opt-un [:portkey.aws.sagemaker.-2017-07-24.create-notebook-instance-lifecycle-config-input/on-create :portkey.aws.sagemaker.-2017-07-24.create-notebook-instance-lifecycle-config-input/on-start]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-notebook-instance-lifecycle-configs-input/creation-time-after (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/creation-time))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-notebook-instance-lifecycle-configs-input/name-contains (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/notebook-instance-lifecycle-config-name-contains))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-notebook-instance-lifecycle-configs-input/sort-by (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/notebook-instance-lifecycle-config-sort-key))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-notebook-instance-lifecycle-configs-input/creation-time-before (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/creation-time))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-notebook-instance-lifecycle-configs-input/sort-order (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/notebook-instance-lifecycle-config-sort-order))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-notebook-instance-lifecycle-configs-input/last-modified-time-after (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/last-modified-time))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-notebook-instance-lifecycle-configs-input/last-modified-time-before (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/last-modified-time))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/list-notebook-instance-lifecycle-configs-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.-2017-07-24.list-notebook-instance-lifecycle-configs-input/creation-time-after :portkey.aws.sagemaker.-2017-07-24.list-notebook-instance-lifecycle-configs-input/name-contains :portkey.aws.sagemaker.-2017-07-24.list-notebook-instance-lifecycle-configs-input/sort-by :portkey.aws.sagemaker.-2017-07-24.list-notebook-instance-lifecycle-configs-input/creation-time-before :portkey.aws.sagemaker.-2017-07-24.list-notebook-instance-lifecycle-configs-input/sort-order :portkey.aws.sagemaker.-2017-07-24/next-token :portkey.aws.sagemaker.-2017-07-24.list-notebook-instance-lifecycle-configs-input/last-modified-time-after :portkey.aws.sagemaker.-2017-07-24/max-results :portkey.aws.sagemaker.-2017-07-24.list-notebook-instance-lifecycle-configs-input/last-modified-time-before]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/sort-by #{:name "Status" :status "CreationTime" "Name" :creation-time})

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/endpoint-config-name-contains (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"[a-zA-Z0-9-]+" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/list-transform-jobs-response (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/transform-job-summaries] :opt-un [:portkey.aws.sagemaker.-2017-07-24/next-token]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.update-notebook-instance-lifecycle-config-input/on-create (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/notebook-instance-lifecycle-config-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.update-notebook-instance-lifecycle-config-input/on-start (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/notebook-instance-lifecycle-config-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/update-notebook-instance-lifecycle-config-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/notebook-instance-lifecycle-config-name] :opt-un [:portkey.aws.sagemaker.-2017-07-24.update-notebook-instance-lifecycle-config-input/on-create :portkey.aws.sagemaker.-2017-07-24.update-notebook-instance-lifecycle-config-input/on-start]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.endpoint-summary/creation-time (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.endpoint-summary/last-modified-time (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/endpoint-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/endpoint-name :portkey.aws.sagemaker.-2017-07-24/endpoint-arn :portkey.aws.sagemaker.-2017-07-24.endpoint-summary/creation-time :portkey.aws.sagemaker.-2017-07-24.endpoint-summary/last-modified-time :portkey.aws.sagemaker.-2017-07-24/endpoint-status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/max-payload-in-mb (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/max-number-of-training-jobs (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-models-output/models (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/model-summary-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-models-output/next-token (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/pagination-token))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/list-models-output (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24.list-models-output/models] :opt-un [:portkey.aws.sagemaker.-2017-07-24.list-models-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/stop-hyper-parameter-tuning-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/hyper-parameter-tuning-job-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/parameter-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.transform-resources/instance-type (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/transform-instance-type))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.transform-resources/instance-count (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/transform-instance-count))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.transform-resources/volume-kms-key-id (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/kms-key-id))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/transform-resources (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24.transform-resources/instance-type :portkey.aws.sagemaker.-2017-07-24.transform-resources/instance-count] :opt-un [:portkey.aws.sagemaker.-2017-07-24.transform-resources/volume-kms-key-id]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/training-job-status-counter (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/volume-size-in-gb (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/security-group-ids (clojure.spec.alpha/coll-of :portkey.aws.sagemaker.-2017-07-24/security-group-id :max-count 5))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.create-presigned-notebook-instance-url-output/authorized-url (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/notebook-instance-url))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/create-presigned-notebook-instance-url-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.-2017-07-24.create-presigned-notebook-instance-url-output/authorized-url]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/hyper-parameters (clojure.spec.alpha/map-of :portkey.aws.sagemaker.-2017-07-24/parameter-key :portkey.aws.sagemaker.-2017-07-24/parameter-value))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/hyper-parameter-tuning-job-strategy-type #{"Bayesian" :bayesian})

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/continuous-parameter-ranges (clojure.spec.alpha/coll-of :portkey.aws.sagemaker.-2017-07-24/continuous-parameter-range :min-count 0 :max-count 20))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.describe-hyper-parameter-tuning-job-response/hyper-parameter-tuning-end-time (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.describe-hyper-parameter-tuning-job-response/best-training-job (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/hyper-parameter-training-job-summary))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.describe-hyper-parameter-tuning-job-response/training-job-definition (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/hyper-parameter-training-job-definition))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.describe-hyper-parameter-tuning-job-response/creation-time (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.describe-hyper-parameter-tuning-job-response/last-modified-time (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/describe-hyper-parameter-tuning-job-response (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/hyper-parameter-tuning-job-name :portkey.aws.sagemaker.-2017-07-24/hyper-parameter-tuning-job-arn :portkey.aws.sagemaker.-2017-07-24/hyper-parameter-tuning-job-config :portkey.aws.sagemaker.-2017-07-24.describe-hyper-parameter-tuning-job-response/training-job-definition :portkey.aws.sagemaker.-2017-07-24/hyper-parameter-tuning-job-status :portkey.aws.sagemaker.-2017-07-24.describe-hyper-parameter-tuning-job-response/creation-time :portkey.aws.sagemaker.-2017-07-24/training-job-status-counters :portkey.aws.sagemaker.-2017-07-24/objective-status-counters] :opt-un [:portkey.aws.sagemaker.-2017-07-24.describe-hyper-parameter-tuning-job-response/hyper-parameter-tuning-end-time :portkey.aws.sagemaker.-2017-07-24.describe-hyper-parameter-tuning-job-response/best-training-job :portkey.aws.sagemaker.-2017-07-24/failure-reason :portkey.aws.sagemaker.-2017-07-24.describe-hyper-parameter-tuning-job-response/last-modified-time]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/notebook-instance-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/hyper-parameter-training-job-summaries (clojure.spec.alpha/coll-of :portkey.aws.sagemaker.-2017-07-24/hyper-parameter-training-job-summary))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/subnets (clojure.spec.alpha/coll-of :portkey.aws.sagemaker.-2017-07-24/subnet-id :min-count 1 :max-count 16))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/create-hyper-parameter-tuning-job-response (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/hyper-parameter-tuning-job-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.create-endpoint-config-input/production-variants (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/production-variant-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.create-endpoint-config-input/tags (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/tag-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/create-endpoint-config-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/endpoint-config-name :portkey.aws.sagemaker.-2017-07-24.create-endpoint-config-input/production-variants] :opt-un [:portkey.aws.sagemaker.-2017-07-24.create-endpoint-config-input/tags :portkey.aws.sagemaker.-2017-07-24/kms-key-id]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-endpoint-configs-input/sort-by (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/endpoint-config-sort-key))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-endpoint-configs-input/sort-order (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/order-key))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-endpoint-configs-input/next-token (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/pagination-token))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-endpoint-configs-input/name-contains (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/endpoint-config-name-contains))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-endpoint-configs-input/creation-time-before (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-endpoint-configs-input/creation-time-after (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/list-endpoint-configs-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.-2017-07-24.list-endpoint-configs-input/sort-by :portkey.aws.sagemaker.-2017-07-24.list-endpoint-configs-input/sort-order :portkey.aws.sagemaker.-2017-07-24.list-endpoint-configs-input/next-token :portkey.aws.sagemaker.-2017-07-24/max-results :portkey.aws.sagemaker.-2017-07-24.list-endpoint-configs-input/name-contains :portkey.aws.sagemaker.-2017-07-24.list-endpoint-configs-input/creation-time-before :portkey.aws.sagemaker.-2017-07-24.list-endpoint-configs-input/creation-time-after]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.describe-transform-job-response/transform-end-time (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.describe-transform-job-response/transform-start-time (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.describe-transform-job-response/environment (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/transform-environment-map))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.describe-transform-job-response/creation-time (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/describe-transform-job-response (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/transform-job-name :portkey.aws.sagemaker.-2017-07-24/transform-job-arn :portkey.aws.sagemaker.-2017-07-24/transform-job-status :portkey.aws.sagemaker.-2017-07-24/model-name :portkey.aws.sagemaker.-2017-07-24/transform-input :portkey.aws.sagemaker.-2017-07-24/transform-resources :portkey.aws.sagemaker.-2017-07-24.describe-transform-job-response/creation-time] :opt-un [:portkey.aws.sagemaker.-2017-07-24.describe-transform-job-response/transform-end-time :portkey.aws.sagemaker.-2017-07-24/max-payload-in-mb :portkey.aws.sagemaker.-2017-07-24/max-concurrent-transforms :portkey.aws.sagemaker.-2017-07-24.describe-transform-job-response/transform-start-time :portkey.aws.sagemaker.-2017-07-24/failure-reason :portkey.aws.sagemaker.-2017-07-24/batch-strategy :portkey.aws.sagemaker.-2017-07-24.describe-transform-job-response/environment :portkey.aws.sagemaker.-2017-07-24/transform-output]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/transform-instance-count (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.transform-data-source/s-3-data-source (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/transform-s-3-data-source))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/transform-data-source (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24.transform-data-source/s-3-data-source] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/resource-limits (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/max-number-of-training-jobs :portkey.aws.sagemaker.-2017-07-24/max-parallel-training-jobs] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/training-instance-count (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/subnet-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 32))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/s-3-data-type #{:s-3-prefix "ManifestFile" :manifest-file "S3Prefix"})

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/s-3-data-distribution #{"ShardedByS3Key" :fully-replicated "FullyReplicated" :sharded-by-s-3-key})

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/status-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/model-name-contains (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"[a-zA-Z0-9-]+" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/notebook-instance-lifecycle-config-sort-order #{"Descending" :descending :ascending "Ascending"})

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/delete-tags-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/transform-s-3-data-source (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/s-3-data-type :portkey.aws.sagemaker.-2017-07-24/s-3-uri] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/max-concurrent-transforms (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/container-hostname (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 63)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9](-*[a-zA-Z0-9])*" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-hyper-parameter-tuning-jobs-request/creation-time-after (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-hyper-parameter-tuning-jobs-request/sort-by (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/hyper-parameter-tuning-job-sort-by-options))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-hyper-parameter-tuning-jobs-request/creation-time-before (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-hyper-parameter-tuning-jobs-request/last-modified-time-after (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-hyper-parameter-tuning-jobs-request/status-equals (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/hyper-parameter-tuning-job-status))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-hyper-parameter-tuning-jobs-request/last-modified-time-before (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/list-hyper-parameter-tuning-jobs-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.-2017-07-24.list-hyper-parameter-tuning-jobs-request/creation-time-after :portkey.aws.sagemaker.-2017-07-24/name-contains :portkey.aws.sagemaker.-2017-07-24.list-hyper-parameter-tuning-jobs-request/sort-by :portkey.aws.sagemaker.-2017-07-24.list-hyper-parameter-tuning-jobs-request/creation-time-before :portkey.aws.sagemaker.-2017-07-24/sort-order :portkey.aws.sagemaker.-2017-07-24/next-token :portkey.aws.sagemaker.-2017-07-24.list-hyper-parameter-tuning-jobs-request/last-modified-time-after :portkey.aws.sagemaker.-2017-07-24.list-hyper-parameter-tuning-jobs-request/status-equals :portkey.aws.sagemaker.-2017-07-24/max-results :portkey.aws.sagemaker.-2017-07-24.list-hyper-parameter-tuning-jobs-request/last-modified-time-before]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/order-key #{"Descending" :descending :ascending "Ascending"})

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-models-input/sort-by (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/model-sort-key))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-models-input/sort-order (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/order-key))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-models-input/next-token (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/pagination-token))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-models-input/name-contains (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/model-name-contains))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-models-input/creation-time-before (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-models-input/creation-time-after (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/list-models-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.-2017-07-24.list-models-input/sort-by :portkey.aws.sagemaker.-2017-07-24.list-models-input/sort-order :portkey.aws.sagemaker.-2017-07-24.list-models-input/next-token :portkey.aws.sagemaker.-2017-07-24/max-results :portkey.aws.sagemaker.-2017-07-24.list-models-input/name-contains :portkey.aws.sagemaker.-2017-07-24.list-models-input/creation-time-before :portkey.aws.sagemaker.-2017-07-24.list-models-input/creation-time-after]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/model-sort-key #{:name "CreationTime" "Name" :creation-time})

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/instance-type #{"ml.t2.large" :mlm-42xlarge :mlp-32xlarge :mlp-316xlarge "ml.m4.2xlarge" "ml.p2.16xlarge" :mlt-2medium :mlt-2large "ml.t2.2xlarge" :mlm-410xlarge "ml.m4.4xlarge" "ml.m4.xlarge" "ml.m4.16xlarge" :mlp-38xlarge :mlt-2xlarge :mlm-416xlarge "ml.p2.8xlarge" :mlm-44xlarge "ml.t2.xlarge" :mlt-22xlarge "ml.p3.16xlarge" "ml.p3.2xlarge" :mlp-216xlarge :mlp-2xlarge "ml.p3.8xlarge" :mlp-28xlarge :mlm-4xlarge "ml.p2.xlarge" "ml.m4.10xlarge" "ml.t2.medium"})

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.describe-model-output/primary-container (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/container-definition))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.describe-model-output/execution-role-arn (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/role-arn))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.describe-model-output/creation-time (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/describe-model-output (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/model-name :portkey.aws.sagemaker.-2017-07-24.describe-model-output/primary-container :portkey.aws.sagemaker.-2017-07-24.describe-model-output/execution-role-arn :portkey.aws.sagemaker.-2017-07-24.describe-model-output/creation-time :portkey.aws.sagemaker.-2017-07-24/model-arn] :opt-un [:portkey.aws.sagemaker.-2017-07-24/vpc-config]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.final-hyper-parameter-tuning-job-objective-metric/type (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/hyper-parameter-tuning-job-objective-type))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.final-hyper-parameter-tuning-job-objective-metric/value (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/metric-value))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/final-hyper-parameter-tuning-job-objective-metric (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/metric-name :portkey.aws.sagemaker.-2017-07-24.final-hyper-parameter-tuning-job-objective-metric/value] :opt-un [:portkey.aws.sagemaker.-2017-07-24.final-hyper-parameter-tuning-job-objective-metric/type]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/hyper-parameter-tuning-job-sort-by-options #{:name "Status" :status "CreationTime" "Name" :creation-time})

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/role-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 20 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 2048)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/training-input-mode #{"Pipe" "File" :pipe :file})

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.transform-input/data-source (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/transform-data-source))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/transform-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24.transform-input/data-source] :opt-un [:portkey.aws.sagemaker.-2017-07-24/content-type :portkey.aws.sagemaker.-2017-07-24/compression-type :portkey.aws.sagemaker.-2017-07-24/split-type]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/s-3-uri (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 1024)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"^(https|s3)://([^/]+)/?(.*)$" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/endpoint-config-sort-key #{:name "CreationTime" "Name" :creation-time})

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/notebook-instance-lifecycle-config-sort-key #{:name "CreationTime" "LastModifiedTime" "Name" :last-modified-time :creation-time})

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.add-tags-output/tags (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/tag-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/add-tags-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.-2017-07-24.add-tags-output/tags]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 128)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"^((?!aws:)[\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.transform-job-summary/creation-time (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.transform-job-summary/transform-end-time (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.transform-job-summary/last-modified-time (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/transform-job-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/transform-job-name :portkey.aws.sagemaker.-2017-07-24/transform-job-arn :portkey.aws.sagemaker.-2017-07-24.transform-job-summary/creation-time :portkey.aws.sagemaker.-2017-07-24/transform-job-status] :opt-un [:portkey.aws.sagemaker.-2017-07-24.transform-job-summary/transform-end-time :portkey.aws.sagemaker.-2017-07-24.transform-job-summary/last-modified-time :portkey.aws.sagemaker.-2017-07-24/failure-reason]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/production-variant-instance-type #{:mlm-5large "ml.t2.large" :mlm-42xlarge :mlp-32xlarge :mlp-316xlarge "ml.c4.large" "ml.m5.xlarge" "ml.c5.xlarge" "ml.m4.2xlarge" "ml.c5.9xlarge" :mlm-54xlarge "ml.p2.16xlarge" :mlt-2medium :mlt-2large :mlm-52xlarge "ml.m5.large" :mlc-54xlarge "ml.m5.12xlarge" "ml.c5.2xlarge" :mlc-52xlarge "ml.c4.2xlarge" "ml.t2.2xlarge" "ml.c5.large" "ml.c4.4xlarge" :mlm-410xlarge :mlm-512xlarge "ml.m4.4xlarge" "ml.m5.4xlarge" "ml.m4.xlarge" "ml.m4.16xlarge" :mlp-38xlarge :mlc-4large :mlt-2xlarge :mlm-416xlarge "ml.p2.8xlarge" :mlm-44xlarge :mlc-48xlarge "ml.t2.xlarge" :mlt-22xlarge "ml.p3.16xlarge" :mlc-59xlarge :mlc-4xlarge "ml.c4.8xlarge" "ml.c5.18xlarge" :mlc-42xlarge :mlc-44xlarge "ml.m5.2xlarge" :mlc-518xlarge "ml.c4.xlarge" "ml.m5.24xlarge" "ml.p3.2xlarge" :mlp-216xlarge :mlm-524xlarge :mlp-2xlarge :mlc-5large "ml.p3.8xlarge" :mlp-28xlarge :mlm-5xlarge :mlm-4xlarge "ml.p2.xlarge" "ml.m4.10xlarge" :mlc-5xlarge "ml.t2.medium" "ml.c5.4xlarge"})

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/sort-order #{"Descending" :descending :ascending "Ascending"})

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/pagination-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 8192))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/parameter-values (clojure.spec.alpha/coll-of :portkey.aws.sagemaker.-2017-07-24/parameter-value :min-count 1 :max-count 20))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/production-variant-list (clojure.spec.alpha/coll-of :portkey.aws.sagemaker.-2017-07-24/production-variant :min-count 1))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/network-interface-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/environment-map (clojure.spec.alpha/map-of :portkey.aws.sagemaker.-2017-07-24/environment-key :portkey.aws.sagemaker.-2017-07-24/environment-value))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/max-parallel-training-jobs (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/notebook-instance-lifecycle-config-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 63)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9](-*[a-zA-Z0-9])*" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.update-endpoint-weights-and-capacities-input/desired-weights-and-capacities (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/desired-weight-and-capacity-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/update-endpoint-weights-and-capacities-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/endpoint-name :portkey.aws.sagemaker.-2017-07-24.update-endpoint-weights-and-capacities-input/desired-weights-and-capacities] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/delete-model-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/model-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/session-expiration-duration-in-seconds (clojure.spec.alpha/int-in 1800 43200))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/create-model-output (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/model-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/notebook-instance-url (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-notebook-instances-output/notebook-instances (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/notebook-instance-summary-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/list-notebook-instances-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.-2017-07-24/next-token :portkey.aws.sagemaker.-2017-07-24.list-notebook-instances-output/notebook-instances]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/vpc-security-group-ids (clojure.spec.alpha/coll-of :portkey.aws.sagemaker.-2017-07-24/security-group-id :min-count 1 :max-count 5))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.describe-notebook-instance-output/security-groups (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/security-group-ids))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.describe-notebook-instance-output/url (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/notebook-instance-url))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/describe-notebook-instance-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.-2017-07-24/notebook-instance-arn :portkey.aws.sagemaker.-2017-07-24/subnet-id :portkey.aws.sagemaker.-2017-07-24.describe-notebook-instance-output/security-groups :portkey.aws.sagemaker.-2017-07-24/instance-type :portkey.aws.sagemaker.-2017-07-24/role-arn :portkey.aws.sagemaker.-2017-07-24/network-interface-id :portkey.aws.sagemaker.-2017-07-24/notebook-instance-lifecycle-config-name :portkey.aws.sagemaker.-2017-07-24/notebook-instance-status :portkey.aws.sagemaker.-2017-07-24/direct-internet-access :portkey.aws.sagemaker.-2017-07-24.describe-notebook-instance-output/url :portkey.aws.sagemaker.-2017-07-24/failure-reason :portkey.aws.sagemaker.-2017-07-24/kms-key-id :portkey.aws.sagemaker.-2017-07-24/creation-time :portkey.aws.sagemaker.-2017-07-24/last-modified-time :portkey.aws.sagemaker.-2017-07-24/notebook-instance-name]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/notebook-instance-status #{"Failed" :pending "InService" :deleting :stopping :stopped "Deleting" :in-service "Stopping" :updating "Stopped" "Pending" "Updating" :failed})

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.create-transform-job-request/tags (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/tag-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.create-transform-job-request/environment (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/transform-environment-map))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/create-transform-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/transform-job-name :portkey.aws.sagemaker.-2017-07-24/model-name :portkey.aws.sagemaker.-2017-07-24/transform-input :portkey.aws.sagemaker.-2017-07-24/transform-output :portkey.aws.sagemaker.-2017-07-24/transform-resources] :opt-un [:portkey.aws.sagemaker.-2017-07-24/max-payload-in-mb :portkey.aws.sagemaker.-2017-07-24/max-concurrent-transforms :portkey.aws.sagemaker.-2017-07-24.create-transform-job-request/tags :portkey.aws.sagemaker.-2017-07-24/batch-strategy :portkey.aws.sagemaker.-2017-07-24.create-transform-job-request/environment]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/notebook-instance-sort-order #{"Descending" :descending :ascending "Ascending"})

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/notebook-instance-lifecycle-config-name-contains (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"[a-zA-Z0-9-]+" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-training-jobs-for-hyper-parameter-tuning-job-response/training-job-summaries (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/hyper-parameter-training-job-summaries))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/list-training-jobs-for-hyper-parameter-tuning-job-response (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24.list-training-jobs-for-hyper-parameter-tuning-job-response/training-job-summaries] :opt-un [:portkey.aws.sagemaker.-2017-07-24/next-token]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/list-training-jobs-response (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/training-job-summaries] :opt-un [:portkey.aws.sagemaker.-2017-07-24/next-token]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/next-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 8192))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/objective-status #{"Failed" "Succeeded" :pending "Pending" :failed :succeeded})

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.create-endpoint-input/tags (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/tag-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/create-endpoint-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/endpoint-name :portkey.aws.sagemaker.-2017-07-24/endpoint-config-name] :opt-un [:portkey.aws.sagemaker.-2017-07-24.create-endpoint-input/tags]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/describe-hyper-parameter-tuning-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/hyper-parameter-tuning-job-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/training-job-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 256)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:training-job/.*" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/endpoint-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 63)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9](-*[a-zA-Z0-9])*" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/describe-endpoint-config-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/endpoint-config-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/endpoint-sort-key #{:name "Status" :status "CreationTime" "Name" :creation-time})

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/list-tags-max-results (clojure.spec.alpha/int-in 50 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.hyper-parameter-tuning-job-config/strategy (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/hyper-parameter-tuning-job-strategy-type))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/hyper-parameter-tuning-job-config (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24.hyper-parameter-tuning-job-config/strategy :portkey.aws.sagemaker.-2017-07-24/hyper-parameter-tuning-job-objective :portkey.aws.sagemaker.-2017-07-24/resource-limits :portkey.aws.sagemaker.-2017-07-24/parameter-ranges] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/update-endpoint-weights-and-capacities-output (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/endpoint-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/endpoint-config-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 20 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/content-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.objective-status-counters/succeeded (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/objective-status-counter))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.objective-status-counters/pending (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/objective-status-counter))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.objective-status-counters/failed (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/objective-status-counter))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/objective-status-counters (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.-2017-07-24.objective-status-counters/succeeded :portkey.aws.sagemaker.-2017-07-24.objective-status-counters/pending :portkey.aws.sagemaker.-2017-07-24.objective-status-counters/failed]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/hyper-parameter-tuning-job-summaries (clojure.spec.alpha/coll-of :portkey.aws.sagemaker.-2017-07-24/hyper-parameter-tuning-job-summary))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/transform-environment-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 10240))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/direct-internet-access #{"Disabled" :disabled "Enabled" :enabled})

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/transform-environment-map (clojure.spec.alpha/map-of :portkey.aws.sagemaker.-2017-07-24/transform-environment-key :portkey.aws.sagemaker.-2017-07-24/transform-environment-value))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.s-3-data-source/s-3-data-distribution-type (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/s-3-data-distribution))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/s-3-data-source (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/s-3-data-type :portkey.aws.sagemaker.-2017-07-24/s-3-uri] :opt-un [:portkey.aws.sagemaker.-2017-07-24.s-3-data-source/s-3-data-distribution-type]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/notebook-instance-lifecycle-config-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/stopping-condition (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.-2017-07-24/max-runtime-in-seconds]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/create-transform-job-response (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/transform-job-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/transform-job-summaries (clojure.spec.alpha/coll-of :portkey.aws.sagemaker.-2017-07-24/transform-job-summary))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/tag-list (clojure.spec.alpha/coll-of :portkey.aws.sagemaker.-2017-07-24/tag :min-count 0 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/secondary-status #{:uploading "Failed" :starting "Downloading" "LaunchingMLInstances" :completed :max-runtime-exceeded "DownloadingTrainingImage" :stopping :downloading :stopped "PreparingTrainingStack" "MaxRuntimeExceeded" :downloading-training-image "Uploading" "Stopping" :training "Starting" :preparing-training-stack "Stopped" "Completed" "Training" :launching-ml-instances :failed})

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/stop-transform-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/transform-job-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/describe-transform-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/transform-job-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.sagemaker.-2017-07-24/tag-key :min-count 1 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/notebook-instance-lifecycle-config-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/notebook-instance-lifecycle-config-name :portkey.aws.sagemaker.-2017-07-24/notebook-instance-lifecycle-config-arn] :opt-un [:portkey.aws.sagemaker.-2017-07-24/creation-time :portkey.aws.sagemaker.-2017-07-24/last-modified-time]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/environment-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.categorical-parameter-range/name (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/parameter-key))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.categorical-parameter-range/values (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/parameter-values))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/categorical-parameter-range (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24.categorical-parameter-range/name :portkey.aws.sagemaker.-2017-07-24.categorical-parameter-range/values] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/hyper-parameter-tuning-job-objective-type #{"Maximize" "Minimize" :maximize :minimize})

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.training-job-summary/creation-time (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.training-job-summary/training-end-time (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.training-job-summary/last-modified-time (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/training-job-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/training-job-name :portkey.aws.sagemaker.-2017-07-24/training-job-arn :portkey.aws.sagemaker.-2017-07-24.training-job-summary/creation-time :portkey.aws.sagemaker.-2017-07-24/training-job-status] :opt-un [:portkey.aws.sagemaker.-2017-07-24.training-job-summary/training-end-time :portkey.aws.sagemaker.-2017-07-24.training-job-summary/last-modified-time]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/max-runtime-in-seconds (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/transform-environment-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 1024)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"[a-zA-Z_][a-zA-Z0-9_]*" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.create-model-input/primary-container (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/container-definition))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.create-model-input/execution-role-arn (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/role-arn))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.create-model-input/tags (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/tag-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/create-model-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/model-name :portkey.aws.sagemaker.-2017-07-24.create-model-input/primary-container :portkey.aws.sagemaker.-2017-07-24.create-model-input/execution-role-arn] :opt-un [:portkey.aws.sagemaker.-2017-07-24.create-model-input/tags :portkey.aws.sagemaker.-2017-07-24/vpc-config]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/metric-definition-list (clojure.spec.alpha/coll-of :portkey.aws.sagemaker.-2017-07-24/metric-definition :min-count 0 :max-count 20))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.describe-endpoint-config-output/production-variants (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/production-variant-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.describe-endpoint-config-output/creation-time (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/describe-endpoint-config-output (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/endpoint-config-name :portkey.aws.sagemaker.-2017-07-24/endpoint-config-arn :portkey.aws.sagemaker.-2017-07-24.describe-endpoint-config-output/production-variants :portkey.aws.sagemaker.-2017-07-24.describe-endpoint-config-output/creation-time] :opt-un [:portkey.aws.sagemaker.-2017-07-24/kms-key-id]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/notebook-instance-sort-key #{:name "Status" :status "CreationTime" "Name" :creation-time})

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/channel-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 64)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"[A-Za-z0-9\.\-_]+" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/categorical-parameter-ranges (clojure.spec.alpha/coll-of :portkey.aws.sagemaker.-2017-07-24/categorical-parameter-range :min-count 0 :max-count 20))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.create-notebook-instance-input/tags (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/tag-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.create-notebook-instance-input/lifecycle-config-name (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/notebook-instance-lifecycle-config-name))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/create-notebook-instance-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/notebook-instance-name :portkey.aws.sagemaker.-2017-07-24/instance-type :portkey.aws.sagemaker.-2017-07-24/role-arn] :opt-un [:portkey.aws.sagemaker.-2017-07-24/security-group-ids :portkey.aws.sagemaker.-2017-07-24/subnet-id :portkey.aws.sagemaker.-2017-07-24.create-notebook-instance-input/tags :portkey.aws.sagemaker.-2017-07-24/direct-internet-access :portkey.aws.sagemaker.-2017-07-24/kms-key-id :portkey.aws.sagemaker.-2017-07-24.create-notebook-instance-input/lifecycle-config-name]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/delete-endpoint-config-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/endpoint-config-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/stop-notebook-instance-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/notebook-instance-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/hyper-parameter-tuning-job-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 256)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:hyper-parameter-tuning-job/.*" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/start-notebook-instance-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/notebook-instance-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/notebook-instance-lifecycle-config-list (clojure.spec.alpha/coll-of :portkey.aws.sagemaker.-2017-07-24/notebook-instance-lifecycle-hook :max-count 1))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.model-summary/creation-time (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/model-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/model-name :portkey.aws.sagemaker.-2017-07-24/model-arn :portkey.aws.sagemaker.-2017-07-24.model-summary/creation-time] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.hyper-parameter-algorithm-specification/training-image (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/algorithm-image))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.hyper-parameter-algorithm-specification/metric-definitions (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/metric-definition-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/hyper-parameter-algorithm-specification (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24.hyper-parameter-algorithm-specification/training-image :portkey.aws.sagemaker.-2017-07-24/training-input-mode] :opt-un [:portkey.aws.sagemaker.-2017-07-24.hyper-parameter-algorithm-specification/metric-definitions]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/url (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 1024)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"^(https|s3)://([^/]+)/?(.*)$" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/delete-notebook-instance-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/notebook-instance-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/notebook-instance-lifecycle-config-content (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 16384))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.delete-tags-input/tag-keys (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/delete-tags-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/resource-arn :portkey.aws.sagemaker.-2017-07-24.delete-tags-input/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 0 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 256)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.container-definition/model-data-url (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/url))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.container-definition/environment (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/environment-map))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/container-definition (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/image] :opt-un [:portkey.aws.sagemaker.-2017-07-24/container-hostname :portkey.aws.sagemaker.-2017-07-24.container-definition/model-data-url :portkey.aws.sagemaker.-2017-07-24.container-definition/environment]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/model-summary-list (clojure.spec.alpha/coll-of :portkey.aws.sagemaker.-2017-07-24/model-summary))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.update-notebook-instance-input/lifecycle-config-name (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/notebook-instance-lifecycle-config-name))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.update-notebook-instance-input/disassociate-lifecycle-config (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/disassociate-notebook-instance-lifecycle-config))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/update-notebook-instance-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/notebook-instance-name] :opt-un [:portkey.aws.sagemaker.-2017-07-24/instance-type :portkey.aws.sagemaker.-2017-07-24/role-arn :portkey.aws.sagemaker.-2017-07-24.update-notebook-instance-input/lifecycle-config-name :portkey.aws.sagemaker.-2017-07-24.update-notebook-instance-input/disassociate-lifecycle-config]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/parameter-ranges (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.-2017-07-24/integer-parameter-ranges :portkey.aws.sagemaker.-2017-07-24/continuous-parameter-ranges :portkey.aws.sagemaker.-2017-07-24/categorical-parameter-ranges]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.production-variant/initial-instance-count (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/task-count))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.production-variant/instance-type (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/production-variant-instance-type))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.production-variant/initial-variant-weight (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/variant-weight))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/production-variant (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/variant-name :portkey.aws.sagemaker.-2017-07-24/model-name :portkey.aws.sagemaker.-2017-07-24.production-variant/initial-instance-count :portkey.aws.sagemaker.-2017-07-24.production-variant/instance-type] :opt-un [:portkey.aws.sagemaker.-2017-07-24.production-variant/initial-variant-weight]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/security-group-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 32))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/update-notebook-instance-lifecycle-config-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.describe-training-job-response/training-end-time (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.describe-training-job-response/creation-time (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.describe-training-job-response/tuning-job-arn (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/hyper-parameter-tuning-job-arn))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.describe-training-job-response/training-start-time (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.describe-training-job-response/last-modified-time (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/describe-training-job-response (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/training-job-name :portkey.aws.sagemaker.-2017-07-24/training-job-arn :portkey.aws.sagemaker.-2017-07-24/model-artifacts :portkey.aws.sagemaker.-2017-07-24/training-job-status :portkey.aws.sagemaker.-2017-07-24/secondary-status :portkey.aws.sagemaker.-2017-07-24/algorithm-specification :portkey.aws.sagemaker.-2017-07-24/input-data-config :portkey.aws.sagemaker.-2017-07-24/resource-config :portkey.aws.sagemaker.-2017-07-24/stopping-condition :portkey.aws.sagemaker.-2017-07-24.describe-training-job-response/creation-time] :opt-un [:portkey.aws.sagemaker.-2017-07-24.describe-training-job-response/training-end-time :portkey.aws.sagemaker.-2017-07-24/output-data-config :portkey.aws.sagemaker.-2017-07-24/hyper-parameters :portkey.aws.sagemaker.-2017-07-24/role-arn :portkey.aws.sagemaker.-2017-07-24/failure-reason :portkey.aws.sagemaker.-2017-07-24/vpc-config :portkey.aws.sagemaker.-2017-07-24.describe-training-job-response/tuning-job-arn :portkey.aws.sagemaker.-2017-07-24.describe-training-job-response/training-start-time :portkey.aws.sagemaker.-2017-07-24.describe-training-job-response/last-modified-time :portkey.aws.sagemaker.-2017-07-24/secondary-status-transitions]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.notebook-instance-lifecycle-hook/content (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/notebook-instance-lifecycle-config-content))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/notebook-instance-lifecycle-hook (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.-2017-07-24.notebook-instance-lifecycle-hook/content]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/failure-reason (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.endpoint-config-summary/creation-time (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/endpoint-config-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/endpoint-config-name :portkey.aws.sagemaker.-2017-07-24/endpoint-config-arn :portkey.aws.sagemaker.-2017-07-24.endpoint-config-summary/creation-time] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/transform-job-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 63)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9](-*[a-zA-Z0-9])*" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.add-tags-input/tags (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/tag-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/add-tags-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/resource-arn :portkey.aws.sagemaker.-2017-07-24.add-tags-input/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/transform-job-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 256)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:transform-job/.*" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-endpoints-input/creation-time-after (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-endpoints-input/name-contains (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/endpoint-name-contains))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-endpoints-input/sort-by (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/endpoint-sort-key))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-endpoints-input/creation-time-before (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-endpoints-input/sort-order (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/order-key))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-endpoints-input/next-token (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/pagination-token))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-endpoints-input/last-modified-time-after (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-endpoints-input/status-equals (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/endpoint-status))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-endpoints-input/last-modified-time-before (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/list-endpoints-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.-2017-07-24.list-endpoints-input/creation-time-after :portkey.aws.sagemaker.-2017-07-24.list-endpoints-input/name-contains :portkey.aws.sagemaker.-2017-07-24.list-endpoints-input/sort-by :portkey.aws.sagemaker.-2017-07-24.list-endpoints-input/creation-time-before :portkey.aws.sagemaker.-2017-07-24.list-endpoints-input/sort-order :portkey.aws.sagemaker.-2017-07-24.list-endpoints-input/next-token :portkey.aws.sagemaker.-2017-07-24.list-endpoints-input/last-modified-time-after :portkey.aws.sagemaker.-2017-07-24.list-endpoints-input/status-equals :portkey.aws.sagemaker.-2017-07-24/max-results :portkey.aws.sagemaker.-2017-07-24.list-endpoints-input/last-modified-time-before]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/delete-notebook-instance-lifecycle-config-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/notebook-instance-lifecycle-config-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/kms-key-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/batch-strategy #{"MultiRecord" :multi-record "SingleRecord" :single-record})

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/environment-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 1024)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"[a-zA-Z_][a-zA-Z0-9_]*" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/endpoint-summary-list (clojure.spec.alpha/coll-of :portkey.aws.sagemaker.-2017-07-24/endpoint-summary))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/data-source (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/s-3-data-source] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/notebook-instance-summary-list (clojure.spec.alpha/coll-of :portkey.aws.sagemaker.-2017-07-24/notebook-instance-summary))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.training-job-status-counters/completed (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/training-job-status-counter))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.training-job-status-counters/in-progress (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/training-job-status-counter))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.training-job-status-counters/retryable-error (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/training-job-status-counter))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.training-job-status-counters/non-retryable-error (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/training-job-status-counter))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.training-job-status-counters/stopped (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/training-job-status-counter))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/training-job-status-counters (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.-2017-07-24.training-job-status-counters/completed :portkey.aws.sagemaker.-2017-07-24.training-job-status-counters/in-progress :portkey.aws.sagemaker.-2017-07-24.training-job-status-counters/retryable-error :portkey.aws.sagemaker.-2017-07-24.training-job-status-counters/non-retryable-error :portkey.aws.sagemaker.-2017-07-24.training-job-status-counters/stopped]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/assembly-type #{"Line" "None" :line :none})

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/variant-weight clojure.core/float?)

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/split-type #{"RecordIO" "Line" "None" :line :record-io :none})

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/training-job-sort-by-options #{:name "FinalObjectiveMetricValue" "Status" :status "CreationTime" "Name" :final-objective-metric-value :creation-time})

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/metric-value clojure.core/float?)

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-training-jobs-for-hyper-parameter-tuning-job-request/status-equals (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/training-job-status))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-training-jobs-for-hyper-parameter-tuning-job-request/sort-by (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/training-job-sort-by-options))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/list-training-jobs-for-hyper-parameter-tuning-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/hyper-parameter-tuning-job-name] :opt-un [:portkey.aws.sagemaker.-2017-07-24/next-token :portkey.aws.sagemaker.-2017-07-24/max-results :portkey.aws.sagemaker.-2017-07-24.list-training-jobs-for-hyper-parameter-tuning-job-request/status-equals :portkey.aws.sagemaker.-2017-07-24.list-training-jobs-for-hyper-parameter-tuning-job-request/sort-by :portkey.aws.sagemaker.-2017-07-24/sort-order]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/production-variant-summary-list (clojure.spec.alpha/coll-of :portkey.aws.sagemaker.-2017-07-24/production-variant-summary :min-count 1))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.production-variant-summary/current-weight (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/variant-weight))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.production-variant-summary/desired-weight (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/variant-weight))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.production-variant-summary/current-instance-count (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/task-count))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.production-variant-summary/desired-instance-count (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/task-count))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/production-variant-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/variant-name] :opt-un [:portkey.aws.sagemaker.-2017-07-24/deployed-images :portkey.aws.sagemaker.-2017-07-24.production-variant-summary/current-weight :portkey.aws.sagemaker.-2017-07-24.production-variant-summary/desired-weight :portkey.aws.sagemaker.-2017-07-24.production-variant-summary/current-instance-count :portkey.aws.sagemaker.-2017-07-24.production-variant-summary/desired-instance-count]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/creation-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.hyper-parameter-training-job-summary/training-end-time (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.hyper-parameter-training-job-summary/tuned-hyper-parameters (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/hyper-parameters))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.hyper-parameter-training-job-summary/creation-time (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.hyper-parameter-training-job-summary/training-start-time (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/hyper-parameter-training-job-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/training-job-name :portkey.aws.sagemaker.-2017-07-24/training-job-arn :portkey.aws.sagemaker.-2017-07-24.hyper-parameter-training-job-summary/creation-time :portkey.aws.sagemaker.-2017-07-24/training-job-status :portkey.aws.sagemaker.-2017-07-24.hyper-parameter-training-job-summary/tuned-hyper-parameters] :opt-un [:portkey.aws.sagemaker.-2017-07-24.hyper-parameter-training-job-summary/training-end-time :portkey.aws.sagemaker.-2017-07-24/final-hyper-parameter-tuning-job-objective-metric :portkey.aws.sagemaker.-2017-07-24/objective-status :portkey.aws.sagemaker.-2017-07-24/failure-reason :portkey.aws.sagemaker.-2017-07-24.hyper-parameter-training-job-summary/training-start-time]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.metric-definition/name (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/metric-name))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.metric-definition/regex (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/metric-regex))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/metric-definition (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24.metric-definition/name :portkey.aws.sagemaker.-2017-07-24.metric-definition/regex] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.vpc-config/security-group-ids (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/vpc-security-group-ids))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/vpc-config (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24.vpc-config/security-group-ids :portkey.aws.sagemaker.-2017-07-24/subnets] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.notebook-instance-summary/url (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/notebook-instance-url))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/notebook-instance-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/notebook-instance-name :portkey.aws.sagemaker.-2017-07-24/notebook-instance-arn] :opt-un [:portkey.aws.sagemaker.-2017-07-24/notebook-instance-status :portkey.aws.sagemaker.-2017-07-24.notebook-instance-summary/url :portkey.aws.sagemaker.-2017-07-24/instance-type :portkey.aws.sagemaker.-2017-07-24/creation-time :portkey.aws.sagemaker.-2017-07-24/last-modified-time :portkey.aws.sagemaker.-2017-07-24/notebook-instance-lifecycle-config-name]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/hyper-parameter-tuning-job-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 32)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9](-*[a-zA-Z0-9])*" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/training-job-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 63)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9](-*[a-zA-Z0-9])*" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/transform-job-status #{"Failed" :in-progress :completed :stopping :stopped "InProgress" "Stopping" "Stopped" "Completed" :failed})

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.transform-output/s-3-output-path (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/s-3-uri))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.transform-output/assemble-with (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/assembly-type))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/transform-output (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24.transform-output/s-3-output-path] :opt-un [:portkey.aws.sagemaker.-2017-07-24/accept :portkey.aws.sagemaker.-2017-07-24.transform-output/assemble-with :portkey.aws.sagemaker.-2017-07-24/kms-key-id]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/desired-weight-and-capacity-list (clojure.spec.alpha/coll-of :portkey.aws.sagemaker.-2017-07-24/desired-weight-and-capacity :min-count 1))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/endpoint-name-contains (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"[a-zA-Z0-9-]+" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/notebook-instance-lifecycle-config-summary-list (clojure.spec.alpha/coll-of :portkey.aws.sagemaker.-2017-07-24/notebook-instance-lifecycle-config-summary))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/update-notebook-instance-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.hyper-parameter-training-job-definition/static-hyper-parameters (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/hyper-parameters))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.hyper-parameter-training-job-definition/algorithm-specification (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/hyper-parameter-algorithm-specification))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/hyper-parameter-training-job-definition (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24.hyper-parameter-training-job-definition/algorithm-specification :portkey.aws.sagemaker.-2017-07-24/role-arn :portkey.aws.sagemaker.-2017-07-24/input-data-config :portkey.aws.sagemaker.-2017-07-24/output-data-config :portkey.aws.sagemaker.-2017-07-24/resource-config :portkey.aws.sagemaker.-2017-07-24/stopping-condition] :opt-un [:portkey.aws.sagemaker.-2017-07-24.hyper-parameter-training-job-definition/static-hyper-parameters :portkey.aws.sagemaker.-2017-07-24/vpc-config]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.hyper-parameter-tuning-job-summary/strategy (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/hyper-parameter-tuning-job-strategy-type))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.hyper-parameter-tuning-job-summary/hyper-parameter-tuning-end-time (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.hyper-parameter-tuning-job-summary/creation-time (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.hyper-parameter-tuning-job-summary/last-modified-time (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/hyper-parameter-tuning-job-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/hyper-parameter-tuning-job-name :portkey.aws.sagemaker.-2017-07-24/hyper-parameter-tuning-job-arn :portkey.aws.sagemaker.-2017-07-24/hyper-parameter-tuning-job-status :portkey.aws.sagemaker.-2017-07-24.hyper-parameter-tuning-job-summary/strategy :portkey.aws.sagemaker.-2017-07-24.hyper-parameter-tuning-job-summary/creation-time :portkey.aws.sagemaker.-2017-07-24/training-job-status-counters :portkey.aws.sagemaker.-2017-07-24/objective-status-counters] :opt-un [:portkey.aws.sagemaker.-2017-07-24/resource-limits :portkey.aws.sagemaker.-2017-07-24.hyper-parameter-tuning-job-summary/hyper-parameter-tuning-end-time :portkey.aws.sagemaker.-2017-07-24.hyper-parameter-tuning-job-summary/last-modified-time]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/describe-notebook-instance-lifecycle-config-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/notebook-instance-lifecycle-config-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/resource-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.model-artifacts/s-3-model-artifacts (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/s-3-uri))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/model-artifacts (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24.model-artifacts/s-3-model-artifacts] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.desired-weight-and-capacity/desired-weight (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/variant-weight))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.desired-weight-and-capacity/desired-instance-count (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/task-count))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/desired-weight-and-capacity (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/variant-name] :opt-un [:portkey.aws.sagemaker.-2017-07-24.desired-weight-and-capacity/desired-weight :portkey.aws.sagemaker.-2017-07-24.desired-weight-and-capacity/desired-instance-count]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/record-wrapper #{"RecordIO" "None" :record-io :none})

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.channel/record-wrapper-type (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/record-wrapper))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/channel (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/channel-name :portkey.aws.sagemaker.-2017-07-24/data-source] :opt-un [:portkey.aws.sagemaker.-2017-07-24/content-type :portkey.aws.sagemaker.-2017-07-24/compression-type :portkey.aws.sagemaker.-2017-07-24.channel/record-wrapper-type]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-training-jobs-request/creation-time-after (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-training-jobs-request/creation-time-before (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-training-jobs-request/last-modified-time-after (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-training-jobs-request/status-equals (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/training-job-status))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-training-jobs-request/last-modified-time-before (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/list-training-jobs-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.-2017-07-24.list-training-jobs-request/creation-time-after :portkey.aws.sagemaker.-2017-07-24/name-contains :portkey.aws.sagemaker.-2017-07-24/sort-by :portkey.aws.sagemaker.-2017-07-24.list-training-jobs-request/creation-time-before :portkey.aws.sagemaker.-2017-07-24/sort-order :portkey.aws.sagemaker.-2017-07-24/next-token :portkey.aws.sagemaker.-2017-07-24.list-training-jobs-request/last-modified-time-after :portkey.aws.sagemaker.-2017-07-24.list-training-jobs-request/status-equals :portkey.aws.sagemaker.-2017-07-24/max-results :portkey.aws.sagemaker.-2017-07-24.list-training-jobs-request/last-modified-time-before]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.hyper-parameter-tuning-job-objective/type (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/hyper-parameter-tuning-job-objective-type))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/hyper-parameter-tuning-job-objective (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24.hyper-parameter-tuning-job-objective/type :portkey.aws.sagemaker.-2017-07-24/metric-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/stop-training-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/training-job-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/disassociate-notebook-instance-lifecycle-config clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.create-hyper-parameter-tuning-job-request/training-job-definition (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/hyper-parameter-training-job-definition))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.create-hyper-parameter-tuning-job-request/tags (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/tag-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/create-hyper-parameter-tuning-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/hyper-parameter-tuning-job-name :portkey.aws.sagemaker.-2017-07-24/hyper-parameter-tuning-job-config :portkey.aws.sagemaker.-2017-07-24.create-hyper-parameter-tuning-job-request/training-job-definition] :opt-un [:portkey.aws.sagemaker.-2017-07-24.create-hyper-parameter-tuning-job-request/tags]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.secondary-status-transition/status (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/secondary-status))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.secondary-status-transition/start-time (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.secondary-status-transition/end-time (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/secondary-status-transition (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24.secondary-status-transition/status :portkey.aws.sagemaker.-2017-07-24.secondary-status-transition/start-time] :opt-un [:portkey.aws.sagemaker.-2017-07-24.secondary-status-transition/end-time :portkey.aws.sagemaker.-2017-07-24/status-message]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/create-training-job-response (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/training-job-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/max-results (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/deployed-images (clojure.spec.alpha/coll-of :portkey.aws.sagemaker.-2017-07-24/deployed-image))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.tag/key (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/tag-key))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.tag/value (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/tag-value))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24.tag/key :portkey.aws.sagemaker.-2017-07-24.tag/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/metric-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/integer-parameter-ranges (clojure.spec.alpha/coll-of :portkey.aws.sagemaker.-2017-07-24/integer-parameter-range :min-count 0 :max-count 20))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/training-instance-type #{:mlm-5large :mlm-42xlarge :mlp-32xlarge :mlp-316xlarge "ml.m5.xlarge" "ml.c5.xlarge" "ml.m4.2xlarge" "ml.c5.9xlarge" :mlm-54xlarge "ml.p2.16xlarge" :mlm-52xlarge "ml.m5.large" :mlc-54xlarge "ml.m5.12xlarge" "ml.c5.2xlarge" :mlc-52xlarge "ml.c4.2xlarge" "ml.c4.4xlarge" :mlm-410xlarge :mlm-512xlarge "ml.m4.4xlarge" "ml.m5.4xlarge" "ml.m4.xlarge" "ml.m4.16xlarge" :mlp-38xlarge :mlm-416xlarge "ml.p2.8xlarge" :mlm-44xlarge :mlc-48xlarge "ml.p3.16xlarge" :mlc-59xlarge :mlc-4xlarge "ml.c4.8xlarge" "ml.c5.18xlarge" :mlc-42xlarge :mlc-44xlarge "ml.m5.2xlarge" :mlc-518xlarge "ml.c4.xlarge" "ml.m5.24xlarge" "ml.p3.2xlarge" :mlp-216xlarge :mlm-524xlarge :mlp-2xlarge "ml.p3.8xlarge" :mlp-28xlarge :mlm-5xlarge :mlm-4xlarge "ml.p2.xlarge" "ml.m4.10xlarge" :mlc-5xlarge "ml.c5.4xlarge"})

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.integer-parameter-range/name (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/parameter-key))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.integer-parameter-range/min-value (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/parameter-value))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.integer-parameter-range/max-value (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/parameter-value))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/integer-parameter-range (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24.integer-parameter-range/name :portkey.aws.sagemaker.-2017-07-24.integer-parameter-range/min-value :portkey.aws.sagemaker.-2017-07-24.integer-parameter-range/max-value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/algorithm-image (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/last-modified-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.resource-limit-exceeded/message (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/failure-reason))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/resource-limit-exceeded (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.-2017-07-24.resource-limit-exceeded/message]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.create-training-job-request/tags (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/tag-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/create-training-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/training-job-name :portkey.aws.sagemaker.-2017-07-24/algorithm-specification :portkey.aws.sagemaker.-2017-07-24/role-arn :portkey.aws.sagemaker.-2017-07-24/input-data-config :portkey.aws.sagemaker.-2017-07-24/output-data-config :portkey.aws.sagemaker.-2017-07-24/resource-config :portkey.aws.sagemaker.-2017-07-24/stopping-condition] :opt-un [:portkey.aws.sagemaker.-2017-07-24/hyper-parameters :portkey.aws.sagemaker.-2017-07-24.create-training-job-request/tags :portkey.aws.sagemaker.-2017-07-24/vpc-config]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/image (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 255)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"[\S]+" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/accept (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/training-job-summaries (clojure.spec.alpha/coll-of :portkey.aws.sagemaker.-2017-07-24/training-job-summary))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/update-endpoint-output (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/endpoint-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/create-endpoint-output (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/endpoint-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.resource-not-found/message (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/failure-reason))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/resource-not-found (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.-2017-07-24.resource-not-found/message]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/list-hyper-parameter-tuning-jobs-response (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/hyper-parameter-tuning-job-summaries] :opt-un [:portkey.aws.sagemaker.-2017-07-24/next-token]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/create-presigned-notebook-instance-url-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/notebook-instance-name] :opt-un [:portkey.aws.sagemaker.-2017-07-24/session-expiration-duration-in-seconds]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/training-job-status #{"Failed" :in-progress :completed :stopping :stopped "InProgress" "Stopping" "Stopped" "Completed" :failed})

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-transform-jobs-request/creation-time-after (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-transform-jobs-request/creation-time-before (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-transform-jobs-request/last-modified-time-after (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-transform-jobs-request/status-equals (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/transform-job-status))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-transform-jobs-request/last-modified-time-before (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/list-transform-jobs-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.-2017-07-24.list-transform-jobs-request/creation-time-after :portkey.aws.sagemaker.-2017-07-24/name-contains :portkey.aws.sagemaker.-2017-07-24/sort-by :portkey.aws.sagemaker.-2017-07-24.list-transform-jobs-request/creation-time-before :portkey.aws.sagemaker.-2017-07-24/sort-order :portkey.aws.sagemaker.-2017-07-24/next-token :portkey.aws.sagemaker.-2017-07-24.list-transform-jobs-request/last-modified-time-after :portkey.aws.sagemaker.-2017-07-24.list-transform-jobs-request/status-equals :portkey.aws.sagemaker.-2017-07-24/max-results :portkey.aws.sagemaker.-2017-07-24.list-transform-jobs-request/last-modified-time-before]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.continuous-parameter-range/name (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/parameter-key))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.continuous-parameter-range/min-value (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/parameter-value))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.continuous-parameter-range/max-value (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/parameter-value))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/continuous-parameter-range (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24.continuous-parameter-range/name :portkey.aws.sagemaker.-2017-07-24.continuous-parameter-range/min-value :portkey.aws.sagemaker.-2017-07-24.continuous-parameter-range/max-value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/describe-endpoint-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/endpoint-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.algorithm-specification/training-image (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/algorithm-image))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/algorithm-specification (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24.algorithm-specification/training-image :portkey.aws.sagemaker.-2017-07-24/training-input-mode] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/endpoint-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 20 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/notebook-instance-name-contains (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"[a-zA-Z0-9-]+" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-endpoints-output/endpoints (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/endpoint-summary-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-endpoints-output/next-token (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/pagination-token))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/list-endpoints-output (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24.list-endpoints-output/endpoints] :opt-un [:portkey.aws.sagemaker.-2017-07-24.list-endpoints-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/notebook-instance-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 63)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9](-*[a-zA-Z0-9])*" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/describe-model-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/model-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/create-notebook-instance-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.-2017-07-24/notebook-instance-arn]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-tags-input/max-results (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/list-tags-max-results))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/list-tags-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/resource-arn] :opt-un [:portkey.aws.sagemaker.-2017-07-24/next-token :portkey.aws.sagemaker.-2017-07-24.list-tags-input/max-results]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-tags-output/tags (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/tag-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/list-tags-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.-2017-07-24.list-tags-output/tags :portkey.aws.sagemaker.-2017-07-24/next-token]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/secondary-status-transitions (clojure.spec.alpha/coll-of :portkey.aws.sagemaker.-2017-07-24/secondary-status-transition))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.deployed-image/specified-image (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/image))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.deployed-image/resolved-image (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/image))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.deployed-image/resolution-time (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/deployed-image (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.-2017-07-24.deployed-image/specified-image :portkey.aws.sagemaker.-2017-07-24.deployed-image/resolved-image :portkey.aws.sagemaker.-2017-07-24.deployed-image/resolution-time]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.describe-endpoint-output/production-variants (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/production-variant-summary-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.describe-endpoint-output/creation-time (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.describe-endpoint-output/last-modified-time (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/describe-endpoint-output (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/endpoint-name :portkey.aws.sagemaker.-2017-07-24/endpoint-arn :portkey.aws.sagemaker.-2017-07-24/endpoint-config-name :portkey.aws.sagemaker.-2017-07-24/endpoint-status :portkey.aws.sagemaker.-2017-07-24.describe-endpoint-output/creation-time :portkey.aws.sagemaker.-2017-07-24.describe-endpoint-output/last-modified-time] :opt-un [:portkey.aws.sagemaker.-2017-07-24.describe-endpoint-output/production-variants :portkey.aws.sagemaker.-2017-07-24/failure-reason]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-notebook-instances-input/creation-time-after (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/creation-time))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-notebook-instances-input/name-contains (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/notebook-instance-name-contains))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-notebook-instances-input/sort-by (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/notebook-instance-sort-key))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-notebook-instances-input/creation-time-before (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/creation-time))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-notebook-instances-input/sort-order (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/notebook-instance-sort-order))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-notebook-instances-input/notebook-instance-lifecycle-config-name-contains (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/notebook-instance-lifecycle-config-name))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-notebook-instances-input/last-modified-time-after (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/last-modified-time))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-notebook-instances-input/status-equals (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/notebook-instance-status))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-notebook-instances-input/last-modified-time-before (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/last-modified-time))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/list-notebook-instances-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.-2017-07-24.list-notebook-instances-input/creation-time-after :portkey.aws.sagemaker.-2017-07-24.list-notebook-instances-input/name-contains :portkey.aws.sagemaker.-2017-07-24.list-notebook-instances-input/sort-by :portkey.aws.sagemaker.-2017-07-24.list-notebook-instances-input/creation-time-before :portkey.aws.sagemaker.-2017-07-24.list-notebook-instances-input/sort-order :portkey.aws.sagemaker.-2017-07-24.list-notebook-instances-input/notebook-instance-lifecycle-config-name-contains :portkey.aws.sagemaker.-2017-07-24/next-token :portkey.aws.sagemaker.-2017-07-24.list-notebook-instances-input/last-modified-time-after :portkey.aws.sagemaker.-2017-07-24.list-notebook-instances-input/status-equals :portkey.aws.sagemaker.-2017-07-24/max-results :portkey.aws.sagemaker.-2017-07-24.list-notebook-instances-input/last-modified-time-before]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/transform-instance-type #{:mlm-5large :mlm-42xlarge :mlp-32xlarge :mlp-316xlarge "ml.m5.xlarge" "ml.c5.xlarge" "ml.m4.2xlarge" "ml.c5.9xlarge" :mlm-54xlarge "ml.p2.16xlarge" :mlm-52xlarge "ml.m5.large" :mlc-54xlarge "ml.m5.12xlarge" "ml.c5.2xlarge" :mlc-52xlarge "ml.c4.2xlarge" "ml.c4.4xlarge" :mlm-410xlarge :mlm-512xlarge "ml.m4.4xlarge" "ml.m5.4xlarge" "ml.m4.xlarge" "ml.m4.16xlarge" :mlp-38xlarge :mlm-416xlarge "ml.p2.8xlarge" :mlm-44xlarge :mlc-48xlarge "ml.p3.16xlarge" :mlc-59xlarge :mlc-4xlarge "ml.c4.8xlarge" "ml.c5.18xlarge" :mlc-42xlarge :mlc-44xlarge "ml.m5.2xlarge" :mlc-518xlarge "ml.c4.xlarge" "ml.m5.24xlarge" "ml.p3.2xlarge" :mlp-216xlarge :mlm-524xlarge :mlp-2xlarge "ml.p3.8xlarge" :mlp-28xlarge :mlm-5xlarge :mlm-4xlarge "ml.p2.xlarge" "ml.m4.10xlarge" :mlc-5xlarge "ml.c5.4xlarge"})

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.resource-in-use/message (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/failure-reason))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/resource-in-use (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.-2017-07-24.resource-in-use/message]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.describe-notebook-instance-lifecycle-config-output/on-create (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/notebook-instance-lifecycle-config-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.describe-notebook-instance-lifecycle-config-output/on-start (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/notebook-instance-lifecycle-config-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/describe-notebook-instance-lifecycle-config-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.-2017-07-24/notebook-instance-lifecycle-config-arn :portkey.aws.sagemaker.-2017-07-24/notebook-instance-lifecycle-config-name :portkey.aws.sagemaker.-2017-07-24.describe-notebook-instance-lifecycle-config-output/on-create :portkey.aws.sagemaker.-2017-07-24.describe-notebook-instance-lifecycle-config-output/on-start :portkey.aws.sagemaker.-2017-07-24/last-modified-time :portkey.aws.sagemaker.-2017-07-24/creation-time]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/endpoint-config-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 63)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9](-*[a-zA-Z0-9])*" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/describe-training-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/training-job-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/parameter-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/model-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 20 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/create-endpoint-config-output (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.-2017-07-24/endpoint-config-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24.list-notebook-instance-lifecycle-configs-output/notebook-instance-lifecycle-configs (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/notebook-instance-lifecycle-config-summary-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker.-2017-07-24/list-notebook-instance-lifecycle-configs-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.-2017-07-24/next-token :portkey.aws.sagemaker.-2017-07-24.list-notebook-instance-lifecycle-configs-output/notebook-instance-lifecycle-configs]))

(clojure.core/defn list-training-jobs-for-hyper-parameter-tuning-job ([list-training-jobs-for-hyper-parameter-tuning-job-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-training-jobs-for-hyper-parameter-tuning-job-request list-training-jobs-for-hyper-parameter-tuning-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker.-2017-07-24/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker.-2017-07-24/list-training-jobs-for-hyper-parameter-tuning-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker.-2017-07-24/list-training-jobs-for-hyper-parameter-tuning-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTrainingJobsForHyperParameterTuningJob", :http.request.configuration/output-deser-fn deser-list-training-jobs-for-hyper-parameter-tuning-job-response, :http.request.spec/error-spec {"ResourceNotFound" :portkey.aws.sagemaker.-2017-07-24/resource-not-found}})))))
(clojure.spec.alpha/fdef list-training-jobs-for-hyper-parameter-tuning-job :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker.-2017-07-24/list-training-jobs-for-hyper-parameter-tuning-job-request) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/list-training-jobs-for-hyper-parameter-tuning-job-response))

(clojure.core/defn create-notebook-instance ([create-notebook-instance-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-notebook-instance-input create-notebook-instance-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker.-2017-07-24/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker.-2017-07-24/create-notebook-instance-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker.-2017-07-24/create-notebook-instance-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateNotebookInstance", :http.request.configuration/output-deser-fn deser-create-notebook-instance-output, :http.request.spec/error-spec {"ResourceLimitExceeded" :portkey.aws.sagemaker.-2017-07-24/resource-limit-exceeded}})))))
(clojure.spec.alpha/fdef create-notebook-instance :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker.-2017-07-24/create-notebook-instance-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/create-notebook-instance-output))

(clojure.core/defn describe-notebook-instance-lifecycle-config ([describe-notebook-instance-lifecycle-config-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-notebook-instance-lifecycle-config-input describe-notebook-instance-lifecycle-config-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker.-2017-07-24/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker.-2017-07-24/describe-notebook-instance-lifecycle-config-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker.-2017-07-24/describe-notebook-instance-lifecycle-config-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeNotebookInstanceLifecycleConfig", :http.request.configuration/output-deser-fn deser-describe-notebook-instance-lifecycle-config-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-notebook-instance-lifecycle-config :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker.-2017-07-24/describe-notebook-instance-lifecycle-config-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/describe-notebook-instance-lifecycle-config-output))

(clojure.core/defn list-notebook-instance-lifecycle-configs ([] (list-notebook-instance-lifecycle-configs {})) ([list-notebook-instance-lifecycle-configs-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-notebook-instance-lifecycle-configs-input list-notebook-instance-lifecycle-configs-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker.-2017-07-24/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker.-2017-07-24/list-notebook-instance-lifecycle-configs-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker.-2017-07-24/list-notebook-instance-lifecycle-configs-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListNotebookInstanceLifecycleConfigs", :http.request.configuration/output-deser-fn deser-list-notebook-instance-lifecycle-configs-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-notebook-instance-lifecycle-configs :args (clojure.spec.alpha/? :portkey.aws.sagemaker.-2017-07-24/list-notebook-instance-lifecycle-configs-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/list-notebook-instance-lifecycle-configs-output))

(clojure.core/defn create-training-job ([create-training-job-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-training-job-request create-training-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker.-2017-07-24/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker.-2017-07-24/create-training-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker.-2017-07-24/create-training-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateTrainingJob", :http.request.configuration/output-deser-fn deser-create-training-job-response, :http.request.spec/error-spec {"ResourceInUse" :portkey.aws.sagemaker.-2017-07-24/resource-in-use, "ResourceLimitExceeded" :portkey.aws.sagemaker.-2017-07-24/resource-limit-exceeded}})))))
(clojure.spec.alpha/fdef create-training-job :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker.-2017-07-24/create-training-job-request) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/create-training-job-response))

(clojure.core/defn update-notebook-instance ([update-notebook-instance-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-update-notebook-instance-input update-notebook-instance-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker.-2017-07-24/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker.-2017-07-24/update-notebook-instance-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker.-2017-07-24/update-notebook-instance-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateNotebookInstance", :http.request.configuration/output-deser-fn deser-update-notebook-instance-output, :http.request.spec/error-spec {"ResourceLimitExceeded" :portkey.aws.sagemaker.-2017-07-24/resource-limit-exceeded}})))))
(clojure.spec.alpha/fdef update-notebook-instance :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker.-2017-07-24/update-notebook-instance-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/update-notebook-instance-output))

(clojure.core/defn create-notebook-instance-lifecycle-config ([create-notebook-instance-lifecycle-config-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-notebook-instance-lifecycle-config-input create-notebook-instance-lifecycle-config-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker.-2017-07-24/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker.-2017-07-24/create-notebook-instance-lifecycle-config-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker.-2017-07-24/create-notebook-instance-lifecycle-config-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateNotebookInstanceLifecycleConfig", :http.request.configuration/output-deser-fn deser-create-notebook-instance-lifecycle-config-output, :http.request.spec/error-spec {"ResourceLimitExceeded" :portkey.aws.sagemaker.-2017-07-24/resource-limit-exceeded}})))))
(clojure.spec.alpha/fdef create-notebook-instance-lifecycle-config :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker.-2017-07-24/create-notebook-instance-lifecycle-config-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/create-notebook-instance-lifecycle-config-output))

(clojure.core/defn delete-tags ([delete-tags-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-tags-input delete-tags-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker.-2017-07-24/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker.-2017-07-24/delete-tags-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker.-2017-07-24/delete-tags-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteTags", :http.request.configuration/output-deser-fn deser-delete-tags-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-tags :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker.-2017-07-24/delete-tags-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/delete-tags-output))

(clojure.core/defn list-training-jobs ([] (list-training-jobs {})) ([list-training-jobs-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-training-jobs-request list-training-jobs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker.-2017-07-24/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker.-2017-07-24/list-training-jobs-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker.-2017-07-24/list-training-jobs-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTrainingJobs", :http.request.configuration/output-deser-fn deser-list-training-jobs-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-training-jobs :args (clojure.spec.alpha/? :portkey.aws.sagemaker.-2017-07-24/list-training-jobs-request) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/list-training-jobs-response))

(clojure.core/defn stop-notebook-instance ([stop-notebook-instance-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-stop-notebook-instance-input stop-notebook-instance-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker.-2017-07-24/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker.-2017-07-24/stop-notebook-instance-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StopNotebookInstance", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef stop-notebook-instance :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker.-2017-07-24/stop-notebook-instance-input) :ret clojure.core/true?)

(clojure.core/defn create-transform-job ([create-transform-job-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-transform-job-request create-transform-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker.-2017-07-24/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker.-2017-07-24/create-transform-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker.-2017-07-24/create-transform-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateTransformJob", :http.request.configuration/output-deser-fn deser-create-transform-job-response, :http.request.spec/error-spec {"ResourceInUse" :portkey.aws.sagemaker.-2017-07-24/resource-in-use, "ResourceLimitExceeded" :portkey.aws.sagemaker.-2017-07-24/resource-limit-exceeded}})))))
(clojure.spec.alpha/fdef create-transform-job :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker.-2017-07-24/create-transform-job-request) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/create-transform-job-response))

(clojure.core/defn list-notebook-instances ([] (list-notebook-instances {})) ([list-notebook-instances-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-notebook-instances-input list-notebook-instances-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker.-2017-07-24/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker.-2017-07-24/list-notebook-instances-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker.-2017-07-24/list-notebook-instances-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListNotebookInstances", :http.request.configuration/output-deser-fn deser-list-notebook-instances-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-notebook-instances :args (clojure.spec.alpha/? :portkey.aws.sagemaker.-2017-07-24/list-notebook-instances-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/list-notebook-instances-output))

(clojure.core/defn list-tags ([list-tags-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-tags-input list-tags-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker.-2017-07-24/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker.-2017-07-24/list-tags-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker.-2017-07-24/list-tags-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTags", :http.request.configuration/output-deser-fn deser-list-tags-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-tags :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker.-2017-07-24/list-tags-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/list-tags-output))

(clojure.core/defn create-endpoint ([create-endpoint-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-endpoint-input create-endpoint-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker.-2017-07-24/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker.-2017-07-24/create-endpoint-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker.-2017-07-24/create-endpoint-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateEndpoint", :http.request.configuration/output-deser-fn deser-create-endpoint-output, :http.request.spec/error-spec {"ResourceLimitExceeded" :portkey.aws.sagemaker.-2017-07-24/resource-limit-exceeded}})))))
(clojure.spec.alpha/fdef create-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker.-2017-07-24/create-endpoint-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/create-endpoint-output))

(clojure.core/defn list-endpoint-configs ([] (list-endpoint-configs {})) ([list-endpoint-configs-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-endpoint-configs-input list-endpoint-configs-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker.-2017-07-24/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker.-2017-07-24/list-endpoint-configs-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker.-2017-07-24/list-endpoint-configs-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListEndpointConfigs", :http.request.configuration/output-deser-fn deser-list-endpoint-configs-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-endpoint-configs :args (clojure.spec.alpha/? :portkey.aws.sagemaker.-2017-07-24/list-endpoint-configs-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/list-endpoint-configs-output))

(clojure.core/defn create-model ([create-model-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-model-input create-model-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker.-2017-07-24/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker.-2017-07-24/create-model-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker.-2017-07-24/create-model-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateModel", :http.request.configuration/output-deser-fn deser-create-model-output, :http.request.spec/error-spec {"ResourceLimitExceeded" :portkey.aws.sagemaker.-2017-07-24/resource-limit-exceeded}})))))
(clojure.spec.alpha/fdef create-model :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker.-2017-07-24/create-model-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/create-model-output))

(clojure.core/defn stop-hyper-parameter-tuning-job ([stop-hyper-parameter-tuning-job-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-stop-hyper-parameter-tuning-job-request stop-hyper-parameter-tuning-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker.-2017-07-24/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker.-2017-07-24/stop-hyper-parameter-tuning-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StopHyperParameterTuningJob", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"ResourceNotFound" :portkey.aws.sagemaker.-2017-07-24/resource-not-found}})))))
(clojure.spec.alpha/fdef stop-hyper-parameter-tuning-job :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker.-2017-07-24/stop-hyper-parameter-tuning-job-request) :ret clojure.core/true?)

(clojure.core/defn list-models ([] (list-models {})) ([list-models-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-models-input list-models-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker.-2017-07-24/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker.-2017-07-24/list-models-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker.-2017-07-24/list-models-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListModels", :http.request.configuration/output-deser-fn deser-list-models-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-models :args (clojure.spec.alpha/? :portkey.aws.sagemaker.-2017-07-24/list-models-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/list-models-output))

(clojure.core/defn update-endpoint-weights-and-capacities ([update-endpoint-weights-and-capacities-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-update-endpoint-weights-and-capacities-input update-endpoint-weights-and-capacities-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker.-2017-07-24/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker.-2017-07-24/update-endpoint-weights-and-capacities-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker.-2017-07-24/update-endpoint-weights-and-capacities-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateEndpointWeightsAndCapacities", :http.request.configuration/output-deser-fn deser-update-endpoint-weights-and-capacities-output, :http.request.spec/error-spec {"ResourceLimitExceeded" :portkey.aws.sagemaker.-2017-07-24/resource-limit-exceeded}})))))
(clojure.spec.alpha/fdef update-endpoint-weights-and-capacities :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker.-2017-07-24/update-endpoint-weights-and-capacities-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/update-endpoint-weights-and-capacities-output))

(clojure.core/defn create-presigned-notebook-instance-url ([create-presigned-notebook-instance-url-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-presigned-notebook-instance-url-input create-presigned-notebook-instance-url-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker.-2017-07-24/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker.-2017-07-24/create-presigned-notebook-instance-url-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker.-2017-07-24/create-presigned-notebook-instance-url-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreatePresignedNotebookInstanceUrl", :http.request.configuration/output-deser-fn deser-create-presigned-notebook-instance-url-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef create-presigned-notebook-instance-url :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker.-2017-07-24/create-presigned-notebook-instance-url-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/create-presigned-notebook-instance-url-output))

(clojure.core/defn describe-endpoint ([describe-endpoint-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-endpoint-input describe-endpoint-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker.-2017-07-24/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker.-2017-07-24/describe-endpoint-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker.-2017-07-24/describe-endpoint-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeEndpoint", :http.request.configuration/output-deser-fn deser-describe-endpoint-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker.-2017-07-24/describe-endpoint-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/describe-endpoint-output))

(clojure.core/defn describe-hyper-parameter-tuning-job ([describe-hyper-parameter-tuning-job-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-hyper-parameter-tuning-job-request describe-hyper-parameter-tuning-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker.-2017-07-24/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker.-2017-07-24/describe-hyper-parameter-tuning-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker.-2017-07-24/describe-hyper-parameter-tuning-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeHyperParameterTuningJob", :http.request.configuration/output-deser-fn deser-describe-hyper-parameter-tuning-job-response, :http.request.spec/error-spec {"ResourceNotFound" :portkey.aws.sagemaker.-2017-07-24/resource-not-found}})))))
(clojure.spec.alpha/fdef describe-hyper-parameter-tuning-job :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker.-2017-07-24/describe-hyper-parameter-tuning-job-request) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/describe-hyper-parameter-tuning-job-response))

(clojure.core/defn describe-transform-job ([describe-transform-job-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-transform-job-request describe-transform-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker.-2017-07-24/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker.-2017-07-24/describe-transform-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker.-2017-07-24/describe-transform-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeTransformJob", :http.request.configuration/output-deser-fn deser-describe-transform-job-response, :http.request.spec/error-spec {"ResourceNotFound" :portkey.aws.sagemaker.-2017-07-24/resource-not-found}})))))
(clojure.spec.alpha/fdef describe-transform-job :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker.-2017-07-24/describe-transform-job-request) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/describe-transform-job-response))

(clojure.core/defn start-notebook-instance ([start-notebook-instance-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-start-notebook-instance-input start-notebook-instance-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker.-2017-07-24/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker.-2017-07-24/start-notebook-instance-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartNotebookInstance", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"ResourceLimitExceeded" :portkey.aws.sagemaker.-2017-07-24/resource-limit-exceeded}})))))
(clojure.spec.alpha/fdef start-notebook-instance :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker.-2017-07-24/start-notebook-instance-input) :ret clojure.core/true?)

(clojure.core/defn update-endpoint ([update-endpoint-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-update-endpoint-input update-endpoint-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker.-2017-07-24/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker.-2017-07-24/update-endpoint-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker.-2017-07-24/update-endpoint-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateEndpoint", :http.request.configuration/output-deser-fn deser-update-endpoint-output, :http.request.spec/error-spec {"ResourceLimitExceeded" :portkey.aws.sagemaker.-2017-07-24/resource-limit-exceeded}})))))
(clojure.spec.alpha/fdef update-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker.-2017-07-24/update-endpoint-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/update-endpoint-output))

(clojure.core/defn delete-model ([delete-model-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-model-input delete-model-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker.-2017-07-24/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker.-2017-07-24/delete-model-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteModel", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-model :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker.-2017-07-24/delete-model-input) :ret clojure.core/true?)

(clojure.core/defn describe-training-job ([describe-training-job-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-training-job-request describe-training-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker.-2017-07-24/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker.-2017-07-24/describe-training-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker.-2017-07-24/describe-training-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeTrainingJob", :http.request.configuration/output-deser-fn deser-describe-training-job-response, :http.request.spec/error-spec {"ResourceNotFound" :portkey.aws.sagemaker.-2017-07-24/resource-not-found}})))))
(clojure.spec.alpha/fdef describe-training-job :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker.-2017-07-24/describe-training-job-request) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/describe-training-job-response))

(clojure.core/defn stop-transform-job ([stop-transform-job-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-stop-transform-job-request stop-transform-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker.-2017-07-24/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker.-2017-07-24/stop-transform-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StopTransformJob", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"ResourceNotFound" :portkey.aws.sagemaker.-2017-07-24/resource-not-found}})))))
(clojure.spec.alpha/fdef stop-transform-job :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker.-2017-07-24/stop-transform-job-request) :ret clojure.core/true?)

(clojure.core/defn delete-notebook-instance ([delete-notebook-instance-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-notebook-instance-input delete-notebook-instance-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker.-2017-07-24/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker.-2017-07-24/delete-notebook-instance-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteNotebookInstance", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-notebook-instance :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker.-2017-07-24/delete-notebook-instance-input) :ret clojure.core/true?)

(clojure.core/defn create-endpoint-config ([create-endpoint-config-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-endpoint-config-input create-endpoint-config-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker.-2017-07-24/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker.-2017-07-24/create-endpoint-config-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker.-2017-07-24/create-endpoint-config-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateEndpointConfig", :http.request.configuration/output-deser-fn deser-create-endpoint-config-output, :http.request.spec/error-spec {"ResourceLimitExceeded" :portkey.aws.sagemaker.-2017-07-24/resource-limit-exceeded}})))))
(clojure.spec.alpha/fdef create-endpoint-config :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker.-2017-07-24/create-endpoint-config-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/create-endpoint-config-output))

(clojure.core/defn delete-endpoint-config ([delete-endpoint-config-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-endpoint-config-input delete-endpoint-config-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker.-2017-07-24/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker.-2017-07-24/delete-endpoint-config-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteEndpointConfig", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-endpoint-config :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker.-2017-07-24/delete-endpoint-config-input) :ret clojure.core/true?)

(clojure.core/defn describe-model ([describe-model-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-model-input describe-model-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker.-2017-07-24/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker.-2017-07-24/describe-model-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker.-2017-07-24/describe-model-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeModel", :http.request.configuration/output-deser-fn deser-describe-model-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-model :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker.-2017-07-24/describe-model-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/describe-model-output))

(clojure.core/defn stop-training-job ([stop-training-job-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-stop-training-job-request stop-training-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker.-2017-07-24/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker.-2017-07-24/stop-training-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StopTrainingJob", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"ResourceNotFound" :portkey.aws.sagemaker.-2017-07-24/resource-not-found}})))))
(clojure.spec.alpha/fdef stop-training-job :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker.-2017-07-24/stop-training-job-request) :ret clojure.core/true?)

(clojure.core/defn update-notebook-instance-lifecycle-config ([update-notebook-instance-lifecycle-config-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-update-notebook-instance-lifecycle-config-input update-notebook-instance-lifecycle-config-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker.-2017-07-24/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker.-2017-07-24/update-notebook-instance-lifecycle-config-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker.-2017-07-24/update-notebook-instance-lifecycle-config-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateNotebookInstanceLifecycleConfig", :http.request.configuration/output-deser-fn deser-update-notebook-instance-lifecycle-config-output, :http.request.spec/error-spec {"ResourceLimitExceeded" :portkey.aws.sagemaker.-2017-07-24/resource-limit-exceeded}})))))
(clojure.spec.alpha/fdef update-notebook-instance-lifecycle-config :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker.-2017-07-24/update-notebook-instance-lifecycle-config-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/update-notebook-instance-lifecycle-config-output))

(clojure.core/defn list-hyper-parameter-tuning-jobs ([] (list-hyper-parameter-tuning-jobs {})) ([list-hyper-parameter-tuning-jobs-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-hyper-parameter-tuning-jobs-request list-hyper-parameter-tuning-jobs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker.-2017-07-24/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker.-2017-07-24/list-hyper-parameter-tuning-jobs-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker.-2017-07-24/list-hyper-parameter-tuning-jobs-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListHyperParameterTuningJobs", :http.request.configuration/output-deser-fn deser-list-hyper-parameter-tuning-jobs-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-hyper-parameter-tuning-jobs :args (clojure.spec.alpha/? :portkey.aws.sagemaker.-2017-07-24/list-hyper-parameter-tuning-jobs-request) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/list-hyper-parameter-tuning-jobs-response))

(clojure.core/defn add-tags ([add-tags-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-add-tags-input add-tags-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker.-2017-07-24/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker.-2017-07-24/add-tags-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker.-2017-07-24/add-tags-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AddTags", :http.request.configuration/output-deser-fn deser-add-tags-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef add-tags :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker.-2017-07-24/add-tags-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/add-tags-output))

(clojure.core/defn describe-endpoint-config ([describe-endpoint-config-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-endpoint-config-input describe-endpoint-config-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker.-2017-07-24/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker.-2017-07-24/describe-endpoint-config-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker.-2017-07-24/describe-endpoint-config-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeEndpointConfig", :http.request.configuration/output-deser-fn deser-describe-endpoint-config-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-endpoint-config :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker.-2017-07-24/describe-endpoint-config-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/describe-endpoint-config-output))

(clojure.core/defn list-transform-jobs ([] (list-transform-jobs {})) ([list-transform-jobs-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-transform-jobs-request list-transform-jobs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker.-2017-07-24/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker.-2017-07-24/list-transform-jobs-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker.-2017-07-24/list-transform-jobs-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTransformJobs", :http.request.configuration/output-deser-fn deser-list-transform-jobs-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-transform-jobs :args (clojure.spec.alpha/? :portkey.aws.sagemaker.-2017-07-24/list-transform-jobs-request) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/list-transform-jobs-response))

(clojure.core/defn describe-notebook-instance ([describe-notebook-instance-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-notebook-instance-input describe-notebook-instance-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker.-2017-07-24/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker.-2017-07-24/describe-notebook-instance-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker.-2017-07-24/describe-notebook-instance-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeNotebookInstance", :http.request.configuration/output-deser-fn deser-describe-notebook-instance-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-notebook-instance :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker.-2017-07-24/describe-notebook-instance-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/describe-notebook-instance-output))

(clojure.core/defn delete-endpoint ([delete-endpoint-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-endpoint-input delete-endpoint-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker.-2017-07-24/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker.-2017-07-24/delete-endpoint-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteEndpoint", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker.-2017-07-24/delete-endpoint-input) :ret clojure.core/true?)

(clojure.core/defn list-endpoints ([] (list-endpoints {})) ([list-endpoints-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-endpoints-input list-endpoints-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker.-2017-07-24/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker.-2017-07-24/list-endpoints-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker.-2017-07-24/list-endpoints-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListEndpoints", :http.request.configuration/output-deser-fn deser-list-endpoints-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-endpoints :args (clojure.spec.alpha/? :portkey.aws.sagemaker.-2017-07-24/list-endpoints-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/list-endpoints-output))

(clojure.core/defn delete-notebook-instance-lifecycle-config ([delete-notebook-instance-lifecycle-config-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-notebook-instance-lifecycle-config-input delete-notebook-instance-lifecycle-config-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker.-2017-07-24/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker.-2017-07-24/delete-notebook-instance-lifecycle-config-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteNotebookInstanceLifecycleConfig", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-notebook-instance-lifecycle-config :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker.-2017-07-24/delete-notebook-instance-lifecycle-config-input) :ret clojure.core/true?)

(clojure.core/defn create-hyper-parameter-tuning-job ([create-hyper-parameter-tuning-job-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-hyper-parameter-tuning-job-request create-hyper-parameter-tuning-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker.-2017-07-24/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker.-2017-07-24/create-hyper-parameter-tuning-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker.-2017-07-24/create-hyper-parameter-tuning-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateHyperParameterTuningJob", :http.request.configuration/output-deser-fn deser-create-hyper-parameter-tuning-job-response, :http.request.spec/error-spec {"ResourceInUse" :portkey.aws.sagemaker.-2017-07-24/resource-in-use, "ResourceLimitExceeded" :portkey.aws.sagemaker.-2017-07-24/resource-limit-exceeded}})))))
(clojure.spec.alpha/fdef create-hyper-parameter-tuning-job :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker.-2017-07-24/create-hyper-parameter-tuning-job-request) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker.-2017-07-24/create-hyper-parameter-tuning-job-response))
