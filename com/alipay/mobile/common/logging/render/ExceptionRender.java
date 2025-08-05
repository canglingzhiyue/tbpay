package com.alipay.mobile.common.logging.render;

import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.monitor.ExceptionID;
import com.alipay.mobile.common.logging.util.LoggingUtil;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class ExceptionRender extends BaseRender {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public ExceptionRender(LogContext logContext) {
        super(logContext);
    }

    public final String a(ExceptionID exceptionID, Throwable th, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cbb57336", new Object[]{this, exceptionID, th, str}) : a(exceptionID, LoggingUtil.throwableToString(th), str, false, LoggerFactory.getProcessInfo().getProcessAlias(), Thread.currentThread().getName(), false);
    }

    public final String a(ExceptionID exceptionID, String str, String str2, boolean z, String str3, String str4, boolean z2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("396f9d4b", new Object[]{this, exceptionID, str, str2, new Boolean(z), str3, str4, new Boolean(z2)}) : a(exceptionID, str, str2, z, str3, str4, z2, null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0109, code lost:
        if (android.text.TextUtils.isEmpty(r7) == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a(com.alipay.mobile.common.logging.api.monitor.ExceptionID r17, java.lang.String r18, java.lang.String r19, boolean r20, java.lang.String r21, java.lang.String r22, boolean r23, java.lang.String r24, java.util.Map<java.lang.String, java.lang.String> r25) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.logging.render.ExceptionRender.a(com.alipay.mobile.common.logging.api.monitor.ExceptionID, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, boolean, java.lang.String, java.util.Map):java.lang.String");
    }
}
