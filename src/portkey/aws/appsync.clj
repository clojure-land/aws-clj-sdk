(ns portkey.aws.appsync (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.core/declare ser-field-log-level)

(clojure.core/declare ser-http-data-source-config)

(clojure.core/declare ser-data-source-type)

(clojure.core/declare ser-log-config)

(clojure.core/declare ser-lambda-data-source-config)

(clojure.core/declare ser-default-action)

(clojure.core/declare ser-pagination-token)

(clojure.core/declare ser-user-pool-config)

(clojure.core/declare ser-type-definition-format)

(clojure.core/declare ser-output-type)

(clojure.core/declare ser-resource-name)

(clojure.core/declare ser-string)

(clojure.core/declare ser-authentication-type)

(clojure.core/declare ser-mapping-template)

(clojure.core/declare ser-long)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-open-id-connect-config)

(clojure.core/declare ser-blob)

(clojure.core/declare ser-dynamodb-data-source-config)

(clojure.core/declare ser-elasticsearch-data-source-config)

(clojure.core/declare ser-boolean)

(clojure.core/defn- ser-field-log-level [input] #:http.request.field{:value (clojure.core/get {"NONE" "NONE", :none "NONE", "ERROR" "ERROR", :error "ERROR", "ALL" "ALL", :all "ALL"} input), :shape "FieldLogLevel"})

(clojure.core/defn- ser-http-data-source-config [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "HttpDataSourceConfig", :type "structure"} (clojure.core/contains? input :endpoint) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :endpoint)) #:http.request.field{:name "endpoint", :shape "String"}))))

(clojure.core/defn- ser-data-source-type [input] #:http.request.field{:value (clojure.core/get {:amazon-dynamodb "AMAZON_DYNAMODB", :aws-lambda "AWS_LAMBDA", "AWS_LAMBDA" "AWS_LAMBDA", "NONE" "NONE", :amazon-elasticsearch "AMAZON_ELASTICSEARCH", "AMAZON_DYNAMODB" "AMAZON_DYNAMODB", "AMAZON_ELASTICSEARCH" "AMAZON_ELASTICSEARCH", :http "HTTP", "HTTP" "HTTP", :none "NONE"} input), :shape "DataSourceType"})

(clojure.core/defn- ser-log-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-field-log-level (:field-log-level input)) #:http.request.field{:name "fieldLogLevel", :shape "FieldLogLevel"}) (clojure.core/into (ser-string (:cloud-watch-logs-role-arn input)) #:http.request.field{:name "cloudWatchLogsRoleArn", :shape "String"})], :shape "LogConfig", :type "structure"}))

(clojure.core/defn- ser-lambda-data-source-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:lambda-function-arn input)) #:http.request.field{:name "lambdaFunctionArn", :shape "String"})], :shape "LambdaDataSourceConfig", :type "structure"}))

