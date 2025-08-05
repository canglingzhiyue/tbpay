package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.j;
import com.taobao.tao.log.TLog;
import java.util.HashMap;

/* loaded from: classes.dex */
public class ktt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f30314a;
    private static HashMap<String, kts> b;
    private static JSONObject c;

    static {
        kge.a(-1833740137);
        f30314a = null;
        try {
            c = JSONObject.parseObject(j.a("bizparamsChannelConfig", "{\"UT\":{\"length\":200,\"key\":{\"_afc_id\":\"\"}},\"homepage_common\":{\"length\":800,\"key\":{\"tb_homepage_clientCache_lbs\":\"TB,SG_TMCS_FRESH_MARKET,SG_TMCS_1H_DS\"}}}"));
        } catch (Exception unused) {
            TLog.loge("BizParamsCenter", "JSONConfig Error");
            c = JSONObject.parseObject("{\"UT\":{\"length\":200,\"key\":{\"_afc_id\":\"\"}},\"homepage_common\":{\"length\":800,\"key\":{\"tb_homepage_clientCache_lbs\":\"TB,SG_TMCS_FRESH_MARKET,SG_TMCS_1H_DS\"}}}");
        }
        HashMap<String, kts> hashMap = new HashMap<>(4);
        b = hashMap;
        hashMap.put("UT", new ktv("UT", c.getJSONObject("UT")));
        b.put("homepage_common", new ktu("homepage_common", c.getJSONObject("homepage_common")));
    }

    public static void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{jSONObject});
            return;
        }
        JSONObject jSONObject2 = c;
        if (jSONObject2 == null || jSONObject == null) {
            return;
        }
        for (String str : jSONObject2.keySet()) {
            kts ktsVar = b.get(str);
            if (ktsVar != null) {
                ktsVar.a(jSONObject);
            }
        }
    }
}
