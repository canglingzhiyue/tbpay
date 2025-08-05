package com.taobao.taolive.business.dislike;

import com.ali.user.mobile.login.model.LoginConstant;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class BroadcasterDislikeRequest implements INetDataObject {
    public String anchorIdOrFeedId;
    public String API_NAME = "mtop.mediaplatform.live.follow.broadcasterlist.feedbackList";
    public String VERSION = "1.0";
    public boolean NEED_ECODE = false;
    public boolean NEED_SESSION = false;
    public String channelType = "jingxuan";
    public String delReason = LoginConstant.ACCOUNT;
    public String templateName = "taolive_live_card_longpress";

    static {
        kge.a(-269300749);
        kge.a(-540945145);
    }
}
