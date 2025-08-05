package com.alipay.mobile.common.transportext.biz.sync;

import com.alipay.mobile.common.transport.strategy.NetworkTunnelChangedListener;
import com.alipay.mobile.common.transport.strategy.TunnelChangeEventModel;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Observable;

/* loaded from: classes3.dex */
public class SyncTunnelChgListener implements NetworkTunnelChangedListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private SyncTunnelChgListener() {
    }

    @Override // com.alipay.mobile.common.transport.strategy.NetworkTunnelChangedListener, java.util.Observer
    public void update(Observable observable, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9292f698", new Object[]{this, observable, obj});
            return;
        }
        TunnelChangeEventModel tunnelChangeEventModel = (TunnelChangeEventModel) obj;
        LogCatUtil.info("SyncTunnelChgListener", "SYNC 收到链路切换：current: " + tunnelChangeEventModel.currentTunnelType + ", new: " + tunnelChangeEventModel.newTunnelType);
    }
}
