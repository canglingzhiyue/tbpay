package com.uc.webview.base.timing;

/* loaded from: classes9.dex */
public interface StartupTimingKeys {
    public static final int CHECK_COMPATIABLE = 68037661;
    public static final int CHECK_DEX_VALIDITY = 38672662;
    public static final int CHECK_DEX_VALIDITY_QUICK = 80711560;
    public static final int CHECK_LIB_VALIDITY = 54527890;
    public static final int CHECK_LIB_VALIDITY_QUICK = 30603880;
    public static final int CLEANER = 61685997;
    public static final int CONTINUE_INIT_LIBS = 88120969;
    public static final int CREATE_RUNNING_CORE_INFO = 84507646;
    public static final int DETECT_LIBS_MAYBE_DAMAGED = 19818227;
    public static final int EXTRACTOR = 33333209;
    public static final int EXTRACTOR_7Z_FAILED_CODE = 58429806;
    public static final int EXTRACTOR_EXISTS = 62742041;
    public static final int EXTRACTOR_FAILED_CODE = 91853489;
    public static final int EXTRACTOR_START = 82176388;
    public static final int EXTRACTOR_SUCCESS = 98786255;
    public static final int FAILURE_REPORTER = 25014329;
    public static final int FIRST_AOSP_WEBVIEW = 70209870;
    public static final int FIRST_AW_CONTENTS = 28567496;
    public static final int FIRST_EXPORT_WEBVIEW = 89251552;
    public static final int FIRST_EXPORT_WEBVIEW_WAIT = 65502094;
    public static final int INITIALIZER = 30640195;
    public static final int INIT_CORE_ENGINE = 12790545;
    public static final int INIT_CORE_FACTORY = 10605146;
    public static final int INIT_FAILED_CODE = 52126823;
    public static final int INIT_FAILED_MESSAGE = 97629412;
    public static final int INIT_FINISHED = 17775349;
    public static final int INIT_NATIVE_LIBRARIES = 61026458;
    public static final int INIT_UC_PLAYER = 5846406;
    public static final int INTEGRATION_TYPE = 22816231;
    public static final int IS_FIRST_USED = 54064721;
    public static final int IS_REUSED = 50771639;
    public static final int LOAD_DEX = 41045988;
    public static final int LOAD_SO = 8802255;
    public static final int PLAYER_INITIALIZER = 43270502;
    public static final int POST_CONTINUE_INIT_LIBS = 877095;
    public static final int POST_INITIALIZER = 56680907;
    public static final int POST_UPDATE_START = 83140124;
    public static final int POST_UPDATE_SUCCESS = 39359345;
    public static final int PRELOAD_CORE_DEX_LEAD_TIME = 41005100;
    public static final int RE_EXTRACT_COUNT = 84931846;
    public static final int SDK_INIT_READY = 4063745;
    public static final int START = 39408853;
    public static final int UNKNOWN = -1;
    public static final int UPDATE_EXISTS = 59143030;
    public static final int UPDATE_FAILED_CODE = 14038384;
    public static final int UPDATE_HEAD_VALIDITY = 50903368;
    public static final int UPDATE_START = 63818335;
    public static final int UPDATE_SUCCESS = 70293340;
    public static final int USE_PRELOAD_CORE_DEX = 73158925;
    public static final int USE_PRELOAD_CORE_SO = 69787910;

    /* loaded from: classes9.dex */
    public static final class Helper {
        public static final String desc(int i) {
            return String.valueOf(i);
        }
    }
}
