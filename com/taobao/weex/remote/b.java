package com.taobao.weex.remote;

import com.taobao.weex.bridge.ModuleFactory;
import com.taobao.weex.common.WXModule;
import com.taobao.weex.ui.IFComponentHolder;
import java.util.Map;

/* loaded from: classes9.dex */
public interface b {
    boolean isInitializedImpl();

    boolean registerComponent(String str, IFComponentHolder iFComponentHolder, Map<String, Object> map);

    <T extends WXModule> boolean registerModuleImpl(String str, ModuleFactory moduleFactory, boolean z);

    boolean registerServiceImpl(String str, String str2, Map<String, Object> map);

    void reloadImpl();
}
