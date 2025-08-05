package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class occ {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_INACTIVE_CROWD = "inactive_crowd";
    public static final String KEY_WEEX_LOAD_URL = "weexLoadUrl";

    static {
        kge.a(1628740618);
    }

    public static void a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18de974", new Object[]{context, str, str2});
            return;
        }
        SharedPreferences.Editor edit = a(context).edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public static String a(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cfe597b6", new Object[]{context, str}) : b(context, str, "");
    }

    public static String b(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a3b17b6d", new Object[]{context, str, str2}) : a(context).getString(str, str2);
    }

    public static void a(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d51141ea", new Object[]{context, str, new Boolean(z)});
            return;
        }
        SharedPreferences.Editor edit = a(context).edit();
        edit.putBoolean(str, z);
        edit.apply();
    }

    public static boolean b(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9b80d80d", new Object[]{context, str})).booleanValue() : a(context).getBoolean(str, false);
    }

    public static boolean b(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d49adbef", new Object[]{context, str, new Boolean(z)})).booleanValue() : a(context).getBoolean(str, z);
    }

    public static void a(Context context, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d51105da", new Object[]{context, str, new Long(j)});
            return;
        }
        SharedPreferences.Editor edit = a(context).edit();
        edit.putLong(str, j);
        edit.apply();
    }

    public static long c(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d54b79dc", new Object[]{context, str})).longValue() : a(context).getLong(str, 0L);
    }

    public static void a(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5110219", new Object[]{context, str, new Integer(i)});
            return;
        }
        SharedPreferences.Editor edit = a(context).edit();
        edit.putInt(str, i);
        edit.apply();
    }

    public static int b(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d49a9c0d", new Object[]{context, str, new Integer(i)})).intValue() : a(context).getInt(str, i);
    }

    private static SharedPreferences a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedPreferences) ipChange.ipc$dispatch("6ebdfd34", new Object[]{context}) : obu.e().getSharedPreferences("com.taobao.video", 0);
    }
}
