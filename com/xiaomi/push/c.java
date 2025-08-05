package com.xiaomi.push;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final int f24389a;

    /* renamed from: a  reason: collision with other field name */
    private final OutputStream f154a;

    /* renamed from: a  reason: collision with other field name */
    private final byte[] f155a;
    private int b;

    /* loaded from: classes9.dex */
    public static class a extends IOException {
        a() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    private c(OutputStream outputStream, byte[] bArr) {
        this.f154a = outputStream;
        this.f155a = bArr;
        this.b = 0;
        this.f24389a = bArr.length;
    }

    private c(byte[] bArr, int i, int i2) {
        this.f154a = null;
        this.f155a = bArr;
        this.b = i;
        this.f24389a = i + i2;
    }

    public static int a(int i) {
        if (i >= 0) {
            return d(i);
        }
        return 10;
    }

    public static int a(int i, int i2) {
        return c(i) + a(i2);
    }

    public static int a(int i, long j) {
        return c(i) + a(j);
    }

    public static int a(int i, com.xiaomi.push.a aVar) {
        return c(i) + a(aVar);
    }

    public static int a(int i, e eVar) {
        return c(i) + a(eVar);
    }

    public static int a(int i, String str) {
        return c(i) + a(str);
    }

    public static int a(int i, boolean z) {
        return c(i) + a(z);
    }

    public static int a(long j) {
        return c(j);
    }

    public static int a(com.xiaomi.push.a aVar) {
        return d(aVar.a()) + aVar.a();
    }

    public static int a(e eVar) {
        int mo1912b = eVar.mo1912b();
        return d(mo1912b) + mo1912b;
    }

    public static int a(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return d(bytes.length) + bytes.length;
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("UTF-8 not supported.");
        }
    }

    public static int a(boolean z) {
        return 1;
    }

    public static c a(OutputStream outputStream) {
        return a(outputStream, 4096);
    }

    public static c a(OutputStream outputStream, int i) {
        return new c(outputStream, new byte[i]);
    }

    public static c a(byte[] bArr, int i, int i2) {
        return new c(bArr, i, i2);
    }

    public static int b(int i) {
        return d(i);
    }

    public static int b(int i, int i2) {
        return c(i) + b(i2);
    }

    public static int b(int i, long j) {
        return c(i) + b(j);
    }

    public static int b(long j) {
        return c(j);
    }

    public static int c(int i) {
        return d(f.a(i, 0));
    }

    public static int c(long j) {
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

    private void c() {
        OutputStream outputStream = this.f154a;
        if (outputStream != null) {
            outputStream.write(this.f155a, 0, this.b);
            this.b = 0;
            return;
        }
        throw new a();
    }

    public static int d(int i) {
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

    public int a() {
        if (this.f154a == null) {
            return this.f24389a - this.b;
        }
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array.");
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m1753a() {
        if (this.f154a != null) {
            c();
        }
    }

    public void a(byte b) {
        if (this.b == this.f24389a) {
            c();
        }
        byte[] bArr = this.f155a;
        int i = this.b;
        this.b = i + 1;
        bArr[i] = b;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m1754a(int i) {
        if (i >= 0) {
            m1773d(i);
        } else {
            m1772c(i);
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m1755a(int i, int i2) {
        c(i, 0);
        m1754a(i2);
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m1756a(int i, long j) {
        c(i, 0);
        m1761a(j);
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m1757a(int i, com.xiaomi.push.a aVar) {
        c(i, 2);
        m1762a(aVar);
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m1758a(int i, e eVar) {
        c(i, 2);
        m1763a(eVar);
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m1759a(int i, String str) {
        c(i, 2);
        m1764a(str);
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m1760a(int i, boolean z) {
        c(i, 0);
        m1765a(z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m1761a(long j) {
        m1772c(j);
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m1762a(com.xiaomi.push.a aVar) {
        byte[] m1694a = aVar.m1694a();
        m1773d(m1694a.length);
        a(m1694a);
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m1763a(e eVar) {
        m1773d(eVar.mo1910a());
        eVar.a(this);
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m1764a(String str) {
        byte[] bytes = str.getBytes("UTF-8");
        m1773d(bytes.length);
        a(bytes);
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m1765a(boolean z) {
        m1771c(z ? 1 : 0);
    }

    public void a(byte[] bArr) {
        m1766a(bArr, 0, bArr.length);
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m1766a(byte[] bArr, int i, int i2) {
        int i3 = this.f24389a;
        int i4 = this.b;
        if (i3 - i4 >= i2) {
            System.arraycopy(bArr, i, this.f155a, i4, i2);
            this.b += i2;
            return;
        }
        int i5 = i3 - i4;
        System.arraycopy(bArr, i, this.f155a, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.b = this.f24389a;
        c();
        if (i7 > this.f24389a) {
            this.f154a.write(bArr, i6, i7);
            return;
        }
        System.arraycopy(bArr, i6, this.f155a, 0, i7);
        this.b = i7;
    }

    public void b() {
        if (a() == 0) {
            return;
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    /* renamed from: b  reason: collision with other method in class */
    public void m1767b(int i) {
        m1773d(i);
    }

    /* renamed from: b  reason: collision with other method in class */
    public void m1768b(int i, int i2) {
        c(i, 0);
        m1767b(i2);
    }

    /* renamed from: b  reason: collision with other method in class */
    public void m1769b(int i, long j) {
        c(i, 0);
        m1770b(j);
    }

    /* renamed from: b  reason: collision with other method in class */
    public void m1770b(long j) {
        m1772c(j);
    }

    /* renamed from: c  reason: collision with other method in class */
    public void m1771c(int i) {
        a((byte) i);
    }

    public void c(int i, int i2) {
        m1773d(f.a(i, i2));
    }

    /* renamed from: c  reason: collision with other method in class */
    public void m1772c(long j) {
        while (((-128) & j) != 0) {
            m1771c((((int) j) & 127) | 128);
            j >>>= 7;
        }
        m1771c((int) j);
    }

    /* renamed from: d  reason: collision with other method in class */
    public void m1773d(int i) {
        while ((i & (-128)) != 0) {
            m1771c((i & 127) | 128);
            i >>>= 7;
        }
        m1771c(i);
    }
}
