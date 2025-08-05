package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetData;

/* loaded from: classes8.dex */
public class tig implements gke {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-438159488);
        kge.a(1464465151);
    }

    @Override // tb.gke
    public void a(JSONObject jSONObject, gkc gkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff35999", new Object[]{this, jSONObject, gkcVar});
            return;
        }
        e.e("RecmdPrefetchDataProcessAction", "executeActionWithParam");
        tif.a((AwesomeGetData) jSONObject.get("dataModel"));
    }
}
