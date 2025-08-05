package com.taobao.android.live.plugin.atype.flexalocal.good.business.hotItemSubscribe;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.business.b;
import com.taobao.taolive.sdk.goodlist.TemplateListResponse;
import tb.kge;

/* loaded from: classes4.dex */
public class a extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1223362234);
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
        HotItemSubscribeRequest hotItemSubscribeRequest = new HotItemSubscribeRequest();
        hotItemSubscribeRequest.activityDetailId = str;
        hotItemSubscribeRequest.userId = str2;
        a(1, hotItemSubscribeRequest, TemplateListResponse.class);
    }
}
