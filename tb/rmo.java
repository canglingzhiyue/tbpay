package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes9.dex */
public class rmo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f33235a;

    static {
        kge.a(1268815441);
        f33235a = "skin_pref";
    }

    public static void a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18de974", new Object[]{context, str, str2});
            return;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences(f33235a, 0).edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public static String b(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a3b17b6d", new Object[]{context, str, str2}) : context.getSharedPreferences(f33235a, 0).getString(str, str2);
    }
}
