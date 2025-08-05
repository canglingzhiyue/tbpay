package com.taobao.android.dinamicx;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.monitor.DXTraceUtil;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import tb.fqi;
import tb.fvi;
import tb.fvj;
import tb.gbh;
import tb.kge;

/* loaded from: classes.dex */
public class al {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int PIPELINE = 0;
    public static final int SIMPLE_PIPELINE = 1;

    /* renamed from: a  reason: collision with root package name */
    public fvi f11803a = new fvj();

    static {
        kge.a(-841038640);
    }

    public View a(DXWidgetNode dXWidgetNode, DXWidgetNode dXWidgetNode2, View view, DXRuntimeContext dXRuntimeContext, int i, DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("76eb3b3a", new Object[]{this, dXWidgetNode, dXWidgetNode2, view, dXRuntimeContext, new Integer(i), dXRenderOptions});
        }
        String str = null;
        if (dXWidgetNode == null || dXWidgetNode2 == null || view == null) {
            return null;
        }
        try {
            DXWidgetNode b = gbh.b(view);
            long nanoTime = System.nanoTime();
            if (i == 0) {
                str = "DX-Pipeline-RenderWt-diff";
            } else if (i == 1) {
                str = "DX-SimplePipeline-RenderWt-diff";
            }
            DXTraceUtil.a(str);
            this.f11803a.a(dXWidgetNode2, b, dXRuntimeContext);
            a(dXRuntimeContext, DXMonitorConstant.DX_MONITOR_SERVICE_ID_DETAIL_RENDER_DIFF, System.nanoTime() - nanoTime, null);
            DXTraceUtil.a();
            dXWidgetNode2.setWRView(new WeakReference<>(view));
            long nanoTime2 = System.nanoTime();
            a(dXRuntimeContext, dXWidgetNode2, dXWidgetNode, null, 0, i, dXRenderOptions);
            if (dXWidgetNode2.getAccessibility() == 3) {
                if (Build.VERSION.SDK_INT >= 16) {
                    view.setImportantForAccessibility(1);
                }
            } else if (Build.VERSION.SDK_INT >= 16) {
                view.setImportantForAccessibility(2);
            }
            gbh.a(view, (com.taobao.android.dinamicx.widget.bi) dXWidgetNode2);
            if (b != null && b.getParentWidget() != null) {
                b.getParentWidget().replaceChild(dXWidgetNode2, b);
            }
            a(dXRuntimeContext, DXMonitorConstant.DX_MONITOR_SERVICE_ID_DETAIL_RENDER_RECURSION_RENDER_WT, System.nanoTime() - nanoTime2, null);
        } catch (Exception e) {
            com.taobao.android.dinamicx.exception.a.b(e);
            if (dXRuntimeContext != null && dXRuntimeContext.n() != null && dXRuntimeContext.n().c != null) {
                s.a aVar = new s.a(DXMonitorConstant.DX_MONITOR_PIPELINE_DETAIL, DXMonitorConstant.DX_MONITOR_SERVICE_ID_RENDER_DETAIL, 90001);
                aVar.e = "DXLayoutManager#renderWidget " + com.taobao.android.dinamicx.exception.a.a(e);
                dXRuntimeContext.n().c.add(aVar);
            }
        }
        return view;
    }

    private void a(DXRuntimeContext dXRuntimeContext, DXWidgetNode dXWidgetNode, DXWidgetNode dXWidgetNode2, View view, int i, int i2, DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa346ca7", new Object[]{this, dXRuntimeContext, dXWidgetNode, dXWidgetNode2, view, new Integer(i), new Integer(i2), dXRenderOptions});
            return;
        }
        try {
            System.nanoTime();
            String str = "";
            if (DXTraceUtil.b() && dXWidgetNode != null) {
                DXTraceUtil.a(i2 == 0 ? "DX-Pipeline-RenderFlatten" : i2 == 1 ? "DX-SimplePipeline-RenderFlatten" : str, "-", dXWidgetNode.getClass().getSimpleName());
            }
            View a2 = a(dXWidgetNode);
            if (a2 != null) {
                if (view == null) {
                    gbh.a(a2, dXWidgetNode2);
                }
                gbh.a(a2, (com.taobao.android.dinamicx.widget.bi) dXWidgetNode);
                a(dXRuntimeContext, dXWidgetNode, dXWidgetNode2, a2, i2, dXRenderOptions);
            } else {
                if (i2 == 0) {
                    str = "DX-Pipeline-CreateView";
                } else if (i2 == 1) {
                    str = "DX-SimplePipeline-CreateView";
                }
                if (DXTraceUtil.b()) {
                    DXTraceUtil.a(str, "-", dXWidgetNode.getClass().getSimpleName());
                }
                View createView = dXWidgetNode.createView(dXRuntimeContext.m());
                if (DXTraceUtil.b()) {
                    DXTraceUtil.a();
                }
                if (createView == null && fqi.a(dXWidgetNode)) {
                    if (!DXTraceUtil.b() || dXWidgetNode == null) {
                        return;
                    }
                    DXTraceUtil.a();
                    return;
                }
                if (view == null) {
                    gbh.a(createView, dXWidgetNode2);
                }
                a(dXRuntimeContext, dXWidgetNode, dXWidgetNode2, createView, i2, dXRenderOptions);
                if (view != null && (view instanceof ViewGroup)) {
                    if (!fqi.t()) {
                        ((ViewGroup) view).addView(createView, i);
                    } else if (i <= ((ViewGroup) view).getChildCount()) {
                        ((ViewGroup) view).addView(createView, i);
                    } else {
                        ((ViewGroup) view).addView(createView);
                        com.taobao.android.dinamicx.monitor.b.a(dXRuntimeContext.A(), dXRuntimeContext.c(), DXMonitorConstant.DX_MONITOR_RENDER, DXMonitorConstant.RENDER_ERROR, s.DX_ADD_VIEW_ERROR, "renderManager addView error");
                    }
                }
            }
        } catch (Throwable th) {
            if (dXRuntimeContext != null) {
                try {
                    if (dXRuntimeContext.n() != null && dXRuntimeContext.n().c != null) {
                        s.a aVar = new s.a(DXMonitorConstant.DX_MONITOR_RENDER, DXMonitorConstant.RENDER_FLATTEN_CRASH, s.DXERROR_RENDER_FLATTEN);
                        aVar.e = com.taobao.android.dinamicx.exception.a.a(th);
                        dXRuntimeContext.n().c.add(aVar);
                    }
                } finally {
                    if (DXTraceUtil.b() && dXWidgetNode != null) {
                        DXTraceUtil.a();
                    }
                }
            }
            com.taobao.android.dinamicx.exception.a.b(th);
            if (!DXTraceUtil.b() || dXWidgetNode == null) {
                return;
            }
            DXTraceUtil.a();
        }
    }

    private void a(DXRuntimeContext dXRuntimeContext, DXWidgetNode dXWidgetNode, DXWidgetNode dXWidgetNode2, View view, int i, DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69d6d9b6", new Object[]{this, dXRuntimeContext, dXWidgetNode, dXWidgetNode2, view, new Integer(i), dXRenderOptions});
            return;
        }
        System.nanoTime();
        DXTraceUtil.a(i == 0 ? "DX-Pipeline-RenderDetail(不含子节点)" : i == 1 ? "DX-SimplePipeline-RenderDetail(不含子节点" : "");
        if (dXRuntimeContext != null && dXRuntimeContext.G()) {
            if (dXWidgetNode.getStatInPrivateFlags(256)) {
                dXWidgetNode.setRealViewLayoutParam(view);
                dXWidgetNode.bindEvent(dXRuntimeContext.m());
                if (dXRenderOptions != null && dXWidgetNode.getReferenceNode() != null) {
                    dXWidgetNode.getReferenceNode().bindRenderOptions(dXRenderOptions);
                }
                dXWidgetNode.setNeedRender(dXRuntimeContext.m());
                dXWidgetNode.unsetStatFlag(256);
                if (dXWidgetNode.getReferenceNode() != null) {
                    dXWidgetNode.getReferenceNode().unsetStatFlag(256);
                }
            }
        } else {
            dXWidgetNode.setRealViewLayoutParam(view);
            dXWidgetNode.bindEvent(dXRuntimeContext.m());
            if (dXRenderOptions != null && dXWidgetNode.getReferenceNode() != null) {
                dXWidgetNode.getReferenceNode().bindRenderOptions(dXRenderOptions);
            }
            dXWidgetNode.setNeedRender(dXRuntimeContext.m());
        }
        DXTraceUtil.a();
        List<DXWidgetNode> children = dXWidgetNode.getChildren();
        if (children == null) {
            return;
        }
        for (int i2 = 0; i2 < dXWidgetNode.getChildrenCount(); i2++) {
            a(dXRuntimeContext, children.get(i2), dXWidgetNode2, view, i2, i, dXRenderOptions);
        }
    }

    private View a(DXWidgetNode dXWidgetNode) {
        WeakReference<View> wRView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("eb35c849", new Object[]{this, dXWidgetNode});
        }
        if (dXWidgetNode != null && (wRView = dXWidgetNode.getWRView()) != null) {
            return wRView.get();
        }
        return null;
    }

    private void a(DXRuntimeContext dXRuntimeContext, String str, long j, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a62f9a4", new Object[]{this, dXRuntimeContext, str, new Long(j), map});
            return;
        }
        try {
            com.taobao.android.dinamicx.monitor.b.a(3, dXRuntimeContext.A(), DXMonitorConstant.DX_MONITOR_SERVICE_ID_RENDER_DETAIL, str, dXRuntimeContext == null ? null : dXRuntimeContext.c(), map, j, true);
        } catch (Throwable th) {
            com.taobao.android.dinamicx.exception.a.b(th);
        }
    }
}
