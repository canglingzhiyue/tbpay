package com.alipay.mobile.security.bio.config.bean;

import com.alipay.zoloz.toyger.face.ToygerFaceAlgorithmConfig;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class Algorithm {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String[] C;
    private Threshold D;

    /* renamed from: a  reason: collision with root package name */
    private float f5778a = 0.15f;
    private float b = 0.16f;
    private int c = 0;
    private int d = 0;
    private int e = 50;
    private int f = 4;
    private int g = 0;
    private int h = 4;
    private int i = 1;
    private int j = 4;
    private String k = ToygerFaceAlgorithmConfig.BAT_LIVENESS;
    private float l = 79.79f;
    private float m = 0.2f;
    private float n = 0.25f;
    private float o = 0.2f;
    private float p = 0.17f;
    private float q = 40.0f;
    private float r = 0.9f;
    private float s = 0.15f;
    private float t = 200.0f;
    private float u = 1500.0f;
    private float v = -0.2f;
    private float w = -0.2f;
    private int x = 0;
    private float y = 9.0f;
    private int z = 1;
    private int A = 0;
    private float B = 0.05f;
    private boolean E = false;
    private boolean F = false;
    private String G = "";
    private String H = "";
    private String I = "";
    private String J = "";
    private String K = "";
    private String L = "yuv";

    public String[] getLiveness_combination() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("e493861f", new Object[]{this}) : this.C;
    }

    public void setLiveness_combination(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c7c8043", new Object[]{this, strArr});
        } else {
            this.C = strArr;
        }
    }

    public void setPitchWeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686d6106", new Object[]{this, new Integer(i)});
        } else {
            this.j = i;
        }
    }

    public int getPitchWeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("82352c1c", new Object[]{this})).intValue() : this.j;
    }

    public void setYawWeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("480e86f7", new Object[]{this, new Integer(i)});
        } else {
            this.i = i;
        }
    }

    public int getYawWeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b9cf370b", new Object[]{this})).intValue() : this.i;
    }

    public void setDisWeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("162e9b78", new Object[]{this, new Integer(i)});
        } else {
            this.h = i;
        }
    }

    public int getDisWeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("130a0e6a", new Object[]{this})).intValue() : this.h;
    }

    public void setMinpose(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("422f7cdb", new Object[]{this, new Integer(i)});
        } else {
            this.g = i;
        }
    }

    public int getMinpose() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("52f6e7a7", new Object[]{this})).intValue() : this.g;
    }

    public void setYunqiQuality(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86dc1505", new Object[]{this, new Integer(i)});
        } else {
            this.f = i;
        }
    }

    public int getYunqiQuality() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("160a80a5", new Object[]{this})).intValue() : this.f;
    }

    public void setFacesize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52eb9cfc", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }

    public int getFacesize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("63237ce", new Object[]{this})).intValue() : this.e;
    }

    public void setMouth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fa62cf7", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    public int getMouth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("242d770b", new Object[]{this})).intValue() : this.d;
    }

    public void setBlink(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cdc0f82", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    public int getBlink() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8bb9720", new Object[]{this})).intValue() : this.c;
    }

    public void setEyeHwratio(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45b3414c", new Object[]{this, new Float(f)});
        } else {
            this.b = f;
        }
    }

    public float getEyeHwratio() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("530f5cd8", new Object[]{this})).floatValue() : this.b;
    }

    public void setDiffer(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6a65a25", new Object[]{this, new Float(f)});
        } else {
            this.f5778a = f;
        }
    }

    public float getDiffer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("552b5edf", new Object[]{this})).floatValue() : this.f5778a;
    }

    public float getPose_motion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6750b365", new Object[]{this})).floatValue() : this.m;
    }

    public void setPose_motion(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26c2b7f7", new Object[]{this, new Float(f)});
        } else {
            this.m = f;
        }
    }

    public float getPose_rectwidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("283ee0a1", new Object[]{this})).floatValue() : this.n;
    }

    public void setPose_rectwidth(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2de25ca3", new Object[]{this, new Float(f)});
        } else {
            this.n = f;
        }
    }

    public float getPose_pitch() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2516467f", new Object[]{this})).floatValue() : this.o;
    }

    public void setPose_pitch(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4898c85", new Object[]{this, new Float(f)});
        } else {
            this.o = f;
        }
    }

    public float getPose_yaw() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c35c382e", new Object[]{this})).floatValue() : this.p;
    }

    public void setPose_yaw(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b019db6", new Object[]{this, new Float(f)});
        } else {
            this.p = f;
        }
    }

    public float getPose_light() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2d84dd55", new Object[]{this})).floatValue() : this.q;
    }

    public void setPose_light(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9edd06f", new Object[]{this, new Float(f)});
        } else {
            this.q = f;
        }
    }

    public float getPose_integrity() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9d7100c", new Object[]{this})).floatValue() : this.r;
    }

    public void setPose_integrity(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f501a98", new Object[]{this, new Float(f)});
        } else {
            this.r = f;
        }
    }

    public float getPose_gaussian() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3424892a", new Object[]{this})).floatValue() : this.s;
    }

    public void setPose_gaussian(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e79887d2", new Object[]{this, new Float(f)});
        } else {
            this.s = f;
        }
    }

    public float getPose_distanceMax() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b02adeee", new Object[]{this})).floatValue() : this.u;
    }

    public void setPose_distanceMax(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25441af6", new Object[]{this, new Float(f)});
        } else {
            this.u = f;
        }
    }

    public float getPose_distanceMin() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bd44b8dc", new Object[]{this})).floatValue() : this.t;
    }

    public void setPose_distanceMin(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb657ec8", new Object[]{this, new Float(f)});
        } else {
            this.t = f;
        }
    }

    public float getPose_pitchMin() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b5c3eaa1", new Object[]{this})).floatValue() : this.w;
    }

    public void setPose_pitchMin(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99e5553b", new Object[]{this, new Float(f)});
        } else {
            this.w = f;
        }
    }

    public float getPose_yawMin() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("233be692", new Object[]{this})).floatValue() : this.w;
    }

    public void setPose_yawMin(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e83dea6a", new Object[]{this, new Float(f)});
        } else {
            this.w = f;
        }
    }

    public float getQuality_min_quality() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e7d36813", new Object[]{this})).floatValue() : this.y;
    }

    public void setQuality_min_quality(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c266cd09", new Object[]{this, new Float(f)});
        } else {
            this.y = f;
        }
    }

    public String getLiveness_combinations() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5f4ba5ef", new Object[]{this}) : this.k;
    }

    public void setLiveness_combinations(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e08445cf", new Object[]{this, str});
        } else {
            this.k = str;
        }
    }

    public float getMatching_score() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3e0e1a3d", new Object[]{this})).floatValue() : this.l;
    }

    public void setMatching_score(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1fa5687", new Object[]{this, new Float(f)});
        } else {
            this.l = f;
        }
    }

    public int getLog_level() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("df27d30d", new Object[]{this})).intValue() : this.x;
    }

    public void setLog_level(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdc96b35", new Object[]{this, new Integer(i)});
        } else {
            this.x = i;
        }
    }

    public int getStack_size() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("49da10c8", new Object[]{this})).intValue() : this.z;
    }

    public void setStack_size(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("283f1642", new Object[]{this, new Integer(i)});
        } else {
            this.z = i;
        }
    }

    public int getStack_time() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9b8c3d94", new Object[]{this})).intValue() : this.A;
    }

    public void setStack_time(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd282f6", new Object[]{this, new Integer(i)});
        } else {
            this.A = i;
        }
    }

    public float getBatLivenessThreshold() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("dc8e9f40", new Object[]{this})).floatValue() : this.B;
    }

    public void setBatLivenessThreshold(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff120ae4", new Object[]{this, new Float(f)});
        } else {
            this.B = f;
        }
    }

    public boolean getCheckFaceBeforeNanocut() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2532b68b", new Object[]{this})).booleanValue() : this.E;
    }

    public void setCheckFaceBeforeNanocut(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("893cd8a1", new Object[]{this, new Boolean(z)});
        } else {
            this.E = z;
        }
    }

    public boolean getUseGrayModel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("adec9d40", new Object[]{this})).booleanValue() : this.F;
    }

    public void setUseGrayModel(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb3dc98c", new Object[]{this, new Boolean(z)});
        } else {
            this.F = z;
        }
    }

    public String getGrayModelCloudID() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c30c9ed9", new Object[]{this}) : this.H;
    }

    public void setGrayModelCloudID(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dac9cabd", new Object[]{this, str});
        } else {
            this.H = str;
        }
    }

    public String getModelPath() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("31fd79c1", new Object[]{this}) : this.G;
    }

    public void setModelPath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fef7a3d", new Object[]{this, str});
        } else {
            this.G = str;
        }
    }

    public String getToyger_detect() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9c5baaa3", new Object[]{this}) : this.I;
    }

    public void setToyger_detect(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23b98b9b", new Object[]{this, str});
        } else {
            this.I = str;
        }
    }

    public String getToyger_liveness() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c6e768c3", new Object[]{this}) : this.J;
    }

    public void setToyger_liveness(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d02d847b", new Object[]{this, str});
        } else {
            this.J = str;
        }
    }

    public String getToyger_verify() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ae5ea8d", new Object[]{this}) : this.K;
    }

    public void setToyger_verify(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("867748f1", new Object[]{this, str});
        } else {
            this.K = str;
        }
    }

    public String getDetectImageFormat() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("98368ec0", new Object[]{this}) : this.L;
    }

    public void setDetectImageFormat(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c1a511e", new Object[]{this, str});
        } else {
            this.L = str;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Algorithm{differ=" + this.f5778a + ", eyeHwratio=" + this.b + ", blink=" + this.c + ", mouth=" + this.d + ", facesize=" + this.e + ", yunqiQuality=" + this.f + ", minpose=" + this.g + ", disWeight=" + this.h + ", yawWeight=" + this.i + ", pitchWeight=" + this.j + ", liveness_combinations='" + this.k + "', matching_score=" + this.l + ", pose_motion=" + this.m + ", pose_rectwidth=" + this.n + ", pose_pitch=" + this.o + ", pose_yaw=" + this.p + ", pose_light=" + this.q + ", pose_integrity=" + this.r + ", pose_gaussian=" + this.s + ", pose_distanceMin=" + this.t + ", pose_distanceMax=" + this.u + ", pose_yawMin=" + this.v + ", pose_pitchMin=" + this.w + ", log_level=" + this.x + ", quality_min_quality=" + this.y + ", stack_size=" + this.z + ", stack_time=" + this.A + ", batLivenessThreshold=" + this.B + ", liveness_combination=" + Arrays.toString(this.C) + ", threshold=" + this.D + ", checkFaceBeforeNanocut=" + this.E + ", useGrayModel=" + this.F + ", grayModelCloudID=" + this.H + ", modelPath=" + this.G + ", toyger_detect=" + this.I + ", toyger_liveness=" + this.J + ", toyger_verify=" + this.K + ", detectImageFormat=" + this.L + '}';
    }
}
