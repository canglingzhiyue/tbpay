package com.taobao.android.detail.core.request.coupon;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes4.dex */
public class FetchCouponInfoResult extends BaseOutDo {
    private FetchCouponInfoModel data;

    static {
        kge.a(508207431);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public FetchCouponInfoModel mo2429getData() {
        return this.data;
    }

    public void setData(FetchCouponInfoModel fetchCouponInfoModel) {
        this.data = fetchCouponInfoModel;
    }
}
