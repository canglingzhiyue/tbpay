package tb;

import com.alibaba.android.ultron.event.ext.q;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class bka extends bjx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(931993550);
    }

    @Override // tb.bjx
    public JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", "mtopV2");
        jSONObject2.put("fields", (Object) bkg.a(jSONObject));
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(q.FIELD_ULTRON_DATA, "@data{}");
        a(jSONObject2, "success", "ultronPopV2", jSONObject3);
        return jSONObject2;
    }
}
