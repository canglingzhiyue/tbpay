package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.model.f;

/* loaded from: classes5.dex */
public class frl extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_DXDEFAULTSCALE = -6138832447406711913L;

    static {
        kge.a(390877882);
    }

    @Override // tb.fuf, com.taobao.android.dinamicx.expression.expr_v2.j
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "dxDefaultScale";
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        Object obj = objArr[0];
        Context m = dXRuntimeContext.D().N() == null ? dXRuntimeContext.m() : dXRuntimeContext.D().N();
        if (f.a(f.a(dXRuntimeContext.D()))) {
            try {
                return Integer.valueOf(gbg.b(dXRuntimeContext.D(), m, gbg.b(m) * (Float.parseFloat(obj.toString()) / 375.0f)));
            } catch (Exception unused) {
                return 0;
            }
        }
        return Float.valueOf(Float.parseFloat(obj.toString()));
    }
}
