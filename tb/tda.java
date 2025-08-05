package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* loaded from: classes7.dex */
public class tda extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_SPLITJSONARRAY = -2241466443830917517L;

    static {
        kge.a(995878143);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && objArr.length >= 2) {
            JSONArray parseArray = JSONArray.parseArray(String.valueOf(objArr[0]));
            int parseInt = Integer.parseInt(String.valueOf(objArr[1]));
            if (parseArray != null && !parseArray.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                JSONArray jSONArray2 = new JSONArray();
                for (int i = 0; i < parseArray.size(); i++) {
                    JSONObject jSONObject = parseArray.getJSONObject(i);
                    jSONArray2.add(jSONObject);
                    String string = jSONObject.getString("text");
                    if (string.contains("[n]")) {
                        jSONObject.put("text", (Object) string.replace("[n]", ""));
                        jSONArray.add(jSONArray2);
                        jSONArray2 = new JSONArray();
                    }
                }
                if (!jSONArray2.isEmpty()) {
                    jSONArray.add(jSONArray2);
                }
                if (parseInt < jSONArray.size()) {
                    return jSONArray.get(parseInt);
                }
                return null;
            }
        }
        return null;
    }
}
