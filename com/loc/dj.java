package com.loc;

/* loaded from: classes4.dex */
public final class dj extends gb {
    private static int a(ga gaVar) {
        return gaVar.b();
    }

    public static int a(ga gaVar, byte b, byte b2, short s, byte b3, int i) {
        gaVar.b(5);
        a(gaVar, i);
        a(gaVar, s);
        c(gaVar, b3);
        b(gaVar, b2);
        a(gaVar, b);
        return a(gaVar);
    }

    private static void a(ga gaVar, byte b) {
        gaVar.a(0, b);
    }

    private static void a(ga gaVar, int i) {
        gaVar.b(4, i);
    }

    private static void a(ga gaVar, short s) {
        gaVar.a(2, s);
    }

    private static void b(ga gaVar, byte b) {
        gaVar.a(1, b);
    }

    private static void c(ga gaVar, byte b) {
        gaVar.a(3, b);
    }
}
