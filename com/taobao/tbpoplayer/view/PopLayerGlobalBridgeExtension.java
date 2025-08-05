package com.taobao.tbpoplayer.view;

import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingApiContext;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingRequest;
import com.alibaba.ariver.engine.api.bridge.model.ApiContext;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.AutoCallback;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class PopLayerGlobalBridgeExtension implements BridgeExtension {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1853874889);
        kge.a(1806634212);
    }

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

    @ThreadType(ExecutorType.NORMAL)
    @ActionFilter
    @AutoCallback
    public BridgeResponse popRecordDisplay(@BindingRequest JSONObject jSONObject, @BindingNode(Page.class) Page page, @BindingNode(App.class) App app, @BindingApiContext ApiContext apiContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BridgeResponse) ipChange.ipc$dispatch("ab00b498", new Object[]{this, jSONObject, page, app, apiContext}) : BridgeResponse.SUCCESS;
    }

    @ThreadType(ExecutorType.NORMAL)
    @ActionFilter
    @AutoCallback
    public BridgeResponse popRecordUserBehavior(@BindingRequest JSONObject jSONObject, @BindingNode(Page.class) Page page, @BindingNode(App.class) App app, @BindingApiContext ApiContext apiContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BridgeResponse) ipChange.ipc$dispatch("26dca339", new Object[]{this, jSONObject, page, app, apiContext}) : BridgeResponse.SUCCESS;
    }

    @ThreadType(ExecutorType.NORMAL)
    @ActionFilter
    @AutoCallback
    public BridgeResponse popRecordClose(@BindingRequest JSONObject jSONObject, @BindingNode(Page.class) Page page, @BindingNode(App.class) App app, @BindingApiContext ApiContext apiContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BridgeResponse) ipChange.ipc$dispatch("b4696e22", new Object[]{this, jSONObject, page, app, apiContext}) : BridgeResponse.SUCCESS;
    }
}
