package com.alipay.android.phone.mobilesdk.socketcraft;

import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SocketChannel;

/* loaded from: classes3.dex */
public class AbstractWrappedByteChannel implements WrappedByteChannel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ByteChannel f5098a;

    public AbstractWrappedByteChannel(ByteChannel byteChannel) {
        this.f5098a = byteChannel;
    }

    public AbstractWrappedByteChannel(WrappedByteChannel wrappedByteChannel) {
        this.f5098a = wrappedByteChannel;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("52b3c647", new Object[]{this, byteBuffer})).intValue() : this.f5098a.read(byteBuffer);
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b2911d1f", new Object[]{this})).booleanValue() : this.f5098a.isOpen();
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else {
            this.f5098a.close();
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9193c1e", new Object[]{this, byteBuffer})).intValue() : this.f5098a.write(byteBuffer);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WrappedByteChannel
    public boolean isNeedWrite() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("551a0bea", new Object[]{this})).booleanValue();
        }
        ByteChannel byteChannel = this.f5098a;
        if (!(byteChannel instanceof WrappedByteChannel)) {
            return false;
        }
        return ((WrappedByteChannel) byteChannel).isNeedWrite();
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WrappedByteChannel
    public void writeMore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84d37a5b", new Object[]{this});
            return;
        }
        ByteChannel byteChannel = this.f5098a;
        if (!(byteChannel instanceof WrappedByteChannel)) {
            return;
        }
        ((WrappedByteChannel) byteChannel).writeMore();
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WrappedByteChannel
    public boolean isNeedRead() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("faf60c21", new Object[]{this})).booleanValue();
        }
        ByteChannel byteChannel = this.f5098a;
        if (!(byteChannel instanceof WrappedByteChannel)) {
            return false;
        }
        return ((WrappedByteChannel) byteChannel).isNeedRead();
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WrappedByteChannel
    public int readMore(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("874f4f72", new Object[]{this, byteBuffer})).intValue();
        }
        ByteChannel byteChannel = this.f5098a;
        if (!(byteChannel instanceof WrappedByteChannel)) {
            return 0;
        }
        return ((WrappedByteChannel) byteChannel).readMore(byteBuffer);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WrappedByteChannel
    public boolean isBlocking() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b66cc08a", new Object[]{this})).booleanValue();
        }
        ByteChannel byteChannel = this.f5098a;
        if (byteChannel instanceof SocketChannel) {
            return ((SocketChannel) byteChannel).isBlocking();
        }
        if (!(byteChannel instanceof WrappedByteChannel)) {
            return false;
        }
        return ((WrappedByteChannel) byteChannel).isBlocking();
    }
}
