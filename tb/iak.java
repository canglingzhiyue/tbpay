package tb;

import com.alibaba.fastjson.JSONObject;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class iak extends bjx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SUBSCRIBER_ID = "doPayV2";

    static {
        kge.a(-1660704934);
    }

    @Override // tb.bjx
    public JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        String str;
        String str2 = "";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("type", "mtopV2");
        JSONObject jSONObject4 = jSONObject.getJSONObject("mtopConfig");
        if (jSONObject4 != null && (jSONObject2 = jSONObject4.getJSONObject("data")) != null) {
            try {
                str = APSecuritySdk.getInstance(this.f25947a.getApplicationContext()).getTokenResult().apdidToken;
                try {
                    str2 = this.f25947a.getResources().getConfiguration().locale.toString();
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                str = str2;
            }
            jSONObject2.put(rrv.APDIDTOKEN, (Object) str);
            jSONObject2.put("websiteLanguage", (Object) str2);
        }
        jSONObject3.put("fields", (Object) bkg.a(jSONObject));
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put("doPay", "@data{}");
        a(jSONObject3, "success", hyg.SUBSCRIBER_ID, jSONObject5);
        JSONObject jSONObject6 = new JSONObject();
        jSONObject6.put("doPay", "@data{}");
        a(jSONObject3, "fail", hyf.SUBSCRIBER_ID, jSONObject6);
        return jSONObject3;
    }
}
