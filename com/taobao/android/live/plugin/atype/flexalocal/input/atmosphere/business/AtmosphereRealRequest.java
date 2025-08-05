package com.taobao.android.live.plugin.atype.flexalocal.input.atmosphere.business;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes6.dex */
public class AtmosphereRealRequest implements INetDataObject {
    public String anchorId;
    public String liveId;
    public String API_NAME = "mtop.tblive.live.amto.real";
    public String VERSION = "1.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;

    static {
        kge.a(1734602684);
        kge.a(-540945145);
    }
}
