package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;
import java.util.Map;

/* loaded from: classes.dex */
public class gek extends ggw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1637433472);
    }

    @Override // tb.ghe
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "replaceRange";
    }

    @Override // tb.ghe
    public gfx execute(DXRuntimeContext dXRuntimeContext, gfx gfxVar, int i, gfx[] gfxVarArr, Map map) throws DXExprFunctionError {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gfx) ipChange.ipc$dispatch("e2ae9bd5", new Object[]{this, dXRuntimeContext, gfxVar, new Integer(i), gfxVarArr, map});
        }
        if (gfxVarArr == null || gfxVarArr.length != 3 || gfxVar == null) {
            return gfx.e();
        }
        try {
            String gfxVar2 = gfxVar.toString();
            int w = gfxVarArr[0].w();
            int w2 = gfxVarArr[1].w();
            String i2 = gfxVarArr[2].i();
            if (w2 < w) {
                throw new DXExprFunctionError("End index ($endIndex) is less than start index ($startIndex).");
            }
            return gfx.a(gfxVar2.substring(0, w) + i2 + gfxVar2.substring(w2));
        } catch (Exception e) {
            throw new DXExprFunctionError(e);
        }
    }
}
