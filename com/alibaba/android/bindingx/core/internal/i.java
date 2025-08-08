package com.alibaba.android.bindingx.core.internal;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.mto;

/* loaded from: classes2.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f2239a;
    public boolean e = true;
    public double b = mto.a.GEO_NOT_SUPPORT;
    public double c = mto.a.GEO_NOT_SUPPORT;
    public double d = mto.a.GEO_NOT_SUPPORT;

    static {
        kge.a(482033836);
    }

    public void a(double d, double d2, double d3, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50857b60", new Object[]{this, new Double(d), new Double(d2), new Double(d3), str});
            return;
        }
        this.b = d;
        this.c = d2;
        this.d = d3;
        if (StringUtils.isEmpty(str)) {
            str = "XYZ";
        }
        this.f2239a = str;
    }
}
