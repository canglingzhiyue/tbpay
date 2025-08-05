package tb;

import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronProtocol;
import com.alibaba.android.umf.node.service.parse.state.tree.MultiTreeNode;
import com.android.alibaba.ip.runtime.IpChange;

@AURAExtensionImpl(code = "aura.impl.parse.stateTree.linkage")
/* loaded from: classes2.dex */
public final class ayj extends aso {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    @Deprecated
    public static final String GLOBAL_DATA_PROTOCOL = "global_data_linkage_protocol";
    public static final String GLOBAL_DATA_STATE_TREE = "global_data_linkage_state_tree";
    private AURAGlobalData e;

    static {
        kge.a(-1929438754);
    }

    @Override // tb.aso, tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
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
    public void b(MultiTreeNode multiTreeNode, UltronProtocol ultronProtocol) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45d9383e", new Object[]{this, multiTreeNode, ultronProtocol});
            return;
        }
        this.e.update(GLOBAL_DATA_STATE_TREE, multiTreeNode);
        this.e.update(GLOBAL_DATA_PROTOCOL, ultronProtocol);
    }

    @Override // tb.aso, tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
        } else {
            this.e = aURAGlobalData;
        }
    }
}
