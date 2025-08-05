package org.java_websocket;

import java.net.InetSocketAddress;
import java.nio.channels.NotYetConnectedException;
import java.util.Collection;
import org.java_websocket.drafts.Draft;
import org.java_websocket.framing.Framedata;

/* loaded from: classes9.dex */
public interface WebSocket {
    public static final int DEFAULT_PORT = 80;
    public static final int DEFAULT_WSS_PORT = 443;

    /* loaded from: classes9.dex */
    public enum READYSTATE {
        NOT_YET_CONNECTED,
        CONNECTING,
        OPEN,
        CLOSING,
        CLOSED
    }

    /* loaded from: classes9.dex */
    public enum Role {
        CLIENT,
        SERVER
    }

    void close(int i);

    void closeConnection(int i, String str);

    Draft getDraft();

    InetSocketAddress getLocalSocketAddress();

    InetSocketAddress getRemoteSocketAddress();

    boolean isClosed();

    boolean isClosing();

    boolean isOpen();

    void send(String str) throws NotYetConnectedException;

    void sendFrame(Collection<Framedata> collection);

    void sendFrame(Framedata framedata);
}
