package com.uc.webview.base.timing;

/* loaded from: classes9.dex */
public interface PageLoadTimingKeys {
    public static final String PREFIX_TIMING = "x-uctiming-";
    public static final String PREFIX_UC = "uc-";
    public static final int TIMING_FROM_WEB_COMPASS = 29948979;
    public static final int TIMING_IS_LAUNCH_FROM_BROWSER = 83928006;
    public static final int TIMING_LOAD_AWCONTENT_LOAD_URL = 63568502;
    public static final int TIMING_LOAD_NAVIGATION_START = 46938875;
    public static final int TIMING_LOAD_NAVIGATION_START_FIRST_IN = 19085380;
    public static final int TIMING_LOAD_NAVIGATION_START_JAVA = 61445508;
    public static final int TIMING_LOAD_NAVIGATION_START_LAST_IN = 40617610;
    public static final int TIMING_LOAD_NETWORK_CACHETRANS_RESPONSE = 41784873;
    public static final int TIMING_LOAD_NETWORK_CACHETRANS_START = 44882083;
    public static final int TIMING_LOAD_NETWORK_IN = 33360243;
    public static final int TIMING_LOAD_NETWORK_MISSILETRANS_RESPONSE = 60180251;
    public static final int TIMING_LOAD_NETWORK_MISSILETRANS_START = 94786002;
    public static final int TIMING_LOAD_NETWORK_NETTRANS_RESPONSE = 33580860;
    public static final int TIMING_LOAD_NETWORK_NETTRANS_START = 42472804;
    public static final int TIMING_LOAD_NETWORK_OUT = 88943559;
    public static final int TIMING_LOAD_PAGECACHE_BEGIN = 8972689;
    public static final int TIMING_LOAD_PAGECACHE_END = 15053259;
    public static final int TIMING_LOAD_RENDER_COMMIT = 11948182;
    public static final int TIMING_LOAD_SHOULD_OVERRIDE_BEGIN = 56398336;
    public static final int TIMING_LOAD_SHOULD_OVERRIDE_END = 43058228;
    public static final int TIMING_LOAD_UI_2_NET = 96222307;
    public static final int TIMING_LOAD_UI_COMMIT = 79237528;
    public static final int TIMING_LOAD_UI_RT_IN = 54085494;
    public static final int TIMING_LOAD_URL_ON_MAIN_THREAD = 44426668;
    public static final int TIMING_LOAD_URL_START = 17097300;
    public static final int TIMING_LOAD_WEBVIEW_LOAD_URL = 27440108;
    public static final int TIMING_NET_SHOULD_INTERCEPT_BEGIN = 9986514;
    public static final int TIMING_NET_SHOULD_INTERCEPT_END = 75809331;
    public static final int TIMING_PRE_RENDER_OPTION = 53189224;
    public static final int TIMING_RENDER_PROC_STRATEGY = 27023707;
    public static final int TIMING_SHELL_BUSINESS_HEADERS = 42502312;
    public static final int TIMING_SHELL_TO_MISSILE_HEADERS = 81363536;
    public static final String UC_MISSILE_POLICY = "uc-missile-policy";

    /* loaded from: classes9.dex */
    public static final class Helper {
        public static final String desc(int i) {
            return String.valueOf(i);
        }

        public static final boolean hasExtraInfoPrefix(String str) {
            return hasPrefixTiming(str) || hasPrefixUc(str);
        }

        public static final boolean hasPrefixTiming(String str) {
            return str != null && str.startsWith(PageLoadTimingKeys.PREFIX_TIMING);
        }

        public static final boolean hasPrefixUc(String str) {
            return str != null && str.startsWith(PageLoadTimingKeys.PREFIX_UC);
        }

        public static final String key(int i) {
            return PageLoadTimingKeys.PREFIX_TIMING + String.valueOf(i);
        }
    }
}
