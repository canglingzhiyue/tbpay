package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class bjy extends bjx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1439656188);
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
        if ((jSONObject.get("reloadType") instanceof String) && !StringUtils.equals("none", jSONObject.getString("reloadType"))) {
            a(jSONObject2, "success", "refreshPageV2", (JSONObject) null);
        }
        if (jSONObject.get("nextUrl") instanceof String) {
            String string = jSONObject.getString("nextUrl");
            if ("response_url".equals(string)) {
                string = "@data{data.url}";
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("url", (Object) string);
            a(jSONObject2, "success", "openUrlV2", jSONObject3);
        }
        return jSONObject2;
    }
}
