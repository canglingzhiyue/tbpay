package tb;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

/* loaded from: classes9.dex */
final class rte {
    static {
        kge.a(1994082122);
    }

    public static rtf a(Context context) {
        return new rtf(b(context).nativeLibraryDir);
    }

    private static ApplicationInfo b(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
