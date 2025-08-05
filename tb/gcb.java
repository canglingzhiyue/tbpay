package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;
import java.util.Map;

/* loaded from: classes.dex */
public class gcb extends ggw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(31641278);
    }

    @Override // tb.ghe
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "contains";
    }

    @Override // tb.ghe
    public gfx execute(DXRuntimeContext dXRuntimeContext, gfx gfxVar, int i, gfx[] gfxVarArr, Map map) throws DXExprFunctionError {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gfx) ipChange.ipc$dispatch("e2ae9bd5", new Object[]{this, dXRuntimeContext, gfxVar, new Integer(i), gfxVarArr, map});
        }
        if (gfxVarArr == null || gfxVarArr.length != 1 || gfxVar == null) {
            return gfx.a(false);
        }
        try {
            int d = gfxVar.d();
            gfx gfxVar2 = gfxVarArr[0];
            if (d == 5) {
                return gfx.a(gfxVar.i().contains(gfxVar2.i()));
            }
            if (d == 6) {
                return gfx.a(gfxVar.o().contains(gfxVar2.J()));
            }
            if (d == 7) {
                return gfx.a(gfxVar.r().containsKey(gfxVar2.i()));
            }
            throw new DXExprFunctionError("contains type has contains type:" + d);
        } catch (Exception e) {
            throw new DXExprFunctionError(e);
        }
    }
}
