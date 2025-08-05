package tb;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Message;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSmoothScroller;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewTreeObserver;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView;

/* loaded from: classes6.dex */
public class ivn extends RecyclerView.OnScrollListener implements ViewTreeObserver.OnGlobalLayoutListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f29334a;
    public static boolean b;
    private static final Rect c;
    private final RecyclerView d;
    private RecyclerView.ViewHolder e;
    private boolean f;
    private int g;
    private int h;
    private boolean i;
    private final boolean j;
    private final ivo k;
    private boolean l;
    private boolean m;
    private boolean n;
    private final Handler o = new Handler() { // from class: tb.ivn.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (message.what != 1) {
            } else {
                ivn.a(ivn.this, true);
                ivn.a(ivn.this).stopScroll();
                ivn ivnVar = ivn.this;
                ivn.a(ivnVar, ivn.b(ivnVar), false, ivn.c(ivn.this), 0);
                ivn.b(ivn.this, true);
                ivn.a(ivn.this, false);
            }
        }
    };
    private int p = -1;
    private a q;

    /* loaded from: classes6.dex */
    public interface a {
    }

    public static /* synthetic */ Object ipc$super(ivn ivnVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ RecyclerView a(ivn ivnVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView) ipChange.ipc$dispatch("9351368d", new Object[]{ivnVar}) : ivnVar.d;
    }

    public static /* synthetic */ void a(ivn ivnVar, int i, boolean z, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b345328", new Object[]{ivnVar, new Integer(i), new Boolean(z), new Integer(i2), new Integer(i3)});
        } else {
            ivnVar.b(i, z, i2, i3);
        }
    }

    public static /* synthetic */ boolean a(ivn ivnVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e000df61", new Object[]{ivnVar, new Boolean(z)})).booleanValue();
        }
        ivnVar.m = z;
        return z;
    }

    public static /* synthetic */ int b(ivn ivnVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("dcf6a4cb", new Object[]{ivnVar})).intValue() : ivnVar.h;
    }

    public static /* synthetic */ boolean b(ivn ivnVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1dea900", new Object[]{ivnVar, new Boolean(z)})).booleanValue();
        }
        ivnVar.f = z;
        return z;
    }

    public static /* synthetic */ int c(ivn ivnVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cb79ab4c", new Object[]{ivnVar})).intValue() : ivnVar.g;
    }

    public static /* synthetic */ a d(ivn ivnVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("67bef58e", new Object[]{ivnVar}) : ivnVar.q;
    }

    public static /* synthetic */ boolean e(ivn ivnVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a87fb85f", new Object[]{ivnVar})).booleanValue() : ivnVar.j;
    }

    public static /* synthetic */ int f(ivn ivnVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9702becf", new Object[]{ivnVar})).intValue() : ivnVar.p;
    }

    static {
        kge.a(1119751355);
        kge.a(300785761);
        c = new Rect();
        f29334a = true;
        b = true;
    }

    public ivn(RecyclerView recyclerView, boolean z, RecyclerView.Adapter adapter) {
        this.d = recyclerView;
        recyclerView.addOnScrollListener(this);
        recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.j = z;
        this.k = new ivo(recyclerView, adapter);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        RecyclerView.ViewHolder viewHolder;
        int a2;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
        } else if (!this.i || !this.f || this.l || (viewHolder = this.e) == null || (a2 = a(viewHolder.itemView)) == (i = this.g)) {
        } else {
            if (b && ((a2 > i && !this.d.canScrollVertically(1)) || (a2 < this.g && !this.d.canScrollVertically(-1)))) {
                this.f = false;
            } else {
                a(this.h, false, this.g);
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView.OnScrollListener
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
        } else if (!this.i || this.l) {
        } else {
            RecyclerView.ViewHolder viewHolder = this.e;
            if (viewHolder == null || viewHolder.getAdapterPosition() != this.h) {
                this.e = recyclerView.findViewHolderForAdapterPosition(this.h);
            }
            RecyclerView.ViewHolder viewHolder2 = this.e;
            View view = viewHolder2 == null ? null : viewHolder2.itemView;
            if (view == null) {
                return;
            }
            int a2 = a(view);
            if (a2 > recyclerView.getMeasuredHeight() && view.getBottom() < 0) {
                return;
            }
            if ((i2 <= 0 || a2 > this.g) && (i2 >= 0 || a2 < this.g)) {
                return;
            }
            recyclerView.stopScroll();
        }
    }

    private int a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9501e35d", new Object[]{this, view})).intValue();
        }
        this.d.getDecoratedBoundsWithMargins(view, c);
        return c.top;
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.i = false;
        this.f = false;
        this.e = null;
        this.h = -1;
        this.g = 0;
        this.p = -1;
    }

    public void a(int i, boolean z, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e05b0b9", new Object[]{this, new Integer(i), new Boolean(z), new Integer(i2), new Integer(i3)});
        } else if (this.d.getLayoutManager() == null) {
        } else {
            if (z) {
                this.n = true;
            }
            a();
            this.h = i;
            this.g = i2;
            this.i = true;
            this.e = this.d.findViewHolderForAdapterPosition(i);
            b(i, z, i2, i3);
            if (z) {
                return;
            }
            this.f = true;
        }
    }

    public void a(int i, boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2621338a", new Object[]{this, new Integer(i), new Boolean(z), new Integer(i2)});
        } else {
            a(i, z, i2, 0);
        }
    }

    private void b(int i, boolean z, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("324a1fba", new Object[]{this, new Integer(i), new Boolean(z), new Integer(i2), new Integer(i3)});
        } else if (z) {
            if (this.j && f29334a) {
                this.l = true;
                PartnerRecyclerView partnerRecyclerView = null;
                RecyclerView recyclerView = this.d;
                if (recyclerView instanceof PartnerRecyclerView) {
                    partnerRecyclerView = (PartnerRecyclerView) recyclerView;
                    partnerRecyclerView.setScrollListenerEnabled(false);
                }
                this.k.a(i, i2, i3);
                if (partnerRecyclerView != null) {
                    partnerRecyclerView.setScrollListenerEnabled(true);
                }
                this.l = false;
                return;
            }
            LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(this.d.getContext()) { // from class: tb.ivn.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                    int hashCode = str.hashCode();
                    if (hashCode != -1299653488) {
                        if (hashCode == -1154160711) {
                            return new Integer(super.calculateDyToMakeVisible((View) objArr[0], ((Number) objArr[1]).intValue()));
                        }
                        if (hashCode != 369180250) {
                            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                        }
                        super.onTargetFound((View) objArr[0], (RecyclerView.State) objArr[1], (RecyclerView.SmoothScroller.Action) objArr[2]);
                        return null;
                    }
                    return new Integer(super.calculateTimeForScrolling(((Number) objArr[0]).intValue()));
                }

                @Override // android.support.v7.widget.LinearSmoothScroller
                public int getVerticalSnapPreference() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("ecfe2c4b", new Object[]{this})).intValue();
                    }
                    return -1;
                }

                @Override // android.support.v7.widget.LinearSmoothScroller
                public int calculateDyToMakeVisible(View view, int i4) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("bb34e7b9", new Object[]{this, view, new Integer(i4)})).intValue() : super.calculateDyToMakeVisible(view, i4) + ivn.c(ivn.this);
                }

                @Override // android.support.v7.widget.LinearSmoothScroller, android.support.v7.widget.RecyclerView.SmoothScroller
                public void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("16013e5a", new Object[]{this, view, state, action});
                        return;
                    }
                    if (ivn.d(ivn.this) != null) {
                        ivn.d(ivn.this);
                    }
                    super.onTargetFound(view, state, action);
                }

                @Override // android.support.v7.widget.LinearSmoothScroller
                public int calculateTimeForScrolling(int i4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("b288dc90", new Object[]{this, new Integer(i4)})).intValue();
                    }
                    if (ivn.e(ivn.this)) {
                        return super.calculateTimeForScrolling(i4);
                    }
                    if (ivn.f(ivn.this) <= 0 || i4 == 10000) {
                        return super.calculateTimeForScrolling(Math.min(2000, i4));
                    }
                    return ivn.f(ivn.this);
                }
            };
            linearSmoothScroller.setTargetPosition(i);
            if (this.d.getLayoutManager() != null) {
                this.d.getLayoutManager().startSmoothScroll(linearSmoothScroller);
            }
            if (!this.j || !this.n) {
                return;
            }
            this.n = false;
            this.o.sendEmptyMessageDelayed(1, 300L);
        } else {
            RecyclerView.LayoutManager layoutManager = this.d.getLayoutManager();
            if (layoutManager instanceof StaggeredGridLayoutManager) {
                ((StaggeredGridLayoutManager) layoutManager).scrollToPositionWithOffset(i, i2);
            } else if (!(layoutManager instanceof LinearLayoutManager)) {
            } else {
                ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(i, i2);
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
        } else if (!this.i || this.l) {
        } else {
            if (i == 1) {
                this.i = false;
                this.f = false;
                this.e = null;
            } else if (i != 0 || this.m) {
            } else {
                this.o.removeMessages(1);
                this.f = true;
                if (this.e != null) {
                    b();
                } else {
                    b(this.h, false, this.g, 0);
                }
            }
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        RecyclerView.ViewHolder viewHolder = this.e;
        if (viewHolder == null) {
            return;
        }
        int a2 = a(viewHolder.itemView);
        int i = this.g;
        if (a2 == i) {
            return;
        }
        b(this.h, false, i, 0);
    }
}
