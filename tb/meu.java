package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* loaded from: classes7.dex */
public class meu extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_TBLVTOARRAY = -6113565926232048891L;

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        if (objArr[0] instanceof JSONArray) {
            JSONArray jSONArray2 = (JSONArray) objArr[0];
            JSONObject jSONObject = new JSONObject();
            if (objArr[1] instanceof JSONObject) {
                jSONObject = (JSONObject) objArr[1];
            }
            for (int i = 0; i < jSONArray2.size(); i++) {
                JSONObject jSONObject2 = jSONArray2.getJSONObject(i);
                JSONObject parseObject = JSON.parseObject(jSONObject.toJSONString());
                parseObject.put("itemInfo", (Object) jSONObject2);
                parseObject.put("index", (Object) Integer.valueOf(i));
                jSONArray.add(i, parseObject);
            }
        }
        if (!(objArr[0] instanceof String)) {
            return jSONArray;
        }
        String str = (String) objArr[0];
        JSONObject jSONObject3 = new JSONObject();
        if (objArr[1] instanceof JSONObject) {
            jSONObject3 = (JSONObject) objArr[1];
        }
        try {
            int parseInt = Integer.parseInt(str);
            JSONArray jSONArray3 = new JSONArray();
            for (int i2 = 0; i2 < parseInt; i2++) {
                try {
                    jSONArray3.add(jSONObject3);
                } catch (Exception unused) {
                }
            }
            return jSONArray3;
        } catch (Exception unused2) {
            return jSONArray;
        }
    }
}
