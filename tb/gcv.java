package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/* loaded from: classes.dex */
public class gcv extends ggw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2000918728);
    }

    @Override // tb.ghe
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "data";
    }

    @Override // tb.ghe
    public gfx execute(DXRuntimeContext dXRuntimeContext, gfx gfxVar, int i, gfx[] gfxVarArr, Map map) throws DXExprFunctionError {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gfx) ipChange.ipc$dispatch("e2ae9bd5", new Object[]{this, dXRuntimeContext, gfxVar, new Integer(i), gfxVarArr, map});
        }
        Object a2 = a(dXRuntimeContext);
        if (i != 1 && a2 != null) {
            return gfx.a(a2);
        }
        StringTokenizer stringTokenizer = new StringTokenizer(String.valueOf(gfxVarArr[0]), dmp.DELIMITER, false);
        while (stringTokenizer.hasMoreElements()) {
            try {
                String nextToken = stringTokenizer.nextToken();
                if (a2 instanceof Map) {
                    a2 = ((Map) a2).get(nextToken);
                } else if (a2 instanceof List) {
                    a2 = ((List) a2).get(Integer.parseInt(nextToken));
                }
            } catch (Exception e) {
                throw new DXExprFunctionError(e);
            }
        }
        if (a2 == null) {
            return gfx.e();
        }
        return gfx.a(a2);
    }

    public Object a(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("96478e79", new Object[]{this, dXRuntimeContext}) : dXRuntimeContext.e();
    }
}
