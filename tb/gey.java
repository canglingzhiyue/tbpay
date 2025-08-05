package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;
import java.util.Map;
import tb.mto;

/* loaded from: classes.dex */
public class gey extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_SCREEN = 10147651446708230L;

    static {
        kge.a(-74121395);
    }

    @Override // tb.fuf, com.taobao.android.dinamicx.expression.expr_v2.j
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "screen";
    }

    @Override // tb.fuf, tb.ghe
    public gfx execute(DXRuntimeContext dXRuntimeContext, gfx gfxVar, int i, gfx[] gfxVarArr, Map map) throws DXExprFunctionError {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gfx) ipChange.ipc$dispatch("e2ae9bd5", new Object[]{this, dXRuntimeContext, gfxVar, new Integer(i), gfxVarArr, map});
        }
        if (gfxVarArr == null || gfxVarArr.length <= 0 || !gfxVarArr[0].k() || dXRuntimeContext.m() == null) {
            return gfx.a((double) mto.a.GEO_NOT_SUPPORT);
        }
        String i2 = gfxVarArr[0].i();
        Context N = dXRuntimeContext.D().N() != null ? dXRuntimeContext.D().N() : dXRuntimeContext.m();
        if (i2.equalsIgnoreCase("width")) {
            return gfx.a(gbg.b(dXRuntimeContext.D(), N, gbg.b(N)));
        }
        if (i2.equalsIgnoreCase("height")) {
            return gfx.a(gbg.b(dXRuntimeContext.D(), N, gbg.c(N)));
        }
        return gfx.a((double) mto.a.GEO_NOT_SUPPORT);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length <= 0 || !(objArr[0] instanceof String) || dXRuntimeContext.m() == null) {
            return Double.valueOf((double) mto.a.GEO_NOT_SUPPORT);
        }
        String str = (String) objArr[0];
        Context m = dXRuntimeContext.m();
        if (str.equalsIgnoreCase("width")) {
            return Integer.valueOf(gbg.b(dXRuntimeContext.D(), m, gbg.b(m)));
        }
        if (str.equalsIgnoreCase("height")) {
            return Integer.valueOf(gbg.b(dXRuntimeContext.D(), m, gbg.c(m)));
        }
        return Double.valueOf((double) mto.a.GEO_NOT_SUPPORT);
    }
}
