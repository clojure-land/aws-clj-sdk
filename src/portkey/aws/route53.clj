(ns portkey.aws.route53 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "route53", :region "us-east-1"},
    :ssl-common-name "route53.amazonaws.com",
    :endpoint "https://route53.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "route53", :region "us-east-1"},
    :ssl-common-name "route53.amazonaws.com",
    :endpoint "https://route53.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "route53", :region "us-east-1"},
    :ssl-common-name "route53.amazonaws.com",
    :endpoint "https://route53.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "route53", :region "us-east-1"},
    :ssl-common-name "route53.amazonaws.com",
    :endpoint "https://route53.amazonaws.com",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "route53", :region "us-east-1"},
    :ssl-common-name "route53.amazonaws.com",
    :endpoint "https://route53.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "route53", :region "us-east-1"},
    :ssl-common-name "route53.amazonaws.com",
    :endpoint "https://route53.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "route53", :region "us-east-1"},
    :ssl-common-name "route53.amazonaws.com",
    :endpoint "https://route53.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "route53", :region "us-east-1"},
    :ssl-common-name "route53.amazonaws.com",
    :endpoint "https://route53.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "route53", :region "us-east-1"},
    :ssl-common-name "route53.amazonaws.com",
    :endpoint "https://route53.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "route53", :region "us-east-1"},
    :ssl-common-name "route53.amazonaws.com",
    :endpoint "https://route53.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "route53", :region "us-east-1"},
    :ssl-common-name "route53.amazonaws.com",
    :endpoint "https://route53.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "route53", :region "us-east-1"},
    :ssl-common-name "route53.amazonaws.com",
    :endpoint "https://route53.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "route53", :region "us-east-1"},
    :ssl-common-name "route53.amazonaws.com",
    :endpoint "https://route53.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "route53", :region "us-east-1"},
    :ssl-common-name "route53.amazonaws.com",
    :endpoint "https://route53.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "route53", :region "us-east-1"},
    :ssl-common-name "route53.amazonaws.com",
    :endpoint "https://route53.amazonaws.com",
    :signature-version :v4},
   "aws-global"
   {:credential-scope {:service "route53", :region "us-east-1"},
    :ssl-common-name "route53.amazonaws.com",
    :endpoint "https://route53.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-insufficient-data-health-status)

(clojure.core/declare ser-tag-resource-type)

(clojure.core/declare ser-health-check-nonce)

(clojure.core/declare ser-search-string)

(clojure.core/declare ser-rr-type)

(clojure.core/declare ser-cloud-watch-logs-log-group-arn)

(clojure.core/declare ser-alias-target)

(clojure.core/declare ser-account-limit-type)

(clojure.core/declare ser-geo-location-country-code)

(clojure.core/declare ser-traffic-policy-version-marker)

(clojure.core/declare ser-subnet-mask)

(clojure.core/declare ser-associate-vpc-comment)

(clojure.core/declare ser-resource-description)

(clojure.core/declare ser-change-batch)

(clojure.core/declare ser-resource-record-set-region)

(clojure.core/declare ser-traffic-policy-name)

(clojure.core/declare ser-vpc-region)

(clojure.core/declare ser-health-check-region)

(clojure.core/declare ser-geo-location-continent-code)

(clojure.core/declare ser-health-check-version)

(clojure.core/declare ser-failure-threshold)

(clojure.core/declare ser-change-action)

(clojure.core/declare ser-child-health-check-list)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-changes)

(clojure.core/declare ser-pagination-token)

(clojure.core/declare ser-health-check-region-list)

(clojure.core/declare ser-reusable-delegation-set-limit-type)

(clojure.core/declare ser-tag-resource-id)

(clojure.core/declare ser-geo-location)

(clojure.core/declare ser-health-check-config)

(clojure.core/declare ser-traffic-policy-version)

(clojure.core/declare ser-resource-id)

(clojure.core/declare ser-ttl)

(clojure.core/declare ser-resettable-element-name-list)

(clojure.core/declare ser-resource-record-set-weight)

(clojure.core/declare ser-tag-list)

(clojure.core/declare ser-tag-key-list)

(clojure.core/declare ser-health-check-id)

(clojure.core/declare ser-dns-name)

(clojure.core/declare ser-resource-records)

(clojure.core/declare ser-traffic-policy-document)

(clojure.core/declare ser-traffic-policy-id)

(clojure.core/declare ser-query-logging-config-id)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-resource-record-set-multi-value-answer)

(clojure.core/declare ser-port)

(clojure.core/declare ser-resource-record-set-identifier)

(clojure.core/declare ser-resource-record-set-failover)

(clojure.core/declare ser-geo-location-subdivision-code)

(clojure.core/declare ser-ip-address)

(clojure.core/declare ser-change)

(clojure.core/declare ser-traffic-policy-instance-id)

(clojure.core/declare ser-resettable-element-name)

(clojure.core/declare ser-resource-record)

(clojure.core/declare ser-alarm-name)

(clojure.core/declare ser-hosted-zone-config)

(clojure.core/declare ser-hosted-zone-limit-type)

(clojure.core/declare ser-resource-path)

(clojure.core/declare ser-alarm-identifier)

(clojure.core/declare ser-is-private-zone)

(clojure.core/declare ser-traffic-policy-comment)

(clojure.core/declare ser-enable-sni)

(clojure.core/declare ser-health-check-type)

(clojure.core/declare ser-r-data)

(clojure.core/declare ser-alias-health-enabled)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-disassociate-vpc-comment)

(clojure.core/declare ser-page-marker)

(clojure.core/declare ser-nonce)

(clojure.core/declare ser-measure-latency)

(clojure.core/declare ser-health-threshold)

(clojure.core/declare ser-resource-record-set)

(clojure.core/declare ser-vpc-id)

(clojure.core/declare ser-tag-resource-id-list)

(clojure.core/declare ser-request-interval)

(clojure.core/declare ser-fully-qualified-domain-name)

(clojure.core/declare ser-vpc)

(clojure.core/declare ser-page-max-items)

(clojure.core/declare ser-inverted)

(clojure.core/declare ser-cloud-watch-region)

