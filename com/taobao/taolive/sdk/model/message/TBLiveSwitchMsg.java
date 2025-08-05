package com.taobao.taolive.sdk.model.message;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class TBLiveSwitchMsg implements INetDataObject {
    public long delay;
    public int newRoomType;
    public String targetLiveId;
    public String targetLiveTitle;
    public String targetUrl;

    static {
        kge.a(270525244);
        kge.a(-540945145);
    }
}
