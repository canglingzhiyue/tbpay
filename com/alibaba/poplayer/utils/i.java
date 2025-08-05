package com.alibaba.poplayer.utils;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.Pair;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.l;
import tb.bzl;
import tb.kge;

/* loaded from: classes3.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static int g;
    private static int h;
    private static Boolean k;
    private static Boolean l;

    /* renamed from: a  reason: collision with root package name */
    private boolean f3224a;
    private int b;
    private int c;
    private float d;
    private float e = 0.0f;
    private final boolean i;

    static {
        kge.a(814197788);
    }

    public i(Context context, boolean z, boolean z2) {
        this.d = 0.463f;
        if (z2) {
            if (k == null) {
                k = Boolean.valueOf(l.b(context));
            }
            if (l == null) {
                l = Boolean.valueOf(l.d(context));
            }
            z2 = k.booleanValue() || l.booleanValue();
            float bigScreenAspectRatio = bzl.a().b().getBigScreenAspectRatio();
            this.d = bigScreenAspectRatio <= 0.0f ? 0.463f : bigScreenAspectRatio;
        } else {
            k = false;
            l = false;
        }
        this.f3224a = z;
        this.i = z2;
    }

    public boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (!this.i) {
            return false;
        }
        if (z != this.f3224a) {
            this.f3224a = z;
            z2 = true;
        }
        DisplayMetrics displayMetrics = PopLayer.getReference().getApp().getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        if (i == this.b && i2 == this.c) {
            return z2;
        }
        this.b = i;
        this.c = i2;
        this.e = 0.0f;
        return true;
    }

    public float a(Context context, float f) {
        float intValue;
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("258f8f50", new Object[]{this, context, new Float(f)})).floatValue();
        }
        if (Float.isNaN(f)) {
            return f;
        }
        Pair<Integer, Integer> a2 = a(context);
        if (this.i) {
            intValue = f * ((Integer) a2.first).intValue();
            f2 = a();
        } else {
            intValue = f * ((Integer) a2.first).intValue();
            f2 = 750.0f;
        }
        float f3 = intValue / f2;
        double d = f3;
        if (d > 0.005d && f3 < 1.0f) {
            return 1.0f;
        }
        return (float) Math.rint(d);
    }

    private Pair<Integer, Integer> a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("4b5efeaa", new Object[]{this, context});
        }
        if (!this.i) {
            int i = g;
            if (i > 0 && h > 0) {
                return new Pair<>(Integer.valueOf(i), Integer.valueOf(h));
            }
        } else {
            int i2 = this.b;
            if (i2 > 0 && this.c > 0) {
                return new Pair<>(Integer.valueOf(i2), Integer.valueOf(this.c));
            }
        }
        if (context != null) {
            g = context.getResources().getDisplayMetrics().widthPixels;
            h = context.getResources().getDisplayMetrics().heightPixels;
            this.b = context.getResources().getDisplayMetrics().widthPixels;
            this.c = context.getResources().getDisplayMetrics().heightPixels;
        }
        c.c("pageLifeCycle", "", "AutoSize.getScreenSize.mScreenWidth=" + this.b + ".mScreenHeight=" + this.c);
        return new Pair<>(Integer.valueOf(this.b), Integer.valueOf(this.c));
    }

    private float a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c58", new Object[]{this})).floatValue();
        }
        float f = this.e;
        if (f > 0.0f) {
            return f;
        }
        float f2 = this.b / (this.d * this.c);
        this.e = 750.0f * f2;
        c.c("pageLifeCycle", "", "AutoSize.getBigScreenModel.mBigScreenModel=" + this.e + ".autoSizeRatio=" + f2 + ".mDisplayWidth=" + this.b + ".mDisplayHeight=" + this.c + ".mBigScreenAspectRatio=" + this.d);
        return this.e;
    }
}
