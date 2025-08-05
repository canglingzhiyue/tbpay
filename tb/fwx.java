package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.Map;

/* loaded from: classes.dex */
public class fwx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME = "name";
    public static final String TYPE = "t";
    public static final int TYPE_CONSTANT = 0;
    public static final int TYPE_EXPR = 1;
    public static final String URL = "url";
    public static final String VALUE = "v";
    public static final String VERSION = "version";

    static {
        kge.a(-47137701);
    }

    public static JSONObject a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("836310b0", new Object[]{jSONArray});
        }
        if (jSONArray == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            String string = jSONObject2.getJSONObject("pTplName").getString("v");
            String string2 = jSONObject2.getJSONObject("bindSlot").getString("v");
            JSONObject jSONObject3 = jSONObject.getJSONObject(string);
            if (jSONObject3 == null) {
                jSONObject3 = new JSONObject();
                jSONObject.put(string, (Object) jSONObject3);
            }
            if (jSONObject3 == null || !jSONObject3.containsKey(string2)) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject3.put(string2, (Object) jSONObject4);
                for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                    if (!entry.getKey().equals("pTplName") && !entry.getKey().equals("bindSlot")) {
                        jSONObject4.put(entry.getKey(), ((JSONObject) entry.getValue()).clone());
                    }
                }
            }
        }
        return jSONObject;
    }

    public static String a(DXRuntimeContext dXRuntimeContext, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("525e5453", new Object[]{dXRuntimeContext, str, jSONObject});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
        int intValue = jSONObject2.getIntValue("t");
        if (intValue == 0) {
            return jSONObject2.getString("v");
        }
        if (1 != intValue) {
            return null;
        }
        String valueOf = String.valueOf(fti.a(dXRuntimeContext.d(), jSONObject2.getLong("v").longValue(), str));
        fuw.a("DXSlotLoaderUtil evaluateValue 的结果为: " + valueOf);
        return valueOf;
    }
}
