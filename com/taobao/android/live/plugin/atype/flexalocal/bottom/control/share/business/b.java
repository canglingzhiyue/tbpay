package com.taobao.android.live.plugin.atype.flexalocal.bottom.control.share.business;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.d;
import tb.kge;

/* loaded from: classes5.dex */
public class b extends com.taobao.taolive.sdk.business.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(490109621);
    }

    public b(d dVar) {
        super(dVar);
    }

    public void a(ShareReturnRequest shareReturnRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6317f62", new Object[]{this, shareReturnRequest});
        } else {
            a(0, shareReturnRequest, ShareReturnResponse.class);
        }
    }
}
