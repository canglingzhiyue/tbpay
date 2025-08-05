package tb;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.behavior.b;
import com.taobao.android.detail.ttdetail.behavior.c;
import com.taobao.android.detail.ttdetail.component.module.d;
import com.taobao.android.detail.ttdetail.component.module.e;
import com.taobao.android.detail.ttdetail.utils.bq;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.android.detail.ttdetail.utils.o;
import com.taobao.android.detail.ttdetail.utils.y;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
public class ono extends RecyclerView.Adapter<a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f32213a;
    private eyx b;
    private final List<a> d = new ArrayList(10);
    private final List<d> c = new ArrayList(0);
    private final Set<String> e = new HashSet();

    static {
        kge.a(-1153617610);
    }

    public static /* synthetic */ Object ipc$super(ono onoVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1324657775:
                super.onViewRecycled((RecyclerView.ViewHolder) objArr[0]);
                return null;
            case -955520525:
                super.onViewAttachedToWindow((RecyclerView.ViewHolder) objArr[0]);
                return null;
            case 1216347414:
                super.onViewDetachedFromWindow((RecyclerView.ViewHolder) objArr[0]);
                return null;
            case 1435121353:
                return new Boolean(super.onFailedToRecycleView((RecyclerView.ViewHolder) objArr[0]));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public /* synthetic */ void onBindViewHolder(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071b8aa", new Object[]{this, aVar, new Integer(i)});
        } else {
            a(aVar, i);
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [tb.ono$a, android.support.v7.widget.RecyclerView$ViewHolder] */
    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public /* synthetic */ a mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)}) : a(viewGroup, i);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public /* synthetic */ boolean onFailedToRecycleView(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("558a36c9", new Object[]{this, aVar})).booleanValue() : d(aVar);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public /* synthetic */ void onViewAttachedToWindow(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c70be9f3", new Object[]{this, aVar});
        } else {
            a(aVar);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public /* synthetic */ void onViewDetachedFromWindow(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("487ffd16", new Object[]{this, aVar});
        } else {
            b(aVar);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public /* synthetic */ void onViewRecycled(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b10b5391", new Object[]{this, aVar});
        } else {
            c(aVar);
        }
    }

    public ono(Context context, eyx eyxVar) {
        this.f32213a = context;
        this.b = eyxVar;
    }

    public <F extends d> void a(List<F> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        this.c.clear();
        if (list == null) {
            return;
        }
        this.c.addAll(list);
    }

    public List<d> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.c;
    }

    public <F extends d> F a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (F) ipChange.ipc$dispatch("e131fe26", new Object[]{this, new Integer(i)});
        }
        if (i >= 0 && i < this.c.size()) {
            return (F) this.c.get(i);
        }
        return null;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        for (a aVar : this.d) {
            a(aVar.a());
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8a4688b", new Object[]{this, aVar});
            return;
        }
        super.onViewAttachedToWindow(aVar);
        this.d.add(aVar);
        if (this.b.a().c()) {
            return;
        }
        d a2 = aVar.a();
        String a3 = bq.a(a2);
        if (TextUtils.isEmpty(a3)) {
            return;
        }
        c.a(this.f32213a, a2);
        b.a(this.f32213a, a3, 1);
    }

    private void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b69e8833", new Object[]{this, dVar});
        } else if (dVar == null) {
        } else {
            dVar.willDisAppear();
            dVar.disAppear();
            if (this.b.a().c()) {
                return;
            }
            String a2 = bq.a(dVar);
            if (TextUtils.isEmpty(a2)) {
                return;
            }
            b.a(this.f32213a, a2, 2);
        }
    }

    public void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("427fd2cc", new Object[]{this, aVar});
            return;
        }
        super.onViewDetachedFromWindow(aVar);
        if (!this.d.remove(aVar)) {
            if (o.a(this.f32213a)) {
                Toast.makeText(this.f32213a, "mShowingVH.remove(holder) failed", 0).show();
            }
            i.a("MainRecyclerAdapter", "mShowingVH.remove(holder) failed, for vh: " + aVar.toString());
        }
        a(aVar.a());
    }

    public void c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c5b3d0d", new Object[]{this, aVar});
        } else {
            super.onViewRecycled(aVar);
        }
    }

    public boolean d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f636a752", new Object[]{this, aVar})).booleanValue() : super.onFailedToRecycleView(aVar);
    }

    public a a(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("7d453a7d", new Object[]{this, viewGroup, new Integer(i)}) : new a((FrameLayout) LayoutInflater.from(y.a(viewGroup)).inflate(R.layout.tt_detail_main_cell_container, viewGroup, false));
    }

    public void a(a aVar, int i) {
        JSONObject d;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2be91bd8", new Object[]{this, aVar, new Integer(i)});
            return;
        }
        FrameLayout frameLayout = (FrameLayout) aVar.itemView;
        View childAt = frameLayout.getChildAt(0);
        d a2 = a(i);
        aVar.a(a2);
        a2.create();
        View componentView = a2.getComponentView(childAt);
        if (childAt != componentView) {
            frameLayout.removeAllViews();
            frameLayout.addView(componentView, new FrameLayout.LayoutParams(-1, -2));
        }
        a2.willAppear();
        a2.didAppear();
        if (!com.taobao.android.detail.ttdetail.component.c.ComponentFatigueContainer.a() || !(a2 instanceof e) || (d = a2.getComponentData().d()) == null || (string = d.getString("componentId4Fatigue")) == null || this.e.contains(string)) {
            return;
        }
        this.e.add(string);
        com.taobao.android.detail.ttdetail.component.c.ComponentFatigueContainer.b(string);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue() : this.c.get(i).getComponentViewType();
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue() : this.c.size();
    }

    /* loaded from: classes4.dex */
    public static class a extends RecyclerView.ViewHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private d f32214a;

        static {
            kge.a(1283239064);
        }

        public void a(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b69e8833", new Object[]{this, dVar});
            } else {
                this.f32214a = dVar;
            }
        }

        public a(View view) {
            super(view);
        }

        public d a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("63731b33", new Object[]{this}) : this.f32214a;
        }
    }
}
