package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.ace.model.a;
import org.java_websocket.WebSocket;

/* loaded from: classes6.dex */
public abstract class inl<REQUEST extends a> implements inm<REQUEST> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1119643935);
        kge.a(-1264954158);
    }

    public abstract Object a(REQUEST request);

    @Override // tb.inm
    public void a(REQUEST request, WebSocket webSocket, imt imtVar, inp<REQUEST> inpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7720ff1d", new Object[]{this, request, webSocket, imtVar, inpVar});
            return;
        }
        try {
            inpVar.a((inp<REQUEST>) request, a(request), webSocket);
        } catch (Throwable th) {
            inpVar.a((inp<REQUEST>) request, th, webSocket);
        }
    }
}
