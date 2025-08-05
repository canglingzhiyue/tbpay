package tb;

import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* loaded from: classes.dex */
public class fsc extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-387023764);
    }

    @Override // tb.fuf, com.taobao.android.dinamicx.expression.expr_v2.j
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "index_of";
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length != 2) {
            return null;
        }
        Object obj = objArr[0];
        if (!(obj instanceof JSONArray) || (a2 = a((JSONArray) obj, objArr[1])) == -1) {
            return null;
        }
        return String.valueOf(a2);
    }

    public int a(JSONArray jSONArray, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("783a515f", new Object[]{this, jSONArray, obj})).intValue();
        }
        int size = jSONArray.size();
        for (int i = 0; i < size; i++) {
            if (jSONArray.get(i) == obj) {
                return i;
            }
        }
        return -1;
    }
}
