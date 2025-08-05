package tb;

import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.lks;

/* loaded from: classes7.dex */
public class lik extends StaggeredGridLayoutManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private RecyclerView f30655a;
    private boolean b;
    private boolean c;
    private boolean d;
    private lks.c e;
    private Parcelable f;

    static {
        kge.a(1279822471);
    }

    public static /* synthetic */ Object ipc$super(lik likVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1889771791:
                super.scrollToPositionWithOffset(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case -602204034:
                return new Integer(super.scrollVerticallyBy(((Number) objArr[0]).intValue(), (RecyclerView.Recycler) objArr[1], (RecyclerView.State) objArr[2]));
            case 367307764:
                super.onItemsAdded((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                return null;
            case 371177099:
                super.scrollToPosition(((Number) objArr[0]).intValue());
                return null;
            case 1133151231:
                super.onDetachedFromWindow((RecyclerView) objArr[0], (RecyclerView.Recycler) objArr[1]);
                return null;
            case 1238488515:
                super.onAttachedToWindow((RecyclerView) objArr[0]);
                return null;
            case 1626618577:
                super.onLayoutChildren((RecyclerView.Recycler) objArr[0], (RecyclerView.State) objArr[1]);
                return null;
            case 1659846701:
                super.onScrollStateChanged(((Number) objArr[0]).intValue());
                return null;
            case 2011679854:
                super.smoothScrollToPosition((RecyclerView) objArr[0], (RecyclerView.State) objArr[1], ((Number) objArr[2]).intValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // android.support.v7.widget.StaggeredGridLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4fda0d0", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public lik(int i, int i2) {
        super(i, i2);
        this.b = true;
        this.c = true;
        this.d = false;
        this.f = null;
        setItemPrefetchEnabled(true);
    }

    public lik a(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lik) ipChange.ipc$dispatch("15cf4b62", new Object[]{this, recyclerView});
        }
        this.f30655a = recyclerView;
        return this;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49d1d5c3", new Object[]{this, recyclerView});
            return;
        }
        onRestoreInstanceState(this.f);
        super.onAttachedToWindow(recyclerView);
    }

    @Override // android.support.v7.widget.StaggeredGridLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("438a83ff", new Object[]{this, recyclerView, recycler});
            return;
        }
        this.f = onSaveInstanceState();
        super.onDetachedFromWindow(recyclerView, recycler);
    }

    @Override // android.support.v7.widget.StaggeredGridLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dc1b187e", new Object[]{this, new Integer(i), recycler, state})).intValue();
        }
        if (!this.b) {
            return 0;
        }
        try {
            int scrollVerticallyBy = super.scrollVerticallyBy(i, recycler, state);
            if (scrollVerticallyBy == 0) {
                if (i > 0) {
                    a(false, true);
                } else if (i < 0) {
                    a(true, false);
                }
            } else if (i != 0) {
                a(a(scrollVerticallyBy), false);
            }
            return scrollVerticallyBy;
        } catch (NullPointerException e) {
            ldf.a("InfoFlowStaggeredGridLayoutManager", "scrollVerticallyBy error :" + e.getMessage(), e);
            return 0;
        }
    }

    @Override // android.support.v7.widget.StaggeredGridLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void onScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62ef402d", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            super.onScrollStateChanged(i);
        } catch (IndexOutOfBoundsException e) {
            ldf.a("InfoFlowStaggeredGridLayoutManager", "onScrollStateChanged error: " + e.getMessage(), e);
        }
    }

    private boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        View findViewByPosition = findViewByPosition(0);
        return !(findViewByPosition == null || findViewByPosition.getTop() < 0) && i < 0;
    }

    @Override // android.support.v7.widget.StaggeredGridLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("161fb68b", new Object[]{this, new Integer(i)});
            return;
        }
        b(i);
        super.scrollToPosition(i);
    }

    @Override // android.support.v7.widget.StaggeredGridLayoutManager
    public void scrollToPositionWithOffset(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f5c5ef1", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        b(i);
        super.scrollToPositionWithOffset(i, i2);
    }

    @Override // android.support.v7.widget.StaggeredGridLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77e7cc6e", new Object[]{this, recyclerView, state, new Integer(i)});
            return;
        }
        b(i);
        super.smoothScrollToPosition(recyclerView, state, i);
    }

    private void b(int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        RecyclerView recyclerView = this.f30655a;
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
            ldf.a("NestedLayout", "onLayoutChild error", th);
            if (lcz.b()) {
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
        } catch (Throwable th) {
            if (lcz.b()) {
                throw th;
            }
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

    private void b(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90ff8829", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        lks.c cVar = this.e;
        if (cVar == null) {
            return;
        }
        cVar.a(z, z2);
    }

    public void a(lks.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19227b65", new Object[]{this, cVar});
            return;
        }
        this.e = cVar;
        b(this.c, this.d);
    }
}
