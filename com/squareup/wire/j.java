package com.squareup.wire;

import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import okio.ByteString;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class j {
    public static final int RECURSION_LIMIT = 64;
    private static final Charset b = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    public int f8132a;
    private final okio.d c;
    private int d = 0;
    private int e = Integer.MAX_VALUE;
    private int f;

    private j(okio.d dVar) {
        this.c = dVar;
    }

    public static long a(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static j a(byte[] bArr) {
        return new j(new okio.b().c(bArr));
    }

    private void b(long j) throws IOException {
        this.d = (int) (this.d + j);
        this.c.g(j);
    }

    public static int c(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    private boolean f(int i) throws IOException {
        switch (WireType.valueOf(i)) {
            case VARINT:
                e();
                return false;
            case FIXED32:
                f();
                return false;
            case FIXED64:
                g();
                return false;
            case LENGTH_DELIMITED:
                b(d());
                return false;
            case START_GROUP:
                i();
                a((i & (-8)) | WireType.END_GROUP.value());
                return false;
            case END_GROUP:
                return true;
            default:
                throw new AssertionError();
        }
    }

    private boolean j() throws IOException {
        if (h() == this.e) {
            return true;
        }
        return this.c.c();
    }

    public int a() throws IOException {
        if (j()) {
            this.f = 0;
            return 0;
        }
        this.f = d();
        int i = this.f;
        if (i == 0) {
            throw new IOException("Protocol message contained an invalid tag (zero).");
        }
        return i;
    }

    public void a(int i) throws IOException {
        if (this.f == i) {
            return;
        }
        throw new IOException("Protocol message end-group tag did not match expected tag.");
    }

    public String b() throws IOException {
        int d = d();
        this.d += d;
        return this.c.a(d, b);
    }

    public ByteString b(int i) throws IOException {
        this.d += i;
        long j = i;
        this.c.a(j);
        return this.c.d(j);
    }

    public ByteString c() throws IOException {
        return b(d());
    }

    public int d() throws IOException {
        int i;
        this.d++;
        byte g = this.c.g();
        if (g >= 0) {
            return g;
        }
        int i2 = g & Byte.MAX_VALUE;
        this.d++;
        byte g2 = this.c.g();
        if (g2 >= 0) {
            i = g2 << 7;
        } else {
            i2 |= (g2 & Byte.MAX_VALUE) << 7;
            this.d++;
            byte g3 = this.c.g();
            if (g3 >= 0) {
                i = g3 << 14;
            } else {
                i2 |= (g3 & Byte.MAX_VALUE) << 14;
                this.d++;
                byte g4 = this.c.g();
                if (g4 < 0) {
                    int i3 = i2 | ((g4 & Byte.MAX_VALUE) << 21);
                    this.d++;
                    byte g5 = this.c.g();
                    int i4 = i3 | (g5 << 28);
                    if (g5 >= 0) {
                        return i4;
                    }
                    for (int i5 = 0; i5 < 5; i5++) {
                        this.d++;
                        if (this.c.g() >= 0) {
                            return i4;
                        }
                    }
                    throw new IOException("WireInput encountered a malformed varint.");
                }
                i = g4 << 21;
            }
        }
        return i2 | i;
    }

    public int d(int i) throws IOException {
        if (i >= 0) {
            int i2 = i + this.d;
            int i3 = this.e;
            if (i2 > i3) {
                throw new EOFException("The input ended unexpectedly in the middle of a field");
            }
            this.e = i2;
            return i3;
        }
        throw new IOException("Encountered a negative size");
    }

    public long e() throws IOException {
        byte g;
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            this.d++;
            j |= (g & Byte.MAX_VALUE) << i;
            if ((this.c.g() & 128) == 0) {
                return j;
            }
        }
        throw new IOException("WireInput encountered a malformed varint.");
    }

    public void e(int i) {
        this.e = i;
    }

    public int f() throws IOException {
        this.d += 4;
        return this.c.j();
    }

    public long g() throws IOException {
        this.d += 8;
        return this.c.k();
    }

    public long h() {
        return this.d;
    }

    public void i() throws IOException {
        int a2;
        do {
            a2 = a();
            if (a2 == 0) {
                return;
            }
        } while (!f(a2));
    }
}
