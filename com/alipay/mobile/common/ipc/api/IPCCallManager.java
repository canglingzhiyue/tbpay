package com.alipay.mobile.common.ipc.api;

import com.alipay.mobile.common.ipc.api.aidl.IIPCManager;

/* loaded from: classes3.dex */
public interface IPCCallManager {
    <T> T getIpcProxy(Class<T> cls);

    void setIIPCManager(IIPCManager iIPCManager);

    void setIPCCallRetryHandler(IPCRetryHandler iPCRetryHandler);
}
