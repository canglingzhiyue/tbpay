package com.loc;

import tb.mto;

/* loaded from: classes4.dex */
public class ee {

    /* renamed from: a  reason: collision with root package name */
    public String f7757a;
    public long b = 0;
    public long c = 0;
    public double d = mto.a.GEO_NOT_SUPPORT;
    public double e = mto.a.GEO_NOT_SUPPORT;
    public double f = mto.a.GEO_NOT_SUPPORT;
    public float g = 0.0f;
    public float h = 0.0f;
    public float i = 0.0f;
    public boolean j = false;

    public ee(String str) {
        this.f7757a = str;
    }

    public final double a(ee eeVar) {
        return eeVar != null ? ep.a(this.e, this.d, eeVar.e, eeVar.d) : mto.a.GEO_NOT_SUPPORT;
    }
}
