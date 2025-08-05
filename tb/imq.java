package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.ace.model.JsonRpcRequest;
import com.taobao.android.searchbaseframe.ace.model.JsonRpcResponse;
import com.taobao.android.searchbaseframe.util.k;
import java.net.InetSocketAddress;
import java.util.Collections;
import org.java_websocket.WebSocket;
import org.java_websocket.drafts.a;

/* loaded from: classes6.dex */
public class imq extends sbu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final imr<JsonRpcRequest, JsonRpcResponse> d;
    private final imx e;

    static {
        kge.a(-616885872);
    }

    public imq(imp impVar, imr<JsonRpcRequest, JsonRpcResponse> imrVar, ina inaVar, int i) {
        super(new InetSocketAddress("0.0.0.0", i), Collections.singletonList(new a()));
        setReuseAddr(true);
        this.e = new imw(impVar.e(), inaVar, imrVar, impVar.f());
        this.d = imrVar;
    }

    @Override // tb.sbu
    public void a(WebSocket webSocket, sbi sbiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53170340", new Object[]{this, webSocket, sbiVar});
        } else {
            this.d.a(webSocket);
        }
    }

    @Override // tb.sbu
    public void a(WebSocket webSocket, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08f4271", new Object[]{this, webSocket, new Integer(i), str, new Boolean(z)});
        } else {
            this.d.a(webSocket, i, str);
        }
    }

    @Override // tb.sbu
    public void a(WebSocket webSocket, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a149f454", new Object[]{this, webSocket, str});
        } else {
            this.e.a(webSocket, str);
        }
    }

    @Override // tb.sbu
    public void a(WebSocket webSocket, Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("757c9fbc", new Object[]{this, webSocket, exc});
            return;
        }
        k.a("AceServer", "onError:" + exc);
        this.d.a(webSocket, exc);
    }

    @Override // tb.sbu
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        k.e("AceServer", "onStart: ");
        this.d.b();
    }
}
