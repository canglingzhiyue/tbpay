package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;
import com.taobao.android.dinamicx.expression.expr_v2.f;
import com.taobao.android.dinamicx.expression.expr_v2.h;
import com.taobao.android.dinamicx.expression.expr_v2.j;
import com.taobao.android.weex_framework.util.a;

/* loaded from: classes.dex */
public class fud implements j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1429312715);
        kge.a(-2117663576);
    }

    @Override // com.taobao.android.dinamicx.expression.expr_v2.j
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : a.ATOM_EXT_substring;
    }

    @Override // com.taobao.android.dinamicx.expression.expr_v2.j
    public f call(DXRuntimeContext dXRuntimeContext, f fVar, int i, f[] fVarArr, h hVar) throws DXExprFunctionError {
        f fVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("72be4a64", new Object[]{this, dXRuntimeContext, fVar, new Integer(i), fVarArr, hVar});
        }
        if (i == 0) {
            throw new DXExprFunctionError("argc == 0");
        }
        if (fVar == null || !fVar.k() || fVar.i() == null) {
            throw new DXExprFunctionError("self is not string");
        }
        if (fVarArr == null || fVarArr.length != i) {
            throw new DXExprFunctionError("args == null || args.length != argc");
        }
        f fVar3 = fVarArr[0];
        if (fVar3 == null || !fVar3.v()) {
            throw new DXExprFunctionError("start index is not int");
        }
        String i2 = fVar.i();
        long w = fVar3.w();
        long length = (i != 2 || (fVar2 = fVarArr[1]) == null || !fVar2.v()) ? i2.length() : fVar2.w();
        if (length > w) {
            long j = length;
            length = w;
            w = j;
        }
        if (length < 0) {
            length = 0;
        }
        if (length >= i2.length()) {
            return f.a("");
        }
        if (w > i2.length()) {
            return f.a(i2.substring((int) length));
        }
        return f.a(i2.substring((int) length, (int) w));
    }
}
