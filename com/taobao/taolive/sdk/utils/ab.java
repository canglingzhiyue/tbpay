package com.taobao.taolive.sdk.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.UUID;
import tb.kge;

/* loaded from: classes8.dex */
public class ab {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1885642492);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : UUID.randomUUID().toString().replace("-", "").toUpperCase();
    }
}
