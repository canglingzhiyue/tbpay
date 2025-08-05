package com.taobao.taolive.room.business.commission.request;

import com.alibaba.fastjson.JSONObject;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class OuterTraceRequest implements INetDataObject {
    public String actionSource;
    public JSONObject context;
    public String entryLiveSource;
    public String fromType;
    public String liveId;
    public String liveSource;
    public String API_NAME = "mtop.com.taobao.tbtrace.commission.outertrace";
    public String VERSION = "1.0";
    public boolean NEED_ECODE = false;
    public boolean NEED_SESSION = false;

    static {
        kge.a(-582729424);
        kge.a(-540945145);
    }
}
