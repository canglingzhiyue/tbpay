package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ckr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static Map<String, String> a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4d84e95", new Object[]{context});
        }
        ckc a2 = ckc.a();
        HashMap hashMap = new HashMap();
        ckz a3 = cky.a(context);
        String a4 = a2.a(context);
        String b = a2.b(context);
        String k = a2.k(context);
        String m = a2.m(context);
        if (a3 != null) {
            if (cjw.a(a4)) {
                a4 = cjw.d(a3.f26341a);
            }
            if (cjw.a(b)) {
                b = cjw.d(a3.b);
            }
            if (cjw.a(k)) {
                k = cjw.d(a3.c);
            }
            if (cjw.a(m)) {
                m = cjw.d(a3.e);
            }
        }
        ckz ckzVar = new ckz(a4, b, k, "", m);
        if (context != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("imei", cjw.d(ckzVar.f26341a));
                jSONObject.put("imsi", cjw.d(ckzVar.b));
                jSONObject.put("mac", cjw.d(ckzVar.c));
                jSONObject.put("bluetoothmac", cjw.d(ckzVar.d));
                jSONObject.put("gsi", cjw.d(ckzVar.e));
                clf.a(context, "device_feature_prefs_name", "device_feature_prefs_key", jSONObject.toString());
            } catch (Exception e) {
                ckn.a(e);
            }
        }
        Map<String, String> j = ckc.j();
        hashMap.put("AD1", a4);
        hashMap.put("AD2", b);
        hashMap.put("AD3", ckc.f(context));
        hashMap.put("AD5", ckc.h(context));
        hashMap.put("AD6", ckc.i(context));
        hashMap.put("AD7", ckc.j(context));
        hashMap.put("AD8", k);
        hashMap.put("AD9", a2.l(context));
        hashMap.put("AD10", m);
        hashMap.put("AD11", ckc.c());
        hashMap.put("AD12", a2.d());
        String e2 = ckc.e();
        if (cjw.a(e2)) {
            e2 = ckc.f();
        }
        hashMap.put("AD13", e2);
        hashMap.put("AD14", ckc.h());
        hashMap.put("AD15", ckc.i());
        hashMap.put("AD16", j.get("sdcard"));
        hashMap.put("AD17", "");
        hashMap.put("AD19", ckc.n(context));
        hashMap.put("AD20", ckc.k());
        hashMap.put("AD22", "");
        hashMap.put("AD23", ckc.p(context));
        hashMap.put("AD24", cjw.g(ckc.g(context)));
        hashMap.put("AD26", a2.e(context));
        hashMap.put("AD27", ckc.p());
        hashMap.put("AD28", ckc.r());
        hashMap.put("AD29", ckc.t());
        hashMap.put("AD30", ckc.q());
        hashMap.put("AD31", ckc.s());
        hashMap.put("AD32", ckc.n());
        hashMap.put("AD33", ckc.o());
        hashMap.put("AD34", ckc.r(context));
        hashMap.put("AD35", ckc.s(context));
        hashMap.put("AD36", ckc.q(context));
        hashMap.put("AD37", ckc.m());
        hashMap.put("AD38", ckc.l());
        hashMap.put("AD39", ckc.c(context));
        hashMap.put("AD40", ckc.d(context));
        hashMap.put("AD41", ckc.b());
        hashMap.put("AD42", j.get("sdcardavailable"));
        hashMap.put("AL3", a2.o(context));
        return hashMap;
    }
}
