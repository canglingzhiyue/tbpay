package com.taobao.avplayer.interactivelifecycle.hiv.request;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.core.IDWObject;
import java.io.Serializable;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public class ContentDetailData implements IDWObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String contentId;
    public String feedId;
    public String mediaId;
    public List<RelatedItem> relatedItems;
    public String shareUrl;
    public ShopInfo shopInfo;
    public TalentInfo talentInfo;
    public TaoKeInfo taokeInfo;
    public String type;
    public String userId;
    public String videoCoverImgUrl;
    public String videoId;
    public String videoSummary;
    public String videoTitle;
    public String videoUrl;

    /* loaded from: classes6.dex */
    public static class PromotionPic implements Serializable {
        public String pic;
        public int picHeight;
        public int picWidth;
        public String promotionTitle;

        static {
            kge.a(1551839538);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes6.dex */
    public static class RelatedItem implements Serializable {
        public String itemId;
        public String picUrl;
        public String price;
        public PromotionPic promotionInfo;
        public PromotionPic promotionPic;
        public String promotionPrice;
        public String targetUrl;
        public String title;

        static {
            kge.a(683806003);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes6.dex */
    public static class ShopInfo implements Serializable {
        public String rankNum;
        public String rankPic;
        public String sellerId;
        public String sellerNick;
        public String shopLogo;
        public List<RelatedItem> shopRecommendItems;
        public String shopTitle;
        public String shopUrl;

        static {
            kge.a(123208079);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes6.dex */
    public static class TalentInfo implements Serializable {
        public String accountId;
        public String avatar;
        public String nick;
        public String userId;

        static {
            kge.a(967501253);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes6.dex */
    public static class TaoKeInfo implements Serializable {
        public String bizType;
        public String sourceId;
        public String sourceType;

        static {
            kge.a(1662710783);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(-485997671);
        kge.a(-996138287);
    }

    public List<RelatedItem> getShopOrTalentRelatedItems() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("16c0beb0", new Object[]{this});
        }
        List<RelatedItem> list = this.relatedItems;
        if (list != null && !list.isEmpty()) {
            return list;
        }
        ShopInfo shopInfo = this.shopInfo;
        if (shopInfo != null) {
            return shopInfo.shopRecommendItems;
        }
        return null;
    }

    public String getAvatarUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4164059", new Object[]{this});
        }
        ShopInfo shopInfo = this.shopInfo;
        if (shopInfo != null && !StringUtils.isEmpty(shopInfo.shopLogo)) {
            return this.shopInfo.shopLogo;
        }
        TalentInfo talentInfo = this.talentInfo;
        if (talentInfo != null) {
            return talentInfo.avatar;
        }
        return null;
    }
}
