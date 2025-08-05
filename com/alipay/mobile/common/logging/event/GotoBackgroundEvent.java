package com.alipay.mobile.common.logging.event;

import com.alipay.mobile.common.logging.CrashBridge;
import com.alipay.mobile.common.logging.api.LogCategory;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.logging.api.LogEvent;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.trace.TraceLogger;
import com.alipay.mobile.common.logging.strategy.LogStrategyManager;
import com.alipay.mobile.common.logging.util.LoggingUtil;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class GotoBackgroundEvent implements ClientEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.mobile.common.logging.event.ClientEvent
    public final void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
            return;
        }
        LogContext logContext = LoggerFactory.getLogContext();
        ClientEventHelper.a().c = System.currentTimeMillis();
        TraceLogger traceLogger = LoggerFactory.getTraceLogger();
        traceLogger.info("GotoBackgroundEvent", "notifyClientEvent: gotoBackground, update gotoBackgroundTimestamp to: " + ClientEventHelper.a().c);
        logContext.appendLogEvent(new LogEvent(LogContext.ENVENT_GOTOBACKGROUND, null, LogEvent.Level.ERROR, Long.toString(ClientEventHelper.a().c)));
        String.valueOf(ClientEventHelper.a().c);
        CrashBridge.d();
        LogStrategyManager.getInstance().queryStrategy(LogStrategyManager.ACTION_TYPE_LEAVEHINT, false);
        logContext.flush(false);
        logContext.flush(LogCategory.CATEGORY_APPLOG, false);
        if (LoggingUtil.isOfflineMode()) {
            logContext.appendLogEvent(new LogEvent("uploadByEvent", null, LogEvent.Level.ERROR, null));
        } else {
            ClientEventHelper.a().a(LogContext.ENVENT_GOTOBACKGROUND);
        }
        logContext.flush("shoujichongzhi", false);
        logContext.uploadAfterSync("shoujichongzhi");
    }
}
