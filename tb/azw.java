package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.umf.datamodel.protocol.ultron.Global;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronProtocol;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.alibaba.android.umf.node.service.parse.state.tree.MultiTreeNode;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.bbd;

@AURAExtensionImpl(code = "aura.impl.parse.stateTree.shareContext")
/* loaded from: classes2.dex */
public final class azw extends aso {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Map<String, azx> e;

    static {
        kge.a(1235837807);
    }

    public static /* synthetic */ Object ipc$super(azw azwVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.aso
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.aso, tb.asq
    public void a(MultiTreeNode multiTreeNode, UltronProtocol ultronProtocol) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99c82df", new Object[]{this, multiTreeNode, ultronProtocol});
            return;
        }
        RenderComponent data = multiTreeNode.data();
        if (data == null) {
            arc.a().a("shareContext扩展点实现RenderComponent为null");
            return;
        }
        String key = data.getKey();
        if (TextUtils.isEmpty(key)) {
            arc.a().a("shareContext扩展点实现componentKey为null");
            return;
        }
        Component component = data.getComponent();
        Object features = component.getFeatures();
        if (!(features instanceof JSONObject)) {
            arc.a().a("shareContext扩展点实现features不为JSONObject类型");
            return;
        }
        JSONObject jSONObject = ((JSONObject) features).getJSONObject("localAdjust");
        if (jSONObject == null) {
            arc.a().a("localAdjust is null!");
        } else if (!b(jSONObject)) {
            arc.a().a("useSharedContext is false!");
        } else {
            JSONObject jSONObject2 = jSONObject.getJSONObject("dynamicBindingData");
            if (bau.a(jSONObject2)) {
                arc.a().a("dynamicBindingData is null!");
                return;
            }
            a();
            a(key, component, jSONObject2);
        }
    }

    private void a(String str, Component component, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb060304", new Object[]{this, str, component, jSONObject});
            return;
        }
        if (this.e == null) {
            this.e = new HashMap();
        }
        this.e.put(str, new azx(str, component, jSONObject));
        this.f25572a.update("global_data_local_adjust", this.e);
    }

    @Override // tb.aso, tb.asq
    public void b(MultiTreeNode multiTreeNode, UltronProtocol ultronProtocol) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45d9383e", new Object[]{this, multiTreeNode, ultronProtocol});
            return;
        }
        a();
        if (this.e == null) {
            arc.a().a("shareContext扩展点实现mUseSharedContextComponentMap为null");
            return;
        }
        JSONObject a2 = a(this.f25572a, ultronProtocol);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("context", (Object) a2);
        a(jSONObject, this.e);
    }

    @Override // tb.aso, tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
        } else {
            this.f25572a = aURAGlobalData;
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.e != null) {
        } else {
            if (this.f25572a == null) {
                this.e = new HashMap();
                return;
            }
            this.e = (Map) this.f25572a.get("global_data_local_adjust", Map.class);
            if (this.e != null) {
                return;
            }
            this.e = new HashMap();
            this.f25572a.update("global_data_local_adjust", this.e);
        }
    }

    private JSONObject a(AURAGlobalData aURAGlobalData, UltronProtocol ultronProtocol) {
        Global global;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("78800b8b", new Object[]{this, aURAGlobalData, ultronProtocol});
        }
        JSONObject jSONObject = (JSONObject) aURAGlobalData.get("aura_share_context", JSONObject.class);
        if (jSONObject != null || (global = ultronProtocol.getGlobal()) == null) {
            return jSONObject;
        }
        JSONObject context = global.getContext();
        if (context == null) {
            context = new JSONObject();
        }
        JSONObject jSONObject2 = context;
        aURAGlobalData.update("aura_share_context", jSONObject2);
        return jSONObject2;
    }

    private void a(JSONObject jSONObject, Map<String, azx> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37335efd", new Object[]{this, jSONObject, map});
        } else if (jSONObject == null) {
            arc.a().a("shareContext扩展点实现shareContext为null");
        } else {
            for (String str : map.keySet()) {
                azx azxVar = map.get(str);
                if (azxVar != null) {
                    a(jSONObject, azxVar);
                }
            }
        }
    }

    private void a(JSONObject jSONObject, azx azxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6933239", new Object[]{this, jSONObject, azxVar});
            return;
        }
        Component a2 = azxVar.a();
        JSONObject b = azxVar.b();
        JSONObject jSONObject2 = b.getJSONObject("fields");
        if (!bau.a(jSONObject2)) {
            a(a2.getFields(), jSONObject2, jSONObject);
        }
        JSONObject jSONObject3 = b.getJSONObject("events");
        if (bau.a(jSONObject3)) {
            return;
        }
        a(a2.getEvents(), jSONObject3, jSONObject);
    }

    private void a(Object obj, JSONObject jSONObject, JSONObject jSONObject2) {
        Object a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f48f44", new Object[]{this, obj, jSONObject, jSONObject2});
            return;
        }
        for (String str : jSONObject.keySet()) {
            Object obj2 = jSONObject.get(str);
            if (obj2 instanceof String) {
                String str2 = (String) obj2;
                if ((obj instanceof Map) && (a2 = a(jSONObject2, str2)) != null) {
                    ((Map) obj).put(str, a2);
                }
            }
        }
    }

    private Object a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("805a9220", new Object[]{this, jSONObject, str});
        }
        String a2 = a(str);
        return (TextUtils.isEmpty(a2) || TextUtils.equals(a2, "*")) ? jSONObject : bbd.b.a(a2.split("\\."), jSONObject);
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (str.startsWith("$.")) {
            str = str.substring(2);
        }
        if (str.startsWith("${")) {
            str = str.substring(2);
        }
        return str.endsWith(riy.BLOCK_END_STR) ? str.substring(0, str.length() - 1) : str;
    }

    private boolean b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63b9982b", new Object[]{this, jSONObject})).booleanValue() : jSONObject.getBooleanValue("useSharedContext");
    }
}
