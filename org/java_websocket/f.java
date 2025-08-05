package org.java_websocket;

import java.io.IOException;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.List;
import org.java_websocket.drafts.Draft;

/* loaded from: classes9.dex */
public interface f {
    ByteChannel a(SocketChannel socketChannel, SelectionKey selectionKey) throws IOException;

    d a(c cVar, List<Draft> list);
}
