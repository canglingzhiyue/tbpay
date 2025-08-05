package tb;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.uikit.feature.view.TRecyclerView;

/* loaded from: classes6.dex */
public abstract class isz<MODEL> extends RecyclerView.Adapter<itd> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public itb f29301a;
    private ListStyle b;
    private Activity c;
    private ium d;
    private int e;
    private final itc f = new itc(10001);
    private final itc g = new itc(20001);
    private MODEL h;

    static {
        kge.a(-1986147070);
    }

    public abstract Object a(int i);

    public abstract itd a(ViewGroup viewGroup);

    public abstract boolean a(Object obj);

    public abstract BaseTypedBean b(int i);

    public abstract itd b(ViewGroup viewGroup);

    public abstract boolean b(Object obj);

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public /* synthetic */ void onBindViewHolder(itd itdVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071b8aa", new Object[]{this, itdVar, new Integer(i)});
        } else {
            a(itdVar, i);
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [tb.itd, android.support.v7.widget.RecyclerView$ViewHolder] */
    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public /* synthetic */ itd mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)}) : a(viewGroup, i);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public /* synthetic */ void onViewAttachedToWindow(itd itdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c70be9f3", new Object[]{this, itdVar});
        } else {
            b(itdVar);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public /* synthetic */ void onViewDetachedFromWindow(itd itdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("487ffd16", new Object[]{this, itdVar});
        } else {
            c(itdVar);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public /* synthetic */ void onViewRecycled(itd itdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b10b5391", new Object[]{this, itdVar});
        } else {
            a(itdVar);
        }
    }

    public isz(itb itbVar, ListStyle listStyle, Activity activity, ium iumVar, int i, MODEL model) {
        this.f29301a = itbVar;
        this.b = listStyle;
        this.c = activity;
        this.d = iumVar;
        this.e = i;
        this.h = model;
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }

    public ListStyle c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ListStyle) ipChange.ipc$dispatch("daa9f9e7", new Object[]{this}) : this.b;
    }

    public Activity d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("26eeb89d", new Object[]{this}) : this.c;
    }

    public ium e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ium) ipChange.ipc$dispatch("2dccb9f9", new Object[]{this}) : this.d;
    }

    public int f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue() : this.e;
    }

    public itd a(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (itd) ipChange.ipc$dispatch("56b24e51", new Object[]{this, viewGroup, new Integer(i)});
        }
        if (i >= 10001 && i < 20001) {
            itd a2 = a(viewGroup);
            return a2 == null ? this.f29301a.b(i, this.c, this.d, viewGroup, this.e, this.h) : a2;
        } else if (i >= 20001) {
            itd b = b(viewGroup);
            return b == null ? this.f29301a.b(i, this.c, this.d, viewGroup, this.e, this.h) : b;
        } else {
            return this.f29301a.a(i, this.c, this.d, viewGroup, this.e, this.h);
        }
    }

    public void a(itd itdVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc0a0344", new Object[]{this, itdVar, new Integer(i)});
            return;
        }
        try {
            itdVar.b(i, a(i));
        } catch (Exception e) {
            this.d.getCore().b().b("AbsListAdapter", "bind ViewHolder to data error", e);
        }
    }

    public void a(itd itdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee52e39f", new Object[]{this, itdVar});
        } else {
            itdVar.p();
        }
    }

    public void b(itd itdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcd5ea20", new Object[]{this, itdVar});
        } else {
            itdVar.t();
        }
    }

    public void c(itd itdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb58f0a1", new Object[]{this, itdVar});
        } else {
            itdVar.s();
        }
    }

    public void a(ListStyle listStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b84a965", new Object[]{this, listStyle});
        } else {
            this.b = listStyle;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        Object a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i >= getItemCount() || (a2 = a(i)) == null) {
            return 0;
        }
        if (a(a2)) {
            return this.f.a(b(i), this.b);
        }
        if (b(a2)) {
            return this.g.a(b(i), this.b);
        }
        return this.f29301a.a(this.b, a2.getClass());
    }

    public int a(BaseCellBean baseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fd0c272d", new Object[]{this, baseCellBean})).intValue();
        }
        if (baseCellBean == null) {
            return 0;
        }
        if (a((Object) baseCellBean)) {
            return this.f.a(baseCellBean, this.b);
        }
        if (b(baseCellBean)) {
            return this.g.a(baseCellBean, this.b);
        }
        return this.f29301a.a(this.b, baseCellBean.getClass());
    }

    public void a(int i, TRecyclerView tRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0eab0bf", new Object[]{this, new Integer(i), tRecyclerView});
        } else {
            notifyItemRangeInserted((getItemCount() + tRecyclerView.getHeaderViewsCount()) - i, i);
        }
    }

    public void c(int i, int i2, TRecyclerView tRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dba6b70", new Object[]{this, new Integer(i), new Integer(i2), tRecyclerView});
        } else {
            notifyItemRangeChanged(i + tRecyclerView.getHeaderViewsCount(), i2);
        }
    }

    public MODEL g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MODEL) ipChange.ipc$dispatch("e4566784", new Object[]{this}) : this.h;
    }
}
