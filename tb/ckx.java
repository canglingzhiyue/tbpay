package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ckx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private static ckw a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ckw) ipChange.ipc$dispatch("7c6deee5", new Object[]{str});
        }
        try {
            if (cjw.a(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            return new ckw(jSONObject.optString("apdid"), jSONObject.optString("deviceInfoHash"), jSONObject.optString("timestamp"), jSONObject.optString("tid"), jSONObject.optString("utdid"));
        } catch (Exception e) {
            ckn.a(e);
            return null;
        }
    }

    public static synchronized void a(Context context) {
        synchronized (ckx.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            } else {
                clf.a(context, "vkeyid_profiles_v4", "key_deviceid_v4", "");
            }
        }
    }

    public static synchronized void a(Context context, ckw ckwVar) {
        synchronized (ckx.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("75b51f61", new Object[]{context, ckwVar});
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("apdid", ckwVar.f26340a);
                jSONObject.put("deviceInfoHash", ckwVar.b);
                jSONObject.put("timestamp", ckwVar.c);
                jSONObject.put("tid", ckwVar.d);
                jSONObject.put("utdid", ckwVar.e);
                clf.a(context, "vkeyid_profiles_v4", "key_deviceid_v4", jSONObject.toString());
            } catch (Exception e) {
                ckn.a(e);
            }
        }
    }

    public static synchronized ckw b(Context context) {
        synchronized (ckx.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ckw) ipChange.ipc$dispatch("4869ba78", new Object[]{context});
            }
            return a(clf.a(context, "vkeyid_profiles_v4", "key_deviceid_v4"));
        }
    }

    public static synchronized ckw c(Context context) {
        synchronized (ckx.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ckw) ipChange.ipc$dispatch("5c118df9", new Object[]{context});
            }
            String a2 = clf.a(context, "vkeyid_profiles_v4", "key_deviceid_v4");
            if (cjw.a(a2)) {
                return null;
            }
            return a(a2);
        }
    }
}
