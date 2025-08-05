package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronProtocol;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.alibaba.android.umf.node.service.parse.state.tree.MultiTreeNode;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.Map;

@AURAExtensionImpl(code = "aura.impl.parse.component.groupSelected")
/* loaded from: classes2.dex */
public final class awj extends aso {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1463696702);
    }

    public static /* synthetic */ Object ipc$super(awj awjVar, String str, Object... objArr) {
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

    @Override // tb.aso, tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        }
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
        } else if (multiTreeNode.data() == null || multiTreeNode.data().getComponentView() == null) {
        } else {
            a(multiTreeNode.data());
        }
    }

    private void a(RenderComponent renderComponent) {
        Map<String, Object> fields;
        JSONObject jSONObject;
        JSONArray jSONArray;
        JSONArray jSONArray2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcc341cf", new Object[]{this, renderComponent});
            return;
        }
        Component component = renderComponent.component;
        if (component == null || (fields = component.getFields()) == null) {
            return;
        }
        Object obj = fields.get("group");
        if (!(obj instanceof JSONObject) || (jSONArray = (jSONObject = (JSONObject) obj).getJSONArray("items")) == null) {
            return;
        }
        String string = jSONObject.getString("min");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        Iterator<Object> it = jSONArray.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof JSONObject) {
                String string2 = ((JSONObject) next).getString("optional");
                if (!TextUtils.isEmpty(string2) && (string2.equals("disable") || string2.equals("none"))) {
                    i++;
                }
            }
        }
        if (Math.max(0, jSONArray.size() - i) > Integer.parseInt(string) || (jSONArray2 = jSONObject.getJSONArray("selectedId")) == null) {
            return;
        }
        Iterator<Object> it2 = jSONArray.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (next2 instanceof JSONObject) {
                JSONObject jSONObject2 = (JSONObject) next2;
                String string3 = jSONObject2.getString("id");
                if (!TextUtils.isEmpty(string3) && TextUtils.isEmpty(jSONObject2.getString("optional")) && jSONArray2.contains(string3)) {
                    jSONObject2.put("optional", (Object) "force");
                }
            }
        }
    }
}
