package com.taobao.android.detail.sdk.request.coupon;

import java.io.Serializable;
import java.util.ArrayList;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class CouponListResult implements Serializable {
    public ArrayList<CouponItem> result;

    /* loaded from: classes4.dex */
    public static class CouponItem implements Serializable {
        public long activityId;
        public String bonusName;
        public boolean canApply;
        public String desc;
        public double discountFee;
        public String ownNum;
        public int source;
        public int type;
        public String validTime;

        static {
            kge.a(1001307219);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(-273556214);
        kge.a(1028243835);
    }

    public CouponListResult() {
        tpc.a("com.taobao.android.detail.sdk.request.coupon.CouponListResult");
    }
}
