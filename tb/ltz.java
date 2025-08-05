package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerData;

/* loaded from: classes7.dex */
public class ltz extends ltp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1442481204);
    }

    public ltz(ljs ljsVar) {
        super(ljsVar);
    }

    @Override // tb.ltp
    public JSONObject a(AwesomeGetContainerData awesomeGetContainerData, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("ee76f892", new Object[]{this, awesomeGetContainerData, jSONObject}) : new JSONObject();
    }
}
