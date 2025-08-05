package com.taobao.taolive.movehighlight.bussiness.detail;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.goodlist.TemplateListResponse;
import tb.kge;

/* loaded from: classes8.dex */
public class d extends com.taobao.taolive.sdk.business.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(452531467);
    }

    public d(com.taobao.taolive.sdk.adapter.network.d dVar) {
        super(dVar);
    }

    public void a(long j, long j2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30210ab2", new Object[]{this, new Long(j), new Long(j2), str});
            return;
        }
        QueryExplainRequest queryExplainRequest = new QueryExplainRequest();
        queryExplainRequest.liveId = j;
        queryExplainRequest.itemId = j2;
        queryExplainRequest.source = str;
        a(1, queryExplainRequest, TemplateListResponse.class);
    }
}
