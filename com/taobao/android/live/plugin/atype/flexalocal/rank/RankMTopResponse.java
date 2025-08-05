package com.taobao.android.live.plugin.atype.flexalocal.rank;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.kge;

/* loaded from: classes6.dex */
public class RankMTopResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public RankMTopResponseData data;

    static {
        kge.a(-1794136372);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData */
    public RankMTopResponseData mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RankMTopResponseData) ipChange.ipc$dispatch("769cd2c2", new Object[]{this}) : this.data;
    }
}
