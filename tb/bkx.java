package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.ultron.ext.event.util.h;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class bkx extends bkt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1819238887);
    }

    @Override // tb.bkt
    public JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", (Object) "refreshMtopV3");
        jSONObject2.put("fields", (Object) h.a(jSONObject));
        if (jSONObject.get("nextUrl") instanceof String) {
            JSONObject jSONObject3 = new JSONObject();
            String string = jSONObject.getString("nextUrl");
            if (StringUtils.equals("responseUrl", string)) {
                string = "@data{data.url}";
            }
            jSONObject3.put("url", (Object) string);
            a(jSONObject2, "success", "openUrlV3", jSONObject3);
        }
        return jSONObject2;
    }
}
