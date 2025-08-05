package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public final class jqc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(814453476);
    }

    public static JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            return JSONObject.parseObject(jSONObject.toJSONString());
        } catch (Exception e) {
            jqg.a("UltronJsonUtil", "deepCloneJSONObject#" + e.getMessage());
            return null;
        }
    }

    public static float a(JSONObject jSONObject, String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b8e37e9e", new Object[]{jSONObject, str, new Float(f)})).floatValue();
        }
        if (!jSONObject.containsKey(str)) {
            return f;
        }
        Object obj = jSONObject.get(str);
        if (obj instanceof Float) {
            return ((Float) obj).floatValue();
        }
        if (obj instanceof String) {
            try {
                return Float.parseFloat((String) obj);
            } catch (Exception unused) {
            }
        }
        return f;
    }

    public static double a(JSONObject jSONObject, String str, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b8e3771a", new Object[]{jSONObject, str, new Double(d)})).doubleValue();
        }
        if (!jSONObject.containsKey(str)) {
            return d;
        }
        Object obj = jSONObject.get(str);
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue();
        }
        if (obj instanceof String) {
            try {
                return Double.parseDouble((String) obj);
            } catch (Exception unused) {
            }
        }
        return d;
    }
}
