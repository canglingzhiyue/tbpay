package tb;

import org.java_websocket.WebSocket;

/* loaded from: classes6.dex */
public interface inp<REQUEST> {
    void a(REQUEST request, Object obj, WebSocket webSocket);

    void a(REQUEST request, Throwable th, WebSocket webSocket);
}
