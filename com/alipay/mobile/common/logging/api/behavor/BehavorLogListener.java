package com.alipay.mobile.common.logging.api.behavor;

import com.alipay.mobile.framework.MpaasClassInfo;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public interface BehavorLogListener {
    void onAutoClick(Behavor behavor);

    void onAutoOpenPage(Behavor behavor);
}
