package com.taobao.android.live.plugin.atype.flexalocal.giftwish;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.business.b;
import java.util.List;
import tb.kge;

/* loaded from: classes5.dex */
public class a extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2136876357);
    }

    public a(d dVar) {
        super(dVar);
    }

    public void a(String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1aa3523", new Object[]{this, str, list});
            return;
        }
        GiftWishQueryRequest giftWishQueryRequest = new GiftWishQueryRequest();
        giftWishQueryRequest.liveId = str;
        giftWishQueryRequest.activityTypes = list;
        giftWishQueryRequest.location = com.taobao.mmad.data.b.TYPE_BANNER;
        a(1, giftWishQueryRequest, GiftWishQueryResponse.class);
    }
}
