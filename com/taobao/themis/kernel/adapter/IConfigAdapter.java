package com.taobao.themis.kernel.adapter;

import com.taobao.themis.kernel.basic.DefaultAdapterImpl;
import java.util.Map;

@DefaultAdapterImpl("com.taobao.themis.inside.adapter.TMSOrangeImpl")
/* loaded from: classes9.dex */
public interface IConfigAdapter extends com.taobao.themis.kernel.basic.a {

    /* loaded from: classes9.dex */
    public interface a {
        void a(Map<String, String> map);
    }

    String getConfigByGroupAndName(String str, String str2, String str3);

    String getConfigByGroupAndNameFromLocal(String str, String str2, String str3);

    Map<String, String> getConfigs(String str);

    String getCustomConfig(String str, String str2);

    void registerListener(String str, a aVar);

    void unregisterListener(String str);
}
