package com.taobao.android.live.plugin.atype.flexalocal.good.business;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes4.dex */
public class EnterLiveItemRequest implements INetDataObject {
    public String API_NAME = "mtop.tblive.live.pop.item.card.list";
    public boolean NEED_ECODE = false;
    public boolean NEED_SESSION = false;
    public String VERSION = "1.0";
    public String creatorId;
    public String entryLiveSource;
    public String holdItemIds;
    public String interacts;
    public String itemHoldType;
    public String itemTransferInfo;
    public String liveId;
    public String livesource;
    public boolean needRecommendItem;
    public String todayExposureCount;

    static {
        kge.a(2026691681);
        kge.a(-540945145);
    }
}