(clojure.core/defn- ser-insufficient-data-health-status [input] #:http.request.field{:value (clojure.core/get {"Healthy" "Healthy", :healthy "Healthy", "Unhealthy" "Unhealthy", :unhealthy "Unhealthy", "LastKnownStatus" "LastKnownStatus", :last-known-status "LastKnownStatus"} input), :shape "InsufficientDataHealthStatus"})

(clojure.core/defn- ser-tag-resource-type [input] #:http.request.field{:value (clojure.core/get {"healthcheck" "healthcheck", :healthcheck "healthcheck", "hostedzone" "hostedzone", :hostedzone "hostedzone"} input), :shape "TagResourceType"})

(clojure.core/defn- ser-health-check-nonce [input] #:http.request.field{:value input, :shape "HealthCheckNonce"})

(clojure.core/defn- ser-search-string [input] #:http.request.field{:value input, :shape "SearchString"})

(clojure.core/defn- ser-rr-type [input] #:http.request.field{:value (clojure.core/get {:soa "SOA", "CAA" "CAA", :naptr "NAPTR", "CNAME" "CNAME", :txt "TXT", :ns "NS", "TXT" "TXT", "SRV" "SRV", :srv "SRV", "AAAA" "AAAA", :caa "CAA", "NS" "NS", "PTR" "PTR", :mx "MX", :cname "CNAME", "NAPTR" "NAPTR", "A" "A", "SPF" "SPF", :spf "SPF", :ptr "PTR", :aaaa "AAAA", :a "A", "SOA" "SOA", "MX" "MX"} input), :shape "RRType"})

(clojure.core/defn- ser-cloud-watch-logs-log-group-arn [input] #:http.request.field{:value input, :shape "CloudWatchLogsLogGroupArn"})

(clojure.core/defn- ser-alias-target [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-resource-id (:hosted-zone-id input)) #:http.request.field{:name "HostedZoneId", :shape "ResourceId"}) (clojure.core/into (ser-dns-name (:dns-name input)) #:http.request.field{:name "DNSName", :shape "DNSName"}) (clojure.core/into (ser-alias-health-enabled (:evaluate-target-health input)) #:http.request.field{:name "EvaluateTargetHealth", :shape "AliasHealthEnabled"})], :shape "AliasTarget", :type "structure"}))

(clojure.core/defn- ser-account-limit-type [input] #:http.request.field{:value (clojure.core/get {"MAX_REUSABLE_DELEGATION_SETS_BY_OWNER" "MAX_REUSABLE_DELEGATION_SETS_BY_OWNER", "MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER" "MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER", "MAX_HEALTH_CHECKS_BY_OWNER" "MAX_HEALTH_CHECKS_BY_OWNER", "MAX_TRAFFIC_POLICIES_BY_OWNER" "MAX_TRAFFIC_POLICIES_BY_OWNER", :max-hosted-zones-by-owner "MAX_HOSTED_ZONES_BY_OWNER", :max-reusable-delegation-sets-by-owner "MAX_REUSABLE_DELEGATION_SETS_BY_OWNER", :max-traffic-policies-by-owner "MAX_TRAFFIC_POLICIES_BY_OWNER", :max-traffic-policy-instances-by-owner "MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER", "MAX_HOSTED_ZONES_BY_OWNER" "MAX_HOSTED_ZONES_BY_OWNER", :max-health-checks-by-owner "MAX_HEALTH_CHECKS_BY_OWNER"} input), :shape "AccountLimitType"})

(clojure.core/defn- ser-geo-location-country-code [input] #:http.request.field{:value input, :shape "GeoLocationCountryCode"})

(clojure.core/defn- ser-traffic-policy-version-marker [input] #:http.request.field{:value input, :shape "TrafficPolicyVersionMarker"})

(clojure.core/defn- ser-subnet-mask [input] #:http.request.field{:value input, :shape "SubnetMask"})

(clojure.core/defn- ser-associate-vpc-comment [input] #:http.request.field{:value input, :shape "AssociateVPCComment"})

(clojure.core/defn- ser-resource-description [input] #:http.request.field{:value input, :shape "ResourceDescription"})

(clojure.core/defn- ser-change-batch [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-changes (:changes input)) #:http.request.field{:name "Changes", :shape "Changes"})], :shape "ChangeBatch", :type "structure"} (clojure.core/contains? input :comment) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-description (input :comment)) #:http.request.field{:name "Comment", :shape "ResourceDescription"}))))

(clojure.core/defn- ser-resource-record-set-region [input] #:http.request.field{:value (clojure.core/get {:apnortheast-1 "ap-northeast-1", :apsouth-1 "ap-south-1", "ap-northeast-1" "ap-northeast-1", "eu-west-1" "eu-west-1", :euwest-3 "eu-west-3", :useast-1 "us-east-1", "ap-northeast-3" "ap-northeast-3", :apsoutheast-2 "ap-southeast-2", :apnortheast-2 "ap-northeast-2", "us-east-2" "us-east-2", "ap-southeast-2" "ap-southeast-2", "cn-north-1" "cn-north-1", "sa-east-1" "sa-east-1", "ap-southeast-1" "ap-southeast-1", :cnnorth-1 "cn-north-1", "cn-northwest-1" "cn-northwest-1", "ap-northeast-2" "ap-northeast-2", "eu-west-3" "eu-west-3", :cnnorthwest-1 "cn-northwest-1", :cacentral-1 "ca-central-1", "ca-central-1" "ca-central-1", "eu-central-1" "eu-central-1", :euwest-2 "eu-west-2", :apnortheast-3 "ap-northeast-3", "eu-west-2" "eu-west-2", :uswest-1 "us-west-1", :eucentral-1 "eu-central-1", :saeast-1 "sa-east-1", :apsoutheast-1 "ap-southeast-1", "us-west-2" "us-west-2", "us-east-1" "us-east-1", "us-west-1" "us-west-1", "ap-south-1" "ap-south-1", :euwest-1 "eu-west-1", :useast-2 "us-east-2", :uswest-2 "us-west-2"} input), :shape "ResourceRecordSetRegion"})

(clojure.core/defn- ser-traffic-policy-name [input] #:http.request.field{:value input, :shape "TrafficPolicyName"})

(clojure.core/defn- ser-vpc-region [input] #:http.request.field{:value (clojure.core/get {:apnortheast-1 "ap-northeast-1", :apsouth-1 "ap-south-1", "ap-northeast-1" "ap-northeast-1", "eu-west-1" "eu-west-1", :euwest-3 "eu-west-3", :useast-1 "us-east-1", "ap-northeast-3" "ap-northeast-3", :apsoutheast-2 "ap-southeast-2", :apnortheast-2 "ap-northeast-2", "us-east-2" "us-east-2", "ap-southeast-2" "ap-southeast-2", "cn-north-1" "cn-north-1", "sa-east-1" "sa-east-1", "ap-southeast-1" "ap-southeast-1", :cnnorth-1 "cn-north-1", "ap-northeast-2" "ap-northeast-2", "eu-west-3" "eu-west-3", :cacentral-1 "ca-central-1", "ca-central-1" "ca-central-1", "eu-central-1" "eu-central-1", :euwest-2 "eu-west-2", :apnortheast-3 "ap-northeast-3", "eu-west-2" "eu-west-2", :uswest-1 "us-west-1", :eucentral-1 "eu-central-1", :saeast-1 "sa-east-1", :apsoutheast-1 "ap-southeast-1", "us-west-2" "us-west-2", "us-east-1" "us-east-1", "us-west-1" "us-west-1", "ap-south-1" "ap-south-1", :euwest-1 "eu-west-1", :useast-2 "us-east-2", :uswest-2 "us-west-2"} input), :shape "VPCRegion"})

(clojure.core/defn- ser-health-check-region [input] #:http.request.field{:value (clojure.core/get {:apnortheast-1 "ap-northeast-1", "ap-northeast-1" "ap-northeast-1", "eu-west-1" "eu-west-1", :useast-1 "us-east-1", :apsoutheast-2 "ap-southeast-2", "ap-southeast-2" "ap-southeast-2", "sa-east-1" "sa-east-1", "ap-southeast-1" "ap-southeast-1", :uswest-1 "us-west-1", :saeast-1 "sa-east-1", :apsoutheast-1 "ap-southeast-1", "us-west-2" "us-west-2", "us-east-1" "us-east-1", "us-west-1" "us-west-1", :euwest-1 "eu-west-1", :uswest-2 "us-west-2"} input), :shape "HealthCheckRegion"})

(clojure.core/defn- ser-geo-location-continent-code [input] #:http.request.field{:value input, :shape "GeoLocationContinentCode"})

(clojure.core/defn- ser-health-check-version [input] #:http.request.field{:value input, :shape "HealthCheckVersion"})

(clojure.core/defn- ser-failure-threshold [input] #:http.request.field{:value input, :shape "FailureThreshold"})

(clojure.core/defn- ser-change-action [input] #:http.request.field{:value (clojure.core/get {"CREATE" "CREATE", :create "CREATE", "DELETE" "DELETE", :delete "DELETE", "UPSERT" "UPSERT", :upsert "UPSERT"} input), :shape "ChangeAction"})

(clojure.core/defn- ser-child-health-check-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-health-check-id coll) #:http.request.field{:shape "HealthCheckId", :location-name "ChildHealthCheck"}))) input), :shape "ChildHealthCheckList", :type "list", :max 256})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-changes [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-change coll) #:http.request.field{:shape "Change", :location-name "Change"}))) input), :shape "Changes", :type "list", :min 1})

(clojure.core/defn- ser-pagination-token [input] #:http.request.field{:value input, :shape "PaginationToken"})

(clojure.core/defn- ser-health-check-region-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-health-check-region coll) #:http.request.field{:shape "HealthCheckRegion", :location-name "Region"}))) input), :shape "HealthCheckRegionList", :type "list", :max 64, :min 3})

(clojure.core/defn- ser-reusable-delegation-set-limit-type [input] #:http.request.field{:value (clojure.core/get {"MAX_ZONES_BY_REUSABLE_DELEGATION_SET" "MAX_ZONES_BY_REUSABLE_DELEGATION_SET", :max-zones-by-reusable-delegation-set "MAX_ZONES_BY_REUSABLE_DELEGATION_SET"} input), :shape "ReusableDelegationSetLimitType"})

(clojure.core/defn- ser-tag-resource-id [input] #:http.request.field{:value input, :shape "TagResourceId"})

(clojure.core/defn- ser-geo-location [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "GeoLocation", :type "structure"} (clojure.core/contains? input :continent-code) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-geo-location-continent-code (input :continent-code)) #:http.request.field{:name "ContinentCode", :shape "GeoLocationContinentCode"})) (clojure.core/contains? input :country-code) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-geo-location-country-code (input :country-code)) #:http.request.field{:name "CountryCode", :shape "GeoLocationCountryCode"})) (clojure.core/contains? input :subdivision-code) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-geo-location-subdivision-code (input :subdivision-code)) #:http.request.field{:name "SubdivisionCode", :shape "GeoLocationSubdivisionCode"}))))

(clojure.core/defn- ser-health-check-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-health-check-type (:type input)) #:http.request.field{:name "Type", :shape "HealthCheckType"})], :shape "HealthCheckConfig", :type "structure"} (clojure.core/contains? input :insufficient-data-health-status) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-insufficient-data-health-status (input :insufficient-data-health-status)) #:http.request.field{:name "InsufficientDataHealthStatus", :shape "InsufficientDataHealthStatus"})) (clojure.core/contains? input :search-string) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-search-string (input :search-string)) #:http.request.field{:name "SearchString", :shape "SearchString"})) (clojure.core/contains? input :failure-threshold) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-failure-threshold (input :failure-threshold)) #:http.request.field{:name "FailureThreshold", :shape "FailureThreshold"})) (clojure.core/contains? input :child-health-checks) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-child-health-check-list (input :child-health-checks)) #:http.request.field{:name "ChildHealthChecks", :shape "ChildHealthCheckList"})) (clojure.core/contains? input :regions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-health-check-region-list (input :regions)) #:http.request.field{:name "Regions", :shape "HealthCheckRegionList"})) (clojure.core/contains? input :port) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-port (input :port)) #:http.request.field{:name "Port", :shape "Port"})) (clojure.core/contains? input :ip-address) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ip-address (input :ip-address)) #:http.request.field{:name "IPAddress", :shape "IPAddress"})) (clojure.core/contains? input :resource-path) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-path (input :resource-path)) #:http.request.field{:name "ResourcePath", :shape "ResourcePath"})) (clojure.core/contains? input :alarm-identifier) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-alarm-identifier (input :alarm-identifier)) #:http.request.field{:name "AlarmIdentifier", :shape "AlarmIdentifier"})) (clojure.core/contains? input :enable-sni) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-enable-sni (input :enable-sni)) #:http.request.field{:name "EnableSNI", :shape "EnableSNI"})) (clojure.core/contains? input :measure-latency) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-measure-latency (input :measure-latency)) #:http.request.field{:name "MeasureLatency", :shape "MeasureLatency"})) (clojure.core/contains? input :health-threshold) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-health-threshold (input :health-threshold)) #:http.request.field{:name "HealthThreshold", :shape "HealthThreshold"})) (clojure.core/contains? input :request-interval) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-request-interval (input :request-interval)) #:http.request.field{:name "RequestInterval", :shape "RequestInterval"})) (clojure.core/contains? input :fully-qualified-domain-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-fully-qualified-domain-name (input :fully-qualified-domain-name)) #:http.request.field{:name "FullyQualifiedDomainName", :shape "FullyQualifiedDomainName"})) (clojure.core/contains? input :inverted) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-inverted (input :inverted)) #:http.request.field{:name "Inverted", :shape "Inverted"}))))

(clojure.core/defn- ser-traffic-policy-version [input] #:http.request.field{:value input, :shape "TrafficPolicyVersion"})

(clojure.core/defn- ser-resource-id [input] #:http.request.field{:value input, :shape "ResourceId"})

(clojure.core/defn- ser-ttl [input] #:http.request.field{:value input, :shape "TTL"})

(clojure.core/defn- ser-resettable-element-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-resettable-element-name coll) #:http.request.field{:shape "ResettableElementName", :location-name "ResettableElementName"}))) input), :shape "ResettableElementNameList", :type "list", :max 64})

(clojure.core/defn- ser-resource-record-set-weight [input] #:http.request.field{:value input, :shape "ResourceRecordSetWeight"})

(clojure.core/defn- ser-tag-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag", :location-name "Tag"}))) input), :shape "TagList", :type "list", :max 10, :min 1})

(clojure.core/defn- ser-tag-key-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-key coll) #:http.request.field{:shape "TagKey", :location-name "Key"}))) input), :shape "TagKeyList", :type "list", :max 10, :min 1})

(clojure.core/defn- ser-health-check-id [input] #:http.request.field{:value input, :shape "HealthCheckId"})

(clojure.core/defn- ser-dns-name [input] #:http.request.field{:value input, :shape "DNSName"})

(clojure.core/defn- ser-resource-records [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-resource-record coll) #:http.request.field{:shape "ResourceRecord", :location-name "ResourceRecord"}))) input), :shape "ResourceRecords", :type "list", :min 1})

(clojure.core/defn- ser-traffic-policy-document [input] #:http.request.field{:value input, :shape "TrafficPolicyDocument"})

(clojure.core/defn- ser-traffic-policy-id [input] #:http.request.field{:value input, :shape "TrafficPolicyId"})

(clojure.core/defn- ser-query-logging-config-id [input] #:http.request.field{:value input, :shape "QueryLoggingConfigId"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-resource-record-set-multi-value-answer [input] #:http.request.field{:value input, :shape "ResourceRecordSetMultiValueAnswer"})

(clojure.core/defn- ser-port [input] #:http.request.field{:value input, :shape "Port"})

(clojure.core/defn- ser-resource-record-set-identifier [input] #:http.request.field{:value input, :shape "ResourceRecordSetIdentifier"})

(clojure.core/defn- ser-resource-record-set-failover [input] #:http.request.field{:value (clojure.core/get {"PRIMARY" "PRIMARY", :primary "PRIMARY", "SECONDARY" "SECONDARY", :secondary "SECONDARY"} input), :shape "ResourceRecordSetFailover"})

(clojure.core/defn- ser-geo-location-subdivision-code [input] #:http.request.field{:value input, :shape "GeoLocationSubdivisionCode"})

(clojure.core/defn- ser-ip-address [input] #:http.request.field{:value input, :shape "IPAddress"})

(clojure.core/defn- ser-change [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-change-action (:action input)) #:http.request.field{:name "Action", :shape "ChangeAction"}) (clojure.core/into (ser-resource-record-set (:resource-record-set input)) #:http.request.field{:name "ResourceRecordSet", :shape "ResourceRecordSet"})], :shape "Change", :type "structure"}))

(clojure.core/defn- ser-traffic-policy-instance-id [input] #:http.request.field{:value input, :shape "TrafficPolicyInstanceId"})

(clojure.core/defn- ser-resettable-element-name [input] #:http.request.field{:value (clojure.core/get {"FullyQualifiedDomainName" "FullyQualifiedDomainName", :fully-qualified-domain-name "FullyQualifiedDomainName", "Regions" "Regions", :regions "Regions", "ResourcePath" "ResourcePath", :resource-path "ResourcePath", "ChildHealthChecks" "ChildHealthChecks", :child-health-checks "ChildHealthChecks"} input), :shape "ResettableElementName"})

(clojure.core/defn- ser-resource-record [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-r-data (:value input)) #:http.request.field{:name "Value", :shape "RData"})], :shape "ResourceRecord", :type "structure"}))

(clojure.core/defn- ser-alarm-name [input] #:http.request.field{:value input, :shape "AlarmName"})

(clojure.core/defn- ser-hosted-zone-config [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "HostedZoneConfig", :type "structure"} (clojure.core/contains? input :comment) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-description (input :comment)) #:http.request.field{:name "Comment", :shape "ResourceDescription"})) (clojure.core/contains? input :private-zone) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-is-private-zone (input :private-zone)) #:http.request.field{:name "PrivateZone", :shape "IsPrivateZone"}))))

(clojure.core/defn- ser-hosted-zone-limit-type [input] #:http.request.field{:value (clojure.core/get {"MAX_RRSETS_BY_ZONE" "MAX_RRSETS_BY_ZONE", :max-rrsets-by-zone "MAX_RRSETS_BY_ZONE", "MAX_VPCS_ASSOCIATED_BY_ZONE" "MAX_VPCS_ASSOCIATED_BY_ZONE", :max-vpcs-associated-by-zone "MAX_VPCS_ASSOCIATED_BY_ZONE"} input), :shape "HostedZoneLimitType"})

(clojure.core/defn- ser-resource-path [input] #:http.request.field{:value input, :shape "ResourcePath"})

(clojure.core/defn- ser-alarm-identifier [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-cloud-watch-region (:region input)) #:http.request.field{:name "Region", :shape "CloudWatchRegion"}) (clojure.core/into (ser-alarm-name (:name input)) #:http.request.field{:name "Name", :shape "AlarmName"})], :shape "AlarmIdentifier", :type "structure"}))

(clojure.core/defn- ser-is-private-zone [input] #:http.request.field{:value input, :shape "IsPrivateZone"})

(clojure.core/defn- ser-traffic-policy-comment [input] #:http.request.field{:value input, :shape "TrafficPolicyComment"})

(clojure.core/defn- ser-enable-sni [input] #:http.request.field{:value input, :shape "EnableSNI"})

(clojure.core/defn- ser-health-check-type [input] #:http.request.field{:value (clojure.core/get {:http-str-match "HTTP_STR_MATCH", :tcp "TCP", :calculated "CALCULATED", :https-str-match "HTTPS_STR_MATCH", "TCP" "TCP", "CALCULATED" "CALCULATED", "HTTP_STR_MATCH" "HTTP_STR_MATCH", "HTTPS_STR_MATCH" "HTTPS_STR_MATCH", "CLOUDWATCH_METRIC" "CLOUDWATCH_METRIC", "HTTPS" "HTTPS", :http "HTTP", :cloudwatch-metric "CLOUDWATCH_METRIC", "HTTP" "HTTP", :https "HTTPS"} input), :shape "HealthCheckType"})

(clojure.core/defn- ser-r-data [input] #:http.request.field{:value input, :shape "RData"})

(clojure.core/defn- ser-alias-health-enabled [input] #:http.request.field{:value input, :shape "AliasHealthEnabled"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Tag", :type "structure"} (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-key (input :key)) #:http.request.field{:name "Key", :shape "TagKey"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-value (input :value)) #:http.request.field{:name "Value", :shape "TagValue"}))))

(clojure.core/defn- ser-disassociate-vpc-comment [input] #:http.request.field{:value input, :shape "DisassociateVPCComment"})

(clojure.core/defn- ser-page-marker [input] #:http.request.field{:value input, :shape "PageMarker"})

(clojure.core/defn- ser-nonce [input] #:http.request.field{:value input, :shape "Nonce"})

(clojure.core/defn- ser-measure-latency [input] #:http.request.field{:value input, :shape "MeasureLatency"})

(clojure.core/defn- ser-health-threshold [input] #:http.request.field{:value input, :shape "HealthThreshold"})

(clojure.core/defn- ser-resource-record-set [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-dns-name (:name input)) #:http.request.field{:name "Name", :shape "DNSName"}) (clojure.core/into (ser-rr-type (:type input)) #:http.request.field{:name "Type", :shape "RRType"})], :shape "ResourceRecordSet", :type "structure"} (clojure.core/contains? input :alias-target) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-alias-target (input :alias-target)) #:http.request.field{:name "AliasTarget", :shape "AliasTarget"})) (clojure.core/contains? input :geo-location) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-geo-location (input :geo-location)) #:http.request.field{:name "GeoLocation", :shape "GeoLocation"})) (clojure.core/contains? input :ttl) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ttl (input :ttl)) #:http.request.field{:name "TTL", :shape "TTL"})) (clojure.core/contains? input :set-identifier) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-record-set-identifier (input :set-identifier)) #:http.request.field{:name "SetIdentifier", :shape "ResourceRecordSetIdentifier"})) (clojure.core/contains? input :weight) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-record-set-weight (input :weight)) #:http.request.field{:name "Weight", :shape "ResourceRecordSetWeight"})) (clojure.core/contains? input :health-check-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-health-check-id (input :health-check-id)) #:http.request.field{:name "HealthCheckId", :shape "HealthCheckId"})) (clojure.core/contains? input :multi-value-answer) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-record-set-multi-value-answer (input :multi-value-answer)) #:http.request.field{:name "MultiValueAnswer", :shape "ResourceRecordSetMultiValueAnswer"})) (clojure.core/contains? input :resource-records) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-records (input :resource-records)) #:http.request.field{:name "ResourceRecords", :shape "ResourceRecords"})) (clojure.core/contains? input :failover) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-record-set-failover (input :failover)) #:http.request.field{:name "Failover", :shape "ResourceRecordSetFailover"})) (clojure.core/contains? input :traffic-policy-instance-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-traffic-policy-instance-id (input :traffic-policy-instance-id)) #:http.request.field{:name "TrafficPolicyInstanceId", :shape "TrafficPolicyInstanceId"})) (clojure.core/contains? input :region) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-record-set-region (input :region)) #:http.request.field{:name "Region", :shape "ResourceRecordSetRegion"}))))

(clojure.core/defn- ser-vpc-id [input] #:http.request.field{:value input, :shape "VPCId"})

(clojure.core/defn- ser-tag-resource-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-resource-id coll) #:http.request.field{:shape "TagResourceId", :location-name "ResourceId"}))) input), :shape "TagResourceIdList", :type "list", :max 10, :min 1})

(clojure.core/defn- ser-request-interval [input] #:http.request.field{:value input, :shape "RequestInterval"})

(clojure.core/defn- ser-fully-qualified-domain-name [input] #:http.request.field{:value input, :shape "FullyQualifiedDomainName"})

(clojure.core/defn- ser-vpc [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "VPC", :type "structure"} (clojure.core/contains? input :vpc-region) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-vpc-region (input :vpc-region)) #:http.request.field{:name "VPCRegion", :shape "VPCRegion"})) (clojure.core/contains? input :vpc-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-vpc-id (input :vpc-id)) #:http.request.field{:name "VPCId", :shape "VPCId"}))))

(clojure.core/defn- ser-page-max-items [input] #:http.request.field{:value input, :shape "PageMaxItems"})

(clojure.core/defn- ser-inverted [input] #:http.request.field{:value input, :shape "Inverted"})

(clojure.core/defn- ser-cloud-watch-region [input] #:http.request.field{:value (clojure.core/get {:apnortheast-1 "ap-northeast-1", :apsouth-1 "ap-south-1", "ap-northeast-1" "ap-northeast-1", "eu-west-1" "eu-west-1", :euwest-3 "eu-west-3", :useast-1 "us-east-1", "ap-northeast-3" "ap-northeast-3", :apsoutheast-2 "ap-southeast-2", :apnortheast-2 "ap-northeast-2", "us-east-2" "us-east-2", "ap-southeast-2" "ap-southeast-2", "sa-east-1" "sa-east-1", "ap-southeast-1" "ap-southeast-1", "ap-northeast-2" "ap-northeast-2", "eu-west-3" "eu-west-3", :cacentral-1 "ca-central-1", "ca-central-1" "ca-central-1", "eu-central-1" "eu-central-1", :euwest-2 "eu-west-2", :apnortheast-3 "ap-northeast-3", "eu-west-2" "eu-west-2", :uswest-1 "us-west-1", :eucentral-1 "eu-central-1", :saeast-1 "sa-east-1", :apsoutheast-1 "ap-southeast-1", "us-west-2" "us-west-2", "us-east-1" "us-east-1", "us-west-1" "us-west-1", "ap-south-1" "ap-south-1", :euwest-1 "eu-west-1", :useast-2 "us-east-2", :uswest-2 "us-west-2"} input), :shape "CloudWatchRegion"})

(clojure.core/defn- req-update-traffic-policy-instance-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-traffic-policy-instance-id (input :id)) #:http.request.field{:name "Id", :shape "TrafficPolicyInstanceId", :location "uri", :location-name "Id"})], :body [(clojure.core/into (ser-ttl (input :ttl)) #:http.request.field{:name "TTL", :shape "TTL"}) (clojure.core/into (ser-traffic-policy-id (input :traffic-policy-id)) #:http.request.field{:name "TrafficPolicyId", :shape "TrafficPolicyId"}) (clojure.core/into (ser-traffic-policy-version (input :traffic-policy-version)) #:http.request.field{:name "TrafficPolicyVersion", :shape "TrafficPolicyVersion"})]}))

(clojure.core/defn- req-delete-traffic-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-traffic-policy-id (input :id)) #:http.request.field{:name "Id", :shape "TrafficPolicyId", :location "uri", :location-name "Id"}) (clojure.core/into (ser-traffic-policy-version (input :version)) #:http.request.field{:name "Version", :shape "TrafficPolicyVersion", :location "uri", :location-name "Version"})]}))

(clojure.core/defn- req-get-checker-ip-ranges-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-list-traffic-policy-instances-by-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:querystring [(clojure.core/into (ser-traffic-policy-id (input :traffic-policy-id)) #:http.request.field{:name "TrafficPolicyId", :shape "TrafficPolicyId", :location "querystring", :location-name "id"}) (clojure.core/into (ser-traffic-policy-version (input :traffic-policy-version)) #:http.request.field{:name "TrafficPolicyVersion", :shape "TrafficPolicyVersion", :location "querystring", :location-name "version"})]} (clojure.core/contains? input :hosted-zone-id-marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-id (input :hosted-zone-id-marker)) #:http.request.field{:name "HostedZoneIdMarker", :shape "ResourceId", :location "querystring", :location-name "hostedzoneid"})) (clojure.core/contains? input :traffic-policy-instance-name-marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dns-name (input :traffic-policy-instance-name-marker)) #:http.request.field{:name "TrafficPolicyInstanceNameMarker", :shape "DNSName", :location "querystring", :location-name "trafficpolicyinstancename"})) (clojure.core/contains? input :traffic-policy-instance-type-marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-rr-type (input :traffic-policy-instance-type-marker)) #:http.request.field{:name "TrafficPolicyInstanceTypeMarker", :shape "RRType", :location "querystring", :location-name "trafficpolicyinstancetype"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-max-items (input :max-items)) #:http.request.field{:name "MaxItems", :shape "PageMaxItems", :location "querystring", :location-name "maxitems"}))))

(clojure.core/defn- req-list-traffic-policy-versions-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-traffic-policy-id (input :id)) #:http.request.field{:name "Id", :shape "TrafficPolicyId", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :traffic-policy-version-marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-traffic-policy-version-marker (input :traffic-policy-version-marker)) #:http.request.field{:name "TrafficPolicyVersionMarker", :shape "TrafficPolicyVersionMarker", :location "querystring", :location-name "trafficpolicyversion"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-max-items (input :max-items)) #:http.request.field{:name "MaxItems", :shape "PageMaxItems", :location "querystring", :location-name "maxitems"}))))

(clojure.core/defn- req-test-dns-answer-request [input] (clojure.core/cond-> #:http.request.configuration{:querystring [(clojure.core/into (ser-resource-id (input :hosted-zone-id)) #:http.request.field{:name "HostedZoneId", :shape "ResourceId", :location "querystring", :location-name "hostedzoneid"}) (clojure.core/into (ser-dns-name (input :record-name)) #:http.request.field{:name "RecordName", :shape "DNSName", :location "querystring", :location-name "recordname"}) (clojure.core/into (ser-rr-type (input :record-type)) #:http.request.field{:name "RecordType", :shape "RRType", :location "querystring", :location-name "recordtype"})]} (clojure.core/contains? input :resolver-ip) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ip-address (input :resolver-ip)) #:http.request.field{:name "ResolverIP", :shape "IPAddress", :location "querystring", :location-name "resolverip"})) (clojure.core/contains? input :edns-0-client-subnet-ip) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ip-address (input :edns-0-client-subnet-ip)) #:http.request.field{:name "EDNS0ClientSubnetIP", :shape "IPAddress", :location "querystring", :location-name "edns0clientsubnetip"})) (clojure.core/contains? input :edns-0-client-subnet-mask) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-subnet-mask (input :edns-0-client-subnet-mask)) #:http.request.field{:name "EDNS0ClientSubnetMask", :shape "SubnetMask", :location "querystring", :location-name "edns0clientsubnetmask"}))))

(clojure.core/defn- req-list-resource-record-sets-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-id (input :hosted-zone-id)) #:http.request.field{:name "HostedZoneId", :shape "ResourceId", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :start-record-name) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dns-name (input :start-record-name)) #:http.request.field{:name "StartRecordName", :shape "DNSName", :location "querystring", :location-name "name"})) (clojure.core/contains? input :start-record-type) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-rr-type (input :start-record-type)) #:http.request.field{:name "StartRecordType", :shape "RRType", :location "querystring", :location-name "type"})) (clojure.core/contains? input :start-record-identifier) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-record-set-identifier (input :start-record-identifier)) #:http.request.field{:name "StartRecordIdentifier", :shape "ResourceRecordSetIdentifier", :location "querystring", :location-name "identifier"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-max-items (input :max-items)) #:http.request.field{:name "MaxItems", :shape "PageMaxItems", :location "querystring", :location-name "maxitems"}))))

(clojure.core/defn- req-get-reusable-delegation-set-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-id (input :id)) #:http.request.field{:name "Id", :shape "ResourceId", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-create-vpc-association-authorization-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-id (input :hosted-zone-id)) #:http.request.field{:name "HostedZoneId", :shape "ResourceId", :location "uri", :location-name "Id"})], :body [(clojure.core/into (ser-vpc (input :vpc)) #:http.request.field{:name "VPC", :shape "VPC"})]}))

(clojure.core/defn- req-change-resource-record-sets-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-id (input :hosted-zone-id)) #:http.request.field{:name "HostedZoneId", :shape "ResourceId", :location "uri", :location-name "Id"})], :body [(clojure.core/into (ser-change-batch (input :change-batch)) #:http.request.field{:name "ChangeBatch", :shape "ChangeBatch"})]}))

(clojure.core/defn- req-get-geo-location-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :continent-code) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-geo-location-continent-code (input :continent-code)) #:http.request.field{:name "ContinentCode", :shape "GeoLocationContinentCode", :location "querystring", :location-name "continentcode"})) (clojure.core/contains? input :country-code) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-geo-location-country-code (input :country-code)) #:http.request.field{:name "CountryCode", :shape "GeoLocationCountryCode", :location "querystring", :location-name "countrycode"})) (clojure.core/contains? input :subdivision-code) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-geo-location-subdivision-code (input :subdivision-code)) #:http.request.field{:name "SubdivisionCode", :shape "GeoLocationSubdivisionCode", :location "querystring", :location-name "subdivisioncode"}))))

(clojure.core/defn- req-delete-health-check-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-health-check-id (input :health-check-id)) #:http.request.field{:name "HealthCheckId", :shape "HealthCheckId", :location "uri", :location-name "HealthCheckId"})]}))

(clojure.core/defn- req-get-health-check-status-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-health-check-id (input :health-check-id)) #:http.request.field{:name "HealthCheckId", :shape "HealthCheckId", :location "uri", :location-name "HealthCheckId"})]}))

(clojure.core/defn- req-delete-query-logging-config-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-query-logging-config-id (input :id)) #:http.request.field{:name "Id", :shape "QueryLoggingConfigId", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-delete-vpc-association-authorization-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-id (input :hosted-zone-id)) #:http.request.field{:name "HostedZoneId", :shape "ResourceId", :location "uri", :location-name "Id"})], :body [(clojure.core/into (ser-vpc (input :vpc)) #:http.request.field{:name "VPC", :shape "VPC"})]}))

(clojure.core/defn- req-get-hosted-zone-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-id (input :id)) #:http.request.field{:name "Id", :shape "ResourceId", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-list-traffic-policy-instances-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :hosted-zone-id-marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-id (input :hosted-zone-id-marker)) #:http.request.field{:name "HostedZoneIdMarker", :shape "ResourceId", :location "querystring", :location-name "hostedzoneid"})) (clojure.core/contains? input :traffic-policy-instance-name-marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dns-name (input :traffic-policy-instance-name-marker)) #:http.request.field{:name "TrafficPolicyInstanceNameMarker", :shape "DNSName", :location "querystring", :location-name "trafficpolicyinstancename"})) (clojure.core/contains? input :traffic-policy-instance-type-marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-rr-type (input :traffic-policy-instance-type-marker)) #:http.request.field{:name "TrafficPolicyInstanceTypeMarker", :shape "RRType", :location "querystring", :location-name "trafficpolicyinstancetype"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-max-items (input :max-items)) #:http.request.field{:name "MaxItems", :shape "PageMaxItems", :location "querystring", :location-name "maxitems"}))))

(clojure.core/defn- req-get-traffic-policy-instance-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-traffic-policy-instance-id (input :id)) #:http.request.field{:name "Id", :shape "TrafficPolicyInstanceId", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-create-query-logging-config-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :hosted-zone-id)) #:http.request.field{:name "HostedZoneId", :shape "ResourceId"}) (clojure.core/into (ser-cloud-watch-logs-log-group-arn (input :cloud-watch-logs-log-group-arn)) #:http.request.field{:name "CloudWatchLogsLogGroupArn", :shape "CloudWatchLogsLogGroupArn"})]}))

(clojure.core/defn- req-list-tags-for-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-tag-resource-type (input :resource-type)) #:http.request.field{:name "ResourceType", :shape "TagResourceType", :location "uri", :location-name "ResourceType"}) (clojure.core/into (ser-tag-resource-id (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "TagResourceId", :location "uri", :location-name "ResourceId"})]}))

(clojure.core/defn- req-update-traffic-policy-comment-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-traffic-policy-id (input :id)) #:http.request.field{:name "Id", :shape "TrafficPolicyId", :location "uri", :location-name "Id"}) (clojure.core/into (ser-traffic-policy-version (input :version)) #:http.request.field{:name "Version", :shape "TrafficPolicyVersion", :location "uri", :location-name "Version"})], :body [(clojure.core/into (ser-traffic-policy-comment (input :comment)) #:http.request.field{:name "Comment", :shape "TrafficPolicyComment"})]}))

(clojure.core/defn- req-list-hosted-zones-by-name-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :dns-name) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dns-name (input :dns-name)) #:http.request.field{:name "DNSName", :shape "DNSName", :location "querystring", :location-name "dnsname"})) (clojure.core/contains? input :hosted-zone-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-id (input :hosted-zone-id)) #:http.request.field{:name "HostedZoneId", :shape "ResourceId", :location "querystring", :location-name "hostedzoneid"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-max-items (input :max-items)) #:http.request.field{:name "MaxItems", :shape "PageMaxItems", :location "querystring", :location-name "maxitems"}))))

(clojure.core/defn- req-create-traffic-policy-version-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-traffic-policy-id (input :id)) #:http.request.field{:name "Id", :shape "TrafficPolicyId", :location "uri", :location-name "Id"})], :body [(clojure.core/into (ser-traffic-policy-document (input :document)) #:http.request.field{:name "Document", :shape "TrafficPolicyDocument"})]} (clojure.core/contains? input :comment) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-traffic-policy-comment (input :comment)) #:http.request.field{:name "Comment", :shape "TrafficPolicyComment"}))))

(clojure.core/defn- req-delete-hosted-zone-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-id (input :id)) #:http.request.field{:name "Id", :shape "ResourceId", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-update-hosted-zone-comment-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-id (input :id)) #:http.request.field{:name "Id", :shape "ResourceId", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :comment) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-description (input :comment)) #:http.request.field{:name "Comment", :shape "ResourceDescription"}))))

(clojure.core/defn- req-list-traffic-policy-instances-by-hosted-zone-request [input] (clojure.core/cond-> #:http.request.configuration{:querystring [(clojure.core/into (ser-resource-id (input :hosted-zone-id)) #:http.request.field{:name "HostedZoneId", :shape "ResourceId", :location "querystring", :location-name "id"})]} (clojure.core/contains? input :traffic-policy-instance-name-marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dns-name (input :traffic-policy-instance-name-marker)) #:http.request.field{:name "TrafficPolicyInstanceNameMarker", :shape "DNSName", :location "querystring", :location-name "trafficpolicyinstancename"})) (clojure.core/contains? input :traffic-policy-instance-type-marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-rr-type (input :traffic-policy-instance-type-marker)) #:http.request.field{:name "TrafficPolicyInstanceTypeMarker", :shape "RRType", :location "querystring", :location-name "trafficpolicyinstancetype"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-max-items (input :max-items)) #:http.request.field{:name "MaxItems", :shape "PageMaxItems", :location "querystring", :location-name "maxitems"}))))

(clojure.core/defn- req-create-traffic-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-traffic-policy-name (input :name)) #:http.request.field{:name "Name", :shape "TrafficPolicyName"}) (clojure.core/into (ser-traffic-policy-document (input :document)) #:http.request.field{:name "Document", :shape "TrafficPolicyDocument"})]} (clojure.core/contains? input :comment) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-traffic-policy-comment (input :comment)) #:http.request.field{:name "Comment", :shape "TrafficPolicyComment"}))))

(clojure.core/defn- req-get-hosted-zone-count-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-update-health-check-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-health-check-id (input :health-check-id)) #:http.request.field{:name "HealthCheckId", :shape "HealthCheckId", :location "uri", :location-name "HealthCheckId"})]} (clojure.core/contains? input :insufficient-data-health-status) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-insufficient-data-health-status (input :insufficient-data-health-status)) #:http.request.field{:name "InsufficientDataHealthStatus", :shape "InsufficientDataHealthStatus"})) (clojure.core/contains? input :search-string) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-search-string (input :search-string)) #:http.request.field{:name "SearchString", :shape "SearchString"})) (clojure.core/contains? input :health-check-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-health-check-version (input :health-check-version)) #:http.request.field{:name "HealthCheckVersion", :shape "HealthCheckVersion"})) (clojure.core/contains? input :failure-threshold) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-failure-threshold (input :failure-threshold)) #:http.request.field{:name "FailureThreshold", :shape "FailureThreshold"})) (clojure.core/contains? input :child-health-checks) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-child-health-check-list (input :child-health-checks)) #:http.request.field{:name "ChildHealthChecks", :shape "ChildHealthCheckList"})) (clojure.core/contains? input :regions) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-health-check-region-list (input :regions)) #:http.request.field{:name "Regions", :shape "HealthCheckRegionList"})) (clojure.core/contains? input :port) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-port (input :port)) #:http.request.field{:name "Port", :shape "Port"})) (clojure.core/contains? input :ip-address) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ip-address (input :ip-address)) #:http.request.field{:name "IPAddress", :shape "IPAddress"})) (clojure.core/contains? input :resource-path) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-path (input :resource-path)) #:http.request.field{:name "ResourcePath", :shape "ResourcePath"})) (clojure.core/contains? input :alarm-identifier) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-alarm-identifier (input :alarm-identifier)) #:http.request.field{:name "AlarmIdentifier", :shape "AlarmIdentifier"})) (clojure.core/contains? input :enable-sni) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-enable-sni (input :enable-sni)) #:http.request.field{:name "EnableSNI", :shape "EnableSNI"})) (clojure.core/contains? input :reset-elements) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resettable-element-name-list (input :reset-elements)) #:http.request.field{:name "ResetElements", :shape "ResettableElementNameList"})) (clojure.core/contains? input :health-threshold) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-health-threshold (input :health-threshold)) #:http.request.field{:name "HealthThreshold", :shape "HealthThreshold"})) (clojure.core/contains? input :fully-qualified-domain-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-fully-qualified-domain-name (input :fully-qualified-domain-name)) #:http.request.field{:name "FullyQualifiedDomainName", :shape "FullyQualifiedDomainName"})) (clojure.core/contains? input :inverted) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-inverted (input :inverted)) #:http.request.field{:name "Inverted", :shape "Inverted"}))))

(clojure.core/defn- req-list-hosted-zones-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-marker (input :marker)) #:http.request.field{:name "Marker", :shape "PageMarker", :location "querystring", :location-name "marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-max-items (input :max-items)) #:http.request.field{:name "MaxItems", :shape "PageMaxItems", :location "querystring", :location-name "maxitems"})) (clojure.core/contains? input :delegation-set-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-id (input :delegation-set-id)) #:http.request.field{:name "DelegationSetId", :shape "ResourceId", :location "querystring", :location-name "delegationsetid"}))))

(clojure.core/defn- req-get-traffic-policy-instance-count-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-list-query-logging-configs-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :hosted-zone-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-id (input :hosted-zone-id)) #:http.request.field{:name "HostedZoneId", :shape "ResourceId", :location "querystring", :location-name "hostedzoneid"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken", :location "querystring", :location-name "nexttoken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :location "querystring", :location-name "maxresults"}))))

(clojure.core/defn- req-get-change-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-id (input :id)) #:http.request.field{:name "Id", :shape "ResourceId", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-list-reusable-delegation-sets-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-marker (input :marker)) #:http.request.field{:name "Marker", :shape "PageMarker", :location "querystring", :location-name "marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-max-items (input :max-items)) #:http.request.field{:name "MaxItems", :shape "PageMaxItems", :location "querystring", :location-name "maxitems"}))))

(clojure.core/defn- req-list-vpc-association-authorizations-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-id (input :hosted-zone-id)) #:http.request.field{:name "HostedZoneId", :shape "ResourceId", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken", :location "querystring", :location-name "nexttoken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :location "querystring", :location-name "maxresults"}))))

(clojure.core/defn- req-create-traffic-policy-instance-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :hosted-zone-id)) #:http.request.field{:name "HostedZoneId", :shape "ResourceId"}) (clojure.core/into (ser-dns-name (input :name)) #:http.request.field{:name "Name", :shape "DNSName"}) (clojure.core/into (ser-ttl (input :ttl)) #:http.request.field{:name "TTL", :shape "TTL"}) (clojure.core/into (ser-traffic-policy-id (input :traffic-policy-id)) #:http.request.field{:name "TrafficPolicyId", :shape "TrafficPolicyId"}) (clojure.core/into (ser-traffic-policy-version (input :traffic-policy-version)) #:http.request.field{:name "TrafficPolicyVersion", :shape "TrafficPolicyVersion"})]}))

(clojure.core/defn- req-get-query-logging-config-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-query-logging-config-id (input :id)) #:http.request.field{:name "Id", :shape "QueryLoggingConfigId", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-list-traffic-policies-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :traffic-policy-id-marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-traffic-policy-id (input :traffic-policy-id-marker)) #:http.request.field{:name "TrafficPolicyIdMarker", :shape "TrafficPolicyId", :location "querystring", :location-name "trafficpolicyid"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-max-items (input :max-items)) #:http.request.field{:name "MaxItems", :shape "PageMaxItems", :location "querystring", :location-name "maxitems"}))))

(clojure.core/defn- req-get-health-check-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-health-check-id (input :health-check-id)) #:http.request.field{:name "HealthCheckId", :shape "HealthCheckId", :location "uri", :location-name "HealthCheckId"})]}))

(clojure.core/defn- req-create-health-check-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-health-check-nonce (input :caller-reference)) #:http.request.field{:name "CallerReference", :shape "HealthCheckNonce"}) (clojure.core/into (ser-health-check-config (input :health-check-config)) #:http.request.field{:name "HealthCheckConfig", :shape "HealthCheckConfig"})]}))

(clojure.core/defn- req-associate-vpc-with-hosted-zone-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-id (input :hosted-zone-id)) #:http.request.field{:name "HostedZoneId", :shape "ResourceId", :location "uri", :location-name "Id"})], :body [(clojure.core/into (ser-vpc (input :vpc)) #:http.request.field{:name "VPC", :shape "VPC"})]} (clojure.core/contains? input :comment) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-associate-vpc-comment (input :comment)) #:http.request.field{:name "Comment", :shape "AssociateVPCComment"}))))

(clojure.core/defn- req-list-health-checks-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-marker (input :marker)) #:http.request.field{:name "Marker", :shape "PageMarker", :location "querystring", :location-name "marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-max-items (input :max-items)) #:http.request.field{:name "MaxItems", :shape "PageMaxItems", :location "querystring", :location-name "maxitems"}))))

(clojure.core/defn- req-get-health-check-last-failure-reason-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-health-check-id (input :health-check-id)) #:http.request.field{:name "HealthCheckId", :shape "HealthCheckId", :location "uri", :location-name "HealthCheckId"})]}))

(clojure.core/defn- req-get-hosted-zone-limit-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-hosted-zone-limit-type (input :type)) #:http.request.field{:name "Type", :shape "HostedZoneLimitType", :location "uri", :location-name "Type"}) (clojure.core/into (ser-resource-id (input :hosted-zone-id)) #:http.request.field{:name "HostedZoneId", :shape "ResourceId", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-change-tags-for-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-tag-resource-type (input :resource-type)) #:http.request.field{:name "ResourceType", :shape "TagResourceType", :location "uri", :location-name "ResourceType"}) (clojure.core/into (ser-tag-resource-id (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "TagResourceId", :location "uri", :location-name "ResourceId"})]} (clojure.core/contains? input :add-tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :add-tags)) #:http.request.field{:name "AddTags", :shape "TagList"})) (clojure.core/contains? input :remove-tag-keys) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-key-list (input :remove-tag-keys)) #:http.request.field{:name "RemoveTagKeys", :shape "TagKeyList"}))))

(clojure.core/defn- req-create-reusable-delegation-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-nonce (input :caller-reference)) #:http.request.field{:name "CallerReference", :shape "Nonce"})]} (clojure.core/contains? input :hosted-zone-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-id (input :hosted-zone-id)) #:http.request.field{:name "HostedZoneId", :shape "ResourceId"}))))

(clojure.core/defn- req-get-traffic-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-traffic-policy-id (input :id)) #:http.request.field{:name "Id", :shape "TrafficPolicyId", :location "uri", :location-name "Id"}) (clojure.core/into (ser-traffic-policy-version (input :version)) #:http.request.field{:name "Version", :shape "TrafficPolicyVersion", :location "uri", :location-name "Version"})]}))

(clojure.core/defn- req-disassociate-vpc-from-hosted-zone-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-id (input :hosted-zone-id)) #:http.request.field{:name "HostedZoneId", :shape "ResourceId", :location "uri", :location-name "Id"})], :body [(clojure.core/into (ser-vpc (input :vpc)) #:http.request.field{:name "VPC", :shape "VPC"})]} (clojure.core/contains? input :comment) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-disassociate-vpc-comment (input :comment)) #:http.request.field{:name "Comment", :shape "DisassociateVPCComment"}))))

(clojure.core/defn- req-delete-reusable-delegation-set-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-id (input :id)) #:http.request.field{:name "Id", :shape "ResourceId", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-get-account-limit-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-account-limit-type (input :type)) #:http.request.field{:name "Type", :shape "AccountLimitType", :location "uri", :location-name "Type"})]}))

(clojure.core/defn- req-get-health-check-count-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-delete-traffic-policy-instance-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-traffic-policy-instance-id (input :id)) #:http.request.field{:name "Id", :shape "TrafficPolicyInstanceId", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-get-reusable-delegation-set-limit-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-reusable-delegation-set-limit-type (input :type)) #:http.request.field{:name "Type", :shape "ReusableDelegationSetLimitType", :location "uri", :location-name "Type"}) (clojure.core/into (ser-resource-id (input :delegation-set-id)) #:http.request.field{:name "DelegationSetId", :shape "ResourceId", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-list-tags-for-resources-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-tag-resource-type (input :resource-type)) #:http.request.field{:name "ResourceType", :shape "TagResourceType", :location "uri", :location-name "ResourceType"})], :body [(clojure.core/into (ser-tag-resource-id-list (input :resource-ids)) #:http.request.field{:name "ResourceIds", :shape "TagResourceIdList"})]}))

(clojure.core/defn- req-list-geo-locations-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :start-continent-code) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-geo-location-continent-code (input :start-continent-code)) #:http.request.field{:name "StartContinentCode", :shape "GeoLocationContinentCode", :location "querystring", :location-name "startcontinentcode"})) (clojure.core/contains? input :start-country-code) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-geo-location-country-code (input :start-country-code)) #:http.request.field{:name "StartCountryCode", :shape "GeoLocationCountryCode", :location "querystring", :location-name "startcountrycode"})) (clojure.core/contains? input :start-subdivision-code) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-geo-location-subdivision-code (input :start-subdivision-code)) #:http.request.field{:name "StartSubdivisionCode", :shape "GeoLocationSubdivisionCode", :location "querystring", :location-name "startsubdivisioncode"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-max-items (input :max-items)) #:http.request.field{:name "MaxItems", :shape "PageMaxItems", :location "querystring", :location-name "maxitems"}))))

(clojure.core/defn- req-create-hosted-zone-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-dns-name (input :name)) #:http.request.field{:name "Name", :shape "DNSName"}) (clojure.core/into (ser-nonce (input :caller-reference)) #:http.request.field{:name "CallerReference", :shape "Nonce"})]} (clojure.core/contains? input :vpc) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-vpc (input :vpc)) #:http.request.field{:name "VPC", :shape "VPC"})) (clojure.core/contains? input :hosted-zone-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hosted-zone-config (input :hosted-zone-config)) #:http.request.field{:name "HostedZoneConfig", :shape "HostedZoneConfig"})) (clojure.core/contains? input :delegation-set-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-id (input :delegation-set-id)) #:http.request.field{:name "DelegationSetId", :shape "ResourceId"}))))

(clojure.core/declare deser-insufficient-data-health-status)

(clojure.core/declare deser-tag-resource-type)

(clojure.core/declare deser-geo-location-subdivision-name)

(clojure.core/declare deser-health-check)

(clojure.core/declare deser-delegation-set-name-servers)

(clojure.core/declare deser-health-check-nonce)

(clojure.core/declare deser-traffic-policy-instance-count)

(clojure.core/declare deser-search-string)

(clojure.core/declare deser-hosted-zone-rr-set-count)

(clojure.core/declare deser-resource-tag-set)

(clojure.core/declare deser-rr-type)

(clojure.core/declare deser-cloud-watch-logs-log-group-arn)

(clojure.core/declare deser-alias-target)

(clojure.core/declare deser-account-limit-type)

(clojure.core/declare deser-geo-location-country-code)

(clojure.core/declare deser-traffic-policy-version-marker)

(clojure.core/declare deser-traffic-policy-summaries)

(clojure.core/declare deser-period)

(clojure.core/declare deser-delegation-sets)

(clojure.core/declare deser-threshold)

(clojure.core/declare deser-dimension-field)

(clojure.core/declare deser-nameserver)

(clojure.core/declare deser-resource-description)

(clojure.core/declare deser-resource-record-set-region)

(clojure.core/declare deser-traffic-policy-name)

(clojure.core/declare deser-traffic-policy)

(clojure.core/declare deser-vpc-region)

(clojure.core/declare deser-health-checks)

(clojure.core/declare deser-health-check-region)

(clojure.core/declare deser-geo-location-continent-code)

(clojure.core/declare deser-health-check-version)

(clojure.core/declare deser-error-messages)

(clojure.core/declare deser-failure-threshold)

(clojure.core/declare deser-child-health-check-list)

(clojure.core/declare deser-checker-ip-ranges)

(clojure.core/declare deser-tag-key)

(clojure.core/declare deser-dimension)

(clojure.core/declare deser-vp-cs)

(clojure.core/declare deser-pagination-token)

(clojure.core/declare deser-comparison-operator)

(clojure.core/declare deser-linked-service)

(clojure.core/declare deser-health-check-region-list)

(clojure.core/declare deser-reusable-delegation-set-limit-type)

(clojure.core/declare deser-geo-location-continent-name)

(clojure.core/declare deser-health-check-count)

(clojure.core/declare deser-hosted-zone)

(clojure.core/declare deser-tag-resource-id)

(clojure.core/declare deser-traffic-policy-instances)

(clojure.core/declare deser-page-truncated)

(clojure.core/declare deser-geo-location)

(clojure.core/declare deser-ip-address-cidr)

(clojure.core/declare deser-health-check-config)

(clojure.core/declare deser-change-info)

(clojure.core/declare deser-dimension-list)

(clojure.core/declare deser-status)

(clojure.core/declare deser-service-principal)

(clojure.core/declare deser-traffic-policy-version)

(clojure.core/declare deser-error-message)

(clojure.core/declare deser-geo-location-details)

(clojure.core/declare deser-change-status)

(clojure.core/declare deser-dnsr-code)

(clojure.core/declare deser-resource-id)

(clojure.core/declare deser-traffic-policy-instance-state)

(clojure.core/declare deser-ttl)

(clojure.core/declare deser-resource-record-set-weight)

(clojure.core/declare deser-resource-tag-set-list)

(clojure.core/declare deser-tag-list)

(clojure.core/declare deser-hosted-zone-count)

(clojure.core/declare deser-record-data-entry)

(clojure.core/declare deser-health-check-observation)

(clojure.core/declare deser-health-check-id)

(clojure.core/declare deser-dns-name)

(clojure.core/declare deser-query-logging-configs)

(clojure.core/declare deser-reusable-delegation-set-limit)

(clojure.core/declare deser-resource-records)

(clojure.core/declare deser-traffic-policy-document)

(clojure.core/declare deser-resource-uri)

(clojure.core/declare deser-traffic-policy-id)

(clojure.core/declare deser-hosted-zone-limit)

(clojure.core/declare deser-account-limit)

(clojure.core/declare deser-query-logging-config-id)

(clojure.core/declare deser-query-logging-config)

(clojure.core/declare deser-tag-value)

(clojure.core/declare deser-delegation-set)

(clojure.core/declare deser-resource-record-set-multi-value-answer)

(clojure.core/declare deser-port)

(clojure.core/declare deser-namespace)

(clojure.core/declare deser-message)

(clojure.core/declare deser-resource-record-set-identifier)

(clojure.core/declare deser-resource-record-set-failover)

(clojure.core/declare deser-geo-location-subdivision-code)

(clojure.core/declare deser-ip-address)

(clojure.core/declare deser-traffic-policy-instance-id)

(clojure.core/declare deser-traffic-policy-summary)

(clojure.core/declare deser-traffic-policy-instance)

(clojure.core/declare deser-geo-location-country-name)

(clojure.core/declare deser-resource-record)

(clojure.core/declare deser-alarm-name)

(clojure.core/declare deser-usage-count)

(clojure.core/declare deser-hosted-zone-config)

(clojure.core/declare deser-hosted-zone-limit-type)

(clojure.core/declare deser-resource-path)

(clojure.core/declare deser-traffic-policies)

(clojure.core/declare deser-geo-location-details-list)

(clojure.core/declare deser-alarm-identifier)

(clojure.core/declare deser-is-private-zone)

(clojure.core/declare deser-traffic-policy-comment)

(clojure.core/declare deser-enable-sni)

(clojure.core/declare deser-health-check-type)

(clojure.core/declare deser-record-data)

(clojure.core/declare deser-r-data)

(clojure.core/declare deser-alias-health-enabled)

(clojure.core/declare deser-health-check-observations)

(clojure.core/declare deser-tag)

(clojure.core/declare deser-page-marker)

(clojure.core/declare deser-metric-name)

(clojure.core/declare deser-nonce)

(clojure.core/declare deser-measure-latency)

(clojure.core/declare deser-transport-protocol)

(clojure.core/declare deser-hosted-zones)

(clojure.core/declare deser-evaluation-periods)

(clojure.core/declare deser-resource-record-sets)

(clojure.core/declare deser-health-threshold)

(clojure.core/declare deser-resource-record-set)

(clojure.core/declare deser-vpc-id)

(clojure.core/declare deser-request-interval)

(clojure.core/declare deser-time-stamp)

(clojure.core/declare deser-cloud-watch-alarm-configuration)

(clojure.core/declare deser-fully-qualified-domain-name)

(clojure.core/declare deser-statistic)

(clojure.core/declare deser-status-report)

(clojure.core/declare deser-vpc)

(clojure.core/declare deser-limit-value)

(clojure.core/declare deser-page-max-items)

(clojure.core/declare deser-inverted)

(clojure.core/declare deser-cloud-watch-region)

(clojure.core/defn- deser-insufficient-data-health-status [input] (clojure.core/get {"Healthy" :healthy, "Unhealthy" :unhealthy, "LastKnownStatus" :last-known-status} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-tag-resource-type [input] (clojure.core/get {"healthcheck" :healthcheck, "hostedzone" :hostedzone} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-geo-location-subdivision-name [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-health-check [input] (clojure.core/let [letvar146136 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? false :xmlAttribute? nil), "LinkedService" (portkey.aws/search-for-tag input "LinkedService" :flattened? false :xmlAttribute? nil), "HealthCheckConfig" (portkey.aws/search-for-tag input "HealthCheckConfig" :flattened? false :xmlAttribute? nil), "HealthCheckVersion" (portkey.aws/search-for-tag input "HealthCheckVersion" :flattened? false :xmlAttribute? nil), "CloudWatchAlarmConfiguration" (portkey.aws/search-for-tag input "CloudWatchAlarmConfiguration" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deser-health-check-id (clojure.core/get-in letvar146136 ["Id" :content])), :caller-reference (deser-health-check-nonce (clojure.core/get-in letvar146136 ["CallerReference" :content])), :health-check-config (deser-health-check-config (clojure.core/get-in letvar146136 ["HealthCheckConfig" :content])), :health-check-version (deser-health-check-version (clojure.core/get-in letvar146136 ["HealthCheckVersion" :content]))} (letvar146136 "LinkedService") (clojure.core/assoc :linked-service (deser-linked-service (clojure.core/get-in letvar146136 ["LinkedService" :content]))) (letvar146136 "CloudWatchAlarmConfiguration") (clojure.core/assoc :cloud-watch-alarm-configuration (deser-cloud-watch-alarm-configuration (clojure.core/get-in letvar146136 ["CloudWatchAlarmConfiguration" :content]))))))

(clojure.core/defn- deser-delegation-set-name-servers [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-dns-name coll))) input))

(clojure.core/defn- deser-health-check-nonce [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-traffic-policy-instance-count [input] (java.lang.Integer. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-search-string [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-hosted-zone-rr-set-count [input] (java.lang.Long. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-resource-tag-set [input] (clojure.core/let [letvar146263 {"ResourceType" (portkey.aws/search-for-tag input "ResourceType" :flattened? false :xmlAttribute? nil), "ResourceId" (portkey.aws/search-for-tag input "ResourceId" :flattened? false :xmlAttribute? nil), "Tags" (portkey.aws/search-for-tag input "Tags" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar146263 "ResourceType") (clojure.core/assoc :resource-type (deser-tag-resource-type (clojure.core/get-in letvar146263 ["ResourceType" :content]))) (letvar146263 "ResourceId") (clojure.core/assoc :resource-id (deser-tag-resource-id (clojure.core/get-in letvar146263 ["ResourceId" :content]))) (letvar146263 "Tags") (clojure.core/assoc :tags (deser-tag-list (clojure.core/get-in letvar146263 ["Tags" :content]))))))

(clojure.core/defn- deser-rr-type [input] (clojure.core/get {"CAA" :caa, "CNAME" :cname, "TXT" :txt, "SRV" :srv, "AAAA" :aaaa, "NS" :ns, "PTR" :ptr, "NAPTR" :naptr, "A" :a, "SPF" :spf, "SOA" :soa, "MX" :mx} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-cloud-watch-logs-log-group-arn [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-alias-target [input] (clojure.core/let [letvar146369 {"HostedZoneId" (portkey.aws/search-for-tag input "HostedZoneId" :flattened? false :xmlAttribute? nil), "DNSName" (portkey.aws/search-for-tag input "DNSName" :flattened? false :xmlAttribute? nil), "EvaluateTargetHealth" (portkey.aws/search-for-tag input "EvaluateTargetHealth" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:hosted-zone-id (deser-resource-id (clojure.core/get-in letvar146369 ["HostedZoneId" :content])), :dns-name (deser-dns-name (clojure.core/get-in letvar146369 ["DNSName" :content])), :evaluate-target-health (deser-alias-health-enabled (clojure.core/get-in letvar146369 ["EvaluateTargetHealth" :content]))})))

(clojure.core/defn- deser-account-limit-type [input] (clojure.core/get {"MAX_HEALTH_CHECKS_BY_OWNER" :max-health-checks-by-owner, "MAX_HOSTED_ZONES_BY_OWNER" :max-hosted-zones-by-owner, "MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER" :max-traffic-policy-instances-by-owner, "MAX_REUSABLE_DELEGATION_SETS_BY_OWNER" :max-reusable-delegation-sets-by-owner, "MAX_TRAFFIC_POLICIES_BY_OWNER" :max-traffic-policies-by-owner} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-geo-location-country-code [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-traffic-policy-version-marker [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-traffic-policy-summaries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-traffic-policy-summary coll))) input))

(clojure.core/defn- deser-period [input] (java.lang.Integer. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-delegation-sets [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-delegation-set coll))) input))

(clojure.core/defn- deser-threshold [input] (java.lang.Double. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-dimension-field [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-nameserver [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-resource-description [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-resource-record-set-region [input] (clojure.core/get {"ap-northeast-1" :apnortheast-1, "eu-west-1" :euwest-1, "ap-northeast-3" :apnortheast-3, "us-east-2" :useast-2, "ap-southeast-2" :apsoutheast-2, "cn-north-1" :cnnorth-1, "sa-east-1" :saeast-1, "ap-southeast-1" :apsoutheast-1, "cn-northwest-1" :cnnorthwest-1, "ap-northeast-2" :apnortheast-2, "eu-west-3" :euwest-3, "ca-central-1" :cacentral-1, "eu-central-1" :eucentral-1, "eu-west-2" :euwest-2, "us-west-2" :uswest-2, "us-east-1" :useast-1, "us-west-1" :uswest-1, "ap-south-1" :apsouth-1} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-traffic-policy-name [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-traffic-policy [input] (clojure.core/let [letvar146543 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "Version" (portkey.aws/search-for-tag input "Version" :flattened? false :xmlAttribute? nil), "Name" (portkey.aws/search-for-tag input "Name" :flattened? false :xmlAttribute? nil), "Type" (portkey.aws/search-for-tag input "Type" :flattened? false :xmlAttribute? nil), "Document" (portkey.aws/search-for-tag input "Document" :flattened? false :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deser-traffic-policy-id (clojure.core/get-in letvar146543 ["Id" :content])), :version (deser-traffic-policy-version (clojure.core/get-in letvar146543 ["Version" :content])), :name (deser-traffic-policy-name (clojure.core/get-in letvar146543 ["Name" :content])), :type (deser-rr-type (clojure.core/get-in letvar146543 ["Type" :content])), :document (deser-traffic-policy-document (clojure.core/get-in letvar146543 ["Document" :content]))} (letvar146543 "Comment") (clojure.core/assoc :comment (deser-traffic-policy-comment (clojure.core/get-in letvar146543 ["Comment" :content]))))))

(clojure.core/defn- deser-vpc-region [input] (clojure.core/get {"ap-northeast-1" :apnortheast-1, "eu-west-1" :euwest-1, "ap-northeast-3" :apnortheast-3, "us-east-2" :useast-2, "ap-southeast-2" :apsoutheast-2, "cn-north-1" :cnnorth-1, "sa-east-1" :saeast-1, "ap-southeast-1" :apsoutheast-1, "ap-northeast-2" :apnortheast-2, "eu-west-3" :euwest-3, "ca-central-1" :cacentral-1, "eu-central-1" :eucentral-1, "eu-west-2" :euwest-2, "us-west-2" :uswest-2, "us-east-1" :useast-1, "us-west-1" :uswest-1, "ap-south-1" :apsouth-1} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-health-checks [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-health-check coll))) input))

(clojure.core/defn- deser-health-check-region [input] (clojure.core/get {"us-east-1" :useast-1, "us-west-1" :uswest-1, "us-west-2" :uswest-2, "eu-west-1" :euwest-1, "ap-southeast-1" :apsoutheast-1, "ap-southeast-2" :apsoutheast-2, "ap-northeast-1" :apnortheast-1, "sa-east-1" :saeast-1} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-geo-location-continent-code [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-health-check-version [input] (java.lang.Long. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-error-messages [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-error-message coll))) input))

(clojure.core/defn- deser-failure-threshold [input] (java.lang.Integer. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-child-health-check-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-health-check-id coll))) input))

(clojure.core/defn- deser-checker-ip-ranges [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-ip-address-cidr coll))) input))

(clojure.core/defn- deser-tag-key [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-dimension [input] (clojure.core/let [letvar146731 {"Name" (portkey.aws/search-for-tag input "Name" :flattened? false :xmlAttribute? nil), "Value" (portkey.aws/search-for-tag input "Value" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:name (deser-dimension-field (clojure.core/get-in letvar146731 ["Name" :content])), :value (deser-dimension-field (clojure.core/get-in letvar146731 ["Value" :content]))})))

(clojure.core/defn- deser-vp-cs [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-vpc coll))) input))

(clojure.core/defn- deser-pagination-token [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-comparison-operator [input] (clojure.core/get {"GreaterThanOrEqualToThreshold" :greater-than-or-equal-to-threshold, "GreaterThanThreshold" :greater-than-threshold, "LessThanThreshold" :less-than-threshold, "LessThanOrEqualToThreshold" :less-than-or-equal-to-threshold} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-linked-service [input] (clojure.core/let [letvar146854 {"ServicePrincipal" (portkey.aws/search-for-tag input "ServicePrincipal" :flattened? false :xmlAttribute? nil), "Description" (portkey.aws/search-for-tag input "Description" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar146854 "ServicePrincipal") (clojure.core/assoc :service-principal (deser-service-principal (clojure.core/get-in letvar146854 ["ServicePrincipal" :content]))) (letvar146854 "Description") (clojure.core/assoc :description (deser-resource-description (clojure.core/get-in letvar146854 ["Description" :content]))))))

(clojure.core/defn- deser-health-check-region-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-health-check-region coll))) input))

(clojure.core/defn- deser-reusable-delegation-set-limit-type [input] (clojure.core/get {"MAX_ZONES_BY_REUSABLE_DELEGATION_SET" :max-zones-by-reusable-delegation-set} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-geo-location-continent-name [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-health-check-count [input] (java.lang.Long. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-hosted-zone [input] (clojure.core/let [letvar146979 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "Name" (portkey.aws/search-for-tag input "Name" :flattened? false :xmlAttribute? nil), "CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? false :xmlAttribute? nil), "Config" (portkey.aws/search-for-tag input "Config" :flattened? false :xmlAttribute? nil), "ResourceRecordSetCount" (portkey.aws/search-for-tag input "ResourceRecordSetCount" :flattened? false :xmlAttribute? nil), "LinkedService" (portkey.aws/search-for-tag input "LinkedService" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deser-resource-id (clojure.core/get-in letvar146979 ["Id" :content])), :name (deser-dns-name (clojure.core/get-in letvar146979 ["Name" :content])), :caller-reference (deser-nonce (clojure.core/get-in letvar146979 ["CallerReference" :content]))} (letvar146979 "Config") (clojure.core/assoc :config (deser-hosted-zone-config (clojure.core/get-in letvar146979 ["Config" :content]))) (letvar146979 "ResourceRecordSetCount") (clojure.core/assoc :resource-record-set-count (deser-hosted-zone-rr-set-count (clojure.core/get-in letvar146979 ["ResourceRecordSetCount" :content]))) (letvar146979 "LinkedService") (clojure.core/assoc :linked-service (deser-linked-service (clojure.core/get-in letvar146979 ["LinkedService" :content]))))))

(clojure.core/defn- deser-tag-resource-id [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-traffic-policy-instances [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-traffic-policy-instance coll))) input))

(clojure.core/defn- deser-page-truncated [input] (clojure.core/when-let [boolstr__23442__auto__ (if (clojure.core/seq? input) (clojure.core/first input) input)] (clojure.core/cond (clojure.core/= "true" boolstr__23442__auto__) true (clojure.core/= "false" boolstr__23442__auto__) false)))

(clojure.core/defn- deser-geo-location [input] (clojure.core/let [letvar147099 {"ContinentCode" (portkey.aws/search-for-tag input "ContinentCode" :flattened? false :xmlAttribute? nil), "CountryCode" (portkey.aws/search-for-tag input "CountryCode" :flattened? false :xmlAttribute? nil), "SubdivisionCode" (portkey.aws/search-for-tag input "SubdivisionCode" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar147099 "ContinentCode") (clojure.core/assoc :continent-code (deser-geo-location-continent-code (clojure.core/get-in letvar147099 ["ContinentCode" :content]))) (letvar147099 "CountryCode") (clojure.core/assoc :country-code (deser-geo-location-country-code (clojure.core/get-in letvar147099 ["CountryCode" :content]))) (letvar147099 "SubdivisionCode") (clojure.core/assoc :subdivision-code (deser-geo-location-subdivision-code (clojure.core/get-in letvar147099 ["SubdivisionCode" :content]))))))

(clojure.core/defn- deser-ip-address-cidr [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-health-check-config [input] (clojure.core/let [letvar147200 {"InsufficientDataHealthStatus" (portkey.aws/search-for-tag input "InsufficientDataHealthStatus" :flattened? false :xmlAttribute? nil), "SearchString" (portkey.aws/search-for-tag input "SearchString" :flattened? false :xmlAttribute? nil), "Type" (portkey.aws/search-for-tag input "Type" :flattened? false :xmlAttribute? nil), "FailureThreshold" (portkey.aws/search-for-tag input "FailureThreshold" :flattened? false :xmlAttribute? nil), "ChildHealthChecks" (portkey.aws/search-for-tag input "ChildHealthChecks" :flattened? false :xmlAttribute? nil), "Regions" (portkey.aws/search-for-tag input "Regions" :flattened? false :xmlAttribute? nil), "Port" (portkey.aws/search-for-tag input "Port" :flattened? false :xmlAttribute? nil), "IPAddress" (portkey.aws/search-for-tag input "IPAddress" :flattened? false :xmlAttribute? nil), "ResourcePath" (portkey.aws/search-for-tag input "ResourcePath" :flattened? false :xmlAttribute? nil), "AlarmIdentifier" (portkey.aws/search-for-tag input "AlarmIdentifier" :flattened? false :xmlAttribute? nil), "EnableSNI" (portkey.aws/search-for-tag input "EnableSNI" :flattened? false :xmlAttribute? nil), "MeasureLatency" (portkey.aws/search-for-tag input "MeasureLatency" :flattened? false :xmlAttribute? nil), "HealthThreshold" (portkey.aws/search-for-tag input "HealthThreshold" :flattened? false :xmlAttribute? nil), "RequestInterval" (portkey.aws/search-for-tag input "RequestInterval" :flattened? false :xmlAttribute? nil), "FullyQualifiedDomainName" (portkey.aws/search-for-tag input "FullyQualifiedDomainName" :flattened? false :xmlAttribute? nil), "Inverted" (portkey.aws/search-for-tag input "Inverted" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:type (deser-health-check-type (clojure.core/get-in letvar147200 ["Type" :content]))} (letvar147200 "InsufficientDataHealthStatus") (clojure.core/assoc :insufficient-data-health-status (deser-insufficient-data-health-status (clojure.core/get-in letvar147200 ["InsufficientDataHealthStatus" :content]))) (letvar147200 "SearchString") (clojure.core/assoc :search-string (deser-search-string (clojure.core/get-in letvar147200 ["SearchString" :content]))) (letvar147200 "FailureThreshold") (clojure.core/assoc :failure-threshold (deser-failure-threshold (clojure.core/get-in letvar147200 ["FailureThreshold" :content]))) (letvar147200 "ChildHealthChecks") (clojure.core/assoc :child-health-checks (deser-child-health-check-list (clojure.core/get-in letvar147200 ["ChildHealthChecks" :content]))) (letvar147200 "Regions") (clojure.core/assoc :regions (deser-health-check-region-list (clojure.core/get-in letvar147200 ["Regions" :content]))) (letvar147200 "Port") (clojure.core/assoc :port (deser-port (clojure.core/get-in letvar147200 ["Port" :content]))) (letvar147200 "IPAddress") (clojure.core/assoc :ip-address (deser-ip-address (clojure.core/get-in letvar147200 ["IPAddress" :content]))) (letvar147200 "ResourcePath") (clojure.core/assoc :resource-path (deser-resource-path (clojure.core/get-in letvar147200 ["ResourcePath" :content]))) (letvar147200 "AlarmIdentifier") (clojure.core/assoc :alarm-identifier (deser-alarm-identifier (clojure.core/get-in letvar147200 ["AlarmIdentifier" :content]))) (letvar147200 "EnableSNI") (clojure.core/assoc :enable-sni (deser-enable-sni (clojure.core/get-in letvar147200 ["EnableSNI" :content]))) (letvar147200 "MeasureLatency") (clojure.core/assoc :measure-latency (deser-measure-latency (clojure.core/get-in letvar147200 ["MeasureLatency" :content]))) (letvar147200 "HealthThreshold") (clojure.core/assoc :health-threshold (deser-health-threshold (clojure.core/get-in letvar147200 ["HealthThreshold" :content]))) (letvar147200 "RequestInterval") (clojure.core/assoc :request-interval (deser-request-interval (clojure.core/get-in letvar147200 ["RequestInterval" :content]))) (letvar147200 "FullyQualifiedDomainName") (clojure.core/assoc :fully-qualified-domain-name (deser-fully-qualified-domain-name (clojure.core/get-in letvar147200 ["FullyQualifiedDomainName" :content]))) (letvar147200 "Inverted") (clojure.core/assoc :inverted (deser-inverted (clojure.core/get-in letvar147200 ["Inverted" :content]))))))

(clojure.core/defn- deser-change-info [input] (clojure.core/let [letvar147296 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil), "SubmittedAt" (portkey.aws/search-for-tag input "SubmittedAt" :flattened? false :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deser-resource-id (clojure.core/get-in letvar147296 ["Id" :content])), :status (deser-change-status (clojure.core/get-in letvar147296 ["Status" :content])), :submitted-at (deser-time-stamp (clojure.core/get-in letvar147296 ["SubmittedAt" :content]))} (letvar147296 "Comment") (clojure.core/assoc :comment (deser-resource-description (clojure.core/get-in letvar147296 ["Comment" :content]))))))

(clojure.core/defn- deser-dimension-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-dimension coll))) input))

(clojure.core/defn- deser-status [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-service-principal [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-traffic-policy-version [input] (java.lang.Integer. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-error-message [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-geo-location-details [input] (clojure.core/let [letvar147426 {"ContinentCode" (portkey.aws/search-for-tag input "ContinentCode" :flattened? false :xmlAttribute? nil), "ContinentName" (portkey.aws/search-for-tag input "ContinentName" :flattened? false :xmlAttribute? nil), "CountryCode" (portkey.aws/search-for-tag input "CountryCode" :flattened? false :xmlAttribute? nil), "CountryName" (portkey.aws/search-for-tag input "CountryName" :flattened? false :xmlAttribute? nil), "SubdivisionCode" (portkey.aws/search-for-tag input "SubdivisionCode" :flattened? false :xmlAttribute? nil), "SubdivisionName" (portkey.aws/search-for-tag input "SubdivisionName" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar147426 "ContinentCode") (clojure.core/assoc :continent-code (deser-geo-location-continent-code (clojure.core/get-in letvar147426 ["ContinentCode" :content]))) (letvar147426 "ContinentName") (clojure.core/assoc :continent-name (deser-geo-location-continent-name (clojure.core/get-in letvar147426 ["ContinentName" :content]))) (letvar147426 "CountryCode") (clojure.core/assoc :country-code (deser-geo-location-country-code (clojure.core/get-in letvar147426 ["CountryCode" :content]))) (letvar147426 "CountryName") (clojure.core/assoc :country-name (deser-geo-location-country-name (clojure.core/get-in letvar147426 ["CountryName" :content]))) (letvar147426 "SubdivisionCode") (clojure.core/assoc :subdivision-code (deser-geo-location-subdivision-code (clojure.core/get-in letvar147426 ["SubdivisionCode" :content]))) (letvar147426 "SubdivisionName") (clojure.core/assoc :subdivision-name (deser-geo-location-subdivision-name (clojure.core/get-in letvar147426 ["SubdivisionName" :content]))))))

(clojure.core/defn- deser-change-status [input] (clojure.core/get {"PENDING" :pending, "INSYNC" :insync} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-dnsr-code [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-resource-id [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-traffic-policy-instance-state [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-ttl [input] (java.lang.Long. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-resource-record-set-weight [input] (java.lang.Long. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-resource-tag-set-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-resource-tag-set coll))) input))

(clojure.core/defn- deser-tag-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-hosted-zone-count [input] (java.lang.Long. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-record-data-entry [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-health-check-observation [input] (clojure.core/let [letvar147587 {"Region" (portkey.aws/search-for-tag input "Region" :flattened? false :xmlAttribute? nil), "IPAddress" (portkey.aws/search-for-tag input "IPAddress" :flattened? false :xmlAttribute? nil), "StatusReport" (portkey.aws/search-for-tag input "StatusReport" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar147587 "Region") (clojure.core/assoc :region (deser-health-check-region (clojure.core/get-in letvar147587 ["Region" :content]))) (letvar147587 "IPAddress") (clojure.core/assoc :ip-address (deser-ip-address (clojure.core/get-in letvar147587 ["IPAddress" :content]))) (letvar147587 "StatusReport") (clojure.core/assoc :status-report (deser-status-report (clojure.core/get-in letvar147587 ["StatusReport" :content]))))))

(clojure.core/defn- deser-health-check-id [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-dns-name [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-query-logging-configs [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-query-logging-config coll))) input))

(clojure.core/defn- deser-reusable-delegation-set-limit [input] (clojure.core/let [letvar147710 {"Type" (portkey.aws/search-for-tag input "Type" :flattened? false :xmlAttribute? nil), "Value" (portkey.aws/search-for-tag input "Value" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:type (deser-reusable-delegation-set-limit-type (clojure.core/get-in letvar147710 ["Type" :content])), :value (deser-limit-value (clojure.core/get-in letvar147710 ["Value" :content]))})))

(clojure.core/defn- deser-resource-records [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-resource-record coll))) input))

(clojure.core/defn- deser-traffic-policy-document [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-resource-uri [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-traffic-policy-id [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-hosted-zone-limit [input] (clojure.core/let [letvar147838 {"Type" (portkey.aws/search-for-tag input "Type" :flattened? false :xmlAttribute? nil), "Value" (portkey.aws/search-for-tag input "Value" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:type (deser-hosted-zone-limit-type (clojure.core/get-in letvar147838 ["Type" :content])), :value (deser-limit-value (clojure.core/get-in letvar147838 ["Value" :content]))})))

(clojure.core/defn- deser-account-limit [input] (clojure.core/let [letvar147934 {"Type" (portkey.aws/search-for-tag input "Type" :flattened? false :xmlAttribute? nil), "Value" (portkey.aws/search-for-tag input "Value" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:type (deser-account-limit-type (clojure.core/get-in letvar147934 ["Type" :content])), :value (deser-limit-value (clojure.core/get-in letvar147934 ["Value" :content]))})))

(clojure.core/defn- deser-query-logging-config-id [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-query-logging-config [input] (clojure.core/let [letvar148035 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "HostedZoneId" (portkey.aws/search-for-tag input "HostedZoneId" :flattened? false :xmlAttribute? nil), "CloudWatchLogsLogGroupArn" (portkey.aws/search-for-tag input "CloudWatchLogsLogGroupArn" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deser-query-logging-config-id (clojure.core/get-in letvar148035 ["Id" :content])), :hosted-zone-id (deser-resource-id (clojure.core/get-in letvar148035 ["HostedZoneId" :content])), :cloud-watch-logs-log-group-arn (deser-cloud-watch-logs-log-group-arn (clojure.core/get-in letvar148035 ["CloudWatchLogsLogGroupArn" :content]))})))

(clojure.core/defn- deser-tag-value [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-delegation-set [input] (clojure.core/let [letvar148136 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? false :xmlAttribute? nil), "NameServers" (portkey.aws/search-for-tag input "NameServers" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:name-servers (deser-delegation-set-name-servers (clojure.core/get-in letvar148136 ["NameServers" :content]))} (letvar148136 "Id") (clojure.core/assoc :id (deser-resource-id (clojure.core/get-in letvar148136 ["Id" :content]))) (letvar148136 "CallerReference") (clojure.core/assoc :caller-reference (deser-nonce (clojure.core/get-in letvar148136 ["CallerReference" :content]))))))

(clojure.core/defn- deser-resource-record-set-multi-value-answer [input] (clojure.core/when-let [boolstr__23442__auto__ (if (clojure.core/seq? input) (clojure.core/first input) input)] (clojure.core/cond (clojure.core/= "true" boolstr__23442__auto__) true (clojure.core/= "false" boolstr__23442__auto__) false)))

(clojure.core/defn- deser-port [input] (java.lang.Integer. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-namespace [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-message [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-resource-record-set-identifier [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-resource-record-set-failover [input] (clojure.core/get {"PRIMARY" :primary, "SECONDARY" :secondary} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-geo-location-subdivision-code [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-ip-address [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-traffic-policy-instance-id [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-traffic-policy-summary [input] (clojure.core/let [letvar148271 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "Name" (portkey.aws/search-for-tag input "Name" :flattened? false :xmlAttribute? nil), "Type" (portkey.aws/search-for-tag input "Type" :flattened? false :xmlAttribute? nil), "LatestVersion" (portkey.aws/search-for-tag input "LatestVersion" :flattened? false :xmlAttribute? nil), "TrafficPolicyCount" (portkey.aws/search-for-tag input "TrafficPolicyCount" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deser-traffic-policy-id (clojure.core/get-in letvar148271 ["Id" :content])), :name (deser-traffic-policy-name (clojure.core/get-in letvar148271 ["Name" :content])), :type (deser-rr-type (clojure.core/get-in letvar148271 ["Type" :content])), :latest-version (deser-traffic-policy-version (clojure.core/get-in letvar148271 ["LatestVersion" :content])), :traffic-policy-count (deser-traffic-policy-version (clojure.core/get-in letvar148271 ["TrafficPolicyCount" :content]))})))

(clojure.core/defn- deser-traffic-policy-instance [input] (clojure.core/let [letvar148367 {"TrafficPolicyVersion" (portkey.aws/search-for-tag input "TrafficPolicyVersion" :flattened? false :xmlAttribute? nil), "TTL" (portkey.aws/search-for-tag input "TTL" :flattened? false :xmlAttribute? nil), "TrafficPolicyType" (portkey.aws/search-for-tag input "TrafficPolicyType" :flattened? false :xmlAttribute? nil), "HostedZoneId" (portkey.aws/search-for-tag input "HostedZoneId" :flattened? false :xmlAttribute? nil), "TrafficPolicyId" (portkey.aws/search-for-tag input "TrafficPolicyId" :flattened? false :xmlAttribute? nil), "Message" (portkey.aws/search-for-tag input "Message" :flattened? false :xmlAttribute? nil), "State" (portkey.aws/search-for-tag input "State" :flattened? false :xmlAttribute? nil), "Name" (portkey.aws/search-for-tag input "Name" :flattened? false :xmlAttribute? nil), "Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:name (deser-dns-name (clojure.core/get-in letvar148367 ["Name" :content])), :traffic-policy-version (deser-traffic-policy-version (clojure.core/get-in letvar148367 ["TrafficPolicyVersion" :content])), :traffic-policy-id (deser-traffic-policy-id (clojure.core/get-in letvar148367 ["TrafficPolicyId" :content])), :state (deser-traffic-policy-instance-state (clojure.core/get-in letvar148367 ["State" :content])), :traffic-policy-type (deser-rr-type (clojure.core/get-in letvar148367 ["TrafficPolicyType" :content])), :ttl (deser-ttl (clojure.core/get-in letvar148367 ["TTL" :content])), :id (deser-traffic-policy-instance-id (clojure.core/get-in letvar148367 ["Id" :content])), :message (deser-message (clojure.core/get-in letvar148367 ["Message" :content])), :hosted-zone-id (deser-resource-id (clojure.core/get-in letvar148367 ["HostedZoneId" :content]))})))

(clojure.core/defn- deser-geo-location-country-name [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-resource-record [input] (clojure.core/let [letvar148468 {"Value" (portkey.aws/search-for-tag input "Value" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:value (deser-r-data (clojure.core/get-in letvar148468 ["Value" :content]))})))

(clojure.core/defn- deser-alarm-name [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-usage-count [input] (java.lang.Long. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-hosted-zone-config [input] (clojure.core/let [letvar148571 {"Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil), "PrivateZone" (portkey.aws/search-for-tag input "PrivateZone" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar148571 "Comment") (clojure.core/assoc :comment (deser-resource-description (clojure.core/get-in letvar148571 ["Comment" :content]))) (letvar148571 "PrivateZone") (clojure.core/assoc :private-zone (deser-is-private-zone (clojure.core/get-in letvar148571 ["PrivateZone" :content]))))))

(clojure.core/defn- deser-hosted-zone-limit-type [input] (clojure.core/get {"MAX_RRSETS_BY_ZONE" :max-rrsets-by-zone, "MAX_VPCS_ASSOCIATED_BY_ZONE" :max-vpcs-associated-by-zone} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-resource-path [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-traffic-policies [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-traffic-policy coll))) input))

(clojure.core/defn- deser-geo-location-details-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-geo-location-details coll))) input))

(clojure.core/defn- deser-alarm-identifier [input] (clojure.core/let [letvar148711 {"Region" (portkey.aws/search-for-tag input "Region" :flattened? false :xmlAttribute? nil), "Name" (portkey.aws/search-for-tag input "Name" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:region (deser-cloud-watch-region (clojure.core/get-in letvar148711 ["Region" :content])), :name (deser-alarm-name (clojure.core/get-in letvar148711 ["Name" :content]))})))

(clojure.core/defn- deser-is-private-zone [input] (clojure.core/when-let [boolstr__23442__auto__ (if (clojure.core/seq? input) (clojure.core/first input) input)] (clojure.core/cond (clojure.core/= "true" boolstr__23442__auto__) true (clojure.core/= "false" boolstr__23442__auto__) false)))

(clojure.core/defn- deser-traffic-policy-comment [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-enable-sni [input] (clojure.core/when-let [boolstr__23442__auto__ (if (clojure.core/seq? input) (clojure.core/first input) input)] (clojure.core/cond (clojure.core/= "true" boolstr__23442__auto__) true (clojure.core/= "false" boolstr__23442__auto__) false)))

(clojure.core/defn- deser-health-check-type [input] (clojure.core/get {"HTTP" :http, "HTTPS" :https, "HTTP_STR_MATCH" :http-str-match, "HTTPS_STR_MATCH" :https-str-match, "TCP" :tcp, "CALCULATED" :calculated, "CLOUDWATCH_METRIC" :cloudwatch-metric} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-record-data [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-record-data-entry coll))) input))

(clojure.core/defn- deser-r-data [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-alias-health-enabled [input] (clojure.core/when-let [boolstr__23442__auto__ (if (clojure.core/seq? input) (clojure.core/first input) input)] (clojure.core/cond (clojure.core/= "true" boolstr__23442__auto__) true (clojure.core/= "false" boolstr__23442__auto__) false)))

(clojure.core/defn- deser-health-check-observations [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-health-check-observation coll))) input))

(clojure.core/defn- deser-tag [input] (clojure.core/let [letvar148862 {"Key" (portkey.aws/search-for-tag input "Key" :flattened? false :xmlAttribute? nil), "Value" (portkey.aws/search-for-tag input "Value" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar148862 "Key") (clojure.core/assoc :key (deser-tag-key (clojure.core/get-in letvar148862 ["Key" :content]))) (letvar148862 "Value") (clojure.core/assoc :value (deser-tag-value (clojure.core/get-in letvar148862 ["Value" :content]))))))

(clojure.core/defn- deser-page-marker [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-metric-name [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-nonce [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-measure-latency [input] (clojure.core/when-let [boolstr__23442__auto__ (if (clojure.core/seq? input) (clojure.core/first input) input)] (clojure.core/cond (clojure.core/= "true" boolstr__23442__auto__) true (clojure.core/= "false" boolstr__23442__auto__) false)))

(clojure.core/defn- deser-transport-protocol [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-hosted-zones [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-hosted-zone coll))) input))

(clojure.core/defn- deser-evaluation-periods [input] (java.lang.Integer. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-resource-record-sets [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-resource-record-set coll))) input))

(clojure.core/defn- deser-health-threshold [input] (java.lang.Integer. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-resource-record-set [input] (clojure.core/let [letvar149018 {"AliasTarget" (portkey.aws/search-for-tag input "AliasTarget" :flattened? false :xmlAttribute? nil), "Type" (portkey.aws/search-for-tag input "Type" :flattened? false :xmlAttribute? nil), "GeoLocation" (portkey.aws/search-for-tag input "GeoLocation" :flattened? false :xmlAttribute? nil), "TTL" (portkey.aws/search-for-tag input "TTL" :flattened? false :xmlAttribute? nil), "SetIdentifier" (portkey.aws/search-for-tag input "SetIdentifier" :flattened? false :xmlAttribute? nil), "Weight" (portkey.aws/search-for-tag input "Weight" :flattened? false :xmlAttribute? nil), "HealthCheckId" (portkey.aws/search-for-tag input "HealthCheckId" :flattened? false :xmlAttribute? nil), "MultiValueAnswer" (portkey.aws/search-for-tag input "MultiValueAnswer" :flattened? false :xmlAttribute? nil), "ResourceRecords" (portkey.aws/search-for-tag input "ResourceRecords" :flattened? false :xmlAttribute? nil), "Failover" (portkey.aws/search-for-tag input "Failover" :flattened? false :xmlAttribute? nil), "TrafficPolicyInstanceId" (portkey.aws/search-for-tag input "TrafficPolicyInstanceId" :flattened? false :xmlAttribute? nil), "Name" (portkey.aws/search-for-tag input "Name" :flattened? false :xmlAttribute? nil), "Region" (portkey.aws/search-for-tag input "Region" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:name (deser-dns-name (clojure.core/get-in letvar149018 ["Name" :content])), :type (deser-rr-type (clojure.core/get-in letvar149018 ["Type" :content]))} (letvar149018 "AliasTarget") (clojure.core/assoc :alias-target (deser-alias-target (clojure.core/get-in letvar149018 ["AliasTarget" :content]))) (letvar149018 "GeoLocation") (clojure.core/assoc :geo-location (deser-geo-location (clojure.core/get-in letvar149018 ["GeoLocation" :content]))) (letvar149018 "TTL") (clojure.core/assoc :ttl (deser-ttl (clojure.core/get-in letvar149018 ["TTL" :content]))) (letvar149018 "SetIdentifier") (clojure.core/assoc :set-identifier (deser-resource-record-set-identifier (clojure.core/get-in letvar149018 ["SetIdentifier" :content]))) (letvar149018 "Weight") (clojure.core/assoc :weight (deser-resource-record-set-weight (clojure.core/get-in letvar149018 ["Weight" :content]))) (letvar149018 "HealthCheckId") (clojure.core/assoc :health-check-id (deser-health-check-id (clojure.core/get-in letvar149018 ["HealthCheckId" :content]))) (letvar149018 "MultiValueAnswer") (clojure.core/assoc :multi-value-answer (deser-resource-record-set-multi-value-answer (clojure.core/get-in letvar149018 ["MultiValueAnswer" :content]))) (letvar149018 "ResourceRecords") (clojure.core/assoc :resource-records (deser-resource-records (clojure.core/get-in letvar149018 ["ResourceRecords" :content]))) (letvar149018 "Failover") (clojure.core/assoc :failover (deser-resource-record-set-failover (clojure.core/get-in letvar149018 ["Failover" :content]))) (letvar149018 "TrafficPolicyInstanceId") (clojure.core/assoc :traffic-policy-instance-id (deser-traffic-policy-instance-id (clojure.core/get-in letvar149018 ["TrafficPolicyInstanceId" :content]))) (letvar149018 "Region") (clojure.core/assoc :region (deser-resource-record-set-region (clojure.core/get-in letvar149018 ["Region" :content]))))))

(clojure.core/defn- deser-vpc-id [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-request-interval [input] (java.lang.Integer. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-time-stamp [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-cloud-watch-alarm-configuration [input] (clojure.core/let [letvar149123 {"EvaluationPeriods" (portkey.aws/search-for-tag input "EvaluationPeriods" :flattened? false :xmlAttribute? nil), "Threshold" (portkey.aws/search-for-tag input "Threshold" :flattened? false :xmlAttribute? nil), "ComparisonOperator" (portkey.aws/search-for-tag input "ComparisonOperator" :flattened? false :xmlAttribute? nil), "Period" (portkey.aws/search-for-tag input "Period" :flattened? false :xmlAttribute? nil), "MetricName" (portkey.aws/search-for-tag input "MetricName" :flattened? false :xmlAttribute? nil), "Namespace" (portkey.aws/search-for-tag input "Namespace" :flattened? false :xmlAttribute? nil), "Statistic" (portkey.aws/search-for-tag input "Statistic" :flattened? false :xmlAttribute? nil), "Dimensions" (portkey.aws/search-for-tag input "Dimensions" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:evaluation-periods (deser-evaluation-periods (clojure.core/get-in letvar149123 ["EvaluationPeriods" :content])), :threshold (deser-threshold (clojure.core/get-in letvar149123 ["Threshold" :content])), :comparison-operator (deser-comparison-operator (clojure.core/get-in letvar149123 ["ComparisonOperator" :content])), :period (deser-period (clojure.core/get-in letvar149123 ["Period" :content])), :metric-name (deser-metric-name (clojure.core/get-in letvar149123 ["MetricName" :content])), :namespace (deser-namespace (clojure.core/get-in letvar149123 ["Namespace" :content])), :statistic (deser-statistic (clojure.core/get-in letvar149123 ["Statistic" :content]))} (letvar149123 "Dimensions") (clojure.core/assoc :dimensions (deser-dimension-list (clojure.core/get-in letvar149123 ["Dimensions" :content]))))))

(clojure.core/defn- deser-fully-qualified-domain-name [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-statistic [input] (clojure.core/get {"Average" :average, "Sum" :sum, "SampleCount" :sample-count, "Maximum" :maximum, "Minimum" :minimum} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-status-report [input] (clojure.core/let [letvar149229 {"Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil), "CheckedTime" (portkey.aws/search-for-tag input "CheckedTime" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar149229 "Status") (clojure.core/assoc :status (deser-status (clojure.core/get-in letvar149229 ["Status" :content]))) (letvar149229 "CheckedTime") (clojure.core/assoc :checked-time (deser-time-stamp (clojure.core/get-in letvar149229 ["CheckedTime" :content]))))))

(clojure.core/defn- deser-vpc [input] (clojure.core/let [letvar149325 {"VPCRegion" (portkey.aws/search-for-tag input "VPCRegion" :flattened? false :xmlAttribute? nil), "VPCId" (portkey.aws/search-for-tag input "VPCId" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar149325 "VPCRegion") (clojure.core/assoc :vpc-region (deser-vpc-region (clojure.core/get-in letvar149325 ["VPCRegion" :content]))) (letvar149325 "VPCId") (clojure.core/assoc :vpc-id (deser-vpc-id (clojure.core/get-in letvar149325 ["VPCId" :content]))))))

(clojure.core/defn- deser-limit-value [input] (java.lang.Long. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-page-max-items [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-inverted [input] (clojure.core/when-let [boolstr__23442__auto__ (if (clojure.core/seq? input) (clojure.core/first input) input)] (clojure.core/cond (clojure.core/= "true" boolstr__23442__auto__) true (clojure.core/= "false" boolstr__23442__auto__) false)))

(clojure.core/defn- deser-cloud-watch-region [input] (clojure.core/get {"ap-northeast-1" :apnortheast-1, "eu-west-1" :euwest-1, "ap-northeast-3" :apnortheast-3, "us-east-2" :useast-2, "ap-southeast-2" :apsoutheast-2, "sa-east-1" :saeast-1, "ap-southeast-1" :apsoutheast-1, "ap-northeast-2" :apnortheast-2, "eu-west-3" :euwest-3, "ca-central-1" :cacentral-1, "eu-central-1" :eucentral-1, "eu-west-2" :euwest-2, "us-west-2" :uswest-2, "us-east-1" :useast-1, "us-west-1" :uswest-1, "ap-south-1" :apsouth-1} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- response-get-hosted-zone-limit-response [input] (clojure.core/let [rawinput149340 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149341 {"Limit" (portkey.aws/search-for-tag rawinput149340 "Limit" :flattened? false), "Count" (portkey.aws/search-for-tag rawinput149340 "Count" :flattened? false)}] (clojure.core/cond-> {:limit (deser-hosted-zone-limit (clojure.core/get-in letvar149341 ["Limit" :content])), :count (deser-usage-count (clojure.core/get-in letvar149341 ["Count" :content]))})))

(clojure.core/defn- response-invalid-pagination-token [input] (clojure.core/let [rawinput149342 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149343 {"message" (portkey.aws/search-for-tag rawinput149342 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar149343 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar149343 ["message" :content]))))))

(clojure.core/defn- response-delete-reusable-delegation-set-response [input] (clojure.core/let [rawinput149344 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149345 {}] (clojure.core/cond-> {})))

(clojure.core/defn- response-get-health-check-last-failure-reason-response [input] (clojure.core/let [rawinput149346 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149347 {"HealthCheckObservations" (portkey.aws/search-for-tag rawinput149346 "HealthCheckObservations" :flattened? false)}] (clojure.core/cond-> {:health-check-observations (deser-health-check-observations (clojure.core/get-in letvar149347 ["HealthCheckObservations" :content]))})))

(clojure.core/defn- response-last-vpc-association [input] (clojure.core/let [rawinput149348 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149349 {"message" (portkey.aws/search-for-tag rawinput149348 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar149349 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar149349 ["message" :content]))))))

(clojure.core/defn- response-query-logging-config-already-exists [input] (clojure.core/let [rawinput149350 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149351 {"message" (portkey.aws/search-for-tag rawinput149350 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar149351 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar149351 ["message" :content]))))))

(clojure.core/defn- response-too-many-health-checks [input] (clojure.core/let [rawinput149352 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149353 {"message" (portkey.aws/search-for-tag rawinput149352 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar149353 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar149353 ["message" :content]))))))

(clojure.core/defn- response-list-hosted-zones-by-name-response [input] (clojure.core/let [rawinput149354 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149355 {"HostedZones" (portkey.aws/search-for-tag rawinput149354 "HostedZones" :flattened? false), "DNSName" (portkey.aws/search-for-tag rawinput149354 "DNSName" :flattened? false), "HostedZoneId" (portkey.aws/search-for-tag rawinput149354 "HostedZoneId" :flattened? false), "IsTruncated" (portkey.aws/search-for-tag rawinput149354 "IsTruncated" :flattened? false), "NextDNSName" (portkey.aws/search-for-tag rawinput149354 "NextDNSName" :flattened? false), "NextHostedZoneId" (portkey.aws/search-for-tag rawinput149354 "NextHostedZoneId" :flattened? false), "MaxItems" (portkey.aws/search-for-tag rawinput149354 "MaxItems" :flattened? false)}] (clojure.core/cond-> {:hosted-zones (deser-hosted-zones (clojure.core/get-in letvar149355 ["HostedZones" :content])), :is-truncated (deser-page-truncated (clojure.core/get-in letvar149355 ["IsTruncated" :content])), :max-items (deser-page-max-items (clojure.core/get-in letvar149355 ["MaxItems" :content]))} (letvar149355 "DNSName") (clojure.core/assoc :dns-name (deser-dns-name (clojure.core/get-in letvar149355 ["DNSName" :content]))) (letvar149355 "HostedZoneId") (clojure.core/assoc :hosted-zone-id (deser-resource-id (clojure.core/get-in letvar149355 ["HostedZoneId" :content]))) (letvar149355 "NextDNSName") (clojure.core/assoc :next-dns-name (deser-dns-name (clojure.core/get-in letvar149355 ["NextDNSName" :content]))) (letvar149355 "NextHostedZoneId") (clojure.core/assoc :next-hosted-zone-id (deser-resource-id (clojure.core/get-in letvar149355 ["NextHostedZoneId" :content]))))))

(clojure.core/defn- response-list-health-checks-response [input] (clojure.core/let [rawinput149356 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149357 {"HealthChecks" (portkey.aws/search-for-tag rawinput149356 "HealthChecks" :flattened? false), "Marker" (portkey.aws/search-for-tag rawinput149356 "Marker" :flattened? false), "IsTruncated" (portkey.aws/search-for-tag rawinput149356 "IsTruncated" :flattened? false), "NextMarker" (portkey.aws/search-for-tag rawinput149356 "NextMarker" :flattened? false), "MaxItems" (portkey.aws/search-for-tag rawinput149356 "MaxItems" :flattened? false)}] (clojure.core/cond-> {:health-checks (deser-health-checks (clojure.core/get-in letvar149357 ["HealthChecks" :content])), :marker (deser-page-marker (clojure.core/get-in letvar149357 ["Marker" :content])), :is-truncated (deser-page-truncated (clojure.core/get-in letvar149357 ["IsTruncated" :content])), :max-items (deser-page-max-items (clojure.core/get-in letvar149357 ["MaxItems" :content]))} (letvar149357 "NextMarker") (clojure.core/assoc :next-marker (deser-page-marker (clojure.core/get-in letvar149357 ["NextMarker" :content]))))))

(clojure.core/defn- response-invalid-argument [input] (clojure.core/let [rawinput149358 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149359 {"message" (portkey.aws/search-for-tag rawinput149358 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar149359 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar149359 ["message" :content]))))))

(clojure.core/defn- response-incompatible-version [input] (clojure.core/let [rawinput149360 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149361 {"message" (portkey.aws/search-for-tag rawinput149360 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar149361 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar149361 ["message" :content]))))))

(clojure.core/defn- response-list-tags-for-resource-response [input] (clojure.core/let [rawinput149362 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149363 {"ResourceTagSet" (portkey.aws/search-for-tag rawinput149362 "ResourceTagSet" :flattened? false)}] (clojure.core/cond-> {:resource-tag-set (deser-resource-tag-set (clojure.core/get-in letvar149363 ["ResourceTagSet" :content]))})))

(clojure.core/defn- response-get-hosted-zone-response [input] (clojure.core/let [rawinput149364 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149365 {"HostedZone" (portkey.aws/search-for-tag rawinput149364 "HostedZone" :flattened? false), "DelegationSet" (portkey.aws/search-for-tag rawinput149364 "DelegationSet" :flattened? false), "VPCs" (portkey.aws/search-for-tag rawinput149364 "VPCs" :flattened? false)}] (clojure.core/cond-> {:hosted-zone (deser-hosted-zone (clojure.core/get-in letvar149365 ["HostedZone" :content]))} (letvar149365 "DelegationSet") (clojure.core/assoc :delegation-set (deser-delegation-set (clojure.core/get-in letvar149365 ["DelegationSet" :content]))) (letvar149365 "VPCs") (clojure.core/assoc :vp-cs (deser-vp-cs (clojure.core/get-in letvar149365 ["VPCs" :content]))))))

(clojure.core/defn- response-list-traffic-policy-versions-response [input] (clojure.core/let [rawinput149366 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149367 {"TrafficPolicies" (portkey.aws/search-for-tag rawinput149366 "TrafficPolicies" :flattened? false), "IsTruncated" (portkey.aws/search-for-tag rawinput149366 "IsTruncated" :flattened? false), "TrafficPolicyVersionMarker" (portkey.aws/search-for-tag rawinput149366 "TrafficPolicyVersionMarker" :flattened? false), "MaxItems" (portkey.aws/search-for-tag rawinput149366 "MaxItems" :flattened? false)}] (clojure.core/cond-> {:traffic-policies (deser-traffic-policies (clojure.core/get-in letvar149367 ["TrafficPolicies" :content])), :is-truncated (deser-page-truncated (clojure.core/get-in letvar149367 ["IsTruncated" :content])), :traffic-policy-version-marker (deser-traffic-policy-version-marker (clojure.core/get-in letvar149367 ["TrafficPolicyVersionMarker" :content])), :max-items (deser-page-max-items (clojure.core/get-in letvar149367 ["MaxItems" :content]))})))

(clojure.core/defn- response-hosted-zone-not-private [input] (clojure.core/let [rawinput149368 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149369 {"message" (portkey.aws/search-for-tag rawinput149368 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar149369 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar149369 ["message" :content]))))))

(clojure.core/defn- response-get-health-check-status-response [input] (clojure.core/let [rawinput149370 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149371 {"HealthCheckObservations" (portkey.aws/search-for-tag rawinput149370 "HealthCheckObservations" :flattened? false)}] (clojure.core/cond-> {:health-check-observations (deser-health-check-observations (clojure.core/get-in letvar149371 ["HealthCheckObservations" :content]))})))

(clojure.core/defn- response-list-vpc-association-authorizations-response [input] (clojure.core/let [rawinput149372 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149373 {"HostedZoneId" (portkey.aws/search-for-tag rawinput149372 "HostedZoneId" :flattened? false), "NextToken" (portkey.aws/search-for-tag rawinput149372 "NextToken" :flattened? false), "VPCs" (portkey.aws/search-for-tag rawinput149372 "VPCs" :flattened? false)}] (clojure.core/cond-> {:hosted-zone-id (deser-resource-id (clojure.core/get-in letvar149373 ["HostedZoneId" :content])), :vp-cs (deser-vp-cs (clojure.core/get-in letvar149373 ["VPCs" :content]))} (letvar149373 "NextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar149373 ["NextToken" :content]))))))

(clojure.core/defn- response-no-such-geo-location [input] (clojure.core/let [rawinput149374 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149375 {"message" (portkey.aws/search-for-tag rawinput149374 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar149375 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar149375 ["message" :content]))))))

(clojure.core/defn- response-limits-exceeded [input] (clojure.core/let [rawinput149376 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149377 {"message" (portkey.aws/search-for-tag rawinput149376 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar149377 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar149377 ["message" :content]))))))

(clojure.core/defn- response-public-zone-vpc-association [input] (clojure.core/let [rawinput149378 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149379 {"message" (portkey.aws/search-for-tag rawinput149378 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar149379 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar149379 ["message" :content]))))))

(clojure.core/defn- response-prior-request-not-complete [input] (clojure.core/let [rawinput149380 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149381 {"message" (portkey.aws/search-for-tag rawinput149380 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar149381 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar149381 ["message" :content]))))))

(clojure.core/defn- response-create-traffic-policy-response [input] (clojure.core/let [rawinput149382 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149383 {"TrafficPolicy" (portkey.aws/search-for-tag rawinput149382 "TrafficPolicy" :flattened? false), "Location" (clojure.core/get-in input [:headers "Location"])}] (clojure.core/cond-> {:traffic-policy (deser-traffic-policy (clojure.core/get-in letvar149383 ["TrafficPolicy" :content])), :location (deser-resource-uri (clojure.core/get-in letvar149383 ["Location"]))})))

(clojure.core/defn- response-too-many-vpc-association-authorizations [input] (clojure.core/let [rawinput149384 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149385 {"message" (portkey.aws/search-for-tag rawinput149384 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar149385 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar149385 ["message" :content]))))))

(clojure.core/defn- response-create-traffic-policy-version-response [input] (clojure.core/let [rawinput149386 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149387 {"TrafficPolicy" (portkey.aws/search-for-tag rawinput149386 "TrafficPolicy" :flattened? false), "Location" (clojure.core/get-in input [:headers "Location"])}] (clojure.core/cond-> {:traffic-policy (deser-traffic-policy (clojure.core/get-in letvar149387 ["TrafficPolicy" :content])), :location (deser-resource-uri (clojure.core/get-in letvar149387 ["Location"]))})))

(clojure.core/defn- response-delete-hosted-zone-response [input] (clojure.core/let [rawinput149388 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149389 {"ChangeInfo" (portkey.aws/search-for-tag rawinput149388 "ChangeInfo" :flattened? false)}] (clojure.core/cond-> {:change-info (deser-change-info (clojure.core/get-in letvar149389 ["ChangeInfo" :content]))})))

(clojure.core/defn- response-test-dns-answer-response [input] (clojure.core/let [rawinput149390 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149391 {"Nameserver" (portkey.aws/search-for-tag rawinput149390 "Nameserver" :flattened? false), "RecordName" (portkey.aws/search-for-tag rawinput149390 "RecordName" :flattened? false), "RecordType" (portkey.aws/search-for-tag rawinput149390 "RecordType" :flattened? false), "RecordData" (portkey.aws/search-for-tag rawinput149390 "RecordData" :flattened? false), "ResponseCode" (portkey.aws/search-for-tag rawinput149390 "ResponseCode" :flattened? false), "Protocol" (portkey.aws/search-for-tag rawinput149390 "Protocol" :flattened? false)}] (clojure.core/cond-> {:nameserver (deser-nameserver (clojure.core/get-in letvar149391 ["Nameserver" :content])), :record-name (deser-dns-name (clojure.core/get-in letvar149391 ["RecordName" :content])), :record-type (deser-rr-type (clojure.core/get-in letvar149391 ["RecordType" :content])), :record-data (deser-record-data (clojure.core/get-in letvar149391 ["RecordData" :content])), :response-code (deser-dnsr-code (clojure.core/get-in letvar149391 ["ResponseCode" :content])), :protocol (deser-transport-protocol (clojure.core/get-in letvar149391 ["Protocol" :content]))})))

(clojure.core/defn- response-delete-query-logging-config-response [input] (clojure.core/let [rawinput149392 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149393 {}] (clojure.core/cond-> {})))

(clojure.core/defn- response-get-checker-ip-ranges-response [input] (clojure.core/let [rawinput149394 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149395 {"CheckerIpRanges" (portkey.aws/search-for-tag rawinput149394 "CheckerIpRanges" :flattened? false)}] (clojure.core/cond-> {:checker-ip-ranges (deser-checker-ip-ranges (clojure.core/get-in letvar149395 ["CheckerIpRanges" :content]))})))

(clojure.core/defn- response-create-vpc-association-authorization-response [input] (clojure.core/let [rawinput149396 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149397 {"HostedZoneId" (portkey.aws/search-for-tag rawinput149396 "HostedZoneId" :flattened? false), "VPC" (portkey.aws/search-for-tag rawinput149396 "VPC" :flattened? false)}] (clojure.core/cond-> {:hosted-zone-id (deser-resource-id (clojure.core/get-in letvar149397 ["HostedZoneId" :content])), :vpc (deser-vpc (clojure.core/get-in letvar149397 ["VPC" :content]))})))

(clojure.core/defn- response-delegation-set-not-reusable [input] (clojure.core/let [rawinput149398 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149399 {"message" (portkey.aws/search-for-tag rawinput149398 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar149399 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar149399 ["message" :content]))))))

(clojure.core/defn- response-insufficient-cloud-watch-logs-resource-policy [input] (clojure.core/let [rawinput149400 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149401 {"message" (portkey.aws/search-for-tag rawinput149400 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar149401 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar149401 ["message" :content]))))))

(clojure.core/defn- response-too-many-traffic-policy-instances [input] (clojure.core/let [rawinput149402 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149403 {"message" (portkey.aws/search-for-tag rawinput149402 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar149403 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar149403 ["message" :content]))))))

(clojure.core/defn- response-no-such-health-check [input] (clojure.core/let [rawinput149404 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149405 {"message" (portkey.aws/search-for-tag rawinput149404 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar149405 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar149405 ["message" :content]))))))

(clojure.core/defn- response-no-such-traffic-policy [input] (clojure.core/let [rawinput149406 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149407 {"message" (portkey.aws/search-for-tag rawinput149406 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar149407 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar149407 ["message" :content]))))))

(clojure.core/defn- response-associate-vpc-with-hosted-zone-response [input] (clojure.core/let [rawinput149408 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149409 {"ChangeInfo" (portkey.aws/search-for-tag rawinput149408 "ChangeInfo" :flattened? false)}] (clojure.core/cond-> {:change-info (deser-change-info (clojure.core/get-in letvar149409 ["ChangeInfo" :content]))})))

(clojure.core/defn- response-create-traffic-policy-instance-response [input] (clojure.core/let [rawinput149410 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149411 {"TrafficPolicyInstance" (portkey.aws/search-for-tag rawinput149410 "TrafficPolicyInstance" :flattened? false), "Location" (clojure.core/get-in input [:headers "Location"])}] (clojure.core/cond-> {:traffic-policy-instance (deser-traffic-policy-instance (clojure.core/get-in letvar149411 ["TrafficPolicyInstance" :content])), :location (deser-resource-uri (clojure.core/get-in letvar149411 ["Location"]))})))

(clojure.core/defn- response-not-authorized-exception [input] (clojure.core/let [rawinput149412 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149413 {"message" (portkey.aws/search-for-tag rawinput149412 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar149413 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar149413 ["message" :content]))))))

(clojure.core/defn- response-get-query-logging-config-response [input] (clojure.core/let [rawinput149414 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149415 {"QueryLoggingConfig" (portkey.aws/search-for-tag rawinput149414 "QueryLoggingConfig" :flattened? false)}] (clojure.core/cond-> {:query-logging-config (deser-query-logging-config (clojure.core/get-in letvar149415 ["QueryLoggingConfig" :content]))})))

(clojure.core/defn- response-invalid-domain-name [input] (clojure.core/let [rawinput149416 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149417 {"message" (portkey.aws/search-for-tag rawinput149416 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar149417 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar149417 ["message" :content]))))))

(clojure.core/defn- response-list-reusable-delegation-sets-response [input] (clojure.core/let [rawinput149418 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149419 {"DelegationSets" (portkey.aws/search-for-tag rawinput149418 "DelegationSets" :flattened? false), "Marker" (portkey.aws/search-for-tag rawinput149418 "Marker" :flattened? false), "IsTruncated" (portkey.aws/search-for-tag rawinput149418 "IsTruncated" :flattened? false), "NextMarker" (portkey.aws/search-for-tag rawinput149418 "NextMarker" :flattened? false), "MaxItems" (portkey.aws/search-for-tag rawinput149418 "MaxItems" :flattened? false)}] (clojure.core/cond-> {:delegation-sets (deser-delegation-sets (clojure.core/get-in letvar149419 ["DelegationSets" :content])), :marker (deser-page-marker (clojure.core/get-in letvar149419 ["Marker" :content])), :is-truncated (deser-page-truncated (clojure.core/get-in letvar149419 ["IsTruncated" :content])), :max-items (deser-page-max-items (clojure.core/get-in letvar149419 ["MaxItems" :content]))} (letvar149419 "NextMarker") (clojure.core/assoc :next-marker (deser-page-marker (clojure.core/get-in letvar149419 ["NextMarker" :content]))))))

(clojure.core/defn- response-no-such-change [input] (clojure.core/let [rawinput149420 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149421 {"message" (portkey.aws/search-for-tag rawinput149420 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar149421 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar149421 ["message" :content]))))))

(clojure.core/defn- response-invalid-change-batch [input] (clojure.core/let [rawinput149422 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149423 {"messages" (portkey.aws/search-for-tag rawinput149422 "messages" :flattened? false), "message" (portkey.aws/search-for-tag rawinput149422 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar149423 "messages") (clojure.core/assoc :messages (deser-error-messages (clojure.core/get-in letvar149423 ["messages" :content]))) (letvar149423 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar149423 ["message" :content]))))))

(clojure.core/defn- response-invalid-input [input] (clojure.core/let [rawinput149424 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149425 {"message" (portkey.aws/search-for-tag rawinput149424 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar149425 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar149425 ["message" :content]))))))

(clojure.core/defn- response-get-reusable-delegation-set-response [input] (clojure.core/let [rawinput149426 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149427 {"DelegationSet" (portkey.aws/search-for-tag rawinput149426 "DelegationSet" :flattened? false)}] (clojure.core/cond-> {:delegation-set (deser-delegation-set (clojure.core/get-in letvar149427 ["DelegationSet" :content]))})))

(clojure.core/defn- response-get-traffic-policy-instance-response [input] (clojure.core/let [rawinput149428 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149429 {"TrafficPolicyInstance" (portkey.aws/search-for-tag rawinput149428 "TrafficPolicyInstance" :flattened? false)}] (clojure.core/cond-> {:traffic-policy-instance (deser-traffic-policy-instance (clojure.core/get-in letvar149429 ["TrafficPolicyInstance" :content]))})))

(clojure.core/defn- response-hosted-zone-not-found [input] (clojure.core/let [rawinput149430 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149431 {"message" (portkey.aws/search-for-tag rawinput149430 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar149431 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar149431 ["message" :content]))))))

(clojure.core/defn- response-invalid-vpc-id [input] (clojure.core/let [rawinput149432 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149433 {"message" (portkey.aws/search-for-tag rawinput149432 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar149433 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar149433 ["message" :content]))))))

(clojure.core/defn- response-no-such-delegation-set [input] (clojure.core/let [rawinput149434 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149435 {"message" (portkey.aws/search-for-tag rawinput149434 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar149435 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar149435 ["message" :content]))))))

(clojure.core/defn- response-too-many-traffic-policy-versions-for-current-policy [input] (clojure.core/let [rawinput149436 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149437 {"message" (portkey.aws/search-for-tag rawinput149436 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar149437 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar149437 ["message" :content]))))))

(clojure.core/defn- response-get-traffic-policy-response [input] (clojure.core/let [rawinput149438 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149439 {"TrafficPolicy" (portkey.aws/search-for-tag rawinput149438 "TrafficPolicy" :flattened? false)}] (clojure.core/cond-> {:traffic-policy (deser-traffic-policy (clojure.core/get-in letvar149439 ["TrafficPolicy" :content]))})))

(clojure.core/defn- response-update-traffic-policy-comment-response [input] (clojure.core/let [rawinput149440 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149441 {"TrafficPolicy" (portkey.aws/search-for-tag rawinput149440 "TrafficPolicy" :flattened? false)}] (clojure.core/cond-> {:traffic-policy (deser-traffic-policy (clojure.core/get-in letvar149441 ["TrafficPolicy" :content]))})))

(clojure.core/defn- response-disassociate-vpc-from-hosted-zone-response [input] (clojure.core/let [rawinput149442 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149443 {"ChangeInfo" (portkey.aws/search-for-tag rawinput149442 "ChangeInfo" :flattened? false)}] (clojure.core/cond-> {:change-info (deser-change-info (clojure.core/get-in letvar149443 ["ChangeInfo" :content]))})))

(clojure.core/defn- response-conflicting-domain-exists [input] (clojure.core/let [rawinput149444 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149445 {"message" (portkey.aws/search-for-tag rawinput149444 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar149445 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar149445 ["message" :content]))))))

(clojure.core/defn- response-concurrent-modification [input] (clojure.core/let [rawinput149446 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149447 {"message" (portkey.aws/search-for-tag rawinput149446 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar149447 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar149447 ["message" :content]))))))

(clojure.core/defn- response-delegation-set-in-use [input] (clojure.core/let [rawinput149448 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149449 {"message" (portkey.aws/search-for-tag rawinput149448 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar149449 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar149449 ["message" :content]))))))

(clojure.core/defn- response-list-query-logging-configs-response [input] (clojure.core/let [rawinput149450 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149451 {"QueryLoggingConfigs" (portkey.aws/search-for-tag rawinput149450 "QueryLoggingConfigs" :flattened? false), "NextToken" (portkey.aws/search-for-tag rawinput149450 "NextToken" :flattened? false)}] (clojure.core/cond-> {:query-logging-configs (deser-query-logging-configs (clojure.core/get-in letvar149451 ["QueryLoggingConfigs" :content]))} (letvar149451 "NextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar149451 ["NextToken" :content]))))))

(clojure.core/defn- response-list-hosted-zones-response [input] (clojure.core/let [rawinput149452 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149453 {"HostedZones" (portkey.aws/search-for-tag rawinput149452 "HostedZones" :flattened? false), "Marker" (portkey.aws/search-for-tag rawinput149452 "Marker" :flattened? false), "IsTruncated" (portkey.aws/search-for-tag rawinput149452 "IsTruncated" :flattened? false), "NextMarker" (portkey.aws/search-for-tag rawinput149452 "NextMarker" :flattened? false), "MaxItems" (portkey.aws/search-for-tag rawinput149452 "MaxItems" :flattened? false)}] (clojure.core/cond-> {:hosted-zones (deser-hosted-zones (clojure.core/get-in letvar149453 ["HostedZones" :content])), :marker (deser-page-marker (clojure.core/get-in letvar149453 ["Marker" :content])), :is-truncated (deser-page-truncated (clojure.core/get-in letvar149453 ["IsTruncated" :content])), :max-items (deser-page-max-items (clojure.core/get-in letvar149453 ["MaxItems" :content]))} (letvar149453 "NextMarker") (clojure.core/assoc :next-marker (deser-page-marker (clojure.core/get-in letvar149453 ["NextMarker" :content]))))))

(clojure.core/defn- response-create-hosted-zone-response [input] (clojure.core/let [rawinput149454 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149455 {"HostedZone" (portkey.aws/search-for-tag rawinput149454 "HostedZone" :flattened? false), "ChangeInfo" (portkey.aws/search-for-tag rawinput149454 "ChangeInfo" :flattened? false), "DelegationSet" (portkey.aws/search-for-tag rawinput149454 "DelegationSet" :flattened? false), "VPC" (portkey.aws/search-for-tag rawinput149454 "VPC" :flattened? false), "Location" (clojure.core/get-in input [:headers "Location"])}] (clojure.core/cond-> {:hosted-zone (deser-hosted-zone (clojure.core/get-in letvar149455 ["HostedZone" :content])), :change-info (deser-change-info (clojure.core/get-in letvar149455 ["ChangeInfo" :content])), :delegation-set (deser-delegation-set (clojure.core/get-in letvar149455 ["DelegationSet" :content])), :location (deser-resource-uri (clojure.core/get-in letvar149455 ["Location"]))} (letvar149455 "VPC") (clojure.core/assoc :vpc (deser-vpc (clojure.core/get-in letvar149455 ["VPC" :content]))))))

(clojure.core/defn- response-health-check-in-use [input] (clojure.core/let [rawinput149456 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149457 {"message" (portkey.aws/search-for-tag rawinput149456 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar149457 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar149457 ["message" :content]))))))

(clojure.core/defn- response-delete-health-check-response [input] (clojure.core/let [rawinput149458 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149459 {}] (clojure.core/cond-> {})))

(clojure.core/defn- response-update-traffic-policy-instance-response [input] (clojure.core/let [rawinput149460 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149461 {"TrafficPolicyInstance" (portkey.aws/search-for-tag rawinput149460 "TrafficPolicyInstance" :flattened? false)}] (clojure.core/cond-> {:traffic-policy-instance (deser-traffic-policy-instance (clojure.core/get-in letvar149461 ["TrafficPolicyInstance" :content]))})))

(clojure.core/defn- response-too-many-traffic-policies [input] (clojure.core/let [rawinput149462 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149463 {"message" (portkey.aws/search-for-tag rawinput149462 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar149463 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar149463 ["message" :content]))))))

(clojure.core/defn- response-create-query-logging-config-response [input] (clojure.core/let [rawinput149464 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149465 {"QueryLoggingConfig" (portkey.aws/search-for-tag rawinput149464 "QueryLoggingConfig" :flattened? false), "Location" (clojure.core/get-in input [:headers "Location"])}] (clojure.core/cond-> {:query-logging-config (deser-query-logging-config (clojure.core/get-in letvar149465 ["QueryLoggingConfig" :content])), :location (deser-resource-uri (clojure.core/get-in letvar149465 ["Location"]))})))

(clojure.core/defn- response-traffic-policy-instance-already-exists [input] (clojure.core/let [rawinput149466 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149467 {"message" (portkey.aws/search-for-tag rawinput149466 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar149467 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar149467 ["message" :content]))))))

(clojure.core/defn- response-hosted-zone-already-exists [input] (clojure.core/let [rawinput149468 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149469 {"message" (portkey.aws/search-for-tag rawinput149468 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar149469 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar149469 ["message" :content]))))))

(clojure.core/defn- response-create-reusable-delegation-set-response [input] (clojure.core/let [rawinput149470 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149471 {"DelegationSet" (portkey.aws/search-for-tag rawinput149470 "DelegationSet" :flattened? false), "Location" (clojure.core/get-in input [:headers "Location"])}] (clojure.core/cond-> {:delegation-set (deser-delegation-set (clojure.core/get-in letvar149471 ["DelegationSet" :content])), :location (deser-resource-uri (clojure.core/get-in letvar149471 ["Location"]))})))

(clojure.core/defn- response-list-resource-record-sets-response [input] (clojure.core/let [rawinput149472 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149473 {"ResourceRecordSets" (portkey.aws/search-for-tag rawinput149472 "ResourceRecordSets" :flattened? false), "IsTruncated" (portkey.aws/search-for-tag rawinput149472 "IsTruncated" :flattened? false), "NextRecordName" (portkey.aws/search-for-tag rawinput149472 "NextRecordName" :flattened? false), "NextRecordType" (portkey.aws/search-for-tag rawinput149472 "NextRecordType" :flattened? false), "NextRecordIdentifier" (portkey.aws/search-for-tag rawinput149472 "NextRecordIdentifier" :flattened? false), "MaxItems" (portkey.aws/search-for-tag rawinput149472 "MaxItems" :flattened? false)}] (clojure.core/cond-> {:resource-record-sets (deser-resource-record-sets (clojure.core/get-in letvar149473 ["ResourceRecordSets" :content])), :is-truncated (deser-page-truncated (clojure.core/get-in letvar149473 ["IsTruncated" :content])), :max-items (deser-page-max-items (clojure.core/get-in letvar149473 ["MaxItems" :content]))} (letvar149473 "NextRecordName") (clojure.core/assoc :next-record-name (deser-dns-name (clojure.core/get-in letvar149473 ["NextRecordName" :content]))) (letvar149473 "NextRecordType") (clojure.core/assoc :next-record-type (deser-rr-type (clojure.core/get-in letvar149473 ["NextRecordType" :content]))) (letvar149473 "NextRecordIdentifier") (clojure.core/assoc :next-record-identifier (deser-resource-record-set-identifier (clojure.core/get-in letvar149473 ["NextRecordIdentifier" :content]))))))

(clojure.core/defn- response-invalid-traffic-policy-document [input] (clojure.core/let [rawinput149474 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149475 {"message" (portkey.aws/search-for-tag rawinput149474 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar149475 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar149475 ["message" :content]))))))

(clojure.core/defn- response-get-health-check-response [input] (clojure.core/let [rawinput149476 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149477 {"HealthCheck" (portkey.aws/search-for-tag rawinput149476 "HealthCheck" :flattened? false)}] (clojure.core/cond-> {:health-check (deser-health-check (clojure.core/get-in letvar149477 ["HealthCheck" :content]))})))

(clojure.core/defn- response-get-traffic-policy-instance-count-response [input] (clojure.core/let [rawinput149478 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149479 {"TrafficPolicyInstanceCount" (portkey.aws/search-for-tag rawinput149478 "TrafficPolicyInstanceCount" :flattened? false)}] (clojure.core/cond-> {:traffic-policy-instance-count (deser-traffic-policy-instance-count (clojure.core/get-in letvar149479 ["TrafficPolicyInstanceCount" :content]))})))

(clojure.core/defn- response-no-such-hosted-zone [input] (clojure.core/let [rawinput149480 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149481 {"message" (portkey.aws/search-for-tag rawinput149480 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar149481 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar149481 ["message" :content]))))))

(clojure.core/defn- response-list-geo-locations-response [input] (clojure.core/let [rawinput149482 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149483 {"GeoLocationDetailsList" (portkey.aws/search-for-tag rawinput149482 "GeoLocationDetailsList" :flattened? false), "IsTruncated" (portkey.aws/search-for-tag rawinput149482 "IsTruncated" :flattened? false), "NextContinentCode" (portkey.aws/search-for-tag rawinput149482 "NextContinentCode" :flattened? false), "NextCountryCode" (portkey.aws/search-for-tag rawinput149482 "NextCountryCode" :flattened? false), "NextSubdivisionCode" (portkey.aws/search-for-tag rawinput149482 "NextSubdivisionCode" :flattened? false), "MaxItems" (portkey.aws/search-for-tag rawinput149482 "MaxItems" :flattened? false)}] (clojure.core/cond-> {:geo-location-details-list (deser-geo-location-details-list (clojure.core/get-in letvar149483 ["GeoLocationDetailsList" :content])), :is-truncated (deser-page-truncated (clojure.core/get-in letvar149483 ["IsTruncated" :content])), :max-items (deser-page-max-items (clojure.core/get-in letvar149483 ["MaxItems" :content]))} (letvar149483 "NextContinentCode") (clojure.core/assoc :next-continent-code (deser-geo-location-continent-code (clojure.core/get-in letvar149483 ["NextContinentCode" :content]))) (letvar149483 "NextCountryCode") (clojure.core/assoc :next-country-code (deser-geo-location-country-code (clojure.core/get-in letvar149483 ["NextCountryCode" :content]))) (letvar149483 "NextSubdivisionCode") (clojure.core/assoc :next-subdivision-code (deser-geo-location-subdivision-code (clojure.core/get-in letvar149483 ["NextSubdivisionCode" :content]))))))

(clojure.core/defn- response-conflicting-types [input] (clojure.core/let [rawinput149484 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149485 {"message" (portkey.aws/search-for-tag rawinput149484 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar149485 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar149485 ["message" :content]))))))

(clojure.core/defn- response-delete-traffic-policy-instance-response [input] (clojure.core/let [rawinput149486 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149487 {}] (clojure.core/cond-> {})))

(clojure.core/defn- response-traffic-policy-already-exists [input] (clojure.core/let [rawinput149488 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149489 {"message" (portkey.aws/search-for-tag rawinput149488 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar149489 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar149489 ["message" :content]))))))

(clojure.core/defn- response-delegation-set-already-reusable [input] (clojure.core/let [rawinput149490 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149491 {"message" (portkey.aws/search-for-tag rawinput149490 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar149491 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar149491 ["message" :content]))))))

(clojure.core/defn- response-vpc-association-not-found [input] (clojure.core/let [rawinput149492 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149493 {"message" (portkey.aws/search-for-tag rawinput149492 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar149493 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar149493 ["message" :content]))))))

(clojure.core/defn- response-health-check-version-mismatch [input] (clojure.core/let [rawinput149494 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149495 {"message" (portkey.aws/search-for-tag rawinput149494 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar149495 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar149495 ["message" :content]))))))

(clojure.core/defn- response-get-change-response [input] (clojure.core/let [rawinput149496 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149497 {"ChangeInfo" (portkey.aws/search-for-tag rawinput149496 "ChangeInfo" :flattened? false)}] (clojure.core/cond-> {:change-info (deser-change-info (clojure.core/get-in letvar149497 ["ChangeInfo" :content]))})))

(clojure.core/defn- response-list-traffic-policies-response [input] (clojure.core/let [rawinput149498 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149499 {"TrafficPolicySummaries" (portkey.aws/search-for-tag rawinput149498 "TrafficPolicySummaries" :flattened? false), "IsTruncated" (portkey.aws/search-for-tag rawinput149498 "IsTruncated" :flattened? false), "TrafficPolicyIdMarker" (portkey.aws/search-for-tag rawinput149498 "TrafficPolicyIdMarker" :flattened? false), "MaxItems" (portkey.aws/search-for-tag rawinput149498 "MaxItems" :flattened? false)}] (clojure.core/cond-> {:traffic-policy-summaries (deser-traffic-policy-summaries (clojure.core/get-in letvar149499 ["TrafficPolicySummaries" :content])), :is-truncated (deser-page-truncated (clojure.core/get-in letvar149499 ["IsTruncated" :content])), :traffic-policy-id-marker (deser-traffic-policy-id (clojure.core/get-in letvar149499 ["TrafficPolicyIdMarker" :content])), :max-items (deser-page-max-items (clojure.core/get-in letvar149499 ["MaxItems" :content]))})))

(clojure.core/defn- response-get-geo-location-response [input] (clojure.core/let [rawinput149500 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149501 {"GeoLocationDetails" (portkey.aws/search-for-tag rawinput149500 "GeoLocationDetails" :flattened? false)}] (clojure.core/cond-> {:geo-location-details (deser-geo-location-details (clojure.core/get-in letvar149501 ["GeoLocationDetails" :content]))})))

(clojure.core/defn- response-list-traffic-policy-instances-response [input] (clojure.core/let [rawinput149502 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149503 {"TrafficPolicyInstances" (portkey.aws/search-for-tag rawinput149502 "TrafficPolicyInstances" :flattened? false), "HostedZoneIdMarker" (portkey.aws/search-for-tag rawinput149502 "HostedZoneIdMarker" :flattened? false), "TrafficPolicyInstanceNameMarker" (portkey.aws/search-for-tag rawinput149502 "TrafficPolicyInstanceNameMarker" :flattened? false), "TrafficPolicyInstanceTypeMarker" (portkey.aws/search-for-tag rawinput149502 "TrafficPolicyInstanceTypeMarker" :flattened? false), "IsTruncated" (portkey.aws/search-for-tag rawinput149502 "IsTruncated" :flattened? false), "MaxItems" (portkey.aws/search-for-tag rawinput149502 "MaxItems" :flattened? false)}] (clojure.core/cond-> {:traffic-policy-instances (deser-traffic-policy-instances (clojure.core/get-in letvar149503 ["TrafficPolicyInstances" :content])), :is-truncated (deser-page-truncated (clojure.core/get-in letvar149503 ["IsTruncated" :content])), :max-items (deser-page-max-items (clojure.core/get-in letvar149503 ["MaxItems" :content]))} (letvar149503 "HostedZoneIdMarker") (clojure.core/assoc :hosted-zone-id-marker (deser-resource-id (clojure.core/get-in letvar149503 ["HostedZoneIdMarker" :content]))) (letvar149503 "TrafficPolicyInstanceNameMarker") (clojure.core/assoc :traffic-policy-instance-name-marker (deser-dns-name (clojure.core/get-in letvar149503 ["TrafficPolicyInstanceNameMarker" :content]))) (letvar149503 "TrafficPolicyInstanceTypeMarker") (clojure.core/assoc :traffic-policy-instance-type-marker (deser-rr-type (clojure.core/get-in letvar149503 ["TrafficPolicyInstanceTypeMarker" :content]))))))

(clojure.core/defn- response-get-health-check-count-response [input] (clojure.core/let [rawinput149504 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149505 {"HealthCheckCount" (portkey.aws/search-for-tag rawinput149504 "HealthCheckCount" :flattened? false)}] (clojure.core/cond-> {:health-check-count (deser-health-check-count (clojure.core/get-in letvar149505 ["HealthCheckCount" :content]))})))

(clojure.core/defn- response-delete-vpc-association-authorization-response [input] (clojure.core/let [rawinput149506 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149507 {}] (clojure.core/cond-> {})))

(clojure.core/defn- response-too-many-hosted-zones [input] (clojure.core/let [rawinput149508 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149509 {"message" (portkey.aws/search-for-tag rawinput149508 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar149509 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar149509 ["message" :content]))))))

(clojure.core/defn- response-throttling-exception [input] (clojure.core/let [rawinput149510 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149511 {"message" (portkey.aws/search-for-tag rawinput149510 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar149511 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar149511 ["message" :content]))))))

(clojure.core/defn- response-change-tags-for-resource-response [input] (clojure.core/let [rawinput149512 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149513 {}] (clojure.core/cond-> {})))

(clojure.core/defn- response-get-hosted-zone-count-response [input] (clojure.core/let [rawinput149514 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149515 {"HostedZoneCount" (portkey.aws/search-for-tag rawinput149514 "HostedZoneCount" :flattened? false)}] (clojure.core/cond-> {:hosted-zone-count (deser-hosted-zone-count (clojure.core/get-in letvar149515 ["HostedZoneCount" :content]))})))

(clojure.core/defn- response-no-such-query-logging-config [input] (clojure.core/let [rawinput149516 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149517 {"message" (portkey.aws/search-for-tag rawinput149516 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar149517 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar149517 ["message" :content]))))))

(clojure.core/defn- response-update-health-check-response [input] (clojure.core/let [rawinput149518 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149519 {"HealthCheck" (portkey.aws/search-for-tag rawinput149518 "HealthCheck" :flattened? false)}] (clojure.core/cond-> {:health-check (deser-health-check (clojure.core/get-in letvar149519 ["HealthCheck" :content]))})))

(clojure.core/defn- response-traffic-policy-in-use [input] (clojure.core/let [rawinput149520 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149521 {"message" (portkey.aws/search-for-tag rawinput149520 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar149521 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar149521 ["message" :content]))))))

(clojure.core/defn- response-health-check-already-exists [input] (clojure.core/let [rawinput149522 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149523 {"message" (portkey.aws/search-for-tag rawinput149522 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar149523 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar149523 ["message" :content]))))))

(clojure.core/defn- response-delegation-set-not-available [input] (clojure.core/let [rawinput149524 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149525 {"message" (portkey.aws/search-for-tag rawinput149524 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar149525 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar149525 ["message" :content]))))))

(clojure.core/defn- response-list-tags-for-resources-response [input] (clojure.core/let [rawinput149526 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149527 {"ResourceTagSets" (portkey.aws/search-for-tag rawinput149526 "ResourceTagSets" :flattened? false)}] (clojure.core/cond-> {:resource-tag-sets (deser-resource-tag-set-list (clojure.core/get-in letvar149527 ["ResourceTagSets" :content]))})))

(clojure.core/defn- response-get-account-limit-response [input] (clojure.core/let [rawinput149528 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149529 {"Limit" (portkey.aws/search-for-tag rawinput149528 "Limit" :flattened? false), "Count" (portkey.aws/search-for-tag rawinput149528 "Count" :flattened? false)}] (clojure.core/cond-> {:limit (deser-account-limit (clojure.core/get-in letvar149529 ["Limit" :content])), :count (deser-usage-count (clojure.core/get-in letvar149529 ["Count" :content]))})))

(clojure.core/defn- response-vpc-association-authorization-not-found [input] (clojure.core/let [rawinput149530 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149531 {"message" (portkey.aws/search-for-tag rawinput149530 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar149531 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar149531 ["message" :content]))))))

(clojure.core/defn- response-no-such-traffic-policy-instance [input] (clojure.core/let [rawinput149532 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149533 {"message" (portkey.aws/search-for-tag rawinput149532 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar149533 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar149533 ["message" :content]))))))

(clojure.core/defn- response-update-hosted-zone-comment-response [input] (clojure.core/let [rawinput149534 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149535 {"HostedZone" (portkey.aws/search-for-tag rawinput149534 "HostedZone" :flattened? false)}] (clojure.core/cond-> {:hosted-zone (deser-hosted-zone (clojure.core/get-in letvar149535 ["HostedZone" :content]))})))

(clojure.core/defn- response-list-traffic-policy-instances-by-hosted-zone-response [input] (clojure.core/let [rawinput149536 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149537 {"TrafficPolicyInstances" (portkey.aws/search-for-tag rawinput149536 "TrafficPolicyInstances" :flattened? false), "TrafficPolicyInstanceNameMarker" (portkey.aws/search-for-tag rawinput149536 "TrafficPolicyInstanceNameMarker" :flattened? false), "TrafficPolicyInstanceTypeMarker" (portkey.aws/search-for-tag rawinput149536 "TrafficPolicyInstanceTypeMarker" :flattened? false), "IsTruncated" (portkey.aws/search-for-tag rawinput149536 "IsTruncated" :flattened? false), "MaxItems" (portkey.aws/search-for-tag rawinput149536 "MaxItems" :flattened? false)}] (clojure.core/cond-> {:traffic-policy-instances (deser-traffic-policy-instances (clojure.core/get-in letvar149537 ["TrafficPolicyInstances" :content])), :is-truncated (deser-page-truncated (clojure.core/get-in letvar149537 ["IsTruncated" :content])), :max-items (deser-page-max-items (clojure.core/get-in letvar149537 ["MaxItems" :content]))} (letvar149537 "TrafficPolicyInstanceNameMarker") (clojure.core/assoc :traffic-policy-instance-name-marker (deser-dns-name (clojure.core/get-in letvar149537 ["TrafficPolicyInstanceNameMarker" :content]))) (letvar149537 "TrafficPolicyInstanceTypeMarker") (clojure.core/assoc :traffic-policy-instance-type-marker (deser-rr-type (clojure.core/get-in letvar149537 ["TrafficPolicyInstanceTypeMarker" :content]))))))

(clojure.core/defn- response-no-such-cloud-watch-logs-log-group [input] (clojure.core/let [rawinput149538 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149539 {"message" (portkey.aws/search-for-tag rawinput149538 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar149539 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar149539 ["message" :content]))))))

(clojure.core/defn- response-list-traffic-policy-instances-by-policy-response [input] (clojure.core/let [rawinput149540 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149541 {"TrafficPolicyInstances" (portkey.aws/search-for-tag rawinput149540 "TrafficPolicyInstances" :flattened? false), "HostedZoneIdMarker" (portkey.aws/search-for-tag rawinput149540 "HostedZoneIdMarker" :flattened? false), "TrafficPolicyInstanceNameMarker" (portkey.aws/search-for-tag rawinput149540 "TrafficPolicyInstanceNameMarker" :flattened? false), "TrafficPolicyInstanceTypeMarker" (portkey.aws/search-for-tag rawinput149540 "TrafficPolicyInstanceTypeMarker" :flattened? false), "IsTruncated" (portkey.aws/search-for-tag rawinput149540 "IsTruncated" :flattened? false), "MaxItems" (portkey.aws/search-for-tag rawinput149540 "MaxItems" :flattened? false)}] (clojure.core/cond-> {:traffic-policy-instances (deser-traffic-policy-instances (clojure.core/get-in letvar149541 ["TrafficPolicyInstances" :content])), :is-truncated (deser-page-truncated (clojure.core/get-in letvar149541 ["IsTruncated" :content])), :max-items (deser-page-max-items (clojure.core/get-in letvar149541 ["MaxItems" :content]))} (letvar149541 "HostedZoneIdMarker") (clojure.core/assoc :hosted-zone-id-marker (deser-resource-id (clojure.core/get-in letvar149541 ["HostedZoneIdMarker" :content]))) (letvar149541 "TrafficPolicyInstanceNameMarker") (clojure.core/assoc :traffic-policy-instance-name-marker (deser-dns-name (clojure.core/get-in letvar149541 ["TrafficPolicyInstanceNameMarker" :content]))) (letvar149541 "TrafficPolicyInstanceTypeMarker") (clojure.core/assoc :traffic-policy-instance-type-marker (deser-rr-type (clojure.core/get-in letvar149541 ["TrafficPolicyInstanceTypeMarker" :content]))))))

(clojure.core/defn- response-create-health-check-response [input] (clojure.core/let [rawinput149542 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149543 {"HealthCheck" (portkey.aws/search-for-tag rawinput149542 "HealthCheck" :flattened? false), "Location" (clojure.core/get-in input [:headers "Location"])}] (clojure.core/cond-> {:health-check (deser-health-check (clojure.core/get-in letvar149543 ["HealthCheck" :content])), :location (deser-resource-uri (clojure.core/get-in letvar149543 ["Location"]))})))

(clojure.core/defn- response-delete-traffic-policy-response [input] (clojure.core/let [rawinput149544 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149545 {}] (clojure.core/cond-> {})))

(clojure.core/defn- response-get-reusable-delegation-set-limit-response [input] (clojure.core/let [rawinput149546 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149547 {"Limit" (portkey.aws/search-for-tag rawinput149546 "Limit" :flattened? false), "Count" (portkey.aws/search-for-tag rawinput149546 "Count" :flattened? false)}] (clojure.core/cond-> {:limit (deser-reusable-delegation-set-limit (clojure.core/get-in letvar149547 ["Limit" :content])), :count (deser-usage-count (clojure.core/get-in letvar149547 ["Count" :content]))})))

(clojure.core/defn- response-delegation-set-already-created [input] (clojure.core/let [rawinput149548 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149549 {"message" (portkey.aws/search-for-tag rawinput149548 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar149549 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar149549 ["message" :content]))))))

(clojure.core/defn- response-hosted-zone-not-empty [input] (clojure.core/let [rawinput149550 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149551 {"message" (portkey.aws/search-for-tag rawinput149550 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar149551 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar149551 ["message" :content]))))))

(clojure.core/defn- response-change-resource-record-sets-response [input] (clojure.core/let [rawinput149552 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar149553 {"ChangeInfo" (portkey.aws/search-for-tag rawinput149552 "ChangeInfo" :flattened? false)}] (clojure.core/cond-> {:change-info (deser-change-info (clojure.core/get-in letvar149553 ["ChangeInfo" :content]))})))

(clojure.spec.alpha/def :portkey.aws.route53/insufficient-data-health-status #{"Healthy" :unhealthy "LastKnownStatus" :healthy :last-known-status "Unhealthy"})

(clojure.spec.alpha/def :portkey.aws.route53.update-traffic-policy-instance-request/id (clojure.spec.alpha/and :portkey.aws.route53/traffic-policy-instance-id))
(clojure.spec.alpha/def :portkey.aws.route53/update-traffic-policy-instance-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.update-traffic-policy-instance-request/id :portkey.aws.route53/ttl :portkey.aws.route53/traffic-policy-id :portkey.aws.route53/traffic-policy-version] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.get-hosted-zone-limit-response/limit (clojure.spec.alpha/and :portkey.aws.route53/hosted-zone-limit))
(clojure.spec.alpha/def :portkey.aws.route53.get-hosted-zone-limit-response/count (clojure.spec.alpha/and :portkey.aws.route53/usage-count))
(clojure.spec.alpha/def :portkey.aws.route53/get-hosted-zone-limit-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.get-hosted-zone-limit-response/limit :portkey.aws.route53.get-hosted-zone-limit-response/count] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.delete-traffic-policy-request/id (clojure.spec.alpha/and :portkey.aws.route53/traffic-policy-id))
(clojure.spec.alpha/def :portkey.aws.route53.delete-traffic-policy-request/version (clojure.spec.alpha/and :portkey.aws.route53/traffic-policy-version))
(clojure.spec.alpha/def :portkey.aws.route53/delete-traffic-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.delete-traffic-policy-request/id :portkey.aws.route53.delete-traffic-policy-request/version] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53/tag-resource-type #{"healthcheck" :healthcheck "hostedzone" :hostedzone})

(clojure.spec.alpha/def :portkey.aws.route53.invalid-pagination-token/message (clojure.spec.alpha/and :portkey.aws.route53/error-message))
(clojure.spec.alpha/def :portkey.aws.route53/invalid-pagination-token (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.invalid-pagination-token/message]))

(clojure.spec.alpha/def :portkey.aws.route53/geo-location-subdivision-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22927__auto__] (clojure.core/<= 1 (clojure.core/count s__22927__auto__))) (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.route53.health-check/id (clojure.spec.alpha/and :portkey.aws.route53/health-check-id))
(clojure.spec.alpha/def :portkey.aws.route53.health-check/caller-reference (clojure.spec.alpha/and :portkey.aws.route53/health-check-nonce))
(clojure.spec.alpha/def :portkey.aws.route53/health-check (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.health-check/id :portkey.aws.route53.health-check/caller-reference :portkey.aws.route53/health-check-config :portkey.aws.route53/health-check-version] :opt-un [:portkey.aws.route53/linked-service :portkey.aws.route53/cloud-watch-alarm-configuration]))

(clojure.spec.alpha/def :portkey.aws.route53/get-checker-ip-ranges-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53/delete-reusable-delegation-set-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53/delegation-set-name-servers (clojure.spec.alpha/coll-of :portkey.aws.route53/dns-name :min-count 1))

(clojure.spec.alpha/def :portkey.aws.route53/get-health-check-last-failure-reason-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53/health-check-observations] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53/health-check-nonce (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22927__auto__] (clojure.core/<= 1 (clojure.core/count s__22927__auto__))) (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.route53.list-traffic-policy-instances-by-policy-request/hosted-zone-id-marker (clojure.spec.alpha/and :portkey.aws.route53/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.list-traffic-policy-instances-by-policy-request/traffic-policy-instance-name-marker (clojure.spec.alpha/and :portkey.aws.route53/dns-name))
(clojure.spec.alpha/def :portkey.aws.route53.list-traffic-policy-instances-by-policy-request/traffic-policy-instance-type-marker (clojure.spec.alpha/and :portkey.aws.route53/rr-type))
(clojure.spec.alpha/def :portkey.aws.route53.list-traffic-policy-instances-by-policy-request/max-items (clojure.spec.alpha/and :portkey.aws.route53/page-max-items))
(clojure.spec.alpha/def :portkey.aws.route53/list-traffic-policy-instances-by-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53/traffic-policy-id :portkey.aws.route53/traffic-policy-version] :opt-un [:portkey.aws.route53.list-traffic-policy-instances-by-policy-request/hosted-zone-id-marker :portkey.aws.route53.list-traffic-policy-instances-by-policy-request/traffic-policy-instance-name-marker :portkey.aws.route53.list-traffic-policy-instances-by-policy-request/traffic-policy-instance-type-marker :portkey.aws.route53.list-traffic-policy-instances-by-policy-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.route53.list-traffic-policy-versions-request/id (clojure.spec.alpha/and :portkey.aws.route53/traffic-policy-id))
(clojure.spec.alpha/def :portkey.aws.route53.list-traffic-policy-versions-request/max-items (clojure.spec.alpha/and :portkey.aws.route53/page-max-items))
(clojure.spec.alpha/def :portkey.aws.route53/list-traffic-policy-versions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.list-traffic-policy-versions-request/id] :opt-un [:portkey.aws.route53/traffic-policy-version-marker :portkey.aws.route53.list-traffic-policy-versions-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.route53/traffic-policy-instance-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.route53/search-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.route53/hosted-zone-rr-set-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.route53.last-vpc-association/message (clojure.spec.alpha/and :portkey.aws.route53/error-message))
(clojure.spec.alpha/def :portkey.aws.route53/last-vpc-association (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.last-vpc-association/message]))

(clojure.spec.alpha/def :portkey.aws.route53.resource-tag-set/resource-type (clojure.spec.alpha/and :portkey.aws.route53/tag-resource-type))
(clojure.spec.alpha/def :portkey.aws.route53.resource-tag-set/resource-id (clojure.spec.alpha/and :portkey.aws.route53/tag-resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.resource-tag-set/tags (clojure.spec.alpha/and :portkey.aws.route53/tag-list))
(clojure.spec.alpha/def :portkey.aws.route53/resource-tag-set (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.resource-tag-set/resource-type :portkey.aws.route53.resource-tag-set/resource-id :portkey.aws.route53.resource-tag-set/tags]))

(clojure.spec.alpha/def :portkey.aws.route53.test-dns-answer-request/hosted-zone-id (clojure.spec.alpha/and :portkey.aws.route53/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.test-dns-answer-request/record-name (clojure.spec.alpha/and :portkey.aws.route53/dns-name))
(clojure.spec.alpha/def :portkey.aws.route53.test-dns-answer-request/record-type (clojure.spec.alpha/and :portkey.aws.route53/rr-type))
(clojure.spec.alpha/def :portkey.aws.route53.test-dns-answer-request/resolver-ip (clojure.spec.alpha/and :portkey.aws.route53/ip-address))
(clojure.spec.alpha/def :portkey.aws.route53.test-dns-answer-request/edns-0-client-subnet-ip (clojure.spec.alpha/and :portkey.aws.route53/ip-address))
(clojure.spec.alpha/def :portkey.aws.route53.test-dns-answer-request/edns-0-client-subnet-mask (clojure.spec.alpha/and :portkey.aws.route53/subnet-mask))
(clojure.spec.alpha/def :portkey.aws.route53/test-dns-answer-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.test-dns-answer-request/hosted-zone-id :portkey.aws.route53.test-dns-answer-request/record-name :portkey.aws.route53.test-dns-answer-request/record-type] :opt-un [:portkey.aws.route53.test-dns-answer-request/resolver-ip :portkey.aws.route53.test-dns-answer-request/edns-0-client-subnet-ip :portkey.aws.route53.test-dns-answer-request/edns-0-client-subnet-mask]))

(clojure.spec.alpha/def :portkey.aws.route53.query-logging-config-already-exists/message (clojure.spec.alpha/and :portkey.aws.route53/error-message))
(clojure.spec.alpha/def :portkey.aws.route53/query-logging-config-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.query-logging-config-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.route53.too-many-health-checks/message (clojure.spec.alpha/and :portkey.aws.route53/error-message))
(clojure.spec.alpha/def :portkey.aws.route53/too-many-health-checks (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.too-many-health-checks/message]))

(clojure.spec.alpha/def :portkey.aws.route53/rr-type #{:soa "CAA" :naptr "CNAME" :txt :ns "TXT" "SRV" :srv "AAAA" :caa "NS" "PTR" :mx :cname "NAPTR" "A" "SPF" :spf :ptr :aaaa :a "SOA" "MX"})

(clojure.spec.alpha/def :portkey.aws.route53/cloud-watch-logs-log-group-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.route53.alias-target/hosted-zone-id (clojure.spec.alpha/and :portkey.aws.route53/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.alias-target/evaluate-target-health (clojure.spec.alpha/and :portkey.aws.route53/alias-health-enabled))
(clojure.spec.alpha/def :portkey.aws.route53/alias-target (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.alias-target/hosted-zone-id :portkey.aws.route53/dns-name :portkey.aws.route53.alias-target/evaluate-target-health] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53/account-limit-type #{"MAX_REUSABLE_DELEGATION_SETS_BY_OWNER" "MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER" "MAX_HEALTH_CHECKS_BY_OWNER" "MAX_TRAFFIC_POLICIES_BY_OWNER" :max-hosted-zones-by-owner :max-reusable-delegation-sets-by-owner :max-traffic-policies-by-owner :max-traffic-policy-instances-by-owner "MAX_HOSTED_ZONES_BY_OWNER" :max-health-checks-by-owner})

(clojure.spec.alpha/def :portkey.aws.route53.list-resource-record-sets-request/hosted-zone-id (clojure.spec.alpha/and :portkey.aws.route53/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.list-resource-record-sets-request/start-record-name (clojure.spec.alpha/and :portkey.aws.route53/dns-name))
(clojure.spec.alpha/def :portkey.aws.route53.list-resource-record-sets-request/start-record-type (clojure.spec.alpha/and :portkey.aws.route53/rr-type))
(clojure.spec.alpha/def :portkey.aws.route53.list-resource-record-sets-request/start-record-identifier (clojure.spec.alpha/and :portkey.aws.route53/resource-record-set-identifier))
(clojure.spec.alpha/def :portkey.aws.route53.list-resource-record-sets-request/max-items (clojure.spec.alpha/and :portkey.aws.route53/page-max-items))
(clojure.spec.alpha/def :portkey.aws.route53/list-resource-record-sets-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.list-resource-record-sets-request/hosted-zone-id] :opt-un [:portkey.aws.route53.list-resource-record-sets-request/start-record-name :portkey.aws.route53.list-resource-record-sets-request/start-record-type :portkey.aws.route53.list-resource-record-sets-request/start-record-identifier :portkey.aws.route53.list-resource-record-sets-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.route53/geo-location-country-code (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22927__auto__] (clojure.core/<= 1 (clojure.core/count s__22927__auto__))) (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 2))))

(clojure.spec.alpha/def :portkey.aws.route53/traffic-policy-version-marker (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 4))))

(clojure.spec.alpha/def :portkey.aws.route53/subnet-mask (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22927__auto__] (clojure.core/<= 0 (clojure.core/count s__22927__auto__))) (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 3))))

(clojure.spec.alpha/def :portkey.aws.route53/traffic-policy-summaries (clojure.spec.alpha/coll-of :portkey.aws.route53/traffic-policy-summary))

(clojure.spec.alpha/def :portkey.aws.route53/period (clojure.spec.alpha/int-in 60 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.route53.list-hosted-zones-by-name-response/hosted-zone-id (clojure.spec.alpha/and :portkey.aws.route53/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.list-hosted-zones-by-name-response/is-truncated (clojure.spec.alpha/and :portkey.aws.route53/page-truncated))
(clojure.spec.alpha/def :portkey.aws.route53.list-hosted-zones-by-name-response/next-dns-name (clojure.spec.alpha/and :portkey.aws.route53/dns-name))
(clojure.spec.alpha/def :portkey.aws.route53.list-hosted-zones-by-name-response/next-hosted-zone-id (clojure.spec.alpha/and :portkey.aws.route53/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.list-hosted-zones-by-name-response/max-items (clojure.spec.alpha/and :portkey.aws.route53/page-max-items))
(clojure.spec.alpha/def :portkey.aws.route53/list-hosted-zones-by-name-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53/hosted-zones :portkey.aws.route53.list-hosted-zones-by-name-response/is-truncated :portkey.aws.route53.list-hosted-zones-by-name-response/max-items] :opt-un [:portkey.aws.route53/dns-name :portkey.aws.route53.list-hosted-zones-by-name-response/hosted-zone-id :portkey.aws.route53.list-hosted-zones-by-name-response/next-dns-name :portkey.aws.route53.list-hosted-zones-by-name-response/next-hosted-zone-id]))

(clojure.spec.alpha/def :portkey.aws.route53.get-reusable-delegation-set-request/id (clojure.spec.alpha/and :portkey.aws.route53/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53/get-reusable-delegation-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.get-reusable-delegation-set-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53/delegation-sets (clojure.spec.alpha/coll-of :portkey.aws.route53/delegation-set))

(clojure.spec.alpha/def :portkey.aws.route53.create-vpc-association-authorization-request/hosted-zone-id (clojure.spec.alpha/and :portkey.aws.route53/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53/create-vpc-association-authorization-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.create-vpc-association-authorization-request/hosted-zone-id :portkey.aws.route53/vpc] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53/threshold clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.route53.list-health-checks-response/marker (clojure.spec.alpha/and :portkey.aws.route53/page-marker))
(clojure.spec.alpha/def :portkey.aws.route53.list-health-checks-response/is-truncated (clojure.spec.alpha/and :portkey.aws.route53/page-truncated))
(clojure.spec.alpha/def :portkey.aws.route53.list-health-checks-response/next-marker (clojure.spec.alpha/and :portkey.aws.route53/page-marker))
(clojure.spec.alpha/def :portkey.aws.route53.list-health-checks-response/max-items (clojure.spec.alpha/and :portkey.aws.route53/page-max-items))
(clojure.spec.alpha/def :portkey.aws.route53/list-health-checks-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53/health-checks :portkey.aws.route53.list-health-checks-response/marker :portkey.aws.route53.list-health-checks-response/is-truncated :portkey.aws.route53.list-health-checks-response/max-items] :opt-un [:portkey.aws.route53.list-health-checks-response/next-marker]))

(clojure.spec.alpha/def :portkey.aws.route53.invalid-argument/message (clojure.spec.alpha/and :portkey.aws.route53/error-message))
(clojure.spec.alpha/def :portkey.aws.route53/invalid-argument (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.invalid-argument/message]))

(clojure.spec.alpha/def :portkey.aws.route53.change-resource-record-sets-request/hosted-zone-id (clojure.spec.alpha/and :portkey.aws.route53/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53/change-resource-record-sets-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.change-resource-record-sets-request/hosted-zone-id :portkey.aws.route53/change-batch] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.get-geo-location-request/continent-code (clojure.spec.alpha/and :portkey.aws.route53/geo-location-continent-code))
(clojure.spec.alpha/def :portkey.aws.route53.get-geo-location-request/country-code (clojure.spec.alpha/and :portkey.aws.route53/geo-location-country-code))
(clojure.spec.alpha/def :portkey.aws.route53.get-geo-location-request/subdivision-code (clojure.spec.alpha/and :portkey.aws.route53/geo-location-subdivision-code))
(clojure.spec.alpha/def :portkey.aws.route53/get-geo-location-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.get-geo-location-request/continent-code :portkey.aws.route53.get-geo-location-request/country-code :portkey.aws.route53.get-geo-location-request/subdivision-code]))

(clojure.spec.alpha/def :portkey.aws.route53/delete-health-check-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53/health-check-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53/associate-vpc-comment (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.route53/get-health-check-status-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53/health-check-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.delete-query-logging-config-request/id (clojure.spec.alpha/and :portkey.aws.route53/query-logging-config-id))
(clojure.spec.alpha/def :portkey.aws.route53/delete-query-logging-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.delete-query-logging-config-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.incompatible-version/message (clojure.spec.alpha/and :portkey.aws.route53/error-message))
(clojure.spec.alpha/def :portkey.aws.route53/incompatible-version (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.incompatible-version/message]))

(clojure.spec.alpha/def :portkey.aws.route53/dimension-field (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22927__auto__] (clojure.core/<= 1 (clojure.core/count s__22927__auto__))) (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.route53/list-tags-for-resource-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53/resource-tag-set] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53/get-hosted-zone-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53/hosted-zone] :opt-un [:portkey.aws.route53/delegation-set :portkey.aws.route53/vp-cs]))

(clojure.spec.alpha/def :portkey.aws.route53/nameserver (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22927__auto__] (clojure.core/<= 0 (clojure.core/count s__22927__auto__))) (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.route53.list-traffic-policy-versions-response/is-truncated (clojure.spec.alpha/and :portkey.aws.route53/page-truncated))
(clojure.spec.alpha/def :portkey.aws.route53.list-traffic-policy-versions-response/max-items (clojure.spec.alpha/and :portkey.aws.route53/page-max-items))
(clojure.spec.alpha/def :portkey.aws.route53/list-traffic-policy-versions-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53/traffic-policies :portkey.aws.route53.list-traffic-policy-versions-response/is-truncated :portkey.aws.route53/traffic-policy-version-marker :portkey.aws.route53.list-traffic-policy-versions-response/max-items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53/resource-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.route53.delete-vpc-association-authorization-request/hosted-zone-id (clojure.spec.alpha/and :portkey.aws.route53/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53/delete-vpc-association-authorization-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.delete-vpc-association-authorization-request/hosted-zone-id :portkey.aws.route53/vpc] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.hosted-zone-not-private/message (clojure.spec.alpha/and :portkey.aws.route53/error-message))
(clojure.spec.alpha/def :portkey.aws.route53/hosted-zone-not-private (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.hosted-zone-not-private/message]))

(clojure.spec.alpha/def :portkey.aws.route53.change-batch/comment (clojure.spec.alpha/and :portkey.aws.route53/resource-description))
(clojure.spec.alpha/def :portkey.aws.route53/change-batch (clojure.spec.alpha/keys :req-un [:portkey.aws.route53/changes] :opt-un [:portkey.aws.route53.change-batch/comment]))

(clojure.spec.alpha/def :portkey.aws.route53/get-health-check-status-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53/health-check-observations] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53/resource-record-set-region #{:apnortheast-1 :apsouth-1 "ap-northeast-1" "eu-west-1" :euwest-3 :useast-1 "ap-northeast-3" :apsoutheast-2 :apnortheast-2 "us-east-2" "ap-southeast-2" "cn-north-1" "sa-east-1" "ap-southeast-1" :cnnorth-1 "cn-northwest-1" "ap-northeast-2" "eu-west-3" :cnnorthwest-1 :cacentral-1 "ca-central-1" "eu-central-1" :euwest-2 :apnortheast-3 "eu-west-2" :uswest-1 :eucentral-1 :saeast-1 :apsoutheast-1 "us-west-2" "us-east-1" "us-west-1" "ap-south-1" :euwest-1 :useast-2 :uswest-2})

(clojure.spec.alpha/def :portkey.aws.route53.get-hosted-zone-request/id (clojure.spec.alpha/and :portkey.aws.route53/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53/get-hosted-zone-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.get-hosted-zone-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.list-vpc-association-authorizations-response/hosted-zone-id (clojure.spec.alpha/and :portkey.aws.route53/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.list-vpc-association-authorizations-response/next-token (clojure.spec.alpha/and :portkey.aws.route53/pagination-token))
(clojure.spec.alpha/def :portkey.aws.route53/list-vpc-association-authorizations-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.list-vpc-association-authorizations-response/hosted-zone-id :portkey.aws.route53/vp-cs] :opt-un [:portkey.aws.route53.list-vpc-association-authorizations-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.route53.no-such-geo-location/message (clojure.spec.alpha/and :portkey.aws.route53/error-message))
(clojure.spec.alpha/def :portkey.aws.route53/no-such-geo-location (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.no-such-geo-location/message]))

(clojure.spec.alpha/def :portkey.aws.route53.limits-exceeded/message (clojure.spec.alpha/and :portkey.aws.route53/error-message))
(clojure.spec.alpha/def :portkey.aws.route53/limits-exceeded (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.limits-exceeded/message]))

(clojure.spec.alpha/def :portkey.aws.route53.public-zone-vpc-association/message (clojure.spec.alpha/and :portkey.aws.route53/error-message))
(clojure.spec.alpha/def :portkey.aws.route53/public-zone-vpc-association (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.public-zone-vpc-association/message]))

(clojure.spec.alpha/def :portkey.aws.route53.prior-request-not-complete/message (clojure.spec.alpha/and :portkey.aws.route53/error-message))
(clojure.spec.alpha/def :portkey.aws.route53/prior-request-not-complete (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.prior-request-not-complete/message]))

(clojure.spec.alpha/def :portkey.aws.route53.create-traffic-policy-response/location (clojure.spec.alpha/and :portkey.aws.route53/resource-uri))
(clojure.spec.alpha/def :portkey.aws.route53/create-traffic-policy-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53/traffic-policy :portkey.aws.route53.create-traffic-policy-response/location] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53/traffic-policy-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 512))))

(clojure.spec.alpha/def :portkey.aws.route53.too-many-vpc-association-authorizations/message (clojure.spec.alpha/and :portkey.aws.route53/error-message))
(clojure.spec.alpha/def :portkey.aws.route53/too-many-vpc-association-authorizations (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.too-many-vpc-association-authorizations/message]))

(clojure.spec.alpha/def :portkey.aws.route53.traffic-policy/id (clojure.spec.alpha/and :portkey.aws.route53/traffic-policy-id))
(clojure.spec.alpha/def :portkey.aws.route53.traffic-policy/version (clojure.spec.alpha/and :portkey.aws.route53/traffic-policy-version))
(clojure.spec.alpha/def :portkey.aws.route53.traffic-policy/name (clojure.spec.alpha/and :portkey.aws.route53/traffic-policy-name))
(clojure.spec.alpha/def :portkey.aws.route53.traffic-policy/type (clojure.spec.alpha/and :portkey.aws.route53/rr-type))
(clojure.spec.alpha/def :portkey.aws.route53.traffic-policy/document (clojure.spec.alpha/and :portkey.aws.route53/traffic-policy-document))
(clojure.spec.alpha/def :portkey.aws.route53.traffic-policy/comment (clojure.spec.alpha/and :portkey.aws.route53/traffic-policy-comment))
(clojure.spec.alpha/def :portkey.aws.route53/traffic-policy (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.traffic-policy/id :portkey.aws.route53.traffic-policy/version :portkey.aws.route53.traffic-policy/name :portkey.aws.route53.traffic-policy/type :portkey.aws.route53.traffic-policy/document] :opt-un [:portkey.aws.route53.traffic-policy/comment]))

(clojure.spec.alpha/def :portkey.aws.route53.list-traffic-policy-instances-request/hosted-zone-id-marker (clojure.spec.alpha/and :portkey.aws.route53/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.list-traffic-policy-instances-request/traffic-policy-instance-name-marker (clojure.spec.alpha/and :portkey.aws.route53/dns-name))
(clojure.spec.alpha/def :portkey.aws.route53.list-traffic-policy-instances-request/traffic-policy-instance-type-marker (clojure.spec.alpha/and :portkey.aws.route53/rr-type))
(clojure.spec.alpha/def :portkey.aws.route53.list-traffic-policy-instances-request/max-items (clojure.spec.alpha/and :portkey.aws.route53/page-max-items))
(clojure.spec.alpha/def :portkey.aws.route53/list-traffic-policy-instances-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.list-traffic-policy-instances-request/hosted-zone-id-marker :portkey.aws.route53.list-traffic-policy-instances-request/traffic-policy-instance-name-marker :portkey.aws.route53.list-traffic-policy-instances-request/traffic-policy-instance-type-marker :portkey.aws.route53.list-traffic-policy-instances-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.route53.create-traffic-policy-version-response/location (clojure.spec.alpha/and :portkey.aws.route53/resource-uri))
(clojure.spec.alpha/def :portkey.aws.route53/create-traffic-policy-version-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53/traffic-policy :portkey.aws.route53.create-traffic-policy-version-response/location] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53/vpc-region #{:apnortheast-1 :apsouth-1 "ap-northeast-1" "eu-west-1" :euwest-3 :useast-1 "ap-northeast-3" :apsoutheast-2 :apnortheast-2 "us-east-2" "ap-southeast-2" "cn-north-1" "sa-east-1" "ap-southeast-1" :cnnorth-1 "ap-northeast-2" "eu-west-3" :cacentral-1 "ca-central-1" "eu-central-1" :euwest-2 :apnortheast-3 "eu-west-2" :uswest-1 :eucentral-1 :saeast-1 :apsoutheast-1 "us-west-2" "us-east-1" "us-west-1" "ap-south-1" :euwest-1 :useast-2 :uswest-2})

(clojure.spec.alpha/def :portkey.aws.route53.get-traffic-policy-instance-request/id (clojure.spec.alpha/and :portkey.aws.route53/traffic-policy-instance-id))
(clojure.spec.alpha/def :portkey.aws.route53/get-traffic-policy-instance-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.get-traffic-policy-instance-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53/delete-hosted-zone-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53/change-info] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.create-query-logging-config-request/hosted-zone-id (clojure.spec.alpha/and :portkey.aws.route53/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53/create-query-logging-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.create-query-logging-config-request/hosted-zone-id :portkey.aws.route53/cloud-watch-logs-log-group-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.list-tags-for-resource-request/resource-type (clojure.spec.alpha/and :portkey.aws.route53/tag-resource-type))
(clojure.spec.alpha/def :portkey.aws.route53.list-tags-for-resource-request/resource-id (clojure.spec.alpha/and :portkey.aws.route53/tag-resource-id))
(clojure.spec.alpha/def :portkey.aws.route53/list-tags-for-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.list-tags-for-resource-request/resource-type :portkey.aws.route53.list-tags-for-resource-request/resource-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.test-dns-answer-response/record-name (clojure.spec.alpha/and :portkey.aws.route53/dns-name))
(clojure.spec.alpha/def :portkey.aws.route53.test-dns-answer-response/record-type (clojure.spec.alpha/and :portkey.aws.route53/rr-type))
(clojure.spec.alpha/def :portkey.aws.route53.test-dns-answer-response/response-code (clojure.spec.alpha/and :portkey.aws.route53/dnsr-code))
(clojure.spec.alpha/def :portkey.aws.route53.test-dns-answer-response/protocol (clojure.spec.alpha/and :portkey.aws.route53/transport-protocol))
(clojure.spec.alpha/def :portkey.aws.route53/test-dns-answer-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53/nameserver :portkey.aws.route53.test-dns-answer-response/record-name :portkey.aws.route53.test-dns-answer-response/record-type :portkey.aws.route53/record-data :portkey.aws.route53.test-dns-answer-response/response-code :portkey.aws.route53.test-dns-answer-response/protocol] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53/health-checks (clojure.spec.alpha/coll-of :portkey.aws.route53/health-check))

(clojure.spec.alpha/def :portkey.aws.route53/health-check-region #{:apnortheast-1 "ap-northeast-1" "eu-west-1" :useast-1 :apsoutheast-2 "ap-southeast-2" "sa-east-1" "ap-southeast-1" :uswest-1 :saeast-1 :apsoutheast-1 "us-west-2" "us-east-1" "us-west-1" :euwest-1 :uswest-2})

(clojure.spec.alpha/def :portkey.aws.route53/geo-location-continent-code (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22927__auto__] (clojure.core/<= 2 (clojure.core/count s__22927__auto__))) (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 2))))

(clojure.spec.alpha/def :portkey.aws.route53/health-check-version clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.route53.update-traffic-policy-comment-request/id (clojure.spec.alpha/and :portkey.aws.route53/traffic-policy-id))
(clojure.spec.alpha/def :portkey.aws.route53.update-traffic-policy-comment-request/version (clojure.spec.alpha/and :portkey.aws.route53/traffic-policy-version))
(clojure.spec.alpha/def :portkey.aws.route53.update-traffic-policy-comment-request/comment (clojure.spec.alpha/and :portkey.aws.route53/traffic-policy-comment))
(clojure.spec.alpha/def :portkey.aws.route53/update-traffic-policy-comment-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.update-traffic-policy-comment-request/id :portkey.aws.route53.update-traffic-policy-comment-request/version :portkey.aws.route53.update-traffic-policy-comment-request/comment] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53/error-messages (clojure.spec.alpha/coll-of :portkey.aws.route53/error-message))

(clojure.spec.alpha/def :portkey.aws.route53/failure-threshold (clojure.spec.alpha/int-in 1 10))

(clojure.spec.alpha/def :portkey.aws.route53.list-hosted-zones-by-name-request/hosted-zone-id (clojure.spec.alpha/and :portkey.aws.route53/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.list-hosted-zones-by-name-request/max-items (clojure.spec.alpha/and :portkey.aws.route53/page-max-items))
(clojure.spec.alpha/def :portkey.aws.route53/list-hosted-zones-by-name-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53/dns-name :portkey.aws.route53.list-hosted-zones-by-name-request/hosted-zone-id :portkey.aws.route53.list-hosted-zones-by-name-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.route53/delete-query-logging-config-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53/get-checker-ip-ranges-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53/checker-ip-ranges] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.create-traffic-policy-version-request/id (clojure.spec.alpha/and :portkey.aws.route53/traffic-policy-id))
(clojure.spec.alpha/def :portkey.aws.route53.create-traffic-policy-version-request/document (clojure.spec.alpha/and :portkey.aws.route53/traffic-policy-document))
(clojure.spec.alpha/def :portkey.aws.route53.create-traffic-policy-version-request/comment (clojure.spec.alpha/and :portkey.aws.route53/traffic-policy-comment))
(clojure.spec.alpha/def :portkey.aws.route53/create-traffic-policy-version-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.create-traffic-policy-version-request/id :portkey.aws.route53.create-traffic-policy-version-request/document] :opt-un [:portkey.aws.route53.create-traffic-policy-version-request/comment]))

(clojure.spec.alpha/def :portkey.aws.route53/change-action #{"DELETE" :create :delete :upsert "CREATE" "UPSERT"})

(clojure.spec.alpha/def :portkey.aws.route53/child-health-check-list (clojure.spec.alpha/coll-of :portkey.aws.route53/health-check-id :max-count 256))

(clojure.spec.alpha/def :portkey.aws.route53/checker-ip-ranges (clojure.spec.alpha/coll-of :portkey.aws.route53/ip-address-cidr))

(clojure.spec.alpha/def :portkey.aws.route53.create-vpc-association-authorization-response/hosted-zone-id (clojure.spec.alpha/and :portkey.aws.route53/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53/create-vpc-association-authorization-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.create-vpc-association-authorization-response/hosted-zone-id :portkey.aws.route53/vpc] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.delegation-set-not-reusable/message (clojure.spec.alpha/and :portkey.aws.route53/error-message))
(clojure.spec.alpha/def :portkey.aws.route53/delegation-set-not-reusable (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.delegation-set-not-reusable/message]))

(clojure.spec.alpha/def :portkey.aws.route53.delete-hosted-zone-request/id (clojure.spec.alpha/and :portkey.aws.route53/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53/delete-hosted-zone-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.delete-hosted-zone-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.insufficient-cloud-watch-logs-resource-policy/message (clojure.spec.alpha/and :portkey.aws.route53/error-message))
(clojure.spec.alpha/def :portkey.aws.route53/insufficient-cloud-watch-logs-resource-policy (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.insufficient-cloud-watch-logs-resource-policy/message]))

(clojure.spec.alpha/def :portkey.aws.route53.too-many-traffic-policy-instances/message (clojure.spec.alpha/and :portkey.aws.route53/error-message))
(clojure.spec.alpha/def :portkey.aws.route53/too-many-traffic-policy-instances (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.too-many-traffic-policy-instances/message]))

(clojure.spec.alpha/def :portkey.aws.route53/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.route53.dimension/name (clojure.spec.alpha/and :portkey.aws.route53/dimension-field))
(clojure.spec.alpha/def :portkey.aws.route53.dimension/value (clojure.spec.alpha/and :portkey.aws.route53/dimension-field))
(clojure.spec.alpha/def :portkey.aws.route53/dimension (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.dimension/name :portkey.aws.route53.dimension/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53/vp-cs (clojure.spec.alpha/coll-of :portkey.aws.route53/vpc :min-count 1))

(clojure.spec.alpha/def :portkey.aws.route53/changes (clojure.spec.alpha/coll-of :portkey.aws.route53/change :min-count 1))

(clojure.spec.alpha/def :portkey.aws.route53.no-such-health-check/message (clojure.spec.alpha/and :portkey.aws.route53/error-message))
(clojure.spec.alpha/def :portkey.aws.route53/no-such-health-check (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.no-such-health-check/message]))

(clojure.spec.alpha/def :portkey.aws.route53.no-such-traffic-policy/message (clojure.spec.alpha/and :portkey.aws.route53/error-message))
(clojure.spec.alpha/def :portkey.aws.route53/no-such-traffic-policy (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.no-such-traffic-policy/message]))

(clojure.spec.alpha/def :portkey.aws.route53/pagination-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.route53.update-hosted-zone-comment-request/id (clojure.spec.alpha/and :portkey.aws.route53/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.update-hosted-zone-comment-request/comment (clojure.spec.alpha/and :portkey.aws.route53/resource-description))
(clojure.spec.alpha/def :portkey.aws.route53/update-hosted-zone-comment-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.update-hosted-zone-comment-request/id] :opt-un [:portkey.aws.route53.update-hosted-zone-comment-request/comment]))

(clojure.spec.alpha/def :portkey.aws.route53/comparison-operator #{"LessThanThreshold" :greater-than-threshold :less-than-threshold "GreaterThanThreshold" "LessThanOrEqualToThreshold" :greater-than-or-equal-to-threshold :less-than-or-equal-to-threshold "GreaterThanOrEqualToThreshold"})

(clojure.spec.alpha/def :portkey.aws.route53/associate-vpc-with-hosted-zone-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53/change-info] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.create-traffic-policy-instance-response/location (clojure.spec.alpha/and :portkey.aws.route53/resource-uri))
(clojure.spec.alpha/def :portkey.aws.route53/create-traffic-policy-instance-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53/traffic-policy-instance :portkey.aws.route53.create-traffic-policy-instance-response/location] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.linked-service/description (clojure.spec.alpha/and :portkey.aws.route53/resource-description))
(clojure.spec.alpha/def :portkey.aws.route53/linked-service (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53/service-principal :portkey.aws.route53.linked-service/description]))

(clojure.spec.alpha/def :portkey.aws.route53.not-authorized-exception/message (clojure.spec.alpha/and :portkey.aws.route53/error-message))
(clojure.spec.alpha/def :portkey.aws.route53/not-authorized-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.not-authorized-exception/message]))

(clojure.spec.alpha/def :portkey.aws.route53.list-traffic-policy-instances-by-hosted-zone-request/hosted-zone-id (clojure.spec.alpha/and :portkey.aws.route53/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.list-traffic-policy-instances-by-hosted-zone-request/traffic-policy-instance-name-marker (clojure.spec.alpha/and :portkey.aws.route53/dns-name))
(clojure.spec.alpha/def :portkey.aws.route53.list-traffic-policy-instances-by-hosted-zone-request/traffic-policy-instance-type-marker (clojure.spec.alpha/and :portkey.aws.route53/rr-type))
(clojure.spec.alpha/def :portkey.aws.route53.list-traffic-policy-instances-by-hosted-zone-request/max-items (clojure.spec.alpha/and :portkey.aws.route53/page-max-items))
(clojure.spec.alpha/def :portkey.aws.route53/list-traffic-policy-instances-by-hosted-zone-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.list-traffic-policy-instances-by-hosted-zone-request/hosted-zone-id] :opt-un [:portkey.aws.route53.list-traffic-policy-instances-by-hosted-zone-request/traffic-policy-instance-name-marker :portkey.aws.route53.list-traffic-policy-instances-by-hosted-zone-request/traffic-policy-instance-type-marker :portkey.aws.route53.list-traffic-policy-instances-by-hosted-zone-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.route53/health-check-region-list (clojure.spec.alpha/coll-of :portkey.aws.route53/health-check-region :min-count 3 :max-count 64))

(clojure.spec.alpha/def :portkey.aws.route53/reusable-delegation-set-limit-type #{"MAX_ZONES_BY_REUSABLE_DELEGATION_SET" :max-zones-by-reusable-delegation-set})

(clojure.spec.alpha/def :portkey.aws.route53/geo-location-continent-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22927__auto__] (clojure.core/<= 1 (clojure.core/count s__22927__auto__))) (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 32))))

(clojure.spec.alpha/def :portkey.aws.route53/get-query-logging-config-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53/query-logging-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.invalid-domain-name/message (clojure.spec.alpha/and :portkey.aws.route53/error-message))
(clojure.spec.alpha/def :portkey.aws.route53/invalid-domain-name (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.invalid-domain-name/message]))

(clojure.spec.alpha/def :portkey.aws.route53.list-reusable-delegation-sets-response/marker (clojure.spec.alpha/and :portkey.aws.route53/page-marker))
(clojure.spec.alpha/def :portkey.aws.route53.list-reusable-delegation-sets-response/is-truncated (clojure.spec.alpha/and :portkey.aws.route53/page-truncated))
(clojure.spec.alpha/def :portkey.aws.route53.list-reusable-delegation-sets-response/next-marker (clojure.spec.alpha/and :portkey.aws.route53/page-marker))
(clojure.spec.alpha/def :portkey.aws.route53.list-reusable-delegation-sets-response/max-items (clojure.spec.alpha/and :portkey.aws.route53/page-max-items))
(clojure.spec.alpha/def :portkey.aws.route53/list-reusable-delegation-sets-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53/delegation-sets :portkey.aws.route53.list-reusable-delegation-sets-response/marker :portkey.aws.route53.list-reusable-delegation-sets-response/is-truncated :portkey.aws.route53.list-reusable-delegation-sets-response/max-items] :opt-un [:portkey.aws.route53.list-reusable-delegation-sets-response/next-marker]))

(clojure.spec.alpha/def :portkey.aws.route53.create-traffic-policy-request/name (clojure.spec.alpha/and :portkey.aws.route53/traffic-policy-name))
(clojure.spec.alpha/def :portkey.aws.route53.create-traffic-policy-request/document (clojure.spec.alpha/and :portkey.aws.route53/traffic-policy-document))
(clojure.spec.alpha/def :portkey.aws.route53.create-traffic-policy-request/comment (clojure.spec.alpha/and :portkey.aws.route53/traffic-policy-comment))
(clojure.spec.alpha/def :portkey.aws.route53/create-traffic-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.create-traffic-policy-request/name :portkey.aws.route53.create-traffic-policy-request/document] :opt-un [:portkey.aws.route53.create-traffic-policy-request/comment]))

(clojure.spec.alpha/def :portkey.aws.route53/health-check-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.route53.hosted-zone/id (clojure.spec.alpha/and :portkey.aws.route53/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.hosted-zone/name (clojure.spec.alpha/and :portkey.aws.route53/dns-name))
(clojure.spec.alpha/def :portkey.aws.route53.hosted-zone/caller-reference (clojure.spec.alpha/and :portkey.aws.route53/nonce))
(clojure.spec.alpha/def :portkey.aws.route53.hosted-zone/config (clojure.spec.alpha/and :portkey.aws.route53/hosted-zone-config))
(clojure.spec.alpha/def :portkey.aws.route53.hosted-zone/resource-record-set-count (clojure.spec.alpha/and :portkey.aws.route53/hosted-zone-rr-set-count))
(clojure.spec.alpha/def :portkey.aws.route53/hosted-zone (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.hosted-zone/id :portkey.aws.route53.hosted-zone/name :portkey.aws.route53.hosted-zone/caller-reference] :opt-un [:portkey.aws.route53.hosted-zone/config :portkey.aws.route53.hosted-zone/resource-record-set-count :portkey.aws.route53/linked-service]))

(clojure.spec.alpha/def :portkey.aws.route53/tag-resource-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.route53/get-hosted-zone-count-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.no-such-change/message (clojure.spec.alpha/and :portkey.aws.route53/error-message))
(clojure.spec.alpha/def :portkey.aws.route53/no-such-change (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.no-such-change/message]))

(clojure.spec.alpha/def :portkey.aws.route53/traffic-policy-instances (clojure.spec.alpha/coll-of :portkey.aws.route53/traffic-policy-instance))

(clojure.spec.alpha/def :portkey.aws.route53/page-truncated clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.route53.geo-location/continent-code (clojure.spec.alpha/and :portkey.aws.route53/geo-location-continent-code))
(clojure.spec.alpha/def :portkey.aws.route53.geo-location/country-code (clojure.spec.alpha/and :portkey.aws.route53/geo-location-country-code))
(clojure.spec.alpha/def :portkey.aws.route53.geo-location/subdivision-code (clojure.spec.alpha/and :portkey.aws.route53/geo-location-subdivision-code))
(clojure.spec.alpha/def :portkey.aws.route53/geo-location (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.geo-location/continent-code :portkey.aws.route53.geo-location/country-code :portkey.aws.route53.geo-location/subdivision-code]))

(clojure.spec.alpha/def :portkey.aws.route53/ip-address-cidr (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.route53.update-health-check-request/child-health-checks (clojure.spec.alpha/and :portkey.aws.route53/child-health-check-list))
(clojure.spec.alpha/def :portkey.aws.route53.update-health-check-request/regions (clojure.spec.alpha/and :portkey.aws.route53/health-check-region-list))
(clojure.spec.alpha/def :portkey.aws.route53.update-health-check-request/reset-elements (clojure.spec.alpha/and :portkey.aws.route53/resettable-element-name-list))
(clojure.spec.alpha/def :portkey.aws.route53/update-health-check-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53/health-check-id] :opt-un [:portkey.aws.route53/insufficient-data-health-status :portkey.aws.route53/search-string :portkey.aws.route53/health-check-version :portkey.aws.route53/failure-threshold :portkey.aws.route53.update-health-check-request/child-health-checks :portkey.aws.route53.update-health-check-request/regions :portkey.aws.route53/port :portkey.aws.route53/ip-address :portkey.aws.route53/resource-path :portkey.aws.route53/alarm-identifier :portkey.aws.route53/enable-sni :portkey.aws.route53.update-health-check-request/reset-elements :portkey.aws.route53/health-threshold :portkey.aws.route53/fully-qualified-domain-name :portkey.aws.route53/inverted]))

(clojure.spec.alpha/def :portkey.aws.route53.health-check-config/type (clojure.spec.alpha/and :portkey.aws.route53/health-check-type))
(clojure.spec.alpha/def :portkey.aws.route53.health-check-config/child-health-checks (clojure.spec.alpha/and :portkey.aws.route53/child-health-check-list))
(clojure.spec.alpha/def :portkey.aws.route53.health-check-config/regions (clojure.spec.alpha/and :portkey.aws.route53/health-check-region-list))
(clojure.spec.alpha/def :portkey.aws.route53/health-check-config (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.health-check-config/type] :opt-un [:portkey.aws.route53/insufficient-data-health-status :portkey.aws.route53/search-string :portkey.aws.route53/failure-threshold :portkey.aws.route53.health-check-config/child-health-checks :portkey.aws.route53.health-check-config/regions :portkey.aws.route53/port :portkey.aws.route53/ip-address :portkey.aws.route53/resource-path :portkey.aws.route53/alarm-identifier :portkey.aws.route53/enable-sni :portkey.aws.route53/measure-latency :portkey.aws.route53/health-threshold :portkey.aws.route53/request-interval :portkey.aws.route53/fully-qualified-domain-name :portkey.aws.route53/inverted]))

(clojure.spec.alpha/def :portkey.aws.route53.change-info/id (clojure.spec.alpha/and :portkey.aws.route53/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.change-info/status (clojure.spec.alpha/and :portkey.aws.route53/change-status))
(clojure.spec.alpha/def :portkey.aws.route53.change-info/submitted-at (clojure.spec.alpha/and :portkey.aws.route53/time-stamp))
(clojure.spec.alpha/def :portkey.aws.route53.change-info/comment (clojure.spec.alpha/and :portkey.aws.route53/resource-description))
(clojure.spec.alpha/def :portkey.aws.route53/change-info (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.change-info/id :portkey.aws.route53.change-info/status :portkey.aws.route53.change-info/submitted-at] :opt-un [:portkey.aws.route53.change-info/comment]))

(clojure.spec.alpha/def :portkey.aws.route53/dimension-list (clojure.spec.alpha/coll-of :portkey.aws.route53/dimension :max-count 10))

(clojure.spec.alpha/def :portkey.aws.route53/status (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.route53/service-principal (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.route53.list-hosted-zones-request/marker (clojure.spec.alpha/and :portkey.aws.route53/page-marker))
(clojure.spec.alpha/def :portkey.aws.route53.list-hosted-zones-request/max-items (clojure.spec.alpha/and :portkey.aws.route53/page-max-items))
(clojure.spec.alpha/def :portkey.aws.route53.list-hosted-zones-request/delegation-set-id (clojure.spec.alpha/and :portkey.aws.route53/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53/list-hosted-zones-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.list-hosted-zones-request/marker :portkey.aws.route53.list-hosted-zones-request/max-items :portkey.aws.route53.list-hosted-zones-request/delegation-set-id]))

(clojure.spec.alpha/def :portkey.aws.route53/traffic-policy-version (clojure.spec.alpha/int-in 1 1000))

(clojure.spec.alpha/def :portkey.aws.route53.invalid-change-batch/messages (clojure.spec.alpha/and :portkey.aws.route53/error-messages))
(clojure.spec.alpha/def :portkey.aws.route53.invalid-change-batch/message (clojure.spec.alpha/and :portkey.aws.route53/error-message))
(clojure.spec.alpha/def :portkey.aws.route53/invalid-change-batch (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.invalid-change-batch/messages :portkey.aws.route53.invalid-change-batch/message]))

(clojure.spec.alpha/def :portkey.aws.route53/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.route53.geo-location-details/continent-code (clojure.spec.alpha/and :portkey.aws.route53/geo-location-continent-code))
(clojure.spec.alpha/def :portkey.aws.route53.geo-location-details/continent-name (clojure.spec.alpha/and :portkey.aws.route53/geo-location-continent-name))
(clojure.spec.alpha/def :portkey.aws.route53.geo-location-details/country-code (clojure.spec.alpha/and :portkey.aws.route53/geo-location-country-code))
(clojure.spec.alpha/def :portkey.aws.route53.geo-location-details/country-name (clojure.spec.alpha/and :portkey.aws.route53/geo-location-country-name))
(clojure.spec.alpha/def :portkey.aws.route53.geo-location-details/subdivision-code (clojure.spec.alpha/and :portkey.aws.route53/geo-location-subdivision-code))
(clojure.spec.alpha/def :portkey.aws.route53.geo-location-details/subdivision-name (clojure.spec.alpha/and :portkey.aws.route53/geo-location-subdivision-name))
(clojure.spec.alpha/def :portkey.aws.route53/geo-location-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.geo-location-details/continent-code :portkey.aws.route53.geo-location-details/continent-name :portkey.aws.route53.geo-location-details/country-code :portkey.aws.route53.geo-location-details/country-name :portkey.aws.route53.geo-location-details/subdivision-code :portkey.aws.route53.geo-location-details/subdivision-name]))

(clojure.spec.alpha/def :portkey.aws.route53/change-status #{:pending "INSYNC" "PENDING" :insync})

(clojure.spec.alpha/def :portkey.aws.route53/dnsr-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.route53.invalid-input/message (clojure.spec.alpha/and :portkey.aws.route53/error-message))
(clojure.spec.alpha/def :portkey.aws.route53/invalid-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.invalid-input/message]))

(clojure.spec.alpha/def :portkey.aws.route53/get-reusable-delegation-set-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53/delegation-set] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53/get-traffic-policy-instance-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53/traffic-policy-instance] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53/resource-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 32))))

(clojure.spec.alpha/def :portkey.aws.route53.hosted-zone-not-found/message (clojure.spec.alpha/and :portkey.aws.route53/error-message))
(clojure.spec.alpha/def :portkey.aws.route53/hosted-zone-not-found (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.hosted-zone-not-found/message]))

(clojure.spec.alpha/def :portkey.aws.route53.invalid-vpc-id/message (clojure.spec.alpha/and :portkey.aws.route53/error-message))
(clojure.spec.alpha/def :portkey.aws.route53/invalid-vpc-id (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.invalid-vpc-id/message]))

(clojure.spec.alpha/def :portkey.aws.route53/traffic-policy-instance-state (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.route53/ttl clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.route53.no-such-delegation-set/message (clojure.spec.alpha/and :portkey.aws.route53/error-message))
(clojure.spec.alpha/def :portkey.aws.route53/no-such-delegation-set (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.no-such-delegation-set/message]))

(clojure.spec.alpha/def :portkey.aws.route53/resettable-element-name-list (clojure.spec.alpha/coll-of :portkey.aws.route53/resettable-element-name :max-count 64))

(clojure.spec.alpha/def :portkey.aws.route53/get-traffic-policy-instance-count-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.list-query-logging-configs-request/hosted-zone-id (clojure.spec.alpha/and :portkey.aws.route53/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.list-query-logging-configs-request/next-token (clojure.spec.alpha/and :portkey.aws.route53/pagination-token))
(clojure.spec.alpha/def :portkey.aws.route53/list-query-logging-configs-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.list-query-logging-configs-request/hosted-zone-id :portkey.aws.route53.list-query-logging-configs-request/next-token :portkey.aws.route53/max-results]))

(clojure.spec.alpha/def :portkey.aws.route53/resource-record-set-weight clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.route53.too-many-traffic-policy-versions-for-current-policy/message (clojure.spec.alpha/and :portkey.aws.route53/error-message))
(clojure.spec.alpha/def :portkey.aws.route53/too-many-traffic-policy-versions-for-current-policy (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.too-many-traffic-policy-versions-for-current-policy/message]))

(clojure.spec.alpha/def :portkey.aws.route53/get-traffic-policy-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53/traffic-policy] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53/resource-tag-set-list (clojure.spec.alpha/coll-of :portkey.aws.route53/resource-tag-set))

(clojure.spec.alpha/def :portkey.aws.route53/tag-list (clojure.spec.alpha/coll-of :portkey.aws.route53/tag :min-count 1 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.route53/update-traffic-policy-comment-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53/traffic-policy] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53/disassociate-vpc-from-hosted-zone-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53/change-info] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.conflicting-domain-exists/message (clojure.spec.alpha/and :portkey.aws.route53/error-message))
(clojure.spec.alpha/def :portkey.aws.route53/conflicting-domain-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.conflicting-domain-exists/message]))

(clojure.spec.alpha/def :portkey.aws.route53/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.route53/tag-key :min-count 1 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.route53.get-change-request/id (clojure.spec.alpha/and :portkey.aws.route53/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53/get-change-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.get-change-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53/hosted-zone-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.route53.list-reusable-delegation-sets-request/marker (clojure.spec.alpha/and :portkey.aws.route53/page-marker))
(clojure.spec.alpha/def :portkey.aws.route53.list-reusable-delegation-sets-request/max-items (clojure.spec.alpha/and :portkey.aws.route53/page-max-items))
(clojure.spec.alpha/def :portkey.aws.route53/list-reusable-delegation-sets-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.list-reusable-delegation-sets-request/marker :portkey.aws.route53.list-reusable-delegation-sets-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.route53/record-data-entry (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22927__auto__] (clojure.core/<= 0 (clojure.core/count s__22927__auto__))) (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 512))))

