package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.datastructure.GatewayActionInfo;
import com.taobao.android.gateway.datastructure.b;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class gjx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1517712749);
    }

    public static List<GatewayActionInfo> a(b bVar, gjz gjzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("805ae8f5", new Object[]{bVar, gjzVar});
        }
        TLog.logd("gateway2-gateway.triggerEvents", bVar != null ? bVar.b() : "");
        List<gki> a2 = gjzVar.c().a(bVar);
        ArrayList arrayList = new ArrayList();
        if (a2 != null && a2.size() > 0) {
            for (gki gkiVar : a2) {
                GatewayActionInfo a3 = gkiVar.a();
                if (gkiVar != null) {
                    arrayList.add(a3);
                }
            }
        }
        return arrayList;
    }
}
