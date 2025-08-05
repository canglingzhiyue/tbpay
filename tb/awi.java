package tb;

import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronProtocol;
import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.alibaba.android.umf.node.service.parse.state.tree.MultiTreeNode;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;

@AURAExtensionImpl(code = "aura.impl.parse.stateTree.decrypt")
/* loaded from: classes2.dex */
public final class awi extends aso {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String USER_CONTEXT_KEY_DECRYPT = "user.feature.decrypt";
    private a e;
    private q f;

    /* loaded from: classes2.dex */
    public interface a {
        void a(String str, JSONArray jSONArray, RenderComponent renderComponent);
    }

    static {
        kge.a(-58698677);
    }

    public static /* synthetic */ Object ipc$super(awi awiVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.aso, tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
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
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99c82df", new Object[]{this, multiTreeNode, ultronProtocol});
        } else if (a() == null || multiTreeNode == null || multiTreeNode.data() == null) {
        } else {
            RenderComponent data = multiTreeNode.data();
            if (data.component == null || !(data.component.getFeatures() instanceof JSONObject)) {
                return;
            }
            JSONObject jSONObject = (JSONObject) data.component.getFeatures();
            if (jSONObject.getJSONArray("decrypt") == null) {
                return;
            }
            Iterator<Object> it = jSONObject.getJSONArray("decrypt").iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof JSONObject) {
                    try {
                        a().a(((JSONObject) next).getString("module"), ((JSONObject) next).getJSONArray("value"), data);
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    private a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("5882476e", new Object[]{this});
        }
        if (this.e == null) {
            this.e = (a) this.f.a(USER_CONTEXT_KEY_DECRYPT, a.class);
        }
        return this.e;
    }

    @Override // tb.aso, tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        } else {
            this.f = qVar;
        }
    }
}
