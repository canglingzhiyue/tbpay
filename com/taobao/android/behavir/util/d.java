package com.taobao.android.behavir.util;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.utils.Debuggable;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.Map;
import tb.bpp;
import tb.kge;

/* loaded from: classes4.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1659269424);
    }

    public static void a(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c430ebf9", new Object[]{str, str2, th});
            return;
        }
        try {
            TLog.loge("ExceptionUtils", "UncatchedException,", th);
            UtUtils.a(str, a(th), g.b("code", str2));
        } catch (Throwable th2) {
            TLog.loge("ExceptionUtils", "when catch exception, it has an other exception.", th2);
            TLog.loge("ExceptionUtils", "the origin exception is ", th);
        }
        if (Debuggable.isDebug()) {
            throw new RuntimeException(th);
        }
    }

    public static void a(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe179b03", new Object[]{str, th});
        } else {
            a(str, "", th);
        }
    }

    public static void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{str, jSONObject});
            return;
        }
        try {
            String valueOf = String.valueOf(l.b(jSONObject));
            if (a(valueOf)) {
                TLog.loge("ExceptionUtils", "catchErrorToUm onError : walle no init or degrade");
                return;
            }
            HashMap hashMap = new HashMap(jSONObject.size());
            for (String str2 : jSONObject.keySet()) {
                Object obj = jSONObject.get(str2);
                if (obj instanceof String) {
                    hashMap.put(str2, (String) obj);
                } else if (obj != null) {
                    hashMap.put(str2, obj.toString());
                }
            }
            bpp.a().commitFailure("eventProcess", "ExceptionUtils", "1.0", "BehaviR", str, hashMap, valueOf, "catchErrorToUm error");
        } catch (Throwable th) {
            TLog.loge("ExceptionUtils", "catchErrorToUm error, " + th.getMessage());
        }
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
            return;
        }
        try {
            bpp.a().commitFailure("eventProcess", "ExceptionUtils", "1.0", "BehaviR", str, null, str2, str3);
            TLog.loge(str, str2, str3);
        } catch (Throwable th) {
            TLog.loge("ExceptionUtils", "catchErrorToUm error, " + th.getMessage());
        }
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : !TextUtils.isEmpty(str) && (str.contains("209") || str.contains("83") || str.contains("84"));
    }

    private static Map<String, String> a(Throwable th) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bb4c7002", new Object[]{th});
        }
        HashMap hashMap = new HashMap(10);
        StackTraceElement[] stackTrace = th.getStackTrace();
        String str2 = "";
        if (stackTrace == null || stackTrace.length <= 0) {
            str = str2;
        } else {
            str2 = stackTrace[0].toString();
            StringBuilder sb = new StringBuilder();
            for (StackTraceElement stackTraceElement : stackTrace) {
                sb.append(stackTraceElement.toString());
                sb.append("\r\n");
            }
            str = sb.toString();
        }
        hashMap.put("errorMsg", th.toString() + " " + str2);
        hashMap.put("errorStackString", str);
        return hashMap;
    }

    public static void a(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2bf4cf4", new Object[]{str, str2, jSONObject});
            return;
        }
        HashMap hashMap = new HashMap();
        if (jSONObject != null) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                hashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        bpp.a().commitFailure("UCPCommonError", "", "", "UCP", "UCP", hashMap, str, str2);
    }
}
