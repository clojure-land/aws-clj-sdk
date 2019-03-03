(ns portkey.aws.dms (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "dms", :region "ap-northeast-1"},
    :ssl-common-name "dms.ap-northeast-1.amazonaws.com",
    :endpoint "https://dms.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "dms", :region "eu-west-1"},
    :ssl-common-name "dms.eu-west-1.amazonaws.com",
    :endpoint "https://dms.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "dms", :region "us-east-2"},
    :ssl-common-name "dms.us-east-2.amazonaws.com",
    :endpoint "https://dms.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "dms", :region "ap-southeast-2"},
    :ssl-common-name "dms.ap-southeast-2.amazonaws.com",
    :endpoint "https://dms.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "dms", :region "sa-east-1"},
    :ssl-common-name "dms.sa-east-1.amazonaws.com",
    :endpoint "https://dms.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "dms", :region "ap-southeast-1"},
    :ssl-common-name "dms.ap-southeast-1.amazonaws.com",
    :endpoint "https://dms.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "dms", :region "ap-northeast-2"},
    :ssl-common-name "dms.ap-northeast-2.amazonaws.com",
    :endpoint "https://dms.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "dms", :region "eu-west-3"},
    :ssl-common-name "dms.eu-west-3.amazonaws.com",
    :endpoint "https://dms.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "dms", :region "ca-central-1"},
    :ssl-common-name "dms.ca-central-1.amazonaws.com",
    :endpoint "https://dms.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "dms", :region "eu-central-1"},
    :ssl-common-name "dms.eu-central-1.amazonaws.com",
    :endpoint "https://dms.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "dms", :region "eu-west-2"},
    :ssl-common-name "dms.eu-west-2.amazonaws.com",
    :endpoint "https://dms.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "dms", :region "us-gov-west-1"},
    :ssl-common-name "dms.us-gov-west-1.amazonaws.com",
    :endpoint "https://dms.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "dms", :region "us-west-2"},
    :ssl-common-name "dms.us-west-2.amazonaws.com",
    :endpoint "https://dms.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "dms", :region "us-east-1"},
    :ssl-common-name "dms.us-east-1.amazonaws.com",
    :endpoint "https://dms.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "dms", :region "us-west-1"},
    :ssl-common-name "dms.us-west-1.amazonaws.com",
    :endpoint "https://dms.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "dms", :region "ap-south-1"},
    :ssl-common-name "dms.ap-south-1.amazonaws.com",
    :endpoint "https://dms.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-subnet-identifier-list)

(clojure.core/declare ser-filter-value-list)

(clojure.core/declare ser-filter)

(clojure.core/declare ser-s-3-settings)

(clojure.core/declare ser-start-replication-task-type-value)

(clojure.core/declare ser-compression-type-value)

(clojure.core/declare ser-source-ids-list)

(clojure.core/declare ser-dms-transfer-settings)

(clojure.core/declare ser-key-list)

(clojure.core/declare ser-certificate-wallet)

(clojure.core/declare ser-source-type)

(clojure.core/declare ser-table-list-to-reload)

(clojure.core/declare ser-auth-type-value)

(clojure.core/declare ser-reload-option-value)

(clojure.core/declare ser-replication-endpoint-type-value)

(clojure.core/declare ser-tag-list)

(clojure.core/declare ser-mongo-db-settings)

(clojure.core/declare ser-nesting-level-value)

(clojure.core/declare ser-string)

(clojure.core/declare ser-vpc-security-group-id-list)

(clojure.core/declare ser-dynamo-db-settings)

(clojure.core/declare ser-t-stamp)

(clojure.core/declare ser-dms-ssl-mode-value)

(clojure.core/declare ser-event-categories-list)

(clojure.core/declare ser-auth-mechanism-value)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-boolean-optional)

(clojure.core/declare ser-table-to-reload)

(clojure.core/declare ser-migration-type-value)

(clojure.core/declare ser-integer-optional)

(clojure.core/declare ser-filter-list)

(clojure.core/declare ser-secret-string)

(clojure.core/declare ser-boolean)

(clojure.core/defn- ser-subnet-identifier-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String"}))) input), :shape "SubnetIdentifierList", :type "list"})

(clojure.core/defn- ser-filter-value-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String"}))) input), :shape "FilterValueList", :type "list"})

(clojure.core/defn- ser-filter [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:name input)) #:http.request.field{:name "Name", :shape "String"}) (clojure.core/into (ser-filter-value-list (:values input)) #:http.request.field{:name "Values", :shape "FilterValueList"})], :shape "Filter", :type "structure"}))

(clojure.core/defn- ser-s-3-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "S3Settings", :type "structure"} (clojure.core/contains? input :service-access-role-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :service-access-role-arn)) #:http.request.field{:name "ServiceAccessRoleArn", :shape "String"})) (clojure.core/contains? input :external-table-definition) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :external-table-definition)) #:http.request.field{:name "ExternalTableDefinition", :shape "String"})) (clojure.core/contains? input :csv-row-delimiter) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :csv-row-delimiter)) #:http.request.field{:name "CsvRowDelimiter", :shape "String"})) (clojure.core/contains? input :csv-delimiter) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :csv-delimiter)) #:http.request.field{:name "CsvDelimiter", :shape "String"})) (clojure.core/contains? input :bucket-folder) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :bucket-folder)) #:http.request.field{:name "BucketFolder", :shape "String"})) (clojure.core/contains? input :bucket-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :bucket-name)) #:http.request.field{:name "BucketName", :shape "String"})) (clojure.core/contains? input :compression-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-compression-type-value (input :compression-type)) #:http.request.field{:name "CompressionType", :shape "CompressionTypeValue"}))))

(clojure.core/defn- ser-start-replication-task-type-value [input] #:http.request.field{:value (clojure.core/get {"start-replication" "start-replication", :startreplication "start-replication", "resume-processing" "resume-processing", :resumeprocessing "resume-processing", "reload-target" "reload-target", :reloadtarget "reload-target"} input), :shape "StartReplicationTaskTypeValue"})

(clojure.core/defn- ser-compression-type-value [input] #:http.request.field{:value (clojure.core/get {"none" "none", :none "none", "gzip" "gzip", :gzip "gzip"} input), :shape "CompressionTypeValue"})

(clojure.core/defn- ser-source-ids-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String"}))) input), :shape "SourceIdsList", :type "list"})

(clojure.core/defn- ser-dms-transfer-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DmsTransferSettings", :type "structure"} (clojure.core/contains? input :service-access-role-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :service-access-role-arn)) #:http.request.field{:name "ServiceAccessRoleArn", :shape "String"})) (clojure.core/contains? input :bucket-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :bucket-name)) #:http.request.field{:name "BucketName", :shape "String"}))))

(clojure.core/defn- ser-key-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String"}))) input), :shape "KeyList", :type "list"})

(clojure.core/defn- ser-certificate-wallet [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "CertificateWallet"})

(clojure.core/defn- ser-source-type [input] #:http.request.field{:value (clojure.core/get {"replication-instance" "replication-instance", :replicationinstance "replication-instance"} input), :shape "SourceType"})

(clojure.core/defn- ser-table-list-to-reload [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-table-to-reload coll) #:http.request.field{:shape "TableToReload"}))) input), :shape "TableListToReload", :type "list"})

(clojure.core/defn- ser-auth-type-value [input] #:http.request.field{:value (clojure.core/get {"no" "no", :no "no", "password" "password", :password "password"} input), :shape "AuthTypeValue"})

(clojure.core/defn- ser-reload-option-value [input] #:http.request.field{:value (clojure.core/get {"data-reload" "data-reload", :datareload "data-reload", "validate-only" "validate-only", :validateonly "validate-only"} input), :shape "ReloadOptionValue"})

(clojure.core/defn- ser-replication-endpoint-type-value [input] #:http.request.field{:value (clojure.core/get {"source" "source", :source "source", "target" "target", :target "target"} input), :shape "ReplicationEndpointTypeValue"})

(clojure.core/defn- ser-tag-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "TagList", :type "list"})

(clojure.core/defn- ser-mongo-db-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "MongoDbSettings", :type "structure"} (clojure.core/contains? input :username) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :username)) #:http.request.field{:name "Username", :shape "String"})) (clojure.core/contains? input :password) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-secret-string (input :password)) #:http.request.field{:name "Password", :shape "SecretString"})) (clojure.core/contains? input :database-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :database-name)) #:http.request.field{:name "DatabaseName", :shape "String"})) (clojure.core/contains? input :extract-doc-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :extract-doc-id)) #:http.request.field{:name "ExtractDocId", :shape "String"})) (clojure.core/contains? input :auth-mechanism) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-auth-mechanism-value (input :auth-mechanism)) #:http.request.field{:name "AuthMechanism", :shape "AuthMechanismValue"})) (clojure.core/contains? input :port) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-optional (input :port)) #:http.request.field{:name "Port", :shape "IntegerOptional"})) (clojure.core/contains? input :kms-key-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :kms-key-id)) #:http.request.field{:name "KmsKeyId", :shape "String"})) (clojure.core/contains? input :auth-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-auth-type-value (input :auth-type)) #:http.request.field{:name "AuthType", :shape "AuthTypeValue"})) (clojure.core/contains? input :auth-source) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :auth-source)) #:http.request.field{:name "AuthSource", :shape "String"})) (clojure.core/contains? input :server-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :server-name)) #:http.request.field{:name "ServerName", :shape "String"})) (clojure.core/contains? input :docs-to-investigate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :docs-to-investigate)) #:http.request.field{:name "DocsToInvestigate", :shape "String"})) (clojure.core/contains? input :nesting-level) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-nesting-level-value (input :nesting-level)) #:http.request.field{:name "NestingLevel", :shape "NestingLevelValue"}))))

(clojure.core/defn- ser-nesting-level-value [input] #:http.request.field{:value (clojure.core/get {"none" "none", :none "none", "one" "one", :one "one"} input), :shape "NestingLevelValue"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-vpc-security-group-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String"}))) input), :shape "VpcSecurityGroupIdList", :type "list"})

(clojure.core/defn- ser-dynamo-db-settings [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:service-access-role-arn input)) #:http.request.field{:name "ServiceAccessRoleArn", :shape "String"})], :shape "DynamoDbSettings", :type "structure"}))

(clojure.core/defn- ser-t-stamp [input] #:http.request.field{:value input, :shape "TStamp"})

(clojure.core/defn- ser-dms-ssl-mode-value [input] #:http.request.field{:value (clojure.core/get {"none" "none", :none "none", "require" "require", :require "require", "verify-ca" "verify-ca", :verifyca "verify-ca", "verify-full" "verify-full", :verifyfull "verify-full"} input), :shape "DmsSslModeValue"})

(clojure.core/defn- ser-event-categories-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String"}))) input), :shape "EventCategoriesList", :type "list"})

(clojure.core/defn- ser-auth-mechanism-value [input] #:http.request.field{:value (clojure.core/get {"default" "default", :default "default", "mongodb_cr" "mongodb_cr", :mongodb-cr "mongodb_cr", "scram_sha_1" "scram_sha_1", :scram-sha-1 "scram_sha_1"} input), :shape "AuthMechanismValue"})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Tag", :type "structure"} (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :key)) #:http.request.field{:name "Key", :shape "String"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :value)) #:http.request.field{:name "Value", :shape "String"}))))

(clojure.core/defn- ser-boolean-optional [input] #:http.request.field{:value input, :shape "BooleanOptional"})

(clojure.core/defn- ser-table-to-reload [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TableToReload", :type "structure"} (clojure.core/contains? input :schema-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :schema-name)) #:http.request.field{:name "SchemaName", :shape "String"})) (clojure.core/contains? input :table-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :table-name)) #:http.request.field{:name "TableName", :shape "String"}))))

(clojure.core/defn- ser-migration-type-value [input] #:http.request.field{:value (clojure.core/get {"full-load" "full-load", :fullload "full-load", "cdc" "cdc", :cdc "cdc", "full-load-and-cdc" "full-load-and-cdc", :fullloadandcdc "full-load-and-cdc"} input), :shape "MigrationTypeValue"})

(clojure.core/defn- ser-integer-optional [input] #:http.request.field{:value input, :shape "IntegerOptional"})

(clojure.core/defn- ser-filter-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-filter coll) #:http.request.field{:shape "Filter"}))) input), :shape "FilterList", :type "list"})

(clojure.core/defn- ser-secret-string [input] #:http.request.field{:value input, :shape "SecretString"})

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "Boolean"})

(clojure.core/defn- req-describe-connections-message [input] (clojure.core/cond-> {} (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-list (input :filters)) #:http.request.field{:name "Filters", :shape "FilterList"})) (clojure.core/contains? input :max-records) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-optional (input :max-records)) #:http.request.field{:name "MaxRecords", :shape "IntegerOptional"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :marker)) #:http.request.field{:name "Marker", :shape "String"}))))

(clojure.core/defn- req-describe-endpoints-message [input] (clojure.core/cond-> {} (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-list (input :filters)) #:http.request.field{:name "Filters", :shape "FilterList"})) (clojure.core/contains? input :max-records) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-optional (input :max-records)) #:http.request.field{:name "MaxRecords", :shape "IntegerOptional"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :marker)) #:http.request.field{:name "Marker", :shape "String"}))))

(clojure.core/defn- req-describe-event-subscriptions-message [input] (clojure.core/cond-> {} (clojure.core/contains? input :subscription-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :subscription-name)) #:http.request.field{:name "SubscriptionName", :shape "String"})) (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-list (input :filters)) #:http.request.field{:name "Filters", :shape "FilterList"})) (clojure.core/contains? input :max-records) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-optional (input :max-records)) #:http.request.field{:name "MaxRecords", :shape "IntegerOptional"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :marker)) #:http.request.field{:name "Marker", :shape "String"}))))

(clojure.core/defn- req-delete-endpoint-message [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :endpoint-arn)) #:http.request.field{:name "EndpointArn", :shape "String"})]}))

(clojure.core/defn- req-describe-replication-instance-task-logs-message [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :replication-instance-arn)) #:http.request.field{:name "ReplicationInstanceArn", :shape "String"})]} (clojure.core/contains? input :max-records) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-optional (input :max-records)) #:http.request.field{:name "MaxRecords", :shape "IntegerOptional"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :marker)) #:http.request.field{:name "Marker", :shape "String"}))))

(clojure.core/defn- req-modify-replication-subnet-group-message [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :replication-subnet-group-identifier)) #:http.request.field{:name "ReplicationSubnetGroupIdentifier", :shape "String"}) (clojure.core/into (ser-subnet-identifier-list (input :subnet-ids)) #:http.request.field{:name "SubnetIds", :shape "SubnetIdentifierList"})]} (clojure.core/contains? input :replication-subnet-group-description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :replication-subnet-group-description)) #:http.request.field{:name "ReplicationSubnetGroupDescription", :shape "String"}))))

(clojure.core/defn- req-describe-replication-task-assessment-results-message [input] (clojure.core/cond-> {} (clojure.core/contains? input :replication-task-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :replication-task-arn)) #:http.request.field{:name "ReplicationTaskArn", :shape "String"})) (clojure.core/contains? input :max-records) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-optional (input :max-records)) #:http.request.field{:name "MaxRecords", :shape "IntegerOptional"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :marker)) #:http.request.field{:name "Marker", :shape "String"}))))

(clojure.core/defn- req-describe-events-message [input] (clojure.core/cond-> {} (clojure.core/contains? input :end-time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-t-stamp (input :end-time)) #:http.request.field{:name "EndTime", :shape "TStamp"})) (clojure.core/contains? input :start-time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-t-stamp (input :start-time)) #:http.request.field{:name "StartTime", :shape "TStamp"})) (clojure.core/contains? input :max-records) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-optional (input :max-records)) #:http.request.field{:name "MaxRecords", :shape "IntegerOptional"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :marker)) #:http.request.field{:name "Marker", :shape "String"})) (clojure.core/contains? input :source-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-source-type (input :source-type)) #:http.request.field{:name "SourceType", :shape "SourceType"})) (clojure.core/contains? input :duration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-optional (input :duration)) #:http.request.field{:name "Duration", :shape "IntegerOptional"})) (clojure.core/contains? input :event-categories) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-event-categories-list (input :event-categories)) #:http.request.field{:name "EventCategories", :shape "EventCategoriesList"})) (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-list (input :filters)) #:http.request.field{:name "Filters", :shape "FilterList"})) (clojure.core/contains? input :source-identifier) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :source-identifier)) #:http.request.field{:name "SourceIdentifier", :shape "String"}))))

(clojure.core/defn- req-create-replication-subnet-group-message [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :replication-subnet-group-identifier)) #:http.request.field{:name "ReplicationSubnetGroupIdentifier", :shape "String"}) (clojure.core/into (ser-string (input :replication-subnet-group-description)) #:http.request.field{:name "ReplicationSubnetGroupDescription", :shape "String"}) (clojure.core/into (ser-subnet-identifier-list (input :subnet-ids)) #:http.request.field{:name "SubnetIds", :shape "SubnetIdentifierList"})]} (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"}))))

(clojure.core/defn- req-delete-certificate-message [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :certificate-arn)) #:http.request.field{:name "CertificateArn", :shape "String"})]}))

(clojure.core/defn- req-create-replication-task-message [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :replication-task-identifier)) #:http.request.field{:name "ReplicationTaskIdentifier", :shape "String"}) (clojure.core/into (ser-string (input :source-endpoint-arn)) #:http.request.field{:name "SourceEndpointArn", :shape "String"}) (clojure.core/into (ser-string (input :target-endpoint-arn)) #:http.request.field{:name "TargetEndpointArn", :shape "String"}) (clojure.core/into (ser-string (input :replication-instance-arn)) #:http.request.field{:name "ReplicationInstanceArn", :shape "String"}) (clojure.core/into (ser-migration-type-value (input :migration-type)) #:http.request.field{:name "MigrationType", :shape "MigrationTypeValue"}) (clojure.core/into (ser-string (input :table-mappings)) #:http.request.field{:name "TableMappings", :shape "String"})]} (clojure.core/contains? input :cdc-start-time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-t-stamp (input :cdc-start-time)) #:http.request.field{:name "CdcStartTime", :shape "TStamp"})) (clojure.core/contains? input :replication-task-settings) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :replication-task-settings)) #:http.request.field{:name "ReplicationTaskSettings", :shape "String"})) (clojure.core/contains? input :cdc-stop-position) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cdc-stop-position)) #:http.request.field{:name "CdcStopPosition", :shape "String"})) (clojure.core/contains? input :cdc-start-position) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cdc-start-position)) #:http.request.field{:name "CdcStartPosition", :shape "String"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"}))))

(clojure.core/defn- req-delete-event-subscription-message [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :subscription-name)) #:http.request.field{:name "SubscriptionName", :shape "String"})]}))

(clojure.core/defn- req-delete-replication-subnet-group-message [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :replication-subnet-group-identifier)) #:http.request.field{:name "ReplicationSubnetGroupIdentifier", :shape "String"})]}))

(clojure.core/defn- req-import-certificate-message [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :certificate-identifier)) #:http.request.field{:name "CertificateIdentifier", :shape "String"})]} (clojure.core/contains? input :certificate-pem) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :certificate-pem)) #:http.request.field{:name "CertificatePem", :shape "String"})) (clojure.core/contains? input :certificate-wallet) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-certificate-wallet (input :certificate-wallet)) #:http.request.field{:name "CertificateWallet", :shape "CertificateWallet"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"}))))

(clojure.core/defn- req-describe-replication-tasks-message [input] (clojure.core/cond-> {} (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-list (input :filters)) #:http.request.field{:name "Filters", :shape "FilterList"})) (clojure.core/contains? input :max-records) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-optional (input :max-records)) #:http.request.field{:name "MaxRecords", :shape "IntegerOptional"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :marker)) #:http.request.field{:name "Marker", :shape "String"}))))

(clojure.core/defn- req-stop-replication-task-message [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :replication-task-arn)) #:http.request.field{:name "ReplicationTaskArn", :shape "String"})]}))

(clojure.core/defn- req-modify-replication-instance-message [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :replication-instance-arn)) #:http.request.field{:name "ReplicationInstanceArn", :shape "String"})]} (clojure.core/contains? input :replication-instance-class) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :replication-instance-class)) #:http.request.field{:name "ReplicationInstanceClass", :shape "String"})) (clojure.core/contains? input :preferred-maintenance-window) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :preferred-maintenance-window)) #:http.request.field{:name "PreferredMaintenanceWindow", :shape "String"})) (clojure.core/contains? input :auto-minor-version-upgrade) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-optional (input :auto-minor-version-upgrade)) #:http.request.field{:name "AutoMinorVersionUpgrade", :shape "BooleanOptional"})) (clojure.core/contains? input :vpc-security-group-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-vpc-security-group-id-list (input :vpc-security-group-ids)) #:http.request.field{:name "VpcSecurityGroupIds", :shape "VpcSecurityGroupIdList"})) (clojure.core/contains? input :replication-instance-identifier) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :replication-instance-identifier)) #:http.request.field{:name "ReplicationInstanceIdentifier", :shape "String"})) (clojure.core/contains? input :allow-major-version-upgrade) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :allow-major-version-upgrade)) #:http.request.field{:name "AllowMajorVersionUpgrade", :shape "Boolean"})) (clojure.core/contains? input :allocated-storage) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-optional (input :allocated-storage)) #:http.request.field{:name "AllocatedStorage", :shape "IntegerOptional"})) (clojure.core/contains? input :engine-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :engine-version)) #:http.request.field{:name "EngineVersion", :shape "String"})) (clojure.core/contains? input :apply-immediately) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :apply-immediately)) #:http.request.field{:name "ApplyImmediately", :shape "Boolean"})) (clojure.core/contains? input :multi-az) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-optional (input :multi-az)) #:http.request.field{:name "MultiAZ", :shape "BooleanOptional"}))))

(clojure.core/defn- req-reload-tables-message [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :replication-task-arn)) #:http.request.field{:name "ReplicationTaskArn", :shape "String"}) (clojure.core/into (ser-table-list-to-reload (input :tables-to-reload)) #:http.request.field{:name "TablesToReload", :shape "TableListToReload"})]} (clojure.core/contains? input :reload-option) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-reload-option-value (input :reload-option)) #:http.request.field{:name "ReloadOption", :shape "ReloadOptionValue"}))))

(clojure.core/defn- req-add-tags-to-resource-message [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "String"}) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"})]}))

(clojure.core/defn- req-describe-table-statistics-message [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :replication-task-arn)) #:http.request.field{:name "ReplicationTaskArn", :shape "String"})]} (clojure.core/contains? input :max-records) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-optional (input :max-records)) #:http.request.field{:name "MaxRecords", :shape "IntegerOptional"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :marker)) #:http.request.field{:name "Marker", :shape "String"})) (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-list (input :filters)) #:http.request.field{:name "Filters", :shape "FilterList"}))))

(clojure.core/defn- req-describe-schemas-message [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :endpoint-arn)) #:http.request.field{:name "EndpointArn", :shape "String"})]} (clojure.core/contains? input :max-records) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-optional (input :max-records)) #:http.request.field{:name "MaxRecords", :shape "IntegerOptional"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :marker)) #:http.request.field{:name "Marker", :shape "String"}))))

(clojure.core/defn- req-delete-replication-task-message [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :replication-task-arn)) #:http.request.field{:name "ReplicationTaskArn", :shape "String"})]}))

(clojure.core/defn- req-modify-replication-task-message [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :replication-task-arn)) #:http.request.field{:name "ReplicationTaskArn", :shape "String"})]} (clojure.core/contains? input :replication-task-identifier) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :replication-task-identifier)) #:http.request.field{:name "ReplicationTaskIdentifier", :shape "String"})) (clojure.core/contains? input :migration-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-migration-type-value (input :migration-type)) #:http.request.field{:name "MigrationType", :shape "MigrationTypeValue"})) (clojure.core/contains? input :table-mappings) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :table-mappings)) #:http.request.field{:name "TableMappings", :shape "String"})) (clojure.core/contains? input :replication-task-settings) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :replication-task-settings)) #:http.request.field{:name "ReplicationTaskSettings", :shape "String"})) (clojure.core/contains? input :cdc-start-time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-t-stamp (input :cdc-start-time)) #:http.request.field{:name "CdcStartTime", :shape "TStamp"})) (clojure.core/contains? input :cdc-start-position) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cdc-start-position)) #:http.request.field{:name "CdcStartPosition", :shape "String"})) (clojure.core/contains? input :cdc-stop-position) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cdc-stop-position)) #:http.request.field{:name "CdcStopPosition", :shape "String"}))))

(clojure.core/defn- req-describe-replication-instances-message [input] (clojure.core/cond-> {} (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-list (input :filters)) #:http.request.field{:name "Filters", :shape "FilterList"})) (clojure.core/contains? input :max-records) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-optional (input :max-records)) #:http.request.field{:name "MaxRecords", :shape "IntegerOptional"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :marker)) #:http.request.field{:name "Marker", :shape "String"}))))

(clojure.core/defn- req-remove-tags-from-resource-message [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "String"}) (clojure.core/into (ser-key-list (input :tag-keys)) #:http.request.field{:name "TagKeys", :shape "KeyList"})]}))

(clojure.core/defn- req-start-replication-task-assessment-message [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :replication-task-arn)) #:http.request.field{:name "ReplicationTaskArn", :shape "String"})]}))

(clojure.core/defn- req-describe-certificates-message [input] (clojure.core/cond-> {} (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-list (input :filters)) #:http.request.field{:name "Filters", :shape "FilterList"})) (clojure.core/contains? input :max-records) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-optional (input :max-records)) #:http.request.field{:name "MaxRecords", :shape "IntegerOptional"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :marker)) #:http.request.field{:name "Marker", :shape "String"}))))

(clojure.core/defn- req-create-event-subscription-message [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :subscription-name)) #:http.request.field{:name "SubscriptionName", :shape "String"}) (clojure.core/into (ser-string (input :sns-topic-arn)) #:http.request.field{:name "SnsTopicArn", :shape "String"})]} (clojure.core/contains? input :source-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :source-type)) #:http.request.field{:name "SourceType", :shape "String"})) (clojure.core/contains? input :event-categories) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-event-categories-list (input :event-categories)) #:http.request.field{:name "EventCategories", :shape "EventCategoriesList"})) (clojure.core/contains? input :source-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-source-ids-list (input :source-ids)) #:http.request.field{:name "SourceIds", :shape "SourceIdsList"})) (clojure.core/contains? input :enabled) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-optional (input :enabled)) #:http.request.field{:name "Enabled", :shape "BooleanOptional"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"}))))

(clojure.core/defn- req-describe-refresh-schemas-status-message [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :endpoint-arn)) #:http.request.field{:name "EndpointArn", :shape "String"})]}))

(clojure.core/defn- req-create-endpoint-message [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :endpoint-identifier)) #:http.request.field{:name "EndpointIdentifier", :shape "String"}) (clojure.core/into (ser-replication-endpoint-type-value (input :endpoint-type)) #:http.request.field{:name "EndpointType", :shape "ReplicationEndpointTypeValue"}) (clojure.core/into (ser-string (input :engine-name)) #:http.request.field{:name "EngineName", :shape "String"})]} (clojure.core/contains? input :username) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :username)) #:http.request.field{:name "Username", :shape "String"})) (clojure.core/contains? input :s-3-settings) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-settings (input :s-3-settings)) #:http.request.field{:name "S3Settings", :shape "S3Settings"})) (clojure.core/contains? input :dms-transfer-settings) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dms-transfer-settings (input :dms-transfer-settings)) #:http.request.field{:name "DmsTransferSettings", :shape "DmsTransferSettings"})) (clojure.core/contains? input :password) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-secret-string (input :password)) #:http.request.field{:name "Password", :shape "SecretString"})) (clojure.core/contains? input :database-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :database-name)) #:http.request.field{:name "DatabaseName", :shape "String"})) (clojure.core/contains? input :extra-connection-attributes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :extra-connection-attributes)) #:http.request.field{:name "ExtraConnectionAttributes", :shape "String"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"})) (clojure.core/contains? input :service-access-role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :service-access-role-arn)) #:http.request.field{:name "ServiceAccessRoleArn", :shape "String"})) (clojure.core/contains? input :external-table-definition) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :external-table-definition)) #:http.request.field{:name "ExternalTableDefinition", :shape "String"})) (clojure.core/contains? input :mongo-db-settings) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mongo-db-settings (input :mongo-db-settings)) #:http.request.field{:name "MongoDbSettings", :shape "MongoDbSettings"})) (clojure.core/contains? input :port) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-optional (input :port)) #:http.request.field{:name "Port", :shape "IntegerOptional"})) (clojure.core/contains? input :kms-key-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :kms-key-id)) #:http.request.field{:name "KmsKeyId", :shape "String"})) (clojure.core/contains? input :ssl-mode) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dms-ssl-mode-value (input :ssl-mode)) #:http.request.field{:name "SslMode", :shape "DmsSslModeValue"})) (clojure.core/contains? input :dynamo-db-settings) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dynamo-db-settings (input :dynamo-db-settings)) #:http.request.field{:name "DynamoDbSettings", :shape "DynamoDbSettings"})) (clojure.core/contains? input :certificate-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :certificate-arn)) #:http.request.field{:name "CertificateArn", :shape "String"})) (clojure.core/contains? input :server-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :server-name)) #:http.request.field{:name "ServerName", :shape "String"}))))

(clojure.core/defn- req-describe-replication-subnet-groups-message [input] (clojure.core/cond-> {} (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-list (input :filters)) #:http.request.field{:name "Filters", :shape "FilterList"})) (clojure.core/contains? input :max-records) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-optional (input :max-records)) #:http.request.field{:name "MaxRecords", :shape "IntegerOptional"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :marker)) #:http.request.field{:name "Marker", :shape "String"}))))

(clojure.core/defn- req-describe-event-categories-message [input] (clojure.core/cond-> {} (clojure.core/contains? input :source-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :source-type)) #:http.request.field{:name "SourceType", :shape "String"})) (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-list (input :filters)) #:http.request.field{:name "Filters", :shape "FilterList"}))))

(clojure.core/defn- req-test-connection-message [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :replication-instance-arn)) #:http.request.field{:name "ReplicationInstanceArn", :shape "String"}) (clojure.core/into (ser-string (input :endpoint-arn)) #:http.request.field{:name "EndpointArn", :shape "String"})]}))

(clojure.core/defn- req-describe-orderable-replication-instances-message [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-records) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-optional (input :max-records)) #:http.request.field{:name "MaxRecords", :shape "IntegerOptional"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :marker)) #:http.request.field{:name "Marker", :shape "String"}))))

(clojure.core/defn- req-list-tags-for-resource-message [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "String"})]}))

(clojure.core/defn- req-describe-account-attributes-message [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-create-replication-instance-message [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :replication-instance-identifier)) #:http.request.field{:name "ReplicationInstanceIdentifier", :shape "String"}) (clojure.core/into (ser-string (input :replication-instance-class)) #:http.request.field{:name "ReplicationInstanceClass", :shape "String"})]} (clojure.core/contains? input :publicly-accessible) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-optional (input :publicly-accessible)) #:http.request.field{:name "PubliclyAccessible", :shape "BooleanOptional"})) (clojure.core/contains? input :preferred-maintenance-window) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :preferred-maintenance-window)) #:http.request.field{:name "PreferredMaintenanceWindow", :shape "String"})) (clojure.core/contains? input :auto-minor-version-upgrade) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-optional (input :auto-minor-version-upgrade)) #:http.request.field{:name "AutoMinorVersionUpgrade", :shape "BooleanOptional"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"})) (clojure.core/contains? input :vpc-security-group-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-vpc-security-group-id-list (input :vpc-security-group-ids)) #:http.request.field{:name "VpcSecurityGroupIds", :shape "VpcSecurityGroupIdList"})) (clojure.core/contains? input :availability-zone) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :availability-zone)) #:http.request.field{:name "AvailabilityZone", :shape "String"})) (clojure.core/contains? input :allocated-storage) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-optional (input :allocated-storage)) #:http.request.field{:name "AllocatedStorage", :shape "IntegerOptional"})) (clojure.core/contains? input :replication-subnet-group-identifier) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :replication-subnet-group-identifier)) #:http.request.field{:name "ReplicationSubnetGroupIdentifier", :shape "String"})) (clojure.core/contains? input :engine-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :engine-version)) #:http.request.field{:name "EngineVersion", :shape "String"})) (clojure.core/contains? input :kms-key-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :kms-key-id)) #:http.request.field{:name "KmsKeyId", :shape "String"})) (clojure.core/contains? input :multi-az) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-optional (input :multi-az)) #:http.request.field{:name "MultiAZ", :shape "BooleanOptional"}))))

(clojure.core/defn- req-refresh-schemas-message [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :endpoint-arn)) #:http.request.field{:name "EndpointArn", :shape "String"}) (clojure.core/into (ser-string (input :replication-instance-arn)) #:http.request.field{:name "ReplicationInstanceArn", :shape "String"})]}))

(clojure.core/defn- req-delete-replication-instance-message [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :replication-instance-arn)) #:http.request.field{:name "ReplicationInstanceArn", :shape "String"})]}))

(clojure.core/defn- req-reboot-replication-instance-message [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :replication-instance-arn)) #:http.request.field{:name "ReplicationInstanceArn", :shape "String"})]} (clojure.core/contains? input :force-failover) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-optional (input :force-failover)) #:http.request.field{:name "ForceFailover", :shape "BooleanOptional"}))))

(clojure.core/defn- req-describe-endpoint-types-message [input] (clojure.core/cond-> {} (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-list (input :filters)) #:http.request.field{:name "Filters", :shape "FilterList"})) (clojure.core/contains? input :max-records) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-optional (input :max-records)) #:http.request.field{:name "MaxRecords", :shape "IntegerOptional"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :marker)) #:http.request.field{:name "Marker", :shape "String"}))))

(clojure.core/defn- req-start-replication-task-message [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :replication-task-arn)) #:http.request.field{:name "ReplicationTaskArn", :shape "String"}) (clojure.core/into (ser-start-replication-task-type-value (input :start-replication-task-type)) #:http.request.field{:name "StartReplicationTaskType", :shape "StartReplicationTaskTypeValue"})]} (clojure.core/contains? input :cdc-start-time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-t-stamp (input :cdc-start-time)) #:http.request.field{:name "CdcStartTime", :shape "TStamp"})) (clojure.core/contains? input :cdc-start-position) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cdc-start-position)) #:http.request.field{:name "CdcStartPosition", :shape "String"})) (clojure.core/contains? input :cdc-stop-position) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cdc-stop-position)) #:http.request.field{:name "CdcStopPosition", :shape "String"}))))

(clojure.core/defn- req-modify-event-subscription-message [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :subscription-name)) #:http.request.field{:name "SubscriptionName", :shape "String"})]} (clojure.core/contains? input :sns-topic-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :sns-topic-arn)) #:http.request.field{:name "SnsTopicArn", :shape "String"})) (clojure.core/contains? input :source-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :source-type)) #:http.request.field{:name "SourceType", :shape "String"})) (clojure.core/contains? input :event-categories) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-event-categories-list (input :event-categories)) #:http.request.field{:name "EventCategories", :shape "EventCategoriesList"})) (clojure.core/contains? input :enabled) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-optional (input :enabled)) #:http.request.field{:name "Enabled", :shape "BooleanOptional"}))))

(clojure.core/defn- req-modify-endpoint-message [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :endpoint-arn)) #:http.request.field{:name "EndpointArn", :shape "String"})]} (clojure.core/contains? input :username) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :username)) #:http.request.field{:name "Username", :shape "String"})) (clojure.core/contains? input :s-3-settings) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-settings (input :s-3-settings)) #:http.request.field{:name "S3Settings", :shape "S3Settings"})) (clojure.core/contains? input :dms-transfer-settings) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dms-transfer-settings (input :dms-transfer-settings)) #:http.request.field{:name "DmsTransferSettings", :shape "DmsTransferSettings"})) (clojure.core/contains? input :engine-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :engine-name)) #:http.request.field{:name "EngineName", :shape "String"})) (clojure.core/contains? input :password) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-secret-string (input :password)) #:http.request.field{:name "Password", :shape "SecretString"})) (clojure.core/contains? input :database-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :database-name)) #:http.request.field{:name "DatabaseName", :shape "String"})) (clojure.core/contains? input :extra-connection-attributes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :extra-connection-attributes)) #:http.request.field{:name "ExtraConnectionAttributes", :shape "String"})) (clojure.core/contains? input :endpoint-identifier) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :endpoint-identifier)) #:http.request.field{:name "EndpointIdentifier", :shape "String"})) (clojure.core/contains? input :endpoint-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-replication-endpoint-type-value (input :endpoint-type)) #:http.request.field{:name "EndpointType", :shape "ReplicationEndpointTypeValue"})) (clojure.core/contains? input :service-access-role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :service-access-role-arn)) #:http.request.field{:name "ServiceAccessRoleArn", :shape "String"})) (clojure.core/contains? input :external-table-definition) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :external-table-definition)) #:http.request.field{:name "ExternalTableDefinition", :shape "String"})) (clojure.core/contains? input :mongo-db-settings) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mongo-db-settings (input :mongo-db-settings)) #:http.request.field{:name "MongoDbSettings", :shape "MongoDbSettings"})) (clojure.core/contains? input :port) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-optional (input :port)) #:http.request.field{:name "Port", :shape "IntegerOptional"})) (clojure.core/contains? input :ssl-mode) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dms-ssl-mode-value (input :ssl-mode)) #:http.request.field{:name "SslMode", :shape "DmsSslModeValue"})) (clojure.core/contains? input :dynamo-db-settings) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dynamo-db-settings (input :dynamo-db-settings)) #:http.request.field{:name "DynamoDbSettings", :shape "DynamoDbSettings"})) (clojure.core/contains? input :certificate-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :certificate-arn)) #:http.request.field{:name "CertificateArn", :shape "String"})) (clojure.core/contains? input :server-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :server-name)) #:http.request.field{:name "ServerName", :shape "String"}))))

(clojure.core/declare deser-vpc-security-group-membership-list)

(clojure.core/declare deser-certificate-list)

(clojure.core/declare deser-replication-subnet-groups)

(clojure.core/declare deser-connection-list)

(clojure.core/declare deser-schema-list)

(clojure.core/declare deser-s-3-settings)

(clojure.core/declare deser-compression-type-value)

(clojure.core/declare deser-replication-instance-task-logs-list)

(clojure.core/declare deser-source-ids-list)

(clojure.core/declare deser-dms-transfer-settings)

(clojure.core/declare deser-replication-instance-task-log)

(clojure.core/declare deser-event-category-group)

(clojure.core/declare deser-subnet)

(clojure.core/declare deser-orderable-replication-instance-list)

(clojure.core/declare deser-orderable-replication-instance)

(clojure.core/declare deser-replication-subnet-group)

(clojure.core/declare deser-event-subscription)

(clojure.core/declare deser-certificate-wallet)

(clojure.core/declare deser-refresh-schemas-status-type-value)

(clojure.core/declare deser-replication-task-assessment-result)

(clojure.core/declare deser-replication-task-stats)

(clojure.core/declare deser-replication-task-list)

(clojure.core/declare deser-replication-task-assessment-result-list)

(clojure.core/declare deser-event-list)

(clojure.core/declare deser-refresh-schemas-status)

(clojure.core/declare deser-source-type)

(clojure.core/declare deser-replication-task)

(clojure.core/declare deser-event)

(clojure.core/declare deser-availability-zone)

(clojure.core/declare deser-auth-type-value)

(clojure.core/declare deser-table-statistics-list)

(clojure.core/declare deser-replication-instance-list)

(clojure.core/declare deser-replication-endpoint-type-value)

(clojure.core/declare deser-tag-list)

(clojure.core/declare deser-replication-instance-private-ip-address-list)

(clojure.core/declare deser-mongo-db-settings)

(clojure.core/declare deser-supported-endpoint-type-list)

(clojure.core/declare deser-replication-pending-modified-values)

(clojure.core/declare deser-vpc-security-group-membership)

(clojure.core/declare deser-account-quota-list)

(clojure.core/declare deser-exception-message)

(clojure.core/declare deser-nesting-level-value)

(clojure.core/declare deser-supported-endpoint-type)

(clojure.core/declare deser-integer)

(clojure.core/declare deser-string)

(clojure.core/declare deser-dynamo-db-settings)

(clojure.core/declare deser-t-stamp)

(clojure.core/declare deser-dms-ssl-mode-value)

(clojure.core/declare deser-event-categories-list)

(clojure.core/declare deser-event-category-group-list)

(clojure.core/declare deser-connection)

(clojure.core/declare deser-endpoint)

(clojure.core/declare deser-auth-mechanism-value)

(clojure.core/declare deser-long)

(clojure.core/declare deser-account-quota)

(clojure.core/declare deser-replication-instance)

(clojure.core/declare deser-tag)

(clojure.core/declare deser-boolean-optional)

(clojure.core/declare deser-replication-instance-public-ip-address-list)

(clojure.core/declare deser-event-subscriptions-list)

(clojure.core/declare deser-migration-type-value)

(clojure.core/declare deser-integer-optional)

(clojure.core/declare deser-certificate)

(clojure.core/declare deser-endpoint-list)

(clojure.core/declare deser-subnet-list)

(clojure.core/declare deser-secret-string)

(clojure.core/declare deser-table-statistics)

(clojure.core/declare deser-boolean)

(clojure.core/defn- deser-vpc-security-group-membership-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-vpc-security-group-membership coll))) input))

(clojure.core/defn- deser-certificate-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-certificate coll))) input))

(clojure.core/defn- deser-replication-subnet-groups [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-replication-subnet-group coll))) input))

(clojure.core/defn- deser-connection-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-connection coll))) input))

(clojure.core/defn- deser-schema-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string coll))) input))

(clojure.core/defn- deser-s-3-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "ServiceAccessRoleArn") (clojure.core/assoc :service-access-role-arn (deser-string (input "ServiceAccessRoleArn"))) (clojure.core/contains? input "ExternalTableDefinition") (clojure.core/assoc :external-table-definition (deser-string (input "ExternalTableDefinition"))) (clojure.core/contains? input "CsvRowDelimiter") (clojure.core/assoc :csv-row-delimiter (deser-string (input "CsvRowDelimiter"))) (clojure.core/contains? input "CsvDelimiter") (clojure.core/assoc :csv-delimiter (deser-string (input "CsvDelimiter"))) (clojure.core/contains? input "BucketFolder") (clojure.core/assoc :bucket-folder (deser-string (input "BucketFolder"))) (clojure.core/contains? input "BucketName") (clojure.core/assoc :bucket-name (deser-string (input "BucketName"))) (clojure.core/contains? input "CompressionType") (clojure.core/assoc :compression-type (deser-compression-type-value (input "CompressionType")))))

(clojure.core/defn- deser-compression-type-value [input] (clojure.core/get {"none" :none, "gzip" :gzip} input))

(clojure.core/defn- deser-replication-instance-task-logs-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-replication-instance-task-log coll))) input))

(clojure.core/defn- deser-source-ids-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string coll))) input))

(clojure.core/defn- deser-dms-transfer-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "ServiceAccessRoleArn") (clojure.core/assoc :service-access-role-arn (deser-string (input "ServiceAccessRoleArn"))) (clojure.core/contains? input "BucketName") (clojure.core/assoc :bucket-name (deser-string (input "BucketName")))))

(clojure.core/defn- deser-replication-instance-task-log [input] (clojure.core/cond-> {} (clojure.core/contains? input "ReplicationTaskName") (clojure.core/assoc :replication-task-name (deser-string (input "ReplicationTaskName"))) (clojure.core/contains? input "ReplicationTaskArn") (clojure.core/assoc :replication-task-arn (deser-string (input "ReplicationTaskArn"))) (clojure.core/contains? input "ReplicationInstanceTaskLogSize") (clojure.core/assoc :replication-instance-task-log-size (deser-long (input "ReplicationInstanceTaskLogSize")))))

(clojure.core/defn- deser-event-category-group [input] (clojure.core/cond-> {} (clojure.core/contains? input "SourceType") (clojure.core/assoc :source-type (deser-string (input "SourceType"))) (clojure.core/contains? input "EventCategories") (clojure.core/assoc :event-categories (deser-event-categories-list (input "EventCategories")))))

(clojure.core/defn- deser-subnet [input] (clojure.core/cond-> {} (clojure.core/contains? input "SubnetIdentifier") (clojure.core/assoc :subnet-identifier (deser-string (input "SubnetIdentifier"))) (clojure.core/contains? input "SubnetAvailabilityZone") (clojure.core/assoc :subnet-availability-zone (deser-availability-zone (input "SubnetAvailabilityZone"))) (clojure.core/contains? input "SubnetStatus") (clojure.core/assoc :subnet-status (deser-string (input "SubnetStatus")))))

(clojure.core/defn- deser-orderable-replication-instance-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-orderable-replication-instance coll))) input))

