package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;
import com.taobao.android.dinamicx_v4.animation.util.b;
import java.util.Map;

/* loaded from: classes5.dex */
public class gcr extends gcs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2062112627);
    }

    public static /* synthetic */ Object ipc$super(gcr gcrVar, String str, Object... objArr) {
        if (str.hashCode() == -491873323) {
            return super.execute((DXRuntimeContext) objArr[0], (gfx) objArr[1], ((Number) objArr[2]).intValue(), (gfx[]) objArr[3], (Map) objArr[4]);
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.gcs, tb.ghe
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "infiniteRepeatable";
    }

    @Override // tb.gcs, tb.ghe
    public gfx execute(DXRuntimeContext dXRuntimeContext, gfx gfxVar, int i, gfx[] gfxVarArr, Map map) throws DXExprFunctionError {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gfx) ipChange.ipc$dispatch("e2ae9bd5", new Object[]{this, dXRuntimeContext, gfxVar, new Integer(i), gfxVarArr, map});
        }
        gfx execute = super.execute(dXRuntimeContext, gfxVar, i, gfxVarArr, map);
        if (execute != null && execute.p() && (jSONObject = execute.r().getJSONObject("params")) != null) {
            jSONObject.put(b.ITERATIONS, (Object) (-1));
        }
        return execute;
    }
}
