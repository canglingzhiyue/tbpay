package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.base.IJsBridgeService;
import java.util.HashMap;

/* loaded from: classes.dex */
public class lrk extends lrr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final lrg f30862a;

    static {
        kge.a(-619420119);
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IJsBridgeService.a
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "HSharedData.findSmartContentInfo";
    }

    public lrk(lrg lrgVar) {
        this.f30862a = lrgVar;
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IJsBridgeService.a
    public void a(JSONObject jSONObject, IJsBridgeService.a.InterfaceC0670a interfaceC0670a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1a8e84a", new Object[]{this, jSONObject, interfaceC0670a});
        } else if (!ovr.a()) {
            ldf.d("ShareDataFindSmartContentInfoFeature", "非新架构，功能不可用");
            interfaceC0670a.a("-1");
        } else if (jSONObject == null) {
            ldf.d("ShareDataFindSmartContentInfoFeature", "jsParams is empty");
            interfaceC0670a.a("-4");
        } else {
            String string = jSONObject.getString("sectionBizCode");
            if (StringUtils.isEmpty(string)) {
                ldf.d("ShareDataFindSmartContentInfoFeature", "sectionBizCode is empty");
                interfaceC0670a.a("-4");
                return;
            }
            String string2 = jSONObject.getString("domain");
            if (StringUtils.isEmpty(string2)) {
                ldf.d("ShareDataFindSmartContentInfoFeature", "domain is empty");
                interfaceC0670a.a("-4");
                return;
            }
            String string3 = jSONObject.getString("id");
            if (StringUtils.isEmpty(string3)) {
                ldf.d("ShareDataFindSmartContentInfoFeature", "id is empty");
                interfaceC0670a.a("-4");
            } else if (this.f30862a.a(string) == null) {
                ldf.d("ShareDataFindSmartContentInfoFeature", "shareData为查找到卡片");
                interfaceC0670a.a("-2");
            } else {
                JSONObject a2 = this.f30862a.a(string, string2, string3);
                if (a2 != null) {
                    HashMap hashMap = new HashMap(1);
                    hashMap.put("data", a2);
                    interfaceC0670a.a(hashMap);
                    return;
                }
                ldf.d("ShareDataFindSmartContentInfoFeature", "shareData为查找到卡片");
                interfaceC0670a.a("-3");
            }
        }
    }
}
