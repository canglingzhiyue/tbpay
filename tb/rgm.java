package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* loaded from: classes9.dex */
public class rgm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-483760529);
    }

    public static void clear(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58a36b60", new Object[]{context, new Boolean(z)});
            return;
        }
        a(context.getFilesDir().getParentFile(), true, z);
        File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir == null || externalCacheDir.getParentFile() == null) {
            return;
        }
        File parentFile = externalCacheDir.getParentFile();
        a(parentFile, true, z);
        parentFile.delete();
    }

    public static void clear(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1e05f4", new Object[]{context});
        } else {
            clear(context, true);
        }
    }

    private static void a(File file, boolean z, boolean z2) {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43457e9f", new Object[]{file, new Boolean(z), new Boolean(z2)});
        } else if (file != null && file.exists() && !file.isFile() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (file2.isFile()) {
                    if (!z2 || !file2.getName().startsWith("UTCrashHandler")) {
                        a(file2);
                    }
                } else if (!z || !file2.getName().equals("lib")) {
                    a(file2, false, z2);
                    file2.delete();
                }
            }
        }
    }

    private static void a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a979fdf", new Object[]{file});
            return;
        }
        File file2 = new File(file.getAbsolutePath() + "tmp");
        file.renameTo(file2);
        file2.delete();
    }

    public static void deleteDir(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d8c8420", new Object[]{file});
            return;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                deleteDir(file2);
            }
        }
        file.delete();
    }
}
