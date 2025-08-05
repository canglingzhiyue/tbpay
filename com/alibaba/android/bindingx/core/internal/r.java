package com.alibaba.android.bindingx.core.internal;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public double f2246a;
    public double b;
    public double c;
    public double d;

    static {
        kge.a(39531451);
    }

    public r() {
    }

    public r(double d, double d2, double d3, double d4) {
        this.f2246a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
    }

    public r a(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r) ipChange.ipc$dispatch("2de56b25", new Object[]{this, iVar});
        }
        if (iVar == null || !iVar.e) {
            return null;
        }
        double cos = Math.cos(iVar.b / 2.0d);
        double cos2 = Math.cos(iVar.c / 2.0d);
        double cos3 = Math.cos(iVar.d / 2.0d);
        double sin = Math.sin(iVar.b / 2.0d);
        double sin2 = Math.sin(iVar.c / 2.0d);
        double sin3 = Math.sin(iVar.d / 2.0d);
        String str = iVar.f2239a;
        if ("XYZ".equals(str)) {
            double d = sin * cos2;
            double d2 = cos * sin2;
            this.f2246a = (d * cos3) + (d2 * sin3);
            this.b = (d2 * cos3) - (d * sin3);
            double d3 = cos * cos2;
            double d4 = sin * sin2;
            this.c = (d3 * sin3) + (d4 * cos3);
            this.d = (d3 * cos3) - (d4 * sin3);
        } else if ("YXZ".equals(str)) {
            double d5 = sin * cos2;
            double d6 = cos * sin2;
            this.f2246a = (d5 * cos3) + (d6 * sin3);
            this.b = (d6 * cos3) - (d5 * sin3);
            double d7 = cos * cos2;
            double d8 = sin * sin2;
            this.c = (d7 * sin3) - (d8 * cos3);
            this.d = (d7 * cos3) + (d8 * sin3);
        } else if ("ZXY".equals(str)) {
            double d9 = sin * cos2;
            double d10 = cos * sin2;
            this.f2246a = (d9 * cos3) - (d10 * sin3);
            this.b = (d10 * cos3) + (d9 * sin3);
            double d11 = cos * cos2;
            double d12 = sin * sin2;
            this.c = (d11 * sin3) + (d12 * cos3);
            this.d = (d11 * cos3) - (d12 * sin3);
        } else if ("ZYX".equals(str)) {
            double d13 = sin * cos2;
            double d14 = cos * sin2;
            this.f2246a = (d13 * cos3) - (d14 * sin3);
            this.b = (d14 * cos3) + (d13 * sin3);
            double d15 = cos * cos2;
            double d16 = sin * sin2;
            this.c = (d15 * sin3) - (d16 * cos3);
            this.d = (d15 * cos3) + (d16 * sin3);
        } else if ("YZX".equals(str)) {
            double d17 = sin * cos2;
            double d18 = cos * sin2;
            this.f2246a = (d17 * cos3) + (d18 * sin3);
            this.b = (d18 * cos3) + (d17 * sin3);
            double d19 = cos * cos2;
            double d20 = sin * sin2;
            this.c = (d19 * sin3) - (d20 * cos3);
            this.d = (d19 * cos3) - (d20 * sin3);
        } else if ("XZY".equals(str)) {
            double d21 = sin * cos2;
            double d22 = cos * sin2;
            this.f2246a = (d21 * cos3) - (d22 * sin3);
            this.b = (d22 * cos3) - (d21 * sin3);
            double d23 = cos * cos2;
            double d24 = sin * sin2;
            this.c = (d23 * sin3) + (d24 * cos3);
            this.d = (d23 * cos3) + (d24 * sin3);
        }
        return this;
    }

    public r a(x xVar, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r) ipChange.ipc$dispatch("b859f66e", new Object[]{this, xVar, new Double(d)});
        }
        double d2 = d / 2.0d;
        double sin = Math.sin(d2);
        this.f2246a = xVar.f2250a * sin;
        this.b = xVar.b * sin;
        this.c = xVar.c * sin;
        this.d = Math.cos(d2);
        return this;
    }

    public r a(r rVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (r) ipChange.ipc$dispatch("29bbd52e", new Object[]{this, rVar}) : a(this, rVar);
    }

    public r a(r rVar, r rVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r) ipChange.ipc$dispatch("ae323f4", new Object[]{this, rVar, rVar2});
        }
        double d = rVar.f2246a;
        double d2 = rVar.b;
        double d3 = rVar.c;
        double d4 = rVar.d;
        double d5 = rVar2.f2246a;
        double d6 = rVar2.b;
        double d7 = rVar2.c;
        double d8 = rVar2.d;
        this.f2246a = (((d * d8) + (d4 * d5)) + (d2 * d7)) - (d3 * d6);
        this.b = (((d2 * d8) + (d4 * d6)) + (d3 * d5)) - (d * d7);
        this.c = (((d3 * d8) + (d4 * d7)) + (d * d6)) - (d2 * d5);
        this.d = (((d4 * d8) - (d * d5)) - (d2 * d6)) - (d3 * d7);
        return this;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Quaternion{x=" + this.f2246a + ", y=" + this.b + ", z=" + this.c + ", w=" + this.d + '}';
    }
}
