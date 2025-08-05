package com.alipay.mobile.common.ipc.api;

import com.alipay.mobile.common.ipc.api.aidl.IIPCManager;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public final class IPCApiFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static IPCContextManager f5389a;
    private static IIPCManager b;

    public static final IIPCManager getIPCManager() {
        return (IIPCManager) Class.forName("com.alipay.mobile.common.ipc.biz.IPCManagerService").newInstance();
    }

    public static final IIPCManager getSingletonIPCManager() {
        IIPCManager iIPCManager = b;
        if (iIPCManager != null) {
            return iIPCManager;
        }
        synchronized (IIPCManager.class) {
            if (b != null) {
                return b;
            }
            b = (IIPCManager) Class.forName("com.alipay.mobile.common.ipc.biz.IPCManagerService").newInstance();
            return b;
        }
    }

    public static final IPCContextManager getIPCContextManager() {
        return (IPCContextManager) Class.forName("com.alipay.mobile.common.ipc.biz.IPCContextManagerImpl").newInstance();
    }

    public static final IPCContextManager getSingletonIPCContextManager() {
        IPCContextManager iPCContextManager = f5389a;
        if (iPCContextManager != null) {
            return iPCContextManager;
        }
        synchronized (IPCApiFactory.class) {
            if (f5389a != null) {
                return f5389a;
            }
            f5389a = (IPCContextManager) Class.forName("com.alipay.mobile.common.ipc.biz.IPCContextManagerImpl").newInstance();
            return f5389a;
        }
    }

    public static final ServiceBeanManager getSingletonServiceBeanManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ServiceBeanManager) ipChange.ipc$dispatch("4d7b797", new Object[0]);
        }
        try {
            return getSingletonIPCContextManager().getServiceBeanManager();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
