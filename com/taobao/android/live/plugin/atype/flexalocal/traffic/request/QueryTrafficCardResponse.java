package com.taobao.android.live.plugin.atype.flexalocal.traffic.request;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.kge;

/* loaded from: classes6.dex */
public class QueryTrafficCardResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public QueryTrafficCardRealResponse data;

    static {
        kge.a(1349019204);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData */
    public QueryTrafficCardRealResponse mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (QueryTrafficCardRealResponse) ipChange.ipc$dispatch("5bf9007c", new Object[]{this}) : this.data;
    }

    public void setData(QueryTrafficCardRealResponse queryTrafficCardRealResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0f9a720", new Object[]{this, queryTrafficCardRealResponse});
        } else {
            this.data = queryTrafficCardRealResponse;
        }
    }
}
