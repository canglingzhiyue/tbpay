package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;
import java.util.Map;

/* loaded from: classes.dex */
public class gew extends ggw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-650870001);
    }

    @Override // tb.ghe
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "orange";
    }

    @Override // tb.ghe
    public gfx execute(DXRuntimeContext dXRuntimeContext, gfx gfxVar, int i, gfx[] gfxVarArr, Map map) throws DXExprFunctionError {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gfx) ipChange.ipc$dispatch("e2ae9bd5", new Object[]{this, dXRuntimeContext, gfxVar, new Integer(i), gfxVarArr, map});
        }
        if (gfxVarArr == null || gfxVarArr.length < 2 || !gfxVarArr[0].k() || !gfxVarArr[1].k()) {
            return gfx.e();
        }
        fqj fqjVar = new fqj();
        String i2 = gfxVarArr[0].i();
        if (TextUtils.isEmpty(i2)) {
            return gfx.e();
        }
        String i3 = gfxVarArr[1].i();
        if (TextUtils.isEmpty(i3)) {
            return gfx.e();
        }
        gfx e = gfxVarArr.length >= 3 ? gfxVarArr[2] : gfx.e();
        return gfx.a(fqjVar.a(i2, i3, e == null ? "" : e.i()));
    }
}
