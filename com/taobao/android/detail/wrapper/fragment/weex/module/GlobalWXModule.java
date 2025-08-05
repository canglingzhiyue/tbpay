package com.taobao.android.detail.wrapper.fragment.weex.module;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.a;
import com.taobao.android.trade.event.f;
import com.taobao.weex.common.WXModule;
import com.taobao.weex.common.WXModuleAnno;
import tb.emu;
import tb.enu;
import tb.kge;

/* loaded from: classes5.dex */
public class GlobalWXModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(289470173);
    }

    public GlobalWXModule() {
        emu.a("com.taobao.android.detail.wrapper.fragment.weex.module.GlobalWXModule");
    }

    @WXModuleAnno
    public void openUrlByNav(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0f474d8", new Object[]{this, str});
        } else {
            f.a(a.b().f9418a, new enu(str));
        }
    }
}
