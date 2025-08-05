package com.alibaba.android.aura.taobao.adapter.extension.performance;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderIO;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.util.AURATraceUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import tb.aqs;
import tb.arc;
import tb.asw;
import tb.ath;
import tb.azl;
import tb.baw;
import tb.kge;

@AURAExtensionImpl(code = "aura.impl.performance.render")
/* loaded from: classes2.dex */
public final class e implements ath {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private f f2210a;

    static {
        kge.a(1690298893);
        kge.a(-450410939);
    }

    @Override // tb.ath
    public void a(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca7f23d3", new Object[]{this, aURARenderComponent});
        }
    }

    @Override // tb.ath
    public void a(List<AURARenderComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        }
    }

    @Override // tb.ath
    public void b(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66ed2032", new Object[]{this, aURARenderComponent});
        }
    }

    @Override // tb.atf
    public RecyclerView getContainerView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("a859cf93", new Object[]{this, context});
        }
        return null;
    }

    @Override // tb.atf
    public void onContentViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1c2042", new Object[]{this, view});
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

    @Override // tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        } else {
            this.f2210a = fVar;
        }
    }

    @Override // tb.ath
    public void a(AURAInputData<AURARenderIO> aURAInputData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b4bc11", new Object[]{this, aURAInputData});
            return;
        }
        for (azl azlVar : this.f2210a.b(azl.class)) {
            azlVar.a("aura.stage.render.stable", "渲染稳定耗时", asw.RENDER_SERVICE_CODE);
        }
    }

    @Override // tb.ath
    public void a(View view, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b016bcab", new Object[]{this, view, state});
            return;
        }
        List<azl> b = this.f2210a.b(azl.class);
        if (baw.a()) {
            Log.e("PERFORMANCE", "onLayoutComplete ++ " + System.currentTimeMillis());
        }
        AURATraceUtil.a(1, "aura-render-complete");
        AURATraceUtil.a(1);
        arc.a().a("渲染稳定", arc.a.a().a("AURA/performance").a("time", System.currentTimeMillis()).b());
        for (azl azlVar : b) {
            azlVar.a("aura.stage.render.stable", asw.RENDER_SERVICE_CODE, false, new HashMap<String, String>() { // from class: com.alibaba.android.aura.taobao.adapter.extension.performance.AURARenderPerformanceExtension$1
                {
                    e.this = this;
                    put(com.taobao.android.dinamicx_v4.animation.util.b.DELAY_MILLIS, "500");
                }
            });
        }
    }
}
