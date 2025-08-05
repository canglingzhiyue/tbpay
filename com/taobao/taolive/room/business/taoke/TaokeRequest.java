package com.taobao.taolive.room.business.taoke;

import com.taobao.avplayer.h;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class TaokeRequest implements INetDataObject {
    public String API_NAME = h.TAOKE_ITEM_CHECK;
    public String VERSION = "1.0";
    public boolean NEED_ECODE = false;
    public boolean NEED_SESSION = false;
    public String platform = null;
    public long sourceType = 0;
    public String utdid = null;
    public String accountId = null;
    public String bizType = null;
    public long itemId = 0;
    public String url = null;
    public String sourceId = "taolive";

    static {
        kge.a(-293646763);
        kge.a(-540945145);
    }
}
