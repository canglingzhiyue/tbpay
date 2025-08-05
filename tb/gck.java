package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;
import com.taobao.android.weex_framework.util.a;
import java.util.Map;

/* loaded from: classes.dex */
public class gck extends ggw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(340989602);
    }

    @Override // tb.ghe
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : a.ATOM_EXT_substring;
    }

    @Override // tb.ghe
    public gfx execute(DXRuntimeContext dXRuntimeContext, gfx gfxVar, int i, gfx[] gfxVarArr, Map map) throws DXExprFunctionError {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gfx) ipChange.ipc$dispatch("e2ae9bd5", new Object[]{this, dXRuntimeContext, gfxVar, new Integer(i), gfxVarArr, map});
        }
        if (gfxVarArr == null || gfxVarArr.length <= 0 || gfxVar == null) {
            return gfx.e();
        }
        if (gfxVar.k()) {
            int w = gfxVarArr[0].w();
            if (gfxVarArr.length == 1) {
                return gfx.a(gfxVar.toString().substring(w));
            }
            return gfx.a(gfxVar.toString().substring(w, gfxVarArr[1].w()));
        }
        return gfx.e();
    }
}
