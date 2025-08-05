package com.taobao.taolive.room.afccoldlunch.simple;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.v;
import com.taobao.taolive.sdk.adapter.network.c;
import com.taobao.taolive.sdk.business.j;
import tb.kge;

/* loaded from: classes8.dex */
public class a extends j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1220887802);
    }

    public a(c cVar) {
        super(cVar);
    }

    public void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d14b8", new Object[]{this, str, str2, str3, str4, str5, str6, str7, str8});
            return;
        }
        MtopTbliveRecommendVideoSimpleQueryRequest mtopTbliveRecommendVideoSimpleQueryRequest = new MtopTbliveRecommendVideoSimpleQueryRequest();
        mtopTbliveRecommendVideoSimpleQueryRequest.setNeedRecommend(v.e(str));
        mtopTbliveRecommendVideoSimpleQueryRequest.setLiveSource(str2);
        mtopTbliveRecommendVideoSimpleQueryRequest.setLiveId(str4);
        mtopTbliveRecommendVideoSimpleQueryRequest.setCreatorId(str5);
        mtopTbliveRecommendVideoSimpleQueryRequest.setEntryLiveSource(str3);
        mtopTbliveRecommendVideoSimpleQueryRequest.setHoldItemIds(str6);
        mtopTbliveRecommendVideoSimpleQueryRequest.setItemHoldType(str7);
        mtopTbliveRecommendVideoSimpleQueryRequest.setTransParams(str8);
        a(0, mtopTbliveRecommendVideoSimpleQueryRequest, MtopTbliveRecommendVideoSimpleQueryResponse.class);
    }
}
