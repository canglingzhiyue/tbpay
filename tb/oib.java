package tb;

import android.support.v7.widget.FixStaggeredGridLayoutManager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearSmoothScroller;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes8.dex */
public class oib extends FixStaggeredGridLayoutManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private GridLayoutManager.SpanSizeLookup f32079a;
    private RecyclerView b;
    private int c;
    private float d;
    private boolean e;
    private Method f;
    private boolean g;

    static {
        kge.a(1324616783);
    }

    public static /* synthetic */ Object ipc$super(oib oibVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -574012007:
                return new Boolean(super.canScrollHorizontally());
            case 514551467:
                return new Boolean(super.canScrollVertically());
            case 1365175321:
                super.requestSimpleAnimationsInNextLayout();
                return null;
            case 1626618577:
                super.onLayoutChildren((RecyclerView.Recycler) objArr[0], (RecyclerView.State) objArr[1]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ int a(oib oibVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f7f40c03", new Object[]{oibVar})).intValue() : oibVar.c;
    }

    public oib(int i, int i2, RecyclerView recyclerView) {
        super(i, i2);
        this.d = 1.0f;
        this.e = true;
        this.f = null;
        this.g = false;
        this.b = recyclerView;
    }

    public void a(GridLayoutManager.SpanSizeLookup spanSizeLookup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2661932e", new Object[]{this, spanSizeLookup});
        } else {
            this.f32079a = spanSizeLookup;
        }
    }

    public int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue();
        }
        GridLayoutManager.SpanSizeLookup spanSizeLookup = this.f32079a;
        if (spanSizeLookup == null) {
            return -1;
        }
        return spanSizeLookup.getSpanSize(i);
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    @Override // android.support.v7.widget.StaggeredGridLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.f == null && !this.g) {
            try {
                this.f = RecyclerView.class.getDeclaredMethod("markItemDecorInsetsDirty", new Class[0]);
                this.f.setAccessible(true);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
                this.g = true;
            }
        }
        if (this.f != null && state.willRunSimpleAnimations()) {
            try {
                this.f.invoke(this.b, new Object[0]);
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            }
        }
        try {
            super.onLayoutChildren(recycler, state);
        } catch (Exception e4) {
            ogg.a("ListViewComponent", e4.getMessage());
        }
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void requestSimpleAnimationsInNextLayout() {
        super.requestSimpleAnimationsInNextLayout();
        Method method = this.f;
        if (method != null) {
            try {
                method.invoke(this.b, new Object[0]);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
            }
        }
    }

    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else {
            this.d = f;
        }
    }

    @Override // android.support.v7.widget.StaggeredGridLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77e7cc6e", new Object[]{this, recyclerView, state, new Integer(i)});
        } else if (this.c <= 0) {
            oia.f32078a = this.d;
            oia oiaVar = new oia(recyclerView.getContext());
            this.d = 1.0f;
            oia.f32078a = 1.0f;
            oiaVar.setTargetPosition(i);
            startSmoothScroll(oiaVar);
        } else {
            int width = recyclerView.getWidth();
            if (width <= 0) {
                width = ohd.a(recyclerView.getContext(), 750);
            }
            final float f = width;
            LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext()) { // from class: tb.oib.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.support.v7.widget.LinearSmoothScroller
                public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("bbeb1cb2", new Object[]{this, displayMetrics})).floatValue() : oib.a(oib.this) / f;
                }

                @Override // android.support.v7.widget.LinearSmoothScroller, android.support.v7.widget.RecyclerView.SmoothScroller
                public void onTargetFound(View view, RecyclerView.State state2, RecyclerView.SmoothScroller.Action action) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("16013e5a", new Object[]{this, view, state2, action});
                        return;
                    }
                    int calculateDxToMakeVisible = calculateDxToMakeVisible(view, getHorizontalSnapPreference());
                    int calculateDyToMakeVisible = calculateDyToMakeVisible(view, getVerticalSnapPreference());
                    int calculateTimeForDeceleration = calculateTimeForDeceleration((int) Math.sqrt((calculateDxToMakeVisible * calculateDxToMakeVisible) + (calculateDyToMakeVisible * calculateDyToMakeVisible)));
                    if (calculateTimeForDeceleration <= 0) {
                        return;
                    }
                    action.update(-calculateDxToMakeVisible, -calculateDyToMakeVisible, calculateTimeForDeceleration, this.mLinearInterpolator);
                }

                @Override // android.support.v7.widget.LinearSmoothScroller
                public int calculateTimeForDeceleration(int i2) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("396f02ba", new Object[]{this, new Integer(i2)})).intValue() : (int) Math.ceil(calculateTimeForScrolling(i2));
                }
            };
            linearSmoothScroller.setTargetPosition(i);
            startSmoothScroll(linearSmoothScroller);
        }
    }

    @Override // android.support.v7.widget.StaggeredGridLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1eab6eab", new Object[]{this})).booleanValue();
        }
        if (!this.e) {
            return false;
        }
        return super.canScrollVertically();
    }

    @Override // android.support.v7.widget.StaggeredGridLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ddc94599", new Object[]{this})).booleanValue();
        }
        if (!this.e) {
            return false;
        }
        return super.canScrollHorizontally();
    }
}
