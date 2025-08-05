package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* loaded from: classes.dex */
public class fru extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-191213831);
    }

    @Override // tb.fuf, com.taobao.android.dinamicx.expression.expr_v2.j
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "dict_get";
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && objArr.length == 2) {
            Object obj = objArr[0];
            if (obj instanceof JSONObject) {
                return ((JSONObject) obj).get(objArr[1]);
            }
            if (obj instanceof JSONArray) {
                Number c = fqr.c(objArr[1]);
                if (c == null) {
                    return null;
                }
                JSONArray jSONArray = (JSONArray) obj;
                int intValue = c.intValue();
                if (intValue >= 0 && intValue < jSONArray.size()) {
                    return jSONArray.get(intValue);
                }
                return null;
            } else if (dXRuntimeContext.M() != null) {
                return fuj.a(dXRuntimeContext, obj, objArr[1] + "");
            }
        }
        return null;
    }
}
