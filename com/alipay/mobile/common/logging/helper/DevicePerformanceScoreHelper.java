package com.alipay.mobile.common.logging.helper;

import android.content.Context;
import com.alipay.mobile.common.logging.api.DeviceHWInfo;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public final class DevicePerformanceScoreHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static DevicePerformanceScoreHelper b;

    /* renamed from: a  reason: collision with root package name */
    public LogContext.DevicePerformanceScore f5438a;

    private DevicePerformanceScoreHelper(Context context) {
        this.f5438a = LogContext.DevicePerformanceScore.LOW;
        long totalMemory = DeviceHWInfo.getTotalMemory(context);
        this.f5438a = (totalMemory != -1 && totalMemory >= 3670016000L) ? LogContext.DevicePerformanceScore.HIGH : LogContext.DevicePerformanceScore.LOW;
    }

    public static DevicePerformanceScoreHelper a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DevicePerformanceScoreHelper) ipChange.ipc$dispatch("3a58de5c", new Object[]{context});
        }
        if (b == null) {
            synchronized (DevicePerformanceScoreHelper.class) {
                if (b == null) {
                    b = new DevicePerformanceScoreHelper(context);
                }
            }
        }
        return b;
    }
}
