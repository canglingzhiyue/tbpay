package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class lwv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1036543960);
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
}
