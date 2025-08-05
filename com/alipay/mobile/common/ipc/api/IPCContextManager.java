package com.alipay.mobile.common.ipc.api;

import android.content.Context;
import com.alipay.mobile.common.ipc.api.aidl.IIPCManager;

/* loaded from: classes3.dex */
public interface IPCContextManager {
    IPCCallManager getIpcCallManager();

    LocalCallManager getLocalCallManager();

    ServiceBeanManager getServiceBeanManager();

    void init(Context context, IIPCManager iIPCManager);

    void resetIIPCManager();
}
