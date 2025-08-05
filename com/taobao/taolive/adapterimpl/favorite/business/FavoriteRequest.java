package com.taobao.taolive.adapterimpl.favorite.business;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class FavoriteRequest implements INetDataObject {
    public String anchorId;
    private String API_NAME = "mtop.taobao.livex.show.favourite.follow";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;
    public String sourcePage = "Page_TaobaoLiveWatch";

    static {
        kge.a(1467533507);
        kge.a(-540945145);
    }
}
