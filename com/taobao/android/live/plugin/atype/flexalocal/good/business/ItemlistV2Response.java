package com.taobao.android.live.plugin.atype.flexalocal.good.business;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.kge;

/* loaded from: classes4.dex */
public class ItemlistV2Response extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ItemlistV2ResponseData data;

    static {
        kge.a(1234384151);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData */
    public ItemlistV2ResponseData mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ItemlistV2ResponseData) ipChange.ipc$dispatch("fb24067d", new Object[]{this}) : this.data;
    }

    public void setData(ItemlistV2ResponseData itemlistV2ResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc4077e1", new Object[]{this, itemlistV2ResponseData});
        } else {
            this.data = itemlistV2ResponseData;
        }
    }
}
