package com.taobao.android.weex_uikit.ui;

import android.view.animation.Interpolator;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class p implements Interpolator {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TERM_BOTH = 3;
    public static final int TERM_END = 1;
    public static final int TERM_NONE = 2;
    public static final int TERM_START = 0;

    /* renamed from: a  reason: collision with root package name */
    private final int f16144a;
    private final int b;
    private final float[] c;
    private final float[] d;

    static {
        kge.a(2136443051);
        kge.a(-1444680548);
    }

    public p(int i, int i2) {
        int i3;
        this.f16144a = i;
        this.b = i2;
        this.d = new float[i];
        float f = 1.0f / i;
        int i4 = 1;
        int i5 = 1;
        while (true) {
            i3 = i + 1;
            if (i5 >= i3) {
                break;
            }
            this.d[i5 - 1] = i5 * f;
            i5++;
        }
        this.c = new float[i];
        if (i2 == 1) {
            for (int i6 = 1; i6 < i3; i6++) {
                this.c[i6 - 1] = i6 * f;
            }
            this.c[i - 1] = 1.0f;
        } else if (i2 == 2) {
            float f2 = 1.0f / i3;
            while (i4 < i3) {
                this.c[i4 - 1] = i4 * f2;
                i4++;
            }
        } else if (i2 != 3) {
            for (int i7 = 0; i7 < i; i7++) {
                this.c[i7] = i7 * f;
            }
            this.c[0] = 0.0f;
        } else {
            int i8 = i - 1;
            float f3 = 1.0f / i8;
            while (i4 < i3) {
                this.c[i4 - 1] = i4 * f3;
                i4++;
            }
            float[] fArr = this.c;
            fArr[0] = 0.0f;
            fArr[i8] = 1.0f;
        }
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("22c782db", new Object[]{this, new Float(f)})).floatValue();
        }
        int i = 0;
        while (true) {
            float[] fArr = this.d;
            if (i >= fArr.length) {
                i = 0;
                break;
            } else if (f <= fArr[i]) {
                break;
            } else {
                i++;
            }
        }
        return this.c[i];
    }
}
