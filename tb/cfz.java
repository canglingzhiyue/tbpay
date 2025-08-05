package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.alibaba.security.ccrc.service.build.Kb;
import com.alibaba.wireless.aliprivacy.c;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class cfz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue() : context.getSharedPreferences("tb_recommend_privacy", 0).contains("content");
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
        } else {
            context.getSharedPreferences("tb_recommend_privacy", 0).edit().remove("content").apply();
        }
    }

    public static boolean c(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9f76bba2", new Object[]{context})).booleanValue() : context.getSharedPreferences("tb_recommend_privacy", 0).getBoolean("content", true);
    }

    public static void a(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258fda74", new Object[]{context, new Boolean(z)});
        } else {
            context.getSharedPreferences("tb_recommend_privacy", 0).edit().putBoolean("content", z).apply();
        }
    }

    public static boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61b6362e", new Object[]{context, str})).booleanValue();
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("ali_privacy_recommend", 0);
        return sharedPreferences.contains("recommend_status#" + str);
    }

    public static boolean b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b80d80d", new Object[]{context, str})).booleanValue();
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("ali_privacy_recommend", 0);
        return sharedPreferences.getBoolean("recommend_status#" + str, true);
    }

    public static void a(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d51141ea", new Object[]{context, str, new Boolean(z)});
            return;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences("ali_privacy_recommend", 0).edit();
        edit.putBoolean("recommend_status#" + str, z).apply();
    }

    public static void c(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d54b79e8", new Object[]{context, str});
            return;
        }
        boolean z = context.getSharedPreferences("tb_recommend_privacy", 0).getBoolean("content", true);
        SharedPreferences.Editor edit = context.getSharedPreferences("ali_privacy_recommend", 0).edit();
        edit.putBoolean("recommend_status#" + str, z).apply();
    }

    public static boolean d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0236741", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return true;
        }
        try {
            return context.getSharedPreferences("ali_privacy_recommend", 0).getBoolean("recommend_status_not_logged_in", true);
        } catch (Throwable th) {
            c.a("SP", "getRecommendStatusWithoutUid " + th.getMessage());
            return true;
        }
    }

    public static void b(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a78a2b5", new Object[]{context, new Boolean(z)});
        } else if (context == null) {
        } else {
            try {
                c.a("SP", "saveRecommendStatusWithoutUid: " + z);
                context.getSharedPreferences("ali_privacy_recommend", 0).edit().putBoolean("recommend_status_not_logged_in", z).apply();
            } catch (Throwable th) {
                c.a("SP", "saveRecommendStatusWithoutUid: " + th.getMessage());
            }
        }
    }

    public static String o(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("105e27c4", new Object[]{context, str});
        }
        if (context == null) {
            return null;
        }
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("ali_privacy_recommend", 0);
            return sharedPreferences.getString("privacy_profile_" + str, null);
        } catch (Throwable th) {
            c.a("PrivacySpHelper", "getPrivacyProfileFromSp " + th.getMessage());
            return null;
        }
    }

    public static void p(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c495b23b", new Object[]{context, str});
        } else if (context == null) {
        } else {
            try {
                c.a("PrivacySpHelper", "removePrivacyProfileFromSp: privacy_profile_" + str);
                SharedPreferences.Editor edit = context.getSharedPreferences("ali_privacy_recommend", 0).edit();
                edit.remove("privacy_profile_" + str).apply();
            } catch (Throwable th) {
                c.a("PrivacySpHelper", "getPrivacyProfileFromSp " + th.getMessage());
            }
        }
    }

    public static boolean a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d18de978", new Object[]{context, str, str2})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        try {
            c.a("SP", "setPrivacyProfileToSp: " + str2);
            SharedPreferences.Editor edit = context.getSharedPreferences("ali_privacy_recommend", 0).edit();
            edit.putString("privacy_profile_" + str, str2).apply();
            return true;
        } catch (Throwable th) {
            c.a("SP", "setPrivacyProfileToSp: " + th.getMessage());
            return false;
        }
    }

    public static void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0d012dc", new Object[]{context});
        } else {
            context.getSharedPreferences("ali_privacy_recommend", 0).edit().remove("user_id").commit();
        }
    }

    public static void d(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f161bc7", new Object[]{context, str});
        } else {
            context.getSharedPreferences("ali_privacy_recommend", 0).edit().putString("user_id", str).apply();
        }
    }

    public static String f(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7289b85", new Object[]{context}) : context.getSharedPreferences("ali_privacy_recommend", 0).getString("user_id", null);
    }

    public static void e(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48e0bda6", new Object[]{context, str});
        } else {
            context.getSharedPreferences("ali_privacy_recommend", 0).edit().putString("mtop_api", str).apply();
        }
    }

    public static String g(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7ca2c1c6", new Object[]{context}) : context.getSharedPreferences("ali_privacy_recommend", 0).getString("mtop_api", null);
    }

    public static void f(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82ab5f85", new Object[]{context, str});
        } else {
            context.getSharedPreferences("ali_privacy_recommend", 0).edit().putString("sync_switch", str).apply();
        }
    }

    public static String h(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f21ce807", new Object[]{context}) : context.getSharedPreferences("ali_privacy_recommend", 0).getString("sync_switch", null);
    }

    public static String i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("67970e48", new Object[]{context});
        }
        try {
            return context.getSharedPreferences("ali_privacy_recommend", 0).getString("downgrade_without_uid", "0");
        } catch (Throwable unused) {
            return "0";
        }
    }

    public static void g(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc760164", new Object[]{context, str});
            return;
        }
        try {
            context.getSharedPreferences("ali_privacy_recommend", 0).edit().putString("downgrade_without_uid", str).apply();
        } catch (Throwable unused) {
        }
    }

    public static void h(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f640a343", new Object[]{context, str});
            return;
        }
        try {
            context.getSharedPreferences("ali_privacy_recommend", 0).edit().putString("recommend_entrance_name", str).apply();
        } catch (Throwable unused) {
        }
    }

    public static void i(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("300b4522", new Object[]{context, str});
            return;
        }
        try {
            context.getSharedPreferences("ali_privacy_recommend", 0).edit().putString("recommend_linked_h5_url", str).apply();
        } catch (Throwable unused) {
        }
    }

    public static void j(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69d5e701", new Object[]{context, str});
            return;
        }
        try {
            context.getSharedPreferences("ali_privacy_recommend", 0).edit().putString("recommend_ttid_list", str).apply();
        } catch (Throwable unused) {
        }
    }

    public static void k(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3a088e0", new Object[]{context, str});
            return;
        }
        try {
            context.getSharedPreferences("ali_privacy_recommend", 0).edit().putString("recommend_gray_scope", str).apply();
        } catch (Throwable unused) {
        }
    }

    public static String j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dd113489", new Object[]{context});
        }
        try {
            return context.getSharedPreferences("ali_privacy_recommend", 0).getString("recommend_entrance_name", "隐私-推荐管理");
        } catch (Throwable unused) {
            return "隐私-推荐管理";
        }
    }

    public static String k(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("528b5aca", new Object[]{context});
        }
        try {
            return context.getSharedPreferences("ali_privacy_recommend", 0).getString("recommend_linked_h5_url", "https://market.m.taobao.com/app/msd/m-privacy-center/index.html#/recommend");
        } catch (Throwable unused) {
            return "https://market.m.taobao.com/app/msd/m-privacy-center/index.html#/recommend";
        }
    }

    public static String l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c805810b", new Object[]{context});
        }
        try {
            return context.getSharedPreferences("ali_privacy_recommend", 0).getString("recommend_ttid_list", null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String m(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d7fa74c", new Object[]{context});
        }
        try {
            return context.getSharedPreferences("ali_privacy_recommend", 0).getString("recommend_gray_scope", "1000");
        } catch (Throwable unused) {
            return "1000";
        }
    }

    public static String n(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b2f9cd8d", new Object[]{context});
        }
        if (context != null) {
            return context.getSharedPreferences("ali_privacy_recommend", 0).getString("log_timeInterval", null);
        }
        return null;
    }

    public static void l(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6b2abf", new Object[]{context, str});
        } else {
            context.getSharedPreferences("ali_privacy_recommend", 0).edit().putString("log_timeInterval", str).apply();
        }
    }

    public static String o(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2873f3ce", new Object[]{context});
        }
        if (context != null) {
            return context.getSharedPreferences("ali_privacy_recommend", 0).getString(Kb.k, null);
        }
        return null;
    }

    public static void m(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1735cc9e", new Object[]{context, str});
        } else {
            context.getSharedPreferences("ali_privacy_recommend", 0).edit().putString(Kb.k, str).apply();
        }
    }

    public static String p(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9dee1a0f", new Object[]{context});
        }
        if (context != null) {
            return context.getSharedPreferences("ali_privacy_recommend", 0).getString("log_cache_count", null);
        }
        return null;
    }

    public static void n(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51006e7d", new Object[]{context, str});
        } else {
            context.getSharedPreferences("ali_privacy_recommend", 0).edit().putString("log_cache_count", str).apply();
        }
    }

    public static String q(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("13684050", new Object[]{context}) : context.getSharedPreferences("ali_privacy_recommend", 0).getString("recommend_display_switch", null);
    }
}