(clojure.core/defn- deser-orderable-replication-instance [input] (clojure.core/cond-> {} (clojure.core/contains? input "EngineVersion") (clojure.core/assoc :engine-version (deser-string (input "EngineVersion"))) (clojure.core/contains? input "ReplicationInstanceClass") (clojure.core/assoc :replication-instance-class (deser-string (input "ReplicationInstanceClass"))) (clojure.core/contains? input "StorageType") (clojure.core/assoc :storage-type (deser-string (input "StorageType"))) (clojure.core/contains? input "MinAllocatedStorage") (clojure.core/assoc :min-allocated-storage (deser-integer (input "MinAllocatedStorage"))) (clojure.core/contains? input "MaxAllocatedStorage") (clojure.core/assoc :max-allocated-storage (deser-integer (input "MaxAllocatedStorage"))) (clojure.core/contains? input "DefaultAllocatedStorage") (clojure.core/assoc :default-allocated-storage (deser-integer (input "DefaultAllocatedStorage"))) (clojure.core/contains? input "IncludedAllocatedStorage") (clojure.core/assoc :included-allocated-storage (deser-integer (input "IncludedAllocatedStorage")))))

(clojure.core/defn- deser-replication-subnet-group [input] (clojure.core/cond-> {} (clojure.core/contains? input "ReplicationSubnetGroupIdentifier") (clojure.core/assoc :replication-subnet-group-identifier (deser-string (input "ReplicationSubnetGroupIdentifier"))) (clojure.core/contains? input "ReplicationSubnetGroupDescription") (clojure.core/assoc :replication-subnet-group-description (deser-string (input "ReplicationSubnetGroupDescription"))) (clojure.core/contains? input "VpcId") (clojure.core/assoc :vpc-id (deser-string (input "VpcId"))) (clojure.core/contains? input "SubnetGroupStatus") (clojure.core/assoc :subnet-group-status (deser-string (input "SubnetGroupStatus"))) (clojure.core/contains? input "Subnets") (clojure.core/assoc :subnets (deser-subnet-list (input "Subnets")))))

(clojure.core/defn- deser-event-subscription [input] (clojure.core/cond-> {} (clojure.core/contains? input "SourceIdsList") (clojure.core/assoc :source-ids-list (deser-source-ids-list (input "SourceIdsList"))) (clojure.core/contains? input "CustomerAwsId") (clojure.core/assoc :customer-aws-id (deser-string (input "CustomerAwsId"))) (clojure.core/contains? input "SourceType") (clojure.core/assoc :source-type (deser-string (input "SourceType"))) (clojure.core/contains? input "Enabled") (clojure.core/assoc :enabled (deser-boolean (input "Enabled"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-string (input "Status"))) (clojure.core/contains? input "SnsTopicArn") (clojure.core/assoc :sns-topic-arn (deser-string (input "SnsTopicArn"))) (clojure.core/contains? input "EventCategoriesList") (clojure.core/assoc :event-categories-list (deser-event-categories-list (input "EventCategoriesList"))) (clojure.core/contains? input "CustSubscriptionId") (clojure.core/assoc :cust-subscription-id (deser-string (input "CustSubscriptionId"))) (clojure.core/contains? input "SubscriptionCreationTime") (clojure.core/assoc :subscription-creation-time (deser-string (input "SubscriptionCreationTime")))))

(clojure.core/defn- deser-certificate-wallet [input] (portkey.aws/base64-decode input))

(clojure.core/defn- deser-refresh-schemas-status-type-value [input] (clojure.core/get {"successful" :successful, "failed" :failed, "refreshing" :refreshing} input))

(clojure.core/defn- deser-replication-task-assessment-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "ReplicationTaskIdentifier") (clojure.core/assoc :replication-task-identifier (deser-string (input "ReplicationTaskIdentifier"))) (clojure.core/contains? input "ReplicationTaskArn") (clojure.core/assoc :replication-task-arn (deser-string (input "ReplicationTaskArn"))) (clojure.core/contains? input "ReplicationTaskLastAssessmentDate") (clojure.core/assoc :replication-task-last-assessment-date (deser-t-stamp (input "ReplicationTaskLastAssessmentDate"))) (clojure.core/contains? input "AssessmentStatus") (clojure.core/assoc :assessment-status (deser-string (input "AssessmentStatus"))) (clojure.core/contains? input "AssessmentResultsFile") (clojure.core/assoc :assessment-results-file (deser-string (input "AssessmentResultsFile"))) (clojure.core/contains? input "AssessmentResults") (clojure.core/assoc :assessment-results (deser-string (input "AssessmentResults"))) (clojure.core/contains? input "S3ObjectUrl") (clojure.core/assoc :s-3-object-url (deser-string (input "S3ObjectUrl")))))

(clojure.core/defn- deser-replication-task-stats [input] (clojure.core/cond-> {} (clojure.core/contains? input "FullLoadProgressPercent") (clojure.core/assoc :full-load-progress-percent (deser-integer (input "FullLoadProgressPercent"))) (clojure.core/contains? input "ElapsedTimeMillis") (clojure.core/assoc :elapsed-time-millis (deser-long (input "ElapsedTimeMillis"))) (clojure.core/contains? input "TablesLoaded") (clojure.core/assoc :tables-loaded (deser-integer (input "TablesLoaded"))) (clojure.core/contains? input "TablesLoading") (clojure.core/assoc :tables-loading (deser-integer (input "TablesLoading"))) (clojure.core/contains? input "TablesQueued") (clojure.core/assoc :tables-queued (deser-integer (input "TablesQueued"))) (clojure.core/contains? input "TablesErrored") (clojure.core/assoc :tables-errored (deser-integer (input "TablesErrored")))))

(clojure.core/defn- deser-replication-task-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-replication-task coll))) input))

(clojure.core/defn- deser-replication-task-assessment-result-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-replication-task-assessment-result coll))) input))

(clojure.core/defn- deser-event-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-event coll))) input))

