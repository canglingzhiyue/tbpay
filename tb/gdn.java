package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;
import com.taobao.android.weex_framework.util.a;
import java.util.Map;

/* loaded from: classes.dex */
public class gdn extends ggw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1064140446);
    }

    @Override // tb.ghe
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : a.ATOM_EXT_abs;
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
            gfx gfxVar2 = gfxVarArr[0];
            if (gfxVar2.z()) {
                return gfx.a(Math.abs(gfxVar2.A()));
            }
            return gfx.a(Math.abs(gfxVar2.w()));
        } catch (Exception e) {
            throw new DXExprFunctionError(e);
        }
    }
}
