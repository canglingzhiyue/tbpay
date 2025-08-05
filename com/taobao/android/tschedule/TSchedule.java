package com.taobao.android.tschedule;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public class TSchedule {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final f scheduler;

    static {
        kge.a(-559456428);
        scheduler = f.a();
    }

    public static void fetchHttpData(String str, TScheduleHttpCallback tScheduleHttpCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("275656b", new Object[]{str, tScheduleHttpCallback});
        } else {
            scheduler.a(str, tScheduleHttpCallback);
        }
    }

    public static boolean preload(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a65e1d91", new Object[]{str, str2, objArr})).booleanValue() : scheduler.a(str, str2, objArr);
    }

    public static boolean preloadWithConfig(String str, String str2, List<JSONObject> list, Object... objArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("899b2b78", new Object[]{str, str2, list, objArr})).booleanValue() : scheduler.a(str, str2, list, objArr);
    }
}
