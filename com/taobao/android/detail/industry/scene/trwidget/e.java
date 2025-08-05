package com.taobao.android.detail.industry.scene.trwidget;

import android.text.TextUtils;
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
import java.util.HashMap;
import tb.aqs;
import tb.arc;
import tb.ard;
import tb.ema;
import tb.emu;
import tb.etn;
import tb.kge;

@AURAExtensionImpl(code = "industryDetail.impl.performance.monitor.render.trwidget.ext")
/* loaded from: classes4.dex */
public final class e implements etn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private aqs f10109a;

    static {
        kge.a(419738234);
        kge.a(549197931);
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

    public e() {
        emu.a("com.taobao.android.detail.industry.scene.trwidget.DITriverWidgetLifecycleExtension");
    }

    @Override // tb.etn
    public void a(FrameLayout frameLayout, JSONObject jSONObject, AURARenderComponent aURARenderComponent, TRWidgetInstance tRWidgetInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa8a4c67", new Object[]{this, frameLayout, jSONObject, aURARenderComponent, tRWidgetInstance});
        } else {
            arc.a().a("TriverWidget-LifecycleImpl", "renderWidget", "");
        }
    }

    @Override // tb.etn
    public void b(FrameLayout frameLayout, JSONObject jSONObject, AURARenderComponent aURARenderComponent, TRWidgetInstance tRWidgetInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b89df6c6", new Object[]{this, frameLayout, jSONObject, aURARenderComponent, tRWidgetInstance});
        } else {
            arc.a().a("TriverWidget-LifecycleImpl", "renderSuccess", "");
        }
    }

    @Override // tb.etn
    public void c(FrameLayout frameLayout, JSONObject jSONObject, AURARenderComponent aURARenderComponent, TRWidgetInstance tRWidgetInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6b1a125", new Object[]{this, frameLayout, jSONObject, aURARenderComponent, tRWidgetInstance});
        } else {
            arc.a().a("TriverWidget-LifecycleImpl", "renderFailed", "");
        }
    }

    @Override // tb.etn
    public void a(TRWidgetInstance tRWidgetInstance) {
        JSONObject widgetMonitor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14bd4af5", new Object[]{this, tRWidgetInstance});
            return;
        }
        try {
            if (tRWidgetInstance.getApp() == null) {
                return;
            }
            String appId = tRWidgetInstance.getApp().getAppId();
            if (TextUtils.isEmpty(appId) || (widgetMonitor = tRWidgetInstance.getWidgetMonitor()) == null) {
                return;
            }
            String string = widgetMonitor.getString("widgetFirstScreenCoverage");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("widgetId", appId);
            hashMap.putAll(widgetMonitor);
            ard a2 = arc.a();
            a2.a("TriverWidget-LifecycleImpl", "onWidgetDestroy: " + hashMap.toString(), "");
            if (Integer.parseInt(string) >= com.taobao.android.detail.core.aura.utils.f.k()) {
                return;
            }
            ema.a("trwidget#renderBlankError", "白屏", hashMap, this.f10109a);
        } catch (Throwable th) {
            ard a3 = arc.a();
            a3.c("TriverWidget-LifecycleImpl", "onWidgetDestroy: " + th.getMessage(), "");
        }
    }

    @Override // tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
        } else {
            this.f10109a = aqsVar;
        }
    }
}
