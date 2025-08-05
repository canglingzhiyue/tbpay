package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;
import java.util.Map;

/* loaded from: classes.dex */
public class gci extends ggw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-91580845);
    }

    @Override // tb.ghe
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "set";
    }

    @Override // tb.ghe
    public gfx execute(DXRuntimeContext dXRuntimeContext, gfx gfxVar, int i, gfx[] gfxVarArr, Map map) throws DXExprFunctionError {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gfx) ipChange.ipc$dispatch("e2ae9bd5", new Object[]{this, dXRuntimeContext, gfxVar, new Integer(i), gfxVarArr, map});
        }
        if (gfxVarArr == null || gfxVarArr.length != 2 || gfxVar == null) {
            return gfx.e();
        }
        try {
            gfx gfxVar2 = gfxVarArr[0];
            gfx gfxVar3 = gfxVarArr[1];
            int d = gfxVar.d();
            if (d == 6) {
                Object obj = gfxVar.o().set(gfxVar2.w(), gfxVar3.J());
                if (obj == null) {
                    return gfx.e();
                }
                return gfx.a(obj);
            } else if (d == 7) {
                Object put = gfxVar.r().put(gfxVar2.i(), gfxVar3.J());
                if (put == null) {
                    return gfx.e();
                }
                return gfx.a(put);
            } else {
                throw new DXExprFunctionError("set type has not size func type:" + d);
            }
        } catch (Exception e) {
            throw new DXExprFunctionError(e);
        }
    }
}
