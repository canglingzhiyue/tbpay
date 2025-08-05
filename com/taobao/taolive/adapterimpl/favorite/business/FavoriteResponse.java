package com.taobao.taolive.adapterimpl.favorite.business;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.kge;

/* loaded from: classes8.dex */
public class FavoriteResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private FavoriteResponseData data;

    static {
        kge.a(-1698167667);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData */
    public FavoriteResponseData mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FavoriteResponseData) ipChange.ipc$dispatch("6db09c21", new Object[]{this}) : this.data;
    }

    public void setData(FavoriteResponseData favoriteResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("103b22b7", new Object[]{this, favoriteResponseData});
        } else {
            this.data = favoriteResponseData;
        }
    }
}
