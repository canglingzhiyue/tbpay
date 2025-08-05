package com.alipay.mobile.common.logging.event;

import com.alipay.mobile.common.logging.api.LogCategory;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class ClientQuitEvent implements ClientEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.mobile.common.logging.event.ClientEvent
    public final void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
            return;
        }
        LogContext logContext = LoggerFactory.getLogContext();
        logContext.flush(true);
        logContext.flush(LogCategory.CATEGORY_APPLOG, true);
        ClientEventHelper.a().a(LogContext.CLIENT_ENVENT_CLIENTQUIT);
    }
}
