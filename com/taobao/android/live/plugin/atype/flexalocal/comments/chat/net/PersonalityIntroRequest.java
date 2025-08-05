package com.taobao.android.live.plugin.atype.flexalocal.comments.chat.net;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes5.dex */
public class PersonalityIntroRequest implements INetDataObject {
    public String anchorId;
    public String liveId;
    public String topic;
    private String API_NAME = "mtop.taobao.livexshow.agent.greet";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = false;

    static {
        kge.a(-436971305);
        kge.a(-540945145);
    }
}
