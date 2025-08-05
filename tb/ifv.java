package tb;

import android.text.TextUtils;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class ifv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-409247091);
    }

    public static Map<String, List<Event>> a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2b563fbd", new Object[]{jSONObject});
        }
        new HashMap();
        HashMap hashMap = new HashMap();
        for (String str : jSONObject.keySet()) {
            if (!TextUtils.isEmpty(str)) {
                Object obj = jSONObject.get(str);
                if (obj instanceof JSONArray) {
                    hashMap.put(str, a((JSONArray) obj));
                }
            }
        }
        return hashMap;
    }

    private static List<Event> a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c9355ab7", new Object[]{jSONArray});
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.size(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONObject) {
                arrayList.add(new Event((JSONObject) obj));
            }
        }
        return arrayList;
    }
}
