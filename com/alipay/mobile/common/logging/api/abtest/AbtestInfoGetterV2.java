package com.alipay.mobile.common.logging.api.abtest;

import com.alipay.mobile.framework.MpaasClassInfo;
import java.util.Map;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public interface AbtestInfoGetterV2 extends AbtestInfoGetter {
    Map<String, String> getExtInfoForSpmID(String str);
}