(clojure.core/defn- ser-default-action [input] #:http.request.field{:value (clojure.core/get {"ALLOW" "ALLOW", :allow "ALLOW", "DENY" "DENY", :deny "DENY"} input), :shape "DefaultAction"})

(clojure.core/defn- ser-pagination-token [input] #:http.request.field{:value input, :shape "PaginationToken"})

(clojure.core/defn- ser-user-pool-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:user-pool-id input)) #:http.request.field{:name "userPoolId", :shape "String"}) (clojure.core/into (ser-string (:aws-region input)) #:http.request.field{:name "awsRegion", :shape "String"}) (clojure.core/into (ser-default-action (:default-action input)) #:http.request.field{:name "defaultAction", :shape "DefaultAction"})], :shape "UserPoolConfig", :type "structure"} (clojure.core/contains? input :app-id-client-regex) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :app-id-client-regex)) #:http.request.field{:name "appIdClientRegex", :shape "String"}))))

(clojure.core/defn- ser-type-definition-format [input] #:http.request.field{:value (clojure.core/get {"SDL" "SDL", :sdl "SDL", "JSON" "JSON", :json "JSON"} input), :shape "TypeDefinitionFormat"})

(clojure.core/defn- ser-output-type [input] #:http.request.field{:value (clojure.core/get {"SDL" "SDL", :sdl "SDL", "JSON" "JSON", :json "JSON"} input), :shape "OutputType"})

(clojure.core/defn- ser-resource-name [input] #:http.request.field{:value input, :shape "ResourceName"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-authentication-type [input] #:http.request.field{:value (clojure.core/get {"API_KEY" "API_KEY", :api-key "API_KEY", "AWS_IAM" "AWS_IAM", :aws-iam "AWS_IAM", "AMAZON_COGNITO_USER_POOLS" "AMAZON_COGNITO_USER_POOLS", :amazon-cognito-user-pools "AMAZON_COGNITO_USER_POOLS", "OPENID_CONNECT" "OPENID_CONNECT", :openid-connect "OPENID_CONNECT"} input), :shape "AuthenticationType"})

(clojure.core/defn- ser-mapping-template [input] #:http.request.field{:value input, :shape "MappingTemplate"})

(clojure.core/defn- ser-long [input] #:http.request.field{:value input, :shape "Long"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-open-id-connect-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:issuer input)) #:http.request.field{:name "issuer", :shape "String"})], :shape "OpenIDConnectConfig", :type "structure"} (clojure.core/contains? input :client-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :client-id)) #:http.request.field{:name "clientId", :shape "String"})) (clojure.core/contains? input :iat-ttl) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-long (input :iat-ttl)) #:http.request.field{:name "iatTTL", :shape "Long"})) (clojure.core/contains? input :auth-ttl) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-long (input :auth-ttl)) #:http.request.field{:name "authTTL", :shape "Long"}))))

(clojure.core/defn- ser-blob [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "Blob"})

(clojure.core/defn- ser-dynamodb-data-source-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:table-name input)) #:http.request.field{:name "tableName", :shape "String"}) (clojure.core/into (ser-string (:aws-region input)) #:http.request.field{:name "awsRegion", :shape "String"})], :shape "DynamodbDataSourceConfig", :type "structure"} (clojure.core/contains? input :use-caller-credentials) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :use-caller-credentials)) #:http.request.field{:name "useCallerCredentials", :shape "Boolean"}))))

(clojure.core/defn- ser-elasticsearch-data-source-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:endpoint input)) #:http.request.field{:name "endpoint", :shape "String"}) (clojure.core/into (ser-string (:aws-region input)) #:http.request.field{:name "awsRegion", :shape "String"})], :shape "ElasticsearchDataSourceConfig", :type "structure"}))

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "Boolean"})

(clojure.core/defn- req-update-type-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"}) (clojure.core/into (ser-resource-name (input :type-name)) #:http.request.field{:name "typeName", :shape "ResourceName", :location "uri", :location-name "typeName"})], :body [(clojure.core/into (ser-type-definition-format (input :format)) #:http.request.field{:name "format", :shape "TypeDefinitionFormat"})]} (clojure.core/contains? input :definition) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :definition)) #:http.request.field{:name "definition", :shape "String"}))))

(clojure.core/defn- req-update-data-source-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"}) (clojure.core/into (ser-resource-name (input :name)) #:http.request.field{:name "name", :shape "ResourceName", :location "uri", :location-name "name"})], :body [(clojure.core/into (ser-data-source-type (input :type)) #:http.request.field{:name "type", :shape "DataSourceType"})]} (clojure.core/contains? input :elasticsearch-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-elasticsearch-data-source-config (input :elasticsearch-config)) #:http.request.field{:name "elasticsearchConfig", :shape "ElasticsearchDataSourceConfig"})) (clojure.core/contains? input :lambda-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lambda-data-source-config (input :lambda-config)) #:http.request.field{:name "lambdaConfig", :shape "LambdaDataSourceConfig"})) (clojure.core/contains? input :dynamodb-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dynamodb-data-source-config (input :dynamodb-config)) #:http.request.field{:name "dynamodbConfig", :shape "DynamodbDataSourceConfig"})) (clojure.core/contains? input :service-role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :service-role-arn)) #:http.request.field{:name "serviceRoleArn", :shape "String"})) (clojure.core/contains? input :http-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-http-data-source-config (input :http-config)) #:http.request.field{:name "httpConfig", :shape "HttpDataSourceConfig"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :description)) #:http.request.field{:name "description", :shape "String"}))))

(clojure.core/defn- req-get-schema-creation-status-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"})]}))

(clojure.core/defn- req-update-graphql-api-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"})], :body [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "name", :shape "String"})]} (clojure.core/contains? input :log-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-log-config (input :log-config)) #:http.request.field{:name "logConfig", :shape "LogConfig"})) (clojure.core/contains? input :authentication-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authentication-type (input :authentication-type)) #:http.request.field{:name "authenticationType", :shape "AuthenticationType"})) (clojure.core/contains? input :user-pool-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-user-pool-config (input :user-pool-config)) #:http.request.field{:name "userPoolConfig", :shape "UserPoolConfig"})) (clojure.core/contains? input :open-id-connect-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-open-id-connect-config (input :open-id-connect-config)) #:http.request.field{:name "openIDConnectConfig", :shape "OpenIDConnectConfig"}))))

(clojure.core/defn- req-create-data-source-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"})], :body [(clojure.core/into (ser-resource-name (input :name)) #:http.request.field{:name "name", :shape "ResourceName"}) (clojure.core/into (ser-data-source-type (input :type)) #:http.request.field{:name "type", :shape "DataSourceType"})]} (clojure.core/contains? input :elasticsearch-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-elasticsearch-data-source-config (input :elasticsearch-config)) #:http.request.field{:name "elasticsearchConfig", :shape "ElasticsearchDataSourceConfig"})) (clojure.core/contains? input :lambda-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lambda-data-source-config (input :lambda-config)) #:http.request.field{:name "lambdaConfig", :shape "LambdaDataSourceConfig"})) (clojure.core/contains? input :dynamodb-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dynamodb-data-source-config (input :dynamodb-config)) #:http.request.field{:name "dynamodbConfig", :shape "DynamodbDataSourceConfig"})) (clojure.core/contains? input :service-role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :service-role-arn)) #:http.request.field{:name "serviceRoleArn", :shape "String"})) (clojure.core/contains? input :http-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-http-data-source-config (input :http-config)) #:http.request.field{:name "httpConfig", :shape "HttpDataSourceConfig"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :description)) #:http.request.field{:name "description", :shape "String"}))))

(clojure.core/defn- req-get-resolver-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"}) (clojure.core/into (ser-resource-name (input :type-name)) #:http.request.field{:name "typeName", :shape "ResourceName", :location "uri", :location-name "typeName"}) (clojure.core/into (ser-resource-name (input :field-name)) #:http.request.field{:name "fieldName", :shape "ResourceName", :location "uri", :location-name "fieldName"})]}))

(clojure.core/defn- req-delete-api-key-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"}) (clojure.core/into (ser-string (input :id)) #:http.request.field{:name "id", :shape "String", :location "uri", :location-name "id"})]}))

(clojure.core/defn- req-create-graphql-api-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "name", :shape "String"}) (clojure.core/into (ser-authentication-type (input :authentication-type)) #:http.request.field{:name "authenticationType", :shape "AuthenticationType"})]} (clojure.core/contains? input :log-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-log-config (input :log-config)) #:http.request.field{:name "logConfig", :shape "LogConfig"})) (clojure.core/contains? input :user-pool-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-user-pool-config (input :user-pool-config)) #:http.request.field{:name "userPoolConfig", :shape "UserPoolConfig"})) (clojure.core/contains? input :open-id-connect-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-open-id-connect-config (input :open-id-connect-config)) #:http.request.field{:name "openIDConnectConfig", :shape "OpenIDConnectConfig"}))))

(clojure.core/defn- req-list-resolvers-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"}) (clojure.core/into (ser-string (input :type-name)) #:http.request.field{:name "typeName", :shape "String", :location "uri", :location-name "typeName"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"}))))

(clojure.core/defn- req-delete-graphql-api-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"})]}))

(clojure.core/defn- req-list-api-keys-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"}))))

(clojure.core/defn- req-get-graphql-api-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"})]}))

(clojure.core/defn- req-list-graphql-apis-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"}))))

(clojure.core/defn- req-delete-resolver-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"}) (clojure.core/into (ser-resource-name (input :type-name)) #:http.request.field{:name "typeName", :shape "ResourceName", :location "uri", :location-name "typeName"}) (clojure.core/into (ser-resource-name (input :field-name)) #:http.request.field{:name "fieldName", :shape "ResourceName", :location "uri", :location-name "fieldName"})]}))

(clojure.core/defn- req-create-type-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"})], :body [(clojure.core/into (ser-string (input :definition)) #:http.request.field{:name "definition", :shape "String"}) (clojure.core/into (ser-type-definition-format (input :format)) #:http.request.field{:name "format", :shape "TypeDefinitionFormat"})]}))

(clojure.core/defn- req-get-data-source-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"}) (clojure.core/into (ser-resource-name (input :name)) #:http.request.field{:name "name", :shape "ResourceName", :location "uri", :location-name "name"})]}))

(clojure.core/defn- req-create-api-key-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :description)) #:http.request.field{:name "description", :shape "String"})) (clojure.core/contains? input :expires) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-long (input :expires)) #:http.request.field{:name "expires", :shape "Long"}))))

(clojure.core/defn- req-delete-type-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"}) (clojure.core/into (ser-resource-name (input :type-name)) #:http.request.field{:name "typeName", :shape "ResourceName", :location "uri", :location-name "typeName"})]}))

(clojure.core/defn- req-get-introspection-schema-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"})], :querystring [(clojure.core/into (ser-output-type (input :format)) #:http.request.field{:name "format", :shape "OutputType", :location "querystring", :location-name "format"})]}))

(clojure.core/defn- req-list-data-sources-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"}))))

(clojure.core/defn- req-update-resolver-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"}) (clojure.core/into (ser-resource-name (input :type-name)) #:http.request.field{:name "typeName", :shape "ResourceName", :location "uri", :location-name "typeName"}) (clojure.core/into (ser-resource-name (input :field-name)) #:http.request.field{:name "fieldName", :shape "ResourceName", :location "uri", :location-name "fieldName"})], :body [(clojure.core/into (ser-resource-name (input :data-source-name)) #:http.request.field{:name "dataSourceName", :shape "ResourceName"}) (clojure.core/into (ser-mapping-template (input :request-mapping-template)) #:http.request.field{:name "requestMappingTemplate", :shape "MappingTemplate"})]} (clojure.core/contains? input :response-mapping-template) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mapping-template (input :response-mapping-template)) #:http.request.field{:name "responseMappingTemplate", :shape "MappingTemplate"}))))

(clojure.core/defn- req-create-resolver-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"}) (clojure.core/into (ser-resource-name (input :type-name)) #:http.request.field{:name "typeName", :shape "ResourceName", :location "uri", :location-name "typeName"})], :body [(clojure.core/into (ser-resource-name (input :field-name)) #:http.request.field{:name "fieldName", :shape "ResourceName"}) (clojure.core/into (ser-resource-name (input :data-source-name)) #:http.request.field{:name "dataSourceName", :shape "ResourceName"}) (clojure.core/into (ser-mapping-template (input :request-mapping-template)) #:http.request.field{:name "requestMappingTemplate", :shape "MappingTemplate"})]} (clojure.core/contains? input :response-mapping-template) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mapping-template (input :response-mapping-template)) #:http.request.field{:name "responseMappingTemplate", :shape "MappingTemplate"}))))

(clojure.core/defn- req-start-schema-creation-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"})], :body [(clojure.core/into (ser-blob (input :definition)) #:http.request.field{:name "definition", :shape "Blob"})]}))

(clojure.core/defn- req-update-api-key-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"}) (clojure.core/into (ser-string (input :id)) #:http.request.field{:name "id", :shape "String", :location "uri", :location-name "id"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :description)) #:http.request.field{:name "description", :shape "String"})) (clojure.core/contains? input :expires) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-long (input :expires)) #:http.request.field{:name "expires", :shape "Long"}))))

(clojure.core/defn- req-delete-data-source-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"}) (clojure.core/into (ser-resource-name (input :name)) #:http.request.field{:name "name", :shape "ResourceName", :location "uri", :location-name "name"})]}))

(clojure.core/defn- req-list-types-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"})], :querystring [(clojure.core/into (ser-type-definition-format (input :format)) #:http.request.field{:name "format", :shape "TypeDefinitionFormat", :location "querystring", :location-name "format"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"}))))

(clojure.core/defn- req-get-type-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"}) (clojure.core/into (ser-resource-name (input :type-name)) #:http.request.field{:name "typeName", :shape "ResourceName", :location "uri", :location-name "typeName"})], :querystring [(clojure.core/into (ser-type-definition-format (input :format)) #:http.request.field{:name "format", :shape "TypeDefinitionFormat", :location "querystring", :location-name "format"})]}))

(clojure.spec.alpha/def :portkey.aws.appsync.list-graphql-apis-response/graphql-apis (clojure.spec.alpha/and :portkey.aws.appsync/graphql-apis))
(clojure.spec.alpha/def :portkey.aws.appsync.list-graphql-apis-response/next-token (clojure.spec.alpha/and :portkey.aws.appsync/pagination-token))
(clojure.spec.alpha/def :portkey.aws.appsync/list-graphql-apis-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.list-graphql-apis-response/graphql-apis :portkey.aws.appsync.list-graphql-apis-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.appsync.unauthorized-exception/message (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync/unauthorized-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.unauthorized-exception/message]))

(clojure.spec.alpha/def :portkey.aws.appsync/field-log-level #{"ERROR" :all "NONE" :error "ALL" :none})

(clojure.spec.alpha/def :portkey.aws.appsync.update-type-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.update-type-request/type-name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.update-type-request/definition (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.update-type-request/format (clojure.spec.alpha/and :portkey.aws.appsync/type-definition-format))
(clojure.spec.alpha/def :portkey.aws.appsync/update-type-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.update-type-request/api-id :portkey.aws.appsync.update-type-request/type-name :portkey.aws.appsync.update-type-request/format] :opt-un [:portkey.aws.appsync.update-type-request/definition]))

(clojure.spec.alpha/def :portkey.aws.appsync/delete-type-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync/delete-graphql-api-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync.http-data-source-config/endpoint (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync/http-data-source-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.http-data-source-config/endpoint]))

(clojure.spec.alpha/def :portkey.aws.appsync.bad-request-exception/message (clojure.spec.alpha/and :portkey.aws.appsync/error-message))
(clojure.spec.alpha/def :portkey.aws.appsync/bad-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.bad-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.appsync/schema-status #{:processing :deleting :active "DELETING" "ACTIVE" "PROCESSING"})

(clojure.spec.alpha/def :portkey.aws.appsync.update-data-source-request/elasticsearch-config (clojure.spec.alpha/and :portkey.aws.appsync/elasticsearch-data-source-config))
(clojure.spec.alpha/def :portkey.aws.appsync.update-data-source-request/lambda-config (clojure.spec.alpha/and :portkey.aws.appsync/lambda-data-source-config))
(clojure.spec.alpha/def :portkey.aws.appsync.update-data-source-request/name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.update-data-source-request/dynamodb-config (clojure.spec.alpha/and :portkey.aws.appsync/dynamodb-data-source-config))
(clojure.spec.alpha/def :portkey.aws.appsync.update-data-source-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.update-data-source-request/service-role-arn (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.update-data-source-request/type (clojure.spec.alpha/and :portkey.aws.appsync/data-source-type))
(clojure.spec.alpha/def :portkey.aws.appsync.update-data-source-request/http-config (clojure.spec.alpha/and :portkey.aws.appsync/http-data-source-config))
(clojure.spec.alpha/def :portkey.aws.appsync.update-data-source-request/description (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync/update-data-source-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.update-data-source-request/api-id :portkey.aws.appsync.update-data-source-request/name :portkey.aws.appsync.update-data-source-request/type] :opt-un [:portkey.aws.appsync.update-data-source-request/elasticsearch-config :portkey.aws.appsync.update-data-source-request/lambda-config :portkey.aws.appsync.update-data-source-request/dynamodb-config :portkey.aws.appsync.update-data-source-request/service-role-arn :portkey.aws.appsync.update-data-source-request/http-config :portkey.aws.appsync.update-data-source-request/description]))

(clojure.spec.alpha/def :portkey.aws.appsync.type/name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.type/description (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.type/arn (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.type/definition (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.type/format (clojure.spec.alpha/and :portkey.aws.appsync/type-definition-format))
(clojure.spec.alpha/def :portkey.aws.appsync/type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.type/name :portkey.aws.appsync.type/description :portkey.aws.appsync.type/arn :portkey.aws.appsync.type/definition :portkey.aws.appsync.type/format]))

(clojure.spec.alpha/def :portkey.aws.appsync/data-source-type #{:amazon-dynamodb :aws-lambda "AWS_LAMBDA" "NONE" :amazon-elasticsearch "AMAZON_DYNAMODB" "AMAZON_ELASTICSEARCH" :http "HTTP" :none})

(clojure.spec.alpha/def :portkey.aws.appsync.log-config/field-log-level (clojure.spec.alpha/and :portkey.aws.appsync/field-log-level))
(clojure.spec.alpha/def :portkey.aws.appsync.log-config/cloud-watch-logs-role-arn (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync/log-config (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.log-config/field-log-level :portkey.aws.appsync.log-config/cloud-watch-logs-role-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync.api-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync/api-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.api-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.appsync.get-schema-creation-status-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync/get-schema-creation-status-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.get-schema-creation-status-request/api-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync.update-graphql-api-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.update-graphql-api-request/name (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.update-graphql-api-request/log-config (clojure.spec.alpha/and :portkey.aws.appsync/log-config))
(clojure.spec.alpha/def :portkey.aws.appsync.update-graphql-api-request/authentication-type (clojure.spec.alpha/and :portkey.aws.appsync/authentication-type))
(clojure.spec.alpha/def :portkey.aws.appsync.update-graphql-api-request/user-pool-config (clojure.spec.alpha/and :portkey.aws.appsync/user-pool-config))
(clojure.spec.alpha/def :portkey.aws.appsync.update-graphql-api-request/open-id-connect-config (clojure.spec.alpha/and :portkey.aws.appsync/open-id-connect-config))
(clojure.spec.alpha/def :portkey.aws.appsync/update-graphql-api-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.update-graphql-api-request/api-id :portkey.aws.appsync.update-graphql-api-request/name] :opt-un [:portkey.aws.appsync.update-graphql-api-request/log-config :portkey.aws.appsync.update-graphql-api-request/authentication-type :portkey.aws.appsync.update-graphql-api-request/user-pool-config :portkey.aws.appsync.update-graphql-api-request/open-id-connect-config]))

(clojure.spec.alpha/def :portkey.aws.appsync.create-data-source-request/elasticsearch-config (clojure.spec.alpha/and :portkey.aws.appsync/elasticsearch-data-source-config))
(clojure.spec.alpha/def :portkey.aws.appsync.create-data-source-request/lambda-config (clojure.spec.alpha/and :portkey.aws.appsync/lambda-data-source-config))
(clojure.spec.alpha/def :portkey.aws.appsync.create-data-source-request/name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.create-data-source-request/dynamodb-config (clojure.spec.alpha/and :portkey.aws.appsync/dynamodb-data-source-config))
(clojure.spec.alpha/def :portkey.aws.appsync.create-data-source-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.create-data-source-request/service-role-arn (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.create-data-source-request/type (clojure.spec.alpha/and :portkey.aws.appsync/data-source-type))
(clojure.spec.alpha/def :portkey.aws.appsync.create-data-source-request/http-config (clojure.spec.alpha/and :portkey.aws.appsync/http-data-source-config))
(clojure.spec.alpha/def :portkey.aws.appsync.create-data-source-request/description (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync/create-data-source-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.create-data-source-request/api-id :portkey.aws.appsync.create-data-source-request/name :portkey.aws.appsync.create-data-source-request/type] :opt-un [:portkey.aws.appsync.create-data-source-request/elasticsearch-config :portkey.aws.appsync.create-data-source-request/lambda-config :portkey.aws.appsync.create-data-source-request/dynamodb-config :portkey.aws.appsync.create-data-source-request/service-role-arn :portkey.aws.appsync.create-data-source-request/http-config :portkey.aws.appsync.create-data-source-request/description]))

(clojure.spec.alpha/def :portkey.aws.appsync.lambda-data-source-config/lambda-function-arn (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync/lambda-data-source-config (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.lambda-data-source-config/lambda-function-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync.get-resolver-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.get-resolver-request/type-name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.get-resolver-request/field-name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync/get-resolver-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.get-resolver-request/api-id :portkey.aws.appsync.get-resolver-request/type-name :portkey.aws.appsync.get-resolver-request/field-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync.update-resolver-response/resolver (clojure.spec.alpha/and :portkey.aws.appsync/resolver))
(clojure.spec.alpha/def :portkey.aws.appsync/update-resolver-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.update-resolver-response/resolver]))

(clojure.spec.alpha/def :portkey.aws.appsync.list-api-keys-response/api-keys (clojure.spec.alpha/and :portkey.aws.appsync/api-keys))
(clojure.spec.alpha/def :portkey.aws.appsync.list-api-keys-response/next-token (clojure.spec.alpha/and :portkey.aws.appsync/pagination-token))
(clojure.spec.alpha/def :portkey.aws.appsync/list-api-keys-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.list-api-keys-response/api-keys :portkey.aws.appsync.list-api-keys-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.appsync/graphql-apis (clojure.spec.alpha/coll-of :portkey.aws.appsync/graphql-api))

(clojure.spec.alpha/def :portkey.aws.appsync.delete-api-key-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.delete-api-key-request/id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync/delete-api-key-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.delete-api-key-request/api-id :portkey.aws.appsync.delete-api-key-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync.create-graphql-api-request/name (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.create-graphql-api-request/log-config (clojure.spec.alpha/and :portkey.aws.appsync/log-config))
(clojure.spec.alpha/def :portkey.aws.appsync.create-graphql-api-request/authentication-type (clojure.spec.alpha/and :portkey.aws.appsync/authentication-type))
(clojure.spec.alpha/def :portkey.aws.appsync.create-graphql-api-request/user-pool-config (clojure.spec.alpha/and :portkey.aws.appsync/user-pool-config))
(clojure.spec.alpha/def :portkey.aws.appsync.create-graphql-api-request/open-id-connect-config (clojure.spec.alpha/and :portkey.aws.appsync/open-id-connect-config))
(clojure.spec.alpha/def :portkey.aws.appsync/create-graphql-api-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.create-graphql-api-request/name :portkey.aws.appsync.create-graphql-api-request/authentication-type] :opt-un [:portkey.aws.appsync.create-graphql-api-request/log-config :portkey.aws.appsync.create-graphql-api-request/user-pool-config :portkey.aws.appsync.create-graphql-api-request/open-id-connect-config]))

(clojure.spec.alpha/def :portkey.aws.appsync.list-resolvers-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.list-resolvers-request/type-name (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.list-resolvers-request/next-token (clojure.spec.alpha/and :portkey.aws.appsync/pagination-token))
(clojure.spec.alpha/def :portkey.aws.appsync.list-resolvers-request/max-results (clojure.spec.alpha/and :portkey.aws.appsync/max-results))
(clojure.spec.alpha/def :portkey.aws.appsync/list-resolvers-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.list-resolvers-request/api-id :portkey.aws.appsync.list-resolvers-request/type-name] :opt-un [:portkey.aws.appsync.list-resolvers-request/next-token :portkey.aws.appsync.list-resolvers-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.appsync/default-action #{"DENY" :allow "ALLOW" :deny})

(clojure.spec.alpha/def :portkey.aws.appsync.delete-graphql-api-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync/delete-graphql-api-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.delete-graphql-api-request/api-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync/pagination-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[\\S]+" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.appsync.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.appsync.list-types-response/types (clojure.spec.alpha/and :portkey.aws.appsync/type-list))
(clojure.spec.alpha/def :portkey.aws.appsync.list-types-response/next-token (clojure.spec.alpha/and :portkey.aws.appsync/pagination-token))
(clojure.spec.alpha/def :portkey.aws.appsync/list-types-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.list-types-response/types :portkey.aws.appsync.list-types-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.appsync.user-pool-config/user-pool-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.user-pool-config/aws-region (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.user-pool-config/default-action (clojure.spec.alpha/and :portkey.aws.appsync/default-action))
(clojure.spec.alpha/def :portkey.aws.appsync.user-pool-config/app-id-client-regex (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync/user-pool-config (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.user-pool-config/user-pool-id :portkey.aws.appsync.user-pool-config/aws-region :portkey.aws.appsync.user-pool-config/default-action] :opt-un [:portkey.aws.appsync.user-pool-config/app-id-client-regex]))

(clojure.spec.alpha/def :portkey.aws.appsync.list-api-keys-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.list-api-keys-request/next-token (clojure.spec.alpha/and :portkey.aws.appsync/pagination-token))
(clojure.spec.alpha/def :portkey.aws.appsync.list-api-keys-request/max-results (clojure.spec.alpha/and :portkey.aws.appsync/max-results))
(clojure.spec.alpha/def :portkey.aws.appsync/list-api-keys-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.list-api-keys-request/api-id] :opt-un [:portkey.aws.appsync.list-api-keys-request/next-token :portkey.aws.appsync.list-api-keys-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.appsync.get-graphql-api-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync/get-graphql-api-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.get-graphql-api-request/api-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync/delete-resolver-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync/type-definition-format #{"SDL" "JSON" :sdl :json})

(clojure.spec.alpha/def :portkey.aws.appsync.list-resolvers-response/resolvers (clojure.spec.alpha/and :portkey.aws.appsync/resolvers))
(clojure.spec.alpha/def :portkey.aws.appsync.list-resolvers-response/next-token (clojure.spec.alpha/and :portkey.aws.appsync/pagination-token))
(clojure.spec.alpha/def :portkey.aws.appsync/list-resolvers-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.list-resolvers-response/resolvers :portkey.aws.appsync.list-resolvers-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.appsync.graph-ql-schema-exception/message (clojure.spec.alpha/and :portkey.aws.appsync/error-message))
(clojure.spec.alpha/def :portkey.aws.appsync/graph-ql-schema-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.graph-ql-schema-exception/message]))

(clojure.spec.alpha/def :portkey.aws.appsync.create-data-source-response/data-source (clojure.spec.alpha/and :portkey.aws.appsync/data-source))
(clojure.spec.alpha/def :portkey.aws.appsync/create-data-source-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.create-data-source-response/data-source]))

(clojure.spec.alpha/def :portkey.aws.appsync/type-list (clojure.spec.alpha/coll-of :portkey.aws.appsync/type))

(clojure.spec.alpha/def :portkey.aws.appsync.list-graphql-apis-request/next-token (clojure.spec.alpha/and :portkey.aws.appsync/pagination-token))
(clojure.spec.alpha/def :portkey.aws.appsync.list-graphql-apis-request/max-results (clojure.spec.alpha/and :portkey.aws.appsync/max-results))
(clojure.spec.alpha/def :portkey.aws.appsync/list-graphql-apis-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.list-graphql-apis-request/next-token :portkey.aws.appsync.list-graphql-apis-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.appsync.create-api-key-response/api-key (clojure.spec.alpha/and :portkey.aws.appsync/api-key))
(clojure.spec.alpha/def :portkey.aws.appsync/create-api-key-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.create-api-key-response/api-key]))

(clojure.spec.alpha/def :portkey.aws.appsync.graphql-api/name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.graphql-api/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.graphql-api/authentication-type (clojure.spec.alpha/and :portkey.aws.appsync/authentication-type))
(clojure.spec.alpha/def :portkey.aws.appsync.graphql-api/log-config (clojure.spec.alpha/and :portkey.aws.appsync/log-config))
(clojure.spec.alpha/def :portkey.aws.appsync.graphql-api/user-pool-config (clojure.spec.alpha/and :portkey.aws.appsync/user-pool-config))
(clojure.spec.alpha/def :portkey.aws.appsync.graphql-api/open-id-connect-config (clojure.spec.alpha/and :portkey.aws.appsync/open-id-connect-config))
(clojure.spec.alpha/def :portkey.aws.appsync.graphql-api/arn (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.graphql-api/uris (clojure.spec.alpha/and :portkey.aws.appsync/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.appsync/graphql-api (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.graphql-api/name :portkey.aws.appsync.graphql-api/api-id :portkey.aws.appsync.graphql-api/authentication-type :portkey.aws.appsync.graphql-api/log-config :portkey.aws.appsync.graphql-api/user-pool-config :portkey.aws.appsync.graphql-api/open-id-connect-config :portkey.aws.appsync.graphql-api/arn :portkey.aws.appsync.graphql-api/uris]))

(clojure.spec.alpha/def :portkey.aws.appsync/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.appsync/output-type #{"SDL" "JSON" :sdl :json})

(clojure.spec.alpha/def :portkey.aws.appsync.internal-failure-exception/message (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync/internal-failure-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.internal-failure-exception/message]))

(clojure.spec.alpha/def :portkey.aws.appsync/delete-api-key-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync/data-sources (clojure.spec.alpha/coll-of :portkey.aws.appsync/data-source))

(clojure.spec.alpha/def :portkey.aws.appsync/resolvers (clojure.spec.alpha/coll-of :portkey.aws.appsync/resolver))

(clojure.spec.alpha/def :portkey.aws.appsync.delete-resolver-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.delete-resolver-request/type-name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.delete-resolver-request/field-name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync/delete-resolver-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.delete-resolver-request/api-id :portkey.aws.appsync.delete-resolver-request/type-name :portkey.aws.appsync.delete-resolver-request/field-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync.create-type-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.create-type-request/definition (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.create-type-request/format (clojure.spec.alpha/and :portkey.aws.appsync/type-definition-format))
(clojure.spec.alpha/def :portkey.aws.appsync/create-type-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.create-type-request/api-id :portkey.aws.appsync.create-type-request/definition :portkey.aws.appsync.create-type-request/format] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync.update-data-source-response/data-source (clojure.spec.alpha/and :portkey.aws.appsync/data-source))
(clojure.spec.alpha/def :portkey.aws.appsync/update-data-source-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.update-data-source-response/data-source]))

(clojure.spec.alpha/def :portkey.aws.appsync.get-introspection-schema-response/schema (clojure.spec.alpha/and :portkey.aws.appsync/blob))
(clojure.spec.alpha/def :portkey.aws.appsync/get-introspection-schema-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.get-introspection-schema-response/schema]))

(clojure.spec.alpha/def :portkey.aws.appsync.get-graphql-api-response/graphql-api (clojure.spec.alpha/and :portkey.aws.appsync/graphql-api))
(clojure.spec.alpha/def :portkey.aws.appsync/get-graphql-api-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.get-graphql-api-response/graphql-api]))

(clojure.spec.alpha/def :portkey.aws.appsync.get-data-source-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.get-data-source-request/name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync/get-data-source-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.get-data-source-request/api-id :portkey.aws.appsync.get-data-source-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync.not-found-exception/message (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync/not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.appsync.create-api-key-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.create-api-key-request/description (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.create-api-key-request/expires (clojure.spec.alpha/and :portkey.aws.appsync/long))
(clojure.spec.alpha/def :portkey.aws.appsync/create-api-key-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.create-api-key-request/api-id] :opt-un [:portkey.aws.appsync.create-api-key-request/description :portkey.aws.appsync.create-api-key-request/expires]))

(clojure.spec.alpha/def :portkey.aws.appsync/resource-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[_A-Za-z][_0-9A-Za-z]*" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.appsync/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.appsync.delete-type-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.delete-type-request/type-name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync/delete-type-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.delete-type-request/api-id :portkey.aws.appsync.delete-type-request/type-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync/authentication-type #{"AMAZON_COGNITO_USER_POOLS" :openid-connect :aws-iam "AWS_IAM" "OPENID_CONNECT" "API_KEY" :api-key :amazon-cognito-user-pools})

(clojure.spec.alpha/def :portkey.aws.appsync/mapping-template (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 65536))))

(clojure.spec.alpha/def :portkey.aws.appsync.data-source/elasticsearch-config (clojure.spec.alpha/and :portkey.aws.appsync/elasticsearch-data-source-config))
(clojure.spec.alpha/def :portkey.aws.appsync.data-source/lambda-config (clojure.spec.alpha/and :portkey.aws.appsync/lambda-data-source-config))
(clojure.spec.alpha/def :portkey.aws.appsync.data-source/name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.data-source/dynamodb-config (clojure.spec.alpha/and :portkey.aws.appsync/dynamodb-data-source-config))
(clojure.spec.alpha/def :portkey.aws.appsync.data-source/service-role-arn (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.data-source/type (clojure.spec.alpha/and :portkey.aws.appsync/data-source-type))
(clojure.spec.alpha/def :portkey.aws.appsync.data-source/data-source-arn (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.data-source/http-config (clojure.spec.alpha/and :portkey.aws.appsync/http-data-source-config))
(clojure.spec.alpha/def :portkey.aws.appsync.data-source/description (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync/data-source (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.data-source/elasticsearch-config :portkey.aws.appsync.data-source/lambda-config :portkey.aws.appsync.data-source/name :portkey.aws.appsync.data-source/dynamodb-config :portkey.aws.appsync.data-source/service-role-arn :portkey.aws.appsync.data-source/type :portkey.aws.appsync.data-source/data-source-arn :portkey.aws.appsync.data-source/http-config :portkey.aws.appsync.data-source/description]))

(clojure.spec.alpha/def :portkey.aws.appsync.update-api-key-response/api-key (clojure.spec.alpha/and :portkey.aws.appsync/api-key))
(clojure.spec.alpha/def :portkey.aws.appsync/update-api-key-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.update-api-key-response/api-key]))

(clojure.spec.alpha/def :portkey.aws.appsync.get-introspection-schema-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.get-introspection-schema-request/format (clojure.spec.alpha/and :portkey.aws.appsync/output-type))
(clojure.spec.alpha/def :portkey.aws.appsync/get-introspection-schema-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.get-introspection-schema-request/api-id :portkey.aws.appsync.get-introspection-schema-request/format] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync.api-key-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync/api-key-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.api-key-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.appsync.list-data-sources-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.list-data-sources-request/next-token (clojure.spec.alpha/and :portkey.aws.appsync/pagination-token))
(clojure.spec.alpha/def :portkey.aws.appsync.list-data-sources-request/max-results (clojure.spec.alpha/and :portkey.aws.appsync/max-results))
(clojure.spec.alpha/def :portkey.aws.appsync/list-data-sources-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.list-data-sources-request/api-id] :opt-un [:portkey.aws.appsync.list-data-sources-request/next-token :portkey.aws.appsync.list-data-sources-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.appsync/map-of-string-to-string (clojure.spec.alpha/map-of :portkey.aws.appsync/string :portkey.aws.appsync/string))

(clojure.spec.alpha/def :portkey.aws.appsync.get-resolver-response/resolver (clojure.spec.alpha/and :portkey.aws.appsync/resolver))
(clojure.spec.alpha/def :portkey.aws.appsync/get-resolver-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.get-resolver-response/resolver]))

(clojure.spec.alpha/def :portkey.aws.appsync.start-schema-creation-response/status (clojure.spec.alpha/and :portkey.aws.appsync/schema-status))
(clojure.spec.alpha/def :portkey.aws.appsync/start-schema-creation-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.start-schema-creation-response/status]))

(clojure.spec.alpha/def :portkey.aws.appsync.update-resolver-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.update-resolver-request/type-name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.update-resolver-request/field-name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.update-resolver-request/data-source-name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.update-resolver-request/request-mapping-template (clojure.spec.alpha/and :portkey.aws.appsync/mapping-template))
(clojure.spec.alpha/def :portkey.aws.appsync.update-resolver-request/response-mapping-template (clojure.spec.alpha/and :portkey.aws.appsync/mapping-template))
(clojure.spec.alpha/def :portkey.aws.appsync/update-resolver-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.update-resolver-request/api-id :portkey.aws.appsync.update-resolver-request/type-name :portkey.aws.appsync.update-resolver-request/field-name :portkey.aws.appsync.update-resolver-request/data-source-name :portkey.aws.appsync.update-resolver-request/request-mapping-template] :opt-un [:portkey.aws.appsync.update-resolver-request/response-mapping-template]))

(clojure.spec.alpha/def :portkey.aws.appsync.create-resolver-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.create-resolver-request/type-name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.create-resolver-request/field-name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.create-resolver-request/data-source-name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.create-resolver-request/request-mapping-template (clojure.spec.alpha/and :portkey.aws.appsync/mapping-template))
(clojure.spec.alpha/def :portkey.aws.appsync.create-resolver-request/response-mapping-template (clojure.spec.alpha/and :portkey.aws.appsync/mapping-template))
(clojure.spec.alpha/def :portkey.aws.appsync/create-resolver-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.create-resolver-request/api-id :portkey.aws.appsync.create-resolver-request/type-name :portkey.aws.appsync.create-resolver-request/field-name :portkey.aws.appsync.create-resolver-request/data-source-name :portkey.aws.appsync.create-resolver-request/request-mapping-template] :opt-un [:portkey.aws.appsync.create-resolver-request/response-mapping-template]))

(clojure.spec.alpha/def :portkey.aws.appsync.create-graphql-api-response/graphql-api (clojure.spec.alpha/and :portkey.aws.appsync/graphql-api))
(clojure.spec.alpha/def :portkey.aws.appsync/create-graphql-api-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.create-graphql-api-response/graphql-api]))

