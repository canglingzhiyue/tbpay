package com.taobao.android.ai.api;

import android.support.v7.widget.RecyclerView;
import com.taobao.android.ai.behavir.cache.a;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import java.util.Map;
import tb.ope;
import tb.osm;

/* loaded from: classes4.dex */
public interface IAfterBuyAiApi {
    void addAISolutionBizParam(String str, Map<String, Object> map);

    void aiRefreshInsert(String str, RecyclerView recyclerView);

    void checkConfig();

    void clearBufferList();

    void clearMemoryBufferList(String str);

    void init(osm osmVar, ope opeVar);

    void initDiskBufferListToMemory(boolean z, String str, a.a aVar);

    void preloadModel(String str, AwesomeGetContainerData awesomeGetContainerData);

    void registerBehavirSolution();

    void resetAiRefreshDeltaData(String str);

    void unRegisterBehavirSolution();

    void updateContainer();

    void updateContainerType();
}
