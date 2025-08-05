package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.alibaba.android.icart.core.data.b;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class bef {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CART_CHECK_BUBBLE_IS_SHOW = "cartCheckBubbleIsShow";

    static {
        kge.a(1127981649);
    }

    public static SharedPreferences a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("6ebdfd34", new Object[]{context});
        }
        if (context != null) {
            return PreferenceManager.getDefaultSharedPreferences(context);
        }
        return null;
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
        } else if (context == null) {
        } else {
            a(context).edit().putBoolean(CART_CHECK_BUBBLE_IS_SHOW, true).apply();
        }
    }

    public static boolean c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f76bba2", new Object[]{context})).booleanValue();
        }
        if (context != null) {
            return a(context).getBoolean(CART_CHECK_BUBBLE_IS_SHOW, false);
        }
        return false;
    }

    public static SharedPreferences d(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedPreferences) ipChange.ipc$dispatch("e9e108d1", new Object[]{context}) : context.getSharedPreferences(b.SP_FILE_NAME, 0);
    }
}
