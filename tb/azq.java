package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.a;
import com.alibaba.android.aura.datamodel.c;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.service.event.d;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronProtocol;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.alibaba.android.umf.node.service.parse.state.tree.MultiTreeNode;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

@AURAExtensionImpl(code = "aura.impl.aspect.lifecycle.popupWindow")
/* loaded from: classes2.dex */
public final class azq extends aso implements arp {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Map<String, RenderComponent> e;
    private AURAGlobalData f;
    private q g;

    static {
        kge.a(-797353554);
        kge.a(-1795775593);
    }

    public static /* synthetic */ Object ipc$super(azq azqVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
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

    @Override // tb.aso, tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    @Override // tb.aso, tb.asq
    public void a(MultiTreeNode multiTreeNode, UltronProtocol ultronProtocol) {
        RenderComponent data;
        Component component;
        Map<String, Object> fields;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99c82df", new Object[]{this, multiTreeNode, ultronProtocol});
        } else if (multiTreeNode == null || (data = multiTreeNode.data()) == null || (component = data.getComponent()) == null || (fields = component.getFields()) == null) {
        } else {
            Object obj = fields.get("code");
            Object obj2 = fields.get("state");
            if (!(obj instanceof String) || !(obj2 instanceof String)) {
                return;
            }
            String str = (String) obj;
            if (!"open".equals(obj2)) {
                return;
            }
            if (this.e == null) {
                this.e = new HashMap();
            }
            if (this.e.size() != 0) {
                return;
            }
            if ("commonErrorPopup".equals(data.getKey()) || "itemErrorPopup".equals(data.getKey())) {
                b(str, data);
            } else if (multiTreeNode.parent() == null) {
            } else {
                b(str, multiTreeNode.parent().data());
            }
        }
    }

    private void b(String str, RenderComponent renderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d33ccc1a", new Object[]{this, str, renderComponent});
            return;
        }
        this.e.put(str, renderComponent);
        this.f.update("global_data_popup_window", this.e);
    }

    @Override // tb.aso, tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
            return;
        }
        this.e = (Map) aURAGlobalData.get("global_data_popup_window", Map.class);
        this.f = aURAGlobalData;
    }

    @Override // tb.aso, tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        } else {
            this.g = qVar;
        }
    }

    @Override // tb.arp
    public void beforeServiceExecute(AURAInputData aURAInputData, a aVar) {
        Map<String, RenderComponent> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea679858", new Object[]{this, aURAInputData, aVar});
        } else if (a() || !com.alibaba.android.aura.service.parse.a.PARSE_SERVICE_CODE.equals(aVar.c()) || (map = this.e) == null) {
        } else {
            map.clear();
        }
    }

    private void a(String str, RenderComponent renderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea350719", new Object[]{this, str, renderComponent});
            return;
        }
        AURARenderComponent aURARenderComponent = new AURARenderComponent();
        aURARenderComponent.key = renderComponent.getKey();
        Component component = renderComponent.getComponent();
        aURARenderComponent.data = new AURARenderComponentData(component.getType(), component.getFields(), component.getEvents(), component.getFeatures(), null, component.getCodePopupWindowMap(), component.getLocalFields(), component.getStatus());
        d dVar = new d();
        dVar.a(aURARenderComponent);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", (Object) str);
        if ("commonErrorPopup".equals(renderComponent.getKey()) || "itemErrorPopup".equals(renderComponent.getKey())) {
            jSONObject.put("popupData", (Object) renderComponent);
        }
        dVar.a(jSONObject);
        com.alibaba.android.aura.service.event.c.a(this.g.b(), azp.EVENT_TYPE, dVar);
    }

    @Override // tb.arp
    public void afterFlowExecute(c cVar, a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa6cdb92", new Object[]{this, cVar, aVar, new Boolean(z)});
            return;
        }
        Map<String, RenderComponent> map = this.e;
        if (map == null || map.size() != 1) {
            return;
        }
        for (String str : this.e.keySet()) {
            if (!StringUtils.isEmpty(str)) {
                RenderComponent remove = a() ? this.e.remove(str) : this.e.get(str);
                if (remove != null) {
                    a(str, remove);
                }
            }
        }
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : bar.a("enablePopupWindowClearPerf", true);
    }
}
