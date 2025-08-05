package com.taobao.taolive.sdk.model.message;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.model.common.ItemSortInfo;
import java.util.Map;
import tb.kge;

/* loaded from: classes8.dex */
public class ShareGoodsListMessage implements INetDataObject {
    public Map<String, ItemSortInfo> categoryItemSortInfo;
    public int goodsIndex;
    public ShareGoodMessage[] goodsList;
    public ItemSortInfo itemSortInfo;
    public boolean needChangeSort;
    public int totalCount;

    static {
        kge.a(-2103381413);
        kge.a(-540945145);
    }
}
