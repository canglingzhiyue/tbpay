package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;

/* loaded from: classes.dex */
public class fxk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DX_GLOBAL_SP = "dx_global_sp";

    static {
        kge.a(1206340336);
    }

    public static String a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fc35a1ac", new Object[]{context, str, str2});
        }
        SharedPreferences a2 = a(context);
        return a2 == null ? str2 : a2.getString(str, str2);
    }

    public static void b(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bbd7193", new Object[]{context, str, str2});
            return;
        }
        SharedPreferences a2 = a(context);
        if (a2 == null) {
            return;
        }
        SharedPreferences.Editor edit = a2.edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public static void a(String str, String str2, String str3) {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
            return;
        }
        Context i = DinamicXEngine.i();
        if (i == null || (sharedPreferences = i.getSharedPreferences(str, 0)) == null) {
            return;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(str2, str3);
        edit.apply();
    }

    public static String b(String str, String str2, String str3) {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("87942679", new Object[]{str, str2, str3});
        }
        Context i = DinamicXEngine.i();
        return (i == null || (sharedPreferences = i.getSharedPreferences(str, 0)) == null) ? str3 : sharedPreferences.getString(str2, str3);
    }

    public static SharedPreferences a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("6ebdfd34", new Object[]{context});
        }
        if (context != null) {
            return context.getSharedPreferences(DX_GLOBAL_SP, 0);
        }
        return null;
    }
}
