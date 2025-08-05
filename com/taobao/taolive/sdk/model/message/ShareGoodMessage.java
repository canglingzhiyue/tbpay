package com.taobao.taolive.sdk.model.message;

import com.alibaba.fastjson.JSONObject;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.Map;
import tb.kge;

/* loaded from: classes8.dex */
public class ShareGoodMessage implements INetDataObject {
    public String activityIcon;
    public String buyCount;
    public Map<String, String> extendVal;
    public String isDuplicate;
    public String isEdit;
    public Map<String, Object> itemExtData;
    public String itemH5TaokeUrl;
    public String itemIcon;
    public String itemId;
    public String itemName;
    public String itemPic;
    public String itemPrice;
    public String itemUrl;
    public String liveId;
    public Map<String, Object> liveItemStatusData;
    public JSONObject personalityData;

    static {
        kge.a(1620179330);
        kge.a(-540945145);
    }
}
