package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.umbrella.performance.UmbrellaPerformanceTracker;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.tao.homepage.launcher.g;
import com.taobao.tao.linklog.a;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class ksr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CHILD_BIZ = "GUESS_YOU_LIKE";
    public static final String DATA_PROCESS_GATEWAY_LOAD_CACHE = "GATEWAY_LOAD_CACHE";
    public static final String DATA_PROCESS_GATEWAY_LOAD_PRESET = "GATEWAY_LOAD_PRESET";
    public static final String MAIN_BIZ = "Page_Home";
    public static final String PERFORMANCE_TAG = "create_view";
    public static final String REQUEST_ADD_REPEAT_PARAMS = "request_add_repeat_params";
    public static final String TAG_EXCEPTION = "catch_exception";
    public static final String TAG_FIXED_TAB = "home_fixed_recommend_tab";
    public static final String TAG_FIXED_TAB_REQUEST = "home_fixed_recommend_tab_request";

    static {
        kge.a(1407434676);
    }

    public static void a(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{str, str2, map});
            return;
        }
        HashMap hashMap = null;
        if (map != null && !map.isEmpty()) {
            hashMap = new HashMap();
            hashMap.putAll(map);
        }
        a.a("netRequest", str, str2, "GUESS_YOU_LIKE", "Page_Home", hashMap);
    }

    public static void a(String str, String str2, String str3, String str4, String str5, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2562e1a4", new Object[]{str, str2, str3, str4, str5, str6});
        } else {
            a(str, str2, str3, str4, str5, str6, (Map<String, String>) null);
        }
    }

    public static void a(String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1822fd61", new Object[]{str, str2, str3, str4, str5, str6, map});
            return;
        }
        HashMap hashMap = null;
        if (!StringUtils.isEmpty(str5) && !StringUtils.isEmpty(str6)) {
            hashMap = new HashMap();
            hashMap.put(str5, str6);
        }
        if (map != null && !map.isEmpty()) {
            if (hashMap == null) {
                hashMap = new HashMap();
            }
            hashMap.putAll(map);
        }
        a.a("netRequest", str, str2, "GUESS_YOU_LIKE", "Page_Home", hashMap, str3, str4);
    }

    public static void b(String str, String str2, String str3, String str4, String str5, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8dbf3a5", new Object[]{str, str2, str3, str4, str5, str6});
        } else {
            a(str, str2, "", str3, str4, str5, str6);
        }
    }

    public static void a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54b86a6e", new Object[]{str, str2, str3, str4, str5, str6, str7});
            return;
        }
        HashMap hashMap = null;
        if (!StringUtils.isEmpty(str6) && !StringUtils.isEmpty(str7)) {
            hashMap = new HashMap();
            hashMap.put(str6, str7);
        }
        a.a("dataProcess", str, str2, "Page_Home", str3, hashMap, str4, str5);
    }

    public static void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{str, str2, str3, str4});
            return;
        }
        HashMap hashMap = null;
        if (!StringUtils.isEmpty(str3) && !StringUtils.isEmpty(str4)) {
            hashMap = new HashMap();
            hashMap.put(str3, str4);
        }
        a.a("dataProcess", str, str2, "Page_Home", "", hashMap);
    }

    public static void a(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9b9da5a", new Object[]{str, str2, str3, str4, str5});
            return;
        }
        HashMap hashMap = null;
        if (!StringUtils.isEmpty(str4) && !StringUtils.isEmpty(str5)) {
            hashMap = new HashMap();
            hashMap.put(str4, str5);
        }
        a.a("dataProcess", str, str2, "Page_Home", str3, hashMap);
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
            return;
        }
        HashMap hashMap = null;
        if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2)) {
            hashMap = new HashMap();
            hashMap.put(str, str2);
            hashMap.put("level", g.b());
        }
        a.a("signFree", "sign_free_abnormal_node", "1.0", "Page_Home", "", hashMap);
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("level", g.b());
        a.a(str, str2, "1.0", "Page_Home", "", hashMap);
    }

    public static void b(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb13311", new Object[]{str, str2, str3, str4});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("url", str3);
        hashMap.put("duration", str4);
        a.a("componentRender", str, str2, "Page_Home", "", hashMap);
    }

    public static void c(String str, String str2, String str3, String str4, String str5, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c5505a6", new Object[]{str, str2, str3, str4, str5, str6});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("url", str3);
        hashMap.put("duration", str4);
        a.a("componentRender", str, str2, "Page_Home", "", hashMap, str5, str6);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else {
            a.a("componentRender", "Async_Render", "1.0", "Page_Home", str2, null, str, str);
        }
    }

    public static void a(String str, long j, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f002c73", new Object[]{str, new Long(j), map});
        } else if (j < 20) {
        } else {
            UmbrellaPerformanceTracker.commitPerformancePoint("Page_Home", "create_view", str + "_create", j, map);
        }
    }

    public static void a(DXTemplateItem dXTemplateItem, JSONObject jSONObject, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a171079d", new Object[]{dXTemplateItem, jSONObject, str, str2, str3});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("data", jSONObject == null ? "" : jSONObject.toJSONString());
        hashMap.put("identifier", dXTemplateItem.b());
        hashMap.put("url", dXTemplateItem.c);
        a.a("componentRender", "DinamicX3RenderFailed", "1.0", "Page_Home", str3, hashMap, str, str2);
    }

    public static void a(String str, String str2, String str3, String str4, Map<String, String> map, String str5, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc941389", new Object[]{str, str2, str3, str4, map, str5, str6});
        } else {
            a.a(str, str2, str3, "Page_Home", str4, map, str5, str6);
        }
    }

    public static void a(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe179b03", new Object[]{str, th});
            return;
        }
        try {
            TLog.loge("UmbrellaMonitor", "UncatchedException,", th);
            a.a("componentRender", "catch_exception", "1.0", "Page_Home", str, a(th), th.getClass().getSimpleName(), th.getClass().getSimpleName());
        } catch (Throwable th2) {
            TLog.loge("UmbrellaMonitor", "when catch exception, it has an other exception.", th2);
            TLog.loge("UmbrellaMonitor", "the origin exception is ", th);
        }
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
}
