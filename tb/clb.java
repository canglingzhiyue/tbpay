package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.alibaba.security.ccrc.service.build.Kb;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import java.util.UUID;

/* loaded from: classes3.dex */
public class clb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static String f26342a = "";

    public static long a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6454", new Object[]{context})).longValue();
        }
        String a2 = ckf.a(context, "vkeyid_settings", "update_time_interval");
        if (!cjw.b(a2)) {
            return 86400000L;
        }
        try {
            return Long.parseLong(a2);
        } catch (Exception unused) {
            return 86400000L;
        }
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
        } else {
            a(context, "update_time_interval", str);
        }
    }

    public static void a(Context context, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d51105da", new Object[]{context, str, new Long(j)});
        } else {
            ckf.a(context, "vkeyid_settings", "vkey_valid".concat(String.valueOf(str)), String.valueOf(j));
        }
    }

    private static void a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18de974", new Object[]{context, str, str2});
        } else {
            ckf.a(context, "vkeyid_settings", str, str2);
        }
    }

    public static void a(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258fda74", new Object[]{context, new Boolean(z)});
        } else {
            a(context, Kb.k, z ? "1" : "0");
        }
    }

    public static String b(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("31400281", new Object[]{context}) : ckf.a(context, "vkeyid_settings", "last_apdid_env");
    }

    public static void b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b80d809", new Object[]{context, str});
        } else {
            a(context, "last_machine_boot_time", str);
        }
    }

    public static void c(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d54b79e8", new Object[]{context, str});
        } else {
            a(context, "last_apdid_env", str);
        }
    }

    public static boolean c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f76bba2", new Object[]{context})).booleanValue();
        }
        String a2 = ckf.a(context, "vkeyid_settings", Kb.k);
        return a2 != null && "1".equals(a2);
    }

    public static String d(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1c344f03", new Object[]{context}) : ckf.a(context, "vkeyid_settings", "dynamic_key");
    }

    public static void d(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f161bc7", new Object[]{context, str});
        } else {
            a(context, "agent_switch", str);
        }
    }

    public static String e(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("91ae7544", new Object[]{context}) : ckf.a(context, "vkeyid_settings", "apse_degrade");
    }

    public static void e(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48e0bda6", new Object[]{context, str});
        } else {
            a(context, "dynamic_key", str);
        }
    }

    public static String f(Context context) {
        String str;
        SharedPreferences.Editor edit;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7289b85", new Object[]{context});
        }
        synchronized (clb.class) {
            if (cjw.a(f26342a)) {
                String a2 = ckh.a(context, "alipay_vkey_random", a.ATOM_EXT_random, "");
                f26342a = a2;
                if (cjw.a(a2)) {
                    f26342a = cjz.a(UUID.randomUUID().toString());
                    String str2 = f26342a;
                    if (str2 != null && (edit = context.getSharedPreferences("alipay_vkey_random", 0).edit()) != null) {
                        edit.putString(a.ATOM_EXT_random, str2);
                        edit.commit();
                    }
                }
            }
            str = f26342a;
        }
        return str;
    }

    public static void f(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82ab5f85", new Object[]{context, str});
        } else {
            a(context, "webrtc_url", str);
        }
    }

    public static void g(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc760164", new Object[]{context, str});
        } else {
            a(context, "apse_degrade", str);
        }
    }

    public static long h(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f640a337", new Object[]{context, str})).longValue();
        }
        try {
            String a2 = ckf.a(context, "vkeyid_settings", "vkey_valid".concat(String.valueOf(str)));
            if (!cjw.a(a2)) {
                return Long.parseLong(a2);
            }
            return 0L;
        } catch (Throwable unused) {
            return 0L;
        }
    }
}
