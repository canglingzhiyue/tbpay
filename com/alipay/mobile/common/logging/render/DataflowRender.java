package com.alipay.mobile.common.logging.render;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.alipay.mobile.common.logging.api.LogCategory;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.monitor.DataflowID;
import com.alipay.mobile.common.logging.api.monitor.DataflowModel;
import com.alipay.mobile.common.logging.process.VariableStoreInToolsProcess;
import com.alipay.mobile.common.logging.strategy.LogStrategyManager;
import com.alipay.mobile.common.logging.util.LoggingUtil;
import com.alipay.mobile.common.logging.util.NetUtil;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.alipay.tianyan.mobilesdk.TianyanLoggingStatus;
import com.android.alibaba.ip.runtime.IpChange;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class DataflowRender extends BaseRender {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public DataflowRender(LogContext logContext) {
        super(logContext);
    }

    public final String a(DataflowModel dataflowModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e153c3d2", new Object[]{this, dataflowModel});
        }
        if (!dataflowModel.isInUse()) {
            throw new IllegalStateException("dataflowModel has been recycled");
        }
        StringBuilder sb = new StringBuilder();
        String processAlias = LoggerFactory.getProcessInfo().getProcessAlias();
        if (dataflowModel.type == DataflowID.MDAP_LOG && !TextUtils.isEmpty(VariableStoreInToolsProcess.d)) {
            processAlias = VariableStoreInToolsProcess.d;
        }
        boolean isMonitorBackground = TianyanLoggingStatus.isMonitorBackground();
        if (dataflowModel.type == DataflowID.MDAP_LOG && !TextUtils.isEmpty(VariableStoreInToolsProcess.d)) {
            isMonitorBackground = VariableStoreInToolsProcess.f5448a;
        }
        boolean isStrictBackground = TianyanLoggingStatus.isStrictBackground();
        if (dataflowModel.type == DataflowID.MDAP_LOG && !TextUtils.isEmpty(VariableStoreInToolsProcess.d)) {
            isStrictBackground = VariableStoreInToolsProcess.b;
        }
        boolean isRelaxedBackground = TianyanLoggingStatus.isRelaxedBackground();
        if (dataflowModel.type == DataflowID.MDAP_LOG && !TextUtils.isEmpty(VariableStoreInToolsProcess.d)) {
            isRelaxedBackground = VariableStoreInToolsProcess.c;
        }
        sb.append("DF");
        LoggingUtil.appendParam(sb, LoggingUtil.getNowTime());
        LoggingUtil.appendParam(sb, this.b.getProductId());
        LoggingUtil.appendParam(sb, this.b.getProductVersion());
        LoggingUtil.appendParam(sb, this.b.getUserId());
        LoggingUtil.appendParam(sb, this.b.getDeviceId());
        Context applicationContext = this.b.getApplicationContext();
        LoggingUtil.appendParam(sb, isStrictBackground ? NetUtil.getNetworkTypeOptimizedStrict(applicationContext) : NetUtil.getNetworkTypeOptimized(applicationContext));
        if (dataflowModel.type == null) {
            dataflowModel.type = DataflowID.UNKNOWN;
        }
        LoggingUtil.appendParam(sb, dataflowModel.type.getDes());
        LoggingUtil.appendParam(sb, dataflowModel.url);
        LoggingUtil.appendParam(sb, String.valueOf(dataflowModel.reqSize + dataflowModel.respSize));
        LoggingUtil.appendParam(sb, dataflowModel.bundle);
        LoggingUtil.appendExtParam(sb, dataflowModel.params);
        LoggingUtil.appendParam(sb, Build.VERSION.RELEASE);
        LoggingUtil.appendParam(sb, Build.MODEL);
        LoggingUtil.appendParam(sb, dataflowModel.diagnose);
        LoggingUtil.appendParam(sb, processAlias);
        String str = "1";
        LoggingUtil.appendParam(sb, isMonitorBackground ? str : "0");
        LoggingUtil.appendParam(sb, isStrictBackground ? str : "0");
        if (!isRelaxedBackground) {
            str = "0";
        }
        LoggingUtil.appendParam(sb, str);
        LoggingUtil.appendParam(sb, a());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(dataflowModel.getLoggerLevel());
        LoggingUtil.appendParam(sb, sb2.toString());
        LoggingUtil.appendParam(sb, LogStrategyManager.getInstance().getHitTestRate(LogCategory.CATEGORY_DATAFLOW, dataflowModel.getLoggerLevel()));
        dataflowModel.recycle();
        sb.append("$$");
        return sb.toString();
    }
}
