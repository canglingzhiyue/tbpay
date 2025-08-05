package com.taobao.mytaobao.basement;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes7.dex */
public interface BasementConstants {
    public static final String BEHAVIOR_APPEAR = "appear";
    public static final String BEHAVIOR_BACK_PRESS = "backPress";
    public static final String BEHAVIOR_CHANGE_ACCOUNT = "changeAccount";
    public static final String BEHAVIOR_DISAPPEAR = "disappear";
    public static final String BEHAVIOR_HEADER_TAP = "headerTap";
    public static final String BEHAVIOR_MTB_TAB_DOUBLE_TAP = "mtbTabDoubleTap";
    public static final String BEHAVIOR_MTB_TAB_TAP = "mtbTabTap";
    public static final String BEHAVIOR_RELEASE_MEMORY = "releaseMemory";
    public static final String BEHAVIOR_RENDER_SUCCESS_BACKGROUND = "renderSuccessBackground";
    public static final String BEHAVIOR_RENDER_SUCCESS_FOREGROUND = "renderSuccessForeground";
    public static final String BEHAVIOR_RETURN_TOP_TAP = "returnTopTap";
    public static final String BEHAVIOR_SCROLL = "scroll";
    public static final String INIT_BY_CACHE = "initByCache";
    public static final String INIT_BY_ERROR_RELOAD = "initByErrorReload";
    public static final String INIT_BY_MEMORY_RELEASE_RECOVERY = "initByMemoryReleaseRecovery";
    public static final String INIT_BY_MTOP = "initByMTop";
    public static final String SPM = "friendsquare.27994277.0.0";
    public static final String TAG = "basementLog";
    public static final String WEEX_TAG = "basementWeexLog";

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface InitBy {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface PageBehavior {
    }
}
