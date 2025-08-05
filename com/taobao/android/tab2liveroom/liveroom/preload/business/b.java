package com.taobao.android.tab2liveroom.liveroom.preload.business;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.d;
import tb.kge;

/* loaded from: classes6.dex */
public class b extends com.taobao.taolive.sdk.business.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1094756108);
    }

    public b(d dVar) {
        super(dVar);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            a(1, new PreloadRecommendRequest(), PreloadRecommendResponse.class);
        }
    }
}
