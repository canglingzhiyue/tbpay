package com.tmall.android.dai.internal.util;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1940070651);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        com.taobao.mrt.service.b d = com.taobao.mrt.f.a().d();
        return d != null ? d.getDeviceLevel() : "low";
    }
}
