package tb;

import com.alibaba.android.ultron.ext.event.util.h;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class bkv extends bkt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1069436814);
    }

    @Override // tb.bkt
    public JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", "mtopV3");
        jSONObject2.put("fields", (Object) h.a(jSONObject));
        if (jSONObject.get("nextUrl") instanceof String) {
            String string = jSONObject.getString("nextUrl");
            if ("response_url".equals(string)) {
                string = "@data{data.url}";
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("url", (Object) string);
            a(jSONObject2, "success", "openUrlV3", jSONObject3);
        }
        return jSONObject2;
    }
}
