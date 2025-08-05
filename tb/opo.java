package tb;

import android.content.Context;
import android.content.Intent;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.j;
import com.taobao.android.tschedule.parser.a;

/* loaded from: classes.dex */
public class opo implements a.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1732569621);
        kge.a(-1129696407);
    }

    @Override // com.taobao.android.tschedule.parser.a.b
    public String b(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5273f964", new Object[]{this, context, intent});
        }
        if (intent == null) {
            return String.valueOf(false);
        }
        return String.valueOf(a());
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (!j.a("paySuccessTscheduleEnable", true)) {
            lap.a("recmdPrefetch", "PaySuccessRecmdPrefetchParser", "orange开关是关的");
            return false;
        }
        JSONObject a2 = oqb.a(ksk.REC_PAY_SUCCESS.f30287a);
        JSONObject jSONObject = a2 == null ? null : a2.getJSONObject(ops.OPTIMIZATION_CONFIG);
        if (jSONObject == null || jSONObject.isEmpty()) {
            lap.a("recmdPrefetch", "PaySuccessRecmdPrefetchParser", "recmdConfig == null || recmdConfig.isEmpty()");
            return false;
        }
        return opr.OPTIMIZE_TYPE_PS_T_SCHEDULE.equals(jSONObject.getString("recmdRequestOptimizeType"));
    }
}
