package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class pyz {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_RESOURCE_CHECK_TIME = "resource_check_time";

    static {
        kge.a(-200129591);
    }

    public static long a(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("61b6361e", new Object[]{context, str})).longValue() : context.getSharedPreferences("TaopaiDataCore", 0).getLong(str, 0L);
    }

    public static void a(Context context, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d51105da", new Object[]{context, str, new Long(j)});
            return;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences("TaopaiDataCore", 0).edit();
        edit.putLong(str, j);
        edit.apply();
    }
}
