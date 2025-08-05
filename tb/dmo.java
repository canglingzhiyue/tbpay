package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class dmo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-547594152);
    }

    public static <T> T a(Class<T> cls, JSONObject jSONObject, String str, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("43f29f1", new Object[]{cls, jSONObject, str, t});
        }
        if (jSONObject != null && jSONObject.get(str) != null) {
            Object obj = null;
            try {
                if (cls == String.class) {
                    obj = (T) jSONObject.getString(str);
                } else {
                    obj = jSONObject.getObject(str, cls);
                }
            } catch (Exception unused) {
            }
            if (obj != null) {
                return (T) obj;
            }
        }
        return t;
    }

    public static JSONObject a(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("e6f9ccfe", new Object[]{jSONObject, str, jSONObject2}) : (JSONObject) a(JSONObject.class, jSONObject, str, jSONObject2);
    }

    public static JSONArray a(JSONObject jSONObject, String str, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("33bda684", new Object[]{jSONObject, str, jSONArray}) : (JSONArray) a(JSONArray.class, jSONObject, str, jSONArray);
    }

    public static int a(JSONObject jSONObject, String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b8e389e4", new Object[]{jSONObject, str, new Integer(i)})).intValue() : ((Integer) a(Integer.class, jSONObject, str, Integer.valueOf(i))).intValue();
    }

    public static String a(JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7f883384", new Object[]{jSONObject, str, str2}) : (String) a(String.class, jSONObject, str, str2);
    }

    public static boolean a(JSONObject jSONObject, String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b8e3c9c6", new Object[]{jSONObject, str, new Boolean(z)})).booleanValue() : ((Boolean) a(Boolean.class, jSONObject, str, Boolean.valueOf(z))).booleanValue();
    }

    public static float a(JSONObject jSONObject, String str, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b8e37e9e", new Object[]{jSONObject, str, new Float(f)})).floatValue() : ((Float) a(Float.class, jSONObject, str, Float.valueOf(f))).floatValue();
    }
}
