(ns portkey.aws.opsworks (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "opsworks", :region "ap-northeast-1"},
    :ssl-common-name "opsworks.ap-northeast-1.amazonaws.com",
    :endpoint "https://opsworks.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "opsworks", :region "eu-west-1"},
    :ssl-common-name "opsworks.eu-west-1.amazonaws.com",
    :endpoint "https://opsworks.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "opsworks", :region "us-east-2"},
    :ssl-common-name "opsworks.us-east-2.amazonaws.com",
    :endpoint "https://opsworks.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "opsworks", :region "ap-southeast-2"},
    :ssl-common-name "opsworks.ap-southeast-2.amazonaws.com",
    :endpoint "https://opsworks.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "opsworks", :region "sa-east-1"},
    :ssl-common-name "opsworks.sa-east-1.amazonaws.com",
    :endpoint "https://opsworks.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "opsworks", :region "ap-southeast-1"},
    :ssl-common-name "opsworks.ap-southeast-1.amazonaws.com",
    :endpoint "https://opsworks.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "opsworks", :region "ap-northeast-2"},
    :ssl-common-name "opsworks.ap-northeast-2.amazonaws.com",
    :endpoint "https://opsworks.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "opsworks", :region "eu-west-3"},
    :ssl-common-name "opsworks.eu-west-3.amazonaws.com",
    :endpoint "https://opsworks.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "opsworks", :region "ca-central-1"},
    :ssl-common-name "opsworks.ca-central-1.amazonaws.com",
    :endpoint "https://opsworks.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "opsworks", :region "eu-central-1"},
    :ssl-common-name "opsworks.eu-central-1.amazonaws.com",
    :endpoint "https://opsworks.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "opsworks", :region "eu-west-2"},
    :ssl-common-name "opsworks.eu-west-2.amazonaws.com",
    :endpoint "https://opsworks.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "opsworks", :region "us-west-2"},
    :ssl-common-name "opsworks.us-west-2.amazonaws.com",
    :endpoint "https://opsworks.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "opsworks", :region "us-east-1"},
    :ssl-common-name "opsworks.us-east-1.amazonaws.com",
    :endpoint "https://opsworks.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "opsworks", :region "us-west-1"},
    :ssl-common-name "opsworks.us-west-1.amazonaws.com",
    :endpoint "https://opsworks.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "opsworks", :region "ap-south-1"},
    :ssl-common-name "opsworks.ap-south-1.amazonaws.com",
    :endpoint "https://opsworks.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-tag-keys)

(clojure.core/declare ser-app-type)

(clojure.core/declare ser-switch)

(clojure.core/declare ser-recipes)

(clojure.core/declare ser-double)

(clojure.core/declare ser-ebs-block-device)

(clojure.core/declare ser-source)

(clojure.core/declare ser-shutdown-event-configuration)

(clojure.core/declare ser-root-device-type)

(clojure.core/declare ser-environment-variables)

(clojure.core/declare ser-chef-configuration)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-tags)

(clojure.core/declare ser-source-type)

(clojure.core/declare ser-valid-for-in-minutes)

(clojure.core/declare ser-strings)

(clojure.core/declare ser-lifecycle-event-configuration)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-minute)

(clojure.core/declare ser-deployment-command-args)

(clojure.core/declare ser-cloud-watch-logs-configuration)

(clojure.core/declare ser-daily-auto-scaling-schedule)

(clojure.core/declare ser-data-sources)

(clojure.core/declare ser-hour)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-environment-variable)

(clojure.core/declare ser-ssl-configuration)

(clojure.core/declare ser-cloud-watch-logs-encoding)

(clojure.core/declare ser-stack-attributes)

(clojure.core/declare ser-cloud-watch-logs-log-streams)

(clojure.core/declare ser-stack-attributes-keys)

(clojure.core/declare ser-layer-attributes-keys)

(clojure.core/declare ser-integer)

(clojure.core/declare ser-string)

(clojure.core/declare ser-data-source)

(clojure.core/declare ser-instance-identity)

(clojure.core/declare ser-volume-type)

(clojure.core/declare ser-cloud-watch-logs-initial-position)

(clojure.core/declare ser-app-attributes)

(clojure.core/declare ser-block-device-mappings)

(clojure.core/declare ser-architecture)

(clojure.core/declare ser-stack-configuration-manager)

(clojure.core/declare ser-auto-scaling-thresholds)

(clojure.core/declare ser-layer-type)

(clojure.core/declare ser-resource-arn)

(clojure.core/declare ser-block-device-mapping)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-weekly-auto-scaling-schedule)

(clojure.core/declare ser-volume-configuration)

(clojure.core/declare ser-volume-configurations)

(clojure.core/declare ser-auto-scaling-type)

(clojure.core/declare ser-deployment-command)

(clojure.core/declare ser-cloud-watch-logs-time-zone)

(clojure.core/declare ser-layer-attributes)

(clojure.core/declare ser-app-attributes-keys)

(clojure.core/declare ser-deployment-command-name)

(clojure.core/declare ser-cloud-watch-logs-log-stream)

(clojure.core/declare ser-boolean)

(clojure.core/defn- ser-tag-keys [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-key coll) #:http.request.field{:shape "TagKey"}))) input), :shape "TagKeys", :type "list"})

(clojure.core/defn- ser-app-type [input] #:http.request.field{:value (clojure.core/get {"static" "static", :other "other", :static "static", "java" "java", :nodejs "nodejs", "php" "php", :java "java", "other" "other", "aws-flow-ruby" "aws-flow-ruby", :php "php", :rails "rails", :awsflowruby "aws-flow-ruby", "rails" "rails", "nodejs" "nodejs"} input), :shape "AppType"})

(clojure.core/defn- ser-switch [input] #:http.request.field{:value input, :shape "Switch"})

(clojure.core/defn- ser-recipes [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Recipes", :type "structure"} (clojure.core/contains? input :setup) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-strings (input :setup)) #:http.request.field{:name "Setup", :shape "Strings"})) (clojure.core/contains? input :configure) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-strings (input :configure)) #:http.request.field{:name "Configure", :shape "Strings"})) (clojure.core/contains? input :deploy) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-strings (input :deploy)) #:http.request.field{:name "Deploy", :shape "Strings"})) (clojure.core/contains? input :undeploy) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-strings (input :undeploy)) #:http.request.field{:name "Undeploy", :shape "Strings"})) (clojure.core/contains? input :shutdown) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-strings (input :shutdown)) #:http.request.field{:name "Shutdown", :shape "Strings"}))))

(clojure.core/defn- ser-double [input] #:http.request.field{:value input, :shape "Double"})

(clojure.core/defn- ser-ebs-block-device [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "EbsBlockDevice", :type "structure"} (clojure.core/contains? input :snapshot-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :snapshot-id)) #:http.request.field{:name "SnapshotId", :shape "String"})) (clojure.core/contains? input :iops) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :iops)) #:http.request.field{:name "Iops", :shape "Integer"})) (clojure.core/contains? input :volume-size) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :volume-size)) #:http.request.field{:name "VolumeSize", :shape "Integer"})) (clojure.core/contains? input :volume-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-volume-type (input :volume-type)) #:http.request.field{:name "VolumeType", :shape "VolumeType"})) (clojure.core/contains? input :delete-on-termination) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :delete-on-termination)) #:http.request.field{:name "DeleteOnTermination", :shape "Boolean"}))))

(clojure.core/defn- ser-source [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Source", :type "structure"} (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-source-type (input :type)) #:http.request.field{:name "Type", :shape "SourceType"})) (clojure.core/contains? input :url) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :url)) #:http.request.field{:name "Url", :shape "String"})) (clojure.core/contains? input :username) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :username)) #:http.request.field{:name "Username", :shape "String"})) (clojure.core/contains? input :password) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :password)) #:http.request.field{:name "Password", :shape "String"})) (clojure.core/contains? input :ssh-key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :ssh-key)) #:http.request.field{:name "SshKey", :shape "String"})) (clojure.core/contains? input :revision) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :revision)) #:http.request.field{:name "Revision", :shape "String"}))))

(clojure.core/defn- ser-shutdown-event-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ShutdownEventConfiguration", :type "structure"} (clojure.core/contains? input :execution-timeout) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :execution-timeout)) #:http.request.field{:name "ExecutionTimeout", :shape "Integer"})) (clojure.core/contains? input :delay-until-elb-connections-drained) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :delay-until-elb-connections-drained)) #:http.request.field{:name "DelayUntilElbConnectionsDrained", :shape "Boolean"}))))

(clojure.core/defn- ser-root-device-type [input] #:http.request.field{:value (clojure.core/get {"ebs" "ebs", :ebs "ebs", "instance-store" "instance-store", :instancestore "instance-store"} input), :shape "RootDeviceType"})

(clojure.core/defn- ser-environment-variables [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-environment-variable coll) #:http.request.field{:shape "EnvironmentVariable"}))) input), :shape "EnvironmentVariables", :type "list"})

(clojure.core/defn- ser-chef-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ChefConfiguration", :type "structure"} (clojure.core/contains? input :manage-berkshelf) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :manage-berkshelf)) #:http.request.field{:name "ManageBerkshelf", :shape "Boolean"})) (clojure.core/contains? input :berkshelf-version) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :berkshelf-version)) #:http.request.field{:name "BerkshelfVersion", :shape "String"}))))

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-tags [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-tag-key k) #:http.request.field{:map-info "key", :shape "TagKey"}) (clojure.core/into (ser-tag-value v) #:http.request.field{:map-info "value", :shape "TagValue"})])) input), :shape "Tags", :type "map"})

(clojure.core/defn- ser-source-type [input] #:http.request.field{:value (clojure.core/get {"git" "git", :git "git", "svn" "svn", :svn "svn", "archive" "archive", :archive "archive", "s3" "s3", :s-3 "s3"} input), :shape "SourceType"})

(clojure.core/defn- ser-valid-for-in-minutes [input] #:http.request.field{:value input, :shape "ValidForInMinutes"})

(clojure.core/defn- ser-strings [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String"}))) input), :shape "Strings", :type "list"})

(clojure.core/defn- ser-lifecycle-event-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "LifecycleEventConfiguration", :type "structure"} (clojure.core/contains? input :shutdown) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-shutdown-event-configuration (input :shutdown)) #:http.request.field{:name "Shutdown", :shape "ShutdownEventConfiguration"}))))

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-minute [input] #:http.request.field{:value input, :shape "Minute"})

(clojure.core/defn- ser-deployment-command-args [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-string k) #:http.request.field{:map-info "key", :shape "String"}) (clojure.core/into (ser-strings v) #:http.request.field{:map-info "value", :shape "Strings"})])) input), :shape "DeploymentCommandArgs", :type "map"})

(clojure.core/defn- ser-cloud-watch-logs-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "CloudWatchLogsConfiguration", :type "structure"} (clojure.core/contains? input :enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :enabled)) #:http.request.field{:name "Enabled", :shape "Boolean"})) (clojure.core/contains? input :log-streams) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cloud-watch-logs-log-streams (input :log-streams)) #:http.request.field{:name "LogStreams", :shape "CloudWatchLogsLogStreams"}))))

(clojure.core/defn- ser-daily-auto-scaling-schedule [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-hour k) #:http.request.field{:map-info "key", :shape "Hour"}) (clojure.core/into (ser-switch v) #:http.request.field{:map-info "value", :shape "Switch"})])) input), :shape "DailyAutoScalingSchedule", :type "map"})

(clojure.core/defn- ser-data-sources [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-data-source coll) #:http.request.field{:shape "DataSource"}))) input), :shape "DataSources", :type "list"})

(clojure.core/defn- ser-hour [input] #:http.request.field{:value input, :shape "Hour"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-environment-variable [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:key input)) #:http.request.field{:name "Key", :shape "String"}) (clojure.core/into (ser-string (:value input)) #:http.request.field{:name "Value", :shape "String"})], :shape "EnvironmentVariable", :type "structure"} (clojure.core/contains? input :secure) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :secure)) #:http.request.field{:name "Secure", :shape "Boolean"}))))

(clojure.core/defn- ser-ssl-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:certificate input)) #:http.request.field{:name "Certificate", :shape "String"}) (clojure.core/into (ser-string (:private-key input)) #:http.request.field{:name "PrivateKey", :shape "String"})], :shape "SslConfiguration", :type "structure"} (clojure.core/contains? input :chain) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :chain)) #:http.request.field{:name "Chain", :shape "String"}))))

(clojure.core/defn- ser-cloud-watch-logs-encoding [input] #:http.request.field{:value (clojure.core/get {:euc-kr "euc_kr", "johab" "johab", :cp-1251 "cp1251", "cp863" "cp863", :cp-866 "cp866", :cp-1258 "cp1258", "utf_16" "utf_16", :ascii "ascii", :iso-8859-14 "iso8859_14", "gb18030" "gb18030", :cp-1026 "cp1026", :cp-1255 "cp1255", "mac_latin2" "mac_latin2", "cp737" "cp737", :iso-8859-13 "iso8859_13", "ascii" "ascii", :koi-8-r "koi8_r", :cp-720 "cp720", :gb-2312 "gb2312", :iso-8859-15 "iso8859_15", :cp-424 "cp424", "utf_16_be" "utf_16_be", "iso8859_3" "iso8859_3", :cp-860 "cp860", "shift_jisx0213" "shift_jisx0213", "cp864" "cp864", "cp1255" "cp1255", :iso-8859-2 "iso8859_2", :cp-862 "cp862", "cp865" "cp865", :cp-1006 "cp1006", :iso-8859-3 "iso8859_3", "euc_jp" "euc_jp", "cp856" "cp856", "iso8859_15" "iso8859_15", "big5hkscs" "big5hkscs", "cp932" "cp932", :mac-iceland "mac_iceland", "cp850" "cp850", "shift_jis_2004" "shift_jis_2004", "cp424" "cp424", :utf-32 "utf_32", :cp-875 "cp875", :utf-16 "utf_16", :mac-greek "mac_greek", "iso8859_6" "iso8859_6", :euc-jisx-0213 "euc_jisx0213", :iso-8859-9 "iso8859_9", :iso-2022-jp-2004 "iso2022_jp_2004", "euc_jisx0213" "euc_jisx0213", :cp-932 "cp932", "cp720" "cp720", "mac_roman" "mac_roman", "cp1026" "cp1026", :iso-2022-jp-3 "iso2022_jp_3", "cp1250" "cp1250", :cp-1256 "cp1256", "cp874" "cp874", :shift-jis "shift_jis", :euc-jp "euc_jp", :iso-2022-jp "iso2022_jp", :cp-857 "cp857", :iso-8859-6 "iso8859_6", "cp1006" "cp1006", :mac-roman "mac_roman", :hz "hz", "iso8859_7" "iso8859_7", "cp869" "cp869", :iso-8859-7 "iso8859_7", :utf-7 "utf_7", :iso-8859-8 "iso8859_8", "iso8859_14" "iso8859_14", "iso2022_jp_2004" "iso2022_jp_2004", :cp-775 "cp775", "iso2022_kr" "iso2022_kr", "iso2022_jp_1" "iso2022_jp_1", "cp950" "cp950", :cp-864 "cp864", :big-5 "big5", :cp-874 "cp874", "cp500" "cp500", :cp-1250 "cp1250", "cp1254" "cp1254", "iso2022_jp_2" "iso2022_jp_2", "cp037" "cp037", "hz" "hz", :koi-8-u "koi8_u", :gbk "gbk", "iso2022_jp_3" "iso2022_jp_3", "iso2022_jp_ext" "iso2022_jp_ext", :cp-950 "cp950", "utf_32_le" "utf_32_le", :mac-latin-2 "mac_latin2", "iso8859_13" "iso8859_13", :cp-1140 "cp1140", "iso8859_5" "iso8859_5", :cp-850 "cp850", :shift-jisx-0213 "shift_jisx0213", :big-5hkscs "big5hkscs", :mac-cyrillic "mac_cyrillic", "cp852" "cp852", :utf-8 "utf_8", "cp1140" "cp1140", "mac_cyrillic" "mac_cyrillic", "cp861" "cp861", "big5" "big5", "cp949" "cp949", "mac_iceland" "mac_iceland", "euc_kr" "euc_kr", :cp-855 "cp855", "iso8859_10" "iso8859_10", :cp-437 "cp437", "iso8859_2" "iso8859_2", :iso-8859-10 "iso8859_10", "cp857" "cp857", "ptcp154" "ptcp154", "gb2312" "gb2312", :iso-2022-jp-1 "iso2022_jp_1", "cp862" "cp862", :latin-1 "latin_1", "utf_32_be" "utf_32_be", "iso8859_9" "iso8859_9", "cp437" "cp437", "iso8859_8" "iso8859_8", :cp-858 "cp858", :cp-1253 "cp1253", :cp-1257 "cp1257", "cp1251" "cp1251", "koi8_u" "koi8_u", :cp-861 "cp861", "iso8859_4" "iso8859_4", "utf_32" "utf_32", :gb-18030 "gb18030", :cp-737 "cp737", :cp-856 "cp856", :iso-2022-jp-ext "iso2022_jp_ext", :utf-8-sig "utf_8_sig", "shift_jis" "shift_jis", "cp1257" "cp1257", "cp1252" "cp1252", "iso8859_16" "iso8859_16", :cp-865 "cp865", "utf_16_le" "utf_16_le", :cp-037 "cp037", "latin_1" "latin_1", "utf_8" "utf_8", :iso-8859-5 "iso8859_5", "cp1256" "cp1256", "cp855" "cp855", :johab "johab", :utf-32-be "utf_32_be", "mac_turkish" "mac_turkish", :cp-949 "cp949", "euc_jis_2004" "euc_jis_2004", "cp1253" "cp1253", :ptcp-154 "ptcp154", "cp858" "cp858", :iso-8859-4 "iso8859_4", :euc-jis-2004 "euc_jis_2004", "mac_greek" "mac_greek", :iso-2022-jp-2 "iso2022_jp_2", "utf_7" "utf_7", :shift-jis-2004 "shift_jis_2004", :utf-16-be "utf_16_be", :cp-500 "cp500", :utf-16-le "utf_16_le", "cp866" "cp866", "cp860" "cp860", :mac-turkish "mac_turkish", "cp1258" "cp1258", :cp-852 "cp852", "cp875" "cp875", :cp-869 "cp869", :iso-2022-kr "iso2022_kr", "cp775" "cp775", :iso-8859-16 "iso8859_16", :utf-32-le "utf_32_le", :cp-1252 "cp1252", "koi8_r" "koi8_r", :cp-863 "cp863", "iso2022_jp" "iso2022_jp", :cp-1254 "cp1254", "gbk" "gbk", "utf_8_sig" "utf_8_sig"} input), :shape "CloudWatchLogsEncoding"})

(clojure.core/defn- ser-stack-attributes [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-stack-attributes-keys k) #:http.request.field{:map-info "key", :shape "StackAttributesKeys"}) (clojure.core/into (ser-string v) #:http.request.field{:map-info "value", :shape "String"})])) input), :shape "StackAttributes", :type "map"})

(clojure.core/defn- ser-cloud-watch-logs-log-streams [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-cloud-watch-logs-log-stream coll) #:http.request.field{:shape "CloudWatchLogsLogStream"}))) input), :shape "CloudWatchLogsLogStreams", :type "list"})

(clojure.core/defn- ser-stack-attributes-keys [input] #:http.request.field{:value (clojure.core/get {"Color" "Color", :color "Color"} input), :shape "StackAttributesKeys"})

(clojure.core/defn- ser-layer-attributes-keys [input] #:http.request.field{:value (clojure.core/get {:passenger-version "PassengerVersion", "JvmVersion" "JvmVersion", :enable-haproxy-stats "EnableHaproxyStats", "JavaAppServerVersion" "JavaAppServerVersion", "MysqlRootPassword" "MysqlRootPassword", "HaproxyHealthCheckUrl" "HaproxyHealthCheckUrl", :rails-stack "RailsStack", :ganglia-url "GangliaUrl", "MemcachedMemory" "MemcachedMemory", :haproxy-health-check-url "HaproxyHealthCheckUrl", :rubygems-version "RubygemsVersion", :jvm-version "JvmVersion", "HaproxyHealthCheckMethod" "HaproxyHealthCheckMethod", "RubyVersion" "RubyVersion", :haproxy-health-check-method "HaproxyHealthCheckMethod", :memcached-memory "MemcachedMemory", "GangliaUrl" "GangliaUrl", "HaproxyStatsPassword" "HaproxyStatsPassword", "BundlerVersion" "BundlerVersion", :java-app-server "JavaAppServer", "GangliaPassword" "GangliaPassword", "Jvm" "Jvm", :jvm-options "JvmOptions", "EnableHaproxyStats" "EnableHaproxyStats", "RailsStack" "RailsStack", "NodejsVersion" "NodejsVersion", :ganglia-password "GangliaPassword", "PassengerVersion" "PassengerVersion", :mysql-root-password "MysqlRootPassword", :jvm "Jvm", :manage-bundler "ManageBundler", :ruby-version "RubyVersion", "RubygemsVersion" "RubygemsVersion", "GangliaUser" "GangliaUser", :haproxy-stats-password "HaproxyStatsPassword", :bundler-version "BundlerVersion", :java-app-server-version "JavaAppServerVersion", :haproxy-stats-url "HaproxyStatsUrl", "EcsClusterArn" "EcsClusterArn", "HaproxyStatsUser" "HaproxyStatsUser", :ecs-cluster-arn "EcsClusterArn", :ganglia-user "GangliaUser", :mysql-root-password-ubiquitous "MysqlRootPasswordUbiquitous", :haproxy-stats-user "HaproxyStatsUser", "HaproxyStatsUrl" "HaproxyStatsUrl", "ManageBundler" "ManageBundler", "MysqlRootPasswordUbiquitous" "MysqlRootPasswordUbiquitous", "JvmOptions" "JvmOptions", "JavaAppServer" "JavaAppServer", :nodejs-version "NodejsVersion"} input), :shape "LayerAttributesKeys"})

(clojure.core/defn- ser-integer [input] #:http.request.field{:value input, :shape "Integer"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-data-source [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DataSource", :type "structure"} (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :type)) #:http.request.field{:name "Type", :shape "String"})) (clojure.core/contains? input :arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :arn)) #:http.request.field{:name "Arn", :shape "String"})) (clojure.core/contains? input :database-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :database-name)) #:http.request.field{:name "DatabaseName", :shape "String"}))))

(clojure.core/defn- ser-instance-identity [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "InstanceIdentity", :type "structure"} (clojure.core/contains? input :document) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :document)) #:http.request.field{:name "Document", :shape "String"})) (clojure.core/contains? input :signature) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :signature)) #:http.request.field{:name "Signature", :shape "String"}))))

(clojure.core/defn- ser-volume-type [input] #:http.request.field{:value (clojure.core/get {"gp2" "gp2", :gp-2 "gp2", "io1" "io1", :io-1 "io1", "standard" "standard", :standard "standard"} input), :shape "VolumeType"})

(clojure.core/defn- ser-cloud-watch-logs-initial-position [input] #:http.request.field{:value (clojure.core/get {"start_of_file" "start_of_file", :start-of-file "start_of_file", "end_of_file" "end_of_file", :end-of-file "end_of_file"} input), :shape "CloudWatchLogsInitialPosition"})

(clojure.core/defn- ser-app-attributes [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-app-attributes-keys k) #:http.request.field{:map-info "key", :shape "AppAttributesKeys"}) (clojure.core/into (ser-string v) #:http.request.field{:map-info "value", :shape "String"})])) input), :shape "AppAttributes", :type "map"})

(clojure.core/defn- ser-block-device-mappings [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-block-device-mapping coll) #:http.request.field{:shape "BlockDeviceMapping"}))) input), :shape "BlockDeviceMappings", :type "list"})

(clojure.core/defn- ser-architecture [input] #:http.request.field{:value (clojure.core/get {"x86_64" "x86_64", :x-86-64 "x86_64", "i386" "i386", :i-386 "i386"} input), :shape "Architecture"})

(clojure.core/defn- ser-stack-configuration-manager [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "StackConfigurationManager", :type "structure"} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "String"})) (clojure.core/contains? input :version) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :version)) #:http.request.field{:name "Version", :shape "String"}))))

(clojure.core/defn- ser-auto-scaling-thresholds [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AutoScalingThresholds", :type "structure"} (clojure.core/contains? input :instance-count) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :instance-count)) #:http.request.field{:name "InstanceCount", :shape "Integer"})) (clojure.core/contains? input :thresholds-wait-time) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-minute (input :thresholds-wait-time)) #:http.request.field{:name "ThresholdsWaitTime", :shape "Minute"})) (clojure.core/contains? input :ignore-metrics-time) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-minute (input :ignore-metrics-time)) #:http.request.field{:name "IgnoreMetricsTime", :shape "Minute"})) (clojure.core/contains? input :cpu-threshold) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-double (input :cpu-threshold)) #:http.request.field{:name "CpuThreshold", :shape "Double"})) (clojure.core/contains? input :memory-threshold) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-double (input :memory-threshold)) #:http.request.field{:name "MemoryThreshold", :shape "Double"})) (clojure.core/contains? input :load-threshold) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-double (input :load-threshold)) #:http.request.field{:name "LoadThreshold", :shape "Double"})) (clojure.core/contains? input :alarms) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-strings (input :alarms)) #:http.request.field{:name "Alarms", :shape "Strings"}))))

(clojure.core/defn- ser-layer-type [input] #:http.request.field{:value (clojure.core/get {:memcached "memcached", "memcached" "memcached", "monitoring-master" "monitoring-master", "custom" "custom", "web" "web", :phpapp "php-app", "db-master" "db-master", :monitoringmaster "monitoring-master", :dbmaster "db-master", :custom "custom", "rails-app" "rails-app", "php-app" "php-app", :javaapp "java-app", :nodejsapp "nodejs-app", :lb "lb", :railsapp "rails-app", "nodejs-app" "nodejs-app", "lb" "lb", "ecs-cluster" "ecs-cluster", "aws-flow-ruby" "aws-flow-ruby", "java-app" "java-app", :awsflowruby "aws-flow-ruby", :ecscluster "ecs-cluster", :web "web"} input), :shape "LayerType"})

(clojure.core/defn- ser-resource-arn [input] #:http.request.field{:value input, :shape "ResourceArn"})

(clojure.core/defn- ser-block-device-mapping [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "BlockDeviceMapping", :type "structure"} (clojure.core/contains? input :device-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :device-name)) #:http.request.field{:name "DeviceName", :shape "String"})) (clojure.core/contains? input :no-device) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :no-device)) #:http.request.field{:name "NoDevice", :shape "String"})) (clojure.core/contains? input :virtual-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :virtual-name)) #:http.request.field{:name "VirtualName", :shape "String"})) (clojure.core/contains? input :ebs) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ebs-block-device (input :ebs)) #:http.request.field{:name "Ebs", :shape "EbsBlockDevice"}))))

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-weekly-auto-scaling-schedule [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "WeeklyAutoScalingSchedule", :type "structure"} (clojure.core/contains? input :monday) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-daily-auto-scaling-schedule (input :monday)) #:http.request.field{:name "Monday", :shape "DailyAutoScalingSchedule"})) (clojure.core/contains? input :tuesday) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-daily-auto-scaling-schedule (input :tuesday)) #:http.request.field{:name "Tuesday", :shape "DailyAutoScalingSchedule"})) (clojure.core/contains? input :wednesday) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-daily-auto-scaling-schedule (input :wednesday)) #:http.request.field{:name "Wednesday", :shape "DailyAutoScalingSchedule"})) (clojure.core/contains? input :thursday) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-daily-auto-scaling-schedule (input :thursday)) #:http.request.field{:name "Thursday", :shape "DailyAutoScalingSchedule"})) (clojure.core/contains? input :friday) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-daily-auto-scaling-schedule (input :friday)) #:http.request.field{:name "Friday", :shape "DailyAutoScalingSchedule"})) (clojure.core/contains? input :saturday) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-daily-auto-scaling-schedule (input :saturday)) #:http.request.field{:name "Saturday", :shape "DailyAutoScalingSchedule"})) (clojure.core/contains? input :sunday) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-daily-auto-scaling-schedule (input :sunday)) #:http.request.field{:name "Sunday", :shape "DailyAutoScalingSchedule"}))))

(clojure.core/defn- ser-volume-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:mount-point input)) #:http.request.field{:name "MountPoint", :shape "String"}) (clojure.core/into (ser-integer (:number-of-disks input)) #:http.request.field{:name "NumberOfDisks", :shape "Integer"}) (clojure.core/into (ser-integer (:size input)) #:http.request.field{:name "Size", :shape "Integer"})], :shape "VolumeConfiguration", :type "structure"} (clojure.core/contains? input :raid-level) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :raid-level)) #:http.request.field{:name "RaidLevel", :shape "Integer"})) (clojure.core/contains? input :volume-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :volume-type)) #:http.request.field{:name "VolumeType", :shape "String"})) (clojure.core/contains? input :iops) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :iops)) #:http.request.field{:name "Iops", :shape "Integer"})) (clojure.core/contains? input :encrypted) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :encrypted)) #:http.request.field{:name "Encrypted", :shape "Boolean"}))))

(clojure.core/defn- ser-volume-configurations [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-volume-configuration coll) #:http.request.field{:shape "VolumeConfiguration"}))) input), :shape "VolumeConfigurations", :type "list"})

(clojure.core/defn- ser-auto-scaling-type [input] #:http.request.field{:value (clojure.core/get {"load" "load", :load "load", "timer" "timer", :timer "timer"} input), :shape "AutoScalingType"})

(clojure.core/defn- ser-deployment-command [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-deployment-command-name (:name input)) #:http.request.field{:name "Name", :shape "DeploymentCommandName"})], :shape "DeploymentCommand", :type "structure"} (clojure.core/contains? input :args) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-deployment-command-args (input :args)) #:http.request.field{:name "Args", :shape "DeploymentCommandArgs"}))))

(clojure.core/defn- ser-cloud-watch-logs-time-zone [input] #:http.request.field{:value (clojure.core/get {"LOCAL" "LOCAL", :local "LOCAL", "UTC" "UTC", :utc "UTC"} input), :shape "CloudWatchLogsTimeZone"})

(clojure.core/defn- ser-layer-attributes [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-layer-attributes-keys k) #:http.request.field{:map-info "key", :shape "LayerAttributesKeys"}) (clojure.core/into (ser-string v) #:http.request.field{:map-info "value", :shape "String"})])) input), :shape "LayerAttributes", :type "map"})

(clojure.core/defn- ser-app-attributes-keys [input] #:http.request.field{:value (clojure.core/get {"DocumentRoot" "DocumentRoot", :document-root "DocumentRoot", "RailsEnv" "RailsEnv", :rails-env "RailsEnv", "AutoBundleOnDeploy" "AutoBundleOnDeploy", :auto-bundle-on-deploy "AutoBundleOnDeploy", "AwsFlowRubySettings" "AwsFlowRubySettings", :aws-flow-ruby-settings "AwsFlowRubySettings"} input), :shape "AppAttributesKeys"})

(clojure.core/defn- ser-deployment-command-name [input] #:http.request.field{:value (clojure.core/get {:rollback "rollback", "stop" "stop", :undeploy "undeploy", "deploy" "deploy", "undeploy" "undeploy", :restart "restart", "update_custom_cookbooks" "update_custom_cookbooks", :execute-recipes "execute_recipes", :update-custom-cookbooks "update_custom_cookbooks", :update-dependencies "update_dependencies", "configure" "configure", :start "start", :setup "setup", "install_dependencies" "install_dependencies", :configure "configure", "start" "start", :stop "stop", "setup" "setup", "execute_recipes" "execute_recipes", "restart" "restart", :install-dependencies "install_dependencies", "rollback" "rollback", :deploy "deploy", "update_dependencies" "update_dependencies"} input), :shape "DeploymentCommandName"})

(clojure.core/defn- ser-cloud-watch-logs-log-stream [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "CloudWatchLogsLogStream", :type "structure"} (clojure.core/contains? input :batch-size) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :batch-size)) #:http.request.field{:name "BatchSize", :shape "Integer"})) (clojure.core/contains? input :encoding) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cloud-watch-logs-encoding (input :encoding)) #:http.request.field{:name "Encoding", :shape "CloudWatchLogsEncoding"})) (clojure.core/contains? input :initial-position) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cloud-watch-logs-initial-position (input :initial-position)) #:http.request.field{:name "InitialPosition", :shape "CloudWatchLogsInitialPosition"})) (clojure.core/contains? input :file) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :file)) #:http.request.field{:name "File", :shape "String"})) (clojure.core/contains? input :batch-count) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :batch-count)) #:http.request.field{:name "BatchCount", :shape "Integer"})) (clojure.core/contains? input :time-zone) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cloud-watch-logs-time-zone (input :time-zone)) #:http.request.field{:name "TimeZone", :shape "CloudWatchLogsTimeZone"})) (clojure.core/contains? input :multi-line-start-pattern) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :multi-line-start-pattern)) #:http.request.field{:name "MultiLineStartPattern", :shape "String"})) (clojure.core/contains? input :file-fingerprint-lines) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :file-fingerprint-lines)) #:http.request.field{:name "FileFingerprintLines", :shape "String"})) (clojure.core/contains? input :log-group-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :log-group-name)) #:http.request.field{:name "LogGroupName", :shape "String"})) (clojure.core/contains? input :buffer-duration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :buffer-duration)) #:http.request.field{:name "BufferDuration", :shape "Integer"})) (clojure.core/contains? input :datetime-format) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :datetime-format)) #:http.request.field{:name "DatetimeFormat", :shape "String"}))))

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "Boolean"})

(clojure.core/defn- req-describe-elastic-ips-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :instance-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "String"})) (clojure.core/contains? input :stack-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :stack-id)) #:http.request.field{:name "StackId", :shape "String"})) (clojure.core/contains? input :ips) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-strings (input :ips)) #:http.request.field{:name "Ips", :shape "Strings"}))))

(clojure.core/defn- req-register-instance-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :stack-id)) #:http.request.field{:name "StackId", :shape "String"})]} (clojure.core/contains? input :hostname) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :hostname)) #:http.request.field{:name "Hostname", :shape "String"})) (clojure.core/contains? input :public-ip) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :public-ip)) #:http.request.field{:name "PublicIp", :shape "String"})) (clojure.core/contains? input :private-ip) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :private-ip)) #:http.request.field{:name "PrivateIp", :shape "String"})) (clojure.core/contains? input :rsa-public-key) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :rsa-public-key)) #:http.request.field{:name "RsaPublicKey", :shape "String"})) (clojure.core/contains? input :rsa-public-key-fingerprint) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :rsa-public-key-fingerprint)) #:http.request.field{:name "RsaPublicKeyFingerprint", :shape "String"})) (clojure.core/contains? input :instance-identity) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instance-identity (input :instance-identity)) #:http.request.field{:name "InstanceIdentity", :shape "InstanceIdentity"}))))

(clojure.core/defn- req-set-load-based-auto-scaling-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :layer-id)) #:http.request.field{:name "LayerId", :shape "String"})]} (clojure.core/contains? input :enable) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :enable)) #:http.request.field{:name "Enable", :shape "Boolean"})) (clojure.core/contains? input :up-scaling) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-auto-scaling-thresholds (input :up-scaling)) #:http.request.field{:name "UpScaling", :shape "AutoScalingThresholds"})) (clojure.core/contains? input :down-scaling) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-auto-scaling-thresholds (input :down-scaling)) #:http.request.field{:name "DownScaling", :shape "AutoScalingThresholds"}))))

(clojure.core/defn- req-associate-elastic-ip-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :elastic-ip)) #:http.request.field{:name "ElasticIp", :shape "String"})]} (clojure.core/contains? input :instance-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "String"}))))

(clojure.core/defn- req-get-hostname-suggestion-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :layer-id)) #:http.request.field{:name "LayerId", :shape "String"})]}))

(clojure.core/defn- req-create-app-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :stack-id)) #:http.request.field{:name "StackId", :shape "String"}) (clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "String"}) (clojure.core/into (ser-app-type (input :type)) #:http.request.field{:name "Type", :shape "AppType"})]} (clojure.core/contains? input :shortname) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :shortname)) #:http.request.field{:name "Shortname", :shape "String"})) (clojure.core/contains? input :enable-ssl) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :enable-ssl)) #:http.request.field{:name "EnableSsl", :shape "Boolean"})) (clojure.core/contains? input :domains) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-strings (input :domains)) #:http.request.field{:name "Domains", :shape "Strings"})) (clojure.core/contains? input :app-source) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-source (input :app-source)) #:http.request.field{:name "AppSource", :shape "Source"})) (clojure.core/contains? input :attributes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-app-attributes (input :attributes)) #:http.request.field{:name "Attributes", :shape "AppAttributes"})) (clojure.core/contains? input :data-sources) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-data-sources (input :data-sources)) #:http.request.field{:name "DataSources", :shape "DataSources"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :description)) #:http.request.field{:name "Description", :shape "String"})) (clojure.core/contains? input :ssl-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ssl-configuration (input :ssl-configuration)) #:http.request.field{:name "SslConfiguration", :shape "SslConfiguration"})) (clojure.core/contains? input :environment) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-variables (input :environment)) #:http.request.field{:name "Environment", :shape "EnvironmentVariables"}))))

(clojure.core/defn- req-describe-load-based-auto-scaling-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-strings (input :layer-ids)) #:http.request.field{:name "LayerIds", :shape "Strings"})]}))

(clojure.core/defn- req-set-permission-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :stack-id)) #:http.request.field{:name "StackId", :shape "String"}) (clojure.core/into (ser-string (input :iam-user-arn)) #:http.request.field{:name "IamUserArn", :shape "String"})]} (clojure.core/contains? input :allow-ssh) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :allow-ssh)) #:http.request.field{:name "AllowSsh", :shape "Boolean"})) (clojure.core/contains? input :allow-sudo) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :allow-sudo)) #:http.request.field{:name "AllowSudo", :shape "Boolean"})) (clojure.core/contains? input :level) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :level)) #:http.request.field{:name "Level", :shape "String"}))))

(clojure.core/defn- req-update-app-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :app-id)) #:http.request.field{:name "AppId", :shape "String"})]} (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-app-type (input :type)) #:http.request.field{:name "Type", :shape "AppType"})) (clojure.core/contains? input :enable-ssl) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :enable-ssl)) #:http.request.field{:name "EnableSsl", :shape "Boolean"})) (clojure.core/contains? input :domains) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-strings (input :domains)) #:http.request.field{:name "Domains", :shape "Strings"})) (clojure.core/contains? input :app-source) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-source (input :app-source)) #:http.request.field{:name "AppSource", :shape "Source"})) (clojure.core/contains? input :attributes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-app-attributes (input :attributes)) #:http.request.field{:name "Attributes", :shape "AppAttributes"})) (clojure.core/contains? input :data-sources) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-data-sources (input :data-sources)) #:http.request.field{:name "DataSources", :shape "DataSources"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :description)) #:http.request.field{:name "Description", :shape "String"})) (clojure.core/contains? input :ssl-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ssl-configuration (input :ssl-configuration)) #:http.request.field{:name "SslConfiguration", :shape "SslConfiguration"})) (clojure.core/contains? input :environment) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-variables (input :environment)) #:http.request.field{:name "Environment", :shape "EnvironmentVariables"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "String"}))))

(clojure.core/defn- req-register-ecs-cluster-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :ecs-cluster-arn)) #:http.request.field{:name "EcsClusterArn", :shape "String"}) (clojure.core/into (ser-string (input :stack-id)) #:http.request.field{:name "StackId", :shape "String"})]}))

(clojure.core/defn- req-register-elastic-ip-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :elastic-ip)) #:http.request.field{:name "ElasticIp", :shape "String"}) (clojure.core/into (ser-string (input :stack-id)) #:http.request.field{:name "StackId", :shape "String"})]}))

(clojure.core/defn- req-delete-stack-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :stack-id)) #:http.request.field{:name "StackId", :shape "String"})]}))

(clojure.core/defn- req-set-time-based-auto-scaling-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "String"})]} (clojure.core/contains? input :auto-scaling-schedule) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-weekly-auto-scaling-schedule (input :auto-scaling-schedule)) #:http.request.field{:name "AutoScalingSchedule", :shape "WeeklyAutoScalingSchedule"}))))

(clojure.core/defn- req-describe-agent-versions-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :stack-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :stack-id)) #:http.request.field{:name "StackId", :shape "String"})) (clojure.core/contains? input :configuration-manager) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stack-configuration-manager (input :configuration-manager)) #:http.request.field{:name "ConfigurationManager", :shape "StackConfigurationManager"}))))

(clojure.core/defn- req-create-stack-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "String"}) (clojure.core/into (ser-string (input :region)) #:http.request.field{:name "Region", :shape "String"}) (clojure.core/into (ser-string (input :service-role-arn)) #:http.request.field{:name "ServiceRoleArn", :shape "String"}) (clojure.core/into (ser-string (input :default-instance-profile-arn)) #:http.request.field{:name "DefaultInstanceProfileArn", :shape "String"})]} (clojure.core/contains? input :custom-cookbooks-source) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-source (input :custom-cookbooks-source)) #:http.request.field{:name "CustomCookbooksSource", :shape "Source"})) (clojure.core/contains? input :hostname-theme) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :hostname-theme)) #:http.request.field{:name "HostnameTheme", :shape "String"})) (clojure.core/contains? input :default-ssh-key-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :default-ssh-key-name)) #:http.request.field{:name "DefaultSshKeyName", :shape "String"})) (clojure.core/contains? input :default-availability-zone) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :default-availability-zone)) #:http.request.field{:name "DefaultAvailabilityZone", :shape "String"})) (clojure.core/contains? input :chef-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-chef-configuration (input :chef-configuration)) #:http.request.field{:name "ChefConfiguration", :shape "ChefConfiguration"})) (clojure.core/contains? input :configuration-manager) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stack-configuration-manager (input :configuration-manager)) #:http.request.field{:name "ConfigurationManager", :shape "StackConfigurationManager"})) (clojure.core/contains? input :agent-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :agent-version)) #:http.request.field{:name "AgentVersion", :shape "String"})) (clojure.core/contains? input :use-opsworks-security-groups) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :use-opsworks-security-groups)) #:http.request.field{:name "UseOpsworksSecurityGroups", :shape "Boolean"})) (clojure.core/contains? input :attributes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stack-attributes (input :attributes)) #:http.request.field{:name "Attributes", :shape "StackAttributes"})) (clojure.core/contains? input :default-root-device-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-root-device-type (input :default-root-device-type)) #:http.request.field{:name "DefaultRootDeviceType", :shape "RootDeviceType"})) (clojure.core/contains? input :vpc-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :vpc-id)) #:http.request.field{:name "VpcId", :shape "String"})) (clojure.core/contains? input :use-custom-cookbooks) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :use-custom-cookbooks)) #:http.request.field{:name "UseCustomCookbooks", :shape "Boolean"})) (clojure.core/contains? input :custom-json) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :custom-json)) #:http.request.field{:name "CustomJson", :shape "String"})) (clojure.core/contains? input :default-subnet-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :default-subnet-id)) #:http.request.field{:name "DefaultSubnetId", :shape "String"})) (clojure.core/contains? input :default-os) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :default-os)) #:http.request.field{:name "DefaultOs", :shape "String"}))))

(clojure.core/defn- req-clone-stack-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :source-stack-id)) #:http.request.field{:name "SourceStackId", :shape "String"}) (clojure.core/into (ser-string (input :service-role-arn)) #:http.request.field{:name "ServiceRoleArn", :shape "String"})]} (clojure.core/contains? input :custom-cookbooks-source) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-source (input :custom-cookbooks-source)) #:http.request.field{:name "CustomCookbooksSource", :shape "Source"})) (clojure.core/contains? input :hostname-theme) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :hostname-theme)) #:http.request.field{:name "HostnameTheme", :shape "String"})) (clojure.core/contains? input :default-ssh-key-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :default-ssh-key-name)) #:http.request.field{:name "DefaultSshKeyName", :shape "String"})) (clojure.core/contains? input :default-availability-zone) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :default-availability-zone)) #:http.request.field{:name "DefaultAvailabilityZone", :shape "String"})) (clojure.core/contains? input :chef-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-chef-configuration (input :chef-configuration)) #:http.request.field{:name "ChefConfiguration", :shape "ChefConfiguration"})) (clojure.core/contains? input :configuration-manager) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stack-configuration-manager (input :configuration-manager)) #:http.request.field{:name "ConfigurationManager", :shape "StackConfigurationManager"})) (clojure.core/contains? input :agent-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :agent-version)) #:http.request.field{:name "AgentVersion", :shape "String"})) (clojure.core/contains? input :use-opsworks-security-groups) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :use-opsworks-security-groups)) #:http.request.field{:name "UseOpsworksSecurityGroups", :shape "Boolean"})) (clojure.core/contains? input :attributes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stack-attributes (input :attributes)) #:http.request.field{:name "Attributes", :shape "StackAttributes"})) (clojure.core/contains? input :default-root-device-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-root-device-type (input :default-root-device-type)) #:http.request.field{:name "DefaultRootDeviceType", :shape "RootDeviceType"})) (clojure.core/contains? input :vpc-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :vpc-id)) #:http.request.field{:name "VpcId", :shape "String"})) (clojure.core/contains? input :use-custom-cookbooks) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :use-custom-cookbooks)) #:http.request.field{:name "UseCustomCookbooks", :shape "Boolean"})) (clojure.core/contains? input :default-instance-profile-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :default-instance-profile-arn)) #:http.request.field{:name "DefaultInstanceProfileArn", :shape "String"})) (clojure.core/contains? input :custom-json) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :custom-json)) #:http.request.field{:name "CustomJson", :shape "String"})) (clojure.core/contains? input :default-subnet-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :default-subnet-id)) #:http.request.field{:name "DefaultSubnetId", :shape "String"})) (clojure.core/contains? input :clone-app-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-strings (input :clone-app-ids)) #:http.request.field{:name "CloneAppIds", :shape "Strings"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "String"})) (clojure.core/contains? input :region) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :region)) #:http.request.field{:name "Region", :shape "String"})) (clojure.core/contains? input :default-os) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :default-os)) #:http.request.field{:name "DefaultOs", :shape "String"})) (clojure.core/contains? input :clone-permissions) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :clone-permissions)) #:http.request.field{:name "ClonePermissions", :shape "Boolean"}))))

(clojure.core/defn- req-deregister-instance-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "String"})]}))

(clojure.core/defn- req-update-layer-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :layer-id)) #:http.request.field{:name "LayerId", :shape "String"})]} (clojure.core/contains? input :custom-recipes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-recipes (input :custom-recipes)) #:http.request.field{:name "CustomRecipes", :shape "Recipes"})) (clojure.core/contains? input :shortname) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :shortname)) #:http.request.field{:name "Shortname", :shape "String"})) (clojure.core/contains? input :custom-security-group-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-strings (input :custom-security-group-ids)) #:http.request.field{:name "CustomSecurityGroupIds", :shape "Strings"})) (clojure.core/contains? input :enable-auto-healing) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :enable-auto-healing)) #:http.request.field{:name "EnableAutoHealing", :shape "Boolean"})) (clojure.core/contains? input :use-ebs-optimized-instances) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :use-ebs-optimized-instances)) #:http.request.field{:name "UseEbsOptimizedInstances", :shape "Boolean"})) (clojure.core/contains? input :lifecycle-event-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lifecycle-event-configuration (input :lifecycle-event-configuration)) #:http.request.field{:name "LifecycleEventConfiguration", :shape "LifecycleEventConfiguration"})) (clojure.core/contains? input :auto-assign-public-ips) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :auto-assign-public-ips)) #:http.request.field{:name "AutoAssignPublicIps", :shape "Boolean"})) (clojure.core/contains? input :cloud-watch-logs-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cloud-watch-logs-configuration (input :cloud-watch-logs-configuration)) #:http.request.field{:name "CloudWatchLogsConfiguration", :shape "CloudWatchLogsConfiguration"})) (clojure.core/contains? input :attributes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-layer-attributes (input :attributes)) #:http.request.field{:name "Attributes", :shape "LayerAttributes"})) (clojure.core/contains? input :auto-assign-elastic-ips) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :auto-assign-elastic-ips)) #:http.request.field{:name "AutoAssignElasticIps", :shape "Boolean"})) (clojure.core/contains? input :packages) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-strings (input :packages)) #:http.request.field{:name "Packages", :shape "Strings"})) (clojure.core/contains? input :custom-json) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :custom-json)) #:http.request.field{:name "CustomJson", :shape "String"})) (clojure.core/contains? input :install-updates-on-boot) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :install-updates-on-boot)) #:http.request.field{:name "InstallUpdatesOnBoot", :shape "Boolean"})) (clojure.core/contains? input :volume-configurations) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-volume-configurations (input :volume-configurations)) #:http.request.field{:name "VolumeConfigurations", :shape "VolumeConfigurations"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "String"})) (clojure.core/contains? input :custom-instance-profile-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :custom-instance-profile-arn)) #:http.request.field{:name "CustomInstanceProfileArn", :shape "String"}))))

(clojure.core/defn- req-assign-instance-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "String"}) (clojure.core/into (ser-strings (input :layer-ids)) #:http.request.field{:name "LayerIds", :shape "Strings"})]}))

(clojure.core/defn- req-describe-raid-arrays-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :instance-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "String"})) (clojure.core/contains? input :stack-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :stack-id)) #:http.request.field{:name "StackId", :shape "String"})) (clojure.core/contains? input :raid-array-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-strings (input :raid-array-ids)) #:http.request.field{:name "RaidArrayIds", :shape "Strings"}))))

(clojure.core/defn- req-describe-commands-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :deployment-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :deployment-id)) #:http.request.field{:name "DeploymentId", :shape "String"})) (clojure.core/contains? input :instance-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "String"})) (clojure.core/contains? input :command-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-strings (input :command-ids)) #:http.request.field{:name "CommandIds", :shape "Strings"}))))

