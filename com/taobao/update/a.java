package com.taobao.update;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-91350326);
    }

    public static String getAppDispName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fc0fe6a1", new Object[0]) : "淘宝";
    }

    public static String getGroup(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("46a71146", new Object[]{str}) : (str == null || !"10000603".equals(str.substring(0, str.indexOf(64)))) ? "taobao4android" : "taobao4androiddata";
    }
}
