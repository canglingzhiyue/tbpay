package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;
import com.taobao.android.dinamicx_v4.animation.util.b;
import java.util.Map;

/* loaded from: classes5.dex */
public class gcs extends ggw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-272236481);
    }

    @Override // tb.ghe
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "repeatable";
    }

    @Override // tb.ghe
    public gfx execute(DXRuntimeContext dXRuntimeContext, gfx gfxVar, int i, gfx[] gfxVarArr, Map map) throws DXExprFunctionError {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gfx) ipChange.ipc$dispatch("e2ae9bd5", new Object[]{this, dXRuntimeContext, gfxVar, new Integer(i), gfxVarArr, map});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject.put("type", (Object) b.TWEEN_SPEC);
        jSONObject.put("params", (Object) jSONObject2);
        if (gfxVarArr == null || gfxVarArr.length == 0) {
            return gfx.a((Object) jSONObject);
        }
        for (int i2 = 0; i2 < gfxVarArr.length; i2 += 2) {
            int i3 = i2 + 1;
            if (i3 < gfxVarArr.length) {
                String m = gfxVarArr[i2].m();
                if ("animation".equals(m) && gfxVarArr[i3].p()) {
                    JSONObject r = gfxVarArr[i3].r();
                    if (b.TWEEN_SPEC.equals(fxr.a("type", r, (String) null))) {
                        jSONObject2.putAll(fxr.a("params", r, (JSONObject) null));
                    }
                } else {
                    jSONObject2.put(m, gfxVarArr[i3].J());
                }
            }
        }
        return gfx.a((Map<String, Object>) jSONObject);
    }
}
