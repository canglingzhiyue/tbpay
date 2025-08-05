package com.taobao.taolive.sdk.model.message;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.Map;
import tb.kge;

/* loaded from: classes8.dex */
public class JoinNotifyMessage implements INetDataObject {
    public Map<String, String> addUsers;
    public int onlineCount;
    public long pageViewCount;
    public int totalCount;
    public String viewCountFormat;

    static {
        kge.a(949748733);
        kge.a(-540945145);
    }
}
