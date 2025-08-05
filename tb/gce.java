package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/* loaded from: classes.dex */
public class gce extends ggw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1302558885);
    }

    @Override // tb.ghe
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : gha.CONST_FUNC_GET_OBJ_FOR_KEY_PATH;
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
        StringTokenizer stringTokenizer = new StringTokenizer(gfxVarArr[1].i(), dmp.DELIMITER, false);
        Object J = gfxVarArr[0].J();
        while (stringTokenizer.hasMoreElements()) {
            try {
                String nextToken = stringTokenizer.nextToken();
                if (J instanceof Map) {
                    J = ((Map) J).get(nextToken);
                } else if (J instanceof List) {
                    J = ((List) J).get(Integer.parseInt(nextToken));
                }
            } catch (Exception e) {
                throw new DXExprFunctionError(e);
            }
        }
        if (J == null) {
            return gfx.e();
        }
        return gfx.a(J);
    }
}
