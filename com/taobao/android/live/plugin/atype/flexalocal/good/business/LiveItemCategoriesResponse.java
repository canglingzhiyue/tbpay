package com.taobao.android.live.plugin.atype.flexalocal.good.business;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.kge;

/* loaded from: classes4.dex */
public class LiveItemCategoriesResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private LiveItemCategoriesResponseData data;

    static {
        kge.a(-1472335067);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData */
    public LiveItemCategoriesResponseData mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LiveItemCategoriesResponseData) ipChange.ipc$dispatch("ae69ae2f", new Object[]{this}) : this.data;
    }

    public void setData(LiveItemCategoriesResponseData liveItemCategoriesResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19f5b413", new Object[]{this, liveItemCategoriesResponseData});
        } else {
            this.data = liveItemCategoriesResponseData;
        }
    }
}
