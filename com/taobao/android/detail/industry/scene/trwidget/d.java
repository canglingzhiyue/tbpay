package com.taobao.android.detail.industry.scene.trwidget;

import android.os.Handler;
import android.os.Looper;
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
import tb.arc;
import tb.ard;
import tb.atd;
import tb.atn;
import tb.atq;
import tb.baw;
import tb.ejc;
import tb.ekr;
import tb.ema;
import tb.emj;
import tb.emu;
import tb.kge;

@AURAExtensionImpl(code = "industryDetail.impl.lifecycle.component.trwidget")
/* loaded from: classes4.dex */
public final class d implements atd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private AURAGlobalData f10106a;
    private aqs b;
    private final Handler c = new Handler(Looper.getMainLooper());
    private Runnable d;

    static {
        kge.a(1776705261);
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

    public static /* synthetic */ void a(d dVar, AURARenderComponent aURARenderComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6da7af2", new Object[]{dVar, aURARenderComponent, new Boolean(z)});
        } else {
            dVar.b(aURARenderComponent, z);
        }
    }

    public static /* synthetic */ void a(d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11078bfb", new Object[]{dVar, new Boolean(z)});
        } else {
            dVar.a(z);
        }
    }

    public d() {
        emu.a("com.taobao.android.detail.industry.scene.trwidget.DITriverWidgetComponentLifecycleExtension");
    }

    @Override // tb.atd
    public void a(RecyclerView.ViewHolder viewHolder, int i, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afd1cfd", new Object[]{this, viewHolder, new Integer(i), aURARenderComponent});
        } else {
            a(aURARenderComponent, true);
        }
    }

    @Override // tb.atd
    public void b(RecyclerView.ViewHolder viewHolder, int i, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a6cf7dc", new Object[]{this, viewHolder, new Integer(i), aURARenderComponent});
        } else {
            a(aURARenderComponent, false);
        }
    }

    @Override // tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
            return;
        }
        this.f10106a = aURAGlobalData;
        this.b = aqsVar;
    }

    private void a(final AURARenderComponent aURARenderComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85660961", new Object[]{this, aURARenderComponent, new Boolean(z)});
        } else if (aURARenderComponent == null) {
        } else {
            final String containerType = aURARenderComponent.getContainerType();
            if (!"triverwidget".equalsIgnoreCase(containerType) && !ekr.COMPONENT_TYPE.equalsIgnoreCase(containerType)) {
                return;
            }
            if (!z) {
                a();
                this.d = new Runnable() { // from class: com.taobao.android.detail.industry.scene.trwidget.d.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if ("triverwidget".equalsIgnoreCase(containerType)) {
                            d.a(d.this, aURARenderComponent, false);
                        } else {
                            d.a(d.this, false);
                        }
                    }
                };
                this.c.postDelayed(this.d, 100L);
                return;
            }
            a();
            if ("triverwidget".equalsIgnoreCase(containerType)) {
                b(aURARenderComponent, true);
                return;
            }
            arc.a().c("TriverWidget-ComponentLifecycle", "callTRWidgetInstanceLifeCycle", "doCallAppearedTRWidgetInstance");
            this.c.post(new Runnable() { // from class: com.taobao.android.detail.industry.scene.trwidget.d.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        d.a(d.this, true);
                    }
                }
            });
        }
    }

    private void a(boolean z) {
        AURARenderComponent a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        RecyclerView b = b();
        if (b == null) {
            arc.a().c("TriverWidget-ComponentLifecycle", "doCallAppearedTRWidgetInstance", "recyclerView is null");
        } else if (b.getChildCount() == 0) {
            arc.a().c("TriverWidget-ComponentLifecycle", "doCallAppearedTRWidgetInstance", "child count of RecyclerView is 0");
        } else {
            RecyclerView.Adapter adapter = b.getAdapter();
            if (!(adapter instanceof atq)) {
                if (baw.a()) {
                    throw new IllegalStateException("RecyclerView's adapter is not IAURARenderContainerAdapter");
                }
                return;
            }
            int a3 = emj.a(b, false);
            if (a3 < 0) {
                arc.a().c("TriverWidget-ComponentLifecycle", "doCallAppearedTRWidgetInstance", "firstVisibleItemIndex is less than 0");
                return;
            }
            int min = Math.min(emj.b(b, false) + 1, adapter.getItemCount());
            while (a3 < min) {
                try {
                    RecyclerView.ViewHolder findViewHolderForAdapterPosition = b.findViewHolderForAdapterPosition(a3);
                    if (!(findViewHolderForAdapterPosition instanceof atn.a)) {
                        ard a4 = arc.a();
                        a4.c("TriverWidget-ComponentLifecycle", "doCallAppearedTRWidgetInstance", a3 + " of RecycleView's viewHolder is not AURAContainerViewHolder");
                    } else if (findViewHolderForAdapterPosition.itemView != null && (a2 = ((atn.a) findViewHolderForAdapterPosition).a()) != null) {
                        arc.a().c("TriverWidget-ComponentLifecycle", "doCallTRWidgetInstanceLifeCycle component key is : ", a2.key);
                        b(a2, z);
                    }
                    a3++;
                } catch (Exception e) {
                    ema.a("pageLifecycle#error", e.getMessage(), this.b);
                    baw.a(e);
                    return;
                }
            }
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Runnable runnable = this.d;
        if (runnable == null) {
            return;
        }
        this.c.removeCallbacks(runnable);
    }

    private void b(AURARenderComponent aURARenderComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76b798e2", new Object[]{this, aURARenderComponent, new Boolean(z)});
            return;
        }
        com.taobao.android.detail.industry.tool.a.a("TriverWidget-ComponentLifecycle", "doCallTRWidgetInstanceLifeCycle: " + aURARenderComponent.getContainerType() + " , isAppear is : " + z);
        TRWidgetInstance a2 = a(aURARenderComponent.key);
        if (a2 == null) {
            return;
        }
        try {
            if (z) {
                com.taobao.android.detail.industry.tool.a.a("TriverWidget-ComponentLifecycle", "callTRWidgetInstanceLifeCycle 通知小部件 onAttach");
                a2.onAttach(null);
                return;
            }
            com.taobao.android.detail.industry.tool.a.a("TriverWidget-ComponentLifecycle", "callTRWidgetInstanceLifeCycle 通知小部件 onDetach");
            a2.onDetach(null);
        } catch (Throwable th) {
            com.taobao.android.detail.industry.tool.a.a("TriverWidget-ComponentLifecycle", "小部件attach/detach异常 exception: " + th.getMessage());
            ema.a("trwidget#containerViewError", "小部件attach/detach异常", this.b);
        }
    }

    private TRWidgetInstance a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TRWidgetInstance) ipChange.ipc$dispatch("2fbeae3f", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        ConcurrentHashMap<String, TRWidgetInstance> c = c();
        if (c == null) {
            arc.a().a("TriverWidget-ComponentLifecycle", "getTRWidgetInstance", "instanceMap is null");
            return null;
        }
        return c.get(str);
    }

    private RecyclerView b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("b91610bb", new Object[]{this});
        }
        AURAGlobalData aURAGlobalData = this.f10106a;
        if (aURAGlobalData != null) {
            return (RecyclerView) aURAGlobalData.get("render_view", RecyclerView.class);
        }
        return null;
    }

    private ConcurrentHashMap<String, TRWidgetInstance> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("7d52b13c", new Object[]{this}) : (ConcurrentHashMap) ejc.b(this.f10106a, "AliDetailTrWidgetInstanceMap", ConcurrentHashMap.class);
    }
}
