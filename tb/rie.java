package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* loaded from: classes7.dex */
public class rie extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_DICREMOVEBYKEY = 1041177225674909584L;

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length == 0) {
            return new JSONObject();
        }
        if (!(objArr[0] instanceof JSONObject) || objArr.length == 1) {
            return objArr[0];
        }
        JSONObject jSONObject = (JSONObject) ((JSONObject) objArr[0]).clone();
        for (int i = 1; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj instanceof String) {
                jSONObject.remove(obj);
            }
        }
        return jSONObject;
    }
}
