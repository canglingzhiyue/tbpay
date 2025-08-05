package tb;

import android.content.Context;
import android.os.Build;
import android.os.StatFs;
import android.os.SystemClock;
import android.system.OsConstants;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseLongArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.resourceguardian.data.model.b;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes6.dex */
public class ils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ARCH_BIT32 = "32";
    public static final String ARCH_BIT64 = "64";
    public static final long FATIGUE_DURATION = 30000;
    public static final String UNKNOWN = "unknown";

    /* renamed from: a  reason: collision with root package name */
    public static long f29140a;
    public static final SparseLongArray warningGeneratedUptimeArray;

    static {
        kge.a(886874917);
        f29140a = 100L;
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                Class<?> cls = Class.forName("libcore.io.Libcore");
                Class<?> cls2 = Class.forName("libcore.io.Os");
                Field declaredField = cls.getDeclaredField("os");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(cls);
                Method method = cls2.getMethod("sysconf", Integer.TYPE);
                method.setAccessible(true);
                Object invoke = method.invoke(obj, Integer.valueOf(OsConstants._SC_CLK_TCK));
                if (invoke instanceof Long) {
                    f29140a = ((Long) invoke).longValue();
                }
            }
        } catch (Exception e) {
            ilt.a("ProviderUtils", "get sJiffyHz failed", e.toString());
        }
        warningGeneratedUptimeArray = new SparseLongArray();
    }

    public static long a(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4dba98bc", new Object[]{str, str2, new Long(j)})).longValue();
        }
        String a2 = ilv.a(str + "_" + str2);
        if (TextUtils.isEmpty(a2)) {
            return j;
        }
        try {
            return Long.parseLong(a2);
        } catch (NumberFormatException e) {
            ilt.a("ProviderUtils", "getThreshold failed", e.toString());
            return j;
        }
    }

    public static boolean a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("733ff0c7", new Object[]{bVar})).booleanValue();
        }
        if (bVar == null) {
            return false;
        }
        long j = warningGeneratedUptimeArray.get(bVar.b);
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - j > 30000) {
            warningGeneratedUptimeArray.put(bVar.b, uptimeMillis);
            return false;
        }
        Log.e("ProviderUtils", "checkFatigue true, type:" + bVar.b + ", nowTime:" + uptimeMillis + ", lastTime:" + j);
        return true;
    }

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        if (context == null) {
            return "unknown";
        }
        String str = context.getApplicationInfo().nativeLibraryDir;
        return TextUtils.isEmpty(str) ? "unknown" : a(str);
    }

    private static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        File file = new File(str);
        return !file.isDirectory() ? "unknown" : file.getName().toLowerCase().startsWith("arm64") ? ARCH_BIT64 : ARCH_BIT32;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.io.Closeable, java.io.FileReader, java.io.Reader] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v8 */
    public static String a() {
        ?? r6;
        BufferedReader bufferedReader;
        IOException e;
        String readLine;
        String[] split;
        try {
            r6 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, "ro.soc.model", "unknown");
        } catch (Exception e2) {
            ilt.a("ProviderUtils", "getCpuName from properties error", e2.toString());
            r6 = 0;
        }
        ?? isEmpty = TextUtils.isEmpty(r6);
        try {
            if (isEmpty == 0) {
                return r6;
            }
            try {
                r6 = new FileReader("/proc/cpuinfo");
                try {
                    bufferedReader = new BufferedReader(r6);
                } catch (IOException e3) {
                    bufferedReader = null;
                    e = e3;
                } catch (Throwable th) {
                    th = th;
                    isEmpty = 0;
                    ilr.a(r6);
                    ilr.a(isEmpty);
                    throw th;
                }
            } catch (IOException e4) {
                bufferedReader = null;
                e = e4;
                r6 = 0;
            } catch (Throwable th2) {
                th = th2;
                r6 = 0;
                isEmpty = 0;
            }
            do {
                try {
                    readLine = bufferedReader.readLine();
                } catch (IOException e5) {
                    e = e5;
                    ilt.a("ProviderUtils", "getCpuName from file error", e.toString());
                    ilr.a(r6);
                    ilr.a(bufferedReader);
                    return "unknown";
                }
                if (readLine != null) {
                    split = readLine.toLowerCase().split(":\\s+", 2);
                } else {
                    ilr.a(r6);
                    ilr.a(bufferedReader);
                    return "unknown";
                }
            } while (!split[0].startsWith("model name"));
            String str = split[1];
            ilr.a(r6);
            ilr.a(bufferedReader);
            return str;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static String b(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("31400281", new Object[]{context}) : context == null ? "unknown" : String.valueOf(new StatFs(context.getCacheDir().getParentFile().getAbsolutePath()).getTotalBytes() / 1000000000);
    }

    public static String b() {
        FileReader fileReader;
        BufferedReader bufferedReader;
        IOException e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        try {
            fileReader = new FileReader("/proc/meminfo");
            try {
                bufferedReader = new BufferedReader(fileReader);
            } catch (IOException e2) {
                bufferedReader = null;
                e = e2;
            } catch (Throwable th) {
                th = th;
                bufferedReader = null;
                ilr.a(fileReader);
                ilr.a(bufferedReader);
                throw th;
            }
        } catch (IOException e3) {
            bufferedReader = null;
            e = e3;
            fileReader = null;
        } catch (Throwable th2) {
            th = th2;
            fileReader = null;
            bufferedReader = null;
        }
        try {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    ilr.a(fileReader);
                    ilr.a(bufferedReader);
                    return "unknown";
                }
                String[] split = readLine.split("\\s+");
                if (split.length != 3) {
                    ilr.a(fileReader);
                    ilr.a(bufferedReader);
                    return "unknown";
                }
                String valueOf = String.valueOf(Math.ceil(Double.parseDouble(split[1]) / 1048576.0d));
                ilr.a(fileReader);
                ilr.a(bufferedReader);
                return valueOf;
            } catch (Throwable th3) {
                th = th3;
                ilr.a(fileReader);
                ilr.a(bufferedReader);
                throw th;
            }
        } catch (IOException e4) {
            e = e4;
            ilt.a("ProviderUtils", e.toString());
            ilr.a(fileReader);
            ilr.a(bufferedReader);
            return "unknown";
        }
    }
}
