package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.a;

/* loaded from: classes5.dex */
public class xja implements ezo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-172667389);
        kge.a(-143293925);
    }

    @Override // tb.ezo
    public a a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("a7e4c289", new Object[]{this, jSONObject});
        }
        if (xix.a(jSONObject) != null) {
            return new a(xix.a(jSONObject));
        }
        return null;
    }
}