(clojure.spec.alpha/def :portkey.aws.appsync.create-resolver-response/resolver (clojure.spec.alpha/and :portkey.aws.appsync/resolver))
(clojure.spec.alpha/def :portkey.aws.appsync/create-resolver-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.create-resolver-response/resolver]))

(clojure.spec.alpha/def :portkey.aws.appsync/api-keys (clojure.spec.alpha/coll-of :portkey.aws.appsync/api-key))

(clojure.spec.alpha/def :portkey.aws.appsync/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.appsync.create-type-response/type (clojure.spec.alpha/and :portkey.aws.appsync/type))
(clojure.spec.alpha/def :portkey.aws.appsync/create-type-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.create-type-response/type]))

(clojure.spec.alpha/def :portkey.aws.appsync/delete-data-source-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync.start-schema-creation-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.start-schema-creation-request/definition (clojure.spec.alpha/and :portkey.aws.appsync/blob))
(clojure.spec.alpha/def :portkey.aws.appsync/start-schema-creation-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.start-schema-creation-request/api-id :portkey.aws.appsync.start-schema-creation-request/definition] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync.update-api-key-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.update-api-key-request/id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.update-api-key-request/description (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.update-api-key-request/expires (clojure.spec.alpha/and :portkey.aws.appsync/long))
(clojure.spec.alpha/def :portkey.aws.appsync/update-api-key-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.update-api-key-request/api-id :portkey.aws.appsync.update-api-key-request/id] :opt-un [:portkey.aws.appsync.update-api-key-request/description :portkey.aws.appsync.update-api-key-request/expires]))

