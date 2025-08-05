package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;
import com.taobao.android.dinamicx.u;
import com.taobao.android.dinamicx.widget.aj;
import java.util.Map;

/* loaded from: classes.dex */
public class ger extends ggw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1239835668);
    }

    @Override // tb.ghe
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "ABTest";
    }

    @Override // tb.ghe
    public gfx execute(DXRuntimeContext dXRuntimeContext, gfx gfxVar, int i, gfx[] gfxVarArr, Map map) throws DXExprFunctionError {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gfx) ipChange.ipc$dispatch("e2ae9bd5", new Object[]{this, dXRuntimeContext, gfxVar, new Integer(i), gfxVarArr, map});
        }
        JSONObject jSONObject = new JSONObject();
        if (gfxVarArr != null && gfxVarArr.length > 1 && gfxVarArr[0].k() && gfxVarArr[1].k()) {
            String i2 = gfxVarArr[0].i();
            String i3 = gfxVarArr[1].i();
            aj b = u.b();
            if (b != null) {
                try {
                    jSONObject.putAll(b.a(i2, i3));
                } catch (Throwable th) {
                    fuw.d("DXDataParserDxAB", "获取ABTest信息错误: \n" + th.getMessage());
                }
            }
        }
        return gfx.a((Map<String, Object>) jSONObject);
    }
}
