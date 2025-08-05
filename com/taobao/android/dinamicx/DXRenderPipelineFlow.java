package com.taobao.android.dinamicx;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.monitor.DXTraceUtil;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx_v4.loader.DXExtensionSectionLoader;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.List;
import tb.fqi;
import tb.kge;

/* loaded from: classes.dex */
public class DXRenderPipelineFlow {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DATA_PARSE_TIME = "dataParseTime";
    public static final int DX_PIPELINE_MODE_RENDER = 0;
    public static final int DX_PIPELINE_MODE_SIZE = 1;
    public static final String END_STAGE = "endStage";
    public static final String FLATTEN_TIME = "flattenTime";
    public static final String FROM_STAGE = "fromStage";
    public static final String LAYOUT_TIME = "layoutTime";
    public static final String LOAD_BINARY_TIME = "loadBinaryTime";
    public static final String MEASURE_TIME = "measureTime";
    public static final String PIPELINE_TYPE = "pipelineType";
    public static final String RENDER_TIME = "renderTime";

    /* renamed from: a  reason: collision with root package name */
    public int f11779a;
    public int b;
    public int c;
    public int d;
    public View e;
    public WeakReference<View> f;
    public DXWidgetNode g;
    public DXRuntimeContext i;
    public int j;
    public int k;
    private final boolean l = fqi.ag();
    public com.taobao.android.dinamicx.widget.bi q;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface DXPipelineMode {
    }

    static {
        kge.a(-681113683);
    }

