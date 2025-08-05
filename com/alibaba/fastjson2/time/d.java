package com.alibaba.fastjson2.time;

import java.util.Arrays;
import tb.kge;

/* loaded from: classes2.dex */
public final class d {
    public static final d MIDNIGHT;
    public static final d MIN;
    private static final d[] e;

    /* renamed from: a  reason: collision with root package name */
    public final byte f3022a;
    public final byte b;
    public final byte c;
    public final int d;

    static {
        kge.a(-76073768);
        e = new d[24];
        int i = 0;
        while (true) {
            d[] dVarArr = e;
            if (i >= dVarArr.length) {
                MIDNIGHT = dVarArr[0];
                MIN = dVarArr[0];
                return;
            }
            dVarArr[i] = new d(i, 0, 0, 0);
            i++;
        }
    }

    private d(int i, int i2, int i3, int i4) {
        this.f3022a = (byte) i;
        this.b = (byte) i2;
        this.c = (byte) i3;
        this.d = i4;
    }

    public static d a(int i, int i2, int i3) {
        return new d(i, i2, i3, 0);
    }

    public static d a(int i, int i2, int i3, int i4) {
        return new d(i, i2, i3, i4);
    }

    public static d a(long j) {
        c.b(j);
        int i = (int) (j / 3600000000000L);
        long j2 = j - (i * 3600000000000L);
        int i2 = (int) (j2 / 60000000000L);
        long j3 = j2 - (i2 * 60000000000L);
        int i3 = (int) (j3 / 1000000000);
        return b(i, i2, i3, (int) (j3 - (i3 * 1000000000)));
    }

    private static d b(int i, int i2, int i3, int i4) {
        return ((i2 | i3) | i4) == 0 ? e[i] : new d(i, i2, i3, i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f3022a == dVar.f3022a && this.b == dVar.b && this.c == dVar.c && this.d == dVar.d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Byte.valueOf(this.f3022a), Byte.valueOf(this.b), Byte.valueOf(this.c), Integer.valueOf(this.d)});
    }
}
