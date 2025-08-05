package com.taobao.android.detail.core.request.coupon;

import com.taobao.android.detail.core.request.a;
import java.io.Serializable;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class CouponListRequestParams extends a implements Serializable {
    public String sellerId;

    static {
        kge.a(-1346770515);
        kge.a(1028243835);
    }

    public CouponListRequestParams(String str) {
        this.sellerId = str;
        emu.a("com.taobao.android.detail.core.request.coupon.CouponListRequestParams");
    }
}
