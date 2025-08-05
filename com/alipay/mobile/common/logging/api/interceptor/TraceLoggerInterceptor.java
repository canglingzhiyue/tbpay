package com.alipay.mobile.common.logging.api.interceptor;

import com.alipay.mobile.framework.MpaasClassInfo;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public interface TraceLoggerInterceptor {
    public static final int DROP = 4;
    public static final int MEMORY = 2;
    public static final int NORMAL = 1;

    int getAppendType();
}
