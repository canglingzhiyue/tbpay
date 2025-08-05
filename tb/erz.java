package tb;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.exception.a;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.monitor.DXTraceUtil;
import com.taobao.android.dinamicx.monitor.b;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.bi;
import com.taobao.android.dinamicx.widget.z;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class erz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public eru f27516a;

    static {
        kge.a(-379299775);
    }

    public erz(eru eruVar) {
        this.f27516a = null;
        this.f27516a = eruVar;
    }

    public View a(DXWidgetNode dXWidgetNode, bi biVar, View view, DXRuntimeContext dXRuntimeContext, int i, DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7bb68a67", new Object[]{this, dXWidgetNode, biVar, view, dXRuntimeContext, new Integer(i), dXRenderOptions});
        }
        String str = null;
        if (dXWidgetNode == null || biVar == null || view == null) {
            return null;
        }
        try {
            z zVar = (z) biVar;
            z a2 = gbh.a(view);
            long nanoTime = System.nanoTime();
            if (i == 0) {
                str = "DX-Pipeline-RenderWt-diff";
            } else if (i == 1) {
                str = "DX-SimplePipeline-RenderWt-diff";
            }
            DXTraceUtil.a(str);
            this.f27516a.a(zVar, a2, dXRuntimeContext);
            a(dXRuntimeContext, DXMonitorConstant.DX_MONITOR_SERVICE_ID_DETAIL_RENDER_DIFF, System.nanoTime() - nanoTime, null);
            DXTraceUtil.a();
            zVar.a(view);
            long nanoTime2 = System.nanoTime();
            a(dXRuntimeContext, zVar, dXWidgetNode, null, 0, i, dXRenderOptions);
            if (zVar.c() == 3) {
                if (Build.VERSION.SDK_INT >= 16) {
                    view.setImportantForAccessibility(1);
                }
            } else if (Build.VERSION.SDK_INT >= 16) {
                view.setImportantForAccessibility(2);
            }
            gbh.a(zVar, view);
            if (a2 != null && a2.i() != null) {
                a2.i().a(zVar, a2);
            }
            a(dXRuntimeContext, DXMonitorConstant.DX_MONITOR_SERVICE_ID_DETAIL_RENDER_RECURSION_RENDER_WT, System.nanoTime() - nanoTime2, null);
        } catch (Exception e) {
            a.b(e);
            if (dXRuntimeContext != null && dXRuntimeContext.n() != null && dXRuntimeContext.n().c != null) {
                s.a aVar = new s.a(DXMonitorConstant.DX_MONITOR_PIPELINE_DETAIL, DXMonitorConstant.DX_MONITOR_SERVICE_ID_RENDER_DETAIL, 90001);
                aVar.e = "DXLayoutManager#renderWidget " + a.a(e);
                dXRuntimeContext.n().c.add(aVar);
            }
        }
        return view;
    }

    private void a(DXRuntimeContext dXRuntimeContext, z zVar, DXWidgetNode dXWidgetNode, View view, int i, int i2, DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("413ef417", new Object[]{this, dXRuntimeContext, zVar, dXWidgetNode, view, new Integer(i), new Integer(i2), dXRenderOptions});
            return;
        }
        try {
            System.nanoTime();
            String str = "";
            if (DXTraceUtil.b() && zVar != null) {
                DXTraceUtil.a(i2 == 0 ? "DX-Pipeline-RenderFlatten" : i2 == 1 ? "DX-SimplePipeline-RenderFlatten" : str, "-", zVar.e().getClass().getSimpleName());
            }
            View d = zVar.d();
            if (d != null) {
                if (view == null) {
                    gbh.a(d, dXWidgetNode);
                }
                gbh.a(zVar, d);
                a(dXRuntimeContext, zVar, dXWidgetNode, d, i2, dXRenderOptions);
            } else {
                if (i2 == 0) {
                    str = "DX-Pipeline-CreateView";
                } else if (i2 == 1) {
                    str = "DX-SimplePipeline-CreateView";
                }
                if (DXTraceUtil.b()) {
                    DXTraceUtil.a(str, "-", zVar.e().getClass().getSimpleName());
                }
                View a2 = zVar.a(dXRuntimeContext.m());
                if (DXTraceUtil.b()) {
                    DXTraceUtil.a();
                }
                if (a2 == null && fqi.a(zVar.e())) {
                    if (!DXTraceUtil.b() || zVar == null) {
                        return;
                    }
                    DXTraceUtil.a();
                    return;
                }
                if (view == null) {
                    gbh.a(a2, dXWidgetNode);
                }
                a(dXRuntimeContext, zVar, dXWidgetNode, a2, i2, dXRenderOptions);
                if (view != null && (view instanceof ViewGroup)) {
                    if (!fqi.t()) {
                        ((ViewGroup) view).addView(a2, i);
                    } else if (i <= ((ViewGroup) view).getChildCount()) {
                        ((ViewGroup) view).addView(a2, i);
                    } else {
                        ((ViewGroup) view).addView(a2);
                        b.a(dXRuntimeContext.A(), dXRuntimeContext.c(), DXMonitorConstant.DX_MONITOR_RENDER, DXMonitorConstant.RENDER_ERROR, s.DX_ADD_VIEW_ERROR, "renderManager addView error");
                    }
                }
            }
        } catch (Throwable th) {
            if (dXRuntimeContext != null) {
                try {
                    if (dXRuntimeContext.n() != null && dXRuntimeContext.n().c != null) {
                        s.a aVar = new s.a(DXMonitorConstant.DX_MONITOR_RENDER, DXMonitorConstant.RENDER_FLATTEN_CRASH, s.DXERROR_RENDER_FLATTEN);
                        aVar.e = a.a(th);
                        dXRuntimeContext.n().c.add(aVar);
                    }
                } finally {
                    if (DXTraceUtil.b() && zVar != null) {
                        DXTraceUtil.a();
                    }
                }
            }
            a.b(th);
            if (!DXTraceUtil.b() || zVar == null) {
                return;
            }
            DXTraceUtil.a();
        }
    }

    private void a(DXRuntimeContext dXRuntimeContext, z zVar, DXWidgetNode dXWidgetNode, View view, int i, DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ca5a446", new Object[]{this, dXRuntimeContext, zVar, dXWidgetNode, view, new Integer(i), dXRenderOptions});
            return;
        }
        System.nanoTime();
        DXTraceUtil.a(i == 0 ? "DX-Pipeline-RenderDetail(不含子节点)" : i == 1 ? "DX-SimplePipeline-RenderDetail(不含子节点" : "");
        if (dXRuntimeContext != null && dXRuntimeContext.G()) {
            if (zVar.e(256)) {
                zVar.b(view);
                zVar.b(dXRuntimeContext.m());
                if (dXRenderOptions != null) {
                    zVar.a(dXRenderOptions);
                }
                zVar.c(dXRuntimeContext.m());
                zVar.f(256);
            }
        } else {
            zVar.b(view);
            zVar.b(dXRuntimeContext.m());
            if (dXRenderOptions != null) {
                zVar.a(dXRenderOptions);
            }
            zVar.c(dXRuntimeContext.m());
        }
        DXTraceUtil.a();
        List<z> f = zVar.f();
        if (f == null) {
            return;
        }
        for (int i2 = 0; i2 < zVar.g(); i2++) {
            a(dXRuntimeContext, f.get(i2), dXWidgetNode, view, i2, i, dXRenderOptions);
        }
    }

    private void a(DXRuntimeContext dXRuntimeContext, String str, long j, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a62f9a4", new Object[]{this, dXRuntimeContext, str, new Long(j), map});
            return;
        }
        try {
            b.a(3, dXRuntimeContext.A(), DXMonitorConstant.DX_MONITOR_SERVICE_ID_RENDER_DETAIL, str, dXRuntimeContext == null ? null : dXRuntimeContext.c(), map, j, true);
        } catch (Throwable th) {
            a.b(th);
        }
    }
}
