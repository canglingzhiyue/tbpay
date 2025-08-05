package com.taobao.taolivehome.utils;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.mfm;
import tb.pro;

/* loaded from: classes8.dex */
public class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1395317492);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : pro.d(mfm.a("isAfcColdContextTrackHomePageBugfix", "true"));
    }
}
