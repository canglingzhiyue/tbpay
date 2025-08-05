package com.taobao.android.live.plugin.atype.flexalocal.good.business;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.List;
import tb.kge;

/* loaded from: classes4.dex */
public class EnterGoodsData implements INetDataObject {
    public List<LiveItem> curItemList;
    public JSONArray expansionRedPacketList;
    public String holdItemIds;
    public JSONObject itemCardTransferInfo;
    public JSONObject itemGroupListInfo;
    public String itemHoldType;
    public String popId;
    public List<LiveItem> popItemCardList;
    public boolean useRecommendItem;

    static {
        kge.a(-1752656431);
        kge.a(-540945145);
    }
}
