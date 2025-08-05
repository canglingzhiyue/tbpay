package tb;

import com.alibaba.android.ultron.event.ext.q;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class ias extends bjx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SUBSCRIBER_ID = "unionOrderOpV2";

    static {
        kge.a(-2131132209);
    }

    @Override // tb.bjx
    public JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
        }
        if (jSONObject == null || !(jSONObject.get(iar.FIELD_NEXT_EVENTS) instanceof JSONObject)) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", "mtopV2");
        jSONObject2.put("fields", (Object) bkg.a(jSONObject));
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(iar.FIELD_OLD_DATA, "@data{}");
        jSONObject3.put(iar.FIELD_NEXT_EVENTS, (Object) jSONObject.getJSONObject(iar.FIELD_NEXT_EVENTS));
        JSONObject a2 = a(jSONObject2, "success", iar.SUBSCRIBER_ID, jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put(q.FIELD_ULTRON_DATA, "@data{}");
        a(a2, "finish", "ultronPopV2", jSONObject4);
        return jSONObject2;
    }
}
