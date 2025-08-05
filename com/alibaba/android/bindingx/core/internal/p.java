package com.alibaba.android.bindingx.core.internal;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.mto;

/* loaded from: classes2.dex */
public class p {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Double b;
    private Double c;
    private Double d;

    /* renamed from: a  reason: collision with root package name */
    private r f2244a = new r(mto.a.GEO_NOT_SUPPORT, mto.a.GEO_NOT_SUPPORT, mto.a.GEO_NOT_SUPPORT, 1.0d);
    private double e = mto.a.GEO_NOT_SUPPORT;
    private double f = mto.a.GEO_NOT_SUPPORT;
    private double g = mto.a.GEO_NOT_SUPPORT;
    private final x h = new x(mto.a.GEO_NOT_SUPPORT, mto.a.GEO_NOT_SUPPORT, 1.0d);
    private final i i = new i();
    private final r j = new r();
    private final r k = new r(-Math.sqrt(0.5d), mto.a.GEO_NOT_SUPPORT, mto.a.GEO_NOT_SUPPORT, Math.sqrt(0.5d));

    static {
        kge.a(-75471716);
    }

    public p(Double d, Double d2, Double d3) {
        this.b = null;
        this.c = null;
        this.d = null;
        this.b = d;
        this.c = d2;
        this.d = d3;
    }

    public r a(double d, double d2, double d3, double d4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r) ipChange.ipc$dispatch("815f4068", new Object[]{this, new Double(d), new Double(d2), new Double(d3), new Double(d4)});
        }
        Double d5 = this.b;
        double radians = Math.toRadians(d5 != null ? d5.doubleValue() : d4 + this.e);
        Double d6 = this.c;
        double radians2 = Math.toRadians(d6 != null ? d6.doubleValue() : d2 + this.f);
        Double d7 = this.d;
        a(this.f2244a, radians, radians2, Math.toRadians(d7 != null ? d7.doubleValue() : this.g + d3), mto.a.GEO_NOT_SUPPORT);
        return this.f2244a;
    }

    private void a(r rVar, double d, double d2, double d3, double d4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a6e3fe2", new Object[]{this, rVar, new Double(d), new Double(d2), new Double(d3), new Double(d4)});
            return;
        }
        this.i.a(d2, d, -d3, "YXZ");
        rVar.a(this.i);
        rVar.a(this.k);
        rVar.a(this.j.a(this.h, -d4));
    }
}
