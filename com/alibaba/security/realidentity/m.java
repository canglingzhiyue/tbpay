package com.alibaba.security.realidentity;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.alipay.mobile.common.logging.api.DeviceProperty;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import tb.riy;

/* loaded from: classes3.dex */
public class m {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String A = "ro.build.uiversion";
    public static final String B = "ro.build.MiFavor_version";
    public static final String C = "ro.rom.version";
    public static final String D = "ro.build.rom.id";
    public static final String E = "unknown";
    public static a F = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f3461a = "SystemUtils";
    public static final String[] b = {"huawei"};
    public static final String[] c = {"vivo"};
    public static final String[] d = {"xiaomi"};
    public static final String[] e = {"oppo"};
    public static final String[] f = {DeviceProperty.ALIAS_LEECO, "letv"};
    public static final String[] g = {"360", DeviceProperty.ALIAS_QIKU};
    public static final String[] h = {DeviceProperty.ALIAS_ZTE};
    public static final String[] i = {DeviceProperty.ALIAS_ONEPLUS};
    public static final String[] j = {DeviceProperty.ALIAS_NUBIA};
    public static final String[] k = {DeviceProperty.ALIAS_COOLPAD, "yulong"};
    public static final String[] l = {"lg", "lge"};
    public static final String[] m = {"google"};
    public static final String[] n = {"samsung"};
    public static final String[] o = {"meizu"};
    public static final String[] p = {"lenovo"};
    public static final String[] q = {"smartisan"};
    public static final String[] r = {"htc"};
    public static final String[] s = {"sony"};
    public static final String[] t = {"gionee", "amigo"};
    public static final String[] u = {"motorola"};
    public static final String v = "ro.build.version.emui";
    public static final String w = "ro.vivo.os.build.display.id";
    public static final String x = "ro.build.version.incremental";
    public static final String y = "ro.build.version.opporom";
    public static final String z = "ro.letv.release.version";

