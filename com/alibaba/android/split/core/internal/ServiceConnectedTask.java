package com.alibaba.android.split.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public final class ServiceConnectedTask extends AbstractTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private IBinder iBinder;
    private ServiceConnectionImpl serviceConnection;

    static {
        kge.a(-1793281263);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : "ServiceConnectedTask{}";
    }

    public ServiceConnectedTask(ServiceConnectionImpl serviceConnectionImpl, IBinder iBinder) {
        this.serviceConnection = serviceConnectionImpl;
        this.iBinder = iBinder;
    }

    @Override // com.alibaba.android.split.core.internal.AbstractTask
    public final void execute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
            return;
        }
        ServiceManager.setIInterface(this.serviceConnection.mServiceManager, (IInterface) ServiceManager.getBinderCreator(this.serviceConnection.mServiceManager).createBinder(this.iBinder));
        ServiceManager.linkToDeath(this.serviceConnection.mServiceManager);
        ServiceManager.setBinding(this.serviceConnection.mServiceManager);
        for (Runnable runnable : ServiceManager.getTaskList(this.serviceConnection.mServiceManager)) {
            runnable.run();
        }
        ServiceManager.getTaskList(this.serviceConnection.mServiceManager).clear();
    }
}
