package com.alipay.mobile.common.amnet.service;

import com.alipay.mobile.common.transport.TransportStrategy;
import com.alipay.mobile.common.transport.strategy.NetworkTunnelChangedListener;
import com.alipay.mobile.common.transport.strategy.NetworkTunnelStrategy;
import com.alipay.mobile.common.transport.strategy.TunnelChangeEventModel;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Observable;

/* loaded from: classes3.dex */
public abstract class BasePushNetworkTunnelChangedListener implements NetworkTunnelChangedListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public abstract void changePushTunnel(TunnelChangeEventModel tunnelChangeEventModel);

    public BasePushNetworkTunnelChangedListener() {
        a();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            NetworkTunnelStrategy.getInstance().addNetworkTunnelChangedListener(PushProcAmnetSelfTunnelChangedListener.getInstance());
        }
    }

    @Override // com.alipay.mobile.common.transport.strategy.NetworkTunnelChangedListener, java.util.Observer
    public void update(Observable observable, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9292f698", new Object[]{this, observable, obj});
            return;
        }
        TunnelChangeEventModel tunnelChangeEventModel = (TunnelChangeEventModel) obj;
        LogCatUtil.info("BasePushNetworkTunnelChangedListener", "Push收到通道切换：current: " + tunnelChangeEventModel.currentTunnelType + ", new: " + tunnelChangeEventModel.newTunnelType);
        a(tunnelChangeEventModel);
    }

    private void a(TunnelChangeEventModel tunnelChangeEventModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dde694a8", new Object[]{this, tunnelChangeEventModel});
        } else if (tunnelChangeEventModel.newTunnelType == 3) {
            if (NetworkTunnelStrategy.getInstance().isCanUseAmnetOnOnlyPush()) {
                return;
            }
            changePushTunnel(tunnelChangeEventModel);
        } else if ((!NetworkTunnelStrategy.getInstance().isCanUseAmnet() && TransportStrategy.isEnabledOnlyPush()) || TransportStrategy.isEnabledOnlyPush()) {
        } else {
            changePushTunnel(tunnelChangeEventModel);
        }
    }
}
