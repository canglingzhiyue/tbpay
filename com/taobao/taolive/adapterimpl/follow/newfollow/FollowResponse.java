package com.taobao.taolive.adapterimpl.follow.newfollow;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.kge;

/* loaded from: classes8.dex */
public class FollowResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private FollowResponseData data;

    static {
        kge.a(-2133383654);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData */
    public FollowResponseData mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FollowResponseData) ipChange.ipc$dispatch("e3e02a1a", new Object[]{this}) : this.data;
    }

    public void setData(FollowResponseData followResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9391ffe", new Object[]{this, followResponseData});
        } else {
            this.data = followResponseData;
        }
    }
}
