package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import tb.mto;

/* loaded from: classes5.dex */
public class ctw extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_APTONP = 8839553451411800L;

    static {
        kge.a(-1487065111);
    }

    @Override // tb.fuf, com.taobao.android.dinamicx.expression.expr_v2.j
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "apToNp";
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length == 0) {
            return Double.valueOf((double) mto.a.GEO_NOT_SUPPORT);
        }
        try {
            return Float.valueOf(gbg.a(dXRuntimeContext.m(), gbg.a(dXRuntimeContext.D(), dXRuntimeContext.m(), Float.parseFloat(objArr[0].toString()))));
        } catch (Exception unused) {
            return Double.valueOf((double) mto.a.GEO_NOT_SUPPORT);
        }
    }
}
