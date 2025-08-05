package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class lic {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1536090805);
    }

    public boolean a(JSONObject jSONObject, lib libVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("185ef157", new Object[]{this, jSONObject, libVar})).booleanValue() : libVar.a() != jSONObject;
    }
}
