package tb;

import android.widget.FrameLayout;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.cannal_engine.TRWidgetInstance;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.industry.tool.monitor.a;
import com.taobao.android.detail.industry.tool.monitor.b;

@AURAExtensionImpl(code = "industryDetail.impl.component.trwidget.lifecycle")
/* loaded from: classes4.dex */
public final class etj implements etn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public q f27563a;

    static {
        kge.a(1155303278);
        kge.a(549197931);
    }

    @Override // tb.etn
    public void a(FrameLayout frameLayout, JSONObject jSONObject, AURARenderComponent aURARenderComponent, TRWidgetInstance tRWidgetInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa8a4c67", new Object[]{this, frameLayout, jSONObject, aURARenderComponent, tRWidgetInstance});
        }
    }

    @Override // tb.etn
    public void a(TRWidgetInstance tRWidgetInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14bd4af5", new Object[]{this, tRWidgetInstance});
        }
    }

    @Override // tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
        }
    }

    @Override // tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    public etj() {
        emu.a("com.taobao.android.detail.industry.adapter.component.DITriverWidgetLifecycleExtensionImpl");
    }

    @Override // tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        } else {
            this.f27563a = qVar;
        }
    }

    @Override // tb.etn
    public void b(FrameLayout frameLayout, JSONObject jSONObject, AURARenderComponent aURARenderComponent, TRWidgetInstance tRWidgetInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b89df6c6", new Object[]{this, frameLayout, jSONObject, aURARenderComponent, tRWidgetInstance});
            return;
        }
        try {
            b a2 = a.a(this.f27563a.e(), aURARenderComponent.key);
            if (a2 == null) {
                return;
            }
            a2.b(aURARenderComponent, tRWidgetInstance.getRootView());
        } catch (Exception e) {
            ard a3 = arc.a();
            a3.b("DITriverWidgetLifecycleExtensionImpl error:" + e.getMessage());
        }
    }

    @Override // tb.etn
    public void c(FrameLayout frameLayout, JSONObject jSONObject, AURARenderComponent aURARenderComponent, TRWidgetInstance tRWidgetInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6b1a125", new Object[]{this, frameLayout, jSONObject, aURARenderComponent, tRWidgetInstance});
            return;
        }
        try {
            b a2 = a.a(this.f27563a.e(), aURARenderComponent.key);
            if (a2 == null) {
                return;
            }
            a2.c(aURARenderComponent, tRWidgetInstance.getRootView());
        } catch (Exception e) {
            ard a3 = arc.a();
            a3.b("DITriverWidgetLifecycleExtensionImpl error:" + e.getMessage());
        }
    }
}