(clojure.spec.alpha/def :portkey.aws.route53.concurrent-modification/message (clojure.spec.alpha/and :portkey.aws.route53/error-message))
(clojure.spec.alpha/def :portkey.aws.route53/concurrent-modification (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.concurrent-modification/message]))

(clojure.spec.alpha/def :portkey.aws.route53.delegation-set-in-use/message (clojure.spec.alpha/and :portkey.aws.route53/error-message))
(clojure.spec.alpha/def :portkey.aws.route53/delegation-set-in-use (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.delegation-set-in-use/message]))

(clojure.spec.alpha/def :portkey.aws.route53.list-query-logging-configs-response/next-token (clojure.spec.alpha/and :portkey.aws.route53/pagination-token))
(clojure.spec.alpha/def :portkey.aws.route53/list-query-logging-configs-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53/query-logging-configs] :opt-un [:portkey.aws.route53.list-query-logging-configs-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.route53.list-vpc-association-authorizations-request/hosted-zone-id (clojure.spec.alpha/and :portkey.aws.route53/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.list-vpc-association-authorizations-request/next-token (clojure.spec.alpha/and :portkey.aws.route53/pagination-token))
(clojure.spec.alpha/def :portkey.aws.route53/list-vpc-association-authorizations-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.list-vpc-association-authorizations-request/hosted-zone-id] :opt-un [:portkey.aws.route53.list-vpc-association-authorizations-request/next-token :portkey.aws.route53/max-results]))

