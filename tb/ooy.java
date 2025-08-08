package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.exception.GatewayException;
import com.taobao.android.home.component.utils.e;
import com.taobao.tao.homepage.d;
import com.taobao.tao.recommend3.gateway.msgcenter.RecmdContainerMsg;

/* loaded from: classes8.dex */
public class ooy implements gke {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ope f32246a;

    static {
        kge.a(770800946);
        kge.a(1464465151);
    }

    public ooy(ope opeVar) throws GatewayException {
        if (opeVar == null) {
            throw new GatewayException("RarecmdGatewayDataSource should not be null");
        }
        this.f32246a = opeVar;
    }

    @Override // tb.gke
    public void a(JSONObject jSONObject, gkc gkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff35999", new Object[]{this, jSONObject, gkcVar});
        } else if (jSONObject == null || StringUtils.equals("download", jSONObject.getString("dataSourceType"))) {
        } else {
            jSONObject.put("_msgType", "scrollToTop");
            d.c(this.f32246a.a()).a(RecmdContainerMsg.getMessage(jSONObject));
            e.c("gateway2.scrollToTop", "end action");
        }
    }
}
