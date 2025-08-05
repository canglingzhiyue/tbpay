package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class fju {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1079485917);
    }

    public static <V> HashMap<String, V> a(JSONObject jSONObject, fjn<V> fjnVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("f2a9771", new Object[]{jSONObject, fjnVar});
        }
        if (jSONObject == null) {
            return new HashMap<>();
        }
        HashMap<String, V> hashMap = new HashMap<>();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            V v = null;
            try {
                str = entry.getKey();
                v = fjnVar.b(entry.getValue());
            } catch (Throwable unused) {
                str = null;
            }
            if (v != null) {
                hashMap.put(str, v);
            }
        }
        return hashMap;
    }
}
