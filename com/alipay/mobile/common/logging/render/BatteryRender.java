package com.alipay.mobile.common.logging.render;

import android.os.Build;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.monitor.BatteryID;
import com.alipay.mobile.common.logging.api.monitor.BatteryModel;
import com.alipay.mobile.common.logging.util.LoggingUtil;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.alipay.tianyan.mobilesdk.TianyanLoggingStatus;
import com.android.alibaba.ip.runtime.IpChange;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class BatteryRender extends BaseRender {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public BatteryRender(LogContext logContext) {
        super(logContext);
    }

    public final String a(BatteryModel batteryModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("218aff8b", new Object[]{this, batteryModel});
        }
        if (batteryModel.type == BatteryID.UNKNOWN) {
            throw new IllegalStateException("batteryModel has been recycled");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("BTR");
        LoggingUtil.appendParam(sb, LoggingUtil.getNowTime());
        LoggingUtil.appendParam(sb, this.b.getProductId());
        LoggingUtil.appendParam(sb, this.b.getProductVersion());
        LoggingUtil.appendParam(sb, this.b.getUserId());
        LoggingUtil.appendParam(sb, this.b.getDeviceId());
        if (batteryModel.type == null) {
            batteryModel.type = BatteryID.UNKNOWN;
        }
        LoggingUtil.appendParam(sb, batteryModel.type.getDes());
        LoggingUtil.appendParam(sb, String.valueOf(batteryModel.power));
        LoggingUtil.appendParam(sb, batteryModel.bundle);
        LoggingUtil.appendExtParam(sb, batteryModel.params);
        LoggingUtil.appendParam(sb, Build.VERSION.RELEASE);
        LoggingUtil.appendParam(sb, Build.MODEL);
        LoggingUtil.appendParam(sb, batteryModel.diagnose);
        LoggingUtil.appendParam(sb, LoggerFactory.getProcessInfo().getProcessAlias());
        String str = "1";
        LoggingUtil.appendParam(sb, TianyanLoggingStatus.isMonitorBackground() ? str : "0");
        LoggingUtil.appendParam(sb, TianyanLoggingStatus.isStrictBackground() ? str : "0");
        if (!TianyanLoggingStatus.isRelaxedBackground()) {
            str = "0";
        }
        LoggingUtil.appendParam(sb, str);
        LoggingUtil.appendParam(sb, a());
        batteryModel.recycle();
        sb.append("$$");
        return sb.toString();
    }
}
