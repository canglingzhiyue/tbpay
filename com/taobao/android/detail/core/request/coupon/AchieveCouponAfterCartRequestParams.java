package com.taobao.android.detail.core.request.coupon;

import com.taobao.android.detail.core.request.a;
import java.io.Serializable;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class AchieveCouponAfterCartRequestParams extends a implements Serializable {
    public String asac;
    public String itemApplyParams;
    public String sellerId;

    static {
        kge.a(1489447980);
        kge.a(1028243835);
    }

    public AchieveCouponAfterCartRequestParams(String str, String str2, String str3) {
        this.sellerId = str;
        this.asac = str2;
        this.itemApplyParams = str3;
        emu.a("com.taobao.android.detail.core.request.coupon.AchieveCouponAfterCartRequestParams");
    }
}
