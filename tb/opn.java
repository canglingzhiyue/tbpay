package tb;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.j;
import com.taobao.android.tschedule.parser.a;

/* loaded from: classes.dex */
public class opn implements a.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2060041224);
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
        return String.valueOf(a(intent));
    }

    private boolean a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8033c29", new Object[]{this, intent})).booleanValue();
        }
        if (!j.a("enableAfterBuyPreLoadOptimize", true)) {
            lap.a("recmdPrefetch", "OrderListRecmdPrefetchParser", "orange开关为关");
            return false;
        }
        String a2 = ops.a(intent.getData());
        if (TextUtils.isEmpty(a2)) {
            lap.a("recmdPrefetch", "OrderListRecmdPrefetchParser", "没有解析到对应的tab");
            return false;
        }
        int b = ops.b(a2);
        JSONObject a3 = ops.a(b);
        if (a3 == null || a3.isEmpty()) {
            lap.a("recmdPrefetch", "OrderListRecmdPrefetchParser", "recmdConfig == null || recmdConfig.isEmpty()");
            return false;
        }
        String string = a3.getString("optimizeType");
        if ("tschedule".equals(string) || "tscheduleAndInstantOpen".equals(string)) {
            return b <= a3.getIntValue("orderNumThreshold");
        }
        lap.a("recmdPrefetch", "OrderListRecmdPrefetchParser", "没有服务端开关");
        return false;
    }
}
