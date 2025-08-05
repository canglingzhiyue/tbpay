package com.taobao.android.live.plugin.atype.flexalocal.good.business;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.goodlist.TemplateListResponse;
import tb.kge;

/* loaded from: classes4.dex */
public class a extends com.taobao.taolive.sdk.business.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(535694770);
    }

    public a(com.taobao.taolive.sdk.adapter.network.d dVar) {
        super(dVar);
    }

    public void a(long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("262808dc", new Object[]{this, new Long(j), new Long(j2), new Long(j3)});
            return;
        }
        CancelQueryExplainRequest cancelQueryExplainRequest = new CancelQueryExplainRequest();
        cancelQueryExplainRequest.liveId = j;
        cancelQueryExplainRequest.itemId = j2;
        a(1, cancelQueryExplainRequest, TemplateListResponse.class);
    }

    public void a(long j, long j2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30210ab2", new Object[]{this, new Long(j), new Long(j2), str});
            return;
        }
        CancelQueryExplainRequest cancelQueryExplainRequest = new CancelQueryExplainRequest();
        cancelQueryExplainRequest.liveId = j;
        cancelQueryExplainRequest.itemId = j2;
        cancelQueryExplainRequest.source = str;
        a(1, cancelQueryExplainRequest, TemplateListResponse.class);
    }
}
