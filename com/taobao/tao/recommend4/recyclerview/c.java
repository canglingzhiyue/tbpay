package com.taobao.tao.recommend4.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.utils.Debuggable;
import tb.kge;
import tb.ksp;
import tb.myg;
import tb.osm;

/* loaded from: classes8.dex */
public class c extends myg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private a f20974a;
    private RecyclerView b;
    private boolean c;
    private boolean d;
    private boolean e;

    /* loaded from: classes8.dex */
    public interface a {
        void a(boolean z, boolean z2);
    }

    static {
        kge.a(-1139161721);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1889771791:
                super.scrollToPositionWithOffset(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case -602204034:
                return new Integer(super.scrollVerticallyBy(((Number) objArr[0]).intValue(), (RecyclerView.Recycler) objArr[1], (RecyclerView.State) objArr[2]));
            case 365951829:
                return super.a((RecyclerView) objArr[0]);
            case 367307764:
                super.onItemsAdded((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                return null;
            case 371177099:
                super.scrollToPosition(((Number) objArr[0]).intValue());
                return null;
            case 1626618577:
                super.onLayoutChildren((RecyclerView.Recycler) objArr[0], (RecyclerView.State) objArr[1]);
                return null;
            case 2011679854:
                super.smoothScrollToPosition((RecyclerView) objArr[0], (RecyclerView.State) objArr[1], ((Number) objArr[2]).intValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // tb.myg
    public /* synthetic */ myg a(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (myg) ipChange.ipc$dispatch("15cffb55", new Object[]{this, recyclerView}) : b(recyclerView);
    }

    public c(int i, int i2, osm osmVar) {
        super(i, i2);
        this.c = true;
        this.d = false;
        this.e = true;
    }

    public c b(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("bf96a1bf", new Object[]{this, recyclerView});
        }
        super.a(recyclerView);
        this.b = recyclerView;
        return this;
    }

    @Override // android.support.v7.widget.StaggeredGridLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60f43ad1", new Object[]{this, recycler, state});
            return;
        }
        try {
            super.onLayoutChildren(recycler, state);
        } catch (Throwable th) {
            ksp.a("NestedLayout", "onLayoutChild error", th);
            if (Debuggable.isDebug()) {
                throw th;
            }
        }
    }

    @Override // android.support.v7.widget.StaggeredGridLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15e4abf4", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
            return;
        }
        try {
            super.onItemsAdded(recyclerView, i, i2);
        } catch (Throwable unused) {
        }
    }

    @Override // tb.myg, android.support.v7.widget.StaggeredGridLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dc1b187e", new Object[]{this, new Integer(i), recycler, state})).intValue();
        }
        if (!this.e) {
            return 0;
        }
        int scrollVerticallyBy = super.scrollVerticallyBy(i, recycler, state);
        if (scrollVerticallyBy == 0) {
            if (i > 0) {
                a(false, true);
            } else if (i < 0) {
                a(true, false);
            }
        } else if (i != 0) {
            a(b(scrollVerticallyBy), false);
        }
        return scrollVerticallyBy;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2518f52b", new Object[]{this, aVar});
            return;
        }
        this.f20974a = aVar;
        b(this.c, this.d);
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    private void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        boolean z3 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        if (this.c == z && this.d == z2) {
            z3 = false;
        }
        this.c = z;
        this.d = z2;
        if (!z3) {
            return;
        }
        b(z, z2);
    }

    @Override // android.support.v7.widget.StaggeredGridLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("161fb68b", new Object[]{this, new Integer(i)});
            return;
        }
        a(i);
        super.scrollToPosition(i);
    }

    @Override // android.support.v7.widget.StaggeredGridLayoutManager
    public void scrollToPositionWithOffset(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f5c5ef1", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        a(i);
        super.scrollToPositionWithOffset(i, i2);
    }

    @Override // android.support.v7.widget.StaggeredGridLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77e7cc6e", new Object[]{this, recyclerView, state, new Integer(i)});
            return;
        }
        a(i);
        super.smoothScrollToPosition(recyclerView, state, i);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.c;
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView == null) {
            return;
        }
        if (i == 0) {
            a(true, false);
            return;
        }
        if (i != recyclerView.getAdapter().getItemCount() - 1) {
            z = false;
        }
        a(false, z);
    }

    private boolean b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d66c3e", new Object[]{this, new Integer(i)})).booleanValue();
        }
        View findViewByPosition = findViewByPosition(0);
        return !(findViewByPosition == null || findViewByPosition.getTop() < 0) && i < 0;
    }

    private void b(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90ff8829", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        a aVar = this.f20974a;
        if (aVar == null) {
            return;
        }
        aVar.a(z, z2);
    }
}
