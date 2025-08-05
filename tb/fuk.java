package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* loaded from: classes.dex */
public class fuk extends fum {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_EVENTCHAINDATA = 1597069669224900237L;

    static {
        kge.a(-651631078);
    }

    @Override // tb.fuf, com.taobao.android.dinamicx.expression.expr_v2.j
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "eventChainData";
    }

    @Override // tb.fum
    public Object a(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("96478e79", new Object[]{this, dXRuntimeContext});
        }
        if (dXRuntimeContext != null && dXRuntimeContext.E() != null) {
            return dXRuntimeContext.E().c();
        }
        return null;
    }
}