(clojure.core/defn- req-delete-instance-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "String"})]} (clojure.core/contains? input :delete-elastic-ip) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :delete-elastic-ip)) #:http.request.field{:name "DeleteElasticIp", :shape "Boolean"})) (clojure.core/contains? input :delete-volumes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :delete-volumes)) #:http.request.field{:name "DeleteVolumes", :shape "Boolean"}))))

(clojure.core/defn- req-deregister-elastic-ip-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :elastic-ip)) #:http.request.field{:name "ElasticIp", :shape "String"})]}))

(clojure.core/defn- req-update-my-user-profile-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :ssh-public-key) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :ssh-public-key)) #:http.request.field{:name "SshPublicKey", :shape "String"}))))

(clojure.core/defn- req-describe-instances-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :stack-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :stack-id)) #:http.request.field{:name "StackId", :shape "String"})) (clojure.core/contains? input :layer-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :layer-id)) #:http.request.field{:name "LayerId", :shape "String"})) (clojure.core/contains? input :instance-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-strings (input :instance-ids)) #:http.request.field{:name "InstanceIds", :shape "Strings"}))))

(clojure.core/defn- req-update-stack-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :stack-id)) #:http.request.field{:name "StackId", :shape "String"})]} (clojure.core/contains? input :custom-cookbooks-source) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-source (input :custom-cookbooks-source)) #:http.request.field{:name "CustomCookbooksSource", :shape "Source"})) (clojure.core/contains? input :service-role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :service-role-arn)) #:http.request.field{:name "ServiceRoleArn", :shape "String"})) (clojure.core/contains? input :hostname-theme) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :hostname-theme)) #:http.request.field{:name "HostnameTheme", :shape "String"})) (clojure.core/contains? input :default-ssh-key-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :default-ssh-key-name)) #:http.request.field{:name "DefaultSshKeyName", :shape "String"})) (clojure.core/contains? input :default-availability-zone) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :default-availability-zone)) #:http.request.field{:name "DefaultAvailabilityZone", :shape "String"})) (clojure.core/contains? input :chef-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-chef-configuration (input :chef-configuration)) #:http.request.field{:name "ChefConfiguration", :shape "ChefConfiguration"})) (clojure.core/contains? input :configuration-manager) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stack-configuration-manager (input :configuration-manager)) #:http.request.field{:name "ConfigurationManager", :shape "StackConfigurationManager"})) (clojure.core/contains? input :agent-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :agent-version)) #:http.request.field{:name "AgentVersion", :shape "String"})) (clojure.core/contains? input :use-opsworks-security-groups) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :use-opsworks-security-groups)) #:http.request.field{:name "UseOpsworksSecurityGroups", :shape "Boolean"})) (clojure.core/contains? input :attributes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stack-attributes (input :attributes)) #:http.request.field{:name "Attributes", :shape "StackAttributes"})) (clojure.core/contains? input :default-root-device-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-root-device-type (input :default-root-device-type)) #:http.request.field{:name "DefaultRootDeviceType", :shape "RootDeviceType"})) (clojure.core/contains? input :use-custom-cookbooks) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :use-custom-cookbooks)) #:http.request.field{:name "UseCustomCookbooks", :shape "Boolean"})) (clojure.core/contains? input :default-instance-profile-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :default-instance-profile-arn)) #:http.request.field{:name "DefaultInstanceProfileArn", :shape "String"})) (clojure.core/contains? input :custom-json) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :custom-json)) #:http.request.field{:name "CustomJson", :shape "String"})) (clojure.core/contains? input :default-subnet-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :default-subnet-id)) #:http.request.field{:name "DefaultSubnetId", :shape "String"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "String"})) (clojure.core/contains? input :default-os) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :default-os)) #:http.request.field{:name "DefaultOs", :shape "String"}))))

(clojure.core/defn- req-stop-instance-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "String"})]} (clojure.core/contains? input :force) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :force)) #:http.request.field{:name "Force", :shape "Boolean"}))))

(clojure.core/defn- req-unassign-instance-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "String"})]}))

(clojure.core/defn- req-describe-stack-provisioning-parameters-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :stack-id)) #:http.request.field{:name "StackId", :shape "String"})]}))

(clojure.core/defn- req-describe-layers-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :stack-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :stack-id)) #:http.request.field{:name "StackId", :shape "String"})) (clojure.core/contains? input :layer-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-strings (input :layer-ids)) #:http.request.field{:name "LayerIds", :shape "Strings"}))))

(clojure.core/defn- req-unassign-volume-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :volume-id)) #:http.request.field{:name "VolumeId", :shape "String"})]}))

(clojure.core/defn- req-tag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-arn (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "ResourceArn"}) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags"})]}))

(clojure.core/defn- req-update-volume-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :volume-id)) #:http.request.field{:name "VolumeId", :shape "String"})]} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "String"})) (clojure.core/contains? input :mount-point) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :mount-point)) #:http.request.field{:name "MountPoint", :shape "String"}))))

(clojure.core/defn- req-update-instance-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "String"})]} (clojure.core/contains? input :ebs-optimized) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :ebs-optimized)) #:http.request.field{:name "EbsOptimized", :shape "Boolean"})) (clojure.core/contains? input :instance-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :instance-type)) #:http.request.field{:name "InstanceType", :shape "String"})) (clojure.core/contains? input :agent-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :agent-version)) #:http.request.field{:name "AgentVersion", :shape "String"})) (clojure.core/contains? input :os) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :os)) #:http.request.field{:name "Os", :shape "String"})) (clojure.core/contains? input :layer-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-strings (input :layer-ids)) #:http.request.field{:name "LayerIds", :shape "Strings"})) (clojure.core/contains? input :hostname) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :hostname)) #:http.request.field{:name "Hostname", :shape "String"})) (clojure.core/contains? input :ami-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :ami-id)) #:http.request.field{:name "AmiId", :shape "String"})) (clojure.core/contains? input :architecture) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-architecture (input :architecture)) #:http.request.field{:name "Architecture", :shape "Architecture"})) (clojure.core/contains? input :install-updates-on-boot) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :install-updates-on-boot)) #:http.request.field{:name "InstallUpdatesOnBoot", :shape "Boolean"})) (clojure.core/contains? input :auto-scaling-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-auto-scaling-type (input :auto-scaling-type)) #:http.request.field{:name "AutoScalingType", :shape "AutoScalingType"})) (clojure.core/contains? input :ssh-key-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :ssh-key-name)) #:http.request.field{:name "SshKeyName", :shape "String"}))))

(clojure.core/defn- req-detach-elastic-load-balancer-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :elastic-load-balancer-name)) #:http.request.field{:name "ElasticLoadBalancerName", :shape "String"}) (clojure.core/into (ser-string (input :layer-id)) #:http.request.field{:name "LayerId", :shape "String"})]}))

(clojure.core/defn- req-grant-access-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "String"})]} (clojure.core/contains? input :valid-for-in-minutes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-valid-for-in-minutes (input :valid-for-in-minutes)) #:http.request.field{:name "ValidForInMinutes", :shape "ValidForInMinutes"}))))

(clojure.core/defn- req-start-stack-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :stack-id)) #:http.request.field{:name "StackId", :shape "String"})]}))

(clojure.core/defn- req-delete-user-profile-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :iam-user-arn)) #:http.request.field{:name "IamUserArn", :shape "String"})]}))

(clojure.core/defn- req-update-user-profile-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :iam-user-arn)) #:http.request.field{:name "IamUserArn", :shape "String"})]} (clojure.core/contains? input :ssh-username) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :ssh-username)) #:http.request.field{:name "SshUsername", :shape "String"})) (clojure.core/contains? input :ssh-public-key) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :ssh-public-key)) #:http.request.field{:name "SshPublicKey", :shape "String"})) (clojure.core/contains? input :allow-self-management) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :allow-self-management)) #:http.request.field{:name "AllowSelfManagement", :shape "Boolean"}))))

(clojure.core/defn- req-describe-permissions-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :iam-user-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :iam-user-arn)) #:http.request.field{:name "IamUserArn", :shape "String"})) (clojure.core/contains? input :stack-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :stack-id)) #:http.request.field{:name "StackId", :shape "String"}))))

(clojure.core/defn- req-describe-user-profiles-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :iam-user-arns) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-strings (input :iam-user-arns)) #:http.request.field{:name "IamUserArns", :shape "Strings"}))))

(clojure.core/defn- req-create-layer-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :stack-id)) #:http.request.field{:name "StackId", :shape "String"}) (clojure.core/into (ser-layer-type (input :type)) #:http.request.field{:name "Type", :shape "LayerType"}) (clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "String"}) (clojure.core/into (ser-string (input :shortname)) #:http.request.field{:name "Shortname", :shape "String"})]} (clojure.core/contains? input :custom-recipes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-recipes (input :custom-recipes)) #:http.request.field{:name "CustomRecipes", :shape "Recipes"})) (clojure.core/contains? input :custom-security-group-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-strings (input :custom-security-group-ids)) #:http.request.field{:name "CustomSecurityGroupIds", :shape "Strings"})) (clojure.core/contains? input :enable-auto-healing) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :enable-auto-healing)) #:http.request.field{:name "EnableAutoHealing", :shape "Boolean"})) (clojure.core/contains? input :use-ebs-optimized-instances) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :use-ebs-optimized-instances)) #:http.request.field{:name "UseEbsOptimizedInstances", :shape "Boolean"})) (clojure.core/contains? input :lifecycle-event-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lifecycle-event-configuration (input :lifecycle-event-configuration)) #:http.request.field{:name "LifecycleEventConfiguration", :shape "LifecycleEventConfiguration"})) (clojure.core/contains? input :auto-assign-public-ips) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :auto-assign-public-ips)) #:http.request.field{:name "AutoAssignPublicIps", :shape "Boolean"})) (clojure.core/contains? input :cloud-watch-logs-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cloud-watch-logs-configuration (input :cloud-watch-logs-configuration)) #:http.request.field{:name "CloudWatchLogsConfiguration", :shape "CloudWatchLogsConfiguration"})) (clojure.core/contains? input :attributes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-layer-attributes (input :attributes)) #:http.request.field{:name "Attributes", :shape "LayerAttributes"})) (clojure.core/contains? input :auto-assign-elastic-ips) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :auto-assign-elastic-ips)) #:http.request.field{:name "AutoAssignElasticIps", :shape "Boolean"})) (clojure.core/contains? input :packages) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-strings (input :packages)) #:http.request.field{:name "Packages", :shape "Strings"})) (clojure.core/contains? input :custom-json) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :custom-json)) #:http.request.field{:name "CustomJson", :shape "String"})) (clojure.core/contains? input :install-updates-on-boot) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :install-updates-on-boot)) #:http.request.field{:name "InstallUpdatesOnBoot", :shape "Boolean"})) (clojure.core/contains? input :volume-configurations) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-volume-configurations (input :volume-configurations)) #:http.request.field{:name "VolumeConfigurations", :shape "VolumeConfigurations"})) (clojure.core/contains? input :custom-instance-profile-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :custom-instance-profile-arn)) #:http.request.field{:name "CustomInstanceProfileArn", :shape "String"}))))

(clojure.core/defn- req-create-deployment-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :stack-id)) #:http.request.field{:name "StackId", :shape "String"}) (clojure.core/into (ser-deployment-command (input :command)) #:http.request.field{:name "Command", :shape "DeploymentCommand"})]} (clojure.core/contains? input :app-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :app-id)) #:http.request.field{:name "AppId", :shape "String"})) (clojure.core/contains? input :instance-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-strings (input :instance-ids)) #:http.request.field{:name "InstanceIds", :shape "Strings"})) (clojure.core/contains? input :layer-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-strings (input :layer-ids)) #:http.request.field{:name "LayerIds", :shape "Strings"})) (clojure.core/contains? input :comment) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :comment)) #:http.request.field{:name "Comment", :shape "String"})) (clojure.core/contains? input :custom-json) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :custom-json)) #:http.request.field{:name "CustomJson", :shape "String"}))))

(clojure.core/defn- req-describe-service-errors-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :stack-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :stack-id)) #:http.request.field{:name "StackId", :shape "String"})) (clojure.core/contains? input :instance-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "String"})) (clojure.core/contains? input :service-error-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-strings (input :service-error-ids)) #:http.request.field{:name "ServiceErrorIds", :shape "Strings"}))))

(clojure.core/defn- req-delete-app-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :app-id)) #:http.request.field{:name "AppId", :shape "String"})]}))

(clojure.core/defn- req-describe-volumes-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :instance-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "String"})) (clojure.core/contains? input :stack-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :stack-id)) #:http.request.field{:name "StackId", :shape "String"})) (clojure.core/contains? input :raid-array-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :raid-array-id)) #:http.request.field{:name "RaidArrayId", :shape "String"})) (clojure.core/contains? input :volume-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-strings (input :volume-ids)) #:http.request.field{:name "VolumeIds", :shape "Strings"}))))

(clojure.core/defn- req-deregister-ecs-cluster-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :ecs-cluster-arn)) #:http.request.field{:name "EcsClusterArn", :shape "String"})]}))

(clojure.core/defn- req-describe-elastic-load-balancers-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :stack-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :stack-id)) #:http.request.field{:name "StackId", :shape "String"})) (clojure.core/contains? input :layer-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-strings (input :layer-ids)) #:http.request.field{:name "LayerIds", :shape "Strings"}))))

(clojure.core/defn- req-attach-elastic-load-balancer-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :elastic-load-balancer-name)) #:http.request.field{:name "ElasticLoadBalancerName", :shape "String"}) (clojure.core/into (ser-string (input :layer-id)) #:http.request.field{:name "LayerId", :shape "String"})]}))

(clojure.core/defn- req-register-volume-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :stack-id)) #:http.request.field{:name "StackId", :shape "String"})]} (clojure.core/contains? input :ec-2-volume-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :ec-2-volume-id)) #:http.request.field{:name "Ec2VolumeId", :shape "String"}))))

(clojure.core/defn- req-reboot-instance-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "String"})]}))

(clojure.core/defn- req-describe-ecs-clusters-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :ecs-cluster-arns) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-strings (input :ecs-cluster-arns)) #:http.request.field{:name "EcsClusterArns", :shape "Strings"})) (clojure.core/contains? input :stack-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :stack-id)) #:http.request.field{:name "StackId", :shape "String"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :max-results)) #:http.request.field{:name "MaxResults", :shape "Integer"}))))

(clojure.core/defn- req-register-rds-db-instance-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :stack-id)) #:http.request.field{:name "StackId", :shape "String"}) (clojure.core/into (ser-string (input :rds-db-instance-arn)) #:http.request.field{:name "RdsDbInstanceArn", :shape "String"}) (clojure.core/into (ser-string (input :db-user)) #:http.request.field{:name "DbUser", :shape "String"}) (clojure.core/into (ser-string (input :db-password)) #:http.request.field{:name "DbPassword", :shape "String"})]}))

(clojure.core/defn- req-assign-volume-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :volume-id)) #:http.request.field{:name "VolumeId", :shape "String"})]} (clojure.core/contains? input :instance-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "String"}))))

(clojure.core/defn- req-describe-stack-summary-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :stack-id)) #:http.request.field{:name "StackId", :shape "String"})]}))

(clojure.core/defn- req-create-instance-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :stack-id)) #:http.request.field{:name "StackId", :shape "String"}) (clojure.core/into (ser-strings (input :layer-ids)) #:http.request.field{:name "LayerIds", :shape "Strings"}) (clojure.core/into (ser-string (input :instance-type)) #:http.request.field{:name "InstanceType", :shape "String"})]} (clojure.core/contains? input :subnet-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :subnet-id)) #:http.request.field{:name "SubnetId", :shape "String"})) (clojure.core/contains? input :tenancy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :tenancy)) #:http.request.field{:name "Tenancy", :shape "String"})) (clojure.core/contains? input :root-device-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-root-device-type (input :root-device-type)) #:http.request.field{:name "RootDeviceType", :shape "RootDeviceType"})) (clojure.core/contains? input :ebs-optimized) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :ebs-optimized)) #:http.request.field{:name "EbsOptimized", :shape "Boolean"})) (clojure.core/contains? input :agent-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :agent-version)) #:http.request.field{:name "AgentVersion", :shape "String"})) (clojure.core/contains? input :os) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :os)) #:http.request.field{:name "Os", :shape "String"})) (clojure.core/contains? input :availability-zone) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :availability-zone)) #:http.request.field{:name "AvailabilityZone", :shape "String"})) (clojure.core/contains? input :hostname) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :hostname)) #:http.request.field{:name "Hostname", :shape "String"})) (clojure.core/contains? input :ami-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :ami-id)) #:http.request.field{:name "AmiId", :shape "String"})) (clojure.core/contains? input :block-device-mappings) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-block-device-mappings (input :block-device-mappings)) #:http.request.field{:name "BlockDeviceMappings", :shape "BlockDeviceMappings"})) (clojure.core/contains? input :architecture) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-architecture (input :architecture)) #:http.request.field{:name "Architecture", :shape "Architecture"})) (clojure.core/contains? input :install-updates-on-boot) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :install-updates-on-boot)) #:http.request.field{:name "InstallUpdatesOnBoot", :shape "Boolean"})) (clojure.core/contains? input :virtualization-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :virtualization-type)) #:http.request.field{:name "VirtualizationType", :shape "String"})) (clojure.core/contains? input :auto-scaling-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-auto-scaling-type (input :auto-scaling-type)) #:http.request.field{:name "AutoScalingType", :shape "AutoScalingType"})) (clojure.core/contains? input :ssh-key-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :ssh-key-name)) #:http.request.field{:name "SshKeyName", :shape "String"}))))

