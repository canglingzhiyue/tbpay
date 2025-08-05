package com.taobao.taolive.movehighlight.bussiness.detail;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class QueryExplainRequest implements INetDataObject {
    public String API_NAME = "mtop.mediaplatform.live.goods.subscribe.add";
    public String VERSION = "2.0";
    public boolean NEED_ECODE = true;
    public boolean NEED_SESSION = true;
    public long itemId = 0;
    public String source = "";
    public long liveId = 0;

    static {
        kge.a(-792377372);
        kge.a(-540945145);
    }
}
