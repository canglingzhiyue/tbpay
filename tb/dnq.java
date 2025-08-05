package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.adam.common.Util;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes4.dex */
public class dnq implements dnm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1479141473);
        kge.a(52393184);
    }

    @Override // tb.dnm
    public dnd a(dnc dncVar, DXEvent dXEvent, Object[] objArr, dmz dmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dnd) ipChange.ipc$dispatch("2f23671d", new Object[]{this, dncVar, dXEvent, objArr, dmzVar});
        }
        if (dmzVar == null || dmzVar.a() == null) {
            return dncVar.a(dXEvent, objArr, dmzVar);
        }
        DXRuntimeContext a2 = dmzVar.a();
        Map<String, Object> b = dmzVar.b();
        JSONObject jSONObject = (JSONObject) b.get("event_adam_config");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
            b.put("event_adam_config", jSONObject);
        }
        String[] strArr = (String[]) jSONObject.get("componentKeys");
        if (strArr == null || strArr.length <= 0) {
            return dnd.a();
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            JSONObject a3 = Util.a(str, a2);
            if (a3 != null) {
                arrayList.add(a3);
            }
        }
        b.put("templates", arrayList);
        return dncVar.a(dXEvent, objArr, dmzVar);
    }
}
