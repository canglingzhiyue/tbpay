package tb;

import android.content.Context;
import android.os.Build;

/* loaded from: classes9.dex */
public final class rtt {
    static {
        kge.a(-1652313345);
    }

    public static String a(Context context) {
        return context.getFilesDir().getPath();
    }

    public static String c(Context context) {
        return (Build.VERSION.SDK_INT >= 21 ? context.getCodeCacheDir() : context.getCacheDir()).getPath();
    }
}
