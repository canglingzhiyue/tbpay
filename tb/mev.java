package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* loaded from: classes7.dex */
public class mev extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_TBLINDEXOFVALUE = -9081089573258802181L;

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && objArr.length >= 3 && (objArr[0] instanceof JSONArray) && (objArr[1] instanceof String) && (objArr[2] instanceof String)) {
            JSONObject jSONObject = new JSONObject();
            try {
                JSONArray jSONArray = (JSONArray) objArr[0];
                String str = (String) objArr[1];
                String str2 = (String) objArr[2];
                if (jSONArray.size() > 0 && !pro.e(str)) {
                    for (int i = 0; i < jSONArray.size(); i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        String string = jSONObject2.getString(str);
                        if (!pro.e(string) && string.equals(str2)) {
                            jSONObject.put("index", (Object) Integer.valueOf(i));
                            jSONObject.put("object", (Object) jSONObject2);
                        }
                    }
                }
                return jSONObject;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
