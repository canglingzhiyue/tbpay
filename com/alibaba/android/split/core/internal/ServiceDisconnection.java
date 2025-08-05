package com.alibaba.android.split.core.internal;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public final class ServiceDisconnection extends AbstractTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ServiceConnectionImpl mServiceConnection;

    static {
        kge.a(-1028002609);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : "ServiceDisconnection{}";
    }

    public ServiceDisconnection(ServiceConnectionImpl serviceConnectionImpl) {
        this.mServiceConnection = serviceConnectionImpl;
    }

    @Override // com.alibaba.android.split.core.internal.AbstractTask
    public final void execute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
            return;
        }
        ServiceManager.unlinkToDeath(this.mServiceConnection.mServiceManager);
        ServiceManager.setIInterface(this.mServiceConnection.mServiceManager, null);
        ServiceManager.setBinding(this.mServiceConnection.mServiceManager);
    }
}
