package com.taobao.android.detail2.core.mainpic;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.mainpic.b;
import java.util.ArrayList;
import java.util.List;
import tb.fjt;
import tb.kge;
import tb.ova;
import tb.ovf;
import tb.pig;
import tb.qnk;
import tb.rbv;

/* loaded from: classes5.dex */
public class c extends RecyclerView.Adapter<pig> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public pig.a b;
    private b.a c;
    private ovf e;
    private a f;
    private boolean g;

    /* renamed from: a  reason: collision with root package name */
    public List<ova> f11662a = new ArrayList();
    private List<pig> d = new ArrayList();

    static {
        kge.a(-1022426201);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        if (str.hashCode() == 1707705895) {
            return new Integer(super.getItemViewType(((Number) objArr[0]).intValue()));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public /* synthetic */ void onBindViewHolder(pig pigVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071b8aa", new Object[]{this, pigVar, new Integer(i)});
        } else {
            a(pigVar, i);
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [tb.pig, android.support.v7.widget.RecyclerView$ViewHolder] */
    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public /* synthetic */ pig mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)}) : a(viewGroup, i);
    }

    public c(a aVar, b.a aVar2, pig.a aVar3) {
        this.c = aVar2;
        this.b = aVar3;
        this.f = aVar;
        d();
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.e = new ovf();
        this.e.a(qnk.f, qnk.j);
        this.e.a(rbv.f, rbv.g);
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f11662a.size();
    }

    public pig a(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pig) ipChange.ipc$dispatch("56b553fc", new Object[]{this, viewGroup, new Integer(i)});
        }
        pig a2 = this.e.a(this.f, this.c, this.b, viewGroup, i);
        if (!this.d.contains(a2)) {
            this.d.add(a2);
        }
        return a2;
    }

    public void a(pig pigVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bba99b9", new Object[]{this, pigVar, new Integer(i)});
            return;
        }
        fjt.a(fjt.TAG_MAIN_PIC, "bindViewHolder" + i);
        pigVar.a((pig) this.f11662a.get(a(i)));
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        List<ova> list = this.f11662a;
        if (list == null || list.size() == 0) {
            return super.getItemViewType(i);
        }
        int a2 = a(i);
        ova ovaVar = this.f11662a.get(a2);
        if (ovaVar == null) {
            return super.getItemViewType(a2);
        }
        return this.e.a(ovaVar.a());
    }

    public int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i < this.f11662a.size()) {
            return i;
        }
        int size = this.f11662a.size() - b();
        if (size != 0) {
            return ((i - this.f11662a.size()) % size) + b();
        }
        return 0;
    }

    public int a(List<ova> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19a0b48e", new Object[]{this, list, new Boolean(z)})).intValue();
        }
        int itemCount = getItemCount();
        this.f11662a.clear();
        if (list == null) {
            return itemCount;
        }
        this.f11662a.addAll(list);
        this.g = z;
        return itemCount;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f11662a.size(); i2++) {
            ova ovaVar = this.f11662a.get(i2);
            if (ovaVar != null && rbv.f.equals(ovaVar.a())) {
                i++;
            }
        }
        return i;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue() : b(this.f11662a, this.g);
    }

    public int b(List<ova> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a0266f2d", new Object[]{this, list, new Boolean(z)})).intValue();
        }
        if (z) {
            return list.size() + 1;
        }
        return list.size();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        for (pig pigVar : this.d) {
            if (pigVar != null) {
                pigVar.c();
            }
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        for (pig pigVar : this.d) {
            if (pigVar != null) {
                pigVar.f();
            }
        }
    }
}
