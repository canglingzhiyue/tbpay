package com.alipay.android.phone.mobilesdk.socketcraft.platform.monitor;

import com.alipay.android.phone.mobilesdk.socketcraft.monitor.DataflowMonitorModel;
import com.alipay.android.phone.mobilesdk.socketcraft.monitor.MonitorModel;
import com.alipay.android.phone.mobilesdk.socketcraft.platform.logcat.SCLogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class DefaultMonitorPrinter implements MonitorPrinter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.platform.monitor.MonitorPrinter
    public void print(MonitorModel monitorModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("691c2b8", new Object[]{this, monitorModel});
        } else {
            SCLogCatUtil.info("WS_PERF", monitorModel.toString());
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.platform.monitor.MonitorPrinter
    public void noteTraficConsume(DataflowMonitorModel dataflowMonitorModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3c77c80", new Object[]{this, dataflowMonitorModel});
        } else {
            SCLogCatUtil.info("WS_PERF", dataflowMonitorModel.toString());
        }
    }
}
