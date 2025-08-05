package tb;

import android.content.Context;
import android.support.v4.util.SparseArrayCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView;
import com.taobao.android.searchbaseframe.datasource.impl.a;
import com.taobao.android.searchbaseframe.util.ListStyle;
import tb.inz;

/* loaded from: classes6.dex */
public abstract class inx<VIEW, PRESENTER extends inz> extends iuf<VIEW, PRESENTER> implements ioa<VIEW, PRESENTER> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private StaggeredGridLayoutManager f29171a;
    public RecyclerView.ItemDecoration b;
    public PartnerRecyclerView c;
    public int d;
    private RecyclerView.OnItemTouchListener g;
    public ListStyle e = ListStyle.LIST;
    private boolean h = false;

    /* loaded from: classes6.dex */
    public interface b {
        void a(RecyclerView.ItemDecoration itemDecoration, int i, int i2);

        void a(ListStyle listStyle, int i, a aVar, RecyclerView recyclerView, RecyclerView.ItemDecoration itemDecoration);

        RecyclerView.ItemDecoration b(int i, a aVar);
    }

    static {
        kge.a(72526690);
        kge.a(-1508095473);
    }

    public abstract RecyclerView.ItemDecoration a(int i);

    public void b(PartnerRecyclerView partnerRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5162b64b", new Object[]{this, partnerRecyclerView});
        }
    }

    public abstract void b(ListStyle listStyle);

    public abstract int g();

    public void a(PartnerRecyclerView partnerRecyclerView, Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcaa2c7d", new Object[]{this, partnerRecyclerView, context, viewGroup});
            return;
        }
        int g = g();
        this.c = partnerRecyclerView;
        partnerRecyclerView.setItemAnimator(null);
        partnerRecyclerView.setHasFixedSize(true);
        this.f29171a = a(partnerRecyclerView);
        partnerRecyclerView.setLayoutManager(this.f29171a);
        this.b = a(g);
        partnerRecyclerView.addItemDecoration(this.b);
        partnerRecyclerView.setClipToPadding(false);
        int i = -g;
        partnerRecyclerView.setPadding(i, 0, i, 0);
        partnerRecyclerView.setListEventListener((PartnerRecyclerView.a) q());
        Float q = ((inz) q()).q();
        if (q != null) {
            partnerRecyclerView.setExposeFactor(q.floatValue());
        }
        partnerRecyclerView.setSaveEnabled(false);
        b(partnerRecyclerView);
        if (!p().a().c()) {
            return;
        }
        partnerRecyclerView.addOnItemTouchListener(new RecyclerView.SimpleOnItemTouchListener() { // from class: tb.inx.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.support.v7.widget.RecyclerView.SimpleOnItemTouchListener, android.support.v7.widget.RecyclerView.OnItemTouchListener
            public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("e16b42ac", new Object[]{this, recyclerView, motionEvent})).booleanValue();
                }
                if (!com.taobao.android.xsearchplugin.debugger.protocal.b.f16249a || motionEvent.getActionMasked() != 0) {
                    return false;
                }
                int childCount = recyclerView.getChildCount();
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = recyclerView.getChildAt(i2);
                    if (x > childAt.getLeft() && x < childAt.getRight() && y > childAt.getTop() && y < childAt.getBottom()) {
                        RecyclerView.ViewHolder findContainingViewHolder = recyclerView.findContainingViewHolder(childAt);
                        if (!(findContainingViewHolder instanceof iul)) {
                            return false;
                        }
                        ((inz) inx.this.q()).b(new com.taobao.android.xsearchplugin.debugger.protocal.b((iul) findContainingViewHolder));
                        com.taobao.android.xsearchplugin.debugger.protocal.b.f16249a = false;
                        return true;
                    }
                }
                return false;
            }
        });
    }

    public StaggeredGridLayoutManager a(final PartnerRecyclerView partnerRecyclerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (StaggeredGridLayoutManager) ipChange.ipc$dispatch("a0dc9ccd", new Object[]{this, partnerRecyclerView}) : new StaggeredGridLayoutManager(((inz) q()).u(), 1) { // from class: tb.inx.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                if (str.hashCode() == 1092366570) {
                    super.onLayoutCompleted((RecyclerView.State) objArr[0]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.support.v7.widget.StaggeredGridLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
            public void onLayoutCompleted(RecyclerView.State state) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("411c30ea", new Object[]{this, state});
                    return;
                }
                super.onLayoutCompleted(state);
                partnerRecyclerView.notifyLayoutComplete();
            }
        };
    }

    public void a(RecyclerView.Adapter adapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b51b1d2b", new Object[]{this, adapter});
        } else {
            this.c.setAdapter(adapter);
        }
    }

    @Override // tb.ioa
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        this.d = i;
        b(this.e);
    }

    public void a(ListStyle listStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b84a965", new Object[]{this, listStyle});
            return;
        }
        this.e = listStyle;
        b(this.e);
    }

    @Override // tb.ioa
    public void a(int i, inv invVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("246c97a", new Object[]{this, new Integer(i), invVar});
        } else {
            invVar.a(i, this.c);
        }
    }

    @Override // tb.ioa
    public void a(iny inyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee07e264", new Object[]{this, inyVar});
            return;
        }
        this.h = false;
        this.c.setAlpha(1.0f);
        this.c.invalidate();
        inyVar.H();
        RecyclerView.OnItemTouchListener onItemTouchListener = this.g;
        if (onItemTouchListener == null) {
            return;
        }
        this.c.removeOnItemTouchListener(onItemTouchListener);
    }

    @Override // tb.ioa
    public void a(iny inyVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2f51cf0", new Object[]{this, inyVar, new Boolean(z)});
            return;
        }
        this.h = true;
        if (z) {
            inyVar.G();
        } else {
            this.c.setAlpha(0.0f);
            this.c.invalidate();
        }
        if (this.g == null) {
            this.g = new RecyclerView.OnItemTouchListener() { // from class: tb.inx.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.support.v7.widget.RecyclerView.OnItemTouchListener
                public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("e16b42ac", new Object[]{this, recyclerView, motionEvent})).booleanValue();
                    }
                    return true;
                }

                @Override // android.support.v7.widget.RecyclerView.OnItemTouchListener
                public void onRequestDisallowInterceptTouchEvent(boolean z2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c1dcb2bb", new Object[]{this, new Boolean(z2)});
                    }
                }

                @Override // android.support.v7.widget.RecyclerView.OnItemTouchListener
                public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("62dd1ae4", new Object[]{this, recyclerView, motionEvent});
                    }
                }
            };
        }
        this.c.addOnItemTouchListener(this.g);
    }

    @Override // tb.ioa
    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : this.h;
    }

    @Override // tb.ioa
    public void c(int i, int i2, inv invVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29c5e029", new Object[]{this, new Integer(i), new Integer(i2), invVar});
        } else {
            invVar.c(i, i2, this.c);
        }
    }

    @Override // tb.ioa
    public void d(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89069007", new Object[]{this, view});
        } else {
            this.c.addHeaderView(view);
        }
    }

    @Override // tb.ioa
    public void e(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85081ee6", new Object[]{this, view});
        } else {
            this.c.addFooterView(view);
        }
    }

    @Override // tb.ioa
    public ViewGroup i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("12f973a5", new Object[]{this}) : this.c.getFooterFrame();
    }

    @Override // tb.ioa
    public RecyclerView l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView) ipChange.ipc$dispatch("56522e71", new Object[]{this}) : this.c;
    }

    @Override // tb.ioa
    public void a(int i, SparseArrayCompat<Boolean> sparseArrayCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b37070c7", new Object[]{this, new Integer(i), sparseArrayCompat});
        } else {
            this.c.getCurrentDisplayedPositions(i, sparseArrayCompat);
        }
    }

    @Override // tb.ioa
    public int m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6158667", new Object[]{this})).intValue() : this.c.getTotalScrollOffset();
    }

    @Override // tb.ioa
    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        } else {
            this.c.backToTop();
        }
    }

    @Override // tb.ioa
    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
        } else if (this.c.getAdapter().getItemCount() == 0) {
        } else {
            RecyclerView.LayoutManager layoutManager = this.c.getLayoutManager();
            if (layoutManager instanceof StaggeredGridLayoutManager) {
                ((StaggeredGridLayoutManager) layoutManager).scrollToPositionWithOffset(this.c.getAdapter().getItemCount() - 1, Integer.MIN_VALUE);
            } else if (!(layoutManager instanceof LinearLayoutManager)) {
            } else {
                ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(this.c.getAdapter().getItemCount() - 1, Integer.MIN_VALUE);
            }
        }
    }
}
