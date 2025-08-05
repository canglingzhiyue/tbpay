package com.taobao.android.live.plugin.atype.flexalocal.good.business;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes4.dex */
public class g extends com.taobao.taolive.sdk.business.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1451697808);
    }

    public g(com.taobao.taolive.sdk.adapter.network.d dVar) {
        super(dVar);
    }

    public void a(String str, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a352e032", new Object[]{this, str, new Long(j), new Long(j2)});
            return;
        }
        LiveItemPersonalityGetRequest liveItemPersonalityGetRequest = new LiveItemPersonalityGetRequest();
        liveItemPersonalityGetRequest.itemIds = str;
        liveItemPersonalityGetRequest.creatorId = j;
        liveItemPersonalityGetRequest.liveId = j2;
        a(1, liveItemPersonalityGetRequest, LiveItemPersonalityGetResponse.class);
    }
}
