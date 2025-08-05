package tb;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.system.Os;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ijw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String b = String.valueOf(SystemClock.uptimeMillis());

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f29102a = true;

    public static File a(Context context, String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("90186323", new Object[]{context, str});
        }
        File dir = context.getDir("swallows", 0);
        File file = new File(dir, "runtime_dir" + File.separator + a() + File.separator + str);
        if (!file.isDirectory()) {
            iku.b(file);
            RSoLog.c("StorageUtils, ensureUniqueRuntimeDir complete, dir = " + file.getPath());
        }
        return file;
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        File file = new File(context.getDir("swallows", 0), "runtime_dir");
        ArrayList<File> arrayList = new ArrayList();
        iku.a(file, arrayList);
        for (File file2 : arrayList) {
            if (file2.getPath().endsWith(a())) {
                RSoLog.c("StorageUtils, removeExpiredRuntimeDir, keep using " + file2.getPath());
            } else {
                RSoLog.c("StorageUtils, removeExpiredRuntimeDir, will delete " + file2.getPath());
                iky.a(file2);
            }
        }
    }

    private static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : b;
    }

    public static void a(File file, File file2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3abf716", new Object[]{file, file2});
        } else if (!file2.isDirectory()) {
            throw new RuntimeException("targetDir not available " + file2);
        } else {
            File file3 = new File(file2, file.getName());
            if (file3.exists()) {
                RSoLog.c("SWSoLoaderCore, targetLib exists,  " + file3);
                return;
            }
            try {
                if (f29102a && Build.VERSION.SDK_INT >= 21) {
                    RSoLog.c("SWSoLoaderCore, ready ensure symlink = " + file3 + "  ->  " + file);
                    Os.symlink(file.getPath(), file3.getPath());
                    return;
                }
            } catch (Throwable th) {
                ikq.a("Os.symlink", th);
            }
            RSoLog.c("SWSoLoaderCore, ready to copy file = " + file3 + "  from  " + file);
            iku.a(file, file3);
        }
    }
}
