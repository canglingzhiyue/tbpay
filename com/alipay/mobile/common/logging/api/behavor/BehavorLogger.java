package com.alipay.mobile.common.logging.api.behavor;

import com.alipay.mobile.framework.MpaasClassInfo;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public interface BehavorLogger {
    void autoClick(Behavor behavor);

    void autoEvent(Behavor behavor);

    void autoOpenPage(Behavor behavor);

    void click(Behavor behavor);

    void customContent(String str, String str2);

    void event(String str, Behavor behavor);

    void longClick(Behavor behavor);

    void openPage(Behavor behavor);

    void slide(Behavor behavor);

    void submit(Behavor behavor);
}
