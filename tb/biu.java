package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.bip;

/* loaded from: classes2.dex */
public class biu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(295053354);
    }

    public static jnw a(Context context, JSONObject jSONObject, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jnw) ipChange.ipc$dispatch("bcdfdc9e", new Object[]{context, jSONObject, map});
        }
        if (jSONObject != null && jSONObject.containsKey(bip.a.e)) {
            return new jnw(context).a(jSONObject.getString(bip.a.e)).b(jSONObject.getString(bip.a.f)).a(map).d(jSONObject.getString(bip.a.g)).a(false);
        }
        return null;
    }
}
