package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class elw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f27424a = "AliSDetailUltronProtocolModel";
    private JSONObject b;

    static {
        kge.a(1175735300);
    }

    public elw(JSONObject jSONObject) {
        this.b = jSONObject;
        emu.a("com.taobao.android.detail.core.standard.model.AliSDetailUltronProtocolModel");
    }

    public JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this});
        }
        JSONObject jSONObject = this.b;
        if (jSONObject != null) {
            return jSONObject.getJSONObject("hierarchy");
        }
        return null;
    }

    public JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[]{this});
        }
        JSONObject a2 = a();
        if (a2 != null) {
            return a2.getJSONObject("structure");
        }
        return null;
    }

    public JSONArray a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("e47bc7cc", new Object[]{this, str});
        }
        try {
            return b().getJSONArray(str);
        } catch (Exception e) {
            arc.a().c("AliSDetailUltronProtocolModel", "getHierarchyStructureOfComponentKey exception", e.getMessage());
            return null;
        }
    }

    public JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[]{this});
        }
        JSONObject jSONObject = this.b;
        if (jSONObject != null) {
            return jSONObject.getJSONObject("global");
        }
        return null;
    }

    public JSONObject d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ab96f20b", new Object[]{this});
        }
        JSONObject c = c();
        if (c != null) {
            return c.getJSONObject("data");
        }
        return null;
    }

    public JSONObject e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bf3ec58c", new Object[]{this});
        }
        JSONObject d = d();
        if (d != null) {
            return d.getJSONObject("feature");
        }
        return null;
    }

    public String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        JSONObject e = e();
        if (e == null) {
            return null;
        }
        try {
            return e.getString(str);
        } catch (Exception e2) {
            arc.a().c("AliSDetailUltronProtocolModel", "getGlobalDataFeatureOfKey exception", e2.getMessage());
            return null;
        }
    }
}
