package com.ali.user.open.ucc.context;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class UccContext {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Map<String, String> bizParams;
    public static long startTrustLoginTime;

    static {
        kge.a(72997076);
        bizParams = new HashMap();
        startTrustLoginTime = 0L;
    }

    public static Map<String, String> getBizParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("79854d7f", new Object[0]) : bizParams;
    }

    public static void setBizParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9cf6c87", new Object[]{map});
        } else {
            bizParams = map;
        }
    }
}
