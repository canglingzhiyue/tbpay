package com.taobao.avplayer;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.taobaoavsdk.CodeUsageCounter;
import tb.kck;
import tb.kge;

/* loaded from: classes6.dex */
public class i implements com.taobao.avplayer.common.f {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ADD_CART_BROADCAST_ACTION = "com.taobao.avplayer.DWEventAdapter.addCart";

    static {
        kge.a(-1626487858);
        kge.a(41228851);
    }

    @Override // com.taobao.avplayer.common.f
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        CodeUsageCounter.a().a(CodeUsageCounter.componentName.dw_adapter_DWEventAdapter);
        if (StringUtils.isEmpty(str) || kck.f29959a == null) {
            return;
        }
        Nav.from(kck.f29959a).toUri(str.trim());
    }
}
