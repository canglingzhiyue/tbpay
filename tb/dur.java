package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.taobao.subservice.framework.dataservice.DosaContainerDataService;

/* loaded from: classes7.dex */
public class dur implements DosaContainerDataService.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.infoflow.taobao.subservice.framework.dataservice.DosaContainerDataService.b
    public boolean a(DosaContainerDataService.c cVar, String str, String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e71ac26", new Object[]{this, cVar, str, strArr, jSONObject})).booleanValue();
        }
        return false;
    }
}
