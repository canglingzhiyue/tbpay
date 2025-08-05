package com.taobao.android.layoutmanager.adapter.impl;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import tb.kge;

/* loaded from: classes5.dex */
public class m implements Interpolator, Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final float f13130a;
    private final float b;
    private final boolean c;
    private float[] d;

    static {
        kge.a(-1308860316);
        kge.a(-1444680548);
        kge.a(-723128125);
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("78b3604e", new Object[]{this}) : a();
    }

    public m(float f, float f2, boolean z) {
        this.f13130a = f;
        this.b = f2;
        this.c = z;
        b();
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("22c782db", new Object[]{this, new Float(f)})).floatValue() : this.d[(int) (f * 999.0f)];
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.d = new float[1000];
        Arrays.fill(this.d, -1.0f);
        float[] fArr = this.d;
        fArr[0] = 0.0f;
        fArr[999] = 1.0f;
        for (int i = 0; i < 10000; i++) {
            PointF a2 = a(this.f13130a, this.b, i / 9999.0f);
            if (a2.x > 0.0f && a2.x < 1.0f) {
                int i2 = (int) (a2.x * 999.0f);
                float[] fArr2 = this.d;
                if (fArr2[i2] < 0.0f) {
                    fArr2[i2] = a2.y;
                }
            }
        }
        for (int i3 = 0; i3 < 1000; i3++) {
            if (this.d[i3] < 0.0f) {
                int i4 = 1;
                for (int i5 = i3 + 1; i5 < 1000 && this.d[i5] < 0.0f; i5++) {
                    i4++;
                }
                float[] fArr3 = this.d;
                int i6 = i3 + i4;
                int i7 = i3 - 1;
                if (fArr3[i6] == fArr3[i7]) {
                    for (int i8 = 0; i8 < i4; i8++) {
                        float[] fArr4 = this.d;
                        fArr4[i3 + i8] = fArr4[i7];
                    }
                } else {
                    float f = (fArr3[i6] - fArr3[i7]) / i4;
                    int i9 = 0;
                    while (i9 < i4) {
                        float[] fArr5 = this.d;
                        int i10 = i3 + i9;
                        i9++;
                        fArr5[i10] = fArr5[i7] + (i9 * f);
                    }
                }
            }
        }
    }

    public PointF a(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PointF) ipChange.ipc$dispatch("1170968f", new Object[]{this, new Float(f), new Float(f2), new Float(f3)});
        }
        PointF pointF = new PointF();
        float f4 = f3 != 0.0f ? f3 : 0.001f;
        float f5 = 0.7f;
        pointF.x = f3 * 0.7f * 2.0f;
        float f6 = f - 1.0f;
        if (f >= 1.0f) {
            f5 = 1.0f / a(f);
        }
        float sin = ((float) Math.sin(((f3 * 2.0f) * ((f6 * f5) + 1.0f)) - 1.5707964f)) / ((f2 * ((float) Math.pow(7.0f * f4, (((float) Math.pow(f4, 4.0d)) * 10.0f) + 2.0f))) + 2.0f);
        if (this.c && Math.abs(sin) < 0.003f) {
            sin = 0.0f;
        }
        pointF.y = (sin * 2.0f) + 1.0f;
        return pointF;
    }

    public float a(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a8218848", new Object[]{this, new Float(f)})).floatValue() : ((float) Math.log(1.0f + f)) * ((f / 200.0f) + 1.5f);
    }

    public m a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m) ipChange.ipc$dispatch("3d30569c", new Object[]{this});
        }
        try {
            return (m) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }
}
