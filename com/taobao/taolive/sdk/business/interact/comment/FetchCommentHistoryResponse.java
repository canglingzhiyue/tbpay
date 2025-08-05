package com.taobao.taolive.sdk.business.interact.comment;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.kge;

/* loaded from: classes8.dex */
public class FetchCommentHistoryResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private FetchCommentHistoryResponseData data;

    static {
        kge.a(1993950093);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData */
    public FetchCommentHistoryResponseData mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FetchCommentHistoryResponseData) ipChange.ipc$dispatch("34cb47", new Object[]{this}) : this.data;
    }

    public void setData(FetchCommentHistoryResponseData fetchCommentHistoryResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d9a75ab", new Object[]{this, fetchCommentHistoryResponseData});
        } else {
            this.data = fetchCommentHistoryResponseData;
        }
    }
}
