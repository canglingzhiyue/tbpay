package com.taobao.android.base;

import com.android.alibaba.ip.runtime.IpChange;
import tb.jqm;
import tb.kge;

/* loaded from: classes.dex */
public class Versions {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1295466426);
    }

    public static boolean isDebug() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a59fb54", new Object[0])).booleanValue() : jqm.a();
    }
}
