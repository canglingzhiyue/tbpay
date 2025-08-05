package com.alipay.mobile.common.logging.api;

import com.alipay.mobile.common.logging.api.customer.LogUploadInfo;
import com.alipay.mobile.common.logging.api.customer.LogWriteInfo;
import com.alipay.mobile.common.logging.api.customer.UploadResultInfo;
import com.alipay.mobile.framework.MpaasClassInfo;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public interface LogCustomerControl {
    UploadResultInfo isLogUpload(LogUploadInfo logUploadInfo);

    boolean isLogWrite(LogWriteInfo logWriteInfo);
}
