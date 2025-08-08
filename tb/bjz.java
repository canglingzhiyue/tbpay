package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class bjz extends bjx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(571591143);
    }

    @Override // tb.bjx
    public JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", (Object) "refreshMtopV2");
        jSONObject2.put("fields", (Object) bkg.a(jSONObject));
        if (jSONObject.get("nextUrl") instanceof String) {
            JSONObject jSONObject3 = new JSONObject();
            String string = jSONObject.getString("nextUrl");
            if (StringUtils.equals("responseUrl", string)) {
                string = "@data{data.url}";
            }
            jSONObject3.put("url", (Object) string);
            a(jSONObject2, "success", "openUrlV2", jSONObject3);
        }
        return jSONObject2;
    }
}
