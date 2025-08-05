package tb;

import com.alibaba.android.ultron.ext.event.util.h;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.model.b;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class biw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-659905530);
    }

    public static List<b> a(JSONArray jSONArray, JSONObject jSONObject, List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("747031d6", new Object[]{jSONArray, jSONObject, list});
        }
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jSONArray.size());
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof JSONObject) {
                h.a(next, jSONObject, "", "triggerData");
                b a2 = a((JSONObject) next, list);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
        }
        return arrayList;
    }

    private static b a(JSONObject jSONObject, List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("572e4f4c", new Object[]{jSONObject, list});
        }
        if (jSONObject != null && !jSONObject.isEmpty()) {
            return new DMEvent(jSONObject.getString("type"), jSONObject.getJSONObject("fields"), list);
        }
        return null;
    }
}
