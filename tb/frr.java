package tb;

import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.List;

/* loaded from: classes.dex */
public class frr extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1632687498);
    }

    @Override // tb.fuf, com.taobao.android.dinamicx.expression.expr_v2.j
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "array_find";
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && objArr.length == 2) {
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            if (dXRuntimeContext.M() == null) {
                if (!(obj instanceof JSONArray) || !((JSONArray) obj).contains(obj2)) {
                    return null;
                }
                return obj2;
            } else if ((obj instanceof List) && ((List) obj).contains(obj2)) {
                return obj2;
            }
        }
        return null;
    }
}
