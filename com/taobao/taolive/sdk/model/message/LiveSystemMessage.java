package com.taobao.taolive.sdk.model.message;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.Map;
import tb.kge;

/* loaded from: classes8.dex */
public class LiveSystemMessage implements INetDataObject {
    public Map<String, String> contentMap;
    public String high;
    public String low;
    public String playerQuality;
    public String type;

    static {
        kge.a(-1664282155);
        kge.a(-540945145);
    }
}
