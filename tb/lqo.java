package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class lqo implements IContainerDataService.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public kyu f30837a;

    static {
        kge.a(1667818537);
        kge.a(-153391203);
    }

    public lqo(kyu kyuVar) {
        this.f30837a = kyuVar;
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
    public Map<String, String> a(lli lliVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("add74dce", new Object[]{this, lliVar, str});
        }
        JSONObject jSONObject = new JSONObject();
        this.f30837a.c().a(str, jSONObject);
        HashMap hashMap = new HashMap();
        for (String str2 : jSONObject.keySet()) {
            hashMap.put(str2, jSONObject.getString(str2));
        }
        return hashMap;
    }
}
