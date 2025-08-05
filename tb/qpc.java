package tb;

import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.register.b;
import com.taobao.themis.kernel.basic.TMSLogger;

/* loaded from: classes9.dex */
public class qpc extends qpb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1700570675);
    }

    public qpc(b bVar) {
        super(bVar);
    }

    @Override // tb.qpa
    public Object a(ApiContext apiContext, Object[] objArr, qox qoxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a905d430", new Object[]{this, apiContext, objArr, qoxVar});
        }
        Object a2 = this.f33007a.a(apiContext, objArr, qoxVar);
        if (this.d.e) {
            TMSLogger.b("CallbackMiddleware", "generate auto callback for method:" + this.d.c.getName());
            qoz qozVar = new qoz(qoxVar, false);
            if (a2 == null || (a2 instanceof BridgeResponse)) {
                qozVar.sendBridgeResponse((BridgeResponse) a2);
            } else if (a2 instanceof JSONObject) {
                qozVar.sendJSONResponse((JSONObject) a2);
            } else {
                TMSLogger.d("CallbackMiddleware", "return type not recognized:" + a2.getClass().getName());
                new qoz(qoxVar, false).sendBridgeResponse(new BridgeResponse.Error(2, "method " + this.d.c.getName() + " return type not recognized " + a2.getClass().getName()));
            }
        }
        return a2;
    }
}
