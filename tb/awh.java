package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronProtocol;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.alibaba.android.umf.node.service.parse.state.tree.MultiTreeNode;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.bbd;

@AURAExtensionImpl(code = "aura.impl.parse.dataRef")
/* loaded from: classes2.dex */
public final class awh extends aso {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1731742483);
    }

    public static /* synthetic */ Object ipc$super(awh awhVar, String str, Object... objArr) {
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
        Component component;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99c82df", new Object[]{this, multiTreeNode, ultronProtocol});
            return;
        }
        RenderComponent data = multiTreeNode.data();
        if (data == null || (component = data.getComponent()) == null) {
            return;
        }
        Object features = component.getFeatures();
        if (!(features instanceof JSONObject)) {
            return;
        }
        a(ultronProtocol.getOriginData(), component, b((JSONObject) features));
    }

    private JSONArray b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("aaec3d37", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("dataRef");
        if (jSONObject2 != null) {
            return jSONObject2.getJSONArray("metadatas");
        }
        return null;
    }

    private void a(JSONObject jSONObject, Component component, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eee686a", new Object[]{this, jSONObject, component, jSONArray});
        } else if (!bau.a(jSONObject) && !bau.a(jSONArray)) {
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (jSONObject2 != null) {
                    String string = jSONObject2.getString("source");
                    String string2 = jSONObject2.getString("target");
                    if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
                        return;
                    }
                    if (string.startsWith("$.")) {
                        string = string.substring(2);
                    }
                    if (string2.startsWith("$.")) {
                        string2 = string2.substring(2);
                    }
                    try {
                        a(jSONObject, string, component, string2);
                    } catch (Throwable th) {
                        ard a2 = arc.a();
                        a2.c("AURADataRefExtension", "parseMultiDataRef", "parseMultiDataRef exception:" + th.getMessage());
                        return;
                    }
                }
            }
        }
    }

    private void a(JSONObject jSONObject, String str, Component component, String str2) {
        Map a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f58df356", new Object[]{this, jSONObject, str, component, str2});
            return;
        }
        Object a3 = a(jSONObject, str);
        if (a3 == null || (a2 = bbd.b.a(str2, component)) == null) {
            return;
        }
        String[] f = bbd.b.f(str2);
        if (f != null) {
            bbd.b.a(f, a2, a3);
        } else if (!(a3 instanceof Map)) {
        } else {
            a2.putAll((Map) a3);
        }
    }

    private Object a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("805a9220", new Object[]{this, jSONObject, str}) : (TextUtils.isEmpty(str) || TextUtils.equals(str, "*")) ? jSONObject : bbd.b.a(str.split("\\."), jSONObject);
    }
}
