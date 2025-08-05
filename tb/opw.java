package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class opw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(615362465);
    }

    public static JSONObject a(JSONObject jSONObject, lli lliVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("663d958f", new Object[]{jSONObject, lliVar});
        }
        if (lliVar == null) {
            return jSONObject;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put("gatewayTrace", (Object) lliVar);
        return jSONObject;
    }

    public static lli a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lli) ipChange.ipc$dispatch("29038c35", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        Object obj = jSONObject.get("gatewayTrace");
        if (obj instanceof lli) {
            return (lli) obj;
        }
        return null;
    }

    public static JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("87d5db88", new Object[]{jSONObject, jSONObject2});
        }
        if (jSONObject == null && jSONObject2 == null) {
            return null;
        }
        JSONObject jSONObject3 = new JSONObject();
        if (jSONObject != null) {
            jSONObject3.putAll(jSONObject);
        }
        if (jSONObject2 != null) {
            jSONObject3.putAll(jSONObject2);
        }
        return jSONObject3;
    }
}
