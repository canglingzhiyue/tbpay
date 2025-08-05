package com.uc.webview.internal;

import java.lang.reflect.Method;

/* loaded from: classes9.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static Method f23883a;
    private static Method b;
    private static Method c;
    private static Method d;
    private static Method e;
    private static Method f;

    static {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            try {
                f23883a = cls.getMethod("get", String.class);
            } catch (Throwable unused) {
            }
            try {
                b = cls.getMethod("get", String.class, String.class);
            } catch (Throwable unused2) {
            }
            try {
                c = cls.getMethod("getInt", String.class, Integer.TYPE);
            } catch (Throwable unused3) {
            }
            try {
                d = cls.getMethod("getLong", String.class, Long.TYPE);
            } catch (Throwable unused4) {
            }
            try {
                e = cls.getMethod("getBoolean", String.class, Boolean.TYPE);
            } catch (Throwable unused5) {
            }
            f = cls.getMethod("set", String.class, String.class);
        } catch (Throwable unused6) {
        }
    }

    public static int a(String str) {
        if (!b(str)) {
            return -1;
        }
        Method method = c;
        try {
            return method != null ? ((Integer) method.invoke(null, str, -1)).intValue() : Integer.valueOf(a(str, Integer.toString(-1))).intValue();
        } catch (Throwable unused) {
            return -1;
        }
    }

    private static String a(String str, String str2) {
        if (!b(str)) {
            return str2;
        }
        Method method = b;
        if (method != null) {
            return (String) method.invoke(null, str, str2);
        }
        Method method2 = f23883a;
        if (method2 != null) {
            return (String) method2.invoke(null, str);
        }
        return str2;
    }

    private static boolean b(String str) {
        return !str.startsWith("debug.uc.");
    }
}
