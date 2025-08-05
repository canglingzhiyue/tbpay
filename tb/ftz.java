package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;
import com.taobao.android.dinamicx.expression.expr_v2.f;
import com.taobao.android.dinamicx.expression.expr_v2.h;
import com.taobao.android.dinamicx.expression.expr_v2.k;
import com.taobao.android.weex_framework.util.a;

/* loaded from: classes.dex */
public class ftz implements k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2096188862);
        kge.a(-1393527289);
    }

    @Override // com.taobao.android.dinamicx.expression.expr_v2.k
    public f a(DXRuntimeContext dXRuntimeContext, f fVar, int i, f[] fVarArr, String str, h hVar) throws DXExprFunctionError {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("be4ea837", new Object[]{this, dXRuntimeContext, fVar, new Integer(i), fVarArr, str, hVar});
        }
        if (i == 0) {
            throw new DXExprFunctionError("argc == 0");
        }
        if (fVarArr == null || fVarArr.length != i) {
            throw new DXExprFunctionError("args == null || args.length != argc");
        }
        f fVar2 = fVarArr[0];
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -189271733) {
            if (hashCode == 106437299 && str.equals("parse")) {
                c = 0;
            }
        } else if (str.equals(a.ATOM_EXT_stringify)) {
            c = 1;
        }
        if (c == 0) {
            return a(fVar2);
        }
        if (c == 1) {
            return b(fVar2);
        }
        throw new DXExprFunctionError("can not find function on JSON:" + str);
    }

    public f a(f fVar) throws DXExprFunctionError {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("6305032e", new Object[]{this, fVar});
        }
        if (fVar == null || !fVar.k()) {
            throw new DXExprFunctionError("args[0] not string");
        }
        return f.a(JSONObject.parseObject(fVar.i()));
    }

    private f b(f fVar) throws DXExprFunctionError {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("8c6c7c0d", new Object[]{this, fVar});
        }
        if (fVar == null || !fVar.p() || fVar.r() == null) {
            throw new DXExprFunctionError("args[0] not object");
        }
        return f.a(fVar.r().toJSONString());
    }
}
