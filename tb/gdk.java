package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;
import java.util.Map;

/* loaded from: classes.dex */
public class gdk extends ggw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1818309505);
    }

    @Override // tb.ghe
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "mutableMapOf";
    }

    @Override // tb.ghe
    public gfx execute(DXRuntimeContext dXRuntimeContext, gfx gfxVar, int i, gfx[] gfxVarArr, Map map) throws DXExprFunctionError {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gfx) ipChange.ipc$dispatch("e2ae9bd5", new Object[]{this, dXRuntimeContext, gfxVar, new Integer(i), gfxVarArr, map});
        }
        JSONObject jSONObject = new JSONObject();
        if (gfxVarArr != null) {
            try {
                if (gfxVarArr.length % 2 == 0) {
                    for (int i2 = 0; i2 < gfxVarArr.length; i2 += 2) {
                        jSONObject.put(gfxVarArr[i2].i(), gfxVarArr[i2 + 1].J());
                    }
                }
            } catch (Exception e) {
                throw new DXExprFunctionError(e);
            }
        }
        return gfx.a((Map<String, Object>) jSONObject);
    }
}
