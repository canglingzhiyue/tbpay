package tb;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.security.realidentity.b;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes5.dex */
public final class obz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1077042497);
    }

    public static JSONObject a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("73d7af52", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        try {
            return JSONObject.parseObject(str);
        } catch (Throwable th) {
            spz.a(b.f3363a, "fromJson error", th);
            return null;
        }
    }

    public static <T> T a(String str, TypeReference<T> typeReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("5ee5558", new Object[]{str, typeReference});
        }
        if (str == null) {
            return null;
        }
        try {
            return (T) JSONObject.parseObject(str, typeReference, new Feature[0]);
        } catch (Throwable th) {
            spz.a(b.f3363a, "romJson error", th);
            return null;
        }
    }

    public static String a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8a5b32dc", new Object[]{obj});
        }
        if (obj != null) {
            return JSONObject.toJSONString(obj);
        }
        return null;
    }

    public static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f32d068", new Object[]{jSONObject, jSONObject2});
        } else if (jSONObject == null || jSONObject2 == null) {
            spz.c(b.f3363a, "按照某些特定字段复制JSON对象，target或source为空");
        } else {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                Object obj = jSONObject2.get(entry.getKey());
                if ((entry.getValue() instanceof JSONObject) && (obj instanceof JSONObject)) {
                    a((JSONObject) entry.getValue(), (JSONObject) obj);
                } else {
                    entry.setValue(obj);
                }
            }
        }
    }
}
