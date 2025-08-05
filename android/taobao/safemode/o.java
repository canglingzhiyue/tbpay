package android.taobao.safemode;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fc35a1ac", new Object[]{context, str, str2}) : context.getSharedPreferences("SafeModeOrange", 0).getString(str, str2);
    }

    public static void b(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bbd7193", new Object[]{context, str, str2});
        } else {
            context.getSharedPreferences("SafeModeOrange", 0).edit().putString(str, str2).apply();
        }
    }
}
