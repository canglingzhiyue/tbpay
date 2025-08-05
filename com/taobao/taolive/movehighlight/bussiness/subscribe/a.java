package com.taobao.taolive.movehighlight.bussiness.subscribe;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.business.b;
import com.taobao.taolive.sdk.goodlist.TemplateListResponse;
import tb.kge;

/* loaded from: classes8.dex */
public class a extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(431978438);
    }

    public a(d dVar) {
        super(dVar);
    }

    public void a(long j, long j2, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49f68bb6", new Object[]{this, new Long(j), new Long(j2), new Boolean(z), str});
            return;
        }
        PreSaleSubscribeRequest preSaleSubscribeRequest = new PreSaleSubscribeRequest();
        preSaleSubscribeRequest.liveId = j;
        preSaleSubscribeRequest.itemId = j2;
        preSaleSubscribeRequest.source = str;
        preSaleSubscribeRequest.ctl = z ? "add" : "cancel";
        a(1, preSaleSubscribeRequest, TemplateListResponse.class);
    }
}
