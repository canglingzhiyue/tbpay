package android.taobao.windvane.ha;

import com.alibaba.ha.bizerrorreporter.e;
import com.alibaba.ha.bizerrorreporter.module.AggregationType;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes2.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(618955043);
    }

    public static void a(String str, String str2, String str3, String str4, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41c9f323", new Object[]{str, str2, str3, str4, hashMap});
            return;
        }
        com.alibaba.ha.bizerrorreporter.module.a aVar = new com.alibaba.ha.bizerrorreporter.module.a();
        aVar.b = AggregationType.CONTENT;
        aVar.f3119a = str;
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        aVar.j = jSONObject.toString();
        aVar.d = str2;
        aVar.f = str3;
        aVar.g = str4;
        e.a().a(android.taobao.windvane.config.a.f, aVar);
    }

    public static void a(String str, String str2, String str3, String str4, String str5, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2562e1a4", new Object[]{str, str2, str3, str4, str5, str6});
            return;
        }
        com.alibaba.ha.bizerrorreporter.module.a aVar = new com.alibaba.ha.bizerrorreporter.module.a();
        aVar.b = AggregationType.CONTENT;
        aVar.d = str2;
        aVar.f3119a = str;
        aVar.j = str3;
        if (str4 == null) {
            aVar.f = "Script error";
        } else {
            aVar.f = str4;
        }
        aVar.g = "line: " + str5;
        aVar.h = str6;
        e.a().a(android.taobao.windvane.config.a.f, aVar);
    }
}
