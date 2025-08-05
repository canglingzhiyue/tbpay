package com.taobao.android.detail.core.request.coupon;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes4.dex */
public class CouponListResultOutDo_ extends BaseOutDo {
    private CouponListResult data;

    static {
        kge.a(-1397330485);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public CouponListResult mo2429getData() {
        return this.data;
    }

    public void setData(CouponListResult couponListResult) {
        this.data = couponListResult;
    }
}
