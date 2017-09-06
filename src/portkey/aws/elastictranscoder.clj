(ns portkey.aws.elastictranscoder (:require [portkey.aws]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/fixedgop (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"(^true$)|(^false$)" s__36529__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.update-pipeline-status-request/status (clojure.spec.alpha/and :portkey.aws.elastictranscoder/pipeline-status))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder/update-pipeline-status-request (portkey.awsgen/json-keys :req-un [:portkey.aws.elastictranscoder/Id :portkey.aws.elastictranscoder.update-pipeline-status-request/Status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.create-preset-request/container (clojure.spec.alpha/and :portkey.aws.elastictranscoder/preset-container))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.create-preset-request/video (clojure.spec.alpha/and :portkey.aws.elastictranscoder/video-parameters))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.create-preset-request/audio (clojure.spec.alpha/and :portkey.aws.elastictranscoder/audio-parameters))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder/create-preset-request (portkey.awsgen/json-keys :req-un [:portkey.aws.elastictranscoder/Name :portkey.aws.elastictranscoder.create-preset-request/Container] :opt-un [:portkey.aws.elastictranscoder/Description :portkey.aws.elastictranscoder.create-preset-request/Video :portkey.aws.elastictranscoder.create-preset-request/Audio :portkey.aws.elastictranscoder/Thumbnails]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.artwork/input-key (clojure.spec.alpha/and :portkey.aws.elastictranscoder/watermark-key))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.artwork/max-width (clojure.spec.alpha/and :portkey.aws.elastictranscoder/digits-or-auto))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.artwork/max-height (clojure.spec.alpha/and :portkey.aws.elastictranscoder/digits-or-auto))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.artwork/album-art-format (clojure.spec.alpha/and :portkey.aws.elastictranscoder/jpg-or-png))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder/artwork (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.artwork/InputKey :portkey.aws.elastictranscoder.artwork/MaxWidth :portkey.aws.elastictranscoder.artwork/MaxHeight :portkey.aws.elastictranscoder/SizingPolicy :portkey.aws.elastictranscoder/PaddingPolicy :portkey.aws.elastictranscoder.artwork/AlbumArtFormat :portkey.aws.elastictranscoder/Encryption]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/sns-topic (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"(^$)|(^arn:aws:sns:.*:\w{12}:.+$)" s__36529__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/caption-sources (clojure.spec.alpha/coll-of :portkey.aws.elastictranscoder/caption-source :max-count 20))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/exception-messages (clojure.spec.alpha/coll-of :portkey.aws.elastictranscoder/string :max-count nil))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/presets (clojure.spec.alpha/coll-of :portkey.aws.elastictranscoder/preset :max-count nil))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/update-pipeline-status-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder/Pipeline]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/permissions (clojure.spec.alpha/coll-of :portkey.aws.elastictranscoder/permission :max-count 30))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/sizing-policy (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"(^Fit$)|(^Fill$)|(^Stretch$)|(^Keep$)|(^ShrinkToFit$)|(^ShrinkToFill$)" s__36529__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/create-pipeline-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder/Pipeline :portkey.aws.elastictranscoder/Warnings]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/codec-options (clojure.spec.alpha/map-of :portkey.aws.elastictranscoder/codec-option :portkey.aws.elastictranscoder/codec-option))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.play-ready-drm/format (clojure.spec.alpha/and :portkey.aws.elastictranscoder/play-ready-drm-format-string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.play-ready-drm/key (clojure.spec.alpha/and :portkey.aws.elastictranscoder/non-empty-base64-encoded-string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.play-ready-drm/key-md5 (clojure.spec.alpha/and :portkey.aws.elastictranscoder/non-empty-base64-encoded-string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.play-ready-drm/key-id (clojure.spec.alpha/and :portkey.aws.elastictranscoder/key-id-guid))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.play-ready-drm/initialization-vector (clojure.spec.alpha/and :portkey.aws.elastictranscoder/zero-to255-string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.play-ready-drm/license-acquisition-url (clojure.spec.alpha/and :portkey.aws.elastictranscoder/one-to512-string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder/play-ready-drm (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.play-ready-drm/Format :portkey.aws.elastictranscoder.play-ready-drm/Key :portkey.aws.elastictranscoder.play-ready-drm/KeyMd5 :portkey.aws.elastictranscoder.play-ready-drm/KeyId :portkey.aws.elastictranscoder.play-ready-drm/InitializationVector :portkey.aws.elastictranscoder.play-ready-drm/LicenseAcquisitionUrl]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/codec-option (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36527__auto__] (clojure.core/<= 1 (clojure.core/count s__36527__auto__))) (clojure.core/fn [s__36528__auto__] (clojure.core/< (clojure.core/count s__36528__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/cancel-job-response (portkey.awsgen/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/validation-exception (portkey.awsgen/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/job-status (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"(^Submitted$)|(^Progressing$)|(^Complete$)|(^Canceled$)|(^Error$)" s__36529__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/access-controls (clojure.spec.alpha/coll-of :portkey.aws.elastictranscoder/access-control :max-count 30))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/output-keys (clojure.spec.alpha/coll-of :portkey.aws.elastictranscoder/key :max-count 30))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.video-parameters/codec (clojure.spec.alpha/and :portkey.aws.elastictranscoder/video-codec))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.video-parameters/bit-rate (clojure.spec.alpha/and :portkey.aws.elastictranscoder/video-bit-rate))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.video-parameters/watermarks (clojure.spec.alpha/and :portkey.aws.elastictranscoder/preset-watermarks))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.video-parameters/max-height (clojure.spec.alpha/and :portkey.aws.elastictranscoder/digits-or-auto))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.video-parameters/display-aspect-ratio (clojure.spec.alpha/and :portkey.aws.elastictranscoder/aspect-ratio))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.video-parameters/max-width (clojure.spec.alpha/and :portkey.aws.elastictranscoder/digits-or-auto))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder/video-parameters (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder/FixedGOP :portkey.aws.elastictranscoder/SizingPolicy :portkey.aws.elastictranscoder/CodecOptions :portkey.aws.elastictranscoder.video-parameters/Codec :portkey.aws.elastictranscoder.video-parameters/BitRate :portkey.aws.elastictranscoder/KeyframesMaxDist :portkey.aws.elastictranscoder/Resolution :portkey.aws.elastictranscoder/FrameRate :portkey.aws.elastictranscoder/AspectRatio :portkey.aws.elastictranscoder/MaxFrameRate :portkey.aws.elastictranscoder.video-parameters/Watermarks :portkey.aws.elastictranscoder.video-parameters/MaxHeight :portkey.aws.elastictranscoder.video-parameters/DisplayAspectRatio :portkey.aws.elastictranscoder.video-parameters/MaxWidth :portkey.aws.elastictranscoder/PaddingPolicy]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.list-pipelines-request/page-token (clojure.spec.alpha/and :portkey.aws.elastictranscoder/id))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder/list-pipelines-request (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder/Ascending :portkey.aws.elastictranscoder.list-pipelines-request/PageToken]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/playlist-format (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"(^HLSv3$)|(^HLSv4$)|(^Smooth$)|(^MPEG-DASH$)" s__36529__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/warnings (clojure.spec.alpha/coll-of :portkey.aws.elastictranscoder/warning :max-count nil))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/job-watermarks (clojure.spec.alpha/coll-of :portkey.aws.elastictranscoder/job-watermark :max-count nil))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/composition (clojure.spec.alpha/coll-of :portkey.aws.elastictranscoder/clip :max-count nil))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/playlists (clojure.spec.alpha/coll-of :portkey.aws.elastictranscoder/playlist :max-count nil))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/play-ready-drm-format-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"(^microsoft$)|(^discretix-3.0$)" s__36529__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.permission/access (clojure.spec.alpha/and :portkey.aws.elastictranscoder/access-controls))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder/permission (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder/GranteeType :portkey.aws.elastictranscoder/Grantee :portkey.aws.elastictranscoder.permission/Access]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/key-storage-policy (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"(^NoStore$)|(^WithVariantPlaylists$)" s__36529__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/grantee-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"(^Canonical$)|(^Email$)|(^Group$)" s__36529__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.job-album-art/artwork (clojure.spec.alpha/and :portkey.aws.elastictranscoder/artworks))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder/job-album-art (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder/MergePolicy :portkey.aws.elastictranscoder.job-album-art/Artwork]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/encryption-mode (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"(^s3$)|(^s3-aws-kms$)|(^aes-cbc-pkcs7$)|(^aes-ctr$)|(^aes-gcm$)" s__36529__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.create-pipeline-request/input-bucket (clojure.spec.alpha/and :portkey.aws.elastictranscoder/bucket-name))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.create-pipeline-request/output-bucket (clojure.spec.alpha/and :portkey.aws.elastictranscoder/bucket-name))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.create-pipeline-request/aws-kms-key-arn (clojure.spec.alpha/and :portkey.aws.elastictranscoder/key-arn))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.create-pipeline-request/content-config (clojure.spec.alpha/and :portkey.aws.elastictranscoder/pipeline-output-config))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.create-pipeline-request/thumbnail-config (clojure.spec.alpha/and :portkey.aws.elastictranscoder/pipeline-output-config))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder/create-pipeline-request (portkey.awsgen/json-keys :req-un [:portkey.aws.elastictranscoder/Name :portkey.aws.elastictranscoder.create-pipeline-request/InputBucket :portkey.aws.elastictranscoder/Role] :opt-un [:portkey.aws.elastictranscoder.create-pipeline-request/OutputBucket :portkey.aws.elastictranscoder.create-pipeline-request/AwsKmsKeyArn :portkey.aws.elastictranscoder/Notifications :portkey.aws.elastictranscoder.create-pipeline-request/ContentConfig :portkey.aws.elastictranscoder.create-pipeline-request/ThumbnailConfig]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/jpg-or-png (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"(^jpg$)|(^png$)" s__36529__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.captions/merge-policy (clojure.spec.alpha/and :portkey.aws.elastictranscoder/caption-merge-policy))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder/captions (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.captions/MergePolicy :portkey.aws.elastictranscoder/CaptionSources :portkey.aws.elastictranscoder/CaptionFormats]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/keyframes-max-dist (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"^\d{1,6}$" s__36529__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/time-offset (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"(^[+-]?\d{1,5}(\.\d{0,3})?$)|(^[+-]?([0-1]?[0-9]:|2[0-3]:)?([0-5]?[0-9]:)?[0-5]?[0-9](\.\d{0,3})?$)" s__36529__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/audio-channels (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"(^auto$)|(^0$)|(^1$)|(^2$)" s__36529__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/caption-formats (clojure.spec.alpha/coll-of :portkey.aws.elastictranscoder/caption-format :max-count 4))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.job-watermark/input-key (clojure.spec.alpha/and :portkey.aws.elastictranscoder/watermark-key))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder/job-watermark (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder/PresetWatermarkId :portkey.aws.elastictranscoder.job-watermark/InputKey :portkey.aws.elastictranscoder/Encryption]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/create-job-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder/Job]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/pixels-or-percent (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"(^\d{1,3}(\.\d{0,5})?%$)|(^\d{1,4}?px$)" s__36529__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/caption-merge-policy (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"(^MergeOverride$)|(^MergeRetain$)|(^Override$)" s__36529__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.pipeline/input-bucket (clojure.spec.alpha/and :portkey.aws.elastictranscoder/bucket-name))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.pipeline/aws-kms-key-arn (clojure.spec.alpha/and :portkey.aws.elastictranscoder/key-arn))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.pipeline/output-bucket (clojure.spec.alpha/and :portkey.aws.elastictranscoder/bucket-name))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.pipeline/content-config (clojure.spec.alpha/and :portkey.aws.elastictranscoder/pipeline-output-config))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.pipeline/thumbnail-config (clojure.spec.alpha/and :portkey.aws.elastictranscoder/pipeline-output-config))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.pipeline/status (clojure.spec.alpha/and :portkey.aws.elastictranscoder/pipeline-status))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.pipeline/arn (clojure.spec.alpha/and :portkey.aws.elastictranscoder/string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder/pipeline (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.pipeline/InputBucket :portkey.aws.elastictranscoder.pipeline/AwsKmsKeyArn :portkey.aws.elastictranscoder.pipeline/OutputBucket :portkey.aws.elastictranscoder.pipeline/ContentConfig :portkey.aws.elastictranscoder.pipeline/ThumbnailConfig :portkey.aws.elastictranscoder.pipeline/Status :portkey.aws.elastictranscoder/Role :portkey.aws.elastictranscoder.pipeline/Arn :portkey.aws.elastictranscoder/Name :portkey.aws.elastictranscoder/Notifications :portkey.aws.elastictranscoder/Id]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/hls-content-protection-method (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"(^aes-128$)" s__36529__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.thumbnails/format (clojure.spec.alpha/and :portkey.aws.elastictranscoder/jpg-or-png))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.thumbnails/interval (clojure.spec.alpha/and :portkey.aws.elastictranscoder/digits))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.thumbnails/resolution (clojure.spec.alpha/and :portkey.aws.elastictranscoder/thumbnail-resolution))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.thumbnails/max-width (clojure.spec.alpha/and :portkey.aws.elastictranscoder/digits-or-auto))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.thumbnails/max-height (clojure.spec.alpha/and :portkey.aws.elastictranscoder/digits-or-auto))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder/thumbnails (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.thumbnails/Format :portkey.aws.elastictranscoder.thumbnails/Interval :portkey.aws.elastictranscoder.thumbnails/Resolution :portkey.aws.elastictranscoder/AspectRatio :portkey.aws.elastictranscoder.thumbnails/MaxWidth :portkey.aws.elastictranscoder.thumbnails/MaxHeight :portkey.aws.elastictranscoder/SizingPolicy :portkey.aws.elastictranscoder/PaddingPolicy]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/digits (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"^\d{1,5}$" s__36529__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/resource-in-use-exception (portkey.awsgen/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/watermark-sizing-policy (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"(^Fit$)|(^Stretch$)|(^ShrinkToFit$)" s__36529__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/limit-exceeded-exception (portkey.awsgen/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/resolution (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"(^auto$)|(^\d{1,5}x\d{1,5}$)" s__36529__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/cancel-job-request (portkey.awsgen/json-keys :req-un [:portkey.aws.elastictranscoder/Id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/artworks (clojure.spec.alpha/coll-of :portkey.aws.elastictranscoder/artwork :max-count nil))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/video-bit-rate (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"(^\d{2,5}$)|(^auto$)" s__36529__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/frame-rate (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"(^auto$)|(^10$)|(^15$)|(^23.97$)|(^24$)|(^25$)|(^29.97$)|(^30$)|(^50$)|(^60$)" s__36529__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/opacity (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"^\d{1,3}(\.\d{0,20})?$" s__36529__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.time-span/start-time (clojure.spec.alpha/and :portkey.aws.elastictranscoder/time))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.time-span/duration (clojure.spec.alpha/and :portkey.aws.elastictranscoder/time))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder/time-span (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.time-span/StartTime :portkey.aws.elastictranscoder.time-span/Duration]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/aspect-ratio (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"(^auto$)|(^1:1$)|(^4:3$)|(^3:2$)|(^16:9$)" s__36529__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/watermark-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36527__auto__] (clojure.core/<= 1 (clojure.core/count s__36527__auto__))) (clojure.core/fn [s__36528__auto__] (clojure.core/< (clojure.core/count s__36528__auto__) 1024)) (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"(^.{1,1020}.jpg$)|(^.{1,1019}.jpeg$)|(^.{1,1020}.png$)" s__36529__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/one-to512-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36527__auto__] (clojure.core/<= 1 (clojure.core/count s__36527__auto__))) (clojure.core/fn [s__36528__auto__] (clojure.core/< (clojure.core/count s__36528__auto__) 512))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/zero-to512-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36527__auto__] (clojure.core/<= 0 (clojure.core/count s__36527__auto__))) (clojure.core/fn [s__36528__auto__] (clojure.core/< (clojure.core/count s__36528__auto__) 512))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/thumbnail-pattern (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"(^$)|(^.*\{count\}.*$)" s__36529__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/read-job-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder/Job]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/pipeline-status (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"(^Active$)|(^Paused$)" s__36529__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.job-output/duration-millis (clojure.spec.alpha/and :portkey.aws.elastictranscoder/nullable-long))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.job-output/thumbnail-encryption (clojure.spec.alpha/and :portkey.aws.elastictranscoder/encryption))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.job-output/frame-rate (clojure.spec.alpha/and :portkey.aws.elastictranscoder/float-string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.job-output/status (clojure.spec.alpha/and :portkey.aws.elastictranscoder/job-status))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.job-output/preset-id (clojure.spec.alpha/and :portkey.aws.elastictranscoder/id))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.job-output/status-detail (clojure.spec.alpha/and :portkey.aws.elastictranscoder/description))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.job-output/width (clojure.spec.alpha/and :portkey.aws.elastictranscoder/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.job-output/watermarks (clojure.spec.alpha/and :portkey.aws.elastictranscoder/job-watermarks))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.job-output/applied-color-space-conversion (clojure.spec.alpha/and :portkey.aws.elastictranscoder/string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.job-output/duration (clojure.spec.alpha/and :portkey.aws.elastictranscoder/nullable-long))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.job-output/height (clojure.spec.alpha/and :portkey.aws.elastictranscoder/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.job-output/album-art (clojure.spec.alpha/and :portkey.aws.elastictranscoder/job-album-art))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.job-output/file-size (clojure.spec.alpha/and :portkey.aws.elastictranscoder/nullable-long))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.job-output/segment-duration (clojure.spec.alpha/and :portkey.aws.elastictranscoder/float-string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.job-output/id (clojure.spec.alpha/and :portkey.aws.elastictranscoder/string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder/job-output (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder/Composition :portkey.aws.elastictranscoder/Captions :portkey.aws.elastictranscoder.job-output/DurationMillis :portkey.aws.elastictranscoder.job-output/ThumbnailEncryption :portkey.aws.elastictranscoder.job-output/FrameRate :portkey.aws.elastictranscoder.job-output/Status :portkey.aws.elastictranscoder/ThumbnailPattern :portkey.aws.elastictranscoder.job-output/PresetId :portkey.aws.elastictranscoder/Key :portkey.aws.elastictranscoder.job-output/StatusDetail :portkey.aws.elastictranscoder.job-output/Width :portkey.aws.elastictranscoder.job-output/Watermarks :portkey.aws.elastictranscoder.job-output/AppliedColorSpaceConversion :portkey.aws.elastictranscoder.job-output/Duration :portkey.aws.elastictranscoder.job-output/Height :portkey.aws.elastictranscoder/Rotate :portkey.aws.elastictranscoder.job-output/AlbumArt :portkey.aws.elastictranscoder/Encryption :portkey.aws.elastictranscoder.job-output/FileSize :portkey.aws.elastictranscoder.job-output/SegmentDuration :portkey.aws.elastictranscoder.job-output/Id]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/user-metadata (clojure.spec.alpha/map-of :portkey.aws.elastictranscoder/string :portkey.aws.elastictranscoder/string))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/ascending (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"(^true$)|(^false$)" s__36529__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.detected-properties/width (clojure.spec.alpha/and :portkey.aws.elastictranscoder/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.detected-properties/height (clojure.spec.alpha/and :portkey.aws.elastictranscoder/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.detected-properties/frame-rate (clojure.spec.alpha/and :portkey.aws.elastictranscoder/float-string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.detected-properties/file-size (clojure.spec.alpha/and :portkey.aws.elastictranscoder/nullable-long))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.detected-properties/duration-millis (clojure.spec.alpha/and :portkey.aws.elastictranscoder/nullable-long))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder/detected-properties (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.detected-properties/Width :portkey.aws.elastictranscoder.detected-properties/Height :portkey.aws.elastictranscoder.detected-properties/FrameRate :portkey.aws.elastictranscoder.detected-properties/FileSize :portkey.aws.elastictranscoder.detected-properties/DurationMillis]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/incompatible-version-exception (portkey.awsgen/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.pipeline-output-config/bucket (clojure.spec.alpha/and :portkey.aws.elastictranscoder/bucket-name))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder/pipeline-output-config (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.pipeline-output-config/Bucket :portkey.aws.elastictranscoder/StorageClass :portkey.aws.elastictranscoder/Permissions]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36527__auto__] (clojure.core/<= 1 (clojure.core/count s__36527__auto__))) (clojure.core/fn [s__36528__auto__] (clojure.core/< (clojure.core/count s__36528__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.test-role-response/messages (clojure.spec.alpha/and :portkey.aws.elastictranscoder/exception-messages))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder/test-role-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder/Success :portkey.aws.elastictranscoder.test-role-response/Messages]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/sns-topics (clojure.spec.alpha/coll-of :portkey.aws.elastictranscoder/sns-topic :max-count 30))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/delete-pipeline-response (portkey.awsgen/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/role (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"^arn:aws:iam::\w{12}:role/.+$" s__36529__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/interlaced (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"(^auto$)|(^true$)|(^false$)" s__36529__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/max-frame-rate (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"(^10$)|(^15$)|(^23.97$)|(^24$)|(^25$)|(^29.97$)|(^30$)|(^50$)|(^60$)" s__36529__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.playlist/name (clojure.spec.alpha/and :portkey.aws.elastictranscoder/filename))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.playlist/format (clojure.spec.alpha/and :portkey.aws.elastictranscoder/playlist-format))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.playlist/status (clojure.spec.alpha/and :portkey.aws.elastictranscoder/job-status))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.playlist/status-detail (clojure.spec.alpha/and :portkey.aws.elastictranscoder/description))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder/playlist (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.playlist/Name :portkey.aws.elastictranscoder.playlist/Format :portkey.aws.elastictranscoder/OutputKeys :portkey.aws.elastictranscoder/HlsContentProtection :portkey.aws.elastictranscoder/PlayReadyDrm :portkey.aws.elastictranscoder.playlist/Status :portkey.aws.elastictranscoder.playlist/StatusDetail]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/delete-pipeline-request (portkey.awsgen/json-keys :req-un [:portkey.aws.elastictranscoder/Id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/success (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"(^true$)|(^false$)" s__36529__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.list-jobs-by-status-request/status (clojure.spec.alpha/and :portkey.aws.elastictranscoder/job-status))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.list-jobs-by-status-request/page-token (clojure.spec.alpha/and :portkey.aws.elastictranscoder/id))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder/list-jobs-by-status-request (portkey.awsgen/json-keys :req-un [:portkey.aws.elastictranscoder.list-jobs-by-status-request/Status] :opt-un [:portkey.aws.elastictranscoder/Ascending :portkey.aws.elastictranscoder.list-jobs-by-status-request/PageToken]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.warning/code (clojure.spec.alpha/and :portkey.aws.elastictranscoder/string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.warning/message (clojure.spec.alpha/and :portkey.aws.elastictranscoder/string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder/warning (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.warning/Code :portkey.aws.elastictranscoder.warning/Message]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.create-job-request/pipeline-id (clojure.spec.alpha/and :portkey.aws.elastictranscoder/id))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.create-job-request/input (clojure.spec.alpha/and :portkey.aws.elastictranscoder/job-input))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.create-job-request/inputs (clojure.spec.alpha/and :portkey.aws.elastictranscoder/job-inputs))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.create-job-request/output (clojure.spec.alpha/and :portkey.aws.elastictranscoder/create-job-output))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.create-job-request/outputs (clojure.spec.alpha/and :portkey.aws.elastictranscoder/create-job-outputs))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.create-job-request/output-key-prefix (clojure.spec.alpha/and :portkey.aws.elastictranscoder/key))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.create-job-request/playlists (clojure.spec.alpha/and :portkey.aws.elastictranscoder/create-job-playlists))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder/create-job-request (portkey.awsgen/json-keys :req-un [:portkey.aws.elastictranscoder.create-job-request/PipelineId] :opt-un [:portkey.aws.elastictranscoder.create-job-request/Input :portkey.aws.elastictranscoder.create-job-request/Inputs :portkey.aws.elastictranscoder.create-job-request/Output :portkey.aws.elastictranscoder.create-job-request/Outputs :portkey.aws.elastictranscoder.create-job-request/OutputKeyPrefix :portkey.aws.elastictranscoder.create-job-request/Playlists :portkey.aws.elastictranscoder/UserMetadata]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.audio-codec-options/profile (clojure.spec.alpha/and :portkey.aws.elastictranscoder/audio-codec-profile))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.audio-codec-options/bit-depth (clojure.spec.alpha/and :portkey.aws.elastictranscoder/audio-bit-depth))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.audio-codec-options/bit-order (clojure.spec.alpha/and :portkey.aws.elastictranscoder/audio-bit-order))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.audio-codec-options/signed (clojure.spec.alpha/and :portkey.aws.elastictranscoder/audio-signed))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder/audio-codec-options (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.audio-codec-options/Profile :portkey.aws.elastictranscoder.audio-codec-options/BitDepth :portkey.aws.elastictranscoder.audio-codec-options/BitOrder :portkey.aws.elastictranscoder.audio-codec-options/Signed]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/resource-not-found-exception (portkey.awsgen/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/float-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"^\d{1,5}(\.\d{0,5})?$" s__36529__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.timing/submit-time-millis (clojure.spec.alpha/and :portkey.aws.elastictranscoder/nullable-long))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.timing/start-time-millis (clojure.spec.alpha/and :portkey.aws.elastictranscoder/nullable-long))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.timing/finish-time-millis (clojure.spec.alpha/and :portkey.aws.elastictranscoder/nullable-long))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder/timing (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.timing/SubmitTimeMillis :portkey.aws.elastictranscoder.timing/StartTimeMillis :portkey.aws.elastictranscoder.timing/FinishTimeMillis]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/nullable-long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/read-preset-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder/Preset]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/audio-sample-rate (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"(^auto$)|(^22050$)|(^32000$)|(^44100$)|(^48000$)|(^96000$)|(^192000$)" s__36529__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.list-presets-request/page-token (clojure.spec.alpha/and :portkey.aws.elastictranscoder/id))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder/list-presets-request (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder/Ascending :portkey.aws.elastictranscoder.list-presets-request/PageToken]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/audio-bit-depth (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"(^8$)|(^16$)|(^24$)|(^32$)" s__36529__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36527__auto__] (clojure.core/<= 0 (clojure.core/count s__36527__auto__))) (clojure.core/fn [s__36528__auto__] (clojure.core/< (clojure.core/count s__36528__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.create-preset-response/warning (clojure.spec.alpha/and :portkey.aws.elastictranscoder/string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder/create-preset-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder/Preset :portkey.aws.elastictranscoder.create-preset-response/Warning]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/audio-packing-mode (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"(^SingleTrack$)|(^OneChannelPerTrack$)|(^OneChannelPerTrackWithMosTo8Tracks$)" s__36529__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/read-job-request (portkey.awsgen/json-keys :req-un [:portkey.aws.elastictranscoder/Id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/audio-bit-order (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"(^LittleEndian$)" s__36529__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/preset-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"(^System$)|(^Custom$)" s__36529__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.hls-content-protection/method (clojure.spec.alpha/and :portkey.aws.elastictranscoder/hls-content-protection-method))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.hls-content-protection/key (clojure.spec.alpha/and :portkey.aws.elastictranscoder/base64-encoded-string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.hls-content-protection/key-md5 (clojure.spec.alpha/and :portkey.aws.elastictranscoder/base64-encoded-string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.hls-content-protection/initialization-vector (clojure.spec.alpha/and :portkey.aws.elastictranscoder/zero-to255-string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.hls-content-protection/license-acquisition-url (clojure.spec.alpha/and :portkey.aws.elastictranscoder/zero-to512-string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder/hls-content-protection (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.hls-content-protection/Method :portkey.aws.elastictranscoder.hls-content-protection/Key :portkey.aws.elastictranscoder.hls-content-protection/KeyMd5 :portkey.aws.elastictranscoder.hls-content-protection/InitializationVector :portkey.aws.elastictranscoder.hls-content-protection/LicenseAcquisitionUrl :portkey.aws.elastictranscoder/KeyStoragePolicy]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/access-denied-exception (portkey.awsgen/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.caption-source/key (clojure.spec.alpha/and :portkey.aws.elastictranscoder/long-key))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.caption-source/language (clojure.spec.alpha/and :portkey.aws.elastictranscoder/key))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.caption-source/label (clojure.spec.alpha/and :portkey.aws.elastictranscoder/name))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder/caption-source (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.caption-source/Key :portkey.aws.elastictranscoder.caption-source/Language :portkey.aws.elastictranscoder/TimeOffset :portkey.aws.elastictranscoder.caption-source/Label :portkey.aws.elastictranscoder/Encryption]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.list-jobs-by-pipeline-response/next-page-token (clojure.spec.alpha/and :portkey.aws.elastictranscoder/id))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder/list-jobs-by-pipeline-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder/Jobs :portkey.aws.elastictranscoder.list-jobs-by-pipeline-response/NextPageToken]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/digits-or-auto (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"(^auto$)|(^\d{2,4}$)" s__36529__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.input-captions/merge-policy (clojure.spec.alpha/and :portkey.aws.elastictranscoder/caption-merge-policy))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder/input-captions (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.input-captions/MergePolicy :portkey.aws.elastictranscoder/CaptionSources]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/read-preset-request (portkey.awsgen/json-keys :req-un [:portkey.aws.elastictranscoder/Id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.audio-parameters/codec (clojure.spec.alpha/and :portkey.aws.elastictranscoder/audio-codec))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.audio-parameters/sample-rate (clojure.spec.alpha/and :portkey.aws.elastictranscoder/audio-sample-rate))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.audio-parameters/bit-rate (clojure.spec.alpha/and :portkey.aws.elastictranscoder/audio-bit-rate))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.audio-parameters/channels (clojure.spec.alpha/and :portkey.aws.elastictranscoder/audio-channels))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.audio-parameters/codec-options (clojure.spec.alpha/and :portkey.aws.elastictranscoder/audio-codec-options))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder/audio-parameters (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.audio-parameters/Codec :portkey.aws.elastictranscoder.audio-parameters/SampleRate :portkey.aws.elastictranscoder.audio-parameters/BitRate :portkey.aws.elastictranscoder.audio-parameters/Channels :portkey.aws.elastictranscoder/AudioPackingMode :portkey.aws.elastictranscoder.audio-parameters/CodecOptions]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/access-control (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"(^FullControl$)|(^Read$)|(^ReadAcp$)|(^WriteAcp$)" s__36529__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.list-jobs-by-status-response/next-page-token (clojure.spec.alpha/and :portkey.aws.elastictranscoder/id))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder/list-jobs-by-status-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder/Jobs :portkey.aws.elastictranscoder.list-jobs-by-status-response/NextPageToken]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/update-pipeline-notifications-request (portkey.awsgen/json-keys :req-un [:portkey.aws.elastictranscoder/Id :portkey.aws.elastictranscoder/Notifications] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/audio-codec-profile (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"(^auto$)|(^AAC-LC$)|(^HE-AAC$)|(^HE-AACv2$)" s__36529__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/video-codec (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"(^H\.264$)|(^vp8$)|(^vp9$)|(^mpeg2$)|(^gif$)" s__36529__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/vertical-align (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"(^Top$)|(^Bottom$)|(^Center$)" s__36529__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/rotate (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"(^auto$)|(^0$)|(^90$)|(^180$)|(^270$)" s__36529__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/audio-codec (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"(^AAC$)|(^vorbis$)|(^mp3$)|(^mp2$)|(^pcm$)|(^flac$)" s__36529__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/pipelines (clojure.spec.alpha/coll-of :portkey.aws.elastictranscoder/pipeline :max-count nil))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/audio-signed (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"(^Unsigned$)|(^Signed$)" s__36529__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/jobs (clojure.spec.alpha/coll-of :portkey.aws.elastictranscoder/job :max-count nil))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.preset/type (clojure.spec.alpha/and :portkey.aws.elastictranscoder/preset-type))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.preset/video (clojure.spec.alpha/and :portkey.aws.elastictranscoder/video-parameters))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.preset/audio (clojure.spec.alpha/and :portkey.aws.elastictranscoder/audio-parameters))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.preset/container (clojure.spec.alpha/and :portkey.aws.elastictranscoder/preset-container))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.preset/arn (clojure.spec.alpha/and :portkey.aws.elastictranscoder/string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder/preset (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.preset/Type :portkey.aws.elastictranscoder.preset/Video :portkey.aws.elastictranscoder.preset/Audio :portkey.aws.elastictranscoder/Thumbnails :portkey.aws.elastictranscoder.preset/Container :portkey.aws.elastictranscoder/Description :portkey.aws.elastictranscoder.preset/Arn :portkey.aws.elastictranscoder/Name :portkey.aws.elastictranscoder/Id]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.update-pipeline-request/input-bucket (clojure.spec.alpha/and :portkey.aws.elastictranscoder/bucket-name))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.update-pipeline-request/aws-kms-key-arn (clojure.spec.alpha/and :portkey.aws.elastictranscoder/key-arn))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.update-pipeline-request/content-config (clojure.spec.alpha/and :portkey.aws.elastictranscoder/pipeline-output-config))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.update-pipeline-request/thumbnail-config (clojure.spec.alpha/and :portkey.aws.elastictranscoder/pipeline-output-config))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder/update-pipeline-request (portkey.awsgen/json-keys :req-un [:portkey.aws.elastictranscoder/Id] :opt-un [:portkey.aws.elastictranscoder/Name :portkey.aws.elastictranscoder.update-pipeline-request/InputBucket :portkey.aws.elastictranscoder/Role :portkey.aws.elastictranscoder.update-pipeline-request/AwsKmsKeyArn :portkey.aws.elastictranscoder/Notifications :portkey.aws.elastictranscoder.update-pipeline-request/ContentConfig :portkey.aws.elastictranscoder.update-pipeline-request/ThumbnailConfig]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/filename (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36527__auto__] (clojure.core/<= 1 (clojure.core/count s__36527__auto__))) (clojure.core/fn [s__36528__auto__] (clojure.core/< (clojure.core/count s__36528__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/update-pipeline-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder/Pipeline :portkey.aws.elastictranscoder/Warnings]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/preset-watermarks (clojure.spec.alpha/coll-of :portkey.aws.elastictranscoder/preset-watermark :max-count nil))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/key-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36527__auto__] (clojure.core/<= 0 (clojure.core/count s__36527__auto__))) (clojure.core/fn [s__36528__auto__] (clojure.core/< (clojure.core/count s__36528__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/clip (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder/TimeSpan]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/merge-policy (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"(^Replace$)|(^Prepend$)|(^Append$)|(^Fallback$)" s__36529__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.encryption/mode (clojure.spec.alpha/and :portkey.aws.elastictranscoder/encryption-mode))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.encryption/key (clojure.spec.alpha/and :portkey.aws.elastictranscoder/base64-encoded-string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.encryption/key-md5 (clojure.spec.alpha/and :portkey.aws.elastictranscoder/base64-encoded-string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.encryption/initialization-vector (clojure.spec.alpha/and :portkey.aws.elastictranscoder/zero-to255-string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder/encryption (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.encryption/Mode :portkey.aws.elastictranscoder.encryption/Key :portkey.aws.elastictranscoder.encryption/KeyMd5 :portkey.aws.elastictranscoder.encryption/InitializationVector]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.list-pipelines-response/next-page-token (clojure.spec.alpha/and :portkey.aws.elastictranscoder/id))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder/list-pipelines-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder/Pipelines :portkey.aws.elastictranscoder.list-pipelines-response/NextPageToken]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/job-container (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"(^auto$)|(^3gp$)|(^asf$)|(^avi$)|(^divx$)|(^flv$)|(^mkv$)|(^mov$)|(^mp4$)|(^mpeg$)|(^mpeg-ps$)|(^mpeg-ts$)|(^mxf$)|(^ogg$)|(^ts$)|(^vob$)|(^wav$)|(^webm$)|(^mp3$)|(^m4a$)|(^aac$)" s__36529__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/preset-container (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"(^mp4$)|(^ts$)|(^webm$)|(^mp3$)|(^flac$)|(^oga$)|(^ogg$)|(^fmp4$)|(^mpg$)|(^flv$)|(^gif$)|(^mxf$)|(^wav$)" s__36529__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.job-input/key (clojure.spec.alpha/and :portkey.aws.elastictranscoder/long-key))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.job-input/container (clojure.spec.alpha/and :portkey.aws.elastictranscoder/job-container))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder/job-input (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder/Resolution :portkey.aws.elastictranscoder/FrameRate :portkey.aws.elastictranscoder/TimeSpan :portkey.aws.elastictranscoder/AspectRatio :portkey.aws.elastictranscoder/DetectedProperties :portkey.aws.elastictranscoder.job-input/Key :portkey.aws.elastictranscoder/Interlaced :portkey.aws.elastictranscoder.job-input/Container :portkey.aws.elastictranscoder/InputCaptions :portkey.aws.elastictranscoder/Encryption]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/thumbnail-resolution (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"^\d{1,5}x\d{1,5}$" s__36529__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/read-pipeline-request (portkey.awsgen/json-keys :req-un [:portkey.aws.elastictranscoder/Id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.list-presets-response/next-page-token (clojure.spec.alpha/and :portkey.aws.elastictranscoder/id))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder/list-presets-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder/Presets :portkey.aws.elastictranscoder.list-presets-response/NextPageToken]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/nullable-integer (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.job/status (clojure.spec.alpha/and :portkey.aws.elastictranscoder/job-status))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.job/outputs (clojure.spec.alpha/and :portkey.aws.elastictranscoder/job-outputs))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.job/pipeline-id (clojure.spec.alpha/and :portkey.aws.elastictranscoder/id))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.job/output-key-prefix (clojure.spec.alpha/and :portkey.aws.elastictranscoder/key))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.job/inputs (clojure.spec.alpha/and :portkey.aws.elastictranscoder/job-inputs))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.job/input (clojure.spec.alpha/and :portkey.aws.elastictranscoder/job-input))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.job/arn (clojure.spec.alpha/and :portkey.aws.elastictranscoder/string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.job/output (clojure.spec.alpha/and :portkey.aws.elastictranscoder/job-output))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder/job (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder/Playlists :portkey.aws.elastictranscoder.job/Status :portkey.aws.elastictranscoder.job/Outputs :portkey.aws.elastictranscoder/UserMetadata :portkey.aws.elastictranscoder.job/PipelineId :portkey.aws.elastictranscoder.job/OutputKeyPrefix :portkey.aws.elastictranscoder/Timing :portkey.aws.elastictranscoder.job/Inputs :portkey.aws.elastictranscoder.job/Input :portkey.aws.elastictranscoder.job/Arn :portkey.aws.elastictranscoder.job/Output :portkey.aws.elastictranscoder/Id]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/key-id-guid (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"(^[0-9A-Fa-f]{8}-[0-9A-Fa-f]{4}-[0-9A-Fa-f]{4}-[0-9A-Fa-f]{4}-[0-9A-Fa-f]{12}$)|(^[0-9A-Fa-f]{32}$)" s__36529__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/target (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"(^Content$)|(^Frame$)" s__36529__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36527__auto__] (clojure.core/<= 1 (clojure.core/count s__36527__auto__))) (clojure.core/fn [s__36528__auto__] (clojure.core/< (clojure.core/count s__36528__auto__) 40))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/create-job-outputs (clojure.spec.alpha/coll-of :portkey.aws.elastictranscoder/create-job-output :max-count 30))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/preset-watermark-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36527__auto__] (clojure.core/<= 1 (clojure.core/count s__36527__auto__))) (clojure.core/fn [s__36528__auto__] (clojure.core/< (clojure.core/count s__36528__auto__) 40))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/storage-class (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"(^ReducedRedundancy$)|(^Standard$)" s__36529__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.list-jobs-by-pipeline-request/pipeline-id (clojure.spec.alpha/and :portkey.aws.elastictranscoder/id))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.list-jobs-by-pipeline-request/page-token (clojure.spec.alpha/and :portkey.aws.elastictranscoder/id))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder/list-jobs-by-pipeline-request (portkey.awsgen/json-keys :req-un [:portkey.aws.elastictranscoder.list-jobs-by-pipeline-request/PipelineId] :opt-un [:portkey.aws.elastictranscoder/Ascending :portkey.aws.elastictranscoder.list-jobs-by-pipeline-request/PageToken]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/grantee (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36527__auto__] (clojure.core/<= 1 (clojure.core/count s__36527__auto__))) (clojure.core/fn [s__36528__auto__] (clojure.core/< (clojure.core/count s__36528__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/caption-format-format (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"(^mov-text$)|(^srt$)|(^scc$)|(^webvtt$)|(^dfxp$)|(^cea-708$)" s__36529__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/non-empty-base64-encoded-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"(^(?:[A-Za-z0-9\+/]{4})*(?:[A-Za-z0-9\+/]{2}==|[A-Za-z0-9\+/]{3}=)?$)" s__36529__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.preset-watermark/sizing-policy (clojure.spec.alpha/and :portkey.aws.elastictranscoder/watermark-sizing-policy))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.preset-watermark/horizontal-offset (clojure.spec.alpha/and :portkey.aws.elastictranscoder/pixels-or-percent))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.preset-watermark/vertical-offset (clojure.spec.alpha/and :portkey.aws.elastictranscoder/pixels-or-percent))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.preset-watermark/max-height (clojure.spec.alpha/and :portkey.aws.elastictranscoder/pixels-or-percent))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.preset-watermark/max-width (clojure.spec.alpha/and :portkey.aws.elastictranscoder/pixels-or-percent))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.preset-watermark/id (clojure.spec.alpha/and :portkey.aws.elastictranscoder/preset-watermark-id))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder/preset-watermark (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.preset-watermark/SizingPolicy :portkey.aws.elastictranscoder/Opacity :portkey.aws.elastictranscoder.preset-watermark/HorizontalOffset :portkey.aws.elastictranscoder.preset-watermark/VerticalOffset :portkey.aws.elastictranscoder.preset-watermark/MaxHeight :portkey.aws.elastictranscoder/VerticalAlign :portkey.aws.elastictranscoder/Target :portkey.aws.elastictranscoder.preset-watermark/MaxWidth :portkey.aws.elastictranscoder.preset-watermark/Id :portkey.aws.elastictranscoder/HorizontalAlign]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/bucket-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"^(\w|\.|-){1,255}$" s__36529__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/audio-bit-rate (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"^\d{1,3}$" s__36529__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.notifications/progressing (clojure.spec.alpha/and :portkey.aws.elastictranscoder/sns-topic))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.notifications/completed (clojure.spec.alpha/and :portkey.aws.elastictranscoder/sns-topic))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.notifications/warning (clojure.spec.alpha/and :portkey.aws.elastictranscoder/sns-topic))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.notifications/error (clojure.spec.alpha/and :portkey.aws.elastictranscoder/sns-topic))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder/notifications (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.notifications/Progressing :portkey.aws.elastictranscoder.notifications/Completed :portkey.aws.elastictranscoder.notifications/Warning :portkey.aws.elastictranscoder.notifications/Error]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/job-inputs (clojure.spec.alpha/coll-of :portkey.aws.elastictranscoder/job-input :max-count 10000))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/delete-preset-request (portkey.awsgen/json-keys :req-un [:portkey.aws.elastictranscoder/Id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/internal-service-exception (portkey.awsgen/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.test-role-request/input-bucket (clojure.spec.alpha/and :portkey.aws.elastictranscoder/bucket-name))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.test-role-request/output-bucket (clojure.spec.alpha/and :portkey.aws.elastictranscoder/bucket-name))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.test-role-request/topics (clojure.spec.alpha/and :portkey.aws.elastictranscoder/sns-topics))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder/test-role-request (portkey.awsgen/json-keys :req-un [:portkey.aws.elastictranscoder/Role :portkey.aws.elastictranscoder.test-role-request/InputBucket :portkey.aws.elastictranscoder.test-role-request/OutputBucket :portkey.aws.elastictranscoder.test-role-request/Topics] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.caption-format/format (clojure.spec.alpha/and :portkey.aws.elastictranscoder/caption-format-format))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.caption-format/pattern (clojure.spec.alpha/and :portkey.aws.elastictranscoder/caption-format-pattern))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder/caption-format (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.caption-format/Format :portkey.aws.elastictranscoder.caption-format/Pattern :portkey.aws.elastictranscoder/Encryption]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/base64-encoded-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"^$|(^(?:[A-Za-z0-9\+/]{4})*(?:[A-Za-z0-9\+/]{2}==|[A-Za-z0-9\+/]{3}=)?$)" s__36529__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/padding-policy (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"(^Pad$)|(^NoPad$)" s__36529__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"^\d{13}-\w{6}$" s__36529__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/read-pipeline-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder/Pipeline :portkey.aws.elastictranscoder/Warnings]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/delete-preset-response (portkey.awsgen/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/time (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"(^\d{1,5}(\.\d{0,3})?$)|(^([0-1]?[0-9]:|2[0-3]:)?([0-5]?[0-9]:)?[0-5]?[0-9](\.\d{0,3})?$)" s__36529__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/long-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36527__auto__] (clojure.core/<= 1 (clojure.core/count s__36527__auto__))) (clojure.core/fn [s__36528__auto__] (clojure.core/< (clojure.core/count s__36528__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/zero-to255-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36527__auto__] (clojure.core/<= 0 (clojure.core/count s__36527__auto__))) (clojure.core/fn [s__36528__auto__] (clojure.core/< (clojure.core/count s__36528__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/job-outputs (clojure.spec.alpha/coll-of :portkey.aws.elastictranscoder/job-output :max-count nil))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.create-job-playlist/name (clojure.spec.alpha/and :portkey.aws.elastictranscoder/filename))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.create-job-playlist/format (clojure.spec.alpha/and :portkey.aws.elastictranscoder/playlist-format))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder/create-job-playlist (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.create-job-playlist/Name :portkey.aws.elastictranscoder.create-job-playlist/Format :portkey.aws.elastictranscoder/OutputKeys :portkey.aws.elastictranscoder/HlsContentProtection :portkey.aws.elastictranscoder/PlayReadyDrm]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/create-job-playlists (clojure.spec.alpha/coll-of :portkey.aws.elastictranscoder/create-job-playlist :max-count 30))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/caption-format-pattern (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"(^$)|(^.*\{language\}.*$)" s__36529__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/update-pipeline-notifications-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder/Pipeline]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.create-job-output/thumbnail-encryption (clojure.spec.alpha/and :portkey.aws.elastictranscoder/encryption))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.create-job-output/preset-id (clojure.spec.alpha/and :portkey.aws.elastictranscoder/id))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.create-job-output/watermarks (clojure.spec.alpha/and :portkey.aws.elastictranscoder/job-watermarks))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.create-job-output/album-art (clojure.spec.alpha/and :portkey.aws.elastictranscoder/job-album-art))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.create-job-output/segment-duration (clojure.spec.alpha/and :portkey.aws.elastictranscoder/float-string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder/create-job-output (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder/Composition :portkey.aws.elastictranscoder/Captions :portkey.aws.elastictranscoder.create-job-output/ThumbnailEncryption :portkey.aws.elastictranscoder/ThumbnailPattern :portkey.aws.elastictranscoder.create-job-output/PresetId :portkey.aws.elastictranscoder/Key :portkey.aws.elastictranscoder.create-job-output/Watermarks :portkey.aws.elastictranscoder/Rotate :portkey.aws.elastictranscoder.create-job-output/AlbumArt :portkey.aws.elastictranscoder/Encryption :portkey.aws.elastictranscoder.create-job-output/SegmentDuration]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder/horizontal-align (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36529__auto__] (clojure.core/re-matches #"(^Left$)|(^Right$)|(^Center$)" s__36529__auto__))))

(clojure.core/defn create-pipeline ([input__36693__auto__] (create-pipeline input__36693__auto__ portkey.aws/*http-client*)) ([input37775 http-client__36694__auto__] (clojure.core/let [req__36695__auto__ (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url "https://lambda.eu-central-1.amazonaws.com/2012-09-25/pipelines", :body (clojure.spec.alpha/unform :portkey.aws.elastictranscoder/CreatePipelineRequest input37775)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__36692__36696__auto__] (clojure.core/some-> p1__36692__36696__auto__ cheshire.core/generate-string))))] (http-client__36694__auto__ {:method "POST", :headers {"content-type" "application/json"}, :url "https://lambda.eu-central-1.amazonaws.com/2012-09-25/pipelines", :body body__36697__auto__} (clojure.core/fn [response37774] (clojure.core/let [errors__36698__auto__ {"ValidationException" :portkey.aws.elastictranscoder/validation-exception, "IncompatibleVersionException" :portkey.aws.elastictranscoder/incompatible-version-exception, "AccessDeniedException" :portkey.aws.elastictranscoder/access-denied-exception, "ResourceNotFoundException" :portkey.aws.elastictranscoder/resource-not-found-exception, "LimitExceededException" :portkey.aws.elastictranscoder/limit-exceeded-exception, "InternalServiceException" :portkey.aws.elastictranscoder/internal-service-exception}] (if (clojure.core/= 201 (:status response37774)) (clojure.spec.alpha/unform :portkey.aws.elastictranscoder/create-pipeline-response (:body response37774)) (clojure.core/if-some [[type__36699__auto__ spec__36700__auto__] (clojure.core/find errors__36698__auto__ (clojure.core/get-in response37774 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__36701__auto__ (clojure.spec.alpha/unform spec__36700__auto__ (cheshire.core/parse-string (:body response37774)))] (throw (clojure.core/ex-info (clojure.core/str type__36699__auto__ ": " (:message m__36701__auto__)) m__36701__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response37774}))))))))))

(clojure.core/defn list-pipelines ([input__36693__auto__] (list-pipelines input__36693__auto__ portkey.aws/*http-client*)) ([input37777 http-client__36694__auto__] (clojure.core/let [req__36695__auto__ (clojure.core/-> {:method "GET", :headers {"content-type" "application/json"}, :url "https://lambda.eu-central-1.amazonaws.com/2012-09-25/pipelines", :body (clojure.spec.alpha/unform :portkey.aws.elastictranscoder/ListPipelinesRequest input37777)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {"Ascending" "Ascending", "PageToken" "PageToken"}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__36692__36696__auto__] (clojure.core/some-> p1__36692__36696__auto__ cheshire.core/generate-string))))] (http-client__36694__auto__ {:method "GET", :headers {"content-type" "application/json"}, :url "https://lambda.eu-central-1.amazonaws.com/2012-09-25/pipelines", :body body__36697__auto__} (clojure.core/fn [response37776] (clojure.core/let [errors__36698__auto__ {"ValidationException" :portkey.aws.elastictranscoder/validation-exception, "IncompatibleVersionException" :portkey.aws.elastictranscoder/incompatible-version-exception, "AccessDeniedException" :portkey.aws.elastictranscoder/access-denied-exception, "InternalServiceException" :portkey.aws.elastictranscoder/internal-service-exception}] (if (clojure.core/= nil (:status response37776)) (clojure.spec.alpha/unform :portkey.aws.elastictranscoder/list-pipelines-response (:body response37776)) (clojure.core/if-some [[type__36699__auto__ spec__36700__auto__] (clojure.core/find errors__36698__auto__ (clojure.core/get-in response37776 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__36701__auto__ (clojure.spec.alpha/unform spec__36700__auto__ (cheshire.core/parse-string (:body response37776)))] (throw (clojure.core/ex-info (clojure.core/str type__36699__auto__ ": " (:message m__36701__auto__)) m__36701__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response37776}))))))))))

(clojure.core/defn read-preset ([input__36693__auto__] (read-preset input__36693__auto__ portkey.aws/*http-client*)) ([input37779 http-client__36694__auto__] (clojure.core/let [req__36695__auto__ (clojure.core/-> {:method "GET", :headers {"content-type" "application/json"}, :url "https://lambda.eu-central-1.amazonaws.com/2012-09-25/presets/{Id}", :body (clojure.spec.alpha/unform :portkey.aws.elastictranscoder/ReadPresetRequest input37779)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {"Id" "Id"}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__36692__36696__auto__] (clojure.core/some-> p1__36692__36696__auto__ cheshire.core/generate-string))))] (http-client__36694__auto__ {:method "GET", :headers {"content-type" "application/json"}, :url "https://lambda.eu-central-1.amazonaws.com/2012-09-25/presets/{Id}", :body body__36697__auto__} (clojure.core/fn [response37778] (clojure.core/let [errors__36698__auto__ {"ValidationException" :portkey.aws.elastictranscoder/validation-exception, "IncompatibleVersionException" :portkey.aws.elastictranscoder/incompatible-version-exception, "ResourceNotFoundException" :portkey.aws.elastictranscoder/resource-not-found-exception, "AccessDeniedException" :portkey.aws.elastictranscoder/access-denied-exception, "InternalServiceException" :portkey.aws.elastictranscoder/internal-service-exception}] (if (clojure.core/= nil (:status response37778)) (clojure.spec.alpha/unform :portkey.aws.elastictranscoder/read-preset-response (:body response37778)) (clojure.core/if-some [[type__36699__auto__ spec__36700__auto__] (clojure.core/find errors__36698__auto__ (clojure.core/get-in response37778 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__36701__auto__ (clojure.spec.alpha/unform spec__36700__auto__ (cheshire.core/parse-string (:body response37778)))] (throw (clojure.core/ex-info (clojure.core/str type__36699__auto__ ": " (:message m__36701__auto__)) m__36701__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response37778}))))))))))

(clojure.core/defn read-pipeline ([input__36693__auto__] (read-pipeline input__36693__auto__ portkey.aws/*http-client*)) ([input37781 http-client__36694__auto__] (clojure.core/let [req__36695__auto__ (clojure.core/-> {:method "GET", :headers {"content-type" "application/json"}, :url "https://lambda.eu-central-1.amazonaws.com/2012-09-25/pipelines/{Id}", :body (clojure.spec.alpha/unform :portkey.aws.elastictranscoder/ReadPipelineRequest input37781)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {"Id" "Id"}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__36692__36696__auto__] (clojure.core/some-> p1__36692__36696__auto__ cheshire.core/generate-string))))] (http-client__36694__auto__ {:method "GET", :headers {"content-type" "application/json"}, :url "https://lambda.eu-central-1.amazonaws.com/2012-09-25/pipelines/{Id}", :body body__36697__auto__} (clojure.core/fn [response37780] (clojure.core/let [errors__36698__auto__ {"ValidationException" :portkey.aws.elastictranscoder/validation-exception, "IncompatibleVersionException" :portkey.aws.elastictranscoder/incompatible-version-exception, "ResourceNotFoundException" :portkey.aws.elastictranscoder/resource-not-found-exception, "AccessDeniedException" :portkey.aws.elastictranscoder/access-denied-exception, "InternalServiceException" :portkey.aws.elastictranscoder/internal-service-exception}] (if (clojure.core/= nil (:status response37780)) (clojure.spec.alpha/unform :portkey.aws.elastictranscoder/read-pipeline-response (:body response37780)) (clojure.core/if-some [[type__36699__auto__ spec__36700__auto__] (clojure.core/find errors__36698__auto__ (clojure.core/get-in response37780 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__36701__auto__ (clojure.spec.alpha/unform spec__36700__auto__ (cheshire.core/parse-string (:body response37780)))] (throw (clojure.core/ex-info (clojure.core/str type__36699__auto__ ": " (:message m__36701__auto__)) m__36701__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response37780}))))))))))

(clojure.core/defn list-jobs-by-pipeline ([input__36693__auto__] (list-jobs-by-pipeline input__36693__auto__ portkey.aws/*http-client*)) ([input37783 http-client__36694__auto__] (clojure.core/let [req__36695__auto__ (clojure.core/-> {:method "GET", :headers {"content-type" "application/json"}, :url "https://lambda.eu-central-1.amazonaws.com/2012-09-25/jobsByPipeline/{PipelineId}", :body (clojure.spec.alpha/unform :portkey.aws.elastictranscoder/ListJobsByPipelineRequest input37783)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {"PipelineId" "PipelineId"}) (portkey.awsgen/params-to-querystring {"Ascending" "Ascending", "PageToken" "PageToken"}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__36692__36696__auto__] (clojure.core/some-> p1__36692__36696__auto__ cheshire.core/generate-string))))] (http-client__36694__auto__ {:method "GET", :headers {"content-type" "application/json"}, :url "https://lambda.eu-central-1.amazonaws.com/2012-09-25/jobsByPipeline/{PipelineId}", :body body__36697__auto__} (clojure.core/fn [response37782] (clojure.core/let [errors__36698__auto__ {"ValidationException" :portkey.aws.elastictranscoder/validation-exception, "IncompatibleVersionException" :portkey.aws.elastictranscoder/incompatible-version-exception, "ResourceNotFoundException" :portkey.aws.elastictranscoder/resource-not-found-exception, "AccessDeniedException" :portkey.aws.elastictranscoder/access-denied-exception, "InternalServiceException" :portkey.aws.elastictranscoder/internal-service-exception}] (if (clojure.core/= nil (:status response37782)) (clojure.spec.alpha/unform :portkey.aws.elastictranscoder/list-jobs-by-pipeline-response (:body response37782)) (clojure.core/if-some [[type__36699__auto__ spec__36700__auto__] (clojure.core/find errors__36698__auto__ (clojure.core/get-in response37782 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__36701__auto__ (clojure.spec.alpha/unform spec__36700__auto__ (cheshire.core/parse-string (:body response37782)))] (throw (clojure.core/ex-info (clojure.core/str type__36699__auto__ ": " (:message m__36701__auto__)) m__36701__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response37782}))))))))))

(clojure.core/defn update-pipeline-notifications ([input__36693__auto__] (update-pipeline-notifications input__36693__auto__ portkey.aws/*http-client*)) ([input37785 http-client__36694__auto__] (clojure.core/let [req__36695__auto__ (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url "https://lambda.eu-central-1.amazonaws.com/2012-09-25/pipelines/{Id}/notifications", :body (clojure.spec.alpha/unform :portkey.aws.elastictranscoder/UpdatePipelineNotificationsRequest input37785)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {"Id" "Id"}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__36692__36696__auto__] (clojure.core/some-> p1__36692__36696__auto__ cheshire.core/generate-string))))] (http-client__36694__auto__ {:method "POST", :headers {"content-type" "application/json"}, :url "https://lambda.eu-central-1.amazonaws.com/2012-09-25/pipelines/{Id}/notifications", :body body__36697__auto__} (clojure.core/fn [response37784] (clojure.core/let [errors__36698__auto__ {"ValidationException" :portkey.aws.elastictranscoder/validation-exception, "IncompatibleVersionException" :portkey.aws.elastictranscoder/incompatible-version-exception, "ResourceNotFoundException" :portkey.aws.elastictranscoder/resource-not-found-exception, "ResourceInUseException" :portkey.aws.elastictranscoder/resource-in-use-exception, "AccessDeniedException" :portkey.aws.elastictranscoder/access-denied-exception, "InternalServiceException" :portkey.aws.elastictranscoder/internal-service-exception}] (if (clojure.core/= nil (:status response37784)) (clojure.spec.alpha/unform :portkey.aws.elastictranscoder/update-pipeline-notifications-response (:body response37784)) (clojure.core/if-some [[type__36699__auto__ spec__36700__auto__] (clojure.core/find errors__36698__auto__ (clojure.core/get-in response37784 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__36701__auto__ (clojure.spec.alpha/unform spec__36700__auto__ (cheshire.core/parse-string (:body response37784)))] (throw (clojure.core/ex-info (clojure.core/str type__36699__auto__ ": " (:message m__36701__auto__)) m__36701__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response37784}))))))))))

(clojure.core/defn create-preset ([input__36693__auto__] (create-preset input__36693__auto__ portkey.aws/*http-client*)) ([input37787 http-client__36694__auto__] (clojure.core/let [req__36695__auto__ (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url "https://lambda.eu-central-1.amazonaws.com/2012-09-25/presets", :body (clojure.spec.alpha/unform :portkey.aws.elastictranscoder/CreatePresetRequest input37787)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__36692__36696__auto__] (clojure.core/some-> p1__36692__36696__auto__ cheshire.core/generate-string))))] (http-client__36694__auto__ {:method "POST", :headers {"content-type" "application/json"}, :url "https://lambda.eu-central-1.amazonaws.com/2012-09-25/presets", :body body__36697__auto__} (clojure.core/fn [response37786] (clojure.core/let [errors__36698__auto__ {"ValidationException" :portkey.aws.elastictranscoder/validation-exception, "IncompatibleVersionException" :portkey.aws.elastictranscoder/incompatible-version-exception, "AccessDeniedException" :portkey.aws.elastictranscoder/access-denied-exception, "LimitExceededException" :portkey.aws.elastictranscoder/limit-exceeded-exception, "InternalServiceException" :portkey.aws.elastictranscoder/internal-service-exception}] (if (clojure.core/= 201 (:status response37786)) (clojure.spec.alpha/unform :portkey.aws.elastictranscoder/create-preset-response (:body response37786)) (clojure.core/if-some [[type__36699__auto__ spec__36700__auto__] (clojure.core/find errors__36698__auto__ (clojure.core/get-in response37786 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__36701__auto__ (clojure.spec.alpha/unform spec__36700__auto__ (cheshire.core/parse-string (:body response37786)))] (throw (clojure.core/ex-info (clojure.core/str type__36699__auto__ ": " (:message m__36701__auto__)) m__36701__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response37786}))))))))))

(clojure.core/defn delete-pipeline ([input__36693__auto__] (delete-pipeline input__36693__auto__ portkey.aws/*http-client*)) ([input37789 http-client__36694__auto__] (clojure.core/let [req__36695__auto__ (clojure.core/-> {:method "DELETE", :headers {"content-type" "application/json"}, :url "https://lambda.eu-central-1.amazonaws.com/2012-09-25/pipelines/{Id}", :body (clojure.spec.alpha/unform :portkey.aws.elastictranscoder/DeletePipelineRequest input37789)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {"Id" "Id"}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__36692__36696__auto__] (clojure.core/some-> p1__36692__36696__auto__ cheshire.core/generate-string))))] (http-client__36694__auto__ {:method "DELETE", :headers {"content-type" "application/json"}, :url "https://lambda.eu-central-1.amazonaws.com/2012-09-25/pipelines/{Id}", :body body__36697__auto__} (clojure.core/fn [response37788] (clojure.core/let [errors__36698__auto__ {"ValidationException" :portkey.aws.elastictranscoder/validation-exception, "IncompatibleVersionException" :portkey.aws.elastictranscoder/incompatible-version-exception, "ResourceNotFoundException" :portkey.aws.elastictranscoder/resource-not-found-exception, "ResourceInUseException" :portkey.aws.elastictranscoder/resource-in-use-exception, "AccessDeniedException" :portkey.aws.elastictranscoder/access-denied-exception, "InternalServiceException" :portkey.aws.elastictranscoder/internal-service-exception}] (if (clojure.core/= 202 (:status response37788)) (clojure.spec.alpha/unform :portkey.aws.elastictranscoder/delete-pipeline-response (:body response37788)) (clojure.core/if-some [[type__36699__auto__ spec__36700__auto__] (clojure.core/find errors__36698__auto__ (clojure.core/get-in response37788 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__36701__auto__ (clojure.spec.alpha/unform spec__36700__auto__ (cheshire.core/parse-string (:body response37788)))] (throw (clojure.core/ex-info (clojure.core/str type__36699__auto__ ": " (:message m__36701__auto__)) m__36701__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response37788}))))))))))

(clojure.core/defn list-jobs-by-status ([input__36693__auto__] (list-jobs-by-status input__36693__auto__ portkey.aws/*http-client*)) ([input37791 http-client__36694__auto__] (clojure.core/let [req__36695__auto__ (clojure.core/-> {:method "GET", :headers {"content-type" "application/json"}, :url "https://lambda.eu-central-1.amazonaws.com/2012-09-25/jobsByStatus/{Status}", :body (clojure.spec.alpha/unform :portkey.aws.elastictranscoder/ListJobsByStatusRequest input37791)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {"Status" "Status"}) (portkey.awsgen/params-to-querystring {"Ascending" "Ascending", "PageToken" "PageToken"}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__36692__36696__auto__] (clojure.core/some-> p1__36692__36696__auto__ cheshire.core/generate-string))))] (http-client__36694__auto__ {:method "GET", :headers {"content-type" "application/json"}, :url "https://lambda.eu-central-1.amazonaws.com/2012-09-25/jobsByStatus/{Status}", :body body__36697__auto__} (clojure.core/fn [response37790] (clojure.core/let [errors__36698__auto__ {"ValidationException" :portkey.aws.elastictranscoder/validation-exception, "IncompatibleVersionException" :portkey.aws.elastictranscoder/incompatible-version-exception, "ResourceNotFoundException" :portkey.aws.elastictranscoder/resource-not-found-exception, "AccessDeniedException" :portkey.aws.elastictranscoder/access-denied-exception, "InternalServiceException" :portkey.aws.elastictranscoder/internal-service-exception}] (if (clojure.core/= nil (:status response37790)) (clojure.spec.alpha/unform :portkey.aws.elastictranscoder/list-jobs-by-status-response (:body response37790)) (clojure.core/if-some [[type__36699__auto__ spec__36700__auto__] (clojure.core/find errors__36698__auto__ (clojure.core/get-in response37790 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__36701__auto__ (clojure.spec.alpha/unform spec__36700__auto__ (cheshire.core/parse-string (:body response37790)))] (throw (clojure.core/ex-info (clojure.core/str type__36699__auto__ ": " (:message m__36701__auto__)) m__36701__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response37790}))))))))))

(clojure.core/defn create-job ([input__36693__auto__] (create-job input__36693__auto__ portkey.aws/*http-client*)) ([input37793 http-client__36694__auto__] (clojure.core/let [req__36695__auto__ (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url "https://lambda.eu-central-1.amazonaws.com/2012-09-25/jobs", :body (clojure.spec.alpha/unform :portkey.aws.elastictranscoder/CreateJobRequest input37793)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__36692__36696__auto__] (clojure.core/some-> p1__36692__36696__auto__ cheshire.core/generate-string))))] (http-client__36694__auto__ {:method "POST", :headers {"content-type" "application/json"}, :url "https://lambda.eu-central-1.amazonaws.com/2012-09-25/jobs", :body body__36697__auto__} (clojure.core/fn [response37792] (clojure.core/let [errors__36698__auto__ {"ValidationException" :portkey.aws.elastictranscoder/validation-exception, "IncompatibleVersionException" :portkey.aws.elastictranscoder/incompatible-version-exception, "ResourceNotFoundException" :portkey.aws.elastictranscoder/resource-not-found-exception, "AccessDeniedException" :portkey.aws.elastictranscoder/access-denied-exception, "LimitExceededException" :portkey.aws.elastictranscoder/limit-exceeded-exception, "InternalServiceException" :portkey.aws.elastictranscoder/internal-service-exception}] (if (clojure.core/= 201 (:status response37792)) (clojure.spec.alpha/unform :portkey.aws.elastictranscoder/create-job-response (:body response37792)) (clojure.core/if-some [[type__36699__auto__ spec__36700__auto__] (clojure.core/find errors__36698__auto__ (clojure.core/get-in response37792 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__36701__auto__ (clojure.spec.alpha/unform spec__36700__auto__ (cheshire.core/parse-string (:body response37792)))] (throw (clojure.core/ex-info (clojure.core/str type__36699__auto__ ": " (:message m__36701__auto__)) m__36701__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response37792}))))))))))

(clojure.core/defn delete-preset ([input__36693__auto__] (delete-preset input__36693__auto__ portkey.aws/*http-client*)) ([input37795 http-client__36694__auto__] (clojure.core/let [req__36695__auto__ (clojure.core/-> {:method "DELETE", :headers {"content-type" "application/json"}, :url "https://lambda.eu-central-1.amazonaws.com/2012-09-25/presets/{Id}", :body (clojure.spec.alpha/unform :portkey.aws.elastictranscoder/DeletePresetRequest input37795)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {"Id" "Id"}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__36692__36696__auto__] (clojure.core/some-> p1__36692__36696__auto__ cheshire.core/generate-string))))] (http-client__36694__auto__ {:method "DELETE", :headers {"content-type" "application/json"}, :url "https://lambda.eu-central-1.amazonaws.com/2012-09-25/presets/{Id}", :body body__36697__auto__} (clojure.core/fn [response37794] (clojure.core/let [errors__36698__auto__ {"ValidationException" :portkey.aws.elastictranscoder/validation-exception, "IncompatibleVersionException" :portkey.aws.elastictranscoder/incompatible-version-exception, "ResourceNotFoundException" :portkey.aws.elastictranscoder/resource-not-found-exception, "AccessDeniedException" :portkey.aws.elastictranscoder/access-denied-exception, "InternalServiceException" :portkey.aws.elastictranscoder/internal-service-exception}] (if (clojure.core/= 202 (:status response37794)) (clojure.spec.alpha/unform :portkey.aws.elastictranscoder/delete-preset-response (:body response37794)) (clojure.core/if-some [[type__36699__auto__ spec__36700__auto__] (clojure.core/find errors__36698__auto__ (clojure.core/get-in response37794 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__36701__auto__ (clojure.spec.alpha/unform spec__36700__auto__ (cheshire.core/parse-string (:body response37794)))] (throw (clojure.core/ex-info (clojure.core/str type__36699__auto__ ": " (:message m__36701__auto__)) m__36701__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response37794}))))))))))

(clojure.core/defn update-pipeline ([input__36693__auto__] (update-pipeline input__36693__auto__ portkey.aws/*http-client*)) ([input37797 http-client__36694__auto__] (clojure.core/let [req__36695__auto__ (clojure.core/-> {:method "PUT", :headers {"content-type" "application/json"}, :url "https://lambda.eu-central-1.amazonaws.com/2012-09-25/pipelines/{Id}", :body (clojure.spec.alpha/unform :portkey.aws.elastictranscoder/UpdatePipelineRequest input37797)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {"Id" "Id"}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__36692__36696__auto__] (clojure.core/some-> p1__36692__36696__auto__ cheshire.core/generate-string))))] (http-client__36694__auto__ {:method "PUT", :headers {"content-type" "application/json"}, :url "https://lambda.eu-central-1.amazonaws.com/2012-09-25/pipelines/{Id}", :body body__36697__auto__} (clojure.core/fn [response37796] (clojure.core/let [errors__36698__auto__ {"ValidationException" :portkey.aws.elastictranscoder/validation-exception, "IncompatibleVersionException" :portkey.aws.elastictranscoder/incompatible-version-exception, "AccessDeniedException" :portkey.aws.elastictranscoder/access-denied-exception, "ResourceInUseException" :portkey.aws.elastictranscoder/resource-in-use-exception, "ResourceNotFoundException" :portkey.aws.elastictranscoder/resource-not-found-exception, "InternalServiceException" :portkey.aws.elastictranscoder/internal-service-exception}] (if (clojure.core/= 200 (:status response37796)) (clojure.spec.alpha/unform :portkey.aws.elastictranscoder/update-pipeline-response (:body response37796)) (clojure.core/if-some [[type__36699__auto__ spec__36700__auto__] (clojure.core/find errors__36698__auto__ (clojure.core/get-in response37796 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__36701__auto__ (clojure.spec.alpha/unform spec__36700__auto__ (cheshire.core/parse-string (:body response37796)))] (throw (clojure.core/ex-info (clojure.core/str type__36699__auto__ ": " (:message m__36701__auto__)) m__36701__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response37796}))))))))))

(clojure.core/defn read-job ([input__36693__auto__] (read-job input__36693__auto__ portkey.aws/*http-client*)) ([input37799 http-client__36694__auto__] (clojure.core/let [req__36695__auto__ (clojure.core/-> {:method "GET", :headers {"content-type" "application/json"}, :url "https://lambda.eu-central-1.amazonaws.com/2012-09-25/jobs/{Id}", :body (clojure.spec.alpha/unform :portkey.aws.elastictranscoder/ReadJobRequest input37799)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {"Id" "Id"}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__36692__36696__auto__] (clojure.core/some-> p1__36692__36696__auto__ cheshire.core/generate-string))))] (http-client__36694__auto__ {:method "GET", :headers {"content-type" "application/json"}, :url "https://lambda.eu-central-1.amazonaws.com/2012-09-25/jobs/{Id}", :body body__36697__auto__} (clojure.core/fn [response37798] (clojure.core/let [errors__36698__auto__ {"ValidationException" :portkey.aws.elastictranscoder/validation-exception, "IncompatibleVersionException" :portkey.aws.elastictranscoder/incompatible-version-exception, "ResourceNotFoundException" :portkey.aws.elastictranscoder/resource-not-found-exception, "AccessDeniedException" :portkey.aws.elastictranscoder/access-denied-exception, "InternalServiceException" :portkey.aws.elastictranscoder/internal-service-exception}] (if (clojure.core/= nil (:status response37798)) (clojure.spec.alpha/unform :portkey.aws.elastictranscoder/read-job-response (:body response37798)) (clojure.core/if-some [[type__36699__auto__ spec__36700__auto__] (clojure.core/find errors__36698__auto__ (clojure.core/get-in response37798 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__36701__auto__ (clojure.spec.alpha/unform spec__36700__auto__ (cheshire.core/parse-string (:body response37798)))] (throw (clojure.core/ex-info (clojure.core/str type__36699__auto__ ": " (:message m__36701__auto__)) m__36701__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response37798}))))))))))

(clojure.core/defn update-pipeline-status ([input__36693__auto__] (update-pipeline-status input__36693__auto__ portkey.aws/*http-client*)) ([input37801 http-client__36694__auto__] (clojure.core/let [req__36695__auto__ (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url "https://lambda.eu-central-1.amazonaws.com/2012-09-25/pipelines/{Id}/status", :body (clojure.spec.alpha/unform :portkey.aws.elastictranscoder/UpdatePipelineStatusRequest input37801)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {"Id" "Id"}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__36692__36696__auto__] (clojure.core/some-> p1__36692__36696__auto__ cheshire.core/generate-string))))] (http-client__36694__auto__ {:method "POST", :headers {"content-type" "application/json"}, :url "https://lambda.eu-central-1.amazonaws.com/2012-09-25/pipelines/{Id}/status", :body body__36697__auto__} (clojure.core/fn [response37800] (clojure.core/let [errors__36698__auto__ {"ValidationException" :portkey.aws.elastictranscoder/validation-exception, "IncompatibleVersionException" :portkey.aws.elastictranscoder/incompatible-version-exception, "ResourceNotFoundException" :portkey.aws.elastictranscoder/resource-not-found-exception, "ResourceInUseException" :portkey.aws.elastictranscoder/resource-in-use-exception, "AccessDeniedException" :portkey.aws.elastictranscoder/access-denied-exception, "InternalServiceException" :portkey.aws.elastictranscoder/internal-service-exception}] (if (clojure.core/= nil (:status response37800)) (clojure.spec.alpha/unform :portkey.aws.elastictranscoder/update-pipeline-status-response (:body response37800)) (clojure.core/if-some [[type__36699__auto__ spec__36700__auto__] (clojure.core/find errors__36698__auto__ (clojure.core/get-in response37800 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__36701__auto__ (clojure.spec.alpha/unform spec__36700__auto__ (cheshire.core/parse-string (:body response37800)))] (throw (clojure.core/ex-info (clojure.core/str type__36699__auto__ ": " (:message m__36701__auto__)) m__36701__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response37800}))))))))))

(clojure.core/defn test-role ([input__36693__auto__] (test-role input__36693__auto__ portkey.aws/*http-client*)) ([input37803 http-client__36694__auto__] (clojure.core/let [req__36695__auto__ (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url "https://lambda.eu-central-1.amazonaws.com/2012-09-25/roleTests", :body (clojure.spec.alpha/unform :portkey.aws.elastictranscoder/TestRoleRequest input37803)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__36692__36696__auto__] (clojure.core/some-> p1__36692__36696__auto__ cheshire.core/generate-string))))] (http-client__36694__auto__ {:method "POST", :headers {"content-type" "application/json"}, :url "https://lambda.eu-central-1.amazonaws.com/2012-09-25/roleTests", :body body__36697__auto__} (clojure.core/fn [response37802] (clojure.core/let [errors__36698__auto__ {"ValidationException" :portkey.aws.elastictranscoder/validation-exception, "IncompatibleVersionException" :portkey.aws.elastictranscoder/incompatible-version-exception, "ResourceNotFoundException" :portkey.aws.elastictranscoder/resource-not-found-exception, "AccessDeniedException" :portkey.aws.elastictranscoder/access-denied-exception, "InternalServiceException" :portkey.aws.elastictranscoder/internal-service-exception}] (if (clojure.core/= 200 (:status response37802)) (clojure.spec.alpha/unform :portkey.aws.elastictranscoder/test-role-response (:body response37802)) (clojure.core/if-some [[type__36699__auto__ spec__36700__auto__] (clojure.core/find errors__36698__auto__ (clojure.core/get-in response37802 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__36701__auto__ (clojure.spec.alpha/unform spec__36700__auto__ (cheshire.core/parse-string (:body response37802)))] (throw (clojure.core/ex-info (clojure.core/str type__36699__auto__ ": " (:message m__36701__auto__)) m__36701__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response37802}))))))))))

(clojure.core/defn list-presets ([input__36693__auto__] (list-presets input__36693__auto__ portkey.aws/*http-client*)) ([input37805 http-client__36694__auto__] (clojure.core/let [req__36695__auto__ (clojure.core/-> {:method "GET", :headers {"content-type" "application/json"}, :url "https://lambda.eu-central-1.amazonaws.com/2012-09-25/presets", :body (clojure.spec.alpha/unform :portkey.aws.elastictranscoder/ListPresetsRequest input37805)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {"Ascending" "Ascending", "PageToken" "PageToken"}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__36692__36696__auto__] (clojure.core/some-> p1__36692__36696__auto__ cheshire.core/generate-string))))] (http-client__36694__auto__ {:method "GET", :headers {"content-type" "application/json"}, :url "https://lambda.eu-central-1.amazonaws.com/2012-09-25/presets", :body body__36697__auto__} (clojure.core/fn [response37804] (clojure.core/let [errors__36698__auto__ {"ValidationException" :portkey.aws.elastictranscoder/validation-exception, "IncompatibleVersionException" :portkey.aws.elastictranscoder/incompatible-version-exception, "AccessDeniedException" :portkey.aws.elastictranscoder/access-denied-exception, "InternalServiceException" :portkey.aws.elastictranscoder/internal-service-exception}] (if (clojure.core/= nil (:status response37804)) (clojure.spec.alpha/unform :portkey.aws.elastictranscoder/list-presets-response (:body response37804)) (clojure.core/if-some [[type__36699__auto__ spec__36700__auto__] (clojure.core/find errors__36698__auto__ (clojure.core/get-in response37804 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__36701__auto__ (clojure.spec.alpha/unform spec__36700__auto__ (cheshire.core/parse-string (:body response37804)))] (throw (clojure.core/ex-info (clojure.core/str type__36699__auto__ ": " (:message m__36701__auto__)) m__36701__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response37804}))))))))))

(clojure.core/defn cancel-job ([input__36693__auto__] (cancel-job input__36693__auto__ portkey.aws/*http-client*)) ([input37807 http-client__36694__auto__] (clojure.core/let [req__36695__auto__ (clojure.core/-> {:method "DELETE", :headers {"content-type" "application/json"}, :url "https://lambda.eu-central-1.amazonaws.com/2012-09-25/jobs/{Id}", :body (clojure.spec.alpha/unform :portkey.aws.elastictranscoder/CancelJobRequest input37807)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {"Id" "Id"}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__36692__36696__auto__] (clojure.core/some-> p1__36692__36696__auto__ cheshire.core/generate-string))))] (http-client__36694__auto__ {:method "DELETE", :headers {"content-type" "application/json"}, :url "https://lambda.eu-central-1.amazonaws.com/2012-09-25/jobs/{Id}", :body body__36697__auto__} (clojure.core/fn [response37806] (clojure.core/let [errors__36698__auto__ {"ValidationException" :portkey.aws.elastictranscoder/validation-exception, "IncompatibleVersionException" :portkey.aws.elastictranscoder/incompatible-version-exception, "ResourceNotFoundException" :portkey.aws.elastictranscoder/resource-not-found-exception, "ResourceInUseException" :portkey.aws.elastictranscoder/resource-in-use-exception, "AccessDeniedException" :portkey.aws.elastictranscoder/access-denied-exception, "InternalServiceException" :portkey.aws.elastictranscoder/internal-service-exception}] (if (clojure.core/= 202 (:status response37806)) (clojure.spec.alpha/unform :portkey.aws.elastictranscoder/cancel-job-response (:body response37806)) (clojure.core/if-some [[type__36699__auto__ spec__36700__auto__] (clojure.core/find errors__36698__auto__ (clojure.core/get-in response37806 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__36701__auto__ (clojure.spec.alpha/unform spec__36700__auto__ (cheshire.core/parse-string (:body response37806)))] (throw (clojure.core/ex-info (clojure.core/str type__36699__auto__ ": " (:message m__36701__auto__)) m__36701__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response37806}))))))))))
