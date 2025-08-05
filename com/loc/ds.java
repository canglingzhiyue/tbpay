package com.loc;

/* loaded from: classes4.dex */
public final class ds extends gb {
    private static int a(ga gaVar) {
        return gaVar.b();
    }

    public static int a(ga gaVar, boolean z, long j, short s, int i, short s2, short s3) {
        gaVar.b(6);
        a(gaVar, j);
        a(gaVar, i);
        c(gaVar, s3);
        b(gaVar, s2);
        a(gaVar, s);
        a(gaVar, z);
        return a(gaVar);
    }

    private static void a(ga gaVar, int i) {
        gaVar.b(3, i);
    }

    private static void a(ga gaVar, long j) {
        gaVar.a(1, j);
    }

    private static void a(ga gaVar, short s) {
        gaVar.a(2, s);
    }

    private static void a(ga gaVar, boolean z) {
        gaVar.a(z);
    }

    private static void b(ga gaVar, short s) {
        gaVar.a(4, s);
    }

    private static void c(ga gaVar, short s) {
        gaVar.a(5, s);
    }
}