(clojure.core/defn- deser-refresh-schemas-status [input] (clojure.core/cond-> {} (clojure.core/contains? input "EndpointArn") (clojure.core/assoc :endpoint-arn (deser-string (input "EndpointArn"))) (clojure.core/contains? input "ReplicationInstanceArn") (clojure.core/assoc :replication-instance-arn (deser-string (input "ReplicationInstanceArn"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-refresh-schemas-status-type-value (input "Status"))) (clojure.core/contains? input "LastRefreshDate") (clojure.core/assoc :last-refresh-date (deser-t-stamp (input "LastRefreshDate"))) (clojure.core/contains? input "LastFailureMessage") (clojure.core/assoc :last-failure-message (deser-string (input "LastFailureMessage")))))

(clojure.core/defn- deser-source-type [input] (clojure.core/get {"replication-instance" :replicationinstance} input))

(clojure.core/defn- deser-replication-task [input] (clojure.core/cond-> {} (clojure.core/contains? input "ReplicationTaskSettings") (clojure.core/assoc :replication-task-settings (deser-string (input "ReplicationTaskSettings"))) (clojure.core/contains? input "ReplicationTaskCreationDate") (clojure.core/assoc :replication-task-creation-date (deser-t-stamp (input "ReplicationTaskCreationDate"))) (clojure.core/contains? input "CdcStopPosition") (clojure.core/assoc :cdc-stop-position (deser-string (input "CdcStopPosition"))) (clojure.core/contains? input "CdcStartPosition") (clojure.core/assoc :cdc-start-position (deser-string (input "CdcStartPosition"))) (clojure.core/contains? input "SourceEndpointArn") (clojure.core/assoc :source-endpoint-arn (deser-string (input "SourceEndpointArn"))) (clojure.core/contains? input "MigrationType") (clojure.core/assoc :migration-type (deser-migration-type-value (input "MigrationType"))) (clojure.core/contains? input "ReplicationTaskStats") (clojure.core/assoc :replication-task-stats (deser-replication-task-stats (input "ReplicationTaskStats"))) (clojure.core/contains? input "StopReason") (clojure.core/assoc :stop-reason (deser-string (input "StopReason"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-string (input "Status"))) (clojure.core/contains? input "LastFailureMessage") (clojure.core/assoc :last-failure-message (deser-string (input "LastFailureMessage"))) (clojure.core/contains? input "ReplicationTaskArn") (clojure.core/assoc :replication-task-arn (deser-string (input "ReplicationTaskArn"))) (clojure.core/contains? input "ReplicationInstanceArn") (clojure.core/assoc :replication-instance-arn (deser-string (input "ReplicationInstanceArn"))) (clojure.core/contains? input "TargetEndpointArn") (clojure.core/assoc :target-endpoint-arn (deser-string (input "TargetEndpointArn"))) (clojure.core/contains? input "ReplicationTaskStartDate") (clojure.core/assoc :replication-task-start-date (deser-t-stamp (input "ReplicationTaskStartDate"))) (clojure.core/contains? input "ReplicationTaskIdentifier") (clojure.core/assoc :replication-task-identifier (deser-string (input "ReplicationTaskIdentifier"))) (clojure.core/contains? input "TableMappings") (clojure.core/assoc :table-mappings (deser-string (input "TableMappings"))) (clojure.core/contains? input "RecoveryCheckpoint") (clojure.core/assoc :recovery-checkpoint (deser-string (input "RecoveryCheckpoint")))))

(clojure.core/defn- deser-event [input] (clojure.core/cond-> {} (clojure.core/contains? input "SourceIdentifier") (clojure.core/assoc :source-identifier (deser-string (input "SourceIdentifier"))) (clojure.core/contains? input "SourceType") (clojure.core/assoc :source-type (deser-source-type (input "SourceType"))) (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-string (input "Message"))) (clojure.core/contains? input "EventCategories") (clojure.core/assoc :event-categories (deser-event-categories-list (input "EventCategories"))) (clojure.core/contains? input "Date") (clojure.core/assoc :date (deser-t-stamp (input "Date")))))

(clojure.core/defn- deser-availability-zone [input] (clojure.core/cond-> {} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-string (input "Name")))))

(clojure.core/defn- deser-auth-type-value [input] (clojure.core/get {"no" :no, "password" :password} input))

(clojure.core/defn- deser-table-statistics-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-table-statistics coll))) input))

(clojure.core/defn- deser-replication-instance-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-replication-instance coll))) input))

(clojure.core/defn- deser-replication-endpoint-type-value [input] (clojure.core/get {"source" :source, "target" :target} input))

(clojure.core/defn- deser-tag-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-replication-instance-private-ip-address-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string coll))) input))

(clojure.core/defn- deser-mongo-db-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "Username") (clojure.core/assoc :username (deser-string (input "Username"))) (clojure.core/contains? input "Password") (clojure.core/assoc :password (deser-secret-string (input "Password"))) (clojure.core/contains? input "DatabaseName") (clojure.core/assoc :database-name (deser-string (input "DatabaseName"))) (clojure.core/contains? input "ExtractDocId") (clojure.core/assoc :extract-doc-id (deser-string (input "ExtractDocId"))) (clojure.core/contains? input "AuthMechanism") (clojure.core/assoc :auth-mechanism (deser-auth-mechanism-value (input "AuthMechanism"))) (clojure.core/contains? input "Port") (clojure.core/assoc :port (deser-integer-optional (input "Port"))) (clojure.core/contains? input "KmsKeyId") (clojure.core/assoc :kms-key-id (deser-string (input "KmsKeyId"))) (clojure.core/contains? input "AuthType") (clojure.core/assoc :auth-type (deser-auth-type-value (input "AuthType"))) (clojure.core/contains? input "AuthSource") (clojure.core/assoc :auth-source (deser-string (input "AuthSource"))) (clojure.core/contains? input "ServerName") (clojure.core/assoc :server-name (deser-string (input "ServerName"))) (clojure.core/contains? input "DocsToInvestigate") (clojure.core/assoc :docs-to-investigate (deser-string (input "DocsToInvestigate"))) (clojure.core/contains? input "NestingLevel") (clojure.core/assoc :nesting-level (deser-nesting-level-value (input "NestingLevel")))))

(clojure.core/defn- deser-supported-endpoint-type-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-supported-endpoint-type coll))) input))

(clojure.core/defn- deser-replication-pending-modified-values [input] (clojure.core/cond-> {} (clojure.core/contains? input "ReplicationInstanceClass") (clojure.core/assoc :replication-instance-class (deser-string (input "ReplicationInstanceClass"))) (clojure.core/contains? input "AllocatedStorage") (clojure.core/assoc :allocated-storage (deser-integer-optional (input "AllocatedStorage"))) (clojure.core/contains? input "MultiAZ") (clojure.core/assoc :multi-az (deser-boolean-optional (input "MultiAZ"))) (clojure.core/contains? input "EngineVersion") (clojure.core/assoc :engine-version (deser-string (input "EngineVersion")))))

(clojure.core/defn- deser-vpc-security-group-membership [input] (clojure.core/cond-> {} (clojure.core/contains? input "VpcSecurityGroupId") (clojure.core/assoc :vpc-security-group-id (deser-string (input "VpcSecurityGroupId"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-string (input "Status")))))

(clojure.core/defn- deser-account-quota-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-account-quota coll))) input))

(clojure.core/defn- deser-exception-message [input] input)

(clojure.core/defn- deser-nesting-level-value [input] (clojure.core/get {"none" :none, "one" :one} input))

(clojure.core/defn- deser-supported-endpoint-type [input] (clojure.core/cond-> {} (clojure.core/contains? input "EngineName") (clojure.core/assoc :engine-name (deser-string (input "EngineName"))) (clojure.core/contains? input "SupportsCDC") (clojure.core/assoc :supports-cdc (deser-boolean (input "SupportsCDC"))) (clojure.core/contains? input "EndpointType") (clojure.core/assoc :endpoint-type (deser-replication-endpoint-type-value (input "EndpointType"))) (clojure.core/contains? input "EngineDisplayName") (clojure.core/assoc :engine-display-name (deser-string (input "EngineDisplayName")))))

(clojure.core/defn- deser-integer [input] input)

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-dynamo-db-settings [input] (clojure.core/cond-> {:service-access-role-arn (deser-string (input "ServiceAccessRoleArn"))}))

(clojure.core/defn- deser-t-stamp [input] input)

(clojure.core/defn- deser-dms-ssl-mode-value [input] (clojure.core/get {"none" :none, "require" :require, "verify-ca" :verifyca, "verify-full" :verifyfull} input))

(clojure.core/defn- deser-event-categories-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string coll))) input))

(clojure.core/defn- deser-event-category-group-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-event-category-group coll))) input))

(clojure.core/defn- deser-connection [input] (clojure.core/cond-> {} (clojure.core/contains? input "ReplicationInstanceArn") (clojure.core/assoc :replication-instance-arn (deser-string (input "ReplicationInstanceArn"))) (clojure.core/contains? input "EndpointArn") (clojure.core/assoc :endpoint-arn (deser-string (input "EndpointArn"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-string (input "Status"))) (clojure.core/contains? input "LastFailureMessage") (clojure.core/assoc :last-failure-message (deser-string (input "LastFailureMessage"))) (clojure.core/contains? input "EndpointIdentifier") (clojure.core/assoc :endpoint-identifier (deser-string (input "EndpointIdentifier"))) (clojure.core/contains? input "ReplicationInstanceIdentifier") (clojure.core/assoc :replication-instance-identifier (deser-string (input "ReplicationInstanceIdentifier")))))

(clojure.core/defn- deser-endpoint [input] (clojure.core/cond-> {} (clojure.core/contains? input "Username") (clojure.core/assoc :username (deser-string (input "Username"))) (clojure.core/contains? input "S3Settings") (clojure.core/assoc :s-3-settings (deser-s-3-settings (input "S3Settings"))) (clojure.core/contains? input "DmsTransferSettings") (clojure.core/assoc :dms-transfer-settings (deser-dms-transfer-settings (input "DmsTransferSettings"))) (clojure.core/contains? input "EngineName") (clojure.core/assoc :engine-name (deser-string (input "EngineName"))) (clojure.core/contains? input "DatabaseName") (clojure.core/assoc :database-name (deser-string (input "DatabaseName"))) (clojure.core/contains? input "ExtraConnectionAttributes") (clojure.core/assoc :extra-connection-attributes (deser-string (input "ExtraConnectionAttributes"))) (clojure.core/contains? input "EndpointIdentifier") (clojure.core/assoc :endpoint-identifier (deser-string (input "EndpointIdentifier"))) (clojure.core/contains? input "EndpointType") (clojure.core/assoc :endpoint-type (deser-replication-endpoint-type-value (input "EndpointType"))) (clojure.core/contains? input "ExternalId") (clojure.core/assoc :external-id (deser-string (input "ExternalId"))) (clojure.core/contains? input "ServiceAccessRoleArn") (clojure.core/assoc :service-access-role-arn (deser-string (input "ServiceAccessRoleArn"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-string (input "Status"))) (clojure.core/contains? input "ExternalTableDefinition") (clojure.core/assoc :external-table-definition (deser-string (input "ExternalTableDefinition"))) (clojure.core/contains? input "MongoDbSettings") (clojure.core/assoc :mongo-db-settings (deser-mongo-db-settings (input "MongoDbSettings"))) (clojure.core/contains? input "Port") (clojure.core/assoc :port (deser-integer-optional (input "Port"))) (clojure.core/contains? input "KmsKeyId") (clojure.core/assoc :kms-key-id (deser-string (input "KmsKeyId"))) (clojure.core/contains? input "SslMode") (clojure.core/assoc :ssl-mode (deser-dms-ssl-mode-value (input "SslMode"))) (clojure.core/contains? input "DynamoDbSettings") (clojure.core/assoc :dynamo-db-settings (deser-dynamo-db-settings (input "DynamoDbSettings"))) (clojure.core/contains? input "CertificateArn") (clojure.core/assoc :certificate-arn (deser-string (input "CertificateArn"))) (clojure.core/contains? input "ServerName") (clojure.core/assoc :server-name (deser-string (input "ServerName"))) (clojure.core/contains? input "EngineDisplayName") (clojure.core/assoc :engine-display-name (deser-string (input "EngineDisplayName"))) (clojure.core/contains? input "EndpointArn") (clojure.core/assoc :endpoint-arn (deser-string (input "EndpointArn")))))

(clojure.core/defn- deser-auth-mechanism-value [input] (clojure.core/get {"default" :default, "mongodb_cr" :mongodb-cr, "scram_sha_1" :scram-sha-1} input))

(clojure.core/defn- deser-long [input] input)

(clojure.core/defn- deser-account-quota [input] (clojure.core/cond-> {} (clojure.core/contains? input "AccountQuotaName") (clojure.core/assoc :account-quota-name (deser-string (input "AccountQuotaName"))) (clojure.core/contains? input "Used") (clojure.core/assoc :used (deser-long (input "Used"))) (clojure.core/contains? input "Max") (clojure.core/assoc :max (deser-long (input "Max")))))

(clojure.core/defn- deser-replication-instance [input] (clojure.core/cond-> {} (clojure.core/contains? input "ReplicationInstanceClass") (clojure.core/assoc :replication-instance-class (deser-string (input "ReplicationInstanceClass"))) (clojure.core/contains? input "SecondaryAvailabilityZone") (clojure.core/assoc :secondary-availability-zone (deser-string (input "SecondaryAvailabilityZone"))) (clojure.core/contains? input "PubliclyAccessible") (clojure.core/assoc :publicly-accessible (deser-boolean (input "PubliclyAccessible"))) (clojure.core/contains? input "PreferredMaintenanceWindow") (clojure.core/assoc :preferred-maintenance-window (deser-string (input "PreferredMaintenanceWindow"))) (clojure.core/contains? input "ReplicationSubnetGroup") (clojure.core/assoc :replication-subnet-group (deser-replication-subnet-group (input "ReplicationSubnetGroup"))) (clojure.core/contains? input "AutoMinorVersionUpgrade") (clojure.core/assoc :auto-minor-version-upgrade (deser-boolean (input "AutoMinorVersionUpgrade"))) (clojure.core/contains? input "ReplicationInstanceStatus") (clojure.core/assoc :replication-instance-status (deser-string (input "ReplicationInstanceStatus"))) (clojure.core/contains? input "InstanceCreateTime") (clojure.core/assoc :instance-create-time (deser-t-stamp (input "InstanceCreateTime"))) (clojure.core/contains? input "AvailabilityZone") (clojure.core/assoc :availability-zone (deser-string (input "AvailabilityZone"))) (clojure.core/contains? input "ReplicationInstanceIdentifier") (clojure.core/assoc :replication-instance-identifier (deser-string (input "ReplicationInstanceIdentifier"))) (clojure.core/contains? input "ReplicationInstancePublicIpAddress") (clojure.core/assoc :replication-instance-public-ip-address (deser-string (input "ReplicationInstancePublicIpAddress"))) (clojure.core/contains? input "AllocatedStorage") (clojure.core/assoc :allocated-storage (deser-integer (input "AllocatedStorage"))) (clojure.core/contains? input "FreeUntil") (clojure.core/assoc :free-until (deser-t-stamp (input "FreeUntil"))) (clojure.core/contains? input "EngineVersion") (clojure.core/assoc :engine-version (deser-string (input "EngineVersion"))) (clojure.core/contains? input "ReplicationInstanceArn") (clojure.core/assoc :replication-instance-arn (deser-string (input "ReplicationInstanceArn"))) (clojure.core/contains? input "KmsKeyId") (clojure.core/assoc :kms-key-id (deser-string (input "KmsKeyId"))) (clojure.core/contains? input "ReplicationInstancePrivateIpAddress") (clojure.core/assoc :replication-instance-private-ip-address (deser-string (input "ReplicationInstancePrivateIpAddress"))) (clojure.core/contains? input "ReplicationInstancePublicIpAddresses") (clojure.core/assoc :replication-instance-public-ip-addresses (deser-replication-instance-public-ip-address-list (input "ReplicationInstancePublicIpAddresses"))) (clojure.core/contains? input "VpcSecurityGroups") (clojure.core/assoc :vpc-security-groups (deser-vpc-security-group-membership-list (input "VpcSecurityGroups"))) (clojure.core/contains? input "ReplicationInstancePrivateIpAddresses") (clojure.core/assoc :replication-instance-private-ip-addresses (deser-replication-instance-private-ip-address-list (input "ReplicationInstancePrivateIpAddresses"))) (clojure.core/contains? input "MultiAZ") (clojure.core/assoc :multi-az (deser-boolean (input "MultiAZ"))) (clojure.core/contains? input "PendingModifiedValues") (clojure.core/assoc :pending-modified-values (deser-replication-pending-modified-values (input "PendingModifiedValues")))))

(clojure.core/defn- deser-tag [input] (clojure.core/cond-> {} (clojure.core/contains? input "Key") (clojure.core/assoc :key (deser-string (input "Key"))) (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-string (input "Value")))))

(clojure.core/defn- deser-boolean-optional [input] input)

(clojure.core/defn- deser-replication-instance-public-ip-address-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string coll))) input))

(clojure.core/defn- deser-event-subscriptions-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-event-subscription coll))) input))

(clojure.core/defn- deser-migration-type-value [input] (clojure.core/get {"full-load" :fullload, "cdc" :cdc, "full-load-and-cdc" :fullloadandcdc} input))

(clojure.core/defn- deser-integer-optional [input] input)

(clojure.core/defn- deser-certificate [input] (clojure.core/cond-> {} (clojure.core/contains? input "CertificateWallet") (clojure.core/assoc :certificate-wallet (deser-certificate-wallet (input "CertificateWallet"))) (clojure.core/contains? input "ValidToDate") (clojure.core/assoc :valid-to-date (deser-t-stamp (input "ValidToDate"))) (clojure.core/contains? input "CertificateCreationDate") (clojure.core/assoc :certificate-creation-date (deser-t-stamp (input "CertificateCreationDate"))) (clojure.core/contains? input "CertificateOwner") (clojure.core/assoc :certificate-owner (deser-string (input "CertificateOwner"))) (clojure.core/contains? input "CertificateArn") (clojure.core/assoc :certificate-arn (deser-string (input "CertificateArn"))) (clojure.core/contains? input "KeyLength") (clojure.core/assoc :key-length (deser-integer-optional (input "KeyLength"))) (clojure.core/contains? input "ValidFromDate") (clojure.core/assoc :valid-from-date (deser-t-stamp (input "ValidFromDate"))) (clojure.core/contains? input "SigningAlgorithm") (clojure.core/assoc :signing-algorithm (deser-string (input "SigningAlgorithm"))) (clojure.core/contains? input "CertificatePem") (clojure.core/assoc :certificate-pem (deser-string (input "CertificatePem"))) (clojure.core/contains? input "CertificateIdentifier") (clojure.core/assoc :certificate-identifier (deser-string (input "CertificateIdentifier")))))

(clojure.core/defn- deser-endpoint-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-endpoint coll))) input))

(clojure.core/defn- deser-subnet-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-subnet coll))) input))

(clojure.core/defn- deser-secret-string [input] input)

(clojure.core/defn- deser-table-statistics [input] (clojure.core/cond-> {} (clojure.core/contains? input "Deletes") (clojure.core/assoc :deletes (deser-long (input "Deletes"))) (clojure.core/contains? input "FullLoadRows") (clojure.core/assoc :full-load-rows (deser-long (input "FullLoadRows"))) (clojure.core/contains? input "ValidationStateDetails") (clojure.core/assoc :validation-state-details (deser-string (input "ValidationStateDetails"))) (clojure.core/contains? input "TableState") (clojure.core/assoc :table-state (deser-string (input "TableState"))) (clojure.core/contains? input "Inserts") (clojure.core/assoc :inserts (deser-long (input "Inserts"))) (clojure.core/contains? input "FullLoadCondtnlChkFailedRows") (clojure.core/assoc :full-load-condtnl-chk-failed-rows (deser-long (input "FullLoadCondtnlChkFailedRows"))) (clojure.core/contains? input "ValidationPendingRecords") (clojure.core/assoc :validation-pending-records (deser-long (input "ValidationPendingRecords"))) (clojure.core/contains? input "ValidationSuspendedRecords") (clojure.core/assoc :validation-suspended-records (deser-long (input "ValidationSuspendedRecords"))) (clojure.core/contains? input "ValidationState") (clojure.core/assoc :validation-state (deser-string (input "ValidationState"))) (clojure.core/contains? input "FullLoadErrorRows") (clojure.core/assoc :full-load-error-rows (deser-long (input "FullLoadErrorRows"))) (clojure.core/contains? input "ValidationFailedRecords") (clojure.core/assoc :validation-failed-records (deser-long (input "ValidationFailedRecords"))) (clojure.core/contains? input "TableName") (clojure.core/assoc :table-name (deser-string (input "TableName"))) (clojure.core/contains? input "LastUpdateTime") (clojure.core/assoc :last-update-time (deser-t-stamp (input "LastUpdateTime"))) (clojure.core/contains? input "Ddls") (clojure.core/assoc :ddls (deser-long (input "Ddls"))) (clojure.core/contains? input "Updates") (clojure.core/assoc :updates (deser-long (input "Updates"))) (clojure.core/contains? input "SchemaName") (clojure.core/assoc :schema-name (deser-string (input "SchemaName")))))

(clojure.core/defn- deser-boolean [input] input)

(clojure.core/defn- deser-describe-refresh-schemas-status-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "RefreshSchemasStatus") (clojure.core/assoc :refresh-schemas-status (deser-refresh-schemas-status (input "RefreshSchemasStatus")))))

(clojure.core/defn- deser-describe-connections-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "Marker") (clojure.core/assoc :marker (deser-string (input "Marker"))) (clojure.core/contains? input "Connections") (clojure.core/assoc :connections (deser-connection-list (input "Connections")))))

(clojure.core/defn- deser-stop-replication-task-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "ReplicationTask") (clojure.core/assoc :replication-task (deser-replication-task (input "ReplicationTask")))))

(clojure.core/defn- deser-create-replication-task-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "ReplicationTask") (clojure.core/assoc :replication-task (deser-replication-task (input "ReplicationTask")))))

(clojure.core/defn- deser-describe-table-statistics-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "ReplicationTaskArn") (clojure.core/assoc :replication-task-arn (deser-string (input "ReplicationTaskArn"))) (clojure.core/contains? input "TableStatistics") (clojure.core/assoc :table-statistics (deser-table-statistics-list (input "TableStatistics"))) (clojure.core/contains? input "Marker") (clojure.core/assoc :marker (deser-string (input "Marker")))))

(clojure.core/defn- deser-modify-endpoint-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "Endpoint") (clojure.core/assoc :endpoint (deser-endpoint (input "Endpoint")))))

(clojure.core/defn- deser-start-replication-task-assessment-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "ReplicationTask") (clojure.core/assoc :replication-task (deser-replication-task (input "ReplicationTask")))))

(clojure.core/defn- deser-insufficient-resource-capacity-fault [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-exception-message (input "message")))))

(clojure.core/defn- deser-create-replication-subnet-group-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "ReplicationSubnetGroup") (clojure.core/assoc :replication-subnet-group (deser-replication-subnet-group (input "ReplicationSubnetGroup")))))

(clojure.core/defn- deser-sns-no-authorization-fault [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-exception-message (input "message")))))

(clojure.core/defn- deser-list-tags-for-resource-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "TagList") (clojure.core/assoc :tag-list (deser-tag-list (input "TagList")))))

(clojure.core/defn- deser-describe-replication-instance-task-logs-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "ReplicationInstanceArn") (clojure.core/assoc :replication-instance-arn (deser-string (input "ReplicationInstanceArn"))) (clojure.core/contains? input "ReplicationInstanceTaskLogs") (clojure.core/assoc :replication-instance-task-logs (deser-replication-instance-task-logs-list (input "ReplicationInstanceTaskLogs"))) (clojure.core/contains? input "Marker") (clojure.core/assoc :marker (deser-string (input "Marker")))))

(clojure.core/defn- deser-import-certificate-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "Certificate") (clojure.core/assoc :certificate (deser-certificate (input "Certificate")))))

(clojure.core/defn- deser-resource-already-exists-fault [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-exception-message (input "message")))))

(clojure.core/defn- deser-delete-replication-subnet-group-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-describe-replication-instances-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "Marker") (clojure.core/assoc :marker (deser-string (input "Marker"))) (clojure.core/contains? input "ReplicationInstances") (clojure.core/assoc :replication-instances (deser-replication-instance-list (input "ReplicationInstances")))))

(clojure.core/defn- deser-modify-replication-instance-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "ReplicationInstance") (clojure.core/assoc :replication-instance (deser-replication-instance (input "ReplicationInstance")))))

(clojure.core/defn- deser-create-replication-instance-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "ReplicationInstance") (clojure.core/assoc :replication-instance (deser-replication-instance (input "ReplicationInstance")))))

(clojure.core/defn- deser-reload-tables-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "ReplicationTaskArn") (clojure.core/assoc :replication-task-arn (deser-string (input "ReplicationTaskArn")))))

(clojure.core/defn- deser-start-replication-task-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "ReplicationTask") (clojure.core/assoc :replication-task (deser-replication-task (input "ReplicationTask")))))

(clojure.core/defn- deser-create-endpoint-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "Endpoint") (clojure.core/assoc :endpoint (deser-endpoint (input "Endpoint")))))

(clojure.core/defn- deser-delete-certificate-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "Certificate") (clojure.core/assoc :certificate (deser-certificate (input "Certificate")))))

(clojure.core/defn- deser-delete-replication-task-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "ReplicationTask") (clojure.core/assoc :replication-task (deser-replication-task (input "ReplicationTask")))))

(clojure.core/defn- deser-describe-replication-subnet-groups-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "Marker") (clojure.core/assoc :marker (deser-string (input "Marker"))) (clojure.core/contains? input "ReplicationSubnetGroups") (clojure.core/assoc :replication-subnet-groups (deser-replication-subnet-groups (input "ReplicationSubnetGroups")))))

(clojure.core/defn- deser-replication-subnet-group-does-not-cover-enough-a-zs [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-exception-message (input "message")))))

(clojure.core/defn- deser-reboot-replication-instance-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "ReplicationInstance") (clojure.core/assoc :replication-instance (deser-replication-instance (input "ReplicationInstance")))))

(clojure.core/defn- deser-delete-replication-instance-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "ReplicationInstance") (clojure.core/assoc :replication-instance (deser-replication-instance (input "ReplicationInstance")))))

(clojure.core/defn- deser-subnet-already-in-use [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-exception-message (input "message")))))

(clojure.core/defn- deser-invalid-subnet [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-exception-message (input "message")))))

(clojure.core/defn- deser-create-event-subscription-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "EventSubscription") (clojure.core/assoc :event-subscription (deser-event-subscription (input "EventSubscription")))))

(clojure.core/defn- deser-invalid-certificate-fault [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-exception-message (input "message")))))

(clojure.core/defn- deser-describe-event-subscriptions-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "Marker") (clojure.core/assoc :marker (deser-string (input "Marker"))) (clojure.core/contains? input "EventSubscriptionsList") (clojure.core/assoc :event-subscriptions-list (deser-event-subscriptions-list (input "EventSubscriptionsList")))))

(clojure.core/defn- deser-describe-endpoints-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "Marker") (clojure.core/assoc :marker (deser-string (input "Marker"))) (clojure.core/contains? input "Endpoints") (clojure.core/assoc :endpoints (deser-endpoint-list (input "Endpoints")))))

(clojure.core/defn- deser-describe-endpoint-types-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "Marker") (clojure.core/assoc :marker (deser-string (input "Marker"))) (clojure.core/contains? input "SupportedEndpointTypes") (clojure.core/assoc :supported-endpoint-types (deser-supported-endpoint-type-list (input "SupportedEndpointTypes")))))

