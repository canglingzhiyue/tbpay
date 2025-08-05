package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;
import java.util.Map;

/* loaded from: classes.dex */
public class gdb extends ggw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(244780455);
    }

    @Override // tb.ghe
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "add";
    }

    @Override // tb.ghe
    public gfx execute(DXRuntimeContext dXRuntimeContext, gfx gfxVar, int i, gfx[] gfxVarArr, Map map) throws DXExprFunctionError {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gfx) ipChange.ipc$dispatch("e2ae9bd5", new Object[]{this, dXRuntimeContext, gfxVar, new Integer(i), gfxVarArr, map});
        }
        if (gfxVarArr == null || gfxVarArr.length <= 0 || gfxVar == null) {
            return gfx.a(false);
        }
        try {
            if (gfxVarArr.length == 2) {
                gfxVar.o().set(gfxVarArr[0].w(), gfxVarArr[1].J());
                return gfx.a(true);
            }
            return gfx.a(gfxVar.o().add(gfxVarArr[0].J()));
        } catch (Exception e) {
            throw new DXExprFunctionError(e);
        }
    }
}
