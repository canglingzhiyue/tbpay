package com.taobao.taolive.adapterimpl.follow.newfollow;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class QueryFollowRequest implements INetDataObject {
    public String keyName;
    public String targetUserIdStr;
    private String API_NAME = "mtop.taobao.social.follow.guang.get.all";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;

    static {
        kge.a(-701464386);
        kge.a(-540945145);
    }
}