(clojure.spec.alpha/def :portkey.aws.route53.health-check-observation/region (clojure.spec.alpha/and :portkey.aws.route53/health-check-region))
(clojure.spec.alpha/def :portkey.aws.route53/health-check-observation (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.health-check-observation/region :portkey.aws.route53/ip-address :portkey.aws.route53/status-report]))

(clojure.spec.alpha/def :portkey.aws.route53/health-check-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.route53/dns-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.route53/query-logging-configs (clojure.spec.alpha/coll-of :portkey.aws.route53/query-logging-config))

(clojure.spec.alpha/def :portkey.aws.route53.reusable-delegation-set-limit/type (clojure.spec.alpha/and :portkey.aws.route53/reusable-delegation-set-limit-type))
(clojure.spec.alpha/def :portkey.aws.route53.reusable-delegation-set-limit/value (clojure.spec.alpha/and :portkey.aws.route53/limit-value))
(clojure.spec.alpha/def :portkey.aws.route53/reusable-delegation-set-limit (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.reusable-delegation-set-limit/type :portkey.aws.route53.reusable-delegation-set-limit/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53/resource-records (clojure.spec.alpha/coll-of :portkey.aws.route53/resource-record :min-count 1))

(clojure.spec.alpha/def :portkey.aws.route53/traffic-policy-document (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 102400))))

