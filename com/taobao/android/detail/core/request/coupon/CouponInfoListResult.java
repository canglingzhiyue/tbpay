package com.taobao.android.detail.core.request.coupon;

import com.taobao.android.detail.core.model.datamodel.coupon.CouponInfoModel;
import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes4.dex */
public class CouponInfoListResult extends BaseOutDo {
    private CouponInfoModel data;

    static {
        kge.a(352245939);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public CouponInfoModel mo2429getData() {
        return this.data;
    }

    public void setData(CouponInfoModel couponInfoModel) {
        this.data = couponInfoModel;
    }
}
