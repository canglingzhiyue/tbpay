package com.taobao.themis.ability.basic;

import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
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
import tb.qop;

/* loaded from: classes9.dex */
public class TMSDialogBridge implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1101772463);
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

    @ThreadType(ExecutorType.UI)
    @APIMethod
    public void alert(@BindingApiContext ApiContext apiContext, @BindingParam(name = {"title"}) String str, @BindingParam(name = {"message"}) String str2, @BindingParam(name = {"button"}) String str3, @BindingParam(name = {"align"}) String str4, @BindingParam(name = {"confirmColor"}) String str5, @BindingParam(name = {"cancelColor"}) String str6, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7c5d9e0", new Object[]{this, apiContext, str, str2, str3, str4, str5, str6, bridgeCallback});
        } else if (apiContext == null || apiContext.a() == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
        } else {
            qop.a(apiContext.a(), str, str2, str3, str4, str5, str6, bridgeCallback);
        }
    }

    @ThreadType(ExecutorType.UI)
    @APIMethod
    public void confirm(@BindingApiContext ApiContext apiContext, @BindingParam(name = {"title"}) String str, @BindingParam(name = {"message"}) String str2, @BindingParam(name = {"okButton"}) String str3, @BindingParam(name = {"cancelButton"}) String str4, @BindingParam(name = {"align"}) String str5, @BindingParam(name = {"confirmColor"}) String str6, @BindingParam(name = {"cancelColor"}) String str7, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1d5edf2", new Object[]{this, apiContext, str, str2, str3, str4, str5, str6, str7, bridgeCallback});
        } else if (apiContext == null || apiContext.a() == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
        } else {
            qop.a(apiContext.a(), str, str2, str3, str4, str5, str6, str7, bridgeCallback);
        }
    }

    @ThreadType(ExecutorType.UI)
    @APIMethod
    public void prompt(@BindingApiContext ApiContext apiContext, @BindingParam(name = {"title"}) String str, @BindingParam(name = {"message"}) String str2, @BindingParam(name = {"okButton"}) String str3, @BindingParam(name = {"cancelButton"}) String str4, @BindingParam(name = {"placeholder"}) String str5, @BindingParam(name = {"confirmColor"}) String str6, @BindingParam(name = {"cancelColor"}) String str7, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de6080ce", new Object[]{this, apiContext, str, str2, str3, str4, str5, str6, str7, bridgeCallback});
        } else if (apiContext == null || apiContext.a() == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
        } else {
            qop.b(apiContext.a(), str, str2, str3, str4, str5, str6, str7, bridgeCallback);
        }
    }
}
