package com.taobao.themis.ability_taobao;

import android.app.Activity;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.base.a;
import com.taobao.themis.kernel.ability.base.annotation.APIMethod;
import com.taobao.themis.kernel.ability.base.annotation.BindingApiContext;
import com.taobao.themis.kernel.ability.base.annotation.BindingCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingParam;
import com.taobao.themis.kernel.ability.base.annotation.ThreadType;
import com.taobao.themis.kernel.executor.ExecutorType;
import tb.kge;
import tb.qrb;

/* loaded from: classes9.dex */
public class TMSTBBizBridge implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-174361398);
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

    @ThreadType(ExecutorType.NETWORK)
    @APIMethod
    public void getTBMessageInfo(@BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59b810a7", new Object[]{this, apiContext, bridgeCallback});
        } else if (apiContext == null || apiContext.a() == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
        } else if (bridgeCallback == null) {
        } else {
            bridgeCallback.sendJSONResponse(com.taobao.themis.ability.taobao.impl.b.a());
        }
    }

    @ThreadType(ExecutorType.NORMAL)
    @APIMethod
    public void addToDesktop(@BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback, @BindingParam(name = {"iconName"}) String str, @BindingParam(name = {"iconUrl"}) String str2, @BindingParam(name = {"targetUrl"}) String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d33ecd6", new Object[]{this, apiContext, bridgeCallback, str, str2, str3});
        } else if (apiContext == null || apiContext.a() == null || apiContext.c() == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
        } else {
            JSONObject jSONObject = new JSONObject();
            if (a(apiContext.a(), apiContext.c().h(), str, str2, str3)) {
                jSONObject.put("success", (Object) true);
            } else {
                jSONObject.put("success", (Object) false);
                jSONObject.put("errorMsg", "router proxy null");
            }
            bridgeCallback.sendJSONResponse(jSONObject);
        }
    }

    private boolean a(Activity activity, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("96bf6be6", new Object[]{this, activity, str, str2, str3, str4})).booleanValue();
        }
        qrb.a(activity, str, str2, str3, str4);
        return true;
    }
}
