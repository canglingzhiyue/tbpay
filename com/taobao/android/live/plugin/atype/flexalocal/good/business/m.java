package com.taobao.android.live.plugin.atype.flexalocal.good.business;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes4.dex */
public class m extends com.taobao.taolive.sdk.business.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(494243608);
    }

    public m(com.taobao.taolive.sdk.adapter.network.d dVar) {
        super(dVar);
    }

    public void a(com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c193d23", new Object[]{this, cVar, str, str2});
            return;
        }
        GoodsItemCardQueryRequest goodsItemCardQueryRequest = new GoodsItemCardQueryRequest();
        goodsItemCardQueryRequest.liveId = cVar.l.i();
        goodsItemCardQueryRequest.itemIdList = str;
        goodsItemCardQueryRequest.liveSource = cVar.v();
        goodsItemCardQueryRequest.entryLiveSource = cVar.u();
        goodsItemCardQueryRequest.smallCardItemType = str2;
        a(1, (INetDataObject) goodsItemCardQueryRequest, EnterLiveItemResponse.class, false, true);
    }
}
