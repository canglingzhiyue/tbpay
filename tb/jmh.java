package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public class jmh {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Map<String, String> switchCache;

    static {
        kge.a(1433132159);
        switchCache = new ConcurrentHashMap();
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue() : a("tsEnable", false);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : a(jmg.TS_RENDER_BY_EDITION, false);
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue() : a(jmg.TS_PREDICT_ENABLE, false);
    }

    public static boolean c(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9f76bba2", new Object[]{context})).booleanValue() : a(jmg.TS_RENDER_HIT_ENABLE, false);
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        if (switchCache.containsKey(str)) {
            return switchCache.get(str);
        }
        String a2 = jmg.a("tschedule", str, str2);
        switchCache.put(str, a2);
        return a2;
    }

    public static boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        if (switchCache.containsKey(str)) {
            return "true".equalsIgnoreCase(switchCache.get(str));
        }
        String a2 = jmg.a("tschedule", str, String.valueOf(z));
        switchCache.put(str, a2);
        return "true".equalsIgnoreCase(a2);
    }

    public static long a(String str, long j) {
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123b0c6", new Object[]{str, new Long(j)})).longValue();
        }
        if (switchCache.containsKey(str)) {
            a2 = switchCache.get(str);
        } else {
            a2 = jmg.a("tschedule", str, String.valueOf(j));
            switchCache.put(str, a2);
        }
        if (!StringUtils.isEmpty(a2)) {
            try {
                return Long.parseLong(switchCache.get(str));
            } catch (Throwable unused) {
            }
        }
        return j;
    }

    public static double a(String str, double d) {
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("81239a3a", new Object[]{str, new Double(d)})).doubleValue();
        }
        if (switchCache.containsKey(str)) {
            a2 = switchCache.get(str);
        } else {
            a2 = jmg.a("tschedule", str, String.valueOf(d));
            switchCache.put(str, a2);
        }
        if (!StringUtils.isEmpty(a2)) {
            try {
                return Double.parseDouble(switchCache.get(str));
            } catch (Throwable unused) {
            }
        }
        return d;
    }

    public static List<String> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("4a17df3e", new Object[0]) : a(jmg.CONFIG_KEY_TRIGGER_CUSTOM_WHITE_LIST);
    }

    public static List<String> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("31b9b59d", new Object[0]) : a(jmg.CONFIG_KEY_TRIGGER_IDLE_WHITE_LIST);
    }

    public static List<String> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("195b8bfc", new Object[0]) : a(jmg.CONFIG_KEY_TRIGGER_NAV_BLACK_LIST);
    }

    private static List<String> a(String str) {
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("287b5bd5", new Object[]{str});
        }
        if (switchCache.containsKey(str)) {
            a2 = switchCache.get(str);
        } else {
            a2 = jmg.a("tschedule", str, null);
        }
        if (!StringUtils.isEmpty(a2)) {
            try {
                return JSON.parseArray(a2, String.class);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{map});
            return;
        }
        jkq.a("TS.Switch", "resetOrangeConfig");
        jmg.a("tschedule", map);
        switchCache.clear();
        switchCache.putAll(map);
    }
}
