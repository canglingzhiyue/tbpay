package tb;

import android.app.Application;
import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class lxq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SP_FILE_HOME_DX_DATA = "home_dx_data";

    static {
        kge.a(1796729725);
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue() : a("homepage_biz_switch", str, str2);
    }

    public static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{str, str2}) : b("homepage_biz_switch", str, str2);
    }

    public static boolean a(String str, String str2, String str3) {
        Application c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("929ad04a", new Object[]{str, str2, str3})).booleanValue();
        }
        if (StringUtils.isEmpty(str2) || (c = lxm.c()) == null) {
            return false;
        }
        SharedPreferences.Editor edit = c.getSharedPreferences(str, 0).edit();
        edit.putString(str2, str3);
        edit.apply();
        return true;
    }

    public static String b(String str, String str2, String str3) {
        Application c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("87942679", new Object[]{str, str2, str3});
        }
        if (StringUtils.isEmpty(str2) || (c = lxm.c()) == null) {
            return null;
        }
        return c.getSharedPreferences(str, 0).getString(str2, str3);
    }
}
