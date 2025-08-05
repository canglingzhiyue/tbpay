package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.datamodel.imp.b;

/* loaded from: classes6.dex */
public class joy extends jov {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1917374718);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "insert";
    }

    @Override // tb.jov
    public void a(b bVar, JSONObject jSONObject, JSONObject jSONObject2, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ee2b290", new Object[]{this, bVar, jSONObject, jSONObject2, str, str2, str3});
        } else {
            bVar.a(str, str2, str3);
        }
    }
}
