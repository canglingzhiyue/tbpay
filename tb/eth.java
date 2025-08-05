package tb;

import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.industry.tool.monitor.a;
import com.taobao.android.detail.industry.tool.monitor.b;
import tb.atn;

@AURAExtensionImpl(code = "industryDetail.impl.lifecycle.component.industry")
/* loaded from: classes4.dex */
public final class eth implements ate {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public AURAGlobalData f27560a;
    public aqs b;
    private q c;
    private final Handler d = new Handler(Looper.getMainLooper());
    private Runnable e;

    static {
        kge.a(-421146603);
        kge.a(1643319480);
    }

    public static /* synthetic */ q a(eth ethVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (q) ipChange.ipc$dispatch("37329b80", new Object[]{ethVar}) : ethVar.c;
    }

    public static /* synthetic */ void a(eth ethVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a9b415", new Object[]{ethVar, new Boolean(z)});
        } else {
            ethVar.a(z);
        }
    }

    public eth() {
        emu.a("com.taobao.android.detail.industry.adapter.component.DIComponentLifecycleExtensionImpl");
    }

    @Override // tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        } else {
            this.c = qVar;
        }
    }

    @Override // tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        try {
            arc.a().a("IndustryComponentLifecycleExtension", "退出页面，清除引用", "");
            a.a(this.c.e());
            etg.b(this.c.e());
            etg.c(this.c.e());
        } catch (Exception e) {
            ard a2 = arc.a();
            a2.b("DIComponentLifecycleExtensionImpl error:" + e.getMessage());
        }
    }

    @Override // tb.atd
    public void a(RecyclerView.ViewHolder viewHolder, int i, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afd1cfd", new Object[]{this, viewHolder, new Integer(i), aURARenderComponent});
            return;
        }
        try {
            a(aURARenderComponent, true);
        } catch (Exception unused) {
        }
    }

    @Override // tb.atd
    public void b(RecyclerView.ViewHolder viewHolder, int i, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a6cf7dc", new Object[]{this, viewHolder, new Integer(i), aURARenderComponent});
            return;
        }
        try {
            a(aURARenderComponent, false);
        } catch (Exception unused) {
        }
    }

    @Override // tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
        } else {
            this.f27560a = aURAGlobalData;
        }
    }

    @Override // tb.ate
    public View a(AURARenderComponentContainer aURARenderComponentContainer, ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c09f824a", new Object[]{this, aURARenderComponentContainer, viewGroup, new Integer(i)});
        }
        try {
            b bVar = new b(this.c);
            a.f10123a = bVar;
            bVar.a(aURARenderComponentContainer, viewGroup, i);
            return null;
        } catch (Exception e) {
            ard a2 = arc.a();
            a2.b("DIComponentLifecycleExtensionImpl error:" + e.getMessage());
            return null;
        }
    }

    @Override // tb.ate
    public void a(AURARenderComponentContainer aURARenderComponentContainer, ViewGroup viewGroup, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfe2fb4c", new Object[]{this, aURARenderComponentContainer, viewGroup, view, new Integer(i)});
            return;
        }
        try {
            if (a.f10123a == null) {
                return;
            }
            a.f10123a.a(aURARenderComponentContainer, viewGroup, view, i);
        } catch (Exception e) {
            ard a2 = arc.a();
            a2.b("DIComponentLifecycleExtensionImpl error:" + e.getMessage());
        }
    }

    @Override // tb.ate
    public boolean a(AURARenderComponent aURARenderComponent, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ebad0c8", new Object[]{this, aURARenderComponent, view, new Integer(i)})).booleanValue();
        }
        try {
            if (a.f10123a != null) {
                a.f10123a.a(this.c, aURARenderComponent, view);
            }
        } catch (Exception e) {
            ard a2 = arc.a();
            a2.b("DIComponentLifecycleExtensionImpl error:" + e.getMessage());
        }
        return false;
    }

    @Override // tb.ate
    public void b(AURARenderComponent aURARenderComponent, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9115e7a3", new Object[]{this, aURARenderComponent, view, new Integer(i)});
            return;
        }
        try {
            if (a.f10123a == null) {
                return;
            }
            a.f10123a.a(aURARenderComponent, view);
            a.f10123a = null;
        } catch (Exception e) {
            ard a2 = arc.a();
            a2.b("DIComponentLifecycleExtensionImpl error:" + e.getMessage());
        }
    }

    private void a(final AURARenderComponent aURARenderComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85660961", new Object[]{this, aURARenderComponent, new Boolean(z)});
        } else if (aURARenderComponent == null) {
        } else {
            if (etg.a(this.c.e(), aURARenderComponent.key) != null) {
                if (z && etg.b(this.c.e(), aURARenderComponent.key)) {
                    return;
                }
                if (!z && etg.c(this.c.e(), aURARenderComponent.key)) {
                    return;
                }
            }
            if (!ekr.COMPONENT_TYPE.equalsIgnoreCase(aURARenderComponent.key)) {
                return;
            }
            if (!z) {
                a();
                this.e = new Runnable() { // from class: tb.eth.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (etg.c(eth.a(eth.this).e(), aURARenderComponent.key)) {
                        } else {
                            eth.a(eth.this, false);
                        }
                    }
                };
                this.d.postDelayed(this.e, 100L);
                return;
            }
            a();
            this.e = new Runnable() { // from class: tb.eth.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (etg.b(eth.a(eth.this).e(), aURARenderComponent.key)) {
                    } else {
                        eth.a(eth.this, true);
                    }
                }
            };
            this.d.postDelayed(this.e, 100L);
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Runnable runnable = this.e;
        if (runnable == null) {
            return;
        }
        this.d.removeCallbacks(runnable);
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
            arc.a().c("IndustryComponentLifecycleExtension", "doCallAppearedIndustryViewHolderInstance", "recyclerView is null");
        } else if (b.getChildCount() == 0) {
            arc.a().c("IndustryComponentLifecycleExtension", "doCallAppearedIndustryViewHolderInstance", "child count of RecyclerView is 0");
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
                arc.a().c("IndustryComponentLifecycleExtension", "doCallAppearedIndustryViewHolderInstance", "firstVisibleItemIndex is less than 0");
                return;
            }
            int min = Math.min(emj.b(b, false) + 1, adapter.getItemCount());
            while (a3 < min) {
                try {
                    RecyclerView.ViewHolder findViewHolderForAdapterPosition = b.findViewHolderForAdapterPosition(a3);
                    if (!(findViewHolderForAdapterPosition instanceof atn.a)) {
                        ard a4 = arc.a();
                        a4.c("IndustryComponentLifecycleExtension", "doCallAppearedIndustryViewHolderInstance", a3 + " of RecycleView's viewHolder is not AURAContainerViewHolder");
                    } else if (findViewHolderForAdapterPosition.itemView != null && (a2 = ((atn.a) findViewHolderForAdapterPosition).a()) != null) {
                        arc.a().c("IndustryComponentLifecycleExtension", "doCallAppearedIndustryViewHolderInstance component key is : ", a2.key);
                        if (z) {
                            etg.b(this.c.e(), a2.key);
                        } else {
                            etg.c(this.c.e(), a2.key);
                        }
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

    private RecyclerView b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("b91610bb", new Object[]{this});
        }
        AURAGlobalData aURAGlobalData = this.f27560a;
        if (aURAGlobalData != null) {
            return (RecyclerView) aURAGlobalData.get("render_view", RecyclerView.class);
        }
        return null;
    }
}
