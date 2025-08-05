package com.taobao.android.detail.core.request.coupon;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes4.dex */
public class FetchCouponResultOutDo_ extends BaseOutDo {
    private FetchCouponResult data;

    static {
        kge.a(161601887);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public FetchCouponResult mo2429getData() {
        return this.data;
    }

    public void setData(FetchCouponResult fetchCouponResult) {
        this.data = fetchCouponResult;
    }
}
