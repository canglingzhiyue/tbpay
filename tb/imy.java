package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.ace.model.a;
import com.taobao.android.searchbaseframe.ace.model.b;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import org.java_websocket.WebSocket;

/* loaded from: classes6.dex */
public abstract class imy<REQUEST extends a, RESPONSE extends b> implements inb<REQUEST, RESPONSE> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final imr<REQUEST, RESPONSE> f29165a;
    private final Map<String, imz<RESPONSE>> b = new HashMap();

    static {
        kge.a(-1677705922);
        kge.a(-254726512);
    }

    public abstract String b(REQUEST request);

    public imy(imr<REQUEST, RESPONSE> imrVar) {
        this.f29165a = imrVar;
    }

    public Future<RESPONSE> a(REQUEST request) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("d41e8a4c", new Object[]{this, request});
        }
        WebSocket a2 = this.f29165a.a();
        if (a2 != null) {
            return a(request, a2);
        }
        return null;
    }

    public Future<RESPONSE> a(REQUEST request, WebSocket webSocket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("94f7736e", new Object[]{this, request, webSocket});
        }
        if (webSocket == null || !webSocket.isOpen()) {
            return null;
        }
        this.f29165a.a(webSocket, b(request));
        imz<RESPONSE> imzVar = new imz<>();
        this.b.put(request.getId(), imzVar);
        FutureTask futureTask = new FutureTask(imzVar);
        futureTask.run();
        return futureTask;
    }

    @Override // tb.inb
    public void a(RESPONSE response) {
        imz<RESPONSE> remove;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7061ec15", new Object[]{this, response});
            return;
        }
        String id = response.getId();
        if (StringUtils.isEmpty(id) || (remove = this.b.remove(id)) == null) {
            return;
        }
        remove.a(response);
    }
}
