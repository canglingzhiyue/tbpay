package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class jqf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1888563478);
    }

    public static boolean a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("266fb8c", new Object[]{jSONObject})).booleanValue();
        }
        if (jSONObject == null) {
            return false;
        }
        try {
            Boolean bool = jSONObject.getBoolean("enableDelta");
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63b9982b", new Object[]{jSONObject})).booleanValue();
        }
        if (jSONObject == null) {
            return false;
        }
        try {
            return jSONObject.getBoolean("enableGlobalMerge").booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }
}
