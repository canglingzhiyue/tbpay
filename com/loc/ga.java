package com.loc;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.util.Arrays;

/* loaded from: classes4.dex */
public class ga {

    /* renamed from: a  reason: collision with root package name */
    ByteBuffer f7811a;
    int b;
    int d;
    int[] e;
    int f;
    boolean g;
    boolean h;
    int i;
    int[] j;
    int k;
    int l;
    boolean m;
    CharsetEncoder n;
    ByteBuffer o;
    static final /* synthetic */ boolean p = !ga.class.desiredAssertionStatus();
    static final Charset c = Charset.forName("UTF-8");

    private ga() {
        this.d = 1;
        this.e = null;
        this.f = 0;
        this.g = false;
        this.h = false;
        this.j = new int[16];
        this.k = 0;
        this.l = 0;
        this.m = false;
        this.n = c.newEncoder();
        this.b = 1024;
        this.f7811a = d(1024);
    }

    public ga(ByteBuffer byteBuffer) {
        this.d = 1;
        this.e = null;
        this.f = 0;
        this.g = false;
        this.h = false;
        this.j = new int[16];
        this.k = 0;
        this.l = 0;
        this.m = false;
        this.n = c.newEncoder();
        a(byteBuffer);
    }

    private void a(long j) {
        ByteBuffer byteBuffer = this.f7811a;
        int i = this.b - 8;
        this.b = i;
        byteBuffer.putLong(i, j);
    }

    private void a(short s) {
        ByteBuffer byteBuffer = this.f7811a;
        int i = this.b - 2;
        this.b = i;
        byteBuffer.putShort(i, s);
    }

    private static ByteBuffer b(ByteBuffer byteBuffer) {
        int capacity = byteBuffer.capacity();
        if (((-1073741824) & capacity) == 0) {
            int i = capacity << 1;
            byteBuffer.position(0);
            ByteBuffer d = d(i);
            d.position(i - capacity);
            d.put(byteBuffer);
            return d;
        }
        throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
    }

    private void b(byte b) {
        ByteBuffer byteBuffer = this.f7811a;
        int i = this.b - 1;
        this.b = i;
        byteBuffer.put(i, b);
    }

    private void b(long j) {
        c(8, 0);
        a(j);
    }

    private void b(short s) {
        c(2, 0);
        a(s);
    }

    private void b(boolean z) {
        ByteBuffer byteBuffer = this.f7811a;
        int i = this.b - 1;
        this.b = i;
        byteBuffer.put(i, z ? (byte) 1 : (byte) 0);
    }

    private int c(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        a((byte) 0);
        a(1, remaining, 1);
        ByteBuffer byteBuffer2 = this.f7811a;
        int i = this.b - remaining;
        this.b = i;
        byteBuffer2.position(i);
        this.f7811a.put(byteBuffer);
        return a();
    }

    private void c(int i, int i2) {
        if (i > this.d) {
            this.d = i;
        }
        int i3 = ((~((this.f7811a.capacity() - this.b) + i2)) + 1) & (i - 1);
        while (this.b < i3 + i + i2) {
            int capacity = this.f7811a.capacity();
            this.f7811a = b(this.f7811a);
            this.b += this.f7811a.capacity() - capacity;
        }
        e(i3);
    }

    private void c(boolean z) {
        c(1, 0);
        b(z);
    }

    private int d() {
        return this.f7811a.capacity() - this.b;
    }

    private static ByteBuffer d(int i) {
        ByteBuffer allocate = ByteBuffer.allocate(i);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        return allocate;
    }

    private byte[] d(int i, int i2) {
        e();
        byte[] bArr = new byte[i2];
        this.f7811a.position(i);
        this.f7811a.get(bArr);
        return bArr;
    }

    private void e() {
        if (this.h) {
            return;
        }
        throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
    }

