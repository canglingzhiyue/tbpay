package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.gkb;

/* loaded from: classes7.dex */
public class lxw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, JSONObject> f30979a;

    static {
        kge.a(-1396432138);
        f30979a = new HashMap(4);
    }

    public static void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{str, jSONObject});
            return;
        }
        f30979a.put(str, jSONObject);
        gkb.a.b("home_pass_params", "passParams_" + str, jSONObject == null ? "" : jSONObject.toJSONString());
    }

    public static JSONObject a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("73d7af52", new Object[]{str});
        }
        try {
            JSONObject jSONObject = f30979a.get(str);
            if (jSONObject != null) {
                return jSONObject;
            }
            JSONObject parseObject = JSON.parseObject(gkb.a.a("home_pass_params", "passParams_" + str, ""));
            if (parseObject != null) {
                if (!parseObject.isEmpty()) {
                    return parseObject;
                }
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
