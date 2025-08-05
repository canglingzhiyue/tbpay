package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;
import java.util.Map;
import tb.mto;

/* loaded from: classes.dex */
public class gcl extends ggw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-923833909);
    }

    @Override // tb.ghe
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "toDouble";
    }

    @Override // tb.ghe
    public gfx execute(DXRuntimeContext dXRuntimeContext, gfx gfxVar, int i, gfx[] gfxVarArr, Map map) throws DXExprFunctionError {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gfx) ipChange.ipc$dispatch("e2ae9bd5", new Object[]{this, dXRuntimeContext, gfxVar, new Integer(i), gfxVarArr, map});
        }
        if (gfxVar == null) {
            return gfx.a((double) mto.a.GEO_NOT_SUPPORT);
        }
        if (gfxVar.k() && gfxVar.J() != null) {
            try {
                return gfx.a(gfxVar.B());
            } catch (Exception e) {
                throw new DXExprFunctionError(e);
            }
        } else if (gfxVar.v()) {
            return gfx.a(gfxVar.w());
        } else {
            return gfxVar.z() ? gfxVar : gfx.a((double) mto.a.GEO_NOT_SUPPORT);
        }
    }
}
