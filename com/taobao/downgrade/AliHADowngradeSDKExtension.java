package com.taobao.downgrade;

import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kkr;

/* loaded from: classes7.dex */
public class AliHADowngradeSDKExtension implements BridgeExtension {
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
    public void getDowngradeInfo(@BindingParam(name = {"bizName"}) String str, @BindingParam(name = {"isTest"}) boolean z, @BindingCallback BridgeCallback bridgeCallback) {
        Map<String, String> traceMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d91637c6", new Object[]{this, str, new Boolean(z), bridgeCallback});
            return;
        }
        Downgrade.isTest = z;
        DowngradeStrategy downgradeStrategy = Downgrade.getInstance().getDowngradeStrategy(str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(kkr.TACTICS_FUNCTION, (Object) downgradeStrategy.getTacticsFunction());
            jSONObject.put(kkr.TACTICS_PERFORMANCE, (Object) downgradeStrategy.getTacticsPerformance());
        } catch (Throwable unused) {
        }
        JSONObject param = downgradeStrategy.getParam();
        if (param != null && param.size() > 0) {
            jSONObject.put("param", JSON.toJSON(param));
        }
        if (Downgrade.isTest && (traceMap = downgradeStrategy.getTraceMap()) != null) {
            jSONObject.put("extraInfo", JSON.toJSON(traceMap));
        }
        bridgeCallback.sendJSONResponse(jSONObject);
    }
}
