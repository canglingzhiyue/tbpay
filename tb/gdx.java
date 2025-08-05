package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;
import tb.mto;

/* loaded from: classes.dex */
public class gdx extends ggw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1563761272);
    }

    @Override // tb.ghe
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "roundf";
    }

    @Override // tb.ghe
    public gfx execute(DXRuntimeContext dXRuntimeContext, gfx gfxVar, int i, gfx[] gfxVarArr, Map map) throws DXExprFunctionError {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gfx) ipChange.ipc$dispatch("e2ae9bd5", new Object[]{this, dXRuntimeContext, gfxVar, new Integer(i), gfxVarArr, map});
        }
        if (gfxVarArr == null || gfxVarArr.length != 2 || gfxVar == null) {
            return gfx.a((double) mto.a.GEO_NOT_SUPPORT);
        }
        try {
            double B = gfxVarArr[0].B();
            int w = gfxVarArr[1].w();
            if (w <= 0) {
                throw new DXExprFunctionError("roundf arg[1] must > 0");
            }
            return gfx.a(new BigDecimal(B).setScale(w, RoundingMode.HALF_UP).doubleValue());
        } catch (Exception e) {
            throw new DXExprFunctionError(e);
        }
    }
}
