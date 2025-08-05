package com.taobao.android.detail.sdk.request.coupon;

import com.taobao.android.detail.sdk.request.DetailVRequestParams;
import java.io.Serializable;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class FetchShopCouponRequestParams extends DetailVRequestParams implements Serializable {
    public String activityId;
    public String applyChannel;
    public String sellerId;

    static {
        kge.a(739792872);
        kge.a(1028243835);
    }

    public FetchShopCouponRequestParams(String str, String str2, String str3) {
        this.sellerId = str;
        this.activityId = str2;
        this.applyChannel = str3;
        tpc.a("com.taobao.android.detail.sdk.request.coupon.FetchShopCouponRequestParams");
    }
}
