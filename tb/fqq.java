package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.s;
import java.util.Arrays;

/* loaded from: classes.dex */
public class fqq extends fqp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f28130a;
        public int b = 0;

        static {
            kge.a(-567362901);
        }
    }

    static {
        kge.a(1347734299);
    }

    public fqq() {
        this.f28129a = (byte) 1;
    }

    @Override // tb.fqp
    public Object a(DXEvent dXEvent, DXRuntimeContext dXRuntimeContext) {
        fug fugVar;
        boolean z;
        Object evalWithArgs;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("dbbda377", new Object[]{this, dXEvent, dXRuntimeContext});
        }
        Object obj = null;
        try {
            fut futVar = this.d != 0 ? dXRuntimeContext.l().get(this.d) : null;
            if (futVar == null) {
                s.a aVar = new s.a(DXMonitorConstant.DX_MONITOR_AST_NODE, DXMonitorConstant.DX_MONITOR_SERVICE_ID_AST_METHOD_NODE, 100001);
                aVar.e = "exprId:" + this.d;
                dXRuntimeContext.n().c.add(aVar);
                return null;
            }
            if (futVar instanceof fug) {
                fugVar = (fug) futVar;
                z = true;
            } else {
                fugVar = null;
                z = false;
            }
            int size = this.c != null ? this.c.size() : 0;
            a aVar2 = new a();
            Object[] objArr = new Object[size];
            Object obj2 = null;
            int i = 0;
            while (i < size) {
                try {
                    objArr[i] = this.c.get(i).a(dXEvent, dXRuntimeContext);
                    if (z) {
                        com.taobao.android.preview.a.a();
                        Arrays.copyOfRange(objArr, 0, i + 1);
                        obj2 = fugVar.a(objArr, dXRuntimeContext, aVar2, i);
                        com.taobao.android.preview.a.a();
                        if (aVar2.f28130a) {
                            break;
                        } else if (aVar2.b > 0) {
                            i += aVar2.b;
                            aVar2.b = 0;
                        }
                    }
                    i++;
                } catch (Throwable th) {
                    th = th;
                    obj = obj2;
                    if (dXRuntimeContext != null) {
                        s.a aVar3 = new s.a(DXMonitorConstant.DX_MONITOR_AST_NODE, DXMonitorConstant.DX_MONITOR_SERVICE_ID_AST_METHOD_NODE, 100002);
                        aVar3.e = com.taobao.android.dinamicx.exception.a.a(th);
                        dXRuntimeContext.n().c.add(aVar3);
                    }
                    com.taobao.android.dinamicx.exception.a.b(th);
                    return obj;
                }
            }
            Object obj3 = obj2;
            if (z) {
                return obj3;
            }
            com.taobao.android.preview.a.a();
            if (futVar instanceof frn) {
                evalWithArgs = ((frn) futVar).a(dXEvent, objArr, dXRuntimeContext);
            } else {
                evalWithArgs = futVar.evalWithArgs(objArr, dXRuntimeContext);
            }
            Object obj4 = evalWithArgs;
            com.taobao.android.preview.a.a();
            return obj4;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
