package com.taobao.taolive.movehighlight.bussiness.subscribe;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class PreSaleSubscribeRequest implements INetDataObject {
    public String ctl;
    public long itemId;
    public long liveId;
    public String source;
    public String userId;
    public String API_NAME = "mtop.mediaplatform.live.goods.subscribe.status.change";
    public String VERSION = "1.0";
    public boolean NEED_ECODE = false;
    public boolean NEED_SESSION = false;

    static {
        kge.a(-508432088);
        kge.a(-540945145);
    }
}
