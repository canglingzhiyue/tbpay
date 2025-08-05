package com.taobao.android.live.plugin.atype.flexalocal.liveend;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.business.b;
import tb.kge;

/* loaded from: classes6.dex */
public class a extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-965324167);
    }

    public a(d dVar) {
        super(dVar);
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        LiveEndRecommendRequest liveEndRecommendRequest = new LiveEndRecommendRequest();
        liveEndRecommendRequest.liveId = str;
        liveEndRecommendRequest.tppParam = str2;
        a(0, liveEndRecommendRequest, LiveEndRecommendResponse.class);
    }
}
