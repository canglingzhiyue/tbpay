package com.alipay.mobile.common.transportext.biz.httpdns;

import com.alipay.mobile.common.ipc.api.IPCApiFactory;
import com.alipay.mobile.common.transport.TransportStrategy;
import com.alipay.mobile.common.transport.ext.ExtHttpDnsManager;
import com.alipay.mobile.common.transport.httpdns.ipc.UpdateDnsService;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transportext.biz.shared.ExtTransportEnv;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class ExtHttpDnsManagerImpl implements ExtHttpDnsManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.mobile.common.transport.ext.ExtHttpDnsManager
    public void ayncNotifyUpdateDnsInfo(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e70e3b5", new Object[]{this, new Boolean(z)});
        } else {
            NetworkAsyncTaskExecutor.executeLowPri(new Runnable() { // from class: com.alipay.mobile.common.transportext.biz.httpdns.ExtHttpDnsManagerImpl.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        if (TransportStrategy.isNetworkRunInSingleProcess(ExtTransportEnv.getAppContext())) {
                            return;
                        }
                        ((UpdateDnsService) IPCApiFactory.getSingletonIPCContextManager().getIpcCallManager().getIpcProxy(UpdateDnsService.class)).notifyUpdateDns(z);
                    } catch (Throwable th) {
                        LogCatUtil.error("ExtHttpDnsManager", "[ayncNotifyUpdateDnsInfo] Exception = " + th.toString());
                    }
                }
            });
        }
    }
}