(clojure.spec.alpha/def :portkey.aws.route53.create-traffic-policy-instance-request/hosted-zone-id (clojure.spec.alpha/and :portkey.aws.route53/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.create-traffic-policy-instance-request/name (clojure.spec.alpha/and :portkey.aws.route53/dns-name))
(clojure.spec.alpha/def :portkey.aws.route53/create-traffic-policy-instance-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.create-traffic-policy-instance-request/hosted-zone-id :portkey.aws.route53.create-traffic-policy-instance-request/name :portkey.aws.route53/ttl :portkey.aws.route53/traffic-policy-id :portkey.aws.route53/traffic-policy-version] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53/resource-uri (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.route53/traffic-policy-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22927__auto__] (clojure.core/<= 1 (clojure.core/count s__22927__auto__))) (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 36))))

(clojure.spec.alpha/def :portkey.aws.route53.list-hosted-zones-response/marker (clojure.spec.alpha/and :portkey.aws.route53/page-marker))
(clojure.spec.alpha/def :portkey.aws.route53.list-hosted-zones-response/is-truncated (clojure.spec.alpha/and :portkey.aws.route53/page-truncated))
(clojure.spec.alpha/def :portkey.aws.route53.list-hosted-zones-response/next-marker (clojure.spec.alpha/and :portkey.aws.route53/page-marker))
(clojure.spec.alpha/def :portkey.aws.route53.list-hosted-zones-response/max-items (clojure.spec.alpha/and :portkey.aws.route53/page-max-items))
(clojure.spec.alpha/def :portkey.aws.route53/list-hosted-zones-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53/hosted-zones :portkey.aws.route53.list-hosted-zones-response/marker :portkey.aws.route53.list-hosted-zones-response/is-truncated :portkey.aws.route53.list-hosted-zones-response/max-items] :opt-un [:portkey.aws.route53.list-hosted-zones-response/next-marker]))

