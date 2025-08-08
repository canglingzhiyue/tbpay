package com.taobao.android.dinamicx;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.HashMap;
import tb.frn;
import tb.fut;
import tb.fuw;
import tb.fvl;
import tb.fwg;
import tb.kge;

/* loaded from: classes.dex */
public class t implements com.taobao.android.dinamicx.expression.expr_v2.a, com.taobao.android.dinamicx.expression.expr_v2.c, com.taobao.android.dinamicx.expression.expr_v2.i {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CALL_DATA_PARSER = 1;
    public static final int CALL_EVENT = 0;

    /* renamed from: a  reason: collision with root package name */
    private HashMap<String, com.taobao.android.dinamicx.expression.expr_v2.j> f11921a;
    private fvl b;

    static {
        kge.a(464109180);
        kge.a(228940419);
        kge.a(230579907);
        kge.a(-88023853);
    }

    public t(HashMap<String, com.taobao.android.dinamicx.expression.expr_v2.j> hashMap, fvl fvlVar) {
        this.f11921a = hashMap;
        this.b = fvlVar;
    }

    @Override // com.taobao.android.dinamicx.expression.expr_v2.i
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.b != null;
    }

    @Override // com.taobao.android.dinamicx.expression.expr_v2.a
    public com.taobao.android.dinamicx.expression.expr_v2.f a(DXRuntimeContext dXRuntimeContext, String str) {
        HashMap<String, com.taobao.android.dinamicx.expression.expr_v2.j> hashMap;
        com.taobao.android.dinamicx.expression.expr_v2.j jVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.dinamicx.expression.expr_v2.f) ipChange.ipc$dispatch("fb06c1e9", new Object[]{this, dXRuntimeContext, str});
        }
        if (!StringUtils.isEmpty(str) && (hashMap = this.f11921a) != null && hashMap.size() != 0 && (jVar = this.f11921a.get(str)) != null) {
            return com.taobao.android.dinamicx.expression.expr_v2.f.a(jVar);
        }
        return null;
    }

    @Override // com.taobao.android.dinamicx.expression.expr_v2.c
    public com.taobao.android.dinamicx.expression.expr_v2.f a(DXRuntimeContext dXRuntimeContext, DXEvent dXEvent, long j, int i, int i2, com.taobao.android.dinamicx.expression.expr_v2.f[] fVarArr) {
        Object evalWithArgs;
        Object[] objArr;
        IpChange ipChange = $ipChange;
        int i3 = 0;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.dinamicx.expression.expr_v2.f) ipChange.ipc$dispatch("958c13ca", new Object[]{this, dXRuntimeContext, dXEvent, new Long(j), new Integer(i), new Integer(i2), fVarArr});
        }
        Object[] objArr2 = null;
        if (i == 0) {
            bn a2 = dXRuntimeContext.a(j);
            if (a2 == null) {
                com.taobao.android.dinamicx.monitor.b.a(dXRuntimeContext, DXMonitorConstant.DX_MONITOR_SCRIPT, DXMonitorConstant.DX_MONITOR_SCRIPT_ERROR, (int) s.DXSCRIPT_EVENT_NOTFOUND_2, "事件: " + j + "找不到");
                return null;
            }
            if (i2 < 0 || fVarArr == null || fVarArr.length != i2) {
                objArr = null;
            } else {
                objArr = new Object[i2];
                while (i3 < i2) {
                    objArr[i3] = fVarArr[i3].D();
                    i3++;
                }
            }
            if (dXEvent != null && dXEvent.isPrepareBind()) {
                a2.prepareBindEventWithArgs(objArr, dXRuntimeContext.d().getDXRuntimeContext());
            } else {
                a2.handleEvent(dXEvent, objArr, dXRuntimeContext.d().getDXRuntimeContext());
            }
            return null;
        } else if (i == 1) {
            fut futVar = dXRuntimeContext.l().get(j);
            if (futVar == null) {
                com.taobao.android.dinamicx.monitor.b.a(dXRuntimeContext, DXMonitorConstant.DX_MONITOR_SCRIPT, DXMonitorConstant.DX_MONITOR_SCRIPT_ERROR, (int) s.DXSCRIPT_DATAPARSER_NOTFOUND_2, "表达式: " + j + "找不到");
                return null;
            }
            if (i2 >= 0) {
                objArr2 = new Object[i2];
                while (i3 < i2) {
                    objArr2[i3] = fVarArr[i3].D();
                    i3++;
                }
            }
            if (futVar instanceof frn) {
                evalWithArgs = ((frn) futVar).a(dXEvent, objArr2, dXRuntimeContext);
            } else {
                evalWithArgs = futVar.evalWithArgs(objArr2, dXRuntimeContext);
            }
            return com.taobao.android.dinamicx.expression.expr_v2.f.b(evalWithArgs);
        } else {
            com.taobao.android.dinamicx.monitor.b.a(dXRuntimeContext, DXMonitorConstant.DX_MONITOR_SCRIPT, DXMonitorConstant.DX_MONITOR_SCRIPT_ERROR, (int) s.DXSCRIPT_CALLBACK_ERROR, "调用为不认识的type：  " + i);
            return null;
        }
    }

    @Override // com.taobao.android.dinamicx.expression.expr_v2.i
    public void a(DXRuntimeContext dXRuntimeContext, DXEvent dXEvent, String str, String str2, int i, com.taobao.android.dinamicx.expression.expr_v2.f[] fVarArr) {
        fwg.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0434c77", new Object[]{this, dXRuntimeContext, dXEvent, str, str2, new Integer(i), fVarArr});
        } else if (this.b == null) {
            fuw.d("DinamicX", "call js 失败 idxjsEngine == null");
        } else if (dXEvent != null && dXEvent.isPrepareBind()) {
        } else {
            if (dXRuntimeContext == null) {
                fuw.d("DinamicX", "call js 失败 runtimeContext == null");
            } else if (dXRuntimeContext.d() == null) {
                fuw.d("DinamicX", "call js 失败 runtimeContext widgetNode == null");
            } else {
                DXRuntimeContext a2 = a(dXRuntimeContext.d());
                if (a2 == null) {
                    fuw.d("DinamicX", "call js 失败 rootRuntimeContext == null");
                    return;
                }
                if (a2.h() <= 0) {
                    if (dXRuntimeContext.c() == null) {
                        fuw.d("DinamicX", "call js 失败 runtimeContext.getDxTemplateItem() == null");
                        return;
                    }
                    byte[] a3 = fwg.a().a(dXRuntimeContext.c().b());
                    if (a3 == null) {
                        if (dXRuntimeContext.d().isChildWidgetNode()) {
                            aVar = new fwg.a(dXRuntimeContext, false);
                        } else {
                            aVar = new fwg.a(dXRuntimeContext, true);
                        }
                        aVar.run();
                        fuw.d("主线程加载 " + dXRuntimeContext.c().b() + " 的js文件");
                        byte[] a4 = aVar.a();
                        if (a4 != null) {
                            fwg.a().a(dXRuntimeContext.c().b(), aVar.a());
                        }
                        a3 = a4;
                    }
                    a2.a(this.b.a(dXRuntimeContext, a3));
                }
                fuw.a("开始调用js的函数  module: " + str + "  method:  " + str2);
                this.b.a(a2.h(), dXRuntimeContext, str, str2, i, fVarArr);
            }
        }
    }

    private DXRuntimeContext a(DXWidgetNode dXWidgetNode) {
        DXWidgetNode queryRootWidgetNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRuntimeContext) ipChange.ipc$dispatch("49858920", new Object[]{this, dXWidgetNode});
        }
        if (dXWidgetNode == null || (queryRootWidgetNode = dXWidgetNode.queryRootWidgetNode()) == null) {
            return null;
        }
        if ((queryRootWidgetNode instanceof com.taobao.android.dinamicx.widget.ac) && ((com.taobao.android.dinamicx.widget.ac) queryRootWidgetNode).e() == 1) {
            return a(queryRootWidgetNode.getParentWidget());
        }
        return queryRootWidgetNode.getDXRuntimeContext();
    }
}
