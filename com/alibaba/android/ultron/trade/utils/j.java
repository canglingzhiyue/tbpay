package com.alibaba.android.ultron.trade.utils;

import com.alibaba.android.umbrella.trace.UmbrellaTracker;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_MAIN_BIZ_NAME = "ultronTrade";

    static {
        kge.a(-1586203382);
    }

    public static void a(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{str, str2, map});
        } else {
            UmbrellaTracker.commitFailureStability("umbrella.event.openurl", "ultron.trade.open.url", "1.0", "ultronTrade", "biz_unknow", map, str, str2);
        }
    }
}
