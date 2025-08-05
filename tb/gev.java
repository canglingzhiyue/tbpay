package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;
import java.util.Map;

/* loaded from: classes.dex */
public class gev extends ggw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(555184931);
    }

    @Override // tb.ghe
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "np";
    }

    @Override // tb.ghe
    public gfx execute(DXRuntimeContext dXRuntimeContext, gfx gfxVar, int i, gfx[] gfxVarArr, Map map) throws DXExprFunctionError {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gfx) ipChange.ipc$dispatch("e2ae9bd5", new Object[]{this, dXRuntimeContext, gfxVar, new Integer(i), gfxVarArr, map});
        }
        if (gfxVarArr == null || gfxVarArr.length == 0) {
            return gfx.a(0L);
        }
        gfx gfxVar2 = gfxVarArr[0];
        if (!gfxVar2.b()) {
            return gfx.a(0L);
        }
        return gfx.a(gbg.b(dXRuntimeContext.D(), dXRuntimeContext.m(), gfxVar2.C() * gbg.a(dXRuntimeContext.m())));
    }
}
