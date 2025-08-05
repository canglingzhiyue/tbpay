package com.taobao.android.detail.sdk.request.coupon;

import com.taobao.android.detail.sdk.request.DetailVRequestParams;
import java.io.Serializable;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class FetchCouponRequestParams extends DetailVRequestParams implements Serializable {
    public String activityId;
    public String sellerId;

    static {
        kge.a(708127294);
        kge.a(1028243835);
    }

    public FetchCouponRequestParams(String str, String str2) {
        this.sellerId = str;
        this.activityId = str2;
        tpc.a("com.taobao.android.detail.sdk.request.coupon.FetchCouponRequestParams");
    }
}
