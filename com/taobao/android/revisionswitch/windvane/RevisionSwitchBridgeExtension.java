package com.taobao.android.revisionswitch.windvane;

import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;

/* loaded from: classes6.dex */
public class RevisionSwitchBridgeExtension implements BridgeExtension {
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

    @ThreadType(ExecutorType.NORMAL)
    @ActionFilter
    public void getTBRevisionSwitchValue(@BindingParam(name = {"key"}) String str, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7d0ac6d", new Object[]{this, str, bridgeCallback});
            return;
        }
        boolean a2 = TBRevisionSwitchManager.i().a(str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("value", (Object) Boolean.valueOf(a2));
        } catch (Throwable unused) {
        }
        bridgeCallback.sendJSONResponse(jSONObject);
    }

    @ThreadType(ExecutorType.NORMAL)
    @ActionFilter
    public void getTBRevisionBucket(@BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8343a62c", new Object[]{this, bridgeCallback});
            return;
        }
        String h = TBRevisionSwitchManager.i().h();
        if (h == null) {
            h = "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("bucket", (Object) h);
        } catch (Throwable unused) {
        }
        bridgeCallback.sendJSONResponse(jSONObject);
    }

    @ThreadType(ExecutorType.NORMAL)
    @ActionFilter
    public void getSimpleSwitchValue(@BindingParam(name = {"key"}) String str, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f848a0d6", new Object[]{this, str, bridgeCallback});
            return;
        }
        boolean a2 = TBRevisionSwitchManager.i().a(str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("value", (Object) Boolean.valueOf(a2));
        } catch (Throwable unused) {
        }
        bridgeCallback.sendJSONResponse(jSONObject);
    }
}
