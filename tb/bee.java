package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class bee {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1625440337);
    }

    public static String a(JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7f883384", new Object[]{jSONObject, str, str2});
        }
        String string = jSONObject.getString(str);
        return string == null ? str2 : string;
    }

    public static Long a(JSONObject jSONObject, String str, Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("b3b71d64", new Object[]{jSONObject, str, l});
        }
        Long l2 = jSONObject.getLong(str);
        return l2 == null ? l : l2;
    }

    public static Boolean a(JSONObject jSONObject, String str, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("a6d93f78", new Object[]{jSONObject, str, bool});
        }
        Boolean bool2 = jSONObject.getBoolean(str);
        return bool2 == null ? bool : bool2;
    }
}
