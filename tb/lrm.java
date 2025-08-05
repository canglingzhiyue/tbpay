package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.base.IJsBridgeService;
import java.util.Map;

/* loaded from: classes.dex */
public class lrm extends lrr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final lrg f30864a;

    static {
        kge.a(1440613345);
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IJsBridgeService.a
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "HSharedData.updateData";
    }

    public lrm(lrg lrgVar) {
        this.f30864a = lrgVar;
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IJsBridgeService.a
    public void a(JSONObject jSONObject, IJsBridgeService.a.InterfaceC0670a interfaceC0670a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1a8e84a", new Object[]{this, jSONObject, interfaceC0670a});
        } else if (jSONObject == null) {
            interfaceC0670a.a("jsParams is empty");
            ldf.d("SharedDataUpdateDataFeature", "jsParams is empty");
        } else {
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            if (jSONObject2 == null || jSONObject2.isEmpty()) {
                interfaceC0670a.a("data is empty");
                ldf.d("SharedDataUpdateDataFeature", "executeFeature data is empty");
            } else if (this.f30864a.a(jSONObject2)) {
                interfaceC0670a.a((Map<String, Object>) null);
            } else {
                interfaceC0670a.a((String) null);
            }
        }
    }
}
