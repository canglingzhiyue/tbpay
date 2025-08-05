package com.alipay.zoloz.toyger.algorithm;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class ToygerLivenessConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public float batLivenessThreshold;
    public boolean checkFaceBeforeNanocut;
    public String collection;
    public float dragonflyMax;
    public float dragonflyMin;
    public int dragonflyRetryLimit;
    public float eye_blink_threshold;
    public float eye_occlusion_threshold;
    public boolean fppPreProcess;
    public float geminiMax;
    public float geminiMin;
    public String livenessCombinations;

    public ToygerLivenessConfig() {
        this.batLivenessThreshold = 0.5f;
        this.dragonflyMin = 0.0f;
        this.dragonflyMax = 0.5f;
        this.geminiMin = 0.0f;
        this.geminiMax = 0.0f;
        this.eye_occlusion_threshold = 0.8f;
        this.eye_blink_threshold = 0.2f;
        this.fppPreProcess = false;
        this.checkFaceBeforeNanocut = false;
        this.dragonflyRetryLimit = 0;
    }

    public ToygerLivenessConfig(String str, float f, float f2, float f3, float f4, float f5, boolean z, boolean z2) {
        this.batLivenessThreshold = 0.5f;
        this.dragonflyMin = 0.0f;
        this.dragonflyMax = 0.5f;
        this.geminiMin = 0.0f;
        this.geminiMax = 0.0f;
        this.eye_occlusion_threshold = 0.8f;
        this.eye_blink_threshold = 0.2f;
        this.fppPreProcess = false;
        this.checkFaceBeforeNanocut = false;
        this.dragonflyRetryLimit = 0;
        this.livenessCombinations = str;
        this.batLivenessThreshold = f;
        this.dragonflyMin = f2;
        this.dragonflyMax = f3;
        this.geminiMin = f4;
        this.geminiMax = f5;
        this.fppPreProcess = z;
        this.checkFaceBeforeNanocut = z2;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ToygerLivenessConfig{livenessCombinations='" + this.livenessCombinations + "', collection='" + this.collection + "', batLivenessThreshold=" + this.batLivenessThreshold + ", dragonflyMin=" + this.dragonflyMin + ", dragonflyMax=" + this.dragonflyMax + ", geminiMin=" + this.geminiMin + ", geminiMax=" + this.geminiMax + ", checkFaceBeforeNanocut=" + this.checkFaceBeforeNanocut + ", dragonflyRetryLimit=" + this.dragonflyRetryLimit + '}';
    }
}
