package com.taobao.android.weex_framework.common.expection;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes6.dex */
public interface WXExceptionConfig {
    public static final int EXCEPTION_AREA_COVERAGE = 10030;
    public static final int EXCEPTION_BUSINESS = 10033;
    public static final int EXCEPTION_FATAL = 10023;
    public static final int EXCEPTION_IMAGE_ERROR = 10020;
    public static final int EXCEPTION_JS_ENGINE_ERROR = 10026;
    public static final int EXCEPTION_JS_ERROR = 10019;
    public static final int EXCEPTION_JS_RUNTIME_ERROR = 10025;
    public static final int EXCEPTION_MTOP_ERROR = 10027;
    public static final int EXCEPTION_SO_LOAD_FAIL = 10024;
    public static final int EXCEPTION_UNICORN = 10029;
    public static final int EXCEPTION_VIDEO_ERROR = 10021;
    public static final int EXCEPTION_WEEX_FRAMEWORK = 10028;
    public static final int EXCEPTION_WHITE_SCREEN = 10018;
    public static final int EXCEPTION_WHITE_SCREEN_GE_5s = 10034;
    public static final int EXCEPTION_WHITE_SCREEN_PLATFORM_VIEW = 10031;
    public static final int EXCEPTION_WIDGET = 10032;
    public static final String KEY_AREA_COVERAGE = "AREA_COVERAGE";
    public static final String KEY_BIZ = "BIZ";
    public static final String KEY_BLANK = "";
    public static final String KEY_DEFAULT = "DEFAULT";
    public static final String KEY_DOWNGRADE = "DOWNGRADE";
    public static final String KEY_EXCEPTION_ID = "exceptionId";
    public static final String KEY_FATAL = "FATAL";
    public static final String KEY_GROUP_KEY = "groupKey";
    public static final String KEY_HTTP = "HTTP";
    public static final String KEY_IMAGE = "IMG";
    public static final String KEY_INNER_INFO = "innerInfo";
    public static final String KEY_JS = "JS";
    public static final String KEY_JS_RUNTIME = "RUNTIME";
    public static final String KEY_MSG = "msg";
    public static final String KEY_MTOP = "MTOP";
    public static final String KEY_PARSE_CONTENT_ERROR = "PARSE_02";
    public static final String KEY_PARSE_MD5_ERROR = "PARSE_03";
    public static final String KEY_PARSE_WLM_URL = "PARSE_01";
    public static final String KEY_RENDER = "RENDER";
    public static final String KEY_VIDEO = "VIDEO";
    public static final String KEY_WHITE = "WHITE";
    public static final String KEY_WHITE_SCREEN_EMPTY_ROOT_LAYER_PAINT_BOUNDS = "EMPTY_ROOT_LAYER_PAINT_BOUNDS";
    public static final String KEY_WHITE_SCREEN_PLATFORM_VIEW = "WHITE_SCREEN_PLATFORM_VIEW";

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface KeyExceptionId {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface KeySubType {
    }
}
