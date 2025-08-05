package com.alipay.mobile.common.transportext.biz.diagnose.network;

import com.alipay.mobile.common.transport.monitor.DeviceTrafficStateInfo;
import com.alipay.mobile.common.transport.monitor.networkqos.AlipayQosService;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class TrafficLogHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String getTrafficLog(DeviceTrafficStateInfo deviceTrafficStateInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16046e44", new Object[]{deviceTrafficStateInfo});
        }
        if (deviceTrafficStateInfo == null) {
            return null;
        }
        DeviceTrafficStateInfo.DeviceTrafficStateInfoDelta stopTrafficMonitor = AlipayQosService.getInstance().stopTrafficMonitor(deviceTrafficStateInfo);
        return "traffic:TRX:" + stopTrafficMonitor.mDiffTotalRxBytes + ";TTX:" + stopTrafficMonitor.mDiffTotalTxBytes + ";TMRX:" + stopTrafficMonitor.mDiffMobileRxBytes + ";TMTX:" + stopTrafficMonitor.mDiffMobileTxBytes + ";TTS:" + stopTrafficMonitor.mDeltaTS + " s ;speed:" + String.format("%.4f", Double.valueOf(AlipayQosService.getInstance().getSpeed())) + ";bandwidth:" + String.format("%.4f", Double.valueOf(AlipayQosService.getInstance().getBandwidth()));
    }
}
