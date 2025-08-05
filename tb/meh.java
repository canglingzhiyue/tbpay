package tb;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.home.LiveHomeController;
import com.taobao.live.home.dinamic.model.DinamicDataObject;
import com.taobao.live.home.dinamic.model.TemplateObject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class meh<T> extends RecyclerView.Adapter<med> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<T> f31042a;
    public mef b;
    public c e;
    public d f;
    public RecyclerView g;
    private Context j;
    public ArrayList<a> c = new ArrayList<>();
    public ArrayList<a> d = new ArrayList<>();
    private final Object h = new Object();
    private boolean i = true;
    private int k = 2;

    /* loaded from: classes7.dex */
    public interface a {
        View a(ViewGroup viewGroup);

        void a(View view);
    }

    /* loaded from: classes7.dex */
    public interface b {
        void a();
    }

    /* loaded from: classes7.dex */
    public interface c {
    }

    /* loaded from: classes7.dex */
    public interface d {
        boolean a(int i);
    }

    /* loaded from: classes7.dex */
    public interface e {
        void a();

        void b();
    }

    /* loaded from: classes7.dex */
    public interface f {
        void a();
    }

    /* loaded from: classes7.dex */
    public class g extends med {
        public g(View view) {
            super(view);
        }
    }

    public static /* synthetic */ Object ipc$super(meh mehVar, String str, Object... objArr) {
        if (str.hashCode() == -1079446313) {
            super.onAttachedToRecyclerView((RecyclerView) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public int b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{this, new Integer(i)})).intValue();
        }
        return 0;
    }

    public abstract med b(ViewGroup viewGroup, int i);

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue() : i;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public /* synthetic */ void onBindViewHolder(med medVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071b8aa", new Object[]{this, medVar, new Integer(i)});
        } else {
            a(medVar, i);
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [tb.med, android.support.v7.widget.RecyclerView$ViewHolder] */
    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public /* synthetic */ med mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)}) : a(viewGroup, i);
    }

    public meh(Context context) {
        a(context, new ArrayList());
    }

    private void a(Context context, List<T> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9773151", new Object[]{this, context, list});
            return;
        }
        this.j = context;
        this.f31042a = new ArrayList(list);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        mef mefVar = this.b;
        if (mefVar == null) {
            throw new NullPointerException("You should invoking setLoadMore() first");
        }
        mefVar.f();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        mef mefVar = this.b;
        if (mefVar == null) {
            throw new NullPointerException("You should invoking setLoadMore() first");
        }
        mefVar.g();
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30d80d2b", new Object[]{this, aVar});
        } else if (aVar == null) {
            throw new NullPointerException("ItemView can't be null");
        } else {
            this.c.add(aVar);
            notifyItemInserted(this.c.size() - 1);
        }
    }

    public void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ab3776c", new Object[]{this, aVar});
        } else if (aVar == null) {
            throw new NullPointerException("ItemView can't be null");
        } else {
            this.d.add(aVar);
            notifyItemInserted(((this.c.size() + i()) + this.d.size()) - 1);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        int size = this.c.size();
        this.c.clear();
        notifyItemRangeRemoved(0, size);
    }

    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.c.size();
    }

    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.d.size();
    }

    public mef f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mef) ipChange.ipc$dispatch("357ff3eb", new Object[]{this});
        }
        if (this.b == null) {
            this.b = new mee(this);
        }
        return this.b;
    }

    public void a(int i, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3619e21a", new Object[]{this, new Integer(i), eVar});
        } else {
            f().a(i, eVar);
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            f().a(i, (f) null);
        }
    }

    public void a(int i, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("361a5679", new Object[]{this, new Integer(i), fVar});
        } else {
            f().a(i, fVar);
        }
    }

    public void a(int i, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("361884fd", new Object[]{this, new Integer(i), bVar});
        } else {
            f().a(i, bVar);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfa8f4d7", new Object[]{this, recyclerView});
            return;
        }
        super.onAttachedToRecyclerView(recyclerView);
        this.g = recyclerView;
        registerAdapterDataObserver(new meg(this.g));
    }

    public void a(Collection<? extends T> collection) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2847c19", new Object[]{this, collection});
            return;
        }
        mef mefVar = this.b;
        if (mefVar != null) {
            mefVar.a(collection == null ? 0 : collection.size());
        }
        if (collection != null && collection.size() != 0) {
            synchronized (this.h) {
                this.f31042a.addAll(collection);
            }
        }
        if (collection != null) {
            i = collection.size();
        }
        if (this.i) {
            notifyItemRangeInserted((this.c.size() + i()) - i, i);
        }
        a("addAll notifyItemRangeInserted " + ((this.c.size() + i()) - i) + "," + i);
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        int size = this.f31042a.size();
        mef mefVar = this.b;
        if (mefVar != null) {
            mefVar.e();
        }
        synchronized (this.h) {
            this.f31042a.clear();
        }
        if (this.i) {
            notifyDataSetChanged();
        }
        a("clear notifyItemRangeRemoved " + this.c.size() + "," + size);
    }

    public Context h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("96c352e7", new Object[]{this}) : this.j;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    @Deprecated
    public final int getItemCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue() : this.f31042a.size() + this.c.size() + this.d.size();
    }

    public int i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue() : this.f31042a.size();
    }

    private View c(ViewGroup viewGroup, int i) {
        StaggeredGridLayoutManager.LayoutParams layoutParams;
        StaggeredGridLayoutManager.LayoutParams layoutParams2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("18db2c3c", new Object[]{this, viewGroup, new Integer(i)});
        }
        Iterator<a> it = this.c.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.hashCode() == i) {
                View a2 = next.a(viewGroup);
                if (a2.getLayoutParams() != null) {
                    layoutParams2 = new StaggeredGridLayoutManager.LayoutParams(a2.getLayoutParams());
                } else {
                    layoutParams2 = new StaggeredGridLayoutManager.LayoutParams(-1, -2);
                }
                layoutParams2.setFullSpan(true);
                a2.setLayoutParams(layoutParams2);
                return a2;
            }
        }
        Iterator<a> it2 = this.d.iterator();
        while (it2.hasNext()) {
            a next2 = it2.next();
            if (next2.hashCode() == i) {
                View a3 = next2.a(viewGroup);
                if (a3.getLayoutParams() != null) {
                    layoutParams = new StaggeredGridLayoutManager.LayoutParams(a3.getLayoutParams());
                } else {
                    layoutParams = new StaggeredGridLayoutManager.LayoutParams(-1, -2);
                }
                layoutParams.setFullSpan(true);
                a3.setLayoutParams(layoutParams);
                return a3;
            }
        }
        return null;
    }

    public final med a(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (med) ipChange.ipc$dispatch("56b3e77e", new Object[]{this, viewGroup, new Integer(i)});
        }
        View c2 = c(viewGroup, i);
        if (c2 != null) {
            return new g(c2);
        }
        final med b2 = b(viewGroup, i);
        if (this.e != null) {
            b2.itemView.setOnClickListener(new View.OnClickListener() { // from class: tb.meh.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    b2.getAdapterPosition();
                    meh.this.c.size();
                }
            });
        }
        if (this.f != null) {
            b2.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: tb.meh.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnLongClickListener
                public boolean onLongClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue() : meh.this.f.a(b2.getAdapterPosition() - meh.this.c.size());
                }
            });
        }
        return b2;
    }

    public final void a(med medVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("960a3ef7", new Object[]{this, medVar, new Integer(i)});
            return;
        }
        medVar.itemView.setId(i);
        if (this.c.size() != 0 && i < this.c.size()) {
            this.c.get(i).a(medVar.itemView);
            return;
        }
        int size = (i - this.c.size()) - this.f31042a.size();
        if (this.d.size() != 0 && size >= 0) {
            this.d.get(size).a(medVar.itemView);
        } else {
            b(medVar, i - this.c.size());
        }
    }

    public void b(med medVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77e80896", new Object[]{this, medVar, new Integer(i)});
            return;
        }
        a(medVar, i, this.k);
        c(i);
    }

    private int d(int i) {
        TemplateObject c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ad401d6b", new Object[]{this, new Integer(i)})).intValue();
        }
        List<T> list = this.f31042a;
        if (list != null && i >= 0 && i < list.size()) {
            T t = this.f31042a.get(i);
            if (t instanceof DinamicDataObject) {
                DinamicDataObject dinamicDataObject = (DinamicDataObject) t;
                if (!tio.a(dinamicDataObject.templateName) && LiveHomeController.a().d() != null && (c2 = LiveHomeController.a().d().c(dinamicDataObject.templateName)) != null && c2.span > 0 && c2.span <= 2) {
                    return c2.span;
                }
            }
        }
        return 2;
    }

    public void a(med medVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b3e12ec", new Object[]{this, medVar, new Integer(i), new Integer(i2)});
            return;
        }
        int d2 = d(i);
        ViewGroup.LayoutParams layoutParams = medVar.itemView.getLayoutParams();
        if (!(layoutParams instanceof StaggeredGridLayoutManager.LayoutParams)) {
            return;
        }
        StaggeredGridLayoutManager.LayoutParams layoutParams2 = (StaggeredGridLayoutManager.LayoutParams) layoutParams;
        if (d2 == i2) {
            layoutParams2.setFullSpan(true);
        } else {
            layoutParams2.setFullSpan(false);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    @Deprecated
    public final int getItemViewType(int i) {
        int size;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        if (this.c.size() != 0 && i < this.c.size()) {
            return this.c.get(i).hashCode();
        }
        if (this.d.size() != 0 && (size = (i - this.c.size()) - this.f31042a.size()) >= 0) {
            return this.d.get(size).hashCode();
        }
        return b(i - this.c.size());
    }

    public T c(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("3204ff79", new Object[]{this, new Integer(i)}) : this.f31042a.get(i);
    }

    private static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            mfj.a("RecyclerArrayAdapter", str);
        }
    }
}
