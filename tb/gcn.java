package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;
import java.util.Map;

/* loaded from: classes.dex */
public class gcn extends ggw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-990983899);
    }

    @Override // tb.ghe
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "toInt";
    }

    @Override // tb.ghe
    public gfx execute(DXRuntimeContext dXRuntimeContext, gfx gfxVar, int i, gfx[] gfxVarArr, Map map) throws DXExprFunctionError {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gfx) ipChange.ipc$dispatch("e2ae9bd5", new Object[]{this, dXRuntimeContext, gfxVar, new Integer(i), gfxVarArr, map});
        }
        if (gfxVar == null) {
            return gfx.a(0L);
        }
        try {
            return gfx.a(gfxVar.y());
        } catch (Exception unused) {
            return gfx.a(0L);
        }
    }
}
