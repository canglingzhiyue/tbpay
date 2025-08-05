package com.alipay.android.msp.framework.okio;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import tb.riy;

/* loaded from: classes3.dex */
public final class Okio {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f4828a = Logger.getLogger(Okio.class.getName());

    public static /* synthetic */ Logger a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Logger) ipChange.ipc$dispatch("fe6000fd", new Object[0]) : f4828a;
    }

    private Okio() {
    }

    public static BufferedSource buffer(Source source) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BufferedSource) ipChange.ipc$dispatch("7463550", new Object[]{source});
        }
        if (source == null) {
            throw new IllegalArgumentException("source == null");
        }
        return new RealBufferedSource(source);
    }

    public static BufferedSink buffer(Sink sink) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BufferedSink) ipChange.ipc$dispatch("e9c7d2d0", new Object[]{sink});
        }
        if (sink == null) {
            throw new IllegalArgumentException("sink == null");
        }
        return new RealBufferedSink(sink);
    }

    public static Sink sink(OutputStream outputStream) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Sink) ipChange.ipc$dispatch("c472b8a6", new Object[]{outputStream}) : a(outputStream, new Timeout());
    }

    private static Sink a(final OutputStream outputStream, final Timeout timeout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Sink) ipChange.ipc$dispatch("a4d9beec", new Object[]{outputStream, timeout});
        }
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        if (timeout == null) {
            throw new IllegalArgumentException("timeout == null");
        }
        return new Sink() { // from class: com.alipay.android.msp.framework.okio.Okio.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.android.msp.framework.okio.Sink
            public void write(Buffer buffer, long j) throws IOException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("66a312ef", new Object[]{this, buffer, new Long(j)});
                    return;
                }
                Util.checkOffsetAndCount(buffer.b, 0L, j);
                while (j > 0) {
                    Timeout.this.throwIfReached();
                    Segment segment = buffer.f4819a;
                    int min = (int) Math.min(j, segment.c - segment.b);
                    outputStream.write(segment.f4836a, segment.b, min);
                    segment.b += min;
                    long j2 = min;
                    j -= j2;
                    buffer.b -= j2;
                    if (segment.b == segment.c) {
                        buffer.f4819a = segment.pop();
                        SegmentPool.f4837a.a(segment);
                    }
                }
            }

            @Override // com.alipay.android.msp.framework.okio.Sink
            public void flush() throws IOException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dd889d8b", new Object[]{this});
                } else {
                    outputStream.flush();
                }
            }

            @Override // com.alipay.android.msp.framework.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e32ba67f", new Object[]{this});
                } else {
                    outputStream.close();
                }
            }

            @Override // com.alipay.android.msp.framework.okio.Sink
            public Timeout timeout() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (Timeout) ipChange2.ipc$dispatch("21cbd5f8", new Object[]{this}) : Timeout.this;
            }

            public String toString() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (String) ipChange2.ipc$dispatch("8126d80d", new Object[]{this});
                }
                return "sink(" + outputStream + riy.BRACKET_END_STR;
            }
        };
    }

    public static Sink sink(Socket socket) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Sink) ipChange.ipc$dispatch("ec8dd53d", new Object[]{socket});
        }
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        AsyncTimeout a2 = a(socket);
        return a2.sink(a(socket.getOutputStream(), a2));
    }

    public static Source source(InputStream inputStream) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Source) ipChange.ipc$dispatch("a1203c19", new Object[]{inputStream}) : a(inputStream, new Timeout());
    }

    private static Source a(final InputStream inputStream, final Timeout timeout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Source) ipChange.ipc$dispatch("4fdcc4b5", new Object[]{inputStream, timeout});
        }
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        if (timeout == null) {
            throw new IllegalArgumentException("timeout == null");
        }
        return new Source() { // from class: com.alipay.android.msp.framework.okio.Okio.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.android.msp.framework.okio.Source
            public long read(Buffer buffer, long j) throws IOException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("c4c0cbcc", new Object[]{this, buffer, new Long(j)})).longValue();
                }
                if (j < 0) {
                    throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
                }
                Timeout.this.throwIfReached();
                Segment a2 = buffer.a(1);
                int read = inputStream.read(a2.f4836a, a2.c, (int) Math.min(j, 2048 - a2.c));
                if (read == -1) {
                    return -1L;
                }
                a2.c += read;
                long j2 = read;
                buffer.b += j2;
                return j2;
            }

            @Override // com.alipay.android.msp.framework.okio.Source, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e32ba67f", new Object[]{this});
                } else {
                    inputStream.close();
                }
            }

            @Override // com.alipay.android.msp.framework.okio.Source
            public Timeout timeout() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (Timeout) ipChange2.ipc$dispatch("21cbd5f8", new Object[]{this}) : Timeout.this;
            }

            public String toString() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (String) ipChange2.ipc$dispatch("8126d80d", new Object[]{this});
                }
                return "source(" + inputStream + riy.BRACKET_END_STR;
            }
        };
    }

    public static Source source(File file) throws FileNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Source) ipChange.ipc$dispatch("b05304b1", new Object[]{file});
        }
        if (file == null) {
            throw new IllegalArgumentException("file == null");
        }
        return source(new FileInputStream(file));
    }

    public static Sink sink(File file) throws FileNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Sink) ipChange.ipc$dispatch("50c99201", new Object[]{file});
        }
        if (file == null) {
            throw new IllegalArgumentException("file == null");
        }
        return sink(new FileOutputStream(file));
    }

    public static Sink appendingSink(File file) throws FileNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Sink) ipChange.ipc$dispatch("576fe859", new Object[]{file});
        }
        if (file == null) {
            throw new IllegalArgumentException("file == null");
        }
        return sink(new FileOutputStream(file, true));
    }

    public static Source source(Socket socket) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Source) ipChange.ipc$dispatch("20ef0afd", new Object[]{socket});
        }
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        AsyncTimeout a2 = a(socket);
        return a2.source(a(socket.getInputStream(), a2));
    }

    private static AsyncTimeout a(final Socket socket) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AsyncTimeout) ipChange.ipc$dispatch("cb8c6999", new Object[]{socket}) : new AsyncTimeout() { // from class: com.alipay.android.msp.framework.okio.Okio.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.android.msp.framework.okio.AsyncTimeout
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                try {
                    socket.close();
                } catch (Exception e) {
                    Logger a2 = Okio.a();
                    Level level = Level.WARNING;
                    a2.log(level, "Failed to close timed out socket " + socket, (Throwable) e);
                }
            }
        };
    }
}
