package tb;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.management.a;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;

/* loaded from: classes2.dex */
public class abk {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static BroadcastReceiver c;

    static {
        kge.a(1584841945);
    }

    public static void b(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0b29db5", new Object[]{str, context});
        } else if (!"mytaobao".equals(str)) {
        } else {
            jqg.b("UltronPageDestroy", "mytaobao");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("context", (Object) ((Application) context.getApplicationContext()));
            a.a().a(UltronTradeHybridStage.ON_CONTAINER_DESTROY, "mytaobao", jSONObject);
            BroadcastReceiver broadcastReceiver = c;
            if (broadcastReceiver == null) {
                return;
            }
            LoginBroadcastHelper.unregisterLoginReceiver(context, broadcastReceiver);
            c = null;
        }
    }
}
