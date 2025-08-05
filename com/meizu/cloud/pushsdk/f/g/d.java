package com.meizu.cloud.pushsdk.f.g;

/* loaded from: classes4.dex */
public final class d {
    public static <T> T a(T t) {
        t.getClass();
        return t;
    }

    public static <T> T a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void a(boolean z, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }
}
