package tb;

import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronProtocol;
import com.alibaba.android.umf.node.service.parse.state.tree.MultiTreeNode;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.monitor.DXTraceUtil;

@AURAExtensionImpl(code = "adam.impl.parser.redirect.eventChain")
/* loaded from: classes4.dex */
public final class dni implements asq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public AURAGlobalData f26868a;

    static {
        kge.a(-1869443226);
        kge.a(1789767368);
    }

    @Override // tb.asq
    public String a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("15c87a18", new Object[]{this, jSONObject}) : "0";
    }

    @Override // tb.asq
    public void a(MultiTreeNode multiTreeNode, UltronProtocol ultronProtocol) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99c82df", new Object[]{this, multiTreeNode, ultronProtocol});
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

    @Override // tb.asq
    public void b(MultiTreeNode multiTreeNode, UltronProtocol ultronProtocol) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45d9383e", new Object[]{this, multiTreeNode, ultronProtocol});
            return;
        }
        JSONObject jSONObject = ultronProtocol.getFeatures() instanceof JSONObject ? (JSONObject) ultronProtocol.getFeatures() : null;
        if (jSONObject == null) {
            return;
        }
        Object obj = jSONObject.get(DXTraceUtil.TYPE_EVENT_CHAIN_STRING);
        if (!(obj instanceof JSONObject)) {
            return;
        }
        JSONObject jSONObject2 = (JSONObject) obj;
        JSONArray jSONArray = jSONObject2.getJSONArray("source");
        this.f26868a.update("adamConfig", jSONObject2.getJSONObject("defaultConfig"));
        this.f26868a.update("templates", jSONArray);
    }

    @Override // tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
        } else {
            this.f26868a = aURAGlobalData;
        }
    }
}
