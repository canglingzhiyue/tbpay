package com.meizu.cloud.pushsdk.e.h;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import tb.crd;
import tb.gbx;
import tb.riy;
import tb.tof;

/* loaded from: classes4.dex */
public final class b implements c, d, Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f7933a = {48, tof.LF_LINK, tof.LF_SYMLINK, tof.LF_CHR, tof.LF_BLK, tof.LF_DIR, tof.LF_FIFO, tof.LF_CONTIG, 56, 57, 97, 98, 99, 100, 101, 102};
    j b;
    long c;

    /* loaded from: classes4.dex */
    class a extends InputStream {
        a() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(b.this.c, 2147483647L);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            b bVar = b.this;
            if (bVar.c > 0) {
                return bVar.i() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            return b.this.b(bArr, i, i2);
        }

        public String toString() {
            return b.this + ".inputStream()";
        }
    }

    @Override // com.meizu.cloud.pushsdk.e.h.c
    public long a(m mVar) throws IOException {
        if (mVar != null) {
            long j = 0;
            while (true) {
                long b = mVar.b(this, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX);
                if (b == -1) {
                    return j;
                }
                j += b;
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    public b a(String str, int i, int i2) {
        char charAt;
        int i3;
        if (str != null) {
            if (i < 0) {
                throw new IllegalAccessError("beginIndex < 0: " + i);
            } else if (i2 < i) {
                throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
            } else if (i2 > str.length()) {
                throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
            } else {
                while (i < i2) {
                    char charAt2 = str.charAt(i);
                    if (charAt2 < 128) {
                        j a2 = a(1);
                        byte[] bArr = a2.f7943a;
                        int i4 = a2.c - i;
                        int min = Math.min(i2, 2048 - i4);
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
                        int i6 = a2.c;
                        int i7 = (i4 + i) - i6;
                        a2.c = i6 + i7;
                        this.c += i7;
                    } else {
                        if (charAt2 < 2048) {
                            i3 = (charAt2 >> 6) | crd.DETECT_WIDTH;
                        } else if (charAt2 < 55296 || charAt2 > 57343) {
                            b((charAt2 >> '\f') | 224);
                            i3 = ((charAt2 >> 6) & 63) | 128;
                        } else {
                            int i8 = i + 1;
                            char charAt3 = i8 < i2 ? str.charAt(i8) : (char) 0;
                            if (charAt2 > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                                b(63);
                                i = i8;
                            } else {
                                int i9 = (((charAt2 & 10239) << 10) | (9215 & charAt3)) + 65536;
                                b((i9 >> 18) | 240);
                                b(((i9 >> 12) & 63) | 128);
                                b(((i9 >> 6) & 63) | 128);
                                b((i9 & 63) | 128);
                                i += 2;
                            }
                        }
                        b(i3);
                        b((charAt2 & riy.CONDITION_IF) | 128);
                        i++;
                    }
                }
                return this;
            }
        }
        throw new IllegalArgumentException("string == null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j a(int i) {
        if (i <= 0 || i > 2048) {
            throw new IllegalArgumentException();
        }
        j jVar = this.b;
        if (jVar != null) {
            j jVar2 = jVar.g;
            return (jVar2.c + i > 2048 || !jVar2.e) ? jVar2.a(k.a()) : jVar2;
        }
        j a2 = k.a();
        this.b = a2;
        a2.g = a2;
        a2.f = a2;
        return a2;
    }

    @Override // com.meizu.cloud.pushsdk.e.h.d
    public String a() {
        try {
            return a(this.c, o.f7946a);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public String a(long j, Charset charset) throws EOFException {
        o.a(this.c, 0L, j);
        if (charset != null) {
            if (j > 2147483647L) {
                throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
            } else if (j == 0) {
                return "";
            } else {
                j jVar = this.b;
                if (jVar.b + j > jVar.c) {
                    return new String(b(j), charset);
                }
                String str = new String(jVar.f7943a, jVar.b, (int) j, charset);
                int i = (int) (jVar.b + j);
                jVar.b = i;
                this.c -= j;
                if (i == jVar.c) {
                    this.b = jVar.b();
                    k.a(jVar);
                }
                return str;
            }
        }
        throw new IllegalArgumentException("charset == null");
    }

    @Override // com.meizu.cloud.pushsdk.e.h.l
    public void a(b bVar, long j) {
        if (bVar != null) {
            if (bVar == this) {
                throw new IllegalArgumentException("source == this");
            }
            o.a(bVar.c, 0L, j);
            while (j > 0) {
                j jVar = bVar.b;
                if (j < jVar.c - jVar.b) {
                    j jVar2 = this.b;
                    j jVar3 = jVar2 != null ? jVar2.g : null;
                    if (jVar3 != null && jVar3.e) {
                        if ((jVar3.c + j) - (jVar3.d ? 0 : jVar3.b) <= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX) {
                            jVar.a(jVar3, (int) j);
                            bVar.c -= j;
                            this.c += j;
                            return;
                        }
                    }
                    bVar.b = jVar.a((int) j);
                }
                j jVar4 = bVar.b;
                long j2 = jVar4.c - jVar4.b;
                bVar.b = jVar4.b();
                j jVar5 = this.b;
                if (jVar5 == null) {
                    this.b = jVar4;
                    jVar4.g = jVar4;
                    jVar4.f = jVar4;
                } else {
                    jVar5.g.a(jVar4).a();
                }
                bVar.c -= j2;
                this.c += j2;
                j -= j2;
            }
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    public int b(byte[] bArr, int i, int i2) {
        o.a(bArr.length, i, i2);
        j jVar = this.b;
        if (jVar == null) {
            return -1;
        }
        int min = Math.min(i2, jVar.c - jVar.b);
        System.arraycopy(jVar.f7943a, jVar.b, bArr, i, min);
        int i3 = jVar.b + min;
        jVar.b = i3;
        this.c -= min;
        if (i3 == jVar.c) {
            this.b = jVar.b();
            k.a(jVar);
        }
        return min;
    }

    @Override // com.meizu.cloud.pushsdk.e.h.m
    public long b(b bVar, long j) {
        if (bVar != null) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            }
            long j2 = this.c;
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

    public b b(int i) {
        j a2 = a(1);
        byte[] bArr = a2.f7943a;
        int i2 = a2.c;
        a2.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.c++;
        return this;
    }

    @Override // com.meizu.cloud.pushsdk.e.h.c
    /* renamed from: b */
    public b a(e eVar) {
        if (eVar != null) {
            eVar.a(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    @Override // com.meizu.cloud.pushsdk.e.h.c
    /* renamed from: b */
    public b a(String str) {
        return a(str, 0, str.length());
    }

    public void b(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int b = b(bArr, i, bArr.length - i);
            if (b == -1) {
                throw new EOFException();
            }
            i += b;
        }
    }

    @Override // com.meizu.cloud.pushsdk.e.h.d
    public byte[] b() {
        try {
            return b(this.c);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public byte[] b(long j) throws EOFException {
        o.a(this.c, 0L, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[(int) j];
            b(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
    }

    @Override // com.meizu.cloud.pushsdk.e.h.c
    public b c() {
        return this;
    }

    public b c(int i) {
        int i2;
        int i3;
        if (i >= 128) {
            if (i < 2048) {
                i3 = (i >> 6) | crd.DETECT_WIDTH;
            } else {
                if (i < 65536) {
                    if (i >= 55296 && i <= 57343) {
                        throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
                    }
                    i2 = (i >> 12) | 224;
                } else if (i > 1114111) {
                    throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
                } else {
                    b((i >> 18) | 240);
                    i2 = ((i >> 12) & 63) | 128;
                }
                b(i2);
                i3 = ((i >> 6) & 63) | 128;
            }
            b(i3);
            i = (i & 63) | 128;
        }
        b(i);
        return this;
    }

    @Override // com.meizu.cloud.pushsdk.e.h.c
    /* renamed from: c */
    public b a(byte[] bArr) {
        if (bArr != null) {
            return a(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // com.meizu.cloud.pushsdk.e.h.c
    /* renamed from: c */
    public b a(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = i2;
            o.a(bArr.length, i, j);
            int i3 = i2 + i;
            while (i < i3) {
                j a2 = a(1);
                int min = Math.min(i3 - i, 2048 - a2.c);
                System.arraycopy(bArr, i, a2.f7943a, a2.c, min);
                i += min;
                a2.c += min;
            }
            this.c += j;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public void c(long j) throws EOFException {
        j jVar;
        while (j > 0) {
            if (this.b == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j, jVar.c - jVar.b);
            long j2 = min;
            this.c -= j2;
            j -= j2;
            j jVar2 = this.b;
            int i = jVar2.b + min;
            jVar2.b = i;
            if (i == jVar2.c) {
                this.b = jVar2.b();
                k.a(jVar2);
            }
        }
    }

    @Override // com.meizu.cloud.pushsdk.e.h.l, java.io.Closeable, java.lang.AutoCloseable, com.meizu.cloud.pushsdk.e.h.m
    public void close() {
    }

    @Override // com.meizu.cloud.pushsdk.e.h.c
    /* renamed from: d */
    public b a(long j) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i == 0) {
            return b(48);
        }
        boolean z = false;
        int i2 = 1;
        if (i < 0) {
            j = -j;
            if (j < 0) {
                return a("-9223372036854775808");
            }
            z = true;
        }
        if (j >= 100000000) {
            i2 = j < 1000000000000L ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i2 = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i2 = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i2 = 2;
        }
        if (z) {
            i2++;
        }
        j a2 = a(i2);
        byte[] bArr = a2.f7943a;
        int i3 = a2.c + i2;
        while (j != 0) {
            i3--;
            bArr[i3] = f7933a[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr[i3 - 1] = gbx.OP_CALL_FUNC;
        }
        a2.c += i2;
        this.c += i2;
        return this;
    }

    @Override // com.meizu.cloud.pushsdk.e.h.d
    public InputStream d() {
        return new a();
    }

    public b e(long j) {
        if (j == 0) {
            return b(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        j a2 = a(numberOfTrailingZeros);
        byte[] bArr = a2.f7943a;
        int i = a2.c;
        for (int i2 = (i + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = f7933a[(int) (15 & j)];
            j >>>= 4;
        }
        a2.c += numberOfTrailingZeros;
        this.c += numberOfTrailingZeros;
        return this;
    }

    public void e() {
        try {
            c(this.c);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        long j = this.c;
        if (j != bVar.c) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        j jVar = this.b;
        j jVar2 = bVar.b;
        int i = jVar.b;
        int i2 = jVar2.b;
        while (j2 < this.c) {
            long min = Math.min(jVar.c - i, jVar2.c - i2);
            int i3 = i2;
            int i4 = i;
            int i5 = 0;
            while (i5 < min) {
                int i6 = i4 + 1;
                int i7 = i3 + 1;
                if (jVar.f7943a[i4] != jVar2.f7943a[i3]) {
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

    /* renamed from: f */
    public b clone() {
        b bVar = new b();
        if (this.c == 0) {
            return bVar;
        }
        j jVar = new j(this.b);
        bVar.b = jVar;
        jVar.g = jVar;
        jVar.f = jVar;
        j jVar2 = this.b;
        while (true) {
            jVar2 = jVar2.f;
            if (jVar2 == this.b) {
                bVar.c = this.c;
                return bVar;
            }
            bVar.b.g.a(new j(jVar2));
        }
    }

    @Override // com.meizu.cloud.pushsdk.e.h.l, java.io.Flushable
    public void flush() {
    }

    public long g() {
        long j = this.c;
        if (j == 0) {
            return 0L;
        }
        j jVar = this.b.g;
        int i = jVar.c;
        return (i >= 2048 || !jVar.e) ? j : j - (i - jVar.b);
    }

    public boolean h() {
        return this.c == 0;
    }

    public int hashCode() {
        j jVar = this.b;
        if (jVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = jVar.c;
            for (int i3 = jVar.b; i3 < i2; i3++) {
                i = (i * 31) + jVar.f7943a[i3];
            }
            jVar = jVar.f;
        } while (jVar != this.b);
        return i;
    }

    public byte i() {
        long j = this.c;
        if (j != 0) {
            j jVar = this.b;
            int i = jVar.b;
            int i2 = jVar.c;
            int i3 = i + 1;
            byte b = jVar.f7943a[i];
            this.c = j - 1;
            if (i3 == i2) {
                this.b = jVar.b();
                k.a(jVar);
            } else {
                jVar.b = i3;
            }
            return b;
        }
        throw new IllegalStateException("size == 0");
    }

    public e j() {
        return new e(b());
    }

    public long k() {
        return this.c;
    }

    public String toString() {
        long j = this.c;
        if (j == 0) {
            return "Buffer[size=0]";
        }
        if (j <= 16) {
            return String.format("Buffer[size=%s data=%s]", Long.valueOf(this.c), clone().j().a());
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            j jVar = this.b;
            byte[] bArr = jVar.f7943a;
            int i = jVar.b;
            messageDigest.update(bArr, i, jVar.c - i);
            j jVar2 = this.b;
            while (true) {
                jVar2 = jVar2.f;
                if (jVar2 == this.b) {
                    return String.format("Buffer[size=%s md5=%s]", Long.valueOf(this.c), e.a(messageDigest.digest()).a());
                }
                byte[] bArr2 = jVar2.f7943a;
                int i2 = jVar2.b;
                messageDigest.update(bArr2, i2, jVar2.c - i2);
            }
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }
}
