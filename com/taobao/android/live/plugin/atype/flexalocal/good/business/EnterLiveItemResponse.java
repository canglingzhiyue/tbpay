package com.taobao.android.live.plugin.atype.flexalocal.good.business;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.kge;

/* loaded from: classes4.dex */
public class EnterLiveItemResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public EnterGoodsData data;

    static {
        kge.a(-1544133457);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData */
    public EnterGoodsData mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (EnterGoodsData) ipChange.ipc$dispatch("6239e70d", new Object[]{this}) : this.data;
    }
}
