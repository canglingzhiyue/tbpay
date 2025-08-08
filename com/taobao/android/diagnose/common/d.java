package com.taobao.android.diagnose.common;

import android.content.Context;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.v;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1447987699);
    }

    public static boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61b6362e", new Object[]{context, str})).booleanValue();
        }
        if (context == null || StringUtils.isEmpty(str)) {
            return false;
        }
        try {
            context.getPackageManager().getPackageInfo(str, 256);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue() : a(context, "com.alibaba.android.security.activity");
    }

    public static boolean a(File file, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2fbe2fed", new Object[]{file, str})).booleanValue();
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            FileChannel channel = fileOutputStream.getChannel();
            try {
                channel.write(Charset.forName("utf8").encode(str));
                if (channel != null) {
                    channel.close();
                }
                fileOutputStream.close();
                return true;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    if (channel != null) {
                        if (th != null) {
                            try {
                                channel.close();
                            } catch (Throwable th3) {
                                th.addSuppressed(th3);
                            }
                        } else {
                            channel.close();
                        }
                    }
                    throw th2;
                }
            }
        } catch (Exception e) {
            v.a("DiagnoseUtils", "saveFile", e);
            return false;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    public static java.lang.String a(java.io.File r5) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.diagnose.common.d.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L15
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r5
            java.lang.String r5 = "36082ea1"
            java.lang.Object r5 = r0.ipc$dispatch(r5, r1)
            java.lang.String r5 = (java.lang.String) r5
            return r5
        L15:
            boolean r0 = r5.exists()
            r1 = 0
            if (r0 == 0) goto L7e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L75
            r2.<init>(r5)     // Catch: java.lang.Exception -> L75
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L60
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L60
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L60
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L60
        L30:
            java.lang.String r3 = r5.readLine()     // Catch: java.lang.Throwable -> L48
            if (r3 == 0) goto L3a
            r0.append(r3)     // Catch: java.lang.Throwable -> L48
            goto L30
        L3a:
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L48
            r5.close()     // Catch: java.lang.Throwable -> L60
            r2.close()     // Catch: java.lang.Exception -> L75
            return r0
        L45:
            r0 = move-exception
            r3 = r1
            goto L4e
        L48:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L4a
        L4a:
            r3 = move-exception
            r4 = r3
            r3 = r0
            r0 = r4
        L4e:
            if (r3 == 0) goto L59
            r5.close()     // Catch: java.lang.Throwable -> L54
            goto L5c
        L54:
            r5 = move-exception
            r3.addSuppressed(r5)     // Catch: java.lang.Throwable -> L60
            goto L5c
        L59:
            r5.close()     // Catch: java.lang.Throwable -> L60
        L5c:
            throw r0     // Catch: java.lang.Throwable -> L60
        L5d:
            r5 = move-exception
            r0 = r1
            goto L66
        L60:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L62
        L62:
            r0 = move-exception
            r4 = r0
            r0 = r5
            r5 = r4
        L66:
            if (r0 == 0) goto L71
            r2.close()     // Catch: java.lang.Throwable -> L6c
            goto L74
        L6c:
            r2 = move-exception
            r0.addSuppressed(r2)     // Catch: java.lang.Exception -> L75
            goto L74
        L71:
            r2.close()     // Catch: java.lang.Exception -> L75
        L74:
            throw r5     // Catch: java.lang.Exception -> L75
        L75:
            r5 = move-exception
            java.lang.String r0 = "DiagnoseUtils"
            java.lang.String r2 = "readFile"
            com.taobao.android.diagnose.v.a(r0, r2, r5)
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.diagnose.common.d.a(java.io.File):java.lang.String");
    }

    public static boolean a() {
        if (a("HUAWEI") || a("HONOR")) {
            try {
                Class<?> cls = Class.forName("com.huawei.system.BuildEx");
                return "harmony".equals(cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0]));
            } catch (Throwable th) {
                v.a("DiagnoseUtils", "isHarmony", th);
                return false;
            }
        }
        return false;
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : b("hw_sc.build.platform.version");
    }

    private static String b(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, "default");
        } catch (Exception e) {
            v.a("DiagnoseUtils", "getSystemParameters", e);
            return "";
        }
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : Build.BRAND.equalsIgnoreCase(str);
    }

    public static <T> T a(Map<String, ?> map, String str, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("f71492cf", new Object[]{map, str, t});
        }
        try {
            T t2 = (T) map.get(str);
            return t2 != null ? t2 : t;
        } catch (Exception e) {
            v.a("DiagnoseUtils", "getMapValue", e);
            return t;
        }
    }

    public static String a(long j) {
        String str;
        String format;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("780680c4", new Object[]{new Long(j)});
        }
        float f = (float) j;
        if (f > 900.0f) {
            f /= 1024.0f;
            str = "KB";
        } else {
            str = "";
        }
        if (f > 900.0f) {
            f /= 1024.0f;
            str = "MB";
        }
        if (f > 900.0f) {
            f /= 1024.0f;
            str = "GB";
        }
        if (f > 900.0f) {
            f /= 1024.0f;
            str = RVEnvironmentService.PLATFORM_TB;
        }
        if (f > 900.0f) {
            f /= 1024.0f;
            str = "PB";
        }
        if (f < 1.0f) {
            format = String.format(Locale.ENGLISH, "%.2f", Float.valueOf(f));
        } else if (f < 10.0f) {
            format = String.format(Locale.ENGLISH, "%.1f", Float.valueOf(f));
        } else if (f < 100.0f) {
            format = String.format(Locale.ENGLISH, "%.0f", Float.valueOf(f));
        } else {
            format = String.format(Locale.ENGLISH, "%.0f", Float.valueOf(f));
        }
        return format + str;
    }
}
