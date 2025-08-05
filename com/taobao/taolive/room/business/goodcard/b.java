package com.taobao.taolive.room.business.goodcard;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.goodlist.TemplateListResponse;
import tb.kge;

/* loaded from: classes8.dex */
public class b extends com.taobao.taolive.sdk.business.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(28971079);
    }

    public b(d dVar) {
        super(dVar);
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        GoodItemSubscribeRequest goodItemSubscribeRequest = new GoodItemSubscribeRequest();
        goodItemSubscribeRequest.activityDetailId = str;
        goodItemSubscribeRequest.userId = str2;
        a(1, goodItemSubscribeRequest, TemplateListResponse.class);
    }
}
