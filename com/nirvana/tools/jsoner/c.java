package com.nirvana.tools.jsoner;

/* loaded from: classes4.dex */
public final class c {
    public static <T> T a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    public static void a(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException();
    }
}
