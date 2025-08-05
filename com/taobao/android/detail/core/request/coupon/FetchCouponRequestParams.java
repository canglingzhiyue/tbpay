package com.taobao.android.detail.core.request.coupon;

import com.taobao.android.detail.core.request.a;
import java.io.Serializable;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class FetchCouponRequestParams extends a implements Serializable {
    public String activityId;
    public String sellerId;

    static {
        kge.a(-264507239);
        kge.a(1028243835);
    }

    public FetchCouponRequestParams(String str, String str2) {
        this.sellerId = str;
        this.activityId = str2;
        emu.a("com.taobao.android.detail.core.request.coupon.FetchCouponRequestParams");
    }
}
