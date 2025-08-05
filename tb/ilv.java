package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.speed.TBSpeed;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.d;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public class ilv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static SharedPreferences f29141a;
    private static final boolean b;
    private static Map<String, String> c;
    private static final Map<String, String> d;
    private static final ArrayList<String> e;

    public static /* synthetic */ SharedPreferences c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedPreferences) ipChange.ipc$dispatch("d112f1be", new Object[0]) : f29141a;
    }

    public static /* synthetic */ void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{str});
        } else {
            g(str);
        }
    }

    public static /* synthetic */ void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{str});
        } else {
            h(str);
        }
    }

    public static /* synthetic */ void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{str});
        } else {
            i(str);
        }
    }

    static {
        kge.a(556706898);
        c = new ConcurrentHashMap();
        d = new ConcurrentHashMap();
        e = new ArrayList<>();
        b = new File("/data/local/tmp/.tbrg/.test_switch_on").exists();
    }

    private static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
            return;
        }
        SharedPreferences sharedPreferences = f29141a;
        if (sharedPreferences == null) {
            return;
        }
        h(sharedPreferences.getString("warning_threshold_config", ""));
    }

    private static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[0]);
            return;
        }
        SharedPreferences sharedPreferences = f29141a;
        if (sharedPreferences == null) {
            return;
        }
        g(sharedPreferences.getString("warning_blacklist_config", ""));
    }

    private static Map<String, String> f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2185406c", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return (Map) JSON.parseObject(str, new TypeReference<Map<String, String>>() { // from class: tb.ilv.1
            }, new Feature[0]);
        } catch (Exception e2) {
            ilt.a("TBRGSwitches", "parseWarningBlackList failed ", e2.toString());
            return null;
        }
    }

    private static void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{str});
            return;
        }
        Map<String, String> f = f(str);
        if (f == null) {
            return;
        }
        c = f;
    }

    private static void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb017cf9", new Object[]{str});
            return;
        }
        Map<String, String> f = f(str);
        if (f == null) {
            return;
        }
        for (String str2 : f.keySet()) {
            String str3 = f.get(str2);
            if (str3 != null && !str3.isEmpty()) {
                d.put(str2, str3);
            }
        }
    }

    private static void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4533163a", new Object[]{str});
            return;
        }
        Map<String, String> f = f(str);
        if (f == null) {
            return;
        }
        String str2 = f.get("biz_ab_list");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            ArrayList arrayList = (ArrayList) JSON.parseObject(str2, new TypeReference<ArrayList<String>>() { // from class: tb.ilv.2
            }, new Feature[0]);
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            e.clear();
            e.addAll(arrayList);
        } catch (Exception e2) {
            ilt.a("TBRGSwitches", "parseWarningBlackList failed ", e2.toString());
        }
    }

    private static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[0]);
            return;
        }
        SharedPreferences sharedPreferences = f29141a;
        if (sharedPreferences == null) {
            return;
        }
        i(sharedPreferences.getString("biz_ab_list", ""));
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        f29141a = context.getSharedPreferences("tb_resource_guardian", 0);
        OrangeConfig.getInstance().registerListener(new String[]{"tb_resource_guardian"}, new d() { // from class: tb.ilv.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.orange.d
            public void onConfigUpdate(String str, Map<String, String> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                } else if (!"tb_resource_guardian".equals(str)) {
                } else {
                    if (map == null || Boolean.parseBoolean(map.get("fromCache"))) {
                        ilt.a("TBRGSwitches", "orange config updated, orange update from cache, this is useless. " + str);
                        return;
                    }
                    String config = OrangeConfig.getInstance().getConfig("tb_resource_guardian", "switch_on", "true");
                    String config2 = OrangeConfig.getInstance().getConfig("tb_resource_guardian", "warning_blacklist_config", "");
                    String config3 = OrangeConfig.getInstance().getConfig("tb_resource_guardian", "warning_threshold_config", "");
                    String config4 = OrangeConfig.getInstance().getConfig("tb_resource_guardian", "biz_ab_list", "");
                    ilv.c().edit().putString("switch_on", config).putString("warning_blacklist_config", config2).putString("warning_threshold_config", config3).putString("biz_ab_list", config4).apply();
                    ilv.c(config2);
                    ilv.d(config3);
                    ilv.e(config4);
                    ilt.a("TBRGSwitches", "orange config updated, orange update from network", ";namespace", "tb_resource_guardian", "; KEY_SWITCH", config, "; warningBlacklistConfig", config2, "; warningThresholdConfig", config3, "; bizAbListConfig", config4, ";");
                }
            }
        }, false);
        e();
        d();
        f();
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        SharedPreferences sharedPreferences = f29141a;
        if (sharedPreferences != null) {
            return Boolean.parseBoolean(sharedPreferences.getString("switch_on", "true"));
        }
        return true;
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        if (!c.containsKey(str)) {
            return false;
        }
        return TextUtils.equals(c.get(str), str2);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : d.get(str);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : b;
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue() : TBSpeed.isSpeedEdition(context, "RGWarningEnabled");
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue() : e.contains(str);
    }
}
