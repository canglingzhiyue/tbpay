package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public abstract class ova {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String b;
    public JSONObject c;
    public int d;
    public boolean e;

    static {
        kge.a(1725867079);
    }

    public abstract String a();

    public abstract String dG_();

    public ova(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.c = jSONObject.getJSONObject("data");
        JSONObject jSONObject2 = this.c;
        if (jSONObject2 == null) {
            return;
        }
        this.b = jSONObject2.getString("dimension");
    }
}
