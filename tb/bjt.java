package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public class bjt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-557736258);
    }

    public void a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f32d068", new Object[]{this, jSONObject, jSONObject2});
        } else if (jSONObject != null && !jSONObject.isEmpty() && jSONObject2 != null) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                entry.setValue(a(jSONObject2, entry.getValue()));
            }
        }
    }

    private Object a(JSONObject jSONObject, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c2724e", new Object[]{this, jSONObject, obj});
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return jpe.a((Object) jSONObject, (String) obj, false);
        }
        if (obj instanceof JSONObject) {
            JSONObject jSONObject2 = (JSONObject) obj;
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                entry.setValue(a(jSONObject, entry.getValue()));
            }
            return jSONObject2;
        }
        boolean z = obj instanceof JSONArray;
        JSONArray jSONArray = obj;
        if (z) {
            JSONArray jSONArray2 = (JSONArray) obj;
            ArrayList arrayList = new ArrayList();
            Iterator<Object> it = jSONArray2.iterator();
            while (it.hasNext()) {
                Object a2 = a(jSONObject, it.next());
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
            jSONArray2.clear();
            jSONArray2.addAll(arrayList);
            jSONArray = jSONArray2;
        }
        return jSONArray;
    }
}
