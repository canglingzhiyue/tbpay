package com.alipay.mobile.common.logging.impl;

import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.logging.api.LogEvent;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.antevent.AntEvent;
import com.alipay.mobile.common.logging.api.antevent.EventLogger;
import com.alipay.mobile.common.logging.render.AntEventRender;
import com.alipay.mobile.common.logging.render.PendingRender;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class EventLoggerImpl implements EventLogger {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private LogContext f5445a;
    private AntEventRender b;

    public EventLoggerImpl(LogContext logContext) {
        this.f5445a = logContext;
        this.b = new AntEventRender(logContext);
    }

    @Override // com.alipay.mobile.common.logging.api.antevent.EventLogger
    public void antEvent(AntEvent antEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95d627cd", new Object[]{this, antEvent});
        } else {
            antEvent(null, antEvent);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.antevent.EventLogger
    public void antEvent(String str, AntEvent antEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2e9a117", new Object[]{this, str, antEvent});
        } else if (antEvent == null) {
        } else {
            if (StringUtils.isEmpty(antEvent.getEventID())) {
                LoggerFactory.getTraceLogger().warn("EventLogger", "illegal args, eventId is empty!");
                return;
            }
            if (StringUtils.isEmpty(str)) {
                str = antEvent.getBizType();
            }
            String str2 = str;
            if (StringUtils.isEmpty(str2)) {
                LoggerFactory.getTraceLogger().warn("EventLogger", "illegal args, bizType is empty!");
            } else {
                this.f5445a.appendLogEvent(new LogEvent(str2, "EventLogger", new LogEvent.Level(antEvent.getLoggerLevel()), null, PendingRender.a(this.b, antEvent)));
            }
        }
    }
}
