package com.alipay.mobile.common.logging.api;

import com.alipay.mobile.framework.MpaasClassInfo;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public interface LogDAUTracker {
    public static final String BIZ_TYPE = "DAU";

    void clearExpireData();

    boolean isUploadedToday(String str);

    void updateSpmUploadState(String str);
}
