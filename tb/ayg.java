package tb;

import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.b;
import com.alibaba.android.aura.datamodel.linkage.UMFLinkageTrigger;
import com.alibaba.android.aura.s;
import com.alibaba.android.umf.node.service.parse.state.tree.MultiTreeNode;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

@AURAExtensionImpl(code = "aura.impl.event.adjust.trigger")
/* loaded from: classes2.dex */
public final class ayg extends emt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private MultiTreeNode f25688a;
    private aqs b;

    static {
        kge.a(-649859127);
    }

    public static /* synthetic */ Object ipc$super(ayg aygVar, String str, Object... objArr) {
        if (str.hashCode() == 563256106) {
            super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (aqs) objArr[2]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.emt
    public boolean a(b bVar, aqx<b, Void> aqxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f7afcac", new Object[]{this, bVar, aqxVar})).booleanValue();
        }
        return false;
    }

    @Override // tb.emt
    public void a(UMFLinkageTrigger uMFLinkageTrigger, List<s> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7967f1cc", new Object[]{this, uMFLinkageTrigger, list});
            return;
        }
        MultiTreeNode multiTreeNode = this.f25688a;
        if (multiTreeNode == null) {
            this.b.a(new b(1, "AURALinkagePluginDomain", "adjustTriggerExt", "状态树为空，请检查解析服务是否正确保存状态树到全局变量中"));
        } else {
            uMFLinkageTrigger.setStateTree(multiTreeNode);
        }
    }

    @Override // tb.aqy, tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
            return;
        }
        super.onDataChanged(aURAFlowData, aURAGlobalData, aqsVar);
        this.f25688a = (MultiTreeNode) aURAGlobalData.get("global_data_render_root", MultiTreeNode.class);
        this.b = aqsVar;
    }
}
