package com.uc.webview.export.multiprocess.helper;

import android.util.Log;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import java.lang.reflect.Method;
import java.util.Locale;
import tb.riy;

/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f23848a = false;
    private static String b = "u4proc";
    private static int c = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static Method f23849a;

        static {
            try {
                f23849a = Class.forName("android.util.Log").getDeclaredMethod("println", Integer.TYPE, String.class, String.class);
            } catch (Throwable unused) {
            }
        }

        static void a(int i, String str, String str2) {
            StringBuilder sb = new StringBuilder();
            sb.append(i == 4 ? "I " : i == 5 ? "W " : "  ");
            sb.append(str);
            String sb2 = sb.toString();
            if (i == 4 || i == 5) {
                i = 6;
            }
            Method method = f23849a;
            if (method != null) {
                try {
                    method.invoke(null, Integer.valueOf(i), sb2, str2);
                    return;
                } catch (Throwable unused) {
                    f23849a = null;
                }
            }
            Log.println(i, sb2, str2);
        }
    }

    private static String a(String str, Object... objArr) {
        if (objArr != null) {
            try {
                return objArr.length != 0 ? String.format(Locale.getDefault(), str, objArr) : str;
            } catch (Throwable unused) {
                return str;
            }
        }
        return str;
    }

    private static Throwable a(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        Object obj = objArr[objArr.length - 1];
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        return null;
    }

    private static void a(int i, String str, String str2, Throwable th) {
        if (a(i)) {
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + str2.length() + 16);
        if (c > 0) {
            sb.append('[');
            sb.append(c);
            sb.append("] ");
        }
        sb.append(str);
        sb.append(' ');
        sb.append(str2);
        a.a(i, b, sb.toString());
        if (th == null) {
            return;
        }
        a.a(i, b, Log.getStackTraceString(th));
    }

    public static void a(String str, int i, int i2) {
        StringBuilder sb = new StringBuilder(riy.ARRAY_START_STR);
        sb.append(str);
        sb.append(str.startsWith(DXMonitorConstant.DX_MONITOR_RENDER) ? Integer.valueOf(i) : "");
        sb.append(riy.ARRAY_END_STR);
        sb.append(b);
        b = sb.toString();
        c = i2;
    }

    public static void a(String str, String str2) {
        a(4, str, str2, null);
    }

    public static void a(String str, String str2, Throwable th) {
        a(5, str, str2, th);
    }

    public static void a(String str, String str2, Object... objArr) {
        if (a(2)) {
            return;
        }
        String a2 = a(str2, objArr);
        Throwable a3 = a(objArr);
        if (a3 != null) {
            a(2, str, a2, a3);
        } else {
            a(2, str, a2, null);
        }
    }

    private static boolean a(int i) {
        return !f23848a && i <= 3;
    }

    public static void b(String str, String str2) {
        a(5, str, str2, null);
    }

    public static void b(String str, String str2, Throwable th) {
        a(6, str, str2, th);
    }

    public static void b(String str, String str2, Object... objArr) {
        if (a(4)) {
            return;
        }
        String a2 = a(str2, objArr);
        Throwable a3 = a(objArr);
        if (a3 != null) {
            a(4, str, a2, a3);
        } else {
            a(4, str, a2, null);
        }
    }

    public static void c(String str, String str2) {
        a(6, str, str2, null);
    }

    public static void c(String str, String str2, Object... objArr) {
        if (a(6)) {
            return;
        }
        String a2 = a(str2, objArr);
        Throwable a3 = a(objArr);
        if (a3 != null) {
            b(str, a2, a3);
        } else {
            c(str, a2);
        }
    }
}