(clojure.spec.alpha/def :portkey.aws.appsync.api-key-validity-out-of-bounds-exception/message (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync/api-key-validity-out-of-bounds-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.api-key-validity-out-of-bounds-exception/message]))

(clojure.spec.alpha/def :portkey.aws.appsync/max-results (clojure.spec.alpha/int-in 0 25))

(clojure.spec.alpha/def :portkey.aws.appsync.delete-data-source-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.delete-data-source-request/name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync/delete-data-source-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.delete-data-source-request/api-id :portkey.aws.appsync.delete-data-source-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync.open-id-connect-config/issuer (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.open-id-connect-config/client-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.open-id-connect-config/iat-ttl (clojure.spec.alpha/and :portkey.aws.appsync/long))
(clojure.spec.alpha/def :portkey.aws.appsync.open-id-connect-config/auth-ttl (clojure.spec.alpha/and :portkey.aws.appsync/long))
(clojure.spec.alpha/def :portkey.aws.appsync/open-id-connect-config (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.open-id-connect-config/issuer] :opt-un [:portkey.aws.appsync.open-id-connect-config/client-id :portkey.aws.appsync.open-id-connect-config/iat-ttl :portkey.aws.appsync.open-id-connect-config/auth-ttl]))

(clojure.spec.alpha/def :portkey.aws.appsync.api-key/id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.api-key/description (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.api-key/expires (clojure.spec.alpha/and :portkey.aws.appsync/long))
(clojure.spec.alpha/def :portkey.aws.appsync/api-key (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.api-key/id :portkey.aws.appsync.api-key/description :portkey.aws.appsync.api-key/expires]))

