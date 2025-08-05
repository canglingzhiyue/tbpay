package com.taobao.search.musie;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1109151037);
    }

    public void a(com.taobao.android.xsearchplugin.muise.a aVar, boolean z) {
        Float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2e481d3", new Object[]{this, aVar, new Boolean(z)});
            return;
        }
        if (z) {
            com.taobao.search.common.util.m mVar = com.taobao.search.common.util.m.INSTANCE;
            f = Float.valueOf(com.taobao.search.common.util.m.b(true));
        } else {
            f = null;
        }
        aVar.a(f);
    }
}
