package com.alipay.mobile.common.ipc.biz;

import android.content.Context;
import android.os.RemoteException;
import com.alipay.mobile.common.ipc.api.IPCCallManager;
import com.alipay.mobile.common.ipc.api.IPCContextManager;
import com.alipay.mobile.common.ipc.api.LocalCallManager;
import com.alipay.mobile.common.ipc.api.ServiceBeanManager;
import com.alipay.mobile.common.ipc.api.aidl.IIPCCallBack;
import com.alipay.mobile.common.ipc.api.aidl.IIPCManager;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class IPCContextManagerImpl implements IPCContextManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private IPCCallManager f5395a;
    private ServiceBeanManager b;
    private LocalCallManager c;
    private IIPCManager d;
    private Context e;
    private IIPCCallBack f;

    @Override // com.alipay.mobile.common.ipc.api.IPCContextManager
    public void init(Context context, IIPCManager iIPCManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c75aff", new Object[]{this, context, iIPCManager});
            return;
        }
        this.e = context;
        this.e.getClass();
        this.d = iIPCManager;
        getIpcCallManager().setIIPCManager(this.d);
        IIPCManager iIPCManager2 = this.d;
        if (iIPCManager2 instanceof IPCManagerService) {
            ((IPCManagerService) iIPCManager2).setLocalCallManager(getLocalCallManager());
            return;
        }
        try {
            iIPCManager2.registerCallBack(getIIPCCallBack());
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.alipay.mobile.common.ipc.api.IPCContextManager
    public synchronized void resetIIPCManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ade7372", new Object[]{this});
            return;
        }
        LogCatUtil.info("IPCContextManagerImpl", "resetIIPCManager !");
        this.d = null;
        getIpcCallManager().setIIPCManager(null);
        LogCatUtil.info("IPCContextManager", "[resetIIPCManager] reset iIpcManager to null.");
    }

    @Override // com.alipay.mobile.common.ipc.api.IPCContextManager
    public IPCCallManager getIpcCallManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPCCallManager) ipChange.ipc$dispatch("35b9b3b8", new Object[]{this});
        }
        IPCCallManager iPCCallManager = this.f5395a;
        if (iPCCallManager != null) {
            return iPCCallManager;
        }
        synchronized (this) {
            if (this.f5395a != null) {
                return this.f5395a;
            }
            this.f5395a = new IPCCallManagerImpl();
            return this.f5395a;
        }
    }

    @Override // com.alipay.mobile.common.ipc.api.IPCContextManager
    public ServiceBeanManager getServiceBeanManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ServiceBeanManager) ipChange.ipc$dispatch("4fe70858", new Object[]{this});
        }
        ServiceBeanManager serviceBeanManager = this.b;
        if (serviceBeanManager != null) {
            return serviceBeanManager;
        }
        synchronized (this) {
            if (this.b != null) {
                return this.b;
            }
            this.b = new ServiceBeanManagerImpl();
            return this.b;
        }
    }

    @Override // com.alipay.mobile.common.ipc.api.IPCContextManager
    public LocalCallManager getLocalCallManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocalCallManager) ipChange.ipc$dispatch("5e876198", new Object[]{this});
        }
        LocalCallManager localCallManager = this.c;
        if (localCallManager != null) {
            return localCallManager;
        }
        synchronized (this) {
            if (this.c != null) {
                return this.c;
            }
            this.c = new LocalCallManagerImpl(getServiceBeanManager());
            return this.c;
        }
    }

    public IIPCCallBack getIIPCCallBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IIPCCallBack) ipChange.ipc$dispatch("eb59c6af", new Object[]{this});
        }
        if (this.f == null) {
            IPCCallBackService iPCCallBackService = new IPCCallBackService();
            iPCCallBackService.setLocalCallManager(getLocalCallManager());
            this.f = iPCCallBackService;
        }
        return this.f;
    }
}
