package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.IDXHardwareInterface;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;
import com.taobao.android.dinamicx.u;
import java.util.Map;

/* loaded from: classes.dex */
public class get extends ggw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARAM_LEVEL_HIGH = "high";
    public static final String PARAM_LEVEL_LOW = "low";
    public static final String PARAM_LEVEL_MEDIUM = "medium";
    public static final String PARAM_LEVEL_UNKNOWN = "unknown";

    static {
        kge.a(-2122443907);
    }

    @Override // tb.ghe
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "deviceLevel";
    }

    @Override // tb.ghe
    public gfx execute(DXRuntimeContext dXRuntimeContext, gfx gfxVar, int i, gfx[] gfxVarArr, Map map) throws DXExprFunctionError {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (gfx) ipChange.ipc$dispatch("e2ae9bd5", new Object[]{this, dXRuntimeContext, gfxVar, new Integer(i), gfxVarArr, map});
        }
        if (gfxVarArr == null || gfxVarArr.length == 0) {
            return gfx.a(false);
        }
        IDXHardwareInterface e = u.e();
        if (e == null) {
            return gfx.a(false);
        }
        gfx gfxVar2 = gfxVarArr[0];
        if (!gfxVar2.k()) {
            return gfx.a(false);
        }
        String lowerCase = gfxVar2.i().toLowerCase();
        try {
            int a2 = e.a();
            if ("low".equals(lowerCase)) {
                if (a2 != 2) {
                    z = false;
                }
                return gfx.a(z);
            } else if ("medium".equals(lowerCase)) {
                if (a2 != 1) {
                    z = false;
                }
                return gfx.a(z);
            } else if ("high".equals(lowerCase)) {
                if (a2 != 0) {
                    z = false;
                }
                return gfx.a(z);
            } else if ("unknown".equals(lowerCase)) {
                if (a2 != -1) {
                    z = false;
                }
                return gfx.a(z);
            } else {
                return gfx.a(false);
            }
        } catch (Throwable unused) {
            return gfx.a(false);
        }
    }
}
