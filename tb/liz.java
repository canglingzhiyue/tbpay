package tb;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class liz {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SP_FILE_NAME = "homepage_location_sp";

    static {
        kge.a(-1994915897);
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        Application a2 = lcz.a();
        if (a2 == null) {
            ldf.d("SharedPreferenceUtil", "getString error. application is null");
            return str2;
        }
        return a(a2).getString(str, str2);
    }

    public static boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{str, str2})).booleanValue();
        }
        Application a2 = lcz.a();
        if (a2 == null) {
            ldf.d("SharedPreferenceUtil", "putString error. application is null");
            return false;
        }
        SharedPreferences.Editor edit = a(a2).edit();
        edit.putString(str, str2);
        edit.apply();
        return true;
    }

    private static SharedPreferences a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedPreferences) ipChange.ipc$dispatch("6ebdfd34", new Object[]{context}) : context.getSharedPreferences("homepage_location_sp", 0);
    }
}
