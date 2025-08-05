package tb;

import android.app.Application;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;

/* loaded from: classes8.dex */
public class osk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1012478311);
    }

    public static boolean a(String str, String str2) {
        Application application;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || (application = Globals.getApplication()) == null) {
            return false;
        }
        SharedPreferences.Editor edit = application.getSharedPreferences("buy_after_sp_name", 0).edit();
        edit.putString(str, str2);
        edit.apply();
        return true;
    }

    public static String b(String str, String str2) {
        Application application;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{str, str2}) : (!TextUtils.isEmpty(str) && (application = Globals.getApplication()) != null) ? application.getSharedPreferences("buy_after_sp_name", 0).getString(str, str2) : str2;
    }
}
