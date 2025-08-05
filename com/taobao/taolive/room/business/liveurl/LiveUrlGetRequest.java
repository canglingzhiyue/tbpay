package com.taobao.taolive.room.business.liveurl;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class LiveUrlGetRequest implements INetDataObject {
    private String API_NAME = "mtop.mediaplatform.live.liveurl.get";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = false;
    public String feedIdOrTopic = null;

    static {
        kge.a(1435059585);
        kge.a(-540945145);
    }
}
