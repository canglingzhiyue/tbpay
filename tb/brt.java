package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager;
import com.alibaba.android.ultron.ext.vlayout.c;
import com.alibaba.android.ultron.ext.vlayout.extend.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.bd;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class brt implements brs {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Context b;
    private brv c;
    private RecyclerView d;
    private VirtualLayoutManager e;
    private bd h;
    private atk j;

    /* renamed from: a  reason: collision with root package name */
    private final String f26068a = "UMFRenderContainerExtension";
    private final List<AURARenderComponent> f = new ArrayList();
    private final List<c> g = new ArrayList();
    private final bru i = new bru();
    private final Handler k = new Handler(Looper.getMainLooper());

    static {
        kge.a(1782046519);
        kge.a(540982845);
    }

    public static /* synthetic */ brv a(brt brtVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (brv) ipChange.ipc$dispatch("2debec6c", new Object[]{brtVar}) : brtVar.c;
    }

    @Override // tb.brs
    public void a(Context context, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4870cdb", new Object[]{this, context, aURARenderComponent});
            return;
        }
        this.b = context;
        d();
        a(aURARenderComponent);
        a(this.f);
    }

    @Override // tb.brs
    public void a(bd bdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("156633a2", new Object[]{this, bdVar});
            return;
        }
        bdVar.a(this);
        this.h = bdVar;
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        if (this.e == null) {
            this.e = new VirtualLayoutManager(this.b);
        }
        if (this.c != null) {
            return;
        }
        this.c = new brv(this.e);
    }

    private void a(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca7f23d3", new Object[]{this, aURARenderComponent});
            return;
        }
        this.f.clear();
        this.g.clear();
        this.i.a(this.f, this.g, aURARenderComponent);
    }

    private void a(List<AURARenderComponent> list) {
        List<DXTemplateItem> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list.isEmpty() || (a2 = asx.a(list)) == null) {
        } else {
            this.h.a(a2);
        }
    }

    private View a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("876fa4a2", new Object[]{this, context});
        }
        if (this.d == null) {
            this.d = b(context);
        }
        return this.d;
    }

    private RecyclerView b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("3133b7e5", new Object[]{this, context});
        }
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        recyclerView.setItemAnimator(null);
        recyclerView.setLayoutManager(this.e);
        recyclerView.setAdapter(this.c);
        return recyclerView;
    }

    @Override // tb.brs
    @Deprecated
    public View a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : a(this.b);
    }

    @Override // tb.brs
    public void a(brj brjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e247827e", new Object[]{this, brjVar});
        } else {
            this.c.a(brjVar);
        }
    }

    @Override // tb.brs
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        e();
        this.c.b(this.g);
        this.c.a(this.f);
        this.k.post(new Runnable() { // from class: tb.brt.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    brt.a(brt.this).notifyDataSetChanged();
                }
            }
        });
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        VirtualLayoutManager virtualLayoutManager = this.e;
        if (virtualLayoutManager == null) {
            return;
        }
        virtualLayoutManager.a((a) null);
    }

    @Override // tb.fve
    public void onNotificationListener(fvb fvbVar) {
        List<DXTemplateItem> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73876f63", new Object[]{this, fvbVar});
        } else if (fvbVar == null || (list = fvbVar.f28139a) == null || list.isEmpty()) {
        } else {
            bqe.a().a("UMFRenderContainerExtension", "onNotificationListener#refresh");
            b(list);
            c();
        }
    }

    private void b(List<DXTemplateItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
        } else if (list != null && !list.isEmpty()) {
            for (DXTemplateItem dXTemplateItem : list) {
                a(dXTemplateItem);
            }
        }
    }

    private void a(DXTemplateItem dXTemplateItem) {
        AURARenderComponentContainer aURARenderComponentContainer;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a042611", new Object[]{this, dXTemplateItem});
            return;
        }
        List<AURARenderComponent> list = this.f;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (AURARenderComponent aURARenderComponent : this.f) {
            AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
            if (aURARenderComponentData != null && aURARenderComponentData.container != null && (str = (aURARenderComponentContainer = aURARenderComponentData.container).name) != null && str.equals(dXTemplateItem.f11925a)) {
                aURARenderComponentContainer.version = String.valueOf(dXTemplateItem.b);
                aURARenderComponentContainer.isPreset = false;
            }
        }
    }

    @Override // tb.brs
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.c == null) {
        } else {
            if (this.j == null) {
                this.j = new atk();
            }
            this.j.a(new Runnable() { // from class: tb.brt.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        brt.a(brt.this).notifyDataSetChanged();
                    }
                }
            });
        }
    }
}
