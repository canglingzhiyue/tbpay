package com.taobao.android.megadesign.dx.view;

import android.content.Context;
import android.support.v7.widget.LinearSmoothScroller;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.android.dinamicx.widget.x;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class d extends x {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXTBORDERSCROLLERLAYOUT_INDEX = 18040265701821L;
    public static final long DXTBORDERSCROLLERLAYOUT_SCROLLGRAVITY = -8279052660849356158L;
    public static final long DXTBORDERSCROLLERLAYOUT_TBORDERSCROLLERLAYOUT = 6940330088966860395L;

    /* renamed from: a  reason: collision with root package name */
    private final String f14261a = "DXTBOrderScrollerLayout";
    private int b;
    private String c;

    /* loaded from: classes6.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new d();
        }
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1814733277:
                return super.onCreateView((Context) objArr[0]);
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ String a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("47e6df0", new Object[]{dVar}) : dVar.c;
    }

    @Override // com.taobao.android.dinamicx.widget.x, com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new d();
    }

    @Override // com.taobao.android.dinamicx.widget.x, com.taobao.android.dinamicx.widget.v, com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode == null || !(dXWidgetNode instanceof d)) {
        } else {
            super.onClone(dXWidgetNode, z);
            d dVar = (d) dXWidgetNode;
            this.b = dVar.b;
            this.c = dVar.c;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.x, com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        HashMap hashMap = new HashMap(4);
        hashMap.put("ctxName", context.getClass().getName());
        f.INSTANCE.a("TBScrollerLayoutPlus", hashMap);
        return super.onCreateView(context);
    }

    @Override // com.taobao.android.dinamicx.widget.x, com.taobao.android.dinamicx.widget.v, com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if (!(view instanceof RecyclerView)) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        int i = this.b;
        if (i == 0) {
            return;
        }
        a(i, recyclerView);
    }

    @Override // com.taobao.android.dinamicx.widget.x
    public com.taobao.android.dinamicx.view.c newLinearLayoutManager(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.dinamicx.view.c) ipChange.ipc$dispatch("3b5fc876", new Object[]{this, context}) : new com.taobao.android.dinamicx.view.c(context) { // from class: com.taobao.android.megadesign.dx.view.d.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
            public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("77e7cc6e", new Object[]{this, recyclerView, state, new Integer(i)});
                    return;
                }
                b bVar = new b(recyclerView.getContext(), d.a(d.this));
                bVar.setTargetPosition(i);
                startSmoothScroll(bVar);
            }
        };
    }

    private void a(final int i, final RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba8b1dc9", new Object[]{this, new Integer(i), recyclerView});
        } else {
            recyclerView.post(new Runnable() { // from class: com.taobao.android.megadesign.dx.view.d.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        recyclerView.smoothScrollToPosition(i);
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
        } else {
            super.onBindEvent(context, view, j);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.v, com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.v, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == DXTBORDERSCROLLERLAYOUT_SCROLLGRAVITY) {
            this.c = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.x, com.taobao.android.dinamicx.widget.v, com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DXTBORDERSCROLLERLAYOUT_INDEX) {
            this.b = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    /* loaded from: classes6.dex */
    public static class b extends LinearSmoothScroller {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f14264a;

        public b(Context context, String str) {
            this(context);
            this.f14264a = str;
        }

        public b(Context context) {
            super(context);
        }

        @Override // android.support.v7.widget.LinearSmoothScroller
        public int calculateDtToFit(int i, int i2, int i3, int i4, int i5) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b808eb6f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)})).intValue() : ("end".equals(this.f14264a) || "right".equals(this.f14264a)) ? i4 - i2 : ("start".equals(this.f14264a) || "left".equals(this.f14264a)) ? i3 - i : (i3 + ((i4 - i3) / 2)) - (i + ((i2 - i) / 2));
        }
    }
}
