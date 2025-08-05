package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.android.umf.datamodel.protocol.ultron.Global;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronProtocol;
import com.alibaba.android.umf.node.service.parse.state.tree.MultiTreeNode;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.ut.abtest.UTABTest;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

@AURAExtensionImpl(code = "aura.impl.parse.stateTree.abTest")
/* loaded from: classes2.dex */
public final class avl extends aso {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private q e;

    static {
        kge.a(-1198802668);
    }

    public static /* synthetic */ Object ipc$super(avl avlVar, String str, Object... objArr) {
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

    @Override // tb.aso, tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        } else {
            this.e = qVar;
        }
    }

    @Override // tb.aso, tb.asq
    public void b(MultiTreeNode multiTreeNode, UltronProtocol ultronProtocol) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45d9383e", new Object[]{this, multiTreeNode, ultronProtocol});
        } else {
            a(ultronProtocol);
        }
    }

    private void a(UltronProtocol ultronProtocol) {
        JSONObject jSONObject;
        q qVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4252155", new Object[]{this, ultronProtocol});
            return;
        }
        Global global = ultronProtocol.getGlobal();
        if (global == null) {
            return;
        }
        Object feature = global.getFeature();
        if (!(feature instanceof JSONObject) || (jSONObject = ((JSONObject) feature).getJSONObject("otherParams")) == null) {
            return;
        }
        String string = jSONObject.getString("dataTracks");
        if (TextUtils.isEmpty(string) || (qVar = this.e) == null) {
            return;
        }
        UTABTest.activateServer(string, qVar.e());
    }
}
