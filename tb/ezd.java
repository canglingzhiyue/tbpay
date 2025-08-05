package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes4.dex */
public class ezd extends ezg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-259616966);
    }

    public ezd(JSONObject jSONObject, ezo ezoVar) {
        super(jSONObject, ezoVar);
        b(jSONObject, ezoVar);
    }

    private void b(JSONObject jSONObject, ezo ezoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6da0afd", new Object[]{this, jSONObject, ezoVar});
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("items");
        if (jSONArray == null) {
            return;
        }
        int size = jSONArray.size();
        for (int i = 0; i < size; i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            if (jSONObject2 != null) {
                a(new ezc(jSONObject2, ezoVar));
            }
        }
    }

    public List<ezc> h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("b7e2e578", new Object[]{this}) : m();
    }

    public String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this}) : this.f27665a.getString("locatorId");
    }
}
