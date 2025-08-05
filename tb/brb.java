package tb;

import com.alibaba.android.ultron.event.base.d;
import com.alibaba.android.ultron.event.base.e;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public abstract class brb implements d, bri {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1076524486);
        kge.a(-750523774);
        kge.a(-1342938866);
    }

    public abstract void a(brh brhVar);

    @Override // com.alibaba.android.ultron.event.base.d
    public final void b(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d50c2a2", new Object[]{this, eVar});
        } else if (eVar == null) {
            bqe.a().c(getClass().getSimpleName(), "ultronEvent is null");
        } else {
            Object d = eVar.d("umfEventModel");
            if (!(d instanceof brh)) {
                bqd a2 = bqe.a();
                String simpleName = getClass().getSimpleName();
                a2.c(simpleName, "extra data[" + d + "] of UMFTaobaoAdapterConstant.EventParams.KEY_EVENT_MODEL is not UMFEventModel");
                return;
            }
            a((brh) d);
        }
    }
}
