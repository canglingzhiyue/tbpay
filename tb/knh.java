package tb;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.provider.Settings;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class knh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue() : Build.VERSION.SDK_INT >= 23 ? Settings.canDrawOverlays(context) : b(context);
    }

    public static boolean b(Context context) {
        try {
            if (Build.VERSION.SDK_INT < 19) {
                return true;
            }
            return ((Integer) AppOpsManager.class.getMethod("checkOp", Integer.TYPE, Integer.TYPE, String.class).invoke((AppOpsManager) context.getSystemService("appops"), 24, Integer.valueOf(Binder.getCallingUid()), context.getApplicationContext().getPackageName())).intValue() == 0;
        } catch (Exception | NoClassDefFoundError unused) {
            return false;
        }
    }
}
