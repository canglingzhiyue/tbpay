package com.alipay.mobile.common.logging.api.monitor;

import com.alipay.mobile.framework.MpaasClassInfo;
import java.util.HashMap;
import java.util.Map;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public enum DataflowID {
    STATISTIC("STATISTIC"),
    SAMPLE_STATS("STATS"),
    AMNET_SYNC("SYNC"),
    AMNET_PUSH("PUSH"),
    HTTPCLIENT_RPC("HC_RPC"),
    HTTPCLIENT_H5("HC_H5"),
    HTTPCLIENT_DJANGO("HC_DJG"),
    HTTPCLIENT_NBNET("HC_NBN"),
    HTTPCLIENT_DOWNLOAD("HC_DL"),
    HTTPCLIENT_MDAP("HC_MDAP"),
    WEB_SOCKET("WEB_SOC"),
    H5_NATIVE("H5_GG"),
    H5_UCCORE("H5_UC"),
    H5_ASPECT("H5_AOP"),
    MULTIMEDIA_DJANGO("MM_J"),
    MULTIMEDIA_NATIVE("MM_C"),
    ASPECT_V1("AOP1"),
    ASPECT_V2("AOP2"),
    ASPECT_V3("AOP3"),
    MONITOR("DIAG"),
    MDAP_LOG("MDAP"),
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
    public static final String HOST_NBNET = "__host_nbnet__";
    @Deprecated
    public static final String HOST_PUSH = "__host_push__";
    @Deprecated
    public static final String HOST_SYNC = "__host_sync__";
    private static final Map<String, DataflowID> sStringToEnum = new HashMap();
    private String desc;

    static {
        DataflowID[] values;
        for (DataflowID dataflowID : values()) {
            sStringToEnum.put(dataflowID.desc, dataflowID);
        }
    }

    DataflowID(String str) {
        this.desc = str;
    }

    public static DataflowID fromString(String str) {
        return sStringToEnum.get(str);
    }

    public final String getDes() {
        return this.desc;
    }
}
