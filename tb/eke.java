package tb;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.s;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

@AURAExtensionImpl(code = "alidetail.impl.event.picGalleryExpand")
/* loaded from: classes4.dex */
public final class eke extends arv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "picGalleryExpand";

    /* renamed from: a  reason: collision with root package name */
    private Context f27358a;
    private s b;
    private ejx c;

    static {
        kge.a(-1850110066);
    }

    public static /* synthetic */ Object ipc$super(eke ekeVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1219783041) {
            super.onCreate((q) objArr[0], (f) objArr[1]);
            return null;
        } else if (hashCode != 563256106) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (aqs) objArr[2]);
            return null;
        }
    }

    @Override // tb.arw
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : EVENT_TYPE;
    }

    public eke() {
        emu.a("com.taobao.android.detail.core.standard.mainpic.expand.PicGalleryExpandEvent");
    }

    @Override // tb.arv
    public void b(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186833d5", new Object[]{this, aURAEventIO});
            return;
        }
        ejx ejxVar = this.c;
        if (ejxVar == null) {
            return;
        }
        ejxVar.a(aURAEventIO, c());
    }

    @Override // tb.arv, tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
            return;
        }
        super.onCreate(qVar, fVar);
        this.f27358a = qVar.e();
        this.b = qVar.b();
    }

    @Override // tb.arv, tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
            return;
        }
        super.onDataChanged(aURAFlowData, aURAGlobalData, aqsVar);
        this.c = (ejx) aURAGlobalData.get("AliDetailPicGalleryExpandEntrance", ejx.class);
        if (this.c != null) {
            return;
        }
        this.c = new ekd(this.f27358a, this.b, (List) aURAGlobalData.get("render_view_item_models", List.class), (RecyclerView) aURAGlobalData.get("render_view", RecyclerView.class), (View) aURAGlobalData.get("AliDetailMainGalleryAnchorView", View.class));
        aURAGlobalData.update("AliDetailPicGalleryExpandEntrance", this.c);
    }
}
