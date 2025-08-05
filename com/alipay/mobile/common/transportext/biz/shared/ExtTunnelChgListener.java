package com.alipay.mobile.common.transportext.biz.shared;

import com.alipay.mobile.common.transport.ext.ExtTransportOffice;
import com.alipay.mobile.common.transport.strategy.ExtTransportTunnelWatchdog;
import com.alipay.mobile.common.transport.strategy.NetworkTunnelChangedListener;
import com.alipay.mobile.common.transport.strategy.NetworkTunnelStrategy;
import com.alipay.mobile.common.transport.strategy.TunnelChangeEventModel;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transportext.api.ExtTransportManager;
import com.alipay.mobile.common.transportext.biz.mmtp.amnetadapt.AmnetHelper;
import com.alipay.mobile.common.transportext.biz.mmtp.amnetadapt.foreign.GeneralEventListenServiceImpl;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Observable;

/* loaded from: classes3.dex */
public class ExtTunnelChgListener implements NetworkTunnelChangedListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private ExtTunnelChgListener() {
    }

    @Override // com.alipay.mobile.common.transport.strategy.NetworkTunnelChangedListener, java.util.Observer
    public void update(Observable observable, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9292f698", new Object[]{this, observable, obj});
            return;
        }
        TunnelChangeEventModel tunnelChangeEventModel = (TunnelChangeEventModel) obj;
        LogCatUtil.info("ExtTunnelChgListener", "收到链路切换：current: " + tunnelChangeEventModel.currentTunnelType + ", new: " + tunnelChangeEventModel.newTunnelType);
        c(tunnelChangeEventModel);
        a(tunnelChangeEventModel);
        b(tunnelChangeEventModel);
    }

    private void a(TunnelChangeEventModel tunnelChangeEventModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dde694a8", new Object[]{this, tunnelChangeEventModel});
        } else if (tunnelChangeEventModel.newTunnelType != 1) {
        } else {
            AmnetHelper.getAmnetManager().getAmnetGeneralEventManager().notifyConnStateChange(0);
            LogCatUtil.info("ExtTunnelChgListener", "origin tunnel started!");
        }
    }

    private void b(TunnelChangeEventModel tunnelChangeEventModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4f27ba9", new Object[]{this, tunnelChangeEventModel});
        } else if (tunnelChangeEventModel.newTunnelType == 3) {
            ExtTransportManager mMTPTransportManager = ((ExtTransportManagerImpl) ExtTransportOffice.getInstance().getExtTransportManager()).getMMTPTransportManager();
            if (!mMTPTransportManager.isInited()) {
                mMTPTransportManager.init(ExtTransportEnv.getAppContext());
            }
            LogCatUtil.info("ExtTunnelChgListener", "Main proc amnet tunnel inited!");
            if (!ExtTransportTunnelWatchdog.getInstance().isDowngraded()) {
                return;
            }
            ExtTransportTunnelWatchdog.getInstance().resetDowngradeFlag();
        } else if (ExtTransportStrategy.isEnabledTransportByLocalAmnet()) {
            LogCatUtil.info("ExtTunnelChgListener", "[handleAmnetTunnelSwitch] Enabled local amnet.");
        } else {
            ((GeneralEventListenServiceImpl) GeneralEventListenServiceImpl.getInstance()).setAmnetLifeState((byte) 1);
            AmnetHelper.getAmnetManager().getAmnetGeneralEventManager().notifyConnStateChange(0);
            LogCatUtil.info("ExtTunnelChgListener", "===Amnet is shutdown===");
        }
    }

    private void c(TunnelChangeEventModel tunnelChangeEventModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bfe62aa", new Object[]{this, tunnelChangeEventModel});
            return;
        }
        try {
            if (tunnelChangeEventModel.newTunnelType == 2) {
                if (!NetworkTunnelStrategy.getInstance().isCanUseSpdy()) {
                    return;
                }
                ExtTransportManager spdyTransportManager = ((ExtTransportManagerImpl) ExtTransportOffice.getInstance().getExtTransportManager()).getSpdyTransportManager();
                if (spdyTransportManager == null) {
                    LogCatUtil.warn("ExtTunnelChgListener", "[handleSpdyTunnelSwitch] Spdy not supported.");
                    return;
                }
                if (!spdyTransportManager.isInited()) {
                    spdyTransportManager.init(ExtTransportEnv.getAppContext());
                }
                spdyTransportManager.asynConnect();
                LogCatUtil.info("ExtTunnelChgListener", "Spdy tunnel started!");
            } else if (tunnelChangeEventModel.currentTunnelType != 2 || tunnelChangeEventModel.newTunnelType == 2 || NetworkTunnelStrategy.getInstance().isCanUseSpdy()) {
            } else {
                ExtTransportManager spdyTransportManager2 = ((ExtTransportManagerImpl) ExtTransportOffice.getInstance().getExtTransportManager()).getSpdyTransportManager();
                if (spdyTransportManager2 == null) {
                    LogCatUtil.warn("ExtTunnelChgListener", "[handleSpdyTunnelSwitch] Spdy not supported.");
                    return;
                }
                spdyTransportManager2.closeConnection();
                LogCatUtil.info("ExtTunnelChgListener", "Spdy tunnel closed!");
            }
        } catch (Exception e) {
            LogCatUtil.error("ExtTunnelChgListener", e);
        }
    }
}
