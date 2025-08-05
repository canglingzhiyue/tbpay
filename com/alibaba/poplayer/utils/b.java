package com.alibaba.poplayer.utils;

import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MONITOR_ADAPTER_VERSION = "adapter_version";
    public static final String MONITOR_BLACKLIST = "black_list";
    public static final String MONITOR_CONFIG_ITEMS = "config_items";
    public static final String MONITOR_CONFIG_ITEM_LOADED = "config_items_loaded";
    public static final String MONITOR_CONFIG_SET = "config_set";
    public static final String MONITOR_CONFIG_SET_NEW = "config_set_new";
    public static final String MONITOR_CONFIG_URI_ITEM_LOADED = "config_uri_items_loaded";
    public static final String MONITOR_NATIVE_URL = "native_url";
    public static final String MONITOR_PAGE = "page";
    public static final String MONITOR_PAGE_FRAGMENT = "page_fragment";
    public static final String MONITOR_PAGE_ORANGE_VERSION = "page_orange_version";
    public static final String MONITOR_PAGE_ORANGE_VERSION_NEW = "page_orange_version_new";
    public static final String MONITOR_TIMEZONE = "timezone";
    public static final String MONITOR_TIME_TRAVEL_SEC = "time_travel_sec";
    public static final String MONITOR_VERSION = "version";

    static {
        kge.a(-1318678901);
    }

    public static boolean a(BaseConfigItem baseConfigItem) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d997a272", new Object[]{baseConfigItem})).booleanValue() : (baseConfigItem == null || baseConfigItem.debugInfo == null || !baseConfigItem.debugInfo.contains("force_display")) ? false : true;
    }
}
