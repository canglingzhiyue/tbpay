package com.loc;

/* loaded from: classes4.dex */
public final class dh extends gb {
    private static int a(ga gaVar) {
        return gaVar.b();
    }

    public static int a(ga gaVar, int i, byte b, int i2, int i3) {
        gaVar.b(4);
        c(gaVar, i3);
        b(gaVar, i2);
        a(gaVar, i);
        a(gaVar, b);
        return a(gaVar);
    }

    public static int a(ga gaVar, int[] iArr) {
        gaVar.a(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            gaVar.a(iArr[length]);
        }
        return gaVar.a();
    }

    private static void a(ga gaVar, byte b) {
        gaVar.a(1, b);
    }

    private static void a(ga gaVar, int i) {
        gaVar.b(0, i);
    }

    public static int b(ga gaVar, int[] iArr) {
        gaVar.a(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            gaVar.a(iArr[length]);
        }
        return gaVar.a();
    }

    private static void b(ga gaVar, int i) {
        gaVar.b(2, i);
    }

    private static void c(ga gaVar, int i) {
        gaVar.b(3, i);
    }
}
