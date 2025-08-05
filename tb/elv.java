package tb;

import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

@AURAExtensionImpl(code = "alidetail.impl.aspect.lifecycle.mainscreen.resetparse")
/* loaded from: classes4.dex */
public final class elv extends arn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private AURAGlobalData f27423a;

    static {
        kge.a(537111266);
    }

    public static /* synthetic */ Object ipc$super(elv elvVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -362309544) {
            super.beforeServiceExecute((AURAInputData) objArr[0], (a) objArr[1]);
            return null;
        } else if (hashCode != 563256106) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (aqs) objArr[2]);
            return null;
        }
    }

    public elv() {
        emu.a("com.taobao.android.detail.core.standard.mainscreen.resetstate.AliSDetailMainScreenResetStateExtension");
    }

    @Override // tb.arn, tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
            return;
        }
        super.onDataChanged(aURAFlowData, aURAGlobalData, aqsVar);
        this.f27423a = aURAGlobalData;
    }

    @Override // tb.arn, tb.arp
    public void beforeServiceExecute(AURAInputData aURAInputData, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea679858", new Object[]{this, aURAInputData, aVar});
            return;
        }
        super.beforeServiceExecute(aURAInputData, aVar);
        if (this.f27423a == null || !com.alibaba.android.aura.service.parse.a.PARSE_SERVICE_CODE.equals(aVar.c())) {
            return;
        }
        this.f27423a.update("aura_parse_global_data_parse", null);
        ejc.a(this.f27423a, "AliDetailHasMainGalleryRendered", (Object) false);
    }
}
