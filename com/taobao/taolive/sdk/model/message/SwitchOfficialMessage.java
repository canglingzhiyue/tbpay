package com.taobao.taolive.sdk.model.message;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class SwitchOfficialMessage implements INetDataObject {
    public long actionType;
    public long delay;
    public String shopTitle;
    public String targetLiveId;
    public String targetUrl;
    public String tipsTitle;

    static {
        kge.a(-1768143663);
        kge.a(-540945145);
    }
}
