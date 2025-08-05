package com.google.protobuf.nano;

import java.io.IOException;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f7243a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int h;
    private int g = Integer.MAX_VALUE;
    private int i = 64;
    private int j = 67108864;

    private a(byte[] bArr, int i, int i2) {
        this.f7243a = bArr;
        this.b = i;
        this.c = i2 + i;
        this.e = i;
    }

    public static long a(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static a a(byte[] bArr, int i, int i2) {
        return new a(bArr, i, i2);
    }

    public static int c(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    private void z() {
        this.c += this.d;
        int i = this.c;
        int i2 = this.g;
        if (i <= i2) {
            this.d = 0;
            return;
        }
        this.d = i - i2;
        this.c = i - this.d;
    }

    public int a() throws IOException {
        if (w()) {
            this.f = 0;
            return 0;
        }
        this.f = s();
        int i = this.f;
        if (i == 0) {
            throw InvalidProtocolBufferNanoException.invalidTag();
        }
        return i;
    }

    public void a(int i) throws InvalidProtocolBufferNanoException {
        if (this.f == i) {
            return;
        }
        throw InvalidProtocolBufferNanoException.invalidEndTag();
    }

    public void a(MessageNano messageNano) throws IOException {
        int s = s();
        if (this.h < this.i) {
            int d = d(s);
            this.h++;
            messageNano.mergeFrom(this);
            a(0);
            this.h--;
            e(d);
            return;
        }
        throw InvalidProtocolBufferNanoException.recursionLimitExceeded();
    }

    public void b() throws IOException {
        int a2;
        do {
            a2 = a();
            if (a2 == 0) {
                return;
            }
        } while (b(a2));
    }

    public boolean b(int i) throws IOException {
        int a2 = e.a(i);
        if (a2 == 0) {
            g();
            return true;
        } else if (a2 == 1) {
            v();
            return true;
        } else if (a2 == 2) {
            h(s());
            return true;
        } else if (a2 == 3) {
            b();
            a(e.a(e.b(i), 4));
            return true;
        } else if (a2 == 4) {
            return false;
        } else {
            if (a2 != 5) {
                throw InvalidProtocolBufferNanoException.invalidWireType();
            }
            u();
            return true;
        }
    }

    public double c() throws IOException {
        return Double.longBitsToDouble(v());
    }

    public float d() throws IOException {
        return Float.intBitsToFloat(u());
    }

    public int d(int i) throws InvalidProtocolBufferNanoException {
        if (i >= 0) {
            int i2 = i + this.e;
            int i3 = this.g;
            if (i2 > i3) {
                throw InvalidProtocolBufferNanoException.truncatedMessage();
            }
            this.g = i2;
            z();
            return i3;
        }
        throw InvalidProtocolBufferNanoException.negativeSize();
    }

    public long e() throws IOException {
        return t();
    }

    public void e(int i) {
        this.g = i;
        z();
    }

    public long f() throws IOException {
        return t();
    }

    public void f(int i) {
        int i2 = this.e;
        int i3 = this.b;
        if (i > i2 - i3) {
            throw new IllegalArgumentException("Position " + i + " is beyond current " + (this.e - this.b));
        } else if (i >= 0) {
            this.e = i3 + i;
        } else {
            throw new IllegalArgumentException("Bad position " + i);
        }
    }

    public int g() throws IOException {
        return s();
    }

    public byte[] g(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.e;
            int i3 = i2 + i;
            int i4 = this.g;
            if (i3 > i4) {
                h(i4 - i2);
                throw InvalidProtocolBufferNanoException.truncatedMessage();
            } else if (i > this.c - i2) {
                throw InvalidProtocolBufferNanoException.truncatedMessage();
            } else {
                byte[] bArr = new byte[i];
                System.arraycopy(this.f7243a, i2, bArr, 0, i);
                this.e += i;
                return bArr;
            }
        }
        throw InvalidProtocolBufferNanoException.negativeSize();
    }

    public long h() throws IOException {
        return v();
    }

    public void h(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.e;
            int i3 = i2 + i;
            int i4 = this.g;
            if (i3 > i4) {
                h(i4 - i2);
                throw InvalidProtocolBufferNanoException.truncatedMessage();
            } else if (i > this.c - i2) {
                throw InvalidProtocolBufferNanoException.truncatedMessage();
            } else {
                this.e = i2 + i;
                return;
            }
        }
        throw InvalidProtocolBufferNanoException.negativeSize();
    }

    public int i() throws IOException {
        return u();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object i(int i) throws IOException {
        switch (i) {
            case 1:
                return Double.valueOf(c());
            case 2:
                return Float.valueOf(d());
            case 3:
                return Long.valueOf(f());
            case 4:
                return Long.valueOf(e());
            case 5:
                return Integer.valueOf(g());
            case 6:
                return Long.valueOf(h());
            case 7:
                return Integer.valueOf(i());
            case 8:
                return Boolean.valueOf(j());
            case 9:
                return k();
            case 10:
            case 11:
            default:
                throw new IllegalArgumentException("Unknown type " + i);
            case 12:
                return l();
            case 13:
                return Integer.valueOf(m());
            case 14:
                return Integer.valueOf(n());
            case 15:
                return Integer.valueOf(o());
            case 16:
                return Long.valueOf(p());
            case 17:
                return Integer.valueOf(q());
            case 18:
                return Long.valueOf(r());
        }
    }

    public boolean j() throws IOException {
        return s() != 0;
    }

    public String k() throws IOException {
        int s = s();
        int i = this.c;
        int i2 = this.e;
        if (s > i - i2 || s <= 0) {
            return new String(g(s), b.f7244a);
        }
        String str = new String(this.f7243a, i2, s, b.f7244a);
        this.e += s;
        return str;
    }

    public byte[] l() throws IOException {
        int s = s();
        int i = this.c;
        int i2 = this.e;
        if (s > i - i2 || s <= 0) {
            return s == 0 ? e.EMPTY_BYTES : g(s);
        }
        byte[] bArr = new byte[s];
        System.arraycopy(this.f7243a, i2, bArr, 0, s);
        this.e += s;
        return bArr;
    }

    public int m() throws IOException {
        return s();
    }

    public int n() throws IOException {
        return s();
    }

    public int o() throws IOException {
        return u();
    }

    public long p() throws IOException {
        return v();
    }

    public int q() throws IOException {
        return c(s());
    }

    public long r() throws IOException {
        return a(t());
    }

    public int s() throws IOException {
        int i;
        byte y = y();
        if (y >= 0) {
            return y;
        }
        int i2 = y & Byte.MAX_VALUE;
        byte y2 = y();
        if (y2 >= 0) {
            i = y2 << 7;
        } else {
            i2 |= (y2 & Byte.MAX_VALUE) << 7;
            byte y3 = y();
            if (y3 >= 0) {
                i = y3 << 14;
            } else {
                i2 |= (y3 & Byte.MAX_VALUE) << 14;
                byte y4 = y();
                if (y4 < 0) {
                    int i3 = i2 | ((y4 & Byte.MAX_VALUE) << 21);
                    byte y5 = y();
                    int i4 = i3 | (y5 << 28);
                    if (y5 >= 0) {
                        return i4;
                    }
                    for (int i5 = 0; i5 < 5; i5++) {
                        if (y() >= 0) {
                            return i4;
                        }
                    }
                    throw InvalidProtocolBufferNanoException.malformedVarint();
                }
                i = y4 << 21;
            }
        }
        return i2 | i;
    }

    public long t() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte y = y();
            j |= (y & Byte.MAX_VALUE) << i;
            if ((y & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferNanoException.malformedVarint();
    }

    public int u() throws IOException {
        return (y() & 255) | ((y() & 255) << 8) | ((y() & 255) << 16) | ((y() & 255) << 24);
    }

    public long v() throws IOException {
        byte y = y();
        byte y2 = y();
        return ((y2 & 255) << 8) | (y & 255) | ((y() & 255) << 16) | ((y() & 255) << 24) | ((y() & 255) << 32) | ((y() & 255) << 40) | ((y() & 255) << 48) | ((y() & 255) << 56);
    }

    public boolean w() {
        return this.e == this.c;
    }

    public int x() {
        return this.e - this.b;
    }

    public byte y() throws IOException {
        int i = this.e;
        if (i != this.c) {
            byte[] bArr = this.f7243a;
            this.e = i + 1;
            return bArr[i];
        }
        throw InvalidProtocolBufferNanoException.truncatedMessage();
    }
}
