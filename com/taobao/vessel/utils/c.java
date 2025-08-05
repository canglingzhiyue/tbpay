package com.taobao.vessel.utils;

import tb.kge;

/* loaded from: classes9.dex */
public class c {
    public static final String ALARM_MODULE_NAME = "vessel";
    public static final String ALARM_NAME = "vessel";
    public static final String DEFAULT_URL = "vessel default url";
    public static final String DOWN_GRADE = "downgrade";
    public static final String JS_BRIDGE_NAME = "VesselJsBridge";
    public static final String LOAD_DATA_NULL = "data is null";
    public static final String LOAD_ERROR = "load error";
    public static final String LOAD_PARAMS = "content";
    public static final int LOAD_SUCCESS = 1005;
    public static final String MODULE_NAME = "vessel";
    public static final VesselType NATIVE_TYPE;
    public static final VesselType WEB_TYPE;
    public static final VesselType WEEX_TYPE;

    static {
        kge.a(-568377643);
        WEEX_TYPE = VesselType.Weex;
        WEB_TYPE = VesselType.Web;
        NATIVE_TYPE = VesselType.Native;
    }
}
