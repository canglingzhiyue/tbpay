package com.taobao.taolive.sdk.business.media.request;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class UrlListRequest implements INetDataObject {
    public String liveId;
    public String API_NAME = "mtop.tblive.live.detail.playurl";
    public String VERSION = "1.0";
    public boolean NEED_ECODE = false;
    public boolean NEED_SESSION = false;

    static {
        kge.a(455128083);
        kge.a(-540945145);
    }
}
