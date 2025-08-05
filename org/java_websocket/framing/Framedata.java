package org.java_websocket.framing;

import java.nio.ByteBuffer;

/* loaded from: classes9.dex */
public interface Framedata {

    /* loaded from: classes9.dex */
    public enum Opcode {
        CONTINUOUS,
        TEXT,
        BINARY,
        PING,
        PONG,
        CLOSING
    }

    ByteBuffer d();

    boolean e();

    boolean f();

    boolean g();

    boolean h();

    Opcode i();
}
