package com.taobao.android.detail.core.model.datamodel.coupon;

import com.taobao.android.detail.core.request.MtopRequestListener;
import com.taobao.android.detail.core.request.coupon.FetchCouponInfoClient;
import com.taobao.android.detail.core.request.coupon.FetchCouponInfoModel;
import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class CouponInfoModel implements IMTOPDataObject {
    public List<FullItem> coupons;
    public String mtop;
    public int point;
    public String pointText;

    /* loaded from: classes4.dex */
    public static class CouponInfo implements IMTOPDataObject {
        public String applyText;
        public String bottomButtonJumpUrl;
        public String bottomButtonText;
        public String bottomTitle;
        public int count;
        public String countText;
        public int displayType;
        public String enabled;
        public FetchCouponInfoClient fetchCouponInfoClient;
        public MtopRequestListener<FetchCouponInfoModel> fetchCouponInfoListener;
        public boolean isLoading = false;
        public String leftIcon;
        public int pointConsume;
        public List<String> promotionList;
        public String promotionUrl;
        public Style styles;
        public List<String> subtitles;
        public String title;
        public String titleLeftText;
        public String uuid;

        static {
            kge.a(-1559050991);
            kge.a(-350052935);
        }
    }

    /* loaded from: classes4.dex */
    public static class FullItem implements IMTOPDataObject {
        public String asac;
        public List<CouponInfo> couponList;
        public String helpIcon;
        public String helpUrl;
        public String lotteryId;
        public String title;
        public int type;

        static {
            kge.a(349695135);
            kge.a(-350052935);
        }
    }

    /* loaded from: classes4.dex */
    public static class Style implements IMTOPDataObject {
        public String applyTextColor;
        public String bgBottomColor;
        public String bgColor;
        public String bgImage;
        public String bottomTextColor;
        public String countTextColor;
        public String dashColor;
        public String rightBgImg;
        public String textColor;

        static {
            kge.a(-268121996);
            kge.a(-350052935);
        }
    }

    static {
        kge.a(-1706437177);
        kge.a(-350052935);
    }

    public CouponInfoModel() {
        emu.a("com.taobao.android.detail.core.model.datamodel.coupon.CouponInfoModel");
    }
}
