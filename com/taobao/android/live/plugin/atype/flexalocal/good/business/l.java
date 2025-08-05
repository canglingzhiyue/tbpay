package com.taobao.android.live.plugin.atype.flexalocal.good.business;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.ItemCategory;
import tb.hir;
import tb.kge;
import tb.pqj;

/* loaded from: classes4.dex */
public class l extends com.taobao.taolive.sdk.business.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-610589829);
    }

    public l(com.taobao.taolive.sdk.adapter.network.d dVar) {
        super(dVar);
    }

    public void a(com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar, ItemCategory itemCategory, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90d935ce", new Object[]{this, cVar, itemCategory, new Boolean(z)});
            return;
        }
        QuerySimpleRightsInfoRequest querySimpleRightsInfoRequest = new QuerySimpleRightsInfoRequest();
        if (z) {
            querySimpleRightsInfoRequest.VERSION = "2.0";
        }
        querySimpleRightsInfoRequest.liveId = cVar.g();
        if (hir.b()) {
            querySimpleRightsInfoRequest.anchorId = cVar.m();
            if (cVar.l.h() != null) {
                querySimpleRightsInfoRequest.interactTypes = pqj.a(cVar.l.h());
            }
        }
        querySimpleRightsInfoRequest.liveSource = cVar.v();
        querySimpleRightsInfoRequest.entryLiveSource = cVar.u();
        querySimpleRightsInfoRequest.spm = cVar.o();
        if (itemCategory != null) {
            querySimpleRightsInfoRequest.transParams = (JSONObject) JSON.toJSON(itemCategory);
            querySimpleRightsInfoRequest.transParams.put("transType", (Object) "liveItemTab");
        }
        a(1, querySimpleRightsInfoRequest, QuerySimpleRightsInfoResponse.class);
    }
}
