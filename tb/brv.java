package tb;

import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.datamodel.render.a;
import com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager;
import com.alibaba.android.ultron.ext.vlayout.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class brv extends j<a> implements bqw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String b;
    private List<AURARenderComponent> c;
    private final brw d;

    static {
        kge.a(-1024417215);
        kge.a(-1056462915);
    }

    public static /* synthetic */ Object ipc$super(brv brvVar, String str, Object... objArr) {
        if (str.hashCode() == -1324657775) {
            super.onViewRecycled((RecyclerView.ViewHolder) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071b8aa", new Object[]{this, viewHolder, new Integer(i)});
        } else {
            a((a) viewHolder, i);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public /* synthetic */ RecyclerView.ViewHolder mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)}) : a(viewGroup, i);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public /* synthetic */ void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b10b5391", new Object[]{this, viewHolder});
        } else {
            a((a) viewHolder);
        }
    }

    public brv(VirtualLayoutManager virtualLayoutManager) {
        super(virtualLayoutManager);
        this.b = "UMFRenderContainerAdapter";
        this.d = new brw();
    }

    public void a(brj brjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e247827e", new Object[]{this, brjVar});
        } else {
            this.d.a(brjVar);
        }
    }

    @Override // tb.bqw
    public AURARenderComponent a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponent) ipChange.ipc$dispatch("be0f41c6", new Object[]{this, new Integer(i)});
        }
        List<AURARenderComponent> list = this.c;
        if (list == null) {
            return null;
        }
        int size = list.size();
        if (i >= 0 && i < size) {
            return this.c.get(i);
        }
        return null;
    }

    public void a(List<AURARenderComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        this.d.a(list);
        if (this.c == null) {
            this.c = new ArrayList();
        }
        this.c.clear();
        this.c.addAll(list);
    }

    public a a(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("6751c707", new Object[]{this, viewGroup, new Integer(i)});
        }
        brj b = this.d.b(i);
        if (b == null) {
            b = this.d.a();
            String str = "onCreateViewHolder#cannot find componentCreator, use default, viewType=" + i;
            bqe.a().c("UMFRenderContainerAdapter", str);
            bsu.a("UMFFramework", "TAG_RENDER_ADAPTER_ERROR", "UMF_RENDER_ADAPTER", str);
        }
        AURARenderComponentContainer a2 = this.d.a(i);
        if (a2 == null) {
            bqe.a().c("UMFRenderContainerAdapter", "onCreateViewHolder#containerInfo is null, viewType=" + i);
        }
        return new a(b.a(viewGroup, a2));
    }

    private AURARenderComponent a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponent) ipChange.ipc$dispatch("b75d01d3", new Object[]{this});
        }
        AURARenderComponent aURARenderComponent = new AURARenderComponent();
        aURARenderComponent.data = new AURARenderComponentData(null, null, null, null, new AURARenderComponentContainer(a.b.d, a.C0066a.f2132a, null, null, null, ""), null, null, null);
        return aURARenderComponent;
    }

    public void a(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b63fcb0e", new Object[]{this, aVar, new Integer(i)});
            return;
        }
        brj c = this.d.c(i);
        if (c == null) {
            return;
        }
        List<AURARenderComponent> list = this.c;
        if (list == null || i < 0 || i >= list.size()) {
            a.a(aVar, a());
        } else {
            a.a(aVar, this.c.get(i));
        }
        a(a.a(aVar), aVar.itemView);
        c.a(a.a(aVar), aVar.itemView, i);
    }

    private void a(AURARenderComponent aURARenderComponent, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4392661f", new Object[]{this, aURARenderComponent, view});
        } else if (!baw.a() || !bpc.f26032a) {
        } else {
            if (Build.VERSION.SDK_INT >= 16) {
                view.setImportantForAccessibility(1);
            }
            view.setContentDescription(aURARenderComponent.key);
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81bffa95", new Object[]{this, aVar});
            return;
        }
        super.onViewRecycled(aVar);
        if (this.d.c(aVar.getAdapterPosition()) == null) {
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        List<AURARenderComponent> list = this.c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        int a2 = this.d.a(i, Integer.MIN_VALUE);
        AURARenderComponent aURARenderComponent = null;
        List<AURARenderComponent> list = this.c;
        if (list != null) {
            aURARenderComponent = list.get(i);
        }
        if (a2 < 0) {
            bqd a3 = bqe.a();
            a3.c("UMFRenderContainerAdapter", "getItemViewType#find type error, position=" + i + ",viewType=" + a2 + ",data=" + aURARenderComponent);
        }
        bqd a4 = bqe.a();
        a4.a("UMFRenderContainerAdapter", "getItemViewType#viewtype=" + a2);
        return (aURARenderComponent == null || aURARenderComponent.data == null || aURARenderComponent.data.container == null || !aURARenderComponent.data.container.isPreset) ? a2 : -a2;
    }

    /* loaded from: classes2.dex */
    public static class a extends RecyclerView.ViewHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private AURARenderComponent f26073a;

        static {
            kge.a(-2020932025);
        }

        public static /* synthetic */ AURARenderComponent a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (AURARenderComponent) ipChange.ipc$dispatch("80064f40", new Object[]{aVar}) : aVar.f26073a;
        }

        public static /* synthetic */ AURARenderComponent a(a aVar, AURARenderComponent aURARenderComponent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AURARenderComponent) ipChange.ipc$dispatch("312578f1", new Object[]{aVar, aURARenderComponent});
            }
            aVar.f26073a = aURARenderComponent;
            return aURARenderComponent;
        }

        public a(View view) {
            super(view);
        }
    }
}
