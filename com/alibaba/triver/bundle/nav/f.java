package com.alibaba.triver.bundle.nav;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.r;
import tb.kge;

/* loaded from: classes3.dex */
public class f extends r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-649455963);
    }

    @Override // com.taobao.android.nav.r, com.taobao.android.nav.p
    public boolean hostFilter(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c0d619d5", new Object[]{this, str})).booleanValue() : str.equals("openMiniAppIdeDebugInfo") || str.equals("miniAppIDEDebug");
    }
}
