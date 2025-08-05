package com.taobao.taolive.sdk.business.official.heartbeat;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class OfficialHeartbeatRequest implements INetDataObject {
    public String encryptAnchorId;
    public String exParam;
    public String liveId;
    private String API_NAME = "mtop.taobao.thoth.sdk.heartbeat";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;
    public String topic = null;

    static {
        kge.a(1703115503);
        kge.a(-540945145);
    }
}
