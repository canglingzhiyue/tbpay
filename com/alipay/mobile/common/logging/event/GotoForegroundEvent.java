package com.alipay.mobile.common.logging.event;

import com.alipay.mobile.common.logging.api.DeviceInfo;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.logging.api.LogEvent;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.TimeZone;
import tb.mxr;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class GotoForegroundEvent implements ClientEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public LogContext f5435a;

    @Override // com.alipay.mobile.common.logging.event.ClientEvent
    public final void a(Object obj) {
        LogContext logContext;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
            return;
        }
        this.f5435a = LoggerFactory.getLogContext();
        this.f5435a.appendLogEvent(new LogEvent("refreshSession", null, LogEvent.Level.ERROR, null));
        ClientEventHelper.a().a(LogContext.CLIENT_ENVENT_GOTOFOREGROUND);
        DeviceInfo.getInstance(this.f5435a.getApplicationContext()).updateAccessibilityState();
        if (DeviceInfo.getInstance(this.f5435a.getApplicationContext()).getIsAccessibilityEnabled()) {
            logContext = this.f5435a;
            str = "1";
        } else {
            logContext = this.f5435a;
            str = "0";
        }
        logContext.putBizExternParams(mxr.KEY_ASSISTANT, str);
        try {
            this.f5435a.putBizExternParams("TimeZone", TimeZone.getDefault().getID());
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().error("GotoForegroundEvent", th);
        }
    }
}
