package tb;

import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.s;
import com.alibaba.android.aura.service.event.a;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

@AURAExtensionImpl(code = "albbcashier.impl.submit.result.monitor")
/* loaded from: classes9.dex */
public final class nay implements ayx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public q f31358a;

    static {
        kge.a(-110573429);
        kge.a(247296504);
    }

    @Override // tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
        }
    }

    @Override // tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    @Override // tb.ayx
    public boolean a(RenderComponent renderComponent, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b76e1da", new Object[]{this, renderComponent, map})).booleanValue();
        }
        if ((renderComponent != null && ("overseaPayType".equals(renderComponent.key) || "overseaPaymentMethod".equals(renderComponent.key))) || "overseaPaymentMethod_OvsPaymentCardVO".equals(renderComponent.key)) {
            s b = this.f31358a.b();
            if (this.f31358a != null) {
                for (Event event : renderComponent.component.events.get("itemClick")) {
                    a.a(b, event, bst.d(renderComponent), map);
                }
            }
        }
        return false;
    }

    @Override // tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        } else {
            this.f31358a = qVar;
        }
    }
}
