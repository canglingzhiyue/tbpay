package com.uc.webview.base;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.taobao.orange.OConstant;
import com.uc.webview.base.build.CoreType;
import com.uc.webview.base.h;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.UUID;
import mtopsdk.network.impl.ResponseProtocolType;
import tb.ils;
import tb.riy;

/* loaded from: classes9.dex */
public final class EnvInfo {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f23761a = new Object();
    private static volatile Context b = null;
    private static volatile Context c = null;
    private static volatile Boolean d = null;
    private static volatile Pair<Boolean, String> e = null;

    /* loaded from: classes9.dex */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        String f23762a;
        private String[] b;
        private Method c;

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        private static void a(StringBuilder sb, String str, String str2) {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            sb.append("\n  ");
            sb.append(str);
            sb.append(ResponseProtocolType.COMMENT);
            sb.append(str2);
        }

        static boolean a(String str) {
            if (TextUtils.isEmpty(Build.HARDWARE) || !Build.HARDWARE.contains(str)) {
                return !TextUtils.isEmpty(Build.FINGERPRINT) && Build.FINGERPRINT.contains(str);
            }
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0074 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        final java.lang.String[] a() {
            /*
                r7 = this;
                java.lang.String[] r0 = r7.b
                if (r0 == 0) goto L5
                return r0
            L5:
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                java.lang.String r1 = "os.arch"
                java.lang.String r1 = java.lang.System.getProperty(r1)
                boolean r2 = android.text.TextUtils.isEmpty(r1)
                if (r2 != 0) goto L1e
                java.lang.String r1 = r1.toLowerCase()
                r0.add(r1)
            L1e:
                java.lang.String r1 = android.os.Build.CPU_ABI
                boolean r2 = android.text.TextUtils.isEmpty(r1)
                if (r2 != 0) goto L2d
                java.lang.String r1 = r1.toLowerCase()
                r0.add(r1)
            L2d:
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 21
                r3 = 0
                if (r1 < r2) goto L43
                java.lang.Class<android.os.Build> r1 = android.os.Build.class
                java.lang.String r2 = "SUPPORTED_ABIS"
                java.lang.reflect.Field r1 = r1.getField(r2)     // Catch: java.lang.Throwable -> L43
                java.lang.Object r1 = r1.get(r3)     // Catch: java.lang.Throwable -> L43
                java.lang.String[] r1 = (java.lang.String[]) r1     // Catch: java.lang.Throwable -> L43
                goto L44
            L43:
                r1 = r3
            L44:
                java.lang.String r2 = "ro.product.cpu.abi"
                java.lang.String r2 = r7.b(r2)
                boolean r4 = android.text.TextUtils.isEmpty(r2)
                if (r4 != 0) goto L58
                java.lang.String r2 = r2.toLowerCase()
                r0.add(r2)
            L58:
                if (r1 != 0) goto L71
                java.lang.String r2 = "ro.product.cpu.abilist"
                java.lang.String r2 = r7.b(r2)
                boolean r4 = android.text.TextUtils.isEmpty(r2)
                if (r4 != 0) goto L71
                java.lang.String r1 = r2.toLowerCase()
                java.lang.String r2 = ","
                java.lang.String[] r1 = r1.split(r2)
            L71:
                r2 = 0
                if (r1 == 0) goto L87
                int r4 = r1.length     // Catch: java.lang.Throwable -> L87
                if (r4 == 0) goto L87
                int r4 = r1.length     // Catch: java.lang.Throwable -> L87
                r5 = 0
            L79:
                if (r5 >= r4) goto L87
                r6 = r1[r5]     // Catch: java.lang.Throwable -> L87
                java.lang.String r6 = r6.toLowerCase()     // Catch: java.lang.Throwable -> L87
                r0.add(r6)     // Catch: java.lang.Throwable -> L87
                int r5 = r5 + 1
                goto L79
            L87:
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L8e
                goto L97
            L8e:
                java.lang.String[] r1 = new java.lang.String[r2]
                java.lang.Object[] r0 = r0.toArray(r1)
                r3 = r0
                java.lang.String[] r3 = (java.lang.String[]) r3
            L97:
                r7.b = r3
                java.lang.String[] r0 = r7.b
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uc.webview.base.EnvInfo.a.a():java.lang.String[]");
        }

        final String b(String str) {
            try {
                if (this.c == null) {
                    this.c = Class.forName("android.os.SystemProperties").getMethod("get", String.class);
                }
                return (String) this.c.invoke(null, str);
            } catch (Throwable unused) {
                return null;
            }
        }

        final void c(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("SystemBuildInfo ");
            sb.append(str);
            sb.append(" {");
            a(sb, "FINGERPRINT:", Build.FINGERPRINT);
            a(sb, "HARDWARE:", Build.HARDWARE);
            a(sb, "MODEL:", Build.MODEL);
            a(sb, "MANUFACTURER:", Build.MANUFACTURER);
            a(sb, "BOARD:", Build.BOARD);
            a(sb, "BASE_OS", b("ro.build.version.base_os"));
            a(sb, "abis", Arrays.toString(a()));
            sb.append("\n}");
            Log.d("EnvInfo", sb.toString());
        }
    }

    /* loaded from: classes9.dex */
    static class b {

        /* renamed from: a  reason: collision with root package name */
        private static final String f23763a = b();

        private static String b() {
            if (Build.VERSION.SDK_INT >= 28) {
                return Application.getProcessName();
            }
            try {
                try {
                    return (String) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentProcessName", new Class[0]).invoke(null, new Object[0]);
                } catch (Throwable unused) {
                    Context context = EnvInfo.getContext();
                    if (context == null) {
                        return "";
                    }
                    int myPid = Process.myPid();
                    for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                        if (runningAppProcessInfo.pid == myPid) {
                            return runningAppProcessInfo.processName;
                        }
                    }
                    return "";
                }
            } catch (Throwable unused2) {
                Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
                return (String) cls.getMethod(ProcessUtils.GET_PROCESS_NAME, new Class[0]).invoke(cls.getMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]).invoke(null, new Object[0]), new Object[0]);
            }
        }
    }

    /* loaded from: classes9.dex */
    static class c {

        /* renamed from: a  reason: collision with root package name */
        private static volatile String f23764a;

        private c() {
        }

        public static String a() {
            if (TextUtils.isEmpty(f23764a) && EnvInfo.b != null) {
                synchronized (c.class) {
                    if (TextUtils.isEmpty(f23764a)) {
                        String c = h.c("uuid");
                        if (TextUtils.isEmpty(c)) {
                            c = UUID.randomUUID().toString();
                            h.a a2 = h.a();
                            if (a2 != null) {
                                a2.a("uuid", c).a();
                            }
                        }
                        f23764a = c;
                    }
                }
            }
            return f23764a;
        }
    }

    /* loaded from: classes9.dex */
    static class d {

        /* renamed from: a  reason: collision with root package name */
        private static volatile String f23765a;

        private d() {
        }

        public static String a() {
            if (TextUtils.isEmpty(f23765a)) {
                synchronized (d.class) {
                    if (TextUtils.isEmpty(f23765a)) {
                        String stringValue = GlobalSettings.getStringValue(154);
                        if (!TextUtils.isEmpty(stringValue)) {
                            f23765a = stringValue;
                        } else if (EnvInfo.b != null) {
                            long currentTimeMillis = System.currentTimeMillis();
                            String str = (String) g.b(OConstant.REFLECT_UTDID, "getUtdid", new Class[]{Context.class}, new Object[]{EnvInfo.b});
                            String str2 = TextUtils.isEmpty(str) ? "null" : str;
                            Log.d("EnvInfo", "initUtdid:" + str2 + " cost:" + (System.currentTimeMillis() - currentTimeMillis));
                            f23765a = str2;
                        }
                    }
                }
            }
            return f23765a;
        }
    }

    public static void a(Context context) {
        if (b != null || context == null) {
            return;
        }
        b = context.getApplicationContext();
        if (c == null || b.equals(c)) {
            return;
        }
        android.util.Log.e("EnvInfo", "setContext(" + b + "), it is != " + c);
    }

    public static boolean a() {
        return GlobalSettings.getBoolValue(75);
    }

    private static final int[] a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("\\.");
        if (split.length <= 3) {
            return null;
        }
        return new int[]{Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), Integer.parseInt(split[3])};
    }

    public static String[][] a(ClassLoader classLoader) {
        StringBuilder sb = new StringBuilder("com.uc.webview.base.build.NativeLibrariesArm");
        sb.append(is64Bit() ? ils.ARCH_BIT64 : ils.ARCH_BIT32);
        try {
            return (String[][]) g.a(classLoader, sb.toString(), "LIBRARIES");
        } catch (Throwable th) {
            ErrorCode.NATIVE_LIBRARIES_MISSING.report(th);
            return null;
        }
    }

    public static boolean b() {
        return !GlobalSettings.getBoolValue(13);
    }

    public static boolean c() {
        return CoreType.CORE_THICK == CoreType.Type || CoreType.CORE_THICK_7Z == CoreType.Type || CoreType.CORE_THICK_ZIP == CoreType.Type;
    }

    public static String d() {
        return GlobalSettings.getStringValue(178);
    }

    public static String e() {
        if (b != null) {
            return b.getPackageName();
        }
        return null;
    }

    public static boolean f() {
        String e2 = e();
        return !TextUtils.isEmpty(e2) && 1855462465 == e2.hashCode();
    }

    public static boolean g() {
        boolean booleanValue;
        String str;
        boolean z;
        String str2;
        if (e != null) {
            return ((Boolean) e.first).booleanValue();
        }
        synchronized (f23761a) {
            if (e == null) {
                boolean z2 = false;
                a aVar = new a((byte) 0);
                if (!"1".equals(aVar.b("ro.kernel.qemu")) && !"1".equals(aVar.b("ro.boot.qemu"))) {
                    if (a.a("vbox")) {
                        str = "vbox";
                        aVar.f23762a = str;
                        e = new Pair<>(Boolean.valueOf(z2), aVar.f23762a);
                    } else {
                        if (GlobalSettings.getBoolValue(72)) {
                            if (a.a("x86")) {
                                aVar.f23762a = "hf-x86";
                                str2 = aVar.f23762a;
                            } else {
                                String[] a2 = aVar.a();
                                if (a2 != null && a2.length > 0) {
                                    for (String str3 : a2) {
                                        if (!TextUtils.isEmpty(str3) && str3.contains("x86")) {
                                            z = true;
                                            break;
                                        }
                                    }
                                }
                                z = false;
                                if (z) {
                                    aVar.f23762a = "abi-x86";
                                    str2 = aVar.f23762a;
                                }
                            }
                            aVar.c(str2);
                            e = new Pair<>(Boolean.valueOf(z2), aVar.f23762a);
                        }
                        aVar.c("ok");
                        z2 = true;
                        e = new Pair<>(Boolean.valueOf(z2), aVar.f23762a);
                    }
                }
                str = "qemu";
                aVar.f23762a = str;
                e = new Pair<>(Boolean.valueOf(z2), aVar.f23762a);
            }
            booleanValue = ((Boolean) e.first).booleanValue();
        }
        return booleanValue;
    }

    public static Context getContext() {
        if (b == null) {
            if (c == null) {
                try {
                    c = (Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getDeclaredMethod("currentApplication", new Class[0]).invoke(null, new Object[0]);
                } catch (Throwable unused) {
                }
            }
            String str = "call getContext() before setContext(), return context from ActivityThread - " + c;
            return c;
        }
        return b;
    }

    public static String h() {
        if (e != null) {
            return (String) e.second;
        }
        return null;
    }

    public static boolean i() {
        if (b == null) {
            return false;
        }
        switch (b.getPackageName().hashCode()) {
            case -2086095549:
            case 270694045:
            case 1191029559:
            case 1335515207:
            case 1855462465:
            case 2049668591:
                return true;
            default:
                return false;
        }
    }

    public static boolean is64Bit() {
        boolean booleanValue;
        if (d != null) {
            return d.booleanValue();
        }
        synchronized (f23761a) {
            if (d == null) {
                d = Boolean.valueOf(p());
                StringBuilder sb = new StringBuilder("runningIn: ");
                sb.append(d.booleanValue() ? ils.ARCH_BIT64 : ils.ARCH_BIT32);
                sb.append("bit");
                Log.d("EnvInfo", sb.toString());
            }
            booleanValue = d.booleanValue();
        }
        return booleanValue;
    }

    public static boolean isSupportedCoreVersion(String str, String str2, String str3, String str4, String str5) {
        try {
            Log.d(str, "sdkVer: " + str2 + " (minSupportCoreVer: " + str3 + riy.BRACKET_END_STR);
            Log.d(str, "coreVer: " + str4 + " (minSupportSdkVer: " + str5 + riy.BRACKET_END_STR);
            int[] a2 = a(str4);
            int[] a3 = a(str3);
            if (a2 != null && a3 != null) {
                if (a2[0] >= a3[0] && (a2[0] != a3[0] || (a2[1] >= a3[1] && (a2[1] != a3[1] || (a2[2] >= a3[2] && (a2[2] != a3[2] || a2[3] >= a3[3])))))) {
                    int[] a4 = a(str2);
                    int[] a5 = a(str5);
                    if (a4 != null && a5 != null) {
                        if (a4[0] >= a5[0] && (a4[0] != a5[0] || (a4[1] >= a5[1] && (a4[1] != a5[1] || (a4[2] >= a5[2] && (a4[2] != a5[2] || a4[3] >= a5[3])))))) {
                            return true;
                        }
                        Log.d(str, "minSupportSdkVer failed");
                    }
                    return false;
                }
                Log.d(str, "minSupportCoreVer failed");
            }
            return false;
        } catch (Throwable th) {
            Log.w(str, "parseVer failed", th);
            return false;
        }
    }

    public static String j() {
        String str = Build.MODEL;
        return !TextUtils.isEmpty(str) ? str.trim().replaceAll("[`|=]", "") : str;
    }

    public static String k() {
        String str = Build.BRAND;
        return !TextUtils.isEmpty(str) ? str.trim().replaceAll("[`|=]", "") : str;
    }

    public static String l() {
        return c.a();
    }

    public static String m() {
        return d.a();
    }

    public static boolean n() {
        return !b.f23763a.contains(":");
    }

    private static boolean p() {
        if (Build.VERSION.SDK_INT < 21) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return Process.is64Bit();
        }
        try {
            Object b2 = g.b("dalvik.system.VMRuntime", "getRuntime");
            Boolean bool = b2 != null ? (Boolean) g.b(b2, "is64Bit") : null;
            if (bool != null) {
                return bool.booleanValue();
            }
        } catch (Throwable unused) {
        }
        return !TextUtils.isEmpty(Build.CPU_ABI) && Build.CPU_ABI.contains(ils.ARCH_BIT64);
    }
}
