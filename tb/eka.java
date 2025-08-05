package tb;

import android.support.v7.widget.RecyclerView;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.android.alibaba.ip.runtime.IpChange;

@AURAExtensionImpl(code = "picGallery.impl.render.canScroll")
/* loaded from: classes4.dex */
public final class eka implements atb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ejx f27354a;

    static {
        kge.a(-1343334700);
        kge.a(-1800596832);
    }

    @Override // tb.atb
    public boolean a(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4660659a", new Object[]{this, recyclerView})).booleanValue();
        }
        return false;
    }

    @Override // tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        }
    }

    @Override // tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    public eka() {
        emu.a("com.taobao.android.detail.core.standard.mainpic.expand.PicGalleryCanScrollExtension");
    }

    @Override // tb.atb
    public boolean b(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e101281b", new Object[]{this, recyclerView})).booleanValue();
        }
        ejx ejxVar = this.f27354a;
        if (ejxVar != null) {
            return ejxVar.a();
        }
        return true;
    }

    @Override // tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
        } else {
            this.f27354a = (ejx) aURAGlobalData.get("AliDetailPicGalleryExpandEntrance", ejx.class);
        }
    }
}
