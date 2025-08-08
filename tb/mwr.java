package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mytaobao.ultron.b;
import com.taobao.tao.Globals;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class mwr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARAMS_GLOBAL = "global";
    public static final String PARAMS_GLOBAL_PARAM_REQ = "paramRequest";

    static {
        kge.a(-2112530373);
    }

    public static jnw a(Context context, String str, String str2, Map<String, String> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jnw) ipChange.ipc$dispatch("709ba270", new Object[]{context, str, str2, map, new Boolean(z)});
        }
        if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
            return null;
        }
        Map<String, String> a2 = a("mtop.taobao.reborn.mclaren");
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!StringUtils.isEmpty(key) && !StringUtils.isEmpty(value)) {
                    a2.put(key, value);
                }
            }
        }
        jnw h = new jnw(context).a(str).b(str2).a(a2).e("mytaobao").a(true).j(true).h(true);
        if (z) {
            h.d("UNIT_TRADE");
        }
        return h;
    }

    private static Map<String, String> a(String str) {
        JSONObject l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{str});
        }
        HashMap hashMap = new HashMap();
        String a2 = mxl.a(Globals.getApplication().getApplicationContext());
        if (!StringUtils.isEmpty(a2)) {
            hashMap.put("shopInfo", a2);
        }
        if (StringUtils.equals(str, "mtop.taobao.volvo.mytaobao")) {
            l = b.a().c();
        } else {
            l = b.a().l();
        }
        String str2 = null;
        JSONObject jSONObject = l == null ? null : l.getJSONObject("data");
        JSONObject jSONObject2 = jSONObject == null ? null : jSONObject.getJSONObject("global");
        if (jSONObject2 != null) {
            str2 = jSONObject2.getString(PARAMS_GLOBAL_PARAM_REQ);
        }
        if (str2 != null) {
            hashMap.put(PARAMS_GLOBAL_PARAM_REQ, str2);
        }
        return hashMap;
    }
}
