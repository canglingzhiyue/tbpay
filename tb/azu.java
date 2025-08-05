package tb;

import com.alibaba.android.umf.datamodel.protocol.ultron.UltronProtocol;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.arc;

/* loaded from: classes2.dex */
public class azu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2074726653);
    }

    public static void a(UltronProtocol ultronProtocol, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6fd583b", new Object[]{ultronProtocol, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        if (jSONObject2 == null) {
            return;
        }
        if (ultronProtocol == null) {
            arc.a().b("GlobalData中没有对应的数据：global_data_linkage_protocol", arc.a.a().b("AURAUltronProtocolCropperDelegate").b());
            return;
        }
        JSONObject a2 = a(ultronProtocol);
        if (a2 == null) {
            arc.a().a("没有配置simplifyRules", arc.a.a().b("AURAUltronProtocolCropperDelegate").b());
            return;
        }
        String string = jSONObject.getString("operator");
        String string2 = jSONObject.getString("operatorEvent");
        if (string == null || string2 == null) {
            return;
        }
        for (String str : jSONObject2.keySet()) {
            Object obj = jSONObject2.get(str);
            if (!(obj instanceof Component)) {
                baw.a("componentObj必须是Component类型");
            } else {
                Object json = JSON.toJSON((Component) obj);
                if (json instanceof JSONObject) {
                    jSONObject2.put(str, (Object) azv.a(str, string, string2, a2, (JSONObject) json));
                }
            }
        }
    }

    private static JSONObject a(UltronProtocol ultronProtocol) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("70413875", new Object[]{ultronProtocol});
        }
        Object linkage = ultronProtocol.getLinkage();
        if ((linkage instanceof JSONObject) && (jSONObject = ((JSONObject) linkage).getJSONObject("features")) != null && (jSONObject2 = jSONObject.getJSONObject("simplifyRules")) != null) {
            return jSONObject2.getJSONObject("data");
        }
        return null;
    }
}
