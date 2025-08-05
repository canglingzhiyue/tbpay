package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.datastructure.GatewayActionInfo;
import com.taobao.android.gateway.datastructure.b;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class gjy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(890482390);
    }

    public static void a(List<b> list, gjz gjzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69ef8372", new Object[]{list, gjzVar});
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (b bVar : list) {
                if (bVar != null) {
                    arrayList.add(bVar.b());
                }
            }
            TLog.logd("gateway2-GatewayEventPipeline.triggerEvents", TextUtils.join(",", arrayList));
        }
        d(c(b(list, gjzVar), gjzVar), gjzVar);
    }

    private static List<GatewayActionInfo> b(List<b> list, gjz gjzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b52125f4", new Object[]{list, gjzVar});
        }
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            for (b bVar : list) {
                List<GatewayActionInfo> a2 = gjx.a(bVar, gjzVar);
                if (a2 != null && a2.size() > 0) {
                    arrayList.addAll(a2);
                }
            }
        }
        return arrayList;
    }

    private static List<GatewayActionInfo> c(List<GatewayActionInfo> list, gjz gjzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("780d8f53", new Object[]{list, gjzVar});
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        for (GatewayActionInfo gatewayActionInfo : list) {
            b triggerEvent = gatewayActionInfo.getTriggerEvent();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("eventParam", (Object) a(triggerEvent));
            jSONObject.put("callbackParam", (Object) triggerEvent.a());
            gka.a(gatewayActionInfo.getActionParam(), jSONObject, gjzVar);
        }
        return list;
    }

    private static JSONObject a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("eff5f019", new Object[]{bVar});
        }
        if (bVar == null) {
            return null;
        }
        while (bVar.d() != null) {
            bVar = bVar.d();
        }
        return bVar.a();
    }

    private static void d(List<GatewayActionInfo> list, gjz gjzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5df30f5", new Object[]{list, gjzVar});
        } else if (list != null && !list.isEmpty()) {
            for (GatewayActionInfo gatewayActionInfo : list) {
                gjw.a(gatewayActionInfo, gjzVar);
            }
        }
    }
}
