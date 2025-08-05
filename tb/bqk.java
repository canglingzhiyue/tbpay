package tb;

import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.android.umf.datamodel.service.rule.a;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class bqk extends bqj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_CLICK_ID = "clickId";
    public static final String KEY_DISABLE = "disable";
    public static final String KEY_FORCE = "force";
    public static final String KEY_GROUP = "group";
    public static final String KEY_ID = "id";
    public static final String KEY_ITEMS = "items";
    public static final String KEY_NODE = "none";
    public static final String KEY_OPTIONAL = "optional";
    public static final String kEY_MAX = "max";
    public static final String kEY_MIN = "min";
    public static final String kEY_SELECTED_ID = "selectedId";

    static {
        kge.a(1699197083);
    }

    public static /* synthetic */ Object ipc$super(bqk bqkVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.bqj
    public Map<String, Component> a(a aVar, bqi bqiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3134f9e8", new Object[]{this, aVar, bqiVar});
        }
        Map<String, Object> map = aVar.c.f2137a;
        Map<String, Object> map2 = aVar.d.f2137a;
        String str = (String) bbc.a(map, "clickId", String.class, null);
        JSONObject jSONObject = (JSONObject) bbc.a(map2, "group", JSONObject.class, null);
        if (jSONObject == null || str == null) {
            a(1, "-3000_EMPTY_GROUP_OR_ID", "GroupSelectRule规则不合法，group或者id是空");
            return null;
        }
        JSONArray a2 = a(jSONObject, str, bqiVar);
        if (a2 == null) {
            a(1, "-3001_EMPTY_IDS", "GroupSelectRule规则生成的ids为空");
            return null;
        }
        jSONObject.put("selectedId", (Object) a2);
        Component component = new Component();
        component.fields = map2;
        HashMap hashMap = new HashMap();
        hashMap.put(aVar.b, component);
        return hashMap;
    }

    private JSONArray a(JSONObject jSONObject, String str, bqi bqiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("e5b55b6", new Object[]{this, jSONObject, str, bqiVar});
        }
        JSONArray jSONArray = jSONObject.getJSONArray("selectedId");
        if (jSONArray == null) {
            return null;
        }
        int intValue = jSONObject.getInteger("min").intValue();
        int intValue2 = jSONObject.getInteger("max").intValue();
        if (jSONArray.contains(str)) {
            a(jSONArray, str, intValue, bqiVar);
        } else {
            b(jSONArray, str, intValue2, bqiVar);
        }
        return jSONArray;
    }

    private void a(JSONArray jSONArray, String str, int i, bqi bqiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7b8cc1f", new Object[]{this, jSONArray, str, new Integer(i), bqiVar});
        } else if (jSONArray.size() > i) {
            jSONArray.remove(str);
        } else if (bqiVar == null) {
        } else {
            String.valueOf(i);
        }
    }

    private void b(JSONArray jSONArray, String str, int i, bqi bqiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2619cffe", new Object[]{this, jSONArray, str, new Integer(i), bqiVar});
        } else if (jSONArray.size() < i) {
            jSONArray.add(str);
        } else if (i == 1) {
            jSONArray.clear();
            jSONArray.add(str);
        } else if (bqiVar == null) {
        } else {
            String.valueOf(i);
        }
    }
}
