package tb;

import com.alibaba.android.ultron.ext.event.a;
import com.alibaba.android.ultron.ext.event.util.c;
import com.alibaba.android.ultron.ext.event.util.h;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class bks extends bkt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-639824876);
    }

    @Override // tb.bkt
    public JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
        }
        if (!(jSONObject.get("alert") instanceof JSONObject)) {
            c.a(getClass().getSimpleName(), "buildCombineEvent", "EVENT_CHAIN_PARAMS_VALID_ERROR", "没有alert");
            return null;
        }
        JSONObject a2 = a.a(h.a(jSONObject));
        if (a2 == null) {
            c.a(getClass().getSimpleName(), "buildCombineEvent", "EVENT_CHAIN_PARAMS_VALID_ERROR", "构建alert事件失败");
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        h.a(jSONObject2, jSONObject);
        jSONObject2.remove("alert");
        a(a2, "confirm", "openUrlV3", jSONObject2);
        return a2;
    }
}
