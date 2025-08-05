package tb;

import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.android.umf.datamodel.service.rule.a;
import com.alibaba.android.umf.node.service.data.rule.RuleType;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.arc;

/* loaded from: classes2.dex */
public class avd extends avc {
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
        kge.a(-956200042);
    }

    public static /* synthetic */ Object ipc$super(avd avdVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.avc
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : RuleType.GROUP_SELECT;
    }

    @Override // tb.avc
    public Map<String, Component> a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ef66eb32", new Object[]{this, aVar});
        }
        Map<String, Object> map = aVar.c.f2137a;
        Map<String, Object> map2 = aVar.d.f2137a;
        String str = (String) bbc.a(map, "clickId", String.class, null);
        JSONObject jSONObject = (JSONObject) bbc.a(map2, "group", JSONObject.class, null);
        if (jSONObject == null || str == null) {
            arc.a a2 = arc.a.a();
            arc.a a3 = a2.b("GroupSelectRule").a("errorCode", "-3000_EMPTY_GROUP_OR_ID");
            if (map == null) {
                map = "";
            }
            arc.a a4 = a3.a("inputFields", map);
            if (map2 == null) {
                map2 = "";
            }
            a4.a("originFields", map2);
            arc.a().b("GroupSelectRule规则不合法，group或者id是空", a2.b());
            return null;
        }
        JSONArray a5 = a(jSONObject, str);
        if (a5 == null) {
            arc.a a6 = arc.a.a();
            a6.b("GroupSelectRule").a("errorCode", "-3001_EMPTY_IDS");
            arc.a().b("GroupSelectRule规则生成的ids为空", a6.b());
            return null;
        }
        jSONObject.put("selectedId", (Object) a5);
        Component component = new Component();
        component.fields = map2;
        HashMap hashMap = new HashMap();
        hashMap.put(aVar.b, component);
        return hashMap;
    }

    private JSONArray a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("9bc1dcac", new Object[]{this, jSONObject, str});
        }
        JSONArray jSONArray = jSONObject.getJSONArray("selectedId");
        if (jSONArray == null) {
            jSONArray = new JSONArray();
        }
        int intValue = jSONObject.getInteger("min").intValue();
        int intValue2 = jSONObject.getInteger("max").intValue();
        if (jSONArray.contains(str)) {
            a(jSONArray, str, intValue);
        } else {
            b(jSONArray, str, intValue2);
        }
        return jSONArray;
    }

    private void a(JSONArray jSONArray, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1b652e9", new Object[]{this, jSONArray, str, new Integer(i)});
        } else if (jSONArray.size() <= i) {
        } else {
            jSONArray.remove(str);
        }
    }

    private void b(JSONArray jSONArray, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2eca5c8", new Object[]{this, jSONArray, str, new Integer(i)});
        } else if (jSONArray.size() < i) {
            jSONArray.add(str);
        } else if (i != 1) {
        } else {
            jSONArray.clear();
            jSONArray.add(str);
        }
    }
}
