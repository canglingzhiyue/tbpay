package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetContainerParams;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetRequestParams;

/* loaded from: classes7.dex */
public class kuf implements ktx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final AwesomeGetRequestParams f30324a;

    static {
        kge.a(-106130810);
        kge.a(1692916670);
    }

    @Override // tb.ktx
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : kue.FILTER_KEY;
    }

    public kuf(AwesomeGetRequestParams awesomeGetRequestParams) {
        this.f30324a = awesomeGetRequestParams;
    }

    @Override // tb.ktx
    public String a() {
        AwesomeGetContainerParams awesomeGetContainerParams;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        AwesomeGetRequestParams awesomeGetRequestParams = this.f30324a;
        if (awesomeGetRequestParams != null && (awesomeGetContainerParams = awesomeGetRequestParams.containerParams.get(oqc.a().m())) != null && (jSONObject = awesomeGetContainerParams.bizParams) != null && jSONObject.containsKey(kue.FILTER_KEY)) {
            return jSONObject.getString(kue.FILTER_KEY);
        }
        return null;
    }
}
