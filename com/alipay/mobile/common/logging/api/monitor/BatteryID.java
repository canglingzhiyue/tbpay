package com.alipay.mobile.common.logging.api.monitor;

import com.alipay.mobile.framework.MpaasClassInfo;
import java.util.HashMap;
import java.util.Map;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public enum BatteryID {
    STATISTIC("STATISTIC"),
    SAMPLE_STATS("STATS"),
    MEDIA_RECORD("RECORD"),
    LOCATION("LOC"),
    MAP("MAP"),
    WIFI_SCAN("SCAN"),
    NORMAL_ALARM("N_ALARM"),
    AMNET_ALARM("A_ALARM"),
    SENSOR("SENSOR"),
    WAKE_LOCK("WAKE"),
    WEB_VIEW("H5"),
    BLUETOOTH("BT"),
    SEND_BROADCAST("BROADCAST"),
    UNKNOWN("NA");
    
    @Deprecated
    public static final String DEFAULT_BUNDLE = "bundle";
    @Deprecated
    public static final String DEFAULT_DIAGNOSE = "diagnose";
    @Deprecated
    public static final String DEFAULT_FALSE = "0";
    @Deprecated
    public static final String DEFAULT_TRUE = "1";
    @Deprecated
    public static final String STATS_LONG_TIME_CONSUME = "longTimeCost";
    @Deprecated
    public static final String STATS_WARNNING_NAME = "warnName";
    @Deprecated
    public static final String STATS_WARNNING_VALUE = "warnVal";
    private static final Map<String, BatteryID> sStringToEnum = new HashMap();
    private String desc;

    static {
        BatteryID[] values;
        for (BatteryID batteryID : values()) {
            sStringToEnum.put(batteryID.desc, batteryID);
        }
    }

    BatteryID(String str) {
        this.desc = str;
    }

    public static BatteryID fromString(String str) {
        return sStringToEnum.get(str);
    }

    public final String getDes() {
        return this.desc;
    }
}
