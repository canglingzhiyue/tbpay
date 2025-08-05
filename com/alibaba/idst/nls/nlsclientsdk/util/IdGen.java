package com.alibaba.idst.nls.nlsclientsdk.util;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.UUID;
import tb.kge;

/* loaded from: classes2.dex */
public class IdGen {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-42175503);
    }

    public static String genId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("99d6ff4e", new Object[0]) : UUID.randomUUID().toString().replaceAll("-", "");
    }
}
