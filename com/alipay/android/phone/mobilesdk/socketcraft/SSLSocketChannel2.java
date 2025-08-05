package com.alipay.android.phone.mobilesdk.socketcraft;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLSession;

/* loaded from: classes3.dex */
public class SSLSocketChannel2 implements WrappedByteChannel, ByteChannel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ExecutorService b;
    public List<Future<?>> c;
    public ByteBuffer d;
    public ByteBuffer e;
    public ByteBuffer f;
    public SocketChannel g;
    public SelectionKey h;
    public SSLEngine i;
    public SSLEngineResult j;
    public SSLEngineResult k;
    public int l = 0;
    public static final /* synthetic */ boolean m = !SSLSocketChannel2.class.desiredAssertionStatus();

    /* renamed from: a  reason: collision with root package name */
    public static ByteBuffer f5099a = ByteBuffer.allocate(0);

    public SSLSocketChannel2(SocketChannel socketChannel, SSLEngine sSLEngine, ExecutorService executorService, SelectionKey selectionKey) {
        if (socketChannel == null || sSLEngine == null || executorService == null) {
            throw new IllegalArgumentException("parameter must not be null");
        }
        this.g = socketChannel;
        this.i = sSLEngine;
        this.b = executorService;
        SSLEngineResult sSLEngineResult = new SSLEngineResult(SSLEngineResult.Status.BUFFER_UNDERFLOW, sSLEngine.getHandshakeStatus(), 0, 0);
        this.k = sSLEngineResult;
        this.j = sSLEngineResult;
        this.c = new ArrayList(3);
        if (selectionKey != null) {
            selectionKey.interestOps(selectionKey.interestOps() | 4);
            this.h = selectionKey;
        }
        a(sSLEngine.getSession());
        this.g.write(a(f5099a));
        b();
    }

    private void a(Future<?> future) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6f9effe", new Object[]{this, future});
            return;
        }
        while (true) {
            try {
                try {
                    future.get();
                    break;
                } catch (ExecutionException e) {
                    throw new RuntimeException(e);
                }
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (!z) {
            return;
        }
        Thread.currentThread().interrupt();
    }

    private synchronized void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.i.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING) {
        } else {
            if (!this.c.isEmpty()) {
                Iterator<Future<?>> it = this.c.iterator();
                while (it.hasNext()) {
                    Future<?> next = it.next();
                    if (next.isDone()) {
                        it.remove();
                    } else {
                        if (isBlocking()) {
                            a(next);
                        }
                        return;
                    }
                }
            }
            if (this.i.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NEED_UNWRAP) {
                if (!isBlocking() || this.j.getStatus() == SSLEngineResult.Status.BUFFER_UNDERFLOW) {
                    this.f.compact();
                    if (this.g.read(this.f) == -1) {
                        throw new IOException("connection closed unexpectedly by peer");
                    }
                    this.f.flip();
                }
                this.d.compact();
                c();
                if (this.j.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.FINISHED) {
                    a(this.i.getSession());
                    return;
                }
            }
            a();
            if (this.c.isEmpty() || this.i.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NEED_WRAP) {
                this.g.write(a(f5099a));
                if (this.k.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.FINISHED) {
                    a(this.i.getSession());
                    return;
                }
            }
            if (!m && this.i.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING) {
                throw new AssertionError();
            }
            this.l = 1;
        }
    }

    private synchronized ByteBuffer a(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("9b5aa8aa", new Object[]{this, byteBuffer});
        }
        this.e.compact();
        this.k = this.i.wrap(byteBuffer, this.e);
        this.e.flip();
        return this.e;
    }

    private synchronized ByteBuffer c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("3d7fafab", new Object[]{this});
        }
        while (true) {
            int remaining = this.d.remaining();
            this.j = this.i.unwrap(this.f, this.d);
            if (this.j.getStatus() != SSLEngineResult.Status.OK || (remaining == this.d.remaining() && this.i.getHandshakeStatus() != SSLEngineResult.HandshakeStatus.NEED_UNWRAP)) {
                break;
            }
        }
        this.d.flip();
        return this.d;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        while (true) {
            Runnable delegatedTask = this.i.getDelegatedTask();
            if (delegatedTask == null) {
                return;
            }
            this.c.add(this.b.submit(delegatedTask));
        }
    }

    public void a(SSLSession sSLSession) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37dbd99f", new Object[]{this, sSLSession});
            return;
        }
        int packetBufferSize = sSLSession.getPacketBufferSize();
        int max = Math.max(sSLSession.getApplicationBufferSize(), packetBufferSize);
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer == null) {
            this.d = ByteBuffer.allocate(max);
            this.e = ByteBuffer.allocate(packetBufferSize);
            this.f = ByteBuffer.allocate(packetBufferSize);
        } else {
            if (byteBuffer.capacity() != max) {
                this.d = ByteBuffer.allocate(max);
            }
            if (this.e.capacity() != packetBufferSize) {
                this.e = ByteBuffer.allocate(packetBufferSize);
            }
            if (this.f.capacity() != packetBufferSize) {
                this.f = ByteBuffer.allocate(packetBufferSize);
            }
        }
        this.d.rewind();
        this.d.flip();
        this.f.rewind();
        this.f.flip();
        this.e.rewind();
        this.e.flip();
        this.l++;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9193c1e", new Object[]{this, byteBuffer})).intValue();
        }
        if (!d()) {
            b();
            return 0;
        }
        int write = this.g.write(a(byteBuffer));
        if (this.k.getStatus() == SSLEngineResult.Status.CLOSED) {
            throw new EOFException("Connection is closed");
        }
        return write;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("52b3c647", new Object[]{this, byteBuffer})).intValue();
        }
        if (!byteBuffer.hasRemaining()) {
            return 0;
        }
        if (!d()) {
            if (isBlocking()) {
                while (!d()) {
                    b();
                }
            } else {
                b();
                if (!d()) {
                    return 0;
                }
            }
        }
        int b = b(byteBuffer);
        if (b != 0) {
            return b;
        }
        if (!m && this.d.position() != 0) {
            throw new AssertionError();
        }
        this.d.clear();
        if (!this.f.hasRemaining()) {
            this.f.clear();
        } else {
            this.f.compact();
        }
        if ((isBlocking() || this.j.getStatus() == SSLEngineResult.Status.BUFFER_UNDERFLOW) && this.g.read(this.f) == -1) {
            return -1;
        }
        this.f.flip();
        c();
        int a2 = a(this.d, byteBuffer);
        return (a2 != 0 || !isBlocking()) ? a2 : read(byteBuffer);
    }

    private int b(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2f3e1cfb", new Object[]{this, byteBuffer})).intValue();
        }
        if (this.d.hasRemaining()) {
            return a(this.d, byteBuffer);
        }
        if (!this.d.hasRemaining()) {
            this.d.clear();
        }
        if (this.f.hasRemaining()) {
            c();
            int a2 = a(this.d, byteBuffer);
            if (this.j.getStatus() == SSLEngineResult.Status.CLOSED) {
                return -1;
            }
            if (a2 > 0) {
                return a2;
            }
        }
        return 0;
    }

    public boolean isConnected() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b1c220a", new Object[]{this})).booleanValue() : this.g.isConnected();
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            return;
        }
        this.i.closeOutbound();
        this.i.getSession().invalidate();
        if (this.g.isOpen()) {
            this.g.write(a(f5099a));
        }
        this.g.close();
        this.b.shutdownNow();
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        SSLEngineResult.HandshakeStatus handshakeStatus = this.i.getHandshakeStatus();
        return handshakeStatus == SSLEngineResult.HandshakeStatus.FINISHED || handshakeStatus == SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
    }

    public SelectableChannel configureBlocking(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SelectableChannel) ipChange.ipc$dispatch("c3d6ec2d", new Object[]{this, new Boolean(z)}) : this.g.configureBlocking(z);
    }

    public boolean connect(SocketAddress socketAddress) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8a456aa2", new Object[]{this, socketAddress})).booleanValue() : this.g.connect(socketAddress);
    }

    public boolean finishConnect() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f7e209e2", new Object[]{this})).booleanValue() : this.g.finishConnect();
    }

    public Socket socket() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Socket) ipChange.ipc$dispatch("72cb1699", new Object[]{this}) : this.g.socket();
    }

    public boolean isInboundDone() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f30cff1c", new Object[]{this})).booleanValue() : this.i.isInboundDone();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b2911d1f", new Object[]{this})).booleanValue() : this.g.isOpen();
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WrappedByteChannel
    public boolean isNeedWrite() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("551a0bea", new Object[]{this})).booleanValue() : this.e.hasRemaining() || !d();
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WrappedByteChannel
    public void writeMore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84d37a5b", new Object[]{this});
        } else {
            write(this.e);
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WrappedByteChannel
    public boolean isNeedRead() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("faf60c21", new Object[]{this})).booleanValue() : this.d.hasRemaining() || !(!this.f.hasRemaining() || this.j.getStatus() == SSLEngineResult.Status.BUFFER_UNDERFLOW || this.j.getStatus() == SSLEngineResult.Status.CLOSED);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WrappedByteChannel
    public int readMore(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("874f4f72", new Object[]{this, byteBuffer})).intValue() : b(byteBuffer);
    }

    private int a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8e9b96fb", new Object[]{this, byteBuffer, byteBuffer2})).intValue();
        }
        int remaining = byteBuffer.remaining();
        int remaining2 = byteBuffer2.remaining();
        if (remaining > remaining2) {
            int min = Math.min(remaining, remaining2);
            for (int i = 0; i < min; i++) {
                byteBuffer2.put(byteBuffer.get());
            }
            return min;
        }
        byteBuffer2.put(byteBuffer);
        return remaining;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WrappedByteChannel
    public boolean isBlocking() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b66cc08a", new Object[]{this})).booleanValue() : this.g.isBlocking();
    }
}
