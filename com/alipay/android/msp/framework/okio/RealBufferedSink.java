package com.alipay.android.msp.framework.okio;

import com.alipay.mobile.intelligentdecision.model.IDecisionResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import tb.riy;

/* loaded from: classes3.dex */
public final class RealBufferedSink implements BufferedSink {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f4832a;
    public final Buffer buffer;
    public final Sink sink;

    public static /* synthetic */ boolean a(RealBufferedSink realBufferedSink) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5064152b", new Object[]{realBufferedSink})).booleanValue() : realBufferedSink.f4832a;
    }

    public RealBufferedSink(Sink sink, Buffer buffer) {
        if (sink == null) {
            throw new IllegalArgumentException("sink == null");
        }
        this.buffer = buffer;
        this.sink = sink;
    }

    public RealBufferedSink(Sink sink) {
        this(sink, new Buffer());
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSink, com.alipay.android.msp.framework.okio.BufferedSource
    public final Buffer buffer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Buffer) ipChange.ipc$dispatch("c823d43e", new Object[]{this}) : this.buffer;
    }

    @Override // com.alipay.android.msp.framework.okio.Sink
    public final void write(Buffer buffer, long j) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a312ef", new Object[]{this, buffer, new Long(j)});
        } else if (this.f4832a) {
            throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
        } else {
            this.buffer.write(buffer, j);
            mo524emitCompleteSegments();
        }
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSink
    /* renamed from: write */
    public final BufferedSink mo525write(ByteString byteString) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BufferedSink) ipChange.ipc$dispatch("6a1708b7", new Object[]{this, byteString});
        }
        if (this.f4832a) {
            throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
        }
        this.buffer.mo525write(byteString);
        return mo524emitCompleteSegments();
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSink
    /* renamed from: writeUtf8 */
    public final BufferedSink mo536writeUtf8(String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BufferedSink) ipChange.ipc$dispatch("ce7fb072", new Object[]{this, str});
        }
        if (this.f4832a) {
            throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
        }
        this.buffer.mo536writeUtf8(str);
        return mo524emitCompleteSegments();
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSink
    /* renamed from: writeString */
    public final BufferedSink mo535writeString(String str, Charset charset) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BufferedSink) ipChange.ipc$dispatch("5181c9c4", new Object[]{this, str, charset});
        }
        if (this.f4832a) {
            throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
        }
        this.buffer.mo535writeString(str, charset);
        return mo524emitCompleteSegments();
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSink
    /* renamed from: write */
    public final BufferedSink mo526write(byte[] bArr) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BufferedSink) ipChange.ipc$dispatch("db36fb46", new Object[]{this, bArr});
        }
        if (this.f4832a) {
            throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
        }
        this.buffer.mo526write(bArr);
        return mo524emitCompleteSegments();
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSink
    /* renamed from: write */
    public final BufferedSink mo527write(byte[] bArr, int i, int i2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BufferedSink) ipChange.ipc$dispatch("b4d29e26", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
        }
        if (this.f4832a) {
            throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
        }
        this.buffer.mo527write(bArr, i, i2);
        return mo524emitCompleteSegments();
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
            long read = source.read(this.buffer, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX);
            if (read == -1) {
                return j;
            }
            j += read;
            mo524emitCompleteSegments();
        }
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSink
    /* renamed from: writeByte */
    public final BufferedSink mo528writeByte(int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BufferedSink) ipChange.ipc$dispatch("3779003e", new Object[]{this, new Integer(i)});
        }
        if (this.f4832a) {
            throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
        }
        this.buffer.mo528writeByte(i);
        return mo524emitCompleteSegments();
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSink
    /* renamed from: writeShort */
    public final BufferedSink mo533writeShort(int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BufferedSink) ipChange.ipc$dispatch("9ff03094", new Object[]{this, new Integer(i)});
        }
        if (this.f4832a) {
            throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
        }
        this.buffer.mo533writeShort(i);
        return mo524emitCompleteSegments();
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSink
    /* renamed from: writeShortLe */
    public final BufferedSink mo534writeShortLe(int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BufferedSink) ipChange.ipc$dispatch("3388d7ed", new Object[]{this, new Integer(i)});
        }
        if (this.f4832a) {
            throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
        }
        this.buffer.mo534writeShortLe(i);
        return mo524emitCompleteSegments();
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSink
    /* renamed from: writeInt */
    public final BufferedSink mo529writeInt(int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BufferedSink) ipChange.ipc$dispatch("402af347", new Object[]{this, new Integer(i)});
        }
        if (this.f4832a) {
            throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
        }
        this.buffer.mo529writeInt(i);
        return mo524emitCompleteSegments();
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSink
    /* renamed from: writeIntLe */
    public final BufferedSink mo530writeIntLe(int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BufferedSink) ipChange.ipc$dispatch("b01db9e0", new Object[]{this, new Integer(i)});
        }
        if (this.f4832a) {
            throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
        }
        this.buffer.mo530writeIntLe(i);
        return mo524emitCompleteSegments();
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSink
    /* renamed from: writeLong */
    public final BufferedSink mo531writeLong(long j) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BufferedSink) ipChange.ipc$dispatch("e439f851", new Object[]{this, new Long(j)});
        }
        if (this.f4832a) {
            throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
        }
        this.buffer.mo531writeLong(j);
        return mo524emitCompleteSegments();
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSink
    /* renamed from: writeLongLe */
    public final BufferedSink mo532writeLongLe(long j) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BufferedSink) ipChange.ipc$dispatch("a564d02a", new Object[]{this, new Long(j)});
        }
        if (this.f4832a) {
            throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
        }
        this.buffer.mo532writeLongLe(j);
        return mo524emitCompleteSegments();
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSink
    /* renamed from: emitCompleteSegments */
    public final BufferedSink mo524emitCompleteSegments() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BufferedSink) ipChange.ipc$dispatch("7e5ac940", new Object[]{this});
        }
        if (this.f4832a) {
            throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
        }
        long completeSegmentByteCount = this.buffer.completeSegmentByteCount();
        if (completeSegmentByteCount > 0) {
            this.sink.write(this.buffer, completeSegmentByteCount);
        }
        return this;
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSink
    public final OutputStream outputStream() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OutputStream) ipChange.ipc$dispatch("6de40e60", new Object[]{this}) : new OutputStream() { // from class: com.alipay.android.msp.framework.okio.RealBufferedSink.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.io.OutputStream
            public void write(int i) throws IOException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d7403add", new Object[]{this, new Integer(i)});
                } else if (RealBufferedSink.a(RealBufferedSink.this)) {
                    throw new IOException(IDecisionResult.STATE_CLOSED);
                } else {
                    RealBufferedSink.this.buffer.mo528writeByte((int) ((byte) i));
                    RealBufferedSink.this.mo524emitCompleteSegments();
                }
            }

            @Override // java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) throws IOException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1b94b14d", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
                } else if (RealBufferedSink.a(RealBufferedSink.this)) {
                    throw new IOException(IDecisionResult.STATE_CLOSED);
                } else {
                    RealBufferedSink.this.buffer.mo527write(bArr, i, i2);
                    RealBufferedSink.this.mo524emitCompleteSegments();
                }
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() throws IOException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dd889d8b", new Object[]{this});
                } else if (RealBufferedSink.a(RealBufferedSink.this)) {
                } else {
                    RealBufferedSink.this.flush();
                }
            }

            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e32ba67f", new Object[]{this});
                } else {
                    RealBufferedSink.this.close();
                }
            }

            public String toString() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (String) ipChange2.ipc$dispatch("8126d80d", new Object[]{this});
                }
                return RealBufferedSink.this + ".outputStream()";
            }
        };
    }

    @Override // com.alipay.android.msp.framework.okio.Sink
    public final void flush() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd889d8b", new Object[]{this});
        } else if (this.f4832a) {
            throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
        } else {
            if (this.buffer.b > 0) {
                Sink sink = this.sink;
                Buffer buffer = this.buffer;
                sink.write(buffer, buffer.b);
            }
            this.sink.flush();
        }
    }

    @Override // com.alipay.android.msp.framework.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else if (this.f4832a) {
        } else {
            Throwable th = null;
            try {
                if (this.buffer.b > 0) {
                    this.sink.write(this.buffer, this.buffer.b);
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.sink.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f4832a = true;
            if (th == null) {
                return;
            }
            Util.sneakyRethrow(th);
        }
    }

    @Override // com.alipay.android.msp.framework.okio.Sink
    public final Timeout timeout() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Timeout) ipChange.ipc$dispatch("21cbd5f8", new Object[]{this}) : this.sink.timeout();
    }

    public final String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "buffer(" + this.sink + riy.BRACKET_END_STR;
    }
}