(clojure.core/defn- req-start-instance-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "String"})]}))

(clojure.core/defn- req-stop-stack-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :stack-id)) #:http.request.field{:name "StackId", :shape "String"})]}))

(clojure.core/defn- req-describe-stacks-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :stack-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-strings (input :stack-ids)) #:http.request.field{:name "StackIds", :shape "Strings"}))))

(clojure.core/defn- req-describe-rds-db-instances-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :stack-id)) #:http.request.field{:name "StackId", :shape "String"})]} (clojure.core/contains? input :rds-db-instance-arns) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-strings (input :rds-db-instance-arns)) #:http.request.field{:name "RdsDbInstanceArns", :shape "Strings"}))))

(clojure.core/defn- req-delete-layer-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :layer-id)) #:http.request.field{:name "LayerId", :shape "String"})]}))

(clojure.core/defn- req-describe-apps-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :stack-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :stack-id)) #:http.request.field{:name "StackId", :shape "String"})) (clojure.core/contains? input :app-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-strings (input :app-ids)) #:http.request.field{:name "AppIds", :shape "Strings"}))))

(clojure.core/defn- req-deregister-rds-db-instance-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :rds-db-instance-arn)) #:http.request.field{:name "RdsDbInstanceArn", :shape "String"})]}))

(clojure.core/defn- req-update-elastic-ip-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :elastic-ip)) #:http.request.field{:name "ElasticIp", :shape "String"})]} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "String"}))))

(clojure.core/defn- req-describe-time-based-auto-scaling-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-strings (input :instance-ids)) #:http.request.field{:name "InstanceIds", :shape "Strings"})]}))

(clojure.core/defn- req-update-rds-db-instance-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :rds-db-instance-arn)) #:http.request.field{:name "RdsDbInstanceArn", :shape "String"})]} (clojure.core/contains? input :db-user) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :db-user)) #:http.request.field{:name "DbUser", :shape "String"})) (clojure.core/contains? input :db-password) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :db-password)) #:http.request.field{:name "DbPassword", :shape "String"}))))

(clojure.core/defn- req-create-user-profile-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :iam-user-arn)) #:http.request.field{:name "IamUserArn", :shape "String"})]} (clojure.core/contains? input :ssh-username) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :ssh-username)) #:http.request.field{:name "SshUsername", :shape "String"})) (clojure.core/contains? input :ssh-public-key) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :ssh-public-key)) #:http.request.field{:name "SshPublicKey", :shape "String"})) (clojure.core/contains? input :allow-self-management) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :allow-self-management)) #:http.request.field{:name "AllowSelfManagement", :shape "Boolean"}))))

(clojure.core/defn- req-untag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-arn (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "ResourceArn"}) (clojure.core/into (ser-tag-keys (input :tag-keys)) #:http.request.field{:name "TagKeys", :shape "TagKeys"})]}))

(clojure.core/defn- req-disassociate-elastic-ip-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :elastic-ip)) #:http.request.field{:name "ElasticIp", :shape "String"})]}))

(clojure.core/defn- req-deregister-volume-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :volume-id)) #:http.request.field{:name "VolumeId", :shape "String"})]}))

(clojure.core/defn- req-describe-deployments-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :stack-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :stack-id)) #:http.request.field{:name "StackId", :shape "String"})) (clojure.core/contains? input :app-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :app-id)) #:http.request.field{:name "AppId", :shape "String"})) (clojure.core/contains? input :deployment-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-strings (input :deployment-ids)) #:http.request.field{:name "DeploymentIds", :shape "Strings"}))))

(clojure.core/defn- req-list-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-arn (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "ResourceArn"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/declare deser-app-type)

(clojure.core/declare deser-switch)

(clojure.core/declare deser-recipes)

(clojure.core/declare deser-time-based-auto-scaling-configurations)

(clojure.core/declare deser-double)

(clojure.core/declare deser-permissions)

(clojure.core/declare deser-ecs-clusters)

(clojure.core/declare deser-user-profile)

(clojure.core/declare deser-self-user-profile)

(clojure.core/declare deser-deployment)

(clojure.core/declare deser-raid-array)

(clojure.core/declare deser-volume)

(clojure.core/declare deser-permission)

(clojure.core/declare deser-ebs-block-device)

(clojure.core/declare deser-app)

(clojure.core/declare deser-operating-system-configuration-manager)

(clojure.core/declare deser-layers)

(clojure.core/declare deser-source)

(clojure.core/declare deser-shutdown-event-configuration)

(clojure.core/declare deser-root-device-type)

(clojure.core/declare deser-environment-variables)

(clojure.core/declare deser-ecs-cluster)

(clojure.core/declare deser-user-profiles)

(clojure.core/declare deser-chef-configuration)

(clojure.core/declare deser-parameters)

(clojure.core/declare deser-load-based-auto-scaling-configurations)

(clojure.core/declare deser-tag-key)

(clojure.core/declare deser-tags)

(clojure.core/declare deser-elastic-load-balancer)

(clojure.core/declare deser-agent-version)

(clojure.core/declare deser-source-type)

(clojure.core/declare deser-strings)

(clojure.core/declare deser-lifecycle-event-configuration)

(clojure.core/declare deser-rds-db-instance)

(clojure.core/declare deser-next-token)

(clojure.core/declare deser-commands)

(clojure.core/declare deser-minute)

(clojure.core/declare deser-deployment-command-args)

(clojure.core/declare deser-cloud-watch-logs-configuration)

(clojure.core/declare deser-daily-auto-scaling-schedule)

(clojure.core/declare deser-rds-db-instances)

(clojure.core/declare deser-elastic-ip)

(clojure.core/declare deser-data-sources)

(clojure.core/declare deser-load-based-auto-scaling-configuration)

(clojure.core/declare deser-layer)

(clojure.core/declare deser-temporary-credential)

(clojure.core/declare deser-hour)

(clojure.core/declare deser-apps)

(clojure.core/declare deser-tag-value)

(clojure.core/declare deser-environment-variable)

(clojure.core/declare deser-ssl-configuration)

(clojure.core/declare deser-cloud-watch-logs-encoding)

(clojure.core/declare deser-stack-attributes)

(clojure.core/declare deser-cloud-watch-logs-log-streams)

(clojure.core/declare deser-stack-attributes-keys)

(clojure.core/declare deser-elastic-ips)

(clojure.core/declare deser-stacks)

(clojure.core/declare deser-layer-attributes-keys)

(clojure.core/declare deser-reported-os)

(clojure.core/declare deser-agent-versions)

(clojure.core/declare deser-integer)

(clojure.core/declare deser-string)

(clojure.core/declare deser-stack-summary)

(clojure.core/declare deser-data-source)

(clojure.core/declare deser-raid-arrays)

(clojure.core/declare deser-command)

(clojure.core/declare deser-instances-count)

(clojure.core/declare deser-operating-system-configuration-managers)

(clojure.core/declare deser-time-based-auto-scaling-configuration)

(clojure.core/declare deser-volume-type)

(clojure.core/declare deser-cloud-watch-logs-initial-position)

(clojure.core/declare deser-app-attributes)

(clojure.core/declare deser-block-device-mappings)

(clojure.core/declare deser-architecture)

(clojure.core/declare deser-stack-configuration-manager)

(clojure.core/declare deser-auto-scaling-thresholds)

(clojure.core/declare deser-layer-type)

(clojure.core/declare deser-virtualization-type)

(clojure.core/declare deser-block-device-mapping)

(clojure.core/declare deser-weekly-auto-scaling-schedule)

(clojure.core/declare deser-service-errors)

(clojure.core/declare deser-volume-configuration)

(clojure.core/declare deser-instance)

(clojure.core/declare deser-volume-configurations)

(clojure.core/declare deser-auto-scaling-type)

(clojure.core/declare deser-deployment-command)

(clojure.core/declare deser-cloud-watch-logs-time-zone)

(clojure.core/declare deser-layer-attributes)

(clojure.core/declare deser-volumes)

(clojure.core/declare deser-app-attributes-keys)

(clojure.core/declare deser-stack)

(clojure.core/declare deser-operating-systems)

(clojure.core/declare deser-instances)

(clojure.core/declare deser-deployment-command-name)

(clojure.core/declare deser-service-error)

(clojure.core/declare deser-operating-system)

(clojure.core/declare deser-cloud-watch-logs-log-stream)

(clojure.core/declare deser-elastic-load-balancers)

(clojure.core/declare deser-date-time)

(clojure.core/declare deser-deployments)

(clojure.core/declare deser-boolean)

(clojure.core/defn- deser-app-type [input] (clojure.core/get {"aws-flow-ruby" :awsflowruby, "java" :java, "rails" :rails, "php" :php, "nodejs" :nodejs, "static" :static, "other" :other} input))

(clojure.core/defn- deser-switch [input] input)

(clojure.core/defn- deser-recipes [input] (clojure.core/cond-> {} (clojure.core/contains? input "Setup") (clojure.core/assoc :setup (deser-strings (input "Setup"))) (clojure.core/contains? input "Configure") (clojure.core/assoc :configure (deser-strings (input "Configure"))) (clojure.core/contains? input "Deploy") (clojure.core/assoc :deploy (deser-strings (input "Deploy"))) (clojure.core/contains? input "Undeploy") (clojure.core/assoc :undeploy (deser-strings (input "Undeploy"))) (clojure.core/contains? input "Shutdown") (clojure.core/assoc :shutdown (deser-strings (input "Shutdown")))))

(clojure.core/defn- deser-time-based-auto-scaling-configurations [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-time-based-auto-scaling-configuration coll))) input))

(clojure.core/defn- deser-double [input] input)

(clojure.core/defn- deser-permissions [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-permission coll))) input))

(clojure.core/defn- deser-ecs-clusters [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-ecs-cluster coll))) input))

(clojure.core/defn- deser-user-profile [input] (clojure.core/cond-> {} (clojure.core/contains? input "IamUserArn") (clojure.core/assoc :iam-user-arn (deser-string (input "IamUserArn"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-string (input "Name"))) (clojure.core/contains? input "SshUsername") (clojure.core/assoc :ssh-username (deser-string (input "SshUsername"))) (clojure.core/contains? input "SshPublicKey") (clojure.core/assoc :ssh-public-key (deser-string (input "SshPublicKey"))) (clojure.core/contains? input "AllowSelfManagement") (clojure.core/assoc :allow-self-management (deser-boolean (input "AllowSelfManagement")))))

(clojure.core/defn- deser-self-user-profile [input] (clojure.core/cond-> {} (clojure.core/contains? input "IamUserArn") (clojure.core/assoc :iam-user-arn (deser-string (input "IamUserArn"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-string (input "Name"))) (clojure.core/contains? input "SshUsername") (clojure.core/assoc :ssh-username (deser-string (input "SshUsername"))) (clojure.core/contains? input "SshPublicKey") (clojure.core/assoc :ssh-public-key (deser-string (input "SshPublicKey")))))

(clojure.core/defn- deser-deployment [input] (clojure.core/cond-> {} (clojure.core/contains? input "InstanceIds") (clojure.core/assoc :instance-ids (deser-strings (input "InstanceIds"))) (clojure.core/contains? input "CompletedAt") (clojure.core/assoc :completed-at (deser-date-time (input "CompletedAt"))) (clojure.core/contains? input "Comment") (clojure.core/assoc :comment (deser-string (input "Comment"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-string (input "Status"))) (clojure.core/contains? input "DeploymentId") (clojure.core/assoc :deployment-id (deser-string (input "DeploymentId"))) (clojure.core/contains? input "Duration") (clojure.core/assoc :duration (deser-integer (input "Duration"))) (clojure.core/contains? input "StackId") (clojure.core/assoc :stack-id (deser-string (input "StackId"))) (clojure.core/contains? input "Command") (clojure.core/assoc :command (deser-deployment-command (input "Command"))) (clojure.core/contains? input "AppId") (clojure.core/assoc :app-id (deser-string (input "AppId"))) (clojure.core/contains? input "CreatedAt") (clojure.core/assoc :created-at (deser-date-time (input "CreatedAt"))) (clojure.core/contains? input "CustomJson") (clojure.core/assoc :custom-json (deser-string (input "CustomJson"))) (clojure.core/contains? input "IamUserArn") (clojure.core/assoc :iam-user-arn (deser-string (input "IamUserArn")))))

(clojure.core/defn- deser-raid-array [input] (clojure.core/cond-> {} (clojure.core/contains? input "InstanceId") (clojure.core/assoc :instance-id (deser-string (input "InstanceId"))) (clojure.core/contains? input "MountPoint") (clojure.core/assoc :mount-point (deser-string (input "MountPoint"))) (clojure.core/contains? input "AvailabilityZone") (clojure.core/assoc :availability-zone (deser-string (input "AvailabilityZone"))) (clojure.core/contains? input "RaidArrayId") (clojure.core/assoc :raid-array-id (deser-string (input "RaidArrayId"))) (clojure.core/contains? input "NumberOfDisks") (clojure.core/assoc :number-of-disks (deser-integer (input "NumberOfDisks"))) (clojure.core/contains? input "Size") (clojure.core/assoc :size (deser-integer (input "Size"))) (clojure.core/contains? input "StackId") (clojure.core/assoc :stack-id (deser-string (input "StackId"))) (clojure.core/contains? input "Iops") (clojure.core/assoc :iops (deser-integer (input "Iops"))) (clojure.core/contains? input "RaidLevel") (clojure.core/assoc :raid-level (deser-integer (input "RaidLevel"))) (clojure.core/contains? input "VolumeType") (clojure.core/assoc :volume-type (deser-string (input "VolumeType"))) (clojure.core/contains? input "CreatedAt") (clojure.core/assoc :created-at (deser-date-time (input "CreatedAt"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-string (input "Name"))) (clojure.core/contains? input "Device") (clojure.core/assoc :device (deser-string (input "Device")))))

(clojure.core/defn- deser-volume [input] (clojure.core/cond-> {} (clojure.core/contains? input "InstanceId") (clojure.core/assoc :instance-id (deser-string (input "InstanceId"))) (clojure.core/contains? input "MountPoint") (clojure.core/assoc :mount-point (deser-string (input "MountPoint"))) (clojure.core/contains? input "Encrypted") (clojure.core/assoc :encrypted (deser-boolean (input "Encrypted"))) (clojure.core/contains? input "Ec2VolumeId") (clojure.core/assoc :ec-2-volume-id (deser-string (input "Ec2VolumeId"))) (clojure.core/contains? input "AvailabilityZone") (clojure.core/assoc :availability-zone (deser-string (input "AvailabilityZone"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-string (input "Status"))) (clojure.core/contains? input "RaidArrayId") (clojure.core/assoc :raid-array-id (deser-string (input "RaidArrayId"))) (clojure.core/contains? input "Size") (clojure.core/assoc :size (deser-integer (input "Size"))) (clojure.core/contains? input "Iops") (clojure.core/assoc :iops (deser-integer (input "Iops"))) (clojure.core/contains? input "VolumeType") (clojure.core/assoc :volume-type (deser-string (input "VolumeType"))) (clojure.core/contains? input "VolumeId") (clojure.core/assoc :volume-id (deser-string (input "VolumeId"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-string (input "Name"))) (clojure.core/contains? input "Device") (clojure.core/assoc :device (deser-string (input "Device"))) (clojure.core/contains? input "Region") (clojure.core/assoc :region (deser-string (input "Region")))))

(clojure.core/defn- deser-permission [input] (clojure.core/cond-> {} (clojure.core/contains? input "StackId") (clojure.core/assoc :stack-id (deser-string (input "StackId"))) (clojure.core/contains? input "IamUserArn") (clojure.core/assoc :iam-user-arn (deser-string (input "IamUserArn"))) (clojure.core/contains? input "AllowSsh") (clojure.core/assoc :allow-ssh (deser-boolean (input "AllowSsh"))) (clojure.core/contains? input "AllowSudo") (clojure.core/assoc :allow-sudo (deser-boolean (input "AllowSudo"))) (clojure.core/contains? input "Level") (clojure.core/assoc :level (deser-string (input "Level")))))

(clojure.core/defn- deser-ebs-block-device [input] (clojure.core/cond-> {} (clojure.core/contains? input "SnapshotId") (clojure.core/assoc :snapshot-id (deser-string (input "SnapshotId"))) (clojure.core/contains? input "Iops") (clojure.core/assoc :iops (deser-integer (input "Iops"))) (clojure.core/contains? input "VolumeSize") (clojure.core/assoc :volume-size (deser-integer (input "VolumeSize"))) (clojure.core/contains? input "VolumeType") (clojure.core/assoc :volume-type (deser-volume-type (input "VolumeType"))) (clojure.core/contains? input "DeleteOnTermination") (clojure.core/assoc :delete-on-termination (deser-boolean (input "DeleteOnTermination")))))

(clojure.core/defn- deser-app [input] (clojure.core/cond-> {} (clojure.core/contains? input "Shortname") (clojure.core/assoc :shortname (deser-string (input "Shortname"))) (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-app-type (input "Type"))) (clojure.core/contains? input "EnableSsl") (clojure.core/assoc :enable-ssl (deser-boolean (input "EnableSsl"))) (clojure.core/contains? input "Domains") (clojure.core/assoc :domains (deser-strings (input "Domains"))) (clojure.core/contains? input "AppSource") (clojure.core/assoc :app-source (deser-source (input "AppSource"))) (clojure.core/contains? input "Attributes") (clojure.core/assoc :attributes (deser-app-attributes (input "Attributes"))) (clojure.core/contains? input "DataSources") (clojure.core/assoc :data-sources (deser-data-sources (input "DataSources"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-string (input "Description"))) (clojure.core/contains? input "SslConfiguration") (clojure.core/assoc :ssl-configuration (deser-ssl-configuration (input "SslConfiguration"))) (clojure.core/contains? input "StackId") (clojure.core/assoc :stack-id (deser-string (input "StackId"))) (clojure.core/contains? input "Environment") (clojure.core/assoc :environment (deser-environment-variables (input "Environment"))) (clojure.core/contains? input "AppId") (clojure.core/assoc :app-id (deser-string (input "AppId"))) (clojure.core/contains? input "CreatedAt") (clojure.core/assoc :created-at (deser-string (input "CreatedAt"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-string (input "Name")))))

(clojure.core/defn- deser-operating-system-configuration-manager [input] (clojure.core/cond-> {} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-string (input "Name"))) (clojure.core/contains? input "Version") (clojure.core/assoc :version (deser-string (input "Version")))))

(clojure.core/defn- deser-layers [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-layer coll))) input))

(clojure.core/defn- deser-source [input] (clojure.core/cond-> {} (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-source-type (input "Type"))) (clojure.core/contains? input "Url") (clojure.core/assoc :url (deser-string (input "Url"))) (clojure.core/contains? input "Username") (clojure.core/assoc :username (deser-string (input "Username"))) (clojure.core/contains? input "Password") (clojure.core/assoc :password (deser-string (input "Password"))) (clojure.core/contains? input "SshKey") (clojure.core/assoc :ssh-key (deser-string (input "SshKey"))) (clojure.core/contains? input "Revision") (clojure.core/assoc :revision (deser-string (input "Revision")))))

(clojure.core/defn- deser-shutdown-event-configuration [input] (clojure.core/cond-> {} (clojure.core/contains? input "ExecutionTimeout") (clojure.core/assoc :execution-timeout (deser-integer (input "ExecutionTimeout"))) (clojure.core/contains? input "DelayUntilElbConnectionsDrained") (clojure.core/assoc :delay-until-elb-connections-drained (deser-boolean (input "DelayUntilElbConnectionsDrained")))))

(clojure.core/defn- deser-root-device-type [input] (clojure.core/get {"ebs" :ebs, "instance-store" :instancestore} input))

(clojure.core/defn- deser-environment-variables [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-environment-variable coll))) input))

(clojure.core/defn- deser-ecs-cluster [input] (clojure.core/cond-> {} (clojure.core/contains? input "EcsClusterArn") (clojure.core/assoc :ecs-cluster-arn (deser-string (input "EcsClusterArn"))) (clojure.core/contains? input "EcsClusterName") (clojure.core/assoc :ecs-cluster-name (deser-string (input "EcsClusterName"))) (clojure.core/contains? input "StackId") (clojure.core/assoc :stack-id (deser-string (input "StackId"))) (clojure.core/contains? input "RegisteredAt") (clojure.core/assoc :registered-at (deser-date-time (input "RegisteredAt")))))

(clojure.core/defn- deser-user-profiles [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-user-profile coll))) input))

(clojure.core/defn- deser-chef-configuration [input] (clojure.core/cond-> {} (clojure.core/contains? input "ManageBerkshelf") (clojure.core/assoc :manage-berkshelf (deser-boolean (input "ManageBerkshelf"))) (clojure.core/contains? input "BerkshelfVersion") (clojure.core/assoc :berkshelf-version (deser-string (input "BerkshelfVersion")))))

(clojure.core/defn- deser-parameters [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-string k) (deser-string v)])) input))

(clojure.core/defn- deser-load-based-auto-scaling-configurations [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-load-based-auto-scaling-configuration coll))) input))

(clojure.core/defn- deser-tag-key [input] input)

(clojure.core/defn- deser-tags [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-tag-key k) (deser-tag-value v)])) input))

(clojure.core/defn- deser-elastic-load-balancer [input] (clojure.core/cond-> {} (clojure.core/contains? input "DnsName") (clojure.core/assoc :dns-name (deser-string (input "DnsName"))) (clojure.core/contains? input "ElasticLoadBalancerName") (clojure.core/assoc :elastic-load-balancer-name (deser-string (input "ElasticLoadBalancerName"))) (clojure.core/contains? input "SubnetIds") (clojure.core/assoc :subnet-ids (deser-strings (input "SubnetIds"))) (clojure.core/contains? input "LayerId") (clojure.core/assoc :layer-id (deser-string (input "LayerId"))) (clojure.core/contains? input "VpcId") (clojure.core/assoc :vpc-id (deser-string (input "VpcId"))) (clojure.core/contains? input "StackId") (clojure.core/assoc :stack-id (deser-string (input "StackId"))) (clojure.core/contains? input "Ec2InstanceIds") (clojure.core/assoc :ec-2-instance-ids (deser-strings (input "Ec2InstanceIds"))) (clojure.core/contains? input "AvailabilityZones") (clojure.core/assoc :availability-zones (deser-strings (input "AvailabilityZones"))) (clojure.core/contains? input "Region") (clojure.core/assoc :region (deser-string (input "Region")))))

(clojure.core/defn- deser-agent-version [input] (clojure.core/cond-> {} (clojure.core/contains? input "Version") (clojure.core/assoc :version (deser-string (input "Version"))) (clojure.core/contains? input "ConfigurationManager") (clojure.core/assoc :configuration-manager (deser-stack-configuration-manager (input "ConfigurationManager")))))

(clojure.core/defn- deser-source-type [input] (clojure.core/get {"git" :git, "svn" :svn, "archive" :archive, "s3" :s-3} input))

(clojure.core/defn- deser-strings [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string coll))) input))

(clojure.core/defn- deser-lifecycle-event-configuration [input] (clojure.core/cond-> {} (clojure.core/contains? input "Shutdown") (clojure.core/assoc :shutdown (deser-shutdown-event-configuration (input "Shutdown")))))

(clojure.core/defn- deser-rds-db-instance [input] (clojure.core/cond-> {} (clojure.core/contains? input "Address") (clojure.core/assoc :address (deser-string (input "Address"))) (clojure.core/contains? input "DbUser") (clojure.core/assoc :db-user (deser-string (input "DbUser"))) (clojure.core/contains? input "DbInstanceIdentifier") (clojure.core/assoc :db-instance-identifier (deser-string (input "DbInstanceIdentifier"))) (clojure.core/contains? input "DbPassword") (clojure.core/assoc :db-password (deser-string (input "DbPassword"))) (clojure.core/contains? input "MissingOnRds") (clojure.core/assoc :missing-on-rds (deser-boolean (input "MissingOnRds"))) (clojure.core/contains? input "StackId") (clojure.core/assoc :stack-id (deser-string (input "StackId"))) (clojure.core/contains? input "Engine") (clojure.core/assoc :engine (deser-string (input "Engine"))) (clojure.core/contains? input "Region") (clojure.core/assoc :region (deser-string (input "Region"))) (clojure.core/contains? input "RdsDbInstanceArn") (clojure.core/assoc :rds-db-instance-arn (deser-string (input "RdsDbInstanceArn")))))

(clojure.core/defn- deser-next-token [input] input)

(clojure.core/defn- deser-commands [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-command coll))) input))

(clojure.core/defn- deser-minute [input] input)

(clojure.core/defn- deser-deployment-command-args [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-string k) (deser-strings v)])) input))

(clojure.core/defn- deser-cloud-watch-logs-configuration [input] (clojure.core/cond-> {} (clojure.core/contains? input "Enabled") (clojure.core/assoc :enabled (deser-boolean (input "Enabled"))) (clojure.core/contains? input "LogStreams") (clojure.core/assoc :log-streams (deser-cloud-watch-logs-log-streams (input "LogStreams")))))

(clojure.core/defn- deser-daily-auto-scaling-schedule [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-hour k) (deser-switch v)])) input))

(clojure.core/defn- deser-rds-db-instances [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-rds-db-instance coll))) input))

(clojure.core/defn- deser-elastic-ip [input] (clojure.core/cond-> {} (clojure.core/contains? input "Ip") (clojure.core/assoc :ip (deser-string (input "Ip"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-string (input "Name"))) (clojure.core/contains? input "Domain") (clojure.core/assoc :domain (deser-string (input "Domain"))) (clojure.core/contains? input "Region") (clojure.core/assoc :region (deser-string (input "Region"))) (clojure.core/contains? input "InstanceId") (clojure.core/assoc :instance-id (deser-string (input "InstanceId")))))

(clojure.core/defn- deser-data-sources [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-data-source coll))) input))

(clojure.core/defn- deser-load-based-auto-scaling-configuration [input] (clojure.core/cond-> {} (clojure.core/contains? input "LayerId") (clojure.core/assoc :layer-id (deser-string (input "LayerId"))) (clojure.core/contains? input "Enable") (clojure.core/assoc :enable (deser-boolean (input "Enable"))) (clojure.core/contains? input "UpScaling") (clojure.core/assoc :up-scaling (deser-auto-scaling-thresholds (input "UpScaling"))) (clojure.core/contains? input "DownScaling") (clojure.core/assoc :down-scaling (deser-auto-scaling-thresholds (input "DownScaling")))))

(clojure.core/defn- deser-layer [input] (clojure.core/cond-> {} (clojure.core/contains? input "CustomRecipes") (clojure.core/assoc :custom-recipes (deser-recipes (input "CustomRecipes"))) (clojure.core/contains? input "Shortname") (clojure.core/assoc :shortname (deser-string (input "Shortname"))) (clojure.core/contains? input "LayerId") (clojure.core/assoc :layer-id (deser-string (input "LayerId"))) (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-layer-type (input "Type"))) (clojure.core/contains? input "DefaultSecurityGroupNames") (clojure.core/assoc :default-security-group-names (deser-strings (input "DefaultSecurityGroupNames"))) (clojure.core/contains? input "CustomSecurityGroupIds") (clojure.core/assoc :custom-security-group-ids (deser-strings (input "CustomSecurityGroupIds"))) (clojure.core/contains? input "EnableAutoHealing") (clojure.core/assoc :enable-auto-healing (deser-boolean (input "EnableAutoHealing"))) (clojure.core/contains? input "UseEbsOptimizedInstances") (clojure.core/assoc :use-ebs-optimized-instances (deser-boolean (input "UseEbsOptimizedInstances"))) (clojure.core/contains? input "LifecycleEventConfiguration") (clojure.core/assoc :lifecycle-event-configuration (deser-lifecycle-event-configuration (input "LifecycleEventConfiguration"))) (clojure.core/contains? input "AutoAssignPublicIps") (clojure.core/assoc :auto-assign-public-ips (deser-boolean (input "AutoAssignPublicIps"))) (clojure.core/contains? input "CloudWatchLogsConfiguration") (clojure.core/assoc :cloud-watch-logs-configuration (deser-cloud-watch-logs-configuration (input "CloudWatchLogsConfiguration"))) (clojure.core/contains? input "Attributes") (clojure.core/assoc :attributes (deser-layer-attributes (input "Attributes"))) (clojure.core/contains? input "StackId") (clojure.core/assoc :stack-id (deser-string (input "StackId"))) (clojure.core/contains? input "DefaultRecipes") (clojure.core/assoc :default-recipes (deser-recipes (input "DefaultRecipes"))) (clojure.core/contains? input "AutoAssignElasticIps") (clojure.core/assoc :auto-assign-elastic-ips (deser-boolean (input "AutoAssignElasticIps"))) (clojure.core/contains? input "Arn") (clojure.core/assoc :arn (deser-string (input "Arn"))) (clojure.core/contains? input "Packages") (clojure.core/assoc :packages (deser-strings (input "Packages"))) (clojure.core/contains? input "CreatedAt") (clojure.core/assoc :created-at (deser-date-time (input "CreatedAt"))) (clojure.core/contains? input "CustomJson") (clojure.core/assoc :custom-json (deser-string (input "CustomJson"))) (clojure.core/contains? input "InstallUpdatesOnBoot") (clojure.core/assoc :install-updates-on-boot (deser-boolean (input "InstallUpdatesOnBoot"))) (clojure.core/contains? input "VolumeConfigurations") (clojure.core/assoc :volume-configurations (deser-volume-configurations (input "VolumeConfigurations"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-string (input "Name"))) (clojure.core/contains? input "CustomInstanceProfileArn") (clojure.core/assoc :custom-instance-profile-arn (deser-string (input "CustomInstanceProfileArn")))))

(clojure.core/defn- deser-temporary-credential [input] (clojure.core/cond-> {} (clojure.core/contains? input "Username") (clojure.core/assoc :username (deser-string (input "Username"))) (clojure.core/contains? input "Password") (clojure.core/assoc :password (deser-string (input "Password"))) (clojure.core/contains? input "ValidForInMinutes") (clojure.core/assoc :valid-for-in-minutes (deser-integer (input "ValidForInMinutes"))) (clojure.core/contains? input "InstanceId") (clojure.core/assoc :instance-id (deser-string (input "InstanceId")))))

(clojure.core/defn- deser-hour [input] input)

(clojure.core/defn- deser-apps [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-app coll))) input))

(clojure.core/defn- deser-tag-value [input] input)

(clojure.core/defn- deser-environment-variable [input] (clojure.core/cond-> {:key (deser-string (input "Key")), :value (deser-string (input "Value"))} (clojure.core/contains? input "Secure") (clojure.core/assoc :secure (deser-boolean (input "Secure")))))

(clojure.core/defn- deser-ssl-configuration [input] (clojure.core/cond-> {:certificate (deser-string (input "Certificate")), :private-key (deser-string (input "PrivateKey"))} (clojure.core/contains? input "Chain") (clojure.core/assoc :chain (deser-string (input "Chain")))))

