package com.taobao.android.dinamicx;

import android.os.Looper;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.lang.ref.WeakReference;
import java.util.Map;
import tb.fqb;
import tb.fux;
import tb.fva;
import tb.fvd;
import tb.fxe;
import tb.fzl;
import tb.fzm;
import tb.fzn;
import tb.fzo;
import tb.gff;
import tb.ghc;
import tb.kge;

/* loaded from: classes.dex */
public class am extends DXRenderPipelineBase implements fzo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DATA_PARSE_TIME = "dataParseTime";
    public static final String END_STAGE = "endStage";
    public static final String FLATTEN_TIME = "flattenTime";
    public static final String FROM_STAGE = "fromStage";
    public static final String IS_CONTROL_EVENT = "isControlEvent";
    public static final String LAYOUT_TIME = "layoutTime";
    public static final String LOAD_BINARY_TIME = "loadBinaryTime";
    public static final String MEASURE_TIME = "measureTime";
    public static final String PIPELINE_TYPE = "pipelineType";
    public static final String REFRESH_TYPE = "renderType";
    public static final String RENDER_TIME = "renderTime";
    public static final String RENDER_TYPE = "renderType";
    public static final String THREAD_NAME = "threadName";
    public fva c;
    public ax d;
    public x e;
    public al f;
    public aw g;
    public WeakReference<fzm> h;
    public WeakReference<ab> i;
    public ghc j;
    public gff k;

    static {
        kge.a(-797730337);
        kge.a(644992161);
    }

    public static /* synthetic */ Object ipc$super(am amVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(am amVar, fzl fzlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("110c40d0", new Object[]{amVar, fzlVar});
        } else {
            amVar.b(fzlVar);
        }
    }

    public am(r rVar, aw awVar) {
        super(rVar);
        this.d = new ax();
        this.e = new x();
        this.f = new al();
        DinamicXEngine b = rVar.b();
        if (b == null) {
            return;
        }
        this.c = b.g;
        this.g = awVar;
        this.h = new WeakReference<>(b.f);
        this.i = new WeakReference<>(b.h);
        g();
        h();
        this.k = new gff(this.j, this.d);
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (u.g() == null || u.g().c() == null) {
        } else {
            this.j = u.g().c().a();
        }
    }

    public aw d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aw) ipChange.ipc$dispatch("c6f4b311", new Object[]{this}) : this.g;
    }

    public fzm e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fzm) ipChange.ipc$dispatch("2dcb6fa1", new Object[]{this}) : this.h.get();
    }

    public ab f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ab) ipChange.ipc$dispatch("af732144", new Object[]{this}) : this.i.get();
    }

    public DXResult<DXRootView> a(DXRootView dXRootView, DXRuntimeContext dXRuntimeContext, int i, DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXResult) ipChange.ipc$dispatch("a750b56a", new Object[]{this, dXRootView, dXRuntimeContext, new Integer(i), dXRenderOptions});
        }
        if (dXRootView == null) {
            return null;
        }
        fux.b("开始渲染 tpl: " + dXRuntimeContext.K() + " renderType: " + dXRenderOptions.g() + " isControlEvent: " + dXRenderOptions.e());
        a(dXRootView);
        dXRootView.data = dXRuntimeContext.e();
        dXRootView.setPosition(i);
        dXRootView.parentWidthSpec = dXRenderOptions.a();
        dXRootView.parentHeightSpec = dXRenderOptions.b();
        dXRootView.dxTemplateItem = dXRuntimeContext.c();
        View a2 = a(null, dXRootView.getFlattenWidgetNode(), dXRootView, dXRuntimeContext, dXRenderOptions);
        DXResult<DXRootView> dXResult = new DXResult<>();
        if (a2 != null && (a2 instanceof DXRootView)) {
            dXResult.a((DXResult<DXRootView>) ((DXRootView) a2));
        }
        dXResult.a(dXRuntimeContext.n());
        return dXResult;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    public android.view.View a(com.taobao.android.dinamicx.widget.DXWidgetNode r52, com.taobao.android.dinamicx.widget.DXWidgetNode r53, android.view.View r54, com.taobao.android.dinamicx.DXRuntimeContext r55, com.taobao.android.dinamicx.DXRenderOptions r56) {
        /*
            Method dump skipped, instructions count: 3216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.am.a(com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode, android.view.View, com.taobao.android.dinamicx.DXRuntimeContext, com.taobao.android.dinamicx.DXRenderOptions):android.view.View");
    }

    private void a(DXRuntimeContext dXRuntimeContext, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("637047c1", new Object[]{this, dXRuntimeContext, str, new Long(j)});
        } else if (dXRuntimeContext == null) {
        } else {
            try {
                if (dXRuntimeContext.p() == null) {
                    return;
                }
                dXRuntimeContext.p().a(str, Float.valueOf(((float) (System.nanoTime() - j)) / 1000000.0f));
            } catch (Throwable th) {
                com.taobao.android.dinamicx.exception.a.b(th);
            }
        }
    }

    private void a(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("487cd5d9", new Object[]{this, dXRuntimeContext});
        } else if (dXRuntimeContext == null) {
        } else {
            try {
                if (dXRuntimeContext.p() == null) {
                    return;
                }
                dXRuntimeContext.p().c(Long.valueOf(System.currentTimeMillis()));
            } catch (Throwable th) {
                com.taobao.android.dinamicx.exception.a.b(th);
            }
        }
    }

    private void b(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c07f39a", new Object[]{this, dXRuntimeContext});
        } else if (dXRuntimeContext == null) {
        } else {
            try {
                if (dXRuntimeContext.p() == null) {
                    return;
                }
                dXRuntimeContext.p().d(Long.valueOf(System.currentTimeMillis()));
            } catch (Throwable th) {
                com.taobao.android.dinamicx.exception.a.b(th);
            }
        }
    }

    private void c(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf93115b", new Object[]{this, dXRuntimeContext});
        } else if (dXRuntimeContext == null) {
        } else {
            try {
                if (dXRuntimeContext.p() == null) {
                    return;
                }
                dXRuntimeContext.p().e(Long.valueOf(System.currentTimeMillis()));
            } catch (Throwable th) {
                com.taobao.android.dinamicx.exception.a.b(th);
            }
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        fzm e = e();
        if (e == null) {
            return;
        }
        e.a(this, fzn.DX_EVENT_PIPELINE_SCHEDULE);
    }

    @Override // tb.fzo
    public void a(final fzl fzlVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e98c89c0", new Object[]{this, fzlVar});
            return;
        }
        if (fzlVar instanceof fzn) {
            z = ((fzn) fzlVar).f;
        }
        if (z && Thread.currentThread() == Looper.getMainLooper().getThread()) {
            b(fzlVar);
            return;
        }
        fxe.a();
        fxe.a(new Runnable() { // from class: com.taobao.android.dinamicx.am.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    am.a(am.this, fzlVar);
                }
            }
        });
    }

    private void b(fzl fzlVar) {
        DXWidgetNode dXWidgetNode;
        DXRuntimeContext dXRuntimeContext;
        DXRootView s;
        int intValue;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d80f9041", new Object[]{this, fzlVar});
        } else if (fzlVar == null || !(fzlVar instanceof fzn)) {
        } else {
            fzn fznVar = (fzn) fzlVar;
            if (!(fzlVar.f28239a instanceof DXWidgetNode) || (dXWidgetNode = (DXWidgetNode) fzlVar.f28239a) == null || (dXRuntimeContext = dXWidgetNode.getDXRuntimeContext()) == null || dXRuntimeContext.f11781a.c != 0 || (s = dXRuntimeContext.s()) == null || !dXRuntimeContext.c().equals(s.dxTemplateItem) || dXRuntimeContext.e() != s.data || dXWidgetNode.getDXRuntimeContext().C().b() == null) {
                return;
            }
            DXRuntimeContext a2 = dXWidgetNode.getDXRuntimeContext().a(dXWidgetNode);
            Object obj = fzlVar.c.get("width");
            Object obj2 = fzlVar.c.get("height");
            int y = dXRuntimeContext.y();
            int z2 = dXRuntimeContext.z();
            if (obj == null) {
                intValue = 0;
            } else {
                try {
                    intValue = ((Integer) obj).intValue();
                } catch (Exception e) {
                    com.taobao.android.dinamicx.exception.a.b(e);
                }
            }
            int intValue2 = obj2 == null ? 0 : ((Integer) obj2).intValue();
            if (intValue > 0) {
                y = DXWidgetNode.DXMeasureSpec.a(intValue, 1073741824);
                a2.g(y);
                dXWidgetNode.setLayoutWidth(intValue);
                z = true;
            }
            if (intValue2 > 0) {
                z2 = DXWidgetNode.DXMeasureSpec.a(intValue2, 1073741824);
                a2.f(z2);
                dXWidgetNode.setLayoutHeight(intValue2);
                z = true;
            }
            if (z) {
                dXWidgetNode.setStatFlag(4);
                dXWidgetNode.measure(y, z2);
            }
            a2.y = fznVar.e;
            DXRenderOptions a3 = new DXRenderOptions.a().a(true).d(fznVar.d).a(y).b(z2).e(9).a();
            if (a2.G()) {
                dXWidgetNode.updateRefreshType(a2.F());
            }
            a(dXWidgetNode, s.getFlattenWidgetNode(), s, a2, a3);
        }
    }

    public void a(DXRuntimeContext dXRuntimeContext, String str, long j, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a62f9a4", new Object[]{this, dXRuntimeContext, str, new Long(j), map});
            return;
        }
        try {
            com.taobao.android.dinamicx.monitor.b.a(1, dXRuntimeContext.A(), DXMonitorConstant.DX_MONITOR_PIPELINE, str, dXRuntimeContext == null ? null : dXRuntimeContext.c(), map, j, true);
        } catch (Exception e) {
            if (!DinamicXEngine.j()) {
                return;
            }
            e.printStackTrace();
        }
    }

    private void a(s sVar, String str, int i, String str2, Map<String, String> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa313df9", new Object[]{this, sVar, str, new Integer(i), str2, map, new Boolean(z)});
        } else if (sVar == null || sVar.c == null) {
        } else {
            s.a aVar = new s.a(DXMonitorConstant.DX_MONITOR_PIPELINE, str, i);
            aVar.e = str2;
            aVar.f = map;
            sVar.c.add(aVar);
            if (!z) {
                return;
            }
            com.taobao.android.dinamicx.monitor.b.a(sVar);
        }
    }

    private void d(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("131e2f1c", new Object[]{this, dXRuntimeContext});
        } else if (dXRuntimeContext == null) {
        } else {
            try {
                DXTemplateItem c = dXRuntimeContext.c();
                DXEngineConfig b = b();
                if (b == null || b.e || d() == null || c == null) {
                    return;
                }
                d().c(c);
                a(dXRuntimeContext, 1000);
            } catch (Exception e) {
                if (!DinamicXEngine.j()) {
                    return;
                }
                e.printStackTrace();
            }
        }
    }

    private void a(DXRuntimeContext dXRuntimeContext, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c71e584a", new Object[]{this, dXRuntimeContext, new Integer(i)});
        } else if (this.c == null || dXRuntimeContext == null) {
        } else {
            fvd fvdVar = new fvd();
            fvdVar.f28145a = dXRuntimeContext.c();
            fvdVar.d = dXRuntimeContext.a();
            fvdVar.b = dXRuntimeContext.e();
            fvdVar.c = i;
            this.c.a(fvdVar);
        }
    }

    private boolean a(DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("77fcc77c", new Object[]{this, dXRenderOptions})).booleanValue() : dXRenderOptions.g() == 1 && dXRenderOptions.f();
    }

    private void a(DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc619e9", new Object[]{this, dXRootView});
            return;
        }
        try {
            fqb bindingXManager = dXRootView.getBindingXManager();
            if (bindingXManager == null) {
                return;
            }
            bindingXManager.a(dXRootView);
        } catch (Exception e) {
            com.taobao.android.dinamicx.exception.a.b(e);
            s sVar = new s(a());
            sVar.c.add(new s.a(DXMonitorConstant.DX_MONITOR_PIPELINE, DXMonitorConstant.DX_MONITOR_SERVICE_ID_PIPELINE_STAGE_RESET_BINDINGX, s.RESET_ANIMATION_CRASH, com.taobao.android.dinamicx.exception.a.a(e)));
            com.taobao.android.dinamicx.monitor.b.a(sVar);
        }
    }

    public DXWidgetNode a(DXWidgetNode dXWidgetNode, DXRuntimeContext dXRuntimeContext, DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("a7cf1c07", new Object[]{this, dXWidgetNode, dXRuntimeContext, dXRenderOptions}) : this.k.a(dXWidgetNode, dXRuntimeContext, dXRenderOptions);
    }

    public DXWidgetNode b(DXWidgetNode dXWidgetNode, DXRuntimeContext dXRuntimeContext, DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("69cd8408", new Object[]{this, dXWidgetNode, dXRuntimeContext, dXRenderOptions}) : this.k.b(dXWidgetNode, dXRuntimeContext, dXRenderOptions);
    }

    public com.taobao.android.dinamicx.widget.bi a(DXWidgetNode dXWidgetNode, DXRuntimeContext dXRuntimeContext, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.dinamicx.widget.bi) ipChange.ipc$dispatch("4e239fee", new Object[]{this, dXWidgetNode, dXRuntimeContext, new Boolean(z)}) : this.e.a(dXWidgetNode, dXRuntimeContext, z);
    }

    public View a(DXWidgetNode dXWidgetNode, com.taobao.android.dinamicx.widget.bi biVar, View view, DXRuntimeContext dXRuntimeContext, int i, DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("7bb68a67", new Object[]{this, dXWidgetNode, biVar, view, dXRuntimeContext, new Integer(i), dXRenderOptions}) : this.f.a(dXWidgetNode, (DXWidgetNode) biVar, view, dXRuntimeContext, 0, dXRenderOptions);
    }
}
