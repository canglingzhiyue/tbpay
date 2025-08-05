package tb;

import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class gdf extends ggw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1553595233);
    }

    @Override // tb.ghe
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "mutableListOf";
    }

    @Override // tb.ghe
    public gfx execute(DXRuntimeContext dXRuntimeContext, gfx gfxVar, int i, gfx[] gfxVarArr, Map map) throws DXExprFunctionError {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gfx) ipChange.ipc$dispatch("e2ae9bd5", new Object[]{this, dXRuntimeContext, gfxVar, new Integer(i), gfxVarArr, map});
        }
        JSONArray jSONArray = new JSONArray();
        if (gfxVarArr != null && gfxVarArr.length > 0) {
            for (gfx gfxVar2 : gfxVarArr) {
                jSONArray.add(gfxVar2.J());
            }
        }
        return gfx.a((List<Object>) jSONArray);
    }
}
