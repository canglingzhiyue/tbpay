package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class cky {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static ckz a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ckz) ipChange.ipc$dispatch("34c1e754", new Object[]{context});
        }
        if (context == null) {
            return null;
        }
        String a2 = clf.a(context, "device_feature_prefs_name", "device_feature_prefs_key");
        if (cjw.a(a2)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(a2);
            ckz ckzVar = new ckz();
            ckzVar.f26341a = jSONObject.getString("imei");
            ckzVar.b = jSONObject.getString("imsi");
            ckzVar.c = jSONObject.getString("mac");
            ckzVar.d = jSONObject.getString("bluetoothmac");
            ckzVar.e = jSONObject.getString("gsi");
            return ckzVar;
        } catch (Exception e) {
            ckn.a(e);
            return null;
        }
    }
}
