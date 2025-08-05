package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class eut {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("266fb8c", new Object[]{jSONObject})).booleanValue() : jSONObject == null || !jSONObject.containsKey("dependency") || (jSONObject.get("dependency") != null && (!(jSONObject.get("dependency") instanceof String) || !TextUtils.isEmpty((String) jSONObject.get("dependency"))));
    }
}
