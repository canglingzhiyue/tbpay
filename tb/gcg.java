package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;
import java.util.Map;

/* loaded from: classes.dex */
public class gcg extends ggw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(441922403);
    }

    @Override // tb.ghe
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "isNotEmpty";
    }

    @Override // tb.ghe
    public gfx execute(DXRuntimeContext dXRuntimeContext, gfx gfxVar, int i, gfx[] gfxVarArr, Map map) throws DXExprFunctionError {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (gfx) ipChange.ipc$dispatch("e2ae9bd5", new Object[]{this, dXRuntimeContext, gfxVar, new Integer(i), gfxVarArr, map});
        }
        if (gfxVarArr == null || gfxVar == null) {
            return gfx.a(false);
        }
        try {
            int d = gfxVar.d();
            if (d == 5) {
                if (gfxVar.toString().isEmpty()) {
                    z = false;
                }
                return gfx.a(z);
            } else if (d == 6) {
                if (gfxVar.o().isEmpty()) {
                    z = false;
                }
                return gfx.a(z);
            } else if (d == 7) {
                if (gfxVar.r().isEmpty()) {
                    z = false;
                }
                return gfx.a(z);
            } else {
                throw new DXExprFunctionError("isNotEmpty type has not empty func type:" + d);
            }
        } catch (Exception e) {
            throw new DXExprFunctionError(e);
        }
    }
}
