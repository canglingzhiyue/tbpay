package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.datamodel.imp.b;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class joz extends jov {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, sra> f29668a;

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "merge";
    }

    static {
        kge.a(-1532461839);
        f29668a = null;
    }

    public static void a(sra sraVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff45cdb6", new Object[]{sraVar});
            return;
        }
        if (f29668a == null) {
            f29668a = new HashMap();
        }
        f29668a.put(sraVar.a(), sraVar);
    }

    @Override // tb.jov
    public void a(b bVar, JSONObject jSONObject, JSONObject jSONObject2, String str, String str2, String str3) {
        JSONObject o;
        JSONObject jSONObject3;
        sra sraVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ee2b290", new Object[]{this, bVar, jSONObject, jSONObject2, str, str2, str3});
            return;
        }
        JSONObject jSONObject4 = jSONObject.getJSONObject("data");
        if (jSONObject4 == null) {
            return;
        }
        Object remove = jSONObject4.remove(str);
        if (!(remove instanceof JSONObject) || (o = bVar.o()) == null || (jSONObject3 = o.getJSONObject(str)) == null) {
            return;
        }
        JSONObject jSONObject5 = (JSONObject) remove;
        Map<String, sra> map = f29668a;
        if (map != null && (sraVar = map.get(bVar.h())) != null) {
            sraVar.a(str, jSONObject, jSONObject3, jSONObject5);
        }
        jot.a(jSONObject5, jSONObject3);
    }
}
