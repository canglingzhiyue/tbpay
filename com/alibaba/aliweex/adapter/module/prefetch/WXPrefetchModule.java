package com.alibaba.aliweex.adapter.module.prefetch;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKEngine;
import java.util.List;
import tb.kge;

/* loaded from: classes2.dex */
public class WXPrefetchModule extends WXSDKEngine.DestroyableModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1142204662);
    }

    public void addTask(String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcdeeac8", new Object[]{this, str, list});
        }
    }

    @Override // com.taobao.weex.common.Destroyable
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }
}
