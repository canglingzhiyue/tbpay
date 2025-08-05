package com.taobao.tao.flexbox.layoutmanager.container;

import java.util.Arrays;
import java.util.List;
import tb.kge;

/* loaded from: classes8.dex */
public class b {
    public static final String BIZVERSION = "bizVersion";
    public static final String ENV = "env";
    public static final String KEY_ACTIONS = "actions";
    public static final String KEY_ANIMATION = "animation";
    public static final String KEY_CACHE_DATA = "cacheData";
    public static final String KEY_CSP_ID = "cspId";
    public static final String KEY_ENGINE_PRELOAD = "tnodePreloadKey";
    public static final String KEY_LAYOUT = "tnode";
    public static final String KEY_LAYOUT_URL = "layout";
    public static final String KEY_LOAD_TYPE = "loadType";
    public static final String KEY_MENU = "menu";
    public static final String KEY_NODE_ID = "nodeId";
    public static final String KEY_OPTION = "option";
    public static final String KEY_PAGE_ID = "pageId";
    public static final String KEY_PAGE_NAME = "pageName";
    public static final String KEY_PAGINATION = "pagination";
    public static final String KEY_PREFETCH_ALREADY = "tnodePrefetch";
    public static final String KEY_TITLE = "title";
    public static final String KEY_URL_CONFIG_CACHE_KEY = "tnodeUrlConfigKey";
    public static final int MAX_COLLAPSE_SCROLL_HEIGHT = 80;
    public static final String PARAMS = "params";
    public static final List<String> sIgnoreBizQuery;
    public static final List<String> sIgnoreTNodeQuery;

    static {
        kge.a(358840878);
        sIgnoreBizQuery = Arrays.asList(KEY_URL_CONFIG_CACHE_KEY, KEY_PREFETCH_ALREADY);
        sIgnoreTNodeQuery = Arrays.asList(KEY_ENGINE_PRELOAD);
    }
}
