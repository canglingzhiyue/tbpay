package com.alibaba.triver.cannal_engine.scene;

import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.cannal_engine.widgetInfo.TRWidgetInfoGetter;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public class WidgetInfoBridgeExtension implements BridgeExtension {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(3183668);
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

    @ThreadType(ExecutorType.NETWORK)
    @ActionFilter
    public void requestWidgetInfos(@BindingParam(name = {"params"}) JSONObject jSONObject, @BindingCallback final BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7562cd65", new Object[]{this, jSONObject, bridgeCallback});
        } else {
            ((TRWidgetInfoGetter) RVProxy.get(TRWidgetInfoGetter.class)).request(jSONObject, true, new TRWidgetInfoGetter.a() { // from class: com.alibaba.triver.cannal_engine.scene.WidgetInfoBridgeExtension.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.triver.cannal_engine.widgetInfo.TRWidgetInfoGetter.a
                public void a(JSONArray jSONArray) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ad9ea590", new Object[]{this, jSONArray});
                    } else {
                        bridgeCallback.sendBridgeResponse(BridgeResponse.newValue("result", jSONArray));
                    }
                }

                @Override // com.alibaba.triver.cannal_engine.widgetInfo.TRWidgetInfoGetter.a
                public void a(String str, String str2, String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
                    } else {
                        bridgeCallback.sendBridgeResponse(BridgeResponse.newError(3, str2));
                    }
                }
            });
        }
    }
}