    /* loaded from: classes3.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f3462a;
        public String b;

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6d75c44c", new Object[]{aVar}) : aVar.f3462a;
        }

        public static /* synthetic */ String b(a aVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("2790f703", new Object[]{aVar, str});
            }
            aVar.b = str;
            return str;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "RomInfo{name=" + this.f3462a + ", version=" + this.b + riy.BLOCK_END_STR;
        }

        public static /* synthetic */ String a(a aVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("206814c2", new Object[]{aVar, str});
            }
            aVar.f3462a = str;
            return str;
        }

        public String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
        }

        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f3462a;
        }
    }

    public static boolean a(String str, String str2, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("434e6e27", new Object[]{str, str2, strArr})).booleanValue();
        }
        for (String str3 : strArr) {
            if (str.contains(str3) || str2.contains(str3)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x008f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b(java.lang.String r7) {
        /*
            java.lang.String r0 = "Exception while closing InputStream"
            java.lang.String r1 = "SystemUtils"
            com.android.alibaba.ip.runtime.IpChange r2 = com.alibaba.security.realidentity.m.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L19
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r7
            java.lang.String r7 = "6111438d"
            java.lang.Object r7 = r2.ipc$dispatch(r7, r0)
            java.lang.String r7 = (java.lang.String) r7
            return r7
        L19:
            r2 = 0
            java.lang.Runtime r3 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5e
            r4.<init>()     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5e
            java.lang.String r5 = "getprop "
            r4.append(r5)     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5e
            r4.append(r7)     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5e
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5e
            java.lang.Process r3 = r3.exec(r4)     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5e
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5e
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5e
            java.io.InputStream r3 = r3.getInputStream()     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5e
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5e
            r3 = 1024(0x400, float:1.435E-42)
            r4.<init>(r5, r3)     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5e
            java.lang.String r3 = r4.readLine()     // Catch: java.io.IOException -> L5a java.lang.Throwable -> L8b
            r4.close()     // Catch: java.io.IOException -> L5a java.lang.Throwable -> L8b
            r4.close()     // Catch: java.io.IOException -> L4f
            goto L59
        L4f:
            r7 = move-exception
            boolean r2 = com.alibaba.security.realidentity.a.a()
            if (r2 == 0) goto L59
            com.alibaba.security.realidentity.a.a(r1, r0, r7)
        L59:
            return r3
        L5a:
            r3 = move-exception
            goto L60
        L5c:
            r7 = move-exception
            goto L8d
        L5e:
            r3 = move-exception
            r4 = r2
        L60:
            boolean r5 = com.alibaba.security.realidentity.a.a()     // Catch: java.lang.Throwable -> L8b
            if (r5 == 0) goto L7a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8b
            r5.<init>()     // Catch: java.lang.Throwable -> L8b
            java.lang.String r6 = "Unable to read sysprop "
            r5.append(r6)     // Catch: java.lang.Throwable -> L8b
            r5.append(r7)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r7 = r5.toString()     // Catch: java.lang.Throwable -> L8b
            com.alibaba.security.realidentity.a.a(r1, r7, r3)     // Catch: java.lang.Throwable -> L8b
        L7a:
            if (r4 == 0) goto L8a
            r4.close()     // Catch: java.io.IOException -> L80
            goto L8a
        L80:
            r7 = move-exception
            boolean r3 = com.alibaba.security.realidentity.a.a()
            if (r3 == 0) goto L8a
            com.alibaba.security.realidentity.a.a(r1, r0, r7)
        L8a:
            return r2
        L8b:
            r7 = move-exception
            r2 = r4
        L8d:
            if (r2 == 0) goto L9d
            r2.close()     // Catch: java.io.IOException -> L93
            goto L9d
        L93:
            r2 = move-exception
            boolean r3 = com.alibaba.security.realidentity.a.a()
            if (r3 == 0) goto L9d
            com.alibaba.security.realidentity.a.a(r1, r0, r2)
        L9d:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.security.realidentity.m.b(java.lang.String):java.lang.String");
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[0]);
        }
        try {
            String str = Build.MANUFACTURER;
            return !TextUtils.isEmpty(str) ? str.toLowerCase() : "unknown";
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    public static a d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("3fc0057", new Object[0]);
        }
        a aVar = F;
        if (aVar != null) {
            return aVar;
        }
        F = new a();
        String a2 = a();
        String c2 = c();
        if (a(a2, c2, b)) {
            a.a(F, b[0]);
            String a3 = a(v);
            String[] split = a3.split("_");
            if (split.length > 1) {
                a.b(F, split[1]);
            } else {
                a.b(F, a3);
            }
            return F;
        } else if (a(a2, c2, c)) {
            a.a(F, c[0]);
            a.b(F, a(w));
            return F;
        } else if (a(a2, c2, d)) {
            a.a(F, d[0]);
            a.b(F, a(x));
            return F;
        } else if (a(a2, c2, e)) {
            a.a(F, e[0]);
            a.b(F, a(y));
            return F;
        } else if (a(a2, c2, f)) {
            a.a(F, f[0]);
            a.b(F, a(z));
            return F;
        } else if (a(a2, c2, g)) {
            a.a(F, g[0]);
            a.b(F, a(A));
            return F;
        } else if (a(a2, c2, h)) {
            a.a(F, h[0]);
            a.b(F, a(B));
            return F;
        } else if (a(a2, c2, i)) {
            a.a(F, i[0]);
            a.b(F, a(C));
            return F;
        } else if (a(a2, c2, j)) {
            a.a(F, j[0]);
            a.b(F, a(D));
            return F;
        } else {
            if (a(a2, c2, k)) {
                a.a(F, k[0]);
            } else if (a(a2, c2, l)) {
                a.a(F, l[0]);
            } else if (a(a2, c2, m)) {
                a.a(F, m[0]);
            } else if (a(a2, c2, n)) {
                a.a(F, n[0]);
            } else if (a(a2, c2, o)) {
                a.a(F, o[0]);
            } else if (a(a2, c2, p)) {
                a.a(F, p[0]);
            } else if (a(a2, c2, q)) {
                a.a(F, q[0]);
            } else if (a(a2, c2, r)) {
                a.a(F, r[0]);
            } else if (a(a2, c2, s)) {
                a.a(F, s[0]);
            } else if (a(a2, c2, t)) {
                a.a(F, t[0]);
            } else if (a(a2, c2, u)) {
                a.a(F, u[0]);
            } else {
                a.a(F, c2);
            }
            a.b(F, a(""));
            return F;
        }
    }

    public static boolean e() {
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue();
        }
        if ("x86".equalsIgnoreCase(Build.CPU_ABI) || "x86".equalsIgnoreCase(Build.CPU_ABI2)) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 21 && (strArr = Build.SUPPORTED_ABIS) != null) {
            for (String str : strArr) {
                if (str != null && str.toLowerCase().contains("x86")) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : b[0].equals(a.a(d()));
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue() : o[0].equals(a.a(d()));
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[0])).booleanValue() : e[0].equals(a.a(d()));
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[0])).booleanValue() : c[0].equals(a.a(d()));
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[0])).booleanValue() : d[0].equals(a.a(d()));
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x00dc -> B:109:0x00df). Please submit an issue!!! */
    public static boolean k() {
        BufferedReader bufferedReader;
        Throwable th;
        FileInputStream fileInputStream;
        String lowerCase;
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[0])).booleanValue();
        }
        InputStreamReader inputStreamReader = null;
        try {
            try {
                fileInputStream = new FileInputStream("/proc/cpuinfo");
                try {
                    InputStreamReader inputStreamReader2 = new InputStreamReader(fileInputStream);
                    try {
                        bufferedReader = new BufferedReader(inputStreamReader2);
                        try {
                            do {
                                try {
                                    String readLine = bufferedReader.readLine();
                                    if (readLine != null) {
                                        lowerCase = readLine.trim().toLowerCase();
                                    }
                                    break;
                                } catch (Exception unused) {
                                    inputStreamReader = inputStreamReader2;
                                    if (fileInputStream != null) {
                                        try {
                                            fileInputStream.close();
                                        } catch (IOException e2) {
                                            e2.printStackTrace();
                                        }
                                    }
                                    if (inputStreamReader != null) {
                                        try {
                                            inputStreamReader.close();
                                        } catch (IOException e3) {
                                            e3.printStackTrace();
                                        }
                                    }
                                    if (bufferedReader != null) {
                                        bufferedReader.close();
                                    }
                                    return false;
                                } catch (Throwable th2) {
                                    th = th2;
                                    inputStreamReader = inputStreamReader2;
                                    if (fileInputStream != null) {
                                        try {
                                            fileInputStream.close();
                                        } catch (IOException e4) {
                                            e4.printStackTrace();
                                        }
                                    }
                                    if (inputStreamReader != null) {
                                        try {
                                            inputStreamReader.close();
                                        } catch (IOException e5) {
                                            e5.printStackTrace();
                                        }
                                    }
                                    if (bufferedReader != null) {
                                        try {
                                            bufferedReader.close();
                                        } catch (IOException e6) {
                                            e6.printStackTrace();
                                        }
                                    }
                                    throw th;
                                }
                            } while (!lowerCase.startsWith("features"));
                            break;
                            fileInputStream.close();
                        } catch (IOException e7) {
                            e7.printStackTrace();
                        }
                        for (String str : lowerCase.split(" ")) {
                            if (str.contains("neon") || "asimd".equals(str)) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException e8) {
                                    e8.printStackTrace();
                                }
                                try {
                                    inputStreamReader2.close();
                                } catch (IOException e9) {
                                    e9.printStackTrace();
                                }
                                try {
                                    bufferedReader.close();
                                    return true;
                                } catch (IOException e10) {
                                    e10.printStackTrace();
                                    return true;
                                }
                            }
                        }
                        try {
                            inputStreamReader2.close();
                        } catch (IOException e11) {
                            e11.printStackTrace();
                        }
                        bufferedReader.close();
                    } catch (Exception unused2) {
                        bufferedReader = null;
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedReader = null;
                    }
                } catch (Exception unused3) {
                    bufferedReader = null;
                } catch (Throwable th4) {
                    th = th4;
                    bufferedReader = null;
                }
            } catch (Exception unused4) {
                fileInputStream = null;
                bufferedReader = null;
            } catch (Throwable th5) {
                bufferedReader = null;
                th = th5;
                fileInputStream = null;
            }
        } catch (IOException e12) {
            e12.printStackTrace();
        }
        return false;
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        try {
            String str = Build.BRAND;
            return !TextUtils.isEmpty(str) ? str.toLowerCase() : "unknown";
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        String b2 = !TextUtils.isEmpty(str) ? b(str) : "";
        if (TextUtils.isEmpty(b2) || b2.equals("unknown")) {
            try {
                String str2 = Build.DISPLAY;
                if (!TextUtils.isEmpty(str2)) {
                    b2 = str2.toLowerCase();
                }
            } catch (Throwable unused) {
            }
        }
        return TextUtils.isEmpty(b2) ? "unknown" : b2;
    }

    public static long a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6454", new Object[]{context})).longValue();
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return 0L;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            String[] strArr = Build.SUPPORTED_ABIS;
            StringBuffer stringBuffer = new StringBuffer();
            if (strArr != null) {
                for (String str : strArr) {
                    stringBuffer.append(str);
                    stringBuffer.append(";");
                }
            }
            return stringBuffer.toString();
        }
        return Build.CPU_ABI;
    }

    public static long b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9eca0ff3", new Object[]{context})).longValue();
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/meminfo"), 2048);
            String readLine = bufferedReader.readLine();
            if (TextUtils.isEmpty(readLine)) {
                bufferedReader.close();
                return 0L;
            }
            String substring = readLine.substring(readLine.indexOf("MemTotal:"));
            if (TextUtils.isEmpty(substring)) {
                bufferedReader.close();
                return 0L;
            }
            bufferedReader.close();
            return Long.parseLong(substring.replaceAll("\\D+", "")) << 10;
        } catch (Exception unused) {
            return 0L;
        }
    }
}