    private void e(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            ByteBuffer byteBuffer = this.f7811a;
            int i3 = this.b - 1;
            this.b = i3;
            byteBuffer.put(i3, (byte) 0);
        }
    }

    private void f() {
        if (!this.g) {
            return;
        }
        throw new AssertionError("FlatBuffers: object serialization must not be nested.");
    }

    private void f(int i) {
        ByteBuffer byteBuffer = this.f7811a;
        int i2 = this.b - 4;
        this.b = i2;
        byteBuffer.putInt(i2, i);
    }

    private void g(int i) {
        c(4, 0);
        f(i);
    }

    private void h(int i) {
        this.e[i] = d();
    }

    public final int a() {
        if (this.g) {
            this.g = false;
            f(this.l);
            return d();
        }
        throw new AssertionError("FlatBuffers: endVector called without startVector");
    }

    public int a(CharSequence charSequence) {
        int length = (int) (charSequence.length() * this.n.maxBytesPerChar());
        ByteBuffer byteBuffer = this.o;
        if (byteBuffer == null || byteBuffer.capacity() < length) {
            this.o = ByteBuffer.allocate(Math.max(128, length));
        }
        this.o.clear();
        CoderResult encode = this.n.encode(charSequence instanceof CharBuffer ? (CharBuffer) charSequence : CharBuffer.wrap(charSequence), this.o, true);
        if (encode.isError()) {
            try {
                encode.throwException();
            } catch (CharacterCodingException e) {
                throw new Error(e);
            }
        }
        this.o.flip();
        return c(this.o);
    }

    public final ga a(ByteBuffer byteBuffer) {
        this.f7811a = byteBuffer;
        this.f7811a.clear();
        this.f7811a.order(ByteOrder.LITTLE_ENDIAN);
        this.d = 1;
        this.b = this.f7811a.capacity();
        this.f = 0;
        this.g = false;
        this.h = false;
        this.i = 0;
        this.k = 0;
        this.l = 0;
        return this;
    }

    public final void a(byte b) {
        c(1, 0);
        b(b);
    }

    public final void a(int i) {
        c(4, 0);
        if (p || i <= d()) {
            f((d() - i) + 4);
            return;
        }
        throw new AssertionError();
    }

    public final void a(int i, byte b) {
        if (this.m || b != 0) {
            a(b);
            h(i);
        }
    }

    public final void a(int i, int i2) {
        if (this.m || i2 != 0) {
            g(i2);
            h(i);
        }
    }

    public final void a(int i, int i2, int i3) {
        f();
        this.l = i2;
        int i4 = i * i2;
        c(4, i4);
        c(i3, i4);
        this.g = true;
    }

    public final void a(int i, long j) {
        if (this.m || j != 0) {
            b(j);
            h(i);
        }
    }

    public final void a(int i, short s) {
        if (this.m || s != 0) {
            b(s);
            h(i);
        }
    }

    public final void a(boolean z) {
        if (this.m || z) {
            c(z);
            h(0);
        }
    }

    public final int b() {
        int i;
        if (this.e == null || !this.g) {
            throw new AssertionError("FlatBuffers: endObject called without startObject");
        }
        g(0);
        int d = d();
        for (int i2 = this.f - 1; i2 >= 0; i2--) {
            int[] iArr = this.e;
            b((short) (iArr[i2] != 0 ? d - iArr[i2] : 0));
        }
        b((short) (d - this.i));
        b((short) ((this.f + 2) << 1));
        int i3 = 0;
        loop1: while (true) {
            if (i3 >= this.k) {
                i = 0;
                break;
            }
            int capacity = this.f7811a.capacity() - this.j[i3];
            int i4 = this.b;
            short s = this.f7811a.getShort(capacity);
            if (s == this.f7811a.getShort(i4)) {
                for (int i5 = 2; i5 < s; i5 += 2) {
                    if (this.f7811a.getShort(capacity + i5) == this.f7811a.getShort(i4 + i5)) {
                    }
                }
                i = this.j[i3];
                break loop1;
            }
            i3++;
        }
        if (i != 0) {
            this.b = this.f7811a.capacity() - d;
            this.f7811a.putInt(this.b, i - d);
        } else {
            int i6 = this.k;
            int[] iArr2 = this.j;
            if (i6 == iArr2.length) {
                this.j = Arrays.copyOf(iArr2, i6 << 1);
            }
            int[] iArr3 = this.j;
            int i7 = this.k;
            this.k = i7 + 1;
            iArr3[i7] = d();
            ByteBuffer byteBuffer = this.f7811a;
            byteBuffer.putInt(byteBuffer.capacity() - d, d() - d);
        }
        this.g = false;
        return d;
    }

    public final void b(int i) {
        f();
        int[] iArr = this.e;
        if (iArr == null || iArr.length < i) {
            this.e = new int[i];
        }
        this.f = i;
        Arrays.fill(this.e, 0, this.f, 0);
        this.g = true;
        this.i = d();
    }

    public final void b(int i, int i2) {
        if (this.m || i2 != 0) {
            a(i2);
            h(i);
        }
    }

    public final void c(int i) {
        c(this.d, 4);
        a(i);
        this.f7811a.position(this.b);
        this.h = true;
    }

    public final byte[] c() {
        return d(this.b, this.f7811a.capacity() - this.b);
    }
}
