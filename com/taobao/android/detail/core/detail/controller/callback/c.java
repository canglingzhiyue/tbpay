package com.taobao.android.detail.core.detail.controller.callback;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.performance.l;
import com.taobao.android.detail.core.utils.i;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class c extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1020509983);
    }

    public c() {
        emu.a("com.taobao.android.detail.core.detail.controller.callback.DetailPreloadDataHandleCallback");
    }

    @Override // com.taobao.android.detail.core.detail.controller.callback.a
    public void a(DetailCoreActivity detailCoreActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("349c12f3", new Object[]{this, detailCoreActivity});
            return;
        }
        String a2 = l.a("DetailPreloadDataHandleCallback");
        i.c(a2, "current thread:" + Thread.currentThread());
        com.taobao.android.detail.core.perf.c.b(detailCoreActivity, "cache_networkRequest", "ProductDetail_FirstScreen_Cache");
    }
}
