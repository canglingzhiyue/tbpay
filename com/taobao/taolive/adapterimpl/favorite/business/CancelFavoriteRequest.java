package com.taobao.taolive.adapterimpl.favorite.business;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class CancelFavoriteRequest implements INetDataObject {
    public String accountId;
    public boolean isTop;
    private String API_NAME = "mtop.taobao.social.follow.live.top";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;

    static {
        kge.a(-1021969687);
        kge.a(-540945145);
    }
}
