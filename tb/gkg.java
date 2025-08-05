package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class gkg implements gke {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f28363a = "value";
    public final String b = "_default";

    static {
        kge.a(1290047311);
        kge.a(1464465151);
    }

    @Override // tb.gke
    public void a(JSONObject jSONObject, gkc gkcVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff35999", new Object[]{this, jSONObject, gkcVar});
            return;
        }
        Object obj = jSONObject != null ? jSONObject.get("value") : null;
        if (obj == null || !(obj instanceof Boolean)) {
            str = "_default";
        } else {
            str = ((Boolean) obj).booleanValue() ? "true" : "false";
        }
        if (gkcVar == null) {
            return;
        }
        gkcVar.a(str, jSONObject, null);
    }
}
