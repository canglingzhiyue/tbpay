package com.loc;

/* loaded from: classes4.dex */
public final class dp extends gb {
    public static int a(ga gaVar, int i, int i2, short s) {
        gaVar.b(4);
        b(gaVar, i2);
        a(gaVar, i);
        a(gaVar, s);
        a(gaVar);
        return b(gaVar);
    }

    private static void a(ga gaVar) {
        gaVar.a(0, (byte) 1);
    }

    private static void a(ga gaVar, int i) {
        gaVar.a(1, i);
    }

    private static void a(ga gaVar, short s) {
        gaVar.a(3, s);
    }

    private static int b(ga gaVar) {
        return gaVar.b();
    }

    private static void b(ga gaVar, int i) {
        gaVar.a(2, i);
    }
}
