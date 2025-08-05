package com.taobao.android.dinamicx.view;

import android.content.Context;
import android.graphics.PointF;
import android.support.v7.widget.LinearSmoothScroller;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.s;
import tb.fxi;
import tb.kge;

/* loaded from: classes5.dex */
public class d extends c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private float f11959a;
    private float b;

    static {
        kge.a(-1590242522);
    }

    public static /* synthetic */ float a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("97a69b5a", new Object[]{dVar})).floatValue() : dVar.b;
    }

    public d(Context context, int i, boolean z) {
        super(context, i, z);
        this.f11959a = 160.0f;
        this.b = 1.0f;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager, com.alibaba.android.ultron.ext.vlayout.e
    public void measureChildWithMargins(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e27560a", new Object[]{this, view, new Integer(i), new Integer(i2)});
            return;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        view.measure(getChildMeasureSpec(getWidth(), getWidthMode(), 0, layoutParams.width, canScrollHorizontally()), getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + layoutParams.topMargin + layoutParams.bottomMargin + i2, layoutParams.height, canScrollVertically()));
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77e7cc6e", new Object[]{this, recyclerView, state, new Integer(i)});
            return;
        }
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext()) { // from class: com.taobao.android.dinamicx.view.d.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                if (str.hashCode() == -1299653488) {
                    return new Integer(super.calculateTimeForScrolling(((Number) objArr[0]).intValue()));
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.support.v7.widget.LinearSmoothScroller
            public int calculateDtToFit(int i2, int i3, int i4, int i5, int i6) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("b808eb6f", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)})).intValue();
                }
                if (i6 != -1 && i6 != 0) {
                    if (i6 == 1) {
                        return i5 - i3;
                    }
                    return 0;
                }
                return i4 - i2;
            }

            @Override // android.support.v7.widget.LinearSmoothScroller
            public PointF computeScrollVectorForPosition(int i2) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (PointF) ipChange2.ipc$dispatch("d3d13928", new Object[]{this, new Integer(i2)}) : d.this.computeScrollVectorForPosition(i2);
            }

            @Override // android.support.v7.widget.LinearSmoothScroller
            public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("bbeb1cb2", new Object[]{this, displayMetrics})).floatValue() : d.a(d.this);
            }

            @Override // android.support.v7.widget.LinearSmoothScroller
            public int calculateTimeForScrolling(int i2) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("b288dc90", new Object[]{this, new Integer(i2)})).intValue() : super.calculateTimeForScrolling(i2);
            }
        };
        try {
            linearSmoothScroller.setTargetPosition(i);
            startSmoothScroll(linearSmoothScroller);
        } catch (Throwable th) {
            s sVar = new s(fxi.c);
            s.a aVar = new s.a("native", DXMonitorConstant.NATIVE_CRASH, s.DX_NATIVE_CRASH_15);
            aVar.e = fxi.a() + "_trace: " + com.taobao.android.dinamicx.exception.a.a(th);
            sVar.c.add(aVar);
            com.taobao.android.dinamicx.monitor.b.a(sVar);
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (i == 0) {
            this.b = 1.0f;
        } else {
            this.b = this.f11959a / i;
        }
    }
}
