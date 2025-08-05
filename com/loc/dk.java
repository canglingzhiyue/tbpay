package com.loc;

/* loaded from: classes4.dex */
public final class dk extends gb {
    private static int a(ga gaVar) {
        return gaVar.b();
    }

    public static int a(ga gaVar, byte b, int i) {
        gaVar.b(2);
        a(gaVar, i);
        a(gaVar, b);
        return a(gaVar);
    }

    public static int a(ga gaVar, byte[] bArr) {
        gaVar.a(1, bArr.length, 1);
        for (int length = bArr.length - 1; length >= 0; length--) {
            gaVar.a(bArr[length]);
        }
        return gaVar.a();
    }

    private static void a(ga gaVar, byte b) {
        gaVar.a(0, b);
    }

    private static void a(ga gaVar, int i) {
        gaVar.b(1, i);
    }
}
