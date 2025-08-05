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

@AURAExtensionImpl(code = "alidetail.impl.lifecycle.component.dx")
/* loaded from: classes4.dex */
public final class ejk implements atd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f27347a = "AliSDetailDXComponentLifecycleExtension";
    private AURAGlobalData b;

    static {
        kge.a(-1859348221);
        kge.a(1021924628);
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

    public ejk() {
        emu.a("com.taobao.android.detail.core.standard.componentlifecycle.AliSDetailDXComponentLifecycleExtension");
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

    @Override // tb.atd
    public void a(RecyclerView.ViewHolder viewHolder, int i, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afd1cfd", new Object[]{this, viewHolder, new Integer(i), aURARenderComponent});
        } else {
            a(viewHolder, i, true);
        }
    }

    @Override // tb.atd
    public void b(RecyclerView.ViewHolder viewHolder, int i, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a6cf7dc", new Object[]{this, viewHolder, new Integer(i), aURARenderComponent});
        } else {
            a(viewHolder, i, false);
        }
    }

    private void a(RecyclerView.ViewHolder viewHolder, int i, boolean z) {
        AURARenderComponent a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78107a16", new Object[]{this, viewHolder, new Integer(i), new Boolean(z)});
        } else if (!(viewHolder instanceof atn.a) || (a2 = ((atn.a) viewHolder).a()) == null || !a.b.f2133a.equalsIgnoreCase(a2.getContainerType())) {
        } else {
            DXRootView a3 = emc.a(viewHolder.itemView);
            if (a3 == null) {
                arc.a().c("AliSDetailDXComponentLifecycleExtension", "callDXComponentLifecycle", "not DXRootView");
                return;
            }
            DinamicXEngine a4 = a();
            if (a4 == null) {
                arc.a().c("AliSDetailDXComponentLifecycleExtension", "callDXComponentLifecycle", "dxEngine is null");
            } else if (z) {
                a4.b(a3, i);
                ejj.a(a3);
            } else {
                a4.a(a3, i);
                ejj.b(a3);
            }
        }
    }

    private DinamicXEngine a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("4d3f629f", new Object[]{this});
        }
        AURAGlobalData aURAGlobalData = this.b;
        if (aURAGlobalData == null) {
            arc.a().c("AliSDetailDXComponentLifecycleExtension", "getDXEngine", "mGlobalData is null");
            return null;
        }
        bd bdVar = (bd) aURAGlobalData.get("auraRenderDxEngine", bd.class);
        if (bdVar == null) {
            arc.a().c("AliSDetailDXComponentLifecycleExtension", "getDXEngine", "dinamicXEngineRouter is null");
            return null;
        }
        return bdVar.d();
    }
}