(clojure.spec.alpha/def :portkey.aws.route53.get-query-logging-config-request/id (clojure.spec.alpha/and :portkey.aws.route53/query-logging-config-id))
(clojure.spec.alpha/def :portkey.aws.route53/get-query-logging-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.get-query-logging-config-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.hosted-zone-limit/type (clojure.spec.alpha/and :portkey.aws.route53/hosted-zone-limit-type))
(clojure.spec.alpha/def :portkey.aws.route53.hosted-zone-limit/value (clojure.spec.alpha/and :portkey.aws.route53/limit-value))
(clojure.spec.alpha/def :portkey.aws.route53/hosted-zone-limit (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.hosted-zone-limit/type :portkey.aws.route53.hosted-zone-limit/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.account-limit/type (clojure.spec.alpha/and :portkey.aws.route53/account-limit-type))
(clojure.spec.alpha/def :portkey.aws.route53.account-limit/value (clojure.spec.alpha/and :portkey.aws.route53/limit-value))
(clojure.spec.alpha/def :portkey.aws.route53/account-limit (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.account-limit/type :portkey.aws.route53.account-limit/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53/query-logging-config-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22927__auto__] (clojure.core/<= 1 (clojure.core/count s__22927__auto__))) (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 36))))

(clojure.spec.alpha/def :portkey.aws.route53.query-logging-config/id (clojure.spec.alpha/and :portkey.aws.route53/query-logging-config-id))
(clojure.spec.alpha/def :portkey.aws.route53.query-logging-config/hosted-zone-id (clojure.spec.alpha/and :portkey.aws.route53/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53/query-logging-config (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.query-logging-config/id :portkey.aws.route53.query-logging-config/hosted-zone-id :portkey.aws.route53/cloud-watch-logs-log-group-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.route53.create-hosted-zone-response/location (clojure.spec.alpha/and :portkey.aws.route53/resource-uri))
(clojure.spec.alpha/def :portkey.aws.route53/create-hosted-zone-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53/hosted-zone :portkey.aws.route53/change-info :portkey.aws.route53/delegation-set :portkey.aws.route53.create-hosted-zone-response/location] :opt-un [:portkey.aws.route53/vpc]))

(clojure.spec.alpha/def :portkey.aws.route53.delegation-set/id (clojure.spec.alpha/and :portkey.aws.route53/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.delegation-set/caller-reference (clojure.spec.alpha/and :portkey.aws.route53/nonce))
(clojure.spec.alpha/def :portkey.aws.route53.delegation-set/name-servers (clojure.spec.alpha/and :portkey.aws.route53/delegation-set-name-servers))
(clojure.spec.alpha/def :portkey.aws.route53/delegation-set (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.delegation-set/name-servers] :opt-un [:portkey.aws.route53.delegation-set/id :portkey.aws.route53.delegation-set/caller-reference]))

(clojure.spec.alpha/def :portkey.aws.route53/resource-record-set-multi-value-answer clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.route53/port (clojure.spec.alpha/int-in 1 65535))

(clojure.spec.alpha/def :portkey.aws.route53.health-check-in-use/message (clojure.spec.alpha/and :portkey.aws.route53/error-message))
(clojure.spec.alpha/def :portkey.aws.route53/health-check-in-use (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.health-check-in-use/message]))

(clojure.spec.alpha/def :portkey.aws.route53/namespace (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22927__auto__] (clojure.core/<= 1 (clojure.core/count s__22927__auto__))) (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.route53/message (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.route53/resource-record-set-identifier (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22927__auto__] (clojure.core/<= 1 (clojure.core/count s__22927__auto__))) (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.route53.list-traffic-policies-request/traffic-policy-id-marker (clojure.spec.alpha/and :portkey.aws.route53/traffic-policy-id))
(clojure.spec.alpha/def :portkey.aws.route53.list-traffic-policies-request/max-items (clojure.spec.alpha/and :portkey.aws.route53/page-max-items))
(clojure.spec.alpha/def :portkey.aws.route53/list-traffic-policies-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.list-traffic-policies-request/traffic-policy-id-marker :portkey.aws.route53.list-traffic-policies-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.route53/resource-record-set-failover #{:primary :secondary "SECONDARY" "PRIMARY"})

(clojure.spec.alpha/def :portkey.aws.route53/geo-location-subdivision-code (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22927__auto__] (clojure.core/<= 1 (clojure.core/count s__22927__auto__))) (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 3))))

(clojure.spec.alpha/def :portkey.aws.route53/ip-address (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 45)) (clojure.core/fn [s__22929__auto__] (clojure.core/re-matches #"(^((([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5]))$|^(([0-9a-fA-F]{1,4}:){7,7}[0-9a-fA-F]{1,4}|([0-9a-fA-F]{1,4}:){1,7}:|([0-9a-fA-F]{1,4}:){1,6}:[0-9a-fA-F]{1,4}|([0-9a-fA-F]{1,4}:){1,5}(:[0-9a-fA-F]{1,4}){1,2}|([0-9a-fA-F]{1,4}:){1,4}(:[0-9a-fA-F]{1,4}){1,3}|([0-9a-fA-F]{1,4}:){1,3}(:[0-9a-fA-F]{1,4}){1,4}|([0-9a-fA-F]{1,4}:){1,2}(:[0-9a-fA-F]{1,4}){1,5}|[0-9a-fA-F]{1,4}:((:[0-9a-fA-F]{1,4}){1,6})|:((:[0-9a-fA-F]{1,4}){1,7}|:)|fe80:(:[0-9a-fA-F]{0,4}){0,4}%[0-9a-zA-Z]{1,}|::(ffff(:0{1,4}){0,1}:){0,1}((25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])\.){3,3}(25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])|([0-9a-fA-F]{1,4}:){1,4}:((25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])\.){3,3}(25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9]))$)" s__22929__auto__))))

(clojure.spec.alpha/def :portkey.aws.route53/delete-health-check-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53/update-traffic-policy-instance-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53/traffic-policy-instance] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53/get-health-check-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53/health-check-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.too-many-traffic-policies/message (clojure.spec.alpha/and :portkey.aws.route53/error-message))
(clojure.spec.alpha/def :portkey.aws.route53/too-many-traffic-policies (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.too-many-traffic-policies/message]))

(clojure.spec.alpha/def :portkey.aws.route53.create-query-logging-config-response/location (clojure.spec.alpha/and :portkey.aws.route53/resource-uri))
(clojure.spec.alpha/def :portkey.aws.route53/create-query-logging-config-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53/query-logging-config :portkey.aws.route53.create-query-logging-config-response/location] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.change/action (clojure.spec.alpha/and :portkey.aws.route53/change-action))
(clojure.spec.alpha/def :portkey.aws.route53/change (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.change/action :portkey.aws.route53/resource-record-set] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.traffic-policy-instance-already-exists/message (clojure.spec.alpha/and :portkey.aws.route53/error-message))
(clojure.spec.alpha/def :portkey.aws.route53/traffic-policy-instance-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.traffic-policy-instance-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.route53/traffic-policy-instance-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22927__auto__] (clojure.core/<= 1 (clojure.core/count s__22927__auto__))) (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 36))))

(clojure.spec.alpha/def :portkey.aws.route53.hosted-zone-already-exists/message (clojure.spec.alpha/and :portkey.aws.route53/error-message))
(clojure.spec.alpha/def :portkey.aws.route53/hosted-zone-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.hosted-zone-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.route53.traffic-policy-summary/id (clojure.spec.alpha/and :portkey.aws.route53/traffic-policy-id))
(clojure.spec.alpha/def :portkey.aws.route53.traffic-policy-summary/name (clojure.spec.alpha/and :portkey.aws.route53/traffic-policy-name))
(clojure.spec.alpha/def :portkey.aws.route53.traffic-policy-summary/type (clojure.spec.alpha/and :portkey.aws.route53/rr-type))
(clojure.spec.alpha/def :portkey.aws.route53.traffic-policy-summary/latest-version (clojure.spec.alpha/and :portkey.aws.route53/traffic-policy-version))
(clojure.spec.alpha/def :portkey.aws.route53.traffic-policy-summary/traffic-policy-count (clojure.spec.alpha/and :portkey.aws.route53/traffic-policy-version))
(clojure.spec.alpha/def :portkey.aws.route53/traffic-policy-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.traffic-policy-summary/id :portkey.aws.route53.traffic-policy-summary/name :portkey.aws.route53.traffic-policy-summary/type :portkey.aws.route53.traffic-policy-summary/latest-version :portkey.aws.route53.traffic-policy-summary/traffic-policy-count] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.create-reusable-delegation-set-response/location (clojure.spec.alpha/and :portkey.aws.route53/resource-uri))
(clojure.spec.alpha/def :portkey.aws.route53/create-reusable-delegation-set-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53/delegation-set :portkey.aws.route53.create-reusable-delegation-set-response/location] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.traffic-policy-instance/traffic-policy-type (clojure.spec.alpha/and :portkey.aws.route53/rr-type))
(clojure.spec.alpha/def :portkey.aws.route53.traffic-policy-instance/hosted-zone-id (clojure.spec.alpha/and :portkey.aws.route53/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.traffic-policy-instance/state (clojure.spec.alpha/and :portkey.aws.route53/traffic-policy-instance-state))
(clojure.spec.alpha/def :portkey.aws.route53.traffic-policy-instance/name (clojure.spec.alpha/and :portkey.aws.route53/dns-name))
(clojure.spec.alpha/def :portkey.aws.route53.traffic-policy-instance/id (clojure.spec.alpha/and :portkey.aws.route53/traffic-policy-instance-id))
(clojure.spec.alpha/def :portkey.aws.route53/traffic-policy-instance (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.traffic-policy-instance/id :portkey.aws.route53.traffic-policy-instance/hosted-zone-id :portkey.aws.route53.traffic-policy-instance/name :portkey.aws.route53/ttl :portkey.aws.route53.traffic-policy-instance/state :portkey.aws.route53/message :portkey.aws.route53/traffic-policy-id :portkey.aws.route53/traffic-policy-version :portkey.aws.route53.traffic-policy-instance/traffic-policy-type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53/resettable-element-name #{:fully-qualified-domain-name :resource-path "ChildHealthChecks" :regions "Regions" :child-health-checks "ResourcePath" "FullyQualifiedDomainName"})

(clojure.spec.alpha/def :portkey.aws.route53.list-resource-record-sets-response/is-truncated (clojure.spec.alpha/and :portkey.aws.route53/page-truncated))
(clojure.spec.alpha/def :portkey.aws.route53.list-resource-record-sets-response/next-record-name (clojure.spec.alpha/and :portkey.aws.route53/dns-name))
(clojure.spec.alpha/def :portkey.aws.route53.list-resource-record-sets-response/next-record-type (clojure.spec.alpha/and :portkey.aws.route53/rr-type))
(clojure.spec.alpha/def :portkey.aws.route53.list-resource-record-sets-response/next-record-identifier (clojure.spec.alpha/and :portkey.aws.route53/resource-record-set-identifier))
(clojure.spec.alpha/def :portkey.aws.route53.list-resource-record-sets-response/max-items (clojure.spec.alpha/and :portkey.aws.route53/page-max-items))
(clojure.spec.alpha/def :portkey.aws.route53/list-resource-record-sets-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53/resource-record-sets :portkey.aws.route53.list-resource-record-sets-response/is-truncated :portkey.aws.route53.list-resource-record-sets-response/max-items] :opt-un [:portkey.aws.route53.list-resource-record-sets-response/next-record-name :portkey.aws.route53.list-resource-record-sets-response/next-record-type :portkey.aws.route53.list-resource-record-sets-response/next-record-identifier]))

(clojure.spec.alpha/def :portkey.aws.route53.invalid-traffic-policy-document/message (clojure.spec.alpha/and :portkey.aws.route53/error-message))
(clojure.spec.alpha/def :portkey.aws.route53/invalid-traffic-policy-document (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.invalid-traffic-policy-document/message]))

(clojure.spec.alpha/def :portkey.aws.route53/get-health-check-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53/health-check] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.create-health-check-request/caller-reference (clojure.spec.alpha/and :portkey.aws.route53/health-check-nonce))
(clojure.spec.alpha/def :portkey.aws.route53/create-health-check-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.create-health-check-request/caller-reference :portkey.aws.route53/health-check-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53/geo-location-country-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22927__auto__] (clojure.core/<= 1 (clojure.core/count s__22927__auto__))) (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.route53/get-traffic-policy-instance-count-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53/traffic-policy-instance-count] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.resource-record/value (clojure.spec.alpha/and :portkey.aws.route53/r-data))
(clojure.spec.alpha/def :portkey.aws.route53/resource-record (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.resource-record/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53/alarm-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22927__auto__] (clojure.core/<= 1 (clojure.core/count s__22927__auto__))) (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.route53.no-such-hosted-zone/message (clojure.spec.alpha/and :portkey.aws.route53/error-message))
(clojure.spec.alpha/def :portkey.aws.route53/no-such-hosted-zone (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.no-such-hosted-zone/message]))

(clojure.spec.alpha/def :portkey.aws.route53/usage-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.route53.hosted-zone-config/comment (clojure.spec.alpha/and :portkey.aws.route53/resource-description))
(clojure.spec.alpha/def :portkey.aws.route53.hosted-zone-config/private-zone (clojure.spec.alpha/and :portkey.aws.route53/is-private-zone))
(clojure.spec.alpha/def :portkey.aws.route53/hosted-zone-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.hosted-zone-config/comment :portkey.aws.route53.hosted-zone-config/private-zone]))

(clojure.spec.alpha/def :portkey.aws.route53.list-geo-locations-response/is-truncated (clojure.spec.alpha/and :portkey.aws.route53/page-truncated))
(clojure.spec.alpha/def :portkey.aws.route53.list-geo-locations-response/next-continent-code (clojure.spec.alpha/and :portkey.aws.route53/geo-location-continent-code))
(clojure.spec.alpha/def :portkey.aws.route53.list-geo-locations-response/next-country-code (clojure.spec.alpha/and :portkey.aws.route53/geo-location-country-code))
(clojure.spec.alpha/def :portkey.aws.route53.list-geo-locations-response/next-subdivision-code (clojure.spec.alpha/and :portkey.aws.route53/geo-location-subdivision-code))
(clojure.spec.alpha/def :portkey.aws.route53.list-geo-locations-response/max-items (clojure.spec.alpha/and :portkey.aws.route53/page-max-items))
(clojure.spec.alpha/def :portkey.aws.route53/list-geo-locations-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53/geo-location-details-list :portkey.aws.route53.list-geo-locations-response/is-truncated :portkey.aws.route53.list-geo-locations-response/max-items] :opt-un [:portkey.aws.route53.list-geo-locations-response/next-continent-code :portkey.aws.route53.list-geo-locations-response/next-country-code :portkey.aws.route53.list-geo-locations-response/next-subdivision-code]))

