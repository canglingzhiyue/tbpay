package com.taobao.android.live.plugin.atype.flexalocal.comments.chat.sale;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.d;
import tb.kge;

/* loaded from: classes5.dex */
public class a extends com.taobao.taolive.sdk.business.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1373303255);
    }

    public a(d dVar) {
        super(dVar);
    }

    public void a(String str, String str2, String str3, boolean z, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("436a1d98", new Object[]{this, str, str2, str3, new Boolean(z), str4});
            return;
        }
        BottomHotSaleRequest bottomHotSaleRequest = new BottomHotSaleRequest();
        bottomHotSaleRequest.liveId = str;
        bottomHotSaleRequest.anchorId = str2;
        bottomHotSaleRequest.bizType = str3;
        bottomHotSaleRequest.entryForFirst = z;
        bottomHotSaleRequest.lastItemIds = str4;
        a(1, bottomHotSaleRequest, BottomHotSaleResponse.class);
    }
}
