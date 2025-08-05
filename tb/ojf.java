package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.a;
import com.taobao.tao.homepage.d;

/* loaded from: classes.dex */
public class ojf implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1400283380);
        kge.a(-1789185574);
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.a
    public JSONObject getCurrentPageParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("58f7263f", new Object[]{this}) : d.a().d();
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.a
    public JSONObject getCurrentUTParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("83ce92ef", new Object[]{this}) : d.a().e();
    }
}
