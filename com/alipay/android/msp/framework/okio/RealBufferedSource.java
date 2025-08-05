package com.alipay.android.msp.framework.okio;

import com.alipay.mobile.intelligentdecision.model.IDecisionResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import tb.riy;

/* loaded from: classes3.dex */
public final class RealBufferedSource implements BufferedSource {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f4834a;
    public final Buffer buffer;
    public final Source source;

    public static /* synthetic */ boolean a(RealBufferedSource realBufferedSource) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b7869223", new Object[]{realBufferedSource})).booleanValue() : realBufferedSource.f4834a;
    }

    public RealBufferedSource(Source source, Buffer buffer) {
        if (source == null) {
            throw new IllegalArgumentException("source == null");
        }
        this.buffer = buffer;
        this.source = source;
    }

    public RealBufferedSource(Source source) {
        this(source, new Buffer());
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final Buffer buffer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Buffer) ipChange.ipc$dispatch("c823d43e", new Object[]{this}) : this.buffer;
    }

    @Override // com.alipay.android.msp.framework.okio.Source
    public final long read(Buffer buffer, long j) throws IOException {
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
        if (this.f4834a) {
            throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
        }
        if (this.buffer.b != 0 || this.source.read(this.buffer, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX) != -1) {
            return this.buffer.read(buffer, Math.min(j, this.buffer.b));
        }
        return -1L;
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final boolean exhausted() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9647754", new Object[]{this})).booleanValue();
        }
        if (this.f4834a) {
            throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
        }
        return this.buffer.exhausted() && this.source.read(this.buffer, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX) == -1;
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final void require(long j) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bde98d8", new Object[]{this, new Long(j)});
        } else if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        } else {
            if (this.f4834a) {
                throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
            }
            while (this.buffer.b < j) {
                if (this.source.read(this.buffer, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX) == -1) {
                    throw new EOFException();
                }
            }
        }
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final byte readByte() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a5be931", new Object[]{this})).byteValue();
        }
        require(1L);
        return this.buffer.readByte();
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final ByteString readByteString() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteString) ipChange.ipc$dispatch("626aa116", new Object[]{this});
        }
        this.buffer.writeAll(this.source);
        return this.buffer.readByteString();
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final ByteString readByteString(long j) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteString) ipChange.ipc$dispatch("70b5b7e", new Object[]{this, new Long(j)});
        }
        require(j);
        return this.buffer.readByteString(j);
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final byte[] readByteArray() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("4b8264db", new Object[]{this});
        }
        this.buffer.writeAll(this.source);
        return this.buffer.readByteArray();
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final byte[] readByteArray(long j) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("24d87e5b", new Object[]{this, new Long(j)});
        }
        require(j);
        return this.buffer.readByteArray(j);
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final void readFully(Buffer buffer, long j) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79b6d4da", new Object[]{this, buffer, new Long(j)});
            return;
        }
        require(j);
        this.buffer.readFully(buffer, j);
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final long readAll(Sink sink) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ac2b92c2", new Object[]{this, sink})).longValue();
        }
        if (sink == null) {
            throw new IllegalArgumentException("sink == null");
        }
        long j = 0;
        while (this.source.read(this.buffer, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX) != -1) {
            long completeSegmentByteCount = this.buffer.completeSegmentByteCount();
            if (completeSegmentByteCount > 0) {
                j += completeSegmentByteCount;
                sink.write(this.buffer, completeSegmentByteCount);
            }
        }
        if (this.buffer.size() <= 0) {
            return j;
        }
        long size = j + this.buffer.size();
        Buffer buffer = this.buffer;
        sink.write(buffer, buffer.size());
        return size;
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final String readUtf8() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a1b4db32", new Object[]{this});
        }
        this.buffer.writeAll(this.source);
        return this.buffer.readUtf8();
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final String readUtf8(long j) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("be074a0a", new Object[]{this, new Long(j)});
        }
        require(j);
        return this.buffer.readUtf8(j);
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final String readString(Charset charset) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a1db4104", new Object[]{this, charset});
        }
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        this.buffer.writeAll(this.source);
        return this.buffer.readString(charset);
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final String readString(long j, Charset charset) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6da9ec1c", new Object[]{this, new Long(j), charset});
        }
        require(j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        return this.buffer.readString(j, charset);
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final String readUtf8Line() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4f2f071e", new Object[]{this});
        }
        long indexOf = indexOf((byte) 10);
        if (indexOf == -1) {
            if (this.buffer.b == 0) {
                return null;
            }
            return readUtf8(this.buffer.b);
        }
        return this.buffer.a(indexOf);
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
        return this.buffer.a(indexOf);
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final short readShort() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("15459a0a", new Object[]{this})).shortValue();
        }
        require(2L);
        return this.buffer.readShort();
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final short readShortLe() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("10d5e5a3", new Object[]{this})).shortValue();
        }
        require(2L);
        return this.buffer.readShortLe();
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final int readInt() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4888f673", new Object[]{this})).intValue();
        }
        require(4L);
        return this.buffer.readInt();
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final int readIntLe() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("80b3f14c", new Object[]{this})).intValue();
        }
        require(4L);
        return this.buffer.readIntLe();
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final long readLong() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2e0874ad", new Object[]{this})).longValue();
        }
        require(8L);
        return this.buffer.readLong();
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final long readLongLe() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("44cc546", new Object[]{this})).longValue();
        }
        require(8L);
        return this.buffer.readLongLe();
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final void skip(long j) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a0434fe", new Object[]{this, new Long(j)});
        } else if (this.f4834a) {
            throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
        } else {
            while (j > 0) {
                if (this.buffer.b == 0 && this.source.read(this.buffer, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.buffer.size());
                this.buffer.skip(min);
                j -= min;
            }
        }
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final long indexOf(byte b) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c314a460", new Object[]{this, new Byte(b)})).longValue();
        }
        if (this.f4834a) {
            throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
        }
        long j = 0;
        do {
            long indexOf = this.buffer.indexOf(b, j);
            if (indexOf != -1) {
                return indexOf;
            }
            j = this.buffer.b;
        } while (this.source.read(this.buffer, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX) != -1);
        return -1L;
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final InputStream inputStream() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InputStream) ipChange.ipc$dispatch("fc12abf4", new Object[]{this}) : new InputStream() { // from class: com.alipay.android.msp.framework.okio.RealBufferedSource.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.io.InputStream
            public int read() throws IOException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("cc382310", new Object[]{this})).intValue();
                }
                if (RealBufferedSource.a(RealBufferedSource.this)) {
                    throw new IOException(IDecisionResult.STATE_CLOSED);
                }
                if (RealBufferedSource.this.buffer.b != 0 || RealBufferedSource.this.source.read(RealBufferedSource.this.buffer, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX) != -1) {
                    return RealBufferedSource.this.buffer.readByte() & 255;
                }
                return -1;
            }

            @Override // java.io.InputStream
            public int read(byte[] bArr, int i, int i2) throws IOException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("33620bf7", new Object[]{this, bArr, new Integer(i), new Integer(i2)})).intValue();
                }
                if (RealBufferedSource.a(RealBufferedSource.this)) {
                    throw new IOException(IDecisionResult.STATE_CLOSED);
                }
                Util.checkOffsetAndCount(bArr.length, i, i2);
                if (RealBufferedSource.this.buffer.b != 0 || RealBufferedSource.this.source.read(RealBufferedSource.this.buffer, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX) != -1) {
                    return RealBufferedSource.this.buffer.a(bArr, i, i2);
                }
                return -1;
            }

            @Override // java.io.InputStream
            public int available() throws IOException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("6f9282c3", new Object[]{this})).intValue();
                }
                if (RealBufferedSource.a(RealBufferedSource.this)) {
                    throw new IOException(IDecisionResult.STATE_CLOSED);
                }
                return (int) Math.min(RealBufferedSource.this.buffer.b, 2147483647L);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e32ba67f", new Object[]{this});
                } else {
                    RealBufferedSource.this.close();
                }
            }

            public String toString() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (String) ipChange2.ipc$dispatch("8126d80d", new Object[]{this});
                }
                return RealBufferedSource.this + ".inputStream()";
            }
        };
    }

    @Override // com.alipay.android.msp.framework.okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else if (this.f4834a) {
        } else {
            this.f4834a = true;
            this.source.close();
            this.buffer.clear();
        }
    }

    @Override // com.alipay.android.msp.framework.okio.Source
    public final Timeout timeout() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Timeout) ipChange.ipc$dispatch("21cbd5f8", new Object[]{this}) : this.source.timeout();
    }

    public final String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "buffer(" + this.source + riy.BRACKET_END_STR;
    }
}
