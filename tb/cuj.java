package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class cuj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1105405837);
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
        } else {
            context.getSharedPreferences("IMAGE_SEARCH_APP", 0).edit().putString("COMMON_".concat(str), "").apply();
        }
    }

    public static void a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18de974", new Object[]{context, str, str2});
        } else {
            context.getSharedPreferences("IMAGE_SEARCH_APP", 0).edit().putString("COMMON_".concat(str), str2).apply();
        }
    }

    public static String b(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a3b17b6d", new Object[]{context, str, str2}) : context.getSharedPreferences("IMAGE_SEARCH_APP", 0).getString("COMMON_".concat(str), str2);
    }

    public static long a(Context context, String str, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d51105ce", new Object[]{context, str, new Long(j)})).longValue() : context.getSharedPreferences("IMAGE_SEARCH_APP", 0).getLong("COMMON_".concat(str), j);
    }

    public static void a(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d51141ea", new Object[]{context, str, new Boolean(z)});
        } else {
            context.getSharedPreferences("IMAGE_SEARCH_APP", 0).edit().putBoolean("COMMON_".concat(str), z).apply();
        }
    }

    public static boolean b(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d49adbef", new Object[]{context, str, new Boolean(z)})).booleanValue() : context.getSharedPreferences("IMAGE_SEARCH_APP", 0).getBoolean("COMMON_".concat(str), z);
    }
}
