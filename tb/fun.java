package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.eventchain.h;

/* loaded from: classes.dex */
public class fun extends fum {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-599818817);
    }

    @Override // tb.fuf, com.taobao.android.dinamicx.expression.expr_v2.j
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "lastdata";
    }

    @Override // tb.fum
    public Object a(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("96478e79", new Object[]{this, dXRuntimeContext});
        }
        h E = dXRuntimeContext.E();
        if (E != null) {
            return E.b();
        }
        return null;
    }
}
