package com.taobao.taolive.room.pre;

import com.alibaba.fastjson.JSONObject;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.model.LiveEmbedType;
import java.util.Map;
import tb.kge;

/* loaded from: classes8.dex */
public class LiveDetailPreRequestParams implements INetDataObject {
    public String adImpId;
    public JSONObject extJson;
    public String feedId;
    public String holdType;
    public String itemId;
    public String itemIds;
    public String itemid;
    public String liveSource;
    public String needRecommend;
    public String productType;
    public String rcmd;
    public LiveEmbedType shopEmbedType;
    public String sjsdItemId;
    public JSONObject tcpParams;
    public String timeMovingItemId;
    public Map<String, String> transMap;
    public String transParams;
    public String userId;
    public String useLiveFandom = "false";
    public String forceFandom = "false";

    static {
        kge.a(-39908805);
        kge.a(-540945145);
    }
}
