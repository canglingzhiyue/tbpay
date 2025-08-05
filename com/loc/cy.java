package com.loc;

import java.util.List;

/* loaded from: classes4.dex */
public final class cy extends cv {
    private static cy b = new cy();

    private cy() {
        super(5120);
    }

    private static String a(String str) {
        return str == null ? "" : str;
    }

    public static cy b() {
        return b;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2, List<? extends dc> list) {
        if (list == null) {
            return null;
        }
        try {
            int size = list.size();
            if (size <= 0 || bArr == null) {
                return null;
            }
            a();
            int a2 = df.a((ga) this.f7733a, bArr);
            int[] iArr = new int[size];
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                dc dcVar = list.get(i2);
                iArr[i2] = dk.a(this.f7733a, (byte) dcVar.a(), dk.a(this.f7733a, dcVar.b()));
            }
            int a3 = df.a(this.f7733a, iArr);
            if (bArr2 != null) {
                i = df.b(this.f7733a, bArr2);
            }
            this.f7733a.c(df.a(this.f7733a, a2, i, a3));
            return this.f7733a.c();
        } catch (Throwable th) {
            ej.a(th);
            return null;
        }
    }

    public final byte[] c() {
        super.a();
        try {
            this.f7733a.c(ei.a(this.f7733a, eh.a(), this.f7733a.a(eh.f()), this.f7733a.a(eh.c()), (byte) eh.m(), this.f7733a.a(eh.i()), this.f7733a.a(eh.h()), this.f7733a.a(a(eh.g())), this.f7733a.a(a(eh.j())), eg.a(eh.n()), this.f7733a.a(eh.l()), this.f7733a.a(eh.k()), this.f7733a.a(eh.d()), this.f7733a.a(eh.e())));
            return this.f7733a.c();
        } catch (Exception e) {
            ej.a(e);
            return null;
        }
    }
}
