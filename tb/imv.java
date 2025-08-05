package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.ace.model.a;
import com.taobao.android.searchbaseframe.ace.model.b;
import org.java_websocket.WebSocket;

/* loaded from: classes6.dex */
public abstract class imv<REQUEST extends a, RESPONSE extends b> implements imx, inp<REQUEST> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ino<REQUEST> f29164a;
    private final inb<REQUEST, RESPONSE> b;
    private final imr<REQUEST, RESPONSE> c;
    private final imt d;

    static {
        kge.a(-325827533);
        kge.a(-1098736569);
        kge.a(-1996523730);
    }

    public abstract REQUEST a(String str, WebSocket webSocket);

    public abstract RESPONSE a(String str);

    public abstract boolean a(REQUEST request, WebSocket webSocket);

    public abstract boolean a(RESPONSE response);

    public abstract void b(REQUEST request, WebSocket webSocket);

    public imv(ino<REQUEST> inoVar, inb<REQUEST, RESPONSE> inbVar, imr<REQUEST, RESPONSE> imrVar, imt imtVar) {
        this.f29164a = inoVar;
        this.b = inbVar;
        this.c = imrVar;
        this.d = imtVar;
    }

    @Override // tb.imx
    public void a(WebSocket webSocket, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a149f454", new Object[]{this, webSocket, str});
            return;
        }
        REQUEST a2 = a(str, webSocket);
        if (a2 != null && a((imv<REQUEST, RESPONSE>) a2, webSocket)) {
            c(a2, webSocket);
            return;
        }
        RESPONSE a3 = a(str);
        if (a3 == null || !a((imv<REQUEST, RESPONSE>) a3)) {
            return;
        }
        b(a3);
    }

    private void c(REQUEST request, WebSocket webSocket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e90dbb5a", new Object[]{this, request, webSocket});
            return;
        }
        inm<REQUEST> a2 = this.f29164a.a(request.getMethod());
        if (a2 == null) {
            b((imv<REQUEST, RESPONSE>) request, webSocket);
        } else {
            a2.a(request, webSocket, this.d, this);
        }
    }

    private void b(RESPONSE response) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd9c9d96", new Object[]{this, response});
        } else {
            this.b.a(response);
        }
    }

    public void b(WebSocket webSocket, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e84a5d5", new Object[]{this, webSocket, str});
        } else {
            this.c.a(webSocket, str);
        }
    }
}
