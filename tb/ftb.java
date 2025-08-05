package tb;

import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.Arrays;

/* loaded from: classes5.dex */
public class ftb extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1745538650);
    }

    @Override // tb.fuf, com.taobao.android.dinamicx.expression.expr_v2.j
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "strSplit";
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        JSONArray jSONArray = new JSONArray();
        if (objArr != null && objArr.length == 2) {
            jSONArray.addAll(Arrays.asList(((String) objArr[0]).split((String) objArr[1])));
        }
        return jSONArray;
    }
}
