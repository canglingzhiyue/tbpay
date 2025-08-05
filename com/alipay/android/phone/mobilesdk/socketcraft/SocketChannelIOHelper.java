package com.alipay.android.phone.mobilesdk.socketcraft;

import com.alipay.android.phone.mobilesdk.socketcraft.WebSocket;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;

/* loaded from: classes3.dex */
public class SocketChannelIOHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean read(ByteBuffer byteBuffer, WebSocketImpl webSocketImpl, ByteChannel byteChannel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("121c5e94", new Object[]{byteBuffer, webSocketImpl, byteChannel})).booleanValue();
        }
        byteBuffer.clear();
        int read = byteChannel.read(byteBuffer);
        byteBuffer.flip();
        if (read != -1) {
            return read != 0;
        }
        webSocketImpl.eot();
        return false;
    }

    public static boolean readMore(ByteBuffer byteBuffer, WebSocketImpl webSocketImpl, WrappedByteChannel wrappedByteChannel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("82a7f846", new Object[]{byteBuffer, webSocketImpl, wrappedByteChannel})).booleanValue();
        }
        byteBuffer.clear();
        int readMore = wrappedByteChannel.readMore(byteBuffer);
        byteBuffer.flip();
        if (readMore == -1) {
            webSocketImpl.eot();
            return false;
        }
        return wrappedByteChannel.isNeedRead();
    }

    public static boolean batch(WebSocketImpl webSocketImpl, ByteChannel byteChannel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc48f147", new Object[]{webSocketImpl, byteChannel})).booleanValue();
        }
        ByteBuffer peek = webSocketImpl.outQueue.peek();
        WrappedByteChannel wrappedByteChannel = null;
        if (peek != null) {
            do {
                byteChannel.write(peek);
                if (peek.remaining() > 0) {
                    return false;
                }
                webSocketImpl.outQueue.poll();
                peek = webSocketImpl.outQueue.peek();
            } while (peek != null);
        } else if (byteChannel instanceof WrappedByteChannel) {
            wrappedByteChannel = (WrappedByteChannel) byteChannel;
            if (wrappedByteChannel.isNeedWrite()) {
                wrappedByteChannel.writeMore();
            }
        }
        if (webSocketImpl != null && webSocketImpl.outQueue.isEmpty() && webSocketImpl.isFlushAndClose() && webSocketImpl.getDraft() != null && webSocketImpl.getDraft().getRole() != null && webSocketImpl.getDraft().getRole() == WebSocket.Role.SERVER) {
            synchronized (webSocketImpl) {
                webSocketImpl.closeConnection();
            }
        }
        return wrappedByteChannel == null || !((WrappedByteChannel) byteChannel).isNeedWrite();
    }
}
