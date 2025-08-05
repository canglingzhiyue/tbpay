package com.taobao.taolive.room.business.growth;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class GrowthQueryRequest implements INetDataObject {
    public String liveId;
    public String liveSource;
    public String API_NAME = "mtop.tblive.live.growth.query";
    public String VERSION = "1.0";
    public boolean NEED_ECODE = true;

    static {
        kge.a(1471079815);
        kge.a(-540945145);
    }
}
