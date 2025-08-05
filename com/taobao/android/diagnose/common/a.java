package com.taobao.android.diagnose.common;

import android.os.Build;
import android.os.Process;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.v;
import java.lang.reflect.Method;
import tb.iju;
import tb.kge;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BIT32 = 1;
    public static final int BIT64 = 2;
    public static final int UNKNOWN = 0;

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f11698a;
    private static final Object b;

    static {
        kge.a(-1717033414);
        f11698a = null;
        b = new Object();
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 21) {
            return false;
        }
        String lowerCase = Build.SUPPORTED_ABIS[0].toLowerCase();
        return iju.ABI_ARM64.equals(lowerCase) || "x86_64".equals(lowerCase) || "mips64".equals(lowerCase);
    }

    public static boolean b() {
        boolean booleanValue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        Boolean bool = f11698a;
        if (bool != null) {
            return bool.booleanValue();
        }
        synchronized (b) {
            if (f11698a == null) {
                f11698a = Boolean.valueOf(c());
            }
            booleanValue = f11698a.booleanValue();
        }
        return booleanValue;
    }

    private static boolean c() {
        Object invoke;
        Object invoke2;
        if (Build.VERSION.SDK_INT >= 23) {
            return Process.is64Bit();
        }
        try {
            Class<?> cls = Class.forName("dalvik.system.VMRuntime");
            Method a2 = f.a(cls, "is64Bit", new Class[0]);
            Method a3 = f.a(cls, "getRuntime", new Class[0]);
            if (a2 != null && a3 != null && (invoke = a3.invoke(null, new Object[0])) != null && (invoke2 = a2.invoke(invoke, new Object[0])) != null) {
                return ((Boolean) invoke2).booleanValue();
            }
        } catch (Throwable th) {
            v.a("CPUArchUtil", "isRunning64BitInternal", th);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(android.content.Context r6) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.diagnose.common.a.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L19
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r6
            java.lang.String r6 = "9e1d6453"
            java.lang.Object r6 = r0.ipc$dispatch(r6, r1)
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            return r6
        L19:
            android.content.Context r6 = r6.getApplicationContext()
            java.lang.String r6 = r6.getPackageResourcePath()
            java.io.File r0 = new java.io.File
            r0.<init>(r6)
            boolean r6 = r0.isFile()
            if (r6 == 0) goto L80
            boolean r6 = r0.exists()
            if (r6 == 0) goto L80
            boolean r6 = r0.canRead()
            if (r6 == 0) goto L80
            java.util.zip.ZipFile r6 = new java.util.zip.ZipFile     // Catch: java.lang.Exception -> L75
            r6.<init>(r0)     // Catch: java.lang.Exception -> L75
            r0 = 0
            java.lang.String r1 = "lib/armeabi-v7a/libc++_shared.so"
            java.util.zip.ZipEntry r1 = r6.getEntry(r1)     // Catch: java.lang.Throwable -> L5f
            if (r1 == 0) goto L48
            r1 = 1
            goto L49
        L48:
            r1 = 0
        L49:
            java.lang.String r4 = "lib/arm64-v8a/libc++_shared.so"
            java.util.zip.ZipEntry r0 = r6.getEntry(r4)     // Catch: java.lang.Throwable -> L5a
            if (r0 == 0) goto L53
            r0 = 1
            goto L54
        L53:
            r0 = 0
        L54:
            r6.close()     // Catch: java.lang.Exception -> L58
            goto L82
        L58:
            r6 = move-exception
            goto L78
        L5a:
            r0 = move-exception
            goto L61
        L5c:
            r4 = move-exception
            r1 = 0
            goto L63
        L5f:
            r0 = move-exception
            r1 = 0
        L61:
            throw r0     // Catch: java.lang.Throwable -> L62
        L62:
            r4 = move-exception
        L63:
            if (r0 == 0) goto L6e
            r6.close()     // Catch: java.lang.Throwable -> L69
            goto L71
        L69:
            r6 = move-exception
            r0.addSuppressed(r6)     // Catch: java.lang.Exception -> L72
            goto L71
        L6e:
            r6.close()     // Catch: java.lang.Exception -> L72
        L71:
            throw r4     // Catch: java.lang.Exception -> L72
        L72:
            r6 = move-exception
            r0 = 0
            goto L78
        L75:
            r6 = move-exception
            r0 = 0
            r1 = 0
        L78:
            java.lang.String r4 = "CPUArchUtil"
            java.lang.String r5 = "getApkType"
            com.taobao.android.diagnose.v.a(r4, r5, r6)
            goto L82
        L80:
            r0 = 0
            r1 = 0
        L82:
            if (r1 == 0) goto L85
            goto L86
        L85:
            r2 = 0
        L86:
            if (r0 == 0) goto L8a
            r2 = r2 | 2
        L8a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.diagnose.common.a.a(android.content.Context):int");
    }
}
