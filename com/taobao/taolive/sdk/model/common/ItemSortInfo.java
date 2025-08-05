package com.taobao.taolive.sdk.model.common;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.List;
import tb.kge;

/* loaded from: classes8.dex */
public class ItemSortInfo implements INetDataObject {
    public ItemIdentifier currentItemSort;
    public List<SortRule> customRules;
    public List<ItemIdentifier> sortList;
    public long sortTime;

    static {
        kge.a(-423905580);
        kge.a(-540945145);
    }
}