    public void a(int i, int i2, DXRenderOptions dXRenderOptions, ci ciVar) {
        DXWidgetNode childAt;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("190621ae", new Object[]{this, new Integer(i), new Integer(i2), dXRenderOptions, ciVar});
        } else if (i <= i2) {
            try {
                this.b = i;
                this.c = i2;
                if (ciVar == null) {
                    ciVar = new ci();
                }
                ciVar.a("pipelineType", (Integer) 2);
                ciVar.a("fromStage", Integer.valueOf(i));
                ciVar.a("endStage", Integer.valueOf(i2));
                ciVar.a("renderType", Integer.valueOf(this.i.F()));
                this.i.a(am.THREAD_NAME, Thread.currentThread().getName());
                String K = (this.g == null || this.g.getDXRuntimeContext() == null) ? null : this.g.getDXRuntimeContext().K();
                this.d = i;
                while (this.d <= i2) {
                    if (dXRenderOptions != null) {
                        if (dXRenderOptions.g() != 1 && dXRenderOptions.g() != 2) {
                            z = false;
                            if (z && dXRenderOptions.f()) {
                                return;
                            }
                        }
                        z = true;
                        if (z) {
                            return;
                        }
                    }
                    switch (this.d) {
                        case 0:
                        case 1:
                            DXTraceUtil.a("DX-SimplePipeline-RenderWt-Load", " : ", K);
                            if (b() == null) {
                                return;
                            }
                            DXTraceUtil.a();
                            break;
                        case 2:
                            DXTraceUtil.a("DX-SimplePipeline-RenderWt-Parser", " : ", K);
                            long nanoTime = System.nanoTime();
                            if (c() == null) {
                                return;
                            }
                            ciVar.a("dataParseTime", Long.valueOf(System.nanoTime() - nanoTime));
                            DXTraceUtil.a();
                            break;
                        case 3:
                            DXTraceUtil.a("DX-SimplePipeline-RenderWt-Measure", " : ", K);
                            long nanoTime2 = System.nanoTime();
                            if (d() == null) {
                                return;
                            }
                            ciVar.a("measureTime", Long.valueOf(System.nanoTime() - nanoTime2));
                            DXTraceUtil.a();
                            break;
                        case 4:
                            DXTraceUtil.a("DX-SimplePipeline-RenderWt-Layout", " : ", K);
                            long nanoTime3 = System.nanoTime();
                            if (e() == null) {
                                return;
                            }
                            ciVar.a("layoutTime", Long.valueOf(System.nanoTime() - nanoTime3));
                            DXTraceUtil.a();
                            break;
                        case 5:
                            DXTraceUtil.a("DX-SimplePipeline-RenderWt-Flatten", " : ", K);
                            long nanoTime4 = System.nanoTime();
                            if (m() == null) {
                                return;
                            }
                            ciVar.a("flattenTime", Long.valueOf(System.nanoTime() - nanoTime4));
                            DXTraceUtil.a();
                            break;
                        case 6:
                            if (n() == null) {
                                return;
                            }
                            break;
                        case 7:
                            long nanoTime5 = System.nanoTime();
                            if (b(dXRenderOptions) == null) {
                                return;
                            }
                            ciVar.a("renderTime", Long.valueOf(System.nanoTime() - nanoTime5));
                            break;
                        case 8:
                            if ((this.g instanceof com.taobao.android.dinamicx.widget.ac) && this.g.getChildrenCount() > 0 && (childAt = this.g.getChildAt(0)) != null && childAt != null && childAt.isV4Node() && !childAt.getStatInPrivateFlags(1048576)) {
                                List<DXExtensionSectionLoader.a> g = childAt.getDxv4Properties().g();
                                if (g != null) {
                                    for (DXExtensionSectionLoader.a aVar : g) {
                                        aVar.a(null, childAt.getDXRuntimeContext(), null);
                                    }
                                }
                                childAt.setStatFlag(1048576);
                                break;
                            }
                            break;
                    }
                    this.d++;
                }
            } catch (Throwable th) {
                s.a aVar2 = new s.a(DXMonitorConstant.DX_MONITOR_PIPELINE, DXMonitorConstant.DX_SIMPLE_PIPELINE_CRASH, s.DX_SIMPLE_PIPELINE_CRASH);
                aVar2.e = com.taobao.android.dinamicx.exception.a.a(th);
                DXRuntimeContext dXRuntimeContext = this.i;
                if (dXRuntimeContext != null && dXRuntimeContext.n() != null && this.i.n().c != null) {
                    this.i.n().c.add(aVar2);
                }
                com.taobao.android.dinamicx.exception.a.b(th);
            }
        }
    }

    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (this.l) {
            this.f = new WeakReference<>(view);
        } else {
            this.e = view;
        }
    }

    public View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this});
        }
        if (this.l) {
            WeakReference<View> weakReference = this.f;
            if (weakReference == null) {
                return null;
            }
            return weakReference.get();
        }
        return this.e;
    }

    public final DXWidgetNode b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("65316b08", new Object[]{this});
        }
        this.g = i();
        return this.g;
    }

    public final DXWidgetNode c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("f26c1c89", new Object[]{this});
        }
        this.g = j();
        return this.g;
    }

    public final DXWidgetNode d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("7fa6ce0a", new Object[]{this});
        }
        this.g = k();
        return this.g;
    }

    public final DXWidgetNode e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("ce17f8b", new Object[]{this});
        }
        this.g = l();
        return this.g;
    }

    public final com.taobao.android.dinamicx.widget.bi m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.dinamicx.widget.bi) ipChange.ipc$dispatch("27437186", new Object[]{this});
        }
        this.q = f();
        return this.q;
    }

    public final com.taobao.android.dinamicx.widget.bi n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.dinamicx.widget.bi) ipChange.ipc$dispatch("c84e047", new Object[]{this});
        }
        this.q = g();
        return this.q;
    }

    public final View b(DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fc36e19", new Object[]{this, dXRenderOptions});
        }
        a(a(dXRenderOptions));
        return a();
    }

    public DXWidgetNode i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("41cc458f", new Object[]{this}) : this.g;
    }

    public DXWidgetNode j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("cf06f710", new Object[]{this}) : this.g;
    }

    public DXWidgetNode k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("5c41a891", new Object[]{this}) : this.g;
    }

    public DXWidgetNode l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("e97c5a12", new Object[]{this}) : this.g;
    }

    public com.taobao.android.dinamicx.widget.bi f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.dinamicx.widget.bi) ipChange.ipc$dispatch("e2796a3f", new Object[]{this}) : this.q;
    }

    public com.taobao.android.dinamicx.widget.bi g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.dinamicx.widget.bi) ipChange.ipc$dispatch("c7bad900", new Object[]{this}) : this.q;
    }

    public View a(DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("735571ba", new Object[]{this, dXRenderOptions}) : a();
    }
}
