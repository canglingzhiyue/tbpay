package tb;

import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronProtocol;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.AutoUt;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.alibaba.android.umf.node.service.parse.state.tree.MultiTreeNode;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfigBase;

@AURAExtensionImpl(code = "aura.impl.parse.stateTree.autoTrack")
/* loaded from: classes2.dex */
public final class awd extends aso {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private f e;

    static {
        kge.a(-745408559);
    }

    public static /* synthetic */ Object ipc$super(awd awdVar, String str, Object... objArr) {
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
        Component component;
        JSONObject jSONObject;
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
        if (!(features instanceof JSONObject) || (jSONObject = ((JSONObject) features).getJSONObject(BHRTaskConfigBase.TYPE_CONFIG_UT)) == null) {
            return;
        }
        AutoUt autoUt = (AutoUt) JSON.toJavaObject(jSONObject, AutoUt.class);
        autoUt.setPageName(a());
        data.setAutoUt(autoUt);
    }

    private String a() {
        awg awgVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        f fVar = this.e;
        if (fVar != null && (awgVar = (awg) fVar.a(awg.class)) != null) {
            return awgVar.a();
        }
        return null;
    }

    @Override // tb.aso, tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        } else {
            this.e = fVar;
        }
    }
}
