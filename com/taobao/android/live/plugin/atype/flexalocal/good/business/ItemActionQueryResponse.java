package com.taobao.android.live.plugin.atype.flexalocal.good.business;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.kge;

/* loaded from: classes4.dex */
public class ItemActionQueryResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ItemActionQueryData data;

    static {
        kge.a(2038988023);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData */
    public ItemActionQueryData mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ItemActionQueryData) ipChange.ipc$dispatch("8dbba038", new Object[]{this}) : this.data;
    }

    public void setData(ItemActionQueryData itemActionQueryData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3354778e", new Object[]{this, itemActionQueryData});
        } else {
            this.data = itemActionQueryData;
        }
    }
}
