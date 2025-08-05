package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Set;

/* loaded from: classes6.dex */
public final class jot {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1504930353);
    }

    public static JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("87d5db88", new Object[]{jSONObject, jSONObject2});
        }
        Set<String> keySet = jSONObject.keySet();
        if (keySet != null && !keySet.isEmpty()) {
            for (String str : keySet) {
                if (str != null) {
                    Object obj = jSONObject.get(str);
                    if (obj == null) {
                        jSONObject2.put(str, (Object) null);
                    } else {
                        Object obj2 = jSONObject2.get(str);
                        if (obj2 == null) {
                            jSONObject2.put(str, obj);
                        } else if (obj2 instanceof JSONObject) {
                            a((JSONObject) obj, (JSONObject) obj2);
                        } else {
                            jSONObject2.put(str, obj);
                        }
                    }
                }
            }
        }
        return jSONObject2;
    }

    public static void a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        JSONObject a2;
        JSONObject a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1fd1788", new Object[]{jSONObject, jSONObject2, jSONObject3});
            return;
        }
        for (String str : jSONObject.keySet()) {
            if (!TextUtils.isEmpty(str)) {
                String string = jSONObject.getString(str);
                if (!TextUtils.isEmpty(string)) {
                    String[] split = str.split("\\.");
                    if (split.length != 0 && (a2 = a(jSONObject2, split)) != null && (a3 = a(jSONObject3, split)) != null) {
                        String str2 = split[split.length - 1];
                        char c = 65535;
                        if (string.hashCode() == 1094496948 && string.equals("replace")) {
                            c = 0;
                        }
                        if (c == 0) {
                            Object obj = a2.get(str2);
                            if (obj == null) {
                                a3.remove(str2);
                            } else {
                                a3.put(str2, obj);
                            }
                        }
                    }
                }
            }
        }
    }

    private static JSONObject a(JSONObject jSONObject, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("31c0dbb7", new Object[]{jSONObject, strArr});
        }
        for (int i = 0; i < strArr.length - 1; i++) {
            if (jSONObject == null) {
                return null;
            }
            jSONObject = jSONObject.getJSONObject(strArr[i]);
        }
        return jSONObject;
    }
}
