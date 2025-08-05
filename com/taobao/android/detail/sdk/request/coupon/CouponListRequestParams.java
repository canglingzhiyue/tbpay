package com.taobao.android.detail.sdk.request.coupon;

import com.taobao.android.detail.sdk.request.DetailVRequestParams;
import java.io.Serializable;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class CouponListRequestParams extends DetailVRequestParams implements Serializable {
    public String sellerId;

    static {
        kge.a(-1869584536);
        kge.a(1028243835);
    }

    public CouponListRequestParams(String str) {
        this.sellerId = str;
        tpc.a("com.taobao.android.detail.sdk.request.coupon.CouponListRequestParams");
    }
}
