package com.alipay.mobile.common.transportext.biz.shared.config;

import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.ext.MainProcConfigListenService;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transport.utils.NwSharedSwitchUtil;
import com.alipay.mobile.common.transport.utils.SwitchMonitorLogUtil;
import com.alipay.mobile.common.transportext.biz.shared.ExtTransportEnv;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class MainProcConfigListenServiceImpl implements MainProcConfigListenService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static MainProcConfigListenServiceImpl f5698a;

    public static final MainProcConfigListenService getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MainProcConfigListenService) ipChange.ipc$dispatch("cf9b81b8", new Object[0]);
        }
        MainProcConfigListenServiceImpl mainProcConfigListenServiceImpl = f5698a;
        if (mainProcConfigListenServiceImpl != null) {
            return mainProcConfigListenServiceImpl;
        }
        synchronized (MainProcConfigListenServiceImpl.class) {
            if (f5698a != null) {
                return f5698a;
            }
            f5698a = new MainProcConfigListenServiceImpl();
            return f5698a;
        }
    }

    private MainProcConfigListenServiceImpl() {
    }

    @Override // com.alipay.mobile.common.transport.ext.MainProcConfigListenService
    public void notifyConfigureChangedEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2c0198a", new Object[]{this});
        } else {
            NetworkAsyncTaskExecutor.executeIO(new Runnable() { // from class: com.alipay.mobile.common.transportext.biz.shared.config.MainProcConfigListenServiceImpl.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    LogCatUtil.info("MainProcConfigListenService", "Accepted push condfigure changed");
                    TransportConfigureManager.getInstance().updateConfig(ExtTransportEnv.getAppContext());
                    SwitchMonitorLogUtil.monitorSwitchUpdatedLog(ExtTransportEnv.getAppContext(), NwSharedSwitchUtil.getSwitchSrc());
                }
            });
        }
    }
}
