package com.alipay.ma.statistics.classification;

import android.text.TextUtils;
import com.alipay.ma.MaLogger;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class BlurSVM {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_BLUR_SVM_PARAMS = "key_blur_svm_params";
    public static final String KEY_ENABLE_BLUR_SVM = "key_enable_blur_svm";
    public static final String TAG = "BlurSVM";

    /* renamed from: a  reason: collision with root package name */
    private static float f5317a = 2.0f;
    private static float b = 0.3f;
    private static float c = 0.1f;
    private static boolean d = true;
    private static float e = 5.426211f;
    private static float f = 3.4279332f;
    private static float g = 7.310401f;
    private static float h = 6.2331066f;
    private static float i = 1.6728085f;
    private static float j = -5.1614676f;
    private static float k = 8.0f;
    private static float l;
    private float m = 0.0f;
    private float n = 0.0f;
    private float o = 0.0f;
    private long p = 0;
    private float q = 0.0f;
    private long r = 0;
    private boolean s = false;
    private int t = 0;

    public static void setEnableBlur(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e32a021", new Object[]{new Boolean(z)});
            return;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("setEnableBlur: ");
        sb.append(z);
        MaLogger.d(TAG, sb.toString());
        d = z;
    }

    public static void setBlurParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53b59820", new Object[]{str});
            return;
        }
        if (!TextUtils.isEmpty(str) && str.indexOf("#") >= 0) {
            try {
                String[] split = str.split("#");
                if (split != null && split.length >= 9) {
                    e = Float.valueOf(split[0]).floatValue();
                    f = Float.valueOf(split[1]).floatValue();
                    g = Float.valueOf(split[2]).floatValue();
                    h = Float.valueOf(split[3]).floatValue();
                    i = Float.valueOf(split[4]).floatValue();
                    j = Float.valueOf(split[5]).floatValue();
                    k = Float.valueOf(split[6]).floatValue();
                    l = Float.valueOf(split[7]).floatValue();
                    b = Float.valueOf(split[8]).floatValue();
                    StringBuilder sb = new StringBuilder(256);
                    sb.append("setBlurParams: sNormalMean_1=");
                    sb.append(e);
                    sb.append(",sNormalStd_1:");
                    sb.append(f);
                    sb.append(",sNormalMean_2:");
                    sb.append(g);
                    sb.append(",sNormalStd_2:");
                    sb.append(h);
                    sb.append(",sCoef1:");
                    sb.append(i);
                    sb.append(",sCoef2:");
                    sb.append(j);
                    sb.append(",sClearThresholdStd:");
                    sb.append(k);
                    sb.append(",sMargin:");
                    sb.append(l);
                    sb.append(",sSingleColorThresholdMaxGray:");
                    sb.append(b);
                    MaLogger.d(TAG, sb.toString());
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean getEnableBlur() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e66e4d0b", new Object[0])).booleanValue() : d;
    }

    public long getNoNeedCheckBlurDuration() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d66f5451", new Object[]{this})).longValue() : this.r;
    }

    public long getBlurCheckFrameCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9cf8fa28", new Object[]{this})).longValue() : this.p;
    }

    public float getAvgLaplaceDetectDuration() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d99a6264", new Object[]{this})).floatValue() : this.q;
    }

    public boolean isWhetherGetTheSameLaplaceValue() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("968daef6", new Object[]{this})).booleanValue() : this.s;
    }

    public int getTheSameLaplaceValueCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ce120f29", new Object[]{this})).intValue() : this.t;
    }

    public boolean checkBlur(float f2, float f3, float f4, float f5, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5357c9f2", new Object[]{this, new Float(f2), new Float(f3), new Float(f4), new Float(f5), new Long(j2)})).booleanValue();
        }
        MaLogger.d(TAG, "checkBlur: laplaceMean:" + f2 + ", laplaceStd:" + f3 + ", laplaceDuration:" + f4 + ", maxGrayRatio:" + f5 + ", mNoNeedCheckBlurDuration:" + this.r);
        if (f2 > 0.0f && f3 > 0.0f && f4 > 0.0f) {
            if (this.m == 0.0f) {
                this.m = f2;
            }
            if (this.n == 0.0f) {
                this.n = f3;
            }
            if (Math.abs(this.m - f2) <= 1.0E-5f && Math.abs(this.n - f3) <= 1.0E-5f) {
                this.t++;
                if (this.t > 1) {
                    this.r += j2;
                    this.s = true;
                    MaLogger.d(TAG, "checkBlur: false return. with same laplace mean & std.");
                } else {
                    MaLogger.d(TAG, "checkBlur: false return. first no care.");
                }
                return false;
            } else if (f3 > k) {
                this.o = Math.abs(this.m - f2) / this.m;
                this.m = f2;
                this.n = f3;
                MaLogger.d(TAG, "checkBlur: false return. > sClearThresholdStd:" + k);
                return false;
            } else {
                a(f4);
                float abs = Math.abs(this.m - f2) / this.m;
                this.m = f2;
                this.n = f3;
                MaLogger.d(TAG, "checkBlur: laplaceMeanDiffRatio:" + abs + ", lastLaplaceMeanDiffRatio:" + this.o);
                if (f2 < f5317a || f5 >= b) {
                    this.o = abs;
                    this.r += j2;
                    MaLogger.d(TAG, "checkBlur: singleColor return. laplaceMean:" + f2 + ", maxGrayRatio:" + f5);
                } else {
                    float f6 = c;
                    boolean z = abs > f6 || this.o > f6;
                    this.o = abs;
                    if (z) {
                        this.r += j2;
                        MaLogger.d(TAG, "checkBlur: false return. isMoving");
                        return false;
                    }
                    float f7 = (((f2 - e) / f) * i) + (((f3 - g) / h) * j) + l;
                    StringBuilder sb = new StringBuilder();
                    sb.append("checkBlur: result:");
                    int i2 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
                    sb.append(i2 > 0);
                    MaLogger.d(TAG, sb.toString());
                    return i2 > 0;
                }
            }
        }
        return false;
    }

    private void a(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f2)});
            return;
        }
        float f3 = this.q;
        long j2 = this.p;
        this.q = ((f3 * ((float) j2)) + f2) / ((float) (j2 + 1));
        this.p = j2 + 1;
    }
}
