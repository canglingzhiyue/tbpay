package com.vivo.push.util;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import tb.riy;

/* loaded from: classes9.dex */
public final class s implements t {

    /* renamed from: a  reason: collision with root package name */
    private static final String f24268a = riy.BRACKET_START_STR + Process.myPid() + riy.BRACKET_END_STR;

    private void a(Context context, String str, int i) {
        com.vivo.push.b.n nVar = new com.vivo.push.b.n();
        nVar.b(str);
        nVar.a(i);
        if (i > 0) {
            d("LogController", str);
        }
        nVar.g();
        com.vivo.push.a.a.a(context, nVar, context.getPackageName());
    }

    private static boolean a() {
        u.a();
        return com.vivo.push.g.a.a().b();
    }

    @Override // com.vivo.push.util.t
    public final int a(String str, String str2) {
        String concat = "VivoPush.Client.".concat(String.valueOf(str));
        return Log.e(concat, f24268a + str2);
    }

    @Override // com.vivo.push.util.t
    public final int a(String str, String str2, Throwable th) {
        String concat = "VivoPush.Client.".concat(String.valueOf(str));
        return Log.e(concat, f24268a + str2, th);
    }

    @Override // com.vivo.push.util.t
    public final int a(String str, Throwable th) {
        return Log.e("VivoPush.Client.".concat(String.valueOf(str)), Log.getStackTraceString(th));
    }

    @Override // com.vivo.push.util.t
    public final String a(Throwable th) {
        return Log.getStackTraceString(th);
    }

    @Override // com.vivo.push.util.t
    public final void a(Context context, String str) {
        if (a()) {
            a(context, str, 0);
        }
    }

    @Override // com.vivo.push.util.t
    public final int b(String str, String str2) {
        String concat = "VivoPush.Client.".concat(String.valueOf(str));
        return Log.w(concat, f24268a + str2);
    }

    @Override // com.vivo.push.util.t
    public final int b(String str, String str2, Throwable th) {
        if (u.a()) {
            String concat = "VivoPush.Client.".concat(String.valueOf(str));
            return Log.i(concat, f24268a + str2, th);
        }
        return -1;
    }

    @Override // com.vivo.push.util.t
    public final void b(Context context, String str) {
        if (a()) {
            a(context, str, 1);
        }
    }

    @Override // com.vivo.push.util.t
    public final int c(String str, String str2) {
        String concat = "VivoPush.Client.".concat(String.valueOf(str));
        return Log.d(concat, f24268a + str2);
    }

    @Override // com.vivo.push.util.t
    public final void c(Context context, String str) {
        if (a()) {
            a(context, str, 2);
        }
    }

    @Override // com.vivo.push.util.t
    public final int d(String str, String str2) {
        if (u.a()) {
            String concat = "VivoPush.Client.".concat(String.valueOf(str));
            return Log.i(concat, f24268a + str2);
        }
        return -1;
    }

    @Override // com.vivo.push.util.t
    public final int e(String str, String str2) {
        if (u.a()) {
            String concat = "VivoPush.Client.".concat(String.valueOf(str));
            return Log.v(concat, f24268a + str2);
        }
        return -1;
    }
}
