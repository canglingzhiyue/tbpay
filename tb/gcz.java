package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class gcz extends ggw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1120512500);
    }

    @Override // tb.ghe
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "toJSONString";
    }

    @Override // tb.ghe
    public gfx execute(DXRuntimeContext dXRuntimeContext, gfx gfxVar, int i, gfx[] gfxVarArr, Map map) throws DXExprFunctionError {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gfx) ipChange.ipc$dispatch("e2ae9bd5", new Object[]{this, dXRuntimeContext, gfxVar, new Integer(i), gfxVarArr, map});
        }
        if (gfxVar != null && !gfxVar.f()) {
            try {
                int d = gfxVar.d();
                if (d == 6) {
                    return gfx.a(gfxVar.o().toJSONString());
                }
                if (d == 7) {
                    return gfx.a(gfxVar.r().toJSONString());
                }
                throw new DXExprFunctionError("type has not toJSONString func type:" + d);
            } catch (Exception e) {
                throw new DXExprFunctionError(e);
            }
        }
        if (gfxVarArr != null && gfxVarArr.length != 0) {
            Object J = gfxVarArr[0].J();
            if ((J instanceof Map) || (J instanceof List)) {
                return gfx.a(JSON.toJSONString(J));
            }
        }
        return gfx.e();
    }
}
