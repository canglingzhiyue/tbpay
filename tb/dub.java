package tb;

import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.a;
import com.alibaba.android.aura.datamodel.c;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.android.umf.node.service.parse.state.b;
import com.android.alibaba.ip.runtime.IpChange;

@AURAExtensionImpl(code = "alibuy.impl.lifecycle.reset.state")
/* loaded from: classes4.dex */
public final class dub implements arp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private AURAGlobalData f26983a;

    static {
        kge.a(-2073875216);
        kge.a(-1795775593);
    }

    @Override // tb.arp
    public void afterServiceExecute(c cVar, a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae2b82a1", new Object[]{this, cVar, aVar, new Boolean(z)});
        }
    }

    @Override // tb.arp
    public void beforeFlowExecute(AURAInputData aURAInputData, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42f04d21", new Object[]{this, aURAInputData, aVar});
        }
    }

    @Override // tb.arp
    public void beforeServiceExecute(AURAInputData aURAInputData, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea679858", new Object[]{this, aURAInputData, aVar});
        }
    }

    @Override // tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        }
    }

    @Override // tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    @Override // tb.arp
    public void afterFlowExecute(c cVar, a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa6cdb92", new Object[]{this, cVar, aVar, new Boolean(z)});
            return;
        }
        b bVar = (b) this.f26983a.get("aura_parse_global_data_parse", b.class);
        if (bVar == null) {
            return;
        }
        com.alibaba.android.umf.node.service.parse.state.a b = bVar.b();
        bVar.b(com.alibaba.android.umf.node.service.parse.state.a.a("", b.j(), b.i(), b.e(), b.d(), b.f(), b.g(), b.h()));
        this.f26983a.update("aura_parse_global_data_parse", bVar);
    }

    @Override // tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
        } else {
            this.f26983a = aURAGlobalData;
        }
    }
}
