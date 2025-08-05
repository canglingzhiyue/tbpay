package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class gkh implements gke {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f28364a = "value";
    public final String b = "_default";

    static {
        kge.a(1905042614);
        kge.a(1464465151);
    }

    @Override // tb.gke
    public void a(JSONObject jSONObject, gkc gkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff35999", new Object[]{this, jSONObject, gkcVar});
            return;
        }
        Object obj = jSONObject != null ? jSONObject.get("value") : null;
        String obj2 = (obj == null || !(obj instanceof String)) ? "_default" : obj.toString();
        if (gkcVar == null) {
            return;
        }
        gkcVar.a(obj2, jSONObject, null);
    }
}
