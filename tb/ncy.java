package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.taobao.subservice.framework.dataservice.DosaContainerDataService;

/* loaded from: classes7.dex */
public class ncy implements DosaContainerDataService.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_API_INFO = "apiInfo";
    public static final String KEY_API_NAME = "apiName";
    public static final String KEY_API_VERSION = "apiVersion";

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f31364a = new JSONObject();

    public ncy() {
        this.f31364a.put("apiName", (Object) "mtop.ovs.guide.page.dosa.taote.get");
        this.f31364a.put("apiVersion", (Object) "1.0");
    }

    @Override // com.taobao.infoflow.taobao.subservice.framework.dataservice.DosaContainerDataService.b
    public boolean a(DosaContainerDataService.c cVar, String str, String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e71ac26", new Object[]{this, cVar, str, strArr, jSONObject})).booleanValue();
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put("apiInfo", (Object) this.f31364a);
        return cVar.a(str, strArr, jSONObject);
    }
}
