package com.alipay.zoloz.toyger.algorithm;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class ToygerQualityConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public float blinkOpenness;
    public int depthCollectCount;
    public float depthMinQuality;
    public int detectImageFormat;
    public boolean detectImageLight;
    public int detectMode;
    public float eyeOcclusion;
    public float eyeOpenness;
    public int img_light;
    public float maxGaussian;
    public float maxMotion;
    public float maxPitch;
    public float maxYaw;
    public float max_iod;
    public float minBrightness;
    public float minFaceWidth;
    public float minIntegrity;
    public float minPitch;
    public float minQuality;
    public float minYaw;
    public float min_iod;
    public float stackTime;
    public boolean uploadMultiFace;

    public ToygerQualityConfig() {
        this.img_light = 82;
        this.detectImageLight = false;
        this.uploadMultiFace = false;
    }

    public ToygerQualityConfig(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        this.img_light = 82;
        this.detectImageLight = false;
        this.uploadMultiFace = false;
        this.minBrightness = f;
        this.minFaceWidth = f2;
        this.minIntegrity = f3;
        this.maxPitch = f4;
        this.maxYaw = f5;
        this.maxGaussian = f6;
        this.maxMotion = f7;
        this.minQuality = f8;
        this.stackTime = f9;
        this.min_iod = f10;
        this.max_iod = f11;
        this.blinkOpenness = f12;
        this.eyeOpenness = f13;
        this.eyeOcclusion = f14;
        this.minPitch = f15;
        this.minYaw = f16;
        this.depthCollectCount = i;
        this.depthMinQuality = f17;
        this.detectImageFormat = i2;
        this.detectMode = i3;
        this.img_light = i4;
        this.detectImageLight = z;
        this.uploadMultiFace = z2;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ToygerQualityConfig{minBrightness=" + this.minBrightness + ", minFaceWidth=" + this.minFaceWidth + ", minIntegrity=" + this.minIntegrity + ", maxPitch=" + this.maxPitch + ", maxYaw=" + this.maxYaw + ", maxGaussian=" + this.maxGaussian + ", maxMotion=" + this.maxMotion + ", minQuality=" + this.minQuality + ", stackTime=" + this.stackTime + ", min_iod=" + this.min_iod + ", max_iod=" + this.max_iod + ", blinkOpenness=" + this.blinkOpenness + ", eyeOpenness=" + this.eyeOpenness + ", eyeOcclusion=" + this.eyeOcclusion + ", minPitch=" + this.minPitch + ", minYaw=" + this.minYaw + ", depthMinQuality=" + this.depthMinQuality + ", depthCollectCount=" + this.depthCollectCount + ", detectImageFormat=" + this.detectImageFormat + ", detectMode=" + this.detectMode + ", img_light=" + this.img_light + ", detectImageLight=" + this.detectImageLight + ", uploadMultiFace =" + this.uploadMultiFace + '}';
    }
}
