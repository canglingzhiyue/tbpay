package com.taobao.android.live.plugin.atype.flexalocal.bottom.control.reward.net;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes5.dex */
public class RewardGiftEnterRequest implements INetDataObject {
    public String encodeAnchorId;
    public String giftId;
    public String liveId;
    public String rewardSourceLiveId;
    public String senderNick;
    public String API_NAME = "mtop.iliad.interact.reward.notice.tonotice";
    public String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = false;

    static {
        kge.a(-1124187010);
        kge.a(-540945145);
    }
}
