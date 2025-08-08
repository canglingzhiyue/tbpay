package tb;

import android.content.Context;
import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.f;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class cze {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f26611a = true;
    private static boolean b = true;
    private static int c = 1000;
    private static Set<String> d = null;
    private static SharedPreferences e = null;
    private static boolean f = false;

    public static /* synthetic */ void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[0]);
        } else {
            g();
        }
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        try {
            OrangeConfig.getInstance().registerListener(new String[]{"network_diagnosis"}, new f() { // from class: tb.cze.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.orange.f
                public void onConfigUpdate(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d0b193b", new Object[]{this, str});
                    } else {
                        cze.f();
                    }
                }
            });
            SharedPreferences sharedPreferences = context.getSharedPreferences("network_diagnosis", 0);
            e = sharedPreferences;
            f26611a = sharedPreferences.getBoolean("mtop_detect_enable", true);
            c = e.getInt("slow_server_threshold", 1000);
            d = e.getStringSet("server_exception_list", null);
            f = e.getBoolean("diagnosis_v2_enable", false);
        } catch (Exception unused) {
            ALog.e("npm.RemoteConfig", "orange is not support", null, new Object[0]);
        }
    }

    private static void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[0]);
            return;
        }
        try {
            String a2 = a("mtop_detect_enable", (String) null);
            if (!StringUtils.isEmpty(a2)) {
                f26611a = Boolean.valueOf(a2).booleanValue();
                a("mtop_detect_enable", Boolean.valueOf(f26611a));
            }
        } catch (Exception unused) {
        }
        try {
            String a3 = a("slow_server_threshold", (String) null);
            if (!StringUtils.isEmpty(a3)) {
                c = Integer.valueOf(a3).intValue();
                a("slow_server_threshold", Integer.valueOf(c));
            }
        } catch (Exception unused2) {
        }
        try {
            String a4 = a("server_exception_list", (String) null);
            if (!StringUtils.isEmpty(a4)) {
                HashSet hashSet = new HashSet();
                JSONArray jSONArray = new JSONArray(a4);
                for (int i = 0; i < jSONArray.length(); i++) {
                    hashSet.add(jSONArray.getString(i));
                }
                d = hashSet;
                a("server_exception_list", d);
            }
        } catch (Exception unused3) {
        }
        try {
            String a5 = a("mp_quic_setting_enable", (String) null);
            if (!StringUtils.isEmpty(a5)) {
                b = Boolean.parseBoolean(a5);
                a("mp_quic_setting_enable", Boolean.valueOf(b));
            }
        } catch (Exception unused4) {
        }
        try {
            String a6 = a("diagnosis_v2_enable", (String) null);
            if (!StringUtils.isEmpty(a6)) {
                f = Boolean.parseBoolean(a6);
                a("diagnosis_v2_enable", Boolean.valueOf(Boolean.parseBoolean(a6)));
            }
        } catch (Exception unused5) {
        }
        try {
            String a7 = a("error_view_v2_enable", (String) null);
            if (StringUtils.isEmpty(a7)) {
                return;
            }
            a("error_view_v2_enable", Boolean.valueOf(Boolean.parseBoolean(a7)));
        } catch (Exception unused6) {
        }
    }

    private static void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{str, obj});
            return;
        }
        SharedPreferences sharedPreferences = e;
        if (sharedPreferences == null) {
            return;
        }
        if (obj == null) {
            sharedPreferences.edit().remove(str).apply();
        } else if (obj instanceof Integer) {
            sharedPreferences.edit().putInt(str, ((Integer) obj).intValue()).apply();
        } else if (obj instanceof String) {
            sharedPreferences.edit().putString(str, (String) obj).apply();
        } else if (obj instanceof Set) {
            sharedPreferences.edit().putStringSet(str, (Set) obj).apply();
        } else if (!(obj instanceof Boolean)) {
        } else {
            sharedPreferences.edit().putBoolean(str, ((Boolean) obj).booleanValue()).apply();
        }
    }

    private static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        try {
            return OrangeConfig.getInstance().getConfig("network_diagnosis", str, str2);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : f26611a;
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue() : c;
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        Set<String> set = d;
        if (set != null) {
            return set.contains(str);
        }
        return false;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : b;
    }
}
