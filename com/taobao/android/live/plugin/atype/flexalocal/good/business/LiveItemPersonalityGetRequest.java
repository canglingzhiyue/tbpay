package com.taobao.android.live.plugin.atype.flexalocal.good.business;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes4.dex */
public class LiveItemPersonalityGetRequest implements INetDataObject {
    public String API_NAME = "mtop.tblive.live.item.personality.get";
    public String VERSION = "1.0";
    public boolean NEED_ECODE = true;
    public boolean NEED_SESSION = true;
    public String itemIds = null;
    public long creatorId = 0;
    public long liveId = 0;

    static {
        kge.a(-2145619521);
        kge.a(-540945145);
    }
}
