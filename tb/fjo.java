package tb;

import android.content.Intent;
import android.os.Bundle;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes5.dex */
public class fjo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-376861351);
    }

    public static String a(Intent intent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f0dec1d1", new Object[]{intent, str});
        }
        if (intent == null) {
            return null;
        }
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Bundle a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("2604864c", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            if (entry != null) {
                bundle.putString(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        return bundle;
    }
}
