package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class ift extends sra {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1690741681);
    }

    @Override // tb.sra
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "iCart";
    }

    @Override // tb.sra
    public void a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        JSONObject jSONObject4;
        JSONObject jSONObject5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33c6a37e", new Object[]{this, str, jSONObject, jSONObject2, jSONObject3});
        } else if (!"submit_1".equals(str) || (jSONObject4 = jSONObject2.getJSONObject("fields")) == null) {
        } else {
            Iterator<String> it = jSONObject4.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next.startsWith("_")) {
                    it.remove();
                } else if ("isHideCalculateBtn".equalsIgnoreCase(next)) {
                    it.remove();
                } else if ("pay".equals(next) && (jSONObject5 = jSONObject4.getJSONObject("pay")) != null) {
                    jSONObject5.remove(bei.KEY_DISCOUNT_TIPS);
                }
            }
        }
    }
}
