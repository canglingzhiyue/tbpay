package tb;

import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.qoy;

/* loaded from: classes9.dex */
public class qoz implements BridgeCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public qox f33006a;
    public boolean b;

    static {
        kge.a(1133477222);
        kge.a(-1724227419);
    }

    public qoz(qox qoxVar, boolean z) {
        this.f33006a = qoxVar;
        this.b = z;
    }

    @Override // com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback
    public void sendJSONResponse(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56830cbc", new Object[]{this, jSONObject, new Boolean(z)});
        } else if (this.f33006a == null) {
        } else {
            this.f33006a.a(new qoy(true, jSONObject), z);
        }
    }

    @Override // com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback
    public void sendJSONResponse(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3456c918", new Object[]{this, jSONObject});
        } else if (this.f33006a == null) {
        } else {
            this.f33006a.a(new qoy(true, jSONObject), this.b);
        }
    }

    @Override // com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback
    public void sendBridgeResponse(BridgeResponse bridgeResponse) {
        qoy qoyVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa9dfe87", new Object[]{this, bridgeResponse});
        } else if (this.f33006a == null) {
        } else {
            if (bridgeResponse == null) {
                qoyVar = new qoy(true, new JSONObject());
            } else if (bridgeResponse instanceof BridgeResponse.Error) {
                BridgeResponse.Error error = (BridgeResponse.Error) bridgeResponse;
                qoyVar = new qoy.a(error.getErrorCode() + "", error.getErrorMessage(), error.getSignature());
            } else {
                qoyVar = new qoy(true, bridgeResponse.get());
            }
            this.f33006a.a(qoyVar, this.b);
        }
    }
}
