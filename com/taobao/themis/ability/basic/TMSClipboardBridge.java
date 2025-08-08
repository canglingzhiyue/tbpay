package com.taobao.themis.ability.basic;

import android.app.Application;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.a;
import com.taobao.themis.kernel.ability.base.annotation.APIMethod;
import com.taobao.themis.kernel.ability.base.annotation.BindingCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingParam;
import com.taobao.themis.kernel.ability.base.annotation.ThreadType;
import com.taobao.themis.kernel.adapter.IEnvironmentService;
import com.taobao.themis.kernel.executor.ExecutorType;
import tb.kge;
import tb.qoo;
import tb.qpt;

/* loaded from: classes9.dex */
public class TMSClipboardBridge implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-785439679);
        kge.a(-86622547);
    }

    @Override // com.taobao.themis.kernel.ability.base.a
    public void onFinalized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1b9dee", new Object[]{this});
        }
    }

    @Override // com.taobao.themis.kernel.ability.base.a
    public void onInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f2f17c", new Object[]{this});
        }
    }

    @ThreadType(ExecutorType.IO)
    @APIMethod
    public void setClipboard(@BindingParam({"text"}) String str, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca3883b7", new Object[]{this, str, bridgeCallback});
        } else if (StringUtils.isEmpty(str)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
        } else {
            Application applicationContext = ((IEnvironmentService) qpt.a(IEnvironmentService.class)).getApplicationContext();
            if (applicationContext == null) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
                return;
            }
            qoo.a(applicationContext, str);
            bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
        }
    }

    @ThreadType(ExecutorType.IO)
    @APIMethod
    public void getClipboard(@BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bf76af5", new Object[]{this, bridgeCallback});
            return;
        }
        Application applicationContext = ((IEnvironmentService) qpt.a(IEnvironmentService.class)).getApplicationContext();
        if (applicationContext == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
            return;
        }
        String a2 = qoo.a(applicationContext);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("text", (Object) a2);
        bridgeCallback.sendBridgeResponse(new BridgeResponse(jSONObject));
    }
}
