package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;
import java.util.Map;

/* loaded from: classes.dex */
public class gcj extends ggw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-903077344);
    }

    @Override // tb.ghe
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "size";
    }

    @Override // tb.ghe
    public gfx execute(DXRuntimeContext dXRuntimeContext, gfx gfxVar, int i, gfx[] gfxVarArr, Map map) throws DXExprFunctionError {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gfx) ipChange.ipc$dispatch("e2ae9bd5", new Object[]{this, dXRuntimeContext, gfxVar, new Integer(i), gfxVarArr, map});
        }
        if (gfxVarArr == null || gfxVar == null) {
            return gfx.a(-1L);
        }
        try {
            int d = gfxVar.d();
            if (d == 6) {
                return gfx.a(gfxVar.o().size());
            }
            if (d == 7) {
                return gfx.a(gfxVar.r().size());
            }
            throw new DXExprFunctionError("size type has not size func type:" + d);
        } catch (Exception e) {
            throw new DXExprFunctionError(e);
        }
    }
}
