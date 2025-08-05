package tb;

import com.alibaba.android.aura.datamodel.nextrpc.a;
import com.alibaba.android.aura.q;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class dss {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(435917004);
    }

    public static boolean a(q qVar, a aVar) {
        com.taobao.android.buy.internal.a aVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4df911bb", new Object[]{qVar, aVar})).booleanValue();
        }
        if (qVar == null) {
            return false;
        }
        JSONObject a2 = a(aVar);
        if (bau.a(a2) || (aVar2 = (com.taobao.android.buy.internal.a) qVar.a(com.taobao.android.buy.internal.a.class.getSimpleName(), com.taobao.android.buy.internal.a.class)) == null) {
            return false;
        }
        aVar2.a(a2);
        return true;
    }

    private static JSONObject a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f62cdee", new Object[]{aVar});
        }
        JSONObject f = aVar.f();
        if (bau.a(f)) {
            return null;
        }
        JSONObject jSONObject = f.getJSONObject("data");
        if (bau.a(jSONObject) || !bbf.a(jSONObject)) {
            return null;
        }
        return jSONObject;
    }
}
