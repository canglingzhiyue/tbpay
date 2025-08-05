package com.taobao.android.live.plugin.atype.flexalocal.bottom.control.share.config;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes5.dex */
public class GetLiveShareConfigRequest implements INetDataObject {
    public String anchorId;
    public String liveId;
    public String liveSource;
    private String API_NAME = "mtop.tblive.live.detail.getLiveShareConfig";
    private String VERSION = "1.0";
    public boolean NEED_ECODE = true;
    public boolean NEED_SESSION = true;

    static {
        kge.a(1367431165);
        kge.a(-540945145);
    }
}
