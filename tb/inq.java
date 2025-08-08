package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class inq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1426994914);
    }

    public static JSONObject a(int i, String str, String str2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3127386b", new Object[]{new Integer(i), str, str2, obj});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("jsonrpc", (Object) "2.0");
        jSONObject.put("id", (Object) str);
        jSONObject.put("error", (Object) a(i, str2, obj));
        return jSONObject;
    }

    public static JSONObject a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("eb9346ae", new Object[]{str, obj});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("jsonrpc", (Object) "2.0");
        jSONObject.put("id", (Object) str);
        jSONObject.put("result", obj);
        return jSONObject;
    }

    private static JSONObject a(int i, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("83e48461", new Object[]{new Integer(i), str, obj});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", (Object) Integer.valueOf(i));
        if (!StringUtils.isEmpty(str)) {
            jSONObject.put("message", (Object) str);
        }
        if (obj != null) {
            jSONObject.put("data", obj);
        }
        return jSONObject;
    }
}
