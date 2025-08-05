package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.eventchain.h;

/* loaded from: classes.dex */
public class frv extends fum {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1023217171);
    }

    @Override // tb.fuf, com.taobao.android.dinamicx.expression.expr_v2.j
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "getChainStorage";
    }

    @Override // tb.fum
    public Object a(DXRuntimeContext dXRuntimeContext) {
        dle a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("96478e79", new Object[]{this, dXRuntimeContext});
        }
        h E = dXRuntimeContext.E();
        if (E != null && (a2 = E.a()) != null) {
            return a2.d();
        }
        return null;
    }
}
