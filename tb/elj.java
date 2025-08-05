package tb;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderIO;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.arc;

@AURAExtensionImpl(code = "alidetail.impl.render.headerLayoutFixer")
/* loaded from: classes4.dex */
public final class elj extends atm implements ath {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private AURAFlowData f27399a;

    static {
        kge.a(-285557910);
        kge.a(-450410939);
    }

    @Override // tb.ath
    public void a(View view, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b016bcab", new Object[]{this, view, state});
        }
    }

    @Override // tb.ath
    public void a(AURAInputData<AURARenderIO> aURAInputData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b4bc11", new Object[]{this, aURAInputData});
        }
    }

    @Override // tb.ath
    public void a(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca7f23d3", new Object[]{this, aURARenderComponent});
        }
    }

    @Override // tb.ath
    public void b(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66ed2032", new Object[]{this, aURARenderComponent});
        }
    }

    public elj() {
        emu.a("com.taobao.android.detail.core.standard.mainscreen.AliDetailMainContainerHeaderLayoutFixerExtension");
    }

    @Override // tb.atm, tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
        } else {
            this.f27399a = aURAFlowData;
        }
    }

    @Override // tb.ath
    public void a(List<AURARenderComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        AURAFlowData aURAFlowData = this.f27399a;
        if (aURAFlowData == null) {
            return;
        }
        try {
            List list2 = (List) aURAFlowData.get("AURARenderViewLayoutHelpers", List.class);
            if (list2 == null) {
                return;
            }
            blt bltVar = new blt();
            bltVar.b_(1);
            list2.add(0, bltVar);
        } catch (Exception e) {
            arc.a().b("afterBindData#getLayoutHelpers", arc.a.a().b("AliDetailMainContainerExtension").a("errorMsg", e.getMessage()).b());
        }
    }
}
