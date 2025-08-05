package com.alibaba.poplayer.norm;

import com.alibaba.poplayer.config.fetch.a;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public interface INewConfigAdapter {
    String getConfigItemById(String str);

    Set<String> getConfigsIdSet();

    String getCurConfigVersion();

    Map<String, Set<String>> getUriConfigsMap();

    void init();

    void startFetchConfig(a aVar);
}
