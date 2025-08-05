package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.weex_framework.util.a;

/* loaded from: classes.dex */
public class fqw extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_ABS = 516202497;

    static {
        kge.a(-191219691);
    }

    @Override // tb.fuf, com.taobao.android.dinamicx.expression.expr_v2.j
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : a.ATOM_EXT_abs;
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
                    if (!(obj instanceof Long) && !(obj instanceof Integer)) {
                        if (fqr.b(obj)) {
                            return Double.valueOf(Math.abs(((Number) obj).doubleValue()));
                        }
                        if (obj instanceof String) {
                            String str = (String) obj;
                            if (fqr.b(str)) {
                                return Double.valueOf(Math.abs(Double.valueOf(str).doubleValue()));
                            }
                            return Long.valueOf(Math.abs(Long.valueOf(str).longValue()));
                        }
                        return 0L;
                    }
                    return Long.valueOf(Math.abs(((Number) obj).longValue()));
                }
            } catch (Throwable th) {
                com.taobao.android.dinamicx.exception.a.b(th);
                return 0L;
            }
        }
        return 0L;
    }
}
