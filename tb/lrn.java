package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.utils.lang3.ObjectUtils;
import com.taobao.infoflow.protocol.subservice.base.IJsBridgeService;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class lrn extends lrr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final lrg f30865a;

    static {
        kge.a(1170327376);
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IJsBridgeService.a
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "miniApp.getConfig";
    }

    public lrn(lrg lrgVar) {
        this.f30865a = lrgVar;
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IJsBridgeService.a
    public void a(JSONObject jSONObject, IJsBridgeService.a.InterfaceC0670a interfaceC0670a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1a8e84a", new Object[]{this, jSONObject, interfaceC0670a});
            return;
        }
        JSONObject a2 = lrp.a(this.f30865a.b());
        if (ObjectUtils.a(a2)) {
            ldf.d("MiniAppGetConfigFeature", "not found appConfig");
            interfaceC0670a.a("not found appConfig");
            return;
        }
        String jSONString = a2.toJSONString();
        HashMap hashMap = new HashMap(2);
        hashMap.put("data", jSONString);
        ldf.d("MiniAppGetConfigFeature", "appConfig : " + jSONString);
        interfaceC0670a.a(hashMap);
    }
}
