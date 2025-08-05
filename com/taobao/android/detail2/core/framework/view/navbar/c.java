package com.taobao.android.detail2.core.framework.view.navbar;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.acj;
import tb.fjt;
import tb.fmd;
import tb.kge;

/* loaded from: classes5.dex */
public class c extends RecyclerView.Adapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public com.taobao.android.detail2.core.framework.b f11634a;
    public fmd b;
    private List<l> c = new ArrayList();
    private e d = new e();

    static {
        kge.a(599968851);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        if (str.hashCode() == 1707705895) {
            return new Integer(super.getItemViewType(((Number) objArr[0]).intValue()));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public c(com.taobao.android.detail2.core.framework.b bVar, fmd fmdVar, List<l> list) {
        this.f11634a = bVar;
        this.b = fmdVar;
        this.c.addAll(list);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public RecyclerView.ViewHolder mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)}) : this.d.a(i, viewGroup, this.b, this.f11634a);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071b8aa", new Object[]{this, viewHolder, new Integer(i)});
        } else if (!(viewHolder instanceof g)) {
        } else {
            ((g) viewHolder).c(this.c.get(i));
        }
    }

    public void a(List<l> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else {
            a(list, false);
        }
    }

    public void a(List<l> list, boolean z) {
        final ArrayList arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a0b49b", new Object[]{this, list, new Boolean(z)});
        } else if (this.f11634a.h().b().aG() > 0 && z && this.f11634a.k() != null && this.f11634a.k().a() && !this.c.isEmpty()) {
            final List<l> list2 = this.c;
            if (list == null) {
                arrayList = new ArrayList();
            } else {
                arrayList = new ArrayList(list);
            }
            try {
                acj.b a2 = acj.a(new acj.a() { // from class: com.taobao.android.detail2.core.framework.view.navbar.c.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.acj.a
                    public int getOldListSize() {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("cc12e44a", new Object[]{this})).intValue() : list2.size();
                    }

                    @Override // tb.acj.a
                    public int getNewListSize() {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("f8e07243", new Object[]{this})).intValue() : arrayList.size();
                    }

                    @Override // tb.acj.a
                    public boolean areItemsTheSame(int i, int i2) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("501767f6", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue() : ((l) list2.get(i)).a((l) arrayList.get(i2));
                    }

                    @Override // tb.acj.a
                    public boolean areContentsTheSame(int i, int i2) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("a1603f74", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue() : ((l) list2.get(i)) == ((l) arrayList.get(i2));
                    }
                });
                this.c = arrayList;
                a2.a(this);
            } catch (Throwable th) {
                fjt.a(fjt.TAG_FAST_ANIM, "Nav 局部刷新失败，自动降级为全部刷新。", th);
                b(list);
            }
        } else {
            b(list);
        }
    }

    public void b(List<l> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
            return;
        }
        this.c.clear();
        if (list != null && !list.isEmpty()) {
            this.c.addAll(list);
        }
        notifyDataSetChanged();
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        List<l> list = this.c;
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
        List<l> list = this.c;
        if (list == null) {
            return super.getItemViewType(i);
        }
        l lVar = list.get(i);
        if (lVar == null) {
            return super.getItemViewType(i);
        }
        return this.d.a(lVar.a());
    }
}