(clojure.spec.alpha/def :portkey.aws.appsync.list-data-sources-response/data-sources (clojure.spec.alpha/and :portkey.aws.appsync/data-sources))
(clojure.spec.alpha/def :portkey.aws.appsync.list-data-sources-response/next-token (clojure.spec.alpha/and :portkey.aws.appsync/pagination-token))
(clojure.spec.alpha/def :portkey.aws.appsync/list-data-sources-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.list-data-sources-response/data-sources :portkey.aws.appsync.list-data-sources-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.appsync/blob clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.appsync.concurrent-modification-exception/message (clojure.spec.alpha/and :portkey.aws.appsync/error-message))
(clojure.spec.alpha/def :portkey.aws.appsync/concurrent-modification-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.concurrent-modification-exception/message]))

(clojure.spec.alpha/def :portkey.aws.appsync.list-types-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.list-types-request/format (clojure.spec.alpha/and :portkey.aws.appsync/type-definition-format))
(clojure.spec.alpha/def :portkey.aws.appsync.list-types-request/next-token (clojure.spec.alpha/and :portkey.aws.appsync/pagination-token))
(clojure.spec.alpha/def :portkey.aws.appsync.list-types-request/max-results (clojure.spec.alpha/and :portkey.aws.appsync/max-results))
(clojure.spec.alpha/def :portkey.aws.appsync/list-types-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.list-types-request/api-id :portkey.aws.appsync.list-types-request/format] :opt-un [:portkey.aws.appsync.list-types-request/next-token :portkey.aws.appsync.list-types-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.appsync.resolver/type-name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.resolver/field-name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.resolver/data-source-name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.resolver/resolver-arn (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.resolver/request-mapping-template (clojure.spec.alpha/and :portkey.aws.appsync/mapping-template))
(clojure.spec.alpha/def :portkey.aws.appsync.resolver/response-mapping-template (clojure.spec.alpha/and :portkey.aws.appsync/mapping-template))
(clojure.spec.alpha/def :portkey.aws.appsync/resolver (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.resolver/type-name :portkey.aws.appsync.resolver/field-name :portkey.aws.appsync.resolver/data-source-name :portkey.aws.appsync.resolver/resolver-arn :portkey.aws.appsync.resolver/request-mapping-template :portkey.aws.appsync.resolver/response-mapping-template]))

