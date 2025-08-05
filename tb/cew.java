package tb;

import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public interface cew {

    /* loaded from: classes.dex */
    public interface a {
        public static final boolean CONFIG_ACCS_BETA_ENABLE = true;
        public static final boolean CONFIG_ACCS_GREY_ENABLE_DEFAULT = true;
        public static final boolean CONFIG_ACCS_WHITELIST_ENABLE = true;
        public static final int CONFIG_ACTIVATET_PAGE_TRACK_HISTORY_SIZE = 10;
        public static final boolean CONFIG_CANCEL_BG_DOWNLOAD_EXPERIMENT_DEFAULT = false;
        public static final boolean CONFIG_CLEAR_RETAIN_BEFORE_REFRESH = true;
        public static final boolean CONFIG_COLD_WORK_ENABLE = true;
        public static final boolean CONFIG_COMMIT_THROWABLE_ENABLE = true;
        public static final boolean CONFIG_DATA_TRIGGER_ENABLED_DEFAULT = true;
        public static final boolean CONFIG_DB_HIT_COUNT_DEFAULT = true;
        public static final long CONFIG_DOWNLOAD_EXPERIMENT_DATA_DELAY_TIME_DEFAULT = 60000;
        public static final boolean CONFIG_DROP_ON_INSERT_FAIL_ENABLE_DEFAULT = true;
        public static final boolean CONFIG_ENABLED_DEFAULT = true;
        public static final boolean CONFIG_ENCODE_URL_EXPERIMENT = true;
        public static final boolean CONFIG_EVO_ACTIVATE_CLIENT_ENABLED_DEFAULT = true;
        public static final boolean CONFIG_EVO_ACTIVATE_SERVER_ENABLED_DEFAULT = true;
        public static final boolean CONFIG_LAZY_LOAD_ENABLE = true;
        public static final boolean CONFIG_MTOP_INDEX_ENABLE_DEFAULT = true;
        public static final boolean CONFIG_NAV_ENABLED_DEFAULT = true;
        public static final boolean CONFIG_NAV_V2_ENABLED = true;
        public static final boolean CONFIG_PARAM_REGEX_MATCH_ENABLE_DEFAULT = true;
        public static final boolean CONFIG_PARSE_DB_CONFIG_WHEN_USING_DEFAULT = true;
        public static final boolean CONFIG_PRELOAD_LAUNCH_EXPERIMENT = true;
        public static final boolean CONFIG_PRE_DECISION_ENABLE_DEFAULT = false;
        public static final long CONFIG_PROTOCOL_COMPLETE_INTERVAL_TIME = 86400000;
        public static final boolean CONFIG_RENOVATE_EXP_MERGE_ENABLE = true;
        public static final long CONFIG_REQUEST_EXPERIMENT_DATA_INTERVAL_TIME_DEFAULT = 180000;
        public static final boolean CONFIG_RETAIN_EXPERIMENT_ENABLE = true;
        public static final boolean CONFIG_ROLLBACK_LAST_FIX = false;
        public static final boolean CONFIG_STABILITY_MONITOR_ENABLED_DEFAULT = false;
        public static final boolean CONFIG_SUPPORT_VARIATION_CONFIG_ENABLE_DEFAULT = true;
        public static final boolean CONFIG_SWITCH_VARIATION_ENABLE = true;
        public static final boolean CONFIG_TRACK_1022_ENABLE_DEFAULT = true;
        public static final long CONFIG_TRACK_1022_INTERVAL_TIME = 600000;
        public static final boolean CONFIG_TRACK_APP_ENABLED_DEFAULT = true;
        public static final boolean CONFIG_TRACK_AUTO_ENABLED_DEFAULT = true;
        public static final boolean CONFIG_UNDECODE_URL_PARAM_ENABLE = false;
        public static final boolean CONFIG_URL_PARSE_ERROR_TO_DP2 = true;
        public static final boolean CONFIG_URL_PREFIX_TRACK_DEFAULT = true;
        public static final boolean CONFIG_USERTRACK_PAGE_LIFECYCLE_LISTENER_ENABLED_DEFAULT = true;
        public static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");
        public static final String DEFAULT_VARIATION_NAME = "bucket";
        public static final String MULTIPROCESS_CLIENT_CLASSNAME = "com.alibaba.ut.abtest.multiprocess.UTABMultiProcessClientImpl";
        public static final String PUSHCLIENT_CLASSNAME = "com.alibaba.ut.abtest.push.UTABPushClientImpl";
        public static final String TRACK_PREFIX = "aliabtest";
        public static final String URI_PARAMNAME_ABTEST = "utabtest";
    }
}
