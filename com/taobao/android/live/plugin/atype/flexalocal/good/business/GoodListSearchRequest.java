package com.taobao.android.live.plugin.atype.flexalocal.good.business;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes4.dex */
public class GoodListSearchRequest implements INetDataObject {
    public String entryLiveSource;
    public String liveSource;
    public String matchNewVersion;
    public String searchType;
    public String searchWord;
    public String transParams;
    public String API_NAME = "mtop.tblive.live.item.searchLiveItem";
    public boolean NEED_ECODE = true;
    public boolean NEED_SESSION = true;
    public String VERSION = "1.0";
    public String anchorId = null;
    public long groupNum = 0;
    public String liveId = null;
    public long n = 0;

    static {
        kge.a(-1178128701);
        kge.a(-540945145);
    }
}