(clojure.spec.alpha/def :portkey.aws.route53.associate-vpc-with-hosted-zone-request/hosted-zone-id (clojure.spec.alpha/and :portkey.aws.route53/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.associate-vpc-with-hosted-zone-request/comment (clojure.spec.alpha/and :portkey.aws.route53/associate-vpc-comment))
(clojure.spec.alpha/def :portkey.aws.route53/associate-vpc-with-hosted-zone-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.associate-vpc-with-hosted-zone-request/hosted-zone-id :portkey.aws.route53/vpc] :opt-un [:portkey.aws.route53.associate-vpc-with-hosted-zone-request/comment]))

(clojure.spec.alpha/def :portkey.aws.route53.conflicting-types/message (clojure.spec.alpha/and :portkey.aws.route53/error-message))
(clojure.spec.alpha/def :portkey.aws.route53/conflicting-types (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.conflicting-types/message]))

(clojure.spec.alpha/def :portkey.aws.route53/delete-traffic-policy-instance-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53/hosted-zone-limit-type #{"MAX_VPCS_ASSOCIATED_BY_ZONE" :max-rrsets-by-zone "MAX_RRSETS_BY_ZONE" :max-vpcs-associated-by-zone})

(clojure.spec.alpha/def :portkey.aws.route53/resource-path (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.route53.traffic-policy-already-exists/message (clojure.spec.alpha/and :portkey.aws.route53/error-message))
(clojure.spec.alpha/def :portkey.aws.route53/traffic-policy-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.traffic-policy-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.route53/traffic-policies (clojure.spec.alpha/coll-of :portkey.aws.route53/traffic-policy))

(clojure.spec.alpha/def :portkey.aws.route53/geo-location-details-list (clojure.spec.alpha/coll-of :portkey.aws.route53/geo-location-details))

(clojure.spec.alpha/def :portkey.aws.route53.alarm-identifier/region (clojure.spec.alpha/and :portkey.aws.route53/cloud-watch-region))
(clojure.spec.alpha/def :portkey.aws.route53.alarm-identifier/name (clojure.spec.alpha/and :portkey.aws.route53/alarm-name))
(clojure.spec.alpha/def :portkey.aws.route53/alarm-identifier (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.alarm-identifier/region :portkey.aws.route53.alarm-identifier/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.list-health-checks-request/marker (clojure.spec.alpha/and :portkey.aws.route53/page-marker))
(clojure.spec.alpha/def :portkey.aws.route53.list-health-checks-request/max-items (clojure.spec.alpha/and :portkey.aws.route53/page-max-items))
(clojure.spec.alpha/def :portkey.aws.route53/list-health-checks-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.list-health-checks-request/marker :portkey.aws.route53.list-health-checks-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.route53/get-health-check-last-failure-reason-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53/health-check-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53/is-private-zone clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.route53.delegation-set-already-reusable/message (clojure.spec.alpha/and :portkey.aws.route53/error-message))
(clojure.spec.alpha/def :portkey.aws.route53/delegation-set-already-reusable (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.delegation-set-already-reusable/message]))

(clojure.spec.alpha/def :portkey.aws.route53.vpc-association-not-found/message (clojure.spec.alpha/and :portkey.aws.route53/error-message))
(clojure.spec.alpha/def :portkey.aws.route53/vpc-association-not-found (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.vpc-association-not-found/message]))

(clojure.spec.alpha/def :portkey.aws.route53/traffic-policy-comment (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.route53/enable-sni clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.route53/health-check-type #{:http-str-match :tcp :calculated :https-str-match "TCP" "CALCULATED" "HTTP_STR_MATCH" "HTTPS_STR_MATCH" "CLOUDWATCH_METRIC" "HTTPS" :http :cloudwatch-metric "HTTP" :https})

(clojure.spec.alpha/def :portkey.aws.route53.health-check-version-mismatch/message (clojure.spec.alpha/and :portkey.aws.route53/error-message))
(clojure.spec.alpha/def :portkey.aws.route53/health-check-version-mismatch (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.health-check-version-mismatch/message]))

(clojure.spec.alpha/def :portkey.aws.route53/get-change-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53/change-info] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.get-hosted-zone-limit-request/type (clojure.spec.alpha/and :portkey.aws.route53/hosted-zone-limit-type))
(clojure.spec.alpha/def :portkey.aws.route53.get-hosted-zone-limit-request/hosted-zone-id (clojure.spec.alpha/and :portkey.aws.route53/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53/get-hosted-zone-limit-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.get-hosted-zone-limit-request/type :portkey.aws.route53.get-hosted-zone-limit-request/hosted-zone-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.change-tags-for-resource-request/resource-type (clojure.spec.alpha/and :portkey.aws.route53/tag-resource-type))
(clojure.spec.alpha/def :portkey.aws.route53.change-tags-for-resource-request/resource-id (clojure.spec.alpha/and :portkey.aws.route53/tag-resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.change-tags-for-resource-request/add-tags (clojure.spec.alpha/and :portkey.aws.route53/tag-list))
(clojure.spec.alpha/def :portkey.aws.route53.change-tags-for-resource-request/remove-tag-keys (clojure.spec.alpha/and :portkey.aws.route53/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.route53/change-tags-for-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.change-tags-for-resource-request/resource-type :portkey.aws.route53.change-tags-for-resource-request/resource-id] :opt-un [:portkey.aws.route53.change-tags-for-resource-request/add-tags :portkey.aws.route53.change-tags-for-resource-request/remove-tag-keys]))

(clojure.spec.alpha/def :portkey.aws.route53/record-data (clojure.spec.alpha/coll-of :portkey.aws.route53/record-data-entry))

(clojure.spec.alpha/def :portkey.aws.route53/r-data (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 4000))))

(clojure.spec.alpha/def :portkey.aws.route53.list-traffic-policies-response/is-truncated (clojure.spec.alpha/and :portkey.aws.route53/page-truncated))
(clojure.spec.alpha/def :portkey.aws.route53.list-traffic-policies-response/traffic-policy-id-marker (clojure.spec.alpha/and :portkey.aws.route53/traffic-policy-id))
(clojure.spec.alpha/def :portkey.aws.route53.list-traffic-policies-response/max-items (clojure.spec.alpha/and :portkey.aws.route53/page-max-items))
(clojure.spec.alpha/def :portkey.aws.route53/list-traffic-policies-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53/traffic-policy-summaries :portkey.aws.route53.list-traffic-policies-response/is-truncated :portkey.aws.route53.list-traffic-policies-response/traffic-policy-id-marker :portkey.aws.route53.list-traffic-policies-response/max-items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53/alias-health-enabled clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.route53/health-check-observations (clojure.spec.alpha/coll-of :portkey.aws.route53/health-check-observation))

(clojure.spec.alpha/def :portkey.aws.route53/get-geo-location-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53/geo-location-details] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.list-traffic-policy-instances-response/hosted-zone-id-marker (clojure.spec.alpha/and :portkey.aws.route53/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.list-traffic-policy-instances-response/traffic-policy-instance-name-marker (clojure.spec.alpha/and :portkey.aws.route53/dns-name))
(clojure.spec.alpha/def :portkey.aws.route53.list-traffic-policy-instances-response/traffic-policy-instance-type-marker (clojure.spec.alpha/and :portkey.aws.route53/rr-type))
(clojure.spec.alpha/def :portkey.aws.route53.list-traffic-policy-instances-response/is-truncated (clojure.spec.alpha/and :portkey.aws.route53/page-truncated))
(clojure.spec.alpha/def :portkey.aws.route53.list-traffic-policy-instances-response/max-items (clojure.spec.alpha/and :portkey.aws.route53/page-max-items))
(clojure.spec.alpha/def :portkey.aws.route53/list-traffic-policy-instances-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53/traffic-policy-instances :portkey.aws.route53.list-traffic-policy-instances-response/is-truncated :portkey.aws.route53.list-traffic-policy-instances-response/max-items] :opt-un [:portkey.aws.route53.list-traffic-policy-instances-response/hosted-zone-id-marker :portkey.aws.route53.list-traffic-policy-instances-response/traffic-policy-instance-name-marker :portkey.aws.route53.list-traffic-policy-instances-response/traffic-policy-instance-type-marker]))

(clojure.spec.alpha/def :portkey.aws.route53/max-results (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.route53.tag/key (clojure.spec.alpha/and :portkey.aws.route53/tag-key))
(clojure.spec.alpha/def :portkey.aws.route53.tag/value (clojure.spec.alpha/and :portkey.aws.route53/tag-value))
(clojure.spec.alpha/def :portkey.aws.route53/tag (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.tag/key :portkey.aws.route53.tag/value]))

(clojure.spec.alpha/def :portkey.aws.route53/get-health-check-count-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53/health-check-count] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53/disassociate-vpc-comment (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.route53/page-marker (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.route53/metric-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22927__auto__] (clojure.core/<= 1 (clojure.core/count s__22927__auto__))) (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.route53.create-reusable-delegation-set-request/caller-reference (clojure.spec.alpha/and :portkey.aws.route53/nonce))
(clojure.spec.alpha/def :portkey.aws.route53.create-reusable-delegation-set-request/hosted-zone-id (clojure.spec.alpha/and :portkey.aws.route53/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53/create-reusable-delegation-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.create-reusable-delegation-set-request/caller-reference] :opt-un [:portkey.aws.route53.create-reusable-delegation-set-request/hosted-zone-id]))

(clojure.spec.alpha/def :portkey.aws.route53.get-traffic-policy-request/id (clojure.spec.alpha/and :portkey.aws.route53/traffic-policy-id))
(clojure.spec.alpha/def :portkey.aws.route53.get-traffic-policy-request/version (clojure.spec.alpha/and :portkey.aws.route53/traffic-policy-version))
(clojure.spec.alpha/def :portkey.aws.route53/get-traffic-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.get-traffic-policy-request/id :portkey.aws.route53.get-traffic-policy-request/version] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53/delete-vpc-association-authorization-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.too-many-hosted-zones/message (clojure.spec.alpha/and :portkey.aws.route53/error-message))
(clojure.spec.alpha/def :portkey.aws.route53/too-many-hosted-zones (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.too-many-hosted-zones/message]))

(clojure.spec.alpha/def :portkey.aws.route53.throttling-exception/message (clojure.spec.alpha/and :portkey.aws.route53/error-message))
(clojure.spec.alpha/def :portkey.aws.route53/throttling-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.throttling-exception/message]))

(clojure.spec.alpha/def :portkey.aws.route53.disassociate-vpc-from-hosted-zone-request/hosted-zone-id (clojure.spec.alpha/and :portkey.aws.route53/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.disassociate-vpc-from-hosted-zone-request/comment (clojure.spec.alpha/and :portkey.aws.route53/disassociate-vpc-comment))
(clojure.spec.alpha/def :portkey.aws.route53/disassociate-vpc-from-hosted-zone-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.disassociate-vpc-from-hosted-zone-request/hosted-zone-id :portkey.aws.route53/vpc] :opt-un [:portkey.aws.route53.disassociate-vpc-from-hosted-zone-request/comment]))

(clojure.spec.alpha/def :portkey.aws.route53/nonce (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22927__auto__] (clojure.core/<= 1 (clojure.core/count s__22927__auto__))) (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.route53/change-tags-for-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53/measure-latency clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.route53/get-hosted-zone-count-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53/hosted-zone-count] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.no-such-query-logging-config/message (clojure.spec.alpha/and :portkey.aws.route53/error-message))
(clojure.spec.alpha/def :portkey.aws.route53/no-such-query-logging-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.no-such-query-logging-config/message]))

(clojure.spec.alpha/def :portkey.aws.route53/update-health-check-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53/health-check] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53/transport-protocol (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.route53.traffic-policy-in-use/message (clojure.spec.alpha/and :portkey.aws.route53/error-message))
(clojure.spec.alpha/def :portkey.aws.route53/traffic-policy-in-use (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.traffic-policy-in-use/message]))

(clojure.spec.alpha/def :portkey.aws.route53.delete-reusable-delegation-set-request/id (clojure.spec.alpha/and :portkey.aws.route53/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53/delete-reusable-delegation-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.delete-reusable-delegation-set-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.health-check-already-exists/message (clojure.spec.alpha/and :portkey.aws.route53/error-message))
(clojure.spec.alpha/def :portkey.aws.route53/health-check-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.health-check-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.route53/hosted-zones (clojure.spec.alpha/coll-of :portkey.aws.route53/hosted-zone))

(clojure.spec.alpha/def :portkey.aws.route53.delegation-set-not-available/message (clojure.spec.alpha/and :portkey.aws.route53/error-message))
(clojure.spec.alpha/def :portkey.aws.route53/delegation-set-not-available (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.delegation-set-not-available/message]))

(clojure.spec.alpha/def :portkey.aws.route53.list-tags-for-resources-response/resource-tag-sets (clojure.spec.alpha/and :portkey.aws.route53/resource-tag-set-list))
(clojure.spec.alpha/def :portkey.aws.route53/list-tags-for-resources-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.list-tags-for-resources-response/resource-tag-sets] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53/evaluation-periods (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.route53.get-account-limit-response/limit (clojure.spec.alpha/and :portkey.aws.route53/account-limit))
(clojure.spec.alpha/def :portkey.aws.route53.get-account-limit-response/count (clojure.spec.alpha/and :portkey.aws.route53/usage-count))
(clojure.spec.alpha/def :portkey.aws.route53/get-account-limit-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.get-account-limit-response/limit :portkey.aws.route53.get-account-limit-response/count] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.vpc-association-authorization-not-found/message (clojure.spec.alpha/and :portkey.aws.route53/error-message))
(clojure.spec.alpha/def :portkey.aws.route53/vpc-association-authorization-not-found (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.vpc-association-authorization-not-found/message]))

(clojure.spec.alpha/def :portkey.aws.route53/resource-record-sets (clojure.spec.alpha/coll-of :portkey.aws.route53/resource-record-set))

(clojure.spec.alpha/def :portkey.aws.route53/health-threshold (clojure.spec.alpha/int-in 0 256))

(clojure.spec.alpha/def :portkey.aws.route53.get-account-limit-request/type (clojure.spec.alpha/and :portkey.aws.route53/account-limit-type))
(clojure.spec.alpha/def :portkey.aws.route53/get-account-limit-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.get-account-limit-request/type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.no-such-traffic-policy-instance/message (clojure.spec.alpha/and :portkey.aws.route53/error-message))
(clojure.spec.alpha/def :portkey.aws.route53/no-such-traffic-policy-instance (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.no-such-traffic-policy-instance/message]))

(clojure.spec.alpha/def :portkey.aws.route53.resource-record-set/type (clojure.spec.alpha/and :portkey.aws.route53/rr-type))
(clojure.spec.alpha/def :portkey.aws.route53.resource-record-set/set-identifier (clojure.spec.alpha/and :portkey.aws.route53/resource-record-set-identifier))
(clojure.spec.alpha/def :portkey.aws.route53.resource-record-set/weight (clojure.spec.alpha/and :portkey.aws.route53/resource-record-set-weight))
(clojure.spec.alpha/def :portkey.aws.route53.resource-record-set/multi-value-answer (clojure.spec.alpha/and :portkey.aws.route53/resource-record-set-multi-value-answer))
(clojure.spec.alpha/def :portkey.aws.route53.resource-record-set/failover (clojure.spec.alpha/and :portkey.aws.route53/resource-record-set-failover))
(clojure.spec.alpha/def :portkey.aws.route53.resource-record-set/name (clojure.spec.alpha/and :portkey.aws.route53/dns-name))
(clojure.spec.alpha/def :portkey.aws.route53.resource-record-set/region (clojure.spec.alpha/and :portkey.aws.route53/resource-record-set-region))
(clojure.spec.alpha/def :portkey.aws.route53/resource-record-set (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.resource-record-set/name :portkey.aws.route53.resource-record-set/type] :opt-un [:portkey.aws.route53/alias-target :portkey.aws.route53/geo-location :portkey.aws.route53/ttl :portkey.aws.route53.resource-record-set/set-identifier :portkey.aws.route53.resource-record-set/weight :portkey.aws.route53/health-check-id :portkey.aws.route53.resource-record-set/multi-value-answer :portkey.aws.route53/resource-records :portkey.aws.route53.resource-record-set/failover :portkey.aws.route53/traffic-policy-instance-id :portkey.aws.route53.resource-record-set/region]))

(clojure.spec.alpha/def :portkey.aws.route53/update-hosted-zone-comment-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53/hosted-zone] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.list-traffic-policy-instances-by-hosted-zone-response/traffic-policy-instance-name-marker (clojure.spec.alpha/and :portkey.aws.route53/dns-name))
(clojure.spec.alpha/def :portkey.aws.route53.list-traffic-policy-instances-by-hosted-zone-response/traffic-policy-instance-type-marker (clojure.spec.alpha/and :portkey.aws.route53/rr-type))
(clojure.spec.alpha/def :portkey.aws.route53.list-traffic-policy-instances-by-hosted-zone-response/is-truncated (clojure.spec.alpha/and :portkey.aws.route53/page-truncated))
(clojure.spec.alpha/def :portkey.aws.route53.list-traffic-policy-instances-by-hosted-zone-response/max-items (clojure.spec.alpha/and :portkey.aws.route53/page-max-items))
(clojure.spec.alpha/def :portkey.aws.route53/list-traffic-policy-instances-by-hosted-zone-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53/traffic-policy-instances :portkey.aws.route53.list-traffic-policy-instances-by-hosted-zone-response/is-truncated :portkey.aws.route53.list-traffic-policy-instances-by-hosted-zone-response/max-items] :opt-un [:portkey.aws.route53.list-traffic-policy-instances-by-hosted-zone-response/traffic-policy-instance-name-marker :portkey.aws.route53.list-traffic-policy-instances-by-hosted-zone-response/traffic-policy-instance-type-marker]))

(clojure.spec.alpha/def :portkey.aws.route53/vpc-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.route53/tag-resource-id-list (clojure.spec.alpha/coll-of :portkey.aws.route53/tag-resource-id :min-count 1 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.route53.no-such-cloud-watch-logs-log-group/message (clojure.spec.alpha/and :portkey.aws.route53/error-message))
(clojure.spec.alpha/def :portkey.aws.route53/no-such-cloud-watch-logs-log-group (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.no-such-cloud-watch-logs-log-group/message]))

(clojure.spec.alpha/def :portkey.aws.route53.list-traffic-policy-instances-by-policy-response/hosted-zone-id-marker (clojure.spec.alpha/and :portkey.aws.route53/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.list-traffic-policy-instances-by-policy-response/traffic-policy-instance-name-marker (clojure.spec.alpha/and :portkey.aws.route53/dns-name))
(clojure.spec.alpha/def :portkey.aws.route53.list-traffic-policy-instances-by-policy-response/traffic-policy-instance-type-marker (clojure.spec.alpha/and :portkey.aws.route53/rr-type))
(clojure.spec.alpha/def :portkey.aws.route53.list-traffic-policy-instances-by-policy-response/is-truncated (clojure.spec.alpha/and :portkey.aws.route53/page-truncated))
(clojure.spec.alpha/def :portkey.aws.route53.list-traffic-policy-instances-by-policy-response/max-items (clojure.spec.alpha/and :portkey.aws.route53/page-max-items))
(clojure.spec.alpha/def :portkey.aws.route53/list-traffic-policy-instances-by-policy-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53/traffic-policy-instances :portkey.aws.route53.list-traffic-policy-instances-by-policy-response/is-truncated :portkey.aws.route53.list-traffic-policy-instances-by-policy-response/max-items] :opt-un [:portkey.aws.route53.list-traffic-policy-instances-by-policy-response/hosted-zone-id-marker :portkey.aws.route53.list-traffic-policy-instances-by-policy-response/traffic-policy-instance-name-marker :portkey.aws.route53.list-traffic-policy-instances-by-policy-response/traffic-policy-instance-type-marker]))

(clojure.spec.alpha/def :portkey.aws.route53/get-health-check-count-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.create-health-check-response/location (clojure.spec.alpha/and :portkey.aws.route53/resource-uri))
(clojure.spec.alpha/def :portkey.aws.route53/create-health-check-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53/health-check :portkey.aws.route53.create-health-check-response/location] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53/request-interval (clojure.spec.alpha/int-in 10 30))

(clojure.spec.alpha/def :portkey.aws.route53/delete-traffic-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.get-reusable-delegation-set-limit-response/limit (clojure.spec.alpha/and :portkey.aws.route53/reusable-delegation-set-limit))
(clojure.spec.alpha/def :portkey.aws.route53.get-reusable-delegation-set-limit-response/count (clojure.spec.alpha/and :portkey.aws.route53/usage-count))
(clojure.spec.alpha/def :portkey.aws.route53/get-reusable-delegation-set-limit-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.get-reusable-delegation-set-limit-response/limit :portkey.aws.route53.get-reusable-delegation-set-limit-response/count] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53/time-stamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.route53.cloud-watch-alarm-configuration/dimensions (clojure.spec.alpha/and :portkey.aws.route53/dimension-list))
(clojure.spec.alpha/def :portkey.aws.route53/cloud-watch-alarm-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.route53/evaluation-periods :portkey.aws.route53/threshold :portkey.aws.route53/comparison-operator :portkey.aws.route53/period :portkey.aws.route53/metric-name :portkey.aws.route53/namespace :portkey.aws.route53/statistic] :opt-un [:portkey.aws.route53.cloud-watch-alarm-configuration/dimensions]))

(clojure.spec.alpha/def :portkey.aws.route53.delete-traffic-policy-instance-request/id (clojure.spec.alpha/and :portkey.aws.route53/traffic-policy-instance-id))
(clojure.spec.alpha/def :portkey.aws.route53/delete-traffic-policy-instance-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.delete-traffic-policy-instance-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.get-reusable-delegation-set-limit-request/type (clojure.spec.alpha/and :portkey.aws.route53/reusable-delegation-set-limit-type))
(clojure.spec.alpha/def :portkey.aws.route53.get-reusable-delegation-set-limit-request/delegation-set-id (clojure.spec.alpha/and :portkey.aws.route53/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53/get-reusable-delegation-set-limit-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.get-reusable-delegation-set-limit-request/type :portkey.aws.route53.get-reusable-delegation-set-limit-request/delegation-set-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.delegation-set-already-created/message (clojure.spec.alpha/and :portkey.aws.route53/error-message))
(clojure.spec.alpha/def :portkey.aws.route53/delegation-set-already-created (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.delegation-set-already-created/message]))

(clojure.spec.alpha/def :portkey.aws.route53/fully-qualified-domain-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.route53/statistic #{"Sum" "Average" :maximum "SampleCount" "Minimum" :sample-count :minimum :average :sum "Maximum"})

(clojure.spec.alpha/def :portkey.aws.route53.status-report/checked-time (clojure.spec.alpha/and :portkey.aws.route53/time-stamp))
(clojure.spec.alpha/def :portkey.aws.route53/status-report (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53/status :portkey.aws.route53.status-report/checked-time]))

(clojure.spec.alpha/def :portkey.aws.route53.list-tags-for-resources-request/resource-type (clojure.spec.alpha/and :portkey.aws.route53/tag-resource-type))
(clojure.spec.alpha/def :portkey.aws.route53.list-tags-for-resources-request/resource-ids (clojure.spec.alpha/and :portkey.aws.route53/tag-resource-id-list))
(clojure.spec.alpha/def :portkey.aws.route53/list-tags-for-resources-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.list-tags-for-resources-request/resource-type :portkey.aws.route53.list-tags-for-resources-request/resource-ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53/vpc (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53/vpc-region :portkey.aws.route53/vpc-id]))

(clojure.spec.alpha/def :portkey.aws.route53.list-geo-locations-request/start-continent-code (clojure.spec.alpha/and :portkey.aws.route53/geo-location-continent-code))
(clojure.spec.alpha/def :portkey.aws.route53.list-geo-locations-request/start-country-code (clojure.spec.alpha/and :portkey.aws.route53/geo-location-country-code))
(clojure.spec.alpha/def :portkey.aws.route53.list-geo-locations-request/start-subdivision-code (clojure.spec.alpha/and :portkey.aws.route53/geo-location-subdivision-code))
(clojure.spec.alpha/def :portkey.aws.route53.list-geo-locations-request/max-items (clojure.spec.alpha/and :portkey.aws.route53/page-max-items))
(clojure.spec.alpha/def :portkey.aws.route53/list-geo-locations-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.list-geo-locations-request/start-continent-code :portkey.aws.route53.list-geo-locations-request/start-country-code :portkey.aws.route53.list-geo-locations-request/start-subdivision-code :portkey.aws.route53.list-geo-locations-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.route53.hosted-zone-not-empty/message (clojure.spec.alpha/and :portkey.aws.route53/error-message))
(clojure.spec.alpha/def :portkey.aws.route53/hosted-zone-not-empty (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.hosted-zone-not-empty/message]))

(clojure.spec.alpha/def :portkey.aws.route53/change-resource-record-sets-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53/change-info] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53/limit-value clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.route53/page-max-items (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.route53/inverted clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.route53/cloud-watch-region #{:apnortheast-1 :apsouth-1 "ap-northeast-1" "eu-west-1" :euwest-3 :useast-1 "ap-northeast-3" :apsoutheast-2 :apnortheast-2 "us-east-2" "ap-southeast-2" "sa-east-1" "ap-southeast-1" "ap-northeast-2" "eu-west-3" :cacentral-1 "ca-central-1" "eu-central-1" :euwest-2 :apnortheast-3 "eu-west-2" :uswest-1 :eucentral-1 :saeast-1 :apsoutheast-1 "us-west-2" "us-east-1" "us-west-1" "ap-south-1" :euwest-1 :useast-2 :uswest-2})

(clojure.spec.alpha/def :portkey.aws.route53.create-hosted-zone-request/name (clojure.spec.alpha/and :portkey.aws.route53/dns-name))
(clojure.spec.alpha/def :portkey.aws.route53.create-hosted-zone-request/caller-reference (clojure.spec.alpha/and :portkey.aws.route53/nonce))
(clojure.spec.alpha/def :portkey.aws.route53.create-hosted-zone-request/delegation-set-id (clojure.spec.alpha/and :portkey.aws.route53/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53/create-hosted-zone-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.create-hosted-zone-request/name :portkey.aws.route53.create-hosted-zone-request/caller-reference] :opt-un [:portkey.aws.route53/vpc :portkey.aws.route53/hosted-zone-config :portkey.aws.route53.create-hosted-zone-request/delegation-set-id]))

(clojure.core/defn get-reusable-delegation-set-limit ([get-reusable-delegation-set-limit-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-reusable-delegation-set-limit-request get-reusable-delegation-set-limit-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53/get-reusable-delegation-set-limit-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/reusabledelegationsetlimit/{Id}/{Type}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53/get-reusable-delegation-set-limit-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetReusableDelegationSetLimit", :http.request.configuration/output-deser-fn response-get-reusable-delegation-set-limit-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53/invalid-input, "NoSuchDelegationSet" :portkey.aws.route53/no-such-delegation-set}})))))
(clojure.spec.alpha/fdef get-reusable-delegation-set-limit :args (clojure.spec.alpha/tuple :portkey.aws.route53/get-reusable-delegation-set-limit-request) :ret (clojure.spec.alpha/and :portkey.aws.route53/get-reusable-delegation-set-limit-response))

(clojure.core/defn list-tags-for-resources ([list-tags-for-resources-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-list-tags-for-resources-request list-tags-for-resources-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53/list-tags-for-resources-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/tags/{ResourceType}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53/list-tags-for-resources-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTagsForResources", :http.request.configuration/output-deser-fn response-list-tags-for-resources-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53/invalid-input, "NoSuchHealthCheck" :portkey.aws.route53/no-such-health-check, "NoSuchHostedZone" :portkey.aws.route53/no-such-hosted-zone, "PriorRequestNotComplete" :portkey.aws.route53/prior-request-not-complete, "ThrottlingException" :portkey.aws.route53/throttling-exception}})))))
(clojure.spec.alpha/fdef list-tags-for-resources :args (clojure.spec.alpha/tuple :portkey.aws.route53/list-tags-for-resources-request) :ret (clojure.spec.alpha/and :portkey.aws.route53/list-tags-for-resources-response))

(clojure.core/defn delete-traffic-policy-instance ([delete-traffic-policy-instance-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-delete-traffic-policy-instance-request delete-traffic-policy-instance-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53/delete-traffic-policy-instance-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/trafficpolicyinstance/{Id}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53/delete-traffic-policy-instance-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteTrafficPolicyInstance", :http.request.configuration/output-deser-fn response-delete-traffic-policy-instance-response, :http.request.spec/error-spec {"NoSuchTrafficPolicyInstance" :portkey.aws.route53/no-such-traffic-policy-instance, "InvalidInput" :portkey.aws.route53/invalid-input, "PriorRequestNotComplete" :portkey.aws.route53/prior-request-not-complete}})))))
(clojure.spec.alpha/fdef delete-traffic-policy-instance :args (clojure.spec.alpha/tuple :portkey.aws.route53/delete-traffic-policy-instance-request) :ret (clojure.spec.alpha/and :portkey.aws.route53/delete-traffic-policy-instance-response))

(clojure.core/defn list-geo-locations ([] (list-geo-locations {})) ([list-geo-locations-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-list-geo-locations-request list-geo-locations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53/list-geo-locations-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/geolocations", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53/list-geo-locations-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListGeoLocations", :http.request.configuration/output-deser-fn response-list-geo-locations-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53/invalid-input}})))))
(clojure.spec.alpha/fdef list-geo-locations :args (clojure.spec.alpha/? :portkey.aws.route53/list-geo-locations-request) :ret (clojure.spec.alpha/and :portkey.aws.route53/list-geo-locations-response))

(clojure.core/defn disassociate-vpc-from-hosted-zone ([disassociate-vpc-from-hosted-zone-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-disassociate-vpc-from-hosted-zone-request disassociate-vpc-from-hosted-zone-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53/disassociate-vpc-from-hosted-zone-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/hostedzone/{Id}/disassociatevpc", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53/disassociate-vpc-from-hosted-zone-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DisassociateVPCFromHostedZone", :http.request.configuration/output-deser-fn response-disassociate-vpc-from-hosted-zone-response, :http.request.spec/error-spec {"NoSuchHostedZone" :portkey.aws.route53/no-such-hosted-zone, "InvalidVPCId" :portkey.aws.route53/invalid-vpc-id, "VPCAssociationNotFound" :portkey.aws.route53/vpc-association-not-found, "LastVPCAssociation" :portkey.aws.route53/last-vpc-association, "InvalidInput" :portkey.aws.route53/invalid-input}})))))
(clojure.spec.alpha/fdef disassociate-vpc-from-hosted-zone :args (clojure.spec.alpha/tuple :portkey.aws.route53/disassociate-vpc-from-hosted-zone-request) :ret (clojure.spec.alpha/and :portkey.aws.route53/disassociate-vpc-from-hosted-zone-response))

(clojure.core/defn delete-query-logging-config ([delete-query-logging-config-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-delete-query-logging-config-request delete-query-logging-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53/delete-query-logging-config-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/queryloggingconfig/{Id}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53/delete-query-logging-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteQueryLoggingConfig", :http.request.configuration/output-deser-fn response-delete-query-logging-config-response, :http.request.spec/error-spec {"ConcurrentModification" :portkey.aws.route53/concurrent-modification, "NoSuchQueryLoggingConfig" :portkey.aws.route53/no-such-query-logging-config, "InvalidInput" :portkey.aws.route53/invalid-input}})))))
(clojure.spec.alpha/fdef delete-query-logging-config :args (clojure.spec.alpha/tuple :portkey.aws.route53/delete-query-logging-config-request) :ret (clojure.spec.alpha/and :portkey.aws.route53/delete-query-logging-config-response))

(clojure.core/defn get-traffic-policy-instance ([get-traffic-policy-instance-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-traffic-policy-instance-request get-traffic-policy-instance-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53/get-traffic-policy-instance-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/trafficpolicyinstance/{Id}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53/get-traffic-policy-instance-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetTrafficPolicyInstance", :http.request.configuration/output-deser-fn response-get-traffic-policy-instance-response, :http.request.spec/error-spec {"NoSuchTrafficPolicyInstance" :portkey.aws.route53/no-such-traffic-policy-instance, "InvalidInput" :portkey.aws.route53/invalid-input}})))))
(clojure.spec.alpha/fdef get-traffic-policy-instance :args (clojure.spec.alpha/tuple :portkey.aws.route53/get-traffic-policy-instance-request) :ret (clojure.spec.alpha/and :portkey.aws.route53/get-traffic-policy-instance-response))

(clojure.core/defn create-traffic-policy ([create-traffic-policy-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-create-traffic-policy-request create-traffic-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53/create-traffic-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/trafficpolicy", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53/create-traffic-policy-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateTrafficPolicy", :http.request.configuration/output-deser-fn response-create-traffic-policy-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53/invalid-input, "TooManyTrafficPolicies" :portkey.aws.route53/too-many-traffic-policies, "TrafficPolicyAlreadyExists" :portkey.aws.route53/traffic-policy-already-exists, "InvalidTrafficPolicyDocument" :portkey.aws.route53/invalid-traffic-policy-document}})))))
(clojure.spec.alpha/fdef create-traffic-policy :args (clojure.spec.alpha/tuple :portkey.aws.route53/create-traffic-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.route53/create-traffic-policy-response))

(clojure.core/defn get-checker-ip-ranges ([] (get-checker-ip-ranges {})) ([get-checker-ip-ranges-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-checker-ip-ranges-request get-checker-ip-ranges-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53/get-checker-ip-ranges-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/checkeripranges", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53/get-checker-ip-ranges-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetCheckerIpRanges", :http.request.configuration/output-deser-fn response-get-checker-ip-ranges-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-checker-ip-ranges :args (clojure.spec.alpha/? :portkey.aws.route53/get-checker-ip-ranges-request) :ret (clojure.spec.alpha/and :portkey.aws.route53/get-checker-ip-ranges-response))

(clojure.core/defn get-health-check-status ([get-health-check-status-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-health-check-status-request get-health-check-status-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53/get-health-check-status-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/healthcheck/{HealthCheckId}/status", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53/get-health-check-status-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetHealthCheckStatus", :http.request.configuration/output-deser-fn response-get-health-check-status-response, :http.request.spec/error-spec {"NoSuchHealthCheck" :portkey.aws.route53/no-such-health-check, "InvalidInput" :portkey.aws.route53/invalid-input}})))))
(clojure.spec.alpha/fdef get-health-check-status :args (clojure.spec.alpha/tuple :portkey.aws.route53/get-health-check-status-request) :ret (clojure.spec.alpha/and :portkey.aws.route53/get-health-check-status-response))

(clojure.core/defn create-traffic-policy-instance ([create-traffic-policy-instance-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-create-traffic-policy-instance-request create-traffic-policy-instance-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53/create-traffic-policy-instance-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/trafficpolicyinstance", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53/create-traffic-policy-instance-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateTrafficPolicyInstance", :http.request.configuration/output-deser-fn response-create-traffic-policy-instance-response, :http.request.spec/error-spec {"NoSuchHostedZone" :portkey.aws.route53/no-such-hosted-zone, "InvalidInput" :portkey.aws.route53/invalid-input, "TooManyTrafficPolicyInstances" :portkey.aws.route53/too-many-traffic-policy-instances, "NoSuchTrafficPolicy" :portkey.aws.route53/no-such-traffic-policy, "TrafficPolicyInstanceAlreadyExists" :portkey.aws.route53/traffic-policy-instance-already-exists}})))))
(clojure.spec.alpha/fdef create-traffic-policy-instance :args (clojure.spec.alpha/tuple :portkey.aws.route53/create-traffic-policy-instance-request) :ret (clojure.spec.alpha/and :portkey.aws.route53/create-traffic-policy-instance-response))

(clojure.core/defn create-vpc-association-authorization ([create-vpc-association-authorization-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-create-vpc-association-authorization-request create-vpc-association-authorization-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53/create-vpc-association-authorization-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/hostedzone/{Id}/authorizevpcassociation", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53/create-vpc-association-authorization-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateVPCAssociationAuthorization", :http.request.configuration/output-deser-fn response-create-vpc-association-authorization-response, :http.request.spec/error-spec {"ConcurrentModification" :portkey.aws.route53/concurrent-modification, "TooManyVPCAssociationAuthorizations" :portkey.aws.route53/too-many-vpc-association-authorizations, "NoSuchHostedZone" :portkey.aws.route53/no-such-hosted-zone, "InvalidVPCId" :portkey.aws.route53/invalid-vpc-id, "InvalidInput" :portkey.aws.route53/invalid-input}})))))
(clojure.spec.alpha/fdef create-vpc-association-authorization :args (clojure.spec.alpha/tuple :portkey.aws.route53/create-vpc-association-authorization-request) :ret (clojure.spec.alpha/and :portkey.aws.route53/create-vpc-association-authorization-response))

