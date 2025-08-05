package tb;

import android.os.Bundle;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class fjq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1425128768);
    }

    public static Bundle a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("2604864c", new Object[]{jSONObject});
        }
        if (jSONObject == null || !jSONObject.containsKey("pageUserInfo") || (jSONObject2 = jSONObject.getJSONObject("pageUserInfo")) == null || !jSONObject2.containsKey(hyt.ZZB_BUNDLE_KEY) || (jSONObject3 = jSONObject2.getJSONObject(hyt.ZZB_BUNDLE_KEY)) == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("from", jSONObject3.getString("from"));
        bundle.putString("subjectType", jSONObject3.getString("subjectType"));
        bundle.putString("subjectId", jSONObject3.getString("subjectId"));
        Bundle a2 = fjo.a(jSONObject3.getJSONObject("extParams"));
        if (a2 != null) {
            bundle.putBundle("extParams", a2);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(hyt.ZZB_BUNDLE_KEY, bundle);
        return bundle2;
    }
}
