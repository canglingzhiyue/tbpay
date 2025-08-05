package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;
import java.util.Map;

/* loaded from: classes.dex */
public class gch extends ggw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1130636829);
    }

    @Override // tb.ghe
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "remove";
    }

    @Override // tb.ghe
    public gfx execute(DXRuntimeContext dXRuntimeContext, gfx gfxVar, int i, gfx[] gfxVarArr, Map map) throws DXExprFunctionError {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gfx) ipChange.ipc$dispatch("e2ae9bd5", new Object[]{this, dXRuntimeContext, gfxVar, new Integer(i), gfxVarArr, map});
        }
        if (gfxVarArr == null || gfxVarArr.length != 1 || gfxVar == null) {
            return gfx.e();
        }
        try {
            gfx gfxVar2 = gfxVarArr[0];
            int d = gfxVar.d();
            if (d == 6) {
                Boolean valueOf = Boolean.valueOf(gfxVar.o().remove(gfxVar2.J()));
                if (valueOf == null) {
                    return gfx.e();
                }
                return gfx.a(valueOf);
            } else if (d == 7) {
                Object remove = gfxVar.r().remove(gfxVar2.i());
                if (remove == null) {
                    return gfx.e();
                }
                return gfx.a(remove);
            } else {
                throw new DXExprFunctionError("remove type has not size func type:" + d);
            }
        } catch (Exception e) {
            throw new DXExprFunctionError(e);
        }
    }
}