(clojure.spec.alpha/def :portkey.aws.appsync.get-type-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.get-type-request/type-name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.get-type-request/format (clojure.spec.alpha/and :portkey.aws.appsync/type-definition-format))
(clojure.spec.alpha/def :portkey.aws.appsync/get-type-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.get-type-request/api-id :portkey.aws.appsync.get-type-request/type-name :portkey.aws.appsync.get-type-request/format] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync.get-schema-creation-status-response/status (clojure.spec.alpha/and :portkey.aws.appsync/schema-status))
(clojure.spec.alpha/def :portkey.aws.appsync.get-schema-creation-status-response/details (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync/get-schema-creation-status-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.get-schema-creation-status-response/status :portkey.aws.appsync.get-schema-creation-status-response/details]))

(clojure.spec.alpha/def :portkey.aws.appsync.get-data-source-response/data-source (clojure.spec.alpha/and :portkey.aws.appsync/data-source))
(clojure.spec.alpha/def :portkey.aws.appsync/get-data-source-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.get-data-source-response/data-source]))

(clojure.spec.alpha/def :portkey.aws.appsync.update-type-response/type (clojure.spec.alpha/and :portkey.aws.appsync/type))
(clojure.spec.alpha/def :portkey.aws.appsync/update-type-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.update-type-response/type]))

