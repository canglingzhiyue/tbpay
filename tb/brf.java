package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.calander.DXOnSelectDateEvent;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class brf implements brd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f26058a;

    static {
        kge.a(20065109);
        kge.a(371667525);
    }

    public brf(String str) {
        this.f26058a = str;
    }

    @Override // tb.brd
    public void a(AURARenderComponent aURARenderComponent, DXEvent dXEvent, Object[] objArr, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("967ab349", new Object[]{this, aURARenderComponent, dXEvent, objArr, map});
        } else if (!(dXEvent instanceof DXOnSelectDateEvent) || aURARenderComponent.data == null || aURARenderComponent.data.fields == null) {
        } else {
            HashMap hashMap = new HashMap(aURARenderComponent.data.fields);
            Map<String, String> data = ((DXOnSelectDateEvent) dXEvent).getData();
            if (data != null) {
                hashMap.putAll(data);
            }
            String str = (String) bbc.a(hashMap, "selectedDate", String.class, null);
            if (!StringUtils.isEmpty(str)) {
                JSONObject jSONObject = (JSONObject) bbc.a(hashMap, "group", JSONObject.class, new JSONObject());
                a(hashMap, jSONObject, str);
                a((JSONObject) bbc.a(hashMap, "disabled", JSONObject.class, null), jSONObject, str);
                jSONObject.put("selectedId", (Object) Collections.EMPTY_LIST);
                a(jSONObject);
            }
            map.putAll(hashMap);
        }
    }

    private void a(Map<String, Object> map, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eab6b37d", new Object[]{this, map, jSONObject, str});
            return;
        }
        JSONObject jSONObject2 = (JSONObject) bbc.a(map, "itemsOption", JSONObject.class, null);
        if (jSONObject2 == null) {
            return;
        }
        Object obj = jSONObject2.get(str);
        if (obj != null) {
            jSONObject.put("items", obj);
            return;
        }
        Object obj2 = jSONObject2.get("default");
        if (obj2 == null) {
            return;
        }
        jSONObject.put("items", obj2);
    }

    private void a(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("461bb032", new Object[]{this, jSONObject, jSONObject2, str});
        } else if (jSONObject == null) {
        } else {
            JSONArray jSONArray = jSONObject.getJSONArray(str);
            if (jSONArray != null) {
                jSONObject2.put("disabled", (Object) jSONArray);
            } else {
                jSONObject2.remove("disabled");
            }
        }
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (baz.a("enableSelectFirstData", true)) {
            JSONArray jSONArray = jSONObject.getJSONArray("items");
            if (bau.a(jSONArray)) {
                arc.a().a("items is empty");
                return;
            }
            JSONArray jSONArray2 = jSONObject.getJSONArray("disabled");
            JSONArray jSONArray3 = new JSONArray();
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (!bau.a(jSONObject2)) {
                    String string = jSONObject2.getString("id");
                    if (!StringUtils.isEmpty(string) && (jSONArray2 == null || !jSONArray2.contains(string))) {
                        jSONArray3.add(string);
                        break;
                    }
                }
            }
            jSONObject.put("selectedId", (Object) jSONArray3);
        }
    }

    @Override // tb.brd
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f26058a;
    }

    public Class<? extends DXEvent> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("6a1d2296", new Object[]{this}) : DXOnSelectDateEvent.class;
    }
}
