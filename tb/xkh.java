package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes6.dex */
public class xkh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1516832206);
    }

    public static boolean a(Context context, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("602ff7e4", new Object[]{context, str, str2, new Boolean(z)})).booleanValue();
        }
        if (context == null) {
            kau.instance.d("SpUtils", "getBoolean context null", new Object[0]);
            return z;
        }
        try {
            return Boolean.parseBoolean(context.getSharedPreferences(str, 0).getString(str2, String.valueOf(z)));
        } catch (Exception e) {
            kau.instance.b("SpUtils", "getBoolean err", e, "key", str2);
            return z;
        }
    }

    public static void b(Context context, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bf173a1", new Object[]{context, str, str2, new Boolean(z)});
        } else if (context == null) {
            kau.instance.d("SpUtils", "putBoolean context null", new Object[0]);
        } else {
            try {
                context.getSharedPreferences(str, 0).edit().putString(str2, String.valueOf(z)).apply();
            } catch (Exception e) {
                kau.instance.b("SpUtils", "putBoolean err", e, "key", str2);
            }
        }
    }

    public static void a(Context context, String str, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a974c1b", new Object[]{context, str, map});
        } else if (context == null) {
            kau.instance.d("SpUtils", "saveTLogOffToSP context null", new Object[0]);
        } else if (map == null || map.isEmpty()) {
            kau.instance.d("SpUtils", "map empty!", new Object[0]);
        } else {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
                for (Map.Entry<String, ?> entry : map.entrySet()) {
                    edit.putString(entry.getKey(), String.valueOf(entry.getValue()));
                }
                edit.apply();
                if (!kap.a()) {
                    return;
                }
                kau.instance.c("SpUtils", "saveConfigToSP", "spName", str, "map", map.toString());
            } catch (Exception e) {
                kau.instance.b("SpUtils", "saveConfigToSP err", e, new Object[0]);
            }
        }
    }

    public static Map<String, ?> a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a75136df", new Object[]{context, str});
        }
        if (context == null) {
            kau.instance.d("SpUtils", "getAll context null", new Object[0]);
            return null;
        }
        try {
            return context.getSharedPreferences(str, 0).getAll();
        } catch (Exception e) {
            kau.instance.b("SpUtils", "geAll fail:", e, new Object[0]);
            return null;
        }
    }
}
