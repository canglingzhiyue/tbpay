package com.loc;

/* renamed from: com.loc.do  reason: invalid class name */
/* loaded from: classes4.dex */
public final class Cdo extends gb {
    public static int a(ga gaVar, int i, int i2, int i3, short s) {
        gaVar.b(5);
        c(gaVar, i3);
        b(gaVar, i2);
        a(gaVar, i);
        a(gaVar, s);
        a(gaVar);
        return b(gaVar);
    }

    private static void a(ga gaVar) {
        gaVar.a(0, (byte) 2);
    }

    private static void a(ga gaVar, int i) {
        gaVar.a(1, i);
    }

    private static void a(ga gaVar, short s) {
        gaVar.a(4, s);
    }

    private static int b(ga gaVar) {
        return gaVar.b();
    }

    private static void b(ga gaVar, int i) {
        gaVar.a(2, i);
    }

    private static void c(ga gaVar, int i) {
        gaVar.a(3, i);
    }
}
