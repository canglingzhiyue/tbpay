package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.ace.model.JsonRpcRequest;
import com.taobao.android.searchbaseframe.ace.model.JsonRpcResponse;

/* loaded from: classes6.dex */
public class ina extends imy<JsonRpcRequest, JsonRpcResponse> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1800087176);
    }

    @Override // tb.imy
    public /* synthetic */ String b(JsonRpcRequest jsonRpcRequest) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4fac8049", new Object[]{this, jsonRpcRequest}) : a(jsonRpcRequest);
    }

    public ina(imr<JsonRpcRequest, JsonRpcResponse> imrVar) {
        super(imrVar);
    }

    public String a(JsonRpcRequest jsonRpcRequest) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b52c1699", new Object[]{this, jsonRpcRequest}) : JSON.toJSONString(jsonRpcRequest);
    }
}
