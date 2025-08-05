package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.f;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.monitor.c;
import com.taobao.android.dinamicx.p;

/* loaded from: classes.dex */
public class frt extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_SIZEBYFACTOR = 7983029549530032097L;

    static {
        kge.a(1140272941);
    }

    @Override // tb.fuf, com.taobao.android.dinamicx.expression.expr_v2.j
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : f.SIZE_BY_FACTOR;
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && objArr.length != 0) {
            if (p.a() && objArr.length == 1 && objArr[0] != null) {
                return Integer.valueOf(gbg.b(dXRuntimeContext.D(), DinamicXEngine.i(), p.b(gbg.a(dXRuntimeContext.D(), DinamicXEngine.i(), String.valueOf(objArr[0]), 0))));
            }
            c a2 = c.a();
            if (objArr.length == 1 && (objArr[0] instanceof Number)) {
                return a2.a((Double) objArr[0]);
            }
            if (objArr.length == 2 && (objArr[0] instanceof Number) && (objArr[1] instanceof Number)) {
                return a2.a((Double) objArr[0], (Double) objArr[1]);
            }
            if (objArr.length == 5 && (objArr[0] instanceof Number) && (objArr[1] instanceof Number) && (objArr[2] instanceof Number) && (objArr[3] instanceof Number) && (objArr[4] instanceof Number)) {
                return a2.a((Double) objArr[0], (Double) objArr[1], (Double) objArr[2], (Double) objArr[3], (Double) objArr[4]);
            }
            if (objArr.length == 1 && objArr[0] != null) {
                return a2.a(String.valueOf(objArr[0]));
            }
            if (objArr.length == 2 && objArr[0] != null && objArr[1] != null) {
                return a2.a(String.valueOf(objArr[0]), String.valueOf(objArr[1]));
            }
            if (objArr.length == 5) {
                return a2.a(String.valueOf(objArr[0]), String.valueOf(objArr[1]), String.valueOf(objArr[2]), String.valueOf(objArr[3]), String.valueOf(objArr[4]));
            }
        }
        return null;
    }
}
