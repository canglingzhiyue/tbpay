package tb;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.utils.Global;

/* loaded from: classes7.dex */
public class mxv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1599031230);
    }

    public static boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{str, new Boolean(z)})).booleanValue() : PreferenceManager.getDefaultSharedPreferences(Global.getApplication()).getBoolean(str, z);
    }

    public static void b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d257bc1", new Object[]{str, new Boolean(z)});
            return;
        }
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(Global.getApplication()).edit();
        edit.putBoolean(str, z);
        edit.apply();
    }

    public static long a(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4dba98bc", new Object[]{str, str2, new Long(j)})).longValue() : Globals.getApplication().getSharedPreferences(str, 0).getLong(str2, j);
    }

    public static void b(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("551fcde7", new Object[]{str, str2, new Long(j)});
        } else {
            Globals.getApplication().getSharedPreferences(str, 0).edit().putLong(str2, j).apply();
        }
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
        } else {
            Globals.getApplication().getSharedPreferences(str, 0).edit().putString(str2, str3).apply();
        }
    }

    public static String b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("87942679", new Object[]{str, str2, str3}) : Globals.getApplication().getSharedPreferences(str, 0).getString(str2, str3);
    }
}
