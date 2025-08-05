package com.taobao.android.live.plugin.atype.flexalocal.good.business;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.kge;

/* loaded from: classes4.dex */
public class f extends com.taobao.taolive.sdk.business.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2016124580);
    }

    public f(com.taobao.taolive.sdk.adapter.network.d dVar) {
        super(dVar);
    }

    public void a(com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar, List<String> list, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38271054", new Object[]{this, cVar, list, new Boolean(z)});
            return;
        }
        LiveItemCategoriesRequest liveItemCategoriesRequest = new LiveItemCategoriesRequest();
        if (cVar != null) {
            liveItemCategoriesRequest.liveId = cVar.g();
            liveItemCategoriesRequest.anchorId = cVar.m();
            liveItemCategoriesRequest.userId = cVar.h();
            liveItemCategoriesRequest.holdItemIds = cVar.L.b > 0 ? Long.toString(cVar.L.b) : null;
            if (!z) {
                liveItemCategoriesRequest.defaultCategoryId = cVar.L.f13852a;
            }
            liveItemCategoriesRequest.needPcg = cVar.i();
            liveItemCategoriesRequest.itemTransferInfo = (cVar.t() == null || cVar.t().itemTransferInfo == null) ? "" : cVar.t().itemTransferInfo.toJSONString();
            liveItemCategoriesRequest.liveSource = cVar.v();
            liveItemCategoriesRequest.entryLiveSource = cVar.u();
        }
        if (cVar != null && cVar.R != null) {
            z2 = true;
        }
        liveItemCategoriesRequest.isFirst = !z2;
        liveItemCategoriesRequest.clientDefaultCategoryIds = list;
        liveItemCategoriesRequest.matchNewVersion = com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.a(cVar) ? "1" : "0";
        a(1, liveItemCategoriesRequest, LiveItemCategoriesResponse.class);
    }
}
