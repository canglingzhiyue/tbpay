package com.alibaba.android.umf;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Map;
import tb.bqg;
import tb.bqo;

/* loaded from: classes2.dex */
public interface IUMFPluginCenter extends Serializable {
    Map<String, Class<? extends bqg>> extensionImplMap();

    Map<String, AbstractMap.SimpleEntry<String, Class<? extends bqg>>> extensionMap();

    Map<String, Class<? extends bqo>> serviceMap();
}
