package com.taobao.android.fluid.framework.performance.config;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.kge;

/* loaded from: classes5.dex */
public class PerfConst {
    public static final int BETA_VERSION_LENGTH = 4;
    public static final String FEATURE_EXPOSEDATA_NOT_DOWNLLOAD = "exposedataNotDownlload";
    public static final String FEATURE_FIX_CACHE_MEDIASET = "fixCacheMediaSet";
    public static final String FEATURE_ONLY_CACHE_TAB3 = "onlyCacheTab3";
    public static final String FEATURE_PREDOWNLOAD_TO_CACHE = "predownloadToCache";
    public static final String FEATURE_PRELOAD_AFTER_EXPIRED = "preloadAfterExpired";
    public static final String FEATURE_RECOVER_CACHE_SAVE_GET_OPT = "recoverCacheSaveGet10_40_0";
    public static final String FEATURE_SAVE_CACHE_DYNAMIC_RECOMMEND = "saveCacheDynamicRecommend";
    public static final String FEATURE_SAVE_DOWNLOAD_ERROR_STATE = "saveDownloadErrorState";
    public static final String FEATURE_VIDEOCACHE_FIRST = "videoCacheFirst";
    public static final String FEATURE_WARMUP_PLAYER_CACHE_SERVER = "warmUpPlayerCacheServer";
    public static final String FEATURE_WARMUP_PLAYER_SO = "warmUpPlayerSo";
    public static final int FIRST_CARD_DELAY_TIME_FACTOR = 2;
    public static final int FRAME_BIZ_RECORD_TIME_LIMIT = 5;
    public static final int FRAME_BUSY_MODE_COUNT = 12;
    public static final float FRAME_DEFAULT_HIGH_TASK_TIME = 4.0f;
    public static final float FRAME_DEFAULT_LOW_TASK_TIME = 1.0f;
    public static final int FRAME_DEFAULT_MAX_GAP = 500;
    public static final float FRAME_DEFAULT_MID_TASK_TIME = 2.0f;
    public static final float FRAME_FREE_FACTOR = 0.5f;
    public static final int FRAME_MAX_GAP_FINGER_PLAY = 200;
    public static final int FRAME_MAX_GAP_HIGH_DEVICE_FACTOR = 2;
    public static final int FRAME_MAX_GAP_LOW_PRIORITY_MESSAGE = 300;
    public static final int FRAME_MAX_GAP_MID_PRIORITY_MESSAGE = 180;
    public static final int FRAME_MAX_GAP_PLAYER_DESTROY = 200;
    public static final int FRAME_MAX_GAP_PLAYER_PAUSE = 200;
    public static final int FRAME_MAX_GAP_SMARTMODEL = 500;
    public static final int FRAME_MAX_GAP_TRACKER_UPDATE = 300;
    public static final int HIGH_DEVICE_FRAME_MAX_TASK_COUNT = 2;
    public static final float HIGH_DEVICE_FRAME_TIME_EXPEND_FACTOR = 0.5f;
    public static final int HIGH_DEVICE_SCORE = 80;
    public static final int HIGH_REFRESH_RATE_VALUE = 110;
    public static final int LOW_DEVICE_FRAME_MAX_TASK_COUNT = 3;
    public static final float LOW_DEVICE_FRAME_TIME_EXPEND_FACTOR = 1.0f;
    public static final int METRIC_SAMPLE_FRAME_SCHEDULE_DENOMINATOR = 100000;
    public static final int METRIC_SAMPLE_FRAME_SCHEDULE_NUMERATOR = 1;
    public static final int METRIC_SAMPLE_FRAME_SCHEDULE_NUMERATOR_FOR_BETA = 1000;
    public static final int MILLSECONS_IN_SECONDS = 1000;
    public static final int MSG_FAST_CHECK = 10003;
    public static final int MSG_LOAD_FINISH_FROM_DEFAULT = 10001;
    public static final int MSG_LOAD_FINISH_FROM_FIRSTRENDER = 10002;
    public static final int MSG_PRELOAD_CARD = 100;
    public static final int NANOS_TO_100US = 100000;
    public static final int PREFETCH_HIT_FASTSCROLL_COUNT = 3;
    public static final int PRE_FEFETCH_ACTIVE_INDEX_DEFAULT = 0;
    public static final String RUN_TYPE_DEADLIINE = "deadline";
    public static final String RUN_TYPE_DEFAULT = "default";
    public static final String RUN_TYPE_FLUSH = "flush";
    public static final String TAG_PERF_SMOOTH = "PerfSmooth";
    public static final int TIME_FAST_SCROLL_CHECK = 3000;
    public static final int TYPE_LOAD_FINISH_FROM_DEFAULT = 1001;
    public static final int TYPE_LOAD_FINISH_FROM_FIRSTRENDER = 1002;
    public static final float WINDOW_REFRESH_RATE_120 = 120.0f;
    public static final float WINDOW_REFRESH_RATE_60 = 60.0f;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface FeatureName {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface FrameTaskDoneType {
    }

    static {
        kge.a(-638980107);
    }
}
