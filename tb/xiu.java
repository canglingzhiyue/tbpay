package tb;

import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.service.event.c;
import com.alibaba.android.aura.service.event.d;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

@AURAExtensionImpl(code = "alibuy.impl.submit.result.handler")
/* loaded from: classes4.dex */
public final class xiu implements ayx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private q f34316a;

    static {
        kge.a(1092474766);
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
        List<Event> a2 = a(renderComponent);
        if (a2 != null) {
            a(b(renderComponent), a2);
        }
        return false;
    }

    private List<Event> a(RenderComponent renderComponent) {
        Map<String, List<Event>> events;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("33aad898", new Object[]{this, renderComponent});
        }
        if (renderComponent != null && (events = renderComponent.getComponent().getEvents()) != null) {
            return events.get("onValidateFail");
        }
        return null;
    }

    private void a(AURARenderComponent aURARenderComponent, List<Event> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cc9aac4", new Object[]{this, aURARenderComponent, list});
            return;
        }
        for (Event event : list) {
            d dVar = new d();
            dVar.a(event.getId());
            dVar.a(aURARenderComponent);
            dVar.b(event.getTag());
            dVar.a(event.getFields());
            c.a(this.f34316a.b(), event.getType(), dVar);
        }
    }

    private AURARenderComponent b(RenderComponent renderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponent) ipChange.ipc$dispatch("4ed0547b", new Object[]{this, renderComponent});
        }
        if (renderComponent == null) {
            return null;
        }
        AURARenderComponent aURARenderComponent = new AURARenderComponent();
        aURARenderComponent.key = renderComponent.getKey();
        Component component = renderComponent.getComponent();
        aURARenderComponent.data = new AURARenderComponentData(component.getType(), component.getFields(), component.getEvents(), component.getFeatures(), null, component.getCodePopupWindowMap(), component.getLocalFields(), component.getStatus());
        return aURARenderComponent;
    }

    @Override // tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        } else {
            this.f34316a = qVar;
        }
    }
}
