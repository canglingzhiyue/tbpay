package com.taobao.android.dinamicx;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.monitor.DXTraceUtil;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.view.DXNativeFrameLayout;
import com.taobao.android.dinamicx.view.DXRootNativeFrameLayout;
import com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.ArrayList;
import tb.fqi;
import tb.fuw;
import tb.fxi;
import tb.kge;

/* loaded from: classes.dex */
public class as extends DXRenderPipelineBase {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String RENDER_TEMPLATE = "renderTemplateTime";
    private final boolean c;

    static {
        kge.a(848738033);
    }

    public static /* synthetic */ Object ipc$super(as asVar, String str, Object... objArr) {
        if (str.hashCode() == -968689649) {
            return new Integer(super.a((DXWidgetNode) objArr[0], ((Number) objArr[1]).intValue()));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public as(r rVar, int i, String str) {
        this(rVar, i, str, false);
    }

    public as(r rVar, int i, String str, boolean z) {
        super(rVar, i, str);
        if (bx.p()) {
            a(new cj());
        } else {
            a(new an());
        }
        this.c = z;
    }

    public View a(DXWidgetNode dXWidgetNode, DXWidgetNode dXWidgetNode2, View view, DXRuntimeContext dXRuntimeContext, int i, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("838145ea", new Object[]{this, dXWidgetNode, dXWidgetNode2, view, dXRuntimeContext, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
        }
        if (dXRuntimeContext != null && dXRuntimeContext.c() != null) {
            fxi.a(dXRuntimeContext.c().f(), dXRuntimeContext.c().g(), dXRuntimeContext.A(), Thread.currentThread().getName(), "simple");
        }
        return a(dXWidgetNode, dXWidgetNode2, view, dXRuntimeContext, new DXRenderOptions.a().d(i).e(i2).a(i3).b(i4).a(), i5);
    }

    public View a(DXWidgetNode dXWidgetNode, DXWidgetNode dXWidgetNode2, View view, DXRuntimeContext dXRuntimeContext, DXRenderOptions dXRenderOptions, int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("5f6bd120", new Object[]{this, dXWidgetNode, dXWidgetNode2, view, dXRuntimeContext, dXRenderOptions, new Integer(i)});
        }
        DXTraceUtil.a("DX-SimplePipeline-RenderWt", " : ", dXWidgetNode.getDXRuntimeContext().K());
        long nanoTime = System.nanoTime();
        if (dXWidgetNode == null) {
            DXTraceUtil.a();
            return null;
        }
        View a2 = view == null ? a(dXRuntimeContext.m()) : view;
        int h = dXRenderOptions.h();
        if (dXRenderOptions.g() != 1) {
            z = false;
        }
        int a3 = a(dXWidgetNode, h, z);
        this.n.j = dXRenderOptions.a();
        this.n.k = dXRenderOptions.b();
        this.n.a(a2);
        this.n.i = dXRuntimeContext;
        this.n.g = dXWidgetNode;
        this.n.q = dXWidgetNode2;
        this.n.f11779a = 0;
        if (bx.l()) {
            Log.e("RecyclerPrefetch", "node hash " + dXWidgetNode.hashCode() + " pos " + i + " 开始渲染 from " + a3 + "  to  " + dXRenderOptions.i() + "  thread " + Thread.currentThread().getName());
        }
        ci ciVar = new ci();
        this.n.a(a3, dXRenderOptions.i(), dXRenderOptions, ciVar);
        ciVar.a("renderTemplateTime", Long.valueOf(System.nanoTime() - nanoTime));
        a(dXRuntimeContext, DXMonitorConstant.DX_MONITOR_SERVICE_ID_ENGINE_RENDER, System.nanoTime() - nanoTime, ciVar, dXWidgetNode);
        com.taobao.android.dinamicx.monitor.f.a("DX-SimplePipeline-RenderWt", System.nanoTime() - nanoTime, dXRuntimeContext.c());
        DXTraceUtil.a();
        a(a2, dXRuntimeContext);
        return a2;
    }

    public void a(DXRuntimeContext dXRuntimeContext, String str, long j, ci ciVar, DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5090fb8", new Object[]{this, dXRuntimeContext, str, new Long(j), ciVar, dXWidgetNode});
            return;
        }
        try {
            if (dXWidgetNode instanceof com.taobao.android.dinamicx.widget.ac) {
                com.taobao.android.dinamicx.widget.ac acVar = (com.taobao.android.dinamicx.widget.ac) dXWidgetNode;
                DXTemplateItem dXTemplateItem = new DXTemplateItem();
                dXTemplateItem.f11925a = acVar.f();
                dXTemplateItem.b = Long.parseLong(acVar.h());
                dXTemplateItem.c = acVar.g();
                com.taobao.android.dinamicx.monitor.b.a(0, dXRuntimeContext.A(), DXMonitorConstant.DX_MONITOR_SIMPLE_PIPELINE, str, dXTemplateItem, ciVar, j, true);
                return;
            }
            com.taobao.android.dinamicx.monitor.b.a(0, dXRuntimeContext.A(), DXMonitorConstant.DX_MONITOR_SIMPLE_PIPELINE, str, dXRuntimeContext == null ? null : dXRuntimeContext.c(), ciVar, j, true);
        } catch (Exception e) {
            if (!DinamicXEngine.j()) {
                return;
            }
            e.printStackTrace();
        }
    }

    public View a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("876fa4a2", new Object[]{this, context}) : this.c ? new DXRootNativeFrameLayout(context) : new DXNativeFrameLayout(context);
    }

    public int a(DXWidgetNode dXWidgetNode, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("21cbe2b", new Object[]{this, dXWidgetNode, new Integer(i), new Boolean(z)})).intValue();
        }
        if (!fqi.o()) {
            return super.a(dXWidgetNode, i);
        }
        if ((dXWidgetNode instanceof com.taobao.android.dinamicx.widget.ac) && ((dXWidgetNode.getParentWidget() instanceof DXAbsContainerBaseLayout) || z)) {
            if (dXWidgetNode.getChildrenCount() > 0 && super.a(dXWidgetNode, i) != 2) {
                return super.a(dXWidgetNode.getChildAt(0), i);
            }
            return 2;
        }
        return super.a(dXWidgetNode, i);
    }

    private void a(View view, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e0e595b", new Object[]{this, view, dXRuntimeContext});
        } else if (dXRuntimeContext == null || !fqi.v(dXRuntimeContext.A())) {
        } else {
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                measuredWidth = layoutParams.width;
                measuredHeight = layoutParams.height;
            }
            if (measuredWidth <= 0 || measuredHeight <= 0 || !(view instanceof ViewGroup) || ((ViewGroup) view).getChildCount() != 0) {
                return;
            }
            s sVar = new s(dXRuntimeContext.A());
            sVar.b = dXRuntimeContext.c();
            sVar.c = new ArrayList();
            s.a aVar = new s.a(DXMonitorConstant.DX_MONITOR_RENDER, DXMonitorConstant.DX_MONITOR_SERVICE_ID_RENDER_WIDGET, s.DX_SIMPLE_RENDER_VIEW_CHILD_EMPTY);
            aVar.e = "view 宽高不为 0，但 childrenCount == 0";
            sVar.c.add(aVar);
            if (dXRuntimeContext.n() != null && dXRuntimeContext.n().c != null) {
                sVar.c.addAll(dXRuntimeContext.n().c);
            }
            com.taobao.android.dinamicx.monitor.b.a(sVar);
            if (!DinamicXEngine.j()) {
                return;
            }
            fuw.d("DXSimpleRenderMonitor", aVar.e);
        }
    }
}
