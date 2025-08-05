package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.weex_framework.util.a;

/* loaded from: classes.dex */
public class fta extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_ROUND = 19336516701645L;

    static {
        kge.a(937563249);
    }

    @Override // tb.fuf, com.taobao.android.dinamicx.expression.expr_v2.j
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : a.ATOM_EXT_round;
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null) {
            try {
                if (objArr.length == 1) {
                    Object obj = objArr[0];
                    if (obj instanceof Number) {
                        return Double.valueOf(Math.round(((Number) obj).doubleValue()));
                    }
                    if (obj instanceof String) {
                        return Double.valueOf(Math.round(Double.parseDouble((String) obj)));
                    }
                    return 0L;
                }
            } catch (Throwable unused) {
                return 0L;
            }
        }
        return 0L;
    }
}
