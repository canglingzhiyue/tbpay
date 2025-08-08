package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.ace.model.JsonRpcError;
import com.taobao.android.searchbaseframe.ace.model.JsonRpcRequest;
import com.taobao.android.searchbaseframe.ace.model.JsonRpcResponse;
import com.taobao.android.searchbaseframe.ace.model.a;
import com.taobao.android.searchbaseframe.ace.model.b;
import com.taobao.android.searchbaseframe.util.k;
import org.java_websocket.WebSocket;

/* loaded from: classes6.dex */
public class imw extends imv<JsonRpcRequest, JsonRpcResponse> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(858616753);
    }

    public static /* synthetic */ Object ipc$super(imw imwVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [com.taobao.android.searchbaseframe.ace.model.a, com.taobao.android.searchbaseframe.ace.model.JsonRpcRequest] */
    @Override // tb.imv
    public /* synthetic */ JsonRpcRequest a(String str, WebSocket webSocket) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("abff4a10", new Object[]{this, str, webSocket}) : b(str, webSocket);
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [com.taobao.android.searchbaseframe.ace.model.JsonRpcResponse, com.taobao.android.searchbaseframe.ace.model.b] */
    @Override // tb.imv
    public /* synthetic */ JsonRpcResponse a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("25343991", new Object[]{this, str}) : b(str);
    }

    public imw(ino<JsonRpcRequest> inoVar, inb<JsonRpcRequest, JsonRpcResponse> inbVar, imr<JsonRpcRequest, JsonRpcResponse> imrVar, imt imtVar) {
        super(inoVar, inbVar, imrVar, imtVar);
    }

    public JsonRpcRequest b(String str, WebSocket webSocket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JsonRpcRequest) ipChange.ipc$dispatch("db348214", new Object[]{this, str, webSocket});
        }
        try {
            return (JsonRpcRequest) JSON.parseObject(str, JsonRpcRequest.class);
        } catch (Throwable th) {
            k.f("JsonRpcHandler", "parse request failed", th);
            a(webSocket, "", JsonRpcError.ERROR_PARSE);
            return null;
        }
    }

    public JsonRpcResponse b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JsonRpcResponse) ipChange.ipc$dispatch("5e62eb4", new Object[]{this, str});
        }
        try {
            return (JsonRpcResponse) JSON.parseObject(str, JsonRpcResponse.class);
        } catch (Throwable th) {
            k.f("JsonRpcHandler", "parse response failed", th);
            return null;
        }
    }

    @Override // tb.imv
    public boolean a(JsonRpcRequest jsonRpcRequest, WebSocket webSocket) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8be50d4d", new Object[]{this, jsonRpcRequest, webSocket})).booleanValue() : !StringUtils.isEmpty(jsonRpcRequest.getMethod());
    }

    @Override // tb.imv
    public boolean a(JsonRpcResponse jsonRpcResponse) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("271d859d", new Object[]{this, jsonRpcResponse})).booleanValue() : !StringUtils.isEmpty(jsonRpcResponse.getId());
    }

    @Override // tb.imv
    public void b(JsonRpcRequest jsonRpcRequest, WebSocket webSocket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c66d528", new Object[]{this, jsonRpcRequest, webSocket});
        } else {
            a(webSocket, jsonRpcRequest.getId(), JsonRpcError.ERROR_METHOD_NOT_FOUND);
        }
    }

    @Override // tb.inp
    public void a(JsonRpcRequest jsonRpcRequest, Object obj, WebSocket webSocket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4dc1865", new Object[]{this, jsonRpcRequest, obj, webSocket});
        } else if (obj == null || StringUtils.isEmpty(jsonRpcRequest.getId())) {
        } else {
            a(webSocket, jsonRpcRequest.getId(), obj);
        }
    }

    @Override // tb.inp
    public void a(JsonRpcRequest jsonRpcRequest, Throwable th, WebSocket webSocket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42f12f90", new Object[]{this, jsonRpcRequest, th, webSocket});
        } else {
            a(webSocket, jsonRpcRequest.getId(), JsonRpcError.ERROR_INTERNAL, th.getMessage(), inr.a(th));
        }
    }

    private void a(WebSocket webSocket, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87f5092f", new Object[]{this, webSocket, str, new Integer(i)});
        } else {
            a(webSocket, str, i, null, null);
        }
    }

    private void a(WebSocket webSocket, String str, int i, String str2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f69658d5", new Object[]{this, webSocket, str, new Integer(i), str2, obj});
        } else if (!webSocket.isOpen()) {
        } else {
            b(webSocket, inq.a(i, str, str2, obj).toString());
        }
    }

    private void a(WebSocket webSocket, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5760f730", new Object[]{this, webSocket, str, obj});
        } else if (!webSocket.isOpen()) {
        } else {
            b(webSocket, inq.a(str, obj).toString());
        }
    }
}
