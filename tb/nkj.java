package tb;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes7.dex */
public class nkj extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ArrayList<nkk> f31532a;
    private ArrayList<nkk> b;
    private boolean c;
    private RecyclerView.Adapter d;

    /* loaded from: classes7.dex */
    public static final class a extends RecyclerView.ViewHolder {
        static {
            kge.a(-388346575);
        }

        public a(View view) {
            super(view);
        }
    }

    static {
        kge.a(242162352);
    }

    public static /* synthetic */ Object ipc$super(nkj nkjVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1324657775:
                super.onViewRecycled((RecyclerView.ViewHolder) objArr[0]);
                return null;
            case -1079446313:
                super.onAttachedToRecyclerView((RecyclerView) objArr[0]);
                return null;
            case -1066359532:
                super.onDetachedFromRecyclerView((RecyclerView) objArr[0]);
                return null;
            case -1026650762:
                super.registerAdapterDataObserver((RecyclerView.AdapterDataObserver) objArr[0]);
                return null;
            case -955520525:
                super.onViewAttachedToWindow((RecyclerView.ViewHolder) objArr[0]);
                return null;
            case 1216347414:
                super.onViewDetachedFromWindow((RecyclerView.ViewHolder) objArr[0]);
                return null;
            case 1435121353:
                return new Boolean(super.onFailedToRecycleView((RecyclerView.ViewHolder) objArr[0]));
            case 1555132221:
                super.unregisterAdapterDataObserver((RecyclerView.AdapterDataObserver) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public nkj(ArrayList<nkk> arrayList, ArrayList<nkk> arrayList2, RecyclerView.Adapter adapter) {
        this.f31532a = new ArrayList<>();
        this.b = new ArrayList<>();
        this.d = adapter;
        RecyclerView.Adapter adapter2 = this.d;
        if (adapter2 != null) {
            setHasStableIds(adapter2.hasStableIds());
        }
        if (arrayList != null) {
            this.f31532a = arrayList;
        }
        if (arrayList2 != null) {
            this.b = arrayList2;
        }
    }

    public nkj a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nkj) ipChange.ipc$dispatch("1f45b0ed", new Object[]{this, new Boolean(z)});
        }
        this.c = z;
        return this;
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f31532a.size();
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.b.size();
    }

    public RecyclerView.Adapter c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.Adapter) ipChange.ipc$dispatch("69b7f1ef", new Object[]{this}) : this.d;
    }

    public boolean a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9501e36e", new Object[]{this, view})).booleanValue();
        }
        for (int i = 0; i < this.f31532a.size(); i++) {
            if (this.f31532a.get(i).b() == view.hashCode()) {
                this.f31532a.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        if (this.f31532a.size() <= 0) {
            return false;
        }
        this.f31532a.clear();
        return true;
    }

    public boolean b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9103724d", new Object[]{this, view})).booleanValue();
        }
        for (int i = 0; i < this.b.size(); i++) {
            if (this.b.get(i).b() == view.hashCode()) {
                this.b.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        if (this.b.size() <= 0) {
            return false;
        }
        this.b.clear();
        return true;
    }

    private boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        Iterator<nkk> it = this.f31532a.iterator();
        while (it.hasNext()) {
            if (it.next().b() == i) {
                return true;
            }
        }
        Iterator<nkk> it2 = this.b.iterator();
        while (it2.hasNext()) {
            if (it2.next().b() == i) {
                return true;
            }
        }
        return false;
    }

    private View b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("42ac29fc", new Object[]{this, new Integer(i)});
        }
        Iterator<nkk> it = this.f31532a.iterator();
        while (it.hasNext()) {
            nkk next = it.next();
            if (next.b() == i) {
                return next.a();
            }
        }
        Iterator<nkk> it2 = this.b.iterator();
        while (it2.hasNext()) {
            nkk next2 = it2.next();
            if (next2.b() == i) {
                return next2.a();
            }
        }
        return null;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public RecyclerView.ViewHolder mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)});
        }
        if (a(i)) {
            View b = b(i);
            ViewParent parent = b.getParent();
            if (this.c && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(b);
            }
            return new a(b);
        }
        return this.d.mo1596onCreateViewHolder(viewGroup, i);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071b8aa", new Object[]{this, viewHolder, new Integer(i)});
            return;
        }
        int a2 = a();
        if (i < a2) {
            return;
        }
        int i2 = i - a2;
        RecyclerView.Adapter adapter = this.d;
        if (adapter == null || i2 >= adapter.getItemCount()) {
            return;
        }
        this.d.onBindViewHolder(viewHolder, i2);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        int a2 = a() + b();
        RecyclerView.Adapter adapter = this.d;
        return adapter != null ? a2 + adapter.getItemCount() : a2;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue();
        }
        int a2 = a();
        if (i < a2) {
            return -1L;
        }
        int i2 = i - a2;
        RecyclerView.Adapter adapter = this.d;
        if (adapter != null && i >= a2 && i2 < adapter.getItemCount()) {
            return this.d.getItemId(i2);
        }
        return -1L;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        int a2 = a();
        if (i < a2) {
            return this.f31532a.get(i).b();
        }
        int i3 = i - a2;
        RecyclerView.Adapter adapter = this.d;
        if (adapter != null && i >= a2 && i3 < (i2 = adapter.getItemCount())) {
            return this.d.getItemViewType(i3);
        }
        return this.b.get(i3 - i2).b();
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b10b5391", new Object[]{this, viewHolder});
        } else if (viewHolder instanceof a) {
            super.onViewRecycled(viewHolder);
        } else {
            RecyclerView.Adapter adapter = this.d;
            if (adapter != null) {
                adapter.onViewRecycled(viewHolder);
            } else {
                super.onViewRecycled(viewHolder);
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("558a36c9", new Object[]{this, viewHolder})).booleanValue();
        }
        if (viewHolder instanceof a) {
            return super.onFailedToRecycleView(viewHolder);
        }
        RecyclerView.Adapter adapter = this.d;
        if (adapter != null) {
            return adapter.onFailedToRecycleView(viewHolder);
        }
        return super.onFailedToRecycleView(viewHolder);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c70be9f3", new Object[]{this, viewHolder});
        } else if (viewHolder instanceof a) {
            super.onViewAttachedToWindow(viewHolder);
        } else {
            RecyclerView.Adapter adapter = this.d;
            if (adapter != null) {
                adapter.onViewAttachedToWindow(viewHolder);
            } else {
                super.onViewAttachedToWindow(viewHolder);
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("487ffd16", new Object[]{this, viewHolder});
        } else if (viewHolder instanceof a) {
            super.onViewDetachedFromWindow(viewHolder);
        } else {
            RecyclerView.Adapter adapter = this.d;
            if (adapter != null) {
                adapter.onViewDetachedFromWindow(viewHolder);
            } else {
                super.onViewDetachedFromWindow(viewHolder);
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void registerAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2ce8d76", new Object[]{this, adapterDataObserver});
            return;
        }
        RecyclerView.Adapter adapter = this.d;
        if (adapter != null) {
            adapter.registerAdapterDataObserver(adapterDataObserver);
        }
        super.registerAdapterDataObserver(adapterDataObserver);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void unregisterAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cb16f3d", new Object[]{this, adapterDataObserver});
            return;
        }
        RecyclerView.Adapter adapter = this.d;
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(adapterDataObserver);
        }
        super.unregisterAdapterDataObserver(adapterDataObserver);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfa8f4d7", new Object[]{this, recyclerView});
            return;
        }
        RecyclerView.Adapter adapter = this.d;
        if (adapter != null) {
            adapter.onAttachedToRecyclerView(recyclerView);
        }
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c070a514", new Object[]{this, recyclerView});
            return;
        }
        RecyclerView.Adapter adapter = this.d;
        if (adapter != null) {
            adapter.onDetachedFromRecyclerView(recyclerView);
        }
        super.onDetachedFromRecyclerView(recyclerView);
    }
}
