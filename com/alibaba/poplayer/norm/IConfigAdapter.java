package com.alibaba.poplayer.norm;

import com.alibaba.poplayer.config.fetch.a;

/* loaded from: classes.dex */
public interface IConfigAdapter {
    String getConfigItemById(String str);

    String getConfigsIdSetString();

    void init(a aVar);

    void startFetchConfig();
}
