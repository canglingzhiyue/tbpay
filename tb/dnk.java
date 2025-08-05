package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.adam.common.b;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.tao.log.TLog;

/* loaded from: classes4.dex */
public class dnk implements dnm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-865567232);
        kge.a(52393184);
    }

    @Override // tb.dnm
    public dnd a(dnc dncVar, DXEvent dXEvent, Object[] objArr, dmz dmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dnd) ipChange.ipc$dispatch("2f23671d", new Object[]{this, dncVar, dXEvent, objArr, dmzVar});
        }
        if (dmzVar == null || dmzVar.a() == null) {
            return dnd.a();
        }
        if (dmzVar.b() != null && dmzVar.b().get("event_adam_config") != null) {
            JSONObject jSONObject = (JSONObject) dmzVar.b().get("event_adam_config");
            if (jSONObject != null && "false".equals(jSONObject.get("readCurTemplate"))) {
                return dncVar.a(dXEvent, objArr, dmzVar);
            }
            JSONObject jSONObject2 = (JSONObject) dmzVar.b().get("global_adam_config");
            if (jSONObject2 != null && !Boolean.parseBoolean(jSONObject2.getString("readCurTemplate")) && (jSONObject == null || "false".equals(jSONObject.get("readCurTemplate")))) {
                return dncVar.a(dXEvent, objArr, dmzVar);
            }
        }
        if (b.a(dXEvent, dmzVar.a(), objArr)) {
            TLog.logi(null, "LOG_ADAM", "handle evChain by current template, eventName = " + objArr[0]);
            return dnd.b();
        }
        return dncVar.a(dXEvent, objArr, dmzVar);
    }
}
