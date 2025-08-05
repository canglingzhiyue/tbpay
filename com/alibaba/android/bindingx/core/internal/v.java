package com.alibaba.android.bindingx.core.internal;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.euo;
import tb.kge;
import tb.mto;

/* loaded from: classes2.dex */
public class v extends q {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private long f;
    private boolean g;
    private double h;
    private double i;
    private double j;
    private double k;
    private boolean l;
    private final a m = new a();
    private double n;
    private double o;
    private double p;
    private double q;
    private double r;

    static {
        kge.a(-1571493310);
    }

    public static /* synthetic */ Object ipc$super(v vVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public double f2249a;
        public double b;

        static {
            kge.a(358371788);
        }

        private a() {
        }
    }

    @Override // com.alibaba.android.bindingx.core.internal.q
    public void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        a aVar = this.m;
        double a2 = w.a(map, "initialVelocity", (double) mto.a.GEO_NOT_SUPPORT);
        aVar.b = a2;
        this.d = a2;
        this.h = w.a(map, com.taobao.android.dinamicx_v4.animation.util.b.STIFFNESS, 100.0d);
        this.i = w.a(map, euo.VARIATION_DAMPING, 10.0d);
        this.j = w.a(map, "mass", 1.0d);
        this.k = this.m.b;
        this.c = w.a(map, "fromValue", (double) mto.a.GEO_NOT_SUPPORT);
        this.o = w.a(map, "toValue", 1.0d);
        this.p = w.a(map, "restSpeedThreshold", 0.001d);
        this.q = w.a(map, "restDisplacementThreshold", 0.001d);
        this.l = w.a(map, "overshootClamping", false);
        this.e = false;
        this.r = mto.a.GEO_NOT_SUPPORT;
        this.g = false;
    }

    @Override // com.alibaba.android.bindingx.core.internal.q
    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        if (!this.g) {
            a aVar = this.m;
            double d = this.c;
            aVar.f2249a = d;
            this.n = d;
            this.f = j;
            this.r = mto.a.GEO_NOT_SUPPORT;
            this.g = true;
        }
        a((j - this.f) / 1000.0d);
        this.f = j;
        this.c = this.m.f2249a;
        this.d = this.m.b;
        if (!a()) {
            return;
        }
        this.e = true;
    }

    @Override // com.alibaba.android.bindingx.core.internal.q
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : Math.abs(this.m.b) <= this.p && (a(this.m) <= this.q || this.h == mto.a.GEO_NOT_SUPPORT);
    }

    private double a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d6122b6f", new Object[]{this, aVar})).doubleValue() : Math.abs(this.o - aVar.f2249a);
    }

    private boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.h > mto.a.GEO_NOT_SUPPORT && ((this.n < this.o && this.m.f2249a > this.o) || (this.n > this.o && this.m.f2249a < this.o));
    }

    private void a(double d) {
        double d2;
        double d3;
        double d4 = d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a82180d6", new Object[]{this, new Double(d4)});
        } else if (a()) {
        } else {
            if (d4 > 0.064d) {
                d4 = 0.064d;
            }
            this.r += d4;
            double d5 = this.i;
            double d6 = this.j;
            double d7 = this.h;
            double d8 = -this.k;
            double sqrt = d5 / (Math.sqrt(d7 * d6) * 2.0d);
            double sqrt2 = Math.sqrt(d7 / d6);
            double sqrt3 = Math.sqrt(1.0d - (sqrt * sqrt)) * sqrt2;
            double d9 = this.o - this.n;
            double d10 = this.r;
            if (sqrt < 1.0d) {
                double exp = Math.exp((-sqrt) * sqrt2 * d10);
                double d11 = sqrt * sqrt2;
                double d12 = d8 + (d11 * d9);
                double d13 = d10 * sqrt3;
                double sin = this.o - ((((d12 / sqrt3) * Math.sin(d13)) + (Math.cos(d13) * d9)) * exp);
                d3 = ((d11 * exp) * (((Math.sin(d13) * d12) / sqrt3) + (Math.cos(d13) * d9))) - (((Math.cos(d13) * d12) - ((sqrt3 * d9) * Math.sin(d13))) * exp);
                d2 = sin;
            } else {
                double exp2 = Math.exp((-sqrt2) * d10);
                d2 = this.o - (((((sqrt2 * d9) + d8) * d10) + d9) * exp2);
                d3 = exp2 * ((d8 * ((d10 * sqrt2) - 1.0d)) + (d10 * d9 * sqrt2 * sqrt2));
            }
            a aVar = this.m;
            aVar.f2249a = d2;
            aVar.b = d3;
            if (!a() && (!this.l || !g())) {
                return;
            }
            if (this.h > mto.a.GEO_NOT_SUPPORT) {
                double d14 = this.o;
                this.n = d14;
                this.m.f2249a = d14;
            } else {
                this.o = this.m.f2249a;
                this.n = this.o;
            }
            this.m.b = mto.a.GEO_NOT_SUPPORT;
        }
    }
}
