package com.alibaba.android.umbrella.link;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.android.umbrella.link.export.UmTypeKey;
import com.alibaba.android.umbrella.trace.UmbrellaInfo;
import com.alibaba.android.umbrella.trace.UmbrellaTracker;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.bpt;

/* loaded from: classes2.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARAM_TINCT_TAG = "tinctTag";
    public static final String POINT_COMMIT_FAILURE = "exception_failure";
    public static final String POINT_COMMIT_SUCCESS = "exception_success";
    public static final String POINT_LOG = "exception_log";

    public static void a(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19b0c1eb", new Object[]{str, str2, str3, str4, str5, map});
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        if (!map.containsKey(PARAM_TINCT_TAG)) {
            map.put(PARAM_TINCT_TAG, bpt.a(str4));
        }
        UmbrellaInfo.a aVar = new UmbrellaInfo.a(str2, str3, str, str4, str5);
        aVar.a(str3).a(map);
        aVar.b("2.0");
        UmbrellaInfo a2 = aVar.a();
        AppMonitor.Alarm.commitSuccess("Page_Trade_Govern", UmbrellaTracker.PURCHASE_POINT_PRE + a2.mainBizName + UmbrellaTracker.PURCHASE_POINT_POST, a2.toJsonString());
    }

    public static void a(String str, String str2, String str3, String str4, String str5, Map<String, String> map, String str6, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3969d7f", new Object[]{str, str2, str3, str4, str5, map, str6, str7});
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        if (!TextUtils.isEmpty(str7)) {
            map.put("errorMsg", str7);
        }
        if (!map.containsKey(PARAM_TINCT_TAG)) {
            map.put(PARAM_TINCT_TAG, bpt.a(str4));
        }
        UmbrellaInfo.a aVar = new UmbrellaInfo.a(str2, str3, str, str4, str5);
        aVar.a(str3).a(map);
        aVar.b("2.0");
        UmbrellaInfo a2 = aVar.a();
        if (a2 == null) {
            return;
        }
        AppMonitor.Alarm.commitFail("Page_Trade_Govern", UmbrellaTracker.PURCHASE_POINT_PRE + a2.mainBizName + UmbrellaTracker.PURCHASE_POINT_POST, a2.toJsonString(), str6, str7);
    }

    public static void a(String str, String str2, UmTypeKey umTypeKey, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("693eb862", new Object[]{str, str2, umTypeKey, str3, str4});
            return;
        }
        UmbrellaInfo.a aVar = new UmbrellaInfo.a(null, null, umTypeKey.getKey(), str, "feedback");
        HashMap hashMap = new HashMap();
        hashMap.put("errorMsg", str4);
        hashMap.put("feedback", str2);
        hashMap.put("stacks", a());
        if (!hashMap.containsKey(PARAM_TINCT_TAG)) {
            hashMap.put(PARAM_TINCT_TAG, bpt.a(str));
        }
        aVar.a(hashMap);
        aVar.b("2.0");
        UmbrellaInfo a2 = aVar.a();
        if (a2 == null) {
            return;
        }
        AppMonitor.Alarm.commitFail("Page_Trade_Govern", UmbrellaTracker.PURCHASE_POINT_PRE + a2.mainBizName + UmbrellaTracker.PURCHASE_POINT_POST, a2.toJsonString(), str3, str4);
    }

    public static void a(Throwable th, String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("783f0a3f", new Object[]{th, str, str2, str3, str4, str5});
            return;
        }
        try {
            AppMonitor.Alarm.commitFail("Page_Trade_Govern", "Monitor_Umbrella2_Service", a(th), a(str), String.format("%s|%s|%s|%s", a(str2), a(str3), a(str4), a(str5)));
        } catch (Throwable th2) {
            Log.e("umbrella.LinkLogWorker", "SafetyRunnable catch exception", th2);
        }
    }

    private static String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : j.a(str) ? "empty" : str;
    }

    private static String a(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1003a7b3", new Object[]{th});
        }
        if (th == null) {
            return "empty_throwable";
        }
        String message = th.getMessage();
        if (j.a(message)) {
            Class<?> cls = th.getClass();
            if (cls == null) {
                return "empty_message";
            }
            String simpleName = cls.getSimpleName();
            return j.b(simpleName) ? simpleName : "empty_message";
        }
        return message.substring(Math.max(0, message.length() - 2000));
    }

    private static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace == null || stackTrace.length == 0) {
            return "empty_stack";
        }
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb.append("\nat " + stackTraceElement);
        }
        return j.a(sb.toString()) ? "empty_message" : sb.substring(0, Math.min(2000, sb.length()));
    }
}
