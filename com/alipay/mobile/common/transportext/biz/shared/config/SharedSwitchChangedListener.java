package com.alipay.mobile.common.transportext.biz.shared.config;

import com.alipay.mobile.common.ipc.api.IPCApiFactory;
import com.alipay.mobile.common.transport.TransportStrategy;
import com.alipay.mobile.common.transport.config.CtrlNormalConfigChangedEvent;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transport.utils.SwitchMonitorLogUtil;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Observable;
import java.util.Observer;

/* loaded from: classes3.dex */
public class SharedSwitchChangedListener implements Observer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // java.util.Observer
    public void update(Observable observable, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9292f698", new Object[]{this, observable, obj});
        } else {
            NetworkAsyncTaskExecutor.executeLowPri(new Runnable() { // from class: com.alipay.mobile.common.transportext.biz.shared.config.SharedSwitchChangedListener.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (MiscUtils.isInAlipayClient(TransportEnvUtil.getContext()) || TransportStrategy.isEnabledEnhanceNetworkModule()) {
                        NetworkAsyncTaskExecutor.executeLowPri(new Runnable() { // from class: com.alipay.mobile.common.transportext.biz.shared.config.SharedSwitchChangedListener.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                try {
                                    ((CtrlNormalConfigChangedEvent) IPCApiFactory.getSingletonIPCContextManager().getIpcCallManager().getIpcProxy(CtrlNormalConfigChangedEvent.class)).notifyChanged();
                                    LogCatUtil.info("SharedSwitchChangedListener", "IPC notifyChanged finish.");
                                } catch (Throwable th) {
                                    LogCatUtil.error("SharedSwitchChangedListener", th);
                                }
                            }
                        });
                    } else {
                        TransportConfigureManager.getInstance().updateConfig(TransportEnvUtil.getContext());
                        SwitchMonitorLogUtil.monitorSwitchUpdatedLog(TransportEnvUtil.getContext(), "rpc");
                    }
                }
            });
        }
    }
}
