package tb;

import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.tao.Globals;

/* loaded from: classes6.dex */
public class ssh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MARKET_CACHE = "marketCache";
    public static final String TOP_VIEW_CACHE = "topViewCache";

    static {
        kge.a(-35387555);
    }

    public static void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{str, new Boolean(z)});
            return;
        }
        kej.a("LauncherUtils", "markLaunchOnly, key " + str + " ,update " + z);
        SharedPreferences sharedPreferences = Globals.getApplication().getSharedPreferences("bootimage_coldstart_launch", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (z) {
            edit.putBoolean("needLaunchOnly", true);
            edit.putBoolean(str, true);
            edit.apply();
            return;
        }
        boolean z2 = sharedPreferences.getBoolean(MARKET_CACHE, false);
        boolean z3 = sharedPreferences.getBoolean(TOP_VIEW_CACHE, false);
        kej.a("LauncherUtils", "markLaunchOnly, marketState " + z2 + " ,topViewState " + z3);
        if (!TOP_VIEW_CACHE.equals(str)) {
            z2 = z3;
        }
        edit.putBoolean(str, false);
        kej.a("LauncherUtils", "markLaunchOnly, key " + str + " ,lastState " + z2);
        if (z2) {
            return;
        }
        edit.putBoolean("needLaunchOnly", false).apply();
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
            return;
        }
        kej.a("LauncherUtils", "markLaunchRely, needLoadCache " + z);
        Globals.getApplication().getSharedPreferences("bootimage_coldstart_launch", 0).edit().putBoolean("needLaunchRely", z).putString("userId", Login.getUserId()).apply();
    }
}
