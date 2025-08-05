package com.taobao.android.live.plugin.atype.flexalocal.good.business;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.kge;

/* loaded from: classes4.dex */
public class MemberCheckResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private MemberCheckResponseData data;

    static {
        kge.a(921025766);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData */
    public MemberCheckResponseData mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MemberCheckResponseData) ipChange.ipc$dispatch("a135d968", new Object[]{this}) : this.data;
    }

    public void setData(MemberCheckResponseData memberCheckResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51a3f83e", new Object[]{this, memberCheckResponseData});
        } else {
            this.data = memberCheckResponseData;
        }
    }
}
