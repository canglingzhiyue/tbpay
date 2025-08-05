package tb;

import android.support.v7.widget.RecyclerView;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.a;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.bd;
import tb.atn;

@AURAExtensionImpl(code = "alidetail.impl.lifecycle.component.page.ext.dx")
/* loaded from: classes4.dex */
public final class ejp implements ejo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f27350a = "AliSDetailPageDXLifecycleExtExtension";
    private AURAGlobalData b;

    static {
        kge.a(-1640636757);
        kge.a(-1206640251);
    }

    @Override // tb.ejo
    public void b(RecyclerView recyclerView, atn.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf81ac2f", new Object[]{this, recyclerView, aVar});
        }
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

    public ejp() {
        emu.a("com.taobao.android.detail.core.standard.componentlifecycle.page.extension.impl.AliSDetailPageDXLifecycleExtExtension");
    }

    @Override // tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
        } else {
            this.b = aURAGlobalData;
        }
    }

    private DinamicXEngine a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("4d3f629f", new Object[]{this});
        }
        AURAGlobalData aURAGlobalData = this.b;
        if (aURAGlobalData == null) {
            arc.a().c("AliSDetailPageDXLifecycleExtExtension", "getDXEngine", "mGlobalData is null");
            return null;
        }
        bd bdVar = (bd) aURAGlobalData.get("auraRenderDxEngine", bd.class);
        if (bdVar == null) {
            arc.a().c("AliSDetailPageDXLifecycleExtExtension", "getDXEngine", "dinamicXEngineRouter is null");
            return null;
        }
        return bdVar.d();
    }

    @Override // tb.ejo
    public void a(RecyclerView recyclerView, atn.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("962d56ee", new Object[]{this, recyclerView, aVar});
        } else {
            a(aVar, true);
        }
    }

    @Override // tb.ejo
    public void c(RecyclerView recyclerView, atn.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8d60170", new Object[]{this, recyclerView, aVar});
        } else {
            a(aVar, false);
        }
    }

    private void a(atn.a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a8c1b94", new Object[]{this, aVar, new Boolean(z)});
            return;
        }
        AURARenderComponent a2 = aVar.a();
        if (a2 == null || !a.b.f2133a.equalsIgnoreCase(a2.getContainerType())) {
            return;
        }
        DinamicXEngine a3 = a();
        if (a3 == null) {
            arc.a().c("AliSDetailPageDXLifecycleExtExtension", "callComponentLifecycle", "dxEngine is null");
            return;
        }
        DXRootView a4 = emc.a(aVar.itemView);
        if (a4 == null) {
            arc.a().c("AliSDetailPageDXLifecycleExtExtension", "callComponentLifecycle", "dxRootView is null");
            return;
        }
        int adapterPosition = aVar.getAdapterPosition();
        if (z) {
            a3.b(a4, adapterPosition);
            ejj.a(a4);
            return;
        }
        a3.a(a4, adapterPosition);
        ejj.b(a4);
    }
}
