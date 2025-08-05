package com.alipay.mobile.common.amnet.service.config;

import com.alipay.mobile.common.amnet.api.AmnetEnvHelper;
import com.alipay.mobile.common.transport.config.CtrlNormalConfigChangedEvent;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transport.utils.SwitchMonitorLogUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class CtrlNormalConfigChangedEventImpl implements CtrlNormalConfigChangedEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.mobile.common.transport.config.CtrlNormalConfigChangedEvent
    public void notifyChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ebe4632", new Object[]{this});
        } else {
            NetworkAsyncTaskExecutor.executeLowPri(new Runnable() { // from class: com.alipay.mobile.common.amnet.service.config.CtrlNormalConfigChangedEventImpl.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    TransportConfigureManager.getInstance().updateConfig(AmnetEnvHelper.getAppContext());
                    SwitchMonitorLogUtil.monitorSwitchUpdatedLog(AmnetEnvHelper.getAppContext(), "rpc");
                    LogCatUtil.info("PushCtrlNormalConfigChangedEvent", "updateConfig..");
                }
            });
        }
    }
}
