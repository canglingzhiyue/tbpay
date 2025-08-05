package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes2.dex */
public final class bkg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1425368026);
    }

    public static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f32d068", new Object[]{jSONObject, jSONObject2});
        } else {
            hsz.a(jSONObject, jSONObject2);
        }
    }

    public static JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{jSONObject}) : hsz.a(jSONObject);
    }

    public static JSONArray a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("b36fc2ae", new Object[]{jSONArray}) : hsz.a(jSONArray);
    }

    public static void a(Object obj, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9df337f6", new Object[]{obj, jSONObject, str});
        } else if (obj == null || jSONObject == null) {
        } else {
            b(obj, jSONObject, str);
        }
    }

    private static void b(Object obj, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8643115", new Object[]{obj, jSONObject, str});
        } else if (obj instanceof JSONObject) {
            JSONObject jSONObject2 = (JSONObject) obj;
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                if (str == null || !str.equals(entry.getKey())) {
                    Object value = entry.getValue();
                    if (value instanceof String) {
                        String str2 = (String) value;
                        if (bke.a(str2)) {
                            Object a2 = bke.a(str2, jSONObject);
                            if (a2 instanceof JSONObject) {
                                jSONObject2.put(entry.getKey(), (Object) a((JSONObject) a2));
                            } else if (a2 instanceof JSONArray) {
                                jSONObject2.put(entry.getKey(), (Object) a((JSONArray) a2));
                            } else {
                                jSONObject2.put(entry.getKey(), a2);
                            }
                        }
                    } else if (value instanceof JSONObject) {
                        b(value, jSONObject, str);
                    } else if (value instanceof JSONArray) {
                        b(value, jSONObject, str);
                    }
                }
            }
        } else if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                Object obj2 = jSONArray.get(i);
                if (obj2 instanceof String) {
                    String str3 = (String) obj2;
                    if (bke.a(str3)) {
                        Object a3 = bke.a(str3, jSONObject);
                        if (a3 instanceof JSONObject) {
                            jSONArray.set(i, a((JSONObject) a3));
                        } else if (a3 instanceof JSONArray) {
                            jSONArray.set(i, a((JSONArray) a3));
                        } else {
                            jSONArray.set(i, a3);
                        }
                    }
                } else if (obj2 instanceof JSONObject) {
                    b(obj2, jSONObject, str);
                } else if (obj2 instanceof JSONArray) {
                    b(obj2, jSONObject, str);
                }
            }
        }
    }
}
