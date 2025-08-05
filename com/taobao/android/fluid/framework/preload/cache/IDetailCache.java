package com.taobao.android.fluid.framework.preload.cache;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* loaded from: classes5.dex */
public interface IDetailCache {
    public static final String CACHE_VERSION = "1";
    public static final int KEEP_MIN_HAS_CACHE_COUNT = 2;
    public static final int KEEP_MIN_HAS_CACHE_TIME = 21600000;
    public static final int KEEP_MIN_OLD_CACHE_COUNT = 2;
    public static final String SCENE_NAME_ICON_STREAM_PRELOAD_VIDEO = "shortvideo_detail_cache_icon_stream";
    public static final String SCENE_NAME_SHORT_VIDEO_INTERNAL_EXPOSED = "shortvideo_cache_internal_exposed";
    public static final String SCENE_NAME_SHORT_VIDEO_INTERNAL_UNEXPOSED = "shortvideo_cache_internal_unexposed";
    public static final String SCENE_NAME_SHORT_VIDEO_PRECACHE_UNEXPOSED = "shortvideo_precache_download_unexposed";
    public static final String TAG_CACHE = "[cachevideo]";

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface CacheSceneName {
    }

    String a();

    void a(DetailCacheData detailCacheData);

    void a(String str);

    void a(String str, int i, String str2);

    void a(List<DetailCacheData> list);

    DetailCacheData b();

    DetailCacheData c();
}
