package com.xiaomi.push;

import android.content.Context;

/* loaded from: classes9.dex */
class au {

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f24359a = false;

    private static void a(Class<?> cls, Context context) {
        if (!f24359a) {
            try {
                f24359a = true;
                cls.getDeclaredMethod("InitEntry", Context.class).invoke(cls, context);
            } catch (Throwable th) {
                com.xiaomi.channel.commonutils.logger.b.m1616a("mdid:load lib error " + th);
            }
        }
    }

    public static boolean a(Context context) {
        try {
            Class<?> a2 = r.a(context, "com.bun.miitmdid.core.JLibrary");
            if (a2 == null) {
                return false;
            }
            a(a2, context);
            return true;
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("mdid:check error " + th);
            return false;
        }
    }
}
