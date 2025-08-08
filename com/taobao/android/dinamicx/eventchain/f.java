package com.taobao.android.dinamicx.eventchain;

import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.bx;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.monitor.DXTraceUtil;
import com.taobao.android.dinamicx.monitor.i;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import tb.dle;
import tb.fqi;
import tb.fuw;
import tb.fxe;
import tb.kge;

/* loaded from: classes.dex */
public class f extends com.taobao.android.dinamicx.h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_EVENTCHAIN = -812009131795779670L;
    private static final AtomicInteger b;

    /* renamed from: a  reason: collision with root package name */
    public a f11852a;

    /* loaded from: classes5.dex */
    public interface a {
        void a(j jVar);
    }

    public void a(String str, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea15f932", new Object[]{this, str, dVar});
        }
    }

    public void a(String str, j jVar, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f66ab7ec", new Object[]{this, str, jVar, dVar});
        }
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.expression.expr_v2.j
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "dxEventHandler";
    }

    static {
        kge.a(-1922080032);
        b = new AtomicInteger(0);
    }

    public f(a aVar) {
        this.f11852a = aVar;
    }

    public f() {
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(final DXEvent dXEvent, final Object[] objArr, final DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (fqi.y()) {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                a(dXEvent, objArr, dXRuntimeContext, (DXWidgetNode) null);
            } else {
                fxe.a(new Runnable() { // from class: com.taobao.android.dinamicx.eventchain.f.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            f.this.a(dXEvent, objArr, dXRuntimeContext, (DXWidgetNode) null);
                        }
                    }
                });
            }
        } else {
            a(dXEvent, objArr, dXRuntimeContext, (DXWidgetNode) null);
        }
    }

    public void a(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext, DXWidgetNode dXWidgetNode) {
        d dVar;
        long nanoTime;
        l a2;
        String obj;
        Object obj2;
        i g;
        DXWidgetNode queryRootWidgetNode;
        Map<String, com.taobao.android.dinamicx.expression.expr_v2.f> args;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9aca6737", new Object[]{this, dXEvent, objArr, dXRuntimeContext, dXWidgetNode});
        } else if (objArr != null && objArr.length != 0 && !StringUtils.isEmpty(objArr[0].toString())) {
            if (dXRuntimeContext == null || dXRuntimeContext.C() == null || dXRuntimeContext.C().b() == null || dXRuntimeContext.C().b().g() == null) {
                fuw.d("DXEventChainEventHandler", "dx evnetchain handle error : Missing the necessary parameters(eventChainManage)");
                return;
            }
            try {
                nanoTime = System.nanoTime();
                a2 = a(dXEvent, objArr, dXRuntimeContext);
                a2.a(dXRuntimeContext.m());
                a2.a(dXRuntimeContext.v());
                obj = objArr[0].toString();
                obj2 = objArr.length > 1 ? objArr[1] : null;
                DXTraceUtil.a(2, "DX-EventChain-Start", " : ", obj);
                g = dXRuntimeContext.C().b().g();
                dVar = new d();
            } catch (Throwable th) {
                th = th;
                dVar = null;
            }
            try {
                dVar.a(dXRuntimeContext.v());
                dVar.a(dXRuntimeContext);
                dVar.a(a2);
                dVar.a(g);
                if (fqi.u() && (dXWidgetNode instanceof DXWidgetNode)) {
                    dVar.a(dXWidgetNode.getDxEventChains());
                    dVar.a(true);
                } else if (fqi.u() && ((dXRuntimeContext == null || dXRuntimeContext.d() == null) && (queryRootWidgetNode = dXRuntimeContext.d().queryRootWidgetNode()) != null)) {
                    dVar.a(queryRootWidgetNode.getDxEventChains());
                }
                a2.a(g.d());
                a2.a(dXRuntimeContext.s());
                a2.a(dXRuntimeContext.d());
                g.a(dVar);
                JSONObject jSONObject = new JSONObject();
                if (dXEvent != null && (args = dXEvent.getArgs()) != null) {
                    for (Map.Entry<String, com.taobao.android.dinamicx.expression.expr_v2.f> entry : args.entrySet()) {
                        jSONObject.put(entry.getKey(), entry.getValue().D());
                    }
                }
                h hVar = new h();
                hVar.a((dle) a2);
                hVar.b(obj2);
                hVar.c(jSONObject);
                hVar.a(dXEvent);
                dXRuntimeContext.a(hVar);
                dVar.a(hVar);
                if (DinamicXEngine.j()) {
                    a(obj, dVar, dXRuntimeContext.d() != null ? dXRuntimeContext.d().getClass().getName() : null, dXEvent);
                }
                dVar.b(obj);
                a(obj, dVar);
                dVar.b(objArr.length > 3 ? "true".equals(objArr[2]) : false);
                if (bx.m()) {
                    fuw.h(" 开始执行事件链 ", obj);
                }
                j a3 = g.a("$(main)", obj, dVar);
                if (bx.m()) {
                    fuw.h(" 结束执行事件链 ", obj, " ret ", JSON.toJSONString(a3));
                }
                if (this.f11852a != null) {
                    this.f11852a.a(a3);
                }
                a(obj, a3, dVar);
                long nanoTime2 = System.nanoTime();
                if (bx.h()) {
                    fuw.g("执行事件链 " + obj + " 耗时为 " + ((nanoTime2 - nanoTime) / 1000000.0d) + " ms");
                }
                DXTraceUtil.a(2);
            } catch (Throwable th2) {
                th = th2;
                s.a aVar = new s.a(DXMonitorConstant.DX_MONITOR_EVENTCHAIN, DXMonitorConstant.DX_EVENTCHAIN_CRASH, s.EVENTCHAIN_EXECUTE_CRASH);
                aVar.e = com.taobao.android.dinamicx.exception.a.a(th);
                dXRuntimeContext.n().c.add(aVar);
                if (DinamicXEngine.j()) {
                    i.a(dVar != null ? dVar.k() : -1, j.a(-1, th.getMessage()), dVar);
                }
                com.taobao.android.dinamicx.exception.a.b(th);
            }
        }
    }

    public l a(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (l) ipChange.ipc$dispatch("be789fd6", new Object[]{this, dXEvent, objArr, dXRuntimeContext}) : new l();
    }

    private static void a(String str, d dVar, String str2, DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f19be3e", new Object[]{str, dVar, str2, dXEvent});
        } else if (!DinamicXEngine.j()) {
        } else {
            int incrementAndGet = b.incrementAndGet();
            DXTemplateItem dXTemplateItem = null;
            if (dVar != null) {
                dVar.i();
                DXRuntimeContext a2 = dVar.a();
                if (a2 != null) {
                    dXTemplateItem = a2.c();
                }
            }
            i.a aVar = new i.a(incrementAndGet, str, dXTemplateItem, str2, dXEvent);
            if (dVar != null) {
                dVar.a(aVar);
            }
            com.taobao.android.dinamicx.monitor.l.a().a(aVar);
        }
    }
}
