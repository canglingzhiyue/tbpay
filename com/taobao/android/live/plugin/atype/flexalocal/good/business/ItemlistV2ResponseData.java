package com.taobao.android.live.plugin.atype.flexalocal.good.business;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.model.common.ItemSortInfo;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.List;
import tb.kge;

/* loaded from: classes4.dex */
public class ItemlistV2ResponseData implements INetDataObject {
    public List<AllItems> allItems;
    public List<LiveItem> bizTopItemList;
    public BrandCard brandCard;
    public String certification4ItemList;
    public LiveItem currentSpeakingItem;
    public List<String> exclusiveIcons;
    public List<LiveItem> hotList;
    public List<ItemListv1> itemListv1;
    public ItemSortInfo itemSortInfo;
    public TopCardItem popLayerEntance;
    public boolean queryPersonality;
    public ItemSortInfo recommendItemSortInfo;
    public List<String> starList;
    public String totalNum;
    public boolean useCdn;

    /* loaded from: classes4.dex */
    public static class AllItems implements INetDataObject {
        public int groupNum;
        public String itemId;

        static {
            kge.a(-419585374);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes4.dex */
    public static class BrandCard implements INetDataObject {
        public String tmall;

        static {
            kge.a(-191899756);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes4.dex */
    public static class ItemListv1 implements INetDataObject {
        public String explained;
        public String goodsIndex;
        public LiveItem liveItemDO;
        public String scene;
        public String sliceNum;

        static {
            kge.a(-1212158001);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes4.dex */
    public static class TopCardItem implements INetDataObject {
        public boolean fullScreen;
        public String imageUrl;
        public String type;
        public String url;

        static {
            kge.a(-1711704107);
            kge.a(-540945145);
        }
    }

    static {
        kge.a(877999457);
        kge.a(-540945145);
    }
}
