package com.tmall.android.dai.internal.util;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.rkq;

/* loaded from: classes9.dex */
public class DeviceInfos {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1937553148);
    }

    public static native void nativeStoreAppPackageName(String str);

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : rkq.d().e().getPackageName();
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else {
            nativeStoreAppPackageName(a());
        }
    }
}
