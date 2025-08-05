package com.taobao.tao.recommend4.manager.utils;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-136724712);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : a.disEnableCache == null || a.disEnableCache.isEmpty() || !a.disEnableCache.contains(str);
    }
}
