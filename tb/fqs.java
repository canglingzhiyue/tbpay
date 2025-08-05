package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.exception.a;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.expr_v2.d;
import com.taobao.android.dinamicx.expression.expr_v2.f;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.monitor.b;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class fqs extends fqp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1228850693);
    }

    public fqs() {
        this.f28129a = (byte) 7;
    }

    @Override // tb.fqp
    public Object a(DXEvent dXEvent, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("dbbda377", new Object[]{this, dXEvent, dXRuntimeContext});
        }
        if (dXEvent != null) {
            try {
                if (dXEvent.isPrepareBind()) {
                    return null;
                }
            } catch (Throwable th) {
                a.b(th);
                b.a(dXRuntimeContext, DXMonitorConstant.DX_MONITOR_SCRIPT, DXMonitorConstant.DX_MONITOR_SCRIPT_ERROR, (int) s.DXSCRIPT_SCRIPT_NODE_ERROR, a.a(th));
                return null;
            }
        }
        d c = dXRuntimeContext.C() == null ? null : dXRuntimeContext.C().c();
        if (c == null) {
            return null;
        }
        String b = dXRuntimeContext.c() == null ? null : dXRuntimeContext.c().b();
        if (!c.b(b)) {
            DXWidgetNode d = dXRuntimeContext.d();
            if (d == null) {
                fuw.c(b + " 执行表达式失败: thisNode == null");
                return null;
            }
            DXWidgetNode queryRootWidgetNode = d.queryRootWidgetNode();
            if (queryRootWidgetNode == null) {
                fuw.c(b + " 执行表达式失败: rootNode == null)");
                return null;
            }
            byte[] dxExprBytes = queryRootWidgetNode.getDxExprBytes();
            if (dxExprBytes == null) {
                return null;
            }
            c.a(b, dxExprBytes, 0);
        }
        HashMap hashMap = new HashMap();
        if (dXEvent != null && dXEvent.getArgs() != null) {
            hashMap.putAll(dXEvent.getArgs());
        }
        Map<String, f> g = dXRuntimeContext.g();
        if (g != null) {
            hashMap.putAll(g);
        }
        d.a a2 = c.a(dXRuntimeContext, dXEvent, b, (int) this.d, dXRuntimeContext.e(), null, null, hashMap, dXRuntimeContext.C().d(), dXRuntimeContext.C().d(), dXRuntimeContext.C().d());
        if (a2.f11867a) {
            return f.a(a2.c);
        }
        fuw.c(b + " 模板中执行表达式失败: " + a2.b);
        return null;
    }
}
