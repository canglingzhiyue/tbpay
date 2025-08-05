package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public abstract class psq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1902441990);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        try {
            return Boolean.parseBoolean(str);
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static long a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123b0c6", new Object[]{str, new Long(j)})).longValue();
        }
        if (str == null) {
            return j;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return j;
        }
    }

    public static HashMap<String, String> a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("12dd5eeb", new Object[]{jSONObject});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (jSONObject != null) {
            try {
                if (jSONObject.keySet().size() > 0) {
                    for (String str : jSONObject.keySet()) {
                        String valueOf = String.valueOf(str);
                        hashMap.put(valueOf, jSONObject.getString(valueOf));
                    }
                }
            } catch (Exception unused) {
            }
        }
        return hashMap;
    }

    public static String[] a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("ab7e78ac", new Object[]{map});
        }
        String[] strArr = null;
        if (map != null) {
            try {
                if (map.keySet().size() > 0) {
                    strArr = new String[map.keySet().size()];
                    for (String str : map.keySet()) {
                        String valueOf = String.valueOf(str);
                        int i2 = i + 1;
                        strArr[i] = valueOf + "=" + map.get(valueOf);
                        i = i2;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return strArr;
    }

    public static JSONObject b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9d2c0493", new Object[]{str});
        }
        try {
            return JSON.parseObject(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
