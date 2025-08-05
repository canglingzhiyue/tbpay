package tb;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSmoothScroller;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.Interpolator;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes8.dex */
public class ofs extends RecyclerView.OnFlingListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TRIGGER_TYPE_FLING = 0;
    public static final int TRIGGER_TYPE_NONE = -1;
    public static final int TRIGGER_TYPE_SCROLL = 1;

    /* renamed from: a  reason: collision with root package name */
    public RecyclerView f32014a;
    private int e;
    private int f;
    private boolean g;
    private boolean h;
    private View i;
    private int j;
    private OrientationHelper n;
    private RecyclerView.LayoutManager o;
    private OrientationHelper p;
    private boolean q;
    private int r;
    private int b = 0;
    private int c = 0;
    private int d = 0;
    private boolean k = true;
    private int l = -1;
    private float m = 100.0f;
    private Interpolator s = new Interpolator() { // from class: tb.ofs.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("22c782db", new Object[]{this, new Float(f)})).floatValue();
            }
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    private final RecyclerView.OnScrollListener t = new RecyclerView.OnScrollListener() { // from class: tb.ofs.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f32016a = false;

        public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
            if (str.hashCode() == 2142696127) {
                super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.support.v7.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
                return;
            }
            super.onScrollStateChanged(recyclerView, i);
            if (i == 1) {
                ofs.a(ofs.this, 1);
            } else if (i != 0) {
            } else {
                if (this.f32016a) {
                    this.f32016a = false;
                    if (ofs.a(ofs.this) == 1) {
                        ofs.this.b();
                    }
                }
                ofs.a(ofs.this, -1);
            }
        }

        @Override // android.support.v7.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
            } else if (i == 0 && i2 == 0) {
            } else {
                ofs ofsVar = ofs.this;
                if (i2 > 0) {
                    z = true;
                }
                ofs.a(ofsVar, z);
                this.f32016a = true;
            }
        }
    };

    static {
        kge.a(-1763681939);
    }

    public static /* synthetic */ Object ipc$super(ofs ofsVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ int a(ofs ofsVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f7d17fcf", new Object[]{ofsVar})).intValue() : ofsVar.l;
    }

    public static /* synthetic */ int a(ofs ofsVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("25eee9a", new Object[]{ofsVar, new Integer(i)})).intValue();
        }
        ofsVar.l = i;
        return i;
    }

    public static /* synthetic */ void a(ofs ofsVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eebb1376", new Object[]{ofsVar, view});
        } else {
            ofsVar.a(view);
        }
    }

    public static /* synthetic */ boolean a(ofs ofsVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25f2e7c", new Object[]{ofsVar, new Boolean(z)})).booleanValue();
        }
        ofsVar.k = z;
        return z;
    }

    public static /* synthetic */ Interpolator b(ofs ofsVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Interpolator) ipChange.ipc$dispatch("170cbff2", new Object[]{ofsVar}) : ofsVar.s;
    }

    public static /* synthetic */ float c(ofs ofsVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d4d78cce", new Object[]{ofsVar})).floatValue() : ofsVar.m;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.j = i;
        }
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else {
            this.f = i;
        }
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }

    public void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f617", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    public void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a9ceb6", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.OnFlingListener
    public boolean onFling(int i, int i2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8af30028", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        RecyclerView.LayoutManager layoutManager = this.f32014a.getLayoutManager();
        if (layoutManager == null || this.f32014a.getAdapter() == null) {
            return false;
        }
        if ((Math.abs(i2) <= 1200 && Math.abs(i) <= 1200) || !b(layoutManager, i, i2)) {
            z = false;
        }
        if (z) {
            this.l = 0;
        }
        return z;
    }

    public void a(RecyclerView recyclerView) throws IllegalStateException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46606596", new Object[]{this, recyclerView});
            return;
        }
        RecyclerView recyclerView2 = this.f32014a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            d();
        }
        this.f32014a = recyclerView;
        if (this.f32014a == null) {
            return;
        }
        c();
        b();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.f32014a == null) {
        } else {
            d();
        }
    }

    private void c() throws IllegalStateException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.f32014a.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        } else {
            this.f32014a.addOnScrollListener(this.t);
            this.f32014a.setOnFlingListener(this);
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.f32014a.removeOnScrollListener(this.t);
        this.f32014a.setOnFlingListener(null);
    }

    private boolean b(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        RecyclerView.SmoothScroller a2;
        int a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98a0887c", new Object[]{this, layoutManager, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (!(layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) || (a2 = a(layoutManager)) == null || (a3 = a(layoutManager, i, i2)) == -1) {
            return false;
        }
        a2.setTargetPosition(a3);
        layoutManager.startSmoothScroll(a2);
        return true;
    }

    public boolean b() {
        RecyclerView.LayoutManager layoutManager;
        View a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        RecyclerView recyclerView = this.f32014a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (a2 = a(layoutManager, this.k)) != null) {
            int[] a3 = a(layoutManager, a2);
            if (a3[0] != 0 || a3[1] != 0) {
                a(a2);
                this.f32014a.smoothScrollBy(a3[0], a3[1]);
                return true;
            }
        }
        return false;
    }

    public View a(RecyclerView.LayoutManager layoutManager, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ef3e775f", new Object[]{this, layoutManager, new Boolean(z)}) : a(layoutManager, b(layoutManager), true, z);
    }

    public int[] a(RecyclerView.LayoutManager layoutManager, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("8640d229", new Object[]{this, layoutManager, view});
        }
        int[] iArr = new int[2];
        if (!(layoutManager instanceof LinearLayoutManager)) {
            return iArr;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        if (linearLayoutManager.canScrollVertically()) {
            iArr[1] = a(view, b(linearLayoutManager));
        }
        return iArr;
    }

    public RecyclerView.SmoothScroller a(RecyclerView.LayoutManager layoutManager) {
        RecyclerView recyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.SmoothScroller) ipChange.ipc$dispatch("9aceadd", new Object[]{this, layoutManager});
        }
        if ((layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) && (recyclerView = this.f32014a) != null) {
            return new LinearSmoothScroller(recyclerView.getContext()) { // from class: tb.ofs.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass3 anonymousClass3, String str, Object... objArr) {
                    if (str.hashCode() == -1299653488) {
                        return new Integer(super.calculateTimeForScrolling(((Number) objArr[0]).intValue()));
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                @Override // android.support.v7.widget.LinearSmoothScroller, android.support.v7.widget.RecyclerView.SmoothScroller
                public void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("16013e5a", new Object[]{this, view, state, action});
                    } else if (ofs.this.f32014a == null || ofs.this.f32014a.getLayoutManager() == null) {
                    } else {
                        ofs.a(ofs.this, view);
                        ofs ofsVar = ofs.this;
                        int[] a2 = ofsVar.a(ofsVar.f32014a.getLayoutManager(), view);
                        int i = a2[0];
                        int i2 = a2[1];
                        int a3 = a(i, i2, 0, 0);
                        if (a3 <= 0) {
                            return;
                        }
                        action.update(i, i2, a3, ofs.b(ofs.this));
                    }
                }

                @Override // android.support.v7.widget.LinearSmoothScroller
                public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("bbeb1cb2", new Object[]{this, displayMetrics})).floatValue() : ofs.c(ofs.this) / displayMetrics.densityDpi;
                }

                @Override // android.support.v7.widget.LinearSmoothScroller
                public int calculateTimeForScrolling(int i) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("b288dc90", new Object[]{this, new Integer(i)})).intValue() : Math.min(100, super.calculateTimeForScrolling(i));
                }

                private int a(int i, int i2, int i3, int i4) {
                    int i5;
                    IpChange ipChange2 = $ipChange;
                    boolean z = true;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("9d16211b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)})).intValue();
                    }
                    int abs = Math.abs(i);
                    int abs2 = Math.abs(i2);
                    if (abs <= abs2) {
                        z = false;
                    }
                    int sqrt = (int) Math.sqrt((i3 * i3) + (i4 * i4));
                    int height = ofs.this.f32014a.getHeight();
                    int i6 = height / 2;
                    float f = height;
                    float f2 = i6;
                    float a2 = f2 + (a(Math.min(1.0f, (((int) Math.sqrt((i * i) + (i2 * i2))) * 1.0f) / f)) * f2);
                    if (sqrt > 0) {
                        i5 = Math.round(Math.abs(a2 / sqrt) * 1000.0f) * 4;
                    } else {
                        if (!z) {
                            abs = abs2;
                        }
                        i5 = (int) (((abs / f) + 1.0f) * 300.0f);
                    }
                    return Math.min(i5, 2000);
                }

                private float a(float f) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("a8218848", new Object[]{this, new Float(f)})).floatValue() : (float) Math.sin((f - 0.5f) * 0.47123894f);
                }
            };
        }
        return null;
    }

    private int a(View view, OrientationHelper orientationHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b4d7bf09", new Object[]{this, view, orientationHelper})).intValue();
        }
        if (this.h) {
            return this.q ? this.j : -this.j;
        } else if (this.g && this.i == view && orientationHelper.getDecoratedStart(view) <= 0) {
            return this.b + (view.getHeight() - this.f32014a.getHeight()) + orientationHelper.getDecoratedStart(view);
        } else {
            int decoratedStart = orientationHelper.getDecoratedStart(view);
            return decoratedStart >= orientationHelper.getStartAfterPadding() / 2 ? decoratedStart - orientationHelper.getStartAfterPadding() : decoratedStart;
        }
    }

    private View a(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b471b28b", new Object[]{this, layoutManager, orientationHelper, new Boolean(z), new Boolean(z2)});
        }
        if (layoutManager.getChildCount() == 0 || !(layoutManager instanceof LinearLayoutManager)) {
            return null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        if (z && a(linearLayoutManager)) {
            return null;
        }
        int i = Integer.MAX_VALUE;
        View view = null;
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < linearLayoutManager.getChildCount(); i3++) {
            View childAt = linearLayoutManager.getChildAt(i3);
            int decoratedStart = orientationHelper.getDecoratedStart(childAt);
            int decoratedEnd = orientationHelper.getDecoratedEnd(childAt);
            if (i3 != 0) {
                if (i < 0 && i2 > 0) {
                    int i4 = this.f;
                    if (i4 == 0) {
                        i4 = this.b + 100;
                    }
                    if (z2) {
                        if (this.f32014a.getHeight() - decoratedStart < i4) {
                            if (this.f32014a.getHeight() - decoratedStart <= this.b) {
                                return null;
                            }
                        }
                    } else {
                        int i5 = this.e;
                        if (i5 != 0) {
                            i4 = i5;
                        }
                        if (i2 >= i4) {
                        }
                    }
                }
            } else if (decoratedStart <= 0 && decoratedEnd >= this.f32014a.getHeight()) {
                return null;
            }
            view = childAt;
            i = decoratedStart;
            i2 = decoratedEnd;
        }
        return view;
    }

    private void a(View view) {
        List<aa> H;
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        aa aaVar = (aa) view.getTag(R.id.layout_manager_cell_tag_id);
        if (aaVar == null) {
            return;
        }
        aa J = aaVar.J();
        while (J != null && !"cell".equals(J.K())) {
            J = J.J();
        }
        if (J == null || J.J() == null || (H = J.J().H()) == null || H.size() <= 0 || (indexOf = H.indexOf(J)) < 0 || J.k() == null || indexOf == this.r) {
            return;
        }
        this.r = indexOf;
        HashMap hashMap = new HashMap();
        hashMap.put("index", Integer.valueOf(indexOf));
        J.k().b(34, aaVar, "onselectchanged", null, hashMap, null);
    }

    private boolean a(LinearLayoutManager linearLayoutManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1b0402fc", new Object[]{this, linearLayoutManager})).booleanValue() : linearLayoutManager.findLastCompletelyVisibleItemPosition() == linearLayoutManager.getItemCount() - 1;
    }

    private OrientationHelper b(RecyclerView.LayoutManager layoutManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OrientationHelper) ipChange.ipc$dispatch("70d77908", new Object[]{this, layoutManager});
        }
        if (this.n == null || this.o != layoutManager) {
            this.n = OrientationHelper.createVerticalHelper(layoutManager);
            this.o = layoutManager;
        }
        return this.n;
    }

    private OrientationHelper c(RecyclerView.LayoutManager layoutManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OrientationHelper) ipChange.ipc$dispatch("b43de849", new Object[]{this, layoutManager});
        }
        if (this.p == null || this.o != layoutManager) {
            this.p = OrientationHelper.createHorizontalHelper(layoutManager);
            this.o = layoutManager;
        }
        return this.p;
    }

    private View a(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("8cc4564b", new Object[]{this, layoutManager, orientationHelper});
        }
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = layoutManager.getChildAt(i2);
            int decoratedStart = orientationHelper.getDecoratedStart(childAt);
            if (decoratedStart < i) {
                view = childAt;
                i = decoratedStart;
            }
        }
        return view;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int a(android.support.v7.widget.RecyclerView.LayoutManager r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ofs.a(android.support.v7.widget.RecyclerView$LayoutManager, int, int):int");
    }
}
