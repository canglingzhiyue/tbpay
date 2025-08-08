package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class dlh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_PARAMS = "params";
    public static final String KEY_TYPE = "type";
    public static final String KEY_VERSION = "version";

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f26831a;
    private final JSONObject b;

    static {
        kge.a(-618943159);
    }

    public dlh(String str, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject(2);
        jSONObject2.put("type", (Object) str);
        jSONObject2.put("params", (Object) jSONObject);
        this.b = jSONObject2;
        this.f26831a = jSONObject;
    }

    public dlh(JSONObject jSONObject) {
        this.b = jSONObject;
        this.f26831a = jSONObject.getJSONObject("params");
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.b.getString("version");
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b.getString("type");
    }

    public JSONObject a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("73d7af52", new Object[]{this, str}) : dmo.a(this.f26831a, str, (JSONObject) null);
    }

    public JSONArray b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("fe97466b", new Object[]{this, str}) : dmo.a(this.f26831a, str, (JSONArray) null);
    }

    public String c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b82f346c", new Object[]{this, str}) : dmo.a(this.f26831a, str, (String) null);
    }

    public int d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d23b17e8", new Object[]{this, str})).intValue() : dmo.a(this.f26831a, str, -1);
    }

    public Boolean e(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("738c2133", new Object[]{this, str}) : Boolean.valueOf(dmo.a(this.f26831a, str, false));
    }

    public Object f(String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("cac6299b", new Object[]{this, str});
        }
        if (!StringUtils.isEmpty(str) && (jSONObject = this.f26831a) != null) {
            try {
                if (!jSONObject.containsKey(str)) {
                    return null;
                }
                return this.f26831a.get(str);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return null;
    }

    public JSONObject c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[]{this}) : this.f26831a;
    }

    public JSONObject d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("ab96f20b", new Object[]{this}) : this.b;
    }
}
