package com.taobao.android.detail.core.aura.widget;

import android.content.Context;
import android.graphics.PointF;
import android.support.v7.widget.LinearSmoothScroller;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.View;
import com.alibaba.triver.triver_shop.newShop.ext.g;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.android.dinamicx.widget.x;
import tb.emu;
import tb.fxa;
import tb.fxe;
import tb.kge;

/* loaded from: classes4.dex */
public class c extends x {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final long DX_WIDGET_ID;

    /* renamed from: a  reason: collision with root package name */
    private static final long f9403a;
    private int b = 0;

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -740240234) {
            super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode == -303753557) {
            super.onRenderView((Context) objArr[0], (View) objArr[1]);
            return null;
        } else if (hashCode != 2119721610) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
            return null;
        }
    }

    public static /* synthetic */ int a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("141d394b", new Object[]{cVar})).intValue() : cVar.b;
    }

    static {
        kge.a(2112540373);
        DX_WIDGET_ID = fxa.a("DetailHeaderSKU");
        f9403a = fxa.a(g.KEY_SELECTED_INDEX);
    }

    public c() {
        emu.a("com.taobao.android.detail.core.aura.widget.AliDetailScrollerLayoutWidgetNode");
    }

    /* loaded from: classes4.dex */
    public static class b implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1859387564);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new c();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.x, com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new c();
    }

    @Override // com.taobao.android.dinamicx.widget.x, com.taobao.android.dinamicx.widget.v, com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (!(dXWidgetNode instanceof c)) {
            return;
        }
        this.b = ((c) dXWidgetNode).b;
    }

    @Override // com.taobao.android.dinamicx.widget.x, com.taobao.android.dinamicx.widget.v, com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
            return;
        }
        super.onSetIntAttribute(j, i);
        if (f9403a != j) {
            return;
        }
        this.b = i;
    }

    @Override // com.taobao.android.dinamicx.widget.x, com.taobao.android.dinamicx.widget.v, com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, final View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if (!(view instanceof RecyclerView)) {
            return;
        }
        fxe.a(new Runnable() { // from class: com.taobao.android.detail.core.aura.widget.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    ((RecyclerView) view).smoothScrollToPosition(c.a(c.this));
                }
            }
        });
    }

    @Override // com.taobao.android.dinamicx.widget.x
    public com.taobao.android.dinamicx.view.c newLinearLayoutManager(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.dinamicx.view.c) ipChange.ipc$dispatch("3b5fc876", new Object[]{this, context}) : new a(context);
    }

    /* loaded from: classes4.dex */
    public static class a extends com.taobao.android.dinamicx.view.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1387043198);
        }

        public a(Context context) {
            super(context);
        }

        @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
        public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("77e7cc6e", new Object[]{this, recyclerView, state, new Integer(i)});
                return;
            }
            LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext()) { // from class: com.taobao.android.detail.core.aura.widget.c.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.support.v7.widget.LinearSmoothScroller
                public PointF computeScrollVectorForPosition(int i2) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (PointF) ipChange2.ipc$dispatch("d3d13928", new Object[]{this, new Integer(i2)}) : a.this.computeScrollVectorForPosition(i2);
                }

                @Override // android.support.v7.widget.LinearSmoothScroller
                public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("bbeb1cb2", new Object[]{this, displayMetrics})).floatValue() : 120.0f / displayMetrics.densityDpi;
                }

                @Override // android.support.v7.widget.LinearSmoothScroller
                public int calculateDtToFit(int i2, int i3, int i4, int i5, int i6) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("b808eb6f", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)})).intValue();
                    }
                    int i7 = ((i5 - i4) / 2) - ((i3 - i2) / 2);
                    if (i6 == -1) {
                        return (i4 + i7) - i2;
                    }
                    if (i6 != 0) {
                        if (i6 != 1) {
                            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
                        }
                        return (i5 - i7) - i3;
                    }
                    int i8 = i4 - i2;
                    int abs = Math.abs(i8);
                    int i9 = i5 - i3;
                    int abs2 = Math.abs(i9);
                    if (abs < abs2) {
                        return i8 + i7;
                    }
                    if (abs <= abs2) {
                        return 0;
                    }
                    return i9 - i7;
                }
            };
            linearSmoothScroller.setTargetPosition(i);
            startSmoothScroll(linearSmoothScroller);
        }
    }
}
