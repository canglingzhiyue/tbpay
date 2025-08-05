package com.alipay.mobile.common.logging.event;

import com.alipay.mobile.common.logging.CrashBridge;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.logging.api.LogEvent;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.trace.TraceLogger;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class ClientPageLaunchEvent implements ClientEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.mobile.common.logging.event.ClientEvent
    public final void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
            return;
        }
        TraceLogger traceLogger = LoggerFactory.getTraceLogger();
        traceLogger.info("ClientPageLaunchEvent", "notifyClientEvent: ClientEvent_PageLaunch, clientLaunchTimestamp: " + ClientEventHelper.a().b + ", gotoBackgroundTimestamp: " + ClientEventHelper.a().c);
        if (ClientEventHelper.a().b <= 0) {
            ClientEventHelper.a().b = System.currentTimeMillis();
            String.valueOf(ClientEventHelper.a().b);
            CrashBridge.d();
        }
        if (ClientEventHelper.a().c <= 0) {
            return;
        }
        ClientEventHelper.a().c = 0L;
        LoggerFactory.getLogContext().appendLogEvent(new LogEvent(LogContext.ENVENT_GOTOBACKGROUND, null, LogEvent.Level.ERROR, Long.toString(ClientEventHelper.a().c)));
        String.valueOf(ClientEventHelper.a().c);
        CrashBridge.d();
    }
}
