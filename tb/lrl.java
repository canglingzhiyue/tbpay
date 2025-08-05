package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.base.IJsBridgeService;
import java.util.HashMap;

/* loaded from: classes.dex */
public class lrl extends lrr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final lrg f30863a;

    static {
        kge.a(322281655);
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IJsBridgeService.a
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "HSharedData.getPassParams";
    }

    public lrl(lrg lrgVar) {
        this.f30863a = lrgVar;
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IJsBridgeService.a
    public void a(JSONObject jSONObject, IJsBridgeService.a.InterfaceC0670a interfaceC0670a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1a8e84a", new Object[]{this, jSONObject, interfaceC0670a});
        } else if (jSONObject == null) {
            interfaceC0670a.a("jsParams is empty");
            ldf.d("ShareDataGetPassParams", "jsParams is empty");
        } else {
            JSONObject c = this.f30863a.c();
            HashMap hashMap = new HashMap(1);
            hashMap.put("data", c);
            interfaceC0670a.a(hashMap);
        }
    }
}
