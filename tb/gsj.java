package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class gsj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-597828847);
    }

    public static int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{str, new Integer(i)})).intValue();
        }
        if (str != null && str.length() != 0) {
            try {
                return Integer.parseInt(str.replaceAll("[^0-9]", ""));
            } catch (Exception unused) {
            }
        }
        return i;
    }

    public static long b(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7d253be4", new Object[]{str, new Integer(i)})).longValue();
        }
        if (StringUtils.isEmpty(str)) {
            return 0L;
        }
        String[] split = str.split("\\.");
        long[] jArr = new long[5];
        if (split == null) {
            return 0L;
        }
        for (int i2 = 0; i2 < split.length; i2++) {
            jArr[i2] = a(split[i2], i);
        }
        return (jArr[0] << 56) | (jArr[1] << 48) | (jArr[2] << 32) | (jArr[3] << 8) | jArr[4];
    }

    public static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7938d28", new Object[]{jSONObject, jSONObject2});
        } else if (jSONObject == null) {
        } else {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    jSONObject2.put(next, jSONObject.opt(next));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static Map<String, Object> a(com.alibaba.fastjson.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2b563fbd", new Object[]{jSONObject});
        }
        HashMap hashMap = new HashMap();
        try {
            for (String str : jSONObject.keySet()) {
                Object obj = jSONObject.get(str);
                if (obj instanceof com.alibaba.fastjson.JSONObject) {
                    hashMap.put(str, a((com.alibaba.fastjson.JSONObject) obj));
                } else if (obj instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) obj;
                    if (jSONArray.size() != 0) {
                        hashMap.put(str, a(jSONArray));
                    }
                } else {
                    hashMap.put(str, obj);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return hashMap;
    }

    public static Vector a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Vector) ipChange.ipc$dispatch("5a93d032", new Object[]{jSONArray});
        }
        Vector vector = new Vector();
        try {
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof JSONObject) {
                    vector.add(a((com.alibaba.fastjson.JSONObject) next));
                } else if (next instanceof JSONArray) {
                    JSONArray jSONArray2 = (JSONArray) next;
                    if (jSONArray2.size() != 0) {
                        vector.add(a(jSONArray2));
                    }
                } else {
                    vector.add(next);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return vector;
    }
}
