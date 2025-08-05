package tb;

import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.datamodel.render.a;
import com.alibaba.android.aura.f;
import com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager;
import com.alibaba.android.ultron.ext.vlayout.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class atn extends j<a> implements atq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String b;
    private final List<AURARenderComponent> c;
    private final ato d;
    private f e;
    private final Handler f;

    static {
        kge.a(520957560);
        kge.a(-101160001);
    }

    public static /* synthetic */ Object ipc$super(atn atnVar, String str, Object... objArr) {
        if (str.hashCode() == -1066359532) {
            super.onDetachedFromRecyclerView((RecyclerView) objArr[0]);
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
    public /* synthetic */ void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c70be9f3", new Object[]{this, viewHolder});
        } else {
            a((a) viewHolder);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public /* synthetic */ void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("487ffd16", new Object[]{this, viewHolder});
        } else {
            b((a) viewHolder);
        }
    }

    public atn(VirtualLayoutManager virtualLayoutManager) {
        super(virtualLayoutManager);
        this.b = "AURARenderContainerAdapter";
        this.f = new Handler(Looper.getMainLooper());
        this.c = new ArrayList();
        this.d = new ato();
    }

    public void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c68e2fc", new Object[]{this, fVar});
            return;
        }
        this.e = fVar;
        this.d.a(fVar);
    }

    @Override // tb.atq
    public AURARenderComponent a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponent) ipChange.ipc$dispatch("be0f41c6", new Object[]{this, new Integer(i)});
        }
        if (i >= 0 && i < this.c.size()) {
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
        this.c.clear();
        if (list == null) {
            return;
        }
        this.c.addAll(list);
    }

    @Override // tb.atq
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            a(new ArrayList(this.c));
        }
        this.f.post(new Runnable() { // from class: tb.atn.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    atn.this.notifyDataSetChanged();
                }
            }
        });
    }

    public a a(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("65b57a72", new Object[]{this, viewGroup, new Integer(i)});
        }
        atc b = this.d.b(i);
        if (b == null) {
            b = this.d.a();
            arc.a().c("AURARenderContainerAdapter", "onCreateViewHolder", "cannot find componentCreator, use default, viewType=" + i);
        }
        AURARenderComponentContainer a2 = this.d.a(i);
        if (a2 == null) {
            ard a3 = arc.a();
            a3.c("AURARenderContainerAdapter", "onCreateViewHolder", "containerInfo is null, viewType=" + i);
        }
        View a4 = a(a2, viewGroup, i);
        if (a4 == null) {
            a4 = b.a(viewGroup, a2);
        }
        a(a2, viewGroup, a4, i);
        return new a(a4);
    }

    private View a(AURARenderComponentContainer aURARenderComponentContainer, ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c09f824a", new Object[]{this, aURARenderComponentContainer, viewGroup, new Integer(i)});
        }
        View view = null;
        for (ate ateVar : this.e.b(ate.class)) {
            View a2 = ateVar.a(aURARenderComponentContainer, viewGroup, i);
            if (view == null) {
                view = a2;
            }
        }
        return view;
    }

    private void a(AURARenderComponentContainer aURARenderComponentContainer, ViewGroup viewGroup, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfe2fb4c", new Object[]{this, aURARenderComponentContainer, viewGroup, view, new Integer(i)});
            return;
        }
        for (ate ateVar : this.e.b(ate.class)) {
            ateVar.a(aURARenderComponentContainer, viewGroup, view, i);
        }
    }

    private AURARenderComponent b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponent) ipChange.ipc$dispatch("931e7d94", new Object[]{this});
        }
        AURARenderComponent aURARenderComponent = new AURARenderComponent();
        aURARenderComponent.data = new AURARenderComponentData(null, null, null, null, new AURARenderComponentContainer(a.b.d, a.C0066a.f2132a, null, null, null, ""), null, null, null);
        return aURARenderComponent;
    }

    public void a(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a8bdbc3", new Object[]{this, aVar, new Integer(i)});
            return;
        }
        atc c = this.d.c(i);
        if (c == null) {
            return;
        }
        AURARenderComponent b = (i < 0 || i >= this.c.size()) ? b() : this.c.get(i);
        if (baz.a("enableGoneInvisibleViewV2", false) && b.isInvisible()) {
            aVar.itemView.setVisibility(8);
            return;
        }
        aVar.itemView.setVisibility(0);
        boolean a2 = a(b, aVar.itemView, i);
        a.a(aVar, b);
        if (!a2) {
            c.a(b, aVar.itemView, i);
        }
        b(b, aVar.itemView, i);
    }

    private boolean a(AURARenderComponent aURARenderComponent, View view, int i) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ebad0c8", new Object[]{this, aURARenderComponent, view, new Integer(i)})).booleanValue();
        }
        for (ate ateVar : this.e.b(ate.class)) {
            if (ateVar.a(aURARenderComponent, view, i)) {
                z = true;
            }
        }
        return z;
    }

    private void b(AURARenderComponent aURARenderComponent, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9115e7a3", new Object[]{this, aURARenderComponent, view, new Integer(i)});
            return;
        }
        for (ate ateVar : this.e.b(ate.class)) {
            ateVar.b(aURARenderComponent, view, i);
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76047f40", new Object[]{this, aVar});
        } else {
            a(aVar, true);
        }
    }

    public void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfdfe981", new Object[]{this, aVar});
        } else {
            a(aVar, false);
        }
    }

    private void a(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a8c1b94", new Object[]{this, aVar, new Boolean(z)});
            return;
        }
        AURARenderComponent a2 = a.a(aVar);
        if (a2 == null) {
            return;
        }
        int indexOf = this.c.indexOf(a2);
        List<atd> b = this.e.b(atd.class);
        if (b.isEmpty()) {
            return;
        }
        for (atd atdVar : b) {
            if (z) {
                atdVar.a(aVar, indexOf, a2);
            } else {
                atdVar.b(aVar, indexOf, a2);
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue() : this.c.size();
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c070a514", new Object[]{this, recyclerView});
        } else {
            super.onDetachedFromRecyclerView(recyclerView);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        int a2 = this.d.a(i, Integer.MIN_VALUE);
        AURARenderComponent a3 = a(i);
        if (a2 < 0) {
            ard a4 = arc.a();
            a4.c("AURARenderContainerAdapter", "getItemViewType", "find type error, position=" + i + ",viewType=" + a2 + ",data=" + a3);
        }
        return (a3 == null || a3.data == null || a3.data.container == null || !a3.data.container.isPreset) ? a2 : -a2;
    }

    @Override // tb.atq
    public List<AURARenderComponent> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : new ArrayList(this.c);
    }

    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.ViewHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private AURARenderComponent f25591a;

        static {
            kge.a(-589432957);
        }

        public static /* synthetic */ AURARenderComponent a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (AURARenderComponent) ipChange.ipc$dispatch("46592aab", new Object[]{aVar}) : aVar.f25591a;
        }

        public static /* synthetic */ AURARenderComponent a(a aVar, AURARenderComponent aURARenderComponent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AURARenderComponent) ipChange.ipc$dispatch("b96fdc26", new Object[]{aVar, aURARenderComponent});
            }
            aVar.f25591a = aURARenderComponent;
            return aURARenderComponent;
        }

        public a(View view) {
            super(view);
        }

        public AURARenderComponent a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (AURARenderComponent) ipChange.ipc$dispatch("b75d01d3", new Object[]{this}) : this.f25591a;
        }
    }
}
