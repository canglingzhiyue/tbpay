package com.taobao.monitor.impl.util;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        return com.taobao.monitor.impl.common.e.a().c() + str;
    }
}
