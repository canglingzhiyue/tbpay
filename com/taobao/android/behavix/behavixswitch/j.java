package com.taobao.android.behavix.behavixswitch;

import java.util.Set;
import tb.kge;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    public static final Set<String> f9178a;
    public static final Set<String> allCppOrangeBlackKeys;
    public static final Set<String> allOrangeNoNeedKeys;

    /* loaded from: classes4.dex */
    public interface a {
        public static final String K_BEHAVIX_CONFIG = "behaviXConfig";
        public static final String K_NODE_FILTERS = "nodeFilters";
        public static final String K_TABLE_CONFIG = "tableConfig";
        public static final String K_UT_EVENT_FILTERS = "utEventFilters";
        public static final String K_UT_LISTEN_EVENT_IDS = "utListenEventIds";
    }

    /* loaded from: classes4.dex */
    public interface b {
        public static final String K_BACKGROUND_SWITCH = "backgroundSwitch";
        public static final String K_ENABLE_ALL_DATA = "enableAllData";
        public static final String K_ENABLE_CHANGE_UTLISTENER = "enableChangeUTListener";
        public static final String K_ENABLE_MIDDLEWARE_EVENT = "enableMiddlewareEvent";
        public static final String K_ENABLE_REGISTER_UTPLUGIN = "enableRegisterUTPlugin";
        public static final String K_ENABLE_SWITCH_FIRST = "enableSwitchFirst";
        public static final String K_FRAGMENT_WAIT = "fragmentWait";
        public static final String K_NATIVE_ALGO_NAMES = "nativeAlgoNames";
        public static final String K_UPP_HUB_REQUEST = "enableUppHubRequest";
    }

    /* loaded from: classes4.dex */
    public interface c {
        public static final String K_BHX_DATA_CHANNEL_SETTINGS = "BHXDataChannelSettings";
        public static final String K_BHX_DATA_CHANNEL_WHITE_LIST = "BHXDataChannelWhiteList";
        public static final String K_BIZARGS_CONFIG = "bizArgsConfig";
        public static final String K_BR_ACTIVITY_MONITOR_NAMES = "brActivityMonitorNames";
        public static final String K_BUFS_GEN_PROTOCOL = "bhxcxxBUFSGenProtocol";
        public static final String K_FEATURE_TABLE_CONFIGS = "featureTableConfigs";
    }

    static {
        kge.a(1196441372);
        allCppOrangeBlackKeys = com.taobao.android.behavix.j.a(a.class);
        allOrangeNoNeedKeys = com.taobao.android.behavix.j.a(c.class);
        f9178a = com.taobao.android.behavix.j.a(b.class);
    }
}
