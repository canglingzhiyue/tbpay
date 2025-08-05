package org.java_websocket;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;

/* loaded from: classes9.dex */
public interface g extends ByteChannel {
    int a(ByteBuffer byteBuffer) throws IOException;

    boolean a();

    boolean b();
}
