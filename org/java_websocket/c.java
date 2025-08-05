package org.java_websocket;

import org.java_websocket.drafts.Draft;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.framing.Framedata;
import org.java_websocket.framing.h;
import tb.sbi;
import tb.sbm;
import tb.sbp;
import tb.sbq;

/* loaded from: classes9.dex */
public abstract class c implements e {
    @Override // org.java_websocket.e
    public void onWebsocketHandshakeReceivedAsClient(WebSocket webSocket, sbi sbiVar, sbp sbpVar) throws InvalidDataException {
    }

    @Override // org.java_websocket.e
    public sbq onWebsocketHandshakeReceivedAsServer(WebSocket webSocket, Draft draft, sbi sbiVar) throws InvalidDataException {
        return new sbm();
    }

    @Override // org.java_websocket.e
    public void onWebsocketHandshakeSentAsClient(WebSocket webSocket, sbi sbiVar) throws InvalidDataException {
    }

    @Deprecated
    public void onWebsocketMessageFragment(WebSocket webSocket, Framedata framedata) {
    }

    @Override // org.java_websocket.e
    public void onWebsocketPing(WebSocket webSocket, Framedata framedata) {
        webSocket.sendFrame(new h((org.java_websocket.framing.g) framedata));
    }

    @Override // org.java_websocket.e
    public void onWebsocketPong(WebSocket webSocket, Framedata framedata) {
    }
}
