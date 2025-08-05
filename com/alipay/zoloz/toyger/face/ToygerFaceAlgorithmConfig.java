package com.alipay.zoloz.toyger.face;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alipay.android.phone.zoloz.toyger.BuildConfig;
import com.alipay.zoloz.toyger.ToygerAlgorithmConfig;
import com.alipay.zoloz.toyger.ToygerLog;
import com.alipay.zoloz.toyger.algorithm.ToygerCameraConfig;
import com.alipay.zoloz.toyger.algorithm.ToygerConfig;
import com.alipay.zoloz.toyger.algorithm.ToygerLivenessConfig;
import com.alipay.zoloz.toyger.algorithm.ToygerQualityConfig;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class ToygerFaceAlgorithmConfig extends ToygerAlgorithmConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BAT_LIVENESS = "BatLiveness";
    public static final String DARK = "dark";
    public static final String DEPTH = "depth";
    public static final String DRAGONFLY_LIVENESS = "DragonflyLiveness";
    public static final String GEMINI_LIVENESS = "GeminiLiveness";
    public static final String NO_LIVENESS = "NoLiveness";
    public static final String PANO = "pano";
    public static final String ZFACE_BLINK_LIVENESS = "zfaceBlinkLiveness";
    public float batLivenessThreshold;
    public float blink_openness;
    public boolean checkFaceBeforeNanocut;
    public int depth_cache_num;
    public String detectImageFormat;
    public int detectMode;
    public float dragonflyMax;
    public float dragonflyMin;
    public float eyeOcclusion;
    public float eye_openness;
    public float geminiMax;
    public float geminiMin;
    public boolean isMirror;
    public List<String> liveness_combination;
    public int log_level;
    public float max_iod;
    public float min_iod;
    public float pose_gaussian;
    public float pose_integrity;
    public float pose_light;
    public float pose_motion;
    public float pose_pitch;
    public float pose_pitchMin;
    public float pose_rectwidth;
    public float pose_yaw;
    public float pose_yawMin;
    public float quality_depth_min_quality;
    public float quality_min_quality;
    public String secProtocol;
    public float stack_time;
    public Map<String, List<Float>> threshold;
    public boolean useGrayModel = false;
    public boolean useBetaDetectModel = false;
    public boolean useBetaLivenessModel = false;
    public String modelPath = "";
    public String grayModelCloudID = "";
    public String toyger_detect = "";
    public String toyger_liveness = "";
    public String toyger_verify = "";
    public int usexnnModel = 0;
    public int dragonflyRetryLimit = 0;
    public int img_light = 82;
    public boolean detectImageLight = false;
    public boolean uploadMultiFace = false;

    public ToygerFaceAlgorithmConfig() {
        this.detectMode = 0;
        Float valueOf = Float.valueOf(0.0f);
        this.stack_time = 0.0f;
        this.blink_openness = 0.2f;
        this.eye_openness = 0.25f;
        this.pose_pitch = 0.2f;
        this.pose_pitchMin = -0.2f;
        this.pose_yaw = 0.2f;
        this.pose_yawMin = -0.2f;
        this.pose_gaussian = 0.15f;
        this.pose_motion = 1.0f;
        this.pose_rectwidth = 0.25f;
        this.pose_integrity = 0.86f;
        this.pose_light = 0.2f;
        this.min_iod = 0.18f;
        this.max_iod = 0.48f;
        this.dragonflyMax = 0.0f;
        this.dragonflyMin = 0.0f;
        this.geminiMin = 0.0f;
        this.geminiMax = 0.0f;
        this.quality_min_quality = 20.0f;
        this.eyeOcclusion = 0.8f;
        this.depth_cache_num = 2;
        this.quality_depth_min_quality = 0.5f;
        this.liveness_combination = new ArrayList();
        this.threshold = new HashMap();
        this.secProtocol = "";
        this.isMirror = false;
        this.checkFaceBeforeNanocut = false;
        this.detectImageFormat = "bgr";
        if (TextUtils.equals("wallet", "wallet")) {
            this.liveness_combination.add(NO_LIVENESS);
            ArrayList arrayList = new ArrayList();
            arrayList.add(valueOf);
            this.stack_time = 0.0f;
            this.eye_openness = 0.25f;
            this.pose_pitch = 0.2f;
            this.pose_yaw = 0.2f;
            this.pose_gaussian = 0.15f;
            this.pose_motion = 1.0f;
            this.pose_pitchMin = -0.2f;
            this.pose_rectwidth = 0.25f;
            this.pose_integrity = 0.9f;
            this.pose_light = 0.3f;
            this.pose_yawMin = -0.2f;
            this.min_iod = 0.18f;
            this.max_iod = 0.45f;
            this.quality_min_quality = 20.0f;
            this.detectMode = 0;
            this.threshold.put(NO_LIVENESS, arrayList);
        } else if (TextUtils.equals(BuildConfig.PORTING_VENDING, "wallet")) {
            this.liveness_combination.add(BAT_LIVENESS);
            this.batLivenessThreshold = 0.5f;
            this.stack_time = 1.0f;
            this.pose_gaussian = 1.0f;
            this.pose_rectwidth = 0.3f;
            this.pose_light = 0.0f;
            this.min_iod = 0.0f;
            this.max_iod = 1.0f;
            this.quality_depth_min_quality = 0.5f;
            this.depth_cache_num = 2;
            this.secProtocol = "";
        } else if (TextUtils.equals(BuildConfig.PORTING_JRCLOUD, "wallet")) {
            this.liveness_combination.add(NO_LIVENESS);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(valueOf);
            this.threshold.put(NO_LIVENESS, arrayList2);
        } else if (TextUtils.equals(BuildConfig.PORTING_SUDIYI, "wallet")) {
            this.liveness_combination.add(NO_LIVENESS);
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(valueOf);
            this.threshold.put(NO_LIVENESS, arrayList3);
        } else {
            this.liveness_combination.add(NO_LIVENESS);
            ArrayList arrayList4 = new ArrayList();
            arrayList4.add(valueOf);
            this.threshold.put(NO_LIVENESS, arrayList4);
        }
    }

    public static ToygerFaceAlgorithmConfig from(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ToygerFaceAlgorithmConfig) ipChange.ipc$dispatch("c2796dc9", new Object[]{str});
        }
        ToygerFaceAlgorithmConfig toygerFaceAlgorithmConfig = (ToygerFaceAlgorithmConfig) JSON.parseObject(str, ToygerFaceAlgorithmConfig.class);
        if (toygerFaceAlgorithmConfig == null) {
            toygerFaceAlgorithmConfig = new ToygerFaceAlgorithmConfig();
            ToygerLog.i("TOYGER", "fail to parse algorithm config, load default config");
        }
        if (toygerFaceAlgorithmConfig.depth_cache_num == 0) {
            toygerFaceAlgorithmConfig.depth_cache_num = 2;
        }
        if (toygerFaceAlgorithmConfig.quality_depth_min_quality == 0.0f) {
            toygerFaceAlgorithmConfig.quality_depth_min_quality = 0.5f;
        }
        return toygerFaceAlgorithmConfig;
    }

    public ToygerConfig toToygerConfig() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ToygerConfig) ipChange.ipc$dispatch("2ebaf91e", new Object[]{this});
        }
        if (this.detectImageFormat.equals("bgr")) {
            ToygerLog.i("TOYGER", "detectImageFormat is bgr");
            i = 4;
        } else {
            ToygerLog.i("TOYGER", "detectImageFormat is yuv");
            i = 0;
        }
        ToygerQualityConfig toygerQualityConfig = new ToygerQualityConfig(this.pose_light, this.pose_rectwidth, this.pose_integrity, this.pose_pitch, this.pose_yaw, this.pose_gaussian, this.pose_motion, this.quality_min_quality, this.stack_time, this.min_iod, this.max_iod, this.blink_openness, this.eye_openness, this.eyeOcclusion, this.pose_pitchMin, this.pose_yawMin, this.quality_depth_min_quality, this.depth_cache_num, i, this.detectMode, this.img_light, this.detectImageLight, this.uploadMultiFace);
        String str = "";
        if (this.liveness_combination != null) {
            for (int i2 = 0; i2 < this.liveness_combination.size(); i2++) {
                if (str.length() > 0) {
                    str = str.concat("#").concat(this.liveness_combination.get(i2));
                } else {
                    str = this.liveness_combination.get(i2);
                }
            }
        }
        ToygerLivenessConfig toygerLivenessConfig = new ToygerLivenessConfig(str, this.batLivenessThreshold, this.dragonflyMin, this.dragonflyMax, this.geminiMin, this.geminiMax, false, this.checkFaceBeforeNanocut);
        ToygerConfig toygerConfig = new ToygerConfig();
        toygerConfig.qualityConfig = toygerQualityConfig;
        toygerConfig.livenessConfig = toygerLivenessConfig;
        toygerConfig.cameraConfig = new ToygerCameraConfig();
        toygerConfig.cameraConfig.isMirror = this.isMirror;
        return toygerConfig;
    }
}
