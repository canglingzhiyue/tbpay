package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerData;

/* loaded from: classes7.dex */
public abstract class ltp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ljs f30921a;

    static {
        kge.a(-1231371992);
    }

    public abstract JSONObject a(AwesomeGetContainerData awesomeGetContainerData, JSONObject jSONObject);

    public ltp(ljs ljsVar) {
        this.f30921a = ljsVar;
    }

    public ljs a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ljs) ipChange.ipc$dispatch("f075909", new Object[]{this}) : this.f30921a;
    }
}
