package com.taobao.live.timemove.video.videoitem.domain.model;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes7.dex */
public class TppParamFeedInfo implements INetDataObject {
    public String accountId;
    public HashMap<String, Object> clientReturnMap;
    public String contentType;
    public long enter;
    public String itemId;
    public String liveId;
    public String mediaType;
    public String product_type;
    public long stay;
    public String timeMovingId;

    static {
        kge.a(-585167264);
        kge.a(-540945145);
    }
}
