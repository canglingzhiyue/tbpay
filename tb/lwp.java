package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.exception.GatewayException;
import com.taobao.informationflowdataservice.dataservice.utils.baseutils.linklog.a;

/* loaded from: classes7.dex */
public class lwp implements gke {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private lwd f30951a;
    private lwz b;

    static {
        kge.a(2038046637);
        kge.a(1464465151);
    }

    public lwp(lwz lwzVar) throws GatewayException {
        if (lwzVar == null) {
            throw new GatewayException("dataServiceEngineContext should not be null");
        }
        this.b = lwzVar;
        this.f30951a = lwzVar.b();
    }

    @Override // tb.gke
    public void a(JSONObject jSONObject, gkc gkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff35999", new Object[]{this, jSONObject, gkcVar});
        } else if (jSONObject == null) {
        } else {
            a.a("umbrella.component.render", "gateway2.uiRefresh", "start action");
            String string = jSONObject.getString("containerId");
            Object obj = jSONObject.get("containerModel");
            if (!StringUtils.isEmpty(string) && obj != null) {
                a(string, this.f30951a, jSONObject);
            } else {
                a(jSONObject);
            }
        }
    }

    private void a(String str, lwd lwdVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58422e47", new Object[]{this, str, lwdVar, jSONObject});
            return;
        }
        lxg a2 = this.b.a(str);
        if (a2 == null) {
            return;
        }
        a2.c(lwdVar.a(str), jSONObject);
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        String[] a2 = lwi.a(jSONObject);
        if (a2 == null) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject(jSONObject);
        for (String str : a2) {
            jSONObject2.put("containerId", (Object) str);
            a(str, this.f30951a, jSONObject2);
        }
    }
}
