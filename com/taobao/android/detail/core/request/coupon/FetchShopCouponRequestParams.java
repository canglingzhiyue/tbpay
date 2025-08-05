package com.taobao.android.detail.core.request.coupon;

import com.taobao.android.detail.core.request.a;
import java.io.Serializable;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class FetchShopCouponRequestParams extends a implements Serializable {
    public String activityId;
    public String applyChannel;
    public String sellerId;

    static {
        kge.a(1783527619);
        kge.a(1028243835);
    }

    public FetchShopCouponRequestParams(String str, String str2, String str3) {
        this.sellerId = str;
        this.activityId = str2;
        this.applyChannel = str3;
        emu.a("com.taobao.android.detail.core.request.coupon.FetchShopCouponRequestParams");
    }
}
