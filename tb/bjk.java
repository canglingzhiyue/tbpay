package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.ultron.engine.protocol.Component;
import com.alibaba.android.ultron.engine.protocol.Data;
import com.alibaba.android.ultron.engine.protocol.Event;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class bjk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "DataRender";

    static {
        kge.a(194294039);
    }

    public static Data a(bjp bjpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Data) ipChange.ipc$dispatch("ab517bf3", new Object[]{bjpVar});
        }
        HashMap hashMap = new HashMap();
        if (bjpVar.c()) {
            for (Map.Entry<String, bjg> entry : bjpVar.d().c().entrySet()) {
                a(hashMap, bjpVar.d().e().get(entry.getKey()));
            }
            return Data.of(hashMap);
        }
        a(hashMap, bjpVar.a());
        return Data.of(hashMap);
    }

    private static void a(Map<String, Component> map, bjh bjhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8198fe6d", new Object[]{map, bjhVar});
        } else if (bjhVar != null) {
            bji h = bjhVar.h();
            Component component = new Component();
            component.id = String.valueOf(h.f25940a);
            component.tag = h.b;
            component.type = h.c;
            component.position = h.i;
            component.fields = h.d != null ? (JSONObject) JSON.parse(h.d.toJSONString()) : null;
            component.events = a(h);
            component.cardGroup = h.j;
            map.put(h.l, component);
            List<bjh> k = bjhVar.k();
            if (k == null || k.isEmpty()) {
                return;
            }
            for (bjh bjhVar2 : k) {
                a(map, bjhVar2);
            }
        }
    }

    public static Map<String, List<Event>> a(bji bjiVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c3c7700c", new Object[]{bjiVar});
        }
        JSONObject jSONObject2 = bjiVar.e;
        JSONObject jSONObject3 = bjiVar.f;
        if (jSONObject2 == null || jSONObject2.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (StringUtils.isEmpty(key) || !(value instanceof JSONArray)) {
                String[] strArr = new String[1];
                strArr[0] = !(value instanceof JSONArray) ? "value is not array: " + value : "";
                UnifyLog.d(TAG, strArr);
            } else {
                JSONArray jSONArray = (JSONArray) value;
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArray.size(); i++) {
                    JSONObject jSONObject4 = (JSONObject) jSONArray.get(i);
                    Event event = new Event();
                    String string = jSONObject4.getString("key");
                    if (!StringUtils.isEmpty(string)) {
                        event.type = string;
                        event.fields = jSONObject4.getJSONObject("params");
                    } else {
                        event.type = jSONObject4.getString("type");
                        event.fields = jSONObject4.getJSONObject("fields");
                    }
                    event.option = jSONObject4.getIntValue("option");
                    if (jSONObject3 != null && jSONObject3.containsKey(event.type) && (jSONObject = jSONObject3.getJSONObject(event.type)) != null) {
                        if (event.fields == null) {
                            event.fields = new JSONObject();
                        }
                        event.fields.putAll(jSONObject);
                    }
                    arrayList.add(event);
                }
                hashMap.put(key, arrayList);
            }
        }
        return hashMap;
    }
}
