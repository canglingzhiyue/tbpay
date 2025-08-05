package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public final class bbf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1681095937);
    }

    public static boolean a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("266fb8c", new Object[]{jSONObject})).booleanValue();
        }
        if (jSONObject.get("data") == null || (jSONObject2 = jSONObject.getJSONObject("hierarchy")) == null) {
            return false;
        }
        return (jSONObject2.get("structure") == null && jSONObject2.get("delta") == null) ? false : true;
    }
}
