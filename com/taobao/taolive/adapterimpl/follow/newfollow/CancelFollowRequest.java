package com.taobao.taolive.adapterimpl.follow.newfollow;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class CancelFollowRequest implements INetDataObject {
    public String accountId;
    public String contentId;
    public String extraFlag;
    private String API_NAME = "mtop.tblive.live.follow.relation.cancel";
    private String VERSION = "2.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;

    static {
        kge.a(-599802052);
        kge.a(-540945145);
    }
}
