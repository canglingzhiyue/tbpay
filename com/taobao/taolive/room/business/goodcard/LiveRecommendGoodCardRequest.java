package com.taobao.taolive.room.business.goodcard;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class LiveRecommendGoodCardRequest implements INetDataObject {
    public String tppParam;
    private String API_NAME = "mtop.tblive.recommend.updown.direct.down.query";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = true;

    static {
        kge.a(-2019633851);
        kge.a(-540945145);
    }
}
