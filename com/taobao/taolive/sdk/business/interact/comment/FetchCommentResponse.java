package com.taobao.taolive.sdk.business.interact.comment;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.kge;

/* loaded from: classes8.dex */
public class FetchCommentResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private FetchCommentResponseData data;

    static {
        kge.a(625317033);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData */
    public FetchCommentResponseData mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FetchCommentResponseData) ipChange.ipc$dispatch("a5320705", new Object[]{this}) : this.data;
    }

    public void setData(FetchCommentResponseData fetchCommentResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b28d781b", new Object[]{this, fetchCommentResponseData});
        } else {
            this.data = fetchCommentResponseData;
        }
    }
}
