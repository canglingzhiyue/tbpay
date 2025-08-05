package com.alibaba.android.aura;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.List;
import java.util.Map;
import tb.ark;

/* loaded from: classes2.dex */
public interface IAURAPluginCenter extends Serializable {
    Map<String, Class<? extends ark>> extensionImplMap();

    Map<String, AbstractMap.SimpleEntry<String, Class<? extends ark>>> extensionMap();

    Map<Class, List<Class<? extends IAURAInputField>>> inputFieldsTargetClass();

    Map<String, Class<? extends n>> serviceMap();
}
