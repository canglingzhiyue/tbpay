package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes5.dex */
public class fjs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2135842513);
    }

    public static boolean a(Map<String, Object> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7b3ceab", new Object[]{map, str})).booleanValue();
        }
        if (map != null && str != null) {
            Object obj = map.get(str);
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue();
            }
            if (obj instanceof String) {
                return "true".equalsIgnoreCase((String) obj);
            }
            if (obj instanceof Integer) {
                return 1 == ((Integer) obj).intValue();
            }
        }
        fjt.a("NDBaseTypeUtils", "getBoolean error. return false. key = " + str);
        return false;
    }

    public static String a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("731d6f8e", new Object[]{jSONObject, str});
        }
        if (jSONObject != null && str != null && jSONObject.containsKey(str)) {
            return jSONObject.getString(str);
        }
        return null;
    }

    public static int a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue() : a(str, 0);
    }

    public static int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{str, new Integer(i)})).intValue();
        }
        if (str != null && !str.isEmpty()) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                fjt.a("NDBaseTypeUtils", "getInt error. 格式转换出错. intStr = " + str);
            } catch (Throwable th) {
                fjt.a(fjt.TAG_RIGHT_NAV_RECYCLER_LAYER, "getInt error. 未知异常 .intStr = " + str, th);
            }
        }
        return i;
    }

    public static boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{str, new Boolean(z)})).booleanValue() : (str == null || str.isEmpty()) ? z : "true".equals(str);
    }

    public static float a(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123a1be", new Object[]{str, new Float(f)})).floatValue();
        }
        if (str != null && !TextUtils.isEmpty(str)) {
            try {
                return Float.parseFloat(str);
            } catch (NumberFormatException unused) {
                fjt.a("NDBaseTypeUtils", "getFloat error. 格式转换出错. floatStr = " + str);
            } catch (Throwable th) {
                fjt.a(fjt.TAG_RIGHT_NAV_RECYCLER_LAYER, "getFloat error. 未知异常 .floatStr = " + str, th);
            }
        }
        return f;
    }

    public static double a(String str, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("81239a3a", new Object[]{str, new Double(d)})).doubleValue();
        }
        if (str != null && !TextUtils.isEmpty(str)) {
            try {
                return Double.parseDouble(str);
            } catch (NumberFormatException unused) {
                fjt.a("NDBaseTypeUtils", "getDouble error. 格式转换出错. doubleStr = " + str);
            } catch (Throwable th) {
                fjt.a(fjt.TAG_RIGHT_NAV_RECYCLER_LAYER, "getDouble error. 未知异常 .doubleStr = " + str, th);
            }
        }
        return d;
    }

    public static JSONObject a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("836310b0", new Object[]{jSONArray});
        }
        if (jSONArray != null && !jSONArray.isEmpty() && (jSONArray.get(0) instanceof JSONObject)) {
            return jSONArray.getJSONObject(0);
        }
        return null;
    }

    public static JSONArray b(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("a48eded", new Object[]{jSONObject, str});
        }
        if (jSONObject != null && str != null && jSONObject.containsKey(str)) {
            return jSONObject.getJSONArray(str);
        }
        return null;
    }

    public static JSONObject c(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6a0a6430", new Object[]{jSONObject, str});
        }
        if (jSONObject != null && str != null && jSONObject.containsKey(str)) {
            return jSONObject.getJSONObject(str);
        }
        return null;
    }
}