(clojure.core/defn- deser-cloud-watch-logs-encoding [input] (clojure.core/get {"johab" :johab, "cp863" :cp-863, "utf_16" :utf-16, "gb18030" :gb-18030, "mac_latin2" :mac-latin-2, "cp737" :cp-737, "ascii" :ascii, "utf_16_be" :utf-16-be, "iso8859_3" :iso-8859-3, "shift_jisx0213" :shift-jisx-0213, "cp864" :cp-864, "cp1255" :cp-1255, "cp865" :cp-865, "euc_jp" :euc-jp, "cp856" :cp-856, "iso8859_15" :iso-8859-15, "big5hkscs" :big-5hkscs, "cp932" :cp-932, "cp850" :cp-850, "shift_jis_2004" :shift-jis-2004, "cp424" :cp-424, "iso8859_6" :iso-8859-6, "euc_jisx0213" :euc-jisx-0213, "cp720" :cp-720, "mac_roman" :mac-roman, "cp1026" :cp-1026, "cp1250" :cp-1250, "cp874" :cp-874, "cp1006" :cp-1006, "iso8859_7" :iso-8859-7, "cp869" :cp-869, "iso8859_14" :iso-8859-14, "iso2022_jp_2004" :iso-2022-jp-2004, "iso2022_kr" :iso-2022-kr, "iso2022_jp_1" :iso-2022-jp-1, "cp950" :cp-950, "cp500" :cp-500, "cp1254" :cp-1254, "iso2022_jp_2" :iso-2022-jp-2, "cp037" :cp-037, "hz" :hz, "iso2022_jp_3" :iso-2022-jp-3, "iso2022_jp_ext" :iso-2022-jp-ext, "utf_32_le" :utf-32-le, "iso8859_13" :iso-8859-13, "iso8859_5" :iso-8859-5, "cp852" :cp-852, "cp1140" :cp-1140, "mac_cyrillic" :mac-cyrillic, "cp861" :cp-861, "big5" :big-5, "cp949" :cp-949, "mac_iceland" :mac-iceland, "euc_kr" :euc-kr, "iso8859_10" :iso-8859-10, "iso8859_2" :iso-8859-2, "cp857" :cp-857, "ptcp154" :ptcp-154, "gb2312" :gb-2312, "cp862" :cp-862, "utf_32_be" :utf-32-be, "iso8859_9" :iso-8859-9, "cp437" :cp-437, "iso8859_8" :iso-8859-8, "cp1251" :cp-1251, "koi8_u" :koi-8-u, "iso8859_4" :iso-8859-4, "utf_32" :utf-32, "shift_jis" :shift-jis, "cp1257" :cp-1257, "cp1252" :cp-1252, "iso8859_16" :iso-8859-16, "utf_16_le" :utf-16-le, "latin_1" :latin-1, "utf_8" :utf-8, "cp1256" :cp-1256, "cp855" :cp-855, "mac_turkish" :mac-turkish, "euc_jis_2004" :euc-jis-2004, "cp1253" :cp-1253, "cp858" :cp-858, "mac_greek" :mac-greek, "utf_7" :utf-7, "cp866" :cp-866, "cp860" :cp-860, "cp1258" :cp-1258, "cp875" :cp-875, "cp775" :cp-775, "koi8_r" :koi-8-r, "iso2022_jp" :iso-2022-jp, "gbk" :gbk, "utf_8_sig" :utf-8-sig} input))

(clojure.core/defn- deser-stack-attributes [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-stack-attributes-keys k) (deser-string v)])) input))

(clojure.core/defn- deser-cloud-watch-logs-log-streams [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-cloud-watch-logs-log-stream coll))) input))

(clojure.core/defn- deser-stack-attributes-keys [input] (clojure.core/get {"Color" :color} input))

(clojure.core/defn- deser-elastic-ips [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-elastic-ip coll))) input))

(clojure.core/defn- deser-stacks [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-stack coll))) input))

(clojure.core/defn- deser-layer-attributes-keys [input] (clojure.core/get {"JvmVersion" :jvm-version, "JavaAppServerVersion" :java-app-server-version, "MysqlRootPassword" :mysql-root-password, "HaproxyHealthCheckUrl" :haproxy-health-check-url, "MemcachedMemory" :memcached-memory, "HaproxyHealthCheckMethod" :haproxy-health-check-method, "RubyVersion" :ruby-version, "GangliaUrl" :ganglia-url, "HaproxyStatsPassword" :haproxy-stats-password, "BundlerVersion" :bundler-version, "GangliaPassword" :ganglia-password, "Jvm" :jvm, "EnableHaproxyStats" :enable-haproxy-stats, "RailsStack" :rails-stack, "NodejsVersion" :nodejs-version, "PassengerVersion" :passenger-version, "RubygemsVersion" :rubygems-version, "GangliaUser" :ganglia-user, "EcsClusterArn" :ecs-cluster-arn, "HaproxyStatsUser" :haproxy-stats-user, "HaproxyStatsUrl" :haproxy-stats-url, "ManageBundler" :manage-bundler, "MysqlRootPasswordUbiquitous" :mysql-root-password-ubiquitous, "JvmOptions" :jvm-options, "JavaAppServer" :java-app-server} input))

(clojure.core/defn- deser-reported-os [input] (clojure.core/cond-> {} (clojure.core/contains? input "Family") (clojure.core/assoc :family (deser-string (input "Family"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-string (input "Name"))) (clojure.core/contains? input "Version") (clojure.core/assoc :version (deser-string (input "Version")))))

(clojure.core/defn- deser-agent-versions [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-agent-version coll))) input))

(clojure.core/defn- deser-integer [input] input)

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-stack-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "StackId") (clojure.core/assoc :stack-id (deser-string (input "StackId"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-string (input "Name"))) (clojure.core/contains? input "Arn") (clojure.core/assoc :arn (deser-string (input "Arn"))) (clojure.core/contains? input "LayersCount") (clojure.core/assoc :layers-count (deser-integer (input "LayersCount"))) (clojure.core/contains? input "AppsCount") (clojure.core/assoc :apps-count (deser-integer (input "AppsCount"))) (clojure.core/contains? input "InstancesCount") (clojure.core/assoc :instances-count (deser-instances-count (input "InstancesCount")))))

(clojure.core/defn- deser-data-source [input] (clojure.core/cond-> {} (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-string (input "Type"))) (clojure.core/contains? input "Arn") (clojure.core/assoc :arn (deser-string (input "Arn"))) (clojure.core/contains? input "DatabaseName") (clojure.core/assoc :database-name (deser-string (input "DatabaseName")))))

(clojure.core/defn- deser-raid-arrays [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-raid-array coll))) input))

(clojure.core/defn- deser-command [input] (clojure.core/cond-> {} (clojure.core/contains? input "InstanceId") (clojure.core/assoc :instance-id (deser-string (input "InstanceId"))) (clojure.core/contains? input "CompletedAt") (clojure.core/assoc :completed-at (deser-date-time (input "CompletedAt"))) (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-string (input "Type"))) (clojure.core/contains? input "LogUrl") (clojure.core/assoc :log-url (deser-string (input "LogUrl"))) (clojure.core/contains? input "ExitCode") (clojure.core/assoc :exit-code (deser-integer (input "ExitCode"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-string (input "Status"))) (clojure.core/contains? input "DeploymentId") (clojure.core/assoc :deployment-id (deser-string (input "DeploymentId"))) (clojure.core/contains? input "AcknowledgedAt") (clojure.core/assoc :acknowledged-at (deser-date-time (input "AcknowledgedAt"))) (clojure.core/contains? input "CreatedAt") (clojure.core/assoc :created-at (deser-date-time (input "CreatedAt"))) (clojure.core/contains? input "CommandId") (clojure.core/assoc :command-id (deser-string (input "CommandId")))))

(clojure.core/defn- deser-instances-count [input] (clojure.core/cond-> {} (clojure.core/contains? input "SetupFailed") (clojure.core/assoc :setup-failed (deser-integer (input "SetupFailed"))) (clojure.core/contains? input "StopFailed") (clojure.core/assoc :stop-failed (deser-integer (input "StopFailed"))) (clojure.core/contains? input "Registered") (clojure.core/assoc :registered (deser-integer (input "Registered"))) (clojure.core/contains? input "ConnectionLost") (clojure.core/assoc :connection-lost (deser-integer (input "ConnectionLost"))) (clojure.core/contains? input "RunningSetup") (clojure.core/assoc :running-setup (deser-integer (input "RunningSetup"))) (clojure.core/contains? input "Rebooting") (clojure.core/assoc :rebooting (deser-integer (input "Rebooting"))) (clojure.core/contains? input "Booting") (clojure.core/assoc :booting (deser-integer (input "Booting"))) (clojure.core/contains? input "Deregistering") (clojure.core/assoc :deregistering (deser-integer (input "Deregistering"))) (clojure.core/contains? input "Terminating") (clojure.core/assoc :terminating (deser-integer (input "Terminating"))) (clojure.core/contains? input "Stopping") (clojure.core/assoc :stopping (deser-integer (input "Stopping"))) (clojure.core/contains? input "Registering") (clojure.core/assoc :registering (deser-integer (input "Registering"))) (clojure.core/contains? input "Terminated") (clojure.core/assoc :terminated (deser-integer (input "Terminated"))) (clojure.core/contains? input "Stopped") (clojure.core/assoc :stopped (deser-integer (input "Stopped"))) (clojure.core/contains? input "Pending") (clojure.core/assoc :pending (deser-integer (input "Pending"))) (clojure.core/contains? input "Requested") (clojure.core/assoc :requested (deser-integer (input "Requested"))) (clojure.core/contains? input "Assigning") (clojure.core/assoc :assigning (deser-integer (input "Assigning"))) (clojure.core/contains? input "StartFailed") (clojure.core/assoc :start-failed (deser-integer (input "StartFailed"))) (clojure.core/contains? input "Unassigning") (clojure.core/assoc :unassigning (deser-integer (input "Unassigning"))) (clojure.core/contains? input "Online") (clojure.core/assoc :online (deser-integer (input "Online"))) (clojure.core/contains? input "ShuttingDown") (clojure.core/assoc :shutting-down (deser-integer (input "ShuttingDown")))))

(clojure.core/defn- deser-operating-system-configuration-managers [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-operating-system-configuration-manager coll))) input))

(clojure.core/defn- deser-time-based-auto-scaling-configuration [input] (clojure.core/cond-> {} (clojure.core/contains? input "InstanceId") (clojure.core/assoc :instance-id (deser-string (input "InstanceId"))) (clojure.core/contains? input "AutoScalingSchedule") (clojure.core/assoc :auto-scaling-schedule (deser-weekly-auto-scaling-schedule (input "AutoScalingSchedule")))))

(clojure.core/defn- deser-volume-type [input] (clojure.core/get {"gp2" :gp-2, "io1" :io-1, "standard" :standard} input))

(clojure.core/defn- deser-cloud-watch-logs-initial-position [input] (clojure.core/get {"start_of_file" :start-of-file, "end_of_file" :end-of-file} input))

(clojure.core/defn- deser-app-attributes [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-app-attributes-keys k) (deser-string v)])) input))

(clojure.core/defn- deser-block-device-mappings [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-block-device-mapping coll))) input))

(clojure.core/defn- deser-architecture [input] (clojure.core/get {"x86_64" :x-86-64, "i386" :i-386} input))

(clojure.core/defn- deser-stack-configuration-manager [input] (clojure.core/cond-> {} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-string (input "Name"))) (clojure.core/contains? input "Version") (clojure.core/assoc :version (deser-string (input "Version")))))

(clojure.core/defn- deser-auto-scaling-thresholds [input] (clojure.core/cond-> {} (clojure.core/contains? input "InstanceCount") (clojure.core/assoc :instance-count (deser-integer (input "InstanceCount"))) (clojure.core/contains? input "ThresholdsWaitTime") (clojure.core/assoc :thresholds-wait-time (deser-minute (input "ThresholdsWaitTime"))) (clojure.core/contains? input "IgnoreMetricsTime") (clojure.core/assoc :ignore-metrics-time (deser-minute (input "IgnoreMetricsTime"))) (clojure.core/contains? input "CpuThreshold") (clojure.core/assoc :cpu-threshold (deser-double (input "CpuThreshold"))) (clojure.core/contains? input "MemoryThreshold") (clojure.core/assoc :memory-threshold (deser-double (input "MemoryThreshold"))) (clojure.core/contains? input "LoadThreshold") (clojure.core/assoc :load-threshold (deser-double (input "LoadThreshold"))) (clojure.core/contains? input "Alarms") (clojure.core/assoc :alarms (deser-strings (input "Alarms")))))

(clojure.core/defn- deser-layer-type [input] (clojure.core/get {"memcached" :memcached, "monitoring-master" :monitoringmaster, "custom" :custom, "web" :web, "db-master" :dbmaster, "rails-app" :railsapp, "php-app" :phpapp, "nodejs-app" :nodejsapp, "lb" :lb, "ecs-cluster" :ecscluster, "aws-flow-ruby" :awsflowruby, "java-app" :javaapp} input))

(clojure.core/defn- deser-virtualization-type [input] (clojure.core/get {"paravirtual" :paravirtual, "hvm" :hvm} input))

(clojure.core/defn- deser-block-device-mapping [input] (clojure.core/cond-> {} (clojure.core/contains? input "DeviceName") (clojure.core/assoc :device-name (deser-string (input "DeviceName"))) (clojure.core/contains? input "NoDevice") (clojure.core/assoc :no-device (deser-string (input "NoDevice"))) (clojure.core/contains? input "VirtualName") (clojure.core/assoc :virtual-name (deser-string (input "VirtualName"))) (clojure.core/contains? input "Ebs") (clojure.core/assoc :ebs (deser-ebs-block-device (input "Ebs")))))

(clojure.core/defn- deser-weekly-auto-scaling-schedule [input] (clojure.core/cond-> {} (clojure.core/contains? input "Monday") (clojure.core/assoc :monday (deser-daily-auto-scaling-schedule (input "Monday"))) (clojure.core/contains? input "Tuesday") (clojure.core/assoc :tuesday (deser-daily-auto-scaling-schedule (input "Tuesday"))) (clojure.core/contains? input "Wednesday") (clojure.core/assoc :wednesday (deser-daily-auto-scaling-schedule (input "Wednesday"))) (clojure.core/contains? input "Thursday") (clojure.core/assoc :thursday (deser-daily-auto-scaling-schedule (input "Thursday"))) (clojure.core/contains? input "Friday") (clojure.core/assoc :friday (deser-daily-auto-scaling-schedule (input "Friday"))) (clojure.core/contains? input "Saturday") (clojure.core/assoc :saturday (deser-daily-auto-scaling-schedule (input "Saturday"))) (clojure.core/contains? input "Sunday") (clojure.core/assoc :sunday (deser-daily-auto-scaling-schedule (input "Sunday")))))

(clojure.core/defn- deser-service-errors [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-service-error coll))) input))

(clojure.core/defn- deser-volume-configuration [input] (clojure.core/cond-> {:mount-point (deser-string (input "MountPoint")), :number-of-disks (deser-integer (input "NumberOfDisks")), :size (deser-integer (input "Size"))} (clojure.core/contains? input "RaidLevel") (clojure.core/assoc :raid-level (deser-integer (input "RaidLevel"))) (clojure.core/contains? input "VolumeType") (clojure.core/assoc :volume-type (deser-string (input "VolumeType"))) (clojure.core/contains? input "Iops") (clojure.core/assoc :iops (deser-integer (input "Iops"))) (clojure.core/contains? input "Encrypted") (clojure.core/assoc :encrypted (deser-boolean (input "Encrypted")))))

(clojure.core/defn- deser-instance [input] (clojure.core/cond-> {} (clojure.core/contains? input "PublicIp") (clojure.core/assoc :public-ip (deser-string (input "PublicIp"))) (clojure.core/contains? input "InstanceId") (clojure.core/assoc :instance-id (deser-string (input "InstanceId"))) (clojure.core/contains? input "EcsContainerInstanceArn") (clojure.core/assoc :ecs-container-instance-arn (deser-string (input "EcsContainerInstanceArn"))) (clojure.core/contains? input "Platform") (clojure.core/assoc :platform (deser-string (input "Platform"))) (clojure.core/contains? input "SecurityGroupIds") (clojure.core/assoc :security-group-ids (deser-strings (input "SecurityGroupIds"))) (clojure.core/contains? input "RegisteredBy") (clojure.core/assoc :registered-by (deser-string (input "RegisteredBy"))) (clojure.core/contains? input "SubnetId") (clojure.core/assoc :subnet-id (deser-string (input "SubnetId"))) (clojure.core/contains? input "Tenancy") (clojure.core/assoc :tenancy (deser-string (input "Tenancy"))) (clojure.core/contains? input "RootDeviceType") (clojure.core/assoc :root-device-type (deser-root-device-type (input "RootDeviceType"))) (clojure.core/contains? input "InfrastructureClass") (clojure.core/assoc :infrastructure-class (deser-string (input "InfrastructureClass"))) (clojure.core/contains? input "EbsOptimized") (clojure.core/assoc :ebs-optimized (deser-boolean (input "EbsOptimized"))) (clojure.core/contains? input "InstanceType") (clojure.core/assoc :instance-type (deser-string (input "InstanceType"))) (clojure.core/contains? input "InstanceProfileArn") (clojure.core/assoc :instance-profile-arn (deser-string (input "InstanceProfileArn"))) (clojure.core/contains? input "PublicDns") (clojure.core/assoc :public-dns (deser-string (input "PublicDns"))) (clojure.core/contains? input "AgentVersion") (clojure.core/assoc :agent-version (deser-string (input "AgentVersion"))) (clojure.core/contains? input "Os") (clojure.core/assoc :os (deser-string (input "Os"))) (clojure.core/contains? input "LayerIds") (clojure.core/assoc :layer-ids (deser-strings (input "LayerIds"))) (clojure.core/contains? input "RootDeviceVolumeId") (clojure.core/assoc :root-device-volume-id (deser-string (input "RootDeviceVolumeId"))) (clojure.core/contains? input "AvailabilityZone") (clojure.core/assoc :availability-zone (deser-string (input "AvailabilityZone"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-string (input "Status"))) (clojure.core/contains? input "Hostname") (clojure.core/assoc :hostname (deser-string (input "Hostname"))) (clojure.core/contains? input "LastServiceErrorId") (clojure.core/assoc :last-service-error-id (deser-string (input "LastServiceErrorId"))) (clojure.core/contains? input "ReportedAgentVersion") (clojure.core/assoc :reported-agent-version (deser-string (input "ReportedAgentVersion"))) (clojure.core/contains? input "ElasticIp") (clojure.core/assoc :elastic-ip (deser-string (input "ElasticIp"))) (clojure.core/contains? input "AmiId") (clojure.core/assoc :ami-id (deser-string (input "AmiId"))) (clojure.core/contains? input "PrivateDns") (clojure.core/assoc :private-dns (deser-string (input "PrivateDns"))) (clojure.core/contains? input "ReportedOs") (clojure.core/assoc :reported-os (deser-reported-os (input "ReportedOs"))) (clojure.core/contains? input "StackId") (clojure.core/assoc :stack-id (deser-string (input "StackId"))) (clojure.core/contains? input "Arn") (clojure.core/assoc :arn (deser-string (input "Arn"))) (clojure.core/contains? input "CreatedAt") (clojure.core/assoc :created-at (deser-date-time (input "CreatedAt"))) (clojure.core/contains? input "BlockDeviceMappings") (clojure.core/assoc :block-device-mappings (deser-block-device-mappings (input "BlockDeviceMappings"))) (clojure.core/contains? input "Architecture") (clojure.core/assoc :architecture (deser-architecture (input "Architecture"))) (clojure.core/contains? input "EcsClusterArn") (clojure.core/assoc :ecs-cluster-arn (deser-string (input "EcsClusterArn"))) (clojure.core/contains? input "InstallUpdatesOnBoot") (clojure.core/assoc :install-updates-on-boot (deser-boolean (input "InstallUpdatesOnBoot"))) (clojure.core/contains? input "VirtualizationType") (clojure.core/assoc :virtualization-type (deser-virtualization-type (input "VirtualizationType"))) (clojure.core/contains? input "Ec2InstanceId") (clojure.core/assoc :ec-2-instance-id (deser-string (input "Ec2InstanceId"))) (clojure.core/contains? input "SshHostDsaKeyFingerprint") (clojure.core/assoc :ssh-host-dsa-key-fingerprint (deser-string (input "SshHostDsaKeyFingerprint"))) (clojure.core/contains? input "AutoScalingType") (clojure.core/assoc :auto-scaling-type (deser-auto-scaling-type (input "AutoScalingType"))) (clojure.core/contains? input "SshHostRsaKeyFingerprint") (clojure.core/assoc :ssh-host-rsa-key-fingerprint (deser-string (input "SshHostRsaKeyFingerprint"))) (clojure.core/contains? input "SshKeyName") (clojure.core/assoc :ssh-key-name (deser-string (input "SshKeyName"))) (clojure.core/contains? input "PrivateIp") (clojure.core/assoc :private-ip (deser-string (input "PrivateIp")))))

(clojure.core/defn- deser-volume-configurations [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-volume-configuration coll))) input))

(clojure.core/defn- deser-auto-scaling-type [input] (clojure.core/get {"load" :load, "timer" :timer} input))

(clojure.core/defn- deser-deployment-command [input] (clojure.core/cond-> {:name (deser-deployment-command-name (input "Name"))} (clojure.core/contains? input "Args") (clojure.core/assoc :args (deser-deployment-command-args (input "Args")))))

(clojure.core/defn- deser-cloud-watch-logs-time-zone [input] (clojure.core/get {"LOCAL" :local, "UTC" :utc} input))

(clojure.core/defn- deser-layer-attributes [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-layer-attributes-keys k) (deser-string v)])) input))

(clojure.core/defn- deser-volumes [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-volume coll))) input))

(clojure.core/defn- deser-app-attributes-keys [input] (clojure.core/get {"DocumentRoot" :document-root, "RailsEnv" :rails-env, "AutoBundleOnDeploy" :auto-bundle-on-deploy, "AwsFlowRubySettings" :aws-flow-ruby-settings} input))

(clojure.core/defn- deser-stack [input] (clojure.core/cond-> {} (clojure.core/contains? input "CustomCookbooksSource") (clojure.core/assoc :custom-cookbooks-source (deser-source (input "CustomCookbooksSource"))) (clojure.core/contains? input "ServiceRoleArn") (clojure.core/assoc :service-role-arn (deser-string (input "ServiceRoleArn"))) (clojure.core/contains? input "HostnameTheme") (clojure.core/assoc :hostname-theme (deser-string (input "HostnameTheme"))) (clojure.core/contains? input "DefaultSshKeyName") (clojure.core/assoc :default-ssh-key-name (deser-string (input "DefaultSshKeyName"))) (clojure.core/contains? input "DefaultAvailabilityZone") (clojure.core/assoc :default-availability-zone (deser-string (input "DefaultAvailabilityZone"))) (clojure.core/contains? input "ChefConfiguration") (clojure.core/assoc :chef-configuration (deser-chef-configuration (input "ChefConfiguration"))) (clojure.core/contains? input "ConfigurationManager") (clojure.core/assoc :configuration-manager (deser-stack-configuration-manager (input "ConfigurationManager"))) (clojure.core/contains? input "AgentVersion") (clojure.core/assoc :agent-version (deser-string (input "AgentVersion"))) (clojure.core/contains? input "UseOpsworksSecurityGroups") (clojure.core/assoc :use-opsworks-security-groups (deser-boolean (input "UseOpsworksSecurityGroups"))) (clojure.core/contains? input "Attributes") (clojure.core/assoc :attributes (deser-stack-attributes (input "Attributes"))) (clojure.core/contains? input "DefaultRootDeviceType") (clojure.core/assoc :default-root-device-type (deser-root-device-type (input "DefaultRootDeviceType"))) (clojure.core/contains? input "VpcId") (clojure.core/assoc :vpc-id (deser-string (input "VpcId"))) (clojure.core/contains? input "UseCustomCookbooks") (clojure.core/assoc :use-custom-cookbooks (deser-boolean (input "UseCustomCookbooks"))) (clojure.core/contains? input "StackId") (clojure.core/assoc :stack-id (deser-string (input "StackId"))) (clojure.core/contains? input "DefaultInstanceProfileArn") (clojure.core/assoc :default-instance-profile-arn (deser-string (input "DefaultInstanceProfileArn"))) (clojure.core/contains? input "Arn") (clojure.core/assoc :arn (deser-string (input "Arn"))) (clojure.core/contains? input "CreatedAt") (clojure.core/assoc :created-at (deser-date-time (input "CreatedAt"))) (clojure.core/contains? input "CustomJson") (clojure.core/assoc :custom-json (deser-string (input "CustomJson"))) (clojure.core/contains? input "DefaultSubnetId") (clojure.core/assoc :default-subnet-id (deser-string (input "DefaultSubnetId"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-string (input "Name"))) (clojure.core/contains? input "Region") (clojure.core/assoc :region (deser-string (input "Region"))) (clojure.core/contains? input "DefaultOs") (clojure.core/assoc :default-os (deser-string (input "DefaultOs")))))

(clojure.core/defn- deser-operating-systems [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-operating-system coll))) input))

(clojure.core/defn- deser-instances [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-instance coll))) input))

(clojure.core/defn- deser-deployment-command-name [input] (clojure.core/get {"stop" :stop, "deploy" :deploy, "undeploy" :undeploy, "update_custom_cookbooks" :update-custom-cookbooks, "configure" :configure, "install_dependencies" :install-dependencies, "start" :start, "setup" :setup, "execute_recipes" :execute-recipes, "restart" :restart, "rollback" :rollback, "update_dependencies" :update-dependencies} input))

(clojure.core/defn- deser-service-error [input] (clojure.core/cond-> {} (clojure.core/contains? input "ServiceErrorId") (clojure.core/assoc :service-error-id (deser-string (input "ServiceErrorId"))) (clojure.core/contains? input "StackId") (clojure.core/assoc :stack-id (deser-string (input "StackId"))) (clojure.core/contains? input "InstanceId") (clojure.core/assoc :instance-id (deser-string (input "InstanceId"))) (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-string (input "Type"))) (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-string (input "Message"))) (clojure.core/contains? input "CreatedAt") (clojure.core/assoc :created-at (deser-date-time (input "CreatedAt")))))

(clojure.core/defn- deser-operating-system [input] (clojure.core/cond-> {} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-string (input "Name"))) (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-string (input "Id"))) (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-string (input "Type"))) (clojure.core/contains? input "ConfigurationManagers") (clojure.core/assoc :configuration-managers (deser-operating-system-configuration-managers (input "ConfigurationManagers"))) (clojure.core/contains? input "ReportedName") (clojure.core/assoc :reported-name (deser-string (input "ReportedName"))) (clojure.core/contains? input "ReportedVersion") (clojure.core/assoc :reported-version (deser-string (input "ReportedVersion"))) (clojure.core/contains? input "Supported") (clojure.core/assoc :supported (deser-boolean (input "Supported")))))

(clojure.core/defn- deser-cloud-watch-logs-log-stream [input] (clojure.core/cond-> {} (clojure.core/contains? input "BatchSize") (clojure.core/assoc :batch-size (deser-integer (input "BatchSize"))) (clojure.core/contains? input "Encoding") (clojure.core/assoc :encoding (deser-cloud-watch-logs-encoding (input "Encoding"))) (clojure.core/contains? input "InitialPosition") (clojure.core/assoc :initial-position (deser-cloud-watch-logs-initial-position (input "InitialPosition"))) (clojure.core/contains? input "File") (clojure.core/assoc :file (deser-string (input "File"))) (clojure.core/contains? input "BatchCount") (clojure.core/assoc :batch-count (deser-integer (input "BatchCount"))) (clojure.core/contains? input "TimeZone") (clojure.core/assoc :time-zone (deser-cloud-watch-logs-time-zone (input "TimeZone"))) (clojure.core/contains? input "MultiLineStartPattern") (clojure.core/assoc :multi-line-start-pattern (deser-string (input "MultiLineStartPattern"))) (clojure.core/contains? input "FileFingerprintLines") (clojure.core/assoc :file-fingerprint-lines (deser-string (input "FileFingerprintLines"))) (clojure.core/contains? input "LogGroupName") (clojure.core/assoc :log-group-name (deser-string (input "LogGroupName"))) (clojure.core/contains? input "BufferDuration") (clojure.core/assoc :buffer-duration (deser-integer (input "BufferDuration"))) (clojure.core/contains? input "DatetimeFormat") (clojure.core/assoc :datetime-format (deser-string (input "DatetimeFormat")))))

(clojure.core/defn- deser-elastic-load-balancers [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-elastic-load-balancer coll))) input))

(clojure.core/defn- deser-date-time [input] input)

(clojure.core/defn- deser-deployments [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-deployment coll))) input))

(clojure.core/defn- deser-boolean [input] input)

(clojure.core/defn- deser-describe-my-user-profile-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "UserProfile") (clojure.core/assoc :user-profile (deser-self-user-profile (input "UserProfile")))))

(clojure.core/defn- deser-describe-deployments-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "Deployments") (clojure.core/assoc :deployments (deser-deployments (input "Deployments")))))

(clojure.core/defn- deser-describe-permissions-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "Permissions") (clojure.core/assoc :permissions (deser-permissions (input "Permissions")))))

(clojure.core/defn- deser-validation-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-string (input "message")))))

(clojure.core/defn- deser-register-volume-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "VolumeId") (clojure.core/assoc :volume-id (deser-string (input "VolumeId")))))

(clojure.core/defn- deser-create-layer-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "LayerId") (clojure.core/assoc :layer-id (deser-string (input "LayerId")))))

(clojure.core/defn- deser-describe-volumes-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "Volumes") (clojure.core/assoc :volumes (deser-volumes (input "Volumes")))))

(clojure.core/defn- deser-describe-user-profiles-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "UserProfiles") (clojure.core/assoc :user-profiles (deser-user-profiles (input "UserProfiles")))))

(clojure.core/defn- deser-describe-raid-arrays-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "RaidArrays") (clojure.core/assoc :raid-arrays (deser-raid-arrays (input "RaidArrays")))))

(clojure.core/defn- deser-describe-operating-systems-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "OperatingSystems") (clojure.core/assoc :operating-systems (deser-operating-systems (input "OperatingSystems")))))

(clojure.core/defn- deser-describe-stack-provisioning-parameters-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "AgentInstallerUrl") (clojure.core/assoc :agent-installer-url (deser-string (input "AgentInstallerUrl"))) (clojure.core/contains? input "Parameters") (clojure.core/assoc :parameters (deser-parameters (input "Parameters")))))

(clojure.core/defn- deser-describe-agent-versions-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "AgentVersions") (clojure.core/assoc :agent-versions (deser-agent-versions (input "AgentVersions")))))

(clojure.core/defn- deser-create-stack-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "StackId") (clojure.core/assoc :stack-id (deser-string (input "StackId")))))

(clojure.core/defn- deser-grant-access-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "TemporaryCredential") (clojure.core/assoc :temporary-credential (deser-temporary-credential (input "TemporaryCredential")))))

(clojure.core/defn- deser-describe-elastic-ips-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "ElasticIps") (clojure.core/assoc :elastic-ips (deser-elastic-ips (input "ElasticIps")))))

(clojure.core/defn- deser-register-instance-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "InstanceId") (clojure.core/assoc :instance-id (deser-string (input "InstanceId")))))

(clojure.core/defn- deser-describe-load-based-auto-scaling-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "LoadBasedAutoScalingConfigurations") (clojure.core/assoc :load-based-auto-scaling-configurations (deser-load-based-auto-scaling-configurations (input "LoadBasedAutoScalingConfigurations")))))

(clojure.core/defn- deser-create-instance-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "InstanceId") (clojure.core/assoc :instance-id (deser-string (input "InstanceId")))))

(clojure.core/defn- deser-resource-not-found-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-string (input "message")))))

(clojure.core/defn- deser-create-app-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "AppId") (clojure.core/assoc :app-id (deser-string (input "AppId")))))

(clojure.core/defn- deser-describe-ecs-clusters-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "EcsClusters") (clojure.core/assoc :ecs-clusters (deser-ecs-clusters (input "EcsClusters"))) (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-string (input "NextToken")))))

(clojure.core/defn- deser-describe-stack-summary-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "StackSummary") (clojure.core/assoc :stack-summary (deser-stack-summary (input "StackSummary")))))

(clojure.core/defn- deser-get-hostname-suggestion-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "LayerId") (clojure.core/assoc :layer-id (deser-string (input "LayerId"))) (clojure.core/contains? input "Hostname") (clojure.core/assoc :hostname (deser-string (input "Hostname")))))

(clojure.core/defn- deser-describe-instances-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "Instances") (clojure.core/assoc :instances (deser-instances (input "Instances")))))

(clojure.core/defn- deser-create-user-profile-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "IamUserArn") (clojure.core/assoc :iam-user-arn (deser-string (input "IamUserArn")))))

(clojure.core/defn- deser-clone-stack-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "StackId") (clojure.core/assoc :stack-id (deser-string (input "StackId")))))

(clojure.core/defn- deser-create-deployment-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "DeploymentId") (clojure.core/assoc :deployment-id (deser-string (input "DeploymentId")))))

(clojure.core/defn- deser-describe-time-based-auto-scaling-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "TimeBasedAutoScalingConfigurations") (clojure.core/assoc :time-based-auto-scaling-configurations (deser-time-based-auto-scaling-configurations (input "TimeBasedAutoScalingConfigurations")))))

(clojure.core/defn- deser-list-tags-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "Tags") (clojure.core/assoc :tags (deser-tags (input "Tags"))) (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-next-token (input "NextToken")))))

(clojure.core/defn- deser-describe-service-errors-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "ServiceErrors") (clojure.core/assoc :service-errors (deser-service-errors (input "ServiceErrors")))))

(clojure.core/defn- deser-describe-stacks-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "Stacks") (clojure.core/assoc :stacks (deser-stacks (input "Stacks")))))

(clojure.core/defn- deser-register-ecs-cluster-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "EcsClusterArn") (clojure.core/assoc :ecs-cluster-arn (deser-string (input "EcsClusterArn")))))

(clojure.core/defn- deser-describe-rds-db-instances-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "RdsDbInstances") (clojure.core/assoc :rds-db-instances (deser-rds-db-instances (input "RdsDbInstances")))))

(clojure.core/defn- deser-describe-commands-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "Commands") (clojure.core/assoc :commands (deser-commands (input "Commands")))))

(clojure.core/defn- deser-describe-layers-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "Layers") (clojure.core/assoc :layers (deser-layers (input "Layers")))))

(clojure.core/defn- deser-describe-apps-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "Apps") (clojure.core/assoc :apps (deser-apps (input "Apps")))))

(clojure.core/defn- deser-describe-elastic-load-balancers-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "ElasticLoadBalancers") (clojure.core/assoc :elastic-load-balancers (deser-elastic-load-balancers (input "ElasticLoadBalancers")))))

