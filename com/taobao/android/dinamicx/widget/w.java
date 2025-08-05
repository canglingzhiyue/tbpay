package com.taobao.android.dinamicx.widget;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXScrollEvent;
import com.taobao.android.dinamicx.view.DXNativeScrollerIndicator;
import tb.kge;
import tb.mto;
import tb.tea;

/* loaded from: classes.dex */
public class w extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_INDICATOR_BG_COLOR = -2171170;
    public static final int DEFAULT_INDICATOR_COLOR = -35072;
    public static final double DEFAULT_INDICATOR_RATIO = 0.5d;
    public static final long DX_SCROLLER_INDICATOR = 4185989886676328692L;
    public static final long DX_SCROLLER_INDICATOR_COLOR = -5151416374116397110L;
    public static final long DX_SCROLLER_INDICATOR_INDICATOR_RATIO = -5150348073123091510L;

    /* renamed from: a  reason: collision with root package name */
    private int f12210a = DEFAULT_INDICATOR_COLOR;
    private double b = 0.5d;

    static {
        kge.a(-134055287);
    }

    public static /* synthetic */ Object ipc$super(w wVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1806543962:
                return new Double(super.getDefaultValueForDoubleAttr(((Number) objArr[0]).longValue()));
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -638169079:
                super.onSetDoubleAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).doubleValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 1327675976:
                return new Boolean(super.onEvent((DXEvent) objArr[0]));
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    /* loaded from: classes.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-668026784);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new w();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new w();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : new DXNativeScrollerIndicator(context);
    }

    public w() {
        setBackGroundColor(DEFAULT_INDICATOR_BG_COLOR);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (!(dXWidgetNode instanceof w)) {
            return;
        }
        w wVar = (w) dXWidgetNode;
        this.f12210a = wVar.f12210a;
        this.b = wVar.b;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean onEvent(DXEvent dXEvent) {
        DXNativeScrollerIndicator dXNativeScrollerIndicator;
        DXScrollEvent dXScrollEvent;
        RecyclerView recyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f22ba48", new Object[]{this, dXEvent})).booleanValue();
        }
        if (super.onEvent(dXEvent)) {
            return true;
        }
        if (dXEvent.getEventId() != 5288751146867425108L || (dXNativeScrollerIndicator = (DXNativeScrollerIndicator) getDXRuntimeContext().v()) == null || (recyclerView = (dXScrollEvent = (DXScrollEvent) dXEvent).getRecyclerView()) == null) {
            return false;
        }
        if (((LinearLayoutManager) recyclerView.getLayoutManager()).getOrientation() == 1) {
            dXNativeScrollerIndicator.setHorizontal(false);
            return true;
        }
        int i = dXScrollEvent.getContentSize().f11827a - dXScrollEvent.getScrollerSize().f11827a;
        int offsetX = dXScrollEvent.getOffsetX();
        double d = mto.a.GEO_NOT_SUPPORT;
        if (i > 0) {
            d = offsetX / i;
        }
        dXNativeScrollerIndicator.refreshScrollIndicator(d, this.b, getMeasuredWidth(), getMeasuredHeight());
        return true;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        w wVar = (w) getDXRuntimeContext().d();
        DXNativeScrollerIndicator dXNativeScrollerIndicator = (DXNativeScrollerIndicator) view;
        dXNativeScrollerIndicator.setScrollBarThumbColor(tryFetchDarkModeColor(tea.INDICATOR_COLOR, 2, wVar.f12210a));
        dXNativeScrollerIndicator.refreshScrollIndicator(mto.a.GEO_NOT_SUPPORT, wVar.b, wVar.getMeasuredWidth(), wVar.getMeasuredHeight());
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void setBackground(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce1cfbb", new Object[]{this, view});
            return;
        }
        DXNativeScrollerIndicator dXNativeScrollerIndicator = (DXNativeScrollerIndicator) view;
        dXNativeScrollerIndicator.setRadii((float) (getMeasuredHeight() * 0.5d));
        dXNativeScrollerIndicator.setScrollBarTrackColor(getBackGroundColor());
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue() : j == -5151416374116397110L ? DEFAULT_INDICATOR_COLOR : j == -2819959685970048978L ? DEFAULT_INDICATOR_BG_COLOR : super.getDefaultValueForIntAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public double getDefaultValueForDoubleAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("945253a6", new Object[]{this, new Long(j)})).doubleValue();
        }
        if (j != DX_SCROLLER_INDICATOR_INDICATOR_RATIO) {
            return super.getDefaultValueForDoubleAttr(j);
        }
        return 0.5d;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == -5151416374116397110L) {
            this.f12210a = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d)});
        } else if (j == DX_SCROLLER_INDICATOR_INDICATOR_RATIO) {
            this.b = d > mto.a.GEO_NOT_SUPPORT ? Math.min(1.0d, d) : 0.5d;
        } else {
            super.onSetDoubleAttribute(j, d);
        }
    }
}
