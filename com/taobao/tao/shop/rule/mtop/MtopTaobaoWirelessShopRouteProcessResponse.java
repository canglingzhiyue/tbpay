package com.taobao.tao.shop.rule.mtop;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes8.dex */
public class MtopTaobaoWirelessShopRouteProcessResponse extends BaseOutDo {
    private MtopTaobaoWirelessShopRouteProcessResponseData data;

    static {
        kge.a(-1409057026);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public MtopTaobaoWirelessShopRouteProcessResponseData mo2429getData() {
        return this.data;
    }

    public void setData(MtopTaobaoWirelessShopRouteProcessResponseData mtopTaobaoWirelessShopRouteProcessResponseData) {
        this.data = mtopTaobaoWirelessShopRouteProcessResponseData;
    }
}
