package com.alipay.mobile.common.logging.event;

import android.text.TextUtils;
import com.alipay.mobile.common.logging.CrashBridge;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class SubAppResumeEvent implements ClientEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.mobile.common.logging.event.ClientEvent
    public final void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
            return;
        }
        LogContext logContext = LoggerFactory.getLogContext();
        String str = (String) obj;
        if (TextUtils.isEmpty(str) || str.equals(logContext.getContextParam(LogContext.STORAGE_APPID))) {
            return;
        }
        logContext.putContextParam(LogContext.STORAGE_APPID, str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        CrashBridge.d();
    }
}
