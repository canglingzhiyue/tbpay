package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class aqb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1523571029);
    }

    public static String a(Context context, String str) {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cfe597b6", new Object[]{context, str});
        }
        if (context != null && (sharedPreferences = context.getSharedPreferences("ut_setting", 4)) != null) {
            return sharedPreferences.getString(str, null);
        }
        return null;
    }

    public static void a(Context context, String str, String str2) {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor edit;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18de974", new Object[]{context, str, str2});
        } else if (context == null || (sharedPreferences = context.getSharedPreferences("ut_setting", 4)) == null || (edit = sharedPreferences.edit()) == null) {
        } else {
            edit.putString(str, str2);
            edit.apply();
        }
    }
}
