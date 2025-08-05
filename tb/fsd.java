package tb;

import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class fsd extends fsc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1821181102);
    }

    @Override // tb.fsc, tb.fuf, com.taobao.android.dinamicx.expression.expr_v2.j
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "index_of_value";
    }

    @Override // tb.fsc
    public int a(JSONArray jSONArray, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("783a515f", new Object[]{this, jSONArray, obj})).intValue();
        }
        int size = jSONArray.size();
        for (int i = 0; i < size; i++) {
            if (jSONArray.get(i).equals(obj)) {
                return i;
            }
        }
        return -1;
    }
}
