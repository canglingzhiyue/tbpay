package com.taobao.taolive.dinamicext.view.tbliveFllowContent.mtop.homePageDetail;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.kge;

/* loaded from: classes8.dex */
public class HomePageDetailResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private HomePageDetailResponseData data;

    static {
        kge.a(1025354834);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData */
    public HomePageDetailResponseData mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HomePageDetailResponseData) ipChange.ipc$dispatch("69287622", new Object[]{this}) : this.data;
    }

    public void setData(HomePageDetailResponseData homePageDetailResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff940446", new Object[]{this, homePageDetailResponseData});
        } else {
            this.data = homePageDetailResponseData;
        }
    }
}
