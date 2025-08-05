package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class cku {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private static ckv a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ckv) ipChange.ipc$dispatch("7c6deec6", new Object[]{str});
        }
        try {
            if (cjw.a(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            return new ckv(jSONObject.optString("apdid"), jSONObject.optString("deviceInfoHash"), jSONObject.optString("timestamp"));
        } catch (Exception e) {
            ckn.a(e);
            return null;
        }
    }

    public static synchronized void a(Context context) {
        synchronized (cku.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            } else {
                clf.a(context, "vkeyid_profiles_v3", "deviceid", "");
            }
        }
    }

    public static synchronized void a(Context context, ckv ckvVar) {
        synchronized (cku.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("75b4ab02", new Object[]{context, ckvVar});
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("apdid", ckvVar.f26339a);
                jSONObject.put("deviceInfoHash", ckvVar.b);
                jSONObject.put("timestamp", ckvVar.c);
                clf.a(context, "vkeyid_profiles_v3", "deviceid", jSONObject.toString());
            } catch (Exception e) {
                ckn.a(e);
            }
        }
    }

    public static synchronized ckv b(Context context) {
        synchronized (cku.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ckv) ipChange.ipc$dispatch("4869ba59", new Object[]{context});
            }
            return a(clf.a(context, "vkeyid_profiles_v3", "deviceid"));
        }
    }

    public static synchronized ckv c(Context context) {
        synchronized (cku.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ckv) ipChange.ipc$dispatch("5c118dda", new Object[]{context});
            }
            String a2 = clf.a(context, "vkeyid_profiles_v3", "deviceid");
            if (cjw.a(a2)) {
                return null;
            }
            return a(a2);
        }
    }
}
