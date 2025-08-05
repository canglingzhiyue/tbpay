package com.taobao.android.live.plugin.atype.flexalocal.input.atmosphere.business;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes6.dex */
public class AtmosphereResListRequest implements INetDataObject {
    public String anchorId;
    public String encryptAnchorId;
    public String liveId;
    public String API_NAME = "mtop.tblive.live.atmosphere.resource.list";
    public String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = false;

    static {
        kge.a(-1627068730);
        kge.a(-540945145);
    }
}
