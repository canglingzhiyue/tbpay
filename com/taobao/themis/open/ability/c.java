package com.taobao.themis.open.ability;

import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0011\u0010\u0011\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0011\u0010\u0013\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0011\u0010\u0015\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R\u0011\u0010\u0017\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0006R\u0011\u0010\u0019\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0006R\u0011\u0010\u001b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0006¨\u0006\u001d"}, d2 = {"Lcom/taobao/themis/open/ability/WebSocketResult;", "", "()V", "CANNOT_SEND_UNTIL_CONNECTION_IS_OPEN", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeResponse$Error;", "getCANNOT_SEND_UNTIL_CONNECTION_IS_OPEN", "()Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeResponse$Error;", "CONNECTION_TIMEOUT", "getCONNECTION_TIMEOUT", "ERROR_WRITING_TO_STREAM", "getERROR_WRITING_TO_STREAM", "INVALID_SEC_WS_ACCEPT_RESP", "getINVALID_SEC_WS_ACCEPT_RESP", "SERVER_SPEC_SEC_WS_PROTO_NOT_REQ", "getSERVER_SPEC_SEC_WS_PROTO_NOT_REQ", "SSL_HANDSHAKE_ERROR", "getSSL_HANDSHAKE_ERROR", "UNABLE_ALLOC_MEM_TO_READ", "getUNABLE_ALLOC_MEM_TO_READ", "UNKNOWN_ERROR", "getUNKNOWN_ERROR", "URL_IS_NULL_MSG", "getURL_IS_NULL_MSG", "URL_NOT_WELL_FORMAT", "getURL_NOT_WELL_FORMAT", "URL_NOT_WS_OR_WSS", "getURL_NOT_WS_OR_WSS", "WEBSOCKET_IS_CONNECTED_MSG", "getWEBSOCKET_IS_CONNECTED_MSG", "themis_open_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final c INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final BridgeResponse.Error f22635a;
    private static final BridgeResponse.Error b;
    private static final BridgeResponse.Error c;
    private static final BridgeResponse.Error d;
    private static final BridgeResponse.Error e;
    private static final BridgeResponse.Error f;
    private static final BridgeResponse.Error g;
    private static final BridgeResponse.Error h;
    private static final BridgeResponse.Error i;
    private static final BridgeResponse.Error j;
    private static final BridgeResponse.Error k;
    private static final BridgeResponse.Error l;

    static {
        kge.a(880177456);
        INSTANCE = new c();
        BridgeResponse.Error newError = BridgeResponse.newError(-1, "未知错误");
        q.b(newError, "BridgeResponse.newError(-1, \"未知错误\")");
        f22635a = newError;
        BridgeResponse.Error newError2 = BridgeResponse.newError(-1, "当前存在一个已有的连接");
        q.b(newError2, "BridgeResponse.newError(-1, \"当前存在一个已有的连接\")");
        b = newError2;
        BridgeResponse.Error newError3 = BridgeResponse.newError(-1, "URL 为空.");
        q.b(newError3, "BridgeResponse.newError(-1, \"URL 为空.\")");
        c = newError3;
        BridgeResponse.Error newError4 = BridgeResponse.newError(-1, "URL 格式不合法.");
        q.b(newError4, "BridgeResponse.newError(-1, \"URL 格式不合法.\")");
        d = newError4;
        BridgeResponse.Error newError5 = BridgeResponse.newError(-1, "URL 地址不是 ws 或者 wss.");
        q.b(newError5, "BridgeResponse.newError(-1, \"URL 地址不是 ws 或者 wss.\")");
        e = newError5;
        BridgeResponse.Error newError6 = BridgeResponse.newError(-1, "建连超时.");
        q.b(newError6, "BridgeResponse.newError(-1, \"建连超时.\")");
        f = newError6;
        BridgeResponse.Error newError7 = BridgeResponse.newError(-1, "SSL 握手失败.");
        q.b(newError7, "BridgeResponse.newError(-1, \"SSL 握手失败.\")");
        g = newError7;
        BridgeResponse.Error newError8 = BridgeResponse.newError(-1, "Invalid Sec-WebSocket-Accept response.");
        q.b(newError8, "BridgeResponse.newError(…Socket-Accept response.\")");
        h = newError8;
        BridgeResponse.Error newError9 = BridgeResponse.newError(-1, "Server specified Sec-WebSocket-Protocol that wasn't requested.");
        q.b(newError9, "BridgeResponse.newError(… wasn't requested.\"\n    )");
        i = newError9;
        BridgeResponse.Error newError10 = BridgeResponse.newError(-1, "没有建连成功之前无法发送消息.");
        q.b(newError10, "BridgeResponse.newError(-1, \"没有建连成功之前无法发送消息.\")");
        j = newError10;
        BridgeResponse.Error newError11 = BridgeResponse.newError(-1, "Error writing to stream.");
        q.b(newError11, "BridgeResponse.newError(…rror writing to stream.\")");
        k = newError11;
        BridgeResponse.Error newError12 = BridgeResponse.newError(-1, "不能分配内存给当前的 Websocket 连接使用.");
        q.b(newError12, "BridgeResponse.newError(…配内存给当前的 Websocket 连接使用.\")");
        l = newError12;
    }

    private c() {
    }

    public final BridgeResponse.Error a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BridgeResponse.Error) ipChange.ipc$dispatch("13053214", new Object[]{this}) : f22635a;
    }

    public final BridgeResponse.Error b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BridgeResponse.Error) ipChange.ipc$dispatch("da111915", new Object[]{this}) : b;
    }

    public final BridgeResponse.Error c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BridgeResponse.Error) ipChange.ipc$dispatch("a11d0016", new Object[]{this}) : c;
    }

    public final BridgeResponse.Error d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BridgeResponse.Error) ipChange.ipc$dispatch("6828e717", new Object[]{this}) : d;
    }

    public final BridgeResponse.Error e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BridgeResponse.Error) ipChange.ipc$dispatch("2f34ce18", new Object[]{this}) : e;
    }

    public final BridgeResponse.Error f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BridgeResponse.Error) ipChange.ipc$dispatch("f640b519", new Object[]{this}) : f;
    }

    public final BridgeResponse.Error g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BridgeResponse.Error) ipChange.ipc$dispatch("bd4c9c1a", new Object[]{this}) : g;
    }

    public final BridgeResponse.Error h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BridgeResponse.Error) ipChange.ipc$dispatch("8458831b", new Object[]{this}) : h;
    }

    public final BridgeResponse.Error i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BridgeResponse.Error) ipChange.ipc$dispatch("4b646a1c", new Object[]{this}) : i;
    }

    public final BridgeResponse.Error j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BridgeResponse.Error) ipChange.ipc$dispatch("1270511d", new Object[]{this}) : j;
    }

    public final BridgeResponse.Error k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BridgeResponse.Error) ipChange.ipc$dispatch("d97c381e", new Object[]{this}) : k;
    }

    public final BridgeResponse.Error l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BridgeResponse.Error) ipChange.ipc$dispatch("a0881f1f", new Object[]{this}) : l;
    }
}