(clojure.core/defn- deser-register-elastic-ip-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "ElasticIp") (clojure.core/assoc :elastic-ip (deser-string (input "ElasticIp")))))

(clojure.spec.alpha/def :portkey.aws.opsworks/tag-keys (clojure.spec.alpha/coll-of :portkey.aws.opsworks/tag-key))

(clojure.spec.alpha/def :portkey.aws.opsworks/app-type #{"static" :other :static "java" :nodejs "php" :java "other" "aws-flow-ruby" :php :rails :awsflowruby "rails" "nodejs"})

(clojure.spec.alpha/def :portkey.aws.opsworks.describe-elastic-ips-request/instance-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.describe-elastic-ips-request/stack-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.describe-elastic-ips-request/ips (clojure.spec.alpha/and :portkey.aws.opsworks/strings))
(clojure.spec.alpha/def :portkey.aws.opsworks/describe-elastic-ips-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.describe-elastic-ips-request/instance-id :portkey.aws.opsworks.describe-elastic-ips-request/stack-id :portkey.aws.opsworks.describe-elastic-ips-request/ips]))

(clojure.spec.alpha/def :portkey.aws.opsworks/switch (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.opsworks.register-instance-request/stack-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.register-instance-request/hostname (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.register-instance-request/public-ip (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.register-instance-request/private-ip (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.register-instance-request/rsa-public-key (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.register-instance-request/rsa-public-key-fingerprint (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/register-instance-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworks.register-instance-request/stack-id] :opt-un [:portkey.aws.opsworks.register-instance-request/hostname :portkey.aws.opsworks.register-instance-request/public-ip :portkey.aws.opsworks.register-instance-request/private-ip :portkey.aws.opsworks.register-instance-request/rsa-public-key :portkey.aws.opsworks.register-instance-request/rsa-public-key-fingerprint :portkey.aws.opsworks/instance-identity]))

(clojure.spec.alpha/def :portkey.aws.opsworks.describe-my-user-profile-result/user-profile (clojure.spec.alpha/and :portkey.aws.opsworks/self-user-profile))
(clojure.spec.alpha/def :portkey.aws.opsworks/describe-my-user-profile-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.describe-my-user-profile-result/user-profile]))

(clojure.spec.alpha/def :portkey.aws.opsworks.recipes/setup (clojure.spec.alpha/and :portkey.aws.opsworks/strings))
(clojure.spec.alpha/def :portkey.aws.opsworks.recipes/configure (clojure.spec.alpha/and :portkey.aws.opsworks/strings))
(clojure.spec.alpha/def :portkey.aws.opsworks.recipes/deploy (clojure.spec.alpha/and :portkey.aws.opsworks/strings))
(clojure.spec.alpha/def :portkey.aws.opsworks.recipes/undeploy (clojure.spec.alpha/and :portkey.aws.opsworks/strings))
(clojure.spec.alpha/def :portkey.aws.opsworks.recipes/shutdown (clojure.spec.alpha/and :portkey.aws.opsworks/strings))
(clojure.spec.alpha/def :portkey.aws.opsworks/recipes (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.recipes/setup :portkey.aws.opsworks.recipes/configure :portkey.aws.opsworks.recipes/deploy :portkey.aws.opsworks.recipes/undeploy :portkey.aws.opsworks.recipes/shutdown]))

(clojure.spec.alpha/def :portkey.aws.opsworks/time-based-auto-scaling-configurations (clojure.spec.alpha/coll-of :portkey.aws.opsworks/time-based-auto-scaling-configuration))

(clojure.spec.alpha/def :portkey.aws.opsworks/double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.opsworks.set-load-based-auto-scaling-request/layer-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.set-load-based-auto-scaling-request/enable (clojure.spec.alpha/and :portkey.aws.opsworks/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworks.set-load-based-auto-scaling-request/up-scaling (clojure.spec.alpha/and :portkey.aws.opsworks/auto-scaling-thresholds))
(clojure.spec.alpha/def :portkey.aws.opsworks.set-load-based-auto-scaling-request/down-scaling (clojure.spec.alpha/and :portkey.aws.opsworks/auto-scaling-thresholds))
(clojure.spec.alpha/def :portkey.aws.opsworks/set-load-based-auto-scaling-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworks.set-load-based-auto-scaling-request/layer-id] :opt-un [:portkey.aws.opsworks.set-load-based-auto-scaling-request/enable :portkey.aws.opsworks.set-load-based-auto-scaling-request/up-scaling :portkey.aws.opsworks.set-load-based-auto-scaling-request/down-scaling]))

(clojure.spec.alpha/def :portkey.aws.opsworks/permissions (clojure.spec.alpha/coll-of :portkey.aws.opsworks/permission))

(clojure.spec.alpha/def :portkey.aws.opsworks/describe-deployments-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks/deployments]))

(clojure.spec.alpha/def :portkey.aws.opsworks/describe-permissions-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks/permissions]))

(clojure.spec.alpha/def :portkey.aws.opsworks/ecs-clusters (clojure.spec.alpha/coll-of :portkey.aws.opsworks/ecs-cluster))

(clojure.spec.alpha/def :portkey.aws.opsworks.associate-elastic-ip-request/elastic-ip (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.associate-elastic-ip-request/instance-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/associate-elastic-ip-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworks.associate-elastic-ip-request/elastic-ip] :opt-un [:portkey.aws.opsworks.associate-elastic-ip-request/instance-id]))

