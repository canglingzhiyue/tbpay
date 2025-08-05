package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;

/* loaded from: classes.dex */
public class ftk extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_TOBINDINGXUNIT = 6677129169796262308L;

    static {
        kge.a(-349852369);
    }

    @Override // tb.fuf, com.taobao.android.dinamicx.expression.expr_v2.j
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "toBindingXUnit";
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null) {
            try {
                if (objArr.length == 1) {
                    Object obj = objArr[0];
                    if (obj instanceof Number) {
                        return Integer.valueOf(gbg.a(dXRuntimeContext.D(), DinamicXEngine.i(), ((Number) obj).floatValue()));
                    }
                    if (obj instanceof String) {
                        String str = (String) obj;
                        if (str.endsWith("ap")) {
                            a2 = gbg.a(dXRuntimeContext.D(), DinamicXEngine.i(), Float.parseFloat(str.substring(0, str.length() - 2)));
                        } else if (str.endsWith("np")) {
                            a2 = gbg.a(DinamicXEngine.i(), Float.parseFloat(str.substring(0, str.length() - 2)));
                        } else {
                            return Integer.valueOf(gbg.a(dXRuntimeContext.D(), DinamicXEngine.i(), Float.valueOf(str).floatValue()));
                        }
                        return Integer.valueOf(a2);
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return 0;
    }
}
