package com.taobao.taolive.room.business.goodcard;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.adapter.network.d;
import tb.kge;

/* loaded from: classes8.dex */
public class a extends com.taobao.taolive.sdk.business.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1062286282);
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
        LiveRecommendGoodCardRequest liveRecommendGoodCardRequest = new LiveRecommendGoodCardRequest();
        liveRecommendGoodCardRequest.tppParam = str;
        a(0, (INetDataObject) liveRecommendGoodCardRequest, LiveRecommendGoodCardResponse.class, true, true);
    }
}
