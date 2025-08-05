package com.alipay.mobile.common.ipc.biz;

import com.alipay.mobile.common.ipc.api.LocalCallManager;
import com.alipay.mobile.common.ipc.api.aidl.IIPCCallBack;
import com.alipay.mobile.common.ipc.api.aidl.IPCParameter;
import com.alipay.mobile.common.ipc.api.aidl.IPCResult;

/* loaded from: classes3.dex */
public class IPCCallBackService extends IIPCCallBack.Stub {
    private LocalCallManager localCallManager;

    @Override // com.alipay.mobile.common.ipc.api.aidl.IIPCCallBack
    public IPCResult call(IPCParameter iPCParameter) {
        return this.localCallManager.call(iPCParameter);
    }

    public void setLocalCallManager(LocalCallManager localCallManager) {
        this.localCallManager = localCallManager;
    }
}
