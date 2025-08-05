package tb;

import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;
import com.taobao.android.dinamicx.expression.expr_v2.f;
import com.taobao.android.dinamicx.expression.expr_v2.h;
import com.taobao.android.dinamicx.expression.expr_v2.j;

/* loaded from: classes.dex */
public class ftx implements j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(413300209);
        kge.a(-2117663576);
    }

    @Override // com.taobao.android.dinamicx.expression.expr_v2.j
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "slice";
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
        if (fVar == null || !fVar.n() || fVar.o() == null) {
            throw new DXExprFunctionError("self is not array");
        }
        if (fVarArr == null || fVarArr.length != i) {
            throw new DXExprFunctionError("args == null || args.length != argc");
        }
        f fVar3 = fVarArr[0];
        if (fVar3 == null || !fVar3.v()) {
            throw new DXExprFunctionError("start index is not int");
        }
        JSONArray o = fVar.o();
        long w = fVar3.w();
        if (w >= o.size() || w < 0) {
            return f.a(new JSONArray());
        }
        long size = o.size();
        if (i == 2 && (fVar2 = fVarArr[1]) != null && fVar2.v()) {
            size = fVar2.w();
        }
        if (size <= w) {
            return f.a(new JSONArray());
        }
        if (size > o.size()) {
            return f.a(new JSONArray(o.subList((int) w, o.size())));
        }
        return f.a(new JSONArray(o.subList((int) w, (int) size)));
    }
}