(clojure.core/defn- deser-describe-replication-tasks-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "Marker") (clojure.core/assoc :marker (deser-string (input "Marker"))) (clojure.core/contains? input "ReplicationTasks") (clojure.core/assoc :replication-tasks (deser-replication-task-list (input "ReplicationTasks")))))

(clojure.core/defn- deser-delete-endpoint-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "Endpoint") (clojure.core/assoc :endpoint (deser-endpoint (input "Endpoint")))))

(clojure.core/defn- deser-modify-replication-task-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "ReplicationTask") (clojure.core/assoc :replication-task (deser-replication-task (input "ReplicationTask")))))

(clojure.core/defn- deser-resource-not-found-fault [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-exception-message (input "message")))))

(clojure.core/defn- deser-add-tags-to-resource-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-access-denied-fault [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-exception-message (input "message")))))

(clojure.core/defn- deser-invalid-resource-state-fault [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-exception-message (input "message")))))

(clojure.core/defn- deser-upgrade-dependency-failure-fault [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-exception-message (input "message")))))

(clojure.core/defn- deser-modify-event-subscription-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "EventSubscription") (clojure.core/assoc :event-subscription (deser-event-subscription (input "EventSubscription")))))

(clojure.core/defn- deser-kms-key-not-accessible-fault [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-exception-message (input "message")))))

(clojure.core/defn- deser-modify-replication-subnet-group-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "ReplicationSubnetGroup") (clojure.core/assoc :replication-subnet-group (deser-replication-subnet-group (input "ReplicationSubnetGroup")))))

(clojure.core/defn- deser-resource-quota-exceeded-fault [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-exception-message (input "message")))))

(clojure.core/defn- deser-storage-quota-exceeded-fault [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-exception-message (input "message")))))

(clojure.core/defn- deser-describe-replication-task-assessment-results-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "Marker") (clojure.core/assoc :marker (deser-string (input "Marker"))) (clojure.core/contains? input "BucketName") (clojure.core/assoc :bucket-name (deser-string (input "BucketName"))) (clojure.core/contains? input "ReplicationTaskAssessmentResults") (clojure.core/assoc :replication-task-assessment-results (deser-replication-task-assessment-result-list (input "ReplicationTaskAssessmentResults")))))

(clojure.core/defn- deser-describe-account-attributes-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "AccountQuotas") (clojure.core/assoc :account-quotas (deser-account-quota-list (input "AccountQuotas")))))

(clojure.core/defn- deser-remove-tags-from-resource-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-refresh-schemas-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "RefreshSchemasStatus") (clojure.core/assoc :refresh-schemas-status (deser-refresh-schemas-status (input "RefreshSchemasStatus")))))

(clojure.core/defn- deser-describe-orderable-replication-instances-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "OrderableReplicationInstances") (clojure.core/assoc :orderable-replication-instances (deser-orderable-replication-instance-list (input "OrderableReplicationInstances"))) (clojure.core/contains? input "Marker") (clojure.core/assoc :marker (deser-string (input "Marker")))))

(clojure.core/defn- deser-sns-invalid-topic-fault [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-exception-message (input "message")))))

(clojure.core/defn- deser-delete-event-subscription-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "EventSubscription") (clojure.core/assoc :event-subscription (deser-event-subscription (input "EventSubscription")))))

(clojure.core/defn- deser-describe-event-categories-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "EventCategoryGroupList") (clojure.core/assoc :event-category-group-list (deser-event-category-group-list (input "EventCategoryGroupList")))))

(clojure.core/defn- deser-test-connection-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "Connection") (clojure.core/assoc :connection (deser-connection (input "Connection")))))

(clojure.core/defn- deser-describe-events-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "Marker") (clojure.core/assoc :marker (deser-string (input "Marker"))) (clojure.core/contains? input "Events") (clojure.core/assoc :events (deser-event-list (input "Events")))))

(clojure.core/defn- deser-describe-schemas-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "Marker") (clojure.core/assoc :marker (deser-string (input "Marker"))) (clojure.core/contains? input "Schemas") (clojure.core/assoc :schemas (deser-schema-list (input "Schemas")))))

(clojure.core/defn- deser-describe-certificates-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "Marker") (clojure.core/assoc :marker (deser-string (input "Marker"))) (clojure.core/contains? input "Certificates") (clojure.core/assoc :certificates (deser-certificate-list (input "Certificates")))))

(clojure.spec.alpha/def :portkey.aws.dms/vpc-security-group-membership-list (clojure.spec.alpha/coll-of :portkey.aws.dms/vpc-security-group-membership))

(clojure.spec.alpha/def :portkey.aws.dms/certificate-list (clojure.spec.alpha/coll-of :portkey.aws.dms/certificate))

(clojure.spec.alpha/def :portkey.aws.dms/subnet-identifier-list (clojure.spec.alpha/coll-of :portkey.aws.dms/string))

(clojure.spec.alpha/def :portkey.aws.dms/replication-subnet-groups (clojure.spec.alpha/coll-of :portkey.aws.dms/replication-subnet-group))

(clojure.spec.alpha/def :portkey.aws.dms/describe-refresh-schemas-status-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms/refresh-schemas-status]))

(clojure.spec.alpha/def :portkey.aws.dms.describe-connections-message/filters (clojure.spec.alpha/and :portkey.aws.dms/filter-list))
(clojure.spec.alpha/def :portkey.aws.dms.describe-connections-message/max-records (clojure.spec.alpha/and :portkey.aws.dms/integer-optional))
(clojure.spec.alpha/def :portkey.aws.dms.describe-connections-message/marker (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms/describe-connections-message (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.describe-connections-message/filters :portkey.aws.dms.describe-connections-message/max-records :portkey.aws.dms.describe-connections-message/marker]))

(clojure.spec.alpha/def :portkey.aws.dms/filter-value-list (clojure.spec.alpha/coll-of :portkey.aws.dms/string))

(clojure.spec.alpha/def :portkey.aws.dms/connection-list (clojure.spec.alpha/coll-of :portkey.aws.dms/connection))

(clojure.spec.alpha/def :portkey.aws.dms.describe-connections-response/marker (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.describe-connections-response/connections (clojure.spec.alpha/and :portkey.aws.dms/connection-list))
(clojure.spec.alpha/def :portkey.aws.dms/describe-connections-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.describe-connections-response/marker :portkey.aws.dms.describe-connections-response/connections]))

(clojure.spec.alpha/def :portkey.aws.dms.filter/name (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.filter/values (clojure.spec.alpha/and :portkey.aws.dms/filter-value-list))
(clojure.spec.alpha/def :portkey.aws.dms/filter (clojure.spec.alpha/keys :req-un [:portkey.aws.dms.filter/name :portkey.aws.dms.filter/values] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dms/schema-list (clojure.spec.alpha/coll-of :portkey.aws.dms/string))

(clojure.spec.alpha/def :portkey.aws.dms.s-3-settings/service-access-role-arn (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.s-3-settings/external-table-definition (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.s-3-settings/csv-row-delimiter (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.s-3-settings/csv-delimiter (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.s-3-settings/bucket-folder (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.s-3-settings/bucket-name (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.s-3-settings/compression-type (clojure.spec.alpha/and :portkey.aws.dms/compression-type-value))
(clojure.spec.alpha/def :portkey.aws.dms/s-3-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.s-3-settings/service-access-role-arn :portkey.aws.dms.s-3-settings/external-table-definition :portkey.aws.dms.s-3-settings/csv-row-delimiter :portkey.aws.dms.s-3-settings/csv-delimiter :portkey.aws.dms.s-3-settings/bucket-folder :portkey.aws.dms.s-3-settings/bucket-name :portkey.aws.dms.s-3-settings/compression-type]))

(clojure.spec.alpha/def :portkey.aws.dms/stop-replication-task-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms/replication-task]))

(clojure.spec.alpha/def :portkey.aws.dms/create-replication-task-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms/replication-task]))

(clojure.spec.alpha/def :portkey.aws.dms/start-replication-task-type-value #{:resumeprocessing :startreplication "resume-processing" "reload-target" "start-replication" :reloadtarget})

(clojure.spec.alpha/def :portkey.aws.dms.describe-table-statistics-response/replication-task-arn (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.describe-table-statistics-response/table-statistics (clojure.spec.alpha/and :portkey.aws.dms/table-statistics-list))
(clojure.spec.alpha/def :portkey.aws.dms.describe-table-statistics-response/marker (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms/describe-table-statistics-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.describe-table-statistics-response/replication-task-arn :portkey.aws.dms.describe-table-statistics-response/table-statistics :portkey.aws.dms.describe-table-statistics-response/marker]))

(clojure.spec.alpha/def :portkey.aws.dms/compression-type-value #{"none" "gzip" :gzip :none})

(clojure.spec.alpha/def :portkey.aws.dms/modify-endpoint-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms/endpoint]))

(clojure.spec.alpha/def :portkey.aws.dms/replication-instance-task-logs-list (clojure.spec.alpha/coll-of :portkey.aws.dms/replication-instance-task-log))

(clojure.spec.alpha/def :portkey.aws.dms/source-ids-list (clojure.spec.alpha/coll-of :portkey.aws.dms/string))

(clojure.spec.alpha/def :portkey.aws.dms.dms-transfer-settings/service-access-role-arn (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.dms-transfer-settings/bucket-name (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms/dms-transfer-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.dms-transfer-settings/service-access-role-arn :portkey.aws.dms.dms-transfer-settings/bucket-name]))

(clojure.spec.alpha/def :portkey.aws.dms/start-replication-task-assessment-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms/replication-task]))

(clojure.spec.alpha/def :portkey.aws.dms.insufficient-resource-capacity-fault/message (clojure.spec.alpha/and :portkey.aws.dms/exception-message))
(clojure.spec.alpha/def :portkey.aws.dms/insufficient-resource-capacity-fault (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.insufficient-resource-capacity-fault/message]))

(clojure.spec.alpha/def :portkey.aws.dms/create-replication-subnet-group-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms/replication-subnet-group]))

(clojure.spec.alpha/def :portkey.aws.dms.sns-no-authorization-fault/message (clojure.spec.alpha/and :portkey.aws.dms/exception-message))
(clojure.spec.alpha/def :portkey.aws.dms/sns-no-authorization-fault (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.sns-no-authorization-fault/message]))

(clojure.spec.alpha/def :portkey.aws.dms/list-tags-for-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms/tag-list]))

(clojure.spec.alpha/def :portkey.aws.dms.describe-endpoints-message/filters (clojure.spec.alpha/and :portkey.aws.dms/filter-list))
(clojure.spec.alpha/def :portkey.aws.dms.describe-endpoints-message/max-records (clojure.spec.alpha/and :portkey.aws.dms/integer-optional))
(clojure.spec.alpha/def :portkey.aws.dms.describe-endpoints-message/marker (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms/describe-endpoints-message (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.describe-endpoints-message/filters :portkey.aws.dms.describe-endpoints-message/max-records :portkey.aws.dms.describe-endpoints-message/marker]))

(clojure.spec.alpha/def :portkey.aws.dms.replication-instance-task-log/replication-task-name (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.replication-instance-task-log/replication-task-arn (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.replication-instance-task-log/replication-instance-task-log-size (clojure.spec.alpha/and :portkey.aws.dms/long))
(clojure.spec.alpha/def :portkey.aws.dms/replication-instance-task-log (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.replication-instance-task-log/replication-task-name :portkey.aws.dms.replication-instance-task-log/replication-task-arn :portkey.aws.dms.replication-instance-task-log/replication-instance-task-log-size]))

(clojure.spec.alpha/def :portkey.aws.dms.event-category-group/source-type (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.event-category-group/event-categories (clojure.spec.alpha/and :portkey.aws.dms/event-categories-list))
(clojure.spec.alpha/def :portkey.aws.dms/event-category-group (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.event-category-group/source-type :portkey.aws.dms.event-category-group/event-categories]))

(clojure.spec.alpha/def :portkey.aws.dms.describe-replication-instance-task-logs-response/replication-instance-arn (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.describe-replication-instance-task-logs-response/replication-instance-task-logs (clojure.spec.alpha/and :portkey.aws.dms/replication-instance-task-logs-list))
(clojure.spec.alpha/def :portkey.aws.dms.describe-replication-instance-task-logs-response/marker (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms/describe-replication-instance-task-logs-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.describe-replication-instance-task-logs-response/replication-instance-arn :portkey.aws.dms.describe-replication-instance-task-logs-response/replication-instance-task-logs :portkey.aws.dms.describe-replication-instance-task-logs-response/marker]))

(clojure.spec.alpha/def :portkey.aws.dms/import-certificate-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms/certificate]))

(clojure.spec.alpha/def :portkey.aws.dms.describe-event-subscriptions-message/subscription-name (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.describe-event-subscriptions-message/filters (clojure.spec.alpha/and :portkey.aws.dms/filter-list))
(clojure.spec.alpha/def :portkey.aws.dms.describe-event-subscriptions-message/max-records (clojure.spec.alpha/and :portkey.aws.dms/integer-optional))
(clojure.spec.alpha/def :portkey.aws.dms.describe-event-subscriptions-message/marker (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms/describe-event-subscriptions-message (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.describe-event-subscriptions-message/subscription-name :portkey.aws.dms.describe-event-subscriptions-message/filters :portkey.aws.dms.describe-event-subscriptions-message/max-records :portkey.aws.dms.describe-event-subscriptions-message/marker]))

(clojure.spec.alpha/def :portkey.aws.dms.resource-already-exists-fault/message (clojure.spec.alpha/and :portkey.aws.dms/exception-message))
(clojure.spec.alpha/def :portkey.aws.dms/resource-already-exists-fault (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.resource-already-exists-fault/message]))

