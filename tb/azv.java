package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.data.remote.newmodel.a;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.Map;
import tb.arc;

/* loaded from: classes2.dex */
public final class azv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2084976988);
    }

    public static JSONObject a(String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("828fd7e6", new Object[]{str, str2, str3, jSONObject, jSONObject2});
        }
        try {
            if (StringUtils.isEmpty(str)) {
                return jSONObject2;
            }
            String[] split = str.split("_");
            if (split.length <= 0) {
                arc.a().a("cropProtocolOfComponentData#无法找到组件对应的block名称", arc.a.a().b("AURAUtronDataProtocolCropper").a("componentKey", str).b());
                return jSONObject2;
            }
            String str4 = split[0];
            if (StringUtils.isEmpty(str4) || (jSONObject3 = jSONObject.getJSONObject(str4)) == null) {
                return jSONObject2;
            }
            JSONObject jSONObject4 = new JSONObject();
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                String key = entry.getKey();
                if (jSONObject3.get(key) == null) {
                    jSONObject4.put(key, entry.getValue());
                }
            }
            for (Map.Entry<String, Object> entry2 : jSONObject3.entrySet()) {
                Object a2 = a(jSONObject2, entry2);
                String key2 = entry2.getKey();
                Object a3 = a(str2, str3, str, jSONObject2, a2, entry2);
                if (a3 != null) {
                    jSONObject4.put(key2, a3);
                }
            }
            return jSONObject4;
        } catch (Exception e) {
            UnifyLog.d("AliUltronDataProtocolCropper#exception", e.getMessage());
            return jSONObject2;
        }
    }

    private static Object a(String str, String str2, String str3, JSONObject jSONObject, Object obj, Map.Entry<String, Object> entry) {
        String str4;
        Object obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("f298fc01", new Object[]{str, str2, str3, jSONObject, obj, entry});
        }
        if (!"events".equals(entry.getKey()) || !str.equals(str3) || StringUtils.isEmpty(str2)) {
            return obj;
        }
        String[] split = str2.split("\\.");
        if (split != null && split.length > 0) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("events");
            if (jSONObject2 == null || (obj2 = jSONObject2.get((str4 = split[0]))) == null) {
                return obj;
            }
            if (obj == null) {
                obj = new JSONObject();
            }
            if (obj instanceof JSONObject) {
                ((JSONObject) obj).put(str4, obj2);
            }
        }
        return obj;
    }

    private static Object a(JSONObject jSONObject, Map.Entry<String, Object> entry) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("16b62143", new Object[]{jSONObject, entry});
        }
        Object value = entry.getValue();
        if (!(value instanceof JSONObject)) {
            return null;
        }
        JSONObject jSONObject3 = (JSONObject) value;
        if (jSONObject3.getBooleanValue(a.MATCH_IGNORE) || (jSONObject2 = jSONObject3.getJSONObject("template")) == null) {
            return null;
        }
        return jpy.a(jSONObject, JSONObject.parseObject(jSONObject2.toJSONString()));
    }
}
