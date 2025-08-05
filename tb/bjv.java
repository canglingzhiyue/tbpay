package tb;

import com.alibaba.android.ultron.event.ext.a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class bjv extends bjx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-328764396);
    }

    @Override // tb.bjx
    public JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
        }
        if (!(jSONObject.get("alert") instanceof JSONObject)) {
            bkd.a(getClass().getSimpleName(), "buildCombineEvent", "EVENT_CHAIN_PARAMS_VALID_ERROR", "没有alert");
            return null;
        }
        JSONObject a2 = a.a(bkg.a(jSONObject));
        if (a2 == null) {
            bkd.a(getClass().getSimpleName(), "buildCombineEvent", "EVENT_CHAIN_PARAMS_VALID_ERROR", "构建alert事件失败");
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        bkg.a(jSONObject2, jSONObject);
        jSONObject2.remove("alert");
        a(a2, "confirm", "openUrlV2", jSONObject2);
        return a2;
    }
}
