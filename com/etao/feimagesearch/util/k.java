package com.etao.feimagesearch.util;

import com.android.alibaba.ip.runtime.IpChange;
import tb.com;
import tb.kge;

/* loaded from: classes4.dex */
public final class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1584740339);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : (com.b() == null || com.b().getApplicationInfo() == null || (com.b().getApplicationInfo().flags & 2) == 0) ? false : true;
    }
}
