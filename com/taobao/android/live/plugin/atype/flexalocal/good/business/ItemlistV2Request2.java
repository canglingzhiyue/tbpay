package com.taobao.android.live.plugin.atype.flexalocal.good.business;

import com.alibaba.fastjson.JSONObject;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.model.common.ItemIdentifier;
import java.util.List;
import tb.kge;

/* loaded from: classes4.dex */
public class ItemlistV2Request2 implements INetDataObject {
    public String categoryBizType;
    public String categoryId;
    public String entryLiveSource;
    public int includePopLayerEntance;
    public JSONObject itemCardTransferInfo;
    public List<ItemIdentifier> itemIndexIdList;
    public String itemTransferInfo;
    public String liveSource;
    public String matchNewVersion;
    public boolean needPcg;
    public boolean needRecommendItem;
    public List<ItemIdentifier> recommendItemList;
    public String scene;
    public List<ItemIdentifier> sortItemList;
    public String transParams;
    public String API_NAME = "mtop.tblive.live.item.getVideoDetailItemListWithPagination";
    public String VERSION = "1.0";
    public boolean NEED_ECODE = true;
    public boolean NEED_SESSION = true;
    public long creatorId = 0;
    public String type = "0";
    public String liveId = null;
    public long n = 0;
    public int groupNum = 0;
    public long bizTopItemId = 0;
    public boolean needSortList = true;
    public boolean firstPage = false;

    static {
        kge.a(1181450329);
        kge.a(-540945145);
    }
}
