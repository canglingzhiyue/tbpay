package com.taobao.android.detail.industry.scene.trwidget;

import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.triver.cannal_engine.TRWidgetInstance;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentHashMap;
import tb.aqs;
import tb.atn;
import tb.ejc;
import tb.ejo;
import tb.ema;
import tb.emu;
import tb.kge;

@AURAExtensionImpl(code = "industryDetail.impl.lifecycle.component.page.ext.trwidget")
/* loaded from: classes4.dex */
public final class a implements ejo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f10097a = "TriverWidget-PageLifecycle";
    private AURAGlobalData b;
    private aqs c;

    static {
        kge.a(228116142);
        kge.a(-1206640251);
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

    public a() {
        emu.a("com.taobao.android.detail.industry.scene.trwidget.DIPageTRWidgetLifecycleExtExtension");
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

    @Override // tb.ejo
    public void a(RecyclerView recyclerView, atn.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("962d56ee", new Object[]{this, recyclerView, aVar});
        } else {
            a(aVar, 3);
        }
    }

    @Override // tb.ejo
    public void b(RecyclerView recyclerView, atn.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf81ac2f", new Object[]{this, recyclerView, aVar});
        } else {
            a(aVar, 4);
        }
    }

    @Override // tb.ejo
    public void c(RecyclerView recyclerView, atn.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8d60170", new Object[]{this, recyclerView, aVar});
        } else {
            a(aVar, 5);
        }
    }

    private void a(atn.a aVar, int i) {
        TRWidgetInstance b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a8bdbc3", new Object[]{this, aVar, new Integer(i)});
            return;
        }
        AURARenderComponent a2 = aVar.a();
        if (a2 == null || (b = b(a2)) == null) {
            return;
        }
        try {
            if (3 == i) {
                com.taobao.android.detail.industry.tool.a.a("TriverWidget-PageLifecycle", "通知小部件 RESUMED: ");
                b.resume();
            } else if (4 == i) {
                com.taobao.android.detail.industry.tool.a.a("TriverWidget-PageLifecycle", "通知小部件 PAUSED: ");
                b.pause();
            } else if (5 != i) {
            } else {
                com.taobao.android.detail.industry.tool.a.a("TriverWidget-PageLifecycle", "通知小部件 STOPPED: ");
                b.stop();
            }
        } catch (Throwable th) {
            com.taobao.android.detail.industry.tool.a.a("TriverWidget-PageLifecycle", "小部件page_lifecycle异常：exception: " + th.getMessage());
            ema.a("trwidget#containerViewError", "小部件page_lifecycle异常", this.c);
        }
    }

    private boolean a(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ca7f23d7", new Object[]{this, aURARenderComponent})).booleanValue() : "triverwidget".equalsIgnoreCase(aURARenderComponent.getContainerType());
    }

    private TRWidgetInstance b(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TRWidgetInstance) ipChange.ipc$dispatch("3a28823f", new Object[]{this, aURARenderComponent});
        }
        if (!a(aURARenderComponent)) {
            return null;
        }
        ConcurrentHashMap<String, TRWidgetInstance> a2 = a();
        if (a2 == null) {
            com.taobao.android.detail.industry.tool.a.a("TriverWidget-PageLifecycle", "getTRWidgetInstance TRWidgetInstance is null");
            return null;
        } else if (!StringUtils.isEmpty(aURARenderComponent.key)) {
            return a2.get(aURARenderComponent.key);
        } else {
            return null;
        }
    }

    private ConcurrentHashMap<String, TRWidgetInstance> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("f779de7e", new Object[]{this}) : (ConcurrentHashMap) ejc.b(this.b, "AliDetailTrWidgetInstanceMap", ConcurrentHashMap.class);
    }
}
