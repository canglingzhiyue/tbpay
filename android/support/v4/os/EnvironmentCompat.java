package android.support.v4.os;

import android.os.Build;
import android.os.Environment;
import java.io.File;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class EnvironmentCompat {
    public static final String MEDIA_UNKNOWN = "unknown";
    private static final String TAG = "EnvironmentCompat";

    private EnvironmentCompat() {
    }

    public static String getStorageState(File file) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Environment.getStorageState(file);
        }
        try {
            return file.getCanonicalPath().startsWith(Environment.getExternalStorageDirectory().getCanonicalPath()) ? Environment.getExternalStorageState() : "unknown";
        } catch (IOException e) {
            String str = "Failed to resolve canonical path: " + e;
            return "unknown";
        }
    }
}
