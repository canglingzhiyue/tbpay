package com.alibaba.wireless.security.framework.utils;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import tb.iju;
import tb.kge;

/* loaded from: classes.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static String[] f4291a = null;
    private static boolean b = true;
    private static boolean c = false;
    private static boolean d = true;
    private static boolean e = false;
    private static boolean f = true;
    private static boolean g = false;

    static {
        kge.a(888806071);
        f4291a = new String[]{"armeabi", iju.ABI_ARM, "x86", iju.ABI_ARM64, "x86_64"};
    }

    private static String a() {
        try {
            Method declaredMethod = Class.forName(ProcessUtils.ACTIVITY_THREAD, false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            if (invoke instanceof String) {
                return (String) invoke;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        String a2 = a();
        if (a2 != null) {
            return a2;
        }
        try {
            int myPid = Process.myPid();
            if (context == null) {
                return "";
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    return runningAppProcessInfo.processName != null ? runningAppProcessInfo.processName : "";
                }
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String a(ClassLoader classLoader, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de868bd4", new Object[]{classLoader, str});
        }
        if (classLoader == null || str == null || "".equals(str)) {
            return null;
        }
        String a2 = a(classLoader, str, true);
        return a2 == null ? a(classLoader, str, false) : a2;
    }

    private static String a(ClassLoader classLoader, String str, boolean z) {
        if (classLoader != null) {
            try {
                Method method = z ? classLoader.getClass().getMethod("findLibrary", String.class) : classLoader.getClass().getDeclaredMethod("findLibrary", String.class);
                if (method != null) {
                    if (!method.isAccessible()) {
                        method.setAccessible(true);
                    }
                    Object invoke = method.invoke(classLoader, str);
                    if (invoke != null && (invoke instanceof String)) {
                        return (String) invoke;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007d, code lost:
        if (r1 != null) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(java.lang.String r10, java.lang.String r11, java.io.File r12) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.wireless.security.framework.utils.e.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L1f
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r10
            r10 = 1
            r1[r10] = r11
            r10 = 2
            r1[r10] = r12
            java.lang.String r10 = "acf94df7"
            java.lang.Object r10 = r0.ipc$dispatch(r10, r1)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            return r10
        L1f:
            r0 = 0
            java.util.zip.ZipFile r1 = new java.util.zip.ZipFile     // Catch: java.lang.Throwable -> L73 java.io.IOException -> L75
            r1.<init>(r10)     // Catch: java.lang.Throwable -> L73 java.io.IOException -> L75
            java.lang.String[] r10 = com.alibaba.wireless.security.framework.utils.e.f4291a     // Catch: java.io.IOException -> L70 java.lang.Throwable -> L84
            int r0 = r10.length     // Catch: java.io.IOException -> L70 java.lang.Throwable -> L84
            r3 = 0
        L29:
            if (r2 >= r0) goto L80
            r4 = r10[r2]     // Catch: java.io.IOException -> L6d java.lang.Throwable -> L84
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L6d java.lang.Throwable -> L84
            r5.<init>()     // Catch: java.io.IOException -> L6d java.lang.Throwable -> L84
            java.lang.String r6 = "lib"
            r5.append(r6)     // Catch: java.io.IOException -> L6d java.lang.Throwable -> L84
            java.lang.String r6 = java.io.File.separator     // Catch: java.io.IOException -> L6d java.lang.Throwable -> L84
            r5.append(r6)     // Catch: java.io.IOException -> L6d java.lang.Throwable -> L84
            r5.append(r4)     // Catch: java.io.IOException -> L6d java.lang.Throwable -> L84
            java.lang.String r4 = java.io.File.separator     // Catch: java.io.IOException -> L6d java.lang.Throwable -> L84
            r5.append(r4)     // Catch: java.io.IOException -> L6d java.lang.Throwable -> L84
            r5.append(r11)     // Catch: java.io.IOException -> L6d java.lang.Throwable -> L84
            java.lang.String r4 = r5.toString()     // Catch: java.io.IOException -> L6d java.lang.Throwable -> L84
            java.util.zip.ZipEntry r4 = r1.getEntry(r4)     // Catch: java.io.IOException -> L6d java.lang.Throwable -> L84
            if (r4 == 0) goto L6a
            long r5 = r4.getSize()     // Catch: java.io.IOException -> L6d java.lang.Throwable -> L84
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L6a
            java.lang.String r5 = r4.getName()     // Catch: java.io.IOException -> L6d java.lang.Throwable -> L84
            boolean r5 = com.alibaba.wireless.security.framework.utils.a.a(r5)     // Catch: java.io.IOException -> L6d java.lang.Throwable -> L84
            if (r5 == 0) goto L6a
            boolean r3 = a(r1, r4, r12)     // Catch: java.io.IOException -> L6d java.lang.Throwable -> L84
        L6a:
            int r2 = r2 + 1
            goto L29
        L6d:
            r10 = move-exception
            r2 = r3
            goto L71
        L70:
            r10 = move-exception
        L71:
            r3 = r2
            goto L78
        L73:
            r10 = move-exception
            goto L86
        L75:
            r10 = move-exception
            r1 = r0
            r3 = 0
        L78:
            java.lang.String r11 = ""
            com.alibaba.wireless.security.framework.utils.FLOG.w(r11, r10)     // Catch: java.lang.Throwable -> L84
            if (r1 != 0) goto L80
            goto L83
        L80:
            r1.close()     // Catch: java.io.IOException -> L83
        L83:
            return r3
        L84:
            r10 = move-exception
            r0 = r1
        L86:
            if (r0 == 0) goto L8b
            r0.close()     // Catch: java.io.IOException -> L8b
        L8b:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.framework.utils.e.a(java.lang.String, java.lang.String, java.io.File):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x00c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(java.util.zip.ZipFile r9, java.util.zip.ZipEntry r10, java.io.File r11) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.framework.utils.e.a(java.util.zip.ZipFile, java.util.zip.ZipEntry, java.io.File):boolean");
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : Build.VERSION.SDK_INT >= 24;
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue();
        }
        if (f) {
            try {
                g = a(context).equals(context.getPackageName());
                f = false;
            } catch (Exception unused) {
            }
        }
        return g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
        if ((r4.applicationInfo.flags & 128) == 0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(android.content.Context r4) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.wireless.security.framework.utils.e.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L19
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r4
            java.lang.String r4 = "9f76bba2"
            java.lang.Object r4 = r0.ipc$dispatch(r4, r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        L19:
            boolean r0 = com.alibaba.wireless.security.framework.utils.e.b
            if (r0 == 0) goto L40
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            java.lang.String r4 = r4.getPackageName()     // Catch: java.lang.Throwable -> L3b
            android.content.pm.PackageInfo r4 = r0.getPackageInfo(r4, r3)     // Catch: java.lang.Throwable -> L3b
            if (r4 == 0) goto L3b
            android.content.pm.ApplicationInfo r0 = r4.applicationInfo     // Catch: java.lang.Throwable -> L3b
            int r0 = r0.flags     // Catch: java.lang.Throwable -> L3b
            r0 = r0 & r2
            if (r0 == 0) goto L3b
            android.content.pm.ApplicationInfo r4 = r4.applicationInfo     // Catch: java.lang.Throwable -> L3b
            int r4 = r4.flags     // Catch: java.lang.Throwable -> L3b
            r4 = r4 & 128(0x80, float:1.794E-43)
            if (r4 != 0) goto L3b
            goto L3c
        L3b:
            r2 = 0
        L3c:
            com.alibaba.wireless.security.framework.utils.e.c = r2
            com.alibaba.wireless.security.framework.utils.e.b = r3
        L40:
            boolean r4 = com.alibaba.wireless.security.framework.utils.e.c
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.framework.utils.e.c(android.content.Context):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
        if ((r4.applicationInfo.flags & 128) != 0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean d(android.content.Context r4) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.wireless.security.framework.utils.e.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L19
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r4
            java.lang.String r4 = "a0236741"
            java.lang.Object r4 = r0.ipc$dispatch(r4, r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        L19:
            boolean r0 = com.alibaba.wireless.security.framework.utils.e.d
            if (r0 == 0) goto L39
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            java.lang.String r4 = r4.getPackageName()     // Catch: java.lang.Throwable -> L34
            android.content.pm.PackageInfo r4 = r0.getPackageInfo(r4, r3)     // Catch: java.lang.Throwable -> L34
            if (r4 == 0) goto L34
            android.content.pm.ApplicationInfo r4 = r4.applicationInfo     // Catch: java.lang.Throwable -> L34
            int r4 = r4.flags     // Catch: java.lang.Throwable -> L34
            r4 = r4 & 128(0x80, float:1.794E-43)
            if (r4 == 0) goto L34
            goto L35
        L34:
            r2 = 0
        L35:
            com.alibaba.wireless.security.framework.utils.e.e = r2
            com.alibaba.wireless.security.framework.utils.e.d = r3
        L39:
            boolean r4 = com.alibaba.wireless.security.framework.utils.e.e
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.framework.utils.e.d(android.content.Context):boolean");
    }
}
