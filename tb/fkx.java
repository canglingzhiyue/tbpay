package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class fkx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_REFRESH_TRANS_STATE = "transState";

    /* renamed from: a  reason: collision with root package name */
    public String f28022a;
    public String b;
    public String c;
    public JSONObject d;

    static {
        kge.a(-1401542215);
    }

    public fkx(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.f28022a = jSONObject.getString("newParams");
        this.b = jSONObject.getString("isSjjsd");
        this.c = jSONObject.getString("tabIndex");
        try {
            this.d = jSONObject.getJSONObject(KEY_REFRESH_TRANS_STATE);
        } catch (Exception e) {
            fjt.a("RefreshParam", "get transState fail:" + e);
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : (this.f28022a == null || this.b == null) ? false : true;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject = this.d;
        return jSONObject != null && !jSONObject.isEmpty();
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : !"N".equals(this.b);
    }

    public Map<String, String> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("913cde0", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("newParams", this.f28022a);
        hashMap.put("isSjjsd", this.b);
        hashMap.put("tabIndex", this.c);
        return hashMap;
    }
}
