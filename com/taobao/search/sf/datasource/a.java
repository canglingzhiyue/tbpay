package com.taobao.search.sf.datasource;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f19438a;
    public String b;
    public String c;

    static {
        kge.a(-804168250);
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("578e4a1a", new Object[0]);
        }
        a aVar = new a();
        aVar.f19438a = "mtop.taobao.wsearch.appsearch";
        aVar.b = "1.0";
        aVar.c = "wsearch";
        return aVar;
    }
}
