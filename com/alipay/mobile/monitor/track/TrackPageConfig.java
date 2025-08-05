package com.alipay.mobile.monitor.track;

import com.alipay.mobile.framework.MpaasClassInfo;
import java.util.Map;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public interface TrackPageConfig {
    public static final String KEY_ENTITY_CONTENT_TAGID = "entityContentTagId";

    Map<String, String> getExtParam();

    String getPageSpmId();

    boolean isTrackPage();
}
