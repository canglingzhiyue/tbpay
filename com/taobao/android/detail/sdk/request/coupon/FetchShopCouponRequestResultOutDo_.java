package com.taobao.android.detail.sdk.request.coupon;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes4.dex */
public class FetchShopCouponRequestResultOutDo_ extends BaseOutDo {
    private FetchShopCouponRequestResult data;

    static {
        kge.a(804481637);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public FetchShopCouponRequestResult mo2429getData() {
        return this.data;
    }

    public void setData(FetchShopCouponRequestResult fetchShopCouponRequestResult) {
        this.data = fetchShopCouponRequestResult;
    }
}
