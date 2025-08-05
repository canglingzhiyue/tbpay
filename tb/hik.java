package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class hik {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1078316734);
    }

    public static JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        Object a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            a2 = ipChange.ipc$dispatch("87d5db88", new Object[]{jSONObject, jSONObject2});
        } else if (jSONObject == null || jSONObject2 == null) {
            return jSONObject;
        } else {
            a2 = him.a(jSONObject2, jSONObject, true);
        }
        return (JSONObject) a2;
    }
}
