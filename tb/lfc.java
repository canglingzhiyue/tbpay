package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class lfc extends ezg {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<eyy> g;

    static {
        kge.a(20109085);
    }

    public lfc(JSONObject jSONObject, ezo ezoVar) {
        super(jSONObject, ezoVar);
        this.g = new ArrayList();
        b(jSONObject, ezoVar);
    }

    private void b(JSONObject jSONObject, ezo ezoVar) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6da0afd", new Object[]{this, jSONObject, ezoVar});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        if (jSONObject2 == null || (jSONArray = jSONObject2.getJSONArray("DetailItemPit")) == null || jSONArray.isEmpty()) {
            return;
        }
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject3 = jSONArray.getJSONObject(i);
            if (jSONObject3 != null) {
                this.g.add(new eyy(jSONObject3, ezoVar));
            }
        }
    }

    public List<eyy> h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("b7e2e578", new Object[]{this}) : this.g;
    }
}
