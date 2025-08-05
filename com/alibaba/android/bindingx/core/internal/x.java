package com.alibaba.android.bindingx.core.internal;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public double f2250a;
    public double b;
    public double c;

    static {
        kge.a(1114778579);
    }

    public x(double d, double d2, double d3) {
        this.f2250a = d;
        this.b = d2;
        this.c = d3;
    }

    public void a(double d, double d2, double d3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25d0ab16", new Object[]{this, new Double(d), new Double(d2), new Double(d3)});
            return;
        }
        this.f2250a = d;
        this.b = d2;
        this.c = d3;
    }

    public x a(r rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x) ipChange.ipc$dispatch("29bbd5e8", new Object[]{this, rVar});
        }
        double d = this.f2250a;
        double d2 = this.b;
        double d3 = this.c;
        double d4 = rVar.f2246a;
        double d5 = rVar.b;
        double d6 = rVar.c;
        double d7 = rVar.d;
        double d8 = ((d7 * d) + (d5 * d3)) - (d6 * d2);
        double d9 = ((d7 * d2) + (d6 * d)) - (d4 * d3);
        double d10 = ((d7 * d3) + (d4 * d2)) - (d5 * d);
        double d11 = -d4;
        double d12 = ((d * d11) - (d2 * d5)) - (d3 * d6);
        double d13 = -d6;
        double d14 = -d5;
        this.f2250a = (((d8 * d7) + (d12 * d11)) + (d9 * d13)) - (d10 * d14);
        this.b = (((d9 * d7) + (d12 * d14)) + (d10 * d11)) - (d8 * d13);
        this.c = (((d10 * d7) + (d12 * d13)) + (d8 * d14)) - (d9 * d11);
        return this;
    }
}
