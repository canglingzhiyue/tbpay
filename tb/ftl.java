package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import tb.mto;

/* loaded from: classes.dex */
public class ftl extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_TODOUBLE = 6762231815649095238L;

    static {
        kge.a(-1436222359);
    }

    @Override // tb.fuf, com.taobao.android.dinamicx.expression.expr_v2.j
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "toDouble";
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
                        return Double.valueOf(((Number) obj).doubleValue());
                    }
                    if (obj instanceof String) {
                        return Double.valueOf(Double.parseDouble((String) obj));
                    }
                    return Double.valueOf((double) mto.a.GEO_NOT_SUPPORT);
                }
            } catch (Exception unused) {
                return Double.valueOf((double) mto.a.GEO_NOT_SUPPORT);
            }
        }
        return Double.valueOf((double) mto.a.GEO_NOT_SUPPORT);
    }
}
