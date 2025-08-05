package com.taobao.taolive.sdk.business.interact.comment;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.d;
import tb.kge;

/* loaded from: classes8.dex */
public class a extends com.taobao.taolive.sdk.business.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-181190616);
    }

    public a(d dVar) {
        super(dVar, true);
    }

    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        FetchCommentRequest fetchCommentRequest = new FetchCommentRequest();
        fetchCommentRequest.topic = str;
        fetchCommentRequest.anchorSideKey = str2;
        fetchCommentRequest.tab = 2L;
        fetchCommentRequest.paginationContext = str3;
        a(1, fetchCommentRequest, FetchCommentResponse.class);
    }
}
