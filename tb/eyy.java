package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.service.event.AURAEventKey;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.a;
import com.taobao.android.detail.ttdetail.utils.am;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes4.dex */
public class eyy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_EVENTS = "events";
    public static final String KEY_FIELDS = "fields";
    public static final String KEY_TYPE = "type";

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f27665a;
    public String b;
    public String c;
    public JSONObject d;
    public Map<String, List<a>> e;
    public ezg f;
    public String m;
    public String o;

    static {
        kge.a(-1712067115);
    }

    public eyy(JSONObject jSONObject) {
        this(jSONObject, null);
    }

    public eyy(JSONObject jSONObject, ezo ezoVar) {
        a(jSONObject);
        a(jSONObject, ezoVar);
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        this.f27665a = jSONObject;
        this.b = jSONObject.getString("id");
        if (TextUtils.isEmpty(this.b)) {
            this.b = UUID.randomUUID().toString();
        }
        this.c = jSONObject.getString("type");
        this.m = jSONObject.getString("_parent_");
        this.o = jSONObject.getString("_ultron_name_");
        this.d = jSONObject.getJSONObject("fields");
    }

    public void a(JSONObject jSONObject, ezo ezoVar) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d627d5e", new Object[]{this, jSONObject, ezoVar});
        } else if (ezoVar != null && (jSONObject2 = jSONObject.getJSONObject("events")) != null) {
            for (String str : jSONObject2.keySet()) {
                JSONArray jSONArray = jSONObject2.getJSONArray(str);
                if (jSONArray != null) {
                    int size = jSONArray.size();
                    for (int i = 0; i < size; i++) {
                        JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                        if (jSONObject3 != null) {
                            a(str, ezoVar.a(jSONObject3));
                        }
                    }
                }
            }
        }
    }

    public <T extends ezg> T a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("f04650c", new Object[]{this}) : (T) this.f;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.c;
    }

    public String o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b4719ea", new Object[]{this}) : this.m;
    }

    public String r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9ed849c7", new Object[]{this}) : this.o;
    }

    public JSONObject d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("ab96f20b", new Object[]{this}) : this.d;
    }

    public JSONObject e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("bf3ec58c", new Object[]{this}) : this.f27665a;
    }

    public Map<String, List<a>> f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a4689162", new Object[]{this}) : this.e;
    }

    public List<a> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d0410f19", new Object[]{this});
        }
        Map<String, List<a>> map = this.e;
        if (map != null) {
            return map.get(AURAEventKey.exposureItem);
        }
        return null;
    }

    public List<a> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("287b5bd5", new Object[]{this, str});
        }
        Map<String, List<a>> map = this.e;
        if (map != null && str != null) {
            return map.get(str);
        }
        return null;
    }

    public boolean a(String str, a... aVarArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a2bb5e2", new Object[]{this, str, aVarArr})).booleanValue();
        }
        if (str == null || aVarArr == null) {
            return false;
        }
        if (this.e == null) {
            this.e = new HashMap();
        }
        List<a> list = this.e.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.e.put(str, list);
        }
        list.addAll(am.a(aVarArr));
        return true;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ComponentData{id='" + this.b + "', type='" + this.c + "'}";
    }
}
