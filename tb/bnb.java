package tb;

import com.alibaba.android.ultron.trade.event.d;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class bnb extends d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MESSAGE = "message";

    static {
        kge.a(967024090);
    }

    @Override // com.alibaba.android.ultron.trade.event.d
    public void b(bmz bmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
            return;
        }
        JSONObject fields = b().getFields();
        if (fields == null) {
            return;
        }
        this.f.y().p().t().a(fields.getString("target"), fields);
    }
}
