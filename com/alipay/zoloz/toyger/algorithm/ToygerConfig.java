package com.alipay.zoloz.toyger.algorithm;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class ToygerConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ToygerCameraConfig cameraConfig;
    public ToygerCommonConfig commonConfig;
    public ToygerLivenessConfig livenessConfig;
    public ToygerQualityConfig qualityConfig;

    public ToygerConfig() {
        this.qualityConfig = new ToygerQualityConfig();
        this.livenessConfig = new ToygerLivenessConfig();
        this.cameraConfig = new ToygerCameraConfig();
        this.commonConfig = new ToygerCommonConfig();
    }

    public ToygerConfig(ToygerQualityConfig toygerQualityConfig, ToygerLivenessConfig toygerLivenessConfig, ToygerCameraConfig toygerCameraConfig) {
        this.qualityConfig = toygerQualityConfig;
        this.livenessConfig = toygerLivenessConfig;
        this.cameraConfig = toygerCameraConfig;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ToygerConfig{qualityConfig=" + this.qualityConfig + ", livenessConfig=" + this.livenessConfig + ", cameraConfig=" + this.cameraConfig + ", commonConfig=" + this.commonConfig + '}';
    }
}
