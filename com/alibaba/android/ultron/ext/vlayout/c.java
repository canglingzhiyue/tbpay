package com.alibaba.android.ultron.ext.vlayout;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedList;
import java.util.List;
import tb.bls;
import tb.kge;

/* loaded from: classes2.dex */
public abstract class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final h<Integer> RANGE_ALL;
    public static final h<Integer> RANGE_EMPTY;
    public h<Integer> f = RANGE_EMPTY;
    public int g = 0;
    public final List<View> h = new LinkedList();

    public abstract int a(int i, boolean z, boolean z2, e eVar);

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
        }
    }

    public void a(int i, int i2, int i3, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c10b697c", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), eVar});
        }
    }

    public void a(int i, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6dc8bdc", new Object[]{this, new Integer(i), eVar});
        }
    }

    public abstract void a(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int i2, int i3, e eVar);

    public abstract void a(RecyclerView.Recycler recycler, RecyclerView.State state, e eVar);

    public void a(RecyclerView.State state, VirtualLayoutManager.a aVar, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3df29ad", new Object[]{this, state, aVar, eVar});
        }
    }

    public boolean a(int i, int i2, int i3, e eVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("606278dc", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), eVar, new Boolean(z)})).booleanValue();
        }
        return true;
    }

    public View b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("639153eb", new Object[]{this});
        }
        return null;
    }

    public void b(int i, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10a72dbb", new Object[]{this, new Integer(i), eVar});
        }
    }

    public abstract void b(RecyclerView.Recycler recycler, RecyclerView.State state, VirtualLayoutManager.c cVar, bls blsVar, e eVar);

    public void b(RecyclerView.State state, VirtualLayoutManager.a aVar, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("511b410c", new Object[]{this, state, aVar, eVar});
        }
    }

    public abstract void b_(int i);

    public void c(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad7360eb", new Object[]{this, eVar});
        }
    }

    public abstract void d(e eVar);

    public abstract int f();

    public abstract boolean g();

    static {
        kge.a(318039855);
        RANGE_ALL = h.a(Integer.MIN_VALUE, Integer.MAX_VALUE);
        RANGE_EMPTY = h.a(-1, -1);
    }

    public boolean d(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad401d7c", new Object[]{this, new Integer(i)})).booleanValue() : !this.f.a((h<Integer>) Integer.valueOf(i));
    }

    public void b(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f78e09", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (i2 < i) {
            throw new IllegalArgumentException("end should be larger or equeal then start position");
        } else {
            if (i == -1 && i2 == -1) {
                this.f = RANGE_EMPTY;
                a(i, i2);
            } else if ((i2 - i) + 1 != f()) {
                throw new MismatchChildCountException("ItemCount mismatch when range: " + this.f.toString() + " childCount: " + f());
            } else if (i == this.f.b().intValue() && i2 == this.f.a().intValue()) {
            } else {
                this.f = h.a(Integer.valueOf(i), Integer.valueOf(i2));
                a(i, i2);
            }
        }
    }

    public final h<Integer> e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("2fcb3d08", new Object[]{this}) : this.f;
    }
}
