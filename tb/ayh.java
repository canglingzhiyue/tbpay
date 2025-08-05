package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.linkage.UMFLinkageTrigger;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@AURAExtensionImpl(code = "aura.impl.event.adjust.judge.dataChange")
/* loaded from: classes2.dex */
public final class ayh extends ayp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1246069271);
    }

    public static /* synthetic */ Object ipc$super(ayh ayhVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.ayp
    public boolean a(UMFLinkageTrigger uMFLinkageTrigger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("115c7adf", new Object[]{this, uMFLinkageTrigger})).booleanValue();
        }
        if (!bar.a("enableAdjustOptimize", false) || !b(uMFLinkageTrigger)) {
            return true;
        }
        List<AURARenderComponent> list = (List) c().get("render_view_item_models", List.class);
        JSONObject jSONObject = (JSONObject) c().get("floatRawProtocol", JSONObject.class);
        JSONObject jSONObject2 = (JSONObject) c().get("aura_data_protocol_json", JSONObject.class);
        if (list != null && jSONObject != null && jSONObject2 != null) {
            return a(jSONObject, jSONObject2, list);
        }
        return true;
    }

    private boolean b(UMFLinkageTrigger uMFLinkageTrigger) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ed1df6a0", new Object[]{this, uMFLinkageTrigger})).booleanValue() : Boolean.parseBoolean(uMFLinkageTrigger.getNeedAdjustOptimize());
    }

    private boolean a(JSONObject jSONObject, JSONObject jSONObject2, List<AURARenderComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3f838d5d", new Object[]{this, jSONObject, jSONObject2, list})).booleanValue();
        }
        for (AURARenderComponent aURARenderComponent : list) {
            String str = aURARenderComponent.key;
            if (!TextUtils.isEmpty(str)) {
                JSONObject a2 = a(jSONObject, str);
                JSONObject a3 = a(jSONObject2, str);
                if (a2 == null || a3 == null || a(a2, a3, d())) {
                    return true;
                }
            }
        }
        return false;
    }

    private JSONObject a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a5543672", new Object[]{this, jSONObject, str});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        if (jSONObject2 != null) {
            return jSONObject2.getJSONObject(str);
        }
        return null;
    }

    private Map<String, String> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("913cde0", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("optional", "force");
        return hashMap;
    }

    private boolean a(JSONObject jSONObject, JSONObject jSONObject2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66672e21", new Object[]{this, jSONObject, jSONObject2, map})).booleanValue();
        }
        a(jSONObject);
        a(jSONObject2);
        if (jSONObject.keySet().size() != jSONObject2.keySet().size()) {
            for (String str : jSONObject.keySet()) {
                if (!jSONObject2.containsKey(str)) {
                    return true;
                }
            }
            for (String str2 : jSONObject2.keySet()) {
                String string = jSONObject2.getString(str2);
                if (!jSONObject.containsKey(str2) && string != null && !string.equals(map.get(str2))) {
                    return true;
                }
            }
        }
        for (String str3 : jSONObject.keySet()) {
            if (a(jSONObject.get(str3), jSONObject2.get(str3), map)) {
                return true;
            }
        }
        return false;
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        Iterator<Map.Entry<String, Object>> it = jSONObject.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue() == null) {
                it.remove();
            }
        }
    }

    private boolean a(JSONArray jSONArray, JSONArray jSONArray2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dc4355d1", new Object[]{this, jSONArray, jSONArray2, map})).booleanValue();
        }
        if (jSONArray.size() != jSONArray2.size()) {
            return true;
        }
        for (int i = 0; i < jSONArray.size(); i++) {
            if (a(jSONArray.get(i), jSONArray2.get(i), map)) {
                return true;
            }
        }
        return false;
    }

    private boolean a(Object obj, Object obj2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66e1fe69", new Object[]{this, obj, obj2, map})).booleanValue();
        }
        if ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) {
            return a((JSONObject) obj, (JSONObject) obj2, map);
        }
        if ((obj instanceof JSONArray) && (obj2 instanceof JSONArray)) {
            return a((JSONArray) obj, (JSONArray) obj2, map);
        }
        return !obj.equals(obj2);
    }
}
