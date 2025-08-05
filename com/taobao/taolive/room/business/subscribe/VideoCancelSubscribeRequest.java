package com.taobao.taolive.room.business.subscribe;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class VideoCancelSubscribeRequest implements INetDataObject {
    private String API_NAME = "mtop.mediaplatform.video.cancelSubscribe";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;
    public long accountId = 0;

    static {
        kge.a(1069781510);
        kge.a(-540945145);
    }
}
