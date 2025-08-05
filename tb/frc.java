package tb;

import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* loaded from: classes.dex */
public class frc extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2074467552);
    }

    @Override // tb.fuf, com.taobao.android.dinamicx.expression.expr_v2.j
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "array_remove";
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && objArr.length == 2) {
            Object obj = objArr[0];
            if (obj instanceof JSONArray) {
                Object obj2 = objArr[1];
                if (!(obj2 instanceof String)) {
                    return null;
                }
                JSONArray jSONArray = (JSONArray) obj;
                int a2 = fqr.a((String) obj2);
                if (a2 >= 0 && a2 < jSONArray.size()) {
                    return jSONArray.mo1572remove(a2);
                }
            }
        }
        return null;
    }
}
