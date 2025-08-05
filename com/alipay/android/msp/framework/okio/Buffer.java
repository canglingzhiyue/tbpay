package com.alipay.android.msp.framework.okio;

import com.android.alibaba.ip.runtime.IpChange;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes3.dex */
public final class Buffer implements BufferedSink, BufferedSource, Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Segment f4819a;
    public long b;

    @Override // com.alipay.android.msp.framework.okio.BufferedSink, com.alipay.android.msp.framework.okio.BufferedSource
    public final Buffer buffer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Buffer) ipChange.ipc$dispatch("c823d43e", new Object[]{this}) : this;
    }

    @Override // com.alipay.android.msp.framework.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        }
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSink
    /* renamed from: emitCompleteSegments */
    public final Buffer mo524emitCompleteSegments() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Buffer) ipChange.ipc$dispatch("31404412", new Object[]{this}) : this;
    }

    @Override // com.alipay.android.msp.framework.okio.Sink
    public final void flush() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd889d8b", new Object[]{this});
        }
    }

    public final long size() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("32697bfc", new Object[]{this})).longValue() : this.b;
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSink
    public final OutputStream outputStream() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OutputStream) ipChange.ipc$dispatch("6de40e60", new Object[]{this}) : new OutputStream() { // from class: com.alipay.android.msp.framework.okio.Buffer.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e32ba67f", new Object[]{this});
                }
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dd889d8b", new Object[]{this});
                }
            }

            @Override // java.io.OutputStream
            public void write(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d7403add", new Object[]{this, new Integer(i)});
                } else {
                    Buffer.this.mo528writeByte((int) ((byte) i));
                }
            }

            @Override // java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1b94b14d", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
                } else {
                    Buffer.this.mo527write(bArr, i, i2);
                }
            }

            public String toString() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (String) ipChange2.ipc$dispatch("8126d80d", new Object[]{this});
                }
                return this + ".outputStream()";
            }
        };
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final boolean exhausted() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d9647754", new Object[]{this})).booleanValue() : this.b == 0;
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final void require(long j) throws EOFException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bde98d8", new Object[]{this, new Long(j)});
        } else if (this.b < j) {
            throw new EOFException();
        }
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final InputStream inputStream() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InputStream) ipChange.ipc$dispatch("fc12abf4", new Object[]{this}) : new InputStream() { // from class: com.alipay.android.msp.framework.okio.Buffer.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e32ba67f", new Object[]{this});
                }
            }

            @Override // java.io.InputStream
            public int read() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("cc382310", new Object[]{this})).intValue();
                }
                if (Buffer.this.b <= 0) {
                    return -1;
                }
                return Buffer.this.readByte() & 255;
            }

            @Override // java.io.InputStream
            public int read(byte[] bArr, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("33620bf7", new Object[]{this, bArr, new Integer(i), new Integer(i2)})).intValue() : Buffer.this.a(bArr, i, i2);
            }

            @Override // java.io.InputStream
            public int available() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("6f9282c3", new Object[]{this})).intValue() : (int) Math.min(Buffer.this.b, 2147483647L);
            }

            public String toString() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (String) ipChange2.ipc$dispatch("8126d80d", new Object[]{this});
                }
                return Buffer.this + ".inputStream()";
            }
        };
    }

    public final Buffer copyTo(OutputStream outputStream) throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Buffer) ipChange.ipc$dispatch("d947103c", new Object[]{this, outputStream}) : copyTo(outputStream, 0L, this.b);
    }

    public final Buffer copyTo(OutputStream outputStream, long j, long j2) throws IOException {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Buffer) ipChange.ipc$dispatch("691bdfc", new Object[]{this, outputStream, new Long(j), new Long(j2)});
        }
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        Util.checkOffsetAndCount(this.b, j, j2);
        if (j2 == 0) {
            return this;
        }
        Segment segment = this.f4819a;
        while (j >= segment.c - segment.b) {
            j -= segment.c - segment.b;
            segment = segment.d;
        }
        while (j2 > 0) {
            int min = (int) Math.min(segment.c - i, j2);
            outputStream.write(segment.f4836a, (int) (segment.b + j), min);
            j2 -= min;
            segment = segment.d;
            j = 0;
        }
        return this;
    }

    public final Buffer writeTo(OutputStream outputStream) throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Buffer) ipChange.ipc$dispatch("b6578f12", new Object[]{this, outputStream}) : writeTo(outputStream, this.b);
    }

    public final Buffer writeTo(OutputStream outputStream, long j) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Buffer) ipChange.ipc$dispatch("5fb0c194", new Object[]{this, outputStream, new Long(j)});
        }
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        Util.checkOffsetAndCount(this.b, 0L, j);
        Segment segment = this.f4819a;
        while (j > 0) {
            int min = (int) Math.min(j, segment.c - segment.b);
            outputStream.write(segment.f4836a, segment.b, min);
            segment.b += min;
            long j2 = min;
            this.b -= j2;
            j -= j2;
            if (segment.b == segment.c) {
                Segment pop = segment.pop();
                this.f4819a = pop;
                SegmentPool.f4837a.a(segment);
                segment = pop;
            }
        }
        return this;
    }

    public final Buffer readFrom(InputStream inputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Buffer) ipChange.ipc$dispatch("174c2719", new Object[]{this, inputStream});
        }
        a(inputStream, Long.MAX_VALUE, true);
        return this;
    }

    public final Buffer readFrom(InputStream inputStream, long j) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Buffer) ipChange.ipc$dispatch("1d4f2a6d", new Object[]{this, inputStream, new Long(j)});
        }
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        }
        a(inputStream, j, false);
        return this;
    }

    private void a(InputStream inputStream, long j, boolean z) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dc8a4fb", new Object[]{this, inputStream, new Long(j), new Boolean(z)});
        } else if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        } else {
            while (true) {
                if (j <= 0 && !z) {
                    return;
                }
                Segment a2 = a(1);
                int read = inputStream.read(a2.f4836a, a2.c, (int) Math.min(j, 2048 - a2.c));
                if (read == -1) {
                    if (!z) {
                        throw new EOFException();
                    }
                    return;
                }
                a2.c += read;
                long j2 = read;
                this.b += j2;
                j -= j2;
            }
        }
    }

    public final long completeSegmentByteCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e26c848", new Object[]{this})).longValue();
        }
        long j = this.b;
        if (j == 0) {
            return 0L;
        }
        Segment segment = this.f4819a.e;
        return segment.c < 2048 ? j - (segment.c - segment.b) : j;
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final byte readByte() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a5be931", new Object[]{this})).byteValue();
        }
        if (this.b == 0) {
            throw new IllegalStateException("size == 0");
        }
        Segment segment = this.f4819a;
        int i = segment.b;
        int i2 = segment.c;
        int i3 = i + 1;
        byte b = segment.f4836a[i];
        this.b--;
        if (i3 == i2) {
            this.f4819a = segment.pop();
            SegmentPool.f4837a.a(segment);
        } else {
            segment.b = i3;
        }
        return b;
    }

    public final byte getByte(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8255f84b", new Object[]{this, new Long(j)})).byteValue();
        }
        Util.checkOffsetAndCount(this.b, j, 1L);
        Segment segment = this.f4819a;
        while (true) {
            long j2 = segment.c - segment.b;
            if (j >= j2) {
                j -= j2;
                segment = segment.d;
            } else {
                return segment.f4836a[segment.b + ((int) j)];
            }
        }
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final short readShort() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("15459a0a", new Object[]{this})).shortValue();
        }
        if (this.b < 2) {
            throw new IllegalStateException("size < 2: " + this.b);
        }
        Segment segment = this.f4819a;
        int i = segment.b;
        int i2 = segment.c;
        if (i2 - i < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = segment.f4836a;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
        this.b -= 2;
        if (i4 == i2) {
            this.f4819a = segment.pop();
            SegmentPool.f4837a.a(segment);
        } else {
            segment.b = i4;
        }
        return (short) i5;
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final int readInt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4888f673", new Object[]{this})).intValue();
        }
        if (this.b < 4) {
            throw new IllegalStateException("size < 4: " + this.b);
        }
        Segment segment = this.f4819a;
        int i = segment.b;
        int i2 = segment.c;
        if (i2 - i < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = segment.f4836a;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
        int i6 = i4 + 1;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        int i8 = i6 + 1;
        int i9 = i7 | (bArr[i6] & 255);
        this.b -= 4;
        if (i8 == i2) {
            this.f4819a = segment.pop();
            SegmentPool.f4837a.a(segment);
        } else {
            segment.b = i8;
        }
        return i9;
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final long readLong() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2e0874ad", new Object[]{this})).longValue();
        }
        if (this.b < 8) {
            throw new IllegalStateException("size < 8: " + this.b);
        }
        Segment segment = this.f4819a;
        int i8 = segment.b;
        int i9 = segment.c;
        if (i9 - i8 < 8) {
            return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
        }
        byte[] bArr = segment.f4836a;
        int i10 = i8 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1;
        long j = (bArr[i7] & 255) | ((bArr[i8] & 255) << 56) | ((bArr[i] & 255) << 48) | ((bArr[i2] & 255) << 40) | ((bArr[i3] & 255) << 32) | ((bArr[i4] & 255) << 24) | ((bArr[i5] & 255) << 16) | ((bArr[i6] & 255) << 8);
        this.b -= 8;
        if (i10 == i9) {
            this.f4819a = segment.pop();
            SegmentPool.f4837a.a(segment);
        } else {
            segment.b = i10;
        }
        return j;
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final short readShortLe() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("10d5e5a3", new Object[]{this})).shortValue() : Util.reverseBytesShort(readShort());
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final int readIntLe() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("80b3f14c", new Object[]{this})).intValue() : Util.reverseBytesInt(readInt());
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final long readLongLe() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("44cc546", new Object[]{this})).longValue() : Util.reverseBytesLong(readLong());
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final ByteString readByteString() throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ByteString) ipChange.ipc$dispatch("626aa116", new Object[]{this}) : new ByteString(readByteArray());
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final ByteString readByteString(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ByteString) ipChange.ipc$dispatch("70b5b7e", new Object[]{this, new Long(j)}) : new ByteString(readByteArray(j));
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final void readFully(Buffer buffer, long j) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79b6d4da", new Object[]{this, buffer, new Long(j)});
        } else {
            buffer.write(this, j);
        }
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final long readAll(Sink sink) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ac2b92c2", new Object[]{this, sink})).longValue();
        }
        long size = size();
        sink.write(this, size);
        return size;
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final String readUtf8() throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a1b4db32", new Object[]{this}) : readString(this.b, Util.UTF_8);
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final String readUtf8(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("be074a0a", new Object[]{this, new Long(j)}) : readString(j, Util.UTF_8);
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final String readString(Charset charset) throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a1db4104", new Object[]{this, charset}) : readString(this.b, charset);
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final String readString(long j, Charset charset) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6da9ec1c", new Object[]{this, new Long(j), charset});
        }
        Util.checkOffsetAndCount(this.b, 0L, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j)));
        }
        if (j == 0) {
            return "";
        }
        Segment segment = this.f4819a;
        if (segment.b + j > segment.c) {
            return new String(readByteArray(j), charset);
        }
        String str = new String(segment.f4836a, segment.b, (int) j, charset);
        segment.b = (int) (segment.b + j);
        this.b -= j;
        if (segment.b == segment.c) {
            this.f4819a = segment.pop();
            SegmentPool.f4837a.a(segment);
        }
        return str;
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final String readUtf8Line() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4f2f071e", new Object[]{this});
        }
        long indexOf = indexOf((byte) 10);
        if (indexOf == -1) {
            long j = this.b;
            if (j == 0) {
                return null;
            }
            return readUtf8(j);
        }
        return a(indexOf);
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final String readUtf8LineStrict() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cbe26815", new Object[]{this});
        }
        long indexOf = indexOf((byte) 10);
        if (indexOf == -1) {
            throw new EOFException();
        }
        return a(indexOf);
    }

    public final String a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("780680c4", new Object[]{this, new Long(j)});
        }
        if (j > 0) {
            long j2 = j - 1;
            if (getByte(j2) == 13) {
                String readUtf8 = readUtf8(j2);
                skip(2L);
                return readUtf8;
            }
        }
        String readUtf82 = readUtf8(j);
        skip(1L);
        return readUtf82;
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final byte[] readByteArray() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("4b8264db", new Object[]{this}) : readByteArray(this.b);
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final byte[] readByteArray(long j) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("24d87e5b", new Object[]{this, new Long(j)});
        }
        Util.checkOffsetAndCount(this.b, 0L, j);
        if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j)));
        }
        byte[] bArr = new byte[(int) j];
        while (true) {
            long j2 = i;
            if (j2 < j) {
                int min = (int) Math.min(j - j2, this.f4819a.c - this.f4819a.b);
                System.arraycopy(this.f4819a.f4836a, this.f4819a.b, bArr, i, min);
                i += min;
                this.f4819a.b += min;
                if (this.f4819a.b == this.f4819a.c) {
                    Segment segment = this.f4819a;
                    this.f4819a = segment.pop();
                    SegmentPool.f4837a.a(segment);
                }
            } else {
                this.b -= j;
                return bArr;
            }
        }
    }

    public final int a(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb6ab7c2", new Object[]{this, bArr, new Integer(i), new Integer(i2)})).intValue();
        }
        Segment segment = this.f4819a;
        if (segment == null) {
            return -1;
        }
        int min = Math.min(i2, segment.c - segment.b);
        System.arraycopy(segment.f4836a, segment.b, bArr, i, min);
        segment.b += min;
        this.b -= min;
        if (segment.b == segment.c) {
            this.f4819a = segment.pop();
            SegmentPool.f4837a.a(segment);
        }
        return min;
    }

    public final void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else {
            skip(this.b);
        }
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final void skip(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a0434fe", new Object[]{this, new Long(j)});
            return;
        }
        Util.checkOffsetAndCount(this.b, 0L, j);
        this.b -= j;
        while (j > 0) {
            int min = (int) Math.min(j, this.f4819a.c - this.f4819a.b);
            j -= min;
            this.f4819a.b += min;
            if (this.f4819a.b == this.f4819a.c) {
                Segment segment = this.f4819a;
                this.f4819a = segment.pop();
                SegmentPool.f4837a.a(segment);
            }
        }
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSink
    /* renamed from: write */
    public final Buffer mo525write(ByteString byteString) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Buffer) ipChange.ipc$dispatch("312328c9", new Object[]{this, byteString});
        }
        if (byteString == null) {
            throw new IllegalArgumentException("byteString == null");
        }
        return mo527write(byteString.data, 0, byteString.data.length);
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSink
    /* renamed from: writeUtf8 */
    public final Buffer mo536writeUtf8(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Buffer) ipChange.ipc$dispatch("1c26f8c4", new Object[]{this, str});
        }
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        return mo535writeString(str, Util.UTF_8);
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSink
    /* renamed from: writeString */
    public final Buffer mo535writeString(String str, Charset charset) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Buffer) ipChange.ipc$dispatch("2bc2f796", new Object[]{this, str, charset});
        }
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        byte[] bytes = str.getBytes(charset);
        return mo527write(bytes, 0, bytes.length);
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSink
    /* renamed from: write */
    public final Buffer mo526write(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Buffer) ipChange.ipc$dispatch("ab93f298", new Object[]{this, bArr});
        }
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        return mo527write(bArr, 0, bArr.length);
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSink
    /* renamed from: write */
    public final Buffer mo527write(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Buffer) ipChange.ipc$dispatch("3fdb3d78", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
        }
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = i2;
        Util.checkOffsetAndCount(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            Segment a2 = a(1);
            int min = Math.min(i3 - i, 2048 - a2.c);
            System.arraycopy(bArr, i, a2.f4836a, a2.c, min);
            i += min;
            a2.c += min;
        }
        this.b += j;
        return this;
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSink
    public final long writeAll(Source source) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1d21f51", new Object[]{this, source})).longValue();
        }
        if (source == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = 0;
        while (true) {
            long read = source.read(this, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX);
            if (read == -1) {
                return j;
            }
            j += read;
        }
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSink
    /* renamed from: writeByte */
    public final Buffer mo528writeByte(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Buffer) ipChange.ipc$dispatch("cf1b1190", new Object[]{this, new Integer(i)});
        }
        Segment a2 = a(1);
        byte[] bArr = a2.f4836a;
        int i2 = a2.c;
        a2.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.b++;
        return this;
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSink
    /* renamed from: writeShort */
    public final Buffer mo533writeShort(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Buffer) ipChange.ipc$dispatch("eb7aba66", new Object[]{this, new Integer(i)});
        }
        Segment a2 = a(2);
        byte[] bArr = a2.f4836a;
        int i2 = a2.c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) (i >>> 8);
        bArr[i3] = (byte) i;
        a2.c = i3 + 1;
        this.b += 2;
        return this;
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSink
    /* renamed from: writeShortLe */
    public final Buffer mo534writeShortLe(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Buffer) ipChange.ipc$dispatch("2b16187f", new Object[]{this, new Integer(i)}) : mo533writeShort((int) Util.reverseBytesShort((short) i));
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSink
    /* renamed from: writeInt */
    public final Buffer mo529writeInt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Buffer) ipChange.ipc$dispatch("74de3f59", new Object[]{this, new Integer(i)});
        }
        Segment a2 = a(4);
        byte[] bArr = a2.f4836a;
        int i2 = a2.c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) (i >>> 24);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i >>> 16);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (i >>> 8);
        bArr[i5] = (byte) i;
        a2.c = i5 + 1;
        this.b += 4;
        return this;
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSink
    /* renamed from: writeIntLe */
    public final Buffer mo530writeIntLe(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Buffer) ipChange.ipc$dispatch("e9ac2cb2", new Object[]{this, new Integer(i)}) : mo529writeInt(Util.reverseBytesInt(i));
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSink
    /* renamed from: writeLong */
    public final Buffer mo531writeLong(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Buffer) ipChange.ipc$dispatch("fdb053e3", new Object[]{this, new Long(j)});
        }
        Segment a2 = a(8);
        byte[] bArr = a2.f4836a;
        int i = a2.c;
        int i2 = i + 1;
        bArr[i] = (byte) ((j >>> 56) & 255);
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((j >>> 48) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((j >>> 40) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((j >>> 32) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((j >>> 24) & 255);
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((j >>> 16) & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((j >>> 8) & 255);
        bArr[i8] = (byte) (j & 255);
        a2.c = i8 + 1;
        this.b += 8;
        return this;
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSink
    /* renamed from: writeLongLe */
    public final Buffer mo532writeLongLe(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Buffer) ipChange.ipc$dispatch("ce6c427c", new Object[]{this, new Long(j)}) : mo531writeLong(Util.reverseBytesLong(j));
    }

    public final Segment a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Segment) ipChange.ipc$dispatch("6dbd3759", new Object[]{this, new Integer(i)});
        }
        if (i <= 0 || i > 2048) {
            throw new IllegalArgumentException();
        }
        Segment segment = this.f4819a;
        if (segment == null) {
            this.f4819a = SegmentPool.f4837a.a();
            Segment segment2 = this.f4819a;
            segment2.e = segment2;
            segment2.d = segment2;
            return segment2;
        }
        Segment segment3 = segment.e;
        return segment3.c + i > 2048 ? segment3.push(SegmentPool.f4837a.a()) : segment3;
    }

    @Override // com.alipay.android.msp.framework.okio.Sink
    public final void write(Buffer buffer, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a312ef", new Object[]{this, buffer, new Long(j)});
        } else if (buffer == null) {
            throw new IllegalArgumentException("source == null");
        } else {
            if (buffer == this) {
                throw new IllegalArgumentException("source == this");
            }
            Util.checkOffsetAndCount(buffer.b, 0L, j);
            while (j > 0) {
                if (j < buffer.f4819a.c - buffer.f4819a.b) {
                    Segment segment = this.f4819a;
                    Segment segment2 = segment != null ? segment.e : null;
                    if (segment2 == null || (segment2.c - segment2.b) + j > ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX) {
                        buffer.f4819a = buffer.f4819a.split((int) j);
                    } else {
                        buffer.f4819a.writeTo(segment2, (int) j);
                        buffer.b -= j;
                        this.b += j;
                        return;
                    }
                }
                Segment segment3 = buffer.f4819a;
                long j2 = segment3.c - segment3.b;
                buffer.f4819a = segment3.pop();
                Segment segment4 = this.f4819a;
                if (segment4 == null) {
                    this.f4819a = segment3;
                    Segment segment5 = this.f4819a;
                    segment5.e = segment5;
                    segment5.d = segment5;
                } else {
                    segment4.e.push(segment3).compact();
                }
                buffer.b -= j2;
                this.b += j2;
                j -= j2;
            }
        }
    }

    @Override // com.alipay.android.msp.framework.okio.Source
    public final long read(Buffer buffer, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c4c0cbcc", new Object[]{this, buffer, new Long(j)})).longValue();
        }
        if (buffer == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        }
        long j2 = this.b;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        buffer.write(this, j);
        return j;
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final long indexOf(byte b) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c314a460", new Object[]{this, new Byte(b)})).longValue() : indexOf(b, 0L);
    }

    public final long indexOf(byte b, long j) {
        long j2 = j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9f805fcc", new Object[]{this, new Byte(b), new Long(j2)})).longValue();
        }
        if (j2 < 0) {
            throw new IllegalArgumentException("fromIndex < 0");
        }
        Segment segment = this.f4819a;
        if (segment == null) {
            return -1L;
        }
        long j3 = 0;
        while (true) {
            long j4 = segment.c - segment.b;
            if (j2 >= j4) {
                j2 -= j4;
            } else {
                byte[] bArr = segment.f4836a;
                long j5 = segment.c;
                for (long j6 = segment.b + j2; j6 < j5; j6++) {
                    if (bArr[(int) j6] == b) {
                        return (j3 + j6) - segment.b;
                    }
                }
                j2 = 0;
            }
            j3 += j4;
            segment = segment.d;
            if (segment == this.f4819a) {
                return -1L;
            }
        }
    }

    @Override // com.alipay.android.msp.framework.okio.Sink
    public final Timeout timeout() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Timeout) ipChange.ipc$dispatch("21cbd5f8", new Object[]{this}) : Timeout.NONE;
    }

    public final boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Buffer)) {
            return false;
        }
        Buffer buffer = (Buffer) obj;
        long j = this.b;
        if (j != buffer.b) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        Segment segment = this.f4819a;
        Segment segment2 = buffer.f4819a;
        int i = segment.b;
        int i2 = segment2.b;
        while (j2 < this.b) {
            long min = Math.min(segment.c - i, segment2.c - i2);
            int i3 = i2;
            int i4 = i;
            int i5 = 0;
            while (i5 < min) {
                int i6 = i4 + 1;
                int i7 = i3 + 1;
                if (segment.f4836a[i4] != segment2.f4836a[i3]) {
                    return false;
                }
                i5++;
                i4 = i6;
                i3 = i7;
            }
            if (i4 == segment.c) {
                segment = segment.d;
                i = segment.b;
            } else {
                i = i4;
            }
            if (i3 == segment2.c) {
                segment2 = segment2.d;
                i2 = segment2.b;
            } else {
                i2 = i3;
            }
            j2 += min;
        }
        return true;
    }

    public final int hashCode() {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        Segment segment = this.f4819a;
        if (segment == null) {
            return 0;
        }
        do {
            int i2 = segment.c;
            for (int i3 = segment.b; i3 < i2; i3++) {
                i = (i * 31) + segment.f4836a[i3];
            }
            segment = segment.d;
        } while (segment != this.f4819a);
        return i;
    }

    public final String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        long j = this.b;
        if (j == 0) {
            return "Buffer[size=0]";
        }
        if (j <= 16) {
            return String.format("Buffer[size=%s data=%s]", Long.valueOf(this.b), m523clone().readByteString(this.b).hex());
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(this.f4819a.f4836a, this.f4819a.b, this.f4819a.c - this.f4819a.b);
            Segment segment = this.f4819a;
            while (true) {
                segment = segment.d;
                if (segment != this.f4819a) {
                    messageDigest.update(segment.f4836a, segment.b, segment.c - segment.b);
                } else {
                    return String.format("Buffer[size=%s md5=%s]", Long.valueOf(this.b), ByteString.of(messageDigest.digest()).hex());
                }
            }
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    /* renamed from: clone */
    public final Buffer m523clone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Buffer) ipChange.ipc$dispatch("26307cc1", new Object[]{this});
        }
        Buffer buffer = new Buffer();
        if (this.b == 0) {
            return buffer;
        }
        buffer.mo527write(this.f4819a.f4836a, this.f4819a.b, this.f4819a.c - this.f4819a.b);
        Segment segment = this.f4819a;
        while (true) {
            segment = segment.d;
            if (segment == this.f4819a) {
                return buffer;
            }
            buffer.mo527write(segment.f4836a, segment.b, segment.c - segment.b);
        }
    }
}
