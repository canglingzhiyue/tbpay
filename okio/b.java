package okio;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import javax.annotation.Nullable;
import tb.crd;
import tb.riy;
import tb.tof;

/* loaded from: classes9.dex */
public final class b implements Cloneable, ByteChannel, c, d {
    private static final byte[] c = {48, tof.LF_LINK, tof.LF_SYMLINK, tof.LF_CHR, tof.LF_BLK, tof.LF_DIR, tof.LF_FIFO, tof.LF_CONTIG, 56, 57, 97, 98, 99, 100, 101, 102};
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    j f25050a;
    long b;

    private boolean a(j jVar, int i, ByteString byteString, int i2, int i3) {
        int i4 = jVar.c;
        byte[] bArr = jVar.f25060a;
        while (i2 < i3) {
            if (i == i4) {
                jVar = jVar.f;
                byte[] bArr2 = jVar.f25060a;
                bArr = bArr2;
                i = jVar.b;
                i4 = jVar.c;
            }
            if (bArr[i] != byteString.getByte(i2)) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    @Override // okio.d
    public int a(f fVar) {
        int a2 = a(fVar, false);
        if (a2 == -1) {
            return -1;
        }
        try {
            g(fVar.f25055a[a2].size());
            return a2;
        } catch (EOFException unused) {
            throw new AssertionError();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0095, code lost:
        if (r19 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0097, code lost:
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0098, code lost:
        return r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int a(okio.f r18, boolean r19) {
        /*
            r17 = this;
            r0 = r18
            r1 = r17
            okio.j r2 = r1.f25050a
            r3 = -2
            if (r2 != 0) goto L13
            if (r19 == 0) goto Lc
            return r3
        Lc:
            okio.ByteString r2 = okio.ByteString.EMPTY
            int r0 = r0.indexOf(r2)
            return r0
        L13:
            byte[] r4 = r2.f25060a
            int r5 = r2.b
            int r6 = r2.c
            int[] r0 = r0.b
            r8 = -1
            r9 = r5
            r11 = r6
            r10 = -1
            r5 = r2
            r6 = r4
            r4 = 0
        L22:
            int r12 = r4 + 1
            r4 = r0[r4]
            int r13 = r12 + 1
            r12 = r0[r12]
            if (r12 == r8) goto L2d
            r10 = r12
        L2d:
            if (r5 == 0) goto L95
            r12 = 0
            if (r4 >= 0) goto L67
            int r4 = r4 * (-1)
            int r14 = r13 + r4
        L36:
            int r4 = r9 + 1
            r9 = r6[r9]
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r15 = r13 + 1
            r13 = r0[r13]
            if (r9 == r13) goto L43
            return r10
        L43:
            if (r15 != r14) goto L47
            r9 = 1
            goto L48
        L47:
            r9 = 0
        L48:
            if (r4 != r11) goto L5e
            okio.j r4 = r5.f
            int r5 = r4.b
            byte[] r6 = r4.f25060a
            int r11 = r4.c
            if (r4 != r2) goto L59
            if (r9 == 0) goto L95
            r4 = r5
            r5 = r12
            goto L5e
        L59:
            r16 = r5
            r5 = r4
            r4 = r16
        L5e:
            if (r9 == 0) goto L64
            r9 = r0[r15]
            r14 = r4
            goto L8c
        L64:
            r9 = r4
            r13 = r15
            goto L36
        L67:
            int r14 = r9 + 1
            r9 = r6[r9]
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r15 = r13 + r4
        L6f:
            if (r13 != r15) goto L72
            return r10
        L72:
            r7 = r0[r13]
            if (r9 != r7) goto L92
            int r13 = r13 + r4
            r9 = r0[r13]
            if (r14 != r11) goto L8c
            okio.j r4 = r5.f
            int r5 = r4.b
            byte[] r6 = r4.f25060a
            int r7 = r4.c
            if (r4 != r2) goto L89
            r14 = r5
            r11 = r7
            r5 = r12
            goto L8c
        L89:
            r14 = r5
            r11 = r7
            r5 = r4
        L8c:
            if (r9 < 0) goto L8f
            return r9
        L8f:
            int r4 = -r9
            r9 = r14
            goto L22
        L92:
            int r13 = r13 + 1
            goto L6f
        L95:
            if (r19 == 0) goto L98
            return r3
        L98:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.b.a(okio.f, boolean):int");
    }

    public int a(byte[] bArr, int i, int i2) {
        o.a(bArr.length, i, i2);
        j jVar = this.f25050a;
        if (jVar == null) {
            return -1;
        }
        int min = Math.min(i2, jVar.c - jVar.b);
        System.arraycopy(jVar.f25060a, jVar.b, bArr, i, min);
        jVar.b += min;
        this.b -= min;
        if (jVar.b == jVar.c) {
            this.f25050a = jVar.b();
            k.a(jVar);
        }
        return min;
    }

    public final long a() {
        return this.b;
    }

    @Override // okio.d
    public long a(ByteString byteString) throws IOException {
        return a(byteString, 0L);
    }

    public long a(ByteString byteString, long j) throws IOException {
        byte[] bArr;
        j jVar;
        if (byteString.size() != 0) {
            long j2 = 0;
            if (j < 0) {
                throw new IllegalArgumentException("fromIndex < 0");
            }
            j jVar2 = this.f25050a;
            long j3 = -1;
            if (jVar2 == null) {
                return -1L;
            }
            long j4 = this.b;
            if (j4 - j >= j) {
                while (true) {
                    j4 = j2;
                    j2 = (jVar2.c - jVar2.b) + j4;
                    if (j2 >= j) {
                        break;
                    }
                    jVar2 = jVar2.f;
                }
            } else {
                while (j4 > j) {
                    jVar2 = jVar2.g;
                    j4 -= jVar2.c - jVar2.b;
                }
            }
            byte b = byteString.getByte(0);
            int size = byteString.size();
            long j5 = 1 + (this.b - size);
            long j6 = j;
            j jVar3 = jVar2;
            long j7 = j4;
            while (j7 < j5) {
                byte[] bArr2 = jVar3.f25060a;
                int min = (int) Math.min(jVar3.c, (jVar3.b + j5) - j7);
                int i = (int) ((jVar3.b + j6) - j7);
                while (i < min) {
                    if (bArr2[i] == b) {
                        bArr = bArr2;
                        jVar = jVar3;
                        if (a(jVar3, i + 1, byteString, 1, size)) {
                            return (i - jVar.b) + j7;
                        }
                    } else {
                        bArr = bArr2;
                        jVar = jVar3;
                    }
                    i++;
                    jVar3 = jVar;
                    bArr2 = bArr;
                }
                j jVar4 = jVar3;
                j6 = (jVar4.c - jVar4.b) + j7;
                jVar3 = jVar4.f;
                j3 = -1;
                j7 = j6;
            }
            return j3;
        }
        throw new IllegalArgumentException("bytes is empty");
    }

    @Override // okio.d
    public long a(l lVar) throws IOException {
        long j = this.b;
        if (j > 0) {
            lVar.a(this, j);
        }
        return j;
    }

    @Override // okio.d
    public String a(long j, Charset charset) throws EOFException {
        o.a(this.b, 0L, j);
        if (charset != null) {
            if (j > 2147483647L) {
                throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
            } else if (j == 0) {
                return "";
            } else {
                j jVar = this.f25050a;
                if (jVar.b + j > jVar.c) {
                    return new String(f(j), charset);
                }
                String str = new String(jVar.f25060a, jVar.b, (int) j, charset);
                jVar.b = (int) (jVar.b + j);
                this.b -= j;
                if (jVar.b == jVar.c) {
                    this.f25050a = jVar.b();
                    k.a(jVar);
                }
                return str;
            }
        }
        throw new IllegalArgumentException("charset == null");
    }

    @Override // okio.c
    /* renamed from: a */
    public b e(int i) {
        j c2 = c(1);
        byte[] bArr = c2.f25060a;
        int i2 = c2.c;
        c2.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.b++;
        return this;
    }

    @Override // okio.c
    /* renamed from: a */
    public b b(String str) {
        return b(str, 0, str.length());
    }

    @Override // okio.c
    /* renamed from: a */
    public b b(String str, int i, int i2) {
        char charAt;
        int i3;
        if (str != null) {
            if (i < 0) {
                throw new IllegalArgumentException("beginIndex < 0: " + i);
            } else if (i2 < i) {
                throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
            } else if (i2 > str.length()) {
                throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
            } else {
                while (i < i2) {
                    char charAt2 = str.charAt(i);
                    if (charAt2 < 128) {
                        j c2 = c(1);
                        byte[] bArr = c2.f25060a;
                        int i4 = c2.c - i;
                        int min = Math.min(i2, 8192 - i4);
                        int i5 = i + 1;
                        bArr[i + i4] = (byte) charAt2;
                        while (true) {
                            i = i5;
                            if (i >= min || (charAt = str.charAt(i)) >= 128) {
                                break;
                            }
                            i5 = i + 1;
                            bArr[i + i4] = (byte) charAt;
                        }
                        int i6 = (i4 + i) - c2.c;
                        c2.c += i6;
                        this.b += i6;
                    } else {
                        if (charAt2 < 2048) {
                            i3 = (charAt2 >> 6) | crd.DETECT_WIDTH;
                        } else if (charAt2 < 55296 || charAt2 > 57343) {
                            e((charAt2 >> '\f') | 224);
                            i3 = ((charAt2 >> 6) & 63) | 128;
                        } else {
                            int i7 = i + 1;
                            char charAt3 = i7 < i2 ? str.charAt(i7) : (char) 0;
                            if (charAt2 > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                                e(63);
                                i = i7;
                            } else {
                                int i8 = (((charAt2 & 10239) << 10) | (9215 & charAt3)) + 65536;
                                e((i8 >> 18) | 240);
                                e(((i8 >> 12) & 63) | 128);
                                e(((i8 >> 6) & 63) | 128);
                                e((i8 & 63) | 128);
                                i += 2;
                            }
                        }
                        e(i3);
                        e((charAt2 & riy.CONDITION_IF) | 128);
                        i++;
                    }
                }
                return this;
            }
        }
        throw new IllegalArgumentException("string == null");
    }

    public final b a(b bVar, long j, long j2) {
        if (bVar != null) {
            o.a(this.b, j, j2);
            if (j2 == 0) {
                return this;
            }
            bVar.b += j2;
            j jVar = this.f25050a;
            while (j >= jVar.c - jVar.b) {
                j -= jVar.c - jVar.b;
                jVar = jVar.f;
            }
            while (j2 > 0) {
                j a2 = jVar.a();
                a2.b = (int) (a2.b + j);
                a2.c = Math.min(a2.b + ((int) j2), a2.c);
                j jVar2 = bVar.f25050a;
                if (jVar2 == null) {
                    a2.g = a2;
                    a2.f = a2;
                    bVar.f25050a = a2;
                } else {
                    jVar2.g.a(a2);
                }
                j2 -= a2.c - a2.b;
                jVar = jVar.f;
                j = 0;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    @Override // okio.d
    public void a(long j) throws EOFException {
        if (this.b >= j) {
            return;
        }
        throw new EOFException();
    }

    @Override // okio.l
    public void a(b bVar, long j) {
        if (bVar != null) {
            if (bVar == this) {
                throw new IllegalArgumentException("source == this");
            }
            o.a(bVar.b, 0L, j);
            while (j > 0) {
                if (j < bVar.f25050a.c - bVar.f25050a.b) {
                    j jVar = this.f25050a;
                    j jVar2 = jVar != null ? jVar.g : null;
                    if (jVar2 != null && jVar2.e) {
                        if ((jVar2.c + j) - (jVar2.d ? 0 : jVar2.b) <= 8192) {
                            bVar.f25050a.a(jVar2, (int) j);
                            bVar.b -= j;
                            this.b += j;
                            return;
                        }
                    }
                    bVar.f25050a = bVar.f25050a.a((int) j);
                }
                j jVar3 = bVar.f25050a;
                long j2 = jVar3.c - jVar3.b;
                bVar.f25050a = jVar3.b();
                j jVar4 = this.f25050a;
                if (jVar4 == null) {
                    this.f25050a = jVar3;
                    j jVar5 = this.f25050a;
                    jVar5.g = jVar5;
                    jVar5.f = jVar5;
                } else {
                    jVar4.g.a(jVar3).c();
                }
                bVar.b -= j2;
                this.b += j2;
                j -= j2;
            }
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    public void a(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int a2 = a(bArr, i, bArr.length - i);
            if (a2 == -1) {
                throw new EOFException();
            }
            i += a2;
        }
    }

    @Override // okio.d
    public long b(ByteString byteString) {
        return b(byteString, 0L);
    }

    public long b(ByteString byteString, long j) {
        int i;
        long j2 = 0;
        if (j >= 0) {
            j jVar = this.f25050a;
            if (jVar == null) {
                return -1L;
            }
            long j3 = this.b;
            if (j3 - j >= j) {
                while (true) {
                    j3 = j2;
                    j2 = (jVar.c - jVar.b) + j3;
                    if (j2 >= j) {
                        break;
                    }
                    jVar = jVar.f;
                }
            } else {
                while (j3 > j) {
                    jVar = jVar.g;
                    j3 -= jVar.c - jVar.b;
                }
            }
            if (byteString.size() == 2) {
                byte b = byteString.getByte(0);
                byte b2 = byteString.getByte(1);
                while (j3 < this.b) {
                    byte[] bArr = jVar.f25060a;
                    i = (int) ((jVar.b + j) - j3);
                    int i2 = jVar.c;
                    while (i < i2) {
                        byte b3 = bArr[i];
                        if (b3 != b && b3 != b2) {
                            i++;
                        }
                        return (i - jVar.b) + j3;
                    }
                    j = (jVar.c - jVar.b) + j3;
                    jVar = jVar.f;
                    j3 = j;
                }
                return -1L;
            }
            byte[] internalArray = byteString.internalArray();
            while (j3 < this.b) {
                byte[] bArr2 = jVar.f25060a;
                i = (int) ((jVar.b + j) - j3);
                int i3 = jVar.c;
                while (i < i3) {
                    byte b4 = bArr2[i];
                    for (byte b5 : internalArray) {
                        if (b4 == b5) {
                            return (i - jVar.b) + j3;
                        }
                    }
                    i++;
                }
                j = (jVar.c - jVar.b) + j3;
                jVar = jVar.f;
                j3 = j;
            }
            return -1L;
        }
        throw new IllegalArgumentException("fromIndex < 0");
    }

    @Override // okio.m
    public long b(b bVar, long j) {
        if (bVar != null) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            }
            long j2 = this.b;
            if (j2 == 0) {
                return -1L;
            }
            if (j > j2) {
                j = j2;
            }
            bVar.a(this, j);
            return j;
        }
        throw new IllegalArgumentException("sink == null");
    }

    @Override // okio.d
    public b b() {
        return this;
    }

    public b b(int i) {
        j c2 = c(4);
        byte[] bArr = c2.f25060a;
        int i2 = c2.c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) (i >>> 24);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i >>> 16);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (i >>> 8);
        bArr[i5] = (byte) i;
        c2.c = i5 + 1;
        this.b += 4;
        return this;
    }

    @Override // okio.c
    /* renamed from: b */
    public b c(byte[] bArr) {
        if (bArr != null) {
            return b(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    public b b(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = i2;
            o.a(bArr.length, i, j);
            int i3 = i2 + i;
            while (i < i3) {
                j c2 = c(1);
                int min = Math.min(i3 - i, 8192 - c2.c);
                System.arraycopy(bArr, i, c2.f25060a, c2.c, min);
                i += min;
                c2.c += min;
            }
            this.b += j;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // okio.d
    public boolean b(long j) {
        return this.b >= j;
    }

    public final byte c(long j) {
        o.a(this.b, j, 1L);
        long j2 = this.b;
        if (j2 - j <= j) {
            long j3 = j - j2;
            j jVar = this.f25050a;
            do {
                jVar = jVar.g;
                j3 += jVar.c - jVar.b;
            } while (j3 < 0);
            return jVar.f25060a[jVar.b + ((int) j3)];
        }
        j jVar2 = this.f25050a;
        while (true) {
            long j4 = jVar2.c - jVar2.b;
            if (j < j4) {
                return jVar2.f25060a[jVar2.b + ((int) j)];
            }
            j -= j4;
            jVar2 = jVar2.f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j c(int i) {
        if (i <= 0 || i > 8192) {
            throw new IllegalArgumentException();
        }
        j jVar = this.f25050a;
        if (jVar != null) {
            j jVar2 = jVar.g;
            return (jVar2.c + i > 8192 || !jVar2.e) ? jVar2.a(k.a()) : jVar2;
        }
        this.f25050a = k.a();
        j jVar3 = this.f25050a;
        jVar3.g = jVar3;
        jVar3.f = jVar3;
        return jVar3;
    }

    @Override // okio.d
    public boolean c() {
        return this.b == 0;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, okio.l, okio.m
    public void close() {
    }

    public final ByteString d(int i) {
        return i == 0 ? ByteString.EMPTY : new SegmentedByteString(this, i);
    }

    @Override // okio.d
    public ByteString d(long j) throws EOFException {
        return new ByteString(f(j));
    }

    @Override // okio.d
    public d d() {
        return e.a(new g(this));
    }

    @Override // okio.d
    public InputStream e() {
        return new InputStream() { // from class: okio.b.1
            @Override // java.io.InputStream
            public int available() {
                return (int) Math.min(b.this.b, 2147483647L);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // java.io.InputStream
            public int read() {
                if (b.this.b > 0) {
                    return b.this.g() & 255;
                }
                return -1;
            }

            @Override // java.io.InputStream
            public int read(byte[] bArr, int i, int i2) {
                return b.this.a(bArr, i, i2);
            }

            public String toString() {
                return b.this + ".inputStream()";
            }
        };
    }

    public String e(long j) throws EOFException {
        return a(j, o.UTF_8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        long j = this.b;
        if (j != bVar.b) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        j jVar = this.f25050a;
        j jVar2 = bVar.f25050a;
        int i = jVar.b;
        int i2 = jVar2.b;
        while (j2 < this.b) {
            long min = Math.min(jVar.c - i, jVar2.c - i2);
            int i3 = i2;
            int i4 = i;
            int i5 = 0;
            while (i5 < min) {
                int i6 = i4 + 1;
                int i7 = i3 + 1;
                if (jVar.f25060a[i4] != jVar2.f25060a[i3]) {
                    return false;
                }
                i5++;
                i4 = i6;
                i3 = i7;
            }
            if (i4 == jVar.c) {
                jVar = jVar.f;
                i = jVar.b;
            } else {
                i = i4;
            }
            if (i3 == jVar2.c) {
                jVar2 = jVar2.f;
                i2 = jVar2.b;
            } else {
                i2 = i3;
            }
            j2 += min;
        }
        return true;
    }

    public final long f() {
        long j = this.b;
        if (j == 0) {
            return 0L;
        }
        j jVar = this.f25050a.g;
        return (jVar.c >= 8192 || !jVar.e) ? j : j - (jVar.c - jVar.b);
    }

    public byte[] f(long j) throws EOFException {
        o.a(this.b, 0L, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[(int) j];
            a(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
    }

    @Override // okio.c, okio.l, java.io.Flushable
    public void flush() {
    }

    @Override // okio.d
    public byte g() {
        if (this.b != 0) {
            j jVar = this.f25050a;
            int i = jVar.b;
            int i2 = jVar.c;
            int i3 = i + 1;
            byte b = jVar.f25060a[i];
            this.b--;
            if (i3 == i2) {
                this.f25050a = jVar.b();
                k.a(jVar);
            } else {
                jVar.b = i3;
            }
            return b;
        }
        throw new IllegalStateException("size == 0");
    }

    @Override // okio.d
    public void g(long j) throws EOFException {
        j jVar;
        while (j > 0) {
            if (this.f25050a == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j, jVar.c - this.f25050a.b);
            long j2 = min;
            this.b -= j2;
            j -= j2;
            this.f25050a.b += min;
            if (this.f25050a.b == this.f25050a.c) {
                j jVar2 = this.f25050a;
                this.f25050a = jVar2.b();
                k.a(jVar2);
            }
        }
    }

    public int h() {
        if (this.b < 4) {
            throw new IllegalStateException("size < 4: " + this.b);
        }
        j jVar = this.f25050a;
        int i = jVar.b;
        int i2 = jVar.c;
        if (i2 - i < 4) {
            return ((g() & 255) << 24) | ((g() & 255) << 16) | ((g() & 255) << 8) | (g() & 255);
        }
        byte[] bArr = jVar.f25060a;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
        int i6 = i4 + 1;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        int i8 = i6 + 1;
        int i9 = i7 | (bArr[i6] & 255);
        this.b -= 4;
        if (i8 == i2) {
            this.f25050a = jVar.b();
            k.a(jVar);
        } else {
            jVar.b = i8;
        }
        return i9;
    }

    public int hashCode() {
        j jVar = this.f25050a;
        if (jVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = jVar.c;
            for (int i3 = jVar.b; i3 < i2; i3++) {
                i = (i * 31) + jVar.f25060a[i3];
            }
            jVar = jVar.f;
        } while (jVar != this.f25050a);
        return i;
    }

    public long i() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (this.b < 8) {
            throw new IllegalStateException("size < 8: " + this.b);
        }
        j jVar = this.f25050a;
        int i8 = jVar.b;
        int i9 = jVar.c;
        if (i9 - i8 < 8) {
            return ((h() & 4294967295L) << 32) | (4294967295L & h());
        }
        byte[] bArr = jVar.f25060a;
        int i10 = i8 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1;
        long j = (bArr[i7] & 255) | ((bArr[i8] & 255) << 56) | ((bArr[i] & 255) << 48) | ((bArr[i2] & 255) << 40) | ((bArr[i3] & 255) << 32) | ((bArr[i4] & 255) << 24) | ((bArr[i5] & 255) << 16) | ((bArr[i6] & 255) << 8);
        this.b -= 8;
        if (i10 == i9) {
            this.f25050a = jVar.b();
            k.a(jVar);
        } else {
            jVar.b = i10;
        }
        return j;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // okio.d
    public int j() {
        return o.a(h());
    }

    @Override // okio.d
    public long k() {
        return o.a(i());
    }

    public ByteString l() {
        return new ByteString(n());
    }

    public String m() {
        try {
            return a(this.b, o.UTF_8);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public byte[] n() {
        try {
            return f(this.b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public final void o() {
        try {
            g(this.b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: p */
    public b clone() {
        b bVar = new b();
        if (this.b == 0) {
            return bVar;
        }
        bVar.f25050a = this.f25050a.a();
        j jVar = bVar.f25050a;
        jVar.g = jVar;
        jVar.f = jVar;
        j jVar2 = this.f25050a;
        while (true) {
            jVar2 = jVar2.f;
            if (jVar2 == this.f25050a) {
                bVar.b = this.b;
                return bVar;
            }
            bVar.f25050a.g.a(jVar2.a());
        }
    }

    public final ByteString q() {
        long j = this.b;
        if (j <= 2147483647L) {
            return d((int) j);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.b);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        j jVar = this.f25050a;
        if (jVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), jVar.c - jVar.b);
        byteBuffer.put(jVar.f25060a, jVar.b, min);
        jVar.b += min;
        this.b -= min;
        if (jVar.b == jVar.c) {
            this.f25050a = jVar.b();
            k.a(jVar);
        }
        return min;
    }

    public String toString() {
        return q().toString();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i = remaining;
            while (i > 0) {
                j c2 = c(1);
                int min = Math.min(i, 8192 - c2.c);
                byteBuffer.get(c2.f25060a, c2.c, min);
                i -= min;
                c2.c += min;
            }
            this.b += remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }
}
