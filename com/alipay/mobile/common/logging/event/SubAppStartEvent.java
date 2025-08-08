package com.alipay.mobile.common.logging.event;

import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.common.logging.CrashBridge;
import com.alipay.mobile.common.logging.api.LogCategory;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.logging.api.LogEvent;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.behavor.Behavor;
import com.alipay.mobile.common.logging.render.BehavorRender;
import com.alipay.mobile.common.logging.render.PendingRender;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class SubAppStartEvent implements ClientEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.mobile.common.logging.event.ClientEvent
    public final void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
            return;
        }
        LogContext logContext = LoggerFactory.getLogContext();
        String[] split = ((String) obj).split(",");
        String str = split[0];
        String str2 = split.length > 1 ? split[1] : "";
        logContext.putContextParam(LogContext.STORAGE_APPID, str);
        if (!StringUtils.isEmpty(str)) {
            CrashBridge.d();
        }
        Behavor behavor = new Behavor();
        behavor.setSeedID("startApp");
        behavor.setParam1(str);
        behavor.setParam3(str2);
        logContext.appendLogEvent(new LogEvent(LogCategory.CATEGORY_ALIVEREPORT, null, LogEvent.Level.ERROR, null, PendingRender.a(new BehavorRender(logContext), "event", behavor)));
    }
}
