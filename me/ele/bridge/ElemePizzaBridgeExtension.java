package me.ele.bridge;

import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingApiContext;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.engine.api.bridge.model.ApiContext;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes9.dex */
public class ElemePizzaBridgeExtension implements BridgeExtension {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alibaba.ariver.kernel.api.extension.Extension
    public void onFinalized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1b9dee", new Object[]{this});
        }
    }

    @Override // com.alibaba.ariver.kernel.api.extension.Extension
    public void onInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f2f17c", new Object[]{this});
        }
    }

    @Override // com.alibaba.ariver.kernel.api.security.Guard
    public Permission permit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Permission) ipChange.ipc$dispatch("edbd77f9", new Object[]{this});
        }
        return null;
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void sendPizza(@BindingNode(Page.class) Page page, @BindingApiContext ApiContext apiContext, @BindingParam({"api"}) String str, @BindingParam({"method"}) String str2, @BindingParam({"query"}) JSONObject jSONObject, @BindingParam({"param"}) JSONObject jSONObject2, @BindingParam({"upload"}) JSONObject jSONObject3, @BindingParam({"timeout"}) int i, @BindingParam({"ext_headers"}) JSONObject jSONObject4, @BindingParam({"location"}) JSONObject jSONObject5, @BindingParam({"xShardInfo"}) String str3, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd31e4f1", new Object[]{this, page, apiContext, str, str2, jSONObject, jSONObject2, jSONObject3, new Integer(i), jSONObject4, jSONObject5, str3, bridgeCallback});
        } else {
            BundleRemoteInitializer.sendPizza(apiContext.getActivity().getApplication(), page, apiContext, str, str2, jSONObject, jSONObject2, jSONObject3, i, jSONObject4, jSONObject5, str3, bridgeCallback);
        }
    }
}