(clojure.spec.alpha/def :portkey.aws.dms.subnet/subnet-identifier (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.subnet/subnet-availability-zone (clojure.spec.alpha/and :portkey.aws.dms/availability-zone))
(clojure.spec.alpha/def :portkey.aws.dms.subnet/subnet-status (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms/subnet (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.subnet/subnet-identifier :portkey.aws.dms.subnet/subnet-availability-zone :portkey.aws.dms.subnet/subnet-status]))

(clojure.spec.alpha/def :portkey.aws.dms.delete-endpoint-message/endpoint-arn (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms/delete-endpoint-message (clojure.spec.alpha/keys :req-un [:portkey.aws.dms.delete-endpoint-message/endpoint-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dms/orderable-replication-instance-list (clojure.spec.alpha/coll-of :portkey.aws.dms/orderable-replication-instance))

(clojure.spec.alpha/def :portkey.aws.dms.describe-replication-instance-task-logs-message/replication-instance-arn (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.describe-replication-instance-task-logs-message/max-records (clojure.spec.alpha/and :portkey.aws.dms/integer-optional))
(clojure.spec.alpha/def :portkey.aws.dms.describe-replication-instance-task-logs-message/marker (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms/describe-replication-instance-task-logs-message (clojure.spec.alpha/keys :req-un [:portkey.aws.dms.describe-replication-instance-task-logs-message/replication-instance-arn] :opt-un [:portkey.aws.dms.describe-replication-instance-task-logs-message/max-records :portkey.aws.dms.describe-replication-instance-task-logs-message/marker]))

(clojure.spec.alpha/def :portkey.aws.dms.orderable-replication-instance/engine-version (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.orderable-replication-instance/replication-instance-class (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.orderable-replication-instance/storage-type (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.orderable-replication-instance/min-allocated-storage (clojure.spec.alpha/and :portkey.aws.dms/integer))
(clojure.spec.alpha/def :portkey.aws.dms.orderable-replication-instance/max-allocated-storage (clojure.spec.alpha/and :portkey.aws.dms/integer))
(clojure.spec.alpha/def :portkey.aws.dms.orderable-replication-instance/default-allocated-storage (clojure.spec.alpha/and :portkey.aws.dms/integer))
(clojure.spec.alpha/def :portkey.aws.dms.orderable-replication-instance/included-allocated-storage (clojure.spec.alpha/and :portkey.aws.dms/integer))
(clojure.spec.alpha/def :portkey.aws.dms/orderable-replication-instance (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.orderable-replication-instance/engine-version :portkey.aws.dms.orderable-replication-instance/replication-instance-class :portkey.aws.dms.orderable-replication-instance/storage-type :portkey.aws.dms.orderable-replication-instance/min-allocated-storage :portkey.aws.dms.orderable-replication-instance/max-allocated-storage :portkey.aws.dms.orderable-replication-instance/default-allocated-storage :portkey.aws.dms.orderable-replication-instance/included-allocated-storage]))

(clojure.spec.alpha/def :portkey.aws.dms/delete-replication-subnet-group-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dms/key-list (clojure.spec.alpha/coll-of :portkey.aws.dms/string))

(clojure.spec.alpha/def :portkey.aws.dms.modify-replication-subnet-group-message/replication-subnet-group-identifier (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.modify-replication-subnet-group-message/replication-subnet-group-description (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.modify-replication-subnet-group-message/subnet-ids (clojure.spec.alpha/and :portkey.aws.dms/subnet-identifier-list))
(clojure.spec.alpha/def :portkey.aws.dms/modify-replication-subnet-group-message (clojure.spec.alpha/keys :req-un [:portkey.aws.dms.modify-replication-subnet-group-message/replication-subnet-group-identifier :portkey.aws.dms.modify-replication-subnet-group-message/subnet-ids] :opt-un [:portkey.aws.dms.modify-replication-subnet-group-message/replication-subnet-group-description]))

(clojure.spec.alpha/def :portkey.aws.dms.replication-subnet-group/replication-subnet-group-identifier (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.replication-subnet-group/replication-subnet-group-description (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.replication-subnet-group/vpc-id (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.replication-subnet-group/subnet-group-status (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.replication-subnet-group/subnets (clojure.spec.alpha/and :portkey.aws.dms/subnet-list))
(clojure.spec.alpha/def :portkey.aws.dms/replication-subnet-group (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.replication-subnet-group/replication-subnet-group-identifier :portkey.aws.dms.replication-subnet-group/replication-subnet-group-description :portkey.aws.dms.replication-subnet-group/vpc-id :portkey.aws.dms.replication-subnet-group/subnet-group-status :portkey.aws.dms.replication-subnet-group/subnets]))

(clojure.spec.alpha/def :portkey.aws.dms.describe-replication-instances-response/marker (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.describe-replication-instances-response/replication-instances (clojure.spec.alpha/and :portkey.aws.dms/replication-instance-list))
(clojure.spec.alpha/def :portkey.aws.dms/describe-replication-instances-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.describe-replication-instances-response/marker :portkey.aws.dms.describe-replication-instances-response/replication-instances]))

(clojure.spec.alpha/def :portkey.aws.dms.event-subscription/customer-aws-id (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.event-subscription/source-type (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.event-subscription/enabled (clojure.spec.alpha/and :portkey.aws.dms/boolean))
(clojure.spec.alpha/def :portkey.aws.dms.event-subscription/status (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.event-subscription/sns-topic-arn (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.event-subscription/cust-subscription-id (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.event-subscription/subscription-creation-time (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms/event-subscription (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms/source-ids-list :portkey.aws.dms.event-subscription/customer-aws-id :portkey.aws.dms.event-subscription/source-type :portkey.aws.dms.event-subscription/enabled :portkey.aws.dms.event-subscription/status :portkey.aws.dms.event-subscription/sns-topic-arn :portkey.aws.dms/event-categories-list :portkey.aws.dms.event-subscription/cust-subscription-id :portkey.aws.dms.event-subscription/subscription-creation-time]))

(clojure.spec.alpha/def :portkey.aws.dms/certificate-wallet clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.dms/modify-replication-instance-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms/replication-instance]))

(clojure.spec.alpha/def :portkey.aws.dms.describe-replication-task-assessment-results-message/replication-task-arn (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.describe-replication-task-assessment-results-message/max-records (clojure.spec.alpha/and :portkey.aws.dms/integer-optional))
(clojure.spec.alpha/def :portkey.aws.dms.describe-replication-task-assessment-results-message/marker (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms/describe-replication-task-assessment-results-message (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.describe-replication-task-assessment-results-message/replication-task-arn :portkey.aws.dms.describe-replication-task-assessment-results-message/max-records :portkey.aws.dms.describe-replication-task-assessment-results-message/marker]))

(clojure.spec.alpha/def :portkey.aws.dms/refresh-schemas-status-type-value #{"failed" :successful "refreshing" "successful" :refreshing :failed})

(clojure.spec.alpha/def :portkey.aws.dms/create-replication-instance-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms/replication-instance]))

(clojure.spec.alpha/def :portkey.aws.dms.reload-tables-response/replication-task-arn (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms/reload-tables-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.reload-tables-response/replication-task-arn]))

(clojure.spec.alpha/def :portkey.aws.dms.replication-task-assessment-result/replication-task-identifier (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.replication-task-assessment-result/replication-task-arn (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.replication-task-assessment-result/replication-task-last-assessment-date (clojure.spec.alpha/and :portkey.aws.dms/t-stamp))
(clojure.spec.alpha/def :portkey.aws.dms.replication-task-assessment-result/assessment-status (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.replication-task-assessment-result/assessment-results-file (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.replication-task-assessment-result/assessment-results (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.replication-task-assessment-result/s-3-object-url (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms/replication-task-assessment-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.replication-task-assessment-result/replication-task-identifier :portkey.aws.dms.replication-task-assessment-result/replication-task-arn :portkey.aws.dms.replication-task-assessment-result/replication-task-last-assessment-date :portkey.aws.dms.replication-task-assessment-result/assessment-status :portkey.aws.dms.replication-task-assessment-result/assessment-results-file :portkey.aws.dms.replication-task-assessment-result/assessment-results :portkey.aws.dms.replication-task-assessment-result/s-3-object-url]))

(clojure.spec.alpha/def :portkey.aws.dms.describe-events-message/end-time (clojure.spec.alpha/and :portkey.aws.dms/t-stamp))
(clojure.spec.alpha/def :portkey.aws.dms.describe-events-message/start-time (clojure.spec.alpha/and :portkey.aws.dms/t-stamp))
(clojure.spec.alpha/def :portkey.aws.dms.describe-events-message/max-records (clojure.spec.alpha/and :portkey.aws.dms/integer-optional))
(clojure.spec.alpha/def :portkey.aws.dms.describe-events-message/marker (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.describe-events-message/duration (clojure.spec.alpha/and :portkey.aws.dms/integer-optional))
(clojure.spec.alpha/def :portkey.aws.dms.describe-events-message/event-categories (clojure.spec.alpha/and :portkey.aws.dms/event-categories-list))
(clojure.spec.alpha/def :portkey.aws.dms.describe-events-message/filters (clojure.spec.alpha/and :portkey.aws.dms/filter-list))
(clojure.spec.alpha/def :portkey.aws.dms.describe-events-message/source-identifier (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms/describe-events-message (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.describe-events-message/end-time :portkey.aws.dms.describe-events-message/start-time :portkey.aws.dms.describe-events-message/max-records :portkey.aws.dms.describe-events-message/marker :portkey.aws.dms/source-type :portkey.aws.dms.describe-events-message/duration :portkey.aws.dms.describe-events-message/event-categories :portkey.aws.dms.describe-events-message/filters :portkey.aws.dms.describe-events-message/source-identifier]))

(clojure.spec.alpha/def :portkey.aws.dms.replication-task-stats/full-load-progress-percent (clojure.spec.alpha/and :portkey.aws.dms/integer))
(clojure.spec.alpha/def :portkey.aws.dms.replication-task-stats/elapsed-time-millis (clojure.spec.alpha/and :portkey.aws.dms/long))
(clojure.spec.alpha/def :portkey.aws.dms.replication-task-stats/tables-loaded (clojure.spec.alpha/and :portkey.aws.dms/integer))
(clojure.spec.alpha/def :portkey.aws.dms.replication-task-stats/tables-loading (clojure.spec.alpha/and :portkey.aws.dms/integer))
(clojure.spec.alpha/def :portkey.aws.dms.replication-task-stats/tables-queued (clojure.spec.alpha/and :portkey.aws.dms/integer))
(clojure.spec.alpha/def :portkey.aws.dms.replication-task-stats/tables-errored (clojure.spec.alpha/and :portkey.aws.dms/integer))
(clojure.spec.alpha/def :portkey.aws.dms/replication-task-stats (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.replication-task-stats/full-load-progress-percent :portkey.aws.dms.replication-task-stats/elapsed-time-millis :portkey.aws.dms.replication-task-stats/tables-loaded :portkey.aws.dms.replication-task-stats/tables-loading :portkey.aws.dms.replication-task-stats/tables-queued :portkey.aws.dms.replication-task-stats/tables-errored]))

(clojure.spec.alpha/def :portkey.aws.dms/replication-task-list (clojure.spec.alpha/coll-of :portkey.aws.dms/replication-task))

(clojure.spec.alpha/def :portkey.aws.dms/replication-task-assessment-result-list (clojure.spec.alpha/coll-of :portkey.aws.dms/replication-task-assessment-result))

(clojure.spec.alpha/def :portkey.aws.dms/event-list (clojure.spec.alpha/coll-of :portkey.aws.dms/event))

(clojure.spec.alpha/def :portkey.aws.dms.refresh-schemas-status/endpoint-arn (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.refresh-schemas-status/replication-instance-arn (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.refresh-schemas-status/status (clojure.spec.alpha/and :portkey.aws.dms/refresh-schemas-status-type-value))
(clojure.spec.alpha/def :portkey.aws.dms.refresh-schemas-status/last-refresh-date (clojure.spec.alpha/and :portkey.aws.dms/t-stamp))
(clojure.spec.alpha/def :portkey.aws.dms.refresh-schemas-status/last-failure-message (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms/refresh-schemas-status (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.refresh-schemas-status/endpoint-arn :portkey.aws.dms.refresh-schemas-status/replication-instance-arn :portkey.aws.dms.refresh-schemas-status/status :portkey.aws.dms.refresh-schemas-status/last-refresh-date :portkey.aws.dms.refresh-schemas-status/last-failure-message]))

(clojure.spec.alpha/def :portkey.aws.dms/source-type #{:replicationinstance "replication-instance"})

(clojure.spec.alpha/def :portkey.aws.dms.replication-task/replication-task-settings (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.replication-task/replication-task-creation-date (clojure.spec.alpha/and :portkey.aws.dms/t-stamp))
(clojure.spec.alpha/def :portkey.aws.dms.replication-task/cdc-stop-position (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.replication-task/cdc-start-position (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.replication-task/source-endpoint-arn (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.replication-task/migration-type (clojure.spec.alpha/and :portkey.aws.dms/migration-type-value))
(clojure.spec.alpha/def :portkey.aws.dms.replication-task/stop-reason (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.replication-task/status (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.replication-task/last-failure-message (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.replication-task/replication-task-arn (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.replication-task/replication-instance-arn (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.replication-task/target-endpoint-arn (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.replication-task/replication-task-start-date (clojure.spec.alpha/and :portkey.aws.dms/t-stamp))
(clojure.spec.alpha/def :portkey.aws.dms.replication-task/replication-task-identifier (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.replication-task/table-mappings (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.replication-task/recovery-checkpoint (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms/replication-task (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.replication-task/replication-task-settings :portkey.aws.dms.replication-task/replication-task-creation-date :portkey.aws.dms.replication-task/cdc-stop-position :portkey.aws.dms.replication-task/cdc-start-position :portkey.aws.dms.replication-task/source-endpoint-arn :portkey.aws.dms.replication-task/migration-type :portkey.aws.dms/replication-task-stats :portkey.aws.dms.replication-task/stop-reason :portkey.aws.dms.replication-task/status :portkey.aws.dms.replication-task/last-failure-message :portkey.aws.dms.replication-task/replication-task-arn :portkey.aws.dms.replication-task/replication-instance-arn :portkey.aws.dms.replication-task/target-endpoint-arn :portkey.aws.dms.replication-task/replication-task-start-date :portkey.aws.dms.replication-task/replication-task-identifier :portkey.aws.dms.replication-task/table-mappings :portkey.aws.dms.replication-task/recovery-checkpoint]))

(clojure.spec.alpha/def :portkey.aws.dms.create-replication-subnet-group-message/replication-subnet-group-identifier (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.create-replication-subnet-group-message/replication-subnet-group-description (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.create-replication-subnet-group-message/subnet-ids (clojure.spec.alpha/and :portkey.aws.dms/subnet-identifier-list))
(clojure.spec.alpha/def :portkey.aws.dms.create-replication-subnet-group-message/tags (clojure.spec.alpha/and :portkey.aws.dms/tag-list))
(clojure.spec.alpha/def :portkey.aws.dms/create-replication-subnet-group-message (clojure.spec.alpha/keys :req-un [:portkey.aws.dms.create-replication-subnet-group-message/replication-subnet-group-identifier :portkey.aws.dms.create-replication-subnet-group-message/replication-subnet-group-description :portkey.aws.dms.create-replication-subnet-group-message/subnet-ids] :opt-un [:portkey.aws.dms.create-replication-subnet-group-message/tags]))

(clojure.spec.alpha/def :portkey.aws.dms/start-replication-task-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms/replication-task]))

(clojure.spec.alpha/def :portkey.aws.dms/create-endpoint-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms/endpoint]))

(clojure.spec.alpha/def :portkey.aws.dms.event/source-identifier (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.event/message (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.event/event-categories (clojure.spec.alpha/and :portkey.aws.dms/event-categories-list))
(clojure.spec.alpha/def :portkey.aws.dms.event/date (clojure.spec.alpha/and :portkey.aws.dms/t-stamp))
(clojure.spec.alpha/def :portkey.aws.dms/event (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.event/source-identifier :portkey.aws.dms/source-type :portkey.aws.dms.event/message :portkey.aws.dms.event/event-categories :portkey.aws.dms.event/date]))

(clojure.spec.alpha/def :portkey.aws.dms.delete-certificate-message/certificate-arn (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms/delete-certificate-message (clojure.spec.alpha/keys :req-un [:portkey.aws.dms.delete-certificate-message/certificate-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dms.availability-zone/name (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms/availability-zone (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.availability-zone/name]))

(clojure.spec.alpha/def :portkey.aws.dms/table-list-to-reload (clojure.spec.alpha/coll-of :portkey.aws.dms/table-to-reload))

(clojure.spec.alpha/def :portkey.aws.dms/auth-type-value #{:password "password" "no" :no})

(clojure.spec.alpha/def :portkey.aws.dms.create-replication-task-message/cdc-start-time (clojure.spec.alpha/and :portkey.aws.dms/t-stamp))
(clojure.spec.alpha/def :portkey.aws.dms.create-replication-task-message/replication-task-settings (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.create-replication-task-message/cdc-stop-position (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.create-replication-task-message/cdc-start-position (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.create-replication-task-message/source-endpoint-arn (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.create-replication-task-message/migration-type (clojure.spec.alpha/and :portkey.aws.dms/migration-type-value))
(clojure.spec.alpha/def :portkey.aws.dms.create-replication-task-message/tags (clojure.spec.alpha/and :portkey.aws.dms/tag-list))
(clojure.spec.alpha/def :portkey.aws.dms.create-replication-task-message/replication-instance-arn (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.create-replication-task-message/target-endpoint-arn (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.create-replication-task-message/replication-task-identifier (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.create-replication-task-message/table-mappings (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms/create-replication-task-message (clojure.spec.alpha/keys :req-un [:portkey.aws.dms.create-replication-task-message/replication-task-identifier :portkey.aws.dms.create-replication-task-message/source-endpoint-arn :portkey.aws.dms.create-replication-task-message/target-endpoint-arn :portkey.aws.dms.create-replication-task-message/replication-instance-arn :portkey.aws.dms.create-replication-task-message/migration-type :portkey.aws.dms.create-replication-task-message/table-mappings] :opt-un [:portkey.aws.dms.create-replication-task-message/cdc-start-time :portkey.aws.dms.create-replication-task-message/replication-task-settings :portkey.aws.dms.create-replication-task-message/cdc-stop-position :portkey.aws.dms.create-replication-task-message/cdc-start-position :portkey.aws.dms.create-replication-task-message/tags]))

(clojure.spec.alpha/def :portkey.aws.dms/delete-certificate-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms/certificate]))

(clojure.spec.alpha/def :portkey.aws.dms/delete-replication-task-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms/replication-task]))

(clojure.spec.alpha/def :portkey.aws.dms.delete-event-subscription-message/subscription-name (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms/delete-event-subscription-message (clojure.spec.alpha/keys :req-un [:portkey.aws.dms.delete-event-subscription-message/subscription-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dms.delete-replication-subnet-group-message/replication-subnet-group-identifier (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms/delete-replication-subnet-group-message (clojure.spec.alpha/keys :req-un [:portkey.aws.dms.delete-replication-subnet-group-message/replication-subnet-group-identifier] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dms.describe-replication-subnet-groups-response/marker (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms/describe-replication-subnet-groups-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.describe-replication-subnet-groups-response/marker :portkey.aws.dms/replication-subnet-groups]))

(clojure.spec.alpha/def :portkey.aws.dms.import-certificate-message/certificate-identifier (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.import-certificate-message/certificate-pem (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.import-certificate-message/tags (clojure.spec.alpha/and :portkey.aws.dms/tag-list))
(clojure.spec.alpha/def :portkey.aws.dms/import-certificate-message (clojure.spec.alpha/keys :req-un [:portkey.aws.dms.import-certificate-message/certificate-identifier] :opt-un [:portkey.aws.dms.import-certificate-message/certificate-pem :portkey.aws.dms/certificate-wallet :portkey.aws.dms.import-certificate-message/tags]))

(clojure.spec.alpha/def :portkey.aws.dms.replication-subnet-group-does-not-cover-enough-a-zs/message (clojure.spec.alpha/and :portkey.aws.dms/exception-message))
(clojure.spec.alpha/def :portkey.aws.dms/replication-subnet-group-does-not-cover-enough-a-zs (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.replication-subnet-group-does-not-cover-enough-a-zs/message]))

(clojure.spec.alpha/def :portkey.aws.dms/table-statistics-list (clojure.spec.alpha/coll-of :portkey.aws.dms/table-statistics))

(clojure.spec.alpha/def :portkey.aws.dms/reboot-replication-instance-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms/replication-instance]))

(clojure.spec.alpha/def :portkey.aws.dms.describe-replication-tasks-message/filters (clojure.spec.alpha/and :portkey.aws.dms/filter-list))
(clojure.spec.alpha/def :portkey.aws.dms.describe-replication-tasks-message/max-records (clojure.spec.alpha/and :portkey.aws.dms/integer-optional))
(clojure.spec.alpha/def :portkey.aws.dms.describe-replication-tasks-message/marker (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms/describe-replication-tasks-message (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.describe-replication-tasks-message/filters :portkey.aws.dms.describe-replication-tasks-message/max-records :portkey.aws.dms.describe-replication-tasks-message/marker]))

(clojure.spec.alpha/def :portkey.aws.dms/replication-instance-list (clojure.spec.alpha/coll-of :portkey.aws.dms/replication-instance))

(clojure.spec.alpha/def :portkey.aws.dms/delete-replication-instance-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms/replication-instance]))

(clojure.spec.alpha/def :portkey.aws.dms.subnet-already-in-use/message (clojure.spec.alpha/and :portkey.aws.dms/exception-message))
(clojure.spec.alpha/def :portkey.aws.dms/subnet-already-in-use (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.subnet-already-in-use/message]))

(clojure.spec.alpha/def :portkey.aws.dms/reload-option-value #{"data-reload" "validate-only" :validateonly :datareload})

(clojure.spec.alpha/def :portkey.aws.dms.stop-replication-task-message/replication-task-arn (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms/stop-replication-task-message (clojure.spec.alpha/keys :req-un [:portkey.aws.dms.stop-replication-task-message/replication-task-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dms/replication-endpoint-type-value #{:source "source" "target" :target})

(clojure.spec.alpha/def :portkey.aws.dms.invalid-subnet/message (clojure.spec.alpha/and :portkey.aws.dms/exception-message))
(clojure.spec.alpha/def :portkey.aws.dms/invalid-subnet (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.invalid-subnet/message]))

(clojure.spec.alpha/def :portkey.aws.dms/create-event-subscription-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms/event-subscription]))

(clojure.spec.alpha/def :portkey.aws.dms/tag-list (clojure.spec.alpha/coll-of :portkey.aws.dms/tag))

(clojure.spec.alpha/def :portkey.aws.dms/replication-instance-private-ip-address-list (clojure.spec.alpha/coll-of :portkey.aws.dms/string))

(clojure.spec.alpha/def :portkey.aws.dms.mongo-db-settings/username (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.mongo-db-settings/password (clojure.spec.alpha/and :portkey.aws.dms/secret-string))
(clojure.spec.alpha/def :portkey.aws.dms.mongo-db-settings/database-name (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.mongo-db-settings/extract-doc-id (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.mongo-db-settings/auth-mechanism (clojure.spec.alpha/and :portkey.aws.dms/auth-mechanism-value))
(clojure.spec.alpha/def :portkey.aws.dms.mongo-db-settings/port (clojure.spec.alpha/and :portkey.aws.dms/integer-optional))
(clojure.spec.alpha/def :portkey.aws.dms.mongo-db-settings/kms-key-id (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.mongo-db-settings/auth-type (clojure.spec.alpha/and :portkey.aws.dms/auth-type-value))
(clojure.spec.alpha/def :portkey.aws.dms.mongo-db-settings/auth-source (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.mongo-db-settings/server-name (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.mongo-db-settings/docs-to-investigate (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.mongo-db-settings/nesting-level (clojure.spec.alpha/and :portkey.aws.dms/nesting-level-value))
(clojure.spec.alpha/def :portkey.aws.dms/mongo-db-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.mongo-db-settings/username :portkey.aws.dms.mongo-db-settings/password :portkey.aws.dms.mongo-db-settings/database-name :portkey.aws.dms.mongo-db-settings/extract-doc-id :portkey.aws.dms.mongo-db-settings/auth-mechanism :portkey.aws.dms.mongo-db-settings/port :portkey.aws.dms.mongo-db-settings/kms-key-id :portkey.aws.dms.mongo-db-settings/auth-type :portkey.aws.dms.mongo-db-settings/auth-source :portkey.aws.dms.mongo-db-settings/server-name :portkey.aws.dms.mongo-db-settings/docs-to-investigate :portkey.aws.dms.mongo-db-settings/nesting-level]))

(clojure.spec.alpha/def :portkey.aws.dms.modify-replication-instance-message/replication-instance-class (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.modify-replication-instance-message/preferred-maintenance-window (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.modify-replication-instance-message/auto-minor-version-upgrade (clojure.spec.alpha/and :portkey.aws.dms/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.dms.modify-replication-instance-message/vpc-security-group-ids (clojure.spec.alpha/and :portkey.aws.dms/vpc-security-group-id-list))
(clojure.spec.alpha/def :portkey.aws.dms.modify-replication-instance-message/replication-instance-identifier (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.modify-replication-instance-message/allow-major-version-upgrade (clojure.spec.alpha/and :portkey.aws.dms/boolean))
(clojure.spec.alpha/def :portkey.aws.dms.modify-replication-instance-message/allocated-storage (clojure.spec.alpha/and :portkey.aws.dms/integer-optional))
(clojure.spec.alpha/def :portkey.aws.dms.modify-replication-instance-message/engine-version (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.modify-replication-instance-message/replication-instance-arn (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.modify-replication-instance-message/apply-immediately (clojure.spec.alpha/and :portkey.aws.dms/boolean))
(clojure.spec.alpha/def :portkey.aws.dms.modify-replication-instance-message/multi-az (clojure.spec.alpha/and :portkey.aws.dms/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.dms/modify-replication-instance-message (clojure.spec.alpha/keys :req-un [:portkey.aws.dms.modify-replication-instance-message/replication-instance-arn] :opt-un [:portkey.aws.dms.modify-replication-instance-message/replication-instance-class :portkey.aws.dms.modify-replication-instance-message/preferred-maintenance-window :portkey.aws.dms.modify-replication-instance-message/auto-minor-version-upgrade :portkey.aws.dms.modify-replication-instance-message/vpc-security-group-ids :portkey.aws.dms.modify-replication-instance-message/replication-instance-identifier :portkey.aws.dms.modify-replication-instance-message/allow-major-version-upgrade :portkey.aws.dms.modify-replication-instance-message/allocated-storage :portkey.aws.dms.modify-replication-instance-message/engine-version :portkey.aws.dms.modify-replication-instance-message/apply-immediately :portkey.aws.dms.modify-replication-instance-message/multi-az]))

(clojure.spec.alpha/def :portkey.aws.dms/supported-endpoint-type-list (clojure.spec.alpha/coll-of :portkey.aws.dms/supported-endpoint-type))

(clojure.spec.alpha/def :portkey.aws.dms.reload-tables-message/replication-task-arn (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.reload-tables-message/tables-to-reload (clojure.spec.alpha/and :portkey.aws.dms/table-list-to-reload))
(clojure.spec.alpha/def :portkey.aws.dms.reload-tables-message/reload-option (clojure.spec.alpha/and :portkey.aws.dms/reload-option-value))
(clojure.spec.alpha/def :portkey.aws.dms/reload-tables-message (clojure.spec.alpha/keys :req-un [:portkey.aws.dms.reload-tables-message/replication-task-arn :portkey.aws.dms.reload-tables-message/tables-to-reload] :opt-un [:portkey.aws.dms.reload-tables-message/reload-option]))

(clojure.spec.alpha/def :portkey.aws.dms.invalid-certificate-fault/message (clojure.spec.alpha/and :portkey.aws.dms/exception-message))
(clojure.spec.alpha/def :portkey.aws.dms/invalid-certificate-fault (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.invalid-certificate-fault/message]))

(clojure.spec.alpha/def :portkey.aws.dms.add-tags-to-resource-message/resource-arn (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.add-tags-to-resource-message/tags (clojure.spec.alpha/and :portkey.aws.dms/tag-list))
(clojure.spec.alpha/def :portkey.aws.dms/add-tags-to-resource-message (clojure.spec.alpha/keys :req-un [:portkey.aws.dms.add-tags-to-resource-message/resource-arn :portkey.aws.dms.add-tags-to-resource-message/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dms.replication-pending-modified-values/replication-instance-class (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.replication-pending-modified-values/allocated-storage (clojure.spec.alpha/and :portkey.aws.dms/integer-optional))
(clojure.spec.alpha/def :portkey.aws.dms.replication-pending-modified-values/multi-az (clojure.spec.alpha/and :portkey.aws.dms/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.dms.replication-pending-modified-values/engine-version (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms/replication-pending-modified-values (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.replication-pending-modified-values/replication-instance-class :portkey.aws.dms.replication-pending-modified-values/allocated-storage :portkey.aws.dms.replication-pending-modified-values/multi-az :portkey.aws.dms.replication-pending-modified-values/engine-version]))

(clojure.spec.alpha/def :portkey.aws.dms.describe-event-subscriptions-response/marker (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms/describe-event-subscriptions-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.describe-event-subscriptions-response/marker :portkey.aws.dms/event-subscriptions-list]))

(clojure.spec.alpha/def :portkey.aws.dms.vpc-security-group-membership/vpc-security-group-id (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.vpc-security-group-membership/status (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms/vpc-security-group-membership (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.vpc-security-group-membership/vpc-security-group-id :portkey.aws.dms.vpc-security-group-membership/status]))

(clojure.spec.alpha/def :portkey.aws.dms.describe-endpoints-response/marker (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.describe-endpoints-response/endpoints (clojure.spec.alpha/and :portkey.aws.dms/endpoint-list))
(clojure.spec.alpha/def :portkey.aws.dms/describe-endpoints-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.describe-endpoints-response/marker :portkey.aws.dms.describe-endpoints-response/endpoints]))

(clojure.spec.alpha/def :portkey.aws.dms.describe-table-statistics-message/replication-task-arn (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.describe-table-statistics-message/max-records (clojure.spec.alpha/and :portkey.aws.dms/integer-optional))
(clojure.spec.alpha/def :portkey.aws.dms.describe-table-statistics-message/marker (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.describe-table-statistics-message/filters (clojure.spec.alpha/and :portkey.aws.dms/filter-list))
(clojure.spec.alpha/def :portkey.aws.dms/describe-table-statistics-message (clojure.spec.alpha/keys :req-un [:portkey.aws.dms.describe-table-statistics-message/replication-task-arn] :opt-un [:portkey.aws.dms.describe-table-statistics-message/max-records :portkey.aws.dms.describe-table-statistics-message/marker :portkey.aws.dms.describe-table-statistics-message/filters]))

(clojure.spec.alpha/def :portkey.aws.dms.describe-endpoint-types-response/marker (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.describe-endpoint-types-response/supported-endpoint-types (clojure.spec.alpha/and :portkey.aws.dms/supported-endpoint-type-list))
(clojure.spec.alpha/def :portkey.aws.dms/describe-endpoint-types-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.describe-endpoint-types-response/marker :portkey.aws.dms.describe-endpoint-types-response/supported-endpoint-types]))

(clojure.spec.alpha/def :portkey.aws.dms.describe-replication-tasks-response/marker (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.describe-replication-tasks-response/replication-tasks (clojure.spec.alpha/and :portkey.aws.dms/replication-task-list))
(clojure.spec.alpha/def :portkey.aws.dms/describe-replication-tasks-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.describe-replication-tasks-response/marker :portkey.aws.dms.describe-replication-tasks-response/replication-tasks]))

(clojure.spec.alpha/def :portkey.aws.dms.describe-schemas-message/endpoint-arn (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.describe-schemas-message/max-records (clojure.spec.alpha/and :portkey.aws.dms/integer-optional))
(clojure.spec.alpha/def :portkey.aws.dms.describe-schemas-message/marker (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms/describe-schemas-message (clojure.spec.alpha/keys :req-un [:portkey.aws.dms.describe-schemas-message/endpoint-arn] :opt-un [:portkey.aws.dms.describe-schemas-message/max-records :portkey.aws.dms.describe-schemas-message/marker]))

(clojure.spec.alpha/def :portkey.aws.dms.delete-replication-task-message/replication-task-arn (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms/delete-replication-task-message (clojure.spec.alpha/keys :req-un [:portkey.aws.dms.delete-replication-task-message/replication-task-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dms/delete-endpoint-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms/endpoint]))

(clojure.spec.alpha/def :portkey.aws.dms/account-quota-list (clojure.spec.alpha/coll-of :portkey.aws.dms/account-quota))

(clojure.spec.alpha/def :portkey.aws.dms/exception-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.dms/modify-replication-task-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms/replication-task]))

(clojure.spec.alpha/def :portkey.aws.dms/nesting-level-value #{:one "none" "one" :none})

(clojure.spec.alpha/def :portkey.aws.dms.modify-replication-task-message/replication-task-arn (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.modify-replication-task-message/replication-task-identifier (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.modify-replication-task-message/migration-type (clojure.spec.alpha/and :portkey.aws.dms/migration-type-value))
(clojure.spec.alpha/def :portkey.aws.dms.modify-replication-task-message/table-mappings (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.modify-replication-task-message/replication-task-settings (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.modify-replication-task-message/cdc-start-time (clojure.spec.alpha/and :portkey.aws.dms/t-stamp))
(clojure.spec.alpha/def :portkey.aws.dms.modify-replication-task-message/cdc-start-position (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.modify-replication-task-message/cdc-stop-position (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms/modify-replication-task-message (clojure.spec.alpha/keys :req-un [:portkey.aws.dms.modify-replication-task-message/replication-task-arn] :opt-un [:portkey.aws.dms.modify-replication-task-message/replication-task-identifier :portkey.aws.dms.modify-replication-task-message/migration-type :portkey.aws.dms.modify-replication-task-message/table-mappings :portkey.aws.dms.modify-replication-task-message/replication-task-settings :portkey.aws.dms.modify-replication-task-message/cdc-start-time :portkey.aws.dms.modify-replication-task-message/cdc-start-position :portkey.aws.dms.modify-replication-task-message/cdc-stop-position]))

(clojure.spec.alpha/def :portkey.aws.dms.resource-not-found-fault/message (clojure.spec.alpha/and :portkey.aws.dms/exception-message))
(clojure.spec.alpha/def :portkey.aws.dms/resource-not-found-fault (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.resource-not-found-fault/message]))

(clojure.spec.alpha/def :portkey.aws.dms/add-tags-to-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dms.supported-endpoint-type/engine-name (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.supported-endpoint-type/supports-cdc (clojure.spec.alpha/and :portkey.aws.dms/boolean))
(clojure.spec.alpha/def :portkey.aws.dms.supported-endpoint-type/endpoint-type (clojure.spec.alpha/and :portkey.aws.dms/replication-endpoint-type-value))
(clojure.spec.alpha/def :portkey.aws.dms.supported-endpoint-type/engine-display-name (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms/supported-endpoint-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.supported-endpoint-type/engine-name :portkey.aws.dms.supported-endpoint-type/supports-cdc :portkey.aws.dms.supported-endpoint-type/endpoint-type :portkey.aws.dms.supported-endpoint-type/engine-display-name]))

(clojure.spec.alpha/def :portkey.aws.dms.access-denied-fault/message (clojure.spec.alpha/and :portkey.aws.dms/exception-message))
(clojure.spec.alpha/def :portkey.aws.dms/access-denied-fault (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.access-denied-fault/message]))

(clojure.spec.alpha/def :portkey.aws.dms.describe-replication-instances-message/filters (clojure.spec.alpha/and :portkey.aws.dms/filter-list))
(clojure.spec.alpha/def :portkey.aws.dms.describe-replication-instances-message/max-records (clojure.spec.alpha/and :portkey.aws.dms/integer-optional))
(clojure.spec.alpha/def :portkey.aws.dms.describe-replication-instances-message/marker (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms/describe-replication-instances-message (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.describe-replication-instances-message/filters :portkey.aws.dms.describe-replication-instances-message/max-records :portkey.aws.dms.describe-replication-instances-message/marker]))

(clojure.spec.alpha/def :portkey.aws.dms.remove-tags-from-resource-message/resource-arn (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.remove-tags-from-resource-message/tag-keys (clojure.spec.alpha/and :portkey.aws.dms/key-list))
(clojure.spec.alpha/def :portkey.aws.dms/remove-tags-from-resource-message (clojure.spec.alpha/keys :req-un [:portkey.aws.dms.remove-tags-from-resource-message/resource-arn :portkey.aws.dms.remove-tags-from-resource-message/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dms/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.dms/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.dms.start-replication-task-assessment-message/replication-task-arn (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms/start-replication-task-assessment-message (clojure.spec.alpha/keys :req-un [:portkey.aws.dms.start-replication-task-assessment-message/replication-task-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dms/vpc-security-group-id-list (clojure.spec.alpha/coll-of :portkey.aws.dms/string))

(clojure.spec.alpha/def :portkey.aws.dms.invalid-resource-state-fault/message (clojure.spec.alpha/and :portkey.aws.dms/exception-message))
(clojure.spec.alpha/def :portkey.aws.dms/invalid-resource-state-fault (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.invalid-resource-state-fault/message]))

(clojure.spec.alpha/def :portkey.aws.dms.upgrade-dependency-failure-fault/message (clojure.spec.alpha/and :portkey.aws.dms/exception-message))
(clojure.spec.alpha/def :portkey.aws.dms/upgrade-dependency-failure-fault (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.upgrade-dependency-failure-fault/message]))

(clojure.spec.alpha/def :portkey.aws.dms.dynamo-db-settings/service-access-role-arn (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms/dynamo-db-settings (clojure.spec.alpha/keys :req-un [:portkey.aws.dms.dynamo-db-settings/service-access-role-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dms/t-stamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.dms/modify-event-subscription-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms/event-subscription]))

(clojure.spec.alpha/def :portkey.aws.dms.describe-certificates-message/filters (clojure.spec.alpha/and :portkey.aws.dms/filter-list))
(clojure.spec.alpha/def :portkey.aws.dms.describe-certificates-message/max-records (clojure.spec.alpha/and :portkey.aws.dms/integer-optional))
(clojure.spec.alpha/def :portkey.aws.dms.describe-certificates-message/marker (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms/describe-certificates-message (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.describe-certificates-message/filters :portkey.aws.dms.describe-certificates-message/max-records :portkey.aws.dms.describe-certificates-message/marker]))

(clojure.spec.alpha/def :portkey.aws.dms.kms-key-not-accessible-fault/message (clojure.spec.alpha/and :portkey.aws.dms/exception-message))
(clojure.spec.alpha/def :portkey.aws.dms/kms-key-not-accessible-fault (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.kms-key-not-accessible-fault/message]))

(clojure.spec.alpha/def :portkey.aws.dms.create-event-subscription-message/subscription-name (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.create-event-subscription-message/sns-topic-arn (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.create-event-subscription-message/source-type (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.create-event-subscription-message/event-categories (clojure.spec.alpha/and :portkey.aws.dms/event-categories-list))
(clojure.spec.alpha/def :portkey.aws.dms.create-event-subscription-message/source-ids (clojure.spec.alpha/and :portkey.aws.dms/source-ids-list))
(clojure.spec.alpha/def :portkey.aws.dms.create-event-subscription-message/enabled (clojure.spec.alpha/and :portkey.aws.dms/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.dms.create-event-subscription-message/tags (clojure.spec.alpha/and :portkey.aws.dms/tag-list))
(clojure.spec.alpha/def :portkey.aws.dms/create-event-subscription-message (clojure.spec.alpha/keys :req-un [:portkey.aws.dms.create-event-subscription-message/subscription-name :portkey.aws.dms.create-event-subscription-message/sns-topic-arn] :opt-un [:portkey.aws.dms.create-event-subscription-message/source-type :portkey.aws.dms.create-event-subscription-message/event-categories :portkey.aws.dms.create-event-subscription-message/source-ids :portkey.aws.dms.create-event-subscription-message/enabled :portkey.aws.dms.create-event-subscription-message/tags]))

(clojure.spec.alpha/def :portkey.aws.dms/dms-ssl-mode-value #{"none" "verify-ca" "require" :require :verifyca :verifyfull "verify-full" :none})

(clojure.spec.alpha/def :portkey.aws.dms/event-categories-list (clojure.spec.alpha/coll-of :portkey.aws.dms/string))

(clojure.spec.alpha/def :portkey.aws.dms.describe-refresh-schemas-status-message/endpoint-arn (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms/describe-refresh-schemas-status-message (clojure.spec.alpha/keys :req-un [:portkey.aws.dms.describe-refresh-schemas-status-message/endpoint-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dms.create-endpoint-message/username (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.create-endpoint-message/engine-name (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.create-endpoint-message/password (clojure.spec.alpha/and :portkey.aws.dms/secret-string))
(clojure.spec.alpha/def :portkey.aws.dms.create-endpoint-message/database-name (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.create-endpoint-message/extra-connection-attributes (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.create-endpoint-message/endpoint-identifier (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.create-endpoint-message/endpoint-type (clojure.spec.alpha/and :portkey.aws.dms/replication-endpoint-type-value))
(clojure.spec.alpha/def :portkey.aws.dms.create-endpoint-message/tags (clojure.spec.alpha/and :portkey.aws.dms/tag-list))
(clojure.spec.alpha/def :portkey.aws.dms.create-endpoint-message/service-access-role-arn (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.create-endpoint-message/external-table-definition (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.create-endpoint-message/port (clojure.spec.alpha/and :portkey.aws.dms/integer-optional))
(clojure.spec.alpha/def :portkey.aws.dms.create-endpoint-message/kms-key-id (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.create-endpoint-message/ssl-mode (clojure.spec.alpha/and :portkey.aws.dms/dms-ssl-mode-value))
(clojure.spec.alpha/def :portkey.aws.dms.create-endpoint-message/certificate-arn (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.create-endpoint-message/server-name (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms/create-endpoint-message (clojure.spec.alpha/keys :req-un [:portkey.aws.dms.create-endpoint-message/endpoint-identifier :portkey.aws.dms.create-endpoint-message/endpoint-type :portkey.aws.dms.create-endpoint-message/engine-name] :opt-un [:portkey.aws.dms.create-endpoint-message/username :portkey.aws.dms/s-3-settings :portkey.aws.dms/dms-transfer-settings :portkey.aws.dms.create-endpoint-message/password :portkey.aws.dms.create-endpoint-message/database-name :portkey.aws.dms.create-endpoint-message/extra-connection-attributes :portkey.aws.dms.create-endpoint-message/tags :portkey.aws.dms.create-endpoint-message/service-access-role-arn :portkey.aws.dms.create-endpoint-message/external-table-definition :portkey.aws.dms/mongo-db-settings :portkey.aws.dms.create-endpoint-message/port :portkey.aws.dms.create-endpoint-message/kms-key-id :portkey.aws.dms.create-endpoint-message/ssl-mode :portkey.aws.dms/dynamo-db-settings :portkey.aws.dms.create-endpoint-message/certificate-arn :portkey.aws.dms.create-endpoint-message/server-name]))

(clojure.spec.alpha/def :portkey.aws.dms/modify-replication-subnet-group-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms/replication-subnet-group]))

(clojure.spec.alpha/def :portkey.aws.dms.describe-replication-subnet-groups-message/filters (clojure.spec.alpha/and :portkey.aws.dms/filter-list))
(clojure.spec.alpha/def :portkey.aws.dms.describe-replication-subnet-groups-message/max-records (clojure.spec.alpha/and :portkey.aws.dms/integer-optional))
(clojure.spec.alpha/def :portkey.aws.dms.describe-replication-subnet-groups-message/marker (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms/describe-replication-subnet-groups-message (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.describe-replication-subnet-groups-message/filters :portkey.aws.dms.describe-replication-subnet-groups-message/max-records :portkey.aws.dms.describe-replication-subnet-groups-message/marker]))

(clojure.spec.alpha/def :portkey.aws.dms/event-category-group-list (clojure.spec.alpha/coll-of :portkey.aws.dms/event-category-group))

(clojure.spec.alpha/def :portkey.aws.dms.resource-quota-exceeded-fault/message (clojure.spec.alpha/and :portkey.aws.dms/exception-message))
(clojure.spec.alpha/def :portkey.aws.dms/resource-quota-exceeded-fault (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.resource-quota-exceeded-fault/message]))

(clojure.spec.alpha/def :portkey.aws.dms.connection/replication-instance-arn (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.connection/endpoint-arn (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.connection/status (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.connection/last-failure-message (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.connection/endpoint-identifier (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.connection/replication-instance-identifier (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms/connection (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.connection/replication-instance-arn :portkey.aws.dms.connection/endpoint-arn :portkey.aws.dms.connection/status :portkey.aws.dms.connection/last-failure-message :portkey.aws.dms.connection/endpoint-identifier :portkey.aws.dms.connection/replication-instance-identifier]))

(clojure.spec.alpha/def :portkey.aws.dms.endpoint/username (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.endpoint/engine-name (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.endpoint/database-name (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.endpoint/extra-connection-attributes (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.endpoint/endpoint-identifier (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.endpoint/endpoint-type (clojure.spec.alpha/and :portkey.aws.dms/replication-endpoint-type-value))
(clojure.spec.alpha/def :portkey.aws.dms.endpoint/external-id (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.endpoint/service-access-role-arn (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.endpoint/status (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.endpoint/external-table-definition (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.endpoint/port (clojure.spec.alpha/and :portkey.aws.dms/integer-optional))
(clojure.spec.alpha/def :portkey.aws.dms.endpoint/kms-key-id (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.endpoint/ssl-mode (clojure.spec.alpha/and :portkey.aws.dms/dms-ssl-mode-value))
(clojure.spec.alpha/def :portkey.aws.dms.endpoint/certificate-arn (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.endpoint/server-name (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.endpoint/engine-display-name (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.endpoint/endpoint-arn (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms/endpoint (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.endpoint/username :portkey.aws.dms/s-3-settings :portkey.aws.dms/dms-transfer-settings :portkey.aws.dms.endpoint/engine-name :portkey.aws.dms.endpoint/database-name :portkey.aws.dms.endpoint/extra-connection-attributes :portkey.aws.dms.endpoint/endpoint-identifier :portkey.aws.dms.endpoint/endpoint-type :portkey.aws.dms.endpoint/external-id :portkey.aws.dms.endpoint/service-access-role-arn :portkey.aws.dms.endpoint/status :portkey.aws.dms.endpoint/external-table-definition :portkey.aws.dms/mongo-db-settings :portkey.aws.dms.endpoint/port :portkey.aws.dms.endpoint/kms-key-id :portkey.aws.dms.endpoint/ssl-mode :portkey.aws.dms/dynamo-db-settings :portkey.aws.dms.endpoint/certificate-arn :portkey.aws.dms.endpoint/server-name :portkey.aws.dms.endpoint/engine-display-name :portkey.aws.dms.endpoint/endpoint-arn]))

(clojure.spec.alpha/def :portkey.aws.dms.storage-quota-exceeded-fault/message (clojure.spec.alpha/and :portkey.aws.dms/exception-message))
(clojure.spec.alpha/def :portkey.aws.dms/storage-quota-exceeded-fault (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.storage-quota-exceeded-fault/message]))

(clojure.spec.alpha/def :portkey.aws.dms/auth-mechanism-value #{:default :scram-sha-1 "scram_sha_1" "mongodb_cr" :mongodb-cr "default"})

(clojure.spec.alpha/def :portkey.aws.dms/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.dms.describe-replication-task-assessment-results-response/marker (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.describe-replication-task-assessment-results-response/bucket-name (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.describe-replication-task-assessment-results-response/replication-task-assessment-results (clojure.spec.alpha/and :portkey.aws.dms/replication-task-assessment-result-list))
(clojure.spec.alpha/def :portkey.aws.dms/describe-replication-task-assessment-results-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.describe-replication-task-assessment-results-response/marker :portkey.aws.dms.describe-replication-task-assessment-results-response/bucket-name :portkey.aws.dms.describe-replication-task-assessment-results-response/replication-task-assessment-results]))

(clojure.spec.alpha/def :portkey.aws.dms.account-quota/account-quota-name (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.account-quota/used (clojure.spec.alpha/and :portkey.aws.dms/long))
(clojure.spec.alpha/def :portkey.aws.dms.account-quota/max (clojure.spec.alpha/and :portkey.aws.dms/long))
(clojure.spec.alpha/def :portkey.aws.dms/account-quota (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.account-quota/account-quota-name :portkey.aws.dms.account-quota/used :portkey.aws.dms.account-quota/max]))

(clojure.spec.alpha/def :portkey.aws.dms.describe-account-attributes-response/account-quotas (clojure.spec.alpha/and :portkey.aws.dms/account-quota-list))
(clojure.spec.alpha/def :portkey.aws.dms/describe-account-attributes-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.describe-account-attributes-response/account-quotas]))

(clojure.spec.alpha/def :portkey.aws.dms.replication-instance/replication-instance-class (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.replication-instance/secondary-availability-zone (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.replication-instance/publicly-accessible (clojure.spec.alpha/and :portkey.aws.dms/boolean))
(clojure.spec.alpha/def :portkey.aws.dms.replication-instance/preferred-maintenance-window (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.replication-instance/auto-minor-version-upgrade (clojure.spec.alpha/and :portkey.aws.dms/boolean))
(clojure.spec.alpha/def :portkey.aws.dms.replication-instance/replication-instance-status (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.replication-instance/instance-create-time (clojure.spec.alpha/and :portkey.aws.dms/t-stamp))
(clojure.spec.alpha/def :portkey.aws.dms.replication-instance/availability-zone (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.replication-instance/replication-instance-identifier (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.replication-instance/replication-instance-public-ip-address (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.replication-instance/allocated-storage (clojure.spec.alpha/and :portkey.aws.dms/integer))
(clojure.spec.alpha/def :portkey.aws.dms.replication-instance/free-until (clojure.spec.alpha/and :portkey.aws.dms/t-stamp))
(clojure.spec.alpha/def :portkey.aws.dms.replication-instance/engine-version (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.replication-instance/replication-instance-arn (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.replication-instance/kms-key-id (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.replication-instance/replication-instance-private-ip-address (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.replication-instance/replication-instance-public-ip-addresses (clojure.spec.alpha/and :portkey.aws.dms/replication-instance-public-ip-address-list))
(clojure.spec.alpha/def :portkey.aws.dms.replication-instance/vpc-security-groups (clojure.spec.alpha/and :portkey.aws.dms/vpc-security-group-membership-list))
(clojure.spec.alpha/def :portkey.aws.dms.replication-instance/replication-instance-private-ip-addresses (clojure.spec.alpha/and :portkey.aws.dms/replication-instance-private-ip-address-list))
(clojure.spec.alpha/def :portkey.aws.dms.replication-instance/multi-az (clojure.spec.alpha/and :portkey.aws.dms/boolean))
(clojure.spec.alpha/def :portkey.aws.dms.replication-instance/pending-modified-values (clojure.spec.alpha/and :portkey.aws.dms/replication-pending-modified-values))
(clojure.spec.alpha/def :portkey.aws.dms/replication-instance (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.replication-instance/replication-instance-class :portkey.aws.dms.replication-instance/secondary-availability-zone :portkey.aws.dms.replication-instance/publicly-accessible :portkey.aws.dms.replication-instance/preferred-maintenance-window :portkey.aws.dms/replication-subnet-group :portkey.aws.dms.replication-instance/auto-minor-version-upgrade :portkey.aws.dms.replication-instance/replication-instance-status :portkey.aws.dms.replication-instance/instance-create-time :portkey.aws.dms.replication-instance/availability-zone :portkey.aws.dms.replication-instance/replication-instance-identifier :portkey.aws.dms.replication-instance/replication-instance-public-ip-address :portkey.aws.dms.replication-instance/allocated-storage :portkey.aws.dms.replication-instance/free-until :portkey.aws.dms.replication-instance/engine-version :portkey.aws.dms.replication-instance/replication-instance-arn :portkey.aws.dms.replication-instance/kms-key-id :portkey.aws.dms.replication-instance/replication-instance-private-ip-address :portkey.aws.dms.replication-instance/replication-instance-public-ip-addresses :portkey.aws.dms.replication-instance/vpc-security-groups :portkey.aws.dms.replication-instance/replication-instance-private-ip-addresses :portkey.aws.dms.replication-instance/multi-az :portkey.aws.dms.replication-instance/pending-modified-values]))

(clojure.spec.alpha/def :portkey.aws.dms/remove-tags-from-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dms/refresh-schemas-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms/refresh-schemas-status]))

(clojure.spec.alpha/def :portkey.aws.dms.describe-orderable-replication-instances-response/orderable-replication-instances (clojure.spec.alpha/and :portkey.aws.dms/orderable-replication-instance-list))
(clojure.spec.alpha/def :portkey.aws.dms.describe-orderable-replication-instances-response/marker (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms/describe-orderable-replication-instances-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.describe-orderable-replication-instances-response/orderable-replication-instances :portkey.aws.dms.describe-orderable-replication-instances-response/marker]))

(clojure.spec.alpha/def :portkey.aws.dms.tag/key (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.tag/value (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms/tag (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.tag/key :portkey.aws.dms.tag/value]))

(clojure.spec.alpha/def :portkey.aws.dms.describe-event-categories-message/source-type (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.describe-event-categories-message/filters (clojure.spec.alpha/and :portkey.aws.dms/filter-list))
(clojure.spec.alpha/def :portkey.aws.dms/describe-event-categories-message (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.describe-event-categories-message/source-type :portkey.aws.dms.describe-event-categories-message/filters]))

(clojure.spec.alpha/def :portkey.aws.dms.test-connection-message/replication-instance-arn (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.test-connection-message/endpoint-arn (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms/test-connection-message (clojure.spec.alpha/keys :req-un [:portkey.aws.dms.test-connection-message/replication-instance-arn :portkey.aws.dms.test-connection-message/endpoint-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dms/boolean-optional clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.dms.describe-orderable-replication-instances-message/max-records (clojure.spec.alpha/and :portkey.aws.dms/integer-optional))
(clojure.spec.alpha/def :portkey.aws.dms.describe-orderable-replication-instances-message/marker (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms/describe-orderable-replication-instances-message (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.describe-orderable-replication-instances-message/max-records :portkey.aws.dms.describe-orderable-replication-instances-message/marker]))

(clojure.spec.alpha/def :portkey.aws.dms.sns-invalid-topic-fault/message (clojure.spec.alpha/and :portkey.aws.dms/exception-message))
(clojure.spec.alpha/def :portkey.aws.dms/sns-invalid-topic-fault (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.sns-invalid-topic-fault/message]))

(clojure.spec.alpha/def :portkey.aws.dms/delete-event-subscription-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms/event-subscription]))

(clojure.spec.alpha/def :portkey.aws.dms/describe-event-categories-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms/event-category-group-list]))

(clojure.spec.alpha/def :portkey.aws.dms.list-tags-for-resource-message/resource-arn (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms/list-tags-for-resource-message (clojure.spec.alpha/keys :req-un [:portkey.aws.dms.list-tags-for-resource-message/resource-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dms/describe-account-attributes-message (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dms.create-replication-instance-message/replication-instance-class (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.create-replication-instance-message/publicly-accessible (clojure.spec.alpha/and :portkey.aws.dms/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.dms.create-replication-instance-message/preferred-maintenance-window (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.create-replication-instance-message/auto-minor-version-upgrade (clojure.spec.alpha/and :portkey.aws.dms/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.dms.create-replication-instance-message/tags (clojure.spec.alpha/and :portkey.aws.dms/tag-list))
(clojure.spec.alpha/def :portkey.aws.dms.create-replication-instance-message/vpc-security-group-ids (clojure.spec.alpha/and :portkey.aws.dms/vpc-security-group-id-list))
(clojure.spec.alpha/def :portkey.aws.dms.create-replication-instance-message/availability-zone (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.create-replication-instance-message/replication-instance-identifier (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.create-replication-instance-message/allocated-storage (clojure.spec.alpha/and :portkey.aws.dms/integer-optional))
(clojure.spec.alpha/def :portkey.aws.dms.create-replication-instance-message/replication-subnet-group-identifier (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.create-replication-instance-message/engine-version (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.create-replication-instance-message/kms-key-id (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.create-replication-instance-message/multi-az (clojure.spec.alpha/and :portkey.aws.dms/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.dms/create-replication-instance-message (clojure.spec.alpha/keys :req-un [:portkey.aws.dms.create-replication-instance-message/replication-instance-identifier :portkey.aws.dms.create-replication-instance-message/replication-instance-class] :opt-un [:portkey.aws.dms.create-replication-instance-message/publicly-accessible :portkey.aws.dms.create-replication-instance-message/preferred-maintenance-window :portkey.aws.dms.create-replication-instance-message/auto-minor-version-upgrade :portkey.aws.dms.create-replication-instance-message/tags :portkey.aws.dms.create-replication-instance-message/vpc-security-group-ids :portkey.aws.dms.create-replication-instance-message/availability-zone :portkey.aws.dms.create-replication-instance-message/allocated-storage :portkey.aws.dms.create-replication-instance-message/replication-subnet-group-identifier :portkey.aws.dms.create-replication-instance-message/engine-version :portkey.aws.dms.create-replication-instance-message/kms-key-id :portkey.aws.dms.create-replication-instance-message/multi-az]))

(clojure.spec.alpha/def :portkey.aws.dms/replication-instance-public-ip-address-list (clojure.spec.alpha/coll-of :portkey.aws.dms/string))

(clojure.spec.alpha/def :portkey.aws.dms/event-subscriptions-list (clojure.spec.alpha/coll-of :portkey.aws.dms/event-subscription))

(clojure.spec.alpha/def :portkey.aws.dms.table-to-reload/schema-name (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.table-to-reload/table-name (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms/table-to-reload (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.table-to-reload/schema-name :portkey.aws.dms.table-to-reload/table-name]))

(clojure.spec.alpha/def :portkey.aws.dms.refresh-schemas-message/endpoint-arn (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.refresh-schemas-message/replication-instance-arn (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms/refresh-schemas-message (clojure.spec.alpha/keys :req-un [:portkey.aws.dms.refresh-schemas-message/endpoint-arn :portkey.aws.dms.refresh-schemas-message/replication-instance-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dms/migration-type-value #{"cdc" :cdc "full-load" "full-load-and-cdc" :fullload :fullloadandcdc})

(clojure.spec.alpha/def :portkey.aws.dms/test-connection-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms/connection]))

(clojure.spec.alpha/def :portkey.aws.dms/integer-optional clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.dms.certificate/valid-to-date (clojure.spec.alpha/and :portkey.aws.dms/t-stamp))
(clojure.spec.alpha/def :portkey.aws.dms.certificate/certificate-creation-date (clojure.spec.alpha/and :portkey.aws.dms/t-stamp))
(clojure.spec.alpha/def :portkey.aws.dms.certificate/certificate-owner (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.certificate/certificate-arn (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.certificate/key-length (clojure.spec.alpha/and :portkey.aws.dms/integer-optional))
(clojure.spec.alpha/def :portkey.aws.dms.certificate/valid-from-date (clojure.spec.alpha/and :portkey.aws.dms/t-stamp))
(clojure.spec.alpha/def :portkey.aws.dms.certificate/signing-algorithm (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.certificate/certificate-pem (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.certificate/certificate-identifier (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms/certificate (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms/certificate-wallet :portkey.aws.dms.certificate/valid-to-date :portkey.aws.dms.certificate/certificate-creation-date :portkey.aws.dms.certificate/certificate-owner :portkey.aws.dms.certificate/certificate-arn :portkey.aws.dms.certificate/key-length :portkey.aws.dms.certificate/valid-from-date :portkey.aws.dms.certificate/signing-algorithm :portkey.aws.dms.certificate/certificate-pem :portkey.aws.dms.certificate/certificate-identifier]))

(clojure.spec.alpha/def :portkey.aws.dms/endpoint-list (clojure.spec.alpha/coll-of :portkey.aws.dms/endpoint))

(clojure.spec.alpha/def :portkey.aws.dms/subnet-list (clojure.spec.alpha/coll-of :portkey.aws.dms/subnet))

(clojure.spec.alpha/def :portkey.aws.dms/filter-list (clojure.spec.alpha/coll-of :portkey.aws.dms/filter))

(clojure.spec.alpha/def :portkey.aws.dms.describe-events-response/marker (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.describe-events-response/events (clojure.spec.alpha/and :portkey.aws.dms/event-list))
(clojure.spec.alpha/def :portkey.aws.dms/describe-events-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.describe-events-response/marker :portkey.aws.dms.describe-events-response/events]))

(clojure.spec.alpha/def :portkey.aws.dms.delete-replication-instance-message/replication-instance-arn (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms/delete-replication-instance-message (clojure.spec.alpha/keys :req-un [:portkey.aws.dms.delete-replication-instance-message/replication-instance-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dms.reboot-replication-instance-message/replication-instance-arn (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.reboot-replication-instance-message/force-failover (clojure.spec.alpha/and :portkey.aws.dms/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.dms/reboot-replication-instance-message (clojure.spec.alpha/keys :req-un [:portkey.aws.dms.reboot-replication-instance-message/replication-instance-arn] :opt-un [:portkey.aws.dms.reboot-replication-instance-message/force-failover]))

(clojure.spec.alpha/def :portkey.aws.dms.describe-endpoint-types-message/filters (clojure.spec.alpha/and :portkey.aws.dms/filter-list))
(clojure.spec.alpha/def :portkey.aws.dms.describe-endpoint-types-message/max-records (clojure.spec.alpha/and :portkey.aws.dms/integer-optional))
(clojure.spec.alpha/def :portkey.aws.dms.describe-endpoint-types-message/marker (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms/describe-endpoint-types-message (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.describe-endpoint-types-message/filters :portkey.aws.dms.describe-endpoint-types-message/max-records :portkey.aws.dms.describe-endpoint-types-message/marker]))

(clojure.spec.alpha/def :portkey.aws.dms/secret-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.dms.describe-schemas-response/marker (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.describe-schemas-response/schemas (clojure.spec.alpha/and :portkey.aws.dms/schema-list))
(clojure.spec.alpha/def :portkey.aws.dms/describe-schemas-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.describe-schemas-response/marker :portkey.aws.dms.describe-schemas-response/schemas]))

(clojure.spec.alpha/def :portkey.aws.dms.table-statistics/deletes (clojure.spec.alpha/and :portkey.aws.dms/long))
(clojure.spec.alpha/def :portkey.aws.dms.table-statistics/full-load-rows (clojure.spec.alpha/and :portkey.aws.dms/long))
(clojure.spec.alpha/def :portkey.aws.dms.table-statistics/validation-state-details (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.table-statistics/table-state (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.table-statistics/inserts (clojure.spec.alpha/and :portkey.aws.dms/long))
(clojure.spec.alpha/def :portkey.aws.dms.table-statistics/full-load-condtnl-chk-failed-rows (clojure.spec.alpha/and :portkey.aws.dms/long))
(clojure.spec.alpha/def :portkey.aws.dms.table-statistics/validation-pending-records (clojure.spec.alpha/and :portkey.aws.dms/long))
(clojure.spec.alpha/def :portkey.aws.dms.table-statistics/validation-suspended-records (clojure.spec.alpha/and :portkey.aws.dms/long))
(clojure.spec.alpha/def :portkey.aws.dms.table-statistics/validation-state (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.table-statistics/full-load-error-rows (clojure.spec.alpha/and :portkey.aws.dms/long))
(clojure.spec.alpha/def :portkey.aws.dms.table-statistics/validation-failed-records (clojure.spec.alpha/and :portkey.aws.dms/long))
(clojure.spec.alpha/def :portkey.aws.dms.table-statistics/table-name (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.table-statistics/last-update-time (clojure.spec.alpha/and :portkey.aws.dms/t-stamp))
(clojure.spec.alpha/def :portkey.aws.dms.table-statistics/ddls (clojure.spec.alpha/and :portkey.aws.dms/long))
(clojure.spec.alpha/def :portkey.aws.dms.table-statistics/updates (clojure.spec.alpha/and :portkey.aws.dms/long))
(clojure.spec.alpha/def :portkey.aws.dms.table-statistics/schema-name (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms/table-statistics (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.table-statistics/deletes :portkey.aws.dms.table-statistics/full-load-rows :portkey.aws.dms.table-statistics/validation-state-details :portkey.aws.dms.table-statistics/table-state :portkey.aws.dms.table-statistics/inserts :portkey.aws.dms.table-statistics/full-load-condtnl-chk-failed-rows :portkey.aws.dms.table-statistics/validation-pending-records :portkey.aws.dms.table-statistics/validation-suspended-records :portkey.aws.dms.table-statistics/validation-state :portkey.aws.dms.table-statistics/full-load-error-rows :portkey.aws.dms.table-statistics/validation-failed-records :portkey.aws.dms.table-statistics/table-name :portkey.aws.dms.table-statistics/last-update-time :portkey.aws.dms.table-statistics/ddls :portkey.aws.dms.table-statistics/updates :portkey.aws.dms.table-statistics/schema-name]))

(clojure.spec.alpha/def :portkey.aws.dms.describe-certificates-response/marker (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.describe-certificates-response/certificates (clojure.spec.alpha/and :portkey.aws.dms/certificate-list))
(clojure.spec.alpha/def :portkey.aws.dms/describe-certificates-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dms.describe-certificates-response/marker :portkey.aws.dms.describe-certificates-response/certificates]))

(clojure.spec.alpha/def :portkey.aws.dms.start-replication-task-message/replication-task-arn (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.start-replication-task-message/start-replication-task-type (clojure.spec.alpha/and :portkey.aws.dms/start-replication-task-type-value))
(clojure.spec.alpha/def :portkey.aws.dms.start-replication-task-message/cdc-start-time (clojure.spec.alpha/and :portkey.aws.dms/t-stamp))
(clojure.spec.alpha/def :portkey.aws.dms.start-replication-task-message/cdc-start-position (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.start-replication-task-message/cdc-stop-position (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms/start-replication-task-message (clojure.spec.alpha/keys :req-un [:portkey.aws.dms.start-replication-task-message/replication-task-arn :portkey.aws.dms.start-replication-task-message/start-replication-task-type] :opt-un [:portkey.aws.dms.start-replication-task-message/cdc-start-time :portkey.aws.dms.start-replication-task-message/cdc-start-position :portkey.aws.dms.start-replication-task-message/cdc-stop-position]))

(clojure.spec.alpha/def :portkey.aws.dms.modify-event-subscription-message/subscription-name (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.modify-event-subscription-message/sns-topic-arn (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.modify-event-subscription-message/source-type (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.modify-event-subscription-message/event-categories (clojure.spec.alpha/and :portkey.aws.dms/event-categories-list))
(clojure.spec.alpha/def :portkey.aws.dms.modify-event-subscription-message/enabled (clojure.spec.alpha/and :portkey.aws.dms/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.dms/modify-event-subscription-message (clojure.spec.alpha/keys :req-un [:portkey.aws.dms.modify-event-subscription-message/subscription-name] :opt-un [:portkey.aws.dms.modify-event-subscription-message/sns-topic-arn :portkey.aws.dms.modify-event-subscription-message/source-type :portkey.aws.dms.modify-event-subscription-message/event-categories :portkey.aws.dms.modify-event-subscription-message/enabled]))

(clojure.spec.alpha/def :portkey.aws.dms/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.dms.modify-endpoint-message/username (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.modify-endpoint-message/engine-name (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.modify-endpoint-message/password (clojure.spec.alpha/and :portkey.aws.dms/secret-string))
(clojure.spec.alpha/def :portkey.aws.dms.modify-endpoint-message/database-name (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.modify-endpoint-message/extra-connection-attributes (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.modify-endpoint-message/endpoint-identifier (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.modify-endpoint-message/endpoint-type (clojure.spec.alpha/and :portkey.aws.dms/replication-endpoint-type-value))
(clojure.spec.alpha/def :portkey.aws.dms.modify-endpoint-message/service-access-role-arn (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.modify-endpoint-message/external-table-definition (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.modify-endpoint-message/port (clojure.spec.alpha/and :portkey.aws.dms/integer-optional))
(clojure.spec.alpha/def :portkey.aws.dms.modify-endpoint-message/ssl-mode (clojure.spec.alpha/and :portkey.aws.dms/dms-ssl-mode-value))
(clojure.spec.alpha/def :portkey.aws.dms.modify-endpoint-message/certificate-arn (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.modify-endpoint-message/server-name (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms.modify-endpoint-message/endpoint-arn (clojure.spec.alpha/and :portkey.aws.dms/string))
(clojure.spec.alpha/def :portkey.aws.dms/modify-endpoint-message (clojure.spec.alpha/keys :req-un [:portkey.aws.dms.modify-endpoint-message/endpoint-arn] :opt-un [:portkey.aws.dms.modify-endpoint-message/username :portkey.aws.dms/s-3-settings :portkey.aws.dms/dms-transfer-settings :portkey.aws.dms.modify-endpoint-message/engine-name :portkey.aws.dms.modify-endpoint-message/password :portkey.aws.dms.modify-endpoint-message/database-name :portkey.aws.dms.modify-endpoint-message/extra-connection-attributes :portkey.aws.dms.modify-endpoint-message/endpoint-identifier :portkey.aws.dms.modify-endpoint-message/endpoint-type :portkey.aws.dms.modify-endpoint-message/service-access-role-arn :portkey.aws.dms.modify-endpoint-message/external-table-definition :portkey.aws.dms/mongo-db-settings :portkey.aws.dms.modify-endpoint-message/port :portkey.aws.dms.modify-endpoint-message/ssl-mode :portkey.aws.dms/dynamo-db-settings :portkey.aws.dms.modify-endpoint-message/certificate-arn :portkey.aws.dms.modify-endpoint-message/server-name]))

(clojure.core/defn describe-endpoints ([] (describe-endpoints {})) ([describe-endpoints-messageinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-endpoints-message describe-endpoints-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.dms/endpoints, :http.request.configuration/target-prefix "AmazonDMSv20160101", :http.request.spec/output-spec :portkey.aws.dms/describe-endpoints-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-01-01", :http.request.configuration/service-id "Database Migration Service", :http.request.spec/input-spec :portkey.aws.dms/describe-endpoints-message, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeEndpoints", :http.request.configuration/output-deser-fn deser-describe-endpoints-response, :http.request.spec/error-spec {"ResourceNotFoundFault" :portkey.aws.dms/resource-not-found-fault}})))))
(clojure.spec.alpha/fdef describe-endpoints :args (clojure.spec.alpha/? :portkey.aws.dms/describe-endpoints-message) :ret (clojure.spec.alpha/and :portkey.aws.dms/describe-endpoints-response))

(clojure.core/defn modify-replication-instance ([modify-replication-instance-messageinput] (clojure.core/let [request-function-result__28581__auto__ (req-modify-replication-instance-message modify-replication-instance-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.dms/endpoints, :http.request.configuration/target-prefix "AmazonDMSv20160101", :http.request.spec/output-spec :portkey.aws.dms/modify-replication-instance-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-01-01", :http.request.configuration/service-id "Database Migration Service", :http.request.spec/input-spec :portkey.aws.dms/modify-replication-instance-message, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ModifyReplicationInstance", :http.request.configuration/output-deser-fn deser-modify-replication-instance-response, :http.request.spec/error-spec {"InvalidResourceStateFault" :portkey.aws.dms/invalid-resource-state-fault, "ResourceAlreadyExistsFault" :portkey.aws.dms/resource-already-exists-fault, "ResourceNotFoundFault" :portkey.aws.dms/resource-not-found-fault, "InsufficientResourceCapacityFault" :portkey.aws.dms/insufficient-resource-capacity-fault, "StorageQuotaExceededFault" :portkey.aws.dms/storage-quota-exceeded-fault, "UpgradeDependencyFailureFault" :portkey.aws.dms/upgrade-dependency-failure-fault}})))))
(clojure.spec.alpha/fdef modify-replication-instance :args (clojure.spec.alpha/tuple :portkey.aws.dms/modify-replication-instance-message) :ret (clojure.spec.alpha/and :portkey.aws.dms/modify-replication-instance-response))

(clojure.core/defn import-certificate ([import-certificate-messageinput] (clojure.core/let [request-function-result__28581__auto__ (req-import-certificate-message import-certificate-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.dms/endpoints, :http.request.configuration/target-prefix "AmazonDMSv20160101", :http.request.spec/output-spec :portkey.aws.dms/import-certificate-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-01-01", :http.request.configuration/service-id "Database Migration Service", :http.request.spec/input-spec :portkey.aws.dms/import-certificate-message, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ImportCertificate", :http.request.configuration/output-deser-fn deser-import-certificate-response, :http.request.spec/error-spec {"ResourceAlreadyExistsFault" :portkey.aws.dms/resource-already-exists-fault, "InvalidCertificateFault" :portkey.aws.dms/invalid-certificate-fault, "ResourceQuotaExceededFault" :portkey.aws.dms/resource-quota-exceeded-fault}})))))
(clojure.spec.alpha/fdef import-certificate :args (clojure.spec.alpha/tuple :portkey.aws.dms/import-certificate-message) :ret (clojure.spec.alpha/and :portkey.aws.dms/import-certificate-response))

(clojure.core/defn describe-schemas ([describe-schemas-messageinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-schemas-message describe-schemas-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.dms/endpoints, :http.request.configuration/target-prefix "AmazonDMSv20160101", :http.request.spec/output-spec :portkey.aws.dms/describe-schemas-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-01-01", :http.request.configuration/service-id "Database Migration Service", :http.request.spec/input-spec :portkey.aws.dms/describe-schemas-message, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeSchemas", :http.request.configuration/output-deser-fn deser-describe-schemas-response, :http.request.spec/error-spec {"InvalidResourceStateFault" :portkey.aws.dms/invalid-resource-state-fault, "ResourceNotFoundFault" :portkey.aws.dms/resource-not-found-fault}})))))
(clojure.spec.alpha/fdef describe-schemas :args (clojure.spec.alpha/tuple :portkey.aws.dms/describe-schemas-message) :ret (clojure.spec.alpha/and :portkey.aws.dms/describe-schemas-response))

(clojure.core/defn describe-replication-subnet-groups ([] (describe-replication-subnet-groups {})) ([describe-replication-subnet-groups-messageinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-replication-subnet-groups-message describe-replication-subnet-groups-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.dms/endpoints, :http.request.configuration/target-prefix "AmazonDMSv20160101", :http.request.spec/output-spec :portkey.aws.dms/describe-replication-subnet-groups-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-01-01", :http.request.configuration/service-id "Database Migration Service", :http.request.spec/input-spec :portkey.aws.dms/describe-replication-subnet-groups-message, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeReplicationSubnetGroups", :http.request.configuration/output-deser-fn deser-describe-replication-subnet-groups-response, :http.request.spec/error-spec {"ResourceNotFoundFault" :portkey.aws.dms/resource-not-found-fault}})))))
(clojure.spec.alpha/fdef describe-replication-subnet-groups :args (clojure.spec.alpha/? :portkey.aws.dms/describe-replication-subnet-groups-message) :ret (clojure.spec.alpha/and :portkey.aws.dms/describe-replication-subnet-groups-response))

(clojure.core/defn describe-events ([] (describe-events {})) ([describe-events-messageinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-events-message describe-events-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.dms/endpoints, :http.request.configuration/target-prefix "AmazonDMSv20160101", :http.request.spec/output-spec :portkey.aws.dms/describe-events-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-01-01", :http.request.configuration/service-id "Database Migration Service", :http.request.spec/input-spec :portkey.aws.dms/describe-events-message, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeEvents", :http.request.configuration/output-deser-fn deser-describe-events-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-events :args (clojure.spec.alpha/? :portkey.aws.dms/describe-events-message) :ret (clojure.spec.alpha/and :portkey.aws.dms/describe-events-response))

(clojure.core/defn create-replication-subnet-group ([create-replication-subnet-group-messageinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-replication-subnet-group-message create-replication-subnet-group-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.dms/endpoints, :http.request.configuration/target-prefix "AmazonDMSv20160101", :http.request.spec/output-spec :portkey.aws.dms/create-replication-subnet-group-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-01-01", :http.request.configuration/service-id "Database Migration Service", :http.request.spec/input-spec :portkey.aws.dms/create-replication-subnet-group-message, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateReplicationSubnetGroup", :http.request.configuration/output-deser-fn deser-create-replication-subnet-group-response, :http.request.spec/error-spec {"AccessDeniedFault" :portkey.aws.dms/access-denied-fault, "ResourceAlreadyExistsFault" :portkey.aws.dms/resource-already-exists-fault, "ResourceNotFoundFault" :portkey.aws.dms/resource-not-found-fault, "ResourceQuotaExceededFault" :portkey.aws.dms/resource-quota-exceeded-fault, "ReplicationSubnetGroupDoesNotCoverEnoughAZs" :portkey.aws.dms/replication-subnet-group-does-not-cover-enough-a-zs, "InvalidSubnet" :portkey.aws.dms/invalid-subnet}})))))
(clojure.spec.alpha/fdef create-replication-subnet-group :args (clojure.spec.alpha/tuple :portkey.aws.dms/create-replication-subnet-group-message) :ret (clojure.spec.alpha/and :portkey.aws.dms/create-replication-subnet-group-response))

(clojure.core/defn stop-replication-task ([stop-replication-task-messageinput] (clojure.core/let [request-function-result__28581__auto__ (req-stop-replication-task-message stop-replication-task-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.dms/endpoints, :http.request.configuration/target-prefix "AmazonDMSv20160101", :http.request.spec/output-spec :portkey.aws.dms/stop-replication-task-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-01-01", :http.request.configuration/service-id "Database Migration Service", :http.request.spec/input-spec :portkey.aws.dms/stop-replication-task-message, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StopReplicationTask", :http.request.configuration/output-deser-fn deser-stop-replication-task-response, :http.request.spec/error-spec {"ResourceNotFoundFault" :portkey.aws.dms/resource-not-found-fault, "InvalidResourceStateFault" :portkey.aws.dms/invalid-resource-state-fault}})))))
(clojure.spec.alpha/fdef stop-replication-task :args (clojure.spec.alpha/tuple :portkey.aws.dms/stop-replication-task-message) :ret (clojure.spec.alpha/and :portkey.aws.dms/stop-replication-task-response))

(clojure.core/defn create-replication-task ([create-replication-task-messageinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-replication-task-message create-replication-task-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.dms/endpoints, :http.request.configuration/target-prefix "AmazonDMSv20160101", :http.request.spec/output-spec :portkey.aws.dms/create-replication-task-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-01-01", :http.request.configuration/service-id "Database Migration Service", :http.request.spec/input-spec :portkey.aws.dms/create-replication-task-message, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateReplicationTask", :http.request.configuration/output-deser-fn deser-create-replication-task-response, :http.request.spec/error-spec {"AccessDeniedFault" :portkey.aws.dms/access-denied-fault, "InvalidResourceStateFault" :portkey.aws.dms/invalid-resource-state-fault, "ResourceAlreadyExistsFault" :portkey.aws.dms/resource-already-exists-fault, "ResourceNotFoundFault" :portkey.aws.dms/resource-not-found-fault, "KMSKeyNotAccessibleFault" :portkey.aws.dms/kms-key-not-accessible-fault, "ResourceQuotaExceededFault" :portkey.aws.dms/resource-quota-exceeded-fault}})))))
(clojure.spec.alpha/fdef create-replication-task :args (clojure.spec.alpha/tuple :portkey.aws.dms/create-replication-task-message) :ret (clojure.spec.alpha/and :portkey.aws.dms/create-replication-task-response))

(clojure.core/defn create-endpoint ([create-endpoint-messageinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-endpoint-message create-endpoint-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.dms/endpoints, :http.request.configuration/target-prefix "AmazonDMSv20160101", :http.request.spec/output-spec :portkey.aws.dms/create-endpoint-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-01-01", :http.request.configuration/service-id "Database Migration Service", :http.request.spec/input-spec :portkey.aws.dms/create-endpoint-message, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateEndpoint", :http.request.configuration/output-deser-fn deser-create-endpoint-response, :http.request.spec/error-spec {"KMSKeyNotAccessibleFault" :portkey.aws.dms/kms-key-not-accessible-fault, "ResourceAlreadyExistsFault" :portkey.aws.dms/resource-already-exists-fault, "ResourceQuotaExceededFault" :portkey.aws.dms/resource-quota-exceeded-fault, "InvalidResourceStateFault" :portkey.aws.dms/invalid-resource-state-fault, "ResourceNotFoundFault" :portkey.aws.dms/resource-not-found-fault, "AccessDeniedFault" :portkey.aws.dms/access-denied-fault}})))))
(clojure.spec.alpha/fdef create-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.dms/create-endpoint-message) :ret (clojure.spec.alpha/and :portkey.aws.dms/create-endpoint-response))

(clojure.core/defn describe-orderable-replication-instances ([] (describe-orderable-replication-instances {})) ([describe-orderable-replication-instances-messageinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-orderable-replication-instances-message describe-orderable-replication-instances-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.dms/endpoints, :http.request.configuration/target-prefix "AmazonDMSv20160101", :http.request.spec/output-spec :portkey.aws.dms/describe-orderable-replication-instances-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-01-01", :http.request.configuration/service-id "Database Migration Service", :http.request.spec/input-spec :portkey.aws.dms/describe-orderable-replication-instances-message, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeOrderableReplicationInstances", :http.request.configuration/output-deser-fn deser-describe-orderable-replication-instances-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-orderable-replication-instances :args (clojure.spec.alpha/? :portkey.aws.dms/describe-orderable-replication-instances-message) :ret (clojure.spec.alpha/and :portkey.aws.dms/describe-orderable-replication-instances-response))

(clojure.core/defn describe-replication-instance-task-logs ([describe-replication-instance-task-logs-messageinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-replication-instance-task-logs-message describe-replication-instance-task-logs-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.dms/endpoints, :http.request.configuration/target-prefix "AmazonDMSv20160101", :http.request.spec/output-spec :portkey.aws.dms/describe-replication-instance-task-logs-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-01-01", :http.request.configuration/service-id "Database Migration Service", :http.request.spec/input-spec :portkey.aws.dms/describe-replication-instance-task-logs-message, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeReplicationInstanceTaskLogs", :http.request.configuration/output-deser-fn deser-describe-replication-instance-task-logs-response, :http.request.spec/error-spec {"ResourceNotFoundFault" :portkey.aws.dms/resource-not-found-fault, "InvalidResourceStateFault" :portkey.aws.dms/invalid-resource-state-fault}})))))
(clojure.spec.alpha/fdef describe-replication-instance-task-logs :args (clojure.spec.alpha/tuple :portkey.aws.dms/describe-replication-instance-task-logs-message) :ret (clojure.spec.alpha/and :portkey.aws.dms/describe-replication-instance-task-logs-response))

(clojure.core/defn list-tags-for-resource ([list-tags-for-resource-messageinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-tags-for-resource-message list-tags-for-resource-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.dms/endpoints, :http.request.configuration/target-prefix "AmazonDMSv20160101", :http.request.spec/output-spec :portkey.aws.dms/list-tags-for-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-01-01", :http.request.configuration/service-id "Database Migration Service", :http.request.spec/input-spec :portkey.aws.dms/list-tags-for-resource-message, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTagsForResource", :http.request.configuration/output-deser-fn deser-list-tags-for-resource-response, :http.request.spec/error-spec {"ResourceNotFoundFault" :portkey.aws.dms/resource-not-found-fault}})))))
(clojure.spec.alpha/fdef list-tags-for-resource :args (clojure.spec.alpha/tuple :portkey.aws.dms/list-tags-for-resource-message) :ret (clojure.spec.alpha/and :portkey.aws.dms/list-tags-for-resource-response))

(clojure.core/defn describe-certificates ([] (describe-certificates {})) ([describe-certificates-messageinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-certificates-message describe-certificates-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.dms/endpoints, :http.request.configuration/target-prefix "AmazonDMSv20160101", :http.request.spec/output-spec :portkey.aws.dms/describe-certificates-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-01-01", :http.request.configuration/service-id "Database Migration Service", :http.request.spec/input-spec :portkey.aws.dms/describe-certificates-message, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeCertificates", :http.request.configuration/output-deser-fn deser-describe-certificates-response, :http.request.spec/error-spec {"ResourceNotFoundFault" :portkey.aws.dms/resource-not-found-fault}})))))
(clojure.spec.alpha/fdef describe-certificates :args (clojure.spec.alpha/? :portkey.aws.dms/describe-certificates-message) :ret (clojure.spec.alpha/and :portkey.aws.dms/describe-certificates-response))

(clojure.core/defn describe-replication-tasks ([] (describe-replication-tasks {})) ([describe-replication-tasks-messageinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-replication-tasks-message describe-replication-tasks-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.dms/endpoints, :http.request.configuration/target-prefix "AmazonDMSv20160101", :http.request.spec/output-spec :portkey.aws.dms/describe-replication-tasks-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-01-01", :http.request.configuration/service-id "Database Migration Service", :http.request.spec/input-spec :portkey.aws.dms/describe-replication-tasks-message, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeReplicationTasks", :http.request.configuration/output-deser-fn deser-describe-replication-tasks-response, :http.request.spec/error-spec {"ResourceNotFoundFault" :portkey.aws.dms/resource-not-found-fault}})))))
(clojure.spec.alpha/fdef describe-replication-tasks :args (clojure.spec.alpha/? :portkey.aws.dms/describe-replication-tasks-message) :ret (clojure.spec.alpha/and :portkey.aws.dms/describe-replication-tasks-response))

(clojure.core/defn modify-replication-task ([modify-replication-task-messageinput] (clojure.core/let [request-function-result__28581__auto__ (req-modify-replication-task-message modify-replication-task-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.dms/endpoints, :http.request.configuration/target-prefix "AmazonDMSv20160101", :http.request.spec/output-spec :portkey.aws.dms/modify-replication-task-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-01-01", :http.request.configuration/service-id "Database Migration Service", :http.request.spec/input-spec :portkey.aws.dms/modify-replication-task-message, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ModifyReplicationTask", :http.request.configuration/output-deser-fn deser-modify-replication-task-response, :http.request.spec/error-spec {"InvalidResourceStateFault" :portkey.aws.dms/invalid-resource-state-fault, "ResourceNotFoundFault" :portkey.aws.dms/resource-not-found-fault, "ResourceAlreadyExistsFault" :portkey.aws.dms/resource-already-exists-fault, "KMSKeyNotAccessibleFault" :portkey.aws.dms/kms-key-not-accessible-fault}})))))
(clojure.spec.alpha/fdef modify-replication-task :args (clojure.spec.alpha/tuple :portkey.aws.dms/modify-replication-task-message) :ret (clojure.spec.alpha/and :portkey.aws.dms/modify-replication-task-response))

(clojure.core/defn start-replication-task-assessment ([start-replication-task-assessment-messageinput] (clojure.core/let [request-function-result__28581__auto__ (req-start-replication-task-assessment-message start-replication-task-assessment-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.dms/endpoints, :http.request.configuration/target-prefix "AmazonDMSv20160101", :http.request.spec/output-spec :portkey.aws.dms/start-replication-task-assessment-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-01-01", :http.request.configuration/service-id "Database Migration Service", :http.request.spec/input-spec :portkey.aws.dms/start-replication-task-assessment-message, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartReplicationTaskAssessment", :http.request.configuration/output-deser-fn deser-start-replication-task-assessment-response, :http.request.spec/error-spec {"InvalidResourceStateFault" :portkey.aws.dms/invalid-resource-state-fault, "ResourceNotFoundFault" :portkey.aws.dms/resource-not-found-fault}})))))
(clojure.spec.alpha/fdef start-replication-task-assessment :args (clojure.spec.alpha/tuple :portkey.aws.dms/start-replication-task-assessment-message) :ret (clojure.spec.alpha/and :portkey.aws.dms/start-replication-task-assessment-response))

(clojure.core/defn modify-replication-subnet-group ([modify-replication-subnet-group-messageinput] (clojure.core/let [request-function-result__28581__auto__ (req-modify-replication-subnet-group-message modify-replication-subnet-group-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.dms/endpoints, :http.request.configuration/target-prefix "AmazonDMSv20160101", :http.request.spec/output-spec :portkey.aws.dms/modify-replication-subnet-group-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-01-01", :http.request.configuration/service-id "Database Migration Service", :http.request.spec/input-spec :portkey.aws.dms/modify-replication-subnet-group-message, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ModifyReplicationSubnetGroup", :http.request.configuration/output-deser-fn deser-modify-replication-subnet-group-response, :http.request.spec/error-spec {"AccessDeniedFault" :portkey.aws.dms/access-denied-fault, "ResourceNotFoundFault" :portkey.aws.dms/resource-not-found-fault, "ResourceQuotaExceededFault" :portkey.aws.dms/resource-quota-exceeded-fault, "SubnetAlreadyInUse" :portkey.aws.dms/subnet-already-in-use, "ReplicationSubnetGroupDoesNotCoverEnoughAZs" :portkey.aws.dms/replication-subnet-group-does-not-cover-enough-a-zs, "InvalidSubnet" :portkey.aws.dms/invalid-subnet}})))))
(clojure.spec.alpha/fdef modify-replication-subnet-group :args (clojure.spec.alpha/tuple :portkey.aws.dms/modify-replication-subnet-group-message) :ret (clojure.spec.alpha/and :portkey.aws.dms/modify-replication-subnet-group-response))

(clojure.core/defn delete-replication-subnet-group ([delete-replication-subnet-group-messageinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-replication-subnet-group-message delete-replication-subnet-group-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.dms/endpoints, :http.request.configuration/target-prefix "AmazonDMSv20160101", :http.request.spec/output-spec :portkey.aws.dms/delete-replication-subnet-group-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-01-01", :http.request.configuration/service-id "Database Migration Service", :http.request.spec/input-spec :portkey.aws.dms/delete-replication-subnet-group-message, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteReplicationSubnetGroup", :http.request.configuration/output-deser-fn deser-delete-replication-subnet-group-response, :http.request.spec/error-spec {"InvalidResourceStateFault" :portkey.aws.dms/invalid-resource-state-fault, "ResourceNotFoundFault" :portkey.aws.dms/resource-not-found-fault}})))))
(clojure.spec.alpha/fdef delete-replication-subnet-group :args (clojure.spec.alpha/tuple :portkey.aws.dms/delete-replication-subnet-group-message) :ret (clojure.spec.alpha/and :portkey.aws.dms/delete-replication-subnet-group-response))

(clojure.core/defn refresh-schemas ([refresh-schemas-messageinput] (clojure.core/let [request-function-result__28581__auto__ (req-refresh-schemas-message refresh-schemas-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.dms/endpoints, :http.request.configuration/target-prefix "AmazonDMSv20160101", :http.request.spec/output-spec :portkey.aws.dms/refresh-schemas-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-01-01", :http.request.configuration/service-id "Database Migration Service", :http.request.spec/input-spec :portkey.aws.dms/refresh-schemas-message, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RefreshSchemas", :http.request.configuration/output-deser-fn deser-refresh-schemas-response, :http.request.spec/error-spec {"InvalidResourceStateFault" :portkey.aws.dms/invalid-resource-state-fault, "ResourceNotFoundFault" :portkey.aws.dms/resource-not-found-fault, "KMSKeyNotAccessibleFault" :portkey.aws.dms/kms-key-not-accessible-fault, "ResourceQuotaExceededFault" :portkey.aws.dms/resource-quota-exceeded-fault}})))))
(clojure.spec.alpha/fdef refresh-schemas :args (clojure.spec.alpha/tuple :portkey.aws.dms/refresh-schemas-message) :ret (clojure.spec.alpha/and :portkey.aws.dms/refresh-schemas-response))

(clojure.core/defn start-replication-task ([start-replication-task-messageinput] (clojure.core/let [request-function-result__28581__auto__ (req-start-replication-task-message start-replication-task-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.dms/endpoints, :http.request.configuration/target-prefix "AmazonDMSv20160101", :http.request.spec/output-spec :portkey.aws.dms/start-replication-task-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-01-01", :http.request.configuration/service-id "Database Migration Service", :http.request.spec/input-spec :portkey.aws.dms/start-replication-task-message, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartReplicationTask", :http.request.configuration/output-deser-fn deser-start-replication-task-response, :http.request.spec/error-spec {"ResourceNotFoundFault" :portkey.aws.dms/resource-not-found-fault, "InvalidResourceStateFault" :portkey.aws.dms/invalid-resource-state-fault, "AccessDeniedFault" :portkey.aws.dms/access-denied-fault}})))))
(clojure.spec.alpha/fdef start-replication-task :args (clojure.spec.alpha/tuple :portkey.aws.dms/start-replication-task-message) :ret (clojure.spec.alpha/and :portkey.aws.dms/start-replication-task-response))

(clojure.core/defn delete-event-subscription ([delete-event-subscription-messageinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-event-subscription-message delete-event-subscription-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.dms/endpoints, :http.request.configuration/target-prefix "AmazonDMSv20160101", :http.request.spec/output-spec :portkey.aws.dms/delete-event-subscription-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-01-01", :http.request.configuration/service-id "Database Migration Service", :http.request.spec/input-spec :portkey.aws.dms/delete-event-subscription-message, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteEventSubscription", :http.request.configuration/output-deser-fn deser-delete-event-subscription-response, :http.request.spec/error-spec {"ResourceNotFoundFault" :portkey.aws.dms/resource-not-found-fault, "InvalidResourceStateFault" :portkey.aws.dms/invalid-resource-state-fault}})))))
(clojure.spec.alpha/fdef delete-event-subscription :args (clojure.spec.alpha/tuple :portkey.aws.dms/delete-event-subscription-message) :ret (clojure.spec.alpha/and :portkey.aws.dms/delete-event-subscription-response))

(clojure.core/defn delete-replication-instance ([delete-replication-instance-messageinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-replication-instance-message delete-replication-instance-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.dms/endpoints, :http.request.configuration/target-prefix "AmazonDMSv20160101", :http.request.spec/output-spec :portkey.aws.dms/delete-replication-instance-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-01-01", :http.request.configuration/service-id "Database Migration Service", :http.request.spec/input-spec :portkey.aws.dms/delete-replication-instance-message, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteReplicationInstance", :http.request.configuration/output-deser-fn deser-delete-replication-instance-response, :http.request.spec/error-spec {"InvalidResourceStateFault" :portkey.aws.dms/invalid-resource-state-fault, "ResourceNotFoundFault" :portkey.aws.dms/resource-not-found-fault}})))))
(clojure.spec.alpha/fdef delete-replication-instance :args (clojure.spec.alpha/tuple :portkey.aws.dms/delete-replication-instance-message) :ret (clojure.spec.alpha/and :portkey.aws.dms/delete-replication-instance-response))

(clojure.core/defn describe-refresh-schemas-status ([describe-refresh-schemas-status-messageinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-refresh-schemas-status-message describe-refresh-schemas-status-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.dms/endpoints, :http.request.configuration/target-prefix "AmazonDMSv20160101", :http.request.spec/output-spec :portkey.aws.dms/describe-refresh-schemas-status-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-01-01", :http.request.configuration/service-id "Database Migration Service", :http.request.spec/input-spec :portkey.aws.dms/describe-refresh-schemas-status-message, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeRefreshSchemasStatus", :http.request.configuration/output-deser-fn deser-describe-refresh-schemas-status-response, :http.request.spec/error-spec {"InvalidResourceStateFault" :portkey.aws.dms/invalid-resource-state-fault, "ResourceNotFoundFault" :portkey.aws.dms/resource-not-found-fault}})))))
(clojure.spec.alpha/fdef describe-refresh-schemas-status :args (clojure.spec.alpha/tuple :portkey.aws.dms/describe-refresh-schemas-status-message) :ret (clojure.spec.alpha/and :portkey.aws.dms/describe-refresh-schemas-status-response))

(clojure.core/defn describe-connections ([] (describe-connections {})) ([describe-connections-messageinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-connections-message describe-connections-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.dms/endpoints, :http.request.configuration/target-prefix "AmazonDMSv20160101", :http.request.spec/output-spec :portkey.aws.dms/describe-connections-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-01-01", :http.request.configuration/service-id "Database Migration Service", :http.request.spec/input-spec :portkey.aws.dms/describe-connections-message, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeConnections", :http.request.configuration/output-deser-fn deser-describe-connections-response, :http.request.spec/error-spec {"ResourceNotFoundFault" :portkey.aws.dms/resource-not-found-fault}})))))
(clojure.spec.alpha/fdef describe-connections :args (clojure.spec.alpha/? :portkey.aws.dms/describe-connections-message) :ret (clojure.spec.alpha/and :portkey.aws.dms/describe-connections-response))

(clojure.core/defn describe-event-categories ([] (describe-event-categories {})) ([describe-event-categories-messageinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-event-categories-message describe-event-categories-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.dms/endpoints, :http.request.configuration/target-prefix "AmazonDMSv20160101", :http.request.spec/output-spec :portkey.aws.dms/describe-event-categories-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-01-01", :http.request.configuration/service-id "Database Migration Service", :http.request.spec/input-spec :portkey.aws.dms/describe-event-categories-message, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeEventCategories", :http.request.configuration/output-deser-fn deser-describe-event-categories-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-event-categories :args (clojure.spec.alpha/? :portkey.aws.dms/describe-event-categories-message) :ret (clojure.spec.alpha/and :portkey.aws.dms/describe-event-categories-response))

(clojure.core/defn describe-account-attributes ([] (describe-account-attributes {})) ([describe-account-attributes-messageinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-account-attributes-message describe-account-attributes-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.dms/endpoints, :http.request.configuration/target-prefix "AmazonDMSv20160101", :http.request.spec/output-spec :portkey.aws.dms/describe-account-attributes-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-01-01", :http.request.configuration/service-id "Database Migration Service", :http.request.spec/input-spec :portkey.aws.dms/describe-account-attributes-message, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeAccountAttributes", :http.request.configuration/output-deser-fn deser-describe-account-attributes-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-account-attributes :args (clojure.spec.alpha/? :portkey.aws.dms/describe-account-attributes-message) :ret (clojure.spec.alpha/and :portkey.aws.dms/describe-account-attributes-response))

(clojure.core/defn reload-tables ([reload-tables-messageinput] (clojure.core/let [request-function-result__28581__auto__ (req-reload-tables-message reload-tables-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.dms/endpoints, :http.request.configuration/target-prefix "AmazonDMSv20160101", :http.request.spec/output-spec :portkey.aws.dms/reload-tables-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-01-01", :http.request.configuration/service-id "Database Migration Service", :http.request.spec/input-spec :portkey.aws.dms/reload-tables-message, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ReloadTables", :http.request.configuration/output-deser-fn deser-reload-tables-response, :http.request.spec/error-spec {"ResourceNotFoundFault" :portkey.aws.dms/resource-not-found-fault, "InvalidResourceStateFault" :portkey.aws.dms/invalid-resource-state-fault}})))))
(clojure.spec.alpha/fdef reload-tables :args (clojure.spec.alpha/tuple :portkey.aws.dms/reload-tables-message) :ret (clojure.spec.alpha/and :portkey.aws.dms/reload-tables-response))

(clojure.core/defn describe-replication-instances ([] (describe-replication-instances {})) ([describe-replication-instances-messageinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-replication-instances-message describe-replication-instances-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.dms/endpoints, :http.request.configuration/target-prefix "AmazonDMSv20160101", :http.request.spec/output-spec :portkey.aws.dms/describe-replication-instances-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-01-01", :http.request.configuration/service-id "Database Migration Service", :http.request.spec/input-spec :portkey.aws.dms/describe-replication-instances-message, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeReplicationInstances", :http.request.configuration/output-deser-fn deser-describe-replication-instances-response, :http.request.spec/error-spec {"ResourceNotFoundFault" :portkey.aws.dms/resource-not-found-fault}})))))
(clojure.spec.alpha/fdef describe-replication-instances :args (clojure.spec.alpha/? :portkey.aws.dms/describe-replication-instances-message) :ret (clojure.spec.alpha/and :portkey.aws.dms/describe-replication-instances-response))

(clojure.core/defn modify-event-subscription ([modify-event-subscription-messageinput] (clojure.core/let [request-function-result__28581__auto__ (req-modify-event-subscription-message modify-event-subscription-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.dms/endpoints, :http.request.configuration/target-prefix "AmazonDMSv20160101", :http.request.spec/output-spec :portkey.aws.dms/modify-event-subscription-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-01-01", :http.request.configuration/service-id "Database Migration Service", :http.request.spec/input-spec :portkey.aws.dms/modify-event-subscription-message, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ModifyEventSubscription", :http.request.configuration/output-deser-fn deser-modify-event-subscription-response, :http.request.spec/error-spec {"ResourceQuotaExceededFault" :portkey.aws.dms/resource-quota-exceeded-fault, "ResourceNotFoundFault" :portkey.aws.dms/resource-not-found-fault, "SNSInvalidTopicFault" :portkey.aws.dms/sns-invalid-topic-fault, "SNSNoAuthorizationFault" :portkey.aws.dms/sns-no-authorization-fault}})))))
(clojure.spec.alpha/fdef modify-event-subscription :args (clojure.spec.alpha/tuple :portkey.aws.dms/modify-event-subscription-message) :ret (clojure.spec.alpha/and :portkey.aws.dms/modify-event-subscription-response))

(clojure.core/defn modify-endpoint ([modify-endpoint-messageinput] (clojure.core/let [request-function-result__28581__auto__ (req-modify-endpoint-message modify-endpoint-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.dms/endpoints, :http.request.configuration/target-prefix "AmazonDMSv20160101", :http.request.spec/output-spec :portkey.aws.dms/modify-endpoint-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-01-01", :http.request.configuration/service-id "Database Migration Service", :http.request.spec/input-spec :portkey.aws.dms/modify-endpoint-message, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ModifyEndpoint", :http.request.configuration/output-deser-fn deser-modify-endpoint-response, :http.request.spec/error-spec {"InvalidResourceStateFault" :portkey.aws.dms/invalid-resource-state-fault, "ResourceNotFoundFault" :portkey.aws.dms/resource-not-found-fault, "ResourceAlreadyExistsFault" :portkey.aws.dms/resource-already-exists-fault, "KMSKeyNotAccessibleFault" :portkey.aws.dms/kms-key-not-accessible-fault, "AccessDeniedFault" :portkey.aws.dms/access-denied-fault}})))))
(clojure.spec.alpha/fdef modify-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.dms/modify-endpoint-message) :ret (clojure.spec.alpha/and :portkey.aws.dms/modify-endpoint-response))

(clojure.core/defn describe-replication-task-assessment-results ([] (describe-replication-task-assessment-results {})) ([describe-replication-task-assessment-results-messageinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-replication-task-assessment-results-message describe-replication-task-assessment-results-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.dms/endpoints, :http.request.configuration/target-prefix "AmazonDMSv20160101", :http.request.spec/output-spec :portkey.aws.dms/describe-replication-task-assessment-results-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-01-01", :http.request.configuration/service-id "Database Migration Service", :http.request.spec/input-spec :portkey.aws.dms/describe-replication-task-assessment-results-message, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeReplicationTaskAssessmentResults", :http.request.configuration/output-deser-fn deser-describe-replication-task-assessment-results-response, :http.request.spec/error-spec {"ResourceNotFoundFault" :portkey.aws.dms/resource-not-found-fault}})))))
(clojure.spec.alpha/fdef describe-replication-task-assessment-results :args (clojure.spec.alpha/? :portkey.aws.dms/describe-replication-task-assessment-results-message) :ret (clojure.spec.alpha/and :portkey.aws.dms/describe-replication-task-assessment-results-response))

(clojure.core/defn create-event-subscription ([create-event-subscription-messageinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-event-subscription-message create-event-subscription-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.dms/endpoints, :http.request.configuration/target-prefix "AmazonDMSv20160101", :http.request.spec/output-spec :portkey.aws.dms/create-event-subscription-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-01-01", :http.request.configuration/service-id "Database Migration Service", :http.request.spec/input-spec :portkey.aws.dms/create-event-subscription-message, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateEventSubscription", :http.request.configuration/output-deser-fn deser-create-event-subscription-response, :http.request.spec/error-spec {"ResourceQuotaExceededFault" :portkey.aws.dms/resource-quota-exceeded-fault, "ResourceAlreadyExistsFault" :portkey.aws.dms/resource-already-exists-fault, "SNSInvalidTopicFault" :portkey.aws.dms/sns-invalid-topic-fault, "SNSNoAuthorizationFault" :portkey.aws.dms/sns-no-authorization-fault, "ResourceNotFoundFault" :portkey.aws.dms/resource-not-found-fault}})))))
(clojure.spec.alpha/fdef create-event-subscription :args (clojure.spec.alpha/tuple :portkey.aws.dms/create-event-subscription-message) :ret (clojure.spec.alpha/and :portkey.aws.dms/create-event-subscription-response))

(clojure.core/defn describe-endpoint-types ([] (describe-endpoint-types {})) ([describe-endpoint-types-messageinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-endpoint-types-message describe-endpoint-types-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.dms/endpoints, :http.request.configuration/target-prefix "AmazonDMSv20160101", :http.request.spec/output-spec :portkey.aws.dms/describe-endpoint-types-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-01-01", :http.request.configuration/service-id "Database Migration Service", :http.request.spec/input-spec :portkey.aws.dms/describe-endpoint-types-message, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeEndpointTypes", :http.request.configuration/output-deser-fn deser-describe-endpoint-types-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-endpoint-types :args (clojure.spec.alpha/? :portkey.aws.dms/describe-endpoint-types-message) :ret (clojure.spec.alpha/and :portkey.aws.dms/describe-endpoint-types-response))

(clojure.core/defn describe-table-statistics ([describe-table-statistics-messageinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-table-statistics-message describe-table-statistics-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.dms/endpoints, :http.request.configuration/target-prefix "AmazonDMSv20160101", :http.request.spec/output-spec :portkey.aws.dms/describe-table-statistics-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-01-01", :http.request.configuration/service-id "Database Migration Service", :http.request.spec/input-spec :portkey.aws.dms/describe-table-statistics-message, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeTableStatistics", :http.request.configuration/output-deser-fn deser-describe-table-statistics-response, :http.request.spec/error-spec {"ResourceNotFoundFault" :portkey.aws.dms/resource-not-found-fault, "InvalidResourceStateFault" :portkey.aws.dms/invalid-resource-state-fault}})))))
(clojure.spec.alpha/fdef describe-table-statistics :args (clojure.spec.alpha/tuple :portkey.aws.dms/describe-table-statistics-message) :ret (clojure.spec.alpha/and :portkey.aws.dms/describe-table-statistics-response))

(clojure.core/defn describe-event-subscriptions ([] (describe-event-subscriptions {})) ([describe-event-subscriptions-messageinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-event-subscriptions-message describe-event-subscriptions-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.dms/endpoints, :http.request.configuration/target-prefix "AmazonDMSv20160101", :http.request.spec/output-spec :portkey.aws.dms/describe-event-subscriptions-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-01-01", :http.request.configuration/service-id "Database Migration Service", :http.request.spec/input-spec :portkey.aws.dms/describe-event-subscriptions-message, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeEventSubscriptions", :http.request.configuration/output-deser-fn deser-describe-event-subscriptions-response, :http.request.spec/error-spec {"ResourceNotFoundFault" :portkey.aws.dms/resource-not-found-fault}})))))
(clojure.spec.alpha/fdef describe-event-subscriptions :args (clojure.spec.alpha/? :portkey.aws.dms/describe-event-subscriptions-message) :ret (clojure.spec.alpha/and :portkey.aws.dms/describe-event-subscriptions-response))

(clojure.core/defn remove-tags-from-resource ([remove-tags-from-resource-messageinput] (clojure.core/let [request-function-result__28581__auto__ (req-remove-tags-from-resource-message remove-tags-from-resource-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.dms/endpoints, :http.request.configuration/target-prefix "AmazonDMSv20160101", :http.request.spec/output-spec :portkey.aws.dms/remove-tags-from-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-01-01", :http.request.configuration/service-id "Database Migration Service", :http.request.spec/input-spec :portkey.aws.dms/remove-tags-from-resource-message, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RemoveTagsFromResource", :http.request.configuration/output-deser-fn deser-remove-tags-from-resource-response, :http.request.spec/error-spec {"ResourceNotFoundFault" :portkey.aws.dms/resource-not-found-fault}})))))
(clojure.spec.alpha/fdef remove-tags-from-resource :args (clojure.spec.alpha/tuple :portkey.aws.dms/remove-tags-from-resource-message) :ret (clojure.spec.alpha/and :portkey.aws.dms/remove-tags-from-resource-response))

(clojure.core/defn delete-replication-task ([delete-replication-task-messageinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-replication-task-message delete-replication-task-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.dms/endpoints, :http.request.configuration/target-prefix "AmazonDMSv20160101", :http.request.spec/output-spec :portkey.aws.dms/delete-replication-task-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-01-01", :http.request.configuration/service-id "Database Migration Service", :http.request.spec/input-spec :portkey.aws.dms/delete-replication-task-message, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteReplicationTask", :http.request.configuration/output-deser-fn deser-delete-replication-task-response, :http.request.spec/error-spec {"ResourceNotFoundFault" :portkey.aws.dms/resource-not-found-fault, "InvalidResourceStateFault" :portkey.aws.dms/invalid-resource-state-fault}})))))
(clojure.spec.alpha/fdef delete-replication-task :args (clojure.spec.alpha/tuple :portkey.aws.dms/delete-replication-task-message) :ret (clojure.spec.alpha/and :portkey.aws.dms/delete-replication-task-response))

(clojure.core/defn reboot-replication-instance ([reboot-replication-instance-messageinput] (clojure.core/let [request-function-result__28581__auto__ (req-reboot-replication-instance-message reboot-replication-instance-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.dms/endpoints, :http.request.configuration/target-prefix "AmazonDMSv20160101", :http.request.spec/output-spec :portkey.aws.dms/reboot-replication-instance-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-01-01", :http.request.configuration/service-id "Database Migration Service", :http.request.spec/input-spec :portkey.aws.dms/reboot-replication-instance-message, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RebootReplicationInstance", :http.request.configuration/output-deser-fn deser-reboot-replication-instance-response, :http.request.spec/error-spec {"ResourceNotFoundFault" :portkey.aws.dms/resource-not-found-fault, "InvalidResourceStateFault" :portkey.aws.dms/invalid-resource-state-fault}})))))
(clojure.spec.alpha/fdef reboot-replication-instance :args (clojure.spec.alpha/tuple :portkey.aws.dms/reboot-replication-instance-message) :ret (clojure.spec.alpha/and :portkey.aws.dms/reboot-replication-instance-response))

(clojure.core/defn delete-endpoint ([delete-endpoint-messageinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-endpoint-message delete-endpoint-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.dms/endpoints, :http.request.configuration/target-prefix "AmazonDMSv20160101", :http.request.spec/output-spec :portkey.aws.dms/delete-endpoint-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-01-01", :http.request.configuration/service-id "Database Migration Service", :http.request.spec/input-spec :portkey.aws.dms/delete-endpoint-message, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteEndpoint", :http.request.configuration/output-deser-fn deser-delete-endpoint-response, :http.request.spec/error-spec {"ResourceNotFoundFault" :portkey.aws.dms/resource-not-found-fault, "InvalidResourceStateFault" :portkey.aws.dms/invalid-resource-state-fault}})))))
(clojure.spec.alpha/fdef delete-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.dms/delete-endpoint-message) :ret (clojure.spec.alpha/and :portkey.aws.dms/delete-endpoint-response))

(clojure.core/defn delete-certificate ([delete-certificate-messageinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-certificate-message delete-certificate-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.dms/endpoints, :http.request.configuration/target-prefix "AmazonDMSv20160101", :http.request.spec/output-spec :portkey.aws.dms/delete-certificate-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-01-01", :http.request.configuration/service-id "Database Migration Service", :http.request.spec/input-spec :portkey.aws.dms/delete-certificate-message, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteCertificate", :http.request.configuration/output-deser-fn deser-delete-certificate-response, :http.request.spec/error-spec {"ResourceNotFoundFault" :portkey.aws.dms/resource-not-found-fault, "InvalidResourceStateFault" :portkey.aws.dms/invalid-resource-state-fault}})))))
(clojure.spec.alpha/fdef delete-certificate :args (clojure.spec.alpha/tuple :portkey.aws.dms/delete-certificate-message) :ret (clojure.spec.alpha/and :portkey.aws.dms/delete-certificate-response))

(clojure.core/defn add-tags-to-resource ([add-tags-to-resource-messageinput] (clojure.core/let [request-function-result__28581__auto__ (req-add-tags-to-resource-message add-tags-to-resource-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.dms/endpoints, :http.request.configuration/target-prefix "AmazonDMSv20160101", :http.request.spec/output-spec :portkey.aws.dms/add-tags-to-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-01-01", :http.request.configuration/service-id "Database Migration Service", :http.request.spec/input-spec :portkey.aws.dms/add-tags-to-resource-message, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AddTagsToResource", :http.request.configuration/output-deser-fn deser-add-tags-to-resource-response, :http.request.spec/error-spec {"ResourceNotFoundFault" :portkey.aws.dms/resource-not-found-fault}})))))
(clojure.spec.alpha/fdef add-tags-to-resource :args (clojure.spec.alpha/tuple :portkey.aws.dms/add-tags-to-resource-message) :ret (clojure.spec.alpha/and :portkey.aws.dms/add-tags-to-resource-response))

(clojure.core/defn test-connection ([test-connection-messageinput] (clojure.core/let [request-function-result__28581__auto__ (req-test-connection-message test-connection-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.dms/endpoints, :http.request.configuration/target-prefix "AmazonDMSv20160101", :http.request.spec/output-spec :portkey.aws.dms/test-connection-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-01-01", :http.request.configuration/service-id "Database Migration Service", :http.request.spec/input-spec :portkey.aws.dms/test-connection-message, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "TestConnection", :http.request.configuration/output-deser-fn deser-test-connection-response, :http.request.spec/error-spec {"ResourceNotFoundFault" :portkey.aws.dms/resource-not-found-fault, "InvalidResourceStateFault" :portkey.aws.dms/invalid-resource-state-fault, "KMSKeyNotAccessibleFault" :portkey.aws.dms/kms-key-not-accessible-fault, "ResourceQuotaExceededFault" :portkey.aws.dms/resource-quota-exceeded-fault}})))))
(clojure.spec.alpha/fdef test-connection :args (clojure.spec.alpha/tuple :portkey.aws.dms/test-connection-message) :ret (clojure.spec.alpha/and :portkey.aws.dms/test-connection-response))

(clojure.core/defn create-replication-instance ([create-replication-instance-messageinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-replication-instance-message create-replication-instance-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.dms/endpoints, :http.request.configuration/target-prefix "AmazonDMSv20160101", :http.request.spec/output-spec :portkey.aws.dms/create-replication-instance-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-01-01", :http.request.configuration/service-id "Database Migration Service", :http.request.spec/input-spec :portkey.aws.dms/create-replication-instance-message, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateReplicationInstance", :http.request.configuration/output-deser-fn deser-create-replication-instance-response, :http.request.spec/error-spec {"InsufficientResourceCapacityFault" :portkey.aws.dms/insufficient-resource-capacity-fault, "ResourceAlreadyExistsFault" :portkey.aws.dms/resource-already-exists-fault, "ReplicationSubnetGroupDoesNotCoverEnoughAZs" :portkey.aws.dms/replication-subnet-group-does-not-cover-enough-a-zs, "InvalidSubnet" :portkey.aws.dms/invalid-subnet, "ResourceNotFoundFault" :portkey.aws.dms/resource-not-found-fault, "AccessDeniedFault" :portkey.aws.dms/access-denied-fault, "InvalidResourceStateFault" :portkey.aws.dms/invalid-resource-state-fault, "KMSKeyNotAccessibleFault" :portkey.aws.dms/kms-key-not-accessible-fault, "ResourceQuotaExceededFault" :portkey.aws.dms/resource-quota-exceeded-fault, "StorageQuotaExceededFault" :portkey.aws.dms/storage-quota-exceeded-fault}})))))
(clojure.spec.alpha/fdef create-replication-instance :args (clojure.spec.alpha/tuple :portkey.aws.dms/create-replication-instance-message) :ret (clojure.spec.alpha/and :portkey.aws.dms/create-replication-instance-response))
