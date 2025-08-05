package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.bn;
import com.taobao.android.dinamicx.exception.a;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.monitor.b;
import com.taobao.android.dinamicx.s;

/* loaded from: classes.dex */
public class fqo extends fqp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1980165084);
    }

    @Override // tb.fqp
    public Object a(DXEvent dXEvent, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("dbbda377", new Object[]{this, dXEvent, dXRuntimeContext});
        }
        if (dXRuntimeContext != null) {
            try {
            } catch (Exception e) {
                if (DinamicXEngine.j()) {
                    e.printStackTrace();
                }
                s sVar = new s(dXRuntimeContext.A());
                s.a aVar = new s.a(DXMonitorConstant.DX_MONITOR_AST_NODE, DXMonitorConstant.DX_MONITOR_SERVICE_ID_AST_NODE_EVENT_HANDLER, 100004);
                if (dXRuntimeContext != null) {
                    sVar.b = dXRuntimeContext.c();
                }
                if (dXEvent != null) {
                    aVar.e = "eventId: " + dXEvent.getEventId() + " isPrepareBind: " + dXEvent.isPrepareBind() + "  stack： " + a.a(e);
                }
                sVar.c.add(aVar);
                b.a(sVar);
            }
            if (dXRuntimeContext.d() != null) {
                bn a2 = dXRuntimeContext.a(this.d);
                if (a2 == null) {
                    if (dXEvent != null && !dXEvent.isPrepareBind()) {
                        s sVar2 = new s(dXRuntimeContext.A());
                        if (dXRuntimeContext.c() != null) {
                            sVar2.b = dXRuntimeContext.c();
                        }
                        s.a aVar2 = new s.a(DXMonitorConstant.DX_MONITOR_AST_NODE, DXMonitorConstant.DX_MONITOR_SERVICE_ID_AST_NODE_EVENT_HANDLER, 100003);
                        aVar2.e = "找不到用户注册的eventHandle  hashcode 为: " + this.d;
                        sVar2.c.add(aVar2);
                        b.a(sVar2);
                    }
                    return null;
                }
                int size = this.c != null ? this.c.size() : 0;
                Object[] objArr = new Object[size];
                for (int i = 0; i < size; i++) {
                    objArr[i] = this.c.get(i).a(dXEvent, dXRuntimeContext);
                }
                if (dXEvent != null && dXEvent.isPrepareBind()) {
                    a2.prepareBindEventWithArgs(objArr, dXRuntimeContext.d().getDXRuntimeContext());
                } else {
                    a2.handleEvent(dXEvent, objArr, dXRuntimeContext.d().getDXRuntimeContext());
                }
                if (dXRuntimeContext.H()) {
                    return new Object();
                }
            }
        }
        return null;
    }
}