(clojure.spec.alpha/def :portkey.aws.appsync.get-type-response/type (clojure.spec.alpha/and :portkey.aws.appsync/type))
(clojure.spec.alpha/def :portkey.aws.appsync/get-type-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.get-type-response/type]))

(clojure.spec.alpha/def :portkey.aws.appsync.dynamodb-data-source-config/table-name (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.dynamodb-data-source-config/aws-region (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.dynamodb-data-source-config/use-caller-credentials (clojure.spec.alpha/and :portkey.aws.appsync/boolean))
(clojure.spec.alpha/def :portkey.aws.appsync/dynamodb-data-source-config (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.dynamodb-data-source-config/table-name :portkey.aws.appsync.dynamodb-data-source-config/aws-region] :opt-un [:portkey.aws.appsync.dynamodb-data-source-config/use-caller-credentials]))

(clojure.spec.alpha/def :portkey.aws.appsync.elasticsearch-data-source-config/endpoint (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.elasticsearch-data-source-config/aws-region (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync/elasticsearch-data-source-config (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.elasticsearch-data-source-config/endpoint :portkey.aws.appsync.elasticsearch-data-source-config/aws-region] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync.update-graphql-api-response/graphql-api (clojure.spec.alpha/and :portkey.aws.appsync/graphql-api))
(clojure.spec.alpha/def :portkey.aws.appsync/update-graphql-api-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.update-graphql-api-response/graphql-api]))

(clojure.spec.alpha/def :portkey.aws.appsync/boolean clojure.core/boolean?)

(clojure.core/defn start-schema-creation ([start-schema-creation-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-start-schema-creation-request start-schema-creation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.appsync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync/start-schema-creation-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/schemacreation", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.appsync/start-schema-creation-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartSchemaCreation", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "ConcurrentModificationException" :portkey.aws.appsync/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception}})))))
(clojure.spec.alpha/fdef start-schema-creation :args (clojure.spec.alpha/tuple :portkey.aws.appsync/start-schema-creation-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/start-schema-creation-response))

(clojure.core/defn get-type ([get-type-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-type-request get-type-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.appsync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync/get-type-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/types/{typeName}", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.appsync/get-type-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetType", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "ConcurrentModificationException" :portkey.aws.appsync/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception}})))))
(clojure.spec.alpha/fdef get-type :args (clojure.spec.alpha/tuple :portkey.aws.appsync/get-type-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/get-type-response))

(clojure.core/defn delete-resolver ([delete-resolver-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-resolver-request delete-resolver-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.appsync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync/delete-resolver-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/types/{typeName}/resolvers/{fieldName}", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.appsync/delete-resolver-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteResolver", :http.request.spec/error-spec {"ConcurrentModificationException" :portkey.aws.appsync/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception}})))))
(clojure.spec.alpha/fdef delete-resolver :args (clojure.spec.alpha/tuple :portkey.aws.appsync/delete-resolver-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/delete-resolver-response))

(clojure.core/defn get-introspection-schema ([get-introspection-schema-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-introspection-schema-request get-introspection-schema-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.appsync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync/get-introspection-schema-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/schema", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.appsync/get-introspection-schema-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetIntrospectionSchema", :http.request.spec/error-spec {"GraphQLSchemaException" :portkey.aws.appsync/graph-ql-schema-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception}})))))
(clojure.spec.alpha/fdef get-introspection-schema :args (clojure.spec.alpha/tuple :portkey.aws.appsync/get-introspection-schema-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/get-introspection-schema-response))

(clojure.core/defn create-graphql-api ([create-graphql-api-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-graphql-api-request create-graphql-api-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.appsync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync/create-graphql-api-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.appsync/create-graphql-api-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateGraphqlApi", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "LimitExceededException" :portkey.aws.appsync/limit-exceeded-exception, "ConcurrentModificationException" :portkey.aws.appsync/concurrent-modification-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception, "ApiLimitExceededException" :portkey.aws.appsync/api-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-graphql-api :args (clojure.spec.alpha/tuple :portkey.aws.appsync/create-graphql-api-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/create-graphql-api-response))

(clojure.core/defn list-data-sources ([list-data-sources-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-data-sources-request list-data-sources-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.appsync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync/list-data-sources-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/datasources", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.appsync/list-data-sources-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListDataSources", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception}})))))
(clojure.spec.alpha/fdef list-data-sources :args (clojure.spec.alpha/tuple :portkey.aws.appsync/list-data-sources-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/list-data-sources-response))

(clojure.core/defn create-api-key ([create-api-key-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-api-key-request create-api-key-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.appsync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync/create-api-key-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/apikeys", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.appsync/create-api-key-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateApiKey", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "LimitExceededException" :portkey.aws.appsync/limit-exceeded-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception, "ApiKeyLimitExceededException" :portkey.aws.appsync/api-key-limit-exceeded-exception, "ApiKeyValidityOutOfBoundsException" :portkey.aws.appsync/api-key-validity-out-of-bounds-exception}})))))
(clojure.spec.alpha/fdef create-api-key :args (clojure.spec.alpha/tuple :portkey.aws.appsync/create-api-key-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/create-api-key-response))

(clojure.core/defn delete-api-key ([delete-api-key-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-api-key-request delete-api-key-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.appsync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync/delete-api-key-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/apikeys/{id}", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.appsync/delete-api-key-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteApiKey", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception}})))))
(clojure.spec.alpha/fdef delete-api-key :args (clojure.spec.alpha/tuple :portkey.aws.appsync/delete-api-key-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/delete-api-key-response))

(clojure.core/defn get-resolver ([get-resolver-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-resolver-request get-resolver-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.appsync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync/get-resolver-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/types/{typeName}/resolvers/{fieldName}", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.appsync/get-resolver-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetResolver", :http.request.spec/error-spec {"ConcurrentModificationException" :portkey.aws.appsync/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception}})))))
(clojure.spec.alpha/fdef get-resolver :args (clojure.spec.alpha/tuple :portkey.aws.appsync/get-resolver-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/get-resolver-response))

