package com.taobao.android.detail.core.request.coupon;

import java.io.Serializable;
import java.util.ArrayList;
import tb.kge;

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
            kge.a(-904686568);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(776351333);
        kge.a(1028243835);
    }
}
