package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class iaf extends bjx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-686409862);
    }

    @Override // tb.bjx
    public JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", "mtopV2");
        jSONObject2.put("fields", (Object) bkg.a(jSONObject));
        if (jSONObject.get("successUrl") instanceof String) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("url", (Object) jSONObject.getString("successUrl"));
            a(jSONObject2, "success", iah.TAG, (JSONObject) null);
            a(jSONObject2, "success", "openUrlV2", jSONObject3);
        }
        if (jSONObject.get("failUrl") instanceof String) {
            JSONObject jSONObject4 = new JSONObject();
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("errorMsg", (Object) "@data{ret[0]}");
            jSONObject4.put("queryParams", (Object) jSONObject5);
            jSONObject4.put("url", (Object) jSONObject.getString("failUrl"));
            a(jSONObject2, "fail", "weexPopV2", jSONObject4);
        }
        return jSONObject2;
    }
}
