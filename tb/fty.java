package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;
import com.taobao.android.dinamicx.expression.expr_v2.f;
import com.taobao.android.dinamicx.expression.expr_v2.h;
import com.taobao.android.dinamicx.expression.expr_v2.j;
import com.taobao.android.dinamicx.expression.expr_v2.k;

/* loaded from: classes.dex */
public class fty implements j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f28133a;
    private k b;

    static {
        kge.a(-1391036483);
        kge.a(-2117663576);
    }

    public fty(k kVar, String str) {
        this.f28133a = str;
        this.b = kVar;
    }

    @Override // com.taobao.android.dinamicx.expression.expr_v2.j
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : this.f28133a;
    }

    @Override // com.taobao.android.dinamicx.expression.expr_v2.j
    public f call(DXRuntimeContext dXRuntimeContext, f fVar, int i, f[] fVarArr, h hVar) throws DXExprFunctionError {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("72be4a64", new Object[]{this, dXRuntimeContext, fVar, new Integer(i), fVarArr, hVar}) : this.b.a(dXRuntimeContext, fVar, i, fVarArr, this.f28133a, hVar);
    }
}
