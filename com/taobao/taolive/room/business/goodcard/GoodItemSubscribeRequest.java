package com.taobao.taolive.room.business.goodcard;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class GoodItemSubscribeRequest implements INetDataObject {
    public String activityDetailId;
    public String userId;
    public String API_NAME = "mtop.iliad.hotitem.subscribe";
    public String VERSION = "1.0";
    public boolean NEED_ECODE = true;
    public boolean NEED_SESSION = true;

    static {
        kge.a(1687811368);
        kge.a(-540945145);
    }
}
