package tb;

import com.taobao.android.searchbaseframe.ace.model.a;
import com.taobao.android.searchbaseframe.ace.model.b;
import java.util.concurrent.Future;
import org.java_websocket.WebSocket;

/* loaded from: classes6.dex */
public interface imr<REQUEST extends a, RESPONSE extends b> {
    Future<RESPONSE> a(REQUEST request);

    WebSocket a();

    void a(WebSocket webSocket);

    void a(WebSocket webSocket, int i, String str);

    void a(WebSocket webSocket, Exception exc);

    void a(WebSocket webSocket, String str);

    void b();

    void b(REQUEST request);

    void c();

    boolean d();

    boolean e();

    int f();
}
