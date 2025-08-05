package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.mrt.utils.c;
import com.tmall.android.dai.DAI;
import com.tmall.android.dai.d;
import com.tmall.android.dai.model.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class rkz implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(674860896);
        kge.a(1914895581);
    }

    @Override // com.tmall.android.dai.d
    public Map<String, String> onTask(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5e53be4f", new Object[]{this, map});
        }
        String str = map.get(AliFestivalWVPlugin.PARAMS_MODULE_NAME);
        String str2 = map.get("type");
        String str3 = map.get("value");
        String str4 = map.get("traceBack");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("value", str3);
            jSONObject.put("traceback", str4 + "");
            jSONObject.put("model_name", str);
            a registeredModel = DAI.getRegisteredModel(str);
            if (registeredModel != null) {
                jSONObject.put("extend_arg1", registeredModel.g() + "");
                jSONObject.put("cid", registeredModel.h() == null ? "" : registeredModel.h());
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        c.a("0", str + "" + str2, jSONObject);
        HashMap hashMap = new HashMap();
        hashMap.put("success", "1");
        return hashMap;
    }
}
