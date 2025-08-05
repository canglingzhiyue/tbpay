package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;
import java.util.Map;

/* loaded from: classes.dex */
public class gef extends ggw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-874906375);
    }

    @Override // tb.ghe
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "compareTo";
    }

    @Override // tb.ghe
    public gfx execute(DXRuntimeContext dXRuntimeContext, gfx gfxVar, int i, gfx[] gfxVarArr, Map map) throws DXExprFunctionError {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gfx) ipChange.ipc$dispatch("e2ae9bd5", new Object[]{this, dXRuntimeContext, gfxVar, new Integer(i), gfxVarArr, map});
        }
        if (gfxVarArr == null || gfxVarArr.length != 1 || gfxVar == null) {
            return gfx.a(0L);
        }
        try {
            if (gfxVar.z()) {
                return gfx.a(a(gfxVar.A(), gfxVarArr[0].B()));
            }
            return gfx.a(gfxVar.toString().compareTo(gfxVarArr[0].toString()));
        } catch (Exception e) {
            throw new DXExprFunctionError(e);
        }
    }

    public static int a(double d, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c0efa1b", new Object[]{new Double(d), new Double(d2)})).intValue();
        }
        double d3 = d - d2;
        if (Math.abs(d3) <= 1.0E-9d) {
            return 0;
        }
        return d3 > 1.0E-9d ? 1 : -1;
    }
}
