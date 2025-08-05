package com.alipay.mobile.common.logging.event;

import com.alipay.mobile.common.logging.CrashBridge;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.logging.api.LogEvent;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.trace.TraceLogger;
import com.alipay.mobile.common.logging.strategy.LogStrategyManager;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class ClientClientLaunchEvent implements ClientEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.mobile.common.logging.event.ClientEvent
    public final void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
            return;
        }
        LogContext logContext = LoggerFactory.getLogContext();
        ClientEventHelper.a().b = System.currentTimeMillis();
        TraceLogger traceLogger = LoggerFactory.getTraceLogger();
        traceLogger.info("ClientClientLaunchEvent", "notifyClientEvent: ClientEvent_ClientLaunch, update clientLaunchTimestamp to: " + ClientEventHelper.a().b);
        logContext.appendLogEvent(new LogEvent("refreshSession", null, LogEvent.Level.ERROR, null));
        String.valueOf(ClientEventHelper.a().b);
        CrashBridge.d();
        LogStrategyManager.getInstance().queryStrategy(LogStrategyManager.ACTION_TYPE_BOOT, true);
        ClientEventHelper.a().a(LogContext.CLIENT_ENVENT_CLIENTLAUNCH);
    }
}
