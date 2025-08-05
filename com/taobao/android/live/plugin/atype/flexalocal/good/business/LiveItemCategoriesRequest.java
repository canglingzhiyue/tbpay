package com.taobao.android.live.plugin.atype.flexalocal.good.business;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.List;
import tb.kge;

/* loaded from: classes4.dex */
public class LiveItemCategoriesRequest implements INetDataObject {
    public String API_NAME = "mtop.tblive.live.item.getLiveItemCategories";
    public String VERSION = "1.0";
    public String anchorId;
    public List<String> clientDefaultCategoryIds;
    public String defaultCategoryId;
    public String entryLiveSource;
    public String holdItemIds;
    public boolean isFirst;
    public String itemTransferInfo;
    public String liveId;
    public String liveSource;
    public String matchNewVersion;
    public boolean needPcg;
    public String userId;

    static {
        kge.a(-1296128213);
        kge.a(-540945145);
    }
}
