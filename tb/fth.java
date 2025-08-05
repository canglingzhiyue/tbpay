package tb;

import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.exception.a;
import java.util.List;

/* loaded from: classes.dex */
public class fth extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_SUB_ARRAY = -6848818898485245999L;

    static {
        kge.a(-1332659658);
    }

    @Override // tb.fuf, com.taobao.android.dinamicx.expression.expr_v2.j
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "sub_array";
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        int i;
        List<Object> subList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && objArr.length == 3) {
            try {
                if (!(objArr[0] instanceof JSONArray)) {
                    return null;
                }
                JSONArray jSONArray = (JSONArray) objArr[0];
                try {
                    int parseInt = Integer.parseInt(objArr[1].toString());
                    int parseInt2 = Integer.parseInt(objArr[2].toString());
                    int size = jSONArray.size();
                    if (size > 0 && parseInt <= size && parseInt >= 0 && (i = parseInt2 + parseInt) <= jSONArray.size() && (subList = jSONArray.subList(parseInt, i)) != null) {
                        JSONArray jSONArray2 = new JSONArray();
                        jSONArray2.addAll(subList);
                        return jSONArray2;
                    }
                } catch (NumberFormatException unused) {
                }
                return null;
            } catch (Exception e) {
                a.b(e);
            }
        }
        return null;
    }
}
