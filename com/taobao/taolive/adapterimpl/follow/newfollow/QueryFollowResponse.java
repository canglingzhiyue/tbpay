package com.taobao.taolive.adapterimpl.follow.newfollow;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.kge;

/* loaded from: classes8.dex */
public class QueryFollowResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private QueryFollowResponseData data;

    static {
        kge.a(-217625614);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData */
    public QueryFollowResponseData mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (QueryFollowResponseData) ipChange.ipc$dispatch("907be89c", new Object[]{this}) : this.data;
    }

    public void setData(QueryFollowResponseData queryFollowResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a139fe32", new Object[]{this, queryFollowResponseData});
        } else {
            this.data = queryFollowResponseData;
        }
    }
}
