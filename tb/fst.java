package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* loaded from: classes.dex */
public class fst extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final Object DEFAULT_VALUE;
    public static final long DX_PARSER_NOTEQUAL = 4995563293267863121L;

    @Override // tb.fuf, com.taobao.android.dinamicx.expression.expr_v2.j
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "notEqual";
    }

    static {
        kge.a(-1967839650);
        DEFAULT_VALUE = null;
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null) {
            try {
                if (objArr.length == 2) {
                    Object obj = objArr[0];
                    Object obj2 = objArr[1];
                    if (obj == null && obj2 == null) {
                        return false;
                    }
                    if (obj != null && obj2 != null) {
                        if (obj.getClass().equals(obj2.getClass())) {
                            if (obj.equals(obj2)) {
                                z = false;
                            }
                            return Boolean.valueOf(z);
                        } else if ((obj instanceof Number) && (obj2 instanceof Number)) {
                            if (fqr.a((Number) obj, (Number) obj2)) {
                                z = false;
                            }
                            return Boolean.valueOf(z);
                        } else {
                            if (obj.equals(obj2)) {
                                z = false;
                            }
                            return Boolean.valueOf(z);
                        }
                    }
                    return true;
                }
            } catch (Throwable unused) {
                return DEFAULT_VALUE;
            }
        }
        return DEFAULT_VALUE;
    }
}
