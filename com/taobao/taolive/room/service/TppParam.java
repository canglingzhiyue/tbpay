package com.taobao.taolive.room.service;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes8.dex */
public class TppParam implements INetDataObject {
    public String appkey;
    public String entryAccountId;
    public String entryLiveId;
    public String entryLiveSource;
    public String entrySjsdItemId;
    public String entrySpm;
    public String entryTimeShiftItemId;
    public String entryTraceId;
    public ArrayList<TppParamFeedInfo> feedList = new ArrayList<>();
    public int index;
    public String nextAccountId;
    public String nextLiveId;
    public String platform;
    public String queryKey;
    public String type;

    static {
        kge.a(1305153363);
        kge.a(-540945145);
    }
}
