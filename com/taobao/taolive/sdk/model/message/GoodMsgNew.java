package com.taobao.taolive.sdk.model.message;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.model.common.ItemSortInfo;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.Map;
import tb.kge;

/* loaded from: classes8.dex */
public class GoodMsgNew implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String action;
    public boolean callbackServer;
    public Map<String, ItemSortInfo> categoryItemSortInfo;
    public ItemSortInfo itemSortInfo;
    public LiveItem liveItemDO;
    public boolean needChangeSort;

    static {
        kge.a(-2039676653);
        kge.a(-540945145);
    }

    public static GoodMsgNew constructGoodMsg(LiveItem liveItem, ItemSortInfo itemSortInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GoodMsgNew) ipChange.ipc$dispatch("35ac4972", new Object[]{liveItem, itemSortInfo, str});
        }
        GoodMsgNew goodMsgNew = new GoodMsgNew();
        goodMsgNew.liveItemDO = liveItem;
        goodMsgNew.itemSortInfo = itemSortInfo;
        goodMsgNew.action = str;
        return goodMsgNew;
    }
}
