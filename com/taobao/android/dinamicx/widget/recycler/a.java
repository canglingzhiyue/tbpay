package com.taobao.android.dinamicx.widget.recycler;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.monitor.DXTraceUtil;
import com.taobao.android.dinamicx.widget.recycler.view.DXRecyclerView;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes5.dex */
public abstract class a extends RecyclerView.Adapter implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean d;
    private l e;
    private int f;
    private int c = -1;

    /* renamed from: a  reason: collision with root package name */
    private List<Integer> f12124a = new ArrayList();
    private List<Integer> b = new ArrayList();

    static {
        kge.a(841836829);
        kge.a(-904166155);
    }

    public abstract void a(RecyclerView.ViewHolder viewHolder, int i);

    public a() {
        c();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() { // from class: com.taobao.android.dinamicx.widget.recycler.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                    switch (str.hashCode()) {
                        case -1902625302:
                            super.onItemRangeInserted(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                            return null;
                        case -1756146412:
                            super.onItemRangeMoved(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                            return null;
                        case -238222724:
                            super.onItemRangeRemoved(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                            return null;
                        case 1882209744:
                            super.onItemRangeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                            return null;
                        default:
                            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                    }
                }

                @Override // android.support.v7.widget.RecyclerView.AdapterDataObserver
                public void onChanged() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ba16f5dc", new Object[]{this});
                    } else {
                        a.this.c();
                    }
                }

                @Override // android.support.v7.widget.RecyclerView.AdapterDataObserver
                public void onItemRangeChanged(int i, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("70303dd0", new Object[]{this, new Integer(i), new Integer(i2)});
                        return;
                    }
                    super.onItemRangeChanged(i, i2);
                    a.this.c();
                }

                @Override // android.support.v7.widget.RecyclerView.AdapterDataObserver
                public void onItemRangeInserted(int i, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8e983dea", new Object[]{this, new Integer(i), new Integer(i2)});
                        return;
                    }
                    super.onItemRangeInserted(i, i2);
                    a.this.c();
                }

                @Override // android.support.v7.widget.RecyclerView.AdapterDataObserver
                public void onItemRangeRemoved(int i, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f1cd027c", new Object[]{this, new Integer(i), new Integer(i2)});
                        return;
                    }
                    super.onItemRangeRemoved(i, i2);
                    a.this.c();
                }

                @Override // android.support.v7.widget.RecyclerView.AdapterDataObserver
                public void onItemRangeMoved(int i, int i2, int i3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("97535514", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
                        return;
                    }
                    super.onItemRangeMoved(i, i2, i3);
                    a.this.c();
                }
            });
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071b8aa", new Object[]{this, viewHolder, new Integer(i)});
        } else if (!this.d) {
            a(i, viewHolder);
        } else {
            this.e.a(viewHolder, i);
        }
    }

    public void a(int i, RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3adf4912", new Object[]{this, new Integer(i), viewHolder});
            return;
        }
        if (DXTraceUtil.b()) {
            DXTraceUtil.a("bindData position=" + i);
        }
        if (d(i)) {
            ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
            if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
                ((StaggeredGridLayoutManager.LayoutParams) layoutParams).setFullSpan(true);
            }
            if (layoutParams != null) {
                layoutParams.height = 0;
            }
            viewHolder.itemView.requestLayout();
            this.b.add(Integer.valueOf(i));
        } else {
            a(viewHolder, i);
        }
        if (!DXTraceUtil.b()) {
            return;
        }
        DXTraceUtil.a();
    }

    @Override // com.taobao.android.dinamicx.widget.recycler.e
    public List<Integer> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this}) : this.b;
    }

    @Override // com.taobao.android.dinamicx.widget.recycler.e
    public int b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{this, new Integer(i)})).intValue();
        }
        List<Integer> list = this.f12124a;
        if (list != null && i >= 0 && i < list.size()) {
            return this.f12124a.get(i).intValue();
        }
        return -1;
    }

    @Override // com.taobao.android.dinamicx.widget.recycler.e
    public int j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue() : this.c;
    }

    @Override // com.taobao.android.dinamicx.widget.recycler.e
    public boolean c(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab8b44dd", new Object[]{this, new Integer(i)})).booleanValue() : b(i) >= 0;
    }

    @Override // com.taobao.android.dinamicx.widget.recycler.e
    public void b(RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10ad517f", new Object[]{this, viewHolder, new Integer(i)});
        } else if (i < 0 || i >= getItemCount()) {
        } else {
            a(viewHolder, i);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.f12124a.clear();
        this.c = -1;
        int itemCount = getItemCount();
        int i = -1;
        for (int i2 = 0; i2 < itemCount; i2++) {
            if (d(i2)) {
                if (this.c == -1) {
                    this.c = i2;
                }
                i = i2;
            }
            this.f12124a.add(Integer.valueOf(i));
        }
    }

    public void a(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46606596", new Object[]{this, recyclerView});
        } else if (!(recyclerView instanceof DXRecyclerView) || !this.d || this.e != null) {
        } else {
            this.e = new l((DXRecyclerView) recyclerView, this, this.f);
        }
    }

    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public void q(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c36f1d8b", new Object[]{this, new Integer(i)});
        } else {
            this.f = i;
        }
    }
}
