package com.alibaba.android.split.core.internal;

import com.alibaba.android.split.aa;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public final class UnbindService extends AbstractTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ServiceManager serviceManager;

    static {
        kge.a(832488167);
    }

    public UnbindService(ServiceManager serviceManager) {
        this.serviceManager = serviceManager;
    }

    @Override // com.alibaba.android.split.core.internal.AbstractTask
    public final void execute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
        } else if (ServiceManager.getIInterface(this.serviceManager) == null) {
        } else {
            ServiceManager.getLogger(this.serviceManager).a("Unbind from service.", new Object[0]);
            if (this.serviceManager.isOptService()) {
                aa.b(ServiceManager.getContext(this.serviceManager), ServiceManager.getServiceConnection(this.serviceManager));
            } else {
                ServiceManager.getContext(this.serviceManager).unbindService(ServiceManager.getServiceConnection(this.serviceManager));
            }
            ServiceManager.setBinding(this.serviceManager);
            ServiceManager.setIInterface(this.serviceManager, null);
            ServiceManager.releaseServiceConnection(this.serviceManager);
        }
    }
}
