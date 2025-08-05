package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.adam.common.a;

/* loaded from: classes2.dex */
public class bkc implements bkl<JSONObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(348685113);
        kge.a(-1237682449);
    }

    @Override // tb.bkl
    public Object a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("abaf35f4", new Object[]{this, str, jSONObject}) : a.a(str, jSONObject);
    }
}
