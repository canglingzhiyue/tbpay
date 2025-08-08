package com.alipay.zoloz.hardware.log;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.riy;

/* loaded from: classes3.dex */
public class MonitorLogger {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static HashMap<String, String> f6256a = new HashMap<>(7);

    public static void performance(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a02624b", new Object[]{str, str2});
            return;
        }
        if (f6256a.containsKey(str)) {
            Log.v("MonitorLogger", android.util.Log.getStackTraceString(new RuntimeException("MonitorLogger already contains key: " + str + ", value=[" + StringUtils.join(",", f6256a.entrySet()) + riy.ARRAY_END_STR)));
        }
        Log.d("MonitorLogger", "MonitorLogger.performance(" + str + "): " + str2);
        f6256a.put(str, str2);
    }

    public static Map<String, String> getPerformance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7518eaf6", new Object[0]);
        }
        HashMap hashMap = new HashMap(f6256a);
        f6256a.clear();
        return hashMap;
    }
}
