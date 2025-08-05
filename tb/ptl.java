package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class ptl extends qpj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1595800260);
    }

    public ptl(JSONObject jSONObject, plc plcVar) {
        super(jSONObject, plcVar);
        a(jSONObject, plcVar);
    }

    private void a(JSONObject jSONObject, plc plcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f5d0eb1", new Object[]{this, jSONObject, plcVar});
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("children");
        if (jSONArray == null) {
            return;
        }
        int size = jSONArray.size();
        for (int i = 0; i < size; i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            if (jSONObject2 != null) {
                a(new qms(jSONObject2, plcVar));
            }
        }
    }
}
