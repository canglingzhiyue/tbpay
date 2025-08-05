package com.google.protobuf.nano;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import tb.riy;

/* loaded from: classes4.dex */
public final class CodedOutputByteBufferNano {
    public static final int LITTLE_ENDIAN_32_SIZE = 4;
    public static final int LITTLE_ENDIAN_64_SIZE = 8;

    /* renamed from: a  reason: collision with root package name */
    private final ByteBuffer f7242a;

    /* loaded from: classes4.dex */
    public static class OutOfSpaceException extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        OutOfSpaceException(int i, int i2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space (pos " + i + " limit " + i2 + ").");
        }
    }

    private CodedOutputByteBufferNano(ByteBuffer byteBuffer) {
        this.f7242a = byteBuffer;
        this.f7242a.order(ByteOrder.LITTLE_ENDIAN);
    }

    private CodedOutputByteBufferNano(byte[] bArr, int i, int i2) {
        this(ByteBuffer.wrap(bArr, i, i2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, int i2, Object obj) {
        switch (i2) {
            case 1:
                return b(i, ((Double) obj).doubleValue());
            case 2:
                return b(i, ((Float) obj).floatValue());
            case 3:
                return g(i, ((Long) obj).longValue());
            case 4:
                return f(i, ((Long) obj).longValue());
            case 5:
                return g(i, ((Integer) obj).intValue());
            case 6:
                return h(i, ((Long) obj).longValue());
            case 7:
                return h(i, ((Integer) obj).intValue());
            case 8:
                return b(i, ((Boolean) obj).booleanValue());
            case 9:
                return b(i, (String) obj);
            case 10:
                return c(i, (MessageNano) obj);
            case 11:
                return d(i, (MessageNano) obj);
            case 12:
                return b(i, (byte[]) obj);
            case 13:
                return i(i, ((Integer) obj).intValue());
            case 14:
                return j(i, ((Integer) obj).intValue());
            case 15:
                return k(i, ((Integer) obj).intValue());
            case 16:
                return i(i, ((Long) obj).longValue());
            case 17:
                return l(i, ((Integer) obj).intValue());
            case 18:
                return j(i, ((Long) obj).longValue());
            default:
                throw new IllegalArgumentException("Unknown type: " + i2);
        }
    }

    private static int a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && charSequence.charAt(i) < 128) {
            i++;
        }
        int i2 = length;
        while (true) {
            if (i < length) {
                char charAt = charSequence.charAt(i);
                if (charAt >= 2048) {
                    i2 += a(charSequence, i);
                    break;
                }
                i2 += (127 - charAt) >>> 31;
                i++;
            } else {
                break;
            }
        }
        if (i2 >= length) {
            return i2;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i2 + 4294967296L));
    }

    private static int a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt < 2048) {
                i2 += (127 - charAt) >>> 31;
            } else {
                i2 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(charSequence, i) < 65536) {
                        throw new IllegalArgumentException("Unpaired surrogate at index " + i);
                    }
                    i++;
                }
            }
            i++;
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        return r8 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int a(java.lang.CharSequence r6, byte[] r7, int r8, int r9) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.nano.CodedOutputByteBufferNano.a(java.lang.CharSequence, byte[], int, int):int");
    }

    public static CodedOutputByteBufferNano a(byte[] bArr, int i, int i2) {
        return new CodedOutputByteBufferNano(bArr, i, i2);
    }

    private static void a(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (!byteBuffer.isReadOnly()) {
            if (!byteBuffer.hasArray()) {
                b(charSequence, byteBuffer);
                return;
            }
            try {
                byteBuffer.position(a(charSequence, byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining()) - byteBuffer.arrayOffset());
                return;
            } catch (ArrayIndexOutOfBoundsException e) {
                BufferOverflowException bufferOverflowException = new BufferOverflowException();
                bufferOverflowException.initCause(e);
                throw bufferOverflowException;
            }
        }
        throw new ReadOnlyBufferException();
    }

    public static int b(double d) {
        return 8;
    }

    public static int b(float f) {
        return 4;
    }

    public static int b(int i, double d) {
        return n(i) + b(d);
    }

    public static int b(int i, float f) {
        return n(i) + b(f);
    }

    public static int b(int i, String str) {
        return n(i) + b(str);
    }

    public static int b(int i, boolean z) {
        return n(i) + b(z);
    }

    public static int b(int i, byte[] bArr) {
        return n(i) + b(bArr);
    }

    public static int b(String str) {
        int a2 = a((CharSequence) str);
        return p(a2) + a2;
    }

    public static int b(boolean z) {
        return 1;
    }

    public static int b(byte[] bArr) {
        return p(bArr.length) + bArr.length;
    }

    private static void b(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i;
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            char c = charAt;
            if (charAt >= 128) {
                if (charAt < 2048) {
                    i = (charAt >>> 6) | 960;
                } else if (charAt >= 55296 && 57343 >= charAt) {
                    int i3 = i2 + 1;
                    if (i3 != charSequence.length()) {
                        char charAt2 = charSequence.charAt(i3);
                        if (Character.isSurrogatePair(charAt, charAt2)) {
                            int codePoint = Character.toCodePoint(charAt, charAt2);
                            byteBuffer.put((byte) ((codePoint >>> 18) | 240));
                            byteBuffer.put((byte) (((codePoint >>> 12) & 63) | 128));
                            byteBuffer.put((byte) (((codePoint >>> 6) & 63) | 128));
                            byteBuffer.put((byte) ((codePoint & 63) | 128));
                            i2 = i3;
                            i2++;
                        } else {
                            i2 = i3;
                        }
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unpaired surrogate at index ");
                    sb.append(i2 - 1);
                    throw new IllegalArgumentException(sb.toString());
                } else {
                    byteBuffer.put((byte) ((charAt >>> '\f') | 480));
                    i = ((charAt >>> 6) & 63) | 128;
                }
                byteBuffer.put((byte) i);
                c = (charAt & riy.CONDITION_IF) | 128;
            }
            byteBuffer.put((byte) c);
            i2++;
        }
    }

    public static int c(int i, MessageNano messageNano) {
        return (n(i) << 1) + c(messageNano);
    }

    public static int c(MessageNano messageNano) {
        return messageNano.getSerializedSize();
    }

    public static int d(int i, MessageNano messageNano) {
        return n(i) + d(messageNano);
    }

    public static int d(MessageNano messageNano) {
        int serializedSize = messageNano.getSerializedSize();
        return p(serializedSize) + serializedSize;
    }

    public static int f(int i, long j) {
        return n(i) + f(j);
    }

    public static int f(long j) {
        return l(j);
    }

    public static int g(int i) {
        if (i >= 0) {
            return p(i);
        }
        return 10;
    }

    public static int g(int i, int i2) {
        return n(i) + g(i2);
    }

    public static int g(int i, long j) {
        return n(i) + g(j);
    }

    public static int g(long j) {
        return l(j);
    }

    public static int h(int i) {
        return 4;
    }

    public static int h(int i, int i2) {
        return n(i) + h(i2);
    }

    public static int h(int i, long j) {
        return n(i) + h(j);
    }

    public static int h(long j) {
        return 8;
    }

    public static int i(int i) {
        return p(i);
    }

    public static int i(int i, int i2) {
        return n(i) + i(i2);
    }

    public static int i(int i, long j) {
        return n(i) + i(j);
    }

    public static int i(long j) {
        return 8;
    }

    public static int j(int i) {
        return p(i);
    }

    public static int j(int i, int i2) {
        return n(i) + j(i2);
    }

    public static int j(int i, long j) {
        return n(i) + j(j);
    }

    public static int j(long j) {
        return l(n(j));
    }

    public static int k(int i) {
        return 4;
    }

    public static int k(int i, int i2) {
        return n(i) + k(i2);
    }

    public static int l(int i) {
        return p(r(i));
    }

    public static int l(int i, int i2) {
        return n(i) + l(i2);
    }

    public static int l(long j) {
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

    public static int n(int i) {
        return p(e.a(i, 0));
    }

    public static long n(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int p(int i) {
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

    public static int r(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public int a() {
        return this.f7242a.remaining();
    }

    public void a(byte b) throws IOException {
        if (this.f7242a.hasRemaining()) {
            this.f7242a.put(b);
            return;
        }
        throw new OutOfSpaceException(this.f7242a.position(), this.f7242a.limit());
    }

    public void a(double d) throws IOException {
        m(Double.doubleToLongBits(d));
    }

    public void a(float f) throws IOException {
        q(Float.floatToIntBits(f));
    }

    public void a(int i) throws IOException {
        if (i >= 0) {
            o(i);
        } else {
            k(i);
        }
    }

    public void a(int i, double d) throws IOException {
        m(i, 1);
        a(d);
    }

    public void a(int i, float f) throws IOException {
        m(i, 5);
        a(f);
    }

    public void a(int i, int i2) throws IOException {
        m(i, 0);
        a(i2);
    }

    public void a(int i, long j) throws IOException {
        m(i, 0);
        a(j);
    }

    public void a(int i, MessageNano messageNano) throws IOException {
        m(i, 3);
        a(messageNano);
        m(i, 4);
    }

    public void a(int i, String str) throws IOException {
        m(i, 2);
        a(str);
    }

    public void a(int i, boolean z) throws IOException {
        m(i, 0);
        a(z);
    }

    public void a(int i, byte[] bArr) throws IOException {
        m(i, 2);
        a(bArr);
    }

    public void a(long j) throws IOException {
        k(j);
    }

    public void a(MessageNano messageNano) throws IOException {
        messageNano.writeTo(this);
    }

    public void a(String str) throws IOException {
        try {
            int p = p(str.length());
            if (p != p(str.length() * 3)) {
                o(a((CharSequence) str));
                a(str, this.f7242a);
                return;
            }
            int position = this.f7242a.position();
            if (this.f7242a.remaining() < p) {
                throw new OutOfSpaceException(position + p, this.f7242a.limit());
            }
            this.f7242a.position(position + p);
            a(str, this.f7242a);
            int position2 = this.f7242a.position();
            this.f7242a.position(position);
            o((position2 - position) - p);
            this.f7242a.position(position2);
        } catch (BufferOverflowException e) {
            OutOfSpaceException outOfSpaceException = new OutOfSpaceException(this.f7242a.position(), this.f7242a.limit());
            outOfSpaceException.initCause(e);
            throw outOfSpaceException;
        }
    }

    public void a(boolean z) throws IOException {
        m(z ? 1 : 0);
    }

    public void a(byte[] bArr) throws IOException {
        o(bArr.length);
        c(bArr);
    }

    public void b() {
        if (a() == 0) {
            return;
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    public void b(int i) throws IOException {
        q(i);
    }

    public void b(int i, int i2) throws IOException {
        m(i, 5);
        b(i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(int i, int i2, Object obj) throws IOException {
        switch (i2) {
            case 1:
                a(i, ((Double) obj).doubleValue());
                return;
            case 2:
                a(i, ((Float) obj).floatValue());
                return;
            case 3:
                b(i, ((Long) obj).longValue());
                return;
            case 4:
                a(i, ((Long) obj).longValue());
                return;
            case 5:
                a(i, ((Integer) obj).intValue());
                return;
            case 6:
                c(i, ((Long) obj).longValue());
                return;
            case 7:
                b(i, ((Integer) obj).intValue());
                return;
            case 8:
                a(i, ((Boolean) obj).booleanValue());
                return;
            case 9:
                a(i, (String) obj);
                return;
            case 10:
                a(i, (MessageNano) obj);
                return;
            case 11:
                b(i, (MessageNano) obj);
                return;
            case 12:
                a(i, (byte[]) obj);
                return;
            case 13:
                c(i, ((Integer) obj).intValue());
                return;
            case 14:
                d(i, ((Integer) obj).intValue());
                return;
            case 15:
                e(i, ((Integer) obj).intValue());
                return;
            case 16:
                d(i, ((Long) obj).longValue());
                return;
            case 17:
                f(i, ((Integer) obj).intValue());
                return;
            case 18:
                e(i, ((Long) obj).longValue());
                return;
            default:
                throw new IOException("Unknown type: " + i2);
        }
    }

    public void b(int i, long j) throws IOException {
        m(i, 0);
        b(j);
    }

    public void b(int i, MessageNano messageNano) throws IOException {
        m(i, 2);
        b(messageNano);
    }

    public void b(long j) throws IOException {
        k(j);
    }

    public void b(MessageNano messageNano) throws IOException {
        o(messageNano.getCachedSize());
        messageNano.writeTo(this);
    }

    public void b(byte[] bArr, int i, int i2) throws IOException {
        if (this.f7242a.remaining() >= i2) {
            this.f7242a.put(bArr, i, i2);
            return;
        }
        throw new OutOfSpaceException(this.f7242a.position(), this.f7242a.limit());
    }

    public void c(int i) throws IOException {
        o(i);
    }

    public void c(int i, int i2) throws IOException {
        m(i, 0);
        c(i2);
    }

    public void c(int i, long j) throws IOException {
        m(i, 1);
        c(j);
    }

    public void c(long j) throws IOException {
        m(j);
    }

    public void c(byte[] bArr) throws IOException {
        b(bArr, 0, bArr.length);
    }

    public void d(int i) throws IOException {
        o(i);
    }

    public void d(int i, int i2) throws IOException {
        m(i, 0);
        d(i2);
    }

    public void d(int i, long j) throws IOException {
        m(i, 1);
        d(j);
    }

    public void d(long j) throws IOException {
        m(j);
    }

    public void e(int i) throws IOException {
        q(i);
    }

    public void e(int i, int i2) throws IOException {
        m(i, 5);
        e(i2);
    }

    public void e(int i, long j) throws IOException {
        m(i, 0);
        e(j);
    }

    public void e(long j) throws IOException {
        k(n(j));
    }

    public void f(int i) throws IOException {
        o(r(i));
    }

    public void f(int i, int i2) throws IOException {
        m(i, 0);
        f(i2);
    }

    public void k(long j) throws IOException {
        while (((-128) & j) != 0) {
            m((((int) j) & 127) | 128);
            j >>>= 7;
        }
        m((int) j);
    }

    public void m(int i) throws IOException {
        a((byte) i);
    }

    public void m(int i, int i2) throws IOException {
        o(e.a(i, i2));
    }

    public void m(long j) throws IOException {
        if (this.f7242a.remaining() >= 8) {
            this.f7242a.putLong(j);
            return;
        }
        throw new OutOfSpaceException(this.f7242a.position(), this.f7242a.limit());
    }

    public void o(int i) throws IOException {
        while ((i & (-128)) != 0) {
            m((i & 127) | 128);
            i >>>= 7;
        }
        m(i);
    }

    public void q(int i) throws IOException {
        if (this.f7242a.remaining() >= 4) {
            this.f7242a.putInt(i);
            return;
        }
        throw new OutOfSpaceException(this.f7242a.position(), this.f7242a.limit());
    }
}
