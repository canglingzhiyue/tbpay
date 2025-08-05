package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.view.a;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* loaded from: classes.dex */
public class frq extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_EVENTHANDLERNOTFOUND = 3078873525629101857L;

    static {
        kge.a(1540764316);
    }

    @Override // tb.fuf, com.taobao.android.dinamicx.expression.expr_v2.j
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : a.ERROR_CODE_EVENT_HANDLER_NOT_FOUND;
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length != 1 || !(objArr[0] instanceof String)) {
            return true;
        }
        try {
            if (dXRuntimeContext.k().get(Long.parseLong((String) objArr[0])) == null) {
                z = true;
            }
            return Boolean.valueOf(z);
        } catch (Exception unused) {
            return true;
        }
    }
}
