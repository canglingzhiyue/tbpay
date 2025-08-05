package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.infoflow.multitab.e;

/* loaded from: classes7.dex */
public class thf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1052516835);
    }

    public static String a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15c87a18", new Object[]{jSONObject});
        }
        JSONObject d = d(jSONObject);
        if (d == null) {
            ldf.d("CampaignDataParse", "smartContent == null");
            return null;
        }
        return d.getString("pageUrl");
    }

    public static String b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f1ccf59", new Object[]{jSONObject});
        }
        JSONObject d = d(jSONObject);
        if (d == null) {
            ldf.d("CampaignDataParse", "smartContent == null");
            return null;
        }
        return d.getString("ssrPageUrl");
    }

    public static JSONObject c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b45647e6", new Object[]{jSONObject});
        }
        JSONObject d = d(jSONObject);
        if (d != null) {
            return d.getJSONObject("tabPassParams");
        }
        return null;
    }

    private static JSONObject d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ed36a885", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            ldf.d("CampaignDataParse", "information == null");
            return null;
        }
        return jSONObject.getJSONObject(e.KEY_SMART_CONTENT);
    }
}
