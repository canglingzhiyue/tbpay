package com.alipay.android.phone.mobilesdk.socketcraft.platform.monitor;

import com.alipay.android.phone.mobilesdk.socketcraft.platform.PlatformUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class MonitorPrinterFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static MonitorPrinter f5115a;

    public static final MonitorPrinter getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MonitorPrinter) ipChange.ipc$dispatch("16b2fa73", new Object[0]);
        }
        MonitorPrinter monitorPrinter = f5115a;
        if (monitorPrinter != null) {
            return monitorPrinter;
        }
        synchronized (MonitorPrinterFactory.class) {
            if (f5115a != null) {
                return f5115a;
            }
            if (PlatformUtil.isAndroidMPaaSPlatform()) {
                f5115a = PlatformUtil.createMPaaSMonitorPrinter();
            } else {
                f5115a = new DefaultMonitorPrinter();
            }
            return f5115a;
        }
    }

    public static void setMonitorPrinter(MonitorPrinter monitorPrinter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f047cd8", new Object[]{monitorPrinter});
        } else {
            f5115a = monitorPrinter;
        }
    }
}
