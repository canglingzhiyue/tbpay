package com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view;

import android.animation.TimeInterpolator;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class a implements TimeInterpolator {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public float f14166a;
    public float b;
    public float c;
    public float d;

    static {
        kge.a(-1981343099);
        kge.a(-753248481);
    }

    public float a(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("25edca48", new Object[]{this, new Float(f), new Float(f2), new Float(f3)})).floatValue();
        }
        float f4 = 1.0f - f3;
        float f5 = f3 * f4 * f4 * f;
        float f6 = f3 * f3;
        return ((f5 + (f4 * f6 * f2)) * 3.0f) + (f6 * f3);
    }

    public a(float f, float f2, float f3, float f4) {
        this.f14166a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public float a(float f, float f2, float f3, float f4, float f5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("61b18c48", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4), new Float(f5)})).floatValue();
        }
        int i = 10;
        float f6 = 0.0f;
        float f7 = 1.0f;
        while (true) {
            int i2 = i - 1;
            if (i > 0) {
                float f8 = (f6 + f7) / 2.0f;
                if (a(f, f3, f8) > f5) {
                    f7 = f8;
                } else {
                    f6 = f8;
                }
                i = i2;
            } else {
                return a(f2, f4, (f7 + f6) / 2.0f);
            }
        }
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("22c782db", new Object[]{this, new Float(f)})).floatValue() : a(this.f14166a, this.b, this.c, this.d, f);
    }
}
