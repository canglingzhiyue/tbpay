package com.uc.webview.internal.setup.component;

import android.os.Process;
import android.util.Log;
import com.uc.webview.base.klog.KLogHandler;
import java.lang.reflect.Method;
import java.util.Locale;

/* loaded from: classes9.dex */
public final class l {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static Method f23912a;

        static {
            try {
                f23912a = Class.forName("android.util.Log").getDeclaredMethod("println", Integer.TYPE, String.class, String.class);
            } catch (Throwable unused) {
            }
        }

        static void a(int i, String str, String str2) {
            StringBuilder sb = new StringBuilder();
            sb.append(i == 4 ? "I " : i == 5 ? "W " : "  ");
            sb.append(str);
            String sb2 = sb.toString();
            int i2 = (i == 4 || i == 5) ? 6 : i;
            Method method = f23912a;
            if (method != null) {
                try {
                    method.invoke(null, Integer.valueOf(i2), sb2, str2);
                    return;
                } catch (Throwable unused) {
                    f23912a = null;
                }
            }
            Log.println(i, sb2, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private static final int[] f23913a = {0, 0, 0, 0, 1, 2, 3, 3, 3};
    }

    public static String a(String str) {
        if (str == null || str.length() <= 6) {
            return str;
        }
        return str.substring(0, 6) + "...";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(String str, Object... objArr) {
        return (objArr == null || objArr.length == 0) ? str : String.format(Locale.getDefault(), str, objArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Throwable a(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        Object obj = objArr[objArr.length - 1];
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        return null;
    }

    public static void a(int i, String str, String str2, Throwable th) {
        if (a(i)) {
            return;
        }
        a.a(i, str, str2);
        if (th != null) {
            a.a(i, str, Log.getStackTraceString(th));
        }
        if (!KLogHandler.a()) {
            return;
        }
        KLogHandler.postLogMessage(System.currentTimeMillis(), Process.myPid(), Process.myTid(), b.f23913a[i], str, str2, th);
    }

    public static void a(int i, String str, String str2, Object... objArr) {
        if (a(i)) {
            return;
        }
        a(i, str, a(str2, objArr), a(objArr));
    }

    private static void a(String str, String str2) {
        a(6, str, str2, (Throwable) null);
    }

    private static void a(String str, String str2, Throwable th) {
        a(6, str, str2, th);
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
            a(2, str, a2, (Throwable) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(int i) {
        return i < 3;
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
            a(4, str, a2, (Throwable) null);
        }
    }

    public static void c(String str, String str2, Object... objArr) {
        if (a(5)) {
            return;
        }
        String a2 = a(str2, objArr);
        Throwable a3 = a(objArr);
        if (a3 != null) {
            a(5, str, a2, a3);
        } else {
            a(5, str, a2, (Throwable) null);
        }
    }

    public static void d(String str, String str2, Object... objArr) {
        if (a(6)) {
            return;
        }
        String a2 = a(str2, objArr);
        Throwable a3 = a(objArr);
        if (a3 != null) {
            a(str, a2, a3);
        } else {
            a(str, a2);
        }
    }
}