(clojure.core/defn get-account-limit ([get-account-limit-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-account-limit-request get-account-limit-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53/get-account-limit-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/accountlimit/{Type}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53/get-account-limit-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetAccountLimit", :http.request.configuration/output-deser-fn response-get-account-limit-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53/invalid-input}})))))
(clojure.spec.alpha/fdef get-account-limit :args (clojure.spec.alpha/tuple :portkey.aws.route53/get-account-limit-request) :ret (clojure.spec.alpha/and :portkey.aws.route53/get-account-limit-response))

(clojure.core/defn get-reusable-delegation-set ([get-reusable-delegation-set-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-reusable-delegation-set-request get-reusable-delegation-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53/get-reusable-delegation-set-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/delegationset/{Id}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53/get-reusable-delegation-set-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetReusableDelegationSet", :http.request.configuration/output-deser-fn response-get-reusable-delegation-set-response, :http.request.spec/error-spec {"NoSuchDelegationSet" :portkey.aws.route53/no-such-delegation-set, "DelegationSetNotReusable" :portkey.aws.route53/delegation-set-not-reusable, "InvalidInput" :portkey.aws.route53/invalid-input}})))))
(clojure.spec.alpha/fdef get-reusable-delegation-set :args (clojure.spec.alpha/tuple :portkey.aws.route53/get-reusable-delegation-set-request) :ret (clojure.spec.alpha/and :portkey.aws.route53/get-reusable-delegation-set-response))

(clojure.core/defn get-traffic-policy ([get-traffic-policy-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-traffic-policy-request get-traffic-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53/get-traffic-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/trafficpolicy/{Id}/{Version}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53/get-traffic-policy-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetTrafficPolicy", :http.request.configuration/output-deser-fn response-get-traffic-policy-response, :http.request.spec/error-spec {"NoSuchTrafficPolicy" :portkey.aws.route53/no-such-traffic-policy, "InvalidInput" :portkey.aws.route53/invalid-input}})))))
(clojure.spec.alpha/fdef get-traffic-policy :args (clojure.spec.alpha/tuple :portkey.aws.route53/get-traffic-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.route53/get-traffic-policy-response))

(clojure.core/defn list-traffic-policy-instances ([] (list-traffic-policy-instances {})) ([list-traffic-policy-instances-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-list-traffic-policy-instances-request list-traffic-policy-instances-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53/list-traffic-policy-instances-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/trafficpolicyinstances", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53/list-traffic-policy-instances-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTrafficPolicyInstances", :http.request.configuration/output-deser-fn response-list-traffic-policy-instances-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53/invalid-input, "NoSuchTrafficPolicyInstance" :portkey.aws.route53/no-such-traffic-policy-instance}})))))
(clojure.spec.alpha/fdef list-traffic-policy-instances :args (clojure.spec.alpha/? :portkey.aws.route53/list-traffic-policy-instances-request) :ret (clojure.spec.alpha/and :portkey.aws.route53/list-traffic-policy-instances-response))

(clojure.core/defn create-traffic-policy-version ([create-traffic-policy-version-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-create-traffic-policy-version-request create-traffic-policy-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53/create-traffic-policy-version-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/trafficpolicy/{Id}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53/create-traffic-policy-version-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateTrafficPolicyVersion", :http.request.configuration/output-deser-fn response-create-traffic-policy-version-response, :http.request.spec/error-spec {"NoSuchTrafficPolicy" :portkey.aws.route53/no-such-traffic-policy, "InvalidInput" :portkey.aws.route53/invalid-input, "TooManyTrafficPolicyVersionsForCurrentPolicy" :portkey.aws.route53/too-many-traffic-policy-versions-for-current-policy, "ConcurrentModification" :portkey.aws.route53/concurrent-modification, "InvalidTrafficPolicyDocument" :portkey.aws.route53/invalid-traffic-policy-document}})))))
(clojure.spec.alpha/fdef create-traffic-policy-version :args (clojure.spec.alpha/tuple :portkey.aws.route53/create-traffic-policy-version-request) :ret (clojure.spec.alpha/and :portkey.aws.route53/create-traffic-policy-version-response))

(clojure.core/defn list-hosted-zones-by-name ([] (list-hosted-zones-by-name {})) ([list-hosted-zones-by-name-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-list-hosted-zones-by-name-request list-hosted-zones-by-name-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53/list-hosted-zones-by-name-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/hostedzonesbyname", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53/list-hosted-zones-by-name-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListHostedZonesByName", :http.request.configuration/output-deser-fn response-list-hosted-zones-by-name-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53/invalid-input, "InvalidDomainName" :portkey.aws.route53/invalid-domain-name}})))))
(clojure.spec.alpha/fdef list-hosted-zones-by-name :args (clojure.spec.alpha/? :portkey.aws.route53/list-hosted-zones-by-name-request) :ret (clojure.spec.alpha/and :portkey.aws.route53/list-hosted-zones-by-name-response))

(clojure.core/defn delete-health-check ([delete-health-check-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-delete-health-check-request delete-health-check-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53/delete-health-check-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/healthcheck/{HealthCheckId}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53/delete-health-check-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteHealthCheck", :http.request.configuration/output-deser-fn response-delete-health-check-response, :http.request.spec/error-spec {"NoSuchHealthCheck" :portkey.aws.route53/no-such-health-check, "HealthCheckInUse" :portkey.aws.route53/health-check-in-use, "InvalidInput" :portkey.aws.route53/invalid-input}})))))
(clojure.spec.alpha/fdef delete-health-check :args (clojure.spec.alpha/tuple :portkey.aws.route53/delete-health-check-request) :ret (clojure.spec.alpha/and :portkey.aws.route53/delete-health-check-response))

(clojure.core/defn delete-reusable-delegation-set ([delete-reusable-delegation-set-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-delete-reusable-delegation-set-request delete-reusable-delegation-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53/delete-reusable-delegation-set-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/delegationset/{Id}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53/delete-reusable-delegation-set-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteReusableDelegationSet", :http.request.configuration/output-deser-fn response-delete-reusable-delegation-set-response, :http.request.spec/error-spec {"NoSuchDelegationSet" :portkey.aws.route53/no-such-delegation-set, "DelegationSetInUse" :portkey.aws.route53/delegation-set-in-use, "DelegationSetNotReusable" :portkey.aws.route53/delegation-set-not-reusable, "InvalidInput" :portkey.aws.route53/invalid-input}})))))
(clojure.spec.alpha/fdef delete-reusable-delegation-set :args (clojure.spec.alpha/tuple :portkey.aws.route53/delete-reusable-delegation-set-request) :ret (clojure.spec.alpha/and :portkey.aws.route53/delete-reusable-delegation-set-response))

(clojure.core/defn list-traffic-policy-versions ([list-traffic-policy-versions-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-list-traffic-policy-versions-request list-traffic-policy-versions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53/list-traffic-policy-versions-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/trafficpolicies/{Id}/versions", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53/list-traffic-policy-versions-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTrafficPolicyVersions", :http.request.configuration/output-deser-fn response-list-traffic-policy-versions-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53/invalid-input, "NoSuchTrafficPolicy" :portkey.aws.route53/no-such-traffic-policy}})))))
(clojure.spec.alpha/fdef list-traffic-policy-versions :args (clojure.spec.alpha/tuple :portkey.aws.route53/list-traffic-policy-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.route53/list-traffic-policy-versions-response))

(clojure.core/defn list-tags-for-resource ([list-tags-for-resource-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-list-tags-for-resource-request list-tags-for-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53/list-tags-for-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/tags/{ResourceType}/{ResourceId}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53/list-tags-for-resource-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTagsForResource", :http.request.configuration/output-deser-fn response-list-tags-for-resource-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53/invalid-input, "NoSuchHealthCheck" :portkey.aws.route53/no-such-health-check, "NoSuchHostedZone" :portkey.aws.route53/no-such-hosted-zone, "PriorRequestNotComplete" :portkey.aws.route53/prior-request-not-complete, "ThrottlingException" :portkey.aws.route53/throttling-exception}})))))
(clojure.spec.alpha/fdef list-tags-for-resource :args (clojure.spec.alpha/tuple :portkey.aws.route53/list-tags-for-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.route53/list-tags-for-resource-response))

(clojure.core/defn list-hosted-zones ([] (list-hosted-zones {})) ([list-hosted-zones-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-list-hosted-zones-request list-hosted-zones-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53/list-hosted-zones-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/hostedzone", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53/list-hosted-zones-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListHostedZones", :http.request.configuration/output-deser-fn response-list-hosted-zones-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53/invalid-input, "NoSuchDelegationSet" :portkey.aws.route53/no-such-delegation-set, "DelegationSetNotReusable" :portkey.aws.route53/delegation-set-not-reusable}})))))
(clojure.spec.alpha/fdef list-hosted-zones :args (clojure.spec.alpha/? :portkey.aws.route53/list-hosted-zones-request) :ret (clojure.spec.alpha/and :portkey.aws.route53/list-hosted-zones-response))

(clojure.core/defn get-hosted-zone-limit ([get-hosted-zone-limit-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-hosted-zone-limit-request get-hosted-zone-limit-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53/get-hosted-zone-limit-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/hostedzonelimit/{Id}/{Type}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53/get-hosted-zone-limit-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetHostedZoneLimit", :http.request.configuration/output-deser-fn response-get-hosted-zone-limit-response, :http.request.spec/error-spec {"NoSuchHostedZone" :portkey.aws.route53/no-such-hosted-zone, "InvalidInput" :portkey.aws.route53/invalid-input, "HostedZoneNotPrivate" :portkey.aws.route53/hosted-zone-not-private}})))))
(clojure.spec.alpha/fdef get-hosted-zone-limit :args (clojure.spec.alpha/tuple :portkey.aws.route53/get-hosted-zone-limit-request) :ret (clojure.spec.alpha/and :portkey.aws.route53/get-hosted-zone-limit-response))

(clojure.core/defn update-health-check ([update-health-check-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-update-health-check-request update-health-check-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53/update-health-check-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/healthcheck/{HealthCheckId}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53/update-health-check-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateHealthCheck", :http.request.configuration/output-deser-fn response-update-health-check-response, :http.request.spec/error-spec {"NoSuchHealthCheck" :portkey.aws.route53/no-such-health-check, "InvalidInput" :portkey.aws.route53/invalid-input, "HealthCheckVersionMismatch" :portkey.aws.route53/health-check-version-mismatch}})))))
(clojure.spec.alpha/fdef update-health-check :args (clojure.spec.alpha/tuple :portkey.aws.route53/update-health-check-request) :ret (clojure.spec.alpha/and :portkey.aws.route53/update-health-check-response))

(clojure.core/defn get-geo-location ([] (get-geo-location {})) ([get-geo-location-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-geo-location-request get-geo-location-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53/get-geo-location-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/geolocation", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53/get-geo-location-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetGeoLocation", :http.request.configuration/output-deser-fn response-get-geo-location-response, :http.request.spec/error-spec {"NoSuchGeoLocation" :portkey.aws.route53/no-such-geo-location, "InvalidInput" :portkey.aws.route53/invalid-input}})))))
(clojure.spec.alpha/fdef get-geo-location :args (clojure.spec.alpha/? :portkey.aws.route53/get-geo-location-request) :ret (clojure.spec.alpha/and :portkey.aws.route53/get-geo-location-response))

(clojure.core/defn update-traffic-policy-comment ([update-traffic-policy-comment-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-update-traffic-policy-comment-request update-traffic-policy-comment-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53/update-traffic-policy-comment-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/trafficpolicy/{Id}/{Version}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53/update-traffic-policy-comment-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateTrafficPolicyComment", :http.request.configuration/output-deser-fn response-update-traffic-policy-comment-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53/invalid-input, "NoSuchTrafficPolicy" :portkey.aws.route53/no-such-traffic-policy, "ConcurrentModification" :portkey.aws.route53/concurrent-modification}})))))
(clojure.spec.alpha/fdef update-traffic-policy-comment :args (clojure.spec.alpha/tuple :portkey.aws.route53/update-traffic-policy-comment-request) :ret (clojure.spec.alpha/and :portkey.aws.route53/update-traffic-policy-comment-response))

(clojure.core/defn get-traffic-policy-instance-count ([] (get-traffic-policy-instance-count {})) ([get-traffic-policy-instance-count-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-traffic-policy-instance-count-request get-traffic-policy-instance-count-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53/get-traffic-policy-instance-count-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/trafficpolicyinstancecount", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53/get-traffic-policy-instance-count-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetTrafficPolicyInstanceCount", :http.request.configuration/output-deser-fn response-get-traffic-policy-instance-count-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-traffic-policy-instance-count :args (clojure.spec.alpha/? :portkey.aws.route53/get-traffic-policy-instance-count-request) :ret (clojure.spec.alpha/and :portkey.aws.route53/get-traffic-policy-instance-count-response))

(clojure.core/defn get-hosted-zone ([get-hosted-zone-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-hosted-zone-request get-hosted-zone-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53/get-hosted-zone-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/hostedzone/{Id}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53/get-hosted-zone-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetHostedZone", :http.request.configuration/output-deser-fn response-get-hosted-zone-response, :http.request.spec/error-spec {"NoSuchHostedZone" :portkey.aws.route53/no-such-hosted-zone, "InvalidInput" :portkey.aws.route53/invalid-input}})))))
(clojure.spec.alpha/fdef get-hosted-zone :args (clojure.spec.alpha/tuple :portkey.aws.route53/get-hosted-zone-request) :ret (clojure.spec.alpha/and :portkey.aws.route53/get-hosted-zone-response))

(clojure.core/defn list-vpc-association-authorizations ([list-vpc-association-authorizations-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-list-vpc-association-authorizations-request list-vpc-association-authorizations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53/list-vpc-association-authorizations-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/hostedzone/{Id}/authorizevpcassociation", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53/list-vpc-association-authorizations-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListVPCAssociationAuthorizations", :http.request.configuration/output-deser-fn response-list-vpc-association-authorizations-response, :http.request.spec/error-spec {"NoSuchHostedZone" :portkey.aws.route53/no-such-hosted-zone, "InvalidInput" :portkey.aws.route53/invalid-input, "InvalidPaginationToken" :portkey.aws.route53/invalid-pagination-token}})))))
(clojure.spec.alpha/fdef list-vpc-association-authorizations :args (clojure.spec.alpha/tuple :portkey.aws.route53/list-vpc-association-authorizations-request) :ret (clojure.spec.alpha/and :portkey.aws.route53/list-vpc-association-authorizations-response))

(clojure.core/defn list-traffic-policies ([] (list-traffic-policies {})) ([list-traffic-policies-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-list-traffic-policies-request list-traffic-policies-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53/list-traffic-policies-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/trafficpolicies", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53/list-traffic-policies-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTrafficPolicies", :http.request.configuration/output-deser-fn response-list-traffic-policies-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53/invalid-input}})))))
(clojure.spec.alpha/fdef list-traffic-policies :args (clojure.spec.alpha/? :portkey.aws.route53/list-traffic-policies-request) :ret (clojure.spec.alpha/and :portkey.aws.route53/list-traffic-policies-response))

(clojure.core/defn create-hosted-zone ([create-hosted-zone-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-create-hosted-zone-request create-hosted-zone-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53/create-hosted-zone-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/hostedzone", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53/create-hosted-zone-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateHostedZone", :http.request.configuration/output-deser-fn response-create-hosted-zone-response, :http.request.spec/error-spec {"DelegationSetNotReusable" :portkey.aws.route53/delegation-set-not-reusable, "InvalidDomainName" :portkey.aws.route53/invalid-domain-name, "InvalidInput" :portkey.aws.route53/invalid-input, "InvalidVPCId" :portkey.aws.route53/invalid-vpc-id, "NoSuchDelegationSet" :portkey.aws.route53/no-such-delegation-set, "ConflictingDomainExists" :portkey.aws.route53/conflicting-domain-exists, "HostedZoneAlreadyExists" :portkey.aws.route53/hosted-zone-already-exists, "TooManyHostedZones" :portkey.aws.route53/too-many-hosted-zones, "DelegationSetNotAvailable" :portkey.aws.route53/delegation-set-not-available}})))))
(clojure.spec.alpha/fdef create-hosted-zone :args (clojure.spec.alpha/tuple :portkey.aws.route53/create-hosted-zone-request) :ret (clojure.spec.alpha/and :portkey.aws.route53/create-hosted-zone-response))

(clojure.core/defn list-health-checks ([] (list-health-checks {})) ([list-health-checks-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-list-health-checks-request list-health-checks-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53/list-health-checks-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/healthcheck", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53/list-health-checks-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListHealthChecks", :http.request.configuration/output-deser-fn response-list-health-checks-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53/invalid-input, "IncompatibleVersion" :portkey.aws.route53/incompatible-version}})))))
(clojure.spec.alpha/fdef list-health-checks :args (clojure.spec.alpha/? :portkey.aws.route53/list-health-checks-request) :ret (clojure.spec.alpha/and :portkey.aws.route53/list-health-checks-response))

(clojure.core/defn delete-vpc-association-authorization ([delete-vpc-association-authorization-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-delete-vpc-association-authorization-request delete-vpc-association-authorization-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53/delete-vpc-association-authorization-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/hostedzone/{Id}/deauthorizevpcassociation", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53/delete-vpc-association-authorization-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteVPCAssociationAuthorization", :http.request.configuration/output-deser-fn response-delete-vpc-association-authorization-response, :http.request.spec/error-spec {"ConcurrentModification" :portkey.aws.route53/concurrent-modification, "VPCAssociationAuthorizationNotFound" :portkey.aws.route53/vpc-association-authorization-not-found, "NoSuchHostedZone" :portkey.aws.route53/no-such-hosted-zone, "InvalidVPCId" :portkey.aws.route53/invalid-vpc-id, "InvalidInput" :portkey.aws.route53/invalid-input}})))))
(clojure.spec.alpha/fdef delete-vpc-association-authorization :args (clojure.spec.alpha/tuple :portkey.aws.route53/delete-vpc-association-authorization-request) :ret (clojure.spec.alpha/and :portkey.aws.route53/delete-vpc-association-authorization-response))

(clojure.core/defn get-health-check ([get-health-check-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-health-check-request get-health-check-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53/get-health-check-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/healthcheck/{HealthCheckId}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53/get-health-check-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetHealthCheck", :http.request.configuration/output-deser-fn response-get-health-check-response, :http.request.spec/error-spec {"NoSuchHealthCheck" :portkey.aws.route53/no-such-health-check, "InvalidInput" :portkey.aws.route53/invalid-input, "IncompatibleVersion" :portkey.aws.route53/incompatible-version}})))))
(clojure.spec.alpha/fdef get-health-check :args (clojure.spec.alpha/tuple :portkey.aws.route53/get-health-check-request) :ret (clojure.spec.alpha/and :portkey.aws.route53/get-health-check-response))

(clojure.core/defn list-traffic-policy-instances-by-policy ([list-traffic-policy-instances-by-policy-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-list-traffic-policy-instances-by-policy-request list-traffic-policy-instances-by-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53/list-traffic-policy-instances-by-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/trafficpolicyinstances/trafficpolicy", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53/list-traffic-policy-instances-by-policy-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTrafficPolicyInstancesByPolicy", :http.request.configuration/output-deser-fn response-list-traffic-policy-instances-by-policy-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53/invalid-input, "NoSuchTrafficPolicyInstance" :portkey.aws.route53/no-such-traffic-policy-instance, "NoSuchTrafficPolicy" :portkey.aws.route53/no-such-traffic-policy}})))))
(clojure.spec.alpha/fdef list-traffic-policy-instances-by-policy :args (clojure.spec.alpha/tuple :portkey.aws.route53/list-traffic-policy-instances-by-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.route53/list-traffic-policy-instances-by-policy-response))

(clojure.core/defn change-tags-for-resource ([change-tags-for-resource-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-change-tags-for-resource-request change-tags-for-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53/change-tags-for-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/tags/{ResourceType}/{ResourceId}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53/change-tags-for-resource-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ChangeTagsForResource", :http.request.configuration/output-deser-fn response-change-tags-for-resource-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53/invalid-input, "NoSuchHealthCheck" :portkey.aws.route53/no-such-health-check, "NoSuchHostedZone" :portkey.aws.route53/no-such-hosted-zone, "PriorRequestNotComplete" :portkey.aws.route53/prior-request-not-complete, "ThrottlingException" :portkey.aws.route53/throttling-exception}})))))
(clojure.spec.alpha/fdef change-tags-for-resource :args (clojure.spec.alpha/tuple :portkey.aws.route53/change-tags-for-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.route53/change-tags-for-resource-response))

(clojure.core/defn delete-traffic-policy ([delete-traffic-policy-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-delete-traffic-policy-request delete-traffic-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53/delete-traffic-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/trafficpolicy/{Id}/{Version}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53/delete-traffic-policy-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteTrafficPolicy", :http.request.configuration/output-deser-fn response-delete-traffic-policy-response, :http.request.spec/error-spec {"NoSuchTrafficPolicy" :portkey.aws.route53/no-such-traffic-policy, "InvalidInput" :portkey.aws.route53/invalid-input, "TrafficPolicyInUse" :portkey.aws.route53/traffic-policy-in-use, "ConcurrentModification" :portkey.aws.route53/concurrent-modification}})))))
(clojure.spec.alpha/fdef delete-traffic-policy :args (clojure.spec.alpha/tuple :portkey.aws.route53/delete-traffic-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.route53/delete-traffic-policy-response))

(clojure.core/defn create-query-logging-config ([create-query-logging-config-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-create-query-logging-config-request create-query-logging-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53/create-query-logging-config-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/queryloggingconfig", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53/create-query-logging-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateQueryLoggingConfig", :http.request.configuration/output-deser-fn response-create-query-logging-config-response, :http.request.spec/error-spec {"ConcurrentModification" :portkey.aws.route53/concurrent-modification, "NoSuchHostedZone" :portkey.aws.route53/no-such-hosted-zone, "NoSuchCloudWatchLogsLogGroup" :portkey.aws.route53/no-such-cloud-watch-logs-log-group, "InvalidInput" :portkey.aws.route53/invalid-input, "QueryLoggingConfigAlreadyExists" :portkey.aws.route53/query-logging-config-already-exists, "InsufficientCloudWatchLogsResourcePolicy" :portkey.aws.route53/insufficient-cloud-watch-logs-resource-policy}})))))
(clojure.spec.alpha/fdef create-query-logging-config :args (clojure.spec.alpha/tuple :portkey.aws.route53/create-query-logging-config-request) :ret (clojure.spec.alpha/and :portkey.aws.route53/create-query-logging-config-response))

(clojure.core/defn get-health-check-count ([] (get-health-check-count {})) ([get-health-check-count-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-health-check-count-request get-health-check-count-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53/get-health-check-count-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/healthcheckcount", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53/get-health-check-count-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetHealthCheckCount", :http.request.configuration/output-deser-fn response-get-health-check-count-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-health-check-count :args (clojure.spec.alpha/? :portkey.aws.route53/get-health-check-count-request) :ret (clojure.spec.alpha/and :portkey.aws.route53/get-health-check-count-response))

(clojure.core/defn test-dns-answer ([test-dns-answer-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-test-dns-answer-request test-dns-answer-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53/test-dns-answer-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/testdnsanswer", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53/test-dns-answer-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "TestDNSAnswer", :http.request.configuration/output-deser-fn response-test-dns-answer-response, :http.request.spec/error-spec {"NoSuchHostedZone" :portkey.aws.route53/no-such-hosted-zone, "InvalidInput" :portkey.aws.route53/invalid-input}})))))
(clojure.spec.alpha/fdef test-dns-answer :args (clojure.spec.alpha/tuple :portkey.aws.route53/test-dns-answer-request) :ret (clojure.spec.alpha/and :portkey.aws.route53/test-dns-answer-response))

(clojure.core/defn update-traffic-policy-instance ([update-traffic-policy-instance-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-update-traffic-policy-instance-request update-traffic-policy-instance-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53/update-traffic-policy-instance-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/trafficpolicyinstance/{Id}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53/update-traffic-policy-instance-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateTrafficPolicyInstance", :http.request.configuration/output-deser-fn response-update-traffic-policy-instance-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53/invalid-input, "NoSuchTrafficPolicy" :portkey.aws.route53/no-such-traffic-policy, "NoSuchTrafficPolicyInstance" :portkey.aws.route53/no-such-traffic-policy-instance, "PriorRequestNotComplete" :portkey.aws.route53/prior-request-not-complete, "ConflictingTypes" :portkey.aws.route53/conflicting-types}})))))
(clojure.spec.alpha/fdef update-traffic-policy-instance :args (clojure.spec.alpha/tuple :portkey.aws.route53/update-traffic-policy-instance-request) :ret (clojure.spec.alpha/and :portkey.aws.route53/update-traffic-policy-instance-response))

(clojure.core/defn list-traffic-policy-instances-by-hosted-zone ([list-traffic-policy-instances-by-hosted-zone-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-list-traffic-policy-instances-by-hosted-zone-request list-traffic-policy-instances-by-hosted-zone-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53/list-traffic-policy-instances-by-hosted-zone-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/trafficpolicyinstances/hostedzone", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53/list-traffic-policy-instances-by-hosted-zone-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTrafficPolicyInstancesByHostedZone", :http.request.configuration/output-deser-fn response-list-traffic-policy-instances-by-hosted-zone-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53/invalid-input, "NoSuchTrafficPolicyInstance" :portkey.aws.route53/no-such-traffic-policy-instance, "NoSuchHostedZone" :portkey.aws.route53/no-such-hosted-zone}})))))
(clojure.spec.alpha/fdef list-traffic-policy-instances-by-hosted-zone :args (clojure.spec.alpha/tuple :portkey.aws.route53/list-traffic-policy-instances-by-hosted-zone-request) :ret (clojure.spec.alpha/and :portkey.aws.route53/list-traffic-policy-instances-by-hosted-zone-response))

(clojure.core/defn update-hosted-zone-comment ([update-hosted-zone-comment-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-update-hosted-zone-comment-request update-hosted-zone-comment-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53/update-hosted-zone-comment-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/hostedzone/{Id}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53/update-hosted-zone-comment-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateHostedZoneComment", :http.request.configuration/output-deser-fn response-update-hosted-zone-comment-response, :http.request.spec/error-spec {"NoSuchHostedZone" :portkey.aws.route53/no-such-hosted-zone, "InvalidInput" :portkey.aws.route53/invalid-input}})))))
(clojure.spec.alpha/fdef update-hosted-zone-comment :args (clojure.spec.alpha/tuple :portkey.aws.route53/update-hosted-zone-comment-request) :ret (clojure.spec.alpha/and :portkey.aws.route53/update-hosted-zone-comment-response))

(clojure.core/defn get-change ([get-change-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-change-request get-change-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53/get-change-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/change/{Id}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53/get-change-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetChange", :http.request.configuration/output-deser-fn response-get-change-response, :http.request.spec/error-spec {"NoSuchChange" :portkey.aws.route53/no-such-change, "InvalidInput" :portkey.aws.route53/invalid-input}})))))
(clojure.spec.alpha/fdef get-change :args (clojure.spec.alpha/tuple :portkey.aws.route53/get-change-request) :ret (clojure.spec.alpha/and :portkey.aws.route53/get-change-response))

(clojure.core/defn list-query-logging-configs ([] (list-query-logging-configs {})) ([list-query-logging-configs-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-list-query-logging-configs-request list-query-logging-configs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53/list-query-logging-configs-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/queryloggingconfig", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53/list-query-logging-configs-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListQueryLoggingConfigs", :http.request.configuration/output-deser-fn response-list-query-logging-configs-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53/invalid-input, "InvalidPaginationToken" :portkey.aws.route53/invalid-pagination-token, "NoSuchHostedZone" :portkey.aws.route53/no-such-hosted-zone}})))))
(clojure.spec.alpha/fdef list-query-logging-configs :args (clojure.spec.alpha/? :portkey.aws.route53/list-query-logging-configs-request) :ret (clojure.spec.alpha/and :portkey.aws.route53/list-query-logging-configs-response))

(clojure.core/defn create-health-check ([create-health-check-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-create-health-check-request create-health-check-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53/create-health-check-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/healthcheck", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53/create-health-check-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateHealthCheck", :http.request.configuration/output-deser-fn response-create-health-check-response, :http.request.spec/error-spec {"TooManyHealthChecks" :portkey.aws.route53/too-many-health-checks, "HealthCheckAlreadyExists" :portkey.aws.route53/health-check-already-exists, "InvalidInput" :portkey.aws.route53/invalid-input}})))))
(clojure.spec.alpha/fdef create-health-check :args (clojure.spec.alpha/tuple :portkey.aws.route53/create-health-check-request) :ret (clojure.spec.alpha/and :portkey.aws.route53/create-health-check-response))

(clojure.core/defn associate-vpc-with-hosted-zone ([associate-vpc-with-hosted-zone-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-associate-vpc-with-hosted-zone-request associate-vpc-with-hosted-zone-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53/associate-vpc-with-hosted-zone-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/hostedzone/{Id}/associatevpc", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53/associate-vpc-with-hosted-zone-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AssociateVPCWithHostedZone", :http.request.configuration/output-deser-fn response-associate-vpc-with-hosted-zone-response, :http.request.spec/error-spec {"NoSuchHostedZone" :portkey.aws.route53/no-such-hosted-zone, "NotAuthorizedException" :portkey.aws.route53/not-authorized-exception, "InvalidVPCId" :portkey.aws.route53/invalid-vpc-id, "InvalidInput" :portkey.aws.route53/invalid-input, "PublicZoneVPCAssociation" :portkey.aws.route53/public-zone-vpc-association, "ConflictingDomainExists" :portkey.aws.route53/conflicting-domain-exists, "LimitsExceeded" :portkey.aws.route53/limits-exceeded}})))))
(clojure.spec.alpha/fdef associate-vpc-with-hosted-zone :args (clojure.spec.alpha/tuple :portkey.aws.route53/associate-vpc-with-hosted-zone-request) :ret (clojure.spec.alpha/and :portkey.aws.route53/associate-vpc-with-hosted-zone-response))

(clojure.core/defn change-resource-record-sets ([change-resource-record-sets-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-change-resource-record-sets-request change-resource-record-sets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53/change-resource-record-sets-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/hostedzone/{Id}/rrset/", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53/change-resource-record-sets-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ChangeResourceRecordSets", :http.request.configuration/output-deser-fn response-change-resource-record-sets-response, :http.request.spec/error-spec {"NoSuchHostedZone" :portkey.aws.route53/no-such-hosted-zone, "NoSuchHealthCheck" :portkey.aws.route53/no-such-health-check, "InvalidChangeBatch" :portkey.aws.route53/invalid-change-batch, "InvalidInput" :portkey.aws.route53/invalid-input, "PriorRequestNotComplete" :portkey.aws.route53/prior-request-not-complete}})))))
(clojure.spec.alpha/fdef change-resource-record-sets :args (clojure.spec.alpha/tuple :portkey.aws.route53/change-resource-record-sets-request) :ret (clojure.spec.alpha/and :portkey.aws.route53/change-resource-record-sets-response))

(clojure.core/defn create-reusable-delegation-set ([create-reusable-delegation-set-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-create-reusable-delegation-set-request create-reusable-delegation-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53/create-reusable-delegation-set-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/delegationset", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53/create-reusable-delegation-set-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateReusableDelegationSet", :http.request.configuration/output-deser-fn response-create-reusable-delegation-set-response, :http.request.spec/error-spec {"DelegationSetAlreadyCreated" :portkey.aws.route53/delegation-set-already-created, "LimitsExceeded" :portkey.aws.route53/limits-exceeded, "HostedZoneNotFound" :portkey.aws.route53/hosted-zone-not-found, "InvalidArgument" :portkey.aws.route53/invalid-argument, "InvalidInput" :portkey.aws.route53/invalid-input, "DelegationSetNotAvailable" :portkey.aws.route53/delegation-set-not-available, "DelegationSetAlreadyReusable" :portkey.aws.route53/delegation-set-already-reusable}})))))
(clojure.spec.alpha/fdef create-reusable-delegation-set :args (clojure.spec.alpha/tuple :portkey.aws.route53/create-reusable-delegation-set-request) :ret (clojure.spec.alpha/and :portkey.aws.route53/create-reusable-delegation-set-response))

(clojure.core/defn list-resource-record-sets ([list-resource-record-sets-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-list-resource-record-sets-request list-resource-record-sets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53/list-resource-record-sets-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/hostedzone/{Id}/rrset", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53/list-resource-record-sets-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListResourceRecordSets", :http.request.configuration/output-deser-fn response-list-resource-record-sets-response, :http.request.spec/error-spec {"NoSuchHostedZone" :portkey.aws.route53/no-such-hosted-zone, "InvalidInput" :portkey.aws.route53/invalid-input}})))))
(clojure.spec.alpha/fdef list-resource-record-sets :args (clojure.spec.alpha/tuple :portkey.aws.route53/list-resource-record-sets-request) :ret (clojure.spec.alpha/and :portkey.aws.route53/list-resource-record-sets-response))

(clojure.core/defn get-hosted-zone-count ([] (get-hosted-zone-count {})) ([get-hosted-zone-count-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-hosted-zone-count-request get-hosted-zone-count-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53/get-hosted-zone-count-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/hostedzonecount", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53/get-hosted-zone-count-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetHostedZoneCount", :http.request.configuration/output-deser-fn response-get-hosted-zone-count-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53/invalid-input}})))))
(clojure.spec.alpha/fdef get-hosted-zone-count :args (clojure.spec.alpha/? :portkey.aws.route53/get-hosted-zone-count-request) :ret (clojure.spec.alpha/and :portkey.aws.route53/get-hosted-zone-count-response))

(clojure.core/defn get-health-check-last-failure-reason ([get-health-check-last-failure-reason-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-health-check-last-failure-reason-request get-health-check-last-failure-reason-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53/get-health-check-last-failure-reason-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/healthcheck/{HealthCheckId}/lastfailurereason", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53/get-health-check-last-failure-reason-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetHealthCheckLastFailureReason", :http.request.configuration/output-deser-fn response-get-health-check-last-failure-reason-response, :http.request.spec/error-spec {"NoSuchHealthCheck" :portkey.aws.route53/no-such-health-check, "InvalidInput" :portkey.aws.route53/invalid-input}})))))
(clojure.spec.alpha/fdef get-health-check-last-failure-reason :args (clojure.spec.alpha/tuple :portkey.aws.route53/get-health-check-last-failure-reason-request) :ret (clojure.spec.alpha/and :portkey.aws.route53/get-health-check-last-failure-reason-response))

(clojure.core/defn list-reusable-delegation-sets ([] (list-reusable-delegation-sets {})) ([list-reusable-delegation-sets-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-list-reusable-delegation-sets-request list-reusable-delegation-sets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53/list-reusable-delegation-sets-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/delegationset", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53/list-reusable-delegation-sets-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListReusableDelegationSets", :http.request.configuration/output-deser-fn response-list-reusable-delegation-sets-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53/invalid-input}})))))
(clojure.spec.alpha/fdef list-reusable-delegation-sets :args (clojure.spec.alpha/? :portkey.aws.route53/list-reusable-delegation-sets-request) :ret (clojure.spec.alpha/and :portkey.aws.route53/list-reusable-delegation-sets-response))

(clojure.core/defn delete-hosted-zone ([delete-hosted-zone-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-delete-hosted-zone-request delete-hosted-zone-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53/delete-hosted-zone-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/hostedzone/{Id}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53/delete-hosted-zone-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteHostedZone", :http.request.configuration/output-deser-fn response-delete-hosted-zone-response, :http.request.spec/error-spec {"NoSuchHostedZone" :portkey.aws.route53/no-such-hosted-zone, "HostedZoneNotEmpty" :portkey.aws.route53/hosted-zone-not-empty, "PriorRequestNotComplete" :portkey.aws.route53/prior-request-not-complete, "InvalidInput" :portkey.aws.route53/invalid-input, "InvalidDomainName" :portkey.aws.route53/invalid-domain-name}})))))
(clojure.spec.alpha/fdef delete-hosted-zone :args (clojure.spec.alpha/tuple :portkey.aws.route53/delete-hosted-zone-request) :ret (clojure.spec.alpha/and :portkey.aws.route53/delete-hosted-zone-response))

(clojure.core/defn get-query-logging-config ([get-query-logging-config-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-query-logging-config-request get-query-logging-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53/get-query-logging-config-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/queryloggingconfig/{Id}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53/get-query-logging-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetQueryLoggingConfig", :http.request.configuration/output-deser-fn response-get-query-logging-config-response, :http.request.spec/error-spec {"NoSuchQueryLoggingConfig" :portkey.aws.route53/no-such-query-logging-config, "InvalidInput" :portkey.aws.route53/invalid-input}})))))
(clojure.spec.alpha/fdef get-query-logging-config :args (clojure.spec.alpha/tuple :portkey.aws.route53/get-query-logging-config-request) :ret (clojure.spec.alpha/and :portkey.aws.route53/get-query-logging-config-response))
