package tb;

import com.alibaba.android.ultron.engine.protocol.Hierarchy;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class bjn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1807387820);
    }

    public static Hierarchy a(bjp bjpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Hierarchy) ipChange.ipc$dispatch("69bbc3c4", new Object[]{bjpVar});
        }
        Hierarchy hierarchy = new Hierarchy();
        if (bjpVar.c()) {
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry<String, bjg> entry : bjpVar.d().c().entrySet()) {
                jSONArray.add(entry.getValue().a());
            }
            hierarchy.delta = jSONArray;
            return hierarchy;
        }
        bjh a2 = bjpVar.a();
        hierarchy.root = a2.g();
        JSONObject jSONObject = new JSONObject();
        a(jSONObject, a2);
        hierarchy.structure = jSONObject;
        return hierarchy;
    }

    private static void a(JSONObject jSONObject, bjh bjhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75f4cd8", new Object[]{jSONObject, bjhVar});
            return;
        }
        List<bjh> k = bjhVar.k();
        if (k == null || k.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (bjh bjhVar2 : k) {
            arrayList.add(bjhVar2.g());
            a(jSONObject, bjhVar2);
        }
        jSONObject.put(bjhVar.g(), (Object) arrayList);
    }
}
