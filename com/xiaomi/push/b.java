package com.xiaomi.push;

import java.io.InputStream;
import java.util.Vector;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private int f24366a;

    /* renamed from: a  reason: collision with other field name */
    private final InputStream f129a;

    /* renamed from: a  reason: collision with other field name */
    private final byte[] f130a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;

    private b(InputStream inputStream) {
        this.f = Integer.MAX_VALUE;
        this.h = 64;
        this.i = 67108864;
        this.f130a = new byte[4096];
        this.f24366a = 0;
        this.c = 0;
        this.f129a = inputStream;
    }

    private b(byte[] bArr, int i, int i2) {
        this.f = Integer.MAX_VALUE;
        this.h = 64;
        this.i = 67108864;
        this.f130a = bArr;
        this.f24366a = i2 + i;
        this.c = i;
        this.f129a = null;
    }

    public static b a(InputStream inputStream) {
        return new b(inputStream);
    }

    public static b a(byte[] bArr, int i, int i2) {
        return new b(bArr, i, i2);
    }

    private boolean a(boolean z) {
        int i = this.c;
        int i2 = this.f24366a;
        if (i >= i2) {
            int i3 = this.e;
            if (i3 + i2 == this.f) {
                if (z) {
                    throw d.a();
                }
                return false;
            }
            this.e = i3 + i2;
            this.c = 0;
            InputStream inputStream = this.f129a;
            this.f24366a = inputStream == null ? -1 : inputStream.read(this.f130a);
            int i4 = this.f24366a;
            if (i4 == 0 || i4 < -1) {
                throw new IllegalStateException("InputStream#read(byte[]) returned invalid result: " + this.f24366a + "\nThe InputStream implementation is buggy.");
            } else if (i4 == -1) {
                this.f24366a = 0;
                if (z) {
                    throw d.a();
                }
                return false;
            } else {
                b();
                int i5 = this.e + this.f24366a + this.b;
                if (i5 <= this.i && i5 >= 0) {
                    return true;
                }
                throw d.h();
            }
        }
        throw new IllegalStateException("refillBuffer() called when buffer wasn't empty.");
    }

    private void b() {
        this.f24366a += this.b;
        int i = this.e;
        int i2 = this.f24366a;
        int i3 = i + i2;
        int i4 = this.f;
        if (i3 <= i4) {
            this.b = 0;
            return;
        }
        this.b = i3 - i4;
        this.f24366a = i2 - this.b;
    }

    public byte a() {
        if (this.c == this.f24366a) {
            a(true);
        }
        byte[] bArr = this.f130a;
        int i = this.c;
        this.c = i + 1;
        return bArr[i];
    }

    /* renamed from: a  reason: collision with other method in class */
    public int m1715a() {
        if (m1726b()) {
            this.d = 0;
            return 0;
        }
        this.d = d();
        int i = this.d;
        if (i == 0) {
            throw d.d();
        }
        return i;
    }

    public int a(int i) {
        if (i >= 0) {
            int i2 = i + this.e + this.c;
            int i3 = this.f;
            if (i2 > i3) {
                throw d.a();
            }
            this.f = i2;
            b();
            return i3;
        }
        throw d.b();
    }

    /* renamed from: a  reason: collision with other method in class */
    public long m1716a() {
        return m1727c();
    }

    /* renamed from: a  reason: collision with other method in class */
    public a m1717a() {
        int d = d();
        int i = this.f24366a;
        int i2 = this.c;
        if (d > i - i2 || d <= 0) {
            return a.a(m1723a(d));
        }
        a a2 = a.a(this.f130a, i2, d);
        this.c += d;
        return a2;
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m1718a() {
        int d = d();
        int i = this.f24366a;
        int i2 = this.c;
        if (d > i - i2 || d <= 0) {
            return new String(m1723a(d), "UTF-8");
        }
        String str = new String(this.f130a, i2, d, "UTF-8");
        this.c += d;
        return str;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m1719a() {
        int m1715a;
        do {
            m1715a = m1715a();
            if (m1715a == 0) {
                return;
            }
        } while (m1722a(m1715a));
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m1720a(int i) {
        if (this.d == i) {
            return;
        }
        throw d.e();
    }

    public void a(e eVar) {
        int d = d();
        if (this.g < this.h) {
            int a2 = a(d);
            this.g++;
            eVar.mo1909a(this);
            m1720a(0);
            this.g--;
            b(a2);
            return;
        }
        throw d.g();
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m1721a() {
        return d() != 0;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m1722a(int i) {
        int a2 = f.a(i);
        if (a2 == 0) {
            m1724b();
            return true;
        } else if (a2 == 1) {
            m1728d();
            return true;
        } else if (a2 == 2) {
            c(d());
            return true;
        } else if (a2 == 3) {
            m1719a();
            m1720a(f.a(f.b(i), 4));
            return true;
        } else if (a2 == 4) {
            return false;
        } else {
            if (a2 != 5) {
                throw d.f();
            }
            e();
            return true;
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public byte[] m1723a(int i) {
        if (i >= 0) {
            int i2 = this.e;
            int i3 = this.c;
            int i4 = i2 + i3 + i;
            int i5 = this.f;
            if (i4 > i5) {
                c((i5 - i2) - i3);
                throw d.a();
            }
            int i6 = this.f24366a;
            if (i <= i6 - i3) {
                byte[] bArr = new byte[i];
                System.arraycopy(this.f130a, i3, bArr, 0, i);
                this.c += i;
                return bArr;
            } else if (i >= 4096) {
                this.e = i2 + i6;
                this.c = 0;
                this.f24366a = 0;
                int i7 = i6 - i3;
                int i8 = i - i7;
                Vector vector = new Vector();
                while (i8 > 0) {
                    byte[] bArr2 = new byte[Math.min(i8, 4096)];
                    int i9 = 0;
                    while (i9 < bArr2.length) {
                        InputStream inputStream = this.f129a;
                        int read = inputStream == null ? -1 : inputStream.read(bArr2, i9, bArr2.length - i9);
                        if (read == -1) {
                            throw d.a();
                        }
                        this.e += read;
                        i9 += read;
                    }
                    i8 -= bArr2.length;
                    vector.addElement(bArr2);
                }
                byte[] bArr3 = new byte[i];
                System.arraycopy(this.f130a, i3, bArr3, 0, i7);
                for (int i10 = 0; i10 < vector.size(); i10++) {
                    byte[] bArr4 = (byte[]) vector.elementAt(i10);
                    System.arraycopy(bArr4, 0, bArr3, i7, bArr4.length);
                    i7 += bArr4.length;
                }
                return bArr3;
            } else {
                byte[] bArr5 = new byte[i];
                int i11 = i6 - i3;
                System.arraycopy(this.f130a, i3, bArr5, 0, i11);
                this.c = this.f24366a;
                while (true) {
                    a(true);
                    int i12 = i - i11;
                    int i13 = this.f24366a;
                    if (i12 <= i13) {
                        System.arraycopy(this.f130a, 0, bArr5, i11, i12);
                        this.c = i12;
                        return bArr5;
                    }
                    System.arraycopy(this.f130a, 0, bArr5, i11, i13);
                    int i14 = this.f24366a;
                    i11 += i14;
                    this.c = i14;
                }
            }
        } else {
            throw d.b();
        }
    }

    /* renamed from: b  reason: collision with other method in class */
    public int m1724b() {
        return d();
    }

    /* renamed from: b  reason: collision with other method in class */
    public long m1725b() {
        return m1727c();
    }

    public void b(int i) {
        this.f = i;
        b();
    }

    /* renamed from: b  reason: collision with other method in class */
    public boolean m1726b() {
        return this.c == this.f24366a && !a(false);
    }

    public int c() {
        return d();
    }

    /* renamed from: c  reason: collision with other method in class */
    public long m1727c() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte a2 = a();
            j |= (a2 & Byte.MAX_VALUE) << i;
            if ((a2 & 128) == 0) {
                return j;
            }
        }
        throw d.c();
    }

    public void c(int i) {
        if (i >= 0) {
            int i2 = this.e;
            int i3 = this.c;
            int i4 = i2 + i3 + i;
            int i5 = this.f;
            if (i4 > i5) {
                c((i5 - i2) - i3);
                throw d.a();
            }
            int i6 = this.f24366a;
            if (i <= i6 - i3) {
                this.c = i3 + i;
                return;
            }
            int i7 = i6 - i3;
            this.e = i2 + i6;
            this.c = 0;
            this.f24366a = 0;
            while (i7 < i) {
                InputStream inputStream = this.f129a;
                int skip = inputStream == null ? -1 : (int) inputStream.skip(i - i7);
                if (skip <= 0) {
                    throw d.a();
                }
                i7 += skip;
                this.e += skip;
            }
            return;
        }
        throw d.b();
    }

    public int d() {
        int i;
        byte a2 = a();
        if (a2 >= 0) {
            return a2;
        }
        int i2 = a2 & Byte.MAX_VALUE;
        byte a3 = a();
        if (a3 >= 0) {
            i = a3 << 7;
        } else {
            i2 |= (a3 & Byte.MAX_VALUE) << 7;
            byte a4 = a();
            if (a4 >= 0) {
                i = a4 << 14;
            } else {
                i2 |= (a4 & Byte.MAX_VALUE) << 14;
                byte a5 = a();
                if (a5 < 0) {
                    int i3 = i2 | ((a5 & Byte.MAX_VALUE) << 21);
                    byte a6 = a();
                    int i4 = i3 | (a6 << 28);
                    if (a6 >= 0) {
                        return i4;
                    }
                    for (int i5 = 0; i5 < 5; i5++) {
                        if (a() >= 0) {
                            return i4;
                        }
                    }
                    throw d.c();
                }
                i = a5 << 21;
            }
        }
        return i2 | i;
    }

    /* renamed from: d  reason: collision with other method in class */
    public long m1728d() {
        byte a2 = a();
        byte a3 = a();
        return ((a3 & 255) << 8) | (a2 & 255) | ((a() & 255) << 16) | ((a() & 255) << 24) | ((a() & 255) << 32) | ((a() & 255) << 40) | ((a() & 255) << 48) | ((a() & 255) << 56);
    }

    public int e() {
        return (a() & 255) | ((a() & 255) << 8) | ((a() & 255) << 16) | ((a() & 255) << 24);
    }
}
