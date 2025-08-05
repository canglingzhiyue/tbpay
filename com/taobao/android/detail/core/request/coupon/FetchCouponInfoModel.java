package com.taobao.android.detail.core.request.coupon;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class FetchCouponInfoModel implements IMTOPDataObject {
    public ApplyDo applyDo;

    /* loaded from: classes4.dex */
    public static class ApplyDo implements IMTOPDataObject {
        public String applyText;
        public String applyTextColor;
        public Integer count;
        public String countText;
        public String countTextColor;
        public String enabled;
        public String icon;
        public boolean needNewPoint;
        public Integer point;
        public String subtitle;
        public boolean success;
        public String title;

        static {
            kge.a(-350718572);
            kge.a(-350052935);
        }
    }

    static {
        kge.a(704795839);
        kge.a(-350052935);
    }

    public FetchCouponInfoModel() {
        emu.a("com.taobao.android.detail.core.request.coupon.FetchCouponInfoModel");
    }
}
