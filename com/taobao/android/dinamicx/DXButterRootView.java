package com.taobao.android.dinamicx;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.monitor.DXTraceUtil;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes5.dex */
public class DXButterRootView extends DXRootView {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(595114062);
    }

    public static /* synthetic */ Object ipc$super(DXButterRootView dXButterRootView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -244855388) {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        } else if (hashCode != 650865254) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
    }

    public DXButterRootView(Context context) {
        super(context);
    }

    @Override // com.taobao.android.dinamicx.view.DXNativeFrameLayout, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        DXRuntimeContext dXRuntimeContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        try {
            DXTraceUtil.a("RootView#onMeasure");
            if (this.layoutNode == null) {
                setMeasuredDimension(0, 0);
                return;
            }
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            int childMeasureSpec = com.taobao.android.dinamicx.widget.m.getChildMeasureSpec(this.parentWidthSpec, 0, this.layoutNode.getLayoutWidth());
            int childMeasureSpec2 = com.taobao.android.dinamicx.widget.m.getChildMeasureSpec(this.parentHeightSpec, 0, this.layoutNode.getLayoutHeight());
            if (layoutParams.width != -2 && layoutParams.width != -1) {
                childMeasureSpec = com.taobao.android.dinamicx.widget.m.getChildMeasureSpec(DXWidgetNode.DXMeasureSpec.a(layoutParams.width, 1073741824), 0, this.layoutNode.getLayoutWidth());
            }
            if (layoutParams.height != -2 && layoutParams.height != -1) {
                childMeasureSpec2 = com.taobao.android.dinamicx.widget.m.getChildMeasureSpec(DXWidgetNode.DXMeasureSpec.a(layoutParams.height, 1073741824), 0, this.layoutNode.getLayoutHeight());
            }
            if (this.layoutNode.getNativeView() != null) {
                this.layoutNode.getNativeView().forceLayout();
                this.layoutNode.getNativeView().measure(childMeasureSpec, childMeasureSpec2);
                setMeasuredDimension(this.layoutNode.getMeasuredWidth(), this.layoutNode.getMeasuredHeight());
            } else {
                super.onMeasure(childMeasureSpec, childMeasureSpec2);
            }
            DXTraceUtil.a();
        } catch (Throwable th) {
            if (this.layoutNode != null && (dXRuntimeContext = this.layoutNode.getDXRuntimeContext()) != null) {
                s sVar = new s(dXRuntimeContext.A());
                s.a aVar = new s.a("native", DXMonitorConstant.NATIVE_CRASH, s.DX_NATIVE_ONMEASURE_CRASH);
                if (sVar.c == null) {
                    sVar.c = new ArrayList();
                }
                sVar.c.add(aVar);
                aVar.e = com.taobao.android.dinamicx.exception.a.a(th);
                sVar.b = dXRuntimeContext.c();
                if (dXRuntimeContext.n() != null) {
                    sVar.a(dXRuntimeContext.n().a());
                }
                com.taobao.android.dinamicx.monitor.b.a(sVar);
                return;
            }
            s sVar2 = new s("DinamicX");
            s.a aVar2 = new s.a("native", DXMonitorConstant.NATIVE_CRASH, s.DX_NATIVE_ONMEASURE_CRASH_2);
            aVar2.e = com.taobao.android.dinamicx.exception.a.a(th);
            if (sVar2.c == null) {
                sVar2.c = new ArrayList();
            }
            sVar2.c.add(aVar2);
            com.taobao.android.dinamicx.monitor.b.a(sVar2);
        }
    }

    @Override // com.taobao.android.dinamicx.view.DXNativeFrameLayout, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        DXTraceUtil.a("RootView#onLayout");
        if (this.layoutNode == null) {
            return;
        }
        if (this.layoutNode.getNativeView() != null) {
            this.layoutNode.getNativeView().layout(0, 0, i3 - i, i4 - i2);
        } else {
            super.onLayout(z, i, i2, i3, i4);
        }
        DXTraceUtil.a();
    }

    @Override // com.taobao.android.dinamicx.DXRootView
    public DXWidgetNode getExpandWidgetNode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("d0f19cbc", new Object[]{this}) : this.layoutNode;
    }

    @Override // com.taobao.android.dinamicx.DXRootView
    public DXWidgetNode getFlattenWidgetNode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("5ac407a", new Object[]{this}) : this.layoutNode;
    }

    public void cloneWithCacheView(DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2969bdcc", new Object[]{this, dXRootView});
        } else if (dXRootView == null) {
        } else {
            DXWidgetNode widgetNode = dXRootView.getWidgetNode();
            setWidgetNode(widgetNode);
            while (dXRootView.getChildCount() > 0) {
                View childAt = dXRootView.getChildAt(0);
                dXRootView.removeViewAt(0);
                addView(childAt);
            }
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams == null) {
                setLayoutParams(new ViewGroup.LayoutParams(widgetNode.getLayoutWidth(), widgetNode.getLayoutHeight()));
                return;
            }
            layoutParams.width = widgetNode.getLayoutWidth();
            layoutParams.height = widgetNode.getLayoutHeight();
        }
    }
}
