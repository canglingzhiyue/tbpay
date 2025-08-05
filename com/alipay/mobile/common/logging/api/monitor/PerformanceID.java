package com.alipay.mobile.common.logging.api.monitor;

import com.alipay.mobile.framework.MpaasClassInfo;
import java.util.HashMap;
import java.util.Map;
import tb.nfc;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public enum PerformanceID {
    MONITORPOINT_NETWORK("network"),
    MONITORPOINT_WEBAPP("webapp"),
    MONITORPOINT_H5EXCEPTION("H5Exception"),
    MONITORPOINT_SDKMONITOR("sdkmonitor"),
    MONITORPOINT_SYNCLINK("synclink"),
    MONITORPOINT_SYNCPROTO("syncproto"),
    MONITORPOINT_PERFORMANCE(nfc.PHA_MONITOR_MODULE_POINT_PERFORMANCE),
    MONITORPOINT_FOOTPRINT("footprint"),
    MONITORPOINT_KEYBIZTRACE("keybiztrace");
    
    private static final Map<String, PerformanceID> sStringToEnum = new HashMap();
    private String desc;

    static {
        PerformanceID[] values;
        for (PerformanceID performanceID : values()) {
            sStringToEnum.put(performanceID.desc, performanceID);
        }
    }

    PerformanceID(String str) {
        this.desc = str;
    }

    public static PerformanceID fromString(String str) {
        return sStringToEnum.get(str);
    }

    public final String getDes() {
        return this.desc;
    }
}
