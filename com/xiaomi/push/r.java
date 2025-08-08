package com.xiaomi.push;

import android.content.Context;
import android.os.Build;
import mtopsdk.common.util.StringUtils;

/* loaded from: classes9.dex */
public class r {

    /* renamed from: a  reason: collision with root package name */
    private static Context f24602a;

    /* renamed from: a  reason: collision with other field name */
    private static String f857a;

    public static int a() {
        try {
            Class<?> a2 = a(null, "miui.os.Build");
            if (a2.getField("IS_STABLE_VERSION").getBoolean(null)) {
                return 3;
            }
            return a2.getField("IS_DEVELOPMENT_VERSION").getBoolean(null) ? 2 : 1;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public static Context m2212a() {
        return f24602a;
    }

    public static Class<?> a(Context context, String str) {
        if (str == null || str.trim().length() == 0) {
            throw new ClassNotFoundException("class is empty");
        }
        boolean z = context != null;
        if (z && Build.VERSION.SDK_INT >= 29) {
            try {
                return context.getClassLoader().loadClass(str);
            } catch (Throwable unused) {
            }
        }
        try {
            return Class.forName(str);
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.b.m1616a(String.format("loadClass fail hasContext= %s, errMsg = %s", Boolean.valueOf(z), th.getLocalizedMessage()));
            throw new ClassNotFoundException("loadClass fail ", th);
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public static synchronized String m2213a() {
        String str;
        synchronized (r.class) {
            if (f857a != null) {
                return f857a;
            }
            String str2 = Build.VERSION.INCREMENTAL;
            if (a() <= 0) {
                str = b();
                if (StringUtils.isEmpty(str)) {
                    str = c();
                    if (StringUtils.isEmpty(str)) {
                        str = d();
                        if (StringUtils.isEmpty(str)) {
                            str2 = String.valueOf(q.a("ro.product.brand", "Android") + "_" + str2);
                        }
                    }
                }
                f857a = str;
                return str;
            }
            str = str2;
            f857a = str;
            return str;
        }
    }

    public static void a(Context context) {
        f24602a = context.getApplicationContext();
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m2214a() {
        return StringUtils.equals((String) bh.a("android.os.SystemProperties", "get", "sys.boot_completed"), "1");
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m2215a(Context context) {
        try {
            return (context.getApplicationInfo().flags & 2) != 0;
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.a(e);
            return false;
        }
    }

    private static String b() {
        String a2 = q.a(com.alibaba.security.realidentity.m.v, "");
        f857a = a2;
        return a2;
    }

    /* renamed from: b  reason: collision with other method in class */
    public static boolean m2216b() {
        try {
            return a(null, "miui.os.Build").getField("IS_GLOBAL_BUILD").getBoolean(false);
        } catch (ClassNotFoundException unused) {
            com.xiaomi.channel.commonutils.logger.b.d("miui.os.Build ClassNotFound");
            return false;
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.a(e);
            return false;
        }
    }

    private static String c() {
        String a2 = q.a(com.alibaba.security.realidentity.m.y, "");
        if (!StringUtils.isEmpty(a2) && !a2.startsWith("ColorOS_")) {
            f857a = "ColorOS_" + a2;
        }
        return f857a;
    }

    private static String d() {
        String a2 = q.a("ro.vivo.os.version", "");
        if (!StringUtils.isEmpty(a2) && !a2.startsWith("FuntouchOS_")) {
            f857a = "FuntouchOS_" + a2;
        }
        return f857a;
    }
}
