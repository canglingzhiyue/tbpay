package tb;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes9.dex */
public final class rke {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-524575419);
    }

    public static boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61b6362e", new Object[]{context, str})).booleanValue();
        }
        Intent a2 = a(context.getPackageManager(), str);
        if (a2 == null) {
            return false;
        }
        try {
            context.startActivity(a2);
        } catch (Exception e) {
            e = e;
            z = false;
        }
        try {
            rkh.a(rkh.APP_LAUNCH, str);
            return true;
        } catch (Exception e2) {
            e = e2;
            rkg.b("AppUtils", "'" + str + "' application failed to launch");
            rkh.a(rkh.APP_LAUNCH, str, "0", e.getMessage());
            return z;
        }
    }

    private static Intent a(PackageManager packageManager, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("f67536d3", new Object[]{packageManager, str});
        }
        try {
            Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
            if (launchIntentForPackage != null) {
                Intent cloneFilter = launchIntentForPackage.cloneFilter();
                cloneFilter.addFlags(272629760);
                return cloneFilter;
            }
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            if (packageInfo == null || packageInfo.activities == null || packageInfo.activities.length != 1) {
                return null;
            }
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addFlags(272629760);
            intent.setClassName(packageInfo.packageName, packageInfo.activities[0].name);
            return intent;
        } catch (Exception e) {
            rkg.a("AppUtils", e.getMessage(), e);
            return null;
        }
    }
}
