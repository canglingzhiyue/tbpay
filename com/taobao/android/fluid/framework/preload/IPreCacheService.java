package com.taobao.android.fluid.framework.preload;

import com.taobao.android.fluid.business.intelligence.netpredict.NetFactor;
import com.taobao.android.fluid.core.FluidService;
import com.taobao.android.fluid.framework.preload.cache.DetailCacheData;
import java.util.List;

/* loaded from: classes5.dex */
public interface IPreCacheService extends FluidService {
    void downloadCacheVideo(String str);

    boolean enablePreCache();

    boolean enablePreloadVideoUseCache();

    void exposedDeleteCacheData(String str);

    DetailCacheData getCacheData();

    boolean isWeakNetWork(NetFactor netFactor);

    void pickCacheData();

    void saveUnExposeDetailCache(List<com.taobao.android.fluid.framework.data.datamodel.a> list, int i);
}
