package com.taobao.android.live.plugin.atype.flexalocal.good.business;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.ItemCategory;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes4.dex */
public class LiveItemCategoriesResponseData implements INetDataObject {
    public String defaultCategoryId;
    public ArrayList<VideoInfo.ExtraGoodsTabItem> extraGoodsTabList;
    public List<ItemCategory> itemCategoryList;
    public String itemListType;
    public List<TopBarEntity> topAtmosphereList;
    public List<TopBarEntity> topBarList;
    public List<JSONObject> topRightEntranceList;
    public boolean useCdn;

    /* loaded from: classes4.dex */
    public static class TopBarEntity implements INetDataObject {
        public String backgroundUrl;
        public String icon;
        public JSONArray iconSuffix;
        public String jumpUrl;
        public String locationId;
        public String subType;
        public List<String> suffix;
        public String text;
        public String textPic;
        public String type;
        public String utParams;

        static {
            kge.a(1853337142);
            kge.a(-540945145);
        }
    }

    static {
        kge.a(-1539949457);
        kge.a(-540945145);
    }
}
