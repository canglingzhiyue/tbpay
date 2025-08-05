package com.xiaomi.push;

import android.os.Looper;

/* loaded from: classes9.dex */
public class an {
    public static void a() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            return;
        }
        throw new RuntimeException("can't do this on ui thread");
    }
}
