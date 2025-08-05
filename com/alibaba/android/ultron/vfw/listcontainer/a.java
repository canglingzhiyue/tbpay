package com.alibaba.android.ultron.vfw.listcontainer;

import android.content.Context;
import android.graphics.PointF;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public final class a extends RecyclerView.SmoothScroller {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int SNAP_TO_ANY = 0;
    public static final int SNAP_TO_END = 1;
    public static final int SNAP_TO_START = -1;

    /* renamed from: a  reason: collision with root package name */
    public PointF f2714a;
    private final float f;
    private d h;
    private Interpolator d = new LinearInterpolator();
    private Interpolator e = new DecelerateInterpolator();
    public int b = 0;
    public int c = 0;
    private int g = 300;

    static {
        kge.a(266570774);
    }

    private int a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c1152bb", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        int i3 = i - i2;
        if (i * i3 > 0) {
            return i3;
        }
        return 0;
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.support.v7.widget.RecyclerView.SmoothScroller
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        }
    }

    public a(Context context) {
        this.f = a(context.getResources().getDisplayMetrics());
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.g = i;
        }
    }

    public void a(Interpolator interpolator, Interpolator interpolator2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2afe0d88", new Object[]{this, interpolator, interpolator2});
            return;
        }
        this.d = interpolator;
        this.e = interpolator2;
    }

    public void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c40aec1", new Object[]{this, dVar});
        } else {
            this.h = dVar;
        }
    }

    private Interpolator c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Interpolator) ipChange.ipc$dispatch("7020127f", new Object[]{this});
        }
        if (this.d == null) {
            this.d = new LinearInterpolator();
        }
        return this.d;
    }

    private Interpolator d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Interpolator) ipChange.ipc$dispatch("fcc03d80", new Object[]{this});
        }
        if (this.e == null) {
            this.e = new LinearInterpolator();
        }
        return this.e;
    }

    @Override // android.support.v7.widget.RecyclerView.SmoothScroller
    public void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16013e5a", new Object[]{this, view, state, action});
            return;
        }
        int b = b(view, a());
        int a2 = a(view, b());
        int i = this.g;
        if (i <= 0) {
            return;
        }
        action.update(-b, -a2, i, d());
    }

    @Override // android.support.v7.widget.RecyclerView.SmoothScroller
    public void onSeekTargetStep(int i, int i2, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cd1f03c", new Object[]{this, new Integer(i), new Integer(i2), state, action});
        } else if (getChildCount() == 0) {
            stop();
        } else {
            this.b = a(this.b, i);
            this.c = a(this.c, i2);
            if (this.b != 0 || this.c != 0) {
                return;
            }
            a(action);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.SmoothScroller
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        this.c = 0;
        this.b = 0;
        this.f2714a = null;
        d dVar = this.h;
        if (dVar == null) {
            return;
        }
        dVar.a();
    }

    public float a(DisplayMetrics displayMetrics) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("59e34e3b", new Object[]{this, displayMetrics})).floatValue() : 25.0f / displayMetrics.densityDpi;
    }

    public int b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{this, new Integer(i)})).intValue() : (int) Math.ceil(Math.abs(i) * this.f);
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        PointF pointF = this.f2714a;
        if (pointF == null || pointF.x == 0.0f) {
            return 0;
        }
        return this.f2714a.x > 0.0f ? 1 : -1;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        PointF pointF = this.f2714a;
        if (pointF == null || pointF.y == 0.0f) {
            return 0;
        }
        return this.f2714a.y > 0.0f ? 1 : -1;
    }

    public void a(RecyclerView.SmoothScroller.Action action) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b92dba8", new Object[]{this, action});
            return;
        }
        PointF c = c(getTargetPosition());
        if (c == null || (c.x == 0.0f && c.y == 0.0f)) {
            action.jumpTo(getTargetPosition());
            stop();
            return;
        }
        normalize(c);
        this.f2714a = c;
        this.b = (int) (c.x * 10000.0f);
        this.c = (int) (c.y * 10000.0f);
        action.update((int) (this.b * 1.2f), (int) (this.c * 1.2f), (int) (b(10000) * 1.2f), c());
    }

    public int a(int i, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5ae76ce", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)})).intValue();
        }
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            }
            return i4 - i2;
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 >= 0) {
            return 0;
        }
        return i7;
    }

    public int a(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b3afccc", new Object[]{this, view, new Integer(i)})).intValue();
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager == null || !layoutManager.canScrollVertically()) {
            return 0;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return a(layoutManager.getDecoratedTop(view) - layoutParams.topMargin, layoutManager.getDecoratedBottom(view) + layoutParams.bottomMargin, layoutManager.getPaddingTop(), layoutManager.getHeight() - layoutManager.getPaddingBottom(), i);
    }

    public int b(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8f6b49cd", new Object[]{this, view, new Integer(i)})).intValue();
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager == null || !layoutManager.canScrollHorizontally()) {
            return 0;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return a(layoutManager.getDecoratedLeft(view) - layoutParams.leftMargin, layoutManager.getDecoratedRight(view) + layoutParams.rightMargin, layoutManager.getPaddingLeft(), layoutManager.getWidth() - layoutManager.getPaddingRight(), i);
    }

    public PointF c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PointF) ipChange.ipc$dispatch("7116de10", new Object[]{this, new Integer(i)});
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) {
            return ((RecyclerView.SmoothScroller.ScrollVectorProvider) layoutManager).computeScrollVectorForPosition(i);
        }
        String str = "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + RecyclerView.SmoothScroller.ScrollVectorProvider.class.getCanonicalName();
        return null;
    }
}
