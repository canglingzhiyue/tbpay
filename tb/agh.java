package tb;

import android.app.Activity;
import android.content.pm.PackageManager;

/* loaded from: classes2.dex */
public class agh {
    public static boolean a(Activity activity) {
        try {
            activity.getApplicationContext().getPackageManager().getPackageInfo("cn.cyberIdentity.certification", 1);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
