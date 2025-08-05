package com.vivo.push.util;

import android.os.Looper;

/* loaded from: classes9.dex */
public final class k {
    public static void a(String str) {
        if (!u.b() || Looper.myLooper() != Looper.getMainLooper()) {
            return;
        }
        String str2 = "Operation: " + str + " in main thread!";
        new Throwable();
    }
}
