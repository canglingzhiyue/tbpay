package tb;

import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronProtocol;
import com.alibaba.android.umf.node.service.parse.state.tree.MultiTreeNode;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.zcache.n;
import java.util.Arrays;
import java.util.Objects;

@AURAExtensionImpl(code = "albbcashier.impl.parse.stateTree.preRender")
/* loaded from: classes9.dex */
public final class nbb extends aso {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean e = true;

    static {
        kge.a(702160565);
    }

    public static /* synthetic */ Object ipc$super(nbb nbbVar, String str, Object... objArr) {
        if (str.hashCode() == -1180925217) {
            super.a((MultiTreeNode) objArr[0], (UltronProtocol) objArr[1]);
            return null;
        }
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
            return;
        }
        super.a(multiTreeNode, ultronProtocol);
        try {
            if (!this.e) {
                arc.a().a("FrontCashierPreRender", tbt.PRE_RENDER, "isOpenBoolean false");
            } else if (multiTreeNode == null || multiTreeNode.data() == null || !Objects.equals(multiTreeNode.data().key, "overseaPayType")) {
            } else {
                arc.a().a("FrontCashierPreRender", tbt.PRE_RENDER, "下载zCache");
                n.a(Arrays.asList("front-cashier"));
            }
        } catch (Exception e) {
            ard a2 = arc.a();
            a2.c("FrontCashierPreRender", tbt.PRE_RENDER, "error:" + e.getMessage());
            e.printStackTrace();
        }
    }

    @Override // tb.aso, tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        } else {
            this.e = Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("cash4android", "preRenderIsOpen", "true"));
        }
    }
}
