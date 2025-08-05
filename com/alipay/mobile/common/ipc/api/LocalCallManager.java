package com.alipay.mobile.common.ipc.api;

import com.alipay.mobile.common.ipc.api.aidl.IPCParameter;
import com.alipay.mobile.common.ipc.api.aidl.IPCResult;

/* loaded from: classes3.dex */
public interface LocalCallManager {
    IPCResult call(IPCParameter iPCParameter);

    void setLocalCallRetryHandler(LocalCallRetryHandler localCallRetryHandler);
}
