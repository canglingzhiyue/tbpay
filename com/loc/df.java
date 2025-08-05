package com.loc;

/* loaded from: classes4.dex */
public final class df extends gb {
    private static int a(ga gaVar) {
        return gaVar.b();
    }

    public static int a(ga gaVar, int i, int i2, int i3) {
        gaVar.b(3);
        c(gaVar, i3);
        b(gaVar, i2);
        a(gaVar, i);
        return a(gaVar);
    }

    public static int a(ga gaVar, byte[] bArr) {
        gaVar.a(1, bArr.length, 1);
        for (int length = bArr.length - 1; length >= 0; length--) {
            gaVar.a(bArr[length]);
        }
        return gaVar.a();
    }

    public static int a(ga gaVar, int[] iArr) {
        gaVar.a(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            gaVar.a(iArr[length]);
        }
        return gaVar.a();
    }

    private static void a(ga gaVar, int i) {
        gaVar.b(0, i);
    }

    public static int b(ga gaVar, byte[] bArr) {
        gaVar.a(1, bArr.length, 1);
        for (int length = bArr.length - 1; length >= 0; length--) {
            gaVar.a(bArr[length]);
        }
        return gaVar.a();
    }

    private static void b(ga gaVar, int i) {
        gaVar.b(1, i);
    }

    private static void c(ga gaVar, int i) {
        gaVar.b(2, i);
    }
}
