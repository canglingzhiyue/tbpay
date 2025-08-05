package com.taobao.android.live.plugin.atype.flexalocal.comments.goodrecommend;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.d;
import tb.kge;

/* loaded from: classes5.dex */
public class a extends com.taobao.taolive.sdk.business.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-156568608);
    }

    public a(d dVar) {
        super(dVar);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        GoodRecommendRequest goodRecommendRequest = new GoodRecommendRequest();
        goodRecommendRequest.liveId = str;
        a(1, goodRecommendRequest, GoodRecommendResponse.class);
    }
}
