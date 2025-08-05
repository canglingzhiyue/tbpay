package com.taobao.android.live.plugin.atype.flexalocal.good.business;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes4.dex */
public class CancelQueryExplainRequest implements INetDataObject {
    public String API_NAME = "mtop.mediaplatform.live.goods.subscribe.cancel";
    public String VERSION = "2.0";
    public boolean NEED_ECODE = true;
    public boolean NEED_SESSION = true;
    public long itemId = 0;
    public String source = "";
    public long liveId = 0;

    static {
        kge.a(1149967965);
        kge.a(-540945145);
    }
}