(clojure.core/defn update-data-source ([update-data-source-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-data-source-request update-data-source-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.appsync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync/update-data-source-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/datasources/{name}", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.appsync/update-data-source-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateDataSource", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "ConcurrentModificationException" :portkey.aws.appsync/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception}})))))
(clojure.spec.alpha/fdef update-data-source :args (clojure.spec.alpha/tuple :portkey.aws.appsync/update-data-source-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/update-data-source-response))

(clojure.core/defn update-api-key ([update-api-key-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-api-key-request update-api-key-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.appsync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync/update-api-key-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/apikeys/{id}", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.appsync/update-api-key-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateApiKey", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "LimitExceededException" :portkey.aws.appsync/limit-exceeded-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception, "ApiKeyValidityOutOfBoundsException" :portkey.aws.appsync/api-key-validity-out-of-bounds-exception}})))))
(clojure.spec.alpha/fdef update-api-key :args (clojure.spec.alpha/tuple :portkey.aws.appsync/update-api-key-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/update-api-key-response))

(clojure.core/defn create-resolver ([create-resolver-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-resolver-request create-resolver-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.appsync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync/create-resolver-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/types/{typeName}/resolvers", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.appsync/create-resolver-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateResolver", :http.request.spec/error-spec {"ConcurrentModificationException" :portkey.aws.appsync/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception}})))))
(clojure.spec.alpha/fdef create-resolver :args (clojure.spec.alpha/tuple :portkey.aws.appsync/create-resolver-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/create-resolver-response))

(clojure.core/defn delete-type ([delete-type-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-type-request delete-type-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.appsync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync/delete-type-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/types/{typeName}", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.appsync/delete-type-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteType", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "ConcurrentModificationException" :portkey.aws.appsync/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception}})))))
(clojure.spec.alpha/fdef delete-type :args (clojure.spec.alpha/tuple :portkey.aws.appsync/delete-type-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/delete-type-response))

(clojure.core/defn get-schema-creation-status ([get-schema-creation-status-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-schema-creation-status-request get-schema-creation-status-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.appsync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync/get-schema-creation-status-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/schemacreation", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.appsync/get-schema-creation-status-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetSchemaCreationStatus", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception}})))))
(clojure.spec.alpha/fdef get-schema-creation-status :args (clojure.spec.alpha/tuple :portkey.aws.appsync/get-schema-creation-status-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/get-schema-creation-status-response))

(clojure.core/defn update-resolver ([update-resolver-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-resolver-request update-resolver-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.appsync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync/update-resolver-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/types/{typeName}/resolvers/{fieldName}", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.appsync/update-resolver-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateResolver", :http.request.spec/error-spec {"ConcurrentModificationException" :portkey.aws.appsync/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception}})))))
(clojure.spec.alpha/fdef update-resolver :args (clojure.spec.alpha/tuple :portkey.aws.appsync/update-resolver-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/update-resolver-response))

(clojure.core/defn list-graphql-apis ([] (list-graphql-apis {})) ([list-graphql-apis-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-graphql-apis-request list-graphql-apis-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.appsync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync/list-graphql-apis-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.appsync/list-graphql-apis-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListGraphqlApis", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception}})))))
(clojure.spec.alpha/fdef list-graphql-apis :args (clojure.spec.alpha/? :portkey.aws.appsync/list-graphql-apis-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/list-graphql-apis-response))

(clojure.core/defn list-api-keys ([list-api-keys-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-api-keys-request list-api-keys-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.appsync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync/list-api-keys-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/apikeys", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.appsync/list-api-keys-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListApiKeys", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception}})))))
(clojure.spec.alpha/fdef list-api-keys :args (clojure.spec.alpha/tuple :portkey.aws.appsync/list-api-keys-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/list-api-keys-response))

(clojure.core/defn update-graphql-api ([update-graphql-api-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-graphql-api-request update-graphql-api-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.appsync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync/update-graphql-api-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.appsync/update-graphql-api-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateGraphqlApi", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "ConcurrentModificationException" :portkey.aws.appsync/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception}})))))
(clojure.spec.alpha/fdef update-graphql-api :args (clojure.spec.alpha/tuple :portkey.aws.appsync/update-graphql-api-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/update-graphql-api-response))

(clojure.core/defn update-type ([update-type-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-type-request update-type-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.appsync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync/update-type-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/types/{typeName}", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.appsync/update-type-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateType", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "ConcurrentModificationException" :portkey.aws.appsync/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception}})))))
(clojure.spec.alpha/fdef update-type :args (clojure.spec.alpha/tuple :portkey.aws.appsync/update-type-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/update-type-response))

(clojure.core/defn get-data-source ([get-data-source-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-data-source-request get-data-source-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.appsync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync/get-data-source-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/datasources/{name}", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.appsync/get-data-source-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetDataSource", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "ConcurrentModificationException" :portkey.aws.appsync/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception}})))))
(clojure.spec.alpha/fdef get-data-source :args (clojure.spec.alpha/tuple :portkey.aws.appsync/get-data-source-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/get-data-source-response))

(clojure.core/defn get-graphql-api ([get-graphql-api-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-graphql-api-request get-graphql-api-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.appsync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync/get-graphql-api-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.appsync/get-graphql-api-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetGraphqlApi", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception}})))))
(clojure.spec.alpha/fdef get-graphql-api :args (clojure.spec.alpha/tuple :portkey.aws.appsync/get-graphql-api-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/get-graphql-api-response))

(clojure.core/defn create-data-source ([create-data-source-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-data-source-request create-data-source-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.appsync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync/create-data-source-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/datasources", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.appsync/create-data-source-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateDataSource", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "ConcurrentModificationException" :portkey.aws.appsync/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception}})))))
(clojure.spec.alpha/fdef create-data-source :args (clojure.spec.alpha/tuple :portkey.aws.appsync/create-data-source-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/create-data-source-response))

(clojure.core/defn create-type ([create-type-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-type-request create-type-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.appsync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync/create-type-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/types", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.appsync/create-type-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateType", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "ConcurrentModificationException" :portkey.aws.appsync/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception}})))))
(clojure.spec.alpha/fdef create-type :args (clojure.spec.alpha/tuple :portkey.aws.appsync/create-type-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/create-type-response))

(clojure.core/defn delete-graphql-api ([delete-graphql-api-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-graphql-api-request delete-graphql-api-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.appsync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync/delete-graphql-api-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.appsync/delete-graphql-api-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteGraphqlApi", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "ConcurrentModificationException" :portkey.aws.appsync/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception}})))))
(clojure.spec.alpha/fdef delete-graphql-api :args (clojure.spec.alpha/tuple :portkey.aws.appsync/delete-graphql-api-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/delete-graphql-api-response))

(clojure.core/defn list-resolvers ([list-resolvers-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-resolvers-request list-resolvers-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.appsync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync/list-resolvers-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/types/{typeName}/resolvers", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.appsync/list-resolvers-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListResolvers", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception}})))))
(clojure.spec.alpha/fdef list-resolvers :args (clojure.spec.alpha/tuple :portkey.aws.appsync/list-resolvers-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/list-resolvers-response))

(clojure.core/defn delete-data-source ([delete-data-source-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-data-source-request delete-data-source-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.appsync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync/delete-data-source-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/datasources/{name}", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.appsync/delete-data-source-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteDataSource", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "ConcurrentModificationException" :portkey.aws.appsync/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception}})))))
(clojure.spec.alpha/fdef delete-data-source :args (clojure.spec.alpha/tuple :portkey.aws.appsync/delete-data-source-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/delete-data-source-response))

(clojure.core/defn list-types ([list-types-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-types-request list-types-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.appsync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync/list-types-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/types", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.appsync/list-types-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTypes", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "ConcurrentModificationException" :portkey.aws.appsync/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception}})))))
(clojure.spec.alpha/fdef list-types :args (clojure.spec.alpha/tuple :portkey.aws.appsync/list-types-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/list-types-response))
