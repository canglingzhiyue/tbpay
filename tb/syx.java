package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
public class syx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-7907455);
    }

    public static Object a(JSONObject jSONObject, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c2724e", new Object[]{jSONObject, obj}) : a(jSONObject, obj, false);
    }

    public static Object a(JSONObject jSONObject, Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("2d9fef42", new Object[]{jSONObject, obj, new Boolean(z)});
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            return syy.a() ? syy.a(jSONObject, null, str) : syw.a((Object) jSONObject, str);
        } else if (!(obj instanceof JSONObject)) {
            if (!(obj instanceof JSONArray)) {
                if (!z) {
                    return null;
                }
                return obj;
            }
            JSONArray jSONArray = (JSONArray) obj;
            ArrayList arrayList = new ArrayList();
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object a2 = a(jSONObject, it.next(), z);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
            jSONArray.clear();
            jSONArray.addAll(arrayList);
            return jSONArray;
        } else {
            JSONObject jSONObject2 = (JSONObject) obj;
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                entry.setValue(a(jSONObject, entry.getValue(), z));
            }
            return jSONObject2;
        }
    }
}
