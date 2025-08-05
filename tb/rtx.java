package tb;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public class rtx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(528536392);
    }

    public static List<ActivityManager.RunningAppProcessInfo> a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("962721e7", new Object[]{context});
        }
        ArrayList arrayList = new ArrayList();
        try {
            String packageName = context.getPackageName();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.processName.startsWith(packageName)) {
                    arrayList.add(runningAppProcessInfo);
                }
            }
        } catch (Throwable th) {
            rty.f33380a.b("KUtils", "getRunningAppProcess err", th, new Object[0]);
        }
        return arrayList;
    }

    public static void a(final Context context, final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18de974", new Object[]{context, str, str2});
            return;
        }
        if (rtz.b == null) {
            rtz.b = kao.a(2, "alive-io");
        }
        rtz.b.execute(new Runnable() { // from class: tb.-$$Lambda$wtUEUZNOLGLkUA9ep8C0xIdsm-A
            @Override // java.lang.Runnable
            public final void run() {
                rtx.c(context, str, str2);
            }
        });
    }

    public static void b(Context context, ComponentName componentName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aee38690", new Object[]{context, componentName});
            return;
        }
        try {
            context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
        } catch (Throwable th) {
            rty.f33380a.b("KUtils", "enableComponent err", th, new Object[0]);
        }
    }

    public static String b(Context context, String str, String str2) {
        RandomAccessFile randomAccessFile;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a3b17b6d", new Object[]{context, str, str2});
        }
        FileLock fileLock = null;
        try {
            randomAccessFile = a(context, str);
        } catch (Throwable th) {
            th = th;
            randomAccessFile = null;
        }
        try {
            fileLock = randomAccessFile.getChannel().lock();
            return randomAccessFile.readLine();
        } catch (Throwable th2) {
            th = th2;
            try {
                rty.f33380a.b("KUtils", "safeReadFile err", th, new Object[0]);
                return str2;
            } finally {
                a(fileLock, randomAccessFile);
            }
        }
    }

    public static void a(Context context, ComponentName componentName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f46de60f", new Object[]{context, componentName});
            return;
        }
        try {
            context.getPackageManager().setComponentEnabledSetting(componentName, 2, 1);
        } catch (Throwable th) {
            rty.f33380a.b("KUtils", "disableComponent err", th, new Object[0]);
        }
    }

    public static void c(Context context, String str, String str2) {
        RandomAccessFile randomAccessFile;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5ecf9b2", new Object[]{context, str, str2});
            return;
        }
        FileLock fileLock = null;
        try {
            randomAccessFile = a(context, str);
        } catch (Throwable th) {
            th = th;
            randomAccessFile = null;
        }
        try {
            fileLock = randomAccessFile.getChannel().lock();
            randomAccessFile.write(str2.getBytes());
        } catch (Throwable th2) {
            th = th2;
            try {
                rty.f33380a.b("KUtils", "safeWriteFile err", th, new Object[0]);
            } finally {
                a(fileLock, randomAccessFile);
            }
        }
    }

    public static RandomAccessFile a(Context context, String str) throws FileNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RandomAccessFile) ipChange.ipc$dispatch("de82815c", new Object[]{context, str});
        }
        File file = new File(context.getFilesDir(), "alive");
        if (!file.exists()) {
            file.mkdir();
        }
        return new RandomAccessFile(new File(file, str + ".lk"), "rw");
    }

    public static void a(FileLock fileLock, RandomAccessFile randomAccessFile) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b79e82a9", new Object[]{fileLock, randomAccessFile});
            return;
        }
        if (fileLock != null) {
            try {
                fileLock.release();
            } catch (IOException unused) {
            }
        }
        if (randomAccessFile == null) {
            return;
        }
        try {
            randomAccessFile.close();
        } catch (IOException unused2) {
        }
    }
}