(clojure.spec.alpha/def :portkey.aws.opsworks.user-profile/iam-user-arn (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.user-profile/name (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.user-profile/ssh-username (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.user-profile/ssh-public-key (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.user-profile/allow-self-management (clojure.spec.alpha/and :portkey.aws.opsworks/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworks/user-profile (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.user-profile/iam-user-arn :portkey.aws.opsworks.user-profile/name :portkey.aws.opsworks.user-profile/ssh-username :portkey.aws.opsworks.user-profile/ssh-public-key :portkey.aws.opsworks.user-profile/allow-self-management]))

(clojure.spec.alpha/def :portkey.aws.opsworks.self-user-profile/iam-user-arn (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.self-user-profile/name (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.self-user-profile/ssh-username (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.self-user-profile/ssh-public-key (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/self-user-profile (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.self-user-profile/iam-user-arn :portkey.aws.opsworks.self-user-profile/name :portkey.aws.opsworks.self-user-profile/ssh-username :portkey.aws.opsworks.self-user-profile/ssh-public-key]))

(clojure.spec.alpha/def :portkey.aws.opsworks.get-hostname-suggestion-request/layer-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/get-hostname-suggestion-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworks.get-hostname-suggestion-request/layer-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.opsworks.validation-exception/message (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/validation-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.validation-exception/message]))

(clojure.spec.alpha/def :portkey.aws.opsworks.deployment/instance-ids (clojure.spec.alpha/and :portkey.aws.opsworks/strings))
(clojure.spec.alpha/def :portkey.aws.opsworks.deployment/completed-at (clojure.spec.alpha/and :portkey.aws.opsworks/date-time))
(clojure.spec.alpha/def :portkey.aws.opsworks.deployment/comment (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.deployment/status (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.deployment/deployment-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.deployment/duration (clojure.spec.alpha/and :portkey.aws.opsworks/integer))
(clojure.spec.alpha/def :portkey.aws.opsworks.deployment/stack-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.deployment/command (clojure.spec.alpha/and :portkey.aws.opsworks/deployment-command))
(clojure.spec.alpha/def :portkey.aws.opsworks.deployment/app-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.deployment/created-at (clojure.spec.alpha/and :portkey.aws.opsworks/date-time))
(clojure.spec.alpha/def :portkey.aws.opsworks.deployment/custom-json (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.deployment/iam-user-arn (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/deployment (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.deployment/instance-ids :portkey.aws.opsworks.deployment/completed-at :portkey.aws.opsworks.deployment/comment :portkey.aws.opsworks.deployment/status :portkey.aws.opsworks.deployment/deployment-id :portkey.aws.opsworks.deployment/duration :portkey.aws.opsworks.deployment/stack-id :portkey.aws.opsworks.deployment/command :portkey.aws.opsworks.deployment/app-id :portkey.aws.opsworks.deployment/created-at :portkey.aws.opsworks.deployment/custom-json :portkey.aws.opsworks.deployment/iam-user-arn]))

(clojure.spec.alpha/def :portkey.aws.opsworks.register-volume-result/volume-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/register-volume-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.register-volume-result/volume-id]))

(clojure.spec.alpha/def :portkey.aws.opsworks.raid-array/instance-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.raid-array/mount-point (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.raid-array/availability-zone (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.raid-array/raid-array-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.raid-array/number-of-disks (clojure.spec.alpha/and :portkey.aws.opsworks/integer))
(clojure.spec.alpha/def :portkey.aws.opsworks.raid-array/size (clojure.spec.alpha/and :portkey.aws.opsworks/integer))
(clojure.spec.alpha/def :portkey.aws.opsworks.raid-array/stack-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.raid-array/iops (clojure.spec.alpha/and :portkey.aws.opsworks/integer))
(clojure.spec.alpha/def :portkey.aws.opsworks.raid-array/raid-level (clojure.spec.alpha/and :portkey.aws.opsworks/integer))
(clojure.spec.alpha/def :portkey.aws.opsworks.raid-array/volume-type (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.raid-array/created-at (clojure.spec.alpha/and :portkey.aws.opsworks/date-time))
(clojure.spec.alpha/def :portkey.aws.opsworks.raid-array/name (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.raid-array/device (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/raid-array (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.raid-array/instance-id :portkey.aws.opsworks.raid-array/mount-point :portkey.aws.opsworks.raid-array/availability-zone :portkey.aws.opsworks.raid-array/raid-array-id :portkey.aws.opsworks.raid-array/number-of-disks :portkey.aws.opsworks.raid-array/size :portkey.aws.opsworks.raid-array/stack-id :portkey.aws.opsworks.raid-array/iops :portkey.aws.opsworks.raid-array/raid-level :portkey.aws.opsworks.raid-array/volume-type :portkey.aws.opsworks.raid-array/created-at :portkey.aws.opsworks.raid-array/name :portkey.aws.opsworks.raid-array/device]))

(clojure.spec.alpha/def :portkey.aws.opsworks.create-app-request/shortname (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.create-app-request/type (clojure.spec.alpha/and :portkey.aws.opsworks/app-type))
(clojure.spec.alpha/def :portkey.aws.opsworks.create-app-request/enable-ssl (clojure.spec.alpha/and :portkey.aws.opsworks/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworks.create-app-request/domains (clojure.spec.alpha/and :portkey.aws.opsworks/strings))
(clojure.spec.alpha/def :portkey.aws.opsworks.create-app-request/app-source (clojure.spec.alpha/and :portkey.aws.opsworks/source))
(clojure.spec.alpha/def :portkey.aws.opsworks.create-app-request/attributes (clojure.spec.alpha/and :portkey.aws.opsworks/app-attributes))
(clojure.spec.alpha/def :portkey.aws.opsworks.create-app-request/description (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.create-app-request/stack-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.create-app-request/environment (clojure.spec.alpha/and :portkey.aws.opsworks/environment-variables))
(clojure.spec.alpha/def :portkey.aws.opsworks.create-app-request/name (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/create-app-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworks.create-app-request/stack-id :portkey.aws.opsworks.create-app-request/name :portkey.aws.opsworks.create-app-request/type] :opt-un [:portkey.aws.opsworks.create-app-request/shortname :portkey.aws.opsworks.create-app-request/enable-ssl :portkey.aws.opsworks.create-app-request/domains :portkey.aws.opsworks.create-app-request/app-source :portkey.aws.opsworks.create-app-request/attributes :portkey.aws.opsworks/data-sources :portkey.aws.opsworks.create-app-request/description :portkey.aws.opsworks/ssl-configuration :portkey.aws.opsworks.create-app-request/environment]))

(clojure.spec.alpha/def :portkey.aws.opsworks.describe-load-based-auto-scaling-request/layer-ids (clojure.spec.alpha/and :portkey.aws.opsworks/strings))
(clojure.spec.alpha/def :portkey.aws.opsworks/describe-load-based-auto-scaling-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworks.describe-load-based-auto-scaling-request/layer-ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.opsworks.create-layer-result/layer-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/create-layer-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.create-layer-result/layer-id]))

(clojure.spec.alpha/def :portkey.aws.opsworks.volume/instance-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.volume/mount-point (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.volume/encrypted (clojure.spec.alpha/and :portkey.aws.opsworks/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworks.volume/ec-2-volume-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.volume/availability-zone (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.volume/status (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.volume/raid-array-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.volume/size (clojure.spec.alpha/and :portkey.aws.opsworks/integer))
(clojure.spec.alpha/def :portkey.aws.opsworks.volume/iops (clojure.spec.alpha/and :portkey.aws.opsworks/integer))
(clojure.spec.alpha/def :portkey.aws.opsworks.volume/volume-type (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.volume/volume-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.volume/name (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.volume/device (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.volume/region (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/volume (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.volume/instance-id :portkey.aws.opsworks.volume/mount-point :portkey.aws.opsworks.volume/encrypted :portkey.aws.opsworks.volume/ec-2-volume-id :portkey.aws.opsworks.volume/availability-zone :portkey.aws.opsworks.volume/status :portkey.aws.opsworks.volume/raid-array-id :portkey.aws.opsworks.volume/size :portkey.aws.opsworks.volume/iops :portkey.aws.opsworks.volume/volume-type :portkey.aws.opsworks.volume/volume-id :portkey.aws.opsworks.volume/name :portkey.aws.opsworks.volume/device :portkey.aws.opsworks.volume/region]))

(clojure.spec.alpha/def :portkey.aws.opsworks.permission/stack-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.permission/iam-user-arn (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.permission/allow-ssh (clojure.spec.alpha/and :portkey.aws.opsworks/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworks.permission/allow-sudo (clojure.spec.alpha/and :portkey.aws.opsworks/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworks.permission/level (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/permission (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.permission/stack-id :portkey.aws.opsworks.permission/iam-user-arn :portkey.aws.opsworks.permission/allow-ssh :portkey.aws.opsworks.permission/allow-sudo :portkey.aws.opsworks.permission/level]))

(clojure.spec.alpha/def :portkey.aws.opsworks.ebs-block-device/snapshot-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.ebs-block-device/iops (clojure.spec.alpha/and :portkey.aws.opsworks/integer))
(clojure.spec.alpha/def :portkey.aws.opsworks.ebs-block-device/volume-size (clojure.spec.alpha/and :portkey.aws.opsworks/integer))
(clojure.spec.alpha/def :portkey.aws.opsworks.ebs-block-device/delete-on-termination (clojure.spec.alpha/and :portkey.aws.opsworks/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworks/ebs-block-device (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.ebs-block-device/snapshot-id :portkey.aws.opsworks.ebs-block-device/iops :portkey.aws.opsworks.ebs-block-device/volume-size :portkey.aws.opsworks/volume-type :portkey.aws.opsworks.ebs-block-device/delete-on-termination]))

(clojure.spec.alpha/def :portkey.aws.opsworks.app/shortname (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.app/type (clojure.spec.alpha/and :portkey.aws.opsworks/app-type))
(clojure.spec.alpha/def :portkey.aws.opsworks.app/enable-ssl (clojure.spec.alpha/and :portkey.aws.opsworks/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworks.app/domains (clojure.spec.alpha/and :portkey.aws.opsworks/strings))
(clojure.spec.alpha/def :portkey.aws.opsworks.app/app-source (clojure.spec.alpha/and :portkey.aws.opsworks/source))
(clojure.spec.alpha/def :portkey.aws.opsworks.app/attributes (clojure.spec.alpha/and :portkey.aws.opsworks/app-attributes))
(clojure.spec.alpha/def :portkey.aws.opsworks.app/description (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.app/stack-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.app/environment (clojure.spec.alpha/and :portkey.aws.opsworks/environment-variables))
(clojure.spec.alpha/def :portkey.aws.opsworks.app/app-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.app/created-at (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.app/name (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/app (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.app/shortname :portkey.aws.opsworks.app/type :portkey.aws.opsworks.app/enable-ssl :portkey.aws.opsworks.app/domains :portkey.aws.opsworks.app/app-source :portkey.aws.opsworks.app/attributes :portkey.aws.opsworks/data-sources :portkey.aws.opsworks.app/description :portkey.aws.opsworks/ssl-configuration :portkey.aws.opsworks.app/stack-id :portkey.aws.opsworks.app/environment :portkey.aws.opsworks.app/app-id :portkey.aws.opsworks.app/created-at :portkey.aws.opsworks.app/name]))

(clojure.spec.alpha/def :portkey.aws.opsworks.operating-system-configuration-manager/name (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.operating-system-configuration-manager/version (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/operating-system-configuration-manager (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.operating-system-configuration-manager/name :portkey.aws.opsworks.operating-system-configuration-manager/version]))

(clojure.spec.alpha/def :portkey.aws.opsworks.set-permission-request/stack-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.set-permission-request/iam-user-arn (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.set-permission-request/allow-ssh (clojure.spec.alpha/and :portkey.aws.opsworks/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworks.set-permission-request/allow-sudo (clojure.spec.alpha/and :portkey.aws.opsworks/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworks.set-permission-request/level (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/set-permission-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworks.set-permission-request/stack-id :portkey.aws.opsworks.set-permission-request/iam-user-arn] :opt-un [:portkey.aws.opsworks.set-permission-request/allow-ssh :portkey.aws.opsworks.set-permission-request/allow-sudo :portkey.aws.opsworks.set-permission-request/level]))

(clojure.spec.alpha/def :portkey.aws.opsworks/layers (clojure.spec.alpha/coll-of :portkey.aws.opsworks/layer))

(clojure.spec.alpha/def :portkey.aws.opsworks.source/type (clojure.spec.alpha/and :portkey.aws.opsworks/source-type))
(clojure.spec.alpha/def :portkey.aws.opsworks.source/url (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.source/username (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.source/password (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.source/ssh-key (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.source/revision (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/source (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.source/type :portkey.aws.opsworks.source/url :portkey.aws.opsworks.source/username :portkey.aws.opsworks.source/password :portkey.aws.opsworks.source/ssh-key :portkey.aws.opsworks.source/revision]))

(clojure.spec.alpha/def :portkey.aws.opsworks/describe-volumes-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks/volumes]))

(clojure.spec.alpha/def :portkey.aws.opsworks/describe-user-profiles-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks/user-profiles]))

(clojure.spec.alpha/def :portkey.aws.opsworks.update-app-request/type (clojure.spec.alpha/and :portkey.aws.opsworks/app-type))
(clojure.spec.alpha/def :portkey.aws.opsworks.update-app-request/enable-ssl (clojure.spec.alpha/and :portkey.aws.opsworks/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworks.update-app-request/domains (clojure.spec.alpha/and :portkey.aws.opsworks/strings))
(clojure.spec.alpha/def :portkey.aws.opsworks.update-app-request/app-source (clojure.spec.alpha/and :portkey.aws.opsworks/source))
(clojure.spec.alpha/def :portkey.aws.opsworks.update-app-request/attributes (clojure.spec.alpha/and :portkey.aws.opsworks/app-attributes))
(clojure.spec.alpha/def :portkey.aws.opsworks.update-app-request/description (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.update-app-request/environment (clojure.spec.alpha/and :portkey.aws.opsworks/environment-variables))
(clojure.spec.alpha/def :portkey.aws.opsworks.update-app-request/app-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.update-app-request/name (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/update-app-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworks.update-app-request/app-id] :opt-un [:portkey.aws.opsworks.update-app-request/type :portkey.aws.opsworks.update-app-request/enable-ssl :portkey.aws.opsworks.update-app-request/domains :portkey.aws.opsworks.update-app-request/app-source :portkey.aws.opsworks.update-app-request/attributes :portkey.aws.opsworks/data-sources :portkey.aws.opsworks.update-app-request/description :portkey.aws.opsworks/ssl-configuration :portkey.aws.opsworks.update-app-request/environment :portkey.aws.opsworks.update-app-request/name]))

(clojure.spec.alpha/def :portkey.aws.opsworks.shutdown-event-configuration/execution-timeout (clojure.spec.alpha/and :portkey.aws.opsworks/integer))
(clojure.spec.alpha/def :portkey.aws.opsworks.shutdown-event-configuration/delay-until-elb-connections-drained (clojure.spec.alpha/and :portkey.aws.opsworks/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworks/shutdown-event-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.shutdown-event-configuration/execution-timeout :portkey.aws.opsworks.shutdown-event-configuration/delay-until-elb-connections-drained]))

(clojure.spec.alpha/def :portkey.aws.opsworks.register-ecs-cluster-request/ecs-cluster-arn (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.register-ecs-cluster-request/stack-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/register-ecs-cluster-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworks.register-ecs-cluster-request/ecs-cluster-arn :portkey.aws.opsworks.register-ecs-cluster-request/stack-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.opsworks.register-elastic-ip-request/elastic-ip (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.register-elastic-ip-request/stack-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/register-elastic-ip-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworks.register-elastic-ip-request/elastic-ip :portkey.aws.opsworks.register-elastic-ip-request/stack-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.opsworks.delete-stack-request/stack-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/delete-stack-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworks.delete-stack-request/stack-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.opsworks/root-device-type #{:ebs "ebs" "instance-store" :instancestore})

(clojure.spec.alpha/def :portkey.aws.opsworks.set-time-based-auto-scaling-request/instance-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.set-time-based-auto-scaling-request/auto-scaling-schedule (clojure.spec.alpha/and :portkey.aws.opsworks/weekly-auto-scaling-schedule))
(clojure.spec.alpha/def :portkey.aws.opsworks/set-time-based-auto-scaling-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworks.set-time-based-auto-scaling-request/instance-id] :opt-un [:portkey.aws.opsworks.set-time-based-auto-scaling-request/auto-scaling-schedule]))

(clojure.spec.alpha/def :portkey.aws.opsworks/environment-variables (clojure.spec.alpha/coll-of :portkey.aws.opsworks/environment-variable))

(clojure.spec.alpha/def :portkey.aws.opsworks.describe-agent-versions-request/stack-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.describe-agent-versions-request/configuration-manager (clojure.spec.alpha/and :portkey.aws.opsworks/stack-configuration-manager))
(clojure.spec.alpha/def :portkey.aws.opsworks/describe-agent-versions-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.describe-agent-versions-request/stack-id :portkey.aws.opsworks.describe-agent-versions-request/configuration-manager]))

(clojure.spec.alpha/def :portkey.aws.opsworks.create-stack-request/custom-cookbooks-source (clojure.spec.alpha/and :portkey.aws.opsworks/source))
(clojure.spec.alpha/def :portkey.aws.opsworks.create-stack-request/service-role-arn (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.create-stack-request/hostname-theme (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.create-stack-request/default-ssh-key-name (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.create-stack-request/default-availability-zone (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.create-stack-request/configuration-manager (clojure.spec.alpha/and :portkey.aws.opsworks/stack-configuration-manager))
(clojure.spec.alpha/def :portkey.aws.opsworks.create-stack-request/agent-version (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.create-stack-request/use-opsworks-security-groups (clojure.spec.alpha/and :portkey.aws.opsworks/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworks.create-stack-request/attributes (clojure.spec.alpha/and :portkey.aws.opsworks/stack-attributes))
(clojure.spec.alpha/def :portkey.aws.opsworks.create-stack-request/default-root-device-type (clojure.spec.alpha/and :portkey.aws.opsworks/root-device-type))
(clojure.spec.alpha/def :portkey.aws.opsworks.create-stack-request/vpc-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.create-stack-request/use-custom-cookbooks (clojure.spec.alpha/and :portkey.aws.opsworks/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworks.create-stack-request/default-instance-profile-arn (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.create-stack-request/custom-json (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.create-stack-request/default-subnet-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.create-stack-request/name (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.create-stack-request/region (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.create-stack-request/default-os (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/create-stack-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworks.create-stack-request/name :portkey.aws.opsworks.create-stack-request/region :portkey.aws.opsworks.create-stack-request/service-role-arn :portkey.aws.opsworks.create-stack-request/default-instance-profile-arn] :opt-un [:portkey.aws.opsworks.create-stack-request/custom-cookbooks-source :portkey.aws.opsworks.create-stack-request/hostname-theme :portkey.aws.opsworks.create-stack-request/default-ssh-key-name :portkey.aws.opsworks.create-stack-request/default-availability-zone :portkey.aws.opsworks/chef-configuration :portkey.aws.opsworks.create-stack-request/configuration-manager :portkey.aws.opsworks.create-stack-request/agent-version :portkey.aws.opsworks.create-stack-request/use-opsworks-security-groups :portkey.aws.opsworks.create-stack-request/attributes :portkey.aws.opsworks.create-stack-request/default-root-device-type :portkey.aws.opsworks.create-stack-request/vpc-id :portkey.aws.opsworks.create-stack-request/use-custom-cookbooks :portkey.aws.opsworks.create-stack-request/custom-json :portkey.aws.opsworks.create-stack-request/default-subnet-id :portkey.aws.opsworks.create-stack-request/default-os]))

(clojure.spec.alpha/def :portkey.aws.opsworks/describe-raid-arrays-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks/raid-arrays]))

(clojure.spec.alpha/def :portkey.aws.opsworks.ecs-cluster/ecs-cluster-arn (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.ecs-cluster/ecs-cluster-name (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.ecs-cluster/stack-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.ecs-cluster/registered-at (clojure.spec.alpha/and :portkey.aws.opsworks/date-time))
(clojure.spec.alpha/def :portkey.aws.opsworks/ecs-cluster (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.ecs-cluster/ecs-cluster-arn :portkey.aws.opsworks.ecs-cluster/ecs-cluster-name :portkey.aws.opsworks.ecs-cluster/stack-id :portkey.aws.opsworks.ecs-cluster/registered-at]))

(clojure.spec.alpha/def :portkey.aws.opsworks/user-profiles (clojure.spec.alpha/coll-of :portkey.aws.opsworks/user-profile))

(clojure.spec.alpha/def :portkey.aws.opsworks.chef-configuration/manage-berkshelf (clojure.spec.alpha/and :portkey.aws.opsworks/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworks.chef-configuration/berkshelf-version (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/chef-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.chef-configuration/manage-berkshelf :portkey.aws.opsworks.chef-configuration/berkshelf-version]))

(clojure.spec.alpha/def :portkey.aws.opsworks/parameters (clojure.spec.alpha/map-of :portkey.aws.opsworks/string :portkey.aws.opsworks/string))

(clojure.spec.alpha/def :portkey.aws.opsworks/describe-operating-systems-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks/operating-systems]))

(clojure.spec.alpha/def :portkey.aws.opsworks.clone-stack-request/custom-cookbooks-source (clojure.spec.alpha/and :portkey.aws.opsworks/source))
(clojure.spec.alpha/def :portkey.aws.opsworks.clone-stack-request/service-role-arn (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.clone-stack-request/hostname-theme (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.clone-stack-request/default-ssh-key-name (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.clone-stack-request/default-availability-zone (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.clone-stack-request/configuration-manager (clojure.spec.alpha/and :portkey.aws.opsworks/stack-configuration-manager))
(clojure.spec.alpha/def :portkey.aws.opsworks.clone-stack-request/agent-version (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.clone-stack-request/use-opsworks-security-groups (clojure.spec.alpha/and :portkey.aws.opsworks/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworks.clone-stack-request/attributes (clojure.spec.alpha/and :portkey.aws.opsworks/stack-attributes))
(clojure.spec.alpha/def :portkey.aws.opsworks.clone-stack-request/source-stack-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.clone-stack-request/default-root-device-type (clojure.spec.alpha/and :portkey.aws.opsworks/root-device-type))
(clojure.spec.alpha/def :portkey.aws.opsworks.clone-stack-request/vpc-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.clone-stack-request/use-custom-cookbooks (clojure.spec.alpha/and :portkey.aws.opsworks/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworks.clone-stack-request/default-instance-profile-arn (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.clone-stack-request/custom-json (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.clone-stack-request/default-subnet-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.clone-stack-request/clone-app-ids (clojure.spec.alpha/and :portkey.aws.opsworks/strings))
(clojure.spec.alpha/def :portkey.aws.opsworks.clone-stack-request/name (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.clone-stack-request/region (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.clone-stack-request/default-os (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.clone-stack-request/clone-permissions (clojure.spec.alpha/and :portkey.aws.opsworks/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworks/clone-stack-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworks.clone-stack-request/source-stack-id :portkey.aws.opsworks.clone-stack-request/service-role-arn] :opt-un [:portkey.aws.opsworks.clone-stack-request/custom-cookbooks-source :portkey.aws.opsworks.clone-stack-request/hostname-theme :portkey.aws.opsworks.clone-stack-request/default-ssh-key-name :portkey.aws.opsworks.clone-stack-request/default-availability-zone :portkey.aws.opsworks/chef-configuration :portkey.aws.opsworks.clone-stack-request/configuration-manager :portkey.aws.opsworks.clone-stack-request/agent-version :portkey.aws.opsworks.clone-stack-request/use-opsworks-security-groups :portkey.aws.opsworks.clone-stack-request/attributes :portkey.aws.opsworks.clone-stack-request/default-root-device-type :portkey.aws.opsworks.clone-stack-request/vpc-id :portkey.aws.opsworks.clone-stack-request/use-custom-cookbooks :portkey.aws.opsworks.clone-stack-request/default-instance-profile-arn :portkey.aws.opsworks.clone-stack-request/custom-json :portkey.aws.opsworks.clone-stack-request/default-subnet-id :portkey.aws.opsworks.clone-stack-request/clone-app-ids :portkey.aws.opsworks.clone-stack-request/name :portkey.aws.opsworks.clone-stack-request/region :portkey.aws.opsworks.clone-stack-request/default-os :portkey.aws.opsworks.clone-stack-request/clone-permissions]))

(clojure.spec.alpha/def :portkey.aws.opsworks.deregister-instance-request/instance-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/deregister-instance-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworks.deregister-instance-request/instance-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.opsworks.describe-stack-provisioning-parameters-result/agent-installer-url (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/describe-stack-provisioning-parameters-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.describe-stack-provisioning-parameters-result/agent-installer-url :portkey.aws.opsworks/parameters]))

(clojure.spec.alpha/def :portkey.aws.opsworks.update-layer-request/custom-recipes (clojure.spec.alpha/and :portkey.aws.opsworks/recipes))
(clojure.spec.alpha/def :portkey.aws.opsworks.update-layer-request/shortname (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.update-layer-request/layer-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.update-layer-request/custom-security-group-ids (clojure.spec.alpha/and :portkey.aws.opsworks/strings))
(clojure.spec.alpha/def :portkey.aws.opsworks.update-layer-request/enable-auto-healing (clojure.spec.alpha/and :portkey.aws.opsworks/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworks.update-layer-request/use-ebs-optimized-instances (clojure.spec.alpha/and :portkey.aws.opsworks/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworks.update-layer-request/auto-assign-public-ips (clojure.spec.alpha/and :portkey.aws.opsworks/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworks.update-layer-request/attributes (clojure.spec.alpha/and :portkey.aws.opsworks/layer-attributes))
(clojure.spec.alpha/def :portkey.aws.opsworks.update-layer-request/auto-assign-elastic-ips (clojure.spec.alpha/and :portkey.aws.opsworks/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworks.update-layer-request/packages (clojure.spec.alpha/and :portkey.aws.opsworks/strings))
(clojure.spec.alpha/def :portkey.aws.opsworks.update-layer-request/custom-json (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.update-layer-request/install-updates-on-boot (clojure.spec.alpha/and :portkey.aws.opsworks/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworks.update-layer-request/name (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.update-layer-request/custom-instance-profile-arn (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/update-layer-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworks.update-layer-request/layer-id] :opt-un [:portkey.aws.opsworks.update-layer-request/custom-recipes :portkey.aws.opsworks.update-layer-request/shortname :portkey.aws.opsworks.update-layer-request/custom-security-group-ids :portkey.aws.opsworks.update-layer-request/enable-auto-healing :portkey.aws.opsworks.update-layer-request/use-ebs-optimized-instances :portkey.aws.opsworks/lifecycle-event-configuration :portkey.aws.opsworks.update-layer-request/auto-assign-public-ips :portkey.aws.opsworks/cloud-watch-logs-configuration :portkey.aws.opsworks.update-layer-request/attributes :portkey.aws.opsworks.update-layer-request/auto-assign-elastic-ips :portkey.aws.opsworks.update-layer-request/packages :portkey.aws.opsworks.update-layer-request/custom-json :portkey.aws.opsworks.update-layer-request/install-updates-on-boot :portkey.aws.opsworks/volume-configurations :portkey.aws.opsworks.update-layer-request/name :portkey.aws.opsworks.update-layer-request/custom-instance-profile-arn]))

(clojure.spec.alpha/def :portkey.aws.opsworks/load-based-auto-scaling-configurations (clojure.spec.alpha/coll-of :portkey.aws.opsworks/load-based-auto-scaling-configuration))

(clojure.spec.alpha/def :portkey.aws.opsworks.assign-instance-request/instance-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.assign-instance-request/layer-ids (clojure.spec.alpha/and :portkey.aws.opsworks/strings))
(clojure.spec.alpha/def :portkey.aws.opsworks/assign-instance-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworks.assign-instance-request/instance-id :portkey.aws.opsworks.assign-instance-request/layer-ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.opsworks/tag-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.opsworks/tags (clojure.spec.alpha/map-of :portkey.aws.opsworks/tag-key :portkey.aws.opsworks/tag-value))

(clojure.spec.alpha/def :portkey.aws.opsworks.describe-raid-arrays-request/instance-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.describe-raid-arrays-request/stack-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.describe-raid-arrays-request/raid-array-ids (clojure.spec.alpha/and :portkey.aws.opsworks/strings))
(clojure.spec.alpha/def :portkey.aws.opsworks/describe-raid-arrays-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.describe-raid-arrays-request/instance-id :portkey.aws.opsworks.describe-raid-arrays-request/stack-id :portkey.aws.opsworks.describe-raid-arrays-request/raid-array-ids]))

(clojure.spec.alpha/def :portkey.aws.opsworks.elastic-load-balancer/dns-name (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.elastic-load-balancer/elastic-load-balancer-name (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.elastic-load-balancer/subnet-ids (clojure.spec.alpha/and :portkey.aws.opsworks/strings))
(clojure.spec.alpha/def :portkey.aws.opsworks.elastic-load-balancer/layer-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.elastic-load-balancer/vpc-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.elastic-load-balancer/stack-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.elastic-load-balancer/ec-2-instance-ids (clojure.spec.alpha/and :portkey.aws.opsworks/strings))
(clojure.spec.alpha/def :portkey.aws.opsworks.elastic-load-balancer/availability-zones (clojure.spec.alpha/and :portkey.aws.opsworks/strings))
(clojure.spec.alpha/def :portkey.aws.opsworks.elastic-load-balancer/region (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/elastic-load-balancer (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.elastic-load-balancer/dns-name :portkey.aws.opsworks.elastic-load-balancer/elastic-load-balancer-name :portkey.aws.opsworks.elastic-load-balancer/subnet-ids :portkey.aws.opsworks.elastic-load-balancer/layer-id :portkey.aws.opsworks.elastic-load-balancer/vpc-id :portkey.aws.opsworks.elastic-load-balancer/stack-id :portkey.aws.opsworks.elastic-load-balancer/ec-2-instance-ids :portkey.aws.opsworks.elastic-load-balancer/availability-zones :portkey.aws.opsworks.elastic-load-balancer/region]))

(clojure.spec.alpha/def :portkey.aws.opsworks.describe-commands-request/deployment-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.describe-commands-request/instance-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.describe-commands-request/command-ids (clojure.spec.alpha/and :portkey.aws.opsworks/strings))
(clojure.spec.alpha/def :portkey.aws.opsworks/describe-commands-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.describe-commands-request/deployment-id :portkey.aws.opsworks.describe-commands-request/instance-id :portkey.aws.opsworks.describe-commands-request/command-ids]))

(clojure.spec.alpha/def :portkey.aws.opsworks/describe-agent-versions-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks/agent-versions]))

(clojure.spec.alpha/def :portkey.aws.opsworks.delete-instance-request/instance-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.delete-instance-request/delete-elastic-ip (clojure.spec.alpha/and :portkey.aws.opsworks/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworks.delete-instance-request/delete-volumes (clojure.spec.alpha/and :portkey.aws.opsworks/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworks/delete-instance-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworks.delete-instance-request/instance-id] :opt-un [:portkey.aws.opsworks.delete-instance-request/delete-elastic-ip :portkey.aws.opsworks.delete-instance-request/delete-volumes]))

(clojure.spec.alpha/def :portkey.aws.opsworks.agent-version/version (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.agent-version/configuration-manager (clojure.spec.alpha/and :portkey.aws.opsworks/stack-configuration-manager))
(clojure.spec.alpha/def :portkey.aws.opsworks/agent-version (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.agent-version/version :portkey.aws.opsworks.agent-version/configuration-manager]))

(clojure.spec.alpha/def :portkey.aws.opsworks.deregister-elastic-ip-request/elastic-ip (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/deregister-elastic-ip-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworks.deregister-elastic-ip-request/elastic-ip] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.opsworks.update-my-user-profile-request/ssh-public-key (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/update-my-user-profile-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.update-my-user-profile-request/ssh-public-key]))

(clojure.spec.alpha/def :portkey.aws.opsworks/source-type #{:s-3 "svn" :git "archive" :svn "s3" "git" :archive})

(clojure.spec.alpha/def :portkey.aws.opsworks.describe-instances-request/stack-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.describe-instances-request/layer-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.describe-instances-request/instance-ids (clojure.spec.alpha/and :portkey.aws.opsworks/strings))
(clojure.spec.alpha/def :portkey.aws.opsworks/describe-instances-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.describe-instances-request/stack-id :portkey.aws.opsworks.describe-instances-request/layer-id :portkey.aws.opsworks.describe-instances-request/instance-ids]))

(clojure.spec.alpha/def :portkey.aws.opsworks/valid-for-in-minutes (clojure.spec.alpha/int-in 60 1440))

(clojure.spec.alpha/def :portkey.aws.opsworks.update-stack-request/custom-cookbooks-source (clojure.spec.alpha/and :portkey.aws.opsworks/source))
(clojure.spec.alpha/def :portkey.aws.opsworks.update-stack-request/service-role-arn (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.update-stack-request/hostname-theme (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.update-stack-request/default-ssh-key-name (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.update-stack-request/default-availability-zone (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.update-stack-request/configuration-manager (clojure.spec.alpha/and :portkey.aws.opsworks/stack-configuration-manager))
(clojure.spec.alpha/def :portkey.aws.opsworks.update-stack-request/agent-version (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.update-stack-request/use-opsworks-security-groups (clojure.spec.alpha/and :portkey.aws.opsworks/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworks.update-stack-request/attributes (clojure.spec.alpha/and :portkey.aws.opsworks/stack-attributes))
(clojure.spec.alpha/def :portkey.aws.opsworks.update-stack-request/default-root-device-type (clojure.spec.alpha/and :portkey.aws.opsworks/root-device-type))
(clojure.spec.alpha/def :portkey.aws.opsworks.update-stack-request/use-custom-cookbooks (clojure.spec.alpha/and :portkey.aws.opsworks/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworks.update-stack-request/stack-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.update-stack-request/default-instance-profile-arn (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.update-stack-request/custom-json (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.update-stack-request/default-subnet-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.update-stack-request/name (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.update-stack-request/default-os (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/update-stack-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworks.update-stack-request/stack-id] :opt-un [:portkey.aws.opsworks.update-stack-request/custom-cookbooks-source :portkey.aws.opsworks.update-stack-request/service-role-arn :portkey.aws.opsworks.update-stack-request/hostname-theme :portkey.aws.opsworks.update-stack-request/default-ssh-key-name :portkey.aws.opsworks.update-stack-request/default-availability-zone :portkey.aws.opsworks/chef-configuration :portkey.aws.opsworks.update-stack-request/configuration-manager :portkey.aws.opsworks.update-stack-request/agent-version :portkey.aws.opsworks.update-stack-request/use-opsworks-security-groups :portkey.aws.opsworks.update-stack-request/attributes :portkey.aws.opsworks.update-stack-request/default-root-device-type :portkey.aws.opsworks.update-stack-request/use-custom-cookbooks :portkey.aws.opsworks.update-stack-request/default-instance-profile-arn :portkey.aws.opsworks.update-stack-request/custom-json :portkey.aws.opsworks.update-stack-request/default-subnet-id :portkey.aws.opsworks.update-stack-request/name :portkey.aws.opsworks.update-stack-request/default-os]))

(clojure.spec.alpha/def :portkey.aws.opsworks/strings (clojure.spec.alpha/coll-of :portkey.aws.opsworks/string))

(clojure.spec.alpha/def :portkey.aws.opsworks.lifecycle-event-configuration/shutdown (clojure.spec.alpha/and :portkey.aws.opsworks/shutdown-event-configuration))
(clojure.spec.alpha/def :portkey.aws.opsworks/lifecycle-event-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.lifecycle-event-configuration/shutdown]))

(clojure.spec.alpha/def :portkey.aws.opsworks.rds-db-instance/address (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.rds-db-instance/db-user (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.rds-db-instance/db-instance-identifier (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.rds-db-instance/db-password (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.rds-db-instance/missing-on-rds (clojure.spec.alpha/and :portkey.aws.opsworks/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworks.rds-db-instance/stack-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.rds-db-instance/engine (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.rds-db-instance/region (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.rds-db-instance/rds-db-instance-arn (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/rds-db-instance (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.rds-db-instance/address :portkey.aws.opsworks.rds-db-instance/db-user :portkey.aws.opsworks.rds-db-instance/db-instance-identifier :portkey.aws.opsworks.rds-db-instance/db-password :portkey.aws.opsworks.rds-db-instance/missing-on-rds :portkey.aws.opsworks.rds-db-instance/stack-id :portkey.aws.opsworks.rds-db-instance/engine :portkey.aws.opsworks.rds-db-instance/region :portkey.aws.opsworks.rds-db-instance/rds-db-instance-arn]))

(clojure.spec.alpha/def :portkey.aws.opsworks/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.opsworks.stop-instance-request/instance-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.stop-instance-request/force (clojure.spec.alpha/and :portkey.aws.opsworks/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworks/stop-instance-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworks.stop-instance-request/instance-id] :opt-un [:portkey.aws.opsworks.stop-instance-request/force]))

(clojure.spec.alpha/def :portkey.aws.opsworks.unassign-instance-request/instance-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/unassign-instance-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworks.unassign-instance-request/instance-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.opsworks.describe-stack-provisioning-parameters-request/stack-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/describe-stack-provisioning-parameters-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworks.describe-stack-provisioning-parameters-request/stack-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.opsworks/commands (clojure.spec.alpha/coll-of :portkey.aws.opsworks/command))

(clojure.spec.alpha/def :portkey.aws.opsworks.create-stack-result/stack-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/create-stack-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.create-stack-result/stack-id]))

(clojure.spec.alpha/def :portkey.aws.opsworks/minute (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.opsworks.describe-layers-request/stack-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.describe-layers-request/layer-ids (clojure.spec.alpha/and :portkey.aws.opsworks/strings))
(clojure.spec.alpha/def :portkey.aws.opsworks/describe-layers-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.describe-layers-request/stack-id :portkey.aws.opsworks.describe-layers-request/layer-ids]))

(clojure.spec.alpha/def :portkey.aws.opsworks/deployment-command-args (clojure.spec.alpha/map-of :portkey.aws.opsworks/string :portkey.aws.opsworks/strings))

(clojure.spec.alpha/def :portkey.aws.opsworks.cloud-watch-logs-configuration/enabled (clojure.spec.alpha/and :portkey.aws.opsworks/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworks.cloud-watch-logs-configuration/log-streams (clojure.spec.alpha/and :portkey.aws.opsworks/cloud-watch-logs-log-streams))
(clojure.spec.alpha/def :portkey.aws.opsworks/cloud-watch-logs-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.cloud-watch-logs-configuration/enabled :portkey.aws.opsworks.cloud-watch-logs-configuration/log-streams]))

(clojure.spec.alpha/def :portkey.aws.opsworks.unassign-volume-request/volume-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/unassign-volume-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworks.unassign-volume-request/volume-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.opsworks/daily-auto-scaling-schedule (clojure.spec.alpha/map-of :portkey.aws.opsworks/hour :portkey.aws.opsworks/switch))

(clojure.spec.alpha/def :portkey.aws.opsworks/rds-db-instances (clojure.spec.alpha/coll-of :portkey.aws.opsworks/rds-db-instance))

(clojure.spec.alpha/def :portkey.aws.opsworks/grant-access-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks/temporary-credential]))

(clojure.spec.alpha/def :portkey.aws.opsworks/tag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworks/resource-arn :portkey.aws.opsworks/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.opsworks.elastic-ip/ip (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.elastic-ip/name (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.elastic-ip/domain (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.elastic-ip/region (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.elastic-ip/instance-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/elastic-ip (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.elastic-ip/ip :portkey.aws.opsworks.elastic-ip/name :portkey.aws.opsworks.elastic-ip/domain :portkey.aws.opsworks.elastic-ip/region :portkey.aws.opsworks.elastic-ip/instance-id]))

(clojure.spec.alpha/def :portkey.aws.opsworks.update-volume-request/volume-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.update-volume-request/name (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.update-volume-request/mount-point (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/update-volume-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworks.update-volume-request/volume-id] :opt-un [:portkey.aws.opsworks.update-volume-request/name :portkey.aws.opsworks.update-volume-request/mount-point]))

(clojure.spec.alpha/def :portkey.aws.opsworks/describe-elastic-ips-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks/elastic-ips]))

(clojure.spec.alpha/def :portkey.aws.opsworks/data-sources (clojure.spec.alpha/coll-of :portkey.aws.opsworks/data-source))

(clojure.spec.alpha/def :portkey.aws.opsworks.update-instance-request/instance-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.update-instance-request/ebs-optimized (clojure.spec.alpha/and :portkey.aws.opsworks/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworks.update-instance-request/instance-type (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.update-instance-request/agent-version (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.update-instance-request/os (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.update-instance-request/layer-ids (clojure.spec.alpha/and :portkey.aws.opsworks/strings))
(clojure.spec.alpha/def :portkey.aws.opsworks.update-instance-request/hostname (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.update-instance-request/ami-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.update-instance-request/install-updates-on-boot (clojure.spec.alpha/and :portkey.aws.opsworks/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworks.update-instance-request/ssh-key-name (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/update-instance-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworks.update-instance-request/instance-id] :opt-un [:portkey.aws.opsworks.update-instance-request/ebs-optimized :portkey.aws.opsworks.update-instance-request/instance-type :portkey.aws.opsworks.update-instance-request/agent-version :portkey.aws.opsworks.update-instance-request/os :portkey.aws.opsworks.update-instance-request/layer-ids :portkey.aws.opsworks.update-instance-request/hostname :portkey.aws.opsworks.update-instance-request/ami-id :portkey.aws.opsworks/architecture :portkey.aws.opsworks.update-instance-request/install-updates-on-boot :portkey.aws.opsworks/auto-scaling-type :portkey.aws.opsworks.update-instance-request/ssh-key-name]))

(clojure.spec.alpha/def :portkey.aws.opsworks.load-based-auto-scaling-configuration/layer-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.load-based-auto-scaling-configuration/enable (clojure.spec.alpha/and :portkey.aws.opsworks/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworks.load-based-auto-scaling-configuration/up-scaling (clojure.spec.alpha/and :portkey.aws.opsworks/auto-scaling-thresholds))
(clojure.spec.alpha/def :portkey.aws.opsworks.load-based-auto-scaling-configuration/down-scaling (clojure.spec.alpha/and :portkey.aws.opsworks/auto-scaling-thresholds))
(clojure.spec.alpha/def :portkey.aws.opsworks/load-based-auto-scaling-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.load-based-auto-scaling-configuration/layer-id :portkey.aws.opsworks.load-based-auto-scaling-configuration/enable :portkey.aws.opsworks.load-based-auto-scaling-configuration/up-scaling :portkey.aws.opsworks.load-based-auto-scaling-configuration/down-scaling]))

(clojure.spec.alpha/def :portkey.aws.opsworks.layer/custom-recipes (clojure.spec.alpha/and :portkey.aws.opsworks/recipes))
(clojure.spec.alpha/def :portkey.aws.opsworks.layer/shortname (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.layer/layer-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.layer/type (clojure.spec.alpha/and :portkey.aws.opsworks/layer-type))
(clojure.spec.alpha/def :portkey.aws.opsworks.layer/default-security-group-names (clojure.spec.alpha/and :portkey.aws.opsworks/strings))
(clojure.spec.alpha/def :portkey.aws.opsworks.layer/custom-security-group-ids (clojure.spec.alpha/and :portkey.aws.opsworks/strings))
(clojure.spec.alpha/def :portkey.aws.opsworks.layer/enable-auto-healing (clojure.spec.alpha/and :portkey.aws.opsworks/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworks.layer/use-ebs-optimized-instances (clojure.spec.alpha/and :portkey.aws.opsworks/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworks.layer/auto-assign-public-ips (clojure.spec.alpha/and :portkey.aws.opsworks/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworks.layer/attributes (clojure.spec.alpha/and :portkey.aws.opsworks/layer-attributes))
(clojure.spec.alpha/def :portkey.aws.opsworks.layer/stack-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.layer/default-recipes (clojure.spec.alpha/and :portkey.aws.opsworks/recipes))
(clojure.spec.alpha/def :portkey.aws.opsworks.layer/auto-assign-elastic-ips (clojure.spec.alpha/and :portkey.aws.opsworks/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworks.layer/arn (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.layer/packages (clojure.spec.alpha/and :portkey.aws.opsworks/strings))
(clojure.spec.alpha/def :portkey.aws.opsworks.layer/created-at (clojure.spec.alpha/and :portkey.aws.opsworks/date-time))
(clojure.spec.alpha/def :portkey.aws.opsworks.layer/custom-json (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.layer/install-updates-on-boot (clojure.spec.alpha/and :portkey.aws.opsworks/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworks.layer/name (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.layer/custom-instance-profile-arn (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/layer (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.layer/custom-recipes :portkey.aws.opsworks.layer/shortname :portkey.aws.opsworks.layer/layer-id :portkey.aws.opsworks.layer/type :portkey.aws.opsworks.layer/default-security-group-names :portkey.aws.opsworks.layer/custom-security-group-ids :portkey.aws.opsworks.layer/enable-auto-healing :portkey.aws.opsworks.layer/use-ebs-optimized-instances :portkey.aws.opsworks/lifecycle-event-configuration :portkey.aws.opsworks.layer/auto-assign-public-ips :portkey.aws.opsworks/cloud-watch-logs-configuration :portkey.aws.opsworks.layer/attributes :portkey.aws.opsworks.layer/stack-id :portkey.aws.opsworks.layer/default-recipes :portkey.aws.opsworks.layer/auto-assign-elastic-ips :portkey.aws.opsworks.layer/arn :portkey.aws.opsworks.layer/packages :portkey.aws.opsworks.layer/created-at :portkey.aws.opsworks.layer/custom-json :portkey.aws.opsworks.layer/install-updates-on-boot :portkey.aws.opsworks/volume-configurations :portkey.aws.opsworks.layer/name :portkey.aws.opsworks.layer/custom-instance-profile-arn]))

(clojure.spec.alpha/def :portkey.aws.opsworks.detach-elastic-load-balancer-request/elastic-load-balancer-name (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.detach-elastic-load-balancer-request/layer-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/detach-elastic-load-balancer-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworks.detach-elastic-load-balancer-request/elastic-load-balancer-name :portkey.aws.opsworks.detach-elastic-load-balancer-request/layer-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.opsworks.grant-access-request/instance-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/grant-access-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworks.grant-access-request/instance-id] :opt-un [:portkey.aws.opsworks/valid-for-in-minutes]))

(clojure.spec.alpha/def :portkey.aws.opsworks.start-stack-request/stack-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/start-stack-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworks.start-stack-request/stack-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.opsworks.register-instance-result/instance-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/register-instance-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.register-instance-result/instance-id]))

(clojure.spec.alpha/def :portkey.aws.opsworks/describe-load-based-auto-scaling-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks/load-based-auto-scaling-configurations]))

(clojure.spec.alpha/def :portkey.aws.opsworks.temporary-credential/username (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.temporary-credential/password (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.temporary-credential/valid-for-in-minutes (clojure.spec.alpha/and :portkey.aws.opsworks/integer))
(clojure.spec.alpha/def :portkey.aws.opsworks.temporary-credential/instance-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/temporary-credential (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.temporary-credential/username :portkey.aws.opsworks.temporary-credential/password :portkey.aws.opsworks.temporary-credential/valid-for-in-minutes :portkey.aws.opsworks.temporary-credential/instance-id]))

(clojure.spec.alpha/def :portkey.aws.opsworks.create-instance-result/instance-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/create-instance-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.create-instance-result/instance-id]))

(clojure.spec.alpha/def :portkey.aws.opsworks/hour (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.opsworks.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.opsworks.delete-user-profile-request/iam-user-arn (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/delete-user-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworks.delete-user-profile-request/iam-user-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.opsworks.create-app-result/app-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/create-app-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.create-app-result/app-id]))

(clojure.spec.alpha/def :portkey.aws.opsworks/apps (clojure.spec.alpha/coll-of :portkey.aws.opsworks/app))

(clojure.spec.alpha/def :portkey.aws.opsworks.update-user-profile-request/iam-user-arn (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.update-user-profile-request/ssh-username (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.update-user-profile-request/ssh-public-key (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.update-user-profile-request/allow-self-management (clojure.spec.alpha/and :portkey.aws.opsworks/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworks/update-user-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworks.update-user-profile-request/iam-user-arn] :opt-un [:portkey.aws.opsworks.update-user-profile-request/ssh-username :portkey.aws.opsworks.update-user-profile-request/ssh-public-key :portkey.aws.opsworks.update-user-profile-request/allow-self-management]))

(clojure.spec.alpha/def :portkey.aws.opsworks.describe-ecs-clusters-result/next-token (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/describe-ecs-clusters-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks/ecs-clusters :portkey.aws.opsworks.describe-ecs-clusters-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.opsworks.describe-permissions-request/iam-user-arn (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.describe-permissions-request/stack-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/describe-permissions-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.describe-permissions-request/iam-user-arn :portkey.aws.opsworks.describe-permissions-request/stack-id]))

(clojure.spec.alpha/def :portkey.aws.opsworks/tag-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.opsworks.describe-user-profiles-request/iam-user-arns (clojure.spec.alpha/and :portkey.aws.opsworks/strings))
(clojure.spec.alpha/def :portkey.aws.opsworks/describe-user-profiles-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.describe-user-profiles-request/iam-user-arns]))

(clojure.spec.alpha/def :portkey.aws.opsworks.environment-variable/key (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.environment-variable/value (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.environment-variable/secure (clojure.spec.alpha/and :portkey.aws.opsworks/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworks/environment-variable (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworks.environment-variable/key :portkey.aws.opsworks.environment-variable/value] :opt-un [:portkey.aws.opsworks.environment-variable/secure]))

(clojure.spec.alpha/def :portkey.aws.opsworks.create-layer-request/custom-recipes (clojure.spec.alpha/and :portkey.aws.opsworks/recipes))
(clojure.spec.alpha/def :portkey.aws.opsworks.create-layer-request/shortname (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.create-layer-request/type (clojure.spec.alpha/and :portkey.aws.opsworks/layer-type))
(clojure.spec.alpha/def :portkey.aws.opsworks.create-layer-request/custom-security-group-ids (clojure.spec.alpha/and :portkey.aws.opsworks/strings))
(clojure.spec.alpha/def :portkey.aws.opsworks.create-layer-request/enable-auto-healing (clojure.spec.alpha/and :portkey.aws.opsworks/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworks.create-layer-request/use-ebs-optimized-instances (clojure.spec.alpha/and :portkey.aws.opsworks/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworks.create-layer-request/auto-assign-public-ips (clojure.spec.alpha/and :portkey.aws.opsworks/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworks.create-layer-request/attributes (clojure.spec.alpha/and :portkey.aws.opsworks/layer-attributes))
(clojure.spec.alpha/def :portkey.aws.opsworks.create-layer-request/stack-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.create-layer-request/auto-assign-elastic-ips (clojure.spec.alpha/and :portkey.aws.opsworks/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworks.create-layer-request/packages (clojure.spec.alpha/and :portkey.aws.opsworks/strings))
(clojure.spec.alpha/def :portkey.aws.opsworks.create-layer-request/custom-json (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.create-layer-request/install-updates-on-boot (clojure.spec.alpha/and :portkey.aws.opsworks/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworks.create-layer-request/name (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.create-layer-request/custom-instance-profile-arn (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/create-layer-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworks.create-layer-request/stack-id :portkey.aws.opsworks.create-layer-request/type :portkey.aws.opsworks.create-layer-request/name :portkey.aws.opsworks.create-layer-request/shortname] :opt-un [:portkey.aws.opsworks.create-layer-request/custom-recipes :portkey.aws.opsworks.create-layer-request/custom-security-group-ids :portkey.aws.opsworks.create-layer-request/enable-auto-healing :portkey.aws.opsworks.create-layer-request/use-ebs-optimized-instances :portkey.aws.opsworks/lifecycle-event-configuration :portkey.aws.opsworks.create-layer-request/auto-assign-public-ips :portkey.aws.opsworks/cloud-watch-logs-configuration :portkey.aws.opsworks.create-layer-request/attributes :portkey.aws.opsworks.create-layer-request/auto-assign-elastic-ips :portkey.aws.opsworks.create-layer-request/packages :portkey.aws.opsworks.create-layer-request/custom-json :portkey.aws.opsworks.create-layer-request/install-updates-on-boot :portkey.aws.opsworks/volume-configurations :portkey.aws.opsworks.create-layer-request/custom-instance-profile-arn]))

(clojure.spec.alpha/def :portkey.aws.opsworks.create-deployment-request/stack-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.create-deployment-request/app-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.create-deployment-request/instance-ids (clojure.spec.alpha/and :portkey.aws.opsworks/strings))
(clojure.spec.alpha/def :portkey.aws.opsworks.create-deployment-request/layer-ids (clojure.spec.alpha/and :portkey.aws.opsworks/strings))
(clojure.spec.alpha/def :portkey.aws.opsworks.create-deployment-request/command (clojure.spec.alpha/and :portkey.aws.opsworks/deployment-command))
(clojure.spec.alpha/def :portkey.aws.opsworks.create-deployment-request/comment (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.create-deployment-request/custom-json (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/create-deployment-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworks.create-deployment-request/stack-id :portkey.aws.opsworks.create-deployment-request/command] :opt-un [:portkey.aws.opsworks.create-deployment-request/app-id :portkey.aws.opsworks.create-deployment-request/instance-ids :portkey.aws.opsworks.create-deployment-request/layer-ids :portkey.aws.opsworks.create-deployment-request/comment :portkey.aws.opsworks.create-deployment-request/custom-json]))

(clojure.spec.alpha/def :portkey.aws.opsworks.ssl-configuration/certificate (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.ssl-configuration/private-key (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.ssl-configuration/chain (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/ssl-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworks.ssl-configuration/certificate :portkey.aws.opsworks.ssl-configuration/private-key] :opt-un [:portkey.aws.opsworks.ssl-configuration/chain]))

(clojure.spec.alpha/def :portkey.aws.opsworks/cloud-watch-logs-encoding #{:euc-kr "johab" :cp-1251 "cp863" :cp-866 :cp-1258 "utf_16" :ascii :iso-8859-14 "gb18030" :cp-1026 :cp-1255 "mac_latin2" "cp737" :iso-8859-13 "ascii" :koi-8-r :cp-720 :gb-2312 :iso-8859-15 :cp-424 "utf_16_be" "iso8859_3" :cp-860 "shift_jisx0213" "cp864" "cp1255" :iso-8859-2 :cp-862 "cp865" :cp-1006 :iso-8859-3 "euc_jp" "cp856" "iso8859_15" "big5hkscs" "cp932" :mac-iceland "cp850" "shift_jis_2004" "cp424" :utf-32 :cp-875 :utf-16 :mac-greek "iso8859_6" :euc-jisx-0213 :iso-8859-9 :iso-2022-jp-2004 "euc_jisx0213" :cp-932 "cp720" "mac_roman" "cp1026" :iso-2022-jp-3 "cp1250" :cp-1256 "cp874" :shift-jis :euc-jp :iso-2022-jp :cp-857 :iso-8859-6 "cp1006" :mac-roman :hz "iso8859_7" "cp869" :iso-8859-7 :utf-7 :iso-8859-8 "iso8859_14" "iso2022_jp_2004" :cp-775 "iso2022_kr" "iso2022_jp_1" "cp950" :cp-864 :big-5 :cp-874 "cp500" :cp-1250 "cp1254" "iso2022_jp_2" "cp037" "hz" :koi-8-u :gbk "iso2022_jp_3" "iso2022_jp_ext" :cp-950 "utf_32_le" :mac-latin-2 "iso8859_13" :cp-1140 "iso8859_5" :cp-850 :shift-jisx-0213 :big-5hkscs :mac-cyrillic "cp852" :utf-8 "cp1140" "mac_cyrillic" "cp861" "big5" "cp949" "mac_iceland" "euc_kr" :cp-855 "iso8859_10" :cp-437 "iso8859_2" :iso-8859-10 "cp857" "ptcp154" "gb2312" :iso-2022-jp-1 "cp862" :latin-1 "utf_32_be" "iso8859_9" "cp437" "iso8859_8" :cp-858 :cp-1253 :cp-1257 "cp1251" "koi8_u" :cp-861 "iso8859_4" "utf_32" :gb-18030 :cp-737 :cp-856 :iso-2022-jp-ext :utf-8-sig "shift_jis" "cp1257" "cp1252" "iso8859_16" :cp-865 "utf_16_le" :cp-037 "latin_1" "utf_8" :iso-8859-5 "cp1256" "cp855" :johab :utf-32-be "mac_turkish" :cp-949 "euc_jis_2004" "cp1253" :ptcp-154 "cp858" :iso-8859-4 :euc-jis-2004 "mac_greek" :iso-2022-jp-2 "utf_7" :shift-jis-2004 :utf-16-be :cp-500 :utf-16-le "cp866" "cp860" :mac-turkish "cp1258" :cp-852 "cp875" :cp-869 :iso-2022-kr "cp775" :iso-8859-16 :utf-32-le :cp-1252 "koi8_r" :cp-863 "iso2022_jp" :cp-1254 "gbk" "utf_8_sig"})

(clojure.spec.alpha/def :portkey.aws.opsworks/stack-attributes (clojure.spec.alpha/map-of :portkey.aws.opsworks/stack-attributes-keys :portkey.aws.opsworks/string))

(clojure.spec.alpha/def :portkey.aws.opsworks/cloud-watch-logs-log-streams (clojure.spec.alpha/coll-of :portkey.aws.opsworks/cloud-watch-logs-log-stream))

(clojure.spec.alpha/def :portkey.aws.opsworks/stack-attributes-keys #{:color "Color"})

(clojure.spec.alpha/def :portkey.aws.opsworks.describe-service-errors-request/stack-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.describe-service-errors-request/instance-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.describe-service-errors-request/service-error-ids (clojure.spec.alpha/and :portkey.aws.opsworks/strings))
(clojure.spec.alpha/def :portkey.aws.opsworks/describe-service-errors-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.describe-service-errors-request/stack-id :portkey.aws.opsworks.describe-service-errors-request/instance-id :portkey.aws.opsworks.describe-service-errors-request/service-error-ids]))

(clojure.spec.alpha/def :portkey.aws.opsworks/elastic-ips (clojure.spec.alpha/coll-of :portkey.aws.opsworks/elastic-ip))

(clojure.spec.alpha/def :portkey.aws.opsworks/stacks (clojure.spec.alpha/coll-of :portkey.aws.opsworks/stack))

(clojure.spec.alpha/def :portkey.aws.opsworks.delete-app-request/app-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/delete-app-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworks.delete-app-request/app-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.opsworks/layer-attributes-keys #{:passenger-version "JvmVersion" :enable-haproxy-stats "JavaAppServerVersion" "MysqlRootPassword" "HaproxyHealthCheckUrl" :rails-stack :ganglia-url "MemcachedMemory" :haproxy-health-check-url :rubygems-version :jvm-version "HaproxyHealthCheckMethod" "RubyVersion" :haproxy-health-check-method :memcached-memory "GangliaUrl" "HaproxyStatsPassword" "BundlerVersion" :java-app-server "GangliaPassword" "Jvm" :jvm-options "EnableHaproxyStats" "RailsStack" "NodejsVersion" :ganglia-password "PassengerVersion" :mysql-root-password :jvm :manage-bundler :ruby-version "RubygemsVersion" "GangliaUser" :haproxy-stats-password :bundler-version :java-app-server-version :haproxy-stats-url "EcsClusterArn" "HaproxyStatsUser" :ecs-cluster-arn :ganglia-user :mysql-root-password-ubiquitous :haproxy-stats-user "HaproxyStatsUrl" "ManageBundler" "MysqlRootPasswordUbiquitous" "JvmOptions" "JavaAppServer" :nodejs-version})

(clojure.spec.alpha/def :portkey.aws.opsworks/describe-stack-summary-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks/stack-summary]))

(clojure.spec.alpha/def :portkey.aws.opsworks.reported-os/family (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.reported-os/name (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.reported-os/version (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/reported-os (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.reported-os/family :portkey.aws.opsworks.reported-os/name :portkey.aws.opsworks.reported-os/version]))

(clojure.spec.alpha/def :portkey.aws.opsworks/agent-versions (clojure.spec.alpha/coll-of :portkey.aws.opsworks/agent-version))

(clojure.spec.alpha/def :portkey.aws.opsworks.describe-volumes-request/instance-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.describe-volumes-request/stack-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.describe-volumes-request/raid-array-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.describe-volumes-request/volume-ids (clojure.spec.alpha/and :portkey.aws.opsworks/strings))
(clojure.spec.alpha/def :portkey.aws.opsworks/describe-volumes-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.describe-volumes-request/instance-id :portkey.aws.opsworks.describe-volumes-request/stack-id :portkey.aws.opsworks.describe-volumes-request/raid-array-id :portkey.aws.opsworks.describe-volumes-request/volume-ids]))

(clojure.spec.alpha/def :portkey.aws.opsworks/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.opsworks/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.opsworks.deregister-ecs-cluster-request/ecs-cluster-arn (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/deregister-ecs-cluster-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworks.deregister-ecs-cluster-request/ecs-cluster-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.opsworks.stack-summary/stack-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.stack-summary/name (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.stack-summary/arn (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.stack-summary/layers-count (clojure.spec.alpha/and :portkey.aws.opsworks/integer))
(clojure.spec.alpha/def :portkey.aws.opsworks.stack-summary/apps-count (clojure.spec.alpha/and :portkey.aws.opsworks/integer))
(clojure.spec.alpha/def :portkey.aws.opsworks/stack-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.stack-summary/stack-id :portkey.aws.opsworks.stack-summary/name :portkey.aws.opsworks.stack-summary/arn :portkey.aws.opsworks.stack-summary/layers-count :portkey.aws.opsworks.stack-summary/apps-count :portkey.aws.opsworks/instances-count]))

(clojure.spec.alpha/def :portkey.aws.opsworks.data-source/type (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.data-source/arn (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.data-source/database-name (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/data-source (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.data-source/type :portkey.aws.opsworks.data-source/arn :portkey.aws.opsworks.data-source/database-name]))

(clojure.spec.alpha/def :portkey.aws.opsworks.describe-elastic-load-balancers-request/stack-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.describe-elastic-load-balancers-request/layer-ids (clojure.spec.alpha/and :portkey.aws.opsworks/strings))
(clojure.spec.alpha/def :portkey.aws.opsworks/describe-elastic-load-balancers-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.describe-elastic-load-balancers-request/stack-id :portkey.aws.opsworks.describe-elastic-load-balancers-request/layer-ids]))

(clojure.spec.alpha/def :portkey.aws.opsworks.attach-elastic-load-balancer-request/elastic-load-balancer-name (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.attach-elastic-load-balancer-request/layer-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/attach-elastic-load-balancer-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworks.attach-elastic-load-balancer-request/elastic-load-balancer-name :portkey.aws.opsworks.attach-elastic-load-balancer-request/layer-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.opsworks.instance-identity/document (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.instance-identity/signature (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/instance-identity (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.instance-identity/document :portkey.aws.opsworks.instance-identity/signature]))

(clojure.spec.alpha/def :portkey.aws.opsworks/raid-arrays (clojure.spec.alpha/coll-of :portkey.aws.opsworks/raid-array))

(clojure.spec.alpha/def :portkey.aws.opsworks.get-hostname-suggestion-result/layer-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.get-hostname-suggestion-result/hostname (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/get-hostname-suggestion-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.get-hostname-suggestion-result/layer-id :portkey.aws.opsworks.get-hostname-suggestion-result/hostname]))

(clojure.spec.alpha/def :portkey.aws.opsworks.command/instance-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.command/completed-at (clojure.spec.alpha/and :portkey.aws.opsworks/date-time))
(clojure.spec.alpha/def :portkey.aws.opsworks.command/type (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.command/log-url (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.command/exit-code (clojure.spec.alpha/and :portkey.aws.opsworks/integer))
(clojure.spec.alpha/def :portkey.aws.opsworks.command/status (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.command/deployment-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.command/acknowledged-at (clojure.spec.alpha/and :portkey.aws.opsworks/date-time))
(clojure.spec.alpha/def :portkey.aws.opsworks.command/created-at (clojure.spec.alpha/and :portkey.aws.opsworks/date-time))
(clojure.spec.alpha/def :portkey.aws.opsworks.command/command-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/command (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.command/instance-id :portkey.aws.opsworks.command/completed-at :portkey.aws.opsworks.command/type :portkey.aws.opsworks.command/log-url :portkey.aws.opsworks.command/exit-code :portkey.aws.opsworks.command/status :portkey.aws.opsworks.command/deployment-id :portkey.aws.opsworks.command/acknowledged-at :portkey.aws.opsworks.command/created-at :portkey.aws.opsworks.command/command-id]))

(clojure.spec.alpha/def :portkey.aws.opsworks.instances-count/setup-failed (clojure.spec.alpha/and :portkey.aws.opsworks/integer))
(clojure.spec.alpha/def :portkey.aws.opsworks.instances-count/stop-failed (clojure.spec.alpha/and :portkey.aws.opsworks/integer))
(clojure.spec.alpha/def :portkey.aws.opsworks.instances-count/registered (clojure.spec.alpha/and :portkey.aws.opsworks/integer))
(clojure.spec.alpha/def :portkey.aws.opsworks.instances-count/connection-lost (clojure.spec.alpha/and :portkey.aws.opsworks/integer))
(clojure.spec.alpha/def :portkey.aws.opsworks.instances-count/running-setup (clojure.spec.alpha/and :portkey.aws.opsworks/integer))
(clojure.spec.alpha/def :portkey.aws.opsworks.instances-count/rebooting (clojure.spec.alpha/and :portkey.aws.opsworks/integer))
(clojure.spec.alpha/def :portkey.aws.opsworks.instances-count/booting (clojure.spec.alpha/and :portkey.aws.opsworks/integer))
(clojure.spec.alpha/def :portkey.aws.opsworks.instances-count/deregistering (clojure.spec.alpha/and :portkey.aws.opsworks/integer))
(clojure.spec.alpha/def :portkey.aws.opsworks.instances-count/terminating (clojure.spec.alpha/and :portkey.aws.opsworks/integer))
(clojure.spec.alpha/def :portkey.aws.opsworks.instances-count/stopping (clojure.spec.alpha/and :portkey.aws.opsworks/integer))
(clojure.spec.alpha/def :portkey.aws.opsworks.instances-count/registering (clojure.spec.alpha/and :portkey.aws.opsworks/integer))
(clojure.spec.alpha/def :portkey.aws.opsworks.instances-count/terminated (clojure.spec.alpha/and :portkey.aws.opsworks/integer))
(clojure.spec.alpha/def :portkey.aws.opsworks.instances-count/stopped (clojure.spec.alpha/and :portkey.aws.opsworks/integer))
(clojure.spec.alpha/def :portkey.aws.opsworks.instances-count/pending (clojure.spec.alpha/and :portkey.aws.opsworks/integer))
(clojure.spec.alpha/def :portkey.aws.opsworks.instances-count/requested (clojure.spec.alpha/and :portkey.aws.opsworks/integer))
(clojure.spec.alpha/def :portkey.aws.opsworks.instances-count/assigning (clojure.spec.alpha/and :portkey.aws.opsworks/integer))
(clojure.spec.alpha/def :portkey.aws.opsworks.instances-count/start-failed (clojure.spec.alpha/and :portkey.aws.opsworks/integer))
(clojure.spec.alpha/def :portkey.aws.opsworks.instances-count/unassigning (clojure.spec.alpha/and :portkey.aws.opsworks/integer))
(clojure.spec.alpha/def :portkey.aws.opsworks.instances-count/online (clojure.spec.alpha/and :portkey.aws.opsworks/integer))
(clojure.spec.alpha/def :portkey.aws.opsworks.instances-count/shutting-down (clojure.spec.alpha/and :portkey.aws.opsworks/integer))
(clojure.spec.alpha/def :portkey.aws.opsworks/instances-count (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.instances-count/setup-failed :portkey.aws.opsworks.instances-count/stop-failed :portkey.aws.opsworks.instances-count/registered :portkey.aws.opsworks.instances-count/connection-lost :portkey.aws.opsworks.instances-count/running-setup :portkey.aws.opsworks.instances-count/rebooting :portkey.aws.opsworks.instances-count/booting :portkey.aws.opsworks.instances-count/deregistering :portkey.aws.opsworks.instances-count/terminating :portkey.aws.opsworks.instances-count/stopping :portkey.aws.opsworks.instances-count/registering :portkey.aws.opsworks.instances-count/terminated :portkey.aws.opsworks.instances-count/stopped :portkey.aws.opsworks.instances-count/pending :portkey.aws.opsworks.instances-count/requested :portkey.aws.opsworks.instances-count/assigning :portkey.aws.opsworks.instances-count/start-failed :portkey.aws.opsworks.instances-count/unassigning :portkey.aws.opsworks.instances-count/online :portkey.aws.opsworks.instances-count/shutting-down]))

(clojure.spec.alpha/def :portkey.aws.opsworks/describe-instances-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks/instances]))

(clojure.spec.alpha/def :portkey.aws.opsworks.register-volume-request/ec-2-volume-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.register-volume-request/stack-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/register-volume-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworks.register-volume-request/stack-id] :opt-un [:portkey.aws.opsworks.register-volume-request/ec-2-volume-id]))

(clojure.spec.alpha/def :portkey.aws.opsworks.create-user-profile-result/iam-user-arn (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/create-user-profile-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.create-user-profile-result/iam-user-arn]))

(clojure.spec.alpha/def :portkey.aws.opsworks/operating-system-configuration-managers (clojure.spec.alpha/coll-of :portkey.aws.opsworks/operating-system-configuration-manager))

(clojure.spec.alpha/def :portkey.aws.opsworks.reboot-instance-request/instance-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/reboot-instance-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworks.reboot-instance-request/instance-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.opsworks.time-based-auto-scaling-configuration/instance-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.time-based-auto-scaling-configuration/auto-scaling-schedule (clojure.spec.alpha/and :portkey.aws.opsworks/weekly-auto-scaling-schedule))
(clojure.spec.alpha/def :portkey.aws.opsworks/time-based-auto-scaling-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.time-based-auto-scaling-configuration/instance-id :portkey.aws.opsworks.time-based-auto-scaling-configuration/auto-scaling-schedule]))

(clojure.spec.alpha/def :portkey.aws.opsworks/volume-type #{"standard" "io1" "gp2" :io-1 :standard :gp-2})

(clojure.spec.alpha/def :portkey.aws.opsworks/cloud-watch-logs-initial-position #{:end-of-file :start-of-file "start_of_file" "end_of_file"})

(clojure.spec.alpha/def :portkey.aws.opsworks.describe-ecs-clusters-request/ecs-cluster-arns (clojure.spec.alpha/and :portkey.aws.opsworks/strings))
(clojure.spec.alpha/def :portkey.aws.opsworks.describe-ecs-clusters-request/stack-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.describe-ecs-clusters-request/next-token (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.describe-ecs-clusters-request/max-results (clojure.spec.alpha/and :portkey.aws.opsworks/integer))
(clojure.spec.alpha/def :portkey.aws.opsworks/describe-ecs-clusters-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.describe-ecs-clusters-request/ecs-cluster-arns :portkey.aws.opsworks.describe-ecs-clusters-request/stack-id :portkey.aws.opsworks.describe-ecs-clusters-request/next-token :portkey.aws.opsworks.describe-ecs-clusters-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.opsworks/app-attributes (clojure.spec.alpha/map-of :portkey.aws.opsworks/app-attributes-keys :portkey.aws.opsworks/string))

(clojure.spec.alpha/def :portkey.aws.opsworks/block-device-mappings (clojure.spec.alpha/coll-of :portkey.aws.opsworks/block-device-mapping))

(clojure.spec.alpha/def :portkey.aws.opsworks/architecture #{"x86_64" :i-386 :x-86-64 "i386"})

(clojure.spec.alpha/def :portkey.aws.opsworks.clone-stack-result/stack-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/clone-stack-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.clone-stack-result/stack-id]))

(clojure.spec.alpha/def :portkey.aws.opsworks.stack-configuration-manager/name (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.stack-configuration-manager/version (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/stack-configuration-manager (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.stack-configuration-manager/name :portkey.aws.opsworks.stack-configuration-manager/version]))

(clojure.spec.alpha/def :portkey.aws.opsworks.register-rds-db-instance-request/stack-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.register-rds-db-instance-request/rds-db-instance-arn (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.register-rds-db-instance-request/db-user (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.register-rds-db-instance-request/db-password (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/register-rds-db-instance-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworks.register-rds-db-instance-request/stack-id :portkey.aws.opsworks.register-rds-db-instance-request/rds-db-instance-arn :portkey.aws.opsworks.register-rds-db-instance-request/db-user :portkey.aws.opsworks.register-rds-db-instance-request/db-password] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.opsworks.assign-volume-request/volume-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.assign-volume-request/instance-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/assign-volume-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworks.assign-volume-request/volume-id] :opt-un [:portkey.aws.opsworks.assign-volume-request/instance-id]))

(clojure.spec.alpha/def :portkey.aws.opsworks.auto-scaling-thresholds/instance-count (clojure.spec.alpha/and :portkey.aws.opsworks/integer))
(clojure.spec.alpha/def :portkey.aws.opsworks.auto-scaling-thresholds/thresholds-wait-time (clojure.spec.alpha/and :portkey.aws.opsworks/minute))
(clojure.spec.alpha/def :portkey.aws.opsworks.auto-scaling-thresholds/ignore-metrics-time (clojure.spec.alpha/and :portkey.aws.opsworks/minute))
(clojure.spec.alpha/def :portkey.aws.opsworks.auto-scaling-thresholds/cpu-threshold (clojure.spec.alpha/and :portkey.aws.opsworks/double))
(clojure.spec.alpha/def :portkey.aws.opsworks.auto-scaling-thresholds/memory-threshold (clojure.spec.alpha/and :portkey.aws.opsworks/double))
(clojure.spec.alpha/def :portkey.aws.opsworks.auto-scaling-thresholds/load-threshold (clojure.spec.alpha/and :portkey.aws.opsworks/double))
(clojure.spec.alpha/def :portkey.aws.opsworks.auto-scaling-thresholds/alarms (clojure.spec.alpha/and :portkey.aws.opsworks/strings))
(clojure.spec.alpha/def :portkey.aws.opsworks/auto-scaling-thresholds (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.auto-scaling-thresholds/instance-count :portkey.aws.opsworks.auto-scaling-thresholds/thresholds-wait-time :portkey.aws.opsworks.auto-scaling-thresholds/ignore-metrics-time :portkey.aws.opsworks.auto-scaling-thresholds/cpu-threshold :portkey.aws.opsworks.auto-scaling-thresholds/memory-threshold :portkey.aws.opsworks.auto-scaling-thresholds/load-threshold :portkey.aws.opsworks.auto-scaling-thresholds/alarms]))

(clojure.spec.alpha/def :portkey.aws.opsworks/layer-type #{:memcached "memcached" "monitoring-master" "custom" "web" :phpapp "db-master" :monitoringmaster :dbmaster :custom "rails-app" "php-app" :javaapp :nodejsapp :lb :railsapp "nodejs-app" "lb" "ecs-cluster" "aws-flow-ruby" "java-app" :awsflowruby :ecscluster :web})

(clojure.spec.alpha/def :portkey.aws.opsworks.create-deployment-result/deployment-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/create-deployment-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.create-deployment-result/deployment-id]))

(clojure.spec.alpha/def :portkey.aws.opsworks/virtualization-type #{:hvm :paravirtual "paravirtual" "hvm"})

(clojure.spec.alpha/def :portkey.aws.opsworks.describe-stack-summary-request/stack-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/describe-stack-summary-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworks.describe-stack-summary-request/stack-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.opsworks/resource-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.opsworks/describe-time-based-auto-scaling-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks/time-based-auto-scaling-configurations]))

(clojure.spec.alpha/def :portkey.aws.opsworks.create-instance-request/subnet-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.create-instance-request/tenancy (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.create-instance-request/ebs-optimized (clojure.spec.alpha/and :portkey.aws.opsworks/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworks.create-instance-request/instance-type (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.create-instance-request/agent-version (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.create-instance-request/os (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.create-instance-request/layer-ids (clojure.spec.alpha/and :portkey.aws.opsworks/strings))
(clojure.spec.alpha/def :portkey.aws.opsworks.create-instance-request/availability-zone (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.create-instance-request/hostname (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.create-instance-request/ami-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.create-instance-request/stack-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.create-instance-request/install-updates-on-boot (clojure.spec.alpha/and :portkey.aws.opsworks/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworks.create-instance-request/virtualization-type (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.create-instance-request/ssh-key-name (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/create-instance-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworks.create-instance-request/stack-id :portkey.aws.opsworks.create-instance-request/layer-ids :portkey.aws.opsworks.create-instance-request/instance-type] :opt-un [:portkey.aws.opsworks.create-instance-request/subnet-id :portkey.aws.opsworks.create-instance-request/tenancy :portkey.aws.opsworks/root-device-type :portkey.aws.opsworks.create-instance-request/ebs-optimized :portkey.aws.opsworks.create-instance-request/agent-version :portkey.aws.opsworks.create-instance-request/os :portkey.aws.opsworks.create-instance-request/availability-zone :portkey.aws.opsworks.create-instance-request/hostname :portkey.aws.opsworks.create-instance-request/ami-id :portkey.aws.opsworks/block-device-mappings :portkey.aws.opsworks/architecture :portkey.aws.opsworks.create-instance-request/install-updates-on-boot :portkey.aws.opsworks.create-instance-request/virtualization-type :portkey.aws.opsworks/auto-scaling-type :portkey.aws.opsworks.create-instance-request/ssh-key-name]))

(clojure.spec.alpha/def :portkey.aws.opsworks.start-instance-request/instance-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/start-instance-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworks.start-instance-request/instance-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.opsworks.stop-stack-request/stack-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/stop-stack-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworks.stop-stack-request/stack-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.opsworks.describe-stacks-request/stack-ids (clojure.spec.alpha/and :portkey.aws.opsworks/strings))
(clojure.spec.alpha/def :portkey.aws.opsworks/describe-stacks-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.describe-stacks-request/stack-ids]))

(clojure.spec.alpha/def :portkey.aws.opsworks.describe-rds-db-instances-request/stack-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.describe-rds-db-instances-request/rds-db-instance-arns (clojure.spec.alpha/and :portkey.aws.opsworks/strings))
(clojure.spec.alpha/def :portkey.aws.opsworks/describe-rds-db-instances-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworks.describe-rds-db-instances-request/stack-id] :opt-un [:portkey.aws.opsworks.describe-rds-db-instances-request/rds-db-instance-arns]))

(clojure.spec.alpha/def :portkey.aws.opsworks.block-device-mapping/device-name (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.block-device-mapping/no-device (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.block-device-mapping/virtual-name (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.block-device-mapping/ebs (clojure.spec.alpha/and :portkey.aws.opsworks/ebs-block-device))
(clojure.spec.alpha/def :portkey.aws.opsworks/block-device-mapping (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.block-device-mapping/device-name :portkey.aws.opsworks.block-device-mapping/no-device :portkey.aws.opsworks.block-device-mapping/virtual-name :portkey.aws.opsworks.block-device-mapping/ebs]))

(clojure.spec.alpha/def :portkey.aws.opsworks/max-results clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.opsworks/list-tags-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks/tags :portkey.aws.opsworks/next-token]))

(clojure.spec.alpha/def :portkey.aws.opsworks.weekly-auto-scaling-schedule/monday (clojure.spec.alpha/and :portkey.aws.opsworks/daily-auto-scaling-schedule))
(clojure.spec.alpha/def :portkey.aws.opsworks.weekly-auto-scaling-schedule/tuesday (clojure.spec.alpha/and :portkey.aws.opsworks/daily-auto-scaling-schedule))
(clojure.spec.alpha/def :portkey.aws.opsworks.weekly-auto-scaling-schedule/wednesday (clojure.spec.alpha/and :portkey.aws.opsworks/daily-auto-scaling-schedule))
(clojure.spec.alpha/def :portkey.aws.opsworks.weekly-auto-scaling-schedule/thursday (clojure.spec.alpha/and :portkey.aws.opsworks/daily-auto-scaling-schedule))
(clojure.spec.alpha/def :portkey.aws.opsworks.weekly-auto-scaling-schedule/friday (clojure.spec.alpha/and :portkey.aws.opsworks/daily-auto-scaling-schedule))
(clojure.spec.alpha/def :portkey.aws.opsworks.weekly-auto-scaling-schedule/saturday (clojure.spec.alpha/and :portkey.aws.opsworks/daily-auto-scaling-schedule))
(clojure.spec.alpha/def :portkey.aws.opsworks.weekly-auto-scaling-schedule/sunday (clojure.spec.alpha/and :portkey.aws.opsworks/daily-auto-scaling-schedule))
(clojure.spec.alpha/def :portkey.aws.opsworks/weekly-auto-scaling-schedule (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.weekly-auto-scaling-schedule/monday :portkey.aws.opsworks.weekly-auto-scaling-schedule/tuesday :portkey.aws.opsworks.weekly-auto-scaling-schedule/wednesday :portkey.aws.opsworks.weekly-auto-scaling-schedule/thursday :portkey.aws.opsworks.weekly-auto-scaling-schedule/friday :portkey.aws.opsworks.weekly-auto-scaling-schedule/saturday :portkey.aws.opsworks.weekly-auto-scaling-schedule/sunday]))

(clojure.spec.alpha/def :portkey.aws.opsworks/describe-service-errors-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks/service-errors]))

(clojure.spec.alpha/def :portkey.aws.opsworks/service-errors (clojure.spec.alpha/coll-of :portkey.aws.opsworks/service-error))

(clojure.spec.alpha/def :portkey.aws.opsworks.delete-layer-request/layer-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/delete-layer-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworks.delete-layer-request/layer-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.opsworks.volume-configuration/mount-point (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.volume-configuration/raid-level (clojure.spec.alpha/and :portkey.aws.opsworks/integer))
(clojure.spec.alpha/def :portkey.aws.opsworks.volume-configuration/number-of-disks (clojure.spec.alpha/and :portkey.aws.opsworks/integer))
(clojure.spec.alpha/def :portkey.aws.opsworks.volume-configuration/size (clojure.spec.alpha/and :portkey.aws.opsworks/integer))
(clojure.spec.alpha/def :portkey.aws.opsworks.volume-configuration/volume-type (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.volume-configuration/iops (clojure.spec.alpha/and :portkey.aws.opsworks/integer))
(clojure.spec.alpha/def :portkey.aws.opsworks.volume-configuration/encrypted (clojure.spec.alpha/and :portkey.aws.opsworks/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworks/volume-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworks.volume-configuration/mount-point :portkey.aws.opsworks.volume-configuration/number-of-disks :portkey.aws.opsworks.volume-configuration/size] :opt-un [:portkey.aws.opsworks.volume-configuration/raid-level :portkey.aws.opsworks.volume-configuration/volume-type :portkey.aws.opsworks.volume-configuration/iops :portkey.aws.opsworks.volume-configuration/encrypted]))

(clojure.spec.alpha/def :portkey.aws.opsworks.instance/public-ip (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.instance/instance-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.instance/ecs-container-instance-arn (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.instance/platform (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.instance/security-group-ids (clojure.spec.alpha/and :portkey.aws.opsworks/strings))
(clojure.spec.alpha/def :portkey.aws.opsworks.instance/registered-by (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.instance/subnet-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.instance/tenancy (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.instance/infrastructure-class (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.instance/ebs-optimized (clojure.spec.alpha/and :portkey.aws.opsworks/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworks.instance/instance-type (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.instance/instance-profile-arn (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.instance/public-dns (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.instance/agent-version (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.instance/os (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.instance/layer-ids (clojure.spec.alpha/and :portkey.aws.opsworks/strings))
(clojure.spec.alpha/def :portkey.aws.opsworks.instance/root-device-volume-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.instance/availability-zone (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.instance/status (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.instance/hostname (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.instance/last-service-error-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.instance/reported-agent-version (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.instance/elastic-ip (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.instance/ami-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.instance/private-dns (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.instance/stack-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.instance/arn (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.instance/created-at (clojure.spec.alpha/and :portkey.aws.opsworks/date-time))
(clojure.spec.alpha/def :portkey.aws.opsworks.instance/ecs-cluster-arn (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.instance/install-updates-on-boot (clojure.spec.alpha/and :portkey.aws.opsworks/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworks.instance/ec-2-instance-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.instance/ssh-host-dsa-key-fingerprint (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.instance/ssh-host-rsa-key-fingerprint (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.instance/ssh-key-name (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.instance/private-ip (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/instance (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.instance/public-ip :portkey.aws.opsworks.instance/instance-id :portkey.aws.opsworks.instance/ecs-container-instance-arn :portkey.aws.opsworks.instance/platform :portkey.aws.opsworks.instance/security-group-ids :portkey.aws.opsworks.instance/registered-by :portkey.aws.opsworks.instance/subnet-id :portkey.aws.opsworks.instance/tenancy :portkey.aws.opsworks/root-device-type :portkey.aws.opsworks.instance/infrastructure-class :portkey.aws.opsworks.instance/ebs-optimized :portkey.aws.opsworks.instance/instance-type :portkey.aws.opsworks.instance/instance-profile-arn :portkey.aws.opsworks.instance/public-dns :portkey.aws.opsworks.instance/agent-version :portkey.aws.opsworks.instance/os :portkey.aws.opsworks.instance/layer-ids :portkey.aws.opsworks.instance/root-device-volume-id :portkey.aws.opsworks.instance/availability-zone :portkey.aws.opsworks.instance/status :portkey.aws.opsworks.instance/hostname :portkey.aws.opsworks.instance/last-service-error-id :portkey.aws.opsworks.instance/reported-agent-version :portkey.aws.opsworks.instance/elastic-ip :portkey.aws.opsworks.instance/ami-id :portkey.aws.opsworks.instance/private-dns :portkey.aws.opsworks/reported-os :portkey.aws.opsworks.instance/stack-id :portkey.aws.opsworks.instance/arn :portkey.aws.opsworks.instance/created-at :portkey.aws.opsworks/block-device-mappings :portkey.aws.opsworks/architecture :portkey.aws.opsworks.instance/ecs-cluster-arn :portkey.aws.opsworks.instance/install-updates-on-boot :portkey.aws.opsworks/virtualization-type :portkey.aws.opsworks.instance/ec-2-instance-id :portkey.aws.opsworks.instance/ssh-host-dsa-key-fingerprint :portkey.aws.opsworks/auto-scaling-type :portkey.aws.opsworks.instance/ssh-host-rsa-key-fingerprint :portkey.aws.opsworks.instance/ssh-key-name :portkey.aws.opsworks.instance/private-ip]))

(clojure.spec.alpha/def :portkey.aws.opsworks/volume-configurations (clojure.spec.alpha/coll-of :portkey.aws.opsworks/volume-configuration))

(clojure.spec.alpha/def :portkey.aws.opsworks/auto-scaling-type #{:load :timer "load" "timer"})

(clojure.spec.alpha/def :portkey.aws.opsworks.deployment-command/name (clojure.spec.alpha/and :portkey.aws.opsworks/deployment-command-name))
(clojure.spec.alpha/def :portkey.aws.opsworks.deployment-command/args (clojure.spec.alpha/and :portkey.aws.opsworks/deployment-command-args))
(clojure.spec.alpha/def :portkey.aws.opsworks/deployment-command (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworks.deployment-command/name] :opt-un [:portkey.aws.opsworks.deployment-command/args]))

(clojure.spec.alpha/def :portkey.aws.opsworks/describe-stacks-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks/stacks]))

(clojure.spec.alpha/def :portkey.aws.opsworks.register-ecs-cluster-result/ecs-cluster-arn (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/register-ecs-cluster-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.register-ecs-cluster-result/ecs-cluster-arn]))

(clojure.spec.alpha/def :portkey.aws.opsworks/cloud-watch-logs-time-zone #{:utc "LOCAL" "UTC" :local})

(clojure.spec.alpha/def :portkey.aws.opsworks.describe-apps-request/stack-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.describe-apps-request/app-ids (clojure.spec.alpha/and :portkey.aws.opsworks/strings))
(clojure.spec.alpha/def :portkey.aws.opsworks/describe-apps-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.describe-apps-request/stack-id :portkey.aws.opsworks.describe-apps-request/app-ids]))

(clojure.spec.alpha/def :portkey.aws.opsworks/layer-attributes (clojure.spec.alpha/map-of :portkey.aws.opsworks/layer-attributes-keys :portkey.aws.opsworks/string))

(clojure.spec.alpha/def :portkey.aws.opsworks.deregister-rds-db-instance-request/rds-db-instance-arn (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/deregister-rds-db-instance-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworks.deregister-rds-db-instance-request/rds-db-instance-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.opsworks.update-elastic-ip-request/elastic-ip (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.update-elastic-ip-request/name (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/update-elastic-ip-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworks.update-elastic-ip-request/elastic-ip] :opt-un [:portkey.aws.opsworks.update-elastic-ip-request/name]))

(clojure.spec.alpha/def :portkey.aws.opsworks.describe-time-based-auto-scaling-request/instance-ids (clojure.spec.alpha/and :portkey.aws.opsworks/strings))
(clojure.spec.alpha/def :portkey.aws.opsworks/describe-time-based-auto-scaling-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworks.describe-time-based-auto-scaling-request/instance-ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.opsworks/describe-rds-db-instances-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks/rds-db-instances]))

(clojure.spec.alpha/def :portkey.aws.opsworks/describe-commands-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks/commands]))

(clojure.spec.alpha/def :portkey.aws.opsworks.update-rds-db-instance-request/rds-db-instance-arn (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.update-rds-db-instance-request/db-user (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.update-rds-db-instance-request/db-password (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/update-rds-db-instance-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworks.update-rds-db-instance-request/rds-db-instance-arn] :opt-un [:portkey.aws.opsworks.update-rds-db-instance-request/db-user :portkey.aws.opsworks.update-rds-db-instance-request/db-password]))

(clojure.spec.alpha/def :portkey.aws.opsworks/volumes (clojure.spec.alpha/coll-of :portkey.aws.opsworks/volume))

(clojure.spec.alpha/def :portkey.aws.opsworks/app-attributes-keys #{:document-root :rails-env "DocumentRoot" "RailsEnv" "AutoBundleOnDeploy" "AwsFlowRubySettings" :auto-bundle-on-deploy :aws-flow-ruby-settings})

(clojure.spec.alpha/def :portkey.aws.opsworks.create-user-profile-request/iam-user-arn (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.create-user-profile-request/ssh-username (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.create-user-profile-request/ssh-public-key (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.create-user-profile-request/allow-self-management (clojure.spec.alpha/and :portkey.aws.opsworks/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworks/create-user-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworks.create-user-profile-request/iam-user-arn] :opt-un [:portkey.aws.opsworks.create-user-profile-request/ssh-username :portkey.aws.opsworks.create-user-profile-request/ssh-public-key :portkey.aws.opsworks.create-user-profile-request/allow-self-management]))

(clojure.spec.alpha/def :portkey.aws.opsworks/describe-layers-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks/layers]))

(clojure.spec.alpha/def :portkey.aws.opsworks.stack/custom-cookbooks-source (clojure.spec.alpha/and :portkey.aws.opsworks/source))
(clojure.spec.alpha/def :portkey.aws.opsworks.stack/service-role-arn (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.stack/hostname-theme (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.stack/default-ssh-key-name (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.stack/default-availability-zone (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.stack/configuration-manager (clojure.spec.alpha/and :portkey.aws.opsworks/stack-configuration-manager))
(clojure.spec.alpha/def :portkey.aws.opsworks.stack/agent-version (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.stack/use-opsworks-security-groups (clojure.spec.alpha/and :portkey.aws.opsworks/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworks.stack/attributes (clojure.spec.alpha/and :portkey.aws.opsworks/stack-attributes))
(clojure.spec.alpha/def :portkey.aws.opsworks.stack/default-root-device-type (clojure.spec.alpha/and :portkey.aws.opsworks/root-device-type))
(clojure.spec.alpha/def :portkey.aws.opsworks.stack/vpc-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.stack/use-custom-cookbooks (clojure.spec.alpha/and :portkey.aws.opsworks/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworks.stack/stack-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.stack/default-instance-profile-arn (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.stack/arn (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.stack/created-at (clojure.spec.alpha/and :portkey.aws.opsworks/date-time))
(clojure.spec.alpha/def :portkey.aws.opsworks.stack/custom-json (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.stack/default-subnet-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.stack/name (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.stack/region (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.stack/default-os (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/stack (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.stack/custom-cookbooks-source :portkey.aws.opsworks.stack/service-role-arn :portkey.aws.opsworks.stack/hostname-theme :portkey.aws.opsworks.stack/default-ssh-key-name :portkey.aws.opsworks.stack/default-availability-zone :portkey.aws.opsworks/chef-configuration :portkey.aws.opsworks.stack/configuration-manager :portkey.aws.opsworks.stack/agent-version :portkey.aws.opsworks.stack/use-opsworks-security-groups :portkey.aws.opsworks.stack/attributes :portkey.aws.opsworks.stack/default-root-device-type :portkey.aws.opsworks.stack/vpc-id :portkey.aws.opsworks.stack/use-custom-cookbooks :portkey.aws.opsworks.stack/stack-id :portkey.aws.opsworks.stack/default-instance-profile-arn :portkey.aws.opsworks.stack/arn :portkey.aws.opsworks.stack/created-at :portkey.aws.opsworks.stack/custom-json :portkey.aws.opsworks.stack/default-subnet-id :portkey.aws.opsworks.stack/name :portkey.aws.opsworks.stack/region :portkey.aws.opsworks.stack/default-os]))

(clojure.spec.alpha/def :portkey.aws.opsworks/operating-systems (clojure.spec.alpha/coll-of :portkey.aws.opsworks/operating-system))

(clojure.spec.alpha/def :portkey.aws.opsworks/instances (clojure.spec.alpha/coll-of :portkey.aws.opsworks/instance))

(clojure.spec.alpha/def :portkey.aws.opsworks/deployment-command-name #{:rollback "stop" :undeploy "deploy" "undeploy" :restart "update_custom_cookbooks" :execute-recipes :update-custom-cookbooks :update-dependencies "configure" :start :setup "install_dependencies" :configure "start" :stop "setup" "execute_recipes" "restart" :install-dependencies "rollback" :deploy "update_dependencies"})

(clojure.spec.alpha/def :portkey.aws.opsworks/untag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworks/resource-arn :portkey.aws.opsworks/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.opsworks.disassociate-elastic-ip-request/elastic-ip (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/disassociate-elastic-ip-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworks.disassociate-elastic-ip-request/elastic-ip] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.opsworks/describe-apps-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks/apps]))

(clojure.spec.alpha/def :portkey.aws.opsworks.service-error/service-error-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.service-error/stack-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.service-error/instance-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.service-error/type (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.service-error/message (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.service-error/created-at (clojure.spec.alpha/and :portkey.aws.opsworks/date-time))
(clojure.spec.alpha/def :portkey.aws.opsworks/service-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.service-error/service-error-id :portkey.aws.opsworks.service-error/stack-id :portkey.aws.opsworks.service-error/instance-id :portkey.aws.opsworks.service-error/type :portkey.aws.opsworks.service-error/message :portkey.aws.opsworks.service-error/created-at]))

(clojure.spec.alpha/def :portkey.aws.opsworks.operating-system/name (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.operating-system/id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.operating-system/type (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.operating-system/configuration-managers (clojure.spec.alpha/and :portkey.aws.opsworks/operating-system-configuration-managers))
(clojure.spec.alpha/def :portkey.aws.opsworks.operating-system/reported-name (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.operating-system/reported-version (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.operating-system/supported (clojure.spec.alpha/and :portkey.aws.opsworks/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworks/operating-system (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.operating-system/name :portkey.aws.opsworks.operating-system/id :portkey.aws.opsworks.operating-system/type :portkey.aws.opsworks.operating-system/configuration-managers :portkey.aws.opsworks.operating-system/reported-name :portkey.aws.opsworks.operating-system/reported-version :portkey.aws.opsworks.operating-system/supported]))

(clojure.spec.alpha/def :portkey.aws.opsworks.cloud-watch-logs-log-stream/batch-size (clojure.spec.alpha/and :portkey.aws.opsworks/integer))
(clojure.spec.alpha/def :portkey.aws.opsworks.cloud-watch-logs-log-stream/encoding (clojure.spec.alpha/and :portkey.aws.opsworks/cloud-watch-logs-encoding))
(clojure.spec.alpha/def :portkey.aws.opsworks.cloud-watch-logs-log-stream/initial-position (clojure.spec.alpha/and :portkey.aws.opsworks/cloud-watch-logs-initial-position))
(clojure.spec.alpha/def :portkey.aws.opsworks.cloud-watch-logs-log-stream/file (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.cloud-watch-logs-log-stream/batch-count (clojure.spec.alpha/and :portkey.aws.opsworks/integer))
(clojure.spec.alpha/def :portkey.aws.opsworks.cloud-watch-logs-log-stream/time-zone (clojure.spec.alpha/and :portkey.aws.opsworks/cloud-watch-logs-time-zone))
(clojure.spec.alpha/def :portkey.aws.opsworks.cloud-watch-logs-log-stream/multi-line-start-pattern (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.cloud-watch-logs-log-stream/file-fingerprint-lines (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.cloud-watch-logs-log-stream/log-group-name (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.cloud-watch-logs-log-stream/buffer-duration (clojure.spec.alpha/and :portkey.aws.opsworks/integer))
(clojure.spec.alpha/def :portkey.aws.opsworks.cloud-watch-logs-log-stream/datetime-format (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/cloud-watch-logs-log-stream (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.cloud-watch-logs-log-stream/batch-size :portkey.aws.opsworks.cloud-watch-logs-log-stream/encoding :portkey.aws.opsworks.cloud-watch-logs-log-stream/initial-position :portkey.aws.opsworks.cloud-watch-logs-log-stream/file :portkey.aws.opsworks.cloud-watch-logs-log-stream/batch-count :portkey.aws.opsworks.cloud-watch-logs-log-stream/time-zone :portkey.aws.opsworks.cloud-watch-logs-log-stream/multi-line-start-pattern :portkey.aws.opsworks.cloud-watch-logs-log-stream/file-fingerprint-lines :portkey.aws.opsworks.cloud-watch-logs-log-stream/log-group-name :portkey.aws.opsworks.cloud-watch-logs-log-stream/buffer-duration :portkey.aws.opsworks.cloud-watch-logs-log-stream/datetime-format]))

(clojure.spec.alpha/def :portkey.aws.opsworks.deregister-volume-request/volume-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/deregister-volume-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworks.deregister-volume-request/volume-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.opsworks.describe-deployments-request/stack-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.describe-deployments-request/app-id (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks.describe-deployments-request/deployment-ids (clojure.spec.alpha/and :portkey.aws.opsworks/strings))
(clojure.spec.alpha/def :portkey.aws.opsworks/describe-deployments-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.describe-deployments-request/stack-id :portkey.aws.opsworks.describe-deployments-request/app-id :portkey.aws.opsworks.describe-deployments-request/deployment-ids]))

(clojure.spec.alpha/def :portkey.aws.opsworks/elastic-load-balancers (clojure.spec.alpha/coll-of :portkey.aws.opsworks/elastic-load-balancer))

(clojure.spec.alpha/def :portkey.aws.opsworks/date-time (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.opsworks/deployments (clojure.spec.alpha/coll-of :portkey.aws.opsworks/deployment))

(clojure.spec.alpha/def :portkey.aws.opsworks/describe-elastic-load-balancers-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks/elastic-load-balancers]))

(clojure.spec.alpha/def :portkey.aws.opsworks/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.opsworks.register-elastic-ip-result/elastic-ip (clojure.spec.alpha/and :portkey.aws.opsworks/string))
(clojure.spec.alpha/def :portkey.aws.opsworks/register-elastic-ip-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworks.register-elastic-ip-result/elastic-ip]))

(clojure.spec.alpha/def :portkey.aws.opsworks/list-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworks/resource-arn] :opt-un [:portkey.aws.opsworks/max-results :portkey.aws.opsworks/next-token]))

(clojure.core/defn tag-resource ([tag-resource-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-tag-resource-request tag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/tag-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "TagResource", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef tag-resource :args (clojure.spec.alpha/tuple :portkey.aws.opsworks/tag-resource-request) :ret clojure.core/true?)

(clojure.core/defn describe-user-profiles ([] (describe-user-profiles {})) ([describe-user-profiles-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-user-profiles-request describe-user-profiles-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec :portkey.aws.opsworks/describe-user-profiles-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/describe-user-profiles-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeUserProfiles", :http.request.configuration/output-deser-fn deser-describe-user-profiles-result, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-user-profiles :args (clojure.spec.alpha/? :portkey.aws.opsworks/describe-user-profiles-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworks/describe-user-profiles-result))

(clojure.core/defn describe-stack-summary ([describe-stack-summary-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-stack-summary-request describe-stack-summary-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec :portkey.aws.opsworks/describe-stack-summary-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/describe-stack-summary-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeStackSummary", :http.request.configuration/output-deser-fn deser-describe-stack-summary-result, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-stack-summary :args (clojure.spec.alpha/tuple :portkey.aws.opsworks/describe-stack-summary-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworks/describe-stack-summary-result))

(clojure.core/defn describe-volumes ([] (describe-volumes {})) ([describe-volumes-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-volumes-request describe-volumes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec :portkey.aws.opsworks/describe-volumes-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/describe-volumes-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeVolumes", :http.request.configuration/output-deser-fn deser-describe-volumes-result, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-volumes :args (clojure.spec.alpha/? :portkey.aws.opsworks/describe-volumes-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworks/describe-volumes-result))

(clojure.core/defn update-instance ([update-instance-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-update-instance-request update-instance-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/update-instance-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateInstance", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef update-instance :args (clojure.spec.alpha/tuple :portkey.aws.opsworks/update-instance-request) :ret clojure.core/true?)

(clojure.core/defn start-instance ([start-instance-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-start-instance-request start-instance-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/start-instance-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartInstance", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef start-instance :args (clojure.spec.alpha/tuple :portkey.aws.opsworks/start-instance-request) :ret clojure.core/true?)

(clojure.core/defn create-layer ([create-layer-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-layer-request create-layer-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec :portkey.aws.opsworks/create-layer-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/create-layer-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateLayer", :http.request.configuration/output-deser-fn deser-create-layer-result, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef create-layer :args (clojure.spec.alpha/tuple :portkey.aws.opsworks/create-layer-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworks/create-layer-result))

(clojure.core/defn describe-deployments ([] (describe-deployments {})) ([describe-deployments-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-deployments-request describe-deployments-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec :portkey.aws.opsworks/describe-deployments-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/describe-deployments-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeDeployments", :http.request.configuration/output-deser-fn deser-describe-deployments-result, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-deployments :args (clojure.spec.alpha/? :portkey.aws.opsworks/describe-deployments-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworks/describe-deployments-result))

(clojure.core/defn delete-stack ([delete-stack-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-stack-request delete-stack-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/delete-stack-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteStack", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-stack :args (clojure.spec.alpha/tuple :portkey.aws.opsworks/delete-stack-request) :ret clojure.core/true?)

(clojure.core/defn update-user-profile ([update-user-profile-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-update-user-profile-request update-user-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/update-user-profile-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateUserProfile", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef update-user-profile :args (clojure.spec.alpha/tuple :portkey.aws.opsworks/update-user-profile-request) :ret clojure.core/true?)

(clojure.core/defn unassign-volume ([unassign-volume-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-unassign-volume-request unassign-volume-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/unassign-volume-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UnassignVolume", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef unassign-volume :args (clojure.spec.alpha/tuple :portkey.aws.opsworks/unassign-volume-request) :ret clojure.core/true?)

(clojure.core/defn reboot-instance ([reboot-instance-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-reboot-instance-request reboot-instance-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/reboot-instance-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RebootInstance", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef reboot-instance :args (clojure.spec.alpha/tuple :portkey.aws.opsworks/reboot-instance-request) :ret clojure.core/true?)

(clojure.core/defn describe-permissions ([] (describe-permissions {})) ([describe-permissions-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-permissions-request describe-permissions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec :portkey.aws.opsworks/describe-permissions-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/describe-permissions-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribePermissions", :http.request.configuration/output-deser-fn deser-describe-permissions-result, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-permissions :args (clojure.spec.alpha/? :portkey.aws.opsworks/describe-permissions-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworks/describe-permissions-result))

(clojure.core/defn unassign-instance ([unassign-instance-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-unassign-instance-request unassign-instance-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/unassign-instance-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UnassignInstance", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef unassign-instance :args (clojure.spec.alpha/tuple :portkey.aws.opsworks/unassign-instance-request) :ret clojure.core/true?)

(clojure.core/defn disassociate-elastic-ip ([disassociate-elastic-ip-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-disassociate-elastic-ip-request disassociate-elastic-ip-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/disassociate-elastic-ip-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DisassociateElasticIp", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef disassociate-elastic-ip :args (clojure.spec.alpha/tuple :portkey.aws.opsworks/disassociate-elastic-ip-request) :ret clojure.core/true?)

(clojure.core/defn set-time-based-auto-scaling ([set-time-based-auto-scaling-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-set-time-based-auto-scaling-request set-time-based-auto-scaling-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/set-time-based-auto-scaling-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SetTimeBasedAutoScaling", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef set-time-based-auto-scaling :args (clojure.spec.alpha/tuple :portkey.aws.opsworks/set-time-based-auto-scaling-request) :ret clojure.core/true?)

(clojure.core/defn describe-rds-db-instances ([describe-rds-db-instances-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-rds-db-instances-request describe-rds-db-instances-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec :portkey.aws.opsworks/describe-rds-db-instances-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/describe-rds-db-instances-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeRdsDbInstances", :http.request.configuration/output-deser-fn deser-describe-rds-db-instances-result, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-rds-db-instances :args (clojure.spec.alpha/tuple :portkey.aws.opsworks/describe-rds-db-instances-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworks/describe-rds-db-instances-result))

(clojure.core/defn register-rds-db-instance ([register-rds-db-instance-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-register-rds-db-instance-request register-rds-db-instance-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/register-rds-db-instance-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RegisterRdsDbInstance", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef register-rds-db-instance :args (clojure.spec.alpha/tuple :portkey.aws.opsworks/register-rds-db-instance-request) :ret clojure.core/true?)

(clojure.core/defn describe-operating-systems ([] (describe-operating-systems {})) ([_] (clojure.core/let [request-function-result__28581__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec :portkey.aws.opsworks/describe-operating-systems-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec nil, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeOperatingSystems", :http.request.configuration/output-deser-fn deser-describe-operating-systems-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-operating-systems :args clojure.core/empty? :ret (clojure.spec.alpha/and :portkey.aws.opsworks/describe-operating-systems-response))

(clojure.core/defn stop-instance ([stop-instance-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-stop-instance-request stop-instance-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/stop-instance-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StopInstance", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef stop-instance :args (clojure.spec.alpha/tuple :portkey.aws.opsworks/stop-instance-request) :ret clojure.core/true?)

(clojure.core/defn register-volume ([register-volume-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-register-volume-request register-volume-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec :portkey.aws.opsworks/register-volume-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/register-volume-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RegisterVolume", :http.request.configuration/output-deser-fn deser-register-volume-result, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef register-volume :args (clojure.spec.alpha/tuple :portkey.aws.opsworks/register-volume-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworks/register-volume-result))

(clojure.core/defn describe-layers ([] (describe-layers {})) ([describe-layers-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-layers-request describe-layers-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec :portkey.aws.opsworks/describe-layers-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/describe-layers-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeLayers", :http.request.configuration/output-deser-fn deser-describe-layers-result, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-layers :args (clojure.spec.alpha/? :portkey.aws.opsworks/describe-layers-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworks/describe-layers-result))

(clojure.core/defn update-stack ([update-stack-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-update-stack-request update-stack-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/update-stack-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateStack", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef update-stack :args (clojure.spec.alpha/tuple :portkey.aws.opsworks/update-stack-request) :ret clojure.core/true?)

(clojure.core/defn list-tags ([list-tags-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-tags-request list-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec :portkey.aws.opsworks/list-tags-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/list-tags-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTags", :http.request.configuration/output-deser-fn deser-list-tags-result, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef list-tags :args (clojure.spec.alpha/tuple :portkey.aws.opsworks/list-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworks/list-tags-result))

(clojure.core/defn describe-apps ([] (describe-apps {})) ([describe-apps-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-apps-request describe-apps-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec :portkey.aws.opsworks/describe-apps-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/describe-apps-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeApps", :http.request.configuration/output-deser-fn deser-describe-apps-result, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-apps :args (clojure.spec.alpha/? :portkey.aws.opsworks/describe-apps-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworks/describe-apps-result))

(clojure.core/defn create-deployment ([create-deployment-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-deployment-request create-deployment-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec :portkey.aws.opsworks/create-deployment-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/create-deployment-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateDeployment", :http.request.configuration/output-deser-fn deser-create-deployment-result, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef create-deployment :args (clojure.spec.alpha/tuple :portkey.aws.opsworks/create-deployment-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworks/create-deployment-result))

(clojure.core/defn associate-elastic-ip ([associate-elastic-ip-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-associate-elastic-ip-request associate-elastic-ip-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/associate-elastic-ip-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AssociateElasticIp", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef associate-elastic-ip :args (clojure.spec.alpha/tuple :portkey.aws.opsworks/associate-elastic-ip-request) :ret clojure.core/true?)

(clojure.core/defn create-user-profile ([create-user-profile-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-user-profile-request create-user-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec :portkey.aws.opsworks/create-user-profile-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/create-user-profile-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateUserProfile", :http.request.configuration/output-deser-fn deser-create-user-profile-result, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception}})))))
(clojure.spec.alpha/fdef create-user-profile :args (clojure.spec.alpha/tuple :portkey.aws.opsworks/create-user-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworks/create-user-profile-result))

(clojure.core/defn start-stack ([start-stack-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-start-stack-request start-stack-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/start-stack-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartStack", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef start-stack :args (clojure.spec.alpha/tuple :portkey.aws.opsworks/start-stack-request) :ret clojure.core/true?)

(clojure.core/defn stop-stack ([stop-stack-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-stop-stack-request stop-stack-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/stop-stack-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StopStack", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef stop-stack :args (clojure.spec.alpha/tuple :portkey.aws.opsworks/stop-stack-request) :ret clojure.core/true?)

(clojure.core/defn deregister-volume ([deregister-volume-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-deregister-volume-request deregister-volume-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/deregister-volume-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeregisterVolume", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef deregister-volume :args (clojure.spec.alpha/tuple :portkey.aws.opsworks/deregister-volume-request) :ret clojure.core/true?)

(clojure.core/defn describe-ecs-clusters ([] (describe-ecs-clusters {})) ([describe-ecs-clusters-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-ecs-clusters-request describe-ecs-clusters-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec :portkey.aws.opsworks/describe-ecs-clusters-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/describe-ecs-clusters-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeEcsClusters", :http.request.configuration/output-deser-fn deser-describe-ecs-clusters-result, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-ecs-clusters :args (clojure.spec.alpha/? :portkey.aws.opsworks/describe-ecs-clusters-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworks/describe-ecs-clusters-result))

(clojure.core/defn describe-time-based-auto-scaling ([describe-time-based-auto-scaling-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-time-based-auto-scaling-request describe-time-based-auto-scaling-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec :portkey.aws.opsworks/describe-time-based-auto-scaling-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/describe-time-based-auto-scaling-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeTimeBasedAutoScaling", :http.request.configuration/output-deser-fn deser-describe-time-based-auto-scaling-result, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-time-based-auto-scaling :args (clojure.spec.alpha/tuple :portkey.aws.opsworks/describe-time-based-auto-scaling-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworks/describe-time-based-auto-scaling-result))

(clojure.core/defn delete-user-profile ([delete-user-profile-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-user-profile-request delete-user-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/delete-user-profile-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteUserProfile", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-user-profile :args (clojure.spec.alpha/tuple :portkey.aws.opsworks/delete-user-profile-request) :ret clojure.core/true?)

(clojure.core/defn deregister-instance ([deregister-instance-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-deregister-instance-request deregister-instance-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/deregister-instance-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeregisterInstance", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef deregister-instance :args (clojure.spec.alpha/tuple :portkey.aws.opsworks/deregister-instance-request) :ret clojure.core/true?)

(clojure.core/defn describe-agent-versions ([] (describe-agent-versions {})) ([describe-agent-versions-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-agent-versions-request describe-agent-versions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec :portkey.aws.opsworks/describe-agent-versions-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/describe-agent-versions-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeAgentVersions", :http.request.configuration/output-deser-fn deser-describe-agent-versions-result, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-agent-versions :args (clojure.spec.alpha/? :portkey.aws.opsworks/describe-agent-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworks/describe-agent-versions-result))

(clojure.core/defn update-my-user-profile ([] (update-my-user-profile {})) ([update-my-user-profile-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-update-my-user-profile-request update-my-user-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/update-my-user-profile-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateMyUserProfile", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception}})))))
(clojure.spec.alpha/fdef update-my-user-profile :args (clojure.spec.alpha/? :portkey.aws.opsworks/update-my-user-profile-request) :ret clojure.core/true?)

(clojure.core/defn assign-volume ([assign-volume-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-assign-volume-request assign-volume-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/assign-volume-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AssignVolume", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef assign-volume :args (clojure.spec.alpha/tuple :portkey.aws.opsworks/assign-volume-request) :ret clojure.core/true?)

(clojure.core/defn register-elastic-ip ([register-elastic-ip-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-register-elastic-ip-request register-elastic-ip-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec :portkey.aws.opsworks/register-elastic-ip-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/register-elastic-ip-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RegisterElasticIp", :http.request.configuration/output-deser-fn deser-register-elastic-ip-result, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef register-elastic-ip :args (clojure.spec.alpha/tuple :portkey.aws.opsworks/register-elastic-ip-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworks/register-elastic-ip-result))

(clojure.core/defn describe-elastic-load-balancers ([] (describe-elastic-load-balancers {})) ([describe-elastic-load-balancers-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-elastic-load-balancers-request describe-elastic-load-balancers-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec :portkey.aws.opsworks/describe-elastic-load-balancers-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/describe-elastic-load-balancers-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeElasticLoadBalancers", :http.request.configuration/output-deser-fn deser-describe-elastic-load-balancers-result, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-elastic-load-balancers :args (clojure.spec.alpha/? :portkey.aws.opsworks/describe-elastic-load-balancers-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworks/describe-elastic-load-balancers-result))

(clojure.core/defn update-app ([update-app-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-update-app-request update-app-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/update-app-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateApp", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef update-app :args (clojure.spec.alpha/tuple :portkey.aws.opsworks/update-app-request) :ret clojure.core/true?)

(clojure.core/defn delete-layer ([delete-layer-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-layer-request delete-layer-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/delete-layer-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteLayer", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-layer :args (clojure.spec.alpha/tuple :portkey.aws.opsworks/delete-layer-request) :ret clojure.core/true?)

(clojure.core/defn grant-access ([grant-access-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-grant-access-request grant-access-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec :portkey.aws.opsworks/grant-access-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/grant-access-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GrantAccess", :http.request.configuration/output-deser-fn deser-grant-access-result, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef grant-access :args (clojure.spec.alpha/tuple :portkey.aws.opsworks/grant-access-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworks/grant-access-result))

(clojure.core/defn describe-instances ([] (describe-instances {})) ([describe-instances-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-instances-request describe-instances-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec :portkey.aws.opsworks/describe-instances-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/describe-instances-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeInstances", :http.request.configuration/output-deser-fn deser-describe-instances-result, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-instances :args (clojure.spec.alpha/? :portkey.aws.opsworks/describe-instances-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworks/describe-instances-result))

(clojure.core/defn describe-stack-provisioning-parameters ([describe-stack-provisioning-parameters-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-stack-provisioning-parameters-request describe-stack-provisioning-parameters-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec :portkey.aws.opsworks/describe-stack-provisioning-parameters-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/describe-stack-provisioning-parameters-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeStackProvisioningParameters", :http.request.configuration/output-deser-fn deser-describe-stack-provisioning-parameters-result, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-stack-provisioning-parameters :args (clojure.spec.alpha/tuple :portkey.aws.opsworks/describe-stack-provisioning-parameters-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworks/describe-stack-provisioning-parameters-result))

(clojure.core/defn deregister-ecs-cluster ([deregister-ecs-cluster-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-deregister-ecs-cluster-request deregister-ecs-cluster-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/deregister-ecs-cluster-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeregisterEcsCluster", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef deregister-ecs-cluster :args (clojure.spec.alpha/tuple :portkey.aws.opsworks/deregister-ecs-cluster-request) :ret clojure.core/true?)

(clojure.core/defn delete-app ([delete-app-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-app-request delete-app-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/delete-app-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteApp", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-app :args (clojure.spec.alpha/tuple :portkey.aws.opsworks/delete-app-request) :ret clojure.core/true?)

(clojure.core/defn update-rds-db-instance ([update-rds-db-instance-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-update-rds-db-instance-request update-rds-db-instance-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/update-rds-db-instance-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateRdsDbInstance", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef update-rds-db-instance :args (clojure.spec.alpha/tuple :portkey.aws.opsworks/update-rds-db-instance-request) :ret clojure.core/true?)

(clojure.core/defn create-app ([create-app-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-app-request create-app-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec :portkey.aws.opsworks/create-app-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/create-app-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateApp", :http.request.configuration/output-deser-fn deser-create-app-result, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef create-app :args (clojure.spec.alpha/tuple :portkey.aws.opsworks/create-app-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworks/create-app-result))

(clojure.core/defn describe-commands ([] (describe-commands {})) ([describe-commands-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-commands-request describe-commands-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec :portkey.aws.opsworks/describe-commands-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/describe-commands-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeCommands", :http.request.configuration/output-deser-fn deser-describe-commands-result, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-commands :args (clojure.spec.alpha/? :portkey.aws.opsworks/describe-commands-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworks/describe-commands-result))

(clojure.core/defn create-stack ([create-stack-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-stack-request create-stack-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec :portkey.aws.opsworks/create-stack-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/create-stack-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateStack", :http.request.configuration/output-deser-fn deser-create-stack-result, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception}})))))
(clojure.spec.alpha/fdef create-stack :args (clojure.spec.alpha/tuple :portkey.aws.opsworks/create-stack-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworks/create-stack-result))

(clojure.core/defn update-volume ([update-volume-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-update-volume-request update-volume-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/update-volume-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateVolume", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef update-volume :args (clojure.spec.alpha/tuple :portkey.aws.opsworks/update-volume-request) :ret clojure.core/true?)

(clojure.core/defn register-instance ([register-instance-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-register-instance-request register-instance-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec :portkey.aws.opsworks/register-instance-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/register-instance-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RegisterInstance", :http.request.configuration/output-deser-fn deser-register-instance-result, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef register-instance :args (clojure.spec.alpha/tuple :portkey.aws.opsworks/register-instance-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworks/register-instance-result))

(clojure.core/defn describe-my-user-profile ([] (describe-my-user-profile {})) ([_] (clojure.core/let [request-function-result__28581__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec :portkey.aws.opsworks/describe-my-user-profile-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec nil, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeMyUserProfile", :http.request.configuration/output-deser-fn deser-describe-my-user-profile-result, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-my-user-profile :args clojure.core/empty? :ret (clojure.spec.alpha/and :portkey.aws.opsworks/describe-my-user-profile-result))

(clojure.core/defn assign-instance ([assign-instance-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-assign-instance-request assign-instance-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/assign-instance-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AssignInstance", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef assign-instance :args (clojure.spec.alpha/tuple :portkey.aws.opsworks/assign-instance-request) :ret clojure.core/true?)

(clojure.core/defn deregister-elastic-ip ([deregister-elastic-ip-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-deregister-elastic-ip-request deregister-elastic-ip-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/deregister-elastic-ip-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeregisterElasticIp", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef deregister-elastic-ip :args (clojure.spec.alpha/tuple :portkey.aws.opsworks/deregister-elastic-ip-request) :ret clojure.core/true?)

(clojure.core/defn describe-load-based-auto-scaling ([describe-load-based-auto-scaling-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-load-based-auto-scaling-request describe-load-based-auto-scaling-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec :portkey.aws.opsworks/describe-load-based-auto-scaling-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/describe-load-based-auto-scaling-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeLoadBasedAutoScaling", :http.request.configuration/output-deser-fn deser-describe-load-based-auto-scaling-result, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-load-based-auto-scaling :args (clojure.spec.alpha/tuple :portkey.aws.opsworks/describe-load-based-auto-scaling-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworks/describe-load-based-auto-scaling-result))

(clojure.core/defn describe-elastic-ips ([] (describe-elastic-ips {})) ([describe-elastic-ips-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-elastic-ips-request describe-elastic-ips-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec :portkey.aws.opsworks/describe-elastic-ips-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/describe-elastic-ips-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeElasticIps", :http.request.configuration/output-deser-fn deser-describe-elastic-ips-result, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-elastic-ips :args (clojure.spec.alpha/? :portkey.aws.opsworks/describe-elastic-ips-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworks/describe-elastic-ips-result))

(clojure.core/defn untag-resource ([untag-resource-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-untag-resource-request untag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/untag-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UntagResource", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef untag-resource :args (clojure.spec.alpha/tuple :portkey.aws.opsworks/untag-resource-request) :ret clojure.core/true?)

(clojure.core/defn describe-stacks ([] (describe-stacks {})) ([describe-stacks-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-stacks-request describe-stacks-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec :portkey.aws.opsworks/describe-stacks-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/describe-stacks-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeStacks", :http.request.configuration/output-deser-fn deser-describe-stacks-result, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-stacks :args (clojure.spec.alpha/? :portkey.aws.opsworks/describe-stacks-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworks/describe-stacks-result))

(clojure.core/defn set-load-based-auto-scaling ([set-load-based-auto-scaling-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-set-load-based-auto-scaling-request set-load-based-auto-scaling-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/set-load-based-auto-scaling-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SetLoadBasedAutoScaling", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef set-load-based-auto-scaling :args (clojure.spec.alpha/tuple :portkey.aws.opsworks/set-load-based-auto-scaling-request) :ret clojure.core/true?)

(clojure.core/defn set-permission ([set-permission-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-set-permission-request set-permission-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/set-permission-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SetPermission", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef set-permission :args (clojure.spec.alpha/tuple :portkey.aws.opsworks/set-permission-request) :ret clojure.core/true?)

(clojure.core/defn register-ecs-cluster ([register-ecs-cluster-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-register-ecs-cluster-request register-ecs-cluster-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec :portkey.aws.opsworks/register-ecs-cluster-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/register-ecs-cluster-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RegisterEcsCluster", :http.request.configuration/output-deser-fn deser-register-ecs-cluster-result, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef register-ecs-cluster :args (clojure.spec.alpha/tuple :portkey.aws.opsworks/register-ecs-cluster-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworks/register-ecs-cluster-result))

(clojure.core/defn update-layer ([update-layer-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-update-layer-request update-layer-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/update-layer-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateLayer", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef update-layer :args (clojure.spec.alpha/tuple :portkey.aws.opsworks/update-layer-request) :ret clojure.core/true?)

(clojure.core/defn describe-service-errors ([] (describe-service-errors {})) ([describe-service-errors-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-service-errors-request describe-service-errors-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec :portkey.aws.opsworks/describe-service-errors-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/describe-service-errors-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeServiceErrors", :http.request.configuration/output-deser-fn deser-describe-service-errors-result, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-service-errors :args (clojure.spec.alpha/? :portkey.aws.opsworks/describe-service-errors-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworks/describe-service-errors-result))

(clojure.core/defn clone-stack ([clone-stack-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-clone-stack-request clone-stack-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec :portkey.aws.opsworks/clone-stack-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/clone-stack-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CloneStack", :http.request.configuration/output-deser-fn deser-clone-stack-result, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef clone-stack :args (clojure.spec.alpha/tuple :portkey.aws.opsworks/clone-stack-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworks/clone-stack-result))

(clojure.core/defn update-elastic-ip ([update-elastic-ip-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-update-elastic-ip-request update-elastic-ip-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/update-elastic-ip-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateElasticIp", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef update-elastic-ip :args (clojure.spec.alpha/tuple :portkey.aws.opsworks/update-elastic-ip-request) :ret clojure.core/true?)

(clojure.core/defn delete-instance ([delete-instance-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-instance-request delete-instance-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/delete-instance-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteInstance", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-instance :args (clojure.spec.alpha/tuple :portkey.aws.opsworks/delete-instance-request) :ret clojure.core/true?)

(clojure.core/defn get-hostname-suggestion ([get-hostname-suggestion-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-hostname-suggestion-request get-hostname-suggestion-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec :portkey.aws.opsworks/get-hostname-suggestion-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/get-hostname-suggestion-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetHostnameSuggestion", :http.request.configuration/output-deser-fn deser-get-hostname-suggestion-result, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef get-hostname-suggestion :args (clojure.spec.alpha/tuple :portkey.aws.opsworks/get-hostname-suggestion-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworks/get-hostname-suggestion-result))

(clojure.core/defn detach-elastic-load-balancer ([detach-elastic-load-balancer-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-detach-elastic-load-balancer-request detach-elastic-load-balancer-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/detach-elastic-load-balancer-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DetachElasticLoadBalancer", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef detach-elastic-load-balancer :args (clojure.spec.alpha/tuple :portkey.aws.opsworks/detach-elastic-load-balancer-request) :ret clojure.core/true?)

(clojure.core/defn describe-raid-arrays ([] (describe-raid-arrays {})) ([describe-raid-arrays-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-raid-arrays-request describe-raid-arrays-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec :portkey.aws.opsworks/describe-raid-arrays-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/describe-raid-arrays-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeRaidArrays", :http.request.configuration/output-deser-fn deser-describe-raid-arrays-result, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-raid-arrays :args (clojure.spec.alpha/? :portkey.aws.opsworks/describe-raid-arrays-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworks/describe-raid-arrays-result))

(clojure.core/defn deregister-rds-db-instance ([deregister-rds-db-instance-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-deregister-rds-db-instance-request deregister-rds-db-instance-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/deregister-rds-db-instance-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeregisterRdsDbInstance", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef deregister-rds-db-instance :args (clojure.spec.alpha/tuple :portkey.aws.opsworks/deregister-rds-db-instance-request) :ret clojure.core/true?)

(clojure.core/defn attach-elastic-load-balancer ([attach-elastic-load-balancer-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-attach-elastic-load-balancer-request attach-elastic-load-balancer-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/attach-elastic-load-balancer-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AttachElasticLoadBalancer", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef attach-elastic-load-balancer :args (clojure.spec.alpha/tuple :portkey.aws.opsworks/attach-elastic-load-balancer-request) :ret clojure.core/true?)

(clojure.core/defn create-instance ([create-instance-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-instance-request create-instance-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.opsworks/endpoints, :http.request.configuration/target-prefix "OpsWorks_20130218", :http.request.spec/output-spec :portkey.aws.opsworks/create-instance-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-02-18", :http.request.configuration/service-id "OpsWorks", :http.request.spec/input-spec :portkey.aws.opsworks/create-instance-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateInstance", :http.request.configuration/output-deser-fn deser-create-instance-result, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworks/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef create-instance :args (clojure.spec.alpha/tuple :portkey.aws.opsworks/create-instance-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworks/create-instance-result))
