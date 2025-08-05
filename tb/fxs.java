package tb;

import android.os.Build;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class fxs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1970311027);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : !TextUtils.isEmpty(a("ro.miui.ui.version.name")) || d() != -1;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : "Xiaomi".equals(Build.MANUFACTURER);
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[0]) : b() ? a("ro.miui.ui.version.name") : "";
    }

    public static int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2de", new Object[0])).intValue();
        }
        String a2 = a("ro.miui.ui.version.code");
        if (TextUtils.isEmpty(a2)) {
            return -1;
        }
        try {
            return Integer.parseInt(a2) + 2;
        } catch (Exception e) {
            fuw.a("OSUtils", String.format("get MIUI version code failed: %s", a2), e);
            return -1;
        }
    }

    public static String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[0]) : Build.VERSION.INCREMENTAL;
    }

    public static String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[0]) : Build.MODEL;
    }

    public static String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[0]) : Build.MANUFACTURER;
    }

    public static String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[0]) : a() ? "MIUI" : "OTHER";
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(java.lang.String r4) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.fxs.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L15
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.String r4 = "9f352ae"
            java.lang.Object r4 = r0.ipc$dispatch(r4, r1)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L15:
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            r2.<init>()     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            java.lang.String r3 = "getprop "
            r2.append(r3)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            r2.append(r4)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            java.lang.Process r4 = r1.exec(r4)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            java.io.InputStream r4 = r4.getInputStream()     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            r4 = 1024(0x400, float:1.435E-42)
            r1.<init>(r2, r4)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            java.lang.String r0 = r1.readLine()     // Catch: java.lang.Exception -> L4c java.lang.Throwable -> L5b
            r1.close()     // Catch: java.io.IOException -> L47
            goto L5a
        L47:
            r4 = move-exception
            com.taobao.android.dinamicx.exception.a.b(r4)
            goto L5a
        L4c:
            r4 = move-exception
            goto L52
        L4e:
            r4 = move-exception
            goto L5d
        L50:
            r4 = move-exception
            r1 = r0
        L52:
            com.taobao.android.dinamicx.exception.a.b(r4)     // Catch: java.lang.Throwable -> L5b
            if (r1 == 0) goto L5a
            r1.close()     // Catch: java.io.IOException -> L47
        L5a:
            return r0
        L5b:
            r4 = move-exception
            r0 = r1
        L5d:
            if (r0 == 0) goto L67
            r0.close()     // Catch: java.io.IOException -> L63
            goto L67
        L63:
            r0 = move-exception
            com.taobao.android.dinamicx.exception.a.b(r0)
        L67:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.fxs.a(java.lang.String):java.lang.String");
    }
}
