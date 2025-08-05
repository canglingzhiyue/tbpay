package com.vivo.push.util;

import android.content.Context;
import com.alipay.mobile.common.logging.util.perf.Constants;

/* loaded from: classes9.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public static final t f24269a = new s();
    private static boolean b;
    private static boolean c;

    static {
        c();
    }

    public static int a(String str, String str2) {
        return f24269a.a(str, str2);
    }

    public static int a(String str, String str2, Throwable th) {
        return f24269a.a(str, str2, th);
    }

    public static int a(String str, Throwable th) {
        return f24269a.a(str, th);
    }

    public static String a(Throwable th) {
        return f24269a.a(th);
    }

    public static void a(int i, String str) {
        a("RunTimeException", "code: " + i + ", exceptionMsg: " + str);
    }

    public static void a(Context context, String str) {
        f24269a.a(context, str);
    }

    public static void a(String str) {
        if (b) {
            f24269a.c("VIVO.PUSH.MSG_NODE", str);
        }
    }

    public static void a(boolean z) {
        c();
        c = z;
    }

    public static boolean a() {
        return b;
    }

    public static int b(String str, String str2) {
        return f24269a.b(str, str2);
    }

    public static int b(String str, String str2, Throwable th) {
        return f24269a.b(str, str2, th);
    }

    public static void b(Context context, String str) {
        f24269a.b(context, str);
    }

    public static void b(String str) {
        if (b) {
            f24269a.c("VIVO.PUSH.PROFILE.SYNC", str);
        }
    }

    public static boolean b() {
        return b && c;
    }

    public static int c(String str, String str2) {
        return f24269a.c(str, str2);
    }

    private static void c() {
        b = ag.b("persist.sys.log.ctrl", "no").equals(Constants.VAL_YES);
    }

    public static void c(Context context, String str) {
        f24269a.c(context, str);
    }

    public static int d(String str, String str2) {
        return f24269a.d(str, str2);
    }

    public static int e(String str, String str2) {
        return f24269a.e(str, str2);
    }
}
