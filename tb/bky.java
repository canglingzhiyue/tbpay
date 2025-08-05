package tb;

import com.alibaba.android.ultron.ext.event.util.h;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class bky extends bkt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1072131080);
    }

    @Override // tb.bkt
    public JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", "shareV3");
        jSONObject2.put("fields", (Object) h.a(jSONObject));
        JSONObject jSONObject3 = new JSONObject();
        h.a(jSONObject3, h.a(jSONObject));
        a(jSONObject2, "onFinish", "refreshPageV3", jSONObject3);
        return jSONObject2;
    }
}
