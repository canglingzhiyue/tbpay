package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;
import com.taobao.android.dinamicx.expression.expr_v2.f;
import com.taobao.android.dinamicx.expression.expr_v2.h;
import com.taobao.android.dinamicx.expression.expr_v2.j;
import com.taobao.android.weex_framework.util.a;

/* loaded from: classes.dex */
public class fuc implements j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1940416306);
        kge.a(-2117663576);
    }

    @Override // com.taobao.android.dinamicx.expression.expr_v2.j
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : a.ATOM_EXT_parseInt;
    }

    @Override // com.taobao.android.dinamicx.expression.expr_v2.j
    public f call(DXRuntimeContext dXRuntimeContext, f fVar, int i, f[] fVarArr, h hVar) throws DXExprFunctionError {
        String valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("72be4a64", new Object[]{this, dXRuntimeContext, fVar, new Integer(i), fVarArr, hVar});
        }
        if (i == 0) {
            throw new DXExprFunctionError("argc == 0");
        }
        if (fVarArr == null || fVarArr.length != i) {
            throw new DXExprFunctionError("args == null || args.length != argc");
        }
        f fVar2 = fVarArr[0];
        if (fVar2 == null || (!fVar2.k() && !fVar2.b())) {
            throw new DXExprFunctionError("args[0] not string or number");
        }
        int i2 = 10;
        if (fVar2.k()) {
            valueOf = fVar2.i();
            if (valueOf.startsWith("0x") || valueOf.startsWith("0X")) {
                i2 = 16;
            }
        } else {
            valueOf = String.valueOf((long) Math.floor(fVar2.c()));
        }
        if (i == 2) {
            f fVar3 = fVarArr[1];
            if (fVar3 == null || !fVar3.v()) {
                throw new DXExprFunctionError("args[1] not int");
            }
            i2 = (int) fVar3.w();
        }
        return f.a(Long.parseLong(valueOf, i2));
    }
}
