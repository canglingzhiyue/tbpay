package com.alipay.mobile.verifyidentity.data;

import com.alipay.mobileic.core.model.rpc.MICRpcResponse;

/* loaded from: classes3.dex */
public class DefaultModuleResult extends ModuleExecuteResult {
    public DefaultModuleResult(String str) {
        this.mMICRpcResponse = new MICRpcResponse();
        this.mMICRpcResponse.success = true;
        this.mMICRpcResponse.finish = true;
        if ("1003".equalsIgnoreCase(str) || "1000".equalsIgnoreCase(str)) {
            this.mMICRpcResponse.verifySuccess = true;
        }
        this.mMICRpcResponse.finishCode = str;
    }
}
