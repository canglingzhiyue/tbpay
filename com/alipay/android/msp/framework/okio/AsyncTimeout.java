package com.alipay.android.msp.framework.okio;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.InterruptedIOException;
import tb.riy;

/* loaded from: classes3.dex */
public class AsyncTimeout extends Timeout {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static AsyncTimeout f4816a;
    private boolean b;
    private AsyncTimeout c;
    private long d;

    /* loaded from: classes3.dex */
    public static final class Watchdog extends Thread {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public Watchdog() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            while (true) {
                try {
                    AsyncTimeout b = AsyncTimeout.b();
                    if (b != null) {
                        b.a();
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        }
    }

    public static /* synthetic */ AsyncTimeout b() throws InterruptedException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AsyncTimeout) ipChange.ipc$dispatch("21d50137", new Object[0]) : c();
    }

    public final void enter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccc95f5f", new Object[]{this});
        } else if (this.b) {
            throw new IllegalStateException("Unbalanced enter/exit");
        } else {
            long timeoutNanos = timeoutNanos();
            boolean hasDeadline = hasDeadline();
            if (timeoutNanos == 0 && !hasDeadline) {
                return;
            }
            this.b = true;
            a(this, timeoutNanos, hasDeadline);
        }
    }

    private static synchronized void a(AsyncTimeout asyncTimeout, long j, boolean z) {
        synchronized (AsyncTimeout.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6f54fa22", new Object[]{asyncTimeout, new Long(j), new Boolean(z)});
                return;
            }
            if (f4816a == null) {
                f4816a = new AsyncTimeout();
                new Watchdog().start();
            }
            long nanoTime = System.nanoTime();
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i != 0 && z) {
                asyncTimeout.d = Math.min(j, asyncTimeout.deadlineNanoTime() - nanoTime) + nanoTime;
            } else if (i != 0) {
                asyncTimeout.d = j + nanoTime;
            } else if (z) {
                asyncTimeout.d = asyncTimeout.deadlineNanoTime();
            } else {
                throw new AssertionError();
            }
            long j2 = asyncTimeout.d - nanoTime;
            AsyncTimeout asyncTimeout2 = f4816a;
            while (asyncTimeout2.c != null && j2 >= asyncTimeout2.c.d - nanoTime) {
                asyncTimeout2 = asyncTimeout2.c;
            }
            asyncTimeout.c = asyncTimeout2.c;
            asyncTimeout2.c = asyncTimeout;
            if (asyncTimeout2 != f4816a) {
                return;
            }
            AsyncTimeout.class.notify();
        }
    }

    public final boolean exit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("81677ea9", new Object[]{this})).booleanValue();
        }
        if (!this.b) {
            return false;
        }
        this.b = false;
        return a(this);
    }

    private static synchronized boolean a(AsyncTimeout asyncTimeout) {
        synchronized (AsyncTimeout.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("68462216", new Object[]{asyncTimeout})).booleanValue();
            }
            for (AsyncTimeout asyncTimeout2 = f4816a; asyncTimeout2 != null; asyncTimeout2 = asyncTimeout2.c) {
                if (asyncTimeout2.c == asyncTimeout) {
                    asyncTimeout2.c = asyncTimeout.c;
                    asyncTimeout.c = null;
                    return false;
                }
            }
            return true;
        }
    }

    public final Sink sink(final Sink sink) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Sink) ipChange.ipc$dispatch("5991e93c", new Object[]{this, sink}) : new Sink() { // from class: com.alipay.android.msp.framework.okio.AsyncTimeout.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.android.msp.framework.okio.Sink
            public void write(Buffer buffer, long j) throws IOException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("66a312ef", new Object[]{this, buffer, new Long(j)});
                    return;
                }
                AsyncTimeout.this.enter();
                try {
                    try {
                        sink.write(buffer, j);
                        AsyncTimeout.this.a(true);
                    } catch (IOException e) {
                        throw AsyncTimeout.this.a(e);
                    }
                } catch (Throwable th) {
                    AsyncTimeout.this.a(false);
                    throw th;
                }
            }

            @Override // com.alipay.android.msp.framework.okio.Sink
            public void flush() throws IOException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dd889d8b", new Object[]{this});
                    return;
                }
                AsyncTimeout.this.enter();
                try {
                    try {
                        sink.flush();
                        AsyncTimeout.this.a(true);
                    } catch (IOException e) {
                        throw AsyncTimeout.this.a(e);
                    }
                } catch (Throwable th) {
                    AsyncTimeout.this.a(false);
                    throw th;
                }
            }

            @Override // com.alipay.android.msp.framework.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e32ba67f", new Object[]{this});
                    return;
                }
                AsyncTimeout.this.enter();
                try {
                    try {
                        sink.close();
                        AsyncTimeout.this.a(true);
                    } catch (IOException e) {
                        throw AsyncTimeout.this.a(e);
                    }
                } catch (Throwable th) {
                    AsyncTimeout.this.a(false);
                    throw th;
                }
            }

            @Override // com.alipay.android.msp.framework.okio.Sink
            public Timeout timeout() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (Timeout) ipChange2.ipc$dispatch("21cbd5f8", new Object[]{this}) : AsyncTimeout.this;
            }

            public String toString() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (String) ipChange2.ipc$dispatch("8126d80d", new Object[]{this});
                }
                return "AsyncTimeout.sink(" + sink + riy.BRACKET_END_STR;
            }
        };
    }

    public final Source source(final Source source) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Source) ipChange.ipc$dispatch("e4d1fef4", new Object[]{this, source}) : new Source() { // from class: com.alipay.android.msp.framework.okio.AsyncTimeout.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.android.msp.framework.okio.Source
            public long read(Buffer buffer, long j) throws IOException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("c4c0cbcc", new Object[]{this, buffer, new Long(j)})).longValue();
                }
                AsyncTimeout.this.enter();
                try {
                    try {
                        long read = source.read(buffer, j);
                        AsyncTimeout.this.a(true);
                        return read;
                    } catch (IOException e) {
                        throw AsyncTimeout.this.a(e);
                    }
                } catch (Throwable th) {
                    AsyncTimeout.this.a(false);
                    throw th;
                }
            }

            @Override // com.alipay.android.msp.framework.okio.Source, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e32ba67f", new Object[]{this});
                    return;
                }
                try {
                    try {
                        source.close();
                        AsyncTimeout.this.a(true);
                    } catch (IOException e) {
                        throw AsyncTimeout.this.a(e);
                    }
                } catch (Throwable th) {
                    AsyncTimeout.this.a(false);
                    throw th;
                }
            }

            @Override // com.alipay.android.msp.framework.okio.Source
            public Timeout timeout() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (Timeout) ipChange2.ipc$dispatch("21cbd5f8", new Object[]{this}) : AsyncTimeout.this;
            }

            public String toString() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (String) ipChange2.ipc$dispatch("8126d80d", new Object[]{this});
                }
                return "AsyncTimeout.source(" + source + riy.BRACKET_END_STR;
            }
        };
    }

    public final void a(boolean z) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (exit() && z) {
            throw new InterruptedIOException("timeout");
        }
    }

    public final IOException a(IOException iOException) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IOException) ipChange.ipc$dispatch("28a5ebb0", new Object[]{this, iOException});
        }
        if (!exit()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        interruptedIOException.initCause(iOException);
        return interruptedIOException;
    }

    private static synchronized AsyncTimeout c() throws InterruptedException {
        synchronized (AsyncTimeout.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AsyncTimeout) ipChange.ipc$dispatch("230b5416", new Object[0]);
            }
            AsyncTimeout asyncTimeout = f4816a.c;
            if (asyncTimeout == null) {
                AsyncTimeout.class.wait();
                return null;
            }
            long nanoTime = asyncTimeout.d - System.nanoTime();
            if (nanoTime > 0) {
                long j = nanoTime / 1000000;
                Long.signum(j);
                AsyncTimeout.class.wait(j, (int) (nanoTime - (1000000 * j)));
                return null;
            }
            f4816a.c = asyncTimeout.c;
            asyncTimeout.c = null;
            return asyncTimeout;
        }
    }
}
