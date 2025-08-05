package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.datastructure.GatewayActionInfo;
import com.taobao.android.gateway.datastructure.b;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class gjw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1657195759);
    }

    public static void a(final GatewayActionInfo gatewayActionInfo, final gjz gjzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aad086c", new Object[]{gatewayActionInfo, gjzVar});
            return;
        }
        String str = "";
        String a2 = gatewayActionInfo != null ? gatewayActionInfo.getTargetComponent() != null ? gatewayActionInfo.getTargetComponent().a() : "null" : str;
        if (gatewayActionInfo != null) {
            str = gatewayActionInfo.getActionName() + "," + a2;
        }
        TLog.logd("gateway2-GatewayActionExecutor.executeActionWithInfo", str);
        gke a3 = gjzVar.b().a(gatewayActionInfo.getActionName());
        if (a3 == null) {
            return;
        }
        a3.a(gatewayActionInfo.getActionParam(), new gkc() { // from class: tb.gjw.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.gkc
            public void a(String str2, JSONObject jSONObject, gkf gkfVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b4fda22c", new Object[]{this, str2, jSONObject, gkfVar});
                    return;
                }
                b bVar = new b(str2, GatewayActionInfo.this.getTargetComponent(), jSONObject, (gkfVar == null || !gkfVar.f28362a) ? GatewayActionInfo.this.getCallbackConfig().getJSONArray(str2) : null, GatewayActionInfo.this.getTriggerEvent());
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(bVar);
                gjy.a(arrayList, gjzVar);
            }
        });
    }
}
