package com.squareup.wire;

import java.io.IOException;

/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f8134a;
    private final int b;
    private int c;

    private k(byte[] bArr, int i, int i2) {
        this.f8134a = bArr;
        this.c = i;
        this.b = i + i2;
    }

    public static int a(int i) {
        if (i >= 0) {
            return c(i);
        }
        return 10;
    }

    public static int a(int i, WireType wireType) {
        return (i << 3) | wireType.value();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static k a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static k a(byte[] bArr, int i, int i2) {
        return new k(bArr, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(int i) {
        return c(a(i, WireType.VARINT));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long d(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int h(int i) {
        return (i >> 31) ^ (i << 1);
    }

    void a(byte b) throws IOException {
        int i = this.c;
        if (i != this.b) {
            byte[] bArr = this.f8134a;
            this.c = i + 1;
            bArr[i] = b;
            return;
        }
        throw new IOException("Out of space: position=" + this.c + ", limit=" + this.b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(int i, WireType wireType) throws IOException {
        f(a(i, wireType));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(long j) throws IOException {
        while (((-128) & j) != 0) {
            d((((int) j) & 127) | 128);
            j >>>= 7;
        }
        d((int) j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(byte[] bArr) throws IOException {
        b(bArr, 0, bArr.length);
    }

    void b(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.b;
        int i4 = this.c;
        if (i3 - i4 >= i2) {
            System.arraycopy(bArr, i, this.f8134a, i4, i2);
            this.c += i2;
            return;
        }
        throw new IOException("Out of space: position=" + this.c + ", limit=" + this.b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(long j) throws IOException {
        d(((int) j) & 255);
        d(((int) (j >> 8)) & 255);
        d(((int) (j >> 16)) & 255);
        d(((int) (j >> 24)) & 255);
        d(((int) (j >> 32)) & 255);
        d(((int) (j >> 40)) & 255);
        d(((int) (j >> 48)) & 255);
        d(((int) (j >> 56)) & 255);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(int i) throws IOException {
        a((byte) i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(int i) throws IOException {
        if (i >= 0) {
            f(i);
        } else {
            b(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(int i) throws IOException {
        while ((i & (-128)) != 0) {
            d((i & 127) | 128);
            i >>>= 7;
        }
        d(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(int i) throws IOException {
        d(i & 255);
        d((i >> 8) & 255);
        d((i >> 16) & 255);
        d(i >>> 24);
    }
}
