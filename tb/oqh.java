package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetContainerParams;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetRequestParams;

/* loaded from: classes.dex */
public class oqh implements ktx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f32288a = "";
    private final AwesomeGetRequestParams b;

    static {
        kge.a(380793732);
        kge.a(1692916670);
    }

    @Override // tb.ktx
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "lastClickItemId";
    }

    public oqh(AwesomeGetRequestParams awesomeGetRequestParams) {
        this.b = awesomeGetRequestParams;
    }

    @Override // tb.ktx
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : a(this.b);
    }

    private String a(AwesomeGetRequestParams awesomeGetRequestParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("25bf600", new Object[]{this, awesomeGetRequestParams});
        }
        AwesomeGetContainerParams awesomeGetContainerParams = awesomeGetRequestParams.containerParams.get(oqc.a().m());
        if (awesomeGetContainerParams == null) {
            return this.f32288a;
        }
        JSONObject jSONObject = awesomeGetContainerParams.bizParams;
        if (jSONObject != null && jSONObject.containsKey("itemId")) {
            this.f32288a = jSONObject.getString("itemId");
        }
        return this.f32288a;
    }
}
